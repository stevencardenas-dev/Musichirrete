import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class fn1 extends LinearLayout implements p41 {
  public final Context b;
  
  public final Drawable c;
  
  public final Drawable e;
  
  public final int f;
  
  public boolean g = true;
  
  public final ArrayList h = new ArrayList();
  
  public fn1(Context paramContext, Drawable paramDrawable1, Drawable paramDrawable2, int paramInt, boolean paramBoolean) {
    super(paramContext);
    this.b = paramContext;
    this.c = paramDrawable1;
    this.e = paramDrawable2;
    this.f = paramInt;
    this.g = paramBoolean;
    setOrientation(0);
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
    layoutParams.gravity = 1;
    paramInt = getResources().getDimensionPixelSize(2131165333);
    setPadding(0, paramInt, 0, paramInt);
    setLayoutParams((ViewGroup.LayoutParams)layoutParams);
  }
  
  public final void K(int paramInt) {
    byte b = 0;
    while (true) {
      ArrayList<uh0> arrayList = this.h;
      if (b < arrayList.size()) {
        uh0 uh0 = arrayList.get(b);
        if (b == paramInt) {
          uh0.b(true);
        } else {
          uh0.b(false);
        } 
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public final void a() {
    en1 en1;
    Drawable drawable = this.c;
    ArrayList<en1> arrayList = this.h;
    int i = this.f;
    Context context = this.b;
    if (drawable != null) {
      drawable = this.e;
      if (drawable != null) {
        en1 = new en1(this, context, i, this.g);
        en1.setBackground(drawable);
        arrayList.add(en1);
        addView((View)en1);
        return;
      } 
    } 
    uh0 uh0 = new uh0((Context)en1, i, this.g);
    Resources resources = uh0.getResources();
    ThreadLocal threadLocal = lg1.a;
    uh0.setBackground(resources.getDrawable(2131231436, null));
    arrayList.add(uh0);
    addView((View)uh0);
  }
  
  public void setMustAnimateIndicators(boolean paramBoolean) {
    this.g = paramBoolean;
    ArrayList<Object> arrayList = this.h;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      uh0 uh0 = (uh0)arrayList.get(b);
      b++;
      ((uh0)uh0).setMustAnimateChange(paramBoolean);
    } 
  }
  
  public void setSlides(int paramInt) {
    removeAllViews();
    this.h.clear();
    for (byte b = 0; b < paramInt; b++)
      a(); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */