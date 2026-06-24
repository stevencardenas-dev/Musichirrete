import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

public interface dr1 extends MenuItem {
  dr1 a(vw0 paramvw0);
  
  vw0 b();
  
  int getAlphabeticModifiers();
  
  CharSequence getContentDescription();
  
  ColorStateList getIconTintList();
  
  PorterDuff.Mode getIconTintMode();
  
  int getNumericModifiers();
  
  CharSequence getTooltipText();
  
  MenuItem setAlphabeticShortcut(char paramChar, int paramInt);
  
  dr1 setContentDescription(CharSequence paramCharSequence);
  
  MenuItem setIconTintList(ColorStateList paramColorStateList);
  
  MenuItem setIconTintMode(PorterDuff.Mode paramMode);
  
  MenuItem setNumericShortcut(char paramChar, int paramInt);
  
  MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2);
  
  dr1 setTooltipText(CharSequence paramCharSequence);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */