import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public abstract class qo extends po implements l32, kf0, ui1 {
  public final zr e = new zr();
  
  public final p01 f = new p01(new fo(this, 0));
  
  public final j01 g;
  
  public k32 h;
  
  public final mo i;
  
  public final cs1 j;
  
  public final AtomicInteger k;
  
  public final oo l;
  
  public final CopyOnWriteArrayList m;
  
  public final CopyOnWriteArrayList n;
  
  public final CopyOnWriteArrayList o;
  
  public final CopyOnWriteArrayList p;
  
  public final CopyOnWriteArrayList q;
  
  public final CopyOnWriteArrayList r;
  
  public final CopyOnWriteArrayList s;
  
  public boolean t;
  
  public boolean u;
  
  public final cs1 v;
  
  public final cs1 w;
  
  public qo() {
    j01 j011 = new j01(new ti1(this, new pp(7, this)));
    this.g = j011;
    this.i = new mo(this);
    this.j = new cs1(new go(this, 1));
    this.k = new AtomicInteger();
    this.l = new oo(this);
    this.m = new CopyOnWriteArrayList();
    this.n = new CopyOnWriteArrayList();
    this.o = new CopyOnWriteArrayList();
    this.p = new CopyOnWriteArrayList();
    this.q = new CopyOnWriteArrayList();
    this.r = new CopyOnWriteArrayList();
    this.s = new CopyOnWriteArrayList();
    this.v = new cs1(new go(this, 2));
    wm0 wm0 = this.c;
    if (wm0 != null) {
      wm0.a(new io(0, this));
      this.c.a(new io(1, this));
      this.c.a(new gd1(1, this));
      j011.s();
      ui0.s(this);
      j011 = (j01)j011.e;
      jo jo = new jo(0, this);
      j011.x(hrSTyFuSIm.QbQi, jo);
      T(new ko(this, 0));
      this.w = new cs1(new go(this, 4));
      return;
    } 
    tp.f("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    throw null;
  }
  
  public static void R(b41 paramb41, qo paramqo, um0 paramum0, om0 paramom0) {
    if (paramom0 == om0.ON_CREATE) {
      OnBackInvokedDispatcher onBackInvokedDispatcher = paramqo.getOnBackInvokedDispatcher();
      onBackInvokedDispatcher.getClass();
      paramb41.c(onBackInvokedDispatcher);
    } 
  }
  
  public static void S(qo paramqo) {
    try {
      paramqo.onBackPressed();
      return;
    } catch (IllegalStateException illegalStateException) {
      if (!ui0.c(illegalStateException.getMessage(), "Can not perform this action after onSaveInstanceState"))
        throw illegalStateException; 
    } catch (NullPointerException nullPointerException) {
      if (!ui0.c(nullPointerException.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"))
        throw nullPointerException; 
    } 
  }
  
  public final k32 H() {
    if (getApplication() != null) {
      if (this.h == null) {
        lo lo = (lo)getLastNonConfigurationInstance();
        if (lo != null)
          this.h = lo.a; 
        if (this.h == null)
          this.h = new k32(); 
      } 
      k32 k321 = this.h;
      k321.getClass();
      return k321;
    } 
    tp.f("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    return null;
  }
  
  public final wm0 N() {
    return this.c;
  }
  
  public final void T(e41 parame41) {
    zr zr1 = this.e;
    zr1.getClass();
    qo qo1 = zr1.b;
    if (qo1 != null)
      parame41.a(qo1); 
    zr1.a.add(parame41);
  }
  
  public final b41 U() {
    return (b41)this.w.getValue();
  }
  
  public final void V() {
    View view = getWindow().getDecorView();
    view.getClass();
    view.setTag(2131297954, this);
    view = getWindow().getDecorView();
    view.getClass();
    view.setTag(2131297958, this);
    view = getWindow().getDecorView();
    view.getClass();
    view.setTag(2131297957, this);
    view = getWindow().getDecorView();
    view.getClass();
    view.setTag(2131297956, this);
    view = getWindow().getDecorView();
    view.getClass();
    view.setTag(2131297366, this);
    view = getWindow().getDecorView();
    view.getClass();
    view.setTag(2131297955, this);
  }
  
  public final l2 W(f2 paramf2, z51 paramz51) {
    oo oo1 = this.l;
    oo1.getClass();
    StringBuilder stringBuilder2 = new StringBuilder("activity_rq#");
    stringBuilder2.append(this.k.getAndIncrement());
    String str = stringBuilder2.toString();
    LinkedHashMap<String, k2> linkedHashMap = oo1.c;
    wm0 wm0 = this.c;
    if (((pm0<pm0>)wm0.i).compareTo(pm0.f) < 0) {
      oo1.d(str);
      k2 k22 = (k2)linkedHashMap.get(str);
      k2 k21 = k22;
      if (k22 == null)
        k21 = new k2(wm0); 
      h2 h2 = new h2(oo1, str, paramf2, paramz51);
      k21.a.a(h2);
      k21.b.add(h2);
      linkedHashMap.put(str, k21);
      return new l2(oo1, str, paramz51, 0);
    } 
    StringBuilder stringBuilder1 = new StringBuilder("LifecycleOwner ");
    stringBuilder1.append(this);
    pm0 pm0 = (pm0)wm0.i;
    stringBuilder1.append(" is attempting to register while current state is ");
    stringBuilder1.append(pm0);
    stringBuilder1.append(". LifecycleOwners must call register before they are STARTED.");
    throw new IllegalStateException(stringBuilder1.toString().toString());
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    V();
    View view = getWindow().getDecorView();
    view.getClass();
    this.i.a(view);
    super.addContentView(paramView, paramLayoutParams);
  }
  
  public final j01 h() {
    return (j01)this.g.e;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    if (!this.l.a(paramInt1, paramInt2, paramIntent))
      super.onActivityResult(paramInt1, paramInt2, paramIntent); 
  }
  
  public void onBackPressed() {
    ((vz)this.v.getValue()).a();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    paramConfiguration.getClass();
    super.onConfigurationChanged(paramConfiguration);
    Iterator<nr> iterator = this.m.iterator();
    iterator.getClass();
    while (iterator.hasNext())
      ((nr)iterator.next()).accept(paramConfiguration); 
  }
  
  public void onCreate(Bundle paramBundle) {
    this.g.t(paramBundle);
    zr zr1 = this.e;
    zr1.getClass();
    zr1.b = this;
    Iterator<e41> iterator = zr1.a.iterator();
    while (iterator.hasNext())
      ((e41)iterator.next()).a(this); 
    super.onCreate(paramBundle);
    int i = xf1.b;
    vf1.b(this);
    getPackageManager().hasSystemFeature("android.software.picture_in_picture");
  }
  
  public final boolean onCreatePanelMenu(int paramInt, Menu paramMenu) {
    paramMenu.getClass();
    if (paramInt == 0) {
      super.onCreatePanelMenu(paramInt, paramMenu);
      getMenuInflater();
      Iterator iterator = ((CopyOnWriteArrayList)this.f.e).iterator();
      while (iterator.hasNext())
        ((db0)iterator.next()).a.k(); 
    } 
    return true;
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    paramMenuItem.getClass();
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      return true; 
    if (paramInt == 0) {
      Iterator iterator = ((CopyOnWriteArrayList)this.f.e).iterator();
      while (iterator.hasNext()) {
        if (((db0)iterator.next()).a.p())
          return true; 
      } 
    } 
    return false;
  }
  
  public final void onMultiWindowModeChanged(boolean paramBoolean) {
    if (!this.t) {
      Iterator<nr> iterator = this.p.iterator();
      iterator.getClass();
      while (iterator.hasNext())
        ((nr)iterator.next()).accept(new ry0(paramBoolean)); 
    } 
  }
  
  public final void onMultiWindowModeChanged(boolean paramBoolean, Configuration paramConfiguration) {
    paramConfiguration.getClass();
    this.t = true;
    try {
      super.onMultiWindowModeChanged(paramBoolean, paramConfiguration);
      this.t = false;
      Iterator<nr> iterator = this.p.iterator();
      iterator.getClass();
      return;
    } finally {
      this.t = false;
    } 
  }
  
  public void onNewIntent(Intent paramIntent) {
    paramIntent.getClass();
    super.onNewIntent(paramIntent);
    Iterator<nr> iterator = this.o.iterator();
    iterator.getClass();
    while (iterator.hasNext())
      ((nr)iterator.next()).accept(paramIntent); 
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu) {
    paramMenu.getClass();
    Iterator iterator = ((CopyOnWriteArrayList)this.f.e).iterator();
    while (iterator.hasNext())
      ((db0)iterator.next()).a.q(); 
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public final void onPictureInPictureModeChanged(boolean paramBoolean) {
    if (!this.u) {
      Iterator<nr> iterator = this.q.iterator();
      iterator.getClass();
      while (iterator.hasNext())
        ((nr)iterator.next()).accept(new c71(paramBoolean)); 
    } 
  }
  
  public final void onPictureInPictureModeChanged(boolean paramBoolean, Configuration paramConfiguration) {
    paramConfiguration.getClass();
    this.u = true;
    try {
      super.onPictureInPictureModeChanged(paramBoolean, paramConfiguration);
      this.u = false;
      Iterator<nr> iterator = this.q.iterator();
      iterator.getClass();
      return;
    } finally {
      this.u = false;
    } 
  }
  
  public final void onPictureInPictureUiStateChanged(PictureInPictureUiState paramPictureInPictureUiState) {
    paramPictureInPictureUiState.getClass();
    super.onPictureInPictureUiStateChanged(paramPictureInPictureUiState);
    zb0 zb0 = i11.a(paramPictureInPictureUiState);
    Iterator<nr> iterator = this.r.iterator();
    iterator.getClass();
    while (iterator.hasNext())
      ((nr)iterator.next()).accept(zb0); 
  }
  
  public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu) {
    paramMenu.getClass();
    if (paramInt == 0) {
      super.onPreparePanel(paramInt, paramView, paramMenu);
      Iterator iterator = ((CopyOnWriteArrayList)this.f.e).iterator();
      while (iterator.hasNext())
        ((db0)iterator.next()).a.t(); 
    } 
    return true;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    paramArrayOfString.getClass();
    paramArrayOfint.getClass();
    Intent intent = (new Intent()).putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", paramArrayOfint);
    if (!this.l.a(paramInt, -1, intent))
      super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfint); 
  }
  
  public final Object onRetainNonConfigurationInstance() {
    k32 k322 = this.h;
    k32 k321 = k322;
    if (k322 == null) {
      lo lo = (lo)getLastNonConfigurationInstance();
      k321 = k322;
      if (lo != null)
        k321 = lo.a; 
    } 
    if (k321 == null)
      return null; 
    Object object = new Object();
    ((lo)object).a = k321;
    return object;
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {
    paramBundle.getClass();
    wm0 wm0 = this.c;
    if (wm0 != null) {
      wm0.c("setCurrentState");
      wm0.f(pm0.e);
    } 
    super.onSaveInstanceState(paramBundle);
    this.g.u(paramBundle);
  }
  
  public final void onTrimMemory(int paramInt) {
    super.onTrimMemory(paramInt);
    Iterator<nr> iterator = this.n.iterator();
    iterator.getClass();
    while (iterator.hasNext())
      ((nr)iterator.next()).accept(Integer.valueOf(paramInt)); 
  }
  
  public final void onUserLeaveHint() {
    super.onUserLeaveHint();
    Iterator<Runnable> iterator = this.s.iterator();
    iterator.getClass();
    while (iterator.hasNext())
      ((Runnable)iterator.next()).run(); 
  }
  
  public final void reportFullyDrawn() {
    try {
      if (ui0.N())
        Trace.beginSection(ui0.p0("reportFullyDrawn() for ComponentActivity")); 
      super.reportFullyDrawn();
      kc0 kc0 = (kc0)this.j.getValue();
      Object object = kc0.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        kc0.b = true;
        ArrayList<Object> arrayList = kc0.c;
        int i = arrayList.size();
        byte b = 0;
        while (b < i) {
          lc0 lc0 = (lc0)arrayList.get(b);
          b++;
          ((lc0)lc0).a();
        } 
      } finally {
        Exception exception;
      } 
      kc0.c.clear();
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      return;
    } finally {
      Trace.endSection();
    } 
  }
  
  public void setContentView(int paramInt) {
    V();
    View view = getWindow().getDecorView();
    view.getClass();
    this.i.a(view);
    super.setContentView(paramInt);
  }
  
  public void setContentView(View paramView) {
    V();
    View view = getWindow().getDecorView();
    view.getClass();
    this.i.a(view);
    super.setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    V();
    View view = getWindow().getDecorView();
    view.getClass();
    this.i.a(view);
    super.setContentView(paramView, paramLayoutParams);
  }
  
  public final void startActivityForResult(Intent paramIntent, int paramInt) {
    paramIntent.getClass();
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  public final void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle) {
    paramIntent.getClass();
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  public final void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4) {
    paramIntentSender.getClass();
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
  
  public final void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle) {
    paramIntentSender.getClass();
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public final uz0 y() {
    uz0 uz0 = new uz0(0);
    Application application = getApplication();
    LinkedHashMap<fb0, Application> linkedHashMap = uz0.a;
    if (application != null)
      linkedHashMap.put(i32.j, getApplication()); 
    linkedHashMap.put(ui0.f, this);
    linkedHashMap.put(ui0.g, this);
    Intent intent = getIntent();
    if (intent != null) {
      Bundle bundle = intent.getExtras();
    } else {
      intent = null;
    } 
    if (intent != null)
      linkedHashMap.put(ui0.h, intent); 
    return uz0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */