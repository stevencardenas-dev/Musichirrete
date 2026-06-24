import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class us0 extends Drawable.ConstantState {
  public vl1 a;
  
  public mp1 b;
  
  public o30 c;
  
  public ColorStateList d = null;
  
  public ColorStateList e = null;
  
  public ColorStateList f = null;
  
  public PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
  
  public Rect h = null;
  
  public final float i = 1.0F;
  
  public float j = 1.0F;
  
  public float k;
  
  public int l = 255;
  
  public float m = 0.0F;
  
  public float n = 0.0F;
  
  public int o = 0;
  
  public int p = 0;
  
  public int q = 0;
  
  public final Paint.Style r = Paint.Style.FILL_AND_STROKE;
  
  public us0(us0 paramus0) {
    this.a = paramus0.a;
    this.b = paramus0.b;
    this.c = paramus0.c;
    this.k = paramus0.k;
    this.d = paramus0.d;
    this.e = paramus0.e;
    this.g = paramus0.g;
    this.f = paramus0.f;
    this.l = paramus0.l;
    this.i = paramus0.i;
    this.q = paramus0.q;
    this.o = paramus0.o;
    this.j = paramus0.j;
    this.m = paramus0.m;
    this.n = paramus0.n;
    this.p = paramus0.p;
    this.r = paramus0.r;
    if (paramus0.h != null)
      this.h = new Rect(paramus0.h); 
  }
  
  public us0(vl1 paramvl1) {
    this.a = paramvl1;
    this.c = null;
  }
  
  public final int getChangingConfigurations() {
    return 0;
  }
  
  public Drawable newDrawable() {
    ws0 ws0 = new ws0(this);
    ws0.h = true;
    ws0.i = true;
    return ws0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\us0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */