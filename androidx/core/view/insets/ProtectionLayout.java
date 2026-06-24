package androidx.core.view.insets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fi0;
import ga1;
import gs1;
import hn;
import j01;
import java.util.ArrayList;
import java.util.List;
import l0;
import tp;
import wa1;
import xa1;
import xt0;

public class ProtectionLayout extends FrameLayout {
  public static final Object e = new Object();
  
  public final ArrayList b = new ArrayList();
  
  public xa1 c;
  
  public ProtectionLayout(Context paramContext) {
    super(paramContext);
  }
  
  public ProtectionLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ProtectionLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public ProtectionLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public ProtectionLayout(Context paramContext, List<hn> paramList) {
    super(paramContext);
    setProtections(paramList);
  }
  
  private gs1 getOrInstallSystemBarStateMonitor() {
    ViewGroup viewGroup = (ViewGroup)getRootView();
    Object object = viewGroup.getTag(2131297583);
    if (object instanceof gs1)
      return (gs1)object; 
    object = new gs1(viewGroup);
    viewGroup.setTag(2131297583, object);
    return (gs1)object;
  }
  
  public final void a() {
    ArrayList arrayList = this.b;
    if (arrayList.isEmpty()) {
      b();
      return;
    } 
    gs1 gs1 = getOrInstallSystemBarStateMonitor();
    b();
    this.c = new xa1(gs1, arrayList);
    int i = getChildCount();
    int j = this.c.a.size();
    byte b = 0;
    while (b < j) {
      byte b1;
      hn hn = this.c.a.get(b);
      Context context = getContext();
      wa1 wa1 = hn.b;
      int k = hn.a;
      byte b2 = 8;
      int m = -1;
      if (k != 1) {
        if (k != 2) {
          if (k != 4) {
            if (k == 8) {
              k = wa1.b;
              b1 = 80;
            } else {
              l0.l(ga1.i("Unexpected side: ", k));
              return;
            } 
          } else {
            k = wa1.a;
            b1 = 5;
            m = k;
            k = -1;
          } 
        } else {
          k = wa1.b;
          b1 = 48;
        } 
      } else {
        k = wa1.a;
        b1 = 3;
        m = k;
        k = -1;
      } 
      FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m, k, b1);
      fi0 fi0 = wa1.c;
      layoutParams.leftMargin = fi0.a;
      layoutParams.topMargin = fi0.b;
      layoutParams.rightMargin = fi0.c;
      layoutParams.bottomMargin = fi0.d;
      View view = new View(context);
      view.setTag(e);
      view.setTranslationX(wa1.f);
      view.setTranslationY(wa1.g);
      view.setAlpha(wa1.h);
      k = b2;
      if (wa1.d)
        k = 0; 
      view.setVisibility(k);
      view.setBackground((Drawable)wa1.e);
      j01 j01 = new j01(layoutParams, view, 4, false);
      if (wa1.i == null) {
        wa1.i = j01;
        addView(view, b + i, (ViewGroup.LayoutParams)layoutParams);
        b++;
        continue;
      } 
      tp.f("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
    } 
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    // Byte code:
    //   0: iload_2
    //   1: istore #4
    //   3: aload_1
    //   4: ifnull -> 73
    //   7: iload_2
    //   8: istore #4
    //   10: aload_1
    //   11: invokevirtual getTag : ()Ljava/lang/Object;
    //   14: getstatic androidx/core/view/insets/ProtectionLayout.e : Ljava/lang/Object;
    //   17: if_acmpeq -> 73
    //   20: aload_0
    //   21: getfield c : Lxa1;
    //   24: astore #6
    //   26: aload #6
    //   28: ifnull -> 44
    //   31: aload #6
    //   33: getfield a : Ljava/util/ArrayList;
    //   36: invokevirtual size : ()I
    //   39: istore #4
    //   41: goto -> 47
    //   44: iconst_0
    //   45: istore #4
    //   47: aload_0
    //   48: invokevirtual getChildCount : ()I
    //   51: iload #4
    //   53: isub
    //   54: istore #5
    //   56: iload_2
    //   57: iload #5
    //   59: if_icmpgt -> 69
    //   62: iload_2
    //   63: istore #4
    //   65: iload_2
    //   66: ifge -> 73
    //   69: iload #5
    //   71: istore #4
    //   73: aload_0
    //   74: aload_1
    //   75: iload #4
    //   77: aload_3
    //   78: invokespecial addView : (Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    //   81: return
  }
  
  public final void b() {
    if (this.c != null) {
      removeViews(getChildCount() - this.c.a.size(), this.c.a.size());
      int j = this.c.a.size();
      int i = 0;
      while (true) {
        xa1 xa11 = this.c;
        if (i < j) {
          ((hn)xa11.a.get(i)).b.i = null;
          i++;
          continue;
        } 
        ArrayList arrayList = xa11.a;
        if (!xa11.f) {
          xa11.f = true;
          xa11.b.b.remove(xa11);
          for (i = arrayList.size() - 1; i >= 0; i--)
            ((hn)arrayList.get(i)).e = null; 
          arrayList.clear();
        } 
        this.c = null;
        break;
      } 
    } 
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    a();
    requestApplyInsets();
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    b();
    ViewGroup viewGroup = (ViewGroup)getRootView();
    Object object = viewGroup.getTag(2131297583);
    if (object instanceof gs1) {
      object = object;
      if (((gs1)object).b.isEmpty()) {
        ((gs1)object).a.post((Runnable)new xt0(19, object));
        viewGroup.setTag(2131297583, null);
        return;
      } 
    } 
  }
  
  public void setProtections(List<hn> paramList) {
    ArrayList<hn> arrayList = this.b;
    arrayList.clear();
    arrayList.addAll(paramList);
    if (isAttachedToWindow()) {
      a();
      requestApplyInsets();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\core\view\insets\ProtectionLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */