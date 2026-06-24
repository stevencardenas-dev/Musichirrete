package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;

public class FrameBodyRVAD extends AbstractID3v2FrameBody implements ID3v23FrameBody {
  public FrameBodyRVAD() {}
  
  public FrameBodyRVAD(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyRVAD(FrameBodyRVA2 paramFrameBodyRVA2) {
    setObjectValue("Data", paramFrameBodyRVA2.getObjectValue("Data"));
  }
  
  public FrameBodyRVAD(FrameBodyRVAD paramFrameBodyRVAD) {
    super(paramFrameBodyRVAD);
  }
  
  public String getIdentifier() {
    return CKYHNesT.GczBqNApHmH;
  }
  
  public void setupObjectList() {
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyRVAD.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */