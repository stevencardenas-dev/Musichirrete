package org.jaudiotagger.tag.id3.valuepair;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum StandardIPLSKey {
  ARRANGER,
  DJMIXER,
  ENGINEER("engineer"),
  MIXER("mix"),
  PRODUCER("mix");
  
  private static final StandardIPLSKey[] $VALUES;
  
  private static final Map<String, StandardIPLSKey> lookup;
  
  private String key;
  
  static {
    DJMIXER = new StandardIPLSKey("DJMIXER", 2, "DJ-mix");
    PRODUCER = new StandardIPLSKey("PRODUCER", 3, "producer");
    ARRANGER = new StandardIPLSKey("ARRANGER", 4, "arranger");
    $VALUES = $values();
    lookup = new HashMap<String, StandardIPLSKey>();
    for (StandardIPLSKey standardIPLSKey : EnumSet.<StandardIPLSKey>allOf(StandardIPLSKey.class))
      lookup.put(standardIPLSKey.getKey(), standardIPLSKey); 
  }
  
  StandardIPLSKey(String paramString1) {
    this.key = paramString1;
  }
  
  public static StandardIPLSKey get(String paramString) {
    return lookup.get(paramString);
  }
  
  public static boolean isKey(String paramString) {
    return (get(paramString) != null);
  }
  
  public String getKey() {
    return this.key;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\valuepair\StandardIPLSKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */