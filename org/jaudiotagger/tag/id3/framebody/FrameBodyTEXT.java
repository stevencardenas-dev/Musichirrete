package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTEXT extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTEXT() {}
  
  public FrameBodyTEXT(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTEXT(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTEXT(FrameBodyTEXT paramFrameBodyTEXT) {
    super(paramFrameBodyTEXT);
  }
  
  public String getIdentifier() {
    return "TEXT";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTEXT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */