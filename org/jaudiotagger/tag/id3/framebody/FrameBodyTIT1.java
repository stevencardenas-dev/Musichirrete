package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTIT1 extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTIT1() {}
  
  public FrameBodyTIT1(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTIT1(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTIT1(FrameBodyTIT1 paramFrameBodyTIT1) {
    super(paramFrameBodyTIT1);
  }
  
  public String getIdentifier() {
    return "TIT1";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTIT1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */