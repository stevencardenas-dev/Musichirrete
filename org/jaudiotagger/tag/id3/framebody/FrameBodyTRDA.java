package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTRDA extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
  public FrameBodyTRDA() {}
  
  public FrameBodyTRDA(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTRDA(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTRDA(FrameBodyTRDA paramFrameBodyTRDA) {
    super(paramFrameBodyTRDA);
  }
  
  public String getIdentifier() {
    return "TRDA";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTRDA.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */