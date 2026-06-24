package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTORY extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
  private static final int NUMBER_OF_DIGITS_IN_YEAR = 4;
  
  public FrameBodyTORY() {}
  
  public FrameBodyTORY(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTORY(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTORY(FrameBodyTDOR paramFrameBodyTDOR) {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    String str = paramFrameBodyTDOR.getText();
    if (paramFrameBodyTDOR.getText().length() > 4)
      str = paramFrameBodyTDOR.getText().substring(0, 4); 
    setObjectValue("Text", str);
  }
  
  public FrameBodyTORY(FrameBodyTORY paramFrameBodyTORY) {
    super(paramFrameBodyTORY);
  }
  
  public String getIdentifier() {
    return "TORY";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTORY.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */