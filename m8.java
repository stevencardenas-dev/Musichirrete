import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;

public class m8 {
  public static final Class[] b = new Class[] { Context.class, AttributeSet.class };
  
  public static final int[] c = new int[] { 16843375 };
  
  public static final int[] d = new int[] { 16844160 };
  
  public static final int[] e = new int[] { 16844156 };
  
  public static final int[] f = new int[] { 16844148 };
  
  public static final String[] g = new String[] { "android.widget.", "android.view.", "android.webkit." };
  
  public static final zm1 h = new zm1(0);
  
  public final Object[] a = new Object[2];
  
  public AppCompatAutoCompleteTextView a(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatAutoCompleteTextView(paramContext, paramAttributeSet);
  }
  
  public AppCompatButton b(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatButton(paramContext, paramAttributeSet);
  }
  
  public AppCompatCheckBox c(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatCheckBox(paramContext, paramAttributeSet);
  }
  
  public AppCompatRadioButton d(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatRadioButton(paramContext, paramAttributeSet);
  }
  
  public AppCompatTextView e(Context paramContext, AttributeSet paramAttributeSet) {
    return new AppCompatTextView(paramContext, paramAttributeSet);
  }
  
  public final View f(Context paramContext, String paramString1, String paramString2) {
    zm1 zm11 = h;
    Constructor<View> constructor2 = (Constructor)zm11.get(paramString1);
    Constructor<View> constructor1 = constructor2;
    if (constructor2 == null) {
      if (paramString2 != null)
        try {
          paramString2 = paramString2.concat(paramString1);
          constructor1 = Class.forName(paramString2, false, paramContext.getClassLoader()).<View>asSubclass(View.class).getConstructor(b);
          zm11.put(paramString1, constructor1);
          constructor1.setAccessible(true);
          return constructor1.newInstance(this.a);
        } catch (Exception exception) {
          return null;
        }  
      paramString2 = paramString1;
    } else {
      constructor1.setAccessible(true);
      return constructor1.newInstance(this.a);
    } 
    constructor1 = Class.forName(paramString2, false, paramContext.getClassLoader()).<View>asSubclass(View.class).getConstructor(b);
    zm11.put(paramString1, constructor1);
    constructor1.setAccessible(true);
    return constructor1.newInstance(this.a);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */