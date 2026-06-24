package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTSIZ extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
  public FrameBodyTSIZ() {}
  
  public FrameBodyTSIZ(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTSIZ(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTSIZ(FrameBodyTSIZ paramFrameBodyTSIZ) {
    super(paramFrameBodyTSIZ);
  }
  
  public String getIdentifier() {
    return "TSIZ";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTSIZ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */