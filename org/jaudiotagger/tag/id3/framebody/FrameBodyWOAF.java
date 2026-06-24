package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyWOAF extends AbstractFrameBodyUrlLink implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyWOAF() {}
  
  public FrameBodyWOAF(String paramString) {
    super(paramString);
  }
  
  public FrameBodyWOAF(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyWOAF(FrameBodyWOAF paramFrameBodyWOAF) {
    super(paramFrameBodyWOAF);
  }
  
  public String getIdentifier() {
    return "WOAF";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyWOAF.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */