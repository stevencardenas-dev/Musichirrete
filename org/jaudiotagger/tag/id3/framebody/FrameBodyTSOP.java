package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTSOP extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTSOP() {}
  
  public FrameBodyTSOP(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTSOP(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTSOP(FrameBodyTSOP paramFrameBodyTSOP) {
    super(paramFrameBodyTSOP);
  }
  
  public String getIdentifier() {
    return "TSOP";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTSOP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */