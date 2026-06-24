package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

public class ChunkRemover implements ChunkModifier {
  static final boolean $assertionsDisabled = false;
  
  private final Set<GUID> toRemove = new HashSet<GUID>();
  
  public ChunkRemover(GUID... paramVarArgs) {
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++) {
      GUID gUID = paramVarArgs[b];
      this.toRemove.add(gUID);
    } 
  }
  
  public boolean isApplicable(GUID paramGUID) {
    return this.toRemove.contains(paramGUID);
  }
  
  public ModificationResult modify(GUID paramGUID, InputStream paramInputStream, OutputStream paramOutputStream) {
    if (paramGUID == null)
      return new ModificationResult(0, 0L, new GUID[0]); 
    long l = Utils.readUINT64(paramInputStream);
    paramInputStream.skip(l - 24L);
    return new ModificationResult(-1, l * -1L, new GUID[] { paramGUID });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\ChunkRemover.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */