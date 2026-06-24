package org.jaudiotagger.tag.lyrics3;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.StringSizeTerminated;

public class FieldFrameBodyEAL extends AbstractLyrics3v2FieldFrameBody {
  public FieldFrameBodyEAL() {}
  
  public FieldFrameBodyEAL(String paramString) {
    setObjectValue("Album", paramString);
  }
  
  public FieldFrameBodyEAL(ByteBuffer paramByteBuffer) {
    read(paramByteBuffer);
  }
  
  public FieldFrameBodyEAL(FieldFrameBodyEAL paramFieldFrameBodyEAL) {
    super(paramFieldFrameBodyEAL);
  }
  
  public String getAlbum() {
    return (String)getObjectValue("Album");
  }
  
  public String getIdentifier() {
    return "EAL";
  }
  
  public void setAlbum(String paramString) {
    setObjectValue("Album", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringSizeTerminated("Album", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\FieldFrameBodyEAL.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */