package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTMOO extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
  public FrameBodyTMOO() {}
  
  public FrameBodyTMOO(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTMOO(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTMOO(FrameBodyTMOO paramFrameBodyTMOO) {
    super(paramFrameBodyTMOO);
  }
  
  public FrameBodyTMOO(FrameBodyTXXX paramFrameBodyTXXX) {
    setObjectValue("TextEncoding", Byte.valueOf(paramFrameBodyTXXX.getTextEncoding()));
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Text", paramFrameBodyTXXX.getText());
  }
  
  public String getIdentifier() {
    return "TMOO";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTMOO.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */