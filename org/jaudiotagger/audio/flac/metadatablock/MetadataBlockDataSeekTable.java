package org.jaudiotagger.audio.flac.metadatablock;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MetadataBlockDataSeekTable implements MetadataBlockData {
  private ByteBuffer data;
  
  public MetadataBlockDataSeekTable(MetadataBlockHeader paramMetadataBlockHeader, FileChannel paramFileChannel) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(paramMetadataBlockHeader.getDataLength());
    this.data = byteBuffer;
    paramFileChannel.read(byteBuffer);
    this.data.flip();
  }
  
  public ByteBuffer getBytes() {
    return this.data;
  }
  
  public int getLength() {
    return this.data.limit();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\metadatablock\MetadataBlockDataSeekTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */