package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTBPM extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTBPM() {}
  
  public FrameBodyTBPM(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTBPM(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTBPM(FrameBodyTBPM paramFrameBodyTBPM) {
    super(paramFrameBodyTBPM);
  }
  
  public String getIdentifier() {
    return "TBPM";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTBPM.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */