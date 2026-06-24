import java.io.Serializable;

public final class h20 implements Serializable {
  public static final h20 e = new h20((byte)1, "eras");
  
  public static final h20 f = new h20((byte)2, "centuries");
  
  public static final h20 g = new h20((byte)3, "weekyears");
  
  public static final h20 h = new h20((byte)4, "years");
  
  public static final h20 i = new h20((byte)5, "months");
  
  public static final h20 j = new h20((byte)6, "weeks");
  
  public static final h20 k = new h20((byte)7, "days");
  
  public static final h20 l = new h20((byte)8, "halfdays");
  
  public static final h20 m = new h20((byte)9, "hours");
  
  public static final h20 n = new h20((byte)10, "minutes");
  
  public static final h20 o = new h20((byte)11, "seconds");
  
  public static final h20 p = new h20((byte)12, "millis");
  
  public final String b;
  
  public final byte c;
  
  public h20(byte paramByte, String paramString) {
    this.b = paramString;
    this.c = paramByte;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof h20) {
      byte b = ((h20)paramObject).c;
      if (this.c == b)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return 1 << this.c;
  }
  
  public final String toString() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */