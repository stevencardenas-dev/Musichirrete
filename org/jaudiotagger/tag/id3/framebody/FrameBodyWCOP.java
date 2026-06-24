package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyWCOP extends AbstractFrameBodyUrlLink implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyWCOP() {}
  
  public FrameBodyWCOP(String paramString) {
    super(paramString);
  }
  
  public FrameBodyWCOP(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyWCOP(FrameBodyWCOP paramFrameBodyWCOP) {
    super(paramFrameBodyWCOP);
  }
  
  public String getIdentifier() {
    return "WCOP";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyWCOP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */