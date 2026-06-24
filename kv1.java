import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class kv1 extends ui0 {
  public final mv1 o;
  
  public final Window.Callback p;
  
  public final jv1 q;
  
  public boolean r;
  
  public boolean s;
  
  public boolean t;
  
  public final ArrayList u = new ArrayList();
  
  public final yi1 v = new yi1(7, this);
  
  public kv1(Toolbar paramToolbar, CharSequence paramCharSequence, o6 paramo6) {
    jv1 jv11 = new jv1(this);
    paramToolbar.getClass();
    mv1 mv11 = new mv1(paramToolbar, false);
    this.o = mv11;
    paramo6.getClass();
    this.p = paramo6;
    mv11.k = paramo6;
    paramToolbar.setOnMenuItemClickListener(jv11);
    if (!mv11.g) {
      mv11.h = paramCharSequence;
      if ((mv11.b & 0x8) != 0) {
        paramToolbar.setTitle(paramCharSequence);
        if (mv11.g)
          v22.o(paramToolbar.getRootView(), paramCharSequence); 
      } 
    } 
    this.q = new jv1(this);
  }
  
  public final Menu D0() {
    boolean bool = this.s;
    mv1 mv11 = this.o;
    if (!bool) {
      sb sb = new sb(this);
      jv1 jv11 = new jv1(this);
      Toolbar toolbar = mv11.a;
      toolbar.P = sb;
      toolbar.Q = jv11;
      ActionMenuView actionMenuView = toolbar.b;
      if (actionMenuView != null) {
        actionMenuView.h = sb;
        actionMenuView.i = jv11;
      } 
      this.s = true;
    } 
    return mv11.a.getMenu();
  }
  
  public final Context E() {
    return this.o.a.getContext();
  }
  
  public final void E0(int paramInt1, int paramInt2) {
    mv1 mv11 = this.o;
    mv11.a(paramInt1 & paramInt2 | (paramInt2 ^ 0xFFFFFFFF) & mv11.b);
  }
  
  public final boolean L() {
    mv1 mv11 = this.o;
    Toolbar toolbar = mv11.a;
    yi1 yi11 = this.v;
    toolbar.removeCallbacks(yi11);
    toolbar = mv11.a;
    WeakHashMap weakHashMap = v22.a;
    toolbar.postOnAnimation(yi11);
    return true;
  }
  
  public final void P() {}
  
  public final void Q() {
    this.o.a.removeCallbacks(this.v);
  }
  
  public final boolean R(int paramInt, KeyEvent paramKeyEvent) {
    Menu menu = D0();
    if (menu != null) {
      int i = KeyCharacterMap.load(paramKeyEvent.getDeviceId()).getKeyboardType();
      boolean bool = true;
      if (i == 1)
        bool = false; 
      menu.setQwertyMode(bool);
      return menu.performShortcut(paramInt, paramKeyEvent, 0);
    } 
    return false;
  }
  
  public final boolean S(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1)
      T(); 
    return true;
  }
  
  public final boolean T() {
    return this.o.a.u();
  }
  
  public final void Y(boolean paramBoolean) {}
  
  public final void Z(boolean paramBoolean) {
    E0(4, 4);
  }
  
  public final void a0() {
    E0(16, 16);
  }
  
  public final void b0(boolean paramBoolean) {
    boolean bool;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    E0(bool, 2);
  }
  
  public final void c0() {
    E0(0, 8);
  }
  
  public final void d0(boolean paramBoolean) {}
  
  public final void f0(int paramInt) {
    CharSequence charSequence;
    mv1 mv11 = this.o;
    if (paramInt != 0) {
      charSequence = mv11.a.getContext().getText(paramInt);
    } else {
      charSequence = null;
    } 
    mv11.g = true;
    Toolbar toolbar = mv11.a;
    mv11.h = charSequence;
    if ((mv11.b & 0x8) != 0) {
      toolbar.setTitle(charSequence);
      if (mv11.g)
        v22.o(toolbar.getRootView(), charSequence); 
    } 
  }
  
  public final void g0(CharSequence paramCharSequence) {
    mv1 mv11 = this.o;
    mv11.g = true;
    Toolbar toolbar = mv11.a;
    mv11.h = paramCharSequence;
    if ((mv11.b & 0x8) != 0) {
      toolbar.setTitle(paramCharSequence);
      if (mv11.g)
        v22.o(toolbar.getRootView(), paramCharSequence); 
    } 
  }
  
  public final void h0(CharSequence paramCharSequence) {
    mv1 mv11 = this.o;
    if (!mv11.g) {
      Toolbar toolbar = mv11.a;
      mv11.h = paramCharSequence;
      if ((mv11.b & 0x8) != 0) {
        toolbar.setTitle(paramCharSequence);
        if (mv11.g)
          v22.o(toolbar.getRootView(), paramCharSequence); 
      } 
    } 
  }
  
  public final boolean j() {
    ActionMenuView actionMenuView = this.o.a.b;
    if (actionMenuView != null) {
      u1 u1 = actionMenuView.g;
      if (u1 != null && u1.d())
        return true; 
    } 
    return false;
  }
  
  public final boolean k() {
    fv1 fv1 = this.o.a.O;
    if (fv1 != null) {
      uw0 uw0 = fv1.c;
      if (uw0 != null) {
        if (fv1 == null)
          uw0 = null; 
        if (uw0 != null)
          uw0.collapseActionView(); 
        return true;
      } 
    } 
    return false;
  }
  
  public final void p(boolean paramBoolean) {
    if (paramBoolean != this.t) {
      this.t = paramBoolean;
      ArrayList<E> arrayList = this.u;
      if (arrayList.size() > 0) {
        arrayList.get(0).getClass();
        tp.b();
        return;
      } 
    } 
  }
  
  public final int x() {
    return this.o.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */