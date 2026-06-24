package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTDOR extends AbstractFrameBodyTextInfo implements ID3v24FrameBody {
  public FrameBodyTDOR() {}
  
  public FrameBodyTDOR(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTDOR(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTDOR(FrameBodyTDOR paramFrameBodyTDOR) {
    super(paramFrameBodyTDOR);
  }
  
  public FrameBodyTDOR(FrameBodyTORY paramFrameBodyTORY) {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Text", paramFrameBodyTORY.getText());
  }
  
  public String getIdentifier() {
    return "TDOR";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTDOR.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */