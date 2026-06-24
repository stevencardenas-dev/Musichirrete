package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTSOT extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTSOT() {}
  
  public FrameBodyTSOT(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTSOT(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTSOT(FrameBodyTSOT paramFrameBodyTSOT) {
    super(paramFrameBodyTSOT);
  }
  
  public String getIdentifier() {
    return "TSOT";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTSOT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */