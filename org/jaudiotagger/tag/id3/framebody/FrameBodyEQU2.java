package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;

public class FrameBodyEQU2 extends AbstractID3v2FrameBody implements ID3v24FrameBody {
  public FrameBodyEQU2() {}
  
  public FrameBodyEQU2(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyEQU2(FrameBodyEQU2 paramFrameBodyEQU2) {
    super(paramFrameBodyEQU2);
  }
  
  public String getIdentifier() {
    return "EQU2";
  }
  
  public void setupObjectList() {
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyEQU2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */