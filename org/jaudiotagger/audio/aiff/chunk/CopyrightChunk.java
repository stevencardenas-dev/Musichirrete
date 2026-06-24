package org.jaudiotagger.audio.aiff.chunk;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.aiff.AiffAudioHeader;
import org.jaudiotagger.audio.iff.ChunkHeader;

public class CopyrightChunk extends TextChunk {
  public CopyrightChunk(ChunkHeader paramChunkHeader, ByteBuffer paramByteBuffer, AiffAudioHeader paramAiffAudioHeader) {
    super(paramChunkHeader, paramByteBuffer, paramAiffAudioHeader);
  }
  
  public boolean readChunk() {
    this.aiffAudioHeader.setCopyright(readChunkText());
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\CopyrightChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */