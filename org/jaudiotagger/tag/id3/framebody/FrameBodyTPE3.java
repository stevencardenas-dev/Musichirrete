package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTPE3 extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTPE3() {}
  
  public FrameBodyTPE3(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTPE3(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTPE3(FrameBodyTPE3 paramFrameBodyTPE3) {
    super(paramFrameBodyTPE3);
  }
  
  public String getIdentifier() {
    return "TPE3";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTPE3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */