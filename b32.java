import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

public abstract class b32 {
  public static final WindowInsets a = x62.b.g();
  
  public static boolean b = false;
  
  public static WindowInsets a(View paramView, WindowInsets paramWindowInsets) {
    Object object3 = paramView.getTag(2131297578);
    Object object2 = paramView.getTag(2131297588);
    if (object3 instanceof View.OnApplyWindowInsetsListener) {
      object2 = object3;
    } else if (object2 instanceof View.OnApplyWindowInsetsListener) {
      object2 = object2;
    } else {
      object2 = null;
    } 
    object3 = a;
    WindowInsets[] arrayOfWindowInsets = new WindowInsets[1];
    arrayOfWindowInsets[0] = (WindowInsets)object3;
    paramView.setOnApplyWindowInsetsListener(new z22(arrayOfWindowInsets, (View.OnApplyWindowInsetsListener)object2));
    paramView.dispatchApplyWindowInsets(paramWindowInsets);
    Object object1 = paramView.getTag(2131297573);
    if (object1 instanceof View.OnApplyWindowInsetsListener)
      object2 = object1; 
    paramView.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)object2);
    object1 = arrayOfWindowInsets[0];
    if (object1 != null && !object1.isConsumed() && paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      int i = viewGroup.getChildCount();
      for (byte b = 0; b < i; b++)
        a(viewGroup.getChildAt(b), arrayOfWindowInsets[0]); 
    } 
    WindowInsets windowInsets = arrayOfWindowInsets[0];
    return (WindowInsets)((windowInsets != null) ? windowInsets : object3);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */