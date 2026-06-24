package org.jaudiotagger.tag.datatype;

import java.util.Collections;
import java.util.Map;

public class AbstractIntStringValuePair extends AbstractValuePair<Integer, String> {
  protected Integer key = null;
  
  public void createMaps() {
    for (Map.Entry<I, V> entry : this.idToValue.entrySet())
      this.valueToId.put((V)entry.getValue(), (I)entry.getKey()); 
    this.valueList.addAll(this.idToValue.values());
    Collections.sort(this.valueList);
  }
  
  public Integer getIdForValue(String paramString) {
    return (Integer)this.valueToId.get(paramString);
  }
  
  public String getValueForId(int paramInt) {
    return (String)this.idToValue.get(Integer.valueOf(paramInt));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\AbstractIntStringValuePair.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */