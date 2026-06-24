package org.jaudiotagger.audio.wav.chunk;

public enum WavCorruptChunkType {
  CORRUPT_ID3_EARLY("id3"),
  CORRUPT_ID3_LATE("d3 "),
  CORRUPT_LIST_EARLY("LIS"),
  CORRUPT_LIST_LATE("IST");
  
  private static final WavCorruptChunkType[] $VALUES;
  
  private String code;
  
  static {
    $VALUES = $values();
  }
  
  WavCorruptChunkType(String paramString1) {
    this.code = paramString1;
  }
  
  public String getCode() {
    return this.code;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\chunk\WavCorruptChunkType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */