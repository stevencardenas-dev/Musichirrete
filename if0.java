import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

public final class if0 extends rs implements vx {
  public final Handler e;
  
  public final boolean f;
  
  public final if0 g;
  
  public if0(Handler paramHandler, boolean paramBoolean) {
    if0 if01;
    this.e = paramHandler;
    this.f = paramBoolean;
    if (paramBoolean) {
      if01 = this;
    } else {
      if01 = new if0((Handler)if01, true);
    } 
    this.g = if01;
  }
  
  public final k00 d(long paramLong, wu1 paramwu1, os paramos) {
    long l = paramLong;
    if (paramLong > 4611686018427387903L)
      l = 4611686018427387903L; 
    if (this.e.postDelayed(paramwu1, l))
      return new hf0(this, paramwu1); 
    s(paramos, paramwu1);
    return g21.b;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof if0) {
      paramObject = paramObject;
      if (((if0)paramObject).e == this.e && ((if0)paramObject).f == this.f)
        return true; 
    } 
    return false;
  }
  
  public final void g(long paramLong, ni paramni) {
    vi2 vi2 = new vi2(10, paramni, this);
    long l = paramLong;
    if (paramLong > 4611686018427387903L)
      l = 4611686018427387903L; 
    if (this.e.postDelayed(vi2, l)) {
      paramni.z(new dy(1, this, vi2));
      return;
    } 
    s(paramni.g, vi2);
  }
  
  public final int hashCode() {
    char c;
    int i = System.identityHashCode(this.e);
    if (this.f) {
      c = 'ӏ';
    } else {
      c = 'ӕ';
    } 
    return c ^ i;
  }
  
  public final void m(os paramos, Runnable paramRunnable) {
    if (!this.e.post(paramRunnable))
      s(paramos, paramRunnable); 
  }
  
  public final boolean q(os paramos) {
    return (!this.f || !ui0.c(Looper.myLooper(), this.e.getLooper()));
  }
  
  public final void s(os paramos, Runnable paramRunnable) {
    StringBuilder stringBuilder = new StringBuilder("The task was rejected, the handler underlying the dispatcher '");
    stringBuilder.append(this);
    stringBuilder.append("' was closed");
    g92.j(paramos, new CancellationException(stringBuilder.toString()));
    yw yw = e00.a;
    fw.e.m(paramos, paramRunnable);
  }
  
  public final String toString() {
    String str1;
    String str2;
    yw yw = e00.a;
    if0 if01 = fr0.a;
    if (this == if01) {
      str1 = "Dispatchers.Main";
    } else {
      try {
        if0 if02 = ((if0)str1).g;
      } catch (UnsupportedOperationException unsupportedOperationException1) {
        unsupportedOperationException1 = null;
      } 
      if (this == unsupportedOperationException1) {
        String str = "Dispatchers.Main.immediate";
      } else {
        unsupportedOperationException1 = null;
      } 
    } 
    UnsupportedOperationException unsupportedOperationException2 = unsupportedOperationException1;
    if (unsupportedOperationException1 == null) {
      String str = this.e.toString();
      str2 = str;
      if (this.f) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".immediate");
        str2 = stringBuilder.toString();
      } 
    } 
    return str2;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\if0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */