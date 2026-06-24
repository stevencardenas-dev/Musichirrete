package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTLEN extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTLEN() {}
  
  public FrameBodyTLEN(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTLEN(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTLEN(FrameBodyTLEN paramFrameBodyTLEN) {
    super(paramFrameBodyTLEN);
  }
  
  public String getIdentifier() {
    return "TLEN";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTLEN.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */