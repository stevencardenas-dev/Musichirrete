import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class o1 implements dr1 {
  public CharSequence a;
  
  public CharSequence b;
  
  public Intent c;
  
  public char d;
  
  public int e;
  
  public char f;
  
  public int g;
  
  public Drawable h;
  
  public Context i;
  
  public CharSequence j;
  
  public CharSequence k;
  
  public ColorStateList l;
  
  public PorterDuff.Mode m;
  
  public boolean n;
  
  public boolean o;
  
  public int p;
  
  public final dr1 a(vw0 paramvw0) {
    throw new UnsupportedOperationException();
  }
  
  public final vw0 b() {
    return null;
  }
  
  public final void c() {
    Drawable drawable = this.h;
    if (drawable != null && (this.n || this.o)) {
      this.h = drawable;
      drawable = drawable.mutate();
      this.h = drawable;
      if (this.n)
        drawable.setTintList(this.l); 
      if (this.o)
        this.h.setTintMode(this.m); 
    } 
  }
  
  public final boolean collapseActionView() {
    return false;
  }
  
  public final boolean expandActionView() {
    return false;
  }
  
  public final ActionProvider getActionProvider() {
    throw new UnsupportedOperationException();
  }
  
  public final View getActionView() {
    return null;
  }
  
  public final int getAlphabeticModifiers() {
    return this.g;
  }
  
  public final char getAlphabeticShortcut() {
    return this.f;
  }
  
  public final CharSequence getContentDescription() {
    return this.j;
  }
  
  public final int getGroupId() {
    return 0;
  }
  
  public final Drawable getIcon() {
    return this.h;
  }
  
  public final ColorStateList getIconTintList() {
    return this.l;
  }
  
  public final PorterDuff.Mode getIconTintMode() {
    return this.m;
  }
  
  public final Intent getIntent() {
    return this.c;
  }
  
  public final int getItemId() {
    return 16908332;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo() {
    return null;
  }
  
  public final int getNumericModifiers() {
    return this.e;
  }
  
  public final char getNumericShortcut() {
    return this.d;
  }
  
  public final int getOrder() {
    return 0;
  }
  
  public final SubMenu getSubMenu() {
    return null;
  }
  
  public final CharSequence getTitle() {
    return this.a;
  }
  
  public final CharSequence getTitleCondensed() {
    CharSequence charSequence = this.b;
    return (charSequence != null) ? charSequence : this.a;
  }
  
  public final CharSequence getTooltipText() {
    return this.k;
  }
  
  public final boolean hasSubMenu() {
    return false;
  }
  
  public final boolean isActionViewExpanded() {
    return false;
  }
  
  public final boolean isCheckable() {
    return ((this.p & 0x1) != 0);
  }
  
  public final boolean isChecked() {
    return ((this.p & 0x2) != 0);
  }
  
  public final boolean isEnabled() {
    return ((this.p & 0x10) != 0);
  }
  
  public final boolean isVisible() {
    return ((this.p & 0x8) == 0);
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider) {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setActionView(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setActionView(View paramView) {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar) {
    this.f = Character.toLowerCase(paramChar);
    return this;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar, int paramInt) {
    this.f = Character.toLowerCase(paramChar);
    this.g = KeyEvent.normalizeMetaState(paramInt);
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean) {
    this.p = paramBoolean | this.p & 0xFFFFFFFE;
    return this;
  }
  
  public final MenuItem setChecked(boolean paramBoolean) {
    boolean bool;
    int i = this.p;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    this.p = bool | i & 0xFFFFFFFD;
    return this;
  }
  
  public final MenuItem setContentDescription(CharSequence paramCharSequence) {
    this.j = paramCharSequence;
    return this;
  }
  
  public final dr1 setContentDescription(CharSequence paramCharSequence) {
    this.j = paramCharSequence;
    return this;
  }
  
  public final MenuItem setEnabled(boolean paramBoolean) {
    boolean bool;
    int i = this.p;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    this.p = bool | i & 0xFFFFFFEF;
    return this;
  }
  
  public final MenuItem setIcon(int paramInt) {
    this.h = this.i.getDrawable(paramInt);
    c();
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable) {
    this.h = paramDrawable;
    c();
    return this;
  }
  
  public final MenuItem setIconTintList(ColorStateList paramColorStateList) {
    this.l = paramColorStateList;
    this.n = true;
    c();
    return this;
  }
  
  public final MenuItem setIconTintMode(PorterDuff.Mode paramMode) {
    this.m = paramMode;
    this.o = true;
    c();
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent) {
    this.c = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar) {
    this.d = paramChar;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar, int paramInt) {
    this.d = paramChar;
    this.e = KeyEvent.normalizeMetaState(paramInt);
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.d = paramChar1;
    this.f = Character.toLowerCase(paramChar2);
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2) {
    this.d = paramChar1;
    this.e = KeyEvent.normalizeMetaState(paramInt1);
    this.f = Character.toLowerCase(paramChar2);
    this.g = KeyEvent.normalizeMetaState(paramInt2);
    return this;
  }
  
  public final void setShowAsAction(int paramInt) {}
  
  public final MenuItem setShowAsActionFlags(int paramInt) {
    return this;
  }
  
  public final MenuItem setTitle(int paramInt) {
    this.a = this.i.getResources().getString(paramInt);
    return this;
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence) {
    this.a = paramCharSequence;
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.b = paramCharSequence;
    return this;
  }
  
  public final MenuItem setTooltipText(CharSequence paramCharSequence) {
    this.k = paramCharSequence;
    return this;
  }
  
  public final dr1 setTooltipText(CharSequence paramCharSequence) {
    this.k = paramCharSequence;
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean) {
    int i = this.p;
    byte b = 8;
    if (paramBoolean)
      b = 0; 
    this.p = i & 0x8 | b;
    return this;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */