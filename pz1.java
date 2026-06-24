import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public abstract class pz1 {
  public static final fz1 A;
  
  public static final fz1 B;
  
  public static final s40 C;
  
  public static final fz1 a = new fz1(Class.class, (new vy1()).a(), 0);
  
  public static final fz1 b = new fz1(BitSet.class, (new ez1()).a(), 0);
  
  public static final iz1 c = new iz1();
  
  public static final gz1 d;
  
  public static final gz1 e;
  
  public static final gz1 f;
  
  public static final gz1 g;
  
  public static final fz1 h = new fz1(AtomicInteger.class, (new mz1()).a(), 0);
  
  public static final fz1 i = new fz1(AtomicBoolean.class, (new ly1()).a(), 0);
  
  public static final fz1 j = new fz1(AtomicIntegerArray.class, (new my1()).a(), 0);
  
  public static final oy1 k = new oy1();
  
  public static final nz1 l = new nz1(1, true);
  
  public static final nz1 m = new nz1(0, true);
  
  public static final gz1 n;
  
  public static final fz1 o = new fz1(BigDecimal.class, new sy1(), 0);
  
  public static final fz1 p = new fz1(BigInteger.class, new ty1(), 0);
  
  public static final fz1 q = new fz1(ul0.class, new uy1(), 0);
  
  public static final fz1 r;
  
  public static final fz1 s = new fz1(StringBuilder.class, new wy1(), 0);
  
  public static final fz1 t = new fz1(StringBuffer.class, new xy1(), 0);
  
  public static final fz1 u = new fz1(URL.class, new yy1(), 0);
  
  public static final fz1 v = new fz1(URI.class, new zy1(), 0);
  
  public static final fz1 w = new fz1(InetAddress.class, new az1(), 1);
  
  public static final fz1 x = new fz1(UUID.class, new bz1(), 0);
  
  public static final fz1 y = new fz1(Currency.class, (new cz1()).a(), 0);
  
  public static final b31 z = new b31(new qj0(8, new String[] { "year", "month", "dayOfMonth", "hourOfDay", "minute", "second" }), 1);
  
  static {
    A = new fz1(Locale.class, new dz1(), 0);
    B = new fz1(nk0.class, ok0.a, 1);
    C = t40.d;
  }
  
  public static void a(double paramDouble) {
    if (!Double.isNaN(paramDouble) && !Double.isInfinite(paramDouble))
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramDouble);
    stringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static int b(long paramLong) {
    int i = (int)paramLong;
    if (i == paramLong)
      return i; 
    StringBuilder stringBuilder = new StringBuilder("Too big for an int: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  static {
    hz1 hz1 = new hz1();
  }
  
  static {
    d = new gz1(boolean.class, Boolean.class, hz1);
    jz1 jz1 = new jz1();
    e = new gz1(byte.class, Byte.class, jz1);
    kz1 kz1 = new kz1();
    f = new gz1(short.class, Short.class, kz1);
    lz1 lz1 = new lz1();
    g = new gz1(int.class, Integer.class, lz1);
  }
  
  static {
    new py1();
    new nz1(1, false);
  }
  
  static {
    new nz1(0, false);
  }
  
  static {
    qy1 qy1 = new qy1();
    n = new gz1(char.class, Character.class, qy1);
    ry1 ry1 = new ry1();
  }
  
  static {
    r = new fz1(String.class, ry1, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */