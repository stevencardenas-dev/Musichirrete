package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTIME extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
  private boolean hoursOnly;
  
  public FrameBodyTIME() {}
  
  public FrameBodyTIME(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTIME(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTIME(FrameBodyTIME paramFrameBodyTIME) {
    super(paramFrameBodyTIME);
  }
  
  public String getIdentifier() {
    return "TIME";
  }
  
  public boolean isHoursOnly() {
    return this.hoursOnly;
  }
  
  public void setHoursOnly(boolean paramBoolean) {
    this.hoursOnly = paramBoolean;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTIME.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */