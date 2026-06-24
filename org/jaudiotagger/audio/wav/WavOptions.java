package org.jaudiotagger.audio.wav;

public enum WavOptions {
  READ_ID3_ONLY, READ_ID3_ONLY_AND_SYNC, READ_ID3_UNLESS_ONLY_INFO, READ_ID3_UNLESS_ONLY_INFO_AND_SYNC, READ_INFO_ONLY, READ_INFO_ONLY_AND_SYNC, READ_INFO_UNLESS_ONLY_ID3, READ_INFO_UNLESS_ONLY_ID3_AND_SYNC;
  
  private static final WavOptions[] $VALUES;
  
  static {
    READ_ID3_UNLESS_ONLY_INFO = new WavOptions("READ_ID3_UNLESS_ONLY_INFO", 2);
    READ_INFO_UNLESS_ONLY_ID3 = new WavOptions("READ_INFO_UNLESS_ONLY_ID3", 3);
    READ_ID3_ONLY_AND_SYNC = new WavOptions("READ_ID3_ONLY_AND_SYNC", 4);
    READ_INFO_ONLY_AND_SYNC = new WavOptions("READ_INFO_ONLY_AND_SYNC", 5);
    READ_ID3_UNLESS_ONLY_INFO_AND_SYNC = new WavOptions("READ_ID3_UNLESS_ONLY_INFO_AND_SYNC", 6);
    READ_INFO_UNLESS_ONLY_ID3_AND_SYNC = new WavOptions("READ_INFO_UNLESS_ONLY_ID3_AND_SYNC", 7);
    $VALUES = $values();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\WavOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */