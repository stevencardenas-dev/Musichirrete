package org.jaudiotagger.audio.aiff.chunk;

import java.util.Iterator;
import org.jaudiotagger.audio.iff.ChunkSummary;
import org.jaudiotagger.tag.aiff.AiffTag;

public class AiffChunkSummary {
  public static ChunkSummary getChunkBeforeStartingMetadataTag(AiffTag paramAiffTag) {
    for (byte b = 0; b < paramAiffTag.getChunkSummaryList().size(); b++) {
      if (((ChunkSummary)paramAiffTag.getChunkSummaryList().get(b)).getFileStartLocation() == paramAiffTag.getStartLocationInFileOfId3Chunk())
        return paramAiffTag.getChunkSummaryList().get(b - 1); 
    } 
    return null;
  }
  
  public static boolean isOnlyMetadataTagsAfterStartingMetadataTag(AiffTag paramAiffTag) {
    Iterator<ChunkSummary> iterator = paramAiffTag.getChunkSummaryList().iterator();
    boolean bool = false;
    while (iterator.hasNext()) {
      ChunkSummary chunkSummary = iterator.next();
      if (bool) {
        if (!chunkSummary.getChunkId().equals(AiffChunkType.TAG.getCode()))
          return false; 
        continue;
      } 
      if (chunkSummary.getFileStartLocation() == paramAiffTag.getStartLocationInFileOfId3Chunk())
        bool = true; 
    } 
    return (bool == true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\AiffChunkSummary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */