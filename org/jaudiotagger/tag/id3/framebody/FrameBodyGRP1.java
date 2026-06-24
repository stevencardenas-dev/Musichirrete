package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyGRP1 extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyGRP1() {}
  
  public FrameBodyGRP1(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyGRP1(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyGRP1(FrameBodyGRP1 paramFrameBodyGRP1) {
    super(paramFrameBodyGRP1);
  }
  
  public String getIdentifier() {
    return "GRP1";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyGRP1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */