package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyXSOA extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
  public FrameBodyXSOA() {}
  
  public FrameBodyXSOA(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyXSOA(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyXSOA(FrameBodyXSOA paramFrameBodyXSOA) {
    super(paramFrameBodyXSOA);
  }
  
  public String getIdentifier() {
    return "XSOA";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyXSOA.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */