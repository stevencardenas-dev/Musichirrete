import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public abstract class je {
  public static final String A;
  
  public static final o70 v = g5.b;
  
  public static final LinearInterpolator w = g5.a;
  
  public static final o70 x = g5.d;
  
  public static final Handler y;
  
  public static final int[] z = new int[] { 2130969968 };
  
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final TimeInterpolator d;
  
  public final TimeInterpolator e;
  
  public final TimeInterpolator f;
  
  public final ViewGroup g;
  
  public final Context h;
  
  public final ie i;
  
  public final SnackbarContentLayout j;
  
  public int k;
  
  public final de l = new de(this, 0);
  
  public int m;
  
  public int n;
  
  public int o;
  
  public int p;
  
  public int q;
  
  public boolean r;
  
  public ArrayList s;
  
  public final AccessibilityManager t;
  
  public final ge u = new ge(this);
  
  static {
    A = je.class.getSimpleName();
    y = new Handler(Looper.getMainLooper(), (Handler.Callback)new Object());
  }
  
  public je(Context paramContext, ViewGroup paramViewGroup, View paramView, SnackbarContentLayout paramSnackbarContentLayout) {
    if (paramView != null) {
      if (paramSnackbarContentLayout != null) {
        this.g = paramViewGroup;
        this.j = paramSnackbarContentLayout;
        this.h = paramContext;
        g92.p(paramContext, g92.g, "Theme.AppCompat");
        LayoutInflater layoutInflater = LayoutInflater.from(paramContext);
        TypedArray typedArray = paramContext.obtainStyledAttributes(z);
        int i = typedArray.getResourceId(0, -1);
        typedArray.recycle();
        if (i != -1) {
          i = 2131493147;
        } else {
          i = 2131492934;
        } 
        ie ie1 = (ie)layoutInflater.inflate(i, paramViewGroup, false);
        this.i = ie1;
        ie.a(ie1, this);
        if (paramView instanceof SnackbarContentLayout) {
          SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout)paramView;
          float f = ie1.getActionTextColorAlpha();
          if (f != 1.0F) {
            i = snackbarContentLayout.c.getCurrentTextColor();
            i = m92.L(f, m92.x((View)snackbarContentLayout, 2130968945), i);
            snackbarContentLayout.c.setTextColor(i);
          } 
          snackbarContentLayout.setMaxInlineActionWidth(ie1.getMaxInlineActionWidth());
        } 
        ie1.addView(paramView);
        ie1.setAccessibilityLiveRegion(1);
        ie1.setImportantForAccessibility(1);
        ie1.setFitsSystemWindows(true);
        ee ee = new ee(this);
        WeakHashMap weakHashMap = v22.a;
        m22.c((View)ie1, ee);
        v22.n((View)ie1, new fe(0, this));
        this.t = (AccessibilityManager)paramContext.getSystemService("accessibility");
        this.c = zo2.P(paramContext, 2130969683, 250);
        this.a = zo2.P(paramContext, 2130969683, 150);
        this.b = zo2.P(paramContext, 2130969686, 75);
        this.d = zo2.Q(paramContext, 2130969699, (TimeInterpolator)w);
        this.f = zo2.Q(paramContext, 2130969699, (TimeInterpolator)x);
        this.e = zo2.Q(paramContext, 2130969699, (TimeInterpolator)v);
        return;
      } 
      l0.l("Transient bottom bar must have non-null callback");
      throw null;
    } 
    l0.l("Transient bottom bar must have non-null content");
    throw null;
  }
  
  public final void a(int paramInt) {
    n2 n2 = n2.x();
    ge ge1 = this.u;
    Object object = n2.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (n2.A(ge1)) {
        n2.m((nn1)n2.f, paramInt);
      } else {
        boolean bool;
        nn1 nn1 = (nn1)n2.g;
        if (nn1 != null && nn1.a.get() == ge1) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          n2.m((nn1)n2.g, paramInt); 
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public final void b() {
    if (Build.VERSION.SDK_INT >= 29) {
      WindowInsets windowInsets = this.i.getRootWindowInsets();
      if (windowInsets != null) {
        this.p = tp.n(windowInsets.getMandatorySystemGestureInsets());
        f();
      } 
    } 
  }
  
  public final void c() {
    n2 n2 = n2.x();
    ge ge1 = this.u;
    Object object = n2.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (n2.A(ge1)) {
        n2.f = null;
        if ((nn1)n2.g != null)
          n2.J(); 
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    object = this.s;
    if (object != null)
      for (int i = object.size() - 1; i >= 0; i--) {
        object = this.s.get(i);
        object.getClass();
        ln1 ln1 = (ln1)this;
        ((oc)object).b.P = null;
        object = ((oc)object).a;
        if (object != null)
          object.run(); 
      }  
    object = this.i.getParent();
    if (object instanceof ViewGroup)
      ((ViewGroup)object).removeView((View)this.i); 
  }
  
  public final void d() {
    n2 n2 = n2.x();
    ge ge1 = this.u;
    Object object = n2.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (n2.A(ge1))
        n2.H((nn1)n2.f); 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    object = this.s;
    if (object != null)
      for (int i = object.size() - 1; i >= 0; i--) {
        ((oc)this.s.get(i)).getClass();
        object = this;
      }  
  }
  
  public final void e() {
    boolean bool = true;
    AccessibilityManager accessibilityManager = this.t;
    if (accessibilityManager != null) {
      List list = accessibilityManager.getEnabledAccessibilityServiceList(1);
      if (list == null || !list.isEmpty())
        bool = false; 
    } 
    ie ie1 = this.i;
    if (bool) {
      ie1.post(new de(this, 2));
      return;
    } 
    if (ie1.getParent() != null)
      ie1.setVisibility(0); 
    d();
  }
  
  public final void f() {
    ie ie1 = this.i;
    ViewGroup.LayoutParams layoutParams = ie1.getLayoutParams();
    boolean bool = layoutParams instanceof ViewGroup.MarginLayoutParams;
    String str = A;
    if (!bool) {
      Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
      return;
    } 
    if (ie1.l == null) {
      Log.w(str, "Unable to update margins because original view margins are not set");
      return;
    } 
    if (ie1.getParent() != null) {
      int i = this.m;
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
      Rect rect = ie1.l;
      int k = rect.bottom + i;
      int n = rect.left + this.n;
      int j = rect.right + this.o;
      int m = rect.top;
      if (marginLayoutParams.bottomMargin != k || marginLayoutParams.leftMargin != n || marginLayoutParams.rightMargin != j || marginLayoutParams.topMargin != m) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0) {
        marginLayoutParams.bottomMargin = k;
        marginLayoutParams.leftMargin = n;
        marginLayoutParams.rightMargin = j;
        marginLayoutParams.topMargin = m;
        ie1.requestLayout();
      } 
      if ((i != 0 || this.q != this.p) && Build.VERSION.SDK_INT >= 29 && this.p > 0) {
        ViewGroup.LayoutParams layoutParams1 = ie1.getLayoutParams();
        if (layoutParams1 instanceof is && ((is)layoutParams1).a instanceof com.google.android.material.behavior.SwipeDismissBehavior) {
          de de1 = this.l;
          ie1.removeCallbacks(de1);
          ie1.post(de1);
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\je.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */