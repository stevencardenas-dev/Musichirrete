package org.jaudiotagger.tag.id3;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

public abstract class AbstractTagItem {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.tag.id3");
  
  public AbstractTagItem() {}
  
  public AbstractTagItem(AbstractTagItem paramAbstractTagItem) {}
  
  public boolean equals(Object paramObject) {
    return (this == paramObject) ? true : (paramObject instanceof AbstractTagItem);
  }
  
  public abstract String getIdentifier();
  
  public abstract int getSize();
  
  public boolean isSubsetOf(Object paramObject) {
    return paramObject instanceof AbstractTagItem;
  }
  
  public abstract void read(ByteBuffer paramByteBuffer);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\AbstractTagItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */