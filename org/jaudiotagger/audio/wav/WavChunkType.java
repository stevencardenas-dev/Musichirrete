package org.jaudiotagger.audio.wav;

import java.util.HashMap;
import java.util.Map;

public enum WavChunkType {
  BRDK,
  DATA,
  FACT,
  FORMAT("fmt ", "Basic Audio Information"),
  ID3("fmt ", "Basic Audio Information"),
  ID3_UPPERCASE("fmt ", "Basic Audio Information"),
  INFO("fmt ", "Basic Audio Information"),
  IXML("fmt ", "Basic Audio Information"),
  JUNK("fmt ", "Basic Audio Information"),
  LIST("fmt ", "Basic Audio Information"),
  PAD("fmt ", "Basic Audio Information");
  
  private static final WavChunkType[] $VALUES;
  
  private static final Map<String, WavChunkType> CODE_TYPE_MAP;
  
  private String code;
  
  static {
    FACT = new WavChunkType("FACT", 1, "fact", "Only strictly required for Non-PCM or compressed data");
    DATA = new WavChunkType("DATA", 2, "data", "Stores the actual audio data");
    LIST = new WavChunkType("LIST", 3, "LIST", "List chunk, wraps round other chunks");
    INFO = new WavChunkType("INFO", 4, "INFO", "Original metadata implementation");
    ID3 = new WavChunkType("ID3", 5, "id3 ", "Stores metadata in ID3 chunk");
    JUNK = new WavChunkType("JUNK", 6, "JUNK", "Junk Data");
    PAD = new WavChunkType("PAD", 7, "PAD ", "Official Padding Data");
    IXML = new WavChunkType("IXML", 8, "iXML", "Location Sound Metadata");
    BRDK = new WavChunkType("BRDK", 9, "BRDK", "BRDK");
    ID3_UPPERCASE = new WavChunkType("ID3_UPPERCASE", 10, "ID3 ", "Stores metadata in ID3 chunk, should be lowefcase id");
    $VALUES = $values();
    CODE_TYPE_MAP = new HashMap<String, WavChunkType>();
  }
  
  WavChunkType(String paramString1, String paramString2) {
    this.code = paramString1;
  }
  
  public static WavChunkType get(String paramString) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/wav/WavChunkType}} */
    try {
      if (CODE_TYPE_MAP.isEmpty())
        for (WavChunkType wavChunkType1 : values())
          CODE_TYPE_MAP.put(wavChunkType1.getCode(), wavChunkType1);  
    } finally {}
    WavChunkType wavChunkType = CODE_TYPE_MAP.get(paramString);
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{org/jaudiotagger/audio/wav/WavChunkType}} */
    return wavChunkType;
  }
  
  public String getCode() {
    return this.code;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\WavChunkType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */