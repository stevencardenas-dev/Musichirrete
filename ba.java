import android.media.AudioTrack;

public final class ba {
  public final aa a;
  
  public int b;
  
  public long c;
  
  public long d;
  
  public long e;
  
  public long f;
  
  public ba(AudioTrack paramAudioTrack) {
    if (d12.a >= 19) {
      this.a = new aa(paramAudioTrack);
      a();
      return;
    } 
    this.a = null;
    b(3);
  }
  
  public final void a() {
    if (this.a != null)
      b(0); 
  }
  
  public final void b(int paramInt) {
    this.b = paramInt;
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2 && paramInt != 3) {
          if (paramInt == 4) {
            this.d = 500000L;
            return;
          } 
          throw new IllegalStateException();
        } 
        this.d = 10000000L;
        return;
      } 
      this.d = 10000L;
      return;
    } 
    this.e = 0L;
    this.f = -1L;
    this.c = System.nanoTime() / 1000L;
    this.d = 10000L;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */