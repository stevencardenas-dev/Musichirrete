package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTSOA extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTSOA() {}
  
  public FrameBodyTSOA(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTSOA(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTSOA(FrameBodyTSOA paramFrameBodyTSOA) {
    super(paramFrameBodyTSOA);
  }
  
  public String getIdentifier() {
    return "TSOA";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTSOA.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */