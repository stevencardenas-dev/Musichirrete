package org.jaudiotagger.tag.datatype;

public class Pair {
  private String key;
  
  private String value;
  
  public Pair(String paramString1, String paramString2) {
    setKey(paramString1);
    setValue(paramString2);
  }
  
  public String getKey() {
    return this.key;
  }
  
  public String getPairValue() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getKey());
    stringBuilder.append(false);
    stringBuilder.append(getValue());
    return stringBuilder.toString();
  }
  
  public String getValue() {
    return this.value;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\datatype\Pair.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */