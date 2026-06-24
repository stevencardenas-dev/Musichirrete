package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyWPUB extends AbstractFrameBodyUrlLink implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyWPUB() {}
  
  public FrameBodyWPUB(String paramString) {
    super(paramString);
  }
  
  public FrameBodyWPUB(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyWPUB(FrameBodyWPUB paramFrameBodyWPUB) {
    super(paramFrameBodyWPUB);
  }
  
  public String getIdentifier() {
    return "WPUB";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyWPUB.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */