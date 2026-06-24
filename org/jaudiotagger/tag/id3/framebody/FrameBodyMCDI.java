package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;

public class FrameBodyMCDI extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyMCDI() {
    setObjectValue("Data", new byte[0]);
  }
  
  public FrameBodyMCDI(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyMCDI(FrameBodyMCDI paramFrameBodyMCDI) {
    super(paramFrameBodyMCDI);
  }
  
  public FrameBodyMCDI(byte[] paramArrayOfbyte) {
    setObjectValue("Data", paramArrayOfbyte);
  }
  
  public String getIdentifier() {
    return "MCDI";
  }
  
  public void setupObjectList() {
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyMCDI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */