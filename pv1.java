import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.lang.reflect.Method;

public final class pv1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
  public static pv1 m;
  
  public static pv1 n;
  
  public final View b;
  
  public final CharSequence c;
  
  public final int e;
  
  public final ov1 f;
  
  public final ov1 g;
  
  public int h;
  
  public int i;
  
  public rv1 j;
  
  public boolean k;
  
  public boolean l;
  
  public pv1(View paramView, CharSequence paramCharSequence) {
    int i;
    this.f = new ov1(this, 0);
    this.g = new ov1(this, 1);
    this.b = paramView;
    this.c = paramCharSequence;
    ViewConfiguration viewConfiguration = ViewConfiguration.get(paramView.getContext());
    Method method = w22.a;
    if (Build.VERSION.SDK_INT >= 28) {
      i = k5.n(viewConfiguration);
    } else {
      i = viewConfiguration.getScaledTouchSlop() / 2;
    } 
    this.e = i;
    this.l = true;
    paramView.setOnLongClickListener(this);
    paramView.setOnHoverListener(this);
  }
  
  public static void b(pv1 parampv1) {
    pv1 pv11 = m;
    if (pv11 != null)
      pv11.b.removeCallbacks(pv11.f); 
    m = parampv1;
    if (parampv1 != null)
      parampv1.b.postDelayed(parampv1.f, ViewConfiguration.getLongPressTimeout()); 
  }
  
  public final void a() {
    pv1 pv11 = n;
    View view = this.b;
    if (pv11 == this) {
      n = null;
      rv1 rv11 = this.j;
      if (rv11 != null) {
        View view1 = (View)rv11.c;
        if (view1.getParent() != null)
          ((WindowManager)((Context)rv11.b).getSystemService("window")).removeView(view1); 
        this.j = null;
        this.l = true;
        view.removeOnAttachStateChangeListener(this);
      } else {
        Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
      } 
    } 
    if (m == this)
      b(null); 
    view.removeCallbacks(this.g);
  }
  
  public final void c(boolean paramBoolean) {
    int m;
    long l;
    View view3 = this.b;
    if (!view3.isAttachedToWindow())
      return; 
    b(null);
    pv1 pv11 = n;
    if (pv11 != null)
      pv11.a(); 
    n = this;
    this.k = paramBoolean;
    Context context1 = view3.getContext();
    Object object = new Object();
    WindowManager.LayoutParams layoutParams1 = new WindowManager.LayoutParams();
    ((rv1)object).f = layoutParams1;
    ((rv1)object).g = new Rect();
    ((rv1)object).h = new int[2];
    ((rv1)object).i = new int[2];
    ((rv1)object).b = context1;
    View view1 = LayoutInflater.from(context1).inflate(2131492891, null);
    ((rv1)object).c = view1;
    ((rv1)object).e = view1.findViewById(2131297113);
    layoutParams1.setTitle(rv1.class.getSimpleName());
    layoutParams1.packageName = context1.getPackageName();
    layoutParams1.type = 1002;
    layoutParams1.width = -2;
    layoutParams1.height = -2;
    layoutParams1.format = -3;
    layoutParams1.windowAnimations = 2131951620;
    layoutParams1.flags = 24;
    View view4 = (View)((rv1)object).c;
    Context context2 = (Context)((rv1)object).b;
    this.j = (rv1)object;
    int i = this.h;
    int k = this.i;
    paramBoolean = this.k;
    WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams)((rv1)object).f;
    if (view4.getParent() != null && view4.getParent() != null)
      ((WindowManager)context2.getSystemService("window")).removeView(view4); 
    ((TextView)((rv1)object).e).setText(this.c);
    int[] arrayOfInt2 = (int[])((rv1)object).i;
    int[] arrayOfInt1 = (int[])((rv1)object).h;
    Rect rect = (Rect)((rv1)object).g;
    layoutParams2.token = view3.getApplicationWindowToken();
    int j = context2.getResources().getDimensionPixelOffset(2131166376);
    if (view3.getWidth() < j)
      i = view3.getWidth() / 2; 
    if (view3.getHeight() >= j) {
      m = context2.getResources().getDimensionPixelOffset(2131166375);
      j = k + m;
      k -= m;
    } else {
      j = view3.getHeight();
      k = 0;
    } 
    layoutParams2.gravity = 49;
    object = context2.getResources();
    if (paramBoolean) {
      m = 2131166379;
    } else {
      m = 2131166378;
    } 
    int n = object.getDimensionPixelOffset(m);
    View view2 = view3.getRootView();
    object = view2.getLayoutParams();
    if (object instanceof WindowManager.LayoutParams && ((WindowManager.LayoutParams)object).type == 2) {
      object = view2;
    } else {
      Context context = view3.getContext();
      while (true) {
        object = view2;
        if (context instanceof ContextWrapper) {
          if (context instanceof Activity) {
            object = ((Activity)context).getWindow().getDecorView();
            break;
          } 
          context = ((ContextWrapper)context).getBaseContext();
          continue;
        } 
        break;
      } 
    } 
    if (object == null) {
      Log.e("TooltipPopup", "Cannot find app view");
    } else {
      object.getWindowVisibleDisplayFrame(rect);
      if (rect.left < 0 && rect.top < 0) {
        Resources resources = context2.getResources();
        m = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (m != 0) {
          m = resources.getDimensionPixelSize(m);
        } else {
          m = 0;
        } 
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        rect.set(0, m, displayMetrics.widthPixels, displayMetrics.heightPixels);
      } 
      object.getLocationOnScreen(arrayOfInt2);
      view3.getLocationOnScreen(arrayOfInt1);
      m = arrayOfInt1[0] - arrayOfInt2[0];
      arrayOfInt1[0] = m;
      arrayOfInt1[1] = arrayOfInt1[1] - arrayOfInt2[1];
      layoutParams2.x = m + i - object.getWidth() / 2;
      i = View.MeasureSpec.makeMeasureSpec(0, 0);
      view4.measure(i, i);
      i = view4.getMeasuredHeight();
      m = arrayOfInt1[1];
      k = m + k - n - i;
      j = m + j + n;
      if (paramBoolean) {
        if (k >= 0) {
          layoutParams2.y = k;
        } else {
          layoutParams2.y = j;
        } 
      } else if (i + j <= rect.height()) {
        layoutParams2.y = j;
      } else {
        layoutParams2.y = k;
      } 
    } 
    ((WindowManager)context2.getSystemService("window")).addView(view4, (ViewGroup.LayoutParams)layoutParams2);
    view3.addOnAttachStateChangeListener(this);
    if (this.k) {
      l = 2500L;
    } else {
      long l1;
      object = v22.a;
      if ((view3.getWindowSystemUiVisibility() & 0x1) == 1) {
        l = ViewConfiguration.getLongPressTimeout();
        l1 = 3000L;
      } else {
        l = ViewConfiguration.getLongPressTimeout();
        l1 = 15000L;
      } 
      l = l1 - l;
    } 
    object = this.g;
    view3.removeCallbacks((Runnable)object);
    view3.postDelayed((Runnable)object, l);
  }
  
  public final boolean onHover(View paramView, MotionEvent paramMotionEvent) {
    if (this.j == null || !this.k) {
      paramView = this.b;
      AccessibilityManager accessibilityManager = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
      if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
        int i = paramMotionEvent.getAction();
        if (i != 7) {
          if (i == 10) {
            this.l = true;
            a();
            return false;
          } 
        } else {
          int j;
          if (paramView.isEnabled() && this.j == null) {
            i = (int)paramMotionEvent.getX();
            j = (int)paramMotionEvent.getY();
            if (!this.l) {
              int k = Math.abs(i - this.h);
              int m = this.e;
              if (k > m || Math.abs(j - this.i) > m) {
                this.h = i;
                this.i = j;
                this.l = false;
                b(this);
              } 
              return false;
            } 
          } else {
            return false;
          } 
          this.h = i;
          this.i = j;
          this.l = false;
          b(this);
        } 
      } 
    } 
    return false;
  }
  
  public final boolean onLongClick(View paramView) {
    this.h = paramView.getWidth() / 2;
    this.i = paramView.getHeight() / 2;
    c(true);
    return true;
  }
  
  public final void onViewAttachedToWindow(View paramView) {}
  
  public final void onViewDetachedFromWindow(View paramView) {
    a();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */