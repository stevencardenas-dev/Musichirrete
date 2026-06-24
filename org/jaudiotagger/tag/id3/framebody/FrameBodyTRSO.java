package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTRSO extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTRSO() {}
  
  public FrameBodyTRSO(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTRSO(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTRSO(FrameBodyTRSO paramFrameBodyTRSO) {
    super(paramFrameBodyTRSO);
  }
  
  public String getIdentifier() {
    return "TRSO";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTRSO.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */