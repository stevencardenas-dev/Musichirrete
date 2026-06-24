package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;

public class FrameBodyTPE1 extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTPE1() {}
  
  public FrameBodyTPE1(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTPE1(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTPE1(FrameBodyTPE1 paramFrameBodyTPE1) {
    super(paramFrameBodyTPE1);
  }
  
  public String getIdentifier() {
    return PwbbJfsdcHrAjW.nlAtdGoS;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTPE1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */