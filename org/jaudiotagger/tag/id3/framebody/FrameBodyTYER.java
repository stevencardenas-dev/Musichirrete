package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTYER extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
  public FrameBodyTYER() {}
  
  public FrameBodyTYER(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTYER(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTYER(FrameBodyTDRC paramFrameBodyTDRC) {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Text", paramFrameBodyTDRC.getText());
  }
  
  public FrameBodyTYER(FrameBodyTYER paramFrameBodyTYER) {
    super(paramFrameBodyTYER);
  }
  
  public String getIdentifier() {
    return "TYER";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTYER.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */