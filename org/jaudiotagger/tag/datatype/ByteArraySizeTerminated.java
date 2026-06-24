package org.jaudiotagger.tag.datatype;

import ga1;
import java.util.logging.Level;
import java.util.logging.Logger;
import k91;
import m60;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import r3.IKWi.AyxAR;

public class ByteArraySizeTerminated extends AbstractDataType {
  public ByteArraySizeTerminated(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public ByteArraySizeTerminated(ByteArraySizeTerminated paramByteArraySizeTerminated) {
    super(paramByteArraySizeTerminated);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof ByteArraySizeTerminated && super.equals(paramObject));
  }
  
  public int getSize() {
    Object object = this.value;
    return (object != null) ? ((byte[])object).length : 0;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte != null) {
      if (paramInt >= 0) {
        if (paramInt >= paramArrayOfbyte.length) {
          this.value = null;
          return;
        } 
        int i = paramArrayOfbyte.length - paramInt;
        byte[] arrayOfByte = new byte[i];
        this.value = arrayOfByte;
        System.arraycopy(paramArrayOfbyte, paramInt, arrayOfByte, 0, i);
        return;
      } 
      StringBuilder stringBuilder = ga1.k(paramInt, "Offset to byte array is out of bounds: offset = ", ", array.length = ");
      m60.g(paramArrayOfbyte.length, stringBuilder);
      return;
    } 
    k91.h("Byte array is null");
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getSize());
    stringBuilder.append(AyxAR.ObfKfcFXFF);
    return stringBuilder.toString();
  }
  
  public byte[] writeByteArray() {
    if (AbstractDataType.logger.isLoggable(Level.CONFIG)) {
      Logger logger = AbstractDataType.logger;
      StringBuilder stringBuilder = new StringBuilder("Writing byte array");
      stringBuilder.append(getIdentifier());
      logger.config(stringBuilder.toString());
    } 
    return (byte[])this.value;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\ByteArraySizeTerminated.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */