package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;

public class FrameBodyRVA2 extends AbstractID3v2FrameBody implements ID3v24FrameBody {
  public FrameBodyRVA2() {}
  
  public FrameBodyRVA2(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyRVA2(FrameBodyRVA2 paramFrameBodyRVA2) {
    super(paramFrameBodyRVA2);
  }
  
  public FrameBodyRVA2(FrameBodyRVAD paramFrameBodyRVAD) {
    setObjectValue("Data", paramFrameBodyRVAD.getObjectValue("Data"));
  }
  
  public String getIdentifier() {
    return "RVA2";
  }
  
  public void setupObjectList() {
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyRVA2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */