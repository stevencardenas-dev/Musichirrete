package org.jaudiotagger.audio.aiff.chunk;

import java.nio.ByteBuffer;
import mk;
import org.jaudiotagger.audio.aiff.AiffAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;

public abstract class TextChunk extends Chunk {
  protected final AiffAudioHeader aiffAudioHeader;
  
  public TextChunk(ChunkHeader paramChunkHeader, ByteBuffer paramByteBuffer, AiffAudioHeader paramAiffAudioHeader) {
    super(paramByteBuffer, paramChunkHeader);
    this.aiffAudioHeader = paramAiffAudioHeader;
  }
  
  public String readChunkText() {
    ByteBuffer byteBuffer = this.chunkData;
    return Utils.getString(byteBuffer, 0, byteBuffer.remaining(), mk.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\TextChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */