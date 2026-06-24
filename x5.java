import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class x5 extends qo implements y5 {
  public boolean A;
  
  public boolean B = true;
  
  public u6 C;
  
  public final gh1 x = new gh1(27, new wa0(this));
  
  public final wm0 y = new wm0(this);
  
  public boolean z;
  
  public x5() {
    ((j01)this.g.e).x("android:support:lifecycle", new jo(1, this));
    va0 va0 = new va0(this, 0);
    this.m.add(va0);
    va0 = new va0(this, 1);
    this.o.add(va0);
    T(new ko(this, 1));
  }
  
  public static boolean a0(lb0 paramlb0) {
    Iterator<ua0> iterator = paramlb0.c.v().iterator();
    boolean bool = false;
    while (iterator.hasNext()) {
      x5 x51;
      ua0 ua0 = iterator.next();
      if (ua0 == null)
        continue; 
      wa0 wa0 = ua0.x;
      if (wa0 == null) {
        wa0 = null;
      } else {
        x51 = wa0.o;
      } 
      boolean bool1 = bool;
      if (x51 != null)
        bool1 = bool | a0(ua0.O()); 
      wb0 wb0 = ua0.U;
      pm0 pm01 = pm0.e;
      pm0 pm02 = pm0.f;
      bool = bool1;
      if (wb0 != null) {
        bool = bool1;
        if (((pm0<pm0>)(wb0.N()).i).compareTo(pm02) >= 0) {
          wm0 wm01 = ua0.U.f;
          wm01.c("setCurrentState");
          wm01.f(pm01);
          bool = true;
        } 
      } 
      if (((pm0<pm0>)ua0.T.i).compareTo(pm02) >= 0) {
        wm0 wm01 = ua0.T;
        wm01.c("setCurrentState");
        wm01.f(pm01);
        bool = true;
      } 
    } 
    return bool;
  }
  
  public final g6 X() {
    if (this.C == null) {
      tk1 tk1 = g6.b;
      this.C = new u6((Context)this, null, this, this);
    } 
    return this.C;
  }
  
  public final ui0 Y() {
    u6 u61 = (u6)X();
    u61.A();
    return u61.p;
  }
  
  public final lb0 Z() {
    return ((wa0)this.x.c).n;
  }
  
  public final void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    V();
    u6 u61 = (u6)X();
    u61.w();
    ((ViewGroup)u61.C.findViewById(16908290)).addView(paramView, paramLayoutParams);
    u61.o.a(u61.n.getCallback());
  }
  
  public void attachBaseContext(Context paramContext) {
    bs bs;
    u6 u61 = (u6)X();
    u61.Q = true;
    int i = u61.U;
    if (i == -100)
      i = g6.c; 
    i = u61.C(paramContext, i);
    if (g6.d(paramContext) && g6.d(paramContext))
      if (Build.VERSION.SDK_INT >= 33) {
        if (!g6.h)
          g6.b.execute(new b6(paramContext, 0)); 
      } else {
        synchronized (g6.k) {
          vo0 vo01 = g6.e;
          if (vo01 == null) {
            if (g6.f == null)
              g6.f = vo0.a(dd1.g0(paramContext)); 
            if (g6.f.a.a.isEmpty()) {
            
            } else {
              g6.e = g6.f;
            } 
          } else if (!vo01.equals(g6.f)) {
            vo01 = g6.e;
            g6.f = vo01;
            dd1.e0(paramContext, vo01.a.a.toLanguageTags());
          } 
        } 
      }  
    vo0 vo0 = u6.p(paramContext);
    if (paramContext instanceof ContextThemeWrapper) {
      Configuration configuration = u6.t(paramContext, i, vo0, null, false);
      try {
        ((ContextThemeWrapper)paramContext).applyOverrideConfiguration(configuration);
        super.attachBaseContext(paramContext);
        return;
      } catch (IllegalStateException illegalStateException) {}
    } 
    if (paramContext instanceof bs) {
      Configuration configuration = u6.t(paramContext, i, vo0, null, false);
      try {
        ((bs)paramContext).a(configuration);
        super.attachBaseContext(paramContext);
        return;
      } catch (IllegalStateException illegalStateException) {}
    } 
    if (u6.l0) {
      Configuration configuration1 = new Configuration();
      configuration1.uiMode = -1;
      configuration1.fontScale = 0.0F;
      Configuration configuration3 = paramContext.createConfigurationContext(configuration1).getResources().getConfiguration();
      configuration1 = paramContext.getResources().getConfiguration();
      configuration3.uiMode = configuration1.uiMode;
      if (!configuration3.equals(configuration1)) {
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0F;
        if (configuration3.diff(configuration1) == 0) {
          configuration1 = configuration;
        } else {
          float f1 = configuration3.fontScale;
          float f2 = configuration1.fontScale;
          if (f1 != f2)
            configuration.fontScale = f2; 
          int k = configuration3.mcc;
          int j = configuration1.mcc;
          if (k != j)
            configuration.mcc = j; 
          k = configuration3.mnc;
          j = configuration1.mnc;
          if (k != j)
            configuration.mnc = j; 
          l6.a(configuration3, configuration1, configuration);
          j = configuration3.touchscreen;
          k = configuration1.touchscreen;
          if (j != k)
            configuration.touchscreen = k; 
          j = configuration3.keyboard;
          k = configuration1.keyboard;
          if (j != k)
            configuration.keyboard = k; 
          k = configuration3.keyboardHidden;
          j = configuration1.keyboardHidden;
          if (k != j)
            configuration.keyboardHidden = j; 
          k = configuration3.navigation;
          j = configuration1.navigation;
          if (k != j)
            configuration.navigation = j; 
          j = configuration3.navigationHidden;
          k = configuration1.navigationHidden;
          if (j != k)
            configuration.navigationHidden = k; 
          k = configuration3.orientation;
          j = configuration1.orientation;
          if (k != j)
            configuration.orientation = j; 
          k = configuration3.screenLayout;
          j = configuration1.screenLayout & 0xF;
          if ((k & 0xF) != j)
            configuration.screenLayout |= j; 
          k = configuration3.screenLayout;
          j = configuration1.screenLayout & 0xC0;
          if ((k & 0xC0) != j)
            configuration.screenLayout |= j; 
          j = configuration3.screenLayout;
          k = configuration1.screenLayout & 0x30;
          if ((j & 0x30) != k)
            configuration.screenLayout |= k; 
          j = configuration3.screenLayout;
          k = configuration1.screenLayout & 0x300;
          if ((j & 0x300) != k)
            configuration.screenLayout |= k; 
          if (Build.VERSION.SDK_INT >= 26)
            ii0.f(configuration3, configuration1, configuration); 
          k = configuration3.uiMode;
          j = configuration1.uiMode & 0xF;
          if ((k & 0xF) != j)
            configuration.uiMode |= j; 
          j = configuration3.uiMode;
          k = configuration1.uiMode & 0x30;
          if ((j & 0x30) != k)
            configuration.uiMode |= k; 
          k = configuration3.screenWidthDp;
          j = configuration1.screenWidthDp;
          if (k != j)
            configuration.screenWidthDp = j; 
          j = configuration3.screenHeightDp;
          k = configuration1.screenHeightDp;
          if (j != k)
            configuration.screenHeightDp = k; 
          j = configuration3.smallestScreenWidthDp;
          k = configuration1.smallestScreenWidthDp;
          if (j != k)
            configuration.smallestScreenWidthDp = k; 
          j = configuration3.densityDpi;
          k = configuration1.densityDpi;
          configuration1 = configuration;
          if (j != k) {
            configuration.densityDpi = k;
            configuration1 = configuration;
          } 
        } 
      } else {
        configuration1 = null;
      } 
      Configuration configuration2 = u6.t(paramContext, i, vo0, configuration1, true);
      bs bs1 = new bs(paramContext, 2131952321);
      bs1.a(configuration2);
      try {
        Resources.Theme theme = paramContext.getTheme();
        if (theme != null) {
          theme = bs1.getTheme();
          if (Build.VERSION.SDK_INT >= 29) {
            p8.e(theme);
          } else {
            Object object = qv.e;
            /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            try {
              boolean bool = qv.g;
              if (!bool) {
                try {
                  Method method1 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                  qv.f = method1;
                  method1.setAccessible(true);
                } catch (NoSuchMethodException noSuchMethodException) {
                  Log.i("ResourcesCompat", "Failed to retrieve rebase() method", noSuchMethodException);
                } 
                qv.g = true;
              } 
            } finally {}
            Method method = qv.f;
            if (method != null)
              try {
                method.invoke(theme, null);
              } catch (IllegalAccessException illegalAccessException) {
                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", illegalAccessException);
                qv.f = null;
              } catch (InvocationTargetException invocationTargetException) {} 
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          } 
        } 
      } catch (NullPointerException nullPointerException) {}
      bs = bs1;
    } 
    super.attachBaseContext((Context)bs);
  }
  
  public final void b0() {
    super.onDestroy();
    ((wa0)this.x.c).n.l();
    this.y.e(om0.ON_DESTROY);
  }
  
  public final boolean c0(int paramInt, MenuItem paramMenuItem) {
    return super.onMenuItemSelected(paramInt, paramMenuItem) ? true : ((paramInt == 6) ? ((wa0)this.x.c).n.j() : false);
  }
  
  public final void closeOptionsMenu() {
    ui0 ui0 = Y();
    if (getWindow().hasFeature(0) && (ui0 == null || !ui0.j()))
      super.closeOptionsMenu(); 
  }
  
  public final void d0() {
    super.onPostResume();
    this.y.e(om0.ON_RESUME);
    lb0 lb0 = ((wa0)this.x.c).n;
    lb0.H = false;
    lb0.I = false;
    lb0.O.g = false;
    lb0.u(7);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getKeyCode();
    ui0 ui0 = Y();
    return (i == 82 && ui0 != null && ui0.S(paramKeyEvent)) ? true : super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (paramArrayOfString != null && paramArrayOfString.length != 0) {
      String str1 = paramArrayOfString[0];
      switch (str1.hashCode()) {
        case 1455016274:
          if (str1.equals("--autofill") && Build.VERSION.SDK_INT >= 26)
            return; 
          break;
        case 1159329357:
          if (str1.equals(xveccWbRzqx.qvGrWsTTk) && Build.VERSION.SDK_INT >= 29)
            return; 
          break;
        case 472614934:
          if (!str1.equals("--list-dumpables"))
            break; 
          if (Build.VERSION.SDK_INT >= 33)
            return; 
          break;
        case 100470631:
          if (!str1.equals("--dump-dumpable"))
            break; 
          if (Build.VERSION.SDK_INT >= 33)
            return; 
          break;
        case -645125871:
          if (str1.equals("--translation") && Build.VERSION.SDK_INT >= 31)
            return; 
          break;
      } 
    } 
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("  ");
    String str = stringBuilder.toString();
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.z);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(this.A);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.B);
    if (getApplication() != null) {
      k32 k32 = H();
      k32.getClass();
      ft ft = ft.b;
      ft.getClass();
      n2 n2 = new n2(k32, so0.c, ft);
      ll ll = ne1.a(so0.class);
      String str1 = ll.b();
      if (str1 != null) {
        eo1 eo1 = ((so0)n2.z(ll, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str1))).b;
        if (eo1.e > 0) {
          paramPrintWriter.print(str);
          paramPrintWriter.println("Loaders:");
          if (eo1.e > 0) {
            if (eo1.c[0] != null) {
              tp.b();
              return;
            } 
            paramPrintWriter.print(str);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(eo1.b[0]);
            paramPrintWriter.print(": ");
            throw null;
          } 
        } 
      } else {
        l0.l("Local and anonymous classes can not be ViewModels");
        return;
      } 
    } 
    ((wa0)this.x.c).n.v(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public final void e0() {
    gh1 gh11 = this.x;
    gh11.q();
    wa0 wa0 = (wa0)gh11.c;
    super.onStart();
    this.B = false;
    if (!this.z) {
      this.z = true;
      lb0 lb01 = wa0.n;
      lb01.H = false;
      lb01.I = false;
      lb01.O.g = false;
      lb01.u(4);
    } 
    wa0.n.z(true);
    this.y.e(om0.ON_START);
    lb0 lb0 = wa0.n;
    lb0.H = false;
    lb0.I = false;
    lb0.O.g = false;
    lb0.u(5);
  }
  
  public final void f0() {
    super.onStop();
    this.B = true;
    do {
    
    } while (a0(Z()));
    lb0 lb0 = ((wa0)this.x.c).n;
    lb0.I = true;
    lb0.O.g = true;
    lb0.u(4);
    this.y.e(om0.ON_STOP);
  }
  
  public final View findViewById(int paramInt) {
    u6 u61 = (u6)X();
    u61.w();
    return u61.n.findViewById(paramInt);
  }
  
  public final void g0(Toolbar paramToolbar) {
    u6 u61 = (u6)X();
    if (!(u61.l instanceof Activity))
      return; 
    u61.A();
    ui0 ui0 = u61.p;
    if (!(ui0 instanceof t52)) {
      u61.q = null;
      if (ui0 != null)
        ui0.Q(); 
      u61.p = null;
      if (paramToolbar != null) {
        Object object = u61.l;
        if (object instanceof Activity) {
          object = ((Activity)object).getTitle();
        } else {
          object = u61.r;
        } 
        object = new kv1(paramToolbar, (CharSequence)object, u61.o);
        u61.p = (ui0)object;
        u61.o.c = ((kv1)object).q;
        paramToolbar.setBackInvokedCallbackEnabled(true);
      } else {
        u61.o.c = null;
      } 
      u61.b();
      return;
    } 
    tp.f("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
  }
  
  public final MenuInflater getMenuInflater() {
    u6 u61 = (u6)X();
    if (u61.q == null) {
      Context context;
      u61.A();
      ui0 ui0 = u61.p;
      if (ui0 != null) {
        context = ui0.E();
      } else {
        context = u61.m;
      } 
      u61.q = new cr1(context);
    } 
    return u61.q;
  }
  
  public final Resources getResources() {
    int i = x12.a;
    return super.getResources();
  }
  
  public final void invalidateOptionsMenu() {
    X().b();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    this.x.q();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    null = (u6)X();
    if (null.H && null.B) {
      null.A();
      ui0 ui0 = null.p;
      if (ui0 != null)
        ui0.P(); 
    } 
    y6 y6 = y6.a();
    synchronized (null.m) {
      ig1 ig1 = y6.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{ig1}, name=null} */
      try {
        sp0 sp0 = (sp0)ig1.b.get(null);
        if (sp0 != null)
          sp0.a(); 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{ig1}, name=null} */
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{y6}, name=null} */
      null.T = new Configuration(null.m.getResources().getConfiguration());
      null.n(false, false);
      return;
    } 
  }
  
  public final void onContentChanged() {}
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.y.e(om0.ON_CREATE);
    lb0 lb0 = ((wa0)this.x.c).n;
    lb0.H = false;
    lb0.I = false;
    lb0.O.g = false;
    lb0.u(1);
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    View view = ((wa0)this.x.c).n.f.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    return (view == null) ? super.onCreateView(paramView, paramString, paramContext, paramAttributeSet) : view;
  }
  
  public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet) {
    View view = ((wa0)this.x.c).n.f.onCreateView(null, paramString, paramContext, paramAttributeSet);
    return (view == null) ? super.onCreateView(paramString, paramContext, paramAttributeSet) : view;
  }
  
  public void onDestroy() {
    b0();
    X().f();
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (Build.VERSION.SDK_INT < 26 && !paramKeyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState()) && paramKeyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(paramKeyEvent.getKeyCode())) {
      Window window = getWindow();
      if (window != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(paramKeyEvent))
        return true; 
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    if (!c0(paramInt, paramMenuItem)) {
      ui0 ui0 = Y();
      if (paramMenuItem.getItemId() == 16908332 && ui0 != null && (ui0.x() & 0x4) != 0) {
        Intent intent = ws2.N(this);
        if (intent != null) {
          if (shouldUpRecreateTask(intent)) {
            ArrayList<Intent> arrayList = new ArrayList();
            Intent intent1 = ws2.N(this);
            intent = intent1;
            if (intent1 == null)
              intent = ws2.N(this); 
            if (intent != null) {
              ComponentName componentName2 = intent.getComponent();
              ComponentName componentName1 = componentName2;
              if (componentName2 == null)
                componentName1 = intent.resolveActivity(getPackageManager()); 
              paramInt = arrayList.size();
              try {
                for (Intent intent2 = ws2.O((Context)this, componentName1); intent2 != null; intent2 = ws2.O((Context)this, intent2.getComponent()))
                  arrayList.add(paramInt, intent2); 
                arrayList.add(intent);
              } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(nameNotFoundException);
              } 
            } 
            if (!arrayList.isEmpty()) {
              Intent[] arrayOfIntent = arrayList.<Intent>toArray(new Intent[0]);
              arrayOfIntent[0] = (new Intent(arrayOfIntent[0])).addFlags(268484608);
              startActivities(arrayOfIntent, null);
              try {
                finishAffinity();
              } catch (IllegalStateException illegalStateException) {
                finish();
              } 
              return true;
            } 
            tp.f("No intents added to TaskStackBuilder; cannot startActivities");
            return false;
          } 
          navigateUpTo((Intent)illegalStateException);
          return true;
        } 
      } 
      return false;
    } 
    return true;
  }
  
  public void onPause() {
    super.onPause();
    this.A = false;
    ((wa0)this.x.c).n.u(5);
    this.y.e(om0.ON_PAUSE);
  }
  
  public final void onPostCreate(Bundle paramBundle) {
    super.onPostCreate(paramBundle);
    ((u6)X()).w();
  }
  
  public final void onPostResume() {
    d0();
    u6 u61 = (u6)X();
    u61.A();
    ui0 ui0 = u61.p;
    if (ui0 != null)
      ui0.d0(true); 
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    this.x.q();
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfint);
  }
  
  public void onResume() {
    gh1 gh11 = this.x;
    gh11.q();
    super.onResume();
    this.A = true;
    ((wa0)gh11.c).n.z(true);
  }
  
  public void onStart() {
    e0();
    ((u6)X()).n(true, false);
  }
  
  public final void onStateNotSaved() {
    this.x.q();
  }
  
  public void onStop() {
    f0();
    u6 u61 = (u6)X();
    u61.A();
    ui0 ui0 = u61.p;
    if (ui0 != null)
      ui0.d0(false); 
  }
  
  public final void onTitleChanged(CharSequence paramCharSequence, int paramInt) {
    super.onTitleChanged(paramCharSequence, paramInt);
    X().m(paramCharSequence);
  }
  
  public final void openOptionsMenu() {
    ui0 ui0 = Y();
    if (getWindow().hasFeature(0) && (ui0 == null || !ui0.T()))
      super.openOptionsMenu(); 
  }
  
  public final void setContentView(int paramInt) {
    V();
    X().j(paramInt);
  }
  
  public void setContentView(View paramView) {
    V();
    X().k(paramView);
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    V();
    X().l(paramView, paramLayoutParams);
  }
  
  public final void setTheme(int paramInt) {
    super.setTheme(paramInt);
    ((u6)X()).V = paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */