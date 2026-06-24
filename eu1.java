import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

public final class eu1 extends kw1 {
  public final void d(tw1 paramtw1) {
    View view = paramtw1.b;
    if (view instanceof TextView) {
      TextView textView = (TextView)view;
      paramtw1.a.put("android:textscale:scale", Float.valueOf(textView.getScaleX()));
    } 
  }
  
  public final void g(tw1 paramtw1) {
    View view = paramtw1.b;
    if (view instanceof TextView) {
      TextView textView = (TextView)view;
      paramtw1.a.put("android:textscale:scale", Float.valueOf(textView.getScaleX()));
    } 
  }
  
  public final Animator k(ViewGroup paramViewGroup, tw1 paramtw11, tw1 paramtw12) {
    if (paramtw11 != null && paramtw12 != null && paramtw11.b instanceof TextView) {
      View view = paramtw12.b;
      if (view instanceof TextView) {
        float f1;
        TextView textView = (TextView)view;
        HashMap hashMap1 = paramtw11.a;
        HashMap hashMap2 = paramtw12.a;
        Object object = hashMap1.get("android:textscale:scale");
        float f2 = 1.0F;
        if (object != null) {
          f1 = ((Float)hashMap1.get("android:textscale:scale")).floatValue();
        } else {
          f1 = 1.0F;
        } 
        if (hashMap2.get("android:textscale:scale") != null)
          f2 = ((Float)hashMap2.get("android:textscale:scale")).floatValue(); 
        if (f1 != f2) {
          ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { f1, f2 });
          valueAnimator.addUpdateListener(new vd(8, textView));
          return (Animator)valueAnimator;
        } 
      } 
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */