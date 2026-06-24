import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import java.util.ArrayList;

public final class fy0 {
  public final zm1 a = new zm1(0);
  
  public final zm1 b = new zm1(0);
  
  public static fy0 a(Context paramContext, int paramInt) {
    try {
      Animator animator = AnimatorInflater.loadAnimator(paramContext, paramInt);
      if (animator instanceof AnimatorSet)
        return b(((AnimatorSet)animator).getChildAnimations()); 
    } catch (Exception exception) {}
    if (exception != null) {
      ArrayList<Exception> arrayList = new ArrayList();
      this();
      arrayList.add(exception);
      return b(arrayList);
    } 
    return null;
  }
  
  public static fy0 b(ArrayList<Animator> paramArrayList) {
    fy0 fy01 = new fy0();
    int i = paramArrayList.size();
    byte b = 0;
    while (b < i) {
      ObjectAnimator objectAnimator;
      Animator animator = paramArrayList.get(b);
      if (animator instanceof ObjectAnimator) {
        objectAnimator = (ObjectAnimator)animator;
        String str1 = objectAnimator.getPropertyName();
        PropertyValuesHolder[] arrayOfPropertyValuesHolder = objectAnimator.getValues();
        fy01.b.put(str1, arrayOfPropertyValuesHolder);
        String str2 = objectAnimator.getPropertyName();
        long l1 = objectAnimator.getStartDelay();
        long l2 = objectAnimator.getDuration();
        TimeInterpolator timeInterpolator = objectAnimator.getInterpolator();
        Object object = new Object();
        ((gy0)object).d = 0;
        ((gy0)object).e = 1;
        ((gy0)object).a = l1;
        ((gy0)object).b = l2;
        ((gy0)object).c = timeInterpolator;
        ((gy0)object).d = objectAnimator.getRepeatCount();
        ((gy0)object).e = objectAnimator.getRepeatMode();
        fy01.a.put(str2, object);
        b++;
        continue;
      } 
      m60.k("Animator must be an ObjectAnimator: ", objectAnimator);
      return null;
    } 
    return fy01;
  }
  
  public final gy0 c(String paramString) {
    zm1 zm11 = this.a;
    if (zm11.get(paramString) != null)
      return (gy0)zm11.get(paramString); 
    l0.k();
    return null;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof fy0))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((fy0)paramObject).a);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("\n");
    stringBuilder.append(fy0.class.getName());
    stringBuilder.append('{');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" timings: ");
    stringBuilder.append(this.a);
    stringBuilder.append("}\n");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */