package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;

public class FrameBodyTDAT extends AbstractFrameBodyTextInfo implements ID3v23FrameBody {
  public static final int DATA_SIZE = 4;
  
  public static final int DAY_END = 2;
  
  public static final int DAY_START = 0;
  
  public static final int MONTH_END = 4;
  
  public static final int MONTH_START = 2;
  
  private boolean monthOnly;
  
  public FrameBodyTDAT() {}
  
  public FrameBodyTDAT(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTDAT(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTDAT(FrameBodyTDAT paramFrameBodyTDAT) {
    super(paramFrameBodyTDAT);
  }
  
  public String getIdentifier() {
    return "TDAT";
  }
  
  public boolean isMonthOnly() {
    return this.monthOnly;
  }
  
  public void setMonthOnly(boolean paramBoolean) {
    this.monthOnly = paramBoolean;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTDAT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */