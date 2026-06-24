package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.NumberHashMap;
import org.jaudiotagger.tag.datatype.NumberVariableLength;

public class FrameBodyPOSS extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyPOSS() {}
  
  public FrameBodyPOSS(byte paramByte, long paramLong) {
    setObjectValue("TimeStampFormat", Byte.valueOf(paramByte));
    setObjectValue("Position", Long.valueOf(paramLong));
  }
  
  public FrameBodyPOSS(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyPOSS(FrameBodyPOSS paramFrameBodyPOSS) {
    super(paramFrameBodyPOSS);
  }
  
  public String getIdentifier() {
    return "POSS";
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberHashMap("TimeStampFormat", this, 1));
    this.objectList.add(new NumberVariableLength("Position", this, 1));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyPOSS.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */