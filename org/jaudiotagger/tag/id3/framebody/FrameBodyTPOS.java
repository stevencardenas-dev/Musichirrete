package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public class FrameBodyTPOS extends AbstractFrameBodyNumberTotal implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTPOS() {}
  
  public FrameBodyTPOS(byte paramByte, Integer paramInteger1, Integer paramInteger2) {
    super(paramByte, paramInteger1, paramInteger2);
  }
  
  public FrameBodyTPOS(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTPOS(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTPOS(FrameBodyTPOS paramFrameBodyTPOS) {
    super(paramFrameBodyTPOS);
  }
  
  public Integer getDiscNo() {
    return getNumber();
  }
  
  public String getDiscNoAsText() {
    return getNumberAsText();
  }
  
  public Integer getDiscTotal() {
    return getTotal();
  }
  
  public String getDiscTotalAsText() {
    return getTotalAsText();
  }
  
  public String getIdentifier() {
    return uvJYmft.UxmMecRjIK;
  }
  
  public void setDiscNo(Integer paramInteger) {
    setNumber(paramInteger);
  }
  
  public void setDiscNo(String paramString) {
    setNumber(paramString);
  }
  
  public void setDiscTotal(Integer paramInteger) {
    setTotal(paramInteger);
  }
  
  public void setDiscTotal(String paramString) {
    setTotal(paramString);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTPOS.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */