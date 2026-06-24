import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class u12 extends Drawable.ConstantState {
  public int a;
  
  public t12 b;
  
  public ColorStateList c;
  
  public PorterDuff.Mode d;
  
  public boolean e;
  
  public Bitmap f;
  
  public ColorStateList g;
  
  public PorterDuff.Mode h;
  
  public int i;
  
  public boolean j;
  
  public boolean k;
  
  public Paint l;
  
  public int getChangingConfigurations() {
    return this.a;
  }
  
  public final Drawable newDrawable() {
    return new w12(this);
  }
  
  public final Drawable newDrawable(Resources paramResources) {
    return new w12(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */