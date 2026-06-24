package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTOAL extends AbstractFrameBodyTextInfo implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTOAL() {}
  
  public FrameBodyTOAL(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTOAL(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTOAL(FrameBodyTOAL paramFrameBodyTOAL) {
    super(paramFrameBodyTOAL);
  }
  
  public String getIdentifier() {
    return "TOAL";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTOAL.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */