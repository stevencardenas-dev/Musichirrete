package org.jaudiotagger.tag.mp4.field;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import k91;
import mk;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.mp4.Mp4TagField;

public class Mp4TagRawBinaryField extends Mp4TagField {
  protected byte[] dataBytes;
  
  protected int dataSize;
  
  public Mp4TagRawBinaryField(Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    super(paramMp4BoxHeader.getId());
    this.dataSize = paramMp4BoxHeader.getDataLength();
    build(paramByteBuffer);
  }
  
  public void build(ByteBuffer paramByteBuffer) {
    this.dataBytes = new byte[this.dataSize];
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
    throw new UnsupportedOperationException("not done");
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
  
  public byte[] getRawContent() {
    Logger logger = Mp4TagField.logger;
    StringBuilder stringBuilder = new StringBuilder("Getting Raw data for:");
    stringBuilder.append(getId());
    logger.fine(stringBuilder.toString());
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      byteArrayOutputStream.write(Utils.getSizeBEInt32(this.dataSize + 8));
      byteArrayOutputStream.write(getId().getBytes(mk.b));
      byteArrayOutputStream.write(this.dataBytes);
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
  
  public boolean isBinary() {
    return true;
  }
  
  public boolean isEmpty() {
    return (this.dataBytes.length == 0);
  }
  
  public void setData(byte[] paramArrayOfbyte) {
    this.dataBytes = paramArrayOfbyte;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\field\Mp4TagRawBinaryField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */