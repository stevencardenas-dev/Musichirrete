package org.jaudiotagger.audio.aiff.chunk;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;

public class SoundChunk extends Chunk {
  public SoundChunk(ChunkHeader paramChunkHeader, ByteBuffer paramByteBuffer) {
    super(paramByteBuffer, paramChunkHeader);
  }
  
  public boolean readChunk() {
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\SoundChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */