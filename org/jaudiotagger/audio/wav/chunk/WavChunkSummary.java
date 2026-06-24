package org.jaudiotagger.audio.wav.chunk;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.iff.ChunkSummary;
import org.jaudiotagger.audio.wav.WavChunkType;
import org.jaudiotagger.tag.wav.WavTag;

public class WavChunkSummary {
  public static Logger logger;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.wav.chunk");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public static ChunkSummary getChunkBeforeFirstMetadataTag(WavTag paramWavTag) {
    long l = getStartLocationOfFirstMetadataChunk(paramWavTag);
    for (byte b = 0; b < paramWavTag.getChunkSummaryList().size(); b++) {
      if (((ChunkSummary)paramWavTag.getChunkSummaryList().get(b)).getFileStartLocation() == l)
        return paramWavTag.getChunkSummaryList().get(b - 1); 
    } 
    return null;
  }
  
  public static long getStartLocationOfFirstMetadataChunk(WavTag paramWavTag) {
    return (paramWavTag.getMetadataChunkSummaryList().size() > 0) ? ((ChunkSummary)paramWavTag.getMetadataChunkSummaryList().get(0)).getFileStartLocation() : -1L;
  }
  
  public static boolean isOnlyMetadataTagsAfterStartingMetadataTag(WavTag paramWavTag) {
    long l = getStartLocationOfFirstMetadataChunk(paramWavTag);
    if (l == -1L) {
      logger.severe("Unable to find any metadata tags !");
      return false;
    } 
    Iterator<ChunkSummary> iterator = paramWavTag.getChunkSummaryList().iterator();
    boolean bool = false;
    while (iterator.hasNext()) {
      ChunkSummary chunkSummary = iterator.next();
      if (bool) {
        if (!chunkSummary.getChunkId().equals(WavChunkType.ID3.getCode()) && !chunkSummary.getChunkId().equals(WavChunkType.ID3_UPPERCASE.getCode()) && !chunkSummary.getChunkId().equals(WavChunkType.LIST.getCode()) && !chunkSummary.getChunkId().equals(WavChunkType.INFO.getCode()))
          return false; 
        continue;
      } 
      if (chunkSummary.getFileStartLocation() == l)
        bool = true; 
    } 
    return (bool == true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\chunk\WavChunkSummary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */