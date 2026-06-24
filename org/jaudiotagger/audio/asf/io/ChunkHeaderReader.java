package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.math.BigInteger;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

final class ChunkHeaderReader implements ChunkReader {
  private static final GUID[] APPLYING = new GUID[] { GUID.GUID_UNSPECIFIED };
  
  private static final ChunkHeaderReader INSTANCE = new ChunkHeaderReader();
  
  public static ChunkHeaderReader getInstance() {
    return INSTANCE;
  }
  
  public boolean canFail() {
    return false;
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
  
  public Chunk read(GUID paramGUID, InputStream paramInputStream, long paramLong) {
    BigInteger bigInteger = Utils.readBig64(paramInputStream);
    paramInputStream.skip(bigInteger.longValue() - 24L);
    return new Chunk(paramGUID, paramLong, bigInteger);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\ChunkHeaderReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */