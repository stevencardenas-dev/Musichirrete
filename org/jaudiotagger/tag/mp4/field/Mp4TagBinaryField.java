package org.jaudiotagger.tag.mp4.field;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.mp4.Mp4TagField;

public class Mp4TagBinaryField extends Mp4TagField {
  protected byte[] dataBytes;
  
  protected int dataSize;
  
  protected boolean isBinary = false;
  
  public Mp4TagBinaryField(String paramString) {
    super(paramString);
  }
  
  public Mp4TagBinaryField(String paramString, ByteBuffer paramByteBuffer) {
    super(paramString, paramByteBuffer);
  }
  
  public Mp4TagBinaryField(String paramString, byte[] paramArrayOfbyte) {
    super(paramString);
    this.dataBytes = paramArrayOfbyte;
  }
  
  public void build(ByteBuffer paramByteBuffer) {
    this.dataSize = (new Mp4BoxHeader(paramByteBuffer)).getDataLength();
    paramByteBuffer.position(paramByteBuffer.position() + 8);
    this.dataBytes = new byte[this.dataSize - 8];
    byte b = 0;
    while (true) {
      byte[] arrayOfByte = this.dataBytes;
      if (b < arrayOfByte.length) {
        arrayOfByte[b] = paramByteBuffer.get();
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public void copyContent(TagField paramTagField) {
    if (paramTagField instanceof Mp4TagBinaryField) {
      this.dataBytes = ((Mp4TagBinaryField)paramTagField).getData();
      this.isBinary = paramTagField.isBinary();
    } 
  }
  
  public byte[] getData() {
    return this.dataBytes;
  }
  
  public byte[] getDataBytes() {
    return this.dataBytes;
  }
  
  public int getDataSize() {
    return this.dataSize;
  }
  
  public Mp4FieldType getFieldType() {
    return Mp4FieldType.IMPLICIT;
  }
  
  public boolean isBinary() {
    return this.isBinary;
  }
  
  public boolean isEmpty() {
    return (this.dataBytes.length == 0);
  }
  
  public void setData(byte[] paramArrayOfbyte) {
    this.dataBytes = paramArrayOfbyte;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\field\Mp4TagBinaryField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */