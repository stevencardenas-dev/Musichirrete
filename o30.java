import android.content.Context;
import android.graphics.Color;

public final class o30 {
  public static final int f = (int)Math.round(5.1000000000000005D);
  
  public final boolean a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final float e;
  
  public o30(Context paramContext) {
    this.a = bool;
    this.b = j;
    this.c = k;
    this.d = i;
    this.e = f;
  }
  
  public final int a(int paramInt, float paramFloat) {
    if (this.a && jn.i(paramInt, 255) == this.d) {
      float f = this.e;
      if (f <= 0.0F || paramFloat <= 0.0F) {
        paramFloat = 0.0F;
      } else {
        paramFloat = Math.min(((float)Math.log1p((paramFloat / f)) * 4.5F + 2.0F) / 100.0F, 1.0F);
      } 
      int j = Color.alpha(paramInt);
      int i = m92.L(paramFloat, jn.i(paramInt, 255), this.b);
      paramInt = i;
      if (paramFloat > 0.0F) {
        int k = this.c;
        paramInt = i;
        if (k != 0)
          paramInt = jn.g(jn.i(k, f), i); 
      } 
      return jn.i(paramInt, j);
    } 
    return paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */