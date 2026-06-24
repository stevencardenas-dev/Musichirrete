package org.jaudiotagger.tag.datatype;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import l0;
import mk;
import org.jaudiotagger.tag.id3.AbstractTagFrameBody;
import org.jaudiotagger.tag.reference.Languages;

public class StringHashMap extends StringFixedLength implements HashMapInterface<String, String> {
  boolean hasEmptyValue = false;
  
  Map<String, String> keyToValue = null;
  
  Map<String, String> valueToKey = null;
  
  public StringHashMap(String paramString, AbstractTagFrameBody paramAbstractTagFrameBody, int paramInt) {
    super(paramString, paramAbstractTagFrameBody, paramInt);
    if (paramString.equals("Language")) {
      this.valueToKey = Languages.getInstanceOf().getValueToIdMap();
      this.keyToValue = Languages.getInstanceOf().getIdToValueMap();
      return;
    } 
    l0.l("Hashmap identifier not defined in this class: ".concat(paramString));
    throw null;
  }
  
  public StringHashMap(StringHashMap paramStringHashMap) {
    super(paramStringHashMap);
    this.hasEmptyValue = paramStringHashMap.hasEmptyValue;
    this.keyToValue = paramStringHashMap.keyToValue;
    this.valueToKey = paramStringHashMap.valueToKey;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof StringHashMap))
      return false; 
    StringHashMap stringHashMap = (StringHashMap)paramObject;
    if (this.hasEmptyValue != stringHashMap.hasEmptyValue)
      return false; 
    Map<String, String> map1 = this.keyToValue;
    Map<String, String> map2 = stringHashMap.keyToValue;
    if (map1 == null) {
      if (map2 != null)
        return false; 
    } else if (!map1.equals(map2)) {
      return false;
    } 
    if (this.keyToValue == null) {
      if (stringHashMap.keyToValue != null)
        return false; 
    } else if (!this.valueToKey.equals(stringHashMap.valueToKey)) {
      return false;
    } 
    return super.equals(paramObject);
  }
  
  public Map<String, String> getKeyToValue() {
    return this.keyToValue;
  }
  
  public Charset getTextEncodingCharSet() {
    return mk.b;
  }
  
  public Map<String, String> getValueToKey() {
    return this.valueToKey;
  }
  
  public Iterator<String> iterator() {
    if (this.keyToValue == null)
      return null; 
    TreeSet<String> treeSet = new TreeSet(this.keyToValue.values());
    if (this.hasEmptyValue)
      treeSet.add(""); 
    return treeSet.iterator();
  }
  
  public void setValue(Object paramObject) {
    if (paramObject instanceof String) {
      if (paramObject.equals("XXX")) {
        this.value = paramObject.toString();
        return;
      } 
      this.value = ((String)paramObject).toLowerCase();
      return;
    } 
    this.value = paramObject;
  }
  
  public String toString() {
    Object object = this.value;
    return (object == null || this.keyToValue.get(object) == null) ? "" : this.keyToValue.get(this.value);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\StringHashMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */