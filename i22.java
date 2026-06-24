import android.text.TextUtils;
import android.view.View;

public final class i22 extends jr0 {
  public final int g;
  
  public final Object b(View paramView) {
    switch (this.g) {
      default:
        return Boolean.valueOf(q22.b(paramView));
      case 2:
        return s22.b(paramView);
      case 1:
        return q22.a(paramView);
      case 0:
        break;
    } 
    return Boolean.valueOf(q22.c(paramView));
  }
  
  public final void c(View paramView, Object paramObject) {
    switch (this.g) {
      default:
        q22.d(paramView, ((Boolean)paramObject).booleanValue());
        return;
      case 2:
        s22.c(paramView, (CharSequence)paramObject);
        return;
      case 1:
        q22.e(paramView, (CharSequence)paramObject);
        return;
      case 0:
        break;
    } 
    q22.f(paramView, ((Boolean)paramObject).booleanValue());
  }
  
  public final boolean f(Object paramObject1, Object paramObject2) {
    byte b;
    boolean bool;
    int i = this.g;
    boolean bool1 = false;
    boolean bool2 = false;
    switch (i) {
      default:
        paramObject1 = paramObject1;
        paramObject2 = paramObject2;
        if (paramObject1 != null && paramObject1.booleanValue()) {
          i = 1;
        } else {
          i = 0;
        } 
        if (paramObject2 != null && paramObject2.booleanValue()) {
          b = 1;
        } else {
          b = 0;
        } 
        bool1 = bool2;
        if (i == b)
          bool1 = true; 
        return bool1 ^ true;
      case 2:
        bool = TextUtils.equals((CharSequence)paramObject1, (CharSequence)paramObject2);
        return bool ^ true;
      case 1:
        bool = TextUtils.equals((CharSequence)paramObject1, (CharSequence)paramObject2);
        return bool ^ true;
      case 0:
        break;
    } 
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    if (paramObject1 != null && paramObject1.booleanValue()) {
      i = 1;
    } else {
      i = 0;
    } 
    if (paramObject2 != null && paramObject2.booleanValue()) {
      b = 1;
    } else {
      b = 0;
    } 
    if (i == b)
      bool1 = true; 
    return bool1 ^ true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */