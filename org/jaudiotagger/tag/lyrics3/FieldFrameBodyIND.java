package org.jaudiotagger.tag.lyrics3;

import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.BooleanString;

public class FieldFrameBodyIND extends AbstractLyrics3v2FieldFrameBody {
  public FieldFrameBodyIND() {}
  
  public FieldFrameBodyIND(ByteBuffer paramByteBuffer) {
    read(paramByteBuffer);
  }
  
  public FieldFrameBodyIND(FieldFrameBodyIND paramFieldFrameBodyIND) {
    super(paramFieldFrameBodyIND);
  }
  
  public FieldFrameBodyIND(boolean paramBoolean1, boolean paramBoolean2) {
    setObjectValue("Lyrics Present", Boolean.valueOf(paramBoolean1));
    setObjectValue("Timestamp Present", Boolean.valueOf(paramBoolean2));
  }
  
  public String getAuthor() {
    return (String)getObjectValue("Author");
  }
  
  public String getIdentifier() {
    return "IND";
  }
  
  public void setAuthor(String paramString) {
    setObjectValue("Author", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new BooleanString("Lyrics Present", this));
    this.objectList.add(new BooleanString("Timestamp Present", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\FieldFrameBodyIND.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */