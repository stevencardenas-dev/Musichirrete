package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTOWN extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTOWN() {}
  
  public FrameBodyTOWN(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTOWN(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTOWN(FrameBodyTOWN paramFrameBodyTOWN) {
    super(paramFrameBodyTOWN);
  }
  
  public String getIdentifier() {
    return "TOWN";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTOWN.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */