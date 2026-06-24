package org.jaudiotagger.tag.asf;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import k91;
import l0;
import org.jaudiotagger.audio.asf.data.AsfHeader;
import org.jaudiotagger.audio.asf.data.MetadataDescriptor;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.tag.id3.valuepair.ImageFormats;

public class AsfTagCoverField extends AbstractAsfTagImageField {
  public static final Logger LOGGER = Logger.getLogger("org.jaudiotagger.audio.asf.tag");
  
  private String description;
  
  private int endOfName = 0;
  
  private int imageDataSize;
  
  private String mimeType;
  
  private int pictureType;
  
  public AsfTagCoverField(MetadataDescriptor paramMetadataDescriptor) {
    super(paramMetadataDescriptor);
    if (paramMetadataDescriptor.getName().equals(AsfFieldKey.COVER_ART.getFieldName())) {
      if (paramMetadataDescriptor.getType() == 1)
        try {
          processRawContent();
          return;
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          k91.n(unsupportedEncodingException);
          throw null;
        }  
      l0.l("Descriptor type must be binary");
      throw null;
    } 
    l0.l("Descriptor description must be WM/Picture");
    throw null;
  }
  
  public AsfTagCoverField(byte[] paramArrayOfbyte, int paramInt, String paramString1, String paramString2) {
    super(new MetadataDescriptor(AsfFieldKey.COVER_ART.getFieldName(), 1));
    getDescriptor().setBinaryValue(createRawContent(paramArrayOfbyte, paramInt, paramString1, paramString2));
  }
  
  private byte[] createRawContent(byte[] paramArrayOfbyte, int paramInt, String paramString1, String paramString2) {
    this.description = paramString1;
    this.imageDataSize = paramArrayOfbyte.length;
    this.pictureType = paramInt;
    this.mimeType = paramString2;
    String str = paramString2;
    if (paramString2 == null) {
      paramString2 = ImageFormats.getMimeTypeForBinarySignature(paramArrayOfbyte);
      str = paramString2;
      if (paramString2 == null) {
        LOGGER.warning("Cannot safetly identify the format of this image setting to default type of Png");
        str = "image/png";
      } 
    } 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byteArrayOutputStream.write(paramInt);
    byteArrayOutputStream.write(Utils.getSizeLEInt32(paramArrayOfbyte.length), 0, 4);
    try {
      Charset charset = AsfHeader.ASF_CHARSET;
      byte[] arrayOfByte = str.getBytes(charset.name());
      byteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
      byteArrayOutputStream.write(0);
      byteArrayOutputStream.write(0);
      if (paramString1 != null && paramString1.length() > 0)
        try {
          byte[] arrayOfByte1 = paramString1.getBytes(charset.name());
          byteArrayOutputStream.write(arrayOfByte1, 0, arrayOfByte1.length);
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          l0.h("Unable to find encoding:", AsfHeader.ASF_CHARSET.name());
          return null;
        }  
      byteArrayOutputStream.write(0);
      byteArrayOutputStream.write(0);
      byteArrayOutputStream.write((byte[])unsupportedEncodingException, 0, unsupportedEncodingException.length);
      return byteArrayOutputStream.toByteArray();
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      l0.h("Unable to find encoding:", AsfHeader.ASF_CHARSET.name());
      return null;
    } 
  }
  
  private void processRawContent() {
    byte[] arrayOfByte = getRawContent();
    int i = 0;
    this.pictureType = arrayOfByte[0];
    this.imageDataSize = Utils.getIntLE(getRawContent(), 1, 2);
    this.mimeType = null;
    this.description = null;
    byte b = 5;
    while (b < (getRawContent()).length - 1) {
      int j = i;
      if (getRawContent()[b] == 0) {
        j = i;
        if (getRawContent()[b + 1] == 0)
          if (this.mimeType == null) {
            this.mimeType = new String(getRawContent(), 5, b - 5, "UTF-16LE");
            j = b + 2;
          } else {
            j = i;
            if (this.description == null) {
              this.description = new String(getRawContent(), i, b - i, "UTF-16LE");
              this.endOfName = b + 2;
              return;
            } 
          }  
      } 
      b += 2;
      i = j;
    } 
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public int getImageDataSize() {
    return this.imageDataSize;
  }
  
  public String getMimeType() {
    return this.mimeType;
  }
  
  public int getPictureType() {
    return this.pictureType;
  }
  
  public byte[] getRawImageData() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byteArrayOutputStream.write(getRawContent(), this.endOfName, this.toWrap.getRawDataSize() - this.endOfName);
    return byteArrayOutputStream.toByteArray();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\asf\AsfTagCoverField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */