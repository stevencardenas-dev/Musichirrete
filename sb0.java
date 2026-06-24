import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class sb0 {
  public final g7 a;
  
  public final n2 b;
  
  public final ua0 c;
  
  public boolean d = false;
  
  public int e = -1;
  
  public sb0(g7 paramg7, n2 paramn2, ClassLoader paramClassLoader, eb0 parameb0, Bundle paramBundle) {
    this.a = paramg7;
    this.b = paramn2;
    rb0 rb0 = (rb0)paramBundle.getParcelable("state");
    ua0 ua01 = parameb0.a(rb0.b);
    ua01.h = rb0.c;
    ua01.q = rb0.e;
    ua01.s = rb0.f;
    ua01.t = true;
    ua01.A = rb0.g;
    ua01.B = rb0.h;
    ua01.C = rb0.i;
    ua01.F = rb0.j;
    ua01.o = rb0.k;
    ua01.E = rb0.l;
    ua01.D = rb0.m;
    ua01.S = pm0.values()[rb0.n];
    ua01.k = rb0.o;
    ua01.l = rb0.p;
    ua01.M = rb0.q;
    this.c = ua01;
    ua01.c = paramBundle;
    Bundle bundle = paramBundle.getBundle("arguments");
    if (bundle != null)
      bundle.setClassLoader(paramClassLoader); 
    ua01.x0(bundle);
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("Instantiated fragment ");
      stringBuilder.append(ua01);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public sb0(g7 paramg7, n2 paramn2, ua0 paramua0) {
    this.a = paramg7;
    this.b = paramn2;
    this.c = paramua0;
  }
  
  public sb0(g7 paramg7, n2 paramn2, ua0 paramua0, Bundle paramBundle) {
    this.a = paramg7;
    this.b = paramn2;
    this.c = paramua0;
    paramua0.e = null;
    paramua0.f = null;
    paramua0.v = 0;
    paramua0.r = false;
    paramua0.n = false;
    ua0 ua01 = paramua0.j;
    if (ua01 != null) {
      String str = ua01.h;
    } else {
      ua01 = null;
    } 
    paramua0.k = (String)ua01;
    paramua0.j = null;
    paramua0.c = paramBundle;
    paramua0.i = paramBundle.getBundle("arguments");
  }
  
  public final void a() {
    boolean bool = lb0.M(3);
    ua0 ua01 = this.c;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder("moveto ACTIVITY_CREATED: ");
      stringBuilder.append(ua01);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Bundle bundle = ua01.c;
    if (bundle != null) {
      bundle = bundle.getBundle("savedInstanceState");
    } else {
      bundle = null;
    } 
    ua01.y.S();
    ua01.b = 3;
    ua01.I = false;
    ua01.b0(bundle);
    if (ua01.I) {
      if (lb0.M(3)) {
        StringBuilder stringBuilder = new StringBuilder("moveto RESTORE_VIEW_STATE: ");
        stringBuilder.append(ua01);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      if (ua01.K != null) {
        bundle = ua01.c;
        if (bundle != null) {
          bundle = bundle.getBundle("savedInstanceState");
        } else {
          bundle = null;
        } 
        SparseArray sparseArray = ua01.e;
        if (sparseArray != null) {
          ua01.K.restoreHierarchyState(sparseArray);
          ua01.e = null;
        } 
        ua01.I = false;
        ua01.r0(bundle);
        if (ua01.I) {
          if (ua01.K != null)
            ua01.U.a(om0.ON_CREATE); 
        } else {
          throw new AndroidRuntimeException(x41.j("Fragment ", ua01, " did not call through to super.onViewStateRestored()"));
        } 
      } 
      ua01.c = null;
      lb0 lb0 = ua01.y;
      lb0.H = false;
      lb0.I = false;
      lb0.O.g = false;
      lb0.u(4);
      this.a.e(ua01, false);
      return;
    } 
    throw new AndroidRuntimeException(x41.j("Fragment ", ua01, " did not call through to super.onActivityCreated()"));
  }
  
  public final void b() {
    int i;
    ua0 ua02 = this.c;
    ViewGroup viewGroup = ua02.J;
    while (true) {
      object = null;
      if (viewGroup != null) {
        object = viewGroup.getTag(2131296752);
        if (object instanceof ua0) {
          object = object;
        } else {
          object = null;
        } 
        if (object != null)
          break; 
        ViewParent viewParent = viewGroup.getParent();
        if (viewParent instanceof View) {
          View view = (View)viewParent;
          continue;
        } 
        viewParent = null;
        continue;
      } 
      break;
    } 
    ua0 ua01 = ua02.z;
    if (object != null && object != ua01) {
      i = ua02.B;
      tb0 tb0 = ub0.a;
      StringBuilder stringBuilder = new StringBuilder("Attempting to nest fragment ");
      stringBuilder.append(ua02);
      stringBuilder.append(" within the view of parent fragment ");
      stringBuilder.append(object);
      stringBuilder.append(" via container with ID ");
      ub0.b(new l42(ua02, x41.m(stringBuilder, i, " without using parent's childFragmentManager")));
      ub0.a(ua02).getClass();
    } 
    ArrayList<ua0> arrayList = (ArrayList)this.b.c;
    Object object = ua02.J;
    byte b = -1;
    if (object == null) {
      i = b;
    } else {
      int k = arrayList.indexOf(ua02);
      int j = k - 1;
      while (true) {
        i = k;
        if (j >= 0) {
          ua0 ua03 = arrayList.get(j);
          if (ua03.J == object) {
            View view = ua03.K;
            if (view != null) {
              i = object.indexOfChild(view) + 1;
              break;
            } 
          } 
          j--;
          continue;
        } 
        while (true) {
          j = i + 1;
          i = b;
          if (j < arrayList.size()) {
            ua0 ua03 = arrayList.get(j);
            if (ua03.J == object) {
              View view = ua03.K;
              if (view != null) {
                i = object.indexOfChild(view);
                break;
              } 
            } 
            i = j;
            continue;
          } 
          break;
        } 
        break;
      } 
    } 
    ua02.J.addView(ua02.K, i);
  }
  
  public final void c() {
    StringBuilder stringBuilder;
    boolean bool = lb0.M(3);
    ua0 ua01 = this.c;
    if (bool) {
      stringBuilder = new StringBuilder("moveto ATTACHED: ");
      stringBuilder.append(ua01);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    ua0 ua02 = ua01.j;
    n2 n21 = this.b;
    if (ua02 != null) {
      String str = ua02.h;
      sb0 sb01 = (sb0)((HashMap)n21.e).get(str);
      if (sb01 != null) {
        ua01.k = ua01.j.h;
        ua01.j = null;
      } else {
        stringBuilder = new StringBuilder("Fragment ");
        stringBuilder.append(ua01);
        ua01 = ua01.j;
        stringBuilder.append(" declared target fragment ");
        stringBuilder.append(ua01);
        stringBuilder.append(" that does not belong to this FragmentManager!");
        throw new IllegalStateException(stringBuilder.toString());
      } 
    } else {
      String str = ua01.k;
      if (str != null) {
        sb0 sb01 = (sb0)((HashMap)((n2)stringBuilder).e).get(str);
        if (sb01 == null) {
          StringBuilder stringBuilder1 = new StringBuilder("Fragment ");
          stringBuilder1.append(ua01);
          stringBuilder1.append(" declared target fragment ");
          tp.f(x41.n(stringBuilder1, ua01.k, " that does not belong to this FragmentManager!"));
          return;
        } 
      } else {
        stringBuilder = null;
      } 
    } 
    if (stringBuilder != null)
      stringBuilder.k(); 
    lb0 lb0 = ua01.w;
    ua01.x = lb0.w;
    ua01.z = lb0.y;
    g7 g71 = this.a;
    g71.k(ua01, false);
    ArrayList<lb0> arrayList = ua01.X;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      lb0 = arrayList.get(b);
      b++;
      ua0 ua03 = ((qa0)lb0).a;
      ua03.W.s();
      ui0.s(ua03);
      Bundle bundle = ua03.c;
      if (bundle != null) {
        bundle = bundle.getBundle("registryState");
      } else {
        bundle = null;
      } 
      ua03.W.t(bundle);
    } 
    arrayList.clear();
    ua01.y.b(ua01.x, ua01.K(), ua01);
    ua01.b = 0;
    ua01.I = false;
    ua01.e0((Context)ua01.x.l);
    if (ua01.I) {
      Iterator<pb0> iterator = ua01.w.p.iterator();
      while (iterator.hasNext())
        ((pb0)iterator.next()).a(); 
      lb0 lb01 = ua01.y;
      lb01.H = false;
      lb01.I = false;
      lb01.O.g = false;
      lb01.u(0);
      g71.f(ua01, false);
      return;
    } 
    throw new AndroidRuntimeException(x41.j("Fragment ", ua01, " did not call through to super.onAttach()"));
  }
  
  public final int d() {
    ua0 ua01 = this.c;
    if (ua01.w == null)
      return ua01.b; 
    int j = this.e;
    int n = ua01.S.ordinal();
    int m = 0;
    int k = 0;
    if (n != 1) {
      if (n != 2) {
        if (n != 3) {
          i = j;
          if (n != 4)
            i = Math.min(j, -1); 
        } else {
          i = Math.min(j, 5);
        } 
      } else {
        i = Math.min(j, 1);
      } 
    } else {
      i = Math.min(j, 0);
    } 
    j = i;
    if (ua01.q) {
      boolean bool = ua01.r;
      j = this.e;
      if (bool) {
        i = Math.max(j, 2);
        View view = ua01.K;
        j = i;
        if (view != null) {
          j = i;
          if (view.getParent() == null)
            j = Math.min(i, 2); 
        } 
      } else if (j < 4) {
        j = Math.min(i, ua01.b);
      } else {
        j = Math.min(i, 1);
      } 
    } 
    int i = j;
    if (ua01.s) {
      i = j;
      if (ua01.J == null)
        i = Math.min(j, 4); 
    } 
    j = i;
    if (!ua01.n)
      j = Math.min(i, 1); 
    ViewGroup viewGroup = ua01.J;
    if (viewGroup != null) {
      jx jx = jx.i(viewGroup, ua01.R());
      go1 go12 = jx.f(ua01);
      if (go12 != null) {
        i = go12.b;
      } else {
        i = 0;
      } 
      go1 go11 = jx.g(ua01);
      if (go11 != null)
        k = go11.b; 
      if (i == 0) {
        n = -1;
      } else {
        n = ho1.a[x41.y(i)];
      } 
      m = k;
      if (n != -1) {
        m = k;
        if (n != 1)
          m = i; 
      } 
    } 
    if (m == 2) {
      i = Math.min(j, 6);
    } else if (m == 3) {
      i = Math.max(j, 3);
    } else {
      i = j;
      if (ua01.o)
        if (ua01.a0()) {
          i = Math.min(j, 1);
        } else {
          i = Math.min(j, -1);
        }  
    } 
    j = i;
    if (ua01.L) {
      j = i;
      if (ua01.b < 5)
        j = Math.min(i, 4); 
    } 
    i = j;
    if (ua01.p)
      i = Math.max(j, 3); 
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("computeExpectedState() of ");
      stringBuilder.append(i);
      stringBuilder.append(" for ");
      stringBuilder.append(ua01);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    return i;
  }
  
  public final void e() {
    boolean bool = lb0.M(3);
    ua0 ua01 = this.c;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder("moveto CREATED: ");
      stringBuilder.append(ua01);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Bundle bundle = ua01.c;
    if (bundle != null) {
      bundle = bundle.getBundle("savedInstanceState");
    } else {
      bundle = null;
    } 
    if (!ua01.Q) {
      g7 g71 = this.a;
      g71.l(ua01, false);
      ua01.y.S();
      ua01.b = 1;
      ua01.I = false;
      ua01.T.a(new gd1(3, ua01));
      ua01.f0(bundle);
      ua01.Q = true;
      if (ua01.I) {
        ua01.T.e(om0.ON_CREATE);
        g71.g(ua01, false);
        return;
      } 
      throw new AndroidRuntimeException(x41.j("Fragment ", ua01, " did not call through to super.onCreate()"));
    } 
    ua01.b = 1;
    bundle = ua01.c;
    if (bundle != null) {
      bundle = bundle.getBundle("childFragmentManager");
      if (bundle != null) {
        ua01.y.Z(bundle);
        lb0 lb0 = ua01.y;
        lb0.H = false;
        lb0.I = false;
        lb0.O.g = false;
        lb0.u(1);
      } 
    } 
  }
  
  public final void f() {
    Bundle bundle2;
    StringBuilder stringBuilder;
    ua0 ua01 = this.c;
    if (ua01.q)
      return; 
    if (lb0.M(3)) {
      StringBuilder stringBuilder1 = new StringBuilder("moveto CREATE_VIEW: ");
      stringBuilder1.append(ua01);
      Log.d("FragmentManager", stringBuilder1.toString());
    } 
    Bundle bundle1 = ua01.c;
    String str = null;
    if (bundle1 != null) {
      bundle2 = bundle1.getBundle("savedInstanceState");
    } else {
      bundle2 = null;
    } 
    LayoutInflater layoutInflater = ua01.k0(bundle2);
    ua01.P = layoutInflater;
    ViewGroup viewGroup = ua01.J;
    if (viewGroup == null) {
      int i = ua01.B;
      if (i != 0) {
        if (i != -1) {
          ViewGroup viewGroup1 = (ViewGroup)ua01.w.x.K(i);
          if (viewGroup1 == null) {
            viewGroup = viewGroup1;
            if (!ua01.t)
              if (ua01.s) {
                viewGroup = viewGroup1;
              } else {
                String str1;
                try {
                  str1 = ua01.S().getResourceName(ua01.B);
                } catch (android.content.res.Resources.NotFoundException notFoundException) {
                  str1 = "unknown";
                } 
                str = Integer.toHexString(ua01.B);
                stringBuilder = new StringBuilder("No view found for id 0x");
                stringBuilder.append(str);
                stringBuilder.append(" (");
                stringBuilder.append(str1);
                stringBuilder.append(") for fragment ");
                stringBuilder.append(ua01);
                throw new IllegalArgumentException(stringBuilder.toString());
              }  
          } else {
            viewGroup = viewGroup1;
            if (!(viewGroup1 instanceof ya0)) {
              tb0 tb0 = ub0.a;
              StringBuilder stringBuilder1 = new StringBuilder("Attempting to add fragment ");
              stringBuilder1.append(ua01);
              stringBuilder1.append(" to container ");
              stringBuilder1.append(viewGroup1);
              stringBuilder1.append(" which is not a FragmentContainerView");
              ub0.b(new l42(ua01, stringBuilder1.toString()));
              ub0.a(ua01).getClass();
              ViewGroup viewGroup2 = viewGroup1;
            } 
          } 
        } else {
          l0.l(x41.j("Cannot create fragment ", ua01, " for a container view with no id"));
          return;
        } 
      } else {
        viewGroup = null;
      } 
    } 
    ua01.J = viewGroup;
    ua01.s0(layoutInflater, viewGroup, (Bundle)stringBuilder);
    if (ua01.K != null) {
      Bundle bundle3;
      if (lb0.M(3)) {
        stringBuilder = new StringBuilder("moveto VIEW_CREATED: ");
        stringBuilder.append(ua01);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      ua01.K.setSaveFromParentEnabled(false);
      ua01.K.setTag(2131296752, ua01);
      if (viewGroup != null)
        b(); 
      if (ua01.D)
        ua01.K.setVisibility(8); 
      boolean bool = ua01.K.isAttachedToWindow();
      View view = ua01.K;
      if (bool) {
        WeakHashMap weakHashMap = v22.a;
        view.requestApplyInsets();
      } else {
        view.addOnAttachStateChangeListener(new vi(2, view));
      } 
      Bundle bundle4 = ua01.c;
      String str1 = str;
      if (bundle4 != null)
        bundle3 = bundle4.getBundle("savedInstanceState"); 
      ua01.q0(bundle3);
      ua01.y.u(2);
      this.a.q(ua01, ua01.K, false);
      int i = ua01.K.getVisibility();
      float f = ua01.K.getAlpha();
      (ua01.L()).j = f;
      if (ua01.J != null && i == 0) {
        View view1 = ua01.K.findFocus();
        if (view1 != null) {
          (ua01.L()).k = view1;
          if (lb0.M(2)) {
            StringBuilder stringBuilder1 = new StringBuilder("requestFocus: Saved focused view ");
            stringBuilder1.append(view1);
            stringBuilder1.append(" for Fragment ");
            stringBuilder1.append(ua01);
            Log.v("FragmentManager", stringBuilder1.toString());
          } 
        } 
        ua01.K.setAlpha(0.0F);
      } 
    } 
    ua01.b = 2;
  }
  
  public final void g() {
    int i;
    int k;
    ua0 ua02;
    boolean bool = lb0.M(3);
    ua0 ua01 = this.c;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder("movefrom CREATED: ");
      stringBuilder.append(ua01);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    bool = ua01.o;
    boolean bool1 = true;
    int j = 0;
    if (bool && !ua01.a0()) {
      i = 1;
    } else {
      i = 0;
    } 
    n2 n21 = this.b;
    if (i)
      n21.I(ua01.h, null); 
    if (!i) {
      ob0 ob0 = (ob0)n21.g;
      if (ob0.b.containsKey(ua01.h) && ob0.e) {
        bool = ob0.f;
      } else {
        bool = true;
      } 
      if (!bool) {
        String str = ua01.k;
        if (str != null) {
          ua02 = n21.q(str);
          if (ua02 != null && ua02.F)
            ua01.j = ua02; 
        } 
        ua01.b = 0;
        return;
      } 
    } 
    wa0 wa0 = ua01.x;
    if (wa0 != null) {
      bool = ((ob0)((n2)ua02).g).f;
    } else {
      x5 x5 = wa0.l;
      bool = bool1;
      if (x5 != null)
        k = true ^ x5.isChangingConfigurations(); 
    } 
    if (i || k != 0)
      ((ob0)((n2)ua02).g).e(ua01, false); 
    ua01.y.l();
    ua01.T.e(om0.ON_DESTROY);
    ua01.b = 0;
    ua01.I = false;
    ua01.Q = false;
    ua01.h0();
    if (ua01.I) {
      this.a.h(ua01, false);
      ArrayList<Object> arrayList = ua02.t();
      int m = arrayList.size();
      i = j;
      while (i < m) {
        sb0 sb01 = (sb0)arrayList.get(i);
        j = i + 1;
        sb01 = sb01;
        i = j;
        if (sb01 != null) {
          ua0 ua03 = sb01.c;
          i = j;
          if (ua01.h.equals(ua03.k)) {
            ua03.j = ua01;
            ua03.k = null;
            i = j;
          } 
        } 
      } 
      String str = ua01.k;
      if (str != null)
        ua01.j = ua02.q(str); 
      ua02.C(this);
      return;
    } 
    throw new AndroidRuntimeException(x41.j("Fragment ", ua01, " did not call through to super.onDestroy()"));
  }
  
  public final void h() {
    boolean bool = lb0.M(3);
    ua0 ua01 = this.c;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder("movefrom CREATE_VIEW: ");
      stringBuilder.append(ua01);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    ViewGroup viewGroup = ua01.J;
    if (viewGroup != null) {
      View view = ua01.K;
      if (view != null)
        viewGroup.removeView(view); 
    } 
    ua01.y.u(1);
    if (ua01.K != null && ((pm0<pm0>)(ua01.U.N()).i).compareTo(pm0.e) >= 0)
      ua01.U.a(om0.ON_DESTROY); 
    ua01.b = 1;
    ua01.I = false;
    ua01.i0();
    if (ua01.I) {
      k32 k32 = ua01.H();
      k32.getClass();
      ft ft = ft.b;
      ft.getClass();
      n2 n21 = new n2(k32, so0.c, ft);
      ll ll = ne1.a(so0.class);
      String str = ll.b();
      if (str != null) {
        eo1 eo1 = ((so0)n21.z(ll, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str))).b;
        if (eo1.e <= 0) {
          ua01.u = false;
          this.a.r(ua01, false);
          ua01.J = null;
          ua01.K = null;
          ua01.U = null;
          ua01.V.e(null);
          ua01.r = false;
          return;
        } 
        throw x41.f(eo1.c[0]);
      } 
      l0.l("Local and anonymous classes can not be ViewModels");
      return;
    } 
    throw new AndroidRuntimeException(x41.j("Fragment ", ua01, " did not call through to super.onDestroyView()"));
  }
  
  public final void i() {
    boolean bool = lb0.M(3);
    ua0 ua01 = this.c;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder("movefrom ATTACHED: ");
      stringBuilder.append(ua01);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    ua01.b = -1;
    ua01.I = false;
    ua01.j0();
    ua01.P = null;
    if (ua01.I) {
      lb0 lb0 = ua01.y;
      if (!lb0.J) {
        lb0.l();
        ua01.y = new lb0();
      } 
      this.a.i(ua01, false);
      ua01.b = -1;
      ua01.x = null;
      ua01.z = null;
      ua01.w = null;
      if (ua01.o && !ua01.a0()) {
        if (lb0.M(3)) {
          StringBuilder stringBuilder = new StringBuilder("initState called for fragment: ");
          stringBuilder.append(ua01);
          Log.d("FragmentManager", stringBuilder.toString());
        } 
        ua01.X();
        return;
      } 
      ob0 ob0 = (ob0)this.b.g;
      if (ob0.b.containsKey(ua01.h) && ob0.e) {
        bool = ob0.f;
      } else {
        bool = true;
      } 
      if (bool) {
        if (lb0.M(3)) {
          StringBuilder stringBuilder = new StringBuilder("initState called for fragment: ");
          stringBuilder.append(ua01);
          Log.d("FragmentManager", stringBuilder.toString());
        } 
        ua01.X();
        return;
      } 
      return;
    } 
    throw new AndroidRuntimeException(x41.j(oXrNDUqUkE.ewpM, ua01, " did not call through to super.onDetach()"));
  }
  
  public final void j() {
    ua0 ua01 = this.c;
    if (ua01.q && ua01.r && !ua01.u) {
      if (lb0.M(3)) {
        StringBuilder stringBuilder = new StringBuilder("moveto CREATE_VIEW: ");
        stringBuilder.append(ua01);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      Bundle bundle = ua01.c;
      View view2 = null;
      if (bundle != null) {
        bundle = bundle.getBundle("savedInstanceState");
      } else {
        bundle = null;
      } 
      LayoutInflater layoutInflater = ua01.k0(bundle);
      ua01.P = layoutInflater;
      ua01.s0(layoutInflater, null, bundle);
      View view1 = ua01.K;
      if (view1 != null) {
        Bundle bundle1;
        view1.setSaveFromParentEnabled(false);
        ua01.K.setTag(2131296752, ua01);
        if (ua01.D)
          ua01.K.setVisibility(8); 
        Bundle bundle2 = ua01.c;
        view1 = view2;
        if (bundle2 != null)
          bundle1 = bundle2.getBundle("savedInstanceState"); 
        ua01.q0(bundle1);
        ua01.y.u(2);
        this.a.q(ua01, ua01.K, false);
        ua01.b = 2;
      } 
    } 
  }
  
  public final void k() {
    n2 n21 = this.b;
    boolean bool = this.d;
    null = this.c;
    if (bool) {
      if (lb0.M(2)) {
        StringBuilder stringBuilder = new StringBuilder("Ignoring re-entrant call to moveToExpectedState() for ");
        stringBuilder.append(null);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      return;
    } 
    try {
      this.d = true;
      int i = 0;
      while (true) {
        IllegalArgumentException illegalArgumentException;
        StringBuilder stringBuilder;
        int k = d();
        int j = null.b;
        byte b = 3;
        if (k != j) {
          if (k > j) {
            switch (j + 1) {
              case 7:
                n();
                break;
              case 6:
                null.b = 6;
                break;
              case 5:
                q();
                break;
              case 4:
                if (null.K != null) {
                  ViewGroup viewGroup = null.J;
                  if (viewGroup != null) {
                    jx jx = jx.i(viewGroup, null.R());
                    i = null.K.getVisibility();
                    if (i != 0) {
                      if (i != 4) {
                        if (i == 8) {
                          i = b;
                        } else {
                          illegalArgumentException = new IllegalArgumentException();
                          stringBuilder = new StringBuilder();
                          this(LHyji.DCwmlHIQRoKwN);
                          stringBuilder.append(i);
                          this(stringBuilder.toString());
                          throw illegalArgumentException;
                        } 
                      } else {
                        i = 4;
                      } 
                    } else {
                      i = 2;
                    } 
                    if (lb0.M(2)) {
                      StringBuilder stringBuilder1 = new StringBuilder();
                      this("SpecialEffectsController: Enqueuing add operation for fragment ");
                      stringBuilder1.append(illegalArgumentException);
                      Log.v("FragmentManager", stringBuilder1.toString());
                    } 
                    jx.d(i, 2, this);
                  } 
                } 
                ((ua0)illegalArgumentException).b = 4;
                break;
              case 3:
                a();
                break;
              case 2:
                j();
                f();
                break;
              case 1:
                e();
                break;
              case 0:
                c();
                break;
            } 
          } else {
            switch (j - 1) {
              case 6:
                l();
                break;
              case 5:
                ((ua0)illegalArgumentException).b = 5;
                break;
              case 4:
                r();
                break;
              case 3:
                if (lb0.M(3)) {
                  StringBuilder stringBuilder1 = new StringBuilder();
                  this();
                  stringBuilder1.append("movefrom ACTIVITY_CREATED: ");
                  stringBuilder1.append(illegalArgumentException);
                  Log.d("FragmentManager", stringBuilder1.toString());
                } 
                if (((ua0)illegalArgumentException).K != null && ((ua0)illegalArgumentException).e == null)
                  p(); 
                if (((ua0)illegalArgumentException).K != null) {
                  ViewGroup viewGroup = ((ua0)illegalArgumentException).J;
                  if (viewGroup != null) {
                    jx jx = jx.i(viewGroup, illegalArgumentException.R());
                    if (lb0.M(2)) {
                      StringBuilder stringBuilder1 = new StringBuilder();
                      this("SpecialEffectsController: Enqueuing remove operation for fragment ");
                      stringBuilder1.append(illegalArgumentException);
                      Log.v("FragmentManager", stringBuilder1.toString());
                    } 
                    jx.d(1, 3, this);
                  } 
                } 
                ((ua0)illegalArgumentException).b = 3;
                break;
              case 2:
                ((ua0)illegalArgumentException).r = false;
                ((ua0)illegalArgumentException).b = 2;
                break;
              case 1:
                h();
                ((ua0)illegalArgumentException).b = 1;
                break;
              case 0:
                g();
                break;
              case -1:
                i();
                break;
            } 
          } 
          i = 1;
          continue;
        } 
        if (i == 0 && j == -1 && ((ua0)illegalArgumentException).o && !illegalArgumentException.a0()) {
          if (lb0.M(3)) {
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("Cleaning up state of never attached fragment: ");
            stringBuilder1.append(illegalArgumentException);
            Log.d("FragmentManager", stringBuilder1.toString());
          } 
          ((ob0)((n2)stringBuilder).g).e((ua0)illegalArgumentException, true);
          stringBuilder.C(this);
          if (lb0.M(3)) {
            stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("initState called for fragment: ");
            stringBuilder.append(illegalArgumentException);
            Log.d("FragmentManager", stringBuilder.toString());
          } 
          illegalArgumentException.X();
        } 
        if (((ua0)illegalArgumentException).O) {
          if (((ua0)illegalArgumentException).K != null) {
            ViewGroup viewGroup = ((ua0)illegalArgumentException).J;
            if (viewGroup != null) {
              jx jx = jx.i(viewGroup, illegalArgumentException.R());
              if (((ua0)illegalArgumentException).D) {
                if (lb0.M(2)) {
                  StringBuilder stringBuilder1 = new StringBuilder();
                  this("SpecialEffectsController: Enqueuing hide operation for fragment ");
                  stringBuilder1.append(illegalArgumentException);
                  Log.v("FragmentManager", stringBuilder1.toString());
                } 
                jx.d(3, 1, this);
              } else {
                if (lb0.M(2)) {
                  StringBuilder stringBuilder1 = new StringBuilder();
                  this("SpecialEffectsController: Enqueuing show operation for fragment ");
                  stringBuilder1.append(illegalArgumentException);
                  Log.v("FragmentManager", stringBuilder1.toString());
                } 
                jx.d(2, 1, this);
              } 
            } 
          } 
          lb0 lb0 = ((ua0)illegalArgumentException).w;
          if (lb0 != null && ((ua0)illegalArgumentException).n && lb0.N((ua0)illegalArgumentException))
            lb0.G = true; 
          ((ua0)illegalArgumentException).O = false;
          ((ua0)illegalArgumentException).y.o();
        } 
        return;
      } 
    } finally {
      this.d = false;
    } 
  }
  
  public final void l() {
    boolean bool = lb0.M(3);
    ua0 ua01 = this.c;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder("movefrom RESUMED: ");
      stringBuilder.append(ua01);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    ua01.y.u(5);
    if (ua01.K != null)
      ua01.U.a(om0.ON_PAUSE); 
    ua01.T.e(om0.ON_PAUSE);
    ua01.b = 6;
    ua01.I = false;
    ua01.l0();
    if (ua01.I) {
      this.a.j(ua01, false);
      return;
    } 
    throw new AndroidRuntimeException(x41.j("Fragment ", ua01, " did not call through to super.onPause()"));
  }
  
  public final void m(ClassLoader paramClassLoader) {
    ua0 ua01 = this.c;
    Bundle bundle = ua01.c;
    if (bundle != null) {
      bundle.setClassLoader(paramClassLoader);
      if (ua01.c.getBundle("savedInstanceState") == null)
        ua01.c.putBundle("savedInstanceState", new Bundle()); 
      try {
        ua01.e = ua01.c.getSparseParcelableArray("viewState");
        ua01.f = ua01.c.getBundle("viewRegistryState");
        rb0 rb0 = (rb0)ua01.c.getParcelable("state");
        if (rb0 != null) {
          ua01.k = rb0.o;
          ua01.l = rb0.p;
          Boolean bool = ua01.g;
          if (bool != null) {
            ua01.M = bool.booleanValue();
            ua01.g = null;
          } else {
            ua01.M = rb0.q;
          } 
        } 
        if (!ua01.M)
          ua01.L = true; 
        return;
      } catch (BadParcelableException badParcelableException) {
        StringBuilder stringBuilder = new StringBuilder("Failed to restore view hierarchy state for fragment ");
        stringBuilder.append(ua01);
        throw new IllegalStateException(stringBuilder.toString(), badParcelableException);
      } 
    } 
  }
  
  public final void n() {
    // Byte code:
    //   0: iconst_3
    //   1: invokestatic M : (I)Z
    //   4: istore_1
    //   5: aload_0
    //   6: getfield c : Lua0;
    //   9: astore #4
    //   11: iload_1
    //   12: ifeq -> 43
    //   15: new java/lang/StringBuilder
    //   18: dup
    //   19: ldc_w 'moveto RESUMED: '
    //   22: invokespecial <init> : (Ljava/lang/String;)V
    //   25: astore_2
    //   26: aload_2
    //   27: aload #4
    //   29: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: ldc 'FragmentManager'
    //   35: aload_2
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   42: pop
    //   43: aload #4
    //   45: getfield N : Lsa0;
    //   48: astore_2
    //   49: aload_2
    //   50: ifnonnull -> 58
    //   53: aconst_null
    //   54: astore_2
    //   55: goto -> 63
    //   58: aload_2
    //   59: getfield k : Landroid/view/View;
    //   62: astore_2
    //   63: aload_2
    //   64: ifnull -> 214
    //   67: aload_2
    //   68: aload #4
    //   70: getfield K : Landroid/view/View;
    //   73: if_acmpne -> 79
    //   76: goto -> 97
    //   79: aload_2
    //   80: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   83: astore_3
    //   84: aload_3
    //   85: ifnull -> 214
    //   88: aload_3
    //   89: aload #4
    //   91: getfield K : Landroid/view/View;
    //   94: if_acmpne -> 204
    //   97: aload_2
    //   98: invokevirtual requestFocus : ()Z
    //   101: istore_1
    //   102: iconst_2
    //   103: invokestatic M : (I)Z
    //   106: ifeq -> 214
    //   109: new java/lang/StringBuilder
    //   112: dup
    //   113: ldc_w 'requestFocus: Restoring focused view '
    //   116: invokespecial <init> : (Ljava/lang/String;)V
    //   119: astore_3
    //   120: aload_3
    //   121: aload_2
    //   122: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload_3
    //   127: ldc_w ' '
    //   130: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: iload_1
    //   135: ifeq -> 145
    //   138: ldc_w 'succeeded'
    //   141: astore_2
    //   142: goto -> 149
    //   145: ldc_w 'failed'
    //   148: astore_2
    //   149: aload_3
    //   150: aload_2
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload_3
    //   156: getstatic android/support/v4/graphics/drawable/uUq/IGBYXeDFmKYajx.OuB : Ljava/lang/String;
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload_3
    //   164: aload #4
    //   166: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload_3
    //   171: ldc_w ' resulting in focused view '
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload_3
    //   179: aload #4
    //   181: getfield K : Landroid/view/View;
    //   184: invokevirtual findFocus : ()Landroid/view/View;
    //   187: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   190: pop
    //   191: ldc 'FragmentManager'
    //   193: aload_3
    //   194: invokevirtual toString : ()Ljava/lang/String;
    //   197: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   200: pop
    //   201: goto -> 214
    //   204: aload_3
    //   205: invokeinterface getParent : ()Landroid/view/ViewParent;
    //   210: astore_3
    //   211: goto -> 84
    //   214: aload #4
    //   216: invokevirtual L : ()Lsa0;
    //   219: aconst_null
    //   220: putfield k : Landroid/view/View;
    //   223: aload #4
    //   225: getfield y : Llb0;
    //   228: invokevirtual S : ()V
    //   231: aload #4
    //   233: getfield y : Llb0;
    //   236: iconst_1
    //   237: invokevirtual z : (Z)Z
    //   240: pop
    //   241: aload #4
    //   243: bipush #7
    //   245: putfield b : I
    //   248: aload #4
    //   250: iconst_0
    //   251: putfield I : Z
    //   254: aload #4
    //   256: invokevirtual m0 : ()V
    //   259: aload #4
    //   261: getfield I : Z
    //   264: ifeq -> 375
    //   267: aload #4
    //   269: getfield T : Lwm0;
    //   272: astore_3
    //   273: getstatic om0.ON_RESUME : Lom0;
    //   276: astore_2
    //   277: aload_3
    //   278: aload_2
    //   279: invokevirtual e : (Lom0;)V
    //   282: aload #4
    //   284: getfield K : Landroid/view/View;
    //   287: ifnull -> 302
    //   290: aload #4
    //   292: getfield U : Lwb0;
    //   295: getfield f : Lwm0;
    //   298: aload_2
    //   299: invokevirtual e : (Lom0;)V
    //   302: aload #4
    //   304: getfield y : Llb0;
    //   307: astore_2
    //   308: aload_2
    //   309: iconst_0
    //   310: putfield H : Z
    //   313: aload_2
    //   314: iconst_0
    //   315: putfield I : Z
    //   318: aload_2
    //   319: getfield O : Lob0;
    //   322: iconst_0
    //   323: putfield g : Z
    //   326: aload_2
    //   327: bipush #7
    //   329: invokevirtual u : (I)V
    //   332: aload_0
    //   333: getfield a : Lg7;
    //   336: aload #4
    //   338: iconst_0
    //   339: invokevirtual m : (Lua0;Z)V
    //   342: aload_0
    //   343: getfield b : Ln2;
    //   346: aload #4
    //   348: getfield h : Ljava/lang/String;
    //   351: aconst_null
    //   352: invokevirtual I : (Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    //   355: pop
    //   356: aload #4
    //   358: aconst_null
    //   359: putfield c : Landroid/os/Bundle;
    //   362: aload #4
    //   364: aconst_null
    //   365: putfield e : Landroid/util/SparseArray;
    //   368: aload #4
    //   370: aconst_null
    //   371: putfield f : Landroid/os/Bundle;
    //   374: return
    //   375: new android/util/AndroidRuntimeException
    //   378: dup
    //   379: ldc 'Fragment '
    //   381: aload #4
    //   383: ldc_w ' did not call through to super.onResume()'
    //   386: invokestatic j : (Ljava/lang/String;Lua0;Ljava/lang/String;)Ljava/lang/String;
    //   389: invokespecial <init> : (Ljava/lang/String;)V
    //   392: athrow
  }
  
  public final Bundle o() {
    Bundle bundle1 = new Bundle();
    ua0 ua01 = this.c;
    if (ua01.b == -1) {
      Bundle bundle = ua01.c;
      if (bundle != null)
        bundle1.putAll(bundle); 
    } 
    bundle1.putParcelable("state", new rb0(ua01));
    if (ua01.b > 0) {
      Bundle bundle4 = new Bundle();
      ua01.n0(bundle4);
      if (!bundle4.isEmpty())
        bundle1.putBundle("savedInstanceState", bundle4); 
      this.a.n(ua01, bundle4, false);
      bundle4 = new Bundle();
      ua01.W.u(bundle4);
      if (!bundle4.isEmpty())
        bundle1.putBundle("registryState", bundle4); 
      bundle4 = ua01.y.a0();
      if (!bundle4.isEmpty())
        bundle1.putBundle("childFragmentManager", bundle4); 
      if (ua01.K != null)
        p(); 
      SparseArray sparseArray = ua01.e;
      if (sparseArray != null)
        bundle1.putSparseParcelableArray("viewState", sparseArray); 
      Bundle bundle3 = ua01.f;
      if (bundle3 != null)
        bundle1.putBundle("viewRegistryState", bundle3); 
    } 
    Bundle bundle2 = ua01.i;
    if (bundle2 != null)
      bundle1.putBundle("arguments", bundle2); 
    return bundle1;
  }
  
  public final void p() {
    ua0 ua01 = this.c;
    if (ua01.K != null) {
      if (lb0.M(2)) {
        StringBuilder stringBuilder = new StringBuilder("Saving view state for fragment ");
        stringBuilder.append(ua01);
        stringBuilder.append(" with view ");
        stringBuilder.append(ua01.K);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      SparseArray sparseArray = new SparseArray();
      ua01.K.saveHierarchyState(sparseArray);
      if (sparseArray.size() > 0)
        ua01.e = sparseArray; 
      Bundle bundle = new Bundle();
      ua01.U.g.u(bundle);
      if (!bundle.isEmpty())
        ua01.f = bundle; 
    } 
  }
  
  public final void q() {
    boolean bool = lb0.M(3);
    ua0 ua01 = this.c;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder("moveto STARTED: ");
      stringBuilder.append(ua01);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    ua01.y.S();
    ua01.y.z(true);
    ua01.b = 5;
    ua01.I = false;
    ua01.o0();
    if (ua01.I) {
      wm0 wm0 = ua01.T;
      om0 om0 = om0.ON_START;
      wm0.e(om0);
      if (ua01.K != null)
        ua01.U.f.e(om0); 
      lb0 lb0 = ua01.y;
      lb0.H = false;
      lb0.I = false;
      lb0.O.g = false;
      lb0.u(5);
      this.a.o(ua01, false);
      return;
    } 
    throw new AndroidRuntimeException(x41.j("Fragment ", ua01, " did not call through to super.onStart()"));
  }
  
  public final void r() {
    boolean bool = lb0.M(3);
    ua0 ua01 = this.c;
    if (bool) {
      StringBuilder stringBuilder = new StringBuilder("movefrom STARTED: ");
      stringBuilder.append(ua01);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    lb0 lb0 = ua01.y;
    lb0.I = true;
    lb0.O.g = true;
    lb0.u(4);
    if (ua01.K != null)
      ua01.U.a(om0.ON_STOP); 
    ua01.T.e(om0.ON_STOP);
    ua01.b = 4;
    ua01.I = false;
    ua01.p0();
    if (ua01.I) {
      this.a.p(ua01, false);
      return;
    } 
    throw new AndroidRuntimeException(x41.j("Fragment ", ua01, " did not call through to super.onStop()"));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */