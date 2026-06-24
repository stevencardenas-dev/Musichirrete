import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class ab0 implements LayoutInflater.Factory2 {
  public final lb0 b;
  
  public ab0(lb0 paramlb0) {
    this.b = paramlb0;
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    boolean bool = ya0.class.getName().equals(paramString);
    lb0 lb01 = this.b;
    if (bool)
      return (View)new ya0(paramContext, paramAttributeSet, lb01); 
    if ("fragment".equals(paramString)) {
      paramString = paramAttributeSet.getAttributeValue(null, "class");
      TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ic1.a);
      int i = 0;
      String str1 = paramString;
      if (paramString == null)
        str1 = typedArray.getString(0); 
      int j = typedArray.getResourceId(1, -1);
      String str2 = typedArray.getString(2);
      typedArray.recycle();
      if (str1 != null) {
        ClassLoader classLoader = paramContext.getClassLoader();
        try {
          bool = ua0.class.isAssignableFrom(eb0.b(classLoader, str1));
        } catch (ClassNotFoundException classNotFoundException) {
          bool = false;
        } 
        if (bool) {
          StringBuilder stringBuilder2;
          if (paramView != null)
            i = paramView.getId(); 
          if (i != -1 || j != -1 || str2 != null) {
            String str3;
            sb0 sb0;
            String str4;
            ua0 ua02;
            if (j != -1) {
              ua0 ua0 = lb01.D(j);
            } else {
              classLoader = null;
            } 
            ClassLoader classLoader1 = classLoader;
            if (classLoader == null) {
              classLoader1 = classLoader;
              if (str2 != null)
                ua02 = lb01.E(str2); 
            } 
            ua0 ua01 = ua02;
            if (ua02 == null) {
              ua01 = ua02;
              if (i != -1)
                ua01 = lb01.D(i); 
            } 
            if (ua01 == null) {
              int k;
              eb0 eb0 = lb01.J();
              paramContext.getClassLoader();
              ua02 = eb0.a(str1);
              ua02.q = true;
              if (j != 0) {
                k = j;
              } else {
                k = i;
              } 
              ua02.A = k;
              ua02.B = i;
              ua02.C = str2;
              ua02.r = true;
              ua02.w = lb01;
              wa0 wa0 = lb01.w;
              ua02.x = wa0;
              x5 x5 = wa0.l;
              ua02.I = true;
              if (wa0 == null) {
                x5 = null;
              } else {
                x5 = wa0.k;
              } 
              if (x5 != null)
                ua02.I = true; 
              sb0 = lb01.a(ua02);
              ua0 ua0 = ua02;
              sb0 sb01 = sb0;
              if (lb0.M(2)) {
                StringBuilder stringBuilder3 = new StringBuilder("Fragment ");
                stringBuilder3.append(ua02);
                stringBuilder3.append(" has been inflated via the <fragment> tag: id=0x");
                stringBuilder3.append(Integer.toHexString(j));
                Log.v("FragmentManager", stringBuilder3.toString());
                ua0 ua03 = ua02;
                sb01 = sb0;
              } 
            } else {
              sb0 sb01;
              if (!((ua0)sb0).r) {
                ((ua0)sb0).r = true;
                ((ua0)sb0).w = lb01;
                wa0 wa0 = lb01.w;
                ((ua0)sb0).x = wa0;
                x5 x5 = wa0.l;
                ((ua0)sb0).I = true;
                if (wa0 == null) {
                  x5 = null;
                } else {
                  x5 = wa0.k;
                } 
                if (x5 != null)
                  ((ua0)sb0).I = true; 
                sb0 sb03 = lb01.g((ua0)sb0);
                sb0 sb02 = sb0;
                sb01 = sb03;
                if (lb0.M(2)) {
                  StringBuilder stringBuilder3 = new StringBuilder("Retained Fragment ");
                  stringBuilder3.append(sb0);
                  stringBuilder3.append(" has been re-attached via the <fragment> tag: id=0x");
                  stringBuilder3.append(Integer.toHexString(j));
                  Log.v("FragmentManager", stringBuilder3.toString());
                  sb01 = sb03;
                  sb0 sb04 = sb0;
                } 
              } else {
                str3 = sb01.getPositionDescription();
                str4 = Integer.toHexString(j);
                String str5 = Integer.toHexString(i);
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str3);
                stringBuilder2.append(": Duplicate id 0x");
                stringBuilder2.append(str4);
                stringBuilder2.append(", tag ");
                stringBuilder2.append(str2);
                stringBuilder2.append(", or parent id 0x");
                stringBuilder2.append(str5);
                stringBuilder2.append(" with another fragment for ");
                stringBuilder2.append(str1);
                throw new IllegalArgumentException(stringBuilder2.toString());
              } 
            } 
            ViewGroup viewGroup = (ViewGroup)str3;
            tb0 tb0 = ub0.a;
            StringBuilder stringBuilder = new StringBuilder("Attempting to use <fragment> tag to add fragment ");
            stringBuilder.append(str4);
            stringBuilder.append(" to container ");
            stringBuilder.append(viewGroup);
            ub0.b(new l42((ua0)str4, stringBuilder.toString()));
            ub0.a((ua0)str4).getClass();
            ((ua0)str4).J = viewGroup;
            stringBuilder2.k();
            stringBuilder2.j();
            View view = ((ua0)str4).K;
            if (view != null) {
              if (j != 0)
                view.setId(j); 
              if (((ua0)str4).K.getTag() == null)
                ((ua0)str4).K.setTag(str2); 
              ((ua0)str4).K.addOnAttachStateChangeListener(new za0(this, (sb0)stringBuilder2));
              return ((ua0)str4).K;
            } 
            tp.f(x41.w("Fragment ", str1, " did not create a view."));
            return null;
          } 
          String str = stringBuilder2.getPositionDescription();
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(str);
          stringBuilder1.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
          stringBuilder1.append(str1);
          throw new IllegalArgumentException(stringBuilder1.toString());
        } 
      } 
    } 
    return null;
  }
  
  public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ab0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */