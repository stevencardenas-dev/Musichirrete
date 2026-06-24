package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTIT3 extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTIT3() {}
  
  public FrameBodyTIT3(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTIT3(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTIT3(FrameBodyTIT3 paramFrameBodyTIT3) {
    super(paramFrameBodyTIT3);
  }
  
  public String getIdentifier() {
    return "TIT3";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTIT3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */