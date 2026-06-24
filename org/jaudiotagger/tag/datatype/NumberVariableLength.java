package org.jaudiotagger.tag.datatype;

import ga1;
import k91;
import l0;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.ID3Tags;

public class NumberVariableLength extends AbstractDataType {
  private static final int MAXIMUM_NO_OF_DIGITS = 8;
  
  private static final int MINIMUM_NO_OF_DIGITS = 1;
  
  int minLength;
  
  public NumberVariableLength(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody, int paramInt) {
    super(paramString, paramAbstractTagFrameBody);
    this.minLength = paramInt;
  }
  
  public NumberVariableLength(NumberVariableLength paramNumberVariableLength) {
    super(paramNumberVariableLength);
    this.minLength = 1;
    this.minLength = paramNumberVariableLength.minLength;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof NumberVariableLength))
      return false; 
    NumberVariableLength numberVariableLength = (NumberVariableLength)paramObject;
    return (this.minLength == numberVariableLength.minLength && super.equals(paramObject));
  }
  
  public int getMaximumLenth() {
    return 8;
  }
  
  public int getMinimumLength() {
    return this.minLength;
  }
  
  public int getSize() {
    Object object = this.value;
    int j = 0;
    if (object == null)
      return 0; 
    long l = ID3Tags.getWholeNumber(object);
    int i;
    for (i = 1; i <= 8; i++) {
      if (((byte)(int)l & 0xFF) != 0)
        j = i; 
      l >>= 8L;
    } 
    i = this.minLength;
    return (i > j) ? i : j;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte != null) {
      if (paramInt >= 0) {
        int j = paramArrayOfbyte.length;
        long l = 0L;
        int i = paramInt;
        if (paramInt >= j) {
          if (this.minLength == 0) {
            this.value = Long.valueOf(0L);
            return;
          } 
          StringBuilder stringBuilder = ga1.k(paramInt, "Offset to byte array is out of bounds: offset = ", ", array.length = ");
          stringBuilder.append(paramArrayOfbyte.length);
          throw new InvalidDataTypeException(stringBuilder.toString());
        } 
        while (i < paramArrayOfbyte.length) {
          l = (l << 8L) + (paramArrayOfbyte[i] & 0xFF);
          i++;
        } 
        this.value = Long.valueOf(l);
        return;
      } 
      l0.l(ga1.i("negativer offset into an array offset:", paramInt));
      return;
    } 
    k91.h("Byte array is null");
  }
  
  public void setMinimumSize(int paramInt) {
    if (paramInt > 0)
      this.minLength = paramInt; 
  }
  
  public String toString() {
    Object object = this.value;
    return (object == null) ? "" : object.toString();
  }
  
  public byte[] writeByteArray() {
    int i = getSize();
    if (i == 0)
      return new byte[0]; 
    long l = ID3Tags.getWholeNumber(this.value);
    byte[] arrayOfByte = new byte[i];
    while (--i >= 0) {
      arrayOfByte[i] = (byte)(int)(0xFFL & l);
      l >>= 8L;
      i--;
    } 
    return arrayOfByte;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\NumberVariableLength.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */