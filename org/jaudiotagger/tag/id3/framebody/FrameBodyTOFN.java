package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTOFN extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTOFN() {}
  
  public FrameBodyTOFN(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTOFN(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTOFN(FrameBodyTOFN paramFrameBodyTOFN) {
    super(paramFrameBodyTOFN);
  }
  
  public String getIdentifier() {
    return "TOFN";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTOFN.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */