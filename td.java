import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.google.android.material.slider.RangeSlider2;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public final class td extends k0 {
  public static final Rect q = new Rect(2147483647, 2147483647, -2147483648, -2147483648);
  
  public final Rect d = new Rect();
  
  public final Rect e = new Rect();
  
  public final Rect f = new Rect();
  
  public final int[] g = new int[2];
  
  public final AccessibilityManager h;
  
  public final View i;
  
  public a70 j;
  
  public int k = Integer.MIN_VALUE;
  
  public int l = Integer.MIN_VALUE;
  
  public int m = Integer.MIN_VALUE;
  
  public final int n;
  
  public final Rect o;
  
  public final View p;
  
  public td(View paramView) {
    this.i = paramView;
    this.h = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
    paramView.setFocusable(true);
    if (paramView.getImportantForAccessibility() == 0)
      paramView.setImportantForAccessibility(1); 
  }
  
  public td(RangeSlider2 paramRangeSlider2) {
    this((View)paramRangeSlider2);
    this.o = new Rect();
    this.p = (View)paramRangeSlider2;
  }
  
  public td(yd paramyd) {
    this(paramyd);
    this.o = new Rect();
    this.p = paramyd;
  }
  
  public final gh1 b(View paramView) {
    if (this.j == null)
      this.j = new a70(this); 
    return this.j;
  }
  
  public final void d(View paramView, t0 paramt0) {
    this.a.onInitializeAccessibilityNodeInfo(paramView, paramt0.a);
  }
  
  public final boolean j(int paramInt) {
    if (this.l != paramInt)
      return false; 
    this.l = Integer.MIN_VALUE;
    p(paramInt, 8);
    return true;
  }
  
  public final AccessibilityEvent k(int paramInt1, int paramInt2) {
    View view = this.i;
    if (paramInt1 != -1) {
      AccessibilityEvent accessibilityEvent1 = AccessibilityEvent.obtain(paramInt2);
      t0 t0 = n(paramInt1);
      accessibilityEvent1.getText().add(t0.f());
      AccessibilityNodeInfo accessibilityNodeInfo = t0.a;
      accessibilityEvent1.setContentDescription(accessibilityNodeInfo.getContentDescription());
      accessibilityEvent1.setScrollable(accessibilityNodeInfo.isScrollable());
      accessibilityEvent1.setPassword(accessibilityNodeInfo.isPassword());
      accessibilityEvent1.setEnabled(accessibilityNodeInfo.isEnabled());
      accessibilityEvent1.setChecked(accessibilityNodeInfo.isChecked());
      if (!accessibilityEvent1.getText().isEmpty() || accessibilityEvent1.getContentDescription() != null) {
        accessibilityEvent1.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEvent1.setSource(view, paramInt1);
        accessibilityEvent1.setPackageName(view.getContext().getPackageName());
        return accessibilityEvent1;
      } 
      l0.f(jLnXOLx.hyQ);
      return null;
    } 
    AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain(paramInt2);
    view.onInitializeAccessibilityEvent(accessibilityEvent);
    return accessibilityEvent;
  }
  
  public final boolean l(MotionEvent paramMotionEvent) {
    AccessibilityManager accessibilityManager = this.h;
    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
      int i = paramMotionEvent.getAction();
      if (i != 7 && i != 9) {
        if (i == 10) {
          i = this.m;
          if (i != Integer.MIN_VALUE) {
            if (i != Integer.MIN_VALUE) {
              this.m = Integer.MIN_VALUE;
              p(-2147483648, 128);
              p(i, 256);
              return true;
            } 
            return true;
          } 
        } 
      } else {
        int j;
        RangeSlider2 rangeSlider2;
        yd yd;
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        i = this.n;
        byte b = -1;
        View view = this.p;
        Rect rect = this.o;
        switch (i) {
          default:
            rangeSlider2 = (RangeSlider2)view;
            i = 0;
            while (true) {
              j = b;
              if (i < rangeSlider2.getValues().size()) {
                rangeSlider2.u(i, rect);
                if (!rect.contains((int)f1, (int)f2)) {
                  i++;
                  continue;
                } 
              } else {
                break;
              } 
              j = i;
              break;
            } 
            break;
          case 0:
            yd = (yd)rangeSlider2;
            i = 0;
            while (true) {
              j = b;
              if (i < yd.getValues().size()) {
                yd.E(i, rect);
                if (!rect.contains((int)f1, (int)f2)) {
                  i++;
                  continue;
                } 
              } else {
                break;
              } 
              j = i;
              break;
            } 
            break;
        } 
        i = this.m;
        if (i != j) {
          this.m = j;
          p(j, 128);
          p(i, 256);
        } 
        if (j != Integer.MIN_VALUE)
          return true; 
      } 
    } 
    return false;
  }
  
  public final void m(int paramInt) {
    if (paramInt != Integer.MIN_VALUE && this.h.isEnabled()) {
      View view = this.i;
      ViewParent viewParent = view.getParent();
      if (viewParent != null) {
        AccessibilityEvent accessibilityEvent = k(paramInt, 2048);
        accessibilityEvent.setContentChangeTypes(0);
        viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
      } 
    } 
  }
  
  public final t0 n(int paramInt) {
    double d;
    float f1;
    float f2;
    float f3;
    float f4;
    float f5;
    String str1;
    List<Float> list1;
    Object object;
    RangeSlider2 rangeSlider2;
    Float float_;
    String str2;
    StringBuilder stringBuilder1;
    yd yd;
    String str4;
    NumberFormat numberFormat;
    String str3;
    List<Float> list2;
    Locale locale;
    StringBuilder stringBuilder2;
    int i = this.n;
    View view1 = this.p;
    View view2 = this.i;
    if (paramInt == -1) {
      AccessibilityNodeInfo accessibilityNodeInfo = AccessibilityNodeInfo.obtain(view2);
      t0 t01 = new t0(accessibilityNodeInfo);
      WeakHashMap weakHashMap = v22.a;
      view2.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
      ArrayList<Integer> arrayList = new ArrayList();
      switch (i) {
        default:
          for (paramInt = 0; paramInt < ((RangeSlider2)view1).getValues().size(); paramInt++)
            arrayList.add(Integer.valueOf(paramInt)); 
          break;
        case 0:
          for (paramInt = 0; paramInt < ((yd)view1).getValues().size(); paramInt++)
            arrayList.add(Integer.valueOf(paramInt)); 
          break;
      } 
      if (accessibilityNodeInfo.getChildCount() <= 0 || arrayList.size() <= 0) {
        i = arrayList.size();
        for (paramInt = 0; paramInt < i; paramInt++) {
          int j = ((Integer)arrayList.get(paramInt)).intValue();
          t01.a.addChild(view2, j);
        } 
        return t01;
      } 
      l0.f("Views cannot have both real and virtual children");
      return null;
    } 
    AccessibilityNodeInfo accessibilityNodeInfo2 = AccessibilityNodeInfo.obtain();
    t0 t0 = new t0(accessibilityNodeInfo2);
    accessibilityNodeInfo2.setEnabled(true);
    accessibilityNodeInfo2.setFocusable(true);
    t0.i("android.view.View");
    Rect rect1 = q;
    accessibilityNodeInfo2.setBoundsInParent(rect1);
    accessibilityNodeInfo2.setBoundsInScreen(rect1);
    accessibilityNodeInfo2.setParent(view2);
    Rect rect2 = this.o;
    AccessibilityNodeInfo accessibilityNodeInfo1 = t0.a;
    switch (i) {
      default:
        t0.b(m0.n);
        rangeSlider2 = (RangeSlider2)view1;
        list2 = rangeSlider2.getValues();
        f1 = ((Float)list2.get(paramInt)).floatValue();
        f3 = rangeSlider2.getValueFrom();
        f2 = rangeSlider2.getValueTo();
        if (rangeSlider2.isEnabled()) {
          if (f1 > f3)
            t0.a(8192); 
          if (f1 < f2)
            t0.a(4096); 
        } 
        accessibilityNodeInfo1.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, f3, f2, f1));
        t0.i("android.widget.SeekBar");
        stringBuilder1 = new StringBuilder();
        if (rangeSlider2.getContentDescription() != null) {
          stringBuilder1.append(rangeSlider2.getContentDescription());
          stringBuilder1.append(",");
        } 
        str4 = rangeSlider2.e(f1);
        str1 = rangeSlider2.getContext().getString(2131886800);
        if (list2.size() > 1)
          if (paramInt == rangeSlider2.getValues().size() - 1) {
            str1 = rangeSlider2.getContext().getString(2131886798);
          } else if (paramInt == 0) {
            str1 = rangeSlider2.getContext().getString(2131886799);
          } else {
            str1 = "";
          }  
        locale = Locale.US;
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str1);
        stringBuilder2.append(", ");
        stringBuilder2.append(str4);
        stringBuilder1.append(stringBuilder2.toString());
        accessibilityNodeInfo1.setContentDescription(stringBuilder1.toString());
        rangeSlider2.u(paramInt, rect2);
        accessibilityNodeInfo1.setBoundsInParent(rect2);
        break;
      case 0:
        t0.b(m0.n);
        yd = (yd)str1;
        list1 = yd.getValues();
        float_ = list1.get(paramInt);
        f5 = float_.floatValue();
        f1 = yd.getValueFrom();
        f3 = yd.getValueTo();
        if (yd.isEnabled()) {
          if (f5 > f1)
            t0.a(8192); 
          if (f5 < f3)
            t0.a(4096); 
        } 
        numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        d = f1;
        f2 = f3;
        try {
          f4 = numberFormat.parse(numberFormat.format(d)).floatValue();
          f2 = f3;
          f1 = f4;
          f3 = numberFormat.parse(numberFormat.format(f3)).floatValue();
          f2 = f3;
          f1 = f4;
          float f = numberFormat.parse(numberFormat.format(f5)).floatValue();
          f1 = f4;
          f4 = f;
          f2 = f3;
        } catch (ParseException parseException) {
          i = yd.X0;
          StringBuilder stringBuilder = new StringBuilder("Error parsing value(");
          stringBuilder.append(float_);
          stringBuilder.append("), valueFrom(");
          stringBuilder.append(f1);
          stringBuilder.append("), and valueTo(");
          stringBuilder.append(f2);
          stringBuilder.append(") into a float.");
          Log.w("yd", stringBuilder.toString());
          f4 = f5;
        } 
        accessibilityNodeInfo1.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, f1, f2, f4));
        t0.i("android.widget.SeekBar");
        stringBuilder2 = new StringBuilder();
        if (yd.getContentDescription() != null) {
          stringBuilder2.append(yd.getContentDescription());
          stringBuilder2.append(",");
        } 
        str3 = yd.n(f4);
        str2 = yd.getContext().getString(2131886800);
        if (list1.size() > 1) {
          String str;
          i = yd.getValues().size();
          if (paramInt == i - 1) {
            str = yd.getContext().getString(2131886798);
          } else if (paramInt == 0) {
            str = yd.getContext().getString(2131886799);
          } else {
            str = "";
          } 
          str2 = str;
        } 
        object = v22.a;
        i = Build.VERSION.SDK_INT;
        if (i >= 30) {
          CharSequence charSequence = s22.b(yd);
        } else {
          object = yd.getTag(2131297582);
          if (!CharSequence.class.isInstance(object))
            object = null; 
        } 
        object = object;
        if (!TextUtils.isEmpty((CharSequence)object)) {
          if (i >= 30) {
            n0.x(accessibilityNodeInfo1, (CharSequence)object);
          } else {
            accessibilityNodeInfo1.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", (CharSequence)object);
          } 
        } else {
          Locale.getDefault();
          object = new StringBuilder();
          object.append(str2);
          object.append(", ");
          object.append(str3);
          stringBuilder2.append(object.toString());
        } 
        accessibilityNodeInfo1.setContentDescription(stringBuilder2.toString());
        yd.E(paramInt, rect2);
        accessibilityNodeInfo1.setBoundsInParent(rect2);
        break;
    } 
    if (t0.f() != null || accessibilityNodeInfo2.getContentDescription() != null) {
      rect2 = this.e;
      accessibilityNodeInfo2.getBoundsInParent(rect2);
      object = this.d;
      accessibilityNodeInfo2.getBoundsInScreen((Rect)object);
      if (!rect2.equals(rect1) || !object.equals(rect1)) {
        i = accessibilityNodeInfo2.getActions();
        if ((i & 0x40) == 0) {
          if ((i & 0x80) == 0) {
            boolean bool;
            accessibilityNodeInfo2.setPackageName(view2.getContext().getPackageName());
            t0.b = paramInt;
            accessibilityNodeInfo2.setSource(view2, paramInt);
            if (this.k == paramInt) {
              accessibilityNodeInfo2.setAccessibilityFocused(true);
              t0.a(128);
            } else {
              accessibilityNodeInfo2.setAccessibilityFocused(false);
              t0.a(64);
            } 
            if (this.l == paramInt) {
              bool = true;
            } else {
              bool = false;
            } 
            if (bool) {
              t0.a(2);
            } else if (accessibilityNodeInfo2.isFocusable()) {
              t0.a(1);
            } 
            accessibilityNodeInfo2.setFocused(bool);
            int[] arrayOfInt = this.g;
            view2.getLocationOnScreen(arrayOfInt);
            if (object.equals(rect1)) {
              accessibilityNodeInfo2.setBoundsInParent(rect2);
              rect1 = new Rect();
              rect1.set(rect2);
              view2.getLocationOnScreen(arrayOfInt);
              rect1.offset(arrayOfInt[0] - view2.getScrollX(), arrayOfInt[1] - view2.getScrollY());
              accessibilityNodeInfo2.setBoundsInScreen(rect1);
              accessibilityNodeInfo2.getBoundsInScreen((Rect)object);
            } 
            rect1 = this.f;
            if (view2.getLocalVisibleRect(rect1)) {
              rect1.offset(arrayOfInt[0] - view2.getScrollX(), arrayOfInt[1] - view2.getScrollY());
              if (object.intersect(rect1)) {
                accessibilityNodeInfo2.setBoundsInScreen((Rect)object);
                if (!object.isEmpty() && view2.getWindowVisibility() == 0) {
                  object = view2.getParent();
                  while (object instanceof View) {
                    object = object;
                    if (object.getAlpha() > 0.0F) {
                      if (object.getVisibility() != 0)
                        // Byte code: goto -> 1748 
                      object = object.getParent();
                      continue;
                    } 
                    // Byte code: goto -> 1748
                  } 
                  if (object != null)
                    accessibilityNodeInfo1.setVisibleToUser(true); 
                } 
              } 
            } 
            return t0;
          } 
          l0.f(zLtYiJUm.CCbwAcSnJEMsola);
          return null;
        } 
        l0.f("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        return null;
      } 
      l0.f("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
      return null;
    } 
    l0.f("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
    return null;
  }
  
  public final boolean o(int paramInt) {
    View view = this.i;
    if (view.isFocused() || view.requestFocus()) {
      int i = this.l;
      if (i != paramInt) {
        if (i != Integer.MIN_VALUE)
          j(i); 
        if (paramInt != Integer.MIN_VALUE) {
          this.l = paramInt;
          p(paramInt, 8);
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public final void p(int paramInt1, int paramInt2) {
    if (paramInt1 != Integer.MIN_VALUE && this.h.isEnabled()) {
      View view = this.i;
      ViewParent viewParent = view.getParent();
      if (viewParent != null)
        viewParent.requestSendAccessibilityEvent(view, k(paramInt1, paramInt2)); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\td.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */