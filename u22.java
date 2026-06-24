import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class u22 {
  public static final ArrayList d = new ArrayList();
  
  public WeakHashMap a;
  
  public SparseArray b;
  
  public WeakReference c;
  
  public final View a(View paramView) {
    WeakHashMap weakHashMap = this.a;
    if (weakHashMap != null && weakHashMap.containsKey(paramView)) {
      if (paramView instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)paramView;
        for (int i = viewGroup.getChildCount() - 1; i >= 0; i--) {
          View view = a(viewGroup.getChildAt(i));
          if (view != null)
            return view; 
        } 
      } 
      ArrayList<E> arrayList = (ArrayList)paramView.getTag(2131297586);
      if (arrayList != null) {
        int i = arrayList.size() - 1;
        if (i >= 0) {
          arrayList.get(i).getClass();
          tp.b();
        } 
      } 
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */