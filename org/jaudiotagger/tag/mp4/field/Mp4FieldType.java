package org.jaudiotagger.tag.mp4.field;

import java.util.EnumSet;
import java.util.HashMap;

public enum Mp4FieldType {
  COVERART_BMP,
  COVERART_GIF,
  COVERART_JPEG,
  COVERART_PNG,
  DATETIME,
  DURATION,
  GENRES,
  GUID,
  HTML,
  IMPLICIT(0),
  INTEGER(0),
  ISRC(0),
  MI3P(0),
  RIAAPA(0),
  TEXT(1),
  TEXT_JAPANESE(1),
  TEXT_UTF16BE(2),
  UPC(2),
  URL(2),
  XML(2);
  
  private static final Mp4FieldType[] $VALUES;
  
  private static EnumSet<Mp4FieldType> coverArtTypes;
  
  private static final HashMap<Integer, Mp4FieldType> fileClassIdFiedTypeMap;
  
  private int fileClassId;
  
  static {
    TEXT_JAPANESE = new Mp4FieldType("TEXT_JAPANESE", 3, 3);
    HTML = new Mp4FieldType("HTML", 4, 6);
    XML = new Mp4FieldType("XML", 5, 7);
    GUID = new Mp4FieldType("GUID", 6, 8);
    ISRC = new Mp4FieldType("ISRC", 7, 9);
    MI3P = new Mp4FieldType("MI3P", 8, 10);
    COVERART_GIF = new Mp4FieldType("COVERART_GIF", 9, 12);
    COVERART_JPEG = new Mp4FieldType("COVERART_JPEG", 10, 13);
    COVERART_PNG = new Mp4FieldType("COVERART_PNG", 11, 14);
    URL = new Mp4FieldType("URL", 12, 15);
    DURATION = new Mp4FieldType("DURATION", 13, 16);
    DATETIME = new Mp4FieldType("DATETIME", 14, 17);
    GENRES = new Mp4FieldType("GENRES", 15, 18);
    INTEGER = new Mp4FieldType("INTEGER", 16, 21);
    RIAAPA = new Mp4FieldType("RIAAPA", 17, 24);
    UPC = new Mp4FieldType("UPC", 18, 25);
    COVERART_BMP = new Mp4FieldType("COVERART_BMP", 19, 27);
    $VALUES = $values();
    fileClassIdFiedTypeMap = new HashMap<Integer, Mp4FieldType>((values()).length);
    Mp4FieldType[] arrayOfMp4FieldType = values();
    int i = arrayOfMp4FieldType.length;
    while (b < i) {
      Mp4FieldType mp4FieldType = arrayOfMp4FieldType[b];
      fileClassIdFiedTypeMap.put(Integer.valueOf(mp4FieldType.fileClassId), mp4FieldType);
      b++;
    } 
    coverArtTypes = EnumSet.of(COVERART_GIF, COVERART_JPEG, COVERART_PNG, COVERART_BMP);
  }
  
  Mp4FieldType(int paramInt1) {
    this.fileClassId = paramInt1;
  }
  
  public static Mp4FieldType getFieldType(int paramInt) {
    return fileClassIdFiedTypeMap.get(Integer.valueOf(paramInt));
  }
  
  public static boolean isCoverArtType(Mp4FieldType paramMp4FieldType) {
    return coverArtTypes.contains(paramMp4FieldType);
  }
  
  public int getFileClassId() {
    return this.fileClassId;
  }
  
  static {
    byte b = 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\mp4\field\Mp4FieldType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */