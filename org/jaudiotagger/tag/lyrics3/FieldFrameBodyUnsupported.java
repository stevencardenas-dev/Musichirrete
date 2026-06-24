package org.jaudiotagger.tag.lyrics3;

import java.nio.ByteBuffer;
import java.util.Arrays;
import uc1;

public class FieldFrameBodyUnsupported extends AbstractLyrics3v2FieldFrameBody {
  private byte[] value = null;
  
  public FieldFrameBodyUnsupported() {}
  
  public FieldFrameBodyUnsupported(ByteBuffer paramByteBuffer) {
    read(paramByteBuffer);
  }
  
  public FieldFrameBodyUnsupported(FieldFrameBodyUnsupported paramFieldFrameBodyUnsupported) {
    super(paramFieldFrameBodyUnsupported);
    this.value = (byte[])paramFieldFrameBodyUnsupported.value.clone();
  }
  
  public FieldFrameBodyUnsupported(byte[] paramArrayOfbyte) {}
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof FieldFrameBodyUnsupported))
      return false; 
    FieldFrameBodyUnsupported fieldFrameBodyUnsupported = (FieldFrameBodyUnsupported)paramObject;
    return (Arrays.equals(this.value, fieldFrameBodyUnsupported.value) && super.equals(paramObject));
  }
  
  public String getIdentifier() {
    return "ZZZ";
  }
  
  public boolean isSubsetOf(Object paramObject) {
    if (!(paramObject instanceof FieldFrameBodyUnsupported))
      return false; 
    FieldFrameBodyUnsupported fieldFrameBodyUnsupported = (FieldFrameBodyUnsupported)paramObject;
    String str = new String(this.value);
    return ((new String(fieldFrameBodyUnsupported.value)).contains(str) && super.isSubsetOf(paramObject));
  }
  
  public void read(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[5];
    paramByteBuffer.get(arrayOfByte, 0, 5);
    arrayOfByte = new byte[Integer.parseInt(new String(arrayOfByte, 0, 5))];
    this.value = arrayOfByte;
    paramByteBuffer.get(arrayOfByte);
  }
  
  public void setupObjectList() {}
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getIdentifier());
    stringBuilder.append(" : ");
    stringBuilder.append(new String(this.value));
    return stringBuilder.toString();
  }
  
  public void write(uc1 paramuc1) {
    byte[] arrayOfByte = new byte[5];
    String str = Integer.toString(this.value.length);
    boolean bool = false;
    byte b;
    for (b = 0; b < 5 - str.length(); b++)
      arrayOfByte[b] = 48; 
    int i = str.length();
    for (b = bool; b < str.length(); b++)
      arrayOfByte[b + 5 - i] = (byte)str.charAt(b); 
    paramuc1.write(arrayOfByte);
    paramuc1.write(this.value);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\FieldFrameBodyUnsupported.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */