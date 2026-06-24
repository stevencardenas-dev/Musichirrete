package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTDEN extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
  public FrameBodyTDEN() {}
  
  public FrameBodyTDEN(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTDEN(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTDEN(FrameBodyTDEN paramFrameBodyTDEN) {
    super(paramFrameBodyTDEN);
  }
  
  public String getIdentifier() {
    return "TDEN";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTDEN.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */