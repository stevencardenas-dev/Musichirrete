package org.jaudiotagger.tag.datatype;

import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.id3.ID3Tags;

public class StringDate extends StringFixedLength {
  public StringDate(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody, 8);
  }
  
  public StringDate(StringDate paramStringDate) {
    super(paramStringDate);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof StringDate && super.equals(paramObject));
  }
  
  public Object getValue() {
    Object object = this.value;
    return (object != null) ? ID3Tags.stripChar(object.toString(), '-') : null;
  }
  
  public void setValue(Object paramObject) {
    if (paramObject != null)
      this.value = ID3Tags.stripChar(paramObject.toString(), '-'); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\StringDate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */