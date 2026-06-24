package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTSST extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTSST() {}
  
  public FrameBodyTSST(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTSST(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTSST(FrameBodyTSST paramFrameBodyTSST) {
    super(paramFrameBodyTSST);
  }
  
  public String getIdentifier() {
    return "TSST";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTSST.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */