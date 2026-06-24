import android.os.SystemClock;

public final class l60 extends Exception {
  public final int b;
  
  public final int c;
  
  public final la0 e;
  
  public final int f;
  
  public l60(int paramInt, Throwable paramThrowable) {
    this(paramInt, paramThrowable, -1, null, 4);
  }
  
  public l60(int paramInt1, Throwable paramThrowable, int paramInt2, la0 paramla0, int paramInt3) {
    super(paramThrowable);
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramla0;
    this.f = paramInt3;
    SystemClock.elapsedRealtime();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */