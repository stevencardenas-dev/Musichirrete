package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTSO2 extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTSO2() {}
  
  public FrameBodyTSO2(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTSO2(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTSO2(FrameBodyTSO2 paramFrameBodyTSO2) {
    super(paramFrameBodyTSO2);
  }
  
  public String getIdentifier() {
    return "TSO2";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTSO2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */