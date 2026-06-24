package org.jaudiotagger.audio.aiff.chunk;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.aiff.AiffAudioHeader;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;

public class ApplicationChunk extends Chunk {
  private static final String SIGNATURE_PDOS = "pdos";
  
  private static final String SIGNATURE_STOC = "stoc";
  
  private AiffAudioHeader aiffHeader;
  
  public ApplicationChunk(ChunkHeader paramChunkHeader, ByteBuffer paramByteBuffer, AiffAudioHeader paramAiffAudioHeader) {
    super(paramByteBuffer, paramChunkHeader);
    this.aiffHeader = paramAiffAudioHeader;
  }
  
  public boolean readChunk() {
    String str2 = Utils.readFourBytesAsChars(this.chunkData);
    if ("stoc".equals(str2) || "pdos".equals(str2)) {
      String str = Utils.readPascalString(this.chunkData);
      AiffAudioHeader aiffAudioHeader1 = this.aiffHeader;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str2);
      stringBuilder1.append(": ");
      stringBuilder1.append(str);
      aiffAudioHeader1.addApplicationIdentifier(stringBuilder1.toString());
      return true;
    } 
    String str1 = null;
    AiffAudioHeader aiffAudioHeader = this.aiffHeader;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str2);
    stringBuilder.append(": ");
    stringBuilder.append(str1);
    aiffAudioHeader.addApplicationIdentifier(stringBuilder.toString());
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\ApplicationChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */