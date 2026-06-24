package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyWPAY extends AbstractFrameBodyUrlLink implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyWPAY() {}
  
  public FrameBodyWPAY(String paramString) {
    super(paramString);
  }
  
  public FrameBodyWPAY(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyWPAY(FrameBodyWPAY paramFrameBodyWPAY) {
    super(paramFrameBodyWPAY);
  }
  
  public String getIdentifier() {
    return "WPAY";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyWPAY.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */