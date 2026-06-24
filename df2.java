import android.os.Looper;
import java.util.Locale;

public final class df2 {
  public static final Object i = new Object();
  
  public final rp0 a;
  
  public final long b;
  
  public final String c;
  
  public final cl d;
  
  public long e;
  
  public long f;
  
  public ye2 g;
  
  public yi1 h;
  
  public df2(long paramLong, String paramString) {
    this.b = paramLong;
    this.c = paramString;
    this.e = -1L;
    this.f = 0L;
    this.d = new cl(Looper.getMainLooper(), 6);
    this.a = new rp0("RequestTracker", paramString);
  }
  
  public final void a(long paramLong, ye2 paramye2) {
    long l = System.currentTimeMillis();
    synchronized (i) {
      ye2 ye21 = this.g;
      long l2 = this.e;
      long l1 = this.f;
      this.e = paramLong;
      this.g = paramye2;
      this.f = l;
      if (ye21 != null)
        ye21.o(this.c, l2, l1, l); 
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        yi1 yi12 = this.h;
        if (yi12 != null)
          this.d.removeCallbacks(yi12); 
      } finally {}
      yi1 yi11 = new yi1();
      this(18, this);
      this.h = yi11;
      this.d.postDelayed(yi11, this.b);
      return;
    } 
  }
  
  public final boolean b() {
    synchronized (i) {
      boolean bool;
      if (this.e != -1L) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public final boolean c(long paramLong) {
    synchronized (i) {
      long l = this.e;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (l != -1L) {
        bool1 = bool2;
        if (l == paramLong)
          bool1 = true; 
      } 
      return bool1;
    } 
  }
  
  public final void d(long paramLong, int paramInt, fb0 paramfb0) {
    Object object = i;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (c(paramLong)) {
        Locale locale = Locale.ROOT;
        StringBuilder stringBuilder = new StringBuilder();
        this("request ");
        stringBuilder.append(paramLong);
        stringBuilder.append(" completed");
        f(paramInt, paramfb0, stringBuilder.toString());
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public final boolean e(int paramInt) {
    Object object = i;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (b()) {
        Locale locale = Locale.ROOT;
        long l = this.e;
        StringBuilder stringBuilder = new StringBuilder();
        this("clearing request ");
        stringBuilder.append(l);
        f(paramInt, null, stringBuilder.toString());
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return true;
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    return false;
  }
  
  public final void f(int paramInt, Object paramObject, String paramString) {
    this.a.b(paramString, new Object[0]);
    Object object = i;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (this.g != null) {
        long l = System.currentTimeMillis();
        ye2 ye21 = this.g;
        n21.m(ye21);
        ye21.f(this.c, this.e, paramInt, paramObject, this.f, l);
      } 
    } finally {}
    this.e = -1L;
    this.g = null;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      paramObject = this.h;
      if (paramObject == null) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      } else {
        this.d.removeCallbacks((Runnable)paramObject);
        this.h = null;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\df2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */