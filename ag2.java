import android.os.SystemClock;

public final class ag2 extends dd1 {
  public final int p;
  
  public final long F0() {
    switch (this.p) {
      default:
        return SystemClock.elapsedRealtime() * 1000000L;
      case 0:
        break;
    } 
    return SystemClock.elapsedRealtimeNanos();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ag2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */