package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTCOP extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTCOP() {}
  
  public FrameBodyTCOP(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTCOP(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTCOP(FrameBodyTCOP paramFrameBodyTCOP) {
    super(paramFrameBodyTCOP);
  }
  
  public String getIdentifier() {
    return "TCOP";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTCOP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */