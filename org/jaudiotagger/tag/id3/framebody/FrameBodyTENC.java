package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTENC extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTENC() {}
  
  public FrameBodyTENC(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTENC(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTENC(FrameBodyTENC paramFrameBodyTENC) {
    super(paramFrameBodyTENC);
  }
  
  public String getIdentifier() {
    return "TENC";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTENC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */