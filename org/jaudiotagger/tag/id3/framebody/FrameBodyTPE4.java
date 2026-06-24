package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTPE4 extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTPE4() {}
  
  public FrameBodyTPE4(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTPE4(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTPE4(FrameBodyTPE4 paramFrameBodyTPE4) {
    super(paramFrameBodyTPE4);
  }
  
  public String getIdentifier() {
    return "TPE4";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTPE4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */