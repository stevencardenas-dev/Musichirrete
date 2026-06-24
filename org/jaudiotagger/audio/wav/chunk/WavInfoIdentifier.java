package org.jaudiotagger.audio.wav.chunk;

import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import java.util.HashMap;
import java.util.Map;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import org.jaudiotagger.tag.FieldKey;

public enum WavInfoIdentifier {
  ALBUM,
  ALBUM_ARTIST,
  ALBUM_GAIN,
  ARTIST("IART", FieldKey.ARTIST, 1),
  COMMENTS("IART", FieldKey.ARTIST, 1),
  COMPOSER("IART", FieldKey.ARTIST, 1),
  CONDUCTOR("IART", FieldKey.ARTIST, 1),
  COPYRIGHT("IART", FieldKey.ARTIST, 1),
  ENCODER("IART", FieldKey.ARTIST, 1),
  GENRE("IART", FieldKey.ARTIST, 1),
  ISRC("IART", FieldKey.ARTIST, 1),
  LABEL("IART", FieldKey.ARTIST, 1),
  LYRICIST("IART", FieldKey.ARTIST, 1),
  QOBUZ_ALBUMARTIST("IART", FieldKey.ARTIST, 1),
  QOBUZ_TRACKNO("IART", FieldKey.ARTIST, 1),
  QOBUZ_TRACK_TOTAL("IART", FieldKey.ARTIST, 1),
  RATING("IART", FieldKey.ARTIST, 1),
  TITLE("IART", FieldKey.ARTIST, 1),
  TRACKNO("IART", FieldKey.ARTIST, 1),
  TRACK_GAIN("IART", FieldKey.ARTIST, 1),
  TWONKY_TRACKNO("IART", FieldKey.ARTIST, 1),
  YEAR("IART", FieldKey.ARTIST, 1);
  
  private static final WavInfoIdentifier[] $VALUES;
  
  private static final Map<String, WavInfoIdentifier> CODE_TYPE_MAP;
  
  private static final Map<FieldKey, WavInfoIdentifier> FIELDKEY_TYPE_MAP;
  
  private String code;
  
  private FieldKey fieldKey;
  
  private int preferredWriteOrder;
  
  static {
    ALBUM = new WavInfoIdentifier("ALBUM", 1, "IPRD", FieldKey.ALBUM, 2);
    TITLE = new WavInfoIdentifier("TITLE", 2, "INAM", FieldKey.TITLE, 3);
    TRACKNO = new WavInfoIdentifier("TRACKNO", 3, "ITRK", FieldKey.TRACK, 4);
    FieldKey fieldKey = FieldKey.YEAR;
    YEAR = new WavInfoIdentifier("YEAR", 4, zLtYiJUm.cKSRmkdzLCbQYsz, fieldKey, 5);
    GENRE = new WavInfoIdentifier("GENRE", 5, "IGNR", FieldKey.GENRE, 6);
    ALBUM_ARTIST = new WavInfoIdentifier("ALBUM_ARTIST", 6, "iaar", FieldKey.ALBUM_ARTIST, 7);
    COMMENTS = new WavInfoIdentifier("COMMENTS", 7, "ICMT", FieldKey.COMMENT, 8);
    fieldKey = FieldKey.COMPOSER;
    COMPOSER = new WavInfoIdentifier(hbrAVtEa.cGFbNAfW, 8, "IMUS", fieldKey, 9);
    CONDUCTOR = new WavInfoIdentifier("CONDUCTOR", 9, "ITCH", FieldKey.CONDUCTOR, 10);
    LYRICIST = new WavInfoIdentifier("LYRICIST", 10, "IWRI", FieldKey.LYRICIST, 11);
    ENCODER = new WavInfoIdentifier("ENCODER", 11, "ISFT", FieldKey.ENCODER, 12);
    RATING = new WavInfoIdentifier("RATING", 12, "IRTD", FieldKey.RATING, 13);
    ISRC = new WavInfoIdentifier("ISRC", 13, "ISRC", FieldKey.ISRC, 14);
    LABEL = new WavInfoIdentifier("LABEL", 14, "ICMS", FieldKey.RECORD_LABEL, 15);
    COPYRIGHT = new WavInfoIdentifier("COPYRIGHT", 15, "ICOP", FieldKey.COPYRIGHT, 16);
    QOBUZ_TRACKNO = new WavInfoIdentifier("QOBUZ_TRACKNO", 16, "IPRT", null, 17);
    QOBUZ_TRACK_TOTAL = new WavInfoIdentifier("QOBUZ_TRACK_TOTAL", 17, "IFRM", null, 18);
    QOBUZ_ALBUMARTIST = new WavInfoIdentifier("QOBUZ_ALBUMARTIST", 18, "ISTR", null, 19);
    TRACK_GAIN = new WavInfoIdentifier(hbrAVtEa.pzp, 19, "ITGL", null, 20);
    ALBUM_GAIN = new WavInfoIdentifier("ALBUM_GAIN", 20, "IAGL", null, 21);
    TWONKY_TRACKNO = new WavInfoIdentifier("TWONKY_TRACKNO", 21, "itrk", null, 1);
    $VALUES = $values();
    CODE_TYPE_MAP = new HashMap<String, WavInfoIdentifier>();
    FIELDKEY_TYPE_MAP = new HashMap<FieldKey, WavInfoIdentifier>();
  }
  
  WavInfoIdentifier(String paramString1, FieldKey paramFieldKey, int paramInt1) {
    this.code = paramString1;
    this.fieldKey = paramFieldKey;
    this.preferredWriteOrder = paramInt1;
  }
  
  public static WavInfoIdentifier getByCode(String paramString) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/wav/chunk/WavInfoIdentifier}} */
    try {
      if (CODE_TYPE_MAP.isEmpty())
        for (WavInfoIdentifier wavInfoIdentifier1 : values())
          CODE_TYPE_MAP.put(wavInfoIdentifier1.getCode(), wavInfoIdentifier1);  
    } finally {}
    WavInfoIdentifier wavInfoIdentifier = CODE_TYPE_MAP.get(paramString);
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/wav/chunk/WavInfoIdentifier}} */
    return wavInfoIdentifier;
  }
  
  public static WavInfoIdentifier getByFieldKey(FieldKey paramFieldKey) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/wav/chunk/WavInfoIdentifier}} */
    try {
      if (FIELDKEY_TYPE_MAP.isEmpty())
        for (WavInfoIdentifier wavInfoIdentifier1 : values()) {
          if (wavInfoIdentifier1.getFieldKey() != null)
            FIELDKEY_TYPE_MAP.put(wavInfoIdentifier1.getFieldKey(), wavInfoIdentifier1); 
        }  
    } finally {}
    WavInfoIdentifier wavInfoIdentifier = FIELDKEY_TYPE_MAP.get(paramFieldKey);
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/wav/chunk/WavInfoIdentifier}} */
    return wavInfoIdentifier;
  }
  
  public String getCode() {
    return this.code;
  }
  
  public FieldKey getFieldKey() {
    return this.fieldKey;
  }
  
  public int getPreferredWriteOrder() {
    return this.preferredWriteOrder;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\chunk\WavInfoIdentifier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */