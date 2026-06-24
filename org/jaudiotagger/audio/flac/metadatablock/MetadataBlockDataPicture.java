package org.jaudiotagger.audio.flac.metadatablock;

import ga1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import l0;
import m60;
import mk;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.InvalidFrameException;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.reference.PictureTypes;
import x41;

public class MetadataBlockDataPicture implements MetadataBlockData, TagField {
  public static final String IMAGE_IS_URL = "-->";
  
  public static Logger logger;
  
  private int colourDepth;
  
  private String description = "";
  
  private int descriptionSize;
  
  private int height;
  
  private byte[] imageData;
  
  private int indexedColouredCount;
  
  private int lengthOfPictureInBytes;
  
  private String mimeType = "";
  
  private int mimeTypeSize;
  
  private int pictureType;
  
  private int width;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.flac.MetadataBlockDataPicture");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public MetadataBlockDataPicture(ByteBuffer paramByteBuffer) {
    initFromByteBuffer(paramByteBuffer);
  }
  
  public MetadataBlockDataPicture(MetadataBlockHeader paramMetadataBlockHeader, FileChannel paramFileChannel) {
    if (paramMetadataBlockHeader.getDataLength() != 0) {
      ByteBuffer byteBuffer = ByteBuffer.allocate(paramMetadataBlockHeader.getDataLength());
      int i = paramFileChannel.read(byteBuffer);
      if (i >= paramMetadataBlockHeader.getDataLength()) {
        byteBuffer.rewind();
        initFromByteBuffer(byteBuffer);
        return;
      } 
      StringBuilder stringBuilder = ga1.k(i, "Unable to read required number of databytes read:", ":required:");
      stringBuilder.append(paramMetadataBlockHeader.getDataLength());
      throw new IOException(stringBuilder.toString());
    } 
    m60.i("MetadataBlockDataPicture HeaderDataSize is zero");
    throw null;
  }
  
  public MetadataBlockDataPicture(byte[] paramArrayOfbyte, int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.pictureType = paramInt1;
    if (paramString1 != null)
      this.mimeType = paramString1; 
    this.description = paramString2;
    this.width = paramInt2;
    this.height = paramInt3;
    this.colourDepth = paramInt4;
    this.indexedColouredCount = paramInt5;
    this.imageData = paramArrayOfbyte;
  }
  
  private String getString(ByteBuffer paramByteBuffer, int paramInt, String paramString) {
    byte[] arrayOfByte = new byte[paramInt];
    paramByteBuffer.get(arrayOfByte);
    return new String(arrayOfByte, paramString);
  }
  
  private void initFromByteBuffer(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getInt();
    this.pictureType = i;
    if (i < PictureTypes.getInstanceOf().getSize()) {
      i = paramByteBuffer.getInt();
      this.mimeTypeSize = i;
      if (i >= 0) {
        this.mimeType = getString(paramByteBuffer, i, mk.b.name());
        i = paramByteBuffer.getInt();
        this.descriptionSize = i;
        if (i >= 0) {
          Logger logger;
          this.description = getString(paramByteBuffer, i, mk.c.name());
          this.width = paramByteBuffer.getInt();
          this.height = paramByteBuffer.getInt();
          this.colourDepth = paramByteBuffer.getInt();
          this.indexedColouredCount = paramByteBuffer.getInt();
          i = paramByteBuffer.getInt();
          this.lengthOfPictureInBytes = i;
          if (i <= paramByteBuffer.remaining()) {
            byte[] arrayOfByte = new byte[this.lengthOfPictureInBytes];
            this.imageData = arrayOfByte;
            paramByteBuffer.get(arrayOfByte);
            logger = logger;
            StringBuilder stringBuilder4 = new StringBuilder("Read image:");
            stringBuilder4.append(toString());
            logger.config(stringBuilder4.toString());
            return;
          } 
          i = this.lengthOfPictureInBytes;
          int k = logger.remaining();
          StringBuilder stringBuilder3 = new StringBuilder("PictureType Size was:");
          stringBuilder3.append(i);
          stringBuilder3.append(" but remaining bytes size ");
          stringBuilder3.append(k);
          throw new InvalidFrameException(stringBuilder3.toString());
        } 
        i = this.mimeTypeSize;
        StringBuilder stringBuilder2 = new StringBuilder("PictureType descriptionSize size was invalid:");
        stringBuilder2.append(i);
        throw new InvalidFrameException(stringBuilder2.toString());
      } 
      i = this.mimeTypeSize;
      StringBuilder stringBuilder1 = new StringBuilder("PictureType mimeType size was invalid:");
      stringBuilder1.append(i);
      throw new InvalidFrameException(stringBuilder1.toString());
    } 
    int j = this.pictureType;
    i = PictureTypes.getInstanceOf().getSize();
    StringBuilder stringBuilder = new StringBuilder("PictureType was:");
    stringBuilder.append(j);
    stringBuilder.append("but the maximum allowed is ");
    stringBuilder.append(i - 1);
    throw new InvalidFrameException(stringBuilder.toString());
  }
  
  public void copyContent(TagField paramTagField) {
    throw new UnsupportedOperationException();
  }
  
  public ByteBuffer getBytes() {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      byteArrayOutputStream.write(Utils.getSizeBEInt32(this.pictureType));
      String str2 = this.mimeType;
      Charset charset1 = mk.b;
      byteArrayOutputStream.write(Utils.getSizeBEInt32((str2.getBytes(charset1)).length));
      byteArrayOutputStream.write(this.mimeType.getBytes(charset1));
      String str1 = this.description;
      Charset charset2 = mk.c;
      byteArrayOutputStream.write(Utils.getSizeBEInt32((str1.getBytes(charset2)).length));
      byteArrayOutputStream.write(this.description.getBytes(charset2));
      byteArrayOutputStream.write(Utils.getSizeBEInt32(this.width));
      byteArrayOutputStream.write(Utils.getSizeBEInt32(this.height));
      byteArrayOutputStream.write(Utils.getSizeBEInt32(this.colourDepth));
      byteArrayOutputStream.write(Utils.getSizeBEInt32(this.indexedColouredCount));
      byteArrayOutputStream.write(Utils.getSizeBEInt32(this.imageData.length));
      byteArrayOutputStream.write(this.imageData);
      return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    } catch (IOException iOException) {
      l0.f(iOException.getMessage());
      return null;
    } 
  }
  
  public int getColourDepth() {
    return this.colourDepth;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public int getHeight() {
    return this.height;
  }
  
  public String getId() {
    return FieldKey.COVER_ART.name();
  }
  
  public byte[] getImageData() {
    return this.imageData;
  }
  
  public String getImageUrl() {
    return isImageUrl() ? new String(getImageData(), 0, (getImageData()).length, mk.b) : "";
  }
  
  public int getIndexedColourCount() {
    return this.indexedColouredCount;
  }
  
  public int getLength() {
    return getBytes().limit();
  }
  
  public String getMimeType() {
    return this.mimeType;
  }
  
  public int getPictureType() {
    return this.pictureType;
  }
  
  public byte[] getRawContent() {
    return getBytes().array();
  }
  
  public int getWidth() {
    return this.width;
  }
  
  public void isBinary(boolean paramBoolean) {}
  
  public boolean isBinary() {
    return true;
  }
  
  public boolean isCommon() {
    return true;
  }
  
  public boolean isEmpty() {
    return false;
  }
  
  public boolean isImageUrl() {
    return getMimeType().equals("-->");
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("\t\t");
    stringBuilder.append(PictureTypes.getInstanceOf().getValueForId(this.pictureType));
    stringBuilder.append("\n\t\tmimeType:size:");
    stringBuilder.append(this.mimeTypeSize);
    stringBuilder.append(":");
    stringBuilder.append(this.mimeType);
    stringBuilder.append("\n\t\tdescription:size:");
    stringBuilder.append(this.descriptionSize);
    stringBuilder.append(":");
    stringBuilder.append(this.description);
    stringBuilder.append("\n\t\twidth:");
    stringBuilder.append(this.width);
    stringBuilder.append("\n\t\theight:");
    stringBuilder.append(this.height);
    stringBuilder.append("\n\t\tcolourdepth:");
    stringBuilder.append(this.colourDepth);
    stringBuilder.append("\n\t\tindexedColourCount:");
    stringBuilder.append(this.indexedColouredCount);
    stringBuilder.append("\n\t\timage size in bytes:");
    stringBuilder.append(this.lengthOfPictureInBytes);
    stringBuilder.append("/");
    return x41.m(stringBuilder, this.imageData.length, "\n");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\metadatablock\MetadataBlockDataPicture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */