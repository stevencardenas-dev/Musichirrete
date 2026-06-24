package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyWOAS extends AbstractFrameBodyUrlLink implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyWOAS() {}
  
  public FrameBodyWOAS(String paramString) {
    super(paramString);
  }
  
  public FrameBodyWOAS(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyWOAS(FrameBodyWOAS paramFrameBodyWOAS) {
    super(paramFrameBodyWOAS);
  }
  
  public String getIdentifier() {
    return "WOAS";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyWOAS.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */