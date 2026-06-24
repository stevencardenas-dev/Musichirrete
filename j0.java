import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public final class j0 extends View.AccessibilityDelegate {
  public final k0 a;
  
  public j0(k0 paramk0) {
    this.a = paramk0;
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    return this.a.a(paramView, paramAccessibilityEvent);
  }
  
  public final AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView) {
    gh1 gh1 = this.a.b(paramView);
    return (gh1 != null) ? (AccessibilityNodeProvider)gh1.c : null;
  }
  
  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.c(paramView, paramAccessibilityEvent);
  }
  
  public final void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    boolean bool2;
    t0 t0 = new t0(paramAccessibilityNodeInfo);
    Object object = v22.a;
    int i = Build.VERSION.SDK_INT;
    SparseArray sparseArray = null;
    if (i >= 28) {
      Boolean bool = Boolean.valueOf(q22.c(paramView));
    } else {
      object = paramView.getTag(2131297581);
      if (!Boolean.class.isInstance(object))
        object = null; 
    } 
    object = object;
    boolean bool1 = false;
    boolean bool3 = true;
    if (object != null && object.booleanValue()) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    t0.n(bool2);
    if (Build.VERSION.SDK_INT >= 28) {
      object = Boolean.valueOf(q22.b(paramView));
    } else {
      object = paramView.getTag(2131297571);
      if (!Boolean.class.isInstance(object))
        object = null; 
    } 
    object = object;
    if (object != null && object.booleanValue()) {
      bool2 = bool3;
    } else {
      bool2 = false;
    } 
    t0.k(bool2);
    t0.m(v22.e(paramView));
    i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      object = s22.b(paramView);
    } else {
      object = paramView.getTag(2131297582);
      if (!CharSequence.class.isInstance(object))
        object = null; 
    } 
    object = object;
    if (i >= 30) {
      n0.x(paramAccessibilityNodeInfo, (CharSequence)object);
    } else {
      paramAccessibilityNodeInfo.getExtras().putCharSequence(uvJYmft.GUhiYF, (CharSequence)object);
    } 
    this.a.d(paramView, t0);
    CharSequence charSequence = paramAccessibilityNodeInfo.getText();
    if (i < 26) {
      paramAccessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      paramAccessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      paramAccessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      paramAccessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
      SparseArray sparseArray1 = (SparseArray)paramView.getTag(2131297570);
      if (sparseArray1 != null) {
        object = new ArrayList();
        for (i = 0; i < sparseArray1.size(); i++) {
          if (((WeakReference)sparseArray1.valueAt(i)).get() == null)
            object.add(Integer.valueOf(i)); 
        } 
        for (i = 0; i < object.size(); i++)
          sparseArray1.remove(((Integer)object.get(i)).intValue()); 
      } 
      object = sparseArray;
      if (charSequence instanceof Spanned)
        object = ((Spanned)charSequence).getSpans(0, charSequence.length(), ClickableSpan.class); 
      if (object != null && object.length > 0) {
        paramAccessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", 2131296274);
        sparseArray = (SparseArray)paramView.getTag(2131297570);
        SparseArray sparseArray2 = sparseArray;
        if (sparseArray == null) {
          sparseArray2 = new SparseArray();
          paramView.setTag(2131297570, sparseArray2);
        } 
        for (i = 0; i < object.length; i++) {
          Object object1 = object[i];
          int j = 0;
          while (true) {
            if (j < sparseArray2.size()) {
              if (object1.equals(((WeakReference<ClickableSpan>)sparseArray2.valueAt(j)).get())) {
                j = sparseArray2.keyAt(j);
                break;
              } 
              j++;
              continue;
            } 
            j = t0.c;
            t0.c = j + 1;
            break;
          } 
          sparseArray2.put(j, new WeakReference(object[i]));
          object1 = object[i];
          Spanned spanned = (Spanned)charSequence;
          t0.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(object1)));
          t0.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(object1)));
          t0.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(object1)));
          t0.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(j));
        } 
      } 
    } 
    List<m0> list2 = (List)paramView.getTag(2131297569);
    i = bool1;
    List<m0> list1 = list2;
    if (list2 == null) {
      list1 = Collections.EMPTY_LIST;
      i = bool1;
    } 
    while (i < list1.size()) {
      t0.b(list1.get(i));
      i++;
    } 
  }
  
  public final void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.e(paramView, paramAccessibilityEvent);
  }
  
  public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent) {
    return this.a.f(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle) {
    return this.a.g(paramView, paramInt, paramBundle);
  }
  
  public final void sendAccessibilityEvent(View paramView, int paramInt) {
    this.a.h(paramView, paramInt);
  }
  
  public final void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.i(paramView, paramAccessibilityEvent);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */