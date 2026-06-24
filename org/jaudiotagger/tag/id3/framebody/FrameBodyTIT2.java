package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTIT2 extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTIT2() {}
  
  public FrameBodyTIT2(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTIT2(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTIT2(FrameBodyTIT2 paramFrameBodyTIT2) {
    super(paramFrameBodyTIT2);
  }
  
  public String getIdentifier() {
    return "TIT2";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTIT2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */