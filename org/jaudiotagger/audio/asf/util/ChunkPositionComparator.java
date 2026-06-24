package org.jaudiotagger.audio.asf.util;

import java.io.Serializable;
import java.util.Comparator;
import org.jaudiotagger.audio.asf.data.Chunk;

public final class ChunkPositionComparator implements Comparator<Chunk>, Serializable {
  private static final long serialVersionUID = -6337108235272376289L;
  
  public int compare(Chunk paramChunk1, Chunk paramChunk2) {
    return Long.valueOf(paramChunk1.getPosition()).compareTo(Long.valueOf(paramChunk2.getPosition()));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\as\\util\ChunkPositionComparator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */