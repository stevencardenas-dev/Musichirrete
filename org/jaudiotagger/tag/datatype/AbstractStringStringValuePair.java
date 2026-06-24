package org.jaudiotagger.tag.datatype;

import java.util.Collections;
import java.util.List;

public class AbstractStringStringValuePair extends AbstractValuePair<String, String> {
  protected String lkey = null;
  
  public void createMaps() {
    this.iterator = this.idToValue.keySet().iterator();
    while (this.iterator.hasNext()) {
      String str = (String)this.iterator.next();
      this.lkey = str;
      str = (String)this.idToValue.get(str);
      this.value = str;
      this.valueToId.put((V)str, (I)this.lkey);
    } 
    this.iterator = this.idToValue.keySet().iterator();
    while (true) {
      boolean bool = this.iterator.hasNext();
      List<V> list = this.valueList;
      if (bool) {
        list.add(this.idToValue.get(this.iterator.next()));
        continue;
      } 
      Collections.sort(list);
      return;
    } 
  }
  
  public String getIdForValue(String paramString) {
    return (String)this.valueToId.get(paramString);
  }
  
  public String getValueForId(String paramString) {
    return (String)this.idToValue.get(paramString);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\AbstractStringStringValuePair.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */