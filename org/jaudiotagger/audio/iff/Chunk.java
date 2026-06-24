package org.jaudiotagger.audio.iff;

import java.nio.ByteBuffer;

public abstract class Chunk {
  protected ByteBuffer chunkData;
  
  protected ChunkHeader chunkHeader;
  
  public Chunk(ByteBuffer paramByteBuffer, ChunkHeader paramChunkHeader) {
    this.chunkData = paramByteBuffer;
    this.chunkHeader = paramChunkHeader;
  }
  
  public abstract boolean readChunk();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\iff\Chunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */