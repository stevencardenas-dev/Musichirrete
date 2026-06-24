package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyWORS extends AbstractFrameBodyUrlLink implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyWORS() {}
  
  public FrameBodyWORS(String paramString) {
    super(paramString);
  }
  
  public FrameBodyWORS(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyWORS(FrameBodyWORS paramFrameBodyWORS) {
    super(paramFrameBodyWORS);
  }
  
  public String getIdentifier() {
    return "WORS";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyWORS.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */