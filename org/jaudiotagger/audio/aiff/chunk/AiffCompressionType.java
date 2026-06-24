package org.jaudiotagger.audio.aiff.chunk;

import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import java.util.HashMap;
import java.util.Map;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public enum AiffCompressionType {
  ALAW,
  FL32,
  IN24,
  IN32,
  MAC3,
  MAC6,
  NONE("NONE", "not compressed", "big-endian", "Apple", true),
  RAW("raw ", "PCM 8-bit", "offset-binary", "Apple", false),
  SOWT("raw ", "PCM 8-bit", "offset-binary", "Apple", false),
  TWOS("twos", "PCM 16-bit", "twos-complement little-endian", "Apple", false),
  ULAW("twos", "PCM 16-bit", "twos-complement little-endian", "Apple", false),
  alaw("twos", "PCM 16-bit", "twos-complement little-endian", "Apple", false),
  fl32("twos", "PCM 16-bit", "twos-complement little-endian", "Apple", false),
  ll64("twos", "PCM 16-bit", "twos-complement little-endian", "Apple", false),
  rt24("twos", "PCM 16-bit", "twos-complement little-endian", "Apple", false),
  rt29("twos", "PCM 16-bit", "twos-complement little-endian", "Apple", false),
  ulaw("twos", "PCM 16-bit", "twos-complement little-endian", "Apple", false);
  
  private static final AiffCompressionType[] $VALUES;
  
  private static final Map<String, AiffCompressionType> lookup;
  
  private final String code;
  
  private final String compression;
  
  private final String dataType;
  
  private final boolean isLossless;
  
  private final String provider;
  
  static {
    SOWT = new AiffCompressionType(ckOPp.QlmT, 3, "sowt", "not compressed", "little-endian", "Apple", true);
    fl32 = new AiffCompressionType("fl32", 4, "fl32", "PCM 32-bit", "floating point,", "Apple", false);
    ll64 = new AiffCompressionType("ll64", 5, "fl64", "PCM 64-bit", "floating point", "Apple", false);
    IN24 = new AiffCompressionType("IN24", 6, "in24", "PCM 24-bit", "integer", "Apple", false);
    IN32 = new AiffCompressionType("IN32", 7, "in32", "PCM 32-bit", "integer", "Apple", false);
    alaw = new AiffCompressionType(jLnXOLx.ZSRxCy, 8, "alaw", "Alaw 2:1", "8-bit ITU-T G.711 A-law", "Apple", false);
    ulaw = new AiffCompressionType("ulaw", 9, "ulaw", "µlaw 2:1", "8-bit ITU-T G.711 µ-law", "Apple", false);
    MAC3 = new AiffCompressionType("MAC3", 10, "MAC3", "MACE 3-to-1", "", "Apple", false);
    MAC6 = new AiffCompressionType("MAC6", 11, "MAC6", "MACE 6-to-1", "", "Apple", false);
    ALAW = new AiffCompressionType("ALAW", 12, "ALAW", "CCITT G.711 A-law", "8-bit ITU-T G.711 A-law (64 kbit/s)", "SGI", false);
    ULAW = new AiffCompressionType("ULAW", 13, "ULAW", "CCITT G.711 u-law", "8-bit ITU-T G.711 A-law (64 kbit/s)", "SGI", false);
    FL32 = new AiffCompressionType("FL32", 14, "FL32", "Float 32", "IEEE 32-bit float", "SoundHack & Csound", false);
    rt24 = new AiffCompressionType("rt24", 15, "rt24", "RT24 50:1", "", "Voxware", false);
    rt29 = new AiffCompressionType("rt29", 16, "rt29", "RT29 50:1", zLtYiJUm.MEE, "Voxware", false);
    $VALUES = $values();
    lookup = new HashMap<String, AiffCompressionType>();
    for (AiffCompressionType aiffCompressionType : values())
      lookup.put(aiffCompressionType.getCode(), aiffCompressionType); 
  }
  
  AiffCompressionType(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean) {
    this.code = paramString1;
    this.compression = paramString2;
    this.dataType = paramString3;
    this.provider = paramString4;
    this.isLossless = paramBoolean;
  }
  
  public static AiffCompressionType getByCode(String paramString) {
    return lookup.get(paramString);
  }
  
  public String getCode() {
    return this.code;
  }
  
  public String getCompression() {
    return this.compression;
  }
  
  public String getDataType() {
    return this.dataType;
  }
  
  public String getProvider() {
    return this.provider;
  }
  
  public boolean isLossless() {
    return this.isLossless;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\chunk\AiffCompressionType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */