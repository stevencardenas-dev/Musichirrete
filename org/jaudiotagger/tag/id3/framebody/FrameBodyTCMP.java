package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTCMP extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
  static String IS_COMPILATION = "1\000";
  
  public FrameBodyTCMP() {
    setObjectValue("TextEncoding", Byte.valueOf((byte)0));
    setObjectValue("Text", IS_COMPILATION);
  }
  
  public FrameBodyTCMP(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTCMP(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTCMP(FrameBodyTCMP paramFrameBodyTCMP) {
    super(paramFrameBodyTCMP);
  }
  
  public String getIdentifier() {
    return "TCMP";
  }
  
  public boolean isCompilation() {
    return getText().equals(IS_COMPILATION);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTCMP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */