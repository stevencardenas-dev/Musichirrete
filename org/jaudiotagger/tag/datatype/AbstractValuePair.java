package org.jaudiotagger.tag.datatype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractValuePair<I, V> {
  protected final Map<I, V> idToValue;
  
  protected Iterator<I> iterator;
  
  protected String value;
  
  protected final List<V> valueList;
  
  protected final Map<V, I> valueToId;
  
  public AbstractValuePair() {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
    this.idToValue = (Map)linkedHashMap;
    this.valueToId = new LinkedHashMap<V, I>();
    this.valueList = new ArrayList<V>();
    this.iterator = linkedHashMap.keySet().iterator();
  }
  
  public List<V> getAlphabeticalValueList() {
    return this.valueList;
  }
  
  public Map<I, V> getIdToValueMap() {
    return this.idToValue;
  }
  
  public int getSize() {
    return this.valueList.size();
  }
  
  public Map<V, I> getValueToIdMap() {
    return this.valueToId;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\AbstractValuePair.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */