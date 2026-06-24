package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.PartOfSet;

public class FrameBodyTRCK extends AbstractFrameBodyNumberTotal implements ID3v23FrameBody, ID3v24FrameBody {
  public FrameBodyTRCK() {}
  
  public FrameBodyTRCK(byte paramByte, Integer paramInteger1, Integer paramInteger2) {
    super(paramByte, paramInteger1, paramInteger2);
  }
  
  public FrameBodyTRCK(byte paramByte, String paramString) {
    super(paramByte, paramString);
  }
  
  public FrameBodyTRCK(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyTRCK(FrameBodyTRCK paramFrameBodyTRCK) {
    super(paramFrameBodyTRCK);
  }
  
  public String getIdentifier() {
    return "TRCK";
  }
  
  public Integer getTrackNo() {
    return getNumber();
  }
  
  public String getTrackNoAsText() {
    return getNumberAsText();
  }
  
  public Integer getTrackTotal() {
    return getTotal();
  }
  
  public String getTrackTotalAsText() {
    return getTotalAsText();
  }
  
  public void setText(String paramString) {
    setObjectValue("Text", new PartOfSet.PartOfSetValue(paramString));
  }
  
  public void setTrackNo(Integer paramInteger) {
    setNumber(paramInteger);
  }
  
  public void setTrackNo(String paramString) {
    setNumber(paramString);
  }
  
  public void setTrackTotal(Integer paramInteger) {
    setTotal(paramInteger);
  }
  
  public void setTrackTotal(String paramString) {
    setTotal(paramString);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyTRCK.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */