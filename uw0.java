import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class uw0 implements dr1 {
  public vw0 A;
  
  public MenuItem.OnActionExpandListener B;
  
  public boolean C = false;
  
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public CharSequence e;
  
  public CharSequence f;
  
  public Intent g;
  
  public char h;
  
  public int i = 4096;
  
  public char j;
  
  public int k = 4096;
  
  public Drawable l;
  
  public int m = 0;
  
  public final rw0 n;
  
  public tq1 o;
  
  public MenuItem.OnMenuItemClickListener p;
  
  public CharSequence q;
  
  public CharSequence r;
  
  public ColorStateList s = null;
  
  public PorterDuff.Mode t = null;
  
  public boolean u = false;
  
  public boolean v = false;
  
  public boolean w = false;
  
  public int x = 16;
  
  public int y;
  
  public View z;
  
  public uw0(rw0 paramrw0, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5) {
    this.n = paramrw0;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramCharSequence;
    this.y = paramInt5;
  }
  
  public static void c(int paramInt1, int paramInt2, String paramString, StringBuilder paramStringBuilder) {
    if ((paramInt1 & paramInt2) == paramInt2)
      paramStringBuilder.append(paramString); 
  }
  
  public final dr1 a(vw0 paramvw0) {
    this.z = null;
    this.A = paramvw0;
    this.n.p(true);
    paramvw0 = this.A;
    if (paramvw0 != null) {
      paramvw0.a = new bh0(10, this);
      paramvw0.b.setVisibilityListener(paramvw0);
    } 
    return this;
  }
  
  public final vw0 b() {
    return this.A;
  }
  
  public final boolean collapseActionView() {
    if ((this.y & 0x8) != 0) {
      if (this.z == null)
        return true; 
      MenuItem.OnActionExpandListener onActionExpandListener = this.B;
      if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this))
        return this.n.d(this); 
    } 
    return false;
  }
  
  public final Drawable d(Drawable paramDrawable) {
    // Byte code:
    //   0: aload_1
    //   1: astore_2
    //   2: aload_1
    //   3: ifnull -> 71
    //   6: aload_1
    //   7: astore_2
    //   8: aload_0
    //   9: getfield w : Z
    //   12: ifeq -> 71
    //   15: aload_0
    //   16: getfield u : Z
    //   19: ifne -> 31
    //   22: aload_1
    //   23: astore_2
    //   24: aload_0
    //   25: getfield v : Z
    //   28: ifeq -> 71
    //   31: aload_1
    //   32: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   35: astore_2
    //   36: aload_0
    //   37: getfield u : Z
    //   40: ifeq -> 51
    //   43: aload_2
    //   44: aload_0
    //   45: getfield s : Landroid/content/res/ColorStateList;
    //   48: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)V
    //   51: aload_0
    //   52: getfield v : Z
    //   55: ifeq -> 66
    //   58: aload_2
    //   59: aload_0
    //   60: getfield t : Landroid/graphics/PorterDuff$Mode;
    //   63: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   66: aload_0
    //   67: iconst_0
    //   68: putfield w : Z
    //   71: aload_2
    //   72: areturn
  }
  
  public final boolean e() {
    if ((this.y & 0x8) != 0) {
      if (this.z == null) {
        vw0 vw01 = this.A;
        if (vw01 != null)
          this.z = vw01.b.onCreateActionView(this); 
      } 
      if (this.z != null)
        return true; 
    } 
    return false;
  }
  
  public final boolean expandActionView() {
    if (e()) {
      MenuItem.OnActionExpandListener onActionExpandListener = this.B;
      if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this))
        return this.n.f(this); 
    } 
    return false;
  }
  
  public final void f(boolean paramBoolean) {
    int i = this.x;
    if (paramBoolean) {
      this.x = i | 0x20;
      return;
    } 
    this.x = i & 0xFFFFFFDF;
  }
  
  public final ActionProvider getActionProvider() {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public final View getActionView() {
    View view = this.z;
    if (view != null)
      return view; 
    vw0 vw01 = this.A;
    if (vw01 != null) {
      View view1 = vw01.b.onCreateActionView(this);
      this.z = view1;
      return view1;
    } 
    return null;
  }
  
  public final int getAlphabeticModifiers() {
    return this.k;
  }
  
  public final char getAlphabeticShortcut() {
    return this.j;
  }
  
  public final CharSequence getContentDescription() {
    return this.q;
  }
  
  public final int getGroupId() {
    return this.b;
  }
  
  public final Drawable getIcon() {
    Drawable drawable = this.l;
    if (drawable != null)
      return d(drawable); 
    int i = this.m;
    if (i != 0) {
      drawable = ws2.I(this.n.a, i);
      this.m = 0;
      this.l = drawable;
      return d(drawable);
    } 
    return null;
  }
  
  public final ColorStateList getIconTintList() {
    return this.s;
  }
  
  public final PorterDuff.Mode getIconTintMode() {
    return this.t;
  }
  
  public final Intent getIntent() {
    return this.g;
  }
  
  public final int getItemId() {
    return this.a;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo() {
    return null;
  }
  
  public final int getNumericModifiers() {
    return this.i;
  }
  
  public final char getNumericShortcut() {
    return this.h;
  }
  
  public final int getOrder() {
    return this.c;
  }
  
  public final SubMenu getSubMenu() {
    return this.o;
  }
  
  public final CharSequence getTitle() {
    return this.e;
  }
  
  public final CharSequence getTitleCondensed() {
    CharSequence charSequence = this.f;
    return (charSequence != null) ? charSequence : this.e;
  }
  
  public final CharSequence getTooltipText() {
    return this.r;
  }
  
  public final boolean hasSubMenu() {
    return (this.o != null);
  }
  
  public final boolean isActionViewExpanded() {
    return this.C;
  }
  
  public final boolean isCheckable() {
    return ((this.x & 0x1) == 1);
  }
  
  public final boolean isChecked() {
    return ((this.x & 0x2) == 2);
  }
  
  public final boolean isEnabled() {
    return ((this.x & 0x10) != 0);
  }
  
  public final boolean isVisible() {
    vw0 vw01 = this.A;
    return (vw01 != null && vw01.b.overridesItemVisibility()) ? (((this.x & 0x8) == 0 && this.A.b.isVisible())) : (((this.x & 0x8) == 0));
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider) {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public final MenuItem setActionView(int paramInt) {
    rw0 rw01 = this.n;
    Context context = rw01.a;
    View view = LayoutInflater.from(context).inflate(paramInt, (ViewGroup)new LinearLayout(context), false);
    this.z = view;
    this.A = null;
    if (view != null && view.getId() == -1) {
      paramInt = this.a;
      if (paramInt > 0)
        view.setId(paramInt); 
    } 
    rw01.k = true;
    rw01.p(true);
    return this;
  }
  
  public final MenuItem setActionView(View paramView) {
    this.z = paramView;
    this.A = null;
    if (paramView != null && paramView.getId() == -1) {
      int i = this.a;
      if (i > 0)
        paramView.setId(i); 
    } 
    rw0 rw01 = this.n;
    rw01.k = true;
    rw01.p(true);
    return this;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar) {
    if (this.j == paramChar)
      return this; 
    this.j = Character.toLowerCase(paramChar);
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar, int paramInt) {
    if (this.j == paramChar && this.k == paramInt)
      return this; 
    this.j = Character.toLowerCase(paramChar);
    this.k = KeyEvent.normalizeMetaState(paramInt);
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean) {
    int i = this.x;
    int j = paramBoolean | i & 0xFFFFFFFE;
    this.x = j;
    if (i != j)
      this.n.p(false); 
    return this;
  }
  
  public final MenuItem setChecked(boolean paramBoolean) {
    int j = this.x;
    int i = 2;
    rw0 rw01 = this.n;
    if ((j & 0x4) != 0) {
      ArrayList<uw0> arrayList = rw01.f;
      int k = arrayList.size();
      rw01.w();
      for (i = 0; i < k; i++) {
        uw0 uw01 = arrayList.get(i);
        if (uw01.b == this.b && (uw01.x & 0x4) != 0 && uw01.isCheckable()) {
          if (uw01 == this) {
            j = 1;
          } else {
            j = 0;
          } 
          int m = uw01.x;
          if (j != 0) {
            j = 2;
          } else {
            j = 0;
          } 
          j |= m & 0xFFFFFFFD;
          uw01.x = j;
          if (m != j)
            uw01.n.p(false); 
        } 
      } 
      rw01.v();
      return this;
    } 
    if (!paramBoolean)
      i = 0; 
    i = j & 0xFFFFFFFD | i;
    this.x = i;
    if (j != i)
      rw01.p(false); 
    return this;
  }
  
  public final dr1 setContentDescription(CharSequence paramCharSequence) {
    this.q = paramCharSequence;
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setEnabled(boolean paramBoolean) {
    int i = this.x;
    if (paramBoolean) {
      this.x = i | 0x10;
    } else {
      this.x = i & 0xFFFFFFEF;
    } 
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setIcon(int paramInt) {
    this.l = null;
    this.m = paramInt;
    this.w = true;
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable) {
    this.m = 0;
    this.l = paramDrawable;
    this.w = true;
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setIconTintList(ColorStateList paramColorStateList) {
    this.s = paramColorStateList;
    this.u = true;
    this.w = true;
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setIconTintMode(PorterDuff.Mode paramMode) {
    this.t = paramMode;
    this.v = true;
    this.w = true;
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent) {
    this.g = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar) {
    if (this.h == paramChar)
      return this; 
    this.h = paramChar;
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar, int paramInt) {
    if (this.h == paramChar && this.i == paramInt)
      return this; 
    this.h = paramChar;
    this.i = KeyEvent.normalizeMetaState(paramInt);
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    this.B = paramOnActionExpandListener;
    return this;
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    this.p = paramOnMenuItemClickListener;
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.h = paramChar1;
    this.j = Character.toLowerCase(paramChar2);
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2) {
    this.h = paramChar1;
    this.i = KeyEvent.normalizeMetaState(paramInt1);
    this.j = Character.toLowerCase(paramChar2);
    this.k = KeyEvent.normalizeMetaState(paramInt2);
    this.n.p(false);
    return this;
  }
  
  public final void setShowAsAction(int paramInt) {
    int i = paramInt & 0x3;
    if (i == 0 || i == 1 || i == 2) {
      this.y = paramInt;
      rw0 rw01 = this.n;
      rw01.k = true;
      rw01.p(true);
      return;
    } 
    l0.l("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
  }
  
  public final MenuItem setShowAsActionFlags(int paramInt) {
    setShowAsAction(paramInt);
    return this;
  }
  
  public final MenuItem setTitle(int paramInt) {
    setTitle(this.n.a.getString(paramInt));
    return this;
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
    this.n.p(false);
    tq1 tq11 = this.o;
    if (tq11 != null)
      tq11.setHeaderTitle(paramCharSequence); 
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.f = paramCharSequence;
    this.n.p(false);
    return this;
  }
  
  public final dr1 setTooltipText(CharSequence paramCharSequence) {
    this.r = paramCharSequence;
    this.n.p(false);
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean) {
    int i;
    int j = this.x;
    if (paramBoolean) {
      i = 0;
    } else {
      i = 8;
    } 
    i |= j & 0xFFFFFFF7;
    this.x = i;
    if (j != i) {
      rw0 rw01 = this.n;
      rw01.h = true;
      rw01.p(true);
    } 
    return this;
  }
  
  public final String toString() {
    CharSequence charSequence = this.e;
    return (charSequence != null) ? charSequence.toString() : null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */