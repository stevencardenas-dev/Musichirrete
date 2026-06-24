package org.jaudiotagger.audio.dsf;

import java.util.HashMap;
import java.util.Map;

public enum DsfChunkType {
  DATA,
  DSD("DSD "),
  FORMAT("fmt "),
  ID3("fmt ");
  
  private static final DsfChunkType[] $VALUES;
  
  private static final Map<String, DsfChunkType> CODE_TYPE_MAP;
  
  private String code;
  
  static {
    DATA = new DsfChunkType("DATA", 2, "data");
    ID3 = new DsfChunkType("ID3", 3, "ID3");
    $VALUES = $values();
    CODE_TYPE_MAP = new HashMap<String, DsfChunkType>();
  }
  
  DsfChunkType(String paramString1) {
    this.code = paramString1;
  }
  
  public static DsfChunkType get(String paramString) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/dsf/DsfChunkType}} */
    try {
      if (CODE_TYPE_MAP.isEmpty())
        for (DsfChunkType dsfChunkType1 : values())
          CODE_TYPE_MAP.put(dsfChunkType1.getCode(), dsfChunkType1);  
    } finally {}
    DsfChunkType dsfChunkType = CODE_TYPE_MAP.get(paramString);
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/dsf/DsfChunkType}} */
    return dsfChunkType;
  }
  
  public String getCode() {
    return this.code;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dsf\DsfChunkType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */