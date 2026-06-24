package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTSSE extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTSSE() {}
  
  public FrameBodyTSSE(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTSSE(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTSSE(FrameBodyTSSE paramFrameBodyTSSE) {
    super(paramFrameBodyTSSE);
  }
  
  public String getIdentifier() {
    return "TSSE";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTSSE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */