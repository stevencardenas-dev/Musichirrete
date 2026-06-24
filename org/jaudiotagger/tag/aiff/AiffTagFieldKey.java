package org.jaudiotagger.tag.aiff;

public enum AiffTagFieldKey {
  TIMESTAMP("TIMESTAMP");
  
  private static final AiffTagFieldKey[] $VALUES;
  
  private String fieldName;
  
  static {
    $VALUES = $values();
  }
  
  AiffTagFieldKey(String paramString1) {
    this.fieldName = paramString1;
  }
  
  public String getFieldName() {
    return this.fieldName;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\aiff\AiffTagFieldKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */