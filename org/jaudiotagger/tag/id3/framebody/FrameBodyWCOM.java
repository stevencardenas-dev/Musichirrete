package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyWCOM extends AbstractFrameBodyUrlLink implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyWCOM() {}
  
  public FrameBodyWCOM(String paramString) {
    super(paramString);
  }
  
  public FrameBodyWCOM(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyWCOM(FrameBodyWCOM paramFrameBodyWCOM) {
    super(paramFrameBodyWCOM);
  }
  
  public String getIdentifier() {
    return "WCOM";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyWCOM.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */