import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class kx0 extends r6 implements Menu {
  public final rw0 c;
  
  public kx0(Context paramContext, rw0 paramrw0) {
    super(paramContext);
    if (paramrw0 != null) {
      this.c = paramrw0;
      return;
    } 
    l0.l("Wrapped Object can not be null.");
    throw null;
  }
  
  public final MenuItem add(int paramInt) {
    return g(this.c.add(paramInt));
  }
  
  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return g(this.c.add(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    return g(this.c.a(paramInt1, paramInt2, paramInt3, paramCharSequence));
  }
  
  public final MenuItem add(CharSequence paramCharSequence) {
    return g(this.c.a(0, 0, 0, paramCharSequence));
  }
  
  public final int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem) {
    MenuItem[] arrayOfMenuItem;
    if (paramArrayOfMenuItem != null) {
      arrayOfMenuItem = new MenuItem[paramArrayOfMenuItem.length];
    } else {
      arrayOfMenuItem = null;
    } 
    paramInt2 = this.c.addIntentOptions(paramInt1, paramInt2, paramInt3, paramComponentName, paramArrayOfIntent, paramIntent, paramInt4, arrayOfMenuItem);
    if (arrayOfMenuItem != null) {
      paramInt3 = arrayOfMenuItem.length;
      for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++)
        paramArrayOfMenuItem[paramInt1] = g(arrayOfMenuItem[paramInt1]); 
    } 
    return paramInt2;
  }
  
  public final SubMenu addSubMenu(int paramInt) {
    return this.c.addSubMenu(paramInt);
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return this.c.addSubMenu(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    return this.c.addSubMenu(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public final SubMenu addSubMenu(CharSequence paramCharSequence) {
    return this.c.addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public final void clear() {
    zm1 zm1 = (zm1)this.b;
    if (zm1 != null)
      zm1.clear(); 
    this.c.clear();
  }
  
  public final void close() {
    this.c.close();
  }
  
  public final MenuItem findItem(int paramInt) {
    return g(this.c.findItem(paramInt));
  }
  
  public final MenuItem getItem(int paramInt) {
    return g(this.c.getItem(paramInt));
  }
  
  public final boolean hasVisibleItems() {
    return this.c.hasVisibleItems();
  }
  
  public final boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent) {
    return this.c.isShortcutKey(paramInt, paramKeyEvent);
  }
  
  public final boolean performIdentifierAction(int paramInt1, int paramInt2) {
    return this.c.performIdentifierAction(paramInt1, paramInt2);
  }
  
  public final boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
    return this.c.performShortcut(paramInt1, paramKeyEvent, paramInt2);
  }
  
  public final void removeGroup(int paramInt) {
    if ((zm1)this.b != null) {
      int i = 0;
      while (true) {
        zm1 zm1 = (zm1)this.b;
        if (i < zm1.e) {
          int j = i;
          if (((dr1)zm1.f(i)).getGroupId() == paramInt) {
            ((zm1)this.b).g(i);
            j = i - 1;
          } 
          i = j + 1;
          continue;
        } 
        break;
      } 
    } 
    this.c.removeGroup(paramInt);
  }
  
  public final void removeItem(int paramInt) {
    if ((zm1)this.b != null) {
      byte b = 0;
      while (true) {
        zm1 zm1 = (zm1)this.b;
        if (b < zm1.e) {
          if (((dr1)zm1.f(b)).getItemId() == paramInt) {
            ((zm1)this.b).g(b);
            break;
          } 
          b++;
          continue;
        } 
        break;
      } 
    } 
    this.c.removeItem(paramInt);
  }
  
  public final void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    this.c.setGroupCheckable(paramInt, paramBoolean1, paramBoolean2);
  }
  
  public final void setGroupEnabled(int paramInt, boolean paramBoolean) {
    this.c.setGroupEnabled(paramInt, paramBoolean);
  }
  
  public final void setGroupVisible(int paramInt, boolean paramBoolean) {
    this.c.setGroupVisible(paramInt, paramBoolean);
  }
  
  public final void setQwertyMode(boolean paramBoolean) {
    this.c.setQwertyMode(paramBoolean);
  }
  
  public final int size() {
    return this.c.size();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */