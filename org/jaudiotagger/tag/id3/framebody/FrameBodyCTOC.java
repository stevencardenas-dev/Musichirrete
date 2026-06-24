package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;

public class FrameBodyCTOC extends AbstractID3v2FrameBody implements ID3v2ChapterFrameBody, ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyCTOC() {}
  
  public FrameBodyCTOC(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyCTOC(FrameBodyCTOC paramFrameBodyCTOC) {
    super(paramFrameBodyCTOC);
  }
  
  public String getIdentifier() {
    return "CTOC";
  }
  
  public void setupObjectList() {
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyCTOC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */