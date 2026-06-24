package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyWOAR extends AbstractFrameBodyUrlLink implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyWOAR() {}
  
  public FrameBodyWOAR(String paramString) {
    super(paramString);
  }
  
  public FrameBodyWOAR(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyWOAR(FrameBodyWOAR paramFrameBodyWOAR) {
    super(paramFrameBodyWOAR);
  }
  
  public String getIdentifier() {
    return "WOAR";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyWOAR.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */