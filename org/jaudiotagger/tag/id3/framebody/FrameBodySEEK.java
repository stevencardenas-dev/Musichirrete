package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.NumberFixedLength;

public class FrameBodySEEK extends AbstractID3v2FrameBody implements ID3v24FrameBody {
  public FrameBodySEEK() {}
  
  public FrameBodySEEK(int paramInt) {
    setObjectValue("Offset", Integer.valueOf(paramInt));
  }
  
  public FrameBodySEEK(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodySEEK(FrameBodySEEK paramFrameBodySEEK) {
    super(paramFrameBodySEEK);
  }
  
  public String getIdentifier() {
    return "ASPI";
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberFixedLength("Offset", this, 4));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodySEEK.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */