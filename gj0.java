import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public abstract class gj0 {
  public static final fj0 b = new fj0(0);
  
  public static final fj0 c = new fj0(1);
  
  public int a = -1;
  
  public gj0() {}
  
  public gj0(int paramInt) {}
  
  public static int b(int paramInt1, int paramInt2) {
    int j = paramInt1 & 0x303030;
    if (j == 0)
      return paramInt1; 
    int i = paramInt1 & (j ^ 0xFFFFFFFF);
    if (paramInt2 == 0) {
      paramInt1 = j >> 2;
      paramInt2 = i;
      return paramInt2 | paramInt1;
    } 
    paramInt1 = j >> 1;
    paramInt2 = i | 0xFFCFCFCF & paramInt1;
    paramInt1 = (paramInt1 & 0x303030) >> 2;
    return paramInt2 | paramInt1;
  }
  
  public static int c(int paramInt1, int paramInt2) {
    int i = paramInt1 & 0xC0C0C;
    if (i == 0)
      return paramInt1; 
    paramInt1 &= i ^ 0xFFFFFFFF;
    if (paramInt2 == 0) {
      paramInt2 = i << 2;
      return paramInt1 | paramInt2;
    } 
    paramInt2 = i << 1;
    paramInt1 |= 0xFFF3F3F3 & paramInt2;
    paramInt2 = (paramInt2 & 0xC0C0C) << 2;
    return paramInt1 | paramInt2;
  }
  
  public static int m(int paramInt1, int paramInt2) {
    return paramInt2 << paramInt1 * 8;
  }
  
  public static void n(RecyclerView paramRecyclerView, he1 paramhe1, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    View view = paramhe1.b;
    if (paramBoolean && view.getTag(2131296831) == null) {
      WeakHashMap weakHashMap = v22.a;
      float f2 = view.getElevation();
      int i = paramRecyclerView.getChildCount();
      float f1 = 0.0F;
      byte b = 0;
      while (b < i) {
        float f;
        View view1 = paramRecyclerView.getChildAt(b);
        if (view1 == view) {
          f = f1;
        } else {
          WeakHashMap weakHashMap1 = v22.a;
          float f3 = view1.getElevation();
          f = f1;
          if (f3 > f1)
            f = f3; 
        } 
        b++;
        f1 = f;
      } 
      view.setElevation(f1 + 1.0F);
      view.setTag(2131296831, Float.valueOf(f2));
    } 
    view.setTranslationX(paramFloat1);
    view.setTranslationY(paramFloat2);
  }
  
  public void a(RecyclerView paramRecyclerView, he1 paramhe1) {
    View view = paramhe1.b;
    Object object = view.getTag(2131296831);
    if (object instanceof Float) {
      float f = ((Float)object).floatValue();
      object = v22.a;
      view.setElevation(f);
    } 
    view.setTag(2131296831, null);
    view.setTranslationX(0.0F);
    view.setTranslationY(0.0F);
  }
  
  public abstract int d();
  
  public abstract int e();
  
  public abstract int f();
  
  public abstract int g();
  
  public abstract int h();
  
  public abstract int i();
  
  public int j(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, long paramLong) {
    if (this.a == -1)
      this.a = paramRecyclerView.getResources().getDimensionPixelSize(2131165403); 
    int k = this.a;
    int j = Math.abs(paramInt2);
    int i = (int)Math.signum(paramInt2);
    float f2 = j;
    float f1 = 1.0F;
    float f3 = Math.min(1.0F, f2 * 1.0F / paramInt1);
    f2 = (i * k);
    paramInt1 = (int)(c.getInterpolation(f3) * f2);
    if (paramLong <= 2000L)
      f1 = (float)paramLong / 2000.0F; 
    f2 = paramInt1;
    paramInt1 = (int)(b.getInterpolation(f1) * f2);
    return (paramInt1 == 0) ? ((paramInt2 > 0) ? 1 : -1) : paramInt1;
  }
  
  public boolean k() {
    return this instanceof f10 ^ true;
  }
  
  public boolean l() {
    return this instanceof f10 ^ true;
  }
  
  public abstract boolean o(RecyclerView paramRecyclerView, he1 paramhe11, he1 paramhe12);
  
  public abstract void p(he1 paramhe1);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */