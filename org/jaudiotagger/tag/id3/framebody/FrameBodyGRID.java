package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.NumberFixedLength;
import org.jaudiotagger.tag.datatype.StringNullTerminated;

public class FrameBodyGRID extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyGRID() {}
  
  public FrameBodyGRID(String paramString, byte paramByte, byte[] paramArrayOfbyte) {
    setObjectValue("Owner", paramString);
    setObjectValue("GroupSymbol", Byte.valueOf(paramByte));
    setObjectValue("GroupData", paramArrayOfbyte);
  }
  
  public FrameBodyGRID(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyGRID(FrameBodyGRID paramFrameBodyGRID) {
    super(paramFrameBodyGRID);
  }
  
  public byte getGroupSymbol() {
    return (getObjectValue("GroupSymbol") != null) ? ((Long)getObjectValue("GroupSymbol")).byteValue() : 0;
  }
  
  public String getIdentifier() {
    return "GRID";
  }
  
  public String getOwner() {
    return (String)getObjectValue("Owner");
  }
  
  public void setGroupSymbol(byte paramByte) {
    setObjectValue("GroupSymbol", Byte.valueOf(paramByte));
  }
  
  public void setOwner(String paramString) {
    setObjectValue("Owner", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringNullTerminated("Owner", this));
    this.objectList.add(new NumberFixedLength("GroupSymbol", this, 1));
    this.objectList.add(new ByteArraySizeTerminated("GroupData", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyGRID.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */