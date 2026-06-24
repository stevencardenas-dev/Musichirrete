import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

public final class ca {
  public long A;
  
  public boolean B;
  
  public long C;
  
  public long D;
  
  public final bh0 a;
  
  public final long[] b;
  
  public AudioTrack c;
  
  public int d;
  
  public int e;
  
  public ba f;
  
  public int g;
  
  public boolean h;
  
  public long i;
  
  public long j;
  
  public long k;
  
  public Method l;
  
  public long m;
  
  public boolean n;
  
  public boolean o;
  
  public long p;
  
  public long q;
  
  public long r;
  
  public long s;
  
  public int t;
  
  public int u;
  
  public long v;
  
  public long w;
  
  public long x;
  
  public long y;
  
  public long z;
  
  public ca(bh0 parambh0) {
    this.a = parambh0;
    if (d12.a >= 18)
      try {
        this.l = AudioTrack.class.getMethod("getLatency", null);
      } catch (NoSuchMethodException noSuchMethodException) {} 
    this.b = new long[10];
  }
  
  public final long a() {
    AudioTrack audioTrack = this.c;
    audioTrack.getClass();
    if (this.v != -9223372036854775807L) {
      long l = (SystemClock.elapsedRealtime() * 1000L - this.v) * this.g / 1000000L;
      return Math.min(this.y, this.x + l);
    } 
    int i = audioTrack.getPlayState();
    if (i == 1)
      return 0L; 
    long l2 = audioTrack.getPlaybackHeadPosition() & 0xFFFFFFFFL;
    long l1 = l2;
    if (this.h) {
      if (i == 2 && l2 == 0L)
        this.s = this.q; 
      l1 = l2 + this.s;
    } 
    if (d12.a <= 29) {
      if (l1 == 0L && this.q > 0L && i == 3) {
        if (this.w == -9223372036854775807L)
          this.w = SystemClock.elapsedRealtime(); 
        return this.q;
      } 
      this.w = -9223372036854775807L;
    } 
    if (this.q > l1)
      this.r++; 
    this.q = l1;
    return l1 + (this.r << 32L);
  }
  
  public final boolean b(long paramLong) {
    if (paramLong <= a()) {
      if (this.h) {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2 && a() == 0L)
          return true; 
      } 
      return false;
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */