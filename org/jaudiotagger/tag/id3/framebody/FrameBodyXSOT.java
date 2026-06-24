package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyXSOT extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
  public FrameBodyXSOT() {}
  
  public FrameBodyXSOT(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyXSOT(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyXSOT(FrameBodyXSOT paramFrameBodyXSOT) {
    super(paramFrameBodyXSOT);
  }
  
  public String getIdentifier() {
    return "XSOT";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyXSOT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */