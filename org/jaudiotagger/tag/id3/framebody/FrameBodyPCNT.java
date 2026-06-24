package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.NumberVariableLength;

public class FrameBodyPCNT extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  private static final int COUNTER_MINIMUM_FIELD_SIZE = 4;
  
  public FrameBodyPCNT() {
    setObjectValue("Number", Long.valueOf(0L));
  }
  
  public FrameBodyPCNT(long paramLong) {
    setObjectValue("Number", Long.valueOf(paramLong));
  }
  
  public FrameBodyPCNT(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyPCNT(FrameBodyPCNT paramFrameBodyPCNT) {
    super(paramFrameBodyPCNT);
  }
  
  public long getCounter() {
    return ((Number)getObjectValue("Number")).longValue();
  }
  
  public String getIdentifier() {
    return "PCNT";
  }
  
  public void setCounter(long paramLong) {
    setObjectValue("Number", Long.valueOf(paramLong));
  }
  
  public void setupObjectList() {
    this.objectList.add(new NumberVariableLength("Number", this, 4));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyPCNT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */