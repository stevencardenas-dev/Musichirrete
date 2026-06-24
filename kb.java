import android.window.BackEvent;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;

public final class kb {
  public final float a;
  
  public final float b;
  
  public final float c;
  
  public final int d;
  
  public final long e;
  
  public kb(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, long paramLong) {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramInt;
    this.e = paramLong;
  }
  
  public kb(BackEvent paramBackEvent) {
    this(f1, f2, f3, i, l);
  }
  
  public kb(b11 paramb11) {
    this(paramb11.c, paramb11.d, paramb11.b, paramb11.a, paramb11.e);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("BackEventCompat(touchX=");
    stringBuilder.append(this.a);
    stringBuilder.append(KjdXPYm.mSWhXxhI);
    stringBuilder.append(this.b);
    stringBuilder.append(", progress=");
    stringBuilder.append(this.c);
    stringBuilder.append(", swipeEdge=");
    stringBuilder.append(this.d);
    stringBuilder.append(", frameTimeMillis=");
    stringBuilder.append(this.e);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */