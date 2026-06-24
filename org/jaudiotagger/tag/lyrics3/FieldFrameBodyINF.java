package org.jaudiotagger.tag.lyrics3;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.StringSizeTerminated;

public class FieldFrameBodyINF extends AbstractLyrics3v2FieldFrameBody {
  public FieldFrameBodyINF() {}
  
  public FieldFrameBodyINF(String paramString) {
    setObjectValue("Additional Information", paramString);
  }
  
  public FieldFrameBodyINF(ByteBuffer paramByteBuffer) {
    read(paramByteBuffer);
  }
  
  public FieldFrameBodyINF(FieldFrameBodyINF paramFieldFrameBodyINF) {
    super(paramFieldFrameBodyINF);
  }
  
  public String getAdditionalInformation() {
    return (String)getObjectValue("Additional Information");
  }
  
  public String getIdentifier() {
    return "INF";
  }
  
  public void setAdditionalInformation(String paramString) {
    setObjectValue("Additional Information", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringSizeTerminated("Additional Information", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\FieldFrameBodyINF.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */