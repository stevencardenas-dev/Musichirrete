package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.NumberFixedLength;
import org.jaudiotagger.tag.datatype.StringNullTerminated;

public class FrameBodyAENC extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyAENC() {
    setObjectValue("Owner", "");
    Short short_ = Short.valueOf((short)0);
    setObjectValue("PreviewStart", short_);
    setObjectValue("PreviewLength", short_);
    setObjectValue("EncryptionInfo", new byte[0]);
  }
  
  public FrameBodyAENC(String paramString, short paramShort1, short paramShort2, byte[] paramArrayOfbyte) {
    setObjectValue("Owner", paramString);
    setObjectValue("PreviewStart", Short.valueOf(paramShort1));
    setObjectValue("PreviewLength", Short.valueOf(paramShort2));
    setObjectValue("EncryptionInfo", paramArrayOfbyte);
  }
  
  public FrameBodyAENC(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyAENC(FrameBodyAENC paramFrameBodyAENC) {
    super(paramFrameBodyAENC);
  }
  
  public String getIdentifier() {
    return "AENC";
  }
  
  public String getOwner() {
    return (String)getObjectValue("Owner");
  }
  
  public void getOwner(String paramString) {
    setObjectValue("Owner", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringNullTerminated(uvJYmft.WwQiMudxTxK, this));
    this.objectList.add(new NumberFixedLength("PreviewStart", this, 2));
    this.objectList.add(new NumberFixedLength("PreviewLength", this, 2));
    this.objectList.add(new ByteArraySizeTerminated("EncryptionInfo", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyAENC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */