package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTMED extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTMED() {}
  
  public FrameBodyTMED(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTMED(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTMED(FrameBodyTMED paramFrameBodyTMED) {
    super(paramFrameBodyTMED);
  }
  
  public String getIdentifier() {
    return "TMED";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTMED.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */