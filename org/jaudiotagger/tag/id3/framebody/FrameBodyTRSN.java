package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTRSN extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTRSN() {}
  
  public FrameBodyTRSN(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTRSN(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTRSN(FrameBodyTRSN paramFrameBodyTRSN) {
    super(paramFrameBodyTRSN);
  }
  
  public String getIdentifier() {
    return "TRSN";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTRSN.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */