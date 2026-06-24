import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;

public final class iu implements Serializable {
  public static final iu A;
  
  public static final iu B;
  
  public static final iu f = new iu("era", (byte)1, h20.e);
  
  public static final iu g;
  
  public static final iu h = new iu("centuryOfEra", (byte)3, h20.f);
  
  public static final iu i;
  
  public static final iu j;
  
  public static final iu k;
  
  public static final iu l = new iu("monthOfYear", (byte)7, h20.i);
  
  public static final iu m;
  
  public static final iu n;
  
  public static final iu o;
  
  public static final iu p = new iu("weekOfWeekyear", (byte)11, h20.j);
  
  public static final iu q;
  
  public static final iu r = new iu("halfdayOfDay", (byte)13, h20.l);
  
  public static final iu s;
  
  public static final iu t;
  
  public static final iu u;
  
  public static final iu v;
  
  public static final iu w;
  
  public static final iu x;
  
  public static final iu y;
  
  public static final iu z;
  
  public final String b;
  
  public final byte c;
  
  public final transient h20 e;
  
  static {
    h201 = h20.m;
    s = new iu("hourOfHalfday", (byte)14, h201);
    t = new iu("clockhourOfHalfday", (byte)15, h201);
    u = new iu("clockhourOfDay", (byte)16, h201);
    v = new iu(KjdXPYm.LujSf, (byte)17, h201);
    h201 = h20.n;
    w = new iu("minuteOfDay", (byte)18, h201);
    x = new iu("minuteOfHour", (byte)19, h201);
    h201 = h20.o;
    y = new iu("secondOfDay", (byte)20, h201);
    z = new iu("secondOfMinute", (byte)21, h201);
    h201 = h20.p;
    A = new iu("millisOfDay", (byte)22, h201);
    B = new iu(oXrNDUqUkE.CSjEmdjkk, (byte)23, h201);
  }
  
  public iu(String paramString, byte paramByte, h20 paramh20) {
    this.b = paramString;
    this.c = paramByte;
    this.e = paramh20;
  }
  
  public final hu a(dd1 paramdd1) {
    AtomicReference atomicReference = ev.a;
    dd1 dd11 = paramdd1;
    if (paramdd1 == null)
      dd11 = xg0.T0(); 
    switch (this.c) {
      default:
        throw new InternalError();
      case 23:
        return dd11.U();
      case 22:
        return dd11.T();
      case 21:
        return dd11.n0();
      case 20:
        return dd11.m0();
      case 19:
        return dd11.X();
      case 18:
        return dd11.W();
      case 17:
        return dd11.K();
      case 16:
        return dd11.g();
      case 15:
        return dd11.h();
      case 14:
        return dd11.L();
      case 13:
        return dd11.H();
      case 12:
        return dd11.n();
      case 11:
        return dd11.t0();
      case 10:
        return dd11.v0();
      case 9:
        return dd11.w0();
      case 8:
        return dd11.m();
      case 7:
        return dd11.Z();
      case 6:
        return dd11.o();
      case 5:
        return dd11.B0();
      case 4:
        return dd11.C0();
      case 3:
        return dd11.e();
      case 2:
        return dd11.D0();
      case 1:
        break;
    } 
    return dd11.r();
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof iu) {
      byte b = ((iu)paramObject).c;
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
  
  static {
    h20 h201 = h20.h;
    g = new iu("yearOfEra", (byte)2, h201);
  }
  
  static {
    i = new iu("yearOfCentury", (byte)4, h201);
    j = new iu("year", (byte)5, h201);
    h20 h202 = h20.k;
    k = new iu("dayOfYear", (byte)6, h202);
  }
  
  static {
    m = new iu("dayOfMonth", (byte)8, h202);
    h201 = h20.g;
    n = new iu("weekyearOfCentury", (byte)9, h201);
    o = new iu(CKYHNesT.BcJSrjF, (byte)10, h201);
  }
  
  static {
    q = new iu("dayOfWeek", (byte)12, h202);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */