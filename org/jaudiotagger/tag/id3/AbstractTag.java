package org.jaudiotagger.tag.id3;

import java.nio.ByteBuffer;
import java.util.Iterator;
import uc1;

public abstract class AbstractTag extends AbstractTagItem {
  protected static final String TYPE_TAG = "tag";
  
  public AbstractTag() {}
  
  public AbstractTag(AbstractTag paramAbstractTag) {
    super(paramAbstractTag);
  }
  
  public abstract void delete(uc1 paramuc1);
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof AbstractTag && super.equals(paramObject));
  }
  
  public abstract Iterator<? extends Object> iterator();
  
  public abstract boolean seek(ByteBuffer paramByteBuffer);
  
  public abstract void write(uc1 paramuc1);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\AbstractTag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */