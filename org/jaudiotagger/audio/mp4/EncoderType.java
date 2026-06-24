package org.jaudiotagger.audio.mp4;

public enum EncoderType {
  AAC("Aac"),
  APPLE_LOSSLESS("Aac"),
  DRM_AAC("Aac (Drm)");
  
  private static final EncoderType[] $VALUES;
  
  private String description;
  
  static {
    APPLE_LOSSLESS = new EncoderType("APPLE_LOSSLESS", 2, "Alac");
    $VALUES = $values();
  }
  
  EncoderType(String paramString1) {
    this.description = paramString1;
  }
  
  public String getDescription() {
    return this.description;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\EncoderType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */