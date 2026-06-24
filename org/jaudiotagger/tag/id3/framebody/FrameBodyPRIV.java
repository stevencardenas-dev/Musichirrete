package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.StringNullTerminated;

public class FrameBodyPRIV extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public FrameBodyPRIV() {
    setObjectValue("Owner", "");
    setObjectValue("Data", new byte[0]);
  }
  
  public FrameBodyPRIV(String paramString, byte[] paramArrayOfbyte) {
    setObjectValue("Owner", paramString);
    setObjectValue("Data", paramArrayOfbyte);
  }
  
  public FrameBodyPRIV(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyPRIV(FrameBodyPRIV paramFrameBodyPRIV) {
    super(paramFrameBodyPRIV);
  }
  
  public byte[] getData() {
    return (byte[])getObjectValue("Data");
  }
  
  public String getIdentifier() {
    return "PRIV";
  }
  
  public String getOwner() {
    return (String)getObjectValue("Owner");
  }
  
  public void setData(byte[] paramArrayOfbyte) {
    setObjectValue("Data", paramArrayOfbyte);
  }
  
  public void setOwner(String paramString) {
    setObjectValue("Owner", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringNullTerminated("Owner", this));
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyPRIV.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */