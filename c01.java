import android.media.AudioTrack;

public final class c01 {
  public final boolean a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final int e;
  
  public final int f;
  
  public final int g;
  
  public final int h;
  
  public final boolean i;
  
  public final u9[] j;
  
  public c01(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, u9[] paramArrayOfu9) {
    this.a = paramBoolean;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
    this.f = paramInt5;
    this.g = paramInt6;
    if (paramInt7 != 0) {
      this.h = paramInt7;
      this.i = true;
      this.j = paramArrayOfu9;
      return;
    } 
    if (paramBoolean) {
      paramInt1 = AudioTrack.getMinBufferSize(paramInt4, paramInt5, paramInt6);
      if (paramInt1 != -2) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      } 
      n21.r(paramBoolean);
      paramInt2 = (int)(250000L * paramInt4 / 1000000L);
      paramInt5 = (int)Math.max(paramInt1, 750000L * paramInt4 / 1000000L * paramInt3);
      paramInt4 = d12.a;
      paramInt1 = Math.max(paramInt2 * paramInt3, Math.min(paramInt1 * 4, paramInt5));
    } else {
      if (paramInt6 != 5) {
        if (paramInt6 != 6)
          if (paramInt6 != 7) {
            if (paramInt6 != 8) {
              if (paramInt6 != 14) {
                if (paramInt6 != 17) {
                  if (paramInt6 != 18) {
                    l0.k();
                    throw null;
                  } 
                } else {
                  paramInt1 = 336000;
                  paramInt2 = paramInt1;
                } 
              } else {
                paramInt1 = 3062500;
                paramInt2 = paramInt1;
              } 
            } else {
              paramInt1 = 2250000;
              paramInt2 = paramInt1;
            } 
          } else {
            paramInt1 = 192000;
            paramInt2 = paramInt1;
          }  
        paramInt1 = 768000;
      } else {
        paramInt1 = 80000;
      } 
      paramInt2 = paramInt1;
    } 
    paramInt7 = paramInt1;
    this.h = paramInt7;
    this.i = true;
    this.j = paramArrayOfu9;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */