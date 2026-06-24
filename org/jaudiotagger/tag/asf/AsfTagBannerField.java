package org.jaudiotagger.tag.asf;

import org.jaudiotagger.audio.asf.data.ContainerType;
import org.jaudiotagger.audio.asf.data.MetadataDescriptor;

public class AsfTagBannerField extends AbstractAsfTagImageField {
  static final boolean $assertionsDisabled = false;
  
  public AsfTagBannerField() {
    super(AsfFieldKey.BANNER_IMAGE);
  }
  
  public AsfTagBannerField(MetadataDescriptor paramMetadataDescriptor) {
    super(paramMetadataDescriptor);
  }
  
  public AsfTagBannerField(byte[] paramArrayOfbyte) {
    super(new MetadataDescriptor(ContainerType.CONTENT_BRANDING, AsfFieldKey.BANNER_IMAGE.getFieldName(), 1));
    this.toWrap.setBinaryValue(paramArrayOfbyte);
  }
  
  public int getImageDataSize() {
    return this.toWrap.getRawDataSize();
  }
  
  public byte[] getRawImageData() {
    return getRawContent();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\asf\AsfTagBannerField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */