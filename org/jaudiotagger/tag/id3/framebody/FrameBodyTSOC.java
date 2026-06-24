package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTSOC extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTSOC() {}
  
  public FrameBodyTSOC(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTSOC(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTSOC(FrameBodyTSOC paramFrameBodyTSOC) {
    super(paramFrameBodyTSOC);
  }
  
  public String getIdentifier() {
    return "TSOC";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTSOC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */