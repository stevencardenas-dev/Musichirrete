package j$.time;

import j$.time.zone.f;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class ZoneId implements Serializable {
  private static final long serialVersionUID = 8352817235686L;
  
  static {
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry18 = new AbstractMap.SimpleImmutableEntry<String, String>("ACT", "Australia/Darwin");
    byte b = 0;
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry28 = new AbstractMap.SimpleImmutableEntry<String, String>("AET", "Australia/Sydney");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry19 = new AbstractMap.SimpleImmutableEntry<String, String>("AGT", "America/Argentina/Buenos_Aires");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry26 = new AbstractMap.SimpleImmutableEntry<String, String>("ART", "Africa/Cairo");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry25 = new AbstractMap.SimpleImmutableEntry<String, String>("AST", "America/Anchorage");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry11 = new AbstractMap.SimpleImmutableEntry<String, String>("BET", "America/Sao_Paulo");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry9 = new AbstractMap.SimpleImmutableEntry<String, String>("BST", "Asia/Dhaka");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry<String, String>("CAT", "Africa/Harare");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry13 = new AbstractMap.SimpleImmutableEntry<String, String>("CNT", "America/St_Johns");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry6 = new AbstractMap.SimpleImmutableEntry<String, String>("CST", "America/Chicago");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry15 = new AbstractMap.SimpleImmutableEntry<String, String>("CTT", "Asia/Shanghai");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, String>("EAT", "Africa/Addis_Ababa");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry7 = new AbstractMap.SimpleImmutableEntry<String, String>("ECT", "Europe/Paris");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry16 = new AbstractMap.SimpleImmutableEntry<String, String>("IET", "America/Indiana/Indianapolis");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry17 = new AbstractMap.SimpleImmutableEntry<String, String>("IST", "Asia/Kolkata");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry20 = new AbstractMap.SimpleImmutableEntry<String, String>("JST", "Asia/Tokyo");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry10 = new AbstractMap.SimpleImmutableEntry<String, String>("MIT", "Pacific/Apia");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry<String, String>("NET", "Asia/Yerevan");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry12 = new AbstractMap.SimpleImmutableEntry<String, String>("NST", "Pacific/Auckland");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry14 = new AbstractMap.SimpleImmutableEntry<String, String>("PLT", "Asia/Karachi");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry<String, String>("PNT", "America/Phoenix");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry23 = new AbstractMap.SimpleImmutableEntry<String, String>("PRT", "America/Puerto_Rico");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry27 = new AbstractMap.SimpleImmutableEntry<String, String>("PST", "America/Los_Angeles");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry24 = new AbstractMap.SimpleImmutableEntry<String, String>("SST", "Pacific/Guadalcanal");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry21 = new AbstractMap.SimpleImmutableEntry<String, String>("VST", "Asia/Ho_Chi_Minh");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry22 = new AbstractMap.SimpleImmutableEntry<String, String>("EST", "-05:00");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry8 = new AbstractMap.SimpleImmutableEntry<String, String>("MST", "-07:00");
    AbstractMap.SimpleImmutableEntry<String, String> simpleImmutableEntry5 = new AbstractMap.SimpleImmutableEntry<String, String>("HST", "-10:00");
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(28);
    while (b < 28) {
      (new Map.Entry[28])[0] = simpleImmutableEntry18;
      (new Map.Entry[28])[1] = simpleImmutableEntry28;
      (new Map.Entry[28])[2] = simpleImmutableEntry19;
      (new Map.Entry[28])[3] = simpleImmutableEntry26;
      (new Map.Entry[28])[4] = simpleImmutableEntry25;
      (new Map.Entry[28])[5] = simpleImmutableEntry11;
      (new Map.Entry[28])[6] = simpleImmutableEntry9;
      (new Map.Entry[28])[7] = simpleImmutableEntry3;
      (new Map.Entry[28])[8] = simpleImmutableEntry13;
      (new Map.Entry[28])[9] = simpleImmutableEntry6;
      (new Map.Entry[28])[10] = simpleImmutableEntry15;
      (new Map.Entry[28])[11] = simpleImmutableEntry1;
      (new Map.Entry[28])[12] = simpleImmutableEntry7;
      (new Map.Entry[28])[13] = simpleImmutableEntry16;
      (new Map.Entry[28])[14] = simpleImmutableEntry17;
      (new Map.Entry[28])[15] = simpleImmutableEntry20;
      (new Map.Entry[28])[16] = simpleImmutableEntry10;
      (new Map.Entry[28])[17] = simpleImmutableEntry2;
      (new Map.Entry[28])[18] = simpleImmutableEntry12;
      (new Map.Entry[28])[19] = simpleImmutableEntry14;
      (new Map.Entry[28])[20] = simpleImmutableEntry4;
      (new Map.Entry[28])[21] = simpleImmutableEntry23;
      (new Map.Entry[28])[22] = simpleImmutableEntry27;
      (new Map.Entry[28])[23] = simpleImmutableEntry24;
      (new Map.Entry[28])[24] = simpleImmutableEntry21;
      (new Map.Entry[28])[25] = simpleImmutableEntry22;
      (new Map.Entry[28])[26] = simpleImmutableEntry8;
      (new Map.Entry[28])[27] = simpleImmutableEntry5;
      Map.Entry entry = (new Map.Entry[28])[b];
      Object object = entry.getKey();
      Objects.requireNonNull(object);
      entry = (Map.Entry)entry.getValue();
      Objects.requireNonNull(entry);
      if (hashMap.put(object, entry) == null) {
        b++;
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder("duplicate key: ");
      stringBuilder.append(object);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    Collections.unmodifiableMap(hashMap);
  }
  
  public ZoneId() {
    if (getClass() == ZoneOffset.class || getClass() == p.class)
      return; 
    throw new AssertionError("Invalid subclass");
  }
  
  public static ZoneId E(String paramString, int paramInt, boolean paramBoolean) {
    ZoneOffset zoneOffset;
    String str = paramString.substring(0, paramInt);
    if (paramString.length() == paramInt)
      return z(str, ZoneOffset.e); 
    if (paramString.charAt(paramInt) != '+' && paramString.charAt(paramInt) != '-')
      return p.I(paramString, paramBoolean); 
    try {
      zoneOffset = ZoneOffset.I(paramString.substring(paramInt));
      if (zoneOffset == ZoneOffset.e)
        return z(str, zoneOffset); 
    } catch (a a) {}
    return z((String)a, zoneOffset);
  }
  
  public static ZoneId of(String paramString) {
    return t(paramString, true);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  public static ZoneId t(String paramString, boolean paramBoolean) {
    Objects.requireNonNull(paramString, "zoneId");
    return (paramString.length() <= 1 || paramString.startsWith("+") || paramString.startsWith("-")) ? ZoneOffset.I(paramString) : ((paramString.startsWith("UTC") || paramString.startsWith("GMT")) ? E(paramString, 3, paramBoolean) : (paramString.startsWith("UT") ? E(paramString, 2, paramBoolean) : p.I(paramString, paramBoolean)));
  }
  
  private Object writeReplace() {
    return new m((byte)7, this);
  }
  
  public static ZoneId z(String paramString, ZoneOffset paramZoneOffset) {
    Objects.requireNonNull(paramZoneOffset, "offset");
    if (paramString.isEmpty())
      return paramZoneOffset; 
    if (paramString.equals("GMT") || paramString.equals("UTC") || paramString.equals("UT")) {
      String str = paramString;
      if (paramZoneOffset.getTotalSeconds() != 0)
        str = paramString.concat(paramZoneOffset.b); 
      return new p(str, new f(paramZoneOffset));
    } 
    throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(paramString));
  }
  
  public abstract void G(DataOutput paramDataOutput);
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof ZoneId) {
      paramObject = paramObject;
      return getId().equals(paramObject.getId());
    } 
    return false;
  }
  
  public abstract String getId();
  
  public int hashCode() {
    return getId().hashCode();
  }
  
  public abstract f r();
  
  public String toString() {
    return getId();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\ZoneId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */