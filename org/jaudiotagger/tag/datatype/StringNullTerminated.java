package org.jaudiotagger.tag.datatype;

import java.nio.charset.Charset;
import mk;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;

public class StringNullTerminated extends TextEncodedStringNullTerminated {
  public StringNullTerminated(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public StringNullTerminated(StringNullTerminated paramStringNullTerminated) {
    super(paramStringNullTerminated);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof StringNullTerminated && super.equals(paramObject));
  }
  
  public Charset getTextEncodingCharSet() {
    return mk.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\StringNullTerminated.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */