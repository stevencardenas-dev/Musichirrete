package org.jaudiotagger.audio.aiff.chunk;

import java.nio.ByteBuffer;
import java.util.Date;
import org.jaudiotagger.audio.aiff.AiffAudioHeader;
import org.jaudiotagger.audio.aiff.AiffUtil;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;

public class FormatVersionChunk extends Chunk {
  private AiffAudioHeader aiffHeader;
  
  public FormatVersionChunk(ChunkHeader paramChunkHeader, ByteBuffer paramByteBuffer, AiffAudioHeader paramAiffAudioHeader) {
    super(paramByteBuffer, paramChunkHeader);
    this.aiffHeader = paramAiffAudioHeader;
  }
  
  public boolean readChunk() {
    Date date = AiffUtil.timestampToDate(this.chunkData.getInt());
    this.aiffHeader.setTimestamp(date);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\FormatVersionChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */