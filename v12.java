import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class v12 extends Drawable.ConstantState {
  public final Drawable.ConstantState a;
  
  public v12(Drawable.ConstantState paramConstantState) {
    this.a = paramConstantState;
  }
  
  public final boolean canApplyTheme() {
    return this.a.canApplyTheme();
  }
  
  public int getChangingConfigurations() {
    return this.a.getChangingConfigurations();
  }
  
  public final Drawable newDrawable() {
    w12 w12 = new w12();
    w12.b = this.a.newDrawable();
    return w12;
  }
  
  public final Drawable newDrawable(Resources paramResources) {
    w12 w12 = new w12();
    w12.b = this.a.newDrawable(paramResources);
    return w12;
  }
  
  public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme) {
    w12 w12 = new w12();
    w12.b = this.a.newDrawable(paramResources, paramTheme);
    return w12;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */