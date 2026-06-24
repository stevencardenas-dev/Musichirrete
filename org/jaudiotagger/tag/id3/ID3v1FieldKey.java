package org.jaudiotagger.tag.id3;

public enum ID3v1FieldKey {
  ALBUM, ARTIST, COMMENT, GENRE, TITLE, TRACK, YEAR;
  
  private static final ID3v1FieldKey[] $VALUES;
  
  static {
    ALBUM = new ID3v1FieldKey("ALBUM", 1);
    GENRE = new ID3v1FieldKey("GENRE", 2);
    TITLE = new ID3v1FieldKey("TITLE", 3);
    YEAR = new ID3v1FieldKey("YEAR", 4);
    TRACK = new ID3v1FieldKey("TRACK", 5);
    COMMENT = new ID3v1FieldKey("COMMENT", 6);
    $VALUES = $values();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3v1FieldKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */