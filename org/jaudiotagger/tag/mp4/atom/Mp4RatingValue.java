package org.jaudiotagger.tag.mp4.atom;

public enum Mp4RatingValue {
  CLEAN("Clean", 2),
  EXPLICIT("Explicit", 4);
  
  private static final Mp4RatingValue[] $VALUES;
  
  private String description;
  
  private int id;
  
  static {
    $VALUES = $values();
  }
  
  Mp4RatingValue(String paramString1, int paramInt1) {
    this.description = paramString1;
    this.id = paramInt1;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public int getId() {
    return this.id;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\atom\Mp4RatingValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */