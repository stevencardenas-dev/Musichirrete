package org.jaudiotagger.tag.datatype;

import ga1;
import k91;
import l0;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.ID3Tags;

public class TempoCode extends AbstractDataType {
  private static final int MAXIMUM_NO_OF_DIGITS = 2;
  
  private static final int MINIMUM_NO_OF_DIGITS = 1;
  
  public TempoCode(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody, Integer.valueOf(0));
  }
  
  public TempoCode(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody, Object paramObject) {
    super(paramString, paramAbstractTagFrameBody, paramObject);
  }
  
  public TempoCode(TempoCode paramTempoCode) {
    super(paramTempoCode);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof TempoCode && super.equals(paramObject));
  }
  
  public int getSize() {
    Object object = this.value;
    return (object == null) ? 0 : ((ID3Tags.getWholeNumber(object) < 255L) ? 1 : 2);
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte != null) {
      if (paramInt >= 0) {
        if (paramInt < paramArrayOfbyte.length) {
          long l2 = (paramArrayOfbyte[paramInt] & 0xFF);
          long l1 = l2;
          if (l2 == 255L)
            l1 = l2 + (paramArrayOfbyte[paramInt + 1] & 0xFF); 
          this.value = Long.valueOf(l1);
          return;
        } 
        StringBuilder stringBuilder = ga1.k(paramInt, "Offset to byte array is out of bounds: offset = ", ", array.length = ");
        stringBuilder.append(paramArrayOfbyte.length);
        throw new InvalidDataTypeException(stringBuilder.toString());
      } 
      l0.l(ga1.i("negative offset into an array offset:", paramInt));
      return;
    } 
    k91.h("Byte array is null");
  }
  
  public String toString() {
    Object object = this.value;
    return (object == null) ? "" : object.toString();
  }
  
  public byte[] writeByteArray() {
    byte[] arrayOfByte = new byte[getSize()];
    long l2 = ID3Tags.getWholeNumber(this.value);
    boolean bool = false;
    long l1 = l2;
    if (l2 >= 255L) {
      arrayOfByte[0] = -1;
      l1 = l2 - 255L;
      bool = true;
    } 
    arrayOfByte[bool] = (byte)(int)(l1 & 0xFFL);
    return arrayOfByte;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\TempoCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */