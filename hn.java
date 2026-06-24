import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.PathInterpolator;

public final class hn {
  public final int a;
  
  public final wa1 b;
  
  public fi0 c;
  
  public fi0 d;
  
  public xa1 e;
  
  public final ColorDrawable f;
  
  public boolean g;
  
  public int h;
  
  static {
    new PathInterpolator(0.0F, 0.0F, 0.0F, 1.0F);
    new PathInterpolator(0.6F, 0.0F, 1.0F, 1.0F);
    new PathInterpolator(0.0F, 0.0F, 0.2F, 1.0F);
    new PathInterpolator(0.4F, 0.0F, 1.0F, 1.0F);
  }
  
  public hn(int paramInt1, int paramInt2) {
    Object object = new Object();
    ((wa1)object).a = -1;
    ((wa1)object).b = -1;
    fi0 fi01 = fi0.e;
    ((wa1)object).c = fi01;
    ((wa1)object).d = false;
    ((wa1)object).e = null;
    ((wa1)object).f = 0.0F;
    ((wa1)object).g = 0.0F;
    ((wa1)object).h = 1.0F;
    this.b = (wa1)object;
    this.c = fi01;
    this.d = fi01;
    this.e = null;
    if (paramInt1 == 1 || paramInt1 == 2 || paramInt1 == 4 || paramInt1 == 8) {
      this.a = paramInt1;
      ColorDrawable colorDrawable = new ColorDrawable();
      this.f = colorDrawable;
      this.h = 0;
      this.g = true;
      if (paramInt2 != 0) {
        this.h = paramInt2;
        colorDrawable.setColor(paramInt2);
        ((wa1)object).e = colorDrawable;
        object = ((wa1)object).i;
        if (object != null)
          ((View)((j01)object).e).setBackground((Drawable)colorDrawable); 
      } 
      return;
    } 
    l0.l(ga1.i("Unexpected side: ", paramInt1));
    throw null;
  }
  
  public final void a(float paramFloat) {
    paramFloat *= 1.0F;
    wa1 wa11 = this.b;
    if (wa11.h != paramFloat) {
      wa11.h = paramFloat;
      j01 j01 = wa11.i;
      if (j01 != null)
        ((View)j01.e).setAlpha(paramFloat); 
    } 
  }
  
  public final void b(float paramFloat) {
    j01 j01;
    paramFloat *= 1.0F;
    wa1 wa11 = this.b;
    int i = this.a;
    if (i != 1) {
      if (i != 2) {
        if (i != 4) {
          if (i == 8) {
            paramFloat = (1.0F - paramFloat) * wa11.b;
            if (wa11.g != paramFloat) {
              wa11.g = paramFloat;
              j01 = wa11.i;
              if (j01 != null) {
                ((View)j01.e).setTranslationY(paramFloat);
                return;
              } 
            } 
          } 
        } else {
          paramFloat = (1.0F - paramFloat) * ((wa1)j01).a;
          if (((wa1)j01).f != paramFloat) {
            ((wa1)j01).f = paramFloat;
            j01 = ((wa1)j01).i;
            if (j01 != null) {
              ((View)j01.e).setTranslationX(paramFloat);
              return;
            } 
          } 
        } 
      } else {
        paramFloat = -(1.0F - paramFloat) * ((wa1)j01).b;
        if (((wa1)j01).g != paramFloat) {
          ((wa1)j01).g = paramFloat;
          j01 = ((wa1)j01).i;
          if (j01 != null) {
            ((View)j01.e).setTranslationY(paramFloat);
            return;
          } 
        } 
      } 
    } else {
      paramFloat = -(1.0F - paramFloat) * ((wa1)j01).a;
      if (((wa1)j01).f != paramFloat) {
        ((wa1)j01).f = paramFloat;
        j01 = ((wa1)j01).i;
        if (j01 != null)
          ((View)j01.e).setTranslationX(paramFloat); 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */