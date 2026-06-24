package org.jaudiotagger.audio.asf.io;

import java.io.OutputStream;
import org.jaudiotagger.audio.asf.data.GUID;

public interface WriteableChunk {
  long getCurrentAsfChunkSize();
  
  GUID getGuid();
  
  boolean isEmpty();
  
  long writeInto(OutputStream paramOutputStream);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\WriteableChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */