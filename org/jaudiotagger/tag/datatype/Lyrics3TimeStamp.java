package org.jaudiotagger.tag.datatype;

import ga1;
import k91;
import m60;
import mk;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import x41;

public class Lyrics3TimeStamp extends AbstractDataType {
  private long minute = 0L;
  
  private long second = 0L;
  
  public Lyrics3TimeStamp(String paramString) {
    super(paramString, null);
  }
  
  public Lyrics3TimeStamp(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public Lyrics3TimeStamp(Lyrics3TimeStamp paramLyrics3TimeStamp) {
    super(paramLyrics3TimeStamp);
    this.minute = paramLyrics3TimeStamp.minute;
    this.second = paramLyrics3TimeStamp.second;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof Lyrics3TimeStamp))
      return false; 
    Lyrics3TimeStamp lyrics3TimeStamp = (Lyrics3TimeStamp)paramObject;
    return (this.minute != lyrics3TimeStamp.minute) ? false : ((this.second == lyrics3TimeStamp.second && super.equals(paramObject)));
  }
  
  public long getMinute() {
    return this.minute;
  }
  
  public long getSecond() {
    return this.second;
  }
  
  public int getSize() {
    return 7;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    readString(paramArrayOfbyte.toString(), paramInt);
  }
  
  public void readString(String paramString) {}
  
  public void readString(String paramString, int paramInt) {
    if (paramString != null) {
      if (paramInt >= 0 && paramInt < paramString.length()) {
        paramString = paramString.substring(paramInt);
        if (paramString.length() == 7) {
          this.minute = Integer.parseInt(paramString.substring(1, 3));
          this.second = Integer.parseInt(paramString.substring(4, 6));
          return;
        } 
        this.minute = 0L;
        this.second = 0L;
        return;
      } 
      StringBuilder stringBuilder = ga1.k(paramInt, "Offset to timeStamp is out of bounds: offset = ", ", timeStamp.length()");
      m60.g(paramString.length(), stringBuilder);
      return;
    } 
    k91.h("Image is null");
  }
  
  public void setMinute(long paramLong) {
    this.minute = paramLong;
  }
  
  public void setSecond(long paramLong) {
    this.second = paramLong;
  }
  
  public void setTimeStamp(long paramLong, byte paramByte) {
    paramLong /= 1000L;
    this.minute = paramLong / 60L;
    this.second = paramLong % 60L;
  }
  
  public String toString() {
    return writeString();
  }
  
  public byte[] writeByteArray() {
    return writeString().getBytes(mk.b);
  }
  
  public String writeString() {
    String str1;
    long l = this.minute;
    if (l < 0L) {
      str1 = "[00";
    } else {
      String str;
      if (l < 10L) {
        str = "[0";
      } else {
        str = "[";
      } 
      StringBuilder stringBuilder = x41.p(str);
      stringBuilder.append(Long.toString(this.minute));
      str1 = stringBuilder.toString();
    } 
    String str2 = str1.concat(":");
    l = this.second;
    if (l < 0L) {
      str1 = str2.concat("00");
    } else {
      str1 = str2;
      if (l < 10L)
        str1 = str2.concat("0"); 
      StringBuilder stringBuilder = x41.p(str1);
      stringBuilder.append(Long.toString(this.second));
      str1 = stringBuilder.toString();
    } 
    return str1.concat("]");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\Lyrics3TimeStamp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */