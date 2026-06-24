package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTPUB extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTPUB() {}
  
  public FrameBodyTPUB(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTPUB(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTPUB(FrameBodyTPUB paramFrameBodyTPUB) {
    super(paramFrameBodyTPUB);
  }
  
  public String getIdentifier() {
    return "TPUB";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTPUB.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */