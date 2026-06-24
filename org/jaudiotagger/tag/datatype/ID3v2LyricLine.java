package org.jaudiotagger.tag.datatype;

import ga1;
import k91;
import m60;
import mk;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;

public class ID3v2LyricLine extends AbstractDataType {
  String text = "";
  
  long timeStamp = 0L;
  
  public ID3v2LyricLine(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public ID3v2LyricLine(ID3v2LyricLine paramID3v2LyricLine) {
    super(paramID3v2LyricLine);
    this.text = paramID3v2LyricLine.text;
    this.timeStamp = paramID3v2LyricLine.timeStamp;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof ID3v2LyricLine))
      return false; 
    ID3v2LyricLine iD3v2LyricLine = (ID3v2LyricLine)paramObject;
    return !this.text.equals(iD3v2LyricLine.text) ? false : ((this.timeStamp == iD3v2LyricLine.timeStamp && super.equals(paramObject)));
  }
  
  public int getSize() {
    return this.text.length() + 5;
  }
  
  public String getText() {
    return this.text;
  }
  
  public long getTimeStamp() {
    return this.timeStamp;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte != null) {
      if (paramInt >= 0 && paramInt < paramArrayOfbyte.length) {
        this.text = new String(paramArrayOfbyte, paramInt, paramArrayOfbyte.length - paramInt - 4, mk.b);
        this.timeStamp = 0L;
        for (paramInt = paramArrayOfbyte.length - 4; paramInt < paramArrayOfbyte.length; paramInt++) {
          long l = this.timeStamp << 8L;
          this.timeStamp = l;
          this.timeStamp = l + paramArrayOfbyte[paramInt];
        } 
        return;
      } 
      StringBuilder stringBuilder = ga1.k(paramInt, "Offset to byte array is out of bounds: offset = ", ", array.length = ");
      m60.g(paramArrayOfbyte.length, stringBuilder);
      return;
    } 
    k91.h("Byte array is null");
  }
  
  public void setText(String paramString) {
    this.text = paramString;
  }
  
  public void setTimeStamp(long paramLong) {
    this.timeStamp = paramLong;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.timeStamp);
    stringBuilder.append(" ");
    stringBuilder.append(this.text);
    return stringBuilder.toString();
  }
  
  public byte[] writeByteArray() {
    byte[] arrayOfByte = new byte[getSize()];
    byte b;
    for (b = 0; b < this.text.length(); b++)
      arrayOfByte[b] = (byte)this.text.charAt(b); 
    arrayOfByte[b] = 0;
    long l = this.timeStamp;
    arrayOfByte[b + 1] = (byte)(int)((0xFFFFFFFFFF000000L & l) >> 24L);
    arrayOfByte[b + 2] = (byte)(int)((0xFF0000L & l) >> 16L);
    arrayOfByte[b + 3] = (byte)(int)((0xFF00L & l) >> 8L);
    arrayOfByte[b + 4] = (byte)(int)(l & 0xFFL);
    return arrayOfByte;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\ID3v2LyricLine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */