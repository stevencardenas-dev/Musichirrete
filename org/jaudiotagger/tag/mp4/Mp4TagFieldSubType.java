package org.jaudiotagger.tag.mp4;

public enum Mp4TagFieldSubType {
  ARTWORK, BYTE, DISC_NO, GENRE, NUMBER, REVERSE_DNS, TEXT, TRACK_NO, UNKNOWN;
  
  private static final Mp4TagFieldSubType[] $VALUES;
  
  static {
    BYTE = new Mp4TagFieldSubType("BYTE", 1);
    NUMBER = new Mp4TagFieldSubType("NUMBER", 2);
    REVERSE_DNS = new Mp4TagFieldSubType("REVERSE_DNS", 3);
    GENRE = new Mp4TagFieldSubType("GENRE", 4);
    DISC_NO = new Mp4TagFieldSubType("DISC_NO", 5);
    TRACK_NO = new Mp4TagFieldSubType("TRACK_NO", 6);
    ARTWORK = new Mp4TagFieldSubType("ARTWORK", 7);
    UNKNOWN = new Mp4TagFieldSubType("UNKNOWN", 8);
    $VALUES = $values();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\Mp4TagFieldSubType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */