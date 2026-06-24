package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.StringNullTerminated;

public class FrameBodyUFID extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
  public static final String UFID_ID3TEST = "http://www.id3.org/dummy/ufid.html";
  
  public static final String UFID_MUSICBRAINZ = "http://musicbrainz.org";
  
  public FrameBodyUFID() {
    setOwner("");
    setUniqueIdentifier(new byte[0]);
  }
  
  public FrameBodyUFID(String paramString, byte[] paramArrayOfbyte) {
    setOwner(paramString);
    setUniqueIdentifier(paramArrayOfbyte);
  }
  
  public FrameBodyUFID(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyUFID(FrameBodyUFID paramFrameBodyUFID) {
    super(paramFrameBodyUFID);
  }
  
  public String getIdentifier() {
    return "UFID";
  }
  
  public String getOwner() {
    return (String)getObjectValue("Owner");
  }
  
  public byte[] getUniqueIdentifier() {
    return (byte[])getObjectValue("Data");
  }
  
  public void setOwner(String paramString) {
    setObjectValue("Owner", paramString);
  }
  
  public void setUniqueIdentifier(byte[] paramArrayOfbyte) {
    setObjectValue("Data", paramArrayOfbyte);
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringNullTerminated("Owner", this));
    this.objectList.add(new ByteArraySizeTerminated("Data", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyUFID.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */