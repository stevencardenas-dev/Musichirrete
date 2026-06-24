package org.jaudiotagger.tag.mp4.field;

import java.nio.ByteBuffer;
import java.text.MessageFormat;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.tag.id3.valuepair.ImageFormats;
import org.jaudiotagger.tag.mp4.Mp4FieldKey;
import org.jaudiotagger.tag.mp4.Mp4TagField;
import x41;

public class Mp4TagCoverField extends Mp4TagBinaryField {
  private int dataAndHeaderSize;
  
  private Mp4FieldType imageType;
  
  public Mp4TagCoverField() {
    super(Mp4FieldKey.ARTWORK.getFieldName());
  }
  
  public Mp4TagCoverField(ByteBuffer paramByteBuffer, Mp4FieldType paramMp4FieldType) {
    super(Mp4FieldKey.ARTWORK.getFieldName(), paramByteBuffer);
    this.imageType = paramMp4FieldType;
    if (!Mp4FieldType.isCoverArtType(paramMp4FieldType))
      Mp4TagField.logger.warning(MessageFormat.format("ImageFormat for cover art atom is not set to a known image format, instead set to {0}", new Object[] { paramMp4FieldType })); 
  }
  
  public Mp4TagCoverField(byte[] paramArrayOfbyte) {
    super(Mp4FieldKey.ARTWORK.getFieldName(), paramArrayOfbyte);
    if (ImageFormats.binaryDataIsPngFormat(paramArrayOfbyte)) {
      this.imageType = Mp4FieldType.COVERART_PNG;
      return;
    } 
    if (ImageFormats.binaryDataIsJpgFormat(paramArrayOfbyte)) {
      this.imageType = Mp4FieldType.COVERART_JPEG;
      return;
    } 
    if (ImageFormats.binaryDataIsGifFormat(paramArrayOfbyte)) {
      this.imageType = Mp4FieldType.COVERART_GIF;
      return;
    } 
    if (ImageFormats.binaryDataIsBmpFormat(paramArrayOfbyte)) {
      this.imageType = Mp4FieldType.COVERART_BMP;
      return;
    } 
    Mp4TagField.logger.warning("Cannot safetly identify the format of this image setting to default type of Png");
    this.imageType = Mp4FieldType.COVERART_PNG;
  }
  
  public static String getMimeTypeForImageType(Mp4FieldType paramMp4FieldType) {
    return (paramMp4FieldType == Mp4FieldType.COVERART_PNG) ? "image/png" : ((paramMp4FieldType == Mp4FieldType.COVERART_JPEG) ? "image/jpeg" : ((paramMp4FieldType == Mp4FieldType.COVERART_GIF) ? "image/gif" : ((paramMp4FieldType == Mp4FieldType.COVERART_BMP) ? "image/bmp" : null)));
  }
  
  public void build(ByteBuffer paramByteBuffer) {
    Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader(paramByteBuffer);
    this.dataSize = mp4BoxHeader.getDataLength();
    this.dataAndHeaderSize = mp4BoxHeader.getLength();
    paramByteBuffer.position(paramByteBuffer.position() + 8);
    byte[] arrayOfByte = new byte[this.dataSize - 8];
    this.dataBytes = arrayOfByte;
    paramByteBuffer.get(arrayOfByte, 0, arrayOfByte.length);
    int i = paramByteBuffer.position();
    if (paramByteBuffer.position() + 8 <= paramByteBuffer.limit()) {
      Mp4BoxHeader mp4BoxHeader1 = new Mp4BoxHeader(paramByteBuffer);
      if (mp4BoxHeader1.getId().equals("name")) {
        i = this.dataSize;
        this.dataSize = mp4BoxHeader1.getDataLength() + i;
        i = this.dataAndHeaderSize;
        this.dataAndHeaderSize = mp4BoxHeader1.getLength() + i;
        return;
      } 
      paramByteBuffer.position(i);
    } 
  }
  
  public int getDataAndHeaderSize() {
    return this.dataAndHeaderSize;
  }
  
  public Mp4FieldType getFieldType() {
    return this.imageType;
  }
  
  public boolean isBinary() {
    return true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.imageType);
    stringBuilder.append(":");
    return x41.m(stringBuilder, this.dataBytes.length, "bytes");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\field\Mp4TagCoverField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */