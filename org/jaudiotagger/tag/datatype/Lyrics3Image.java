package org.jaudiotagger.tag.datatype;

import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import ga1;
import k91;
import m60;
import mk;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import x41;

public class Lyrics3Image extends AbstractDataType {
  private String description = "";
  
  private String filename = "";
  
  private Lyrics3TimeStamp time = null;
  
  public Lyrics3Image(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public Lyrics3Image(Lyrics3Image paramLyrics3Image) {
    super(paramLyrics3Image);
    this.time = new Lyrics3TimeStamp(paramLyrics3Image.time);
    this.description = paramLyrics3Image.description;
    this.filename = paramLyrics3Image.filename;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof Lyrics3Image))
      return false; 
    Lyrics3Image lyrics3Image = (Lyrics3Image)paramObject;
    if (!this.description.equals(lyrics3Image.description))
      return false; 
    if (!this.filename.equals(lyrics3Image.filename))
      return false; 
    Lyrics3TimeStamp lyrics3TimeStamp1 = this.time;
    Lyrics3TimeStamp lyrics3TimeStamp2 = lyrics3Image.time;
    if (lyrics3TimeStamp1 == null) {
      if (lyrics3TimeStamp2 != null)
        return false; 
    } else if (!lyrics3TimeStamp1.equals(lyrics3TimeStamp2)) {
      return false;
    } 
    return super.equals(paramObject);
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public String getFilename() {
    return this.filename;
  }
  
  public int getSize() {
    int i = this.filename.length();
    i = this.description.length() + i + 2 + 2;
    Lyrics3TimeStamp lyrics3TimeStamp = this.time;
    return (lyrics3TimeStamp != null) ? (lyrics3TimeStamp.getSize() + i) : i;
  }
  
  public Lyrics3TimeStamp getTimeStamp() {
    return this.time;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    readString(paramArrayOfbyte.toString(), paramInt);
  }
  
  public void readString(String paramString, int paramInt) {
    if (paramString != null) {
      if (paramInt >= 0 && paramInt < paramString.length()) {
        int i = paramString.indexOf("||", paramInt);
        this.filename = paramString.substring(paramInt, i);
        paramInt = i + 2;
        i = paramString.indexOf("||", paramInt);
        this.description = paramString.substring(paramInt, i);
        paramString = paramString.substring(i + 2);
        if (paramString.length() == 7) {
          Lyrics3TimeStamp lyrics3TimeStamp = new Lyrics3TimeStamp("Time Stamp");
          this.time = lyrics3TimeStamp;
          lyrics3TimeStamp.readString(paramString);
        } 
        return;
      } 
      StringBuilder stringBuilder = ga1.k(paramInt, "Offset to image string is out of bounds: offset = ", ", string.length()");
      m60.g(paramString.length(), stringBuilder);
      return;
    } 
    k91.h("Image string is null");
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public void setFilename(String paramString) {
    this.filename = paramString;
  }
  
  public void setTimeStamp(Lyrics3TimeStamp paramLyrics3TimeStamp) {
    this.time = paramLyrics3TimeStamp;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("filename = ");
    stringBuilder.append(this.filename);
    stringBuilder.append(", description = ");
    stringBuilder.append(this.description);
    String str2 = stringBuilder.toString();
    String str1 = str2;
    if (this.time != null) {
      StringBuilder stringBuilder1 = ga1.l(str2, ", timestamp = ");
      stringBuilder1.append(this.time.toString());
      str1 = stringBuilder1.toString();
    } 
    return str1.concat("\n");
  }
  
  public byte[] writeByteArray() {
    return writeString().getBytes(mk.b);
  }
  
  public String writeString() {
    StringBuilder stringBuilder;
    String str1 = this.filename;
    String str2 = hbrAVtEa.lYfSdHww;
    if (str1 == null) {
      str1 = str2;
    } else {
      str1 = x41.n(new StringBuilder(), this.filename, str2);
    } 
    if (this.description == null) {
      str1 = str1.concat(str2);
    } else {
      str1 = x41.n(x41.p(str1), this.description, str2);
    } 
    if (this.time != null) {
      stringBuilder = x41.p(str1);
      stringBuilder.append(this.time.writeString());
      return stringBuilder.toString();
    } 
    return (String)stringBuilder;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\Lyrics3Image.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */