import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;

public final class fe extends k0 {
  public final int d;
  
  public final Object e;
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : I
    //   4: istore_3
    //   5: aload_0
    //   6: getfield e : Ljava/lang/Object;
    //   9: astore #5
    //   11: iload_3
    //   12: lookupswitch default -> 40, 2 -> 151, 5 -> 47
    //   40: aload_0
    //   41: aload_1
    //   42: aload_2
    //   43: invokespecial c : (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //   46: return
    //   47: aload #5
    //   49: checkcast t32
    //   52: astore #5
    //   54: aload_0
    //   55: aload_1
    //   56: aload_2
    //   57: invokespecial c : (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //   60: aload_2
    //   61: ldc t32
    //   63: invokevirtual getName : ()Ljava/lang/String;
    //   66: invokevirtual setClassName : (Ljava/lang/CharSequence;)V
    //   69: aload #5
    //   71: getfield g : Lp51;
    //   74: astore_1
    //   75: aload_1
    //   76: ifnull -> 95
    //   79: aload_1
    //   80: invokevirtual c : ()I
    //   83: istore_3
    //   84: iconst_1
    //   85: istore #4
    //   87: iload_3
    //   88: iconst_1
    //   89: if_icmple -> 95
    //   92: goto -> 98
    //   95: iconst_0
    //   96: istore #4
    //   98: aload_2
    //   99: iload #4
    //   101: invokevirtual setScrollable : (Z)V
    //   104: aload_2
    //   105: invokevirtual getEventType : ()I
    //   108: sipush #4096
    //   111: if_icmpne -> 150
    //   114: aload #5
    //   116: getfield g : Lp51;
    //   119: astore_1
    //   120: aload_1
    //   121: ifnull -> 150
    //   124: aload_2
    //   125: aload_1
    //   126: invokevirtual c : ()I
    //   129: invokevirtual setItemCount : (I)V
    //   132: aload_2
    //   133: aload #5
    //   135: getfield h : I
    //   138: invokevirtual setFromIndex : (I)V
    //   141: aload_2
    //   142: aload #5
    //   144: getfield h : I
    //   147: invokevirtual setToIndex : (I)V
    //   150: return
    //   151: aload_0
    //   152: aload_1
    //   153: aload_2
    //   154: invokespecial c : (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //   157: aload_2
    //   158: aload #5
    //   160: checkcast com/google/android/material/internal/CheckableImageButton
    //   163: getfield f : Z
    //   166: invokevirtual setChecked : (Z)V
    //   169: return
  }
  
  public final void d(View paramView, t0 paramt0) {
    p51 p51;
    id1 id1;
    CheckableImageButton checkableImageButton;
    RecyclerView recyclerView;
    AccessibilityNodeInfo accessibilityNodeInfo1;
    int j;
    boolean bool1;
    t32 t32;
    ca1 ca1;
    MaterialButtonToggleGroup materialButtonToggleGroup;
    AccessibilityNodeInfo accessibilityNodeInfo2;
    int i = this.d;
    byte b = -1;
    boolean bool2 = false;
    Object object = this.e;
    View.AccessibilityDelegate accessibilityDelegate = this.a;
    switch (i) {
      default:
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(paramView, paramt0.a);
        paramt0.i(t32.class.getName());
        t32 = (t32)object;
        p51 = t32.g;
        bool1 = bool2;
        if (p51 != null) {
          bool1 = bool2;
          if (p51.c() > 1)
            bool1 = true; 
        } 
        paramt0.o(bool1);
        if (t32.canScrollHorizontally(1))
          paramt0.a(4096); 
        if (t32.canScrollHorizontally(-1))
          paramt0.a(8192); 
        return;
      case 4:
        ca1 = (ca1)object;
        ca1.g.d((View)p51, paramt0);
        recyclerView = ca1.f;
        recyclerView.getClass();
        i = RecyclerView.M((View)p51);
        id1 = recyclerView.getAdapter();
        if (id1 instanceof z91)
          ((z91)id1).n(i); 
        return;
      case 3:
        ca1.onInitializeAccessibilityNodeInfo((View)id1, ((t0)recyclerView).a);
        materialButtonToggleGroup = (MaterialButtonToggleGroup)object;
        i = MaterialButtonToggleGroup.s;
        if (!(id1 instanceof MaterialButton)) {
          j = b;
        } else {
          byte b1 = 0;
          i = 0;
          while (true) {
            j = b;
            if (b1 < materialButtonToggleGroup.getChildCount()) {
              if (materialButtonToggleGroup.getChildAt(b1) == id1) {
                j = i;
                break;
              } 
              j = i;
              if (materialButtonToggleGroup.getChildAt(b1) instanceof MaterialButton) {
                j = i;
                if (materialButtonToggleGroup.getChildAt(b1).getVisibility() != 8)
                  j = i + 1; 
              } 
              b1++;
              i = j;
              continue;
            } 
            break;
          } 
        } 
        recyclerView.j(s0.a(((MaterialButton)id1).q, 0, 1, j, 1));
        return;
      case 2:
        accessibilityNodeInfo1 = ((t0)recyclerView).a;
        materialButtonToggleGroup.onInitializeAccessibilityNodeInfo((View)id1, accessibilityNodeInfo1);
        checkableImageButton = (CheckableImageButton)object;
        accessibilityNodeInfo1.setCheckable(checkableImageButton.g);
        accessibilityNodeInfo1.setChecked(checkableImageButton.f);
        return;
      case 1:
        accessibilityNodeInfo2 = ((t0)accessibilityNodeInfo1).a;
        materialButtonToggleGroup.onInitializeAccessibilityNodeInfo((View)checkableImageButton, accessibilityNodeInfo2);
        if (((dh)object).m) {
          accessibilityNodeInfo1.a(1048576);
          accessibilityNodeInfo2.setDismissable(true);
        } else {
          accessibilityNodeInfo2.setDismissable(false);
        } 
        return;
      case 0:
        break;
    } 
    object = ((t0)accessibilityNodeInfo1).a;
    materialButtonToggleGroup.onInitializeAccessibilityNodeInfo((View)checkableImageButton, (AccessibilityNodeInfo)object);
    accessibilityNodeInfo1.a(1048576);
    object.setDismissable(true);
  }
  
  public boolean g(View paramView, int paramInt, Bundle paramBundle) {
    boolean bool1;
    int i = this.d;
    boolean bool2 = true;
    null = true;
    boolean bool3 = true;
    Object object = this.e;
    switch (i) {
      default:
        return super.g(paramView, paramInt, paramBundle);
      case 5:
        object = object;
        if (super.g(paramView, paramInt, paramBundle)) {
          null = bool3;
        } else {
          if (paramInt != 4096) {
            if (paramInt == 8192 && object.canScrollHorizontally(-1)) {
              object.setCurrentItem(((t32)object).h - 1);
              return bool3;
            } 
          } else if (object.canScrollHorizontally(1)) {
            object.setCurrentItem(((t32)object).h + 1);
            return bool3;
          } 
          null = false;
        } 
        return null;
      case 4:
        return ((ca1)object).g.g(paramView, paramInt, paramBundle);
      case 1:
        if (paramInt == 1048576) {
          object = object;
          if (((dh)object).m) {
            object.cancel();
            return bool2;
          } 
        } 
        return super.g(paramView, paramInt, paramBundle);
      case 0:
        break;
    } 
    if (paramInt == 1048576) {
      ((ln1)object).a(3);
    } else {
      bool1 = super.g(paramView, paramInt, paramBundle);
    } 
    return bool1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */