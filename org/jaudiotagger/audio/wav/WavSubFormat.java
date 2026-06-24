package org.jaudiotagger.audio.wav;

import java.util.HashMap;
import java.util.Map;

public enum WavSubFormat {
  FORMAT_ALAW,
  FORMAT_EXTENSIBLE,
  FORMAT_FLOAT,
  FORMAT_GSM_COMPRESSED,
  FORMAT_MULAW,
  FORMAT_PCM(1, "WAV PCM");
  
  private static final WavSubFormat[] $VALUES;
  
  private static final Map<Integer, WavSubFormat> lookup;
  
  private int code;
  
  private String description;
  
  static {
    FORMAT_FLOAT = new WavSubFormat("FORMAT_FLOAT", 1, 3, "WAV IEEE_FLOAT");
    FORMAT_ALAW = new WavSubFormat("FORMAT_ALAW", 2, 6, "WAV A-LAW");
    FORMAT_MULAW = new WavSubFormat("FORMAT_MULAW", 3, 7, "WAV µ-LAW");
    FORMAT_EXTENSIBLE = new WavSubFormat("FORMAT_EXTENSIBLE", 4, 65534, "EXTENSIBLE");
    FORMAT_GSM_COMPRESSED = new WavSubFormat("FORMAT_GSM_COMPRESSED", 5, 49, "GSM_COMPRESSED");
    $VALUES = $values();
    lookup = new HashMap<Integer, WavSubFormat>();
    WavSubFormat[] arrayOfWavSubFormat = values();
    int i = arrayOfWavSubFormat.length;
    while (b < i) {
      WavSubFormat wavSubFormat = arrayOfWavSubFormat[b];
      lookup.put(Integer.valueOf(wavSubFormat.getCode()), wavSubFormat);
      b++;
    } 
  }
  
  WavSubFormat(int paramInt1, String paramString1) {
    this.code = paramInt1;
    this.description = paramString1;
  }
  
  public static WavSubFormat getByCode(Integer paramInteger) {
    return lookup.get(paramInteger);
  }
  
  public int getCode() {
    return this.code;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  static {
    byte b = 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\WavSubFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */