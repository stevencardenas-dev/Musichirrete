package org.jaudiotagger.audio.dff;

import java.util.HashMap;
import java.util.Map;

public enum DffChunkType {
  CHNL,
  CMPR,
  DATA,
  DITI,
  DSD,
  DST,
  END,
  FRM8("FRM8"),
  FRTE("FRM8"),
  FS("FRM8"),
  ID3("FRM8"),
  PROP("FRM8"),
  SND("FRM8");
  
  private static final DffChunkType[] $VALUES;
  
  private static final Map<String, DffChunkType> CODE_TYPE_MAP;
  
  private String code;
  
  static {
    DSD = new DffChunkType("DSD", 1, "DSD ");
    PROP = new DffChunkType("PROP", 2, "PROP");
    SND = new DffChunkType("SND", 3, "SND ");
    FS = new DffChunkType("FS", 4, "FS  ");
    CHNL = new DffChunkType("CHNL", 5, "CHNL");
    CMPR = new DffChunkType("CMPR", 6, "CMPR");
    DITI = new DffChunkType("DITI", 7, "DITI");
    END = new DffChunkType("END", 8, "DSD ");
    DST = new DffChunkType("DST", 9, "DST ");
    FRTE = new DffChunkType("FRTE", 10, "FRTE");
    ID3 = new DffChunkType("ID3", 11, "ID3 ");
    DATA = new DffChunkType("DATA", 12, "data");
    $VALUES = $values();
    CODE_TYPE_MAP = new HashMap<String, DffChunkType>();
  }
  
  DffChunkType(String paramString1) {
    this.code = paramString1;
  }
  
  public static DffChunkType get(String paramString) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/dff/DffChunkType}} */
    try {
      if (CODE_TYPE_MAP.isEmpty())
        for (DffChunkType dffChunkType1 : values())
          CODE_TYPE_MAP.put(dffChunkType1.getCode(), dffChunkType1);  
    } finally {}
    DffChunkType dffChunkType = CODE_TYPE_MAP.get(paramString);
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/dff/DffChunkType}} */
    return dffChunkType;
  }
  
  public String getCode() {
    return this.code;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\DffChunkType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */