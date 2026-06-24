import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

public final class z4 extends Drawable.ConstantState {
  public w12 a;
  
  public AnimatorSet b;
  
  public ArrayList c;
  
  public b9 d;
  
  public final int getChangingConfigurations() {
    return 0;
  }
  
  public final Drawable newDrawable() {
    throw new IllegalStateException("No constant state support for SDK < 24.");
  }
  
  public final Drawable newDrawable(Resources paramResources) {
    throw new IllegalStateException("No constant state support for SDK < 24.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */