package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTDRL extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
  public FrameBodyTDRL() {}
  
  public FrameBodyTDRL(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTDRL(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTDRL(FrameBodyTDRL paramFrameBodyTDRL) {
    super(paramFrameBodyTDRL);
  }
  
  public String getIdentifier() {
    return "TDRL";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTDRL.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */