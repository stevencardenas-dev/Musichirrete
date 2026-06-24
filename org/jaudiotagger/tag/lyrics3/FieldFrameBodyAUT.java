package org.jaudiotagger.tag.lyrics3;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.StringSizeTerminated;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public class FieldFrameBodyAUT extends AbstractLyrics3v2FieldFrameBody {
  public FieldFrameBodyAUT() {}
  
  public FieldFrameBodyAUT(String paramString) {
    setObjectValue("Author", paramString);
  }
  
  public FieldFrameBodyAUT(ByteBuffer paramByteBuffer) {
    read(paramByteBuffer);
  }
  
  public FieldFrameBodyAUT(FieldFrameBodyAUT paramFieldFrameBodyAUT) {
    super(paramFieldFrameBodyAUT);
  }
  
  public String getAuthor() {
    return (String)getObjectValue("Author");
  }
  
  public String getIdentifier() {
    return "AUT";
  }
  
  public void setAuthor(String paramString) {
    setObjectValue("Author", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringSizeTerminated(hrSTyFuSIm.hAVFQUjL, this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\FieldFrameBodyAUT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */