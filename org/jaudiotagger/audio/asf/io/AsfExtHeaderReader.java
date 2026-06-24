package org.jaudiotagger.audio.asf.io;

import java.io.InputStream;
import java.math.BigInteger;
import java.util.List;
import org.jaudiotagger.audio.asf.data.AsfExtendedHeader;
import org.jaudiotagger.audio.asf.data.ChunkContainer;
import org.jaudiotagger.audio.asf.data.GUID;
import org.jaudiotagger.audio.asf.util.Utils;

public class AsfExtHeaderReader extends ChunkContainerReader<AsfExtendedHeader> {
  static final boolean $assertionsDisabled = false;
  
  private static final GUID[] APPLYING = new GUID[] { GUID.GUID_HEADER_EXTENSION };
  
  public AsfExtHeaderReader(List<Class<? extends ChunkReader>> paramList, boolean paramBoolean) {
    super(paramList, paramBoolean);
  }
  
  public boolean canFail() {
    return false;
  }
  
  public AsfExtendedHeader createContainer(long paramLong, BigInteger paramBigInteger, InputStream paramInputStream) {
    Utils.readGUID(paramInputStream);
    Utils.readUINT16(paramInputStream);
    Utils.readUINT32(paramInputStream);
    return new AsfExtendedHeader(paramLong, paramBigInteger);
  }
  
  public GUID[] getApplyingIds() {
    return (GUID[])APPLYING.clone();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\asf\io\AsfExtHeaderReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */