package org.jaudiotagger.audio.asf.data;

import java.math.BigInteger;

public final class MetadataContainerFactory {
  static final boolean $assertionsDisabled = false;
  
  private static final MetadataContainerFactory INSTANCE = new MetadataContainerFactory();
  
  public static MetadataContainerFactory getInstance() {
    return INSTANCE;
  }
  
  public MetadataContainer createContainer(ContainerType paramContainerType) {
    return createContainer(paramContainerType, 0L, BigInteger.ZERO);
  }
  
  public MetadataContainer createContainer(ContainerType paramContainerType, long paramLong, BigInteger paramBigInteger) {
    return (paramContainerType == ContainerType.CONTENT_DESCRIPTION) ? new ContentDescription(paramLong, paramBigInteger) : ((paramContainerType == ContainerType.CONTENT_BRANDING) ? new ContentBranding(paramLong, paramBigInteger) : new MetadataContainer(paramContainerType, paramLong, paramBigInteger));
  }
  
  public MetadataContainer[] createContainers(ContainerType[] paramArrayOfContainerType) {
    int i = paramArrayOfContainerType.length;
    MetadataContainer[] arrayOfMetadataContainer = new MetadataContainer[i];
    for (byte b = 0; b < i; b++)
      arrayOfMetadataContainer[b] = createContainer(paramArrayOfContainerType[b]); 
    return arrayOfMetadataContainer;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\MetadataContainerFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */