import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class dh extends w6 {
  public BottomSheetBehavior i;
  
  public FrameLayout j;
  
  public CoordinatorLayout k;
  
  public FrameLayout l;
  
  public boolean m = true;
  
  public boolean n = true;
  
  public boolean o;
  
  public ch p;
  
  public final boolean q;
  
  public zv0 r;
  
  public final bh s = new bh(this);
  
  public dh(Context paramContext, int paramInt) {
    super(paramContext, i);
    d().i(1);
    TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(new int[] { 2130969122 });
    this.q = typedArray.getBoolean(0, false);
    typedArray.recycle();
  }
  
  public final void cancel() {
    if (this.i == null)
      f(); 
    super.cancel();
  }
  
  public final void f() {
    if (this.j == null) {
      FrameLayout frameLayout = (FrameLayout)View.inflate(getContext(), 2131492933, null);
      this.j = frameLayout;
      this.k = (CoordinatorLayout)frameLayout.findViewById(2131296602);
      frameLayout = (FrameLayout)this.j.findViewById(2131296648);
      this.l = frameLayout;
      BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.B((View)frameLayout);
      this.i = bottomSheetBehavior;
      ArrayList<bh> arrayList = bottomSheetBehavior.Y;
      bh bh1 = this.s;
      if (!arrayList.contains(bh1))
        arrayList.add(bh1); 
      this.i.G(this.m);
      this.r = new zv0((xr0)this.i, (View)this.l);
    } 
  }
  
  public final FrameLayout g(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    f();
    CoordinatorLayout coordinatorLayout = (CoordinatorLayout)this.j.findViewById(2131296602);
    View view = paramView;
    if (paramInt != 0) {
      view = paramView;
      if (paramView == null)
        view = getLayoutInflater().inflate(paramInt, (ViewGroup)coordinatorLayout, false); 
    } 
    if (this.q) {
      FrameLayout frameLayout1 = this.j;
      gh1 gh1 = new gh1(15, this);
      WeakHashMap weakHashMap = v22.a;
      m22.c((View)frameLayout1, gh1);
    } 
    this.l.removeAllViews();
    FrameLayout frameLayout = this.l;
    if (paramLayoutParams == null) {
      frameLayout.addView(view);
    } else {
      frameLayout.addView(view, paramLayoutParams);
    } 
    coordinatorLayout.findViewById(2131297663).setOnClickListener(new i1(2, this));
    v22.n((View)this.l, new fe(1, this));
    this.l.setOnTouchListener(new he(1));
    return this.j;
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    Window window = getWindow();
    if (window != null) {
      boolean bool;
      if (this.q && Color.alpha(window.getNavigationBarColor()) < 255) {
        bool = true;
      } else {
        bool = false;
      } 
      FrameLayout frameLayout = this.j;
      if (frameLayout != null)
        frameLayout.setFitsSystemWindows(bool ^ true); 
      CoordinatorLayout coordinatorLayout = this.k;
      if (coordinatorLayout != null)
        coordinatorLayout.setFitsSystemWindows(bool ^ true); 
      qz1.P(window, bool ^ true);
      ch ch1 = this.p;
      if (ch1 != null)
        ch1.e(window); 
    } 
    zv0 zv01 = this.r;
    if (zv01 != null) {
      View view = (View)zv01.f;
      boolean bool = this.m;
      yr0 yr0 = (yr0)zv01.c;
      if (bool) {
        if (yr0 != null) {
          yr0.b((xr0)zv01.e, view, false);
          return;
        } 
      } else if (yr0 != null) {
        yr0.c(view);
      } 
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    Window window = getWindow();
    if (window != null) {
      window.setStatusBarColor(0);
      window.addFlags(-2147483648);
      window.setLayout(-1, -1);
    } 
  }
  
  public final void onDetachedFromWindow() {
    ch ch1 = this.p;
    if (ch1 != null)
      ch1.e(null); 
    zv0 zv01 = this.r;
    if (zv01 != null) {
      yr0 yr0 = (yr0)zv01.c;
      if (yr0 != null)
        yr0.c((View)zv01.f); 
    } 
  }
  
  public final void onStart() {
    super.onStart();
    BottomSheetBehavior bottomSheetBehavior = this.i;
    if (bottomSheetBehavior != null && bottomSheetBehavior.N == 5)
      bottomSheetBehavior.I(4); 
  }
  
  public final void setCancelable(boolean paramBoolean) {
    super.setCancelable(paramBoolean);
    if (this.m != paramBoolean) {
      this.m = paramBoolean;
      BottomSheetBehavior bottomSheetBehavior = this.i;
      if (bottomSheetBehavior != null)
        bottomSheetBehavior.G(paramBoolean); 
      if (getWindow() != null) {
        zv0 zv01 = this.r;
        if (zv01 != null) {
          View view = (View)zv01.f;
          paramBoolean = this.m;
          yr0 yr0 = (yr0)zv01.c;
          if (paramBoolean) {
            if (yr0 != null) {
              yr0.b((xr0)zv01.e, view, false);
              return;
            } 
          } else if (yr0 != null) {
            yr0.c(view);
          } 
        } 
      } 
    } 
  }
  
  public final void setCanceledOnTouchOutside(boolean paramBoolean) {
    super.setCanceledOnTouchOutside(paramBoolean);
    if (paramBoolean && !this.m)
      this.m = true; 
    this.n = paramBoolean;
    this.o = true;
  }
  
  public final void setContentView(int paramInt) {
    super.setContentView((View)g(null, paramInt, null));
  }
  
  public final void setContentView(View paramView) {
    super.setContentView((View)g(paramView, 0, null));
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    super.setContentView((View)g(paramView, 0, paramLayoutParams));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */