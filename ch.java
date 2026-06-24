import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class ch extends yg {
  public final Boolean a;
  
  public final x62 b;
  
  public Window c;
  
  public boolean d;
  
  public ch(View paramView, x62 paramx62) {
    ColorStateList colorStateList2;
    this.b = paramx62;
    ws0 ws0 = (BottomSheetBehavior.B(paramView)).i;
    if (ws0 != null) {
      colorStateList2 = ws0.c.d;
    } else {
      colorStateList2 = paramView.getBackgroundTintList();
    } 
    boolean bool2 = false;
    boolean bool1 = false;
    if (colorStateList2 != null) {
      int i = colorStateList2.getDefaultColor();
      boolean bool = bool1;
      if (i != 0) {
        bool = bool1;
        if (jn.e(i) > 0.5D)
          bool = true; 
      } 
      this.a = Boolean.valueOf(bool);
      return;
    } 
    ColorStateList colorStateList1 = p8.a(paramView.getBackground());
    if (colorStateList1 != null) {
      Integer integer = Integer.valueOf(colorStateList1.getDefaultColor());
    } else {
      colorStateList1 = null;
    } 
    if (colorStateList1 != null) {
      int i = colorStateList1.intValue();
      boolean bool = bool2;
      if (i != 0) {
        bool = bool2;
        if (jn.e(i) > 0.5D)
          bool = true; 
      } 
      this.a = Boolean.valueOf(bool);
      return;
    } 
    this.a = null;
  }
  
  public final void a(View paramView) {
    d(paramView);
  }
  
  public final void b(View paramView) {
    d(paramView);
  }
  
  public final void c(View paramView, int paramInt) {
    d(paramView);
  }
  
  public final void d(View paramView) {
    int i = paramView.getTop();
    x62 x621 = this.b;
    if (i < x621.d()) {
      Window window = this.c;
      if (window != null) {
        boolean bool;
        y62 y62;
        Boolean bool1 = this.a;
        if (bool1 == null) {
          bool = this.d;
        } else {
          bool = bool1.booleanValue();
        } 
        window.getDecorView();
        i = Build.VERSION.SDK_INT;
        if (i >= 35) {
          a72 a72 = new a72(window);
        } else if (i >= 30) {
          a72 a72 = new a72(window);
        } else if (i >= 26) {
          y62 = new y62(window);
        } else {
          y62 = new y62(window);
        } 
        y62.b0(bool);
      } 
      paramView.setPadding(paramView.getPaddingLeft(), x621.d() - paramView.getTop(), paramView.getPaddingRight(), paramView.getPaddingBottom());
      return;
    } 
    if (paramView.getTop() != 0) {
      Window window = this.c;
      if (window != null) {
        a72 a72;
        y62 y62;
        boolean bool = this.d;
        window.getDecorView();
        i = Build.VERSION.SDK_INT;
        if (i >= 35) {
          a72 = new a72(window);
        } else if (i >= 30) {
          a72 = new a72((Window)a72);
        } else if (i >= 26) {
          y62 = new y62((Window)a72);
        } else {
          y62 = new y62((Window)y62);
        } 
        y62.b0(bool);
      } 
      paramView.setPadding(paramView.getPaddingLeft(), 0, paramView.getPaddingRight(), paramView.getPaddingBottom());
    } 
  }
  
  public final void e(Window paramWindow) {
    if (this.c != paramWindow) {
      this.c = paramWindow;
      if (paramWindow != null) {
        a72 a72;
        y62 y62;
        paramWindow.getDecorView();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
          a72 = new a72(paramWindow);
        } else if (i >= 30) {
          a72 = new a72((Window)a72);
        } else if (i >= 26) {
          y62 = new y62((Window)a72);
        } else {
          y62 = new y62((Window)y62);
        } 
        this.d = y62.H();
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */