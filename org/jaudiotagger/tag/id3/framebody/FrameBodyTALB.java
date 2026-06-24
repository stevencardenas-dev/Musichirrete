package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTALB extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTALB() {}
  
  public FrameBodyTALB(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTALB(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTALB(FrameBodyTALB paramFrameBodyTALB) {
    super(paramFrameBodyTALB);
  }
  
  public String getIdentifier() {
    return "TALB";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTALB.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */