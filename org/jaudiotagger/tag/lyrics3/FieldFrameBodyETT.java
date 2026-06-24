package org.jaudiotagger.tag.lyrics3;

import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import java.nio.ByteBuffer;
import org.jaudiotagger.tag.datatype.StringSizeTerminated;

public class FieldFrameBodyETT extends AbstractLyrics3v2FieldFrameBody {
  public FieldFrameBodyETT() {}
  
  public FieldFrameBodyETT(String paramString) {
    setObjectValue("Title", paramString);
  }
  
  public FieldFrameBodyETT(ByteBuffer paramByteBuffer) {
    read(paramByteBuffer);
  }
  
  public FieldFrameBodyETT(FieldFrameBodyETT paramFieldFrameBodyETT) {
    super(paramFieldFrameBodyETT);
  }
  
  public String getIdentifier() {
    return "ETT";
  }
  
  public String getTitle() {
    return (String)getObjectValue(KjdXPYm.udbIdEA);
  }
  
  public void setTitle(String paramString) {
    setObjectValue("Title", paramString);
  }
  
  public void setupObjectList() {
    this.objectList.add(new StringSizeTerminated("Title", this));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\lyrics3\FieldFrameBodyETT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */