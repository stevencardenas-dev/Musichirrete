import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class jg1 {
  public final ColorStateList a;
  
  public final Configuration b;
  
  public final int c;
  
  public jg1(ColorStateList paramColorStateList, Configuration paramConfiguration, Resources.Theme paramTheme) {
    int i;
    this.a = paramColorStateList;
    this.b = paramConfiguration;
    if (paramTheme == null) {
      i = 0;
    } else {
      i = paramTheme.hashCode();
    } 
    this.c = i;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */