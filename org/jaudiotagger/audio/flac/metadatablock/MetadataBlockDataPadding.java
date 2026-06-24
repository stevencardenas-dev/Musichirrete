package org.jaudiotagger.audio.flac.metadatablock;

import java.nio.ByteBuffer;

public class MetadataBlockDataPadding implements MetadataBlockData {
  private int length;
  
  public MetadataBlockDataPadding(int paramInt) {
    this.length = paramInt;
  }
  
  public ByteBuffer getBytes() {
    return ByteBuffer.allocate(this.length);
  }
  
  public int getLength() {
    return this.length;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\metadatablock\MetadataBlockDataPadding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */