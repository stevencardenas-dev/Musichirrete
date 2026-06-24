import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public final class vl1 {
  public static final hf1 m = new hf1(0.5F);
  
  public z51 a = (z51)new Object();
  
  public z51 b = (z51)new Object();
  
  public z51 c = (z51)new Object();
  
  public z51 d = (z51)new Object();
  
  public ls e = new k(0.0F);
  
  public ls f = new k(0.0F);
  
  public ls g = new k(0.0F);
  
  public ls h = new k(0.0F);
  
  public j30 i = (j30)new Object();
  
  public j30 j = (j30)new Object();
  
  public j30 k = (j30)new Object();
  
  public j30 l = (j30)new Object();
  
  public static ul1 a(Context paramContext, int paramInt1, int paramInt2, ls paramls) {
    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(paramContext, paramInt1);
    if (paramInt2 != 0)
      contextThemeWrapper.getTheme().applyStyle(paramInt2, true); 
    TypedArray typedArray = contextThemeWrapper.obtainStyledAttributes(zb1.A);
    try {
      int j = typedArray.getInt(0, 0);
      paramInt1 = typedArray.getInt(3, j);
      paramInt2 = typedArray.getInt(4, j);
      int i = typedArray.getInt(2, j);
      j = typedArray.getInt(1, j);
      ls ls3 = c(typedArray, 5, paramls);
      ls ls1 = c(typedArray, 8, ls3);
      ls ls2 = c(typedArray, 9, ls3);
      paramls = c(typedArray, 7, ls3);
      ls ls4 = c(typedArray, 6, ls3);
      ul1 ul1 = new ul1();
      this();
      ul1.a = zo2.g(paramInt1);
      ul1.e = ls1;
      ul1.b = zo2.g(paramInt2);
      ul1.f = ls2;
      ul1.c = zo2.g(i);
      ul1.g = paramls;
      ul1.d = zo2.g(j);
      ul1.h = ls4;
      return ul1;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static ul1 b(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    k k = new k(0.0F);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, zb1.t, paramInt1, paramInt2);
    paramInt2 = typedArray.getResourceId(0, 0);
    paramInt1 = typedArray.getResourceId(1, 0);
    typedArray.recycle();
    return a(paramContext, paramInt2, paramInt1, k);
  }
  
  public static ls c(TypedArray paramTypedArray, int paramInt, ls paramls) {
    TypedValue typedValue = paramTypedArray.peekValue(paramInt);
    if (typedValue != null) {
      paramInt = typedValue.type;
      if (paramInt == 5)
        return new k(TypedValue.complexToDimensionPixelSize(typedValue.data, paramTypedArray.getResources().getDisplayMetrics())); 
      if (paramInt == 6)
        return new hf1(typedValue.getFraction(1.0F, 1.0F)); 
    } 
    return paramls;
  }
  
  public final boolean d() {
    return (this.b instanceof lh1 && this.a instanceof lh1 && this.c instanceof lh1 && this.d instanceof lh1);
  }
  
  public final boolean e(RectF paramRectF) {
    boolean bool1;
    boolean bool2;
    if (this.l.getClass().equals(j30.class) && this.j.getClass().equals(j30.class) && this.i.getClass().equals(j30.class) && this.k.getClass().equals(j30.class)) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    float f = this.e.a(paramRectF);
    if (this.f.a(paramRectF) == f && this.h.a(paramRectF) == f && this.g.a(paramRectF) == f) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    return (bool1 && bool2 && d());
  }
  
  public final ul1 f() {
    Object object = new Object();
    ((ul1)object).a = this.a;
    ((ul1)object).b = this.b;
    ((ul1)object).c = this.c;
    ((ul1)object).d = this.d;
    ((ul1)object).e = this.e;
    ((ul1)object).f = this.f;
    ((ul1)object).g = this.g;
    ((ul1)object).h = this.h;
    ((ul1)object).i = this.i;
    ((ul1)object).j = this.j;
    ((ul1)object).k = this.k;
    ((ul1)object).l = this.l;
    return (ul1)object;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(zLtYiJUm.sNWLUylnx);
    stringBuilder.append(this.e);
    stringBuilder.append(", ");
    stringBuilder.append(this.f);
    stringBuilder.append(", ");
    stringBuilder.append(this.g);
    stringBuilder.append(", ");
    stringBuilder.append(this.h);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */