package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.math.BigInteger;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.EncodingChunk;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

class EncodingChunkReader implements ChunkReader {
  private static final GUID[] APPLYING = new GUID[] { GUID.GUID_ENCODING };
  
  public boolean canFail() {
    return false;
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
  
  public Chunk read(GUID paramGUID, InputStream paramInputStream, long paramLong) {
    BigInteger bigInteger = Utils.readBig64(paramInputStream);
    EncodingChunk encodingChunk = new EncodingChunk(bigInteger);
    paramInputStream.skip(20L);
    int j = Utils.readUINT16(paramInputStream);
    int i = 46;
    for (byte b = 0; b < j; b++) {
      String str = Utils.readCharacterSizedString(paramInputStream);
      encodingChunk.addString(str);
      i += str.length() * 2 + 4;
    } 
    paramInputStream.skip(bigInteger.longValue() - i);
    encodingChunk.setPosition(paramLong);
    return (Chunk)encodingChunk;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\EncodingChunkReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */