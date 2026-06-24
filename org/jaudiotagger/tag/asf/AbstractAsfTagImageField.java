package org.jaudiotagger.tag.asf;

import org.jaudiotagger.audio.asf.data.MetadataDescriptor;

abstract class AbstractAsfTagImageField extends AsfTagField {
  public AbstractAsfTagImageField(String paramString) {
    super(paramString);
  }
  
  public AbstractAsfTagImageField(MetadataDescriptor paramMetadataDescriptor) {
    super(paramMetadataDescriptor);
  }
  
  public AbstractAsfTagImageField(AsfFieldKey paramAsfFieldKey) {
    super(paramAsfFieldKey);
  }
  
  public abstract int getImageDataSize();
  
  public abstract byte[] getRawImageData();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\asf\AbstractAsfTagImageField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */