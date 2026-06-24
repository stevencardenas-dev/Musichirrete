package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTDTG extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
  public FrameBodyTDTG() {}
  
  public FrameBodyTDTG(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTDTG(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTDTG(FrameBodyTDTG paramFrameBodyTDTG) {
    super(paramFrameBodyTDTG);
  }
  
  public String getIdentifier() {
    return "TDTG";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTDTG.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */