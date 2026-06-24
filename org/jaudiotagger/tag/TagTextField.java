package org.jaudiotagger.tag;

import java.nio.charset.Charset;

public interface TagTextField extends TagField {
  String getContent();
  
  Charset getEncoding();
  
  void setContent(String paramString);
  
  void setEncoding(Charset paramCharset);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\TagTextField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */