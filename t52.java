import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class t52 extends ui0 implements l1 {
  public static final AccelerateInterpolator M = new AccelerateInterpolator();
  
  public static final DecelerateInterpolator N = new DecelerateInterpolator();
  
  public final ArrayList A;
  
  public int B;
  
  public boolean C;
  
  public boolean D;
  
  public boolean E;
  
  public boolean F;
  
  public v32 G;
  
  public boolean H;
  
  public boolean I;
  
  public final r52 J;
  
  public final r52 K;
  
  public final a42 L;
  
  public Context o;
  
  public Context p;
  
  public ActionBarOverlayLayout q;
  
  public ActionBarContainer r;
  
  public sv s;
  
  public ActionBarContextView t;
  
  public final View u;
  
  public boolean v;
  
  public s52 w;
  
  public s52 x;
  
  public g7 y;
  
  public boolean z;
  
  public t52(Activity paramActivity, boolean paramBoolean) {
    new ArrayList();
    this.A = new ArrayList();
    this.B = 0;
    this.C = true;
    this.F = true;
    this.J = new r52(this, 0);
    this.K = new r52(this, 1);
    this.L = new a42(1, this);
    View view = paramActivity.getWindow().getDecorView();
    E0(view);
    if (!paramBoolean)
      this.u = view.findViewById(16908290); 
  }
  
  public t52(Dialog paramDialog) {
    new ArrayList();
    this.A = new ArrayList();
    this.B = 0;
    this.C = true;
    this.F = true;
    this.J = new r52(this, 0);
    this.K = new r52(this, 1);
    this.L = new a42(1, this);
    E0(paramDialog.getWindow().getDecorView());
  }
  
  public final void D0(boolean paramBoolean) {
    u32 u32;
    boolean bool = this.E;
    if (paramBoolean) {
      if (!bool) {
        this.E = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.q;
        if (actionBarOverlayLayout != null)
          actionBarOverlayLayout.setShowingForActionMode(true); 
        H0(false);
      } 
    } else if (bool) {
      this.E = false;
      ActionBarOverlayLayout actionBarOverlayLayout = this.q;
      if (actionBarOverlayLayout != null)
        actionBarOverlayLayout.setShowingForActionMode(false); 
      H0(false);
    } 
    bool = this.r.isLaidOut();
    sv sv1 = this.s;
    if (bool) {
      long l;
      u32 u321;
      if (paramBoolean) {
        sv1 = sv1;
        u321 = v22.a((View)((mv1)sv1).a);
        u321.a(0.0F);
        u321.c(100L);
        u321.d(new lv1((mv1)sv1, 4));
        u32 = this.t.i(0, 200L);
      } else {
        mv1 mv1 = (mv1)u32;
        u32 = v22.a((View)mv1.a);
        u32.a(1.0F);
        u32.c(200L);
        u32.d(new lv1(mv1, 0));
        u321 = this.t.i(8, 100L);
      } 
      v32 v321 = new v32();
      ArrayList<u32> arrayList = v321.b;
      arrayList.add(u321);
      View view = u321.a.get();
      if (view != null) {
        l = view.animate().getDuration();
      } else {
        l = 0L;
      } 
      view = u32.a.get();
      if (view != null)
        view.animate().setStartDelay(l); 
      arrayList.add(u32);
      v321.e();
      return;
    } 
    if (paramBoolean) {
      ((mv1)u32).a.setVisibility(4);
      this.t.setVisibility(0);
      return;
    } 
    ((mv1)u32).a.setVisibility(0);
    this.t.setVisibility(8);
  }
  
  public final Context E() {
    if (this.p == null) {
      TypedValue typedValue = new TypedValue();
      this.o.getTheme().resolveAttribute(2130968588, typedValue, true);
      int i = typedValue.resourceId;
      if (i != 0) {
        this.p = (Context)new ContextThemeWrapper(this.o, i);
      } else {
        this.p = this.o;
      } 
    } 
    return this.p;
  }
  
  public final void E0(View paramView) {
    String str;
    sv sv2;
    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout)paramView.findViewById(2131296644);
    this.q = actionBarOverlayLayout;
    if (actionBarOverlayLayout != null)
      actionBarOverlayLayout.setActionBarVisibilityCallback(this); 
    View view = paramView.findViewById(2131296311);
    if (view instanceof sv) {
      sv2 = (sv)view;
    } else if (sv2 instanceof Toolbar) {
      sv2 = ((Toolbar)sv2).getWrapper();
    } else {
      if (sv2 != null) {
        str = sv2.getClass().getSimpleName();
      } else {
        str = "null";
      } 
      throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
    } 
    this.s = sv2;
    this.t = (ActionBarContextView)str.findViewById(2131296319);
    ActionBarContainer actionBarContainer = (ActionBarContainer)str.findViewById(2131296313);
    this.r = actionBarContainer;
    sv sv1 = this.s;
    if (sv1 != null && this.t != null && actionBarContainer != null) {
      Context context = ((mv1)sv1).a.getContext();
      this.o = context;
      if ((((mv1)this.s).b & 0x4) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i)
        this.v = true; 
      int i = (context.getApplicationInfo()).targetSdkVersion;
      this.s.getClass();
      G0(context.getResources().getBoolean(2131034112));
      TypedArray typedArray = this.o.obtainStyledAttributes(null, nc1.a, 2130968583, 0);
      if (typedArray.getBoolean(14, false)) {
        ActionBarOverlayLayout actionBarOverlayLayout1 = this.q;
        if (actionBarOverlayLayout1.i) {
          this.I = true;
          actionBarOverlayLayout1.setHideOnContentScrollEnabled(true);
        } else {
          tp.f("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
          return;
        } 
      } 
      i = typedArray.getDimensionPixelSize(12, 0);
      if (i != 0) {
        float f = i;
        ActionBarContainer actionBarContainer1 = this.r;
        WeakHashMap weakHashMap = v22.a;
        actionBarContainer1.setElevation(f);
      } 
      typedArray.recycle();
      return;
    } 
    tp.f(t52.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
  }
  
  public final void F0(int paramInt1, int paramInt2) {
    mv1 mv1 = (mv1)this.s;
    int i = mv1.b;
    if ((paramInt2 & 0x4) != 0)
      this.v = true; 
    mv1.a(paramInt1 & paramInt2 | (paramInt2 ^ 0xFFFFFFFF) & i);
  }
  
  public final void G0(boolean paramBoolean) {
    if (!paramBoolean) {
      ((mv1)this.s).getClass();
      this.r.setTabContainer(null);
    } else {
      this.r.setTabContainer(null);
      ((mv1)this.s).getClass();
    } 
    this.s.getClass();
    ((mv1)this.s).a.setCollapsible(false);
    this.q.setHasNonEmbeddedTabs(false);
  }
  
  public final void H0(boolean paramBoolean) {
    int i;
    ActionBarOverlayLayout actionBarOverlayLayout;
    u32 u32;
    boolean bool = this.D;
    if (!this.E && bool) {
      i = 0;
    } else {
      i = 1;
    } 
    bool = this.F;
    v32 v321 = null;
    pd pd = null;
    a42 a421 = this.L;
    View view = this.u;
    if (i) {
      if (!bool) {
        this.F = true;
        v321 = this.G;
        if (v321 != null)
          v321.b(); 
        this.r.setVisibility(0);
        i = this.B;
        r52 r521 = this.K;
        if (i == 0 && (this.H || paramBoolean)) {
          this.r.setTranslationY(0.0F);
          float f2 = -this.r.getHeight();
          float f1 = f2;
          if (paramBoolean) {
            int[] arrayOfInt = new int[2];
            arrayOfInt[0] = 0;
            arrayOfInt[1] = 0;
            this.r.getLocationInWindow(arrayOfInt);
            f1 = f2 - arrayOfInt[1];
          } 
          this.r.setTranslationY(f1);
          v32 v322 = new v32();
          u32 u321 = v22.a((View)this.r);
          u321.e(0.0F);
          View view1 = u321.a.get();
          if (view1 != null) {
            if (a421 != null)
              pd = new pd(a421, view1); 
            view1.animate().setUpdateListener(pd);
          } 
          paramBoolean = v322.e;
          ArrayList<u32> arrayList = v322.b;
          if (!paramBoolean)
            arrayList.add(u321); 
          if (this.C && view != null) {
            view.setTranslationY(f1);
            u32 = v22.a(view);
            u32.e(0.0F);
            if (!v322.e)
              arrayList.add(u32); 
          } 
          paramBoolean = v322.e;
          if (!paramBoolean)
            v322.f = N; 
          if (!paramBoolean)
            v322.c = 250L; 
          if (!paramBoolean)
            v322.g = r521; 
          this.G = v322;
          v322.e();
        } else {
          this.r.setAlpha(1.0F);
          this.r.setTranslationY(0.0F);
          if (this.C && u32 != null)
            u32.setTranslationY(0.0F); 
          r521.a();
        } 
        actionBarOverlayLayout = this.q;
        if (actionBarOverlayLayout != null) {
          WeakHashMap weakHashMap = v22.a;
          actionBarOverlayLayout.requestApplyInsets();
          return;
        } 
      } 
    } else if (bool) {
      this.F = false;
      v32 v322 = this.G;
      if (v322 != null)
        v322.b(); 
      i = this.B;
      r52 r521 = this.J;
      if (i == 0 && (this.H || paramBoolean)) {
        this.r.setAlpha(1.0F);
        this.r.setTransitioning(true);
        v32 v323 = new v32();
        float f2 = -this.r.getHeight();
        float f1 = f2;
        if (paramBoolean) {
          int[] arrayOfInt = new int[2];
          arrayOfInt[0] = 0;
          arrayOfInt[1] = 0;
          this.r.getLocationInWindow(arrayOfInt);
          f1 = f2 - arrayOfInt[1];
        } 
        u32 u321 = v22.a((View)this.r);
        u321.e(f1);
        View view1 = u321.a.get();
        if (view1 != null) {
          pd pd1;
          ActionBarOverlayLayout actionBarOverlayLayout1 = actionBarOverlayLayout;
          if (a421 != null)
            pd1 = new pd(a421, view1); 
          view1.animate().setUpdateListener(pd1);
        } 
        paramBoolean = v323.e;
        ArrayList<u32> arrayList = v323.b;
        if (!paramBoolean)
          arrayList.add(u321); 
        if (this.C && u32 != null) {
          u32 u322 = v22.a((View)u32);
          u322.e(f1);
          if (!v323.e)
            arrayList.add(u322); 
        } 
        paramBoolean = v323.e;
        if (!paramBoolean)
          v323.f = M; 
        if (!paramBoolean)
          v323.c = 250L; 
        if (!paramBoolean)
          v323.g = r521; 
        this.G = v323;
        v323.e();
        return;
      } 
      r521.a();
    } 
  }
  
  public final void P() {
    G0(this.o.getResources().getBoolean(2131034112));
  }
  
  public final boolean R(int paramInt, KeyEvent paramKeyEvent) {
    s52 s521 = this.w;
    if (s521 != null) {
      rw0 rw0 = s521.f;
      if (rw0 != null) {
        int i = KeyCharacterMap.load(paramKeyEvent.getDeviceId()).getKeyboardType();
        boolean bool = true;
        if (i == 1)
          bool = false; 
        rw0.setQwertyMode(bool);
        return rw0.performShortcut(paramInt, paramKeyEvent, 0);
      } 
    } 
    return false;
  }
  
  public final void Y(boolean paramBoolean) {
    if (!this.v)
      Z(paramBoolean); 
  }
  
  public final void Z(boolean paramBoolean) {
    boolean bool;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    F0(bool, 4);
  }
  
  public final void a0() {
    F0(16, 16);
  }
  
  public final void b0(boolean paramBoolean) {
    boolean bool;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    F0(bool, 2);
  }
  
  public final void c0() {
    F0(0, 8);
  }
  
  public final void d0(boolean paramBoolean) {
    this.H = paramBoolean;
    if (!paramBoolean) {
      v32 v321 = this.G;
      if (v321 != null)
        v321.b(); 
    } 
  }
  
  public final void f0(int paramInt) {
    g0(this.o.getString(paramInt));
  }
  
  public final void g0(CharSequence paramCharSequence) {
    mv1 mv1 = (mv1)this.s;
    mv1.g = true;
    Toolbar toolbar = mv1.a;
    mv1.h = paramCharSequence;
    if ((mv1.b & 0x8) != 0) {
      toolbar.setTitle(paramCharSequence);
      if (mv1.g)
        v22.o(toolbar.getRootView(), paramCharSequence); 
    } 
  }
  
  public final void h0(CharSequence paramCharSequence) {
    mv1 mv1 = (mv1)this.s;
    if (!mv1.g) {
      Toolbar toolbar = mv1.a;
      mv1.h = paramCharSequence;
      if ((mv1.b & 0x8) != 0) {
        toolbar.setTitle(paramCharSequence);
        if (mv1.g)
          v22.o(toolbar.getRootView(), paramCharSequence); 
      } 
    } 
  }
  
  public final boolean k() {
    sv sv1 = this.s;
    if (sv1 != null) {
      fv1 fv1 = ((mv1)sv1).a.O;
      if (fv1 != null && fv1.c != null) {
        uw0 uw0;
        fv1 = ((mv1)sv1).a.O;
        if (fv1 == null) {
          fv1 = null;
        } else {
          uw0 = fv1.c;
        } 
        if (uw0 != null)
          uw0.collapseActionView(); 
        return true;
      } 
    } 
    return false;
  }
  
  public final y1 k0(g7 paramg7) {
    null = this.w;
    if (null != null)
      null.a(); 
    this.q.setHideOnContentScrollEnabled(false);
    this.t.e();
    null = new s52(this, this.t.getContext(), paramg7);
    rw0 rw0 = null.f;
    rw0.w();
    try {
      boolean bool = ((n2)null.g.c).E(null, rw0);
      rw0.v();
      return null;
    } finally {
      rw0.v();
    } 
  }
  
  public final void p(boolean paramBoolean) {
    if (paramBoolean != this.z) {
      this.z = paramBoolean;
      ArrayList<E> arrayList = this.A;
      if (arrayList.size() > 0) {
        arrayList.get(0).getClass();
        tp.b();
        return;
      } 
    } 
  }
  
  public final int x() {
    return ((mv1)this.s).b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */