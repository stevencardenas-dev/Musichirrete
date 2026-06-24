package org.jaudiotagger.tag.lyrics3;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.jaudiotagger.tag.InvalidTagException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.datatype.Lyrics3Image;
import uc1;
import x41;

public class FieldFrameBodyIMG extends AbstractLyrics3v2FieldFrameBody {
  private ArrayList<Lyrics3Image> images;
  
  public FieldFrameBodyIMG() {
    this.images = new ArrayList<Lyrics3Image>();
  }
  
  public FieldFrameBodyIMG(String paramString) {
    this.images = new ArrayList<Lyrics3Image>();
    readString(paramString);
  }
  
  public FieldFrameBodyIMG(ByteBuffer paramByteBuffer) {
    this.images = new ArrayList<Lyrics3Image>();
    read(paramByteBuffer);
  }
  
  public FieldFrameBodyIMG(Lyrics3Image paramLyrics3Image) {
    ArrayList<Lyrics3Image> arrayList = new ArrayList();
    this.images = arrayList;
    arrayList.add(paramLyrics3Image);
  }
  
  public FieldFrameBodyIMG(FieldFrameBodyIMG paramFieldFrameBodyIMG) {
    super(paramFieldFrameBodyIMG);
    this.images = new ArrayList<Lyrics3Image>();
    for (byte b = 0; b < paramFieldFrameBodyIMG.images.size(); b++) {
      Lyrics3Image lyrics3Image = paramFieldFrameBodyIMG.images.get(b);
      this.images.add(new Lyrics3Image(lyrics3Image));
    } 
  }
  
  private void readString(String paramString) {
    int j = paramString.indexOf(Lyrics3v2Fields.CRLF);
    this.images = new ArrayList<Lyrics3Image>();
    int i = 0;
    while (j >= 0) {
      String str = paramString.substring(i, j);
      Lyrics3Image lyrics3Image = new Lyrics3Image("Image", this);
      lyrics3Image.setFilename(str);
      this.images.add(lyrics3Image);
      str = Lyrics3v2Fields.CRLF;
      i = j + str.length();
      j = paramString.indexOf(str, i);
    } 
    if (i < paramString.length()) {
      paramString = paramString.substring(i);
      Lyrics3Image lyrics3Image = new Lyrics3Image("Image", this);
      lyrics3Image.setFilename(paramString);
      this.images.add(lyrics3Image);
    } 
  }
  
  private String writeString() {
    ArrayList<Lyrics3Image> arrayList = this.images;
    int i = arrayList.size();
    String str = "";
    byte b = 0;
    while (b < i) {
      Lyrics3Image lyrics3Image = (Lyrics3Image)arrayList.get(b);
      b++;
      lyrics3Image = lyrics3Image;
      StringBuilder stringBuilder = x41.p(str);
      stringBuilder.append(lyrics3Image.writeString());
      stringBuilder.append(Lyrics3v2Fields.CRLF);
      str = stringBuilder.toString();
    } 
    return (str.length() > 2) ? str.substring(0, str.length() - 2) : str;
  }
  
  public void addImage(Lyrics3Image paramLyrics3Image) {
    this.images.add(paramLyrics3Image);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof FieldFrameBodyIMG))
      return false; 
    FieldFrameBodyIMG fieldFrameBodyIMG = (FieldFrameBodyIMG)paramObject;
    return (this.images.equals(fieldFrameBodyIMG.images) && super.equals(paramObject));
  }
  
  public String getIdentifier() {
    return "IMG";
  }
  
  public int getSize() {
    ArrayList<Lyrics3Image> arrayList = this.images;
    int j = arrayList.size();
    int i = 0;
    byte b = 0;
    while (b < j) {
      Lyrics3Image lyrics3Image = (Lyrics3Image)arrayList.get(b);
      b++;
      i += ((Lyrics3Image)lyrics3Image).getSize() + 2;
    } 
    return i - 2;
  }
  
  public String getValue() {
    return writeString();
  }
  
  public boolean isSubsetOf(Object paramObject) {
    if (!(paramObject instanceof FieldFrameBodyIMG))
      return false; 
    ArrayList<Lyrics3Image> arrayList1 = ((FieldFrameBodyIMG)paramObject).images;
    ArrayList<Lyrics3Image> arrayList2 = this.images;
    int i = arrayList2.size();
    byte b = 0;
    while (b < i) {
      Object object = arrayList2.get(b);
      b++;
      if (!arrayList1.contains(object))
        return false; 
    } 
    return super.isSubsetOf(paramObject);
  }
  
  public Iterator<Lyrics3Image> iterator() {
    return this.images.iterator();
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[5];
    paramByteBuffer.get(arrayOfByte, 0, 5);
    int i = Integer.parseInt(new String(arrayOfByte, 0, 5));
    if (i != 0 || TagOptionSingleton.getInstance().isLyrics3KeepEmptyFieldIfRead()) {
      arrayOfByte = new byte[i];
      paramByteBuffer.get(arrayOfByte);
      readString(new String(arrayOfByte));
      return;
    } 
    throw new InvalidTagException("Lyircs3v2 Field has size of zero.");
  }
  
  public void setValue(String paramString) {
    readString(paramString);
  }
  
  public void setupObjectList() {}
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getIdentifier());
    stringBuilder.append(" : ");
    String str = stringBuilder.toString();
    ArrayList<Lyrics3Image> arrayList = this.images;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      Object object = arrayList.get(b);
      b++;
      StringBuilder stringBuilder1 = x41.p(str);
      stringBuilder1.append(object.toString());
      stringBuilder1.append(" ; ");
      str = stringBuilder1.toString();
    } 
    return str;
  }
  
  public void write(uc1 paramuc1) {
    byte[] arrayOfByte = new byte[5];
    int i = getSize();
    String str = Integer.toString(i);
    boolean bool = false;
    byte b;
    for (b = 0; b < 5 - str.length(); b++)
      arrayOfByte[b] = 48; 
    int j = str.length();
    for (b = 0; b < str.length(); b++)
      arrayOfByte[b + 5 - j] = (byte)str.charAt(b); 
    paramuc1.write(arrayOfByte, 0, 5);
    if (i > 0) {
      String str1 = writeString();
      byte[] arrayOfByte1 = new byte[str1.length()];
      for (b = bool; b < str1.length(); b++)
        arrayOfByte1[b] = (byte)str1.charAt(b); 
      paramuc1.write(arrayOfByte1);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\FieldFrameBodyIMG.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */