import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

public final class m0 {
  public static final m0 e = new m0(16);
  
  public static final m0 f = new m0(4096);
  
  public static final m0 g = new m0(8192);
  
  public static final m0 h = new m0(262144);
  
  public static final m0 i = new m0(524288);
  
  public static final m0 j = new m0(1048576);
  
  public static final m0 k = new m0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, z0.class);
  
  public static final m0 l = new m0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
  
  public static final m0 m = new m0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
  
  public static final m0 n = new m0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, a1.class);
  
  public static final m0 o;
  
  public final Object a;
  
  public final int b;
  
  public final Class c;
  
  public final d1 d;
  
  static {
    if (i >= 26) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908354, null, null, y0.class);
    if (i >= 28) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908356, null, null, null);
    if (i >= 28) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908357, null, null, null);
    if (i >= 30) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908362, null, null, null);
    if (i >= 30) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908372, null, null, null);
    if (i >= 32) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908373, null, null, null);
    if (i >= 32) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908374, null, null, null);
    if (i >= 32) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908375, null, null, null);
    if (i >= 33) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908376, null, null, null);
    if (i >= 34) {
      accessibilityAction1 = p0.c();
    } else {
      accessibilityAction1 = null;
    } 
    o = new m0(accessibilityAction1, 16908382, null, null, null);
    int j = ph.a;
    AccessibilityNodeInfo.AccessibilityAction accessibilityAction1 = accessibilityAction2;
    if (i >= 36) {
      accessibilityAction1 = accessibilityAction2;
      if (oh.a() >= 3600001)
        accessibilityAction1 = r0.a(); 
    } 
    new m0(accessibilityAction1, 16908383, null, null, null);
  }
  
  public m0(int paramInt) {
    this(null, paramInt, null, null, null);
  }
  
  public m0(int paramInt, Class paramClass) {
    this(null, paramInt, null, null, paramClass);
  }
  
  public m0(Object paramObject, int paramInt, String paramString, d1 paramd1, Class paramClass) {
    this.b = paramInt;
    this.d = paramd1;
    if (paramObject == null) {
      this.a = new AccessibilityNodeInfo.AccessibilityAction(paramInt, paramString);
    } else {
      this.a = paramObject;
    } 
    this.c = paramClass;
  }
  
  public final int a() {
    return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getId();
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof m0))
      return false; 
    Object object = ((m0)paramObject).a;
    paramObject = this.a;
    if (paramObject == null) {
      if (object != null)
        return false; 
    } else if (!paramObject.equals(object)) {
      return false;
    } 
    return true;
  }
  
  public final int hashCode() {
    Object object = this.a;
    return (object != null) ? object.hashCode() : 0;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("AccessibilityActionCompat: ");
    String str2 = t0.d(this.b);
    String str1 = str2;
    if (str2.equals("ACTION_UNKNOWN")) {
      Object object = this.a;
      str1 = str2;
      if (((AccessibilityNodeInfo.AccessibilityAction)object).getLabel() != null)
        str1 = ((AccessibilityNodeInfo.AccessibilityAction)object).getLabel().toString(); 
    } 
    stringBuilder.append(str1);
    return stringBuilder.toString();
  }
  
  static {
    new m0(1);
    new m0(2);
    new m0(4);
    new m0(8);
  }
  
  static {
    new m0(32);
    new m0(64);
    new m0(128);
    new m0(256, w0.class);
    new m0(512, w0.class);
    new m0(1024, x0.class);
    new m0(2048, x0.class);
  }
  
  static {
    new m0(16384);
    new m0(32768);
    new m0(65536);
    new m0(131072, b1.class);
  }
  
  static {
    new m0(2097152, c1.class);
    new m0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
  }
  
  static {
    new m0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
  }
  
  static {
    new m0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
    int i = Build.VERSION.SDK_INT;
    AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = null;
    if (i >= 29) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908358, null, null, null);
    if (i >= 29) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908359, null, null, null);
    if (i >= 29) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908360, null, null, null);
    if (i >= 29) {
      accessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
    } else {
      accessibilityAction1 = null;
    } 
    new m0(accessibilityAction1, 16908361, null, null, null);
    new m0(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */