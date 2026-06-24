package org.jaudiotagger.tag.id3.framebody;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.ByteArraySizeTerminated;
import org.jaudiotagger.tag.datatype.StringNullTerminated;

public class FrameBodyCRM extends AbstractID3v2FrameBody implements ID3v22FrameBody {
  public FrameBodyCRM() {}
  
  public FrameBodyCRM(String paramString1, String paramString2, byte[] paramArrayOfbyte) {
    setObjectValue("Owner", paramString1);
    setObjectValue("Description", paramString2);
    setObjectValue("EncryptedDataBlock", paramArrayOfbyte);
  }
  
  public FrameBodyCRM(ByteBuffer paramByteBuffer, int paramInt) {
    super(paramByteBuffer, paramInt);
  }
  
  public FrameBodyCRM(FrameBodyCRM paramFrameBodyCRM) {
    super(paramFrameBodyCRM);
  }
  
  public String getIdentifier() {
    return "CRM";
  }
  
  public String getOwner() {
    return (String)getObjectValue("Owner");
  }
  
  public void getOwner(String paramString) {
    setObjectValue("Owner", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringNullTerminated("Owner", this));
    this.objectList.add(new StringNullTerminated("Description", this));
    this.objectList.add(new ByteArraySizeTerminated("EncryptedDataBlock", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\framebody\FrameBodyCRM.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */