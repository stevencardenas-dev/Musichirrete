package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.NumberFixedLength;
import org.jaudiotagger.tag.datatype.StringNullTerminated;

public class FrameBodyCHAP extends AbstractID3v2FrameBody implements ID3v2ChapterFrameBody, ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyCHAP() {}
  
  public FrameBodyCHAP(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    setObjectValue("ElementID", paramString);
    setObjectValue("StartTime", Integer.valueOf(paramInt1));
    setObjectValue("EndTime", Integer.valueOf(paramInt2));
    setObjectValue("StartOffset", Integer.valueOf(paramInt3));
    setObjectValue("EndOffset", Integer.valueOf(paramInt4));
  }
  
  public FrameBodyCHAP(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyCHAP(FrameBodyCHAP paramFrameBodyCHAP) {
    super(paramFrameBodyCHAP);
  }
  
  public String getIdentifier() {
    return "CHAP";
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringNullTerminated("ElementID", this));
    this.objectList.add(new NumberFixedLength("StartTime", this, 4));
    this.objectList.add(new NumberFixedLength("EndTime", this, 4));
    this.objectList.add(new NumberFixedLength("StartOffset", this, 4));
    this.objectList.add(new NumberFixedLength("EndOffset", this, 4));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyCHAP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */