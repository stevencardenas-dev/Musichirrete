import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public abstract class ow1 {
  public static final sa a = new sa();
  
  public static final ThreadLocal b = new ThreadLocal();
  
  public static final ArrayList c = new ArrayList();
  
  public static void a(FrameLayout paramFrameLayout, kw1 paramkw1) {
    ArrayList<FrameLayout> arrayList = c;
    if (!arrayList.contains(paramFrameLayout) && paramFrameLayout.isLaidOut()) {
      arrayList.add(paramFrameLayout);
      kw1 kw11 = paramkw1;
      if (paramkw1 == null)
        kw11 = a; 
      paramkw1 = kw11.j();
      ArrayList<Object> arrayList1 = (ArrayList)b().get(paramFrameLayout);
      if (arrayList1 != null && arrayList1.size() > 0) {
        int i = arrayList1.size();
        byte b = 0;
        while (b < i) {
          kw1 kw12 = (kw1)arrayList1.get(b);
          b++;
          ((kw1)kw12).y((View)paramFrameLayout);
        } 
      } 
      paramkw1.h((ViewGroup)paramFrameLayout, true);
      if (paramFrameLayout.getTag(2131297667) == null) {
        paramFrameLayout.setTag(2131297667, null);
        Object object = new Object();
        ((nw1)object).b = paramkw1;
        ((nw1)object).c = (ViewGroup)paramFrameLayout;
        paramFrameLayout.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
        paramFrameLayout.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object);
        return;
      } 
      tp.b();
    } 
  }
  
  public static b9 b() {
    ThreadLocal<WeakReference> threadLocal = b;
    WeakReference<b9> weakReference = threadLocal.get();
    if (weakReference != null) {
      b9 b9 = weakReference.get();
      if (b9 != null)
        return b9; 
    } 
    zm1 zm1 = new zm1(0);
    threadLocal.set(new WeakReference<zm1>(zm1));
    return (b9)zm1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ow1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */