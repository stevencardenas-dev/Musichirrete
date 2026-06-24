package org.jaudiotagger.audio.wav;

public enum WavSaveOrder {
  ID3_THEN_INFO, INFO_THEN_ID3;
  
  private static final WavSaveOrder[] $VALUES;
  
  static {
    ID3_THEN_INFO = new WavSaveOrder("ID3_THEN_INFO", 1);
    $VALUES = $values();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\WavSaveOrder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */