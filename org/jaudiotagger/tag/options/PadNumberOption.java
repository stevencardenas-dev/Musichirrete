package org.jaudiotagger.tag.options;

public enum PadNumberOption {
  PAD_ONE_ZERO, PAD_THREE_ZERO, PAD_TWO_ZERO;
  
  private static final PadNumberOption[] $VALUES;
  
  static {
    PAD_THREE_ZERO = new PadNumberOption("PAD_THREE_ZERO", 2);
    $VALUES = $values();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\options\PadNumberOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */