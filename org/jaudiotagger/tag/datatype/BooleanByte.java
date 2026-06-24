package org.jaudiotagger.tag.datatype;

import ga1;
import k91;
import m60;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;

public class BooleanByte extends AbstractDataType {
  int bitPosition = -1;
  
  public BooleanByte(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody, int paramInt) {
    super(paramString, paramAbstractTagFrameBody);
    if (paramInt >= 0 && paramInt <= 7) {
      this.bitPosition = paramInt;
      return;
    } 
    m60.m(ga1.i("Bit position needs to be from 0 - 7 : ", paramInt));
    throw null;
  }
  
  public BooleanByte(BooleanByte paramBooleanByte) {
    super(paramBooleanByte);
    this.bitPosition = paramBooleanByte.bitPosition;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof BooleanByte))
      return false; 
    BooleanByte booleanByte = (BooleanByte)paramObject;
    return (this.bitPosition == booleanByte.bitPosition && super.equals(paramObject));
  }
  
  public int getBitPosition() {
    return this.bitPosition;
  }
  
  public int getSize() {
    return 1;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte != null) {
      if (paramInt >= 0 && paramInt < paramArrayOfbyte.length) {
        paramInt = (byte)(paramArrayOfbyte[paramInt] >> this.bitPosition);
        boolean bool = true;
        if ((byte)(paramInt & 0x1) != 1)
          bool = false; 
        this.value = Boolean.valueOf(bool);
        return;
      } 
      StringBuilder stringBuilder = ga1.k(paramInt, "Offset to byte array is out of bounds: offset = ", ", array.length = ");
      m60.g(paramArrayOfbyte.length, stringBuilder);
      return;
    } 
    k91.h("Byte array is null");
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("");
    stringBuilder.append(this.value);
    return stringBuilder.toString();
  }
  
  public byte[] writeByteArray() {
    byte[] arrayOfByte = new byte[1];
    Object object = this.value;
    if (object != null) {
      byte b = (byte)((Boolean)object).booleanValue();
      arrayOfByte[0] = b;
      arrayOfByte[0] = (byte)(b << this.bitPosition);
    } 
    return arrayOfByte;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\BooleanByte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */