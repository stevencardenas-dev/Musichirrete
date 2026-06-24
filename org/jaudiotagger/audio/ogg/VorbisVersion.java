package org.jaudiotagger.audio.ogg;

public enum VorbisVersion {
  VERSION_ONE("Ogg Vorbis v1");
  
  private static final VorbisVersion[] $VALUES;
  
  private String displayName;
  
  static {
    $VALUES = $values();
  }
  
  VorbisVersion(String paramString1) {
    this.displayName = paramString1;
  }
  
  public String toString() {
    return this.displayName;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\ogg\VorbisVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */