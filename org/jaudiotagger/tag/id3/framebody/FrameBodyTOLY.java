package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTOLY extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTOLY() {}
  
  public FrameBodyTOLY(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTOLY(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTOLY(FrameBodyTOLY paramFrameBodyTOLY) {
    super(paramFrameBodyTOLY);
  }
  
  public String getIdentifier() {
    return "TOLY";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTOLY.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */