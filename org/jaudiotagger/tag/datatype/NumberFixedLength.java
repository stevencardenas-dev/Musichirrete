package org.jaudiotagger.tag.datatype;

import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import ga1;
import java.util.logging.Level;
import java.util.logging.Logger;
import k91;
import l0;
import org.jaudiotagger.tag.InvalidDataTypeException;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.ID3Tags;
import tp;

public class NumberFixedLength extends AbstractDataType {
  public NumberFixedLength(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody, int paramInt) {
    super(paramString, paramAbstractTagFrameBody);
    if (paramInt >= 0) {
      this.size = paramInt;
      return;
    } 
    l0.l(ga1.i("Length is less than zero: ", paramInt));
    throw null;
  }
  
  public NumberFixedLength(NumberFixedLength paramNumberFixedLength) {
    super(paramNumberFixedLength);
    this.size = paramNumberFixedLength.size;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof NumberFixedLength))
      return false; 
    NumberFixedLength numberFixedLength = (NumberFixedLength)paramObject;
    return (this.size == numberFixedLength.size && super.equals(paramObject));
  }
  
  public int getSize() {
    return this.size;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte != null) {
      Logger logger;
      if (paramInt >= 0 && paramInt < paramArrayOfbyte.length) {
        if (this.size + paramInt <= paramArrayOfbyte.length) {
          long l = 0L;
          for (int i = paramInt; i < this.size + paramInt; i++)
            l = (l << 8L) + (paramArrayOfbyte[i] & 0xFF); 
          this.value = Long.valueOf(l);
          if (AbstractDataType.logger.isLoggable(Level.CONFIG)) {
            logger = AbstractDataType.logger;
            StringBuilder stringBuilder2 = new StringBuilder("Read NumberFixedlength:");
            stringBuilder2.append(this.value);
            logger.config(stringBuilder2.toString());
          } 
          return;
        } 
        StringBuilder stringBuilder1 = ga1.k(paramInt, "Offset plus size to byte array is out of bounds: offset = ", xveccWbRzqx.EVk);
        stringBuilder1.append(this.size);
        stringBuilder1.append(" + arr.length ");
        stringBuilder1.append(logger.length);
        throw new InvalidDataTypeException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = ga1.k(paramInt, "Offset to byte array is out of bounds: offset = ", ", array.length = ");
      stringBuilder.append(logger.length);
      throw new InvalidDataTypeException(stringBuilder.toString());
    } 
    k91.h("Byte array is null");
  }
  
  public void setSize(int paramInt) {
    if (paramInt > 0)
      this.size = paramInt; 
  }
  
  public void setValue(Object paramObject) {
    if (paramObject instanceof Number) {
      super.setValue(paramObject);
      return;
    } 
    tp.g("Invalid value type for NumberFixedLength:", paramObject.getClass());
  }
  
  public String toString() {
    Object object = this.value;
    return (object == null) ? "" : object.toString();
  }
  
  public byte[] writeByteArray() {
    byte[] arrayOfByte = new byte[this.size];
    Object object = this.value;
    if (object != null) {
      long l = ID3Tags.getWholeNumber(object);
      for (int i = this.size - 1; i >= 0; i--) {
        arrayOfByte[i] = (byte)(int)(0xFFL & l);
        l >>= 8L;
      } 
    } 
    return arrayOfByte;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\NumberFixedLength.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */