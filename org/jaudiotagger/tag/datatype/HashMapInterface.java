package org.jaudiotagger.tag.datatype;

import java.util.Iterator;
import java.util.Map;

public interface HashMapInterface<K, V> {
  Map<K, V> getKeyToValue();
  
  Map<V, K> getValueToKey();
  
  Iterator<V> iterator();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\HashMapInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */