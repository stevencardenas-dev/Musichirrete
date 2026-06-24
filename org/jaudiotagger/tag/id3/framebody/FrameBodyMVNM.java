package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyMVNM extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyMVNM() {}
  
  public FrameBodyMVNM(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyMVNM(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyMVNM(FrameBodyMVNM paramFrameBodyMVNM) {
    super(paramFrameBodyMVNM);
  }
  
  public String getIdentifier() {
    return "MVNM";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyMVNM.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */