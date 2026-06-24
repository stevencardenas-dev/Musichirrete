package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.io.OutputStream;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

public class WriteableChunkModifer implements ChunkModifier {
  static final boolean $assertionsDisabled = false;
  
  private final WriteableChunk writableChunk;
  
  public WriteableChunkModifer(WriteableChunk paramWriteableChunk) {
    this.writableChunk = paramWriteableChunk;
  }
  
  public boolean isApplicable(GUID paramGUID) {
    return paramGUID.equals(this.writableChunk.getGuid());
  }
  
  public ModificationResult modify(GUID paramGUID, InputStream paramInputStream, OutputStream paramOutputStream) {
    long l1;
    boolean bool = this.writableChunk.isEmpty();
    byte b = 0;
    long l2 = 0L;
    if (!bool) {
      long l = this.writableChunk.writeInto(paramOutputStream);
      l1 = l;
      if (paramGUID == null) {
        b = 1;
        l1 = l;
      } 
    } else {
      l1 = 0L;
    } 
    int i = b;
    if (paramGUID != null) {
      i = b;
      if (this.writableChunk.isEmpty())
        i = b - 1; 
      l2 = Utils.readUINT64(paramInputStream);
      paramInputStream.skip(l2 - 24L);
    } 
    return new ModificationResult(i, l1 - l2, new GUID[] { paramGUID });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\WriteableChunkModifer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */