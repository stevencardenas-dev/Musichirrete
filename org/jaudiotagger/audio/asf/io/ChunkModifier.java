package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.io.OutputStream;
import org.jaudiotagger.audio.asf.data.GUID;

public interface ChunkModifier {
  boolean isApplicable(GUID paramGUID);
  
  ModificationResult modify(GUID paramGUID, InputStream paramInputStream, OutputStream paramOutputStream);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\ChunkModifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */