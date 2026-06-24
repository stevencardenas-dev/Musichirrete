import android.view.View;
import java.util.ArrayList;

public final class h80 {
  public int a = Integer.MAX_VALUE;
  
  public int b = Integer.MAX_VALUE;
  
  public int c = Integer.MIN_VALUE;
  
  public int d = Integer.MIN_VALUE;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public float j;
  
  public float k;
  
  public int l;
  
  public int m;
  
  public final ArrayList n = new ArrayList();
  
  public int o;
  
  public int p;
  
  public boolean q;
  
  public boolean r;
  
  public final int a() {
    return this.h - this.i;
  }
  
  public final void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    g80 g80 = (g80)paramView.getLayoutParams();
    this.a = Math.min(this.a, paramView.getLeft() - g80.s() - paramInt1);
    this.b = Math.min(this.b, paramView.getTop() - g80.v() - paramInt2);
    paramInt1 = this.c;
    paramInt2 = paramView.getRight();
    this.c = Math.max(paramInt1, g80.k() + paramInt2 + paramInt3);
    paramInt1 = this.d;
    paramInt2 = paramView.getBottom();
    this.d = Math.max(paramInt1, g80.r() + paramInt2 + paramInt4);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */