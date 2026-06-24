package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTCOM extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTCOM() {}
  
  public FrameBodyTCOM(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTCOM(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTCOM(FrameBodyTCOM paramFrameBodyTCOM) {
    super(paramFrameBodyTCOM);
  }
  
  public String getIdentifier() {
    return "TCOM";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTCOM.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */