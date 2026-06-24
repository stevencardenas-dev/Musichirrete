package org.jaudiotagger.tag.asf;

import java.nio.charset.Charset;
import l0;
import org.jaudiotagger.audio.asf.data.AsfHeader;
import org.jaudiotagger.audio.asf.data.MetadataDescriptor;
import org.jaudiotagger.audio.asf.util.Utils;
import org.jaudiotagger.tag.TagTextField;

public class AsfTagTextField extends AsfTagField implements TagTextField {
  public AsfTagTextField(String paramString1, String paramString2) {
    super(paramString1);
    this.toWrap.setString(paramString2);
  }
  
  public AsfTagTextField(MetadataDescriptor paramMetadataDescriptor) {
    super(paramMetadataDescriptor);
    if (paramMetadataDescriptor.getType() != 1)
      return; 
    l0.l("Cannot interpret binary as string.");
    throw null;
  }
  
  public AsfTagTextField(AsfFieldKey paramAsfFieldKey, String paramString) {
    super(paramAsfFieldKey);
    this.toWrap.setString(paramString);
  }
  
  public String getContent() {
    return getDescriptor().getString();
  }
  
  public Charset getEncoding() {
    return AsfHeader.ASF_CHARSET;
  }
  
  public boolean isEmpty() {
    return Utils.isBlank(getContent());
  }
  
  public void setContent(String paramString) {
    getDescriptor().setString(paramString);
  }
  
  public void setEncoding(Charset paramCharset) {
    if (AsfHeader.ASF_CHARSET.equals(paramCharset))
      return; 
    l0.l("Only UTF-16LE is possible with ASF.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\asf\AsfTagTextField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */