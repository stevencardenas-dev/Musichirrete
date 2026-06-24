package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;

public class FrameBodyTFLT extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyTFLT() {}
  
  public FrameBodyTFLT(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTFLT(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTFLT(FrameBodyTFLT paramFrameBodyTFLT) {
    super(paramFrameBodyTFLT);
  }
  
  public String getIdentifier() {
    return PwbbJfsdcHrAjW.fiKqlrBKfu;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTFLT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */