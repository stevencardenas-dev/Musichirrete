package j$.time;

import j$.time.zone.f;
import j$.time.zone.g;
import j$.time.zone.i;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

public final class p extends ZoneId {
  public static final int c = 0;
  
  private static final long serialVersionUID = 8386373296231747096L;
  
  public final String a;
  
  public final transient f b;
  
  public p(String paramString, f paramf) {
    this.a = paramString;
    this.b = paramf;
  }
  
  public static p I(String paramString, boolean paramBoolean) {
    Objects.requireNonNull(paramString, "zoneId");
    int i = paramString.length();
    if (i >= 2) {
      byte b = 0;
      while (b < i) {
        char c = paramString.charAt(b);
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == '/' && b != 0) || (c >= '0' && c <= '9' && b != 0) || (c == '~' && b != 0) || (c == '.' && b != 0) || (c == '_' && b != 0) || (c == '+' && b != 0) || (c == '-' && b != 0)) {
          b++;
          continue;
        } 
        throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(paramString));
      } 
      try {
        f f1 = i.a(paramString);
      } catch (g g) {
        if (!paramBoolean) {
          g = null;
          return new p(paramString, (f)g);
        } 
      } 
      return new p(paramString, (f)g);
    } 
    throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(paramString));
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    return new m((byte)7, this);
  }
  
  public final void G(DataOutput paramDataOutput) {
    paramDataOutput.writeByte(7);
    paramDataOutput.writeUTF(this.a);
  }
  
  public final String getId() {
    return this.a;
  }
  
  public final f r() {
    f f1 = this.b;
    return (f1 != null) ? f1 : i.a(this.a);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */