package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTPRO extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
  public FrameBodyTPRO() {}
  
  public FrameBodyTPRO(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTPRO(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTPRO(FrameBodyTPRO paramFrameBodyTPRO) {
    super(paramFrameBodyTPRO);
  }
  
  public String getIdentifier() {
    return "TPRO";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTPRO.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */