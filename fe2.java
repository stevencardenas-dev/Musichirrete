import android.util.Log;
import java.util.Objects;

public final class fe2 implements ye2 {
  public final int b;
  
  public final ye2 c;
  
  public final te2 e;
  
  public fe2(te2 paramte2, ye2 paramye2, int paramInt) {
    this.c = paramye2;
    Objects.requireNonNull(paramte2);
    this.e = paramte2;
  }
  
  public final void f(String paramString, long paramLong1, int paramInt, Object paramObject, long paramLong2, long paramLong3) {
    int i = this.b;
    te2 te21 = this.e;
    switch (i) {
      default:
        ye21 = this.c;
        if (ye21 != null) {
          if (paramInt == 2001) {
            paramInt = te21.i;
            rp0 rp0 = te21.a;
            Log.w(rp0.a, rp0.c("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", new Object[] { Integer.valueOf(paramInt) }));
            for (zk zk : ((nf1)te21.h.c).h) {
              switch (zk.a) {
                case 1:
                  ((rt0)zk.b).b();
                  break;
              } 
            } 
            paramInt = 2001;
          } 
          ye21.f(paramString, paramLong1, paramInt, paramObject, paramLong2, paramLong3);
        } 
        return;
      case 0:
        break;
    } 
    te21.g = null;
    ye2 ye21 = this.c;
    if (ye21 != null)
      ye21.f(paramString, paramLong1, paramInt, paramObject, paramLong2, paramLong3); 
  }
  
  public final void o(String paramString, long paramLong1, long paramLong2, long paramLong3) {
    switch (this.b) {
      default:
        ye21 = this.c;
        if (ye21 != null)
          ye21.o(paramString, paramLong1, paramLong2, paramLong3); 
        return;
      case 0:
        break;
    } 
    ye2 ye21 = this.c;
    if (ye21 != null)
      ye21.o(paramString, paramLong1, paramLong2, paramLong3); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fe2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */