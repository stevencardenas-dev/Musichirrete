import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class v22 {
  public static WeakHashMap a;
  
  public static Field b;
  
  public static boolean c;
  
  public static final int[] d = new int[] { 
      2131296275, 2131296276, 2131296287, 2131296298, 2131296301, 2131296302, 2131296303, 2131296304, 2131296305, 2131296306, 
      2131296277, 2131296278, 2131296279, 2131296280, 2131296281, 2131296282, 2131296283, 2131296284, 2131296285, 2131296286, 
      2131296288, 2131296289, 2131296290, 2131296291, 2131296292, 2131296293, 2131296294, 2131296295, 2131296296, 2131296297, 
      2131296299, 2131296300 };
  
  public static final h22 e = (h22)new Object();
  
  public static final j22 f = new j22();
  
  public static u32 a(View paramView) {
    if (a == null)
      a = new WeakHashMap<Object, Object>(); 
    u32 u322 = (u32)a.get(paramView);
    u32 u321 = u322;
    if (u322 == null) {
      u321 = new u32(paramView);
      a.put(paramView, u321);
    } 
    return u321;
  }
  
  public static x62 b(View paramView, x62 paramx62) {
    WindowInsets windowInsets = paramx62.g();
    if (windowInsets != null) {
      WindowInsets windowInsets1;
      if (Build.VERSION.SDK_INT >= 30) {
        windowInsets1 = s22.a(paramView, windowInsets);
      } else {
        windowInsets1 = k22.a(paramView, windowInsets);
      } 
      if (!windowInsets1.equals(windowInsets))
        return x62.h(paramView, windowInsets1); 
    } 
    return paramx62;
  }
  
  public static boolean c(View paramView, KeyEvent paramKeyEvent) {
    if (Build.VERSION.SDK_INT < 28) {
      ArrayList arrayList = u22.d;
      u22 u22 = (u22)paramView.getTag(2131297585);
      Object object = u22;
      if (u22 == null) {
        object = new Object();
        ((u22)object).a = null;
        ((u22)object).b = null;
        ((u22)object).c = null;
        paramView.setTag(2131297585, object);
      } 
      if (paramKeyEvent.getAction() == 0) {
        WeakHashMap<Object, Object> weakHashMap = ((u22)object).a;
        if (weakHashMap != null)
          weakHashMap.clear(); 
        ArrayList arrayList1 = u22.d;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
        if (!arrayList1.isEmpty()) {
          try {
            if (((u22)object).a == null) {
              weakHashMap = new WeakHashMap<Object, Object>();
              this();
              ((u22)object).a = weakHashMap;
            } 
          } finally {}
          for (int i = arrayList1.size() - 1; i >= 0; i--) {
            ArrayList<WeakReference<View>> arrayList2 = u22.d;
            View view = ((WeakReference<View>)arrayList2.get(i)).get();
            if (view == null) {
              arrayList2.remove(i);
            } else {
              ((u22)object).a.put(view, Boolean.TRUE);
              for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent())
                ((u22)object).a.put((View)viewParent, Boolean.TRUE); 
            } 
          } 
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
        } 
      } 
      paramView = object.a(paramView);
      if (paramKeyEvent.getAction() == 0) {
        int i = paramKeyEvent.getKeyCode();
        if (paramView != null && !KeyEvent.isModifierKey(i)) {
          if (((u22)object).b == null)
            ((u22)object).b = new SparseArray(); 
          ((u22)object).b.put(i, new WeakReference<View>(paramView));
        } 
      } 
      if (paramView != null)
        return true; 
    } 
    return false;
  }
  
  public static View.AccessibilityDelegate d(View paramView) {
    if (Build.VERSION.SDK_INT >= 29)
      return r22.a(paramView); 
    if (!c)
      if (b == null); 
    return null;
  }
  
  public static CharSequence e(View paramView) {
    Object object;
    if (Build.VERSION.SDK_INT >= 28) {
      object = q22.a(paramView);
    } else {
      object = object.getTag(2131297572);
      if (!CharSequence.class.isInstance(object))
        object = null; 
    } 
    return (CharSequence)object;
  }
  
  public static ArrayList f(View paramView) {
    ArrayList arrayList2 = (ArrayList)paramView.getTag(2131297569);
    ArrayList arrayList1 = arrayList2;
    if (arrayList2 == null) {
      arrayList1 = new ArrayList();
      paramView.setTag(2131297569, arrayList1);
    } 
    return arrayList1;
  }
  
  public static String[] g(a7 parama7) {
    return (Build.VERSION.SDK_INT >= 31) ? t22.a((View)parama7) : (String[])parama7.getTag(2131297580);
  }
  
  public static void h(View paramView, int paramInt) {
    AccessibilityManager accessibilityManager = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
    if (accessibilityManager.isEnabled()) {
      boolean bool;
      AccessibilityEvent accessibilityEvent;
      if (e(paramView) != null && paramView.isShown() && paramView.getWindowVisibility() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      int i = paramView.getAccessibilityLiveRegion();
      char c = ' ';
      if (i != 0 || bool) {
        accessibilityEvent = AccessibilityEvent.obtain();
        if (!bool)
          c = 'ࠀ'; 
        accessibilityEvent.setEventType(c);
        accessibilityEvent.setContentChangeTypes(paramInt);
        if (bool) {
          accessibilityEvent.getText().add(e(paramView));
          if (paramView.getImportantForAccessibility() == 0)
            paramView.setImportantForAccessibility(1); 
        } 
        paramView.sendAccessibilityEventUnchecked(accessibilityEvent);
        return;
      } 
      if (paramInt == 32) {
        AccessibilityEvent accessibilityEvent1 = AccessibilityEvent.obtain();
        paramView.onInitializeAccessibilityEvent(accessibilityEvent1);
        accessibilityEvent1.setEventType(32);
        accessibilityEvent1.setContentChangeTypes(paramInt);
        accessibilityEvent1.setSource(paramView);
        paramView.onPopulateAccessibilityEvent(accessibilityEvent1);
        accessibilityEvent1.getText().add(e(paramView));
        accessibilityEvent.sendAccessibilityEvent(accessibilityEvent1);
        return;
      } 
      if (paramView.getParent() != null) {
        ViewParent viewParent = paramView.getParent();
        try {
          viewParent.notifySubtreeAccessibilityStateChanged(paramView, paramView, paramInt);
          return;
        } catch (AbstractMethodError abstractMethodError) {
          Log.e("ViewCompat", paramView.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), abstractMethodError);
        } 
      } 
    } 
  }
  
  public static x62 i(View paramView, x62 paramx62) {
    WindowInsets windowInsets = paramx62.g();
    if (windowInsets != null) {
      WindowInsets windowInsets1 = paramView.onApplyWindowInsets(windowInsets);
      if (!windowInsets1.equals(windowInsets))
        return x62.h(paramView, windowInsets1); 
    } 
    return paramx62;
  }
  
  public static xr j(View paramView, xr paramxr) {
    if (Log.isLoggable("ViewCompat", 3)) {
      StringBuilder stringBuilder = new StringBuilder("performReceiveContent: ");
      stringBuilder.append(paramxr);
      stringBuilder.append(", view=");
      stringBuilder.append(paramView.getClass().getSimpleName());
      stringBuilder.append("[");
      stringBuilder.append(paramView.getId());
      stringBuilder.append("]");
      Log.d("ViewCompat", stringBuilder.toString());
    } 
    if (Build.VERSION.SDK_INT >= 31)
      return t22.b(paramView, paramxr); 
    hu1 hu1 = (hu1)paramView.getTag(2131297579);
    n41 n41 = e;
    if (hu1 != null) {
      n41 n411;
      paramxr = hu1.a(paramView, paramxr);
      if (paramxr == null)
        return null; 
      if (paramView instanceof n41)
        n411 = (n41)paramView; 
      return n411.a(paramxr);
    } 
    if (paramView instanceof n41)
      n41 = (n41)paramView; 
    return n41.a(paramxr);
  }
  
  public static void k(View paramView, int paramInt) {
    ArrayList<m0> arrayList = f(paramView);
    for (byte b = 0; b < arrayList.size(); b++) {
      if (((m0)arrayList.get(b)).a() == paramInt) {
        arrayList.remove(b);
        return;
      } 
    } 
  }
  
  public static void l(View paramView, m0 paramm0, d1 paramd1) {
    k0 k01;
    m0 m01 = new m0(null, paramm0.b, null, paramd1, paramm0.c);
    View.AccessibilityDelegate accessibilityDelegate = d(paramView);
    if (accessibilityDelegate == null) {
      accessibilityDelegate = null;
    } else if (accessibilityDelegate instanceof j0) {
      k01 = ((j0)accessibilityDelegate).a;
    } else {
      k01 = new k0((View.AccessibilityDelegate)k01);
    } 
    k0 k02 = k01;
    if (k01 == null)
      k02 = new k0(); 
    n(paramView, k02);
    k(paramView, m01.a());
    f(paramView).add(m01);
    h(paramView, 0);
  }
  
  public static void m(View paramView, Context paramContext, int[] paramArrayOfint, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt) {
    if (Build.VERSION.SDK_INT >= 29)
      r22.b(paramView, paramContext, paramArrayOfint, paramAttributeSet, paramTypedArray, paramInt, 0); 
  }
  
  public static void n(View paramView, k0 paramk0) {
    j0 j0;
    k0 k01 = paramk0;
    if (paramk0 == null) {
      k01 = paramk0;
      if (d(paramView) instanceof j0)
        k01 = new k0(); 
    } 
    if (paramView.getImportantForAccessibility() == 0)
      paramView.setImportantForAccessibility(1); 
    if (k01 == null) {
      paramk0 = null;
    } else {
      j0 = k01.b;
    } 
    paramView.setAccessibilityDelegate(j0);
  }
  
  public static void o(View paramView, CharSequence paramCharSequence) {
    (new i22(2131297572, CharSequence.class, 8, 28, 1)).e(paramView, paramCharSequence);
    j22 j221 = f;
    if (paramCharSequence != null) {
      boolean bool;
      WeakHashMap<View, Boolean> weakHashMap = j221.b;
      if (paramView.isShown() && paramView.getWindowVisibility() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      weakHashMap.put(paramView, Boolean.valueOf(bool));
      paramView.addOnAttachStateChangeListener(j221);
      if (paramView.isAttachedToWindow())
        paramView.getViewTreeObserver().addOnGlobalLayoutListener(j221); 
      return;
    } 
    j221.b.remove(paramView);
    paramView.removeOnAttachStateChangeListener(j221);
    paramView.getViewTreeObserver().removeOnGlobalLayoutListener(j221);
  }
  
  public static void p(View paramView, hd paramhd) {
    if (Build.VERSION.SDK_INT >= 30) {
      b62.h(paramView, paramhd);
      return;
    } 
    PathInterpolator pathInterpolator = y52.e;
    x52 x52 = new x52(paramView, paramhd);
    paramView.setTag(2131297588, x52);
    if (paramView.getTag(2131297573) == null && paramView.getTag(2131297578) == null)
      paramView.setOnApplyWindowInsetsListener(x52); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */