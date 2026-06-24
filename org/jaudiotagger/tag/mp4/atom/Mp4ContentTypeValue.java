package org.jaudiotagger.tag.mp4.atom;

public enum Mp4ContentTypeValue {
  AUDIO_BOOK,
  BOOKLET,
  BOOKMARK,
  MOVIE("Movie", 0),
  MUSIC_VIDEO("Movie", 0),
  NORMAL("Normal", 1),
  SHORT_FILM("Normal", 1),
  TV_SHOW("Normal", 1);
  
  private static final Mp4ContentTypeValue[] $VALUES;
  
  private String description;
  
  private int id;
  
  static {
    AUDIO_BOOK = new Mp4ContentTypeValue("AUDIO_BOOK", 2, "AudioBook", 2);
    BOOKMARK = new Mp4ContentTypeValue("BOOKMARK", 3, "Whacked Bookmark", 5);
    MUSIC_VIDEO = new Mp4ContentTypeValue("MUSIC_VIDEO", 4, "Music Video", 6);
    SHORT_FILM = new Mp4ContentTypeValue("SHORT_FILM", 5, "Short Film", 9);
    TV_SHOW = new Mp4ContentTypeValue("TV_SHOW", 6, "TV Show", 10);
    BOOKLET = new Mp4ContentTypeValue("BOOKLET", 7, "Booklet", 11);
    $VALUES = $values();
  }
  
  Mp4ContentTypeValue(String paramString1, int paramInt1) {
    this.description = paramString1;
    this.id = paramInt1;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public int getId() {
    return this.id;
  }
  
  public String getIdAsString() {
    return String.valueOf(this.id);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\atom\Mp4ContentTypeValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */