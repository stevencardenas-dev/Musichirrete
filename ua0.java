import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public abstract class ua0 implements ui1, View.OnCreateContextMenuListener, ComponentCallbacks, um0, l32, kf0 {
  public static final Object Z = new Object();
  
  public int A;
  
  public int B;
  
  public String C;
  
  public boolean D;
  
  public boolean E;
  
  public boolean F;
  
  public boolean G;
  
  public boolean H = true;
  
  public boolean I;
  
  public ViewGroup J;
  
  public View K;
  
  public boolean L;
  
  public boolean M = true;
  
  public sa0 N;
  
  public boolean O;
  
  public LayoutInflater P;
  
  public boolean Q;
  
  public String R;
  
  public pm0 S;
  
  public wm0 T;
  
  public wb0 U;
  
  public final vz0 V;
  
  public j01 W;
  
  public final ArrayList X;
  
  public final qa0 Y;
  
  public int b = -1;
  
  public Bundle c;
  
  public SparseArray e;
  
  public Bundle f;
  
  public Boolean g;
  
  public String h = UUID.randomUUID().toString();
  
  public Bundle i;
  
  public ua0 j;
  
  public String k = null;
  
  public int l;
  
  public Boolean m = null;
  
  public boolean n;
  
  public boolean o;
  
  public boolean p;
  
  public boolean q;
  
  public boolean r;
  
  public boolean s;
  
  public boolean t;
  
  public boolean u;
  
  public int v;
  
  public lb0 w;
  
  public wa0 x;
  
  public lb0 y = new lb0();
  
  public ua0 z;
  
  public ua0() {
    new e3(13, this);
    this.S = pm0.g;
    this.V = new vz0();
    new AtomicInteger();
    this.X = new ArrayList();
    this.Y = new qa0(this);
    W();
  }
  
  public final void A0(boolean paramBoolean) {
    tb0 tb0 = ub0.a;
    StringBuilder stringBuilder = new StringBuilder(hrSTyFuSIm.CuJPMBcbl);
    stringBuilder.append(paramBoolean);
    stringBuilder.append(" for fragment ");
    stringBuilder.append(this);
    ub0.b(new l42(this, stringBuilder.toString()));
    ub0.a(this).getClass();
    boolean bool = this.M;
    boolean bool1 = false;
    if (!bool && paramBoolean && this.b < 5 && this.w != null && Y() && this.Q) {
      lb0 lb01 = this.w;
      sb0 sb0 = lb01.g(this);
      ua0 ua01 = sb0.c;
      if (ua01.L)
        if (lb01.b) {
          lb01.K = true;
        } else {
          ua01.L = false;
          sb0.k();
        }  
    } 
    this.M = paramBoolean;
    bool = bool1;
    if (this.b < 5) {
      bool = bool1;
      if (!paramBoolean)
        bool = true; 
    } 
    this.L = bool;
    if (this.c != null)
      this.g = Boolean.valueOf(paramBoolean); 
  }
  
  public final void B0(Intent paramIntent) {
    wa0 wa01 = this.x;
    if (wa01 != null) {
      paramIntent.getClass();
      wa01.l.startActivity(paramIntent, null);
      return;
    } 
    tp.f(x41.j("Fragment ", this, " not attached to Activity"));
  }
  
  public final void C0(Intent paramIntent, int paramInt) {
    if (this.x != null) {
      lb0 lb01 = R();
      if (lb01.C != null) {
        String str = this.h;
        Object object = new Object();
        ((hb0)object).b = str;
        ((hb0)object).c = paramInt;
        lb01.F.addLast(object);
        lb01.C.S0((Parcelable)paramIntent);
        return;
      } 
      wa0 wa01 = lb01.w;
      wa01.getClass();
      paramIntent.getClass();
      if (paramInt == -1) {
        wa01.l.startActivity(paramIntent, null);
        return;
      } 
      tp.f("Starting activity with a requestCode requires a FragmentActivity host");
      return;
    } 
    tp.f(x41.j("Fragment ", this, " not attached to Activity"));
  }
  
  public final k32 H() {
    if (this.w != null) {
      if (Q() != 1) {
        HashMap<String, k32> hashMap = this.w.O.d;
        k32 k322 = (k32)hashMap.get(this.h);
        k32 k321 = k322;
        if (k322 == null) {
          k321 = new k32();
          hashMap.put(this.h, k321);
        } 
        return k321;
      } 
      tp.f("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
      return null;
    } 
    tp.f("Can't access ViewModels from detached fragment");
    return null;
  }
  
  public qz1 K() {
    return new ra0(this);
  }
  
  public final sa0 L() {
    if (this.N == null) {
      Object object2 = new Object();
      Object object1 = Z;
      ((sa0)object2).g = object1;
      ((sa0)object2).h = object1;
      ((sa0)object2).i = object1;
      ((sa0)object2).j = 1.0F;
      ((sa0)object2).k = null;
      this.N = (sa0)object2;
    } 
    return this.N;
  }
  
  public final x5 M() {
    wa0 wa01 = this.x;
    return (wa01 == null) ? null : wa01.k;
  }
  
  public final wm0 N() {
    return this.T;
  }
  
  public final lb0 O() {
    if (this.x != null)
      return this.y; 
    tp.f(x41.j("Fragment ", this, " has not been attached yet."));
    return null;
  }
  
  public final Context P() {
    wa0 wa01 = this.x;
    return (Context)((wa01 == null) ? null : wa01.l);
  }
  
  public final int Q() {
    pm0 pm01 = this.S;
    return (pm01 == pm0.c || this.z == null) ? pm01.ordinal() : Math.min(pm01.ordinal(), this.z.Q());
  }
  
  public final lb0 R() {
    lb0 lb01 = this.w;
    if (lb01 != null)
      return lb01; 
    tp.f(x41.j("Fragment ", this, " not associated with a fragment manager."));
    return null;
  }
  
  public final Resources S() {
    return u0().getResources();
  }
  
  public final String T(int paramInt) {
    return S().getString(paramInt);
  }
  
  public final String U(int paramInt, Object... paramVarArgs) {
    return S().getString(paramInt, paramVarArgs);
  }
  
  public final ua0 V(boolean paramBoolean) {
    if (paramBoolean) {
      tb0 tb0 = ub0.a;
      StringBuilder stringBuilder = new StringBuilder("Attempting to get target fragment from fragment ");
      stringBuilder.append(this);
      ub0.b(new l42(this, stringBuilder.toString()));
      ub0.a(this).getClass();
    } 
    ua0 ua01 = this.j;
    if (ua01 != null)
      return ua01; 
    lb0 lb01 = this.w;
    if (lb01 != null) {
      String str = this.k;
      if (str != null)
        return lb01.c.q(str); 
    } 
    return null;
  }
  
  public final void W() {
    this.T = new wm0(this);
    this.W = new j01(new ti1(this, new pp(7, this)));
    ArrayList arrayList = this.X;
    qa0 qa01 = this.Y;
    if (!arrayList.contains(qa01)) {
      Bundle<ua0> bundle;
      ua0 ua01;
      if (this.b >= 0) {
        ua01 = qa01.a;
        ua01.W.s();
        ui0.s(ua01);
        bundle = ua01.c;
        if (bundle != null) {
          bundle = bundle.getBundle("registryState");
        } else {
          bundle = null;
        } 
        ua01.W.t(bundle);
        return;
      } 
      bundle.add(ua01);
    } 
  }
  
  public final void X() {
    W();
    this.R = this.h;
    this.h = UUID.randomUUID().toString();
    this.n = false;
    this.o = false;
    this.q = false;
    this.r = false;
    this.t = false;
    this.v = 0;
    this.w = null;
    this.y = new lb0();
    this.x = null;
    this.A = 0;
    this.B = 0;
    this.C = null;
    this.D = false;
    this.E = false;
  }
  
  public final boolean Y() {
    return (this.x != null && this.n);
  }
  
  public final boolean Z() {
    if (!this.D) {
      lb0 lb01 = this.w;
      if (lb01 != null) {
        boolean bool;
        ua0 ua01 = this.z;
        lb01.getClass();
        if (ua01 == null) {
          bool = false;
        } else {
          bool = ua01.Z();
        } 
        if (bool)
          return true; 
      } 
      return false;
    } 
    return true;
  }
  
  public final boolean a0() {
    return (this.v > 0);
  }
  
  public void b0(Bundle paramBundle) {
    this.I = true;
  }
  
  public void c0(int paramInt1, int paramInt2, Intent paramIntent) {
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("Fragment ");
      stringBuilder.append(this);
      stringBuilder.append(" received the following in onActivityResult(): requestCode: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" resultCode: ");
      stringBuilder.append(paramInt2);
      stringBuilder.append(" data: ");
      stringBuilder.append(paramIntent);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public void d0(Activity paramActivity) {
    this.I = true;
  }
  
  public void e0(Context paramContext) {
    x5 x5;
    this.I = true;
    wa0 wa01 = this.x;
    if (wa01 == null) {
      wa01 = null;
    } else {
      x5 = wa01.k;
    } 
    if (x5 != null) {
      this.I = false;
      d0(x5);
    } 
  }
  
  public final boolean equals(Object paramObject) {
    return !(this != paramObject);
  }
  
  public void f0(Bundle paramBundle) {
    this.I = true;
    paramBundle = this.c;
    if (paramBundle != null) {
      paramBundle = paramBundle.getBundle("childFragmentManager");
      if (paramBundle != null) {
        this.y.Z(paramBundle);
        lb0 lb02 = this.y;
        lb02.H = false;
        lb02.I = false;
        lb02.O.g = false;
        lb02.u(1);
      } 
    } 
    lb0 lb01 = this.y;
    if (lb01.v >= 1)
      return; 
    lb01.H = false;
    lb01.I = false;
    lb01.O.g = false;
    lb01.u(1);
  }
  
  public View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    return null;
  }
  
  public final j01 h() {
    return (j01)this.W.e;
  }
  
  public void h0() {
    this.I = true;
  }
  
  public void i0() {
    this.I = true;
  }
  
  public void j0() {
    this.I = true;
  }
  
  public LayoutInflater k0(Bundle paramBundle) {
    wa0 wa01 = this.x;
    if (wa01 != null) {
      x5 x5 = wa01.o;
      LayoutInflater layoutInflater = x5.getLayoutInflater().cloneInContext((Context)x5);
      layoutInflater.setFactory2(this.y.f);
      return layoutInflater;
    } 
    tp.f("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    return null;
  }
  
  public void l0() {
    this.I = true;
  }
  
  public void m0() {
    this.I = true;
  }
  
  public void n0(Bundle paramBundle) {}
  
  public void o0() {
    this.I = true;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    this.I = true;
  }
  
  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo) {
    t0().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public final void onLowMemory() {
    this.I = true;
  }
  
  public void p0() {
    this.I = true;
  }
  
  public void q0(Bundle paramBundle) {}
  
  public void r0(Bundle paramBundle) {
    this.I = true;
  }
  
  public void s0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view1;
    this.y.S();
    this.u = true;
    this.U = new wb0(this, H(), new e(19, this));
    View view2 = g0(paramLayoutInflater, paramViewGroup, paramBundle);
    this.K = view2;
    wb0 wb01 = this.U;
    if (view2 != null) {
      wb01.b();
      if (lb0.M(3)) {
        StringBuilder stringBuilder = new StringBuilder("Setting ViewLifecycleOwner on View ");
        stringBuilder.append(this.K);
        stringBuilder.append(" for Fragment ");
        stringBuilder.append(this);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      view2 = this.K;
      wb01 = this.U;
      view2.getClass();
      view2.setTag(2131297954, wb01);
      view2 = this.K;
      wb01 = this.U;
      view2.getClass();
      view2.setTag(2131297958, wb01);
      view1 = this.K;
      wb0 wb02 = this.U;
      view1.getClass();
      view1.setTag(2131297957, wb02);
      this.V.e(this.U);
      return;
    } 
    if (((wb0)view1).f == null) {
      this.U = null;
      return;
    } 
    tp.f("Called getViewLifecycleOwner() but onCreateView() returned null");
  }
  
  public final x5 t0() {
    x5 x5 = M();
    if (x5 != null)
      return x5; 
    tp.f(x41.j("Fragment ", this, " not attached to an activity."));
    return null;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append("{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append("} (");
    stringBuilder.append(this.h);
    if (this.A != 0) {
      stringBuilder.append(" id=0x");
      stringBuilder.append(Integer.toHexString(this.A));
    } 
    if (this.C != null) {
      stringBuilder.append(" tag=");
      stringBuilder.append(this.C);
    } 
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public final Context u0() {
    Context context = P();
    if (context != null)
      return context; 
    tp.f(x41.j("Fragment ", this, " not attached to a context."));
    return null;
  }
  
  public final View v0() {
    View view = this.K;
    if (view != null)
      return view; 
    tp.f(x41.j("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    return null;
  }
  
  public final void w0(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.N == null && paramInt1 == 0 && paramInt2 == 0 && paramInt3 == 0 && paramInt4 == 0)
      return; 
    (L()).b = paramInt1;
    (L()).c = paramInt2;
    (L()).d = paramInt3;
    (L()).e = paramInt4;
  }
  
  public final void x0(Bundle paramBundle) {
    lb0 lb01 = this.w;
    if (lb01 == null || (!lb01.H && !lb01.I)) {
      this.i = paramBundle;
      return;
    } 
    tp.f("Fragment already added and state has been saved");
  }
  
  public final uz0 y() {
    Context context = u0().getApplicationContext();
    while (true) {
      if (context instanceof ContextWrapper) {
        Application application;
        if (context instanceof Application) {
          application = (Application)context;
          break;
        } 
        Context context1 = ((ContextWrapper)application).getBaseContext();
        continue;
      } 
      context = null;
      break;
    } 
    if (context == null && lb0.M(3)) {
      StringBuilder stringBuilder = new StringBuilder("Could not find Application instance from Context ");
      stringBuilder.append(u0().getApplicationContext());
      stringBuilder.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    uz0 uz0 = new uz0(0);
    LinkedHashMap<fb0, Context> linkedHashMap = uz0.a;
    if (context != null)
      linkedHashMap.put(i32.j, context); 
    linkedHashMap.put(ui0.f, this);
    linkedHashMap.put(ui0.g, this);
    Bundle bundle = this.i;
    if (bundle != null)
      linkedHashMap.put(ui0.h, bundle); 
    return uz0;
  }
  
  public final void y0() {
    tb0 tb0 = ub0.a;
    StringBuilder stringBuilder = new StringBuilder("Attempting to set retain instance for fragment ");
    stringBuilder.append(this);
    ub0.b(new l42(this, stringBuilder.toString()));
    ub0.a(this).getClass();
    this.F = false;
    lb0 lb01 = this.w;
    if (lb01 != null) {
      lb01.O.h(this);
      return;
    } 
    this.G = true;
  }
  
  public final void z0(ua0 paramua0) {
    lb0 lb01;
    if (paramua0 != null) {
      tb0 tb0 = ub0.a;
      lb01 = (lb0)new StringBuilder("Attempting to set target fragment ");
      lb01.append(paramua0);
      lb01.append(" with request code 0 for fragment ");
      lb01.append(this);
      ub0.b(new l42(this, lb01.toString()));
      ub0.a(this).getClass();
    } 
    lb0 lb02 = this.w;
    if (paramua0 != null) {
      lb01 = paramua0.w;
    } else {
      lb01 = null;
    } 
    if (lb02 == null || lb01 == null || lb02 == lb01) {
      ua0 ua01 = paramua0;
      while (ua01 != null) {
        if (ua01 != this) {
          ua01 = ua01.V(false);
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder("Setting ");
        stringBuilder.append(paramua0);
        stringBuilder.append(" as the target of ");
        stringBuilder.append(this);
        stringBuilder.append(" would create a target cycle");
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      if (paramua0 == null) {
        this.k = null;
        this.j = null;
      } else if (this.w != null && paramua0.w != null) {
        this.k = paramua0.h;
        this.j = null;
      } else {
        this.k = null;
        this.j = paramua0;
      } 
      this.l = 0;
      return;
    } 
    l0.l(x41.j("Fragment ", paramua0, " must share the same FragmentManager to be set as a target fragment"));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ua0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */