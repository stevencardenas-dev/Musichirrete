package org.jaudiotagger.audio.aiff.chunk;

import java.nio.ByteBuffer;
import java.util.Date;
import mk;
import org.jaudiotagger.audio.aiff.AiffAudioHeader;
import org.jaudiotagger.audio.aiff.AiffUtil;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.Chunk;
import org.jaudiotagger.audio.iff.ChunkHeader;

public class CommentsChunk extends Chunk {
  private AiffAudioHeader aiffHeader;
  
  public CommentsChunk(ChunkHeader paramChunkHeader, ByteBuffer paramByteBuffer, AiffAudioHeader paramAiffAudioHeader) {
    super(paramByteBuffer, paramChunkHeader);
    this.aiffHeader = paramAiffAudioHeader;
  }
  
  public boolean readChunk() {
    int i = Utils.u(this.chunkData.getShort());
    for (byte b = 0; b < i; b++) {
      Date date = AiffUtil.timestampToDate(Utils.u(this.chunkData.getInt()));
      Utils.u(this.chunkData.getShort());
      int j = Utils.u(this.chunkData.getShort());
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(Utils.getString(this.chunkData, 0, j, mk.b));
      stringBuilder.append(" ");
      stringBuilder.append(AiffUtil.formatDate(date));
      String str = stringBuilder.toString();
      if (j % 2 != 0 && this.chunkData.position() < this.chunkData.limit())
        this.chunkData.get(); 
      this.aiffHeader.addComment(str);
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\CommentsChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */