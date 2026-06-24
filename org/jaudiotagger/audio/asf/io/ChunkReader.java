package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.GUID;

public interface ChunkReader {
  boolean canFail();
  
  GUID[] getApplyingIds();
  
  Chunk read(GUID paramGUID, InputStream paramInputStream, long paramLong);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\ChunkReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */