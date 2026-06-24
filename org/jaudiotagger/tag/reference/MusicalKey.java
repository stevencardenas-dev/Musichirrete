package org.jaudiotagger.tag.reference;

import android.window.ldG.XUaAMlaMSa;
import java.util.EnumSet;
import java.util.HashMap;

public enum MusicalKey {
  FLAT, MINOR, NOTE_A, NOTE_B, NOTE_C, NOTE_D, NOTE_E, NOTE_F, NOTE_G, OFF_KEY, SHARP;
  
  private static final MusicalKey[] $VALUES;
  
  private static final int MAX_KEY_LENGTH = 3;
  
  private static final HashMap<String, MusicalKey> groundKeyMap;
  
  private static final HashMap<String, MusicalKey> halfKeyMap;
  
  private String value;
  
  static {
    MusicalKey musicalKey5 = new MusicalKey("NOTE_A", 0, "A");
    NOTE_A = musicalKey5;
    MusicalKey musicalKey3 = new MusicalKey("NOTE_B", 1, "B");
    NOTE_B = musicalKey3;
    musicalKey2 = new MusicalKey("NOTE_C", 2, "C");
    NOTE_C = musicalKey2;
    MusicalKey musicalKey6 = new MusicalKey("NOTE_D", 3, "D");
    NOTE_D = musicalKey6;
    MusicalKey musicalKey7 = new MusicalKey("NOTE_E", 4, "E");
    NOTE_E = musicalKey7;
    MusicalKey musicalKey1 = new MusicalKey("NOTE_F", 5, "F");
    NOTE_F = musicalKey1;
    MusicalKey musicalKey4 = new MusicalKey("NOTE_G", 6, XUaAMlaMSa.iUcXwuBPkiQPL);
    NOTE_G = musicalKey4;
    FLAT = new MusicalKey("FLAT", 7, "b");
    SHARP = new MusicalKey("SHARP", 8, "#");
    MINOR = new MusicalKey("MINOR", 9, "m");
    OFF_KEY = new MusicalKey("OFF_KEY", 10, "o");
    $VALUES = $values();
    EnumSet<MusicalKey> enumSet = EnumSet.of(musicalKey5, new MusicalKey[] { musicalKey3, musicalKey2, musicalKey6, musicalKey7, musicalKey1, musicalKey4 });
    groundKeyMap = new HashMap<String, MusicalKey>((values()).length);
    for (MusicalKey musicalKey2 : enumSet)
      groundKeyMap.put(musicalKey2.getValue(), musicalKey2); 
    enumSet = EnumSet.of(FLAT, SHARP, MINOR);
    halfKeyMap = new HashMap<String, MusicalKey>((values()).length);
    for (MusicalKey musicalKey2 : enumSet)
      halfKeyMap.put(musicalKey2.getValue(), musicalKey2); 
  }
  
  MusicalKey(String paramString1) {
    this.value = paramString1;
  }
  
  public static boolean isValid(String paramString) {
    return (paramString == null || paramString.length() > 3 || paramString.length() == 0) ? false : ((paramString.length() == 1 && paramString.equals(OFF_KEY.getValue())) ? true : (!groundKeyMap.containsKey(paramString.substring(0, 1)) ? false : (((paramString.length() == 2 || paramString.length() == 3) && !halfKeyMap.containsKey(paramString.substring(1, 2))) ? false : (!(paramString.length() == 3 && !paramString.substring(2, 3).equals(MINOR.getValue()))))));
  }
  
  public String getValue() {
    return this.value;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\reference\MusicalKey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */