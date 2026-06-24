package org.jaudiotagger.tag.lyrics3;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.jaudiotagger.tag.InvalidTagException;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.datatype.AbstractDataType;
import org.jaudiotagger.tag.datatype.ID3v2LyricLine;
import org.jaudiotagger.tag.datatype.Lyrics3Line;
import org.jaudiotagger.tag.datatype.Lyrics3TimeStamp;
import org.jaudiotagger.tag.id3.framebody.FrameBodySYLT;
import org.jaudiotagger.tag.id3.framebody.FrameBodyUSLT;
import uc1;
import x41;

public class FieldFrameBodyLYR extends AbstractLyrics3v2FieldFrameBody {
  private ArrayList<Lyrics3Line> lines = new ArrayList<Lyrics3Line>();
  
  public FieldFrameBodyLYR() {}
  
  public FieldFrameBodyLYR(String paramString) {
    readString(paramString);
  }
  
  public FieldFrameBodyLYR(ByteBuffer paramByteBuffer) {
    read(paramByteBuffer);
  }
  
  public FieldFrameBodyLYR(FrameBodySYLT paramFrameBodySYLT) {
    addLyric(paramFrameBodySYLT);
  }
  
  public FieldFrameBodyLYR(FrameBodyUSLT paramFrameBodyUSLT) {
    addLyric(paramFrameBodyUSLT);
  }
  
  public FieldFrameBodyLYR(FieldFrameBodyLYR paramFieldFrameBodyLYR) {
    super(paramFieldFrameBodyLYR);
    for (byte b = 0; b < paramFieldFrameBodyLYR.lines.size(); b++) {
      Lyrics3Line lyrics3Line = paramFieldFrameBodyLYR.lines.get(b);
      this.lines.add(new Lyrics3Line(lyrics3Line));
    } 
  }
  
  private void readString(String paramString) {
    int j = paramString.indexOf(Lyrics3v2Fields.CRLF);
    this.lines = new ArrayList<Lyrics3Line>();
    int i = 0;
    while (j >= 0) {
      String str = paramString.substring(i, j);
      Lyrics3Line lyrics3Line = new Lyrics3Line("Lyric Line", this);
      lyrics3Line.setLyric(str);
      this.lines.add(lyrics3Line);
      str = Lyrics3v2Fields.CRLF;
      i = j + str.length();
      j = paramString.indexOf(str, i);
    } 
    if (i < paramString.length()) {
      String str = paramString.substring(i);
      Lyrics3Line lyrics3Line = new Lyrics3Line("Lyric Line", this);
      lyrics3Line.setLyric(str);
      this.lines.add(lyrics3Line);
    } 
  }
  
  private String writeString() {
    ArrayList<Lyrics3Line> arrayList = this.lines;
    int i = arrayList.size();
    String str = "";
    byte b = 0;
    while (b < i) {
      Lyrics3Line lyrics3Line = (Lyrics3Line)arrayList.get(b);
      b++;
      lyrics3Line = lyrics3Line;
      StringBuilder stringBuilder = x41.p(str);
      stringBuilder.append(lyrics3Line.writeString());
      stringBuilder.append(Lyrics3v2Fields.CRLF);
      str = stringBuilder.toString();
    } 
    return str;
  }
  
  public void addLyric(FrameBodySYLT paramFrameBodySYLT) {
    Iterator<AbstractDataType> iterator = paramFrameBodySYLT.iterator();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    while (iterator.hasNext()) {
      AbstractDataType abstractDataType = iterator.next();
      if (abstractDataType instanceof ID3v2LyricLine) {
        ID3v2LyricLine iD3v2LyricLine = new ID3v2LyricLine((ID3v2LyricLine)abstractDataType);
        Lyrics3TimeStamp lyrics3TimeStamp = new Lyrics3TimeStamp("Time Stamp", this);
        lyrics3TimeStamp.setTimeStamp(iD3v2LyricLine.getTimeStamp(), (byte)paramFrameBodySYLT.getTimeStampFormat());
        if (hashMap.containsKey(iD3v2LyricLine.getText())) {
          ((Lyrics3Line)hashMap.get(iD3v2LyricLine.getText())).addTimeStamp(lyrics3TimeStamp);
          continue;
        } 
        Lyrics3Line lyrics3Line = new Lyrics3Line("Lyric Line", this);
        lyrics3Line.setLyric(iD3v2LyricLine);
        lyrics3Line.setTimeStamp(lyrics3TimeStamp);
        hashMap.put(iD3v2LyricLine.getText(), lyrics3Line);
        this.lines.add(lyrics3Line);
      } 
    } 
  }
  
  public void addLyric(FrameBodyUSLT paramFrameBodyUSLT) {
    Lyrics3Line lyrics3Line = new Lyrics3Line("Lyric Line", this);
    lyrics3Line.setLyric(paramFrameBodyUSLT.getLyric());
    this.lines.add(lyrics3Line);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof FieldFrameBodyLYR))
      return false; 
    FieldFrameBodyLYR fieldFrameBodyLYR = (FieldFrameBodyLYR)paramObject;
    return (this.lines.equals(fieldFrameBodyLYR.lines) && super.equals(paramObject));
  }
  
  public String getIdentifier() {
    return "LYR";
  }
  
  public String getLyric() {
    return writeString();
  }
  
  public int getSize() {
    ArrayList<Lyrics3Line> arrayList = this.lines;
    int j = arrayList.size();
    int i = 0;
    byte b = 0;
    while (b < j) {
      Lyrics3Line lyrics3Line = (Lyrics3Line)arrayList.get(b);
      b++;
      i += ((Lyrics3Line)lyrics3Line).getSize() + 2;
    } 
    return i;
  }
  
  public boolean hasTimeStamp() {
    ArrayList<Lyrics3Line> arrayList = this.lines;
    int j = arrayList.size();
    boolean bool = false;
    int i = 0;
    while (i < j) {
      Lyrics3Line lyrics3Line = (Lyrics3Line)arrayList.get(i);
      int k = i + 1;
      i = k;
      if (((Lyrics3Line)lyrics3Line).hasTimeStamp()) {
        bool = true;
        i = k;
      } 
    } 
    return bool;
  }
  
  public boolean isSubsetOf(Object paramObject) {
    if (!(paramObject instanceof FieldFrameBodyLYR))
      return false; 
    ArrayList<Lyrics3Line> arrayList1 = ((FieldFrameBodyLYR)paramObject).lines;
    ArrayList<Lyrics3Line> arrayList2 = this.lines;
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
  
  public Iterator<Lyrics3Line> iterator() {
    return this.lines.iterator();
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
  
  public void setLyric(String paramString) {
    readString(paramString);
  }
  
  public void setupObjectList() {}
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getIdentifier());
    stringBuilder.append(" : ");
    String str = stringBuilder.toString();
    ArrayList<Lyrics3Line> arrayList = this.lines;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      Object object = arrayList.get(b);
      b++;
      StringBuilder stringBuilder1 = x41.p(str);
      stringBuilder1.append(object.toString());
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
      str = writeString();
      arrayOfByte = new byte[str.length()];
      for (b = bool; b < str.length(); b++)
        arrayOfByte[b] = (byte)str.charAt(b); 
      paramuc1.write(arrayOfByte);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\FieldFrameBodyLYR.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */