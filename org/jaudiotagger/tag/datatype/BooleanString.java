package org.jaudiotagger.tag.datatype;

import org.jaudiotagger.tag.id3.AbstractTagFrameBody;

public class BooleanString extends AbstractDataType {
  public BooleanString(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public BooleanString(BooleanString paramBooleanString) {
    super(paramBooleanString);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof BooleanString && super.equals(paramObject));
  }
  
  public int getSize() {
    return 1;
  }
  
  public void readByteArray(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool;
    if (paramArrayOfbyte[paramInt] != 48) {
      bool = true;
    } else {
      bool = false;
    } 
    this.value = Boolean.valueOf(bool);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("");
    stringBuilder.append(this.value);
    return stringBuilder.toString();
  }
  
  public byte[] writeByteArray() {
    byte[] arrayOfByte = new byte[1];
    Object object = this.value;
    if (object == null) {
      arrayOfByte[0] = 48;
      return arrayOfByte;
    } 
    if (((Boolean)object).booleanValue()) {
      arrayOfByte[0] = 48;
      return arrayOfByte;
    } 
    arrayOfByte[0] = 49;
    return arrayOfByte;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\BooleanString.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */