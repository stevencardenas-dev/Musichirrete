package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTPE2 extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTPE2() {}
  
  public FrameBodyTPE2(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTPE2(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTPE2(FrameBodyTPE2 paramFrameBodyTPE2) {
    super(paramFrameBodyTPE2);
  }
  
  public String getIdentifier() {
    return "TPE2";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTPE2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */