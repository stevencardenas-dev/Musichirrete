import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public final class is extends ViewGroup.MarginLayoutParams {
  public fs a;
  
  public boolean b = false;
  
  public final int c = 0;
  
  public final int d = 0;
  
  public final int e = -1;
  
  public final int f = -1;
  
  public int g = 0;
  
  public int h = 0;
  
  public int i;
  
  public int j;
  
  public View k;
  
  public View l;
  
  public boolean m;
  
  public boolean n;
  
  public boolean o;
  
  public final Rect p = new Rect();
  
  public is() {
    super(-2, -2);
  }
  
  public is(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, gc1.b);
    this.c = typedArray.getInteger(0, 0);
    this.f = typedArray.getResourceId(1, -1);
    this.d = typedArray.getInteger(2, 0);
    this.e = typedArray.getInteger(6, -1);
    this.g = typedArray.getInt(5, 0);
    this.h = typedArray.getInt(4, 0);
    boolean bool = typedArray.hasValue(3);
    this.b = bool;
    if (bool) {
      String str1;
      fs fs2;
      String str3 = typedArray.getString(3);
      String str2 = CoordinatorLayout.v;
      bool = TextUtils.isEmpty(str3);
      str2 = null;
      if (bool) {
        str1 = str2;
      } else {
        String str;
        Map<Object, Object> map;
        if (str3.startsWith(".")) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str1.getPackageName());
          stringBuilder.append(str3);
          str = stringBuilder.toString();
        } else if (str3.indexOf('.') >= 0) {
          str2 = str3;
        } else {
          String str4 = CoordinatorLayout.v;
          str2 = str3;
          if (!TextUtils.isEmpty(str4)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str4);
            stringBuilder.append('.');
            stringBuilder.append(str3);
            str = stringBuilder.toString();
          } 
        } 
        try {
          ThreadLocal<Map> threadLocal = CoordinatorLayout.x;
          Map<Object, Object> map1 = threadLocal.get();
          map = map1;
          if (map1 == null) {
            map = new HashMap<Object, Object>();
            super();
            threadLocal.set(map);
          } 
        } catch (Exception exception) {}
        Constructor<?> constructor2 = (Constructor)map.get(str);
        Constructor<?> constructor1 = constructor2;
        if (constructor2 == null) {
          constructor1 = Class.forName(str, false, exception.getClassLoader()).getConstructor(CoordinatorLayout.w);
          constructor1.setAccessible(true);
          map.put(str, constructor1);
        } 
        fs2 = (fs)constructor1.newInstance(new Object[] { exception, paramAttributeSet });
      } 
      this.a = fs2;
    } 
    typedArray.recycle();
    fs fs1 = this.a;
    if (fs1 != null)
      fs1.g(this); 
  }
  
  public is(ViewGroup.LayoutParams paramLayoutParams) {
    super(paramLayoutParams);
  }
  
  public is(ViewGroup.MarginLayoutParams paramMarginLayoutParams) {
    super(paramMarginLayoutParams);
  }
  
  public is(is paramis) {
    super(paramis);
  }
  
  public final boolean a(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? false : this.n) : this.m;
  }
  
  public final void b(fs paramfs) {
    fs fs1 = this.a;
    if (fs1 != paramfs) {
      if (fs1 != null)
        fs1.j(); 
      this.a = paramfs;
      this.b = true;
      if (paramfs != null)
        paramfs.g(this); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\is.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */