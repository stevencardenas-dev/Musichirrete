package org.jaudiotagger.tag.id3;

public enum Id3FieldType {
  BINARY, TEXT, USER_DEFINED_TEXT;
  
  private static final Id3FieldType[] $VALUES;
  
  static {
    BINARY = new Id3FieldType("BINARY", 2);
    $VALUES = $values();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\Id3FieldType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */