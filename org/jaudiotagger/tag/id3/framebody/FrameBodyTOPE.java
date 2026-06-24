package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTOPE extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTOPE() {}
  
  public FrameBodyTOPE(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTOPE(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTOPE(FrameBodyTOPE paramFrameBodyTOPE) {
    super(paramFrameBodyTOPE);
  }
  
  public String getIdentifier() {
    return "TOPE";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTOPE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */