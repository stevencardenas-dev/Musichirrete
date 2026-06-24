public final class nw {
  public final uv a;
  
  public final long b;
  
  public final long c;
  
  public final long d;
  
  public final long e;
  
  public final long f;
  
  public final int g;
  
  public final boolean h;
  
  public final long i;
  
  public int j;
  
  public boolean k;
  
  public boolean l;
  
  public nw(uv paramuv) {
    a(0, "bufferForPlaybackMs", "0");
    a(0, "bufferForPlaybackAfterRebufferMs", "0");
    a(0, "minBufferAudioMs", "bufferForPlaybackMs");
    a(0, "minBufferVideoMs", "bufferForPlaybackMs");
    a(0, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
    a(0, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
    a(300, "maxBufferMs", "minBufferAudioMs");
    a(300, "maxBufferMs", "minBufferVideoMs");
    a(0, "backBufferDurationMs", "0");
    this.a = paramuv;
    long l = rh.a(0L);
    this.b = l;
    this.c = l;
    this.d = rh.a(300L);
    this.e = l;
    this.f = l;
    this.g = -1;
    this.h = true;
    this.i = l;
  }
  
  public static void a(int paramInt, String paramString1, String paramString2) {
    if (paramInt >= 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    paramString1 = x41.l(paramString1, " cannot be less than ", paramString2);
    if (paramInt != 0)
      return; 
    l0.l(paramString1);
  }
  
  public final void b(boolean paramBoolean) {
    this.j = 0;
    this.k = false;
    if (paramBoolean) {
      uv uv1 = this.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{uv}, name=null} */
      try {
        if (uv1.a)
          uv1.a(0); 
      } finally {
        Exception exception;
      } 
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{uv}, name=null} */
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */