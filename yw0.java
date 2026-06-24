import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public final class yw0 extends r6 implements MenuItem {
  public final dr1 c;
  
  public Method d;
  
  public yw0(Context paramContext, dr1 paramdr1) {
    super(paramContext);
    if (paramdr1 != null) {
      this.c = paramdr1;
      return;
    } 
    l0.l("Wrapped Object can not be null.");
    throw null;
  }
  
  public final boolean collapseActionView() {
    return this.c.collapseActionView();
  }
  
  public final boolean expandActionView() {
    return this.c.expandActionView();
  }
  
  public final ActionProvider getActionProvider() {
    vw0 vw0 = this.c.b();
    return (vw0 != null) ? vw0.b : null;
  }
  
  public final View getActionView() {
    View view2 = this.c.getActionView();
    View view1 = view2;
    if (view2 instanceof ww0)
      view1 = (View)((ww0)view2).b; 
    return view1;
  }
  
  public final int getAlphabeticModifiers() {
    return this.c.getAlphabeticModifiers();
  }
  
  public final char getAlphabeticShortcut() {
    return this.c.getAlphabeticShortcut();
  }
  
  public final CharSequence getContentDescription() {
    return this.c.getContentDescription();
  }
  
  public final int getGroupId() {
    return this.c.getGroupId();
  }
  
  public final Drawable getIcon() {
    return this.c.getIcon();
  }
  
  public final ColorStateList getIconTintList() {
    return this.c.getIconTintList();
  }
  
  public final PorterDuff.Mode getIconTintMode() {
    return this.c.getIconTintMode();
  }
  
  public final Intent getIntent() {
    return this.c.getIntent();
  }
  
  public final int getItemId() {
    return this.c.getItemId();
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo() {
    return this.c.getMenuInfo();
  }
  
  public final int getNumericModifiers() {
    return this.c.getNumericModifiers();
  }
  
  public final char getNumericShortcut() {
    return this.c.getNumericShortcut();
  }
  
  public final int getOrder() {
    return this.c.getOrder();
  }
  
  public final SubMenu getSubMenu() {
    return this.c.getSubMenu();
  }
  
  public final CharSequence getTitle() {
    return this.c.getTitle();
  }
  
  public final CharSequence getTitleCondensed() {
    return this.c.getTitleCondensed();
  }
  
  public final CharSequence getTooltipText() {
    return this.c.getTooltipText();
  }
  
  public final boolean hasSubMenu() {
    return this.c.hasSubMenu();
  }
  
  public final boolean isActionViewExpanded() {
    return this.c.isActionViewExpanded();
  }
  
  public final boolean isCheckable() {
    return this.c.isCheckable();
  }
  
  public final boolean isChecked() {
    return this.c.isChecked();
  }
  
  public final boolean isEnabled() {
    return this.c.isEnabled();
  }
  
  public final boolean isVisible() {
    return this.c.isVisible();
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider) {
    vw0 vw0 = new vw0(this, paramActionProvider);
    if (paramActionProvider != null) {
      vw0 vw01 = vw0;
    } else {
      paramActionProvider = null;
    } 
    this.c.a((vw0)paramActionProvider);
    return this;
  }
  
  public final MenuItem setActionView(int paramInt) {
    dr1 dr11 = this.c;
    dr11.setActionView(paramInt);
    View view = dr11.getActionView();
    if (view instanceof android.view.CollapsibleActionView)
      dr11.setActionView((View)new ww0(view)); 
    return this;
  }
  
  public final MenuItem setActionView(View paramView) {
    ww0 ww0;
    View view = paramView;
    if (paramView instanceof android.view.CollapsibleActionView)
      ww0 = new ww0(paramView); 
    this.c.setActionView((View)ww0);
    return this;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar) {
    this.c.setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar, int paramInt) {
    this.c.setAlphabeticShortcut(paramChar, paramInt);
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean) {
    this.c.setCheckable(paramBoolean);
    return this;
  }
  
  public final MenuItem setChecked(boolean paramBoolean) {
    this.c.setChecked(paramBoolean);
    return this;
  }
  
  public final MenuItem setContentDescription(CharSequence paramCharSequence) {
    this.c.setContentDescription(paramCharSequence);
    return this;
  }
  
  public final MenuItem setEnabled(boolean paramBoolean) {
    this.c.setEnabled(paramBoolean);
    return this;
  }
  
  public final MenuItem setIcon(int paramInt) {
    this.c.setIcon(paramInt);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable) {
    this.c.setIcon(paramDrawable);
    return this;
  }
  
  public final MenuItem setIconTintList(ColorStateList paramColorStateList) {
    this.c.setIconTintList(paramColorStateList);
    return this;
  }
  
  public final MenuItem setIconTintMode(PorterDuff.Mode paramMode) {
    this.c.setIconTintMode(paramMode);
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent) {
    this.c.setIntent(paramIntent);
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar) {
    this.c.setNumericShortcut(paramChar);
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar, int paramInt) {
    this.c.setNumericShortcut(paramChar, paramInt);
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    if (paramOnActionExpandListener != null) {
      paramOnActionExpandListener = new xw0(this, paramOnActionExpandListener);
    } else {
      paramOnActionExpandListener = null;
    } 
    this.c.setOnActionExpandListener(paramOnActionExpandListener);
    return this;
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    if (paramOnMenuItemClickListener != null) {
      paramOnMenuItemClickListener = new ar1(this, paramOnMenuItemClickListener);
    } else {
      paramOnMenuItemClickListener = null;
    } 
    this.c.setOnMenuItemClickListener(paramOnMenuItemClickListener);
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.c.setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2) {
    this.c.setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    return this;
  }
  
  public final void setShowAsAction(int paramInt) {
    this.c.setShowAsAction(paramInt);
  }
  
  public final MenuItem setShowAsActionFlags(int paramInt) {
    this.c.setShowAsActionFlags(paramInt);
    return this;
  }
  
  public final MenuItem setTitle(int paramInt) {
    this.c.setTitle(paramInt);
    return this;
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence) {
    this.c.setTitle(paramCharSequence);
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.c.setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public final MenuItem setTooltipText(CharSequence paramCharSequence) {
    this.c.setTooltipText(paramCharSequence);
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean) {
    return this.c.setVisible(paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */