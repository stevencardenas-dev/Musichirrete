import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class a5 extends Drawable.ConstantState {
  public final int a;
  
  public final Object b;
  
  public a5(Drawable.ConstantState paramConstantState) {
    this.b = paramConstantState;
  }
  
  public a5(ug paramug) {}
  
  public boolean canApplyTheme() {
    switch (this.a) {
      default:
        return super.canApplyTheme();
      case 0:
        break;
    } 
    return ((Drawable.ConstantState)this.b).canApplyTheme();
  }
  
  public final int getChangingConfigurations() {
    switch (this.a) {
      default:
        return 0;
      case 0:
        break;
    } 
    return ((Drawable.ConstantState)this.b).getChangingConfigurations();
  }
  
  public final Drawable newDrawable() {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        return (ug)object;
      case 0:
        break;
    } 
    b5 b5 = new b5(null);
    object = ((Drawable.ConstantState)object).newDrawable();
    b5.b = (Drawable)object;
    object.setCallback(b5.h);
    return b5;
  }
  
  public Drawable newDrawable(Resources paramResources) {
    switch (this.a) {
      default:
        return super.newDrawable(paramResources);
      case 0:
        break;
    } 
    b5 b5 = new b5(null);
    Drawable drawable = ((Drawable.ConstantState)this.b).newDrawable(paramResources);
    b5.b = drawable;
    drawable.setCallback(b5.h);
    return b5;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme) {
    switch (this.a) {
      default:
        return super.newDrawable(paramResources, paramTheme);
      case 0:
        break;
    } 
    b5 b5 = new b5(null);
    Drawable drawable = ((Drawable.ConstantState)this.b).newDrawable(paramResources, paramTheme);
    b5.b = drawable;
    drawable.setCallback(b5.h);
    return b5;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */