package org.jaudiotagger.audio.flac.metadatablock;

public enum BlockType {
  APPLICATION,
  CUESHEET,
  PADDING,
  PICTURE,
  SEEKTABLE,
  STREAMINFO(0),
  VORBIS_COMMENT(0);
  
  private static final BlockType[] $VALUES;
  
  private int id;
  
  static {
    PADDING = new BlockType("PADDING", 1, 1);
    APPLICATION = new BlockType("APPLICATION", 2, 2);
    SEEKTABLE = new BlockType("SEEKTABLE", 3, 3);
    VORBIS_COMMENT = new BlockType("VORBIS_COMMENT", 4, 4);
    CUESHEET = new BlockType("CUESHEET", 5, 5);
    PICTURE = new BlockType("PICTURE", 6, 6);
    $VALUES = $values();
  }
  
  BlockType(int paramInt1) {
    this.id = paramInt1;
  }
  
  public int getId() {
    return this.id;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\metadatablock\BlockType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */