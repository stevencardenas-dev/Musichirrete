package org.jaudiotagger.tag.datatype;

import org.jaudiotagger.tag.id3.AbstractTagFrameBody;

public class StringDateTime extends StringSizeTerminated {
  public StringDateTime(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody) {
    super(paramString, paramAbstractTagFrameBody);
  }
  
  public StringDateTime(StringDateTime paramStringDateTime) {
    super(paramStringDateTime);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof StringDateTime && super.equals(paramObject));
  }
  
  public Object getValue() {
    Object object = this.value;
    return (object != null) ? object.toString().replace(' ', 'T') : null;
  }
  
  public void setValue(Object paramObject) {
    if (paramObject != null)
      this.value = paramObject.toString().replace(' ', 'T'); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\StringDateTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */