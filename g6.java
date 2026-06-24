import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public abstract class g6 {
  public static final tk1 b = new tk1((f6)new Object());
  
  public static final int c = -100;
  
  public static vo0 e = null;
  
  public static vo0 f = null;
  
  public static Boolean g = null;
  
  public static boolean h = false;
  
  public static final d9 i = new d9(0);
  
  public static final Object j = new Object();
  
  public static final Object k = new Object();
  
  public static boolean d(Context paramContext) {
    if (g == null)
      try {
        int i = o8.b;
        i = n8.a();
        PackageManager packageManager = paramContext.getPackageManager();
        ComponentName componentName = new ComponentName();
        this(paramContext, o8.class);
        Bundle bundle = (packageManager.getServiceInfo(componentName, i | 0x80)).metaData;
        if (bundle != null)
          g = Boolean.valueOf(bundle.getBoolean("autoStoreLocales")); 
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
        g = Boolean.FALSE;
      }  
    return g.booleanValue();
  }
  
  public static void h(u6 paramu6) {
    Object object = j;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      d9 d91 = i;
      d91.getClass();
      x8 x8 = new x8();
      this(d91);
      while (x8.hasNext()) {
        g6 g61 = ((WeakReference<g6>)x8.next()).get();
        if (g61 == paramu6 || g61 == null)
          x8.remove(); 
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public abstract void a();
  
  public abstract void b();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract boolean i(int paramInt);
  
  public abstract void j(int paramInt);
  
  public abstract void k(View paramView);
  
  public abstract void l(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void m(CharSequence paramCharSequence);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */