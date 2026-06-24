package org.jaudiotagger.tag.id3.framebody;

import in.krosbits.utils.SgV.YbNJ;
import java.nio.ByteBuffer;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.tag.datatype.NumberFixedLength;

public class FrameBodyRVRB extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyRVRB() {}
  
  public FrameBodyRVRB(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyRVRB(FrameBodyRVRB paramFrameBodyRVRB) {
    super(paramFrameBodyRVRB);
  }
  
  public FrameBodyRVRB(short paramShort1, short paramShort2, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8) {
    setObjectValue("ReverbLeft", Short.valueOf(paramShort1));
    setObjectValue(YbNJ.mbXtgo, Short.valueOf(paramShort2));
    setObjectValue("ReverbBounceLeft", Byte.valueOf(paramByte1));
    setObjectValue("ReverbBounceRight", Byte.valueOf(paramByte2));
    setObjectValue("ReverbFeedbackLeftToLeft", Byte.valueOf(paramByte3));
    setObjectValue("ReverbFeedbackLeftToRight", Byte.valueOf(paramByte4));
    setObjectValue("ReverbFeedbackRightToRight", Byte.valueOf(paramByte5));
    setObjectValue(PwbbJfsdcHrAjW.JbsBu, Byte.valueOf(paramByte6));
    setObjectValue("PremixLeftToRight", Byte.valueOf(paramByte7));
    setObjectValue("PremixRightToLeft", Byte.valueOf(paramByte8));
  }
  
  public String getIdentifier() {
    return "RVRB";
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberFixedLength("ReverbLeft", this, 2));
    this.objectList.add(new NumberFixedLength("ReverbRight", this, 2));
    this.objectList.add(new NumberFixedLength("ReverbBounceLeft", this, 1));
    this.objectList.add(new NumberFixedLength("ReverbBounceRight", this, 1));
    this.objectList.add(new NumberFixedLength("ReverbFeedbackLeftToLeft", this, 1));
    this.objectList.add(new NumberFixedLength(CKYHNesT.SletImXyGQ, this, 1));
    this.objectList.add(new NumberFixedLength("ReverbFeedbackRightToRight", this, 1));
    this.objectList.add(new NumberFixedLength("ReverbFeedbackRightToLeft", this, 1));
    this.objectList.add(new NumberFixedLength("PremixLeftToRight", this, 1));
    this.objectList.add(new NumberFixedLength("PremixRightToLeft", this, 1));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyRVRB.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */