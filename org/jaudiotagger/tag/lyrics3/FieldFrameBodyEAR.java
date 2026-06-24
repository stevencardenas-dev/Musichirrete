package org.jaudiotagger.tag.lyrics3;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.StringSizeTerminated;

public class FieldFrameBodyEAR extends AbstractLyrics3v2FieldFrameBody {
  public FieldFrameBodyEAR() {}
  
  public FieldFrameBodyEAR(String paramString) {
    setObjectValue("Artist", paramString);
  }
  
  public FieldFrameBodyEAR(ByteBuffer paramByteBuffer) {
    read(paramByteBuffer);
  }
  
  public FieldFrameBodyEAR(FieldFrameBodyEAR paramFieldFrameBodyEAR) {
    super(paramFieldFrameBodyEAR);
  }
  
  public String getArtist() {
    return (String)getObjectValue("Artist");
  }
  
  public String getIdentifier() {
    return "EAR";
  }
  
  public void setArtist(String paramString) {
    setObjectValue("Artist", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringSizeTerminated("Artist", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\FieldFrameBodyEAR.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */