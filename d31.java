import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

public abstract class d31 {
  public static <T, V> ObjectAnimator a(T paramT, Property<T, V> paramProperty, Path paramPath) {
    return ObjectAnimator.ofObject(paramT, paramProperty, null, paramPath);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */