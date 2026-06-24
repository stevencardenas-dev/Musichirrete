package org.jaudiotagger.tag.reference;

import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public enum Tagger {
  BEATUNES,
  FOOBAR2000,
  GODFATHER,
  ITUNES(0, "iTunes"),
  JAIKOZ(0, "iTunes"),
  JRIVER(0, "iTunes"),
  MEDIAPLAYER(1, "Windows Media Player"),
  MEDIA_MONKEY(1, "Windows Media Player"),
  MINIMSERVER(1, "Windows Media Player"),
  MP3TAG(1, "Windows Media Player"),
  MUSICHI(1, "Windows Media Player"),
  PICARD(1, "Windows Media Player"),
  ROON(1, "Windows Media Player"),
  SONGBIRD(1, "Windows Media Player"),
  SONGKONG(1, "Windows Media Player"),
  TAGSCANNER(1, "Windows Media Player"),
  TAG_AND_RENAME(1, "Windows Media Player"),
  WINAMP(2, "Winamp"),
  XIPH(2, "Winamp");
  
  private static final Tagger[] $VALUES;
  
  private String desc;
  
  static {
    MP3TAG = new Tagger("MP3TAG", 3, 3, "Mp3 Tag");
    MEDIA_MONKEY = new Tagger("MEDIA_MONKEY", 4, 4, "Media Monkey");
    TAG_AND_RENAME = new Tagger("TAG_AND_RENAME", 5, 5, "Tag and Rename");
    PICARD = new Tagger("PICARD", 6, 6, "Picard");
    JAIKOZ = new Tagger("JAIKOZ", 7, 7, "Jaikoz");
    TAGSCANNER = new Tagger("TAGSCANNER", 8, 8, "Tagscanner");
    XIPH = new Tagger("XIPH", 9, 9, "Xiph");
    FOOBAR2000 = new Tagger("FOOBAR2000", 10, 10, "Foobar2000");
    BEATUNES = new Tagger("BEATUNES", 11, 11, "Beatunes");
    SONGBIRD = new Tagger("SONGBIRD", 12, 12, "Songbird");
    JRIVER = new Tagger("JRIVER", 13, 13, "JRiver");
    GODFATHER = new Tagger("GODFATHER", 14, 14, "The Godfather");
    MUSICHI = new Tagger(eRUgfgGAccgka.CFqzcTbjG, 15, 15, "Musichi");
    ROON = new Tagger("ROON", 16, 16, "Roon");
    SONGKONG = new Tagger(uvJYmft.AStjfcpmLkDk, 17, 17, "SongKong");
    MINIMSERVER = new Tagger("MINIMSERVER", 18, 18, "MinimServer");
    $VALUES = $values();
  }
  
  Tagger(int paramInt1, String paramString1) {
    this.desc = paramString1;
  }
  
  public String toString() {
    return this.desc;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\reference\Tagger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */