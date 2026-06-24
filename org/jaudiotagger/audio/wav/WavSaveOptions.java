package org.jaudiotagger.audio.wav;

public enum WavSaveOptions {
  SAVE_ACTIVE, SAVE_BOTH, SAVE_BOTH_AND_SYNC, SAVE_EXISTING_AND_ACTIVE, SAVE_EXISTING_AND_ACTIVE_AND_SYNC;
  
  private static final WavSaveOptions[] $VALUES;
  
  static {
    SAVE_ACTIVE = new WavSaveOptions("SAVE_ACTIVE", 1);
    SAVE_BOTH = new WavSaveOptions("SAVE_BOTH", 2);
    SAVE_EXISTING_AND_ACTIVE_AND_SYNC = new WavSaveOptions("SAVE_EXISTING_AND_ACTIVE_AND_SYNC", 3);
    SAVE_BOTH_AND_SYNC = new WavSaveOptions("SAVE_BOTH_AND_SYNC", 4);
    $VALUES = $values();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\WavSaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */