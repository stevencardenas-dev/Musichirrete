package org.jaudiotagger.tag.id3.valuepair;

public enum ID3V2ExtendedGenreTypes {
  CR,
  RX("Remix");
  
  private static final ID3V2ExtendedGenreTypes[] $VALUES;
  
  private String description;
  
  static {
    CR = new ID3V2ExtendedGenreTypes("CR", 1, "Cover");
    $VALUES = $values();
  }
  
  ID3V2ExtendedGenreTypes(String paramString1) {
    this.description = paramString1;
  }
  
  public String getDescription() {
    return this.description;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\valuepair\ID3V2ExtendedGenreTypes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */