package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTDLY extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTDLY() {}
  
  public FrameBodyTDLY(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTDLY(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTDLY(FrameBodyTDLY paramFrameBodyTDLY) {
    super(paramFrameBodyTDLY);
  }
  
  public String getIdentifier() {
    return "TDLY";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTDLY.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */