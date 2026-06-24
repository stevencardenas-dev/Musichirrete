package org.jaudiotagger.tag.id3.framebody;

import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;

public class FrameBodyEQUA extends AbstractID3v2FrameBody implements ID3v23FrameBody {
  public FrameBodyEQUA() {}
  
  public FrameBodyEQUA(FrameBodyEQUA paramFrameBodyEQUA) {
    super(paramFrameBodyEQUA);
  }
  
  public String getIdentifier() {
    return CKYHNesT.FzQz;
  }
  
  public void setupObjectList() {
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyEQUA.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */