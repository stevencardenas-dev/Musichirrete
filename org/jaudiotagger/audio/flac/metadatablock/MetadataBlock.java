package org.jaudiotagger.audio.flac.metadatablock;

public class MetadataBlock {
  private MetadataBlockData mbd;
  
  private MetadataBlockHeader mbh;
  
  public MetadataBlock(MetadataBlockHeader paramMetadataBlockHeader, MetadataBlockData paramMetadataBlockData) {
    this.mbh = paramMetadataBlockHeader;
    this.mbd = paramMetadataBlockData;
  }
  
  public MetadataBlockData getData() {
    return this.mbd;
  }
  
  public MetadataBlockHeader getHeader() {
    return this.mbh;
  }
  
  public int getLength() {
    return this.mbh.getDataLength() + 4;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\metadatablock\MetadataBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */