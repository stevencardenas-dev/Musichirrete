package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.math.BigInteger;
import org.jaudiotagger.audio.asf.data.Chunk;
import org.jaudiotagger.audio.asf.data.FileHeader;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

public class FileHeaderReader implements ChunkReader {
  private static final GUID[] APPLYING = new GUID[] { GUID.GUID_FILE };
  
  public boolean canFail() {
    return false;
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
  
  public Chunk read(GUID paramGUID, InputStream paramInputStream, long paramLong) {
    BigInteger bigInteger5 = Utils.readBig64(paramInputStream);
    paramInputStream.skip(16L);
    BigInteger bigInteger3 = Utils.readBig64(paramInputStream);
    BigInteger bigInteger4 = Utils.readBig64(paramInputStream);
    BigInteger bigInteger1 = Utils.readBig64(paramInputStream);
    BigInteger bigInteger2 = Utils.readBig64(paramInputStream);
    FileHeader fileHeader = new FileHeader(bigInteger5, bigInteger3, bigInteger4, bigInteger1, Utils.readBig64(paramInputStream), Utils.readBig64(paramInputStream), bigInteger2, Utils.readUINT32(paramInputStream), Utils.readUINT32(paramInputStream), Utils.readUINT32(paramInputStream), Utils.readUINT32(paramInputStream));
    fileHeader.setPosition(paramLong);
    return (Chunk)fileHeader;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\FileHeaderReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */