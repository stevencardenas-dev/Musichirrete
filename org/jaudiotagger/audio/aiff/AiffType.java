package org.jaudiotagger.audio.aiff;

public enum AiffType {
  AIFC,
  AIFF("AIFF");
  
  private static final AiffType[] $VALUES;
  
  String code;
  
  static {
    AIFC = new AiffType("AIFC", 1, "AIFC");
    $VALUES = $values();
  }
  
  AiffType(String paramString1) {
    this.code = paramString1;
  }
  
  public String getCode() {
    return this.code;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\AiffType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */