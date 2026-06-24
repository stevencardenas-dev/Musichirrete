import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import in.krosbits.utils.SgV.zpEN;
import java.lang.reflect.Constructor;

public final class br1 {
  public CharSequence A;
  
  public CharSequence B;
  
  public ColorStateList C;
  
  public PorterDuff.Mode D;
  
  public final cr1 E;
  
  public final Menu a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public boolean f;
  
  public boolean g;
  
  public boolean h;
  
  public int i;
  
  public int j;
  
  public CharSequence k;
  
  public CharSequence l;
  
  public int m;
  
  public char n;
  
  public int o;
  
  public char p;
  
  public int q;
  
  public int r;
  
  public boolean s;
  
  public boolean t;
  
  public boolean u;
  
  public int v;
  
  public int w;
  
  public String x;
  
  public String y;
  
  public vw0 z;
  
  public br1(cr1 paramcr1, Menu paramMenu) {
    this.E = paramcr1;
    this.C = null;
    this.D = null;
    this.a = paramMenu;
    this.b = 0;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = true;
    this.g = true;
  }
  
  public final Object a(String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject) {
    try {
      null = Class.forName(paramString, false, this.E.c.getClassLoader()).getConstructor(paramArrayOfClass);
      null.setAccessible(true);
      return null.newInstance(paramArrayOfObject);
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder("Cannot instantiate class: ");
      stringBuilder.append(paramString);
      Log.w("SupportMenuInflater", stringBuilder.toString(), exception);
      return null;
    } 
  }
  
  public final void b(MenuItem paramMenuItem) {
    InflateException inflateException;
    cr1 cr11 = this.E;
    Context context = cr11.c;
    MenuItem menuItem = paramMenuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
    int j = this.r;
    int i = 0;
    if (j >= 1) {
      bool = true;
    } else {
      bool = false;
    } 
    menuItem.setCheckable(bool).setTitleCondensed(this.l).setIcon(this.m);
    j = this.v;
    if (j >= 0)
      paramMenuItem.setShowAsAction(j); 
    if (this.y != null)
      if (!context.isRestricted()) {
        if (cr11.d == null)
          cr11.d = cr1.a(context); 
        Object<?> object = (Object<?>)cr11.d;
        String str1 = this.y;
        ar1 ar1 = new ar1();
        ar1.c = object;
        object = (Object<?>)object.getClass();
        try {
          ar1.e = object.getMethod(str1, ar1.f);
          paramMenuItem.setOnMenuItemClickListener(ar1);
        } catch (Exception exception) {
          StringBuilder stringBuilder = x41.q("Couldn't resolve menu item onClick handler ", str1, " in class ");
          stringBuilder.append(object.getName());
          inflateException = new InflateException(stringBuilder.toString());
          inflateException.initCause(exception);
          throw inflateException;
        } 
      } else {
        tp.f("The android:onClick attribute cannot be used within a restricted context");
        return;
      }  
    if (this.r >= 2)
      if (exception instanceof uw0) {
        menuItem = (uw0)exception;
        ((uw0)menuItem).x = ((uw0)menuItem).x & 0xFFFFFFFB | 0x4;
      } else if (exception instanceof yw0) {
        yw0 yw0 = (yw0)exception;
        menuItem = yw0.c;
        try {
          if (yw0.d == null)
            yw0.d = menuItem.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { boolean.class }); 
        } catch (Exception exception1) {}
        yw0.d.invoke(exception1, new Object[] { Boolean.TRUE });
      }  
    String str = this.x;
    if (str != null) {
      exception.setActionView((View)a(str, cr1.e, ((cr1)inflateException).a));
      i = 1;
    } 
    j = this.w;
    if (j > 0)
      if (!i) {
        exception.setActionView(j);
      } else {
        Log.w(zpEN.zoX, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
      }  
    vw0 vw01 = this.z;
    if (vw01 != null)
      if (exception instanceof dr1) {
        ((dr1)exception).a(vw01);
      } else {
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
      }  
    CharSequence charSequence = this.A;
    boolean bool = exception instanceof dr1;
    if (bool) {
      ((dr1)exception).setContentDescription(charSequence);
    } else if (Build.VERSION.SDK_INT >= 26) {
      ii0.q((MenuItem)exception, charSequence);
    } 
    charSequence = this.B;
    if (bool) {
      ((dr1)exception).setTooltipText(charSequence);
    } else if (Build.VERSION.SDK_INT >= 26) {
      ii0.y((MenuItem)exception, charSequence);
    } 
    char c = this.n;
    i = this.o;
    if (bool) {
      ((dr1)exception).setAlphabeticShortcut(c, i);
    } else if (Build.VERSION.SDK_INT >= 26) {
      ii0.o((MenuItem)exception, c, i);
    } 
    c = this.p;
    i = this.q;
    if (bool) {
      ((dr1)exception).setNumericShortcut(c, i);
    } else if (Build.VERSION.SDK_INT >= 26) {
      ii0.u((MenuItem)exception, c, i);
    } 
    PorterDuff.Mode mode = this.D;
    if (mode != null)
      if (bool) {
        ((dr1)exception).setIconTintMode(mode);
      } else if (Build.VERSION.SDK_INT >= 26) {
        ii0.t((MenuItem)exception, mode);
      }  
    ColorStateList colorStateList = this.C;
    if (colorStateList != null)
      if (bool) {
        ((dr1)exception).setIconTintList(colorStateList);
      } else if (Build.VERSION.SDK_INT >= 26) {
        ii0.s((MenuItem)exception, colorStateList);
      }  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\br1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */