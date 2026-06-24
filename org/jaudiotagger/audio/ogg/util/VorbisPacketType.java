package org.jaudiotagger.audio.ogg.util;

public enum VorbisPacketType {
  AUDIO(0),
  COMMENT_HEADER(0),
  IDENTIFICATION_HEADER(1),
  SETUP_HEADER(1);
  
  private static final VorbisPacketType[] $VALUES;
  
  int type;
  
  static {
    COMMENT_HEADER = new VorbisPacketType("COMMENT_HEADER", 2, 3);
    SETUP_HEADER = new VorbisPacketType("SETUP_HEADER", 3, 5);
    $VALUES = $values();
  }
  
  VorbisPacketType(int paramInt1) {
    this.type = paramInt1;
  }
  
  public int getType() {
    return this.type;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\og\\util\VorbisPacketType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */