package org.jaudiotagger.tag.id3.framebody;

import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;

public class FrameBodyMLLT extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyMLLT() {}
  
  public FrameBodyMLLT(FrameBodyMLLT paramFrameBodyMLLT) {
    super(paramFrameBodyMLLT);
  }
  
  public String getIdentifier() {
    return "MLLT";
  }
  
  public void setupObjectList() {
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyMLLT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */