package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTSRC extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTSRC() {}
  
  public FrameBodyTSRC(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTSRC(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTSRC(FrameBodyTSRC paramFrameBodyTSRC) {
    super(paramFrameBodyTSRC);
  }
  
  public String getIdentifier() {
    return "TSRC";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTSRC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */