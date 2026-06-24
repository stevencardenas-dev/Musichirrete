import android.content.Context;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;

public final class xa extends et {
  public final Context a;
  
  public final am b;
  
  public final am c;
  
  public final String d;
  
  public xa(Context paramContext, am paramam1, am paramam2, String paramString) {
    if (paramContext != null) {
      this.a = paramContext;
      if (paramam1 != null) {
        this.b = paramam1;
        if (paramam2 != null) {
          this.c = paramam2;
          if (paramString != null) {
            this.d = paramString;
            return;
          } 
          k91.h("Null backendName");
          throw null;
        } 
        k91.h("Null monotonicClock");
        throw null;
      } 
      k91.h(FgdLmmRfTxSFKI.ERbwUZOSLM);
      throw null;
    } 
    k91.h("Null applicationContext");
    throw null;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof et) {
      xa xa1 = (xa)paramObject;
      paramObject = xa1.a;
      if (this.a.equals(paramObject) && this.b.equals(xa1.b) && this.c.equals(xa1.c) && this.d.equals(xa1.d))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int j = this.a.hashCode();
    int i = this.b.hashCode();
    int k = this.c.hashCode();
    return this.d.hashCode() ^ (((j ^ 0xF4243) * 1000003 ^ i) * 1000003 ^ k) * 1000003;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("CreationContext{applicationContext=");
    stringBuilder.append(this.a);
    stringBuilder.append(", wallClock=");
    stringBuilder.append(this.b);
    stringBuilder.append(", monotonicClock=");
    stringBuilder.append(this.c);
    stringBuilder.append(", backendName=");
    return x41.n(stringBuilder, this.d, "}");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */