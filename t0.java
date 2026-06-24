import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import java.util.ArrayList;
import java.util.List;

public final class t0 {
  public static int c;
  
  public final AccessibilityNodeInfo a;
  
  public int b = -1;
  
  public t0(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    this.a = paramAccessibilityNodeInfo;
  }
  
  public static String d(int paramInt) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        switch (paramInt) {
          default:
            switch (paramInt) {
              default:
                switch (paramInt) {
                  default:
                    switch (paramInt) {
                      default:
                        switch (paramInt) {
                          default:
                            return "ACTION_UNKNOWN";
                          case 16908383:
                            return "ACTION_SET_EXTENDED_SELECTION";
                          case 16908382:
                            break;
                        } 
                        return "ACTION_SCROLL_IN_DIRECTION";
                      case 16908375:
                        return "ACTION_DRAG_CANCEL";
                      case 16908374:
                        return "ACTION_DRAG_DROP";
                      case 16908373:
                        return "ACTION_DRAG_START";
                      case 16908372:
                        break;
                    } 
                    return "ACTION_IME_ENTER";
                  case 16908362:
                    return "ACTION_PRESS_AND_HOLD";
                  case 16908361:
                    return "ACTION_PAGE_RIGHT";
                  case 16908360:
                    return "ACTION_PAGE_LEFT";
                  case 16908359:
                    return "ACTION_PAGE_DOWN";
                  case 16908358:
                    return "ACTION_PAGE_UP";
                  case 16908357:
                    return "ACTION_HIDE_TOOLTIP";
                  case 16908356:
                    break;
                } 
                return "ACTION_SHOW_TOOLTIP";
              case 16908349:
                return "ACTION_SET_PROGRESS";
              case 16908348:
                return "ACTION_CONTEXT_CLICK";
              case 16908347:
                return "ACTION_SCROLL_RIGHT";
              case 16908346:
                return "ACTION_SCROLL_DOWN";
              case 16908345:
                return "ACTION_SCROLL_LEFT";
              case 16908344:
                return "ACTION_SCROLL_UP";
              case 16908343:
                return "ACTION_SCROLL_TO_POSITION";
              case 16908342:
                break;
            } 
            return "ACTION_SHOW_ON_SCREEN";
          case 16908354:
            return "ACTION_MOVE_WINDOW";
          case 2097152:
            return "ACTION_SET_TEXT";
          case 524288:
            return "ACTION_COLLAPSE";
          case 262144:
            return "ACTION_EXPAND";
          case 131072:
            return "ACTION_SET_SELECTION";
          case 65536:
            return "ACTION_CUT";
          case 32768:
            return "ACTION_PASTE";
          case 16384:
            return "ACTION_COPY";
          case 8192:
            return "ACTION_SCROLL_BACKWARD";
          case 4096:
            return "ACTION_SCROLL_FORWARD";
          case 2048:
            return "ACTION_PREVIOUS_HTML_ELEMENT";
          case 1024:
            return "ACTION_NEXT_HTML_ELEMENT";
          case 512:
            return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
          case 256:
            return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
          case 128:
            return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
          case 64:
            return "ACTION_ACCESSIBILITY_FOCUS";
          case 32:
            return "ACTION_LONG_CLICK";
          case 16:
            return "ACTION_CLICK";
          case 8:
            return "ACTION_CLEAR_SELECTION";
          case 4:
            break;
        } 
        return "ACTION_SELECT";
      } 
      return "ACTION_CLEAR_FOCUS";
    } 
    return "ACTION_FOCUS";
  }
  
  public final void a(int paramInt) {
    this.a.addAction(paramInt);
  }
  
  public final void b(m0 paramm0) {
    AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction)paramm0.a;
    this.a.addAction(accessibilityAction);
  }
  
  public final ArrayList c(String paramString) {
    AccessibilityNodeInfo accessibilityNodeInfo = this.a;
    ArrayList arrayList2 = accessibilityNodeInfo.getExtras().getIntegerArrayList(paramString);
    ArrayList arrayList1 = arrayList2;
    if (arrayList2 == null) {
      arrayList1 = new ArrayList();
      accessibilityNodeInfo.getExtras().putIntegerArrayList(paramString, arrayList1);
    } 
    return arrayList1;
  }
  
  public final boolean e(int paramInt) {
    Bundle bundle = this.a.getExtras();
    return (bundle != null && (bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & paramInt) == paramInt);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && paramObject instanceof t0) {
      paramObject = paramObject;
      AccessibilityNodeInfo accessibilityNodeInfo2 = ((t0)paramObject).a;
      AccessibilityNodeInfo accessibilityNodeInfo1 = this.a;
      if (((accessibilityNodeInfo1 == null) ? (accessibilityNodeInfo2 != null) : !accessibilityNodeInfo1.equals(accessibilityNodeInfo2)) && this.b == ((t0)paramObject).b)
        return true; 
    } 
    return false;
  }
  
  public final CharSequence f() {
    boolean bool = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    AccessibilityNodeInfo accessibilityNodeInfo = this.a;
    if (!bool) {
      ArrayList<Integer> arrayList4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      ArrayList<Integer> arrayList2 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      ArrayList<Integer> arrayList3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      ArrayList<Integer> arrayList1 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
      CharSequence charSequence = accessibilityNodeInfo.getText();
      int i = accessibilityNodeInfo.getText().length();
      byte b = 0;
      SpannableString spannableString = new SpannableString(TextUtils.substring(charSequence, 0, i));
      while (b < arrayList4.size()) {
        spannableString.setSpan(new i0(((Integer)arrayList1.get(b)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)arrayList4.get(b)).intValue(), ((Integer)arrayList2.get(b)).intValue(), ((Integer)arrayList3.get(b)).intValue());
        b++;
      } 
      return (CharSequence)spannableString;
    } 
    return accessibilityNodeInfo.getText();
  }
  
  public final boolean g() {
    return (Build.VERSION.SDK_INT >= 26) ? this.a.isShowingHintText() : e(4);
  }
  
  public final void h(int paramInt, boolean paramBoolean) {
    Bundle bundle = this.a.getExtras();
    if (bundle != null) {
      boolean bool;
      int i = bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
      if (paramBoolean) {
        bool = paramInt;
      } else {
        bool = false;
      } 
      bundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", bool | i & (paramInt ^ 0xFFFFFFFF));
    } 
  }
  
  public final int hashCode() {
    AccessibilityNodeInfo accessibilityNodeInfo = this.a;
    return (accessibilityNodeInfo == null) ? 0 : accessibilityNodeInfo.hashCode();
  }
  
  public final void i(String paramString) {
    this.a.setClassName(paramString);
  }
  
  public final void j(s0 params0) {
    AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo)params0.b;
    this.a.setCollectionItemInfo(collectionItemInfo);
  }
  
  public final void k(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 28) {
      this.a.setHeading(paramBoolean);
      return;
    } 
    h(2, paramBoolean);
  }
  
  public final void l(String paramString) {
    int i = Build.VERSION.SDK_INT;
    AccessibilityNodeInfo accessibilityNodeInfo = this.a;
    if (i >= 26) {
      accessibilityNodeInfo.setHintText(paramString);
      return;
    } 
    accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", paramString);
  }
  
  public final void m(CharSequence paramCharSequence) {
    int i = Build.VERSION.SDK_INT;
    AccessibilityNodeInfo accessibilityNodeInfo = this.a;
    if (i >= 28) {
      accessibilityNodeInfo.setPaneTitle(paramCharSequence);
      return;
    } 
    accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", paramCharSequence);
  }
  
  public final void n(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 28) {
      this.a.setScreenReaderFocusable(paramBoolean);
      return;
    } 
    h(1, paramBoolean);
  }
  
  public final void o(boolean paramBoolean) {
    this.a.setScrollable(paramBoolean);
  }
  
  public final void p(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 26) {
      this.a.setShowingHintText(paramBoolean);
      return;
    } 
    h(4, paramBoolean);
  }
  
  public final String toString() {
    int i;
    boolean bool1;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(super.toString());
    Rect rect = new Rect();
    AccessibilityNodeInfo accessibilityNodeInfo = this.a;
    accessibilityNodeInfo.getBoundsInParent(rect);
    StringBuilder stringBuilder1 = new StringBuilder("; boundsInParent: ");
    stringBuilder1.append(rect);
    stringBuilder2.append(stringBuilder1.toString());
    accessibilityNodeInfo.getBoundsInScreen(rect);
    stringBuilder1 = new StringBuilder("; boundsInScreen: ");
    stringBuilder1.append(rect);
    stringBuilder2.append(stringBuilder1.toString());
    int j = Build.VERSION.SDK_INT;
    if (j >= 34) {
      p0.e(accessibilityNodeInfo, rect);
    } else {
      Rect rect1 = (Rect)accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
      if (rect1 != null)
        rect.set(rect1.left, rect1.top, rect1.right, rect1.bottom); 
    } 
    stringBuilder1 = new StringBuilder("; boundsInWindow: ");
    stringBuilder1.append(rect);
    stringBuilder2.append(stringBuilder1.toString());
    stringBuilder2.append("; packageName: ");
    stringBuilder2.append(accessibilityNodeInfo.getPackageName());
    stringBuilder2.append("; className: ");
    stringBuilder2.append(accessibilityNodeInfo.getClassName());
    stringBuilder2.append("; text: ");
    stringBuilder2.append(f());
    stringBuilder2.append("; error: ");
    stringBuilder2.append(accessibilityNodeInfo.getError());
    stringBuilder2.append("; maxTextLength: ");
    stringBuilder2.append(accessibilityNodeInfo.getMaxTextLength());
    stringBuilder2.append("; stateDescription: ");
    if (j >= 30) {
      charSequence = n0.n(accessibilityNodeInfo);
    } else {
      charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    } 
    stringBuilder2.append(charSequence);
    stringBuilder2.append("; contentDescription: ");
    stringBuilder2.append(accessibilityNodeInfo.getContentDescription());
    stringBuilder2.append("; supplementalDescription: ");
    if (j >= 36) {
      charSequence = q0.d(accessibilityNodeInfo);
    } else {
      charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    } 
    stringBuilder2.append(charSequence);
    stringBuilder2.append("; tooltipText: ");
    if (j >= 28) {
      charSequence = accessibilityNodeInfo.getTooltipText();
    } else {
      charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    } 
    stringBuilder2.append(charSequence);
    stringBuilder2.append("; viewIdResName: ");
    stringBuilder2.append(accessibilityNodeInfo.getViewIdResourceName());
    stringBuilder2.append("; uniqueId: ");
    if (j >= 33) {
      charSequence = o0.c(accessibilityNodeInfo);
    } else {
      charSequence = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    } 
    stringBuilder2.append((String)charSequence);
    stringBuilder2.append(hbrAVtEa.RjxFxpan);
    stringBuilder2.append(accessibilityNodeInfo.isCheckable());
    stringBuilder2.append("; checked: ");
    if (j >= 36) {
      i = q0.b(accessibilityNodeInfo);
    } else {
      i = accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked());
    } 
    String str = "PARTIAL";
    if (i == 1) {
      charSequence = "TRUE";
    } else if (i == 2) {
      charSequence = "PARTIAL";
    } else {
      charSequence = "FALSE";
    } 
    stringBuilder2.append((String)charSequence);
    stringBuilder2.append("; fieldRequired: ");
    if (j >= 36) {
      bool1 = q0.e(accessibilityNodeInfo);
    } else {
      bool1 = accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    } 
    stringBuilder2.append(bool1);
    stringBuilder2.append("; focusable: ");
    stringBuilder2.append(accessibilityNodeInfo.isFocusable());
    stringBuilder2.append("; focused: ");
    stringBuilder2.append(accessibilityNodeInfo.isFocused());
    stringBuilder2.append("; selected: ");
    stringBuilder2.append(accessibilityNodeInfo.isSelected());
    stringBuilder2.append("; clickable: ");
    stringBuilder2.append(accessibilityNodeInfo.isClickable());
    stringBuilder2.append("; longClickable: ");
    stringBuilder2.append(accessibilityNodeInfo.isLongClickable());
    stringBuilder2.append("; contextClickable: ");
    stringBuilder2.append(accessibilityNodeInfo.isContextClickable());
    stringBuilder2.append("; expandedState: ");
    boolean bool = false;
    if (j >= 36) {
      i = q0.c(accessibilityNodeInfo);
    } else {
      i = accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    } 
    if (i != 0) {
      if (i != 1) {
        charSequence = str;
        if (i != 2)
          if (i != 3) {
            charSequence = "UNKNOWN";
          } else {
            charSequence = "FULL";
          }  
      } else {
        charSequence = "COLLAPSED";
      } 
    } else {
      charSequence = "UNDEFINED";
    } 
    stringBuilder2.append((String)charSequence);
    stringBuilder2.append("; enabled: ");
    stringBuilder2.append(accessibilityNodeInfo.isEnabled());
    stringBuilder2.append("; password: ");
    stringBuilder2.append(accessibilityNodeInfo.isPassword());
    CharSequence charSequence = new StringBuilder("; scrollable: ");
    charSequence.append(accessibilityNodeInfo.isScrollable());
    stringBuilder2.append(charSequence.toString());
    stringBuilder2.append("; containerTitle: ");
    if (j >= 34) {
      charSequence = p0.f(accessibilityNodeInfo);
    } else {
      charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    } 
    stringBuilder2.append(charSequence);
    stringBuilder2.append("; granularScrollingSupported: ");
    stringBuilder2.append(e(67108864));
    stringBuilder2.append("; importantForAccessibility: ");
    stringBuilder2.append(accessibilityNodeInfo.isImportantForAccessibility());
    stringBuilder2.append("; visible: ");
    stringBuilder2.append(accessibilityNodeInfo.isVisibleToUser());
    stringBuilder2.append("; isTextSelectable: ");
    if (j >= 33) {
      bool1 = o0.d(accessibilityNodeInfo);
    } else {
      bool1 = e(8388608);
    } 
    stringBuilder2.append(bool1);
    stringBuilder2.append("; accessibilityDataSensitive: ");
    if (j >= 34) {
      bool1 = p0.k(accessibilityNodeInfo);
    } else {
      bool1 = e(64);
    } 
    stringBuilder2.append(bool1);
    stringBuilder2.append("; [");
    List list = accessibilityNodeInfo.getActionList();
    ArrayList<m0> arrayList = new ArrayList();
    int k = list.size();
    j = 0;
    while (true) {
      i = bool;
      if (j < k) {
        arrayList.add(new m0(list.get(j), 0, null, null, null));
        j++;
        continue;
      } 
      break;
    } 
    while (i < arrayList.size()) {
      m0 m0 = arrayList.get(i);
      j = m0.a();
      Object object = m0.a;
      str = d(j);
      String str1 = str;
      if (str.equals("ACTION_UNKNOWN")) {
        str1 = str;
        if (((AccessibilityNodeInfo.AccessibilityAction)object).getLabel() != null)
          str1 = ((AccessibilityNodeInfo.AccessibilityAction)object).getLabel().toString(); 
      } 
      stringBuilder2.append(str1);
      if (i != arrayList.size() - 1)
        stringBuilder2.append(", "); 
      i++;
    } 
    stringBuilder2.append("]");
    return stringBuilder2.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */