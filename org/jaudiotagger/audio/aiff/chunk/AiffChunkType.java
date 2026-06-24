package org.jaudiotagger.audio.aiff.chunk;

import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import java.util.HashMap;
import java.util.Map;

public enum AiffChunkType {
  ANNOTATION,
  APPLICATION,
  AUTHOR,
  COMMENTS,
  COMMON,
  COPYRIGHT,
  CORRUPT_TAG_EARLY,
  CORRUPT_TAG_LATE,
  FORMAT_VERSION("FVER"),
  NAME("FVER"),
  SOUND("FVER"),
  TAG("FVER");
  
  private static final AiffChunkType[] $VALUES;
  
  private static final Map<String, AiffChunkType> CODE_TYPE_MAP;
  
  private String code;
  
  static {
    APPLICATION = new AiffChunkType("APPLICATION", 1, "APPL");
    SOUND = new AiffChunkType("SOUND", 2, "SSND");
    COMMON = new AiffChunkType("COMMON", 3, "COMM");
    COMMENTS = new AiffChunkType("COMMENTS", 4, "COMT");
    NAME = new AiffChunkType("NAME", 5, "NAME");
    AUTHOR = new AiffChunkType("AUTHOR", 6, "AUTH");
    COPYRIGHT = new AiffChunkType(OETETTfAjV.BOovysOYBgkw, 7, "(c) ");
    ANNOTATION = new AiffChunkType("ANNOTATION", 8, "ANNO");
    TAG = new AiffChunkType("TAG", 9, "ID3 ");
    CORRUPT_TAG_LATE = new AiffChunkType("CORRUPT_TAG_LATE", 10, "D3 \000");
    CORRUPT_TAG_EARLY = new AiffChunkType("CORRUPT_TAG_EARLY", 11, "\000ID3");
    $VALUES = $values();
    CODE_TYPE_MAP = new HashMap<String, AiffChunkType>();
  }
  
  AiffChunkType(String paramString1) {
    this.code = paramString1;
  }
  
  public static AiffChunkType get(String paramString) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/aiff/chunk/AiffChunkType}} */
    try {
      if (CODE_TYPE_MAP.isEmpty())
        for (AiffChunkType aiffChunkType1 : values())
          CODE_TYPE_MAP.put(aiffChunkType1.getCode(), aiffChunkType1);  
    } finally {}
    AiffChunkType aiffChunkType = CODE_TYPE_MAP.get(paramString);
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/aiff/chunk/AiffChunkType}} */
    return aiffChunkType;
  }
  
  public String getCode() {
    return this.code;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\AiffChunkType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */