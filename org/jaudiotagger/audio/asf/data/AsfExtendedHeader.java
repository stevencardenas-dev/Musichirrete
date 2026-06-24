package org.jaudiotagger.audio.asf.data;

import java.math.BigInteger;

public final class AsfExtendedHeader extends ChunkContainer {
  public AsfExtendedHeader(long paramLong, BigInteger paramBigInteger) {
    super(GUID.GUID_HEADER_EXTENSION, paramLong, paramBigInteger);
  }
  
  public ContentDescription getContentDescription() {
    return (ContentDescription)getFirst(GUID.GUID_CONTENTDESCRIPTION, (Class)ContentDescription.class);
  }
  
  public MetadataContainer getExtendedContentDescription() {
    return (MetadataContainer)getFirst(GUID.GUID_EXTENDED_CONTENT_DESCRIPTION, (Class)MetadataContainer.class);
  }
  
  public LanguageList getLanguageList() {
    return (LanguageList)getFirst(GUID.GUID_LANGUAGE_LIST, (Class)LanguageList.class);
  }
  
  public MetadataContainer getMetadataLibraryObject() {
    return (MetadataContainer)getFirst(GUID.GUID_METADATA_LIBRARY, (Class)MetadataContainer.class);
  }
  
  public MetadataContainer getMetadataObject() {
    return (MetadataContainer)getFirst(GUID.GUID_METADATA, (Class)MetadataContainer.class);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\data\AsfExtendedHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */