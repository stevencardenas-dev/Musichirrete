package org.jaudiotagger.audio.aiff;

import com.google.android.material.tabs.xm.VDgS;

public enum AiffTagFieldKey {
  TIMESTAMP;
  
  private static final AiffTagFieldKey[] $VALUES;
  
  private String fieldName;
  
  static {
    String str = VDgS.gfmT;
    TIMESTAMP = new AiffTagFieldKey(str, 0, str);
    $VALUES = $values();
  }
  
  AiffTagFieldKey(String paramString1) {
    this.fieldName = paramString1;
  }
  
  public String getFieldName() {
    return this.fieldName;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\AiffTagFieldKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */