package org.jaudiotagger.audio.wav.chunk;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.generic.GenericAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;

public class WavFactChunk extends Chunk {
  private GenericAudioHeader info;
  
  private boolean isValid = false;
  
  public WavFactChunk(ByteBuffer paramByteBuffer, ChunkHeader paramChunkHeader, GenericAudioHeader paramGenericAudioHeader) {
    super(paramByteBuffer, paramChunkHeader);
    this.info = paramGenericAudioHeader;
  }
  
  public boolean readChunk() {
    this.info.setNoOfSamples(Long.valueOf(Utils.u(this.chunkData.getInt())));
    return true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Fact Chunk:\nIs valid?: ");
    stringBuilder.append(this.isValid);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\chunk\WavFactChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */