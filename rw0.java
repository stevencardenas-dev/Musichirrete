import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class rw0 implements Menu {
  public static final int[] y = new int[] { 1, 4, 5, 3, 2, 0 };
  
  public final Context a;
  
  public final Resources b;
  
  public boolean c;
  
  public final boolean d;
  
  public pw0 e;
  
  public final ArrayList f;
  
  public final ArrayList g;
  
  public boolean h;
  
  public final ArrayList i;
  
  public final ArrayList j;
  
  public boolean k;
  
  public int l;
  
  public CharSequence m;
  
  public Drawable n;
  
  public View o;
  
  public boolean p;
  
  public boolean q;
  
  public boolean r;
  
  public boolean s;
  
  public final ArrayList t;
  
  public final CopyOnWriteArrayList u;
  
  public uw0 v;
  
  public boolean w;
  
  public boolean x;
  
  public rw0(Context paramContext) {
    boolean bool2 = false;
    this.l = 0;
    this.p = false;
    this.q = false;
    this.r = false;
    this.s = false;
    this.t = new ArrayList();
    this.u = new CopyOnWriteArrayList();
    this.w = false;
    this.a = paramContext;
    Resources resources = paramContext.getResources();
    this.b = resources;
    this.f = new ArrayList();
    this.g = new ArrayList();
    this.h = true;
    this.i = new ArrayList();
    this.j = new ArrayList();
    this.k = true;
    boolean bool1 = bool2;
    if ((resources.getConfiguration()).keyboard != 1) {
      boolean bool;
      ViewConfiguration viewConfiguration = ViewConfiguration.get(paramContext);
      Method method = w22.a;
      if (Build.VERSION.SDK_INT >= 28) {
        bool = k5.v(viewConfiguration);
      } else {
        Resources resources1 = paramContext.getResources();
        int i = resources1.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        if (i != 0 && resources1.getBoolean(i)) {
          bool = true;
        } else {
          bool = false;
        } 
      } 
      bool1 = bool2;
      if (bool)
        bool1 = true; 
    } 
    this.d = bool1;
  }
  
  public final uw0 a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    int i = (0xFFFF0000 & paramInt3) >> 16;
    if (i >= 0 && i < 6) {
      i = y[i] << 16 | 0xFFFF & paramInt3;
      uw0 uw01 = new uw0(this, paramInt1, paramInt2, paramInt3, i, paramCharSequence, this.l);
      ArrayList<uw0> arrayList = this.f;
      paramInt1 = arrayList.size() - 1;
      while (true) {
        if (paramInt1 >= 0) {
          if (((uw0)arrayList.get(paramInt1)).d <= i) {
            paramInt1++;
            break;
          } 
          paramInt1--;
          continue;
        } 
        paramInt1 = 0;
        break;
      } 
      arrayList.add(paramInt1, uw01);
      p(true);
      return uw01;
    } 
    l0.l("order does not contain a valid category.");
    return null;
  }
  
  public final MenuItem add(int paramInt) {
    return a(0, 0, 0, this.b.getString(paramInt));
  }
  
  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return a(paramInt1, paramInt2, paramInt3, this.b.getString(paramInt4));
  }
  
  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public final MenuItem add(CharSequence paramCharSequence) {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public final int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem) {
    byte b1;
    PackageManager packageManager = this.a.getPackageManager();
    byte b3 = 0;
    List<ResolveInfo> list = packageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    if (list != null) {
      b1 = list.size();
    } else {
      b1 = 0;
    } 
    byte b2 = b3;
    if ((paramInt4 & 0x1) == 0) {
      removeGroup(paramInt1);
      b2 = b3;
    } 
    while (b2 < b1) {
      ResolveInfo resolveInfo = list.get(b2);
      paramInt4 = resolveInfo.specificIndex;
      if (paramInt4 < 0) {
        intent = paramIntent;
      } else {
        intent = paramArrayOfIntent[paramInt4];
      } 
      Intent intent = new Intent(intent);
      ActivityInfo activityInfo = resolveInfo.activityInfo;
      intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
      uw0 uw01 = a(paramInt1, paramInt2, paramInt3, resolveInfo.loadLabel(packageManager));
      uw01.setIcon(resolveInfo.loadIcon(packageManager));
      uw01.g = intent;
      if (paramArrayOfMenuItem != null) {
        paramInt4 = resolveInfo.specificIndex;
        if (paramInt4 >= 0)
          paramArrayOfMenuItem[paramInt4] = uw01; 
      } 
      b2++;
    } 
    return b1;
  }
  
  public final SubMenu addSubMenu(int paramInt) {
    return addSubMenu(0, 0, 0, this.b.getString(paramInt));
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.b.getString(paramInt4));
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    uw0 uw01 = a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    tq1 tq1 = new tq1(this.a, this, uw01);
    uw01.o = tq1;
    tq1.setHeaderTitle(uw01.e);
    return tq1;
  }
  
  public final SubMenu addSubMenu(CharSequence paramCharSequence) {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public final void b(hx0 paramhx0, Context paramContext) {
    WeakReference<hx0> weakReference = new WeakReference<hx0>(paramhx0);
    this.u.add(weakReference);
    paramhx0.i(paramContext, this);
    this.k = true;
  }
  
  public final void c(boolean paramBoolean) {
    if (this.s)
      return; 
    this.s = true;
    CopyOnWriteArrayList copyOnWriteArrayList = this.u;
    for (WeakReference<hx0> weakReference : (Iterable<WeakReference<hx0>>)copyOnWriteArrayList) {
      hx0 hx0 = weakReference.get();
      if (hx0 == null) {
        copyOnWriteArrayList.remove(weakReference);
        continue;
      } 
      hx0.a(this, paramBoolean);
    } 
    this.s = false;
  }
  
  public final void clear() {
    uw0 uw01 = this.v;
    if (uw01 != null)
      d(uw01); 
    this.f.clear();
    p(true);
  }
  
  public final void clearHeader() {
    this.n = null;
    this.m = null;
    this.o = null;
    p(false);
  }
  
  public final void close() {
    c(true);
  }
  
  public boolean d(uw0 paramuw0) {
    CopyOnWriteArrayList copyOnWriteArrayList = this.u;
    boolean bool4 = copyOnWriteArrayList.isEmpty();
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool1 = bool2;
    if (!bool4)
      if (this.v != paramuw0) {
        bool1 = bool2;
      } else {
        w();
        Iterator<WeakReference> iterator = copyOnWriteArrayList.iterator();
        bool1 = bool3;
        while (true) {
          bool2 = bool1;
          if (iterator.hasNext()) {
            WeakReference<hx0> weakReference = iterator.next();
            hx0 hx0 = weakReference.get();
            if (hx0 == null) {
              copyOnWriteArrayList.remove(weakReference);
              continue;
            } 
            bool2 = hx0.c(paramuw0);
            bool1 = bool2;
            if (bool2)
              break; 
            continue;
          } 
          break;
        } 
        v();
        bool1 = bool2;
        if (bool2) {
          this.v = null;
          bool1 = bool2;
        } 
      }  
    return bool1;
  }
  
  public boolean e(rw0 paramrw0, MenuItem paramMenuItem) {
    pw0 pw01 = this.e;
    return (pw01 != null && pw01.c(paramrw0, paramMenuItem));
  }
  
  public boolean f(uw0 paramuw0) {
    CopyOnWriteArrayList copyOnWriteArrayList = this.u;
    boolean bool2 = copyOnWriteArrayList.isEmpty();
    boolean bool1 = false;
    if (bool2)
      return false; 
    w();
    Iterator<WeakReference> iterator = copyOnWriteArrayList.iterator();
    while (true) {
      bool2 = bool1;
      if (iterator.hasNext()) {
        WeakReference<hx0> weakReference = iterator.next();
        hx0 hx0 = weakReference.get();
        if (hx0 == null) {
          copyOnWriteArrayList.remove(weakReference);
          continue;
        } 
        bool2 = hx0.f(paramuw0);
        bool1 = bool2;
        if (bool2)
          break; 
        continue;
      } 
      break;
    } 
    v();
    if (bool2)
      this.v = paramuw0; 
    return bool2;
  }
  
  public final MenuItem findItem(int paramInt) {
    ArrayList<uw0> arrayList = this.f;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      uw0 uw01 = arrayList.get(b);
      if (uw01.a == paramInt)
        return uw01; 
      if (uw01.hasSubMenu()) {
        MenuItem menuItem = uw01.o.findItem(paramInt);
        if (menuItem != null)
          return menuItem; 
      } 
    } 
    return null;
  }
  
  public final uw0 g(int paramInt, KeyEvent paramKeyEvent) {
    ArrayList<uw0> arrayList = this.t;
    arrayList.clear();
    h(arrayList, paramInt, paramKeyEvent);
    if (arrayList.isEmpty())
      return null; 
    int j = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(keyData);
    int i = arrayList.size();
    if (i == 1)
      return arrayList.get(0); 
    boolean bool = n();
    for (byte b = 0; b < i; b++) {
      char c;
      uw0 uw01 = arrayList.get(b);
      if (bool) {
        c = uw01.j;
      } else {
        c = uw01.h;
      } 
      char[] arrayOfChar = keyData.meta;
      if ((c == arrayOfChar[0] && (j & 0x2) == 0) || (c == arrayOfChar[2] && (j & 0x2) != 0) || (bool && c == '\b' && paramInt == 67))
        return uw01; 
    } 
    return null;
  }
  
  public final MenuItem getItem(int paramInt) {
    return this.f.get(paramInt);
  }
  
  public final void h(List<uw0> paramList, int paramInt, KeyEvent paramKeyEvent) {
    boolean bool = n();
    int i = paramKeyEvent.getModifiers();
    KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
    if (paramKeyEvent.getKeyData(keyData) || paramInt == 67) {
      ArrayList<uw0> arrayList = this.f;
      int j = arrayList.size();
      for (byte b = 0; b < j; b++) {
        char c;
        int k;
        uw0 uw01 = arrayList.get(b);
        if (uw01.hasSubMenu())
          uw01.o.h(paramList, paramInt, paramKeyEvent); 
        if (bool) {
          c = uw01.j;
        } else {
          c = uw01.h;
        } 
        if (bool) {
          k = uw01.k;
        } else {
          k = uw01.i;
        } 
        if ((i & 0x1100F) == (k & 0x1100F) && c != '\000') {
          char[] arrayOfChar = keyData.meta;
          if ((c == arrayOfChar[0] || c == arrayOfChar[2] || (bool && c == '\b' && paramInt == 67)) && uw01.isEnabled())
            paramList.add(uw01); 
        } 
      } 
    } 
  }
  
  public final boolean hasVisibleItems() {
    if (!this.x) {
      ArrayList<uw0> arrayList = this.f;
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        if (!((uw0)arrayList.get(b)).isVisible()) {
          b++;
          continue;
        } 
        return true;
      } 
      return false;
    } 
    return true;
  }
  
  public final void i() {
    ArrayList<uw0> arrayList1 = l();
    if (!this.k)
      return; 
    CopyOnWriteArrayList copyOnWriteArrayList = this.u;
    Iterator<WeakReference> iterator = copyOnWriteArrayList.iterator();
    boolean bool;
    for (bool = false; iterator.hasNext(); bool |= hx0.k()) {
      WeakReference<hx0> weakReference = iterator.next();
      hx0 hx0 = weakReference.get();
      if (hx0 == null) {
        copyOnWriteArrayList.remove(weakReference);
        continue;
      } 
    } 
    ArrayList<uw0> arrayList2 = this.i;
    ArrayList<uw0> arrayList3 = this.j;
    if (bool) {
      arrayList2.clear();
      arrayList3.clear();
      int i = arrayList1.size();
      for (bool = false; bool < i; bool++) {
        uw0 uw01 = arrayList1.get(bool);
        if ((uw01.x & 0x20) == 32) {
          arrayList2.add(uw01);
        } else {
          arrayList3.add(uw01);
        } 
      } 
    } else {
      arrayList2.clear();
      arrayList3.clear();
      arrayList3.addAll(l());
    } 
    this.k = false;
  }
  
  public final boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent) {
    return (g(paramInt, paramKeyEvent) != null);
  }
  
  public String j() {
    return "android:menu:actionviewstates";
  }
  
  public rw0 k() {
    return this;
  }
  
  public final ArrayList l() {
    boolean bool = this.h;
    ArrayList<uw0> arrayList1 = this.g;
    if (!bool)
      return arrayList1; 
    arrayList1.clear();
    ArrayList<uw0> arrayList2 = this.f;
    int i = arrayList2.size();
    for (byte b = 0; b < i; b++) {
      uw0 uw01 = arrayList2.get(b);
      if (uw01.isVisible())
        arrayList1.add(uw01); 
    } 
    this.h = false;
    this.k = true;
    return arrayList1;
  }
  
  public boolean m() {
    return this.w;
  }
  
  public boolean n() {
    return this.c;
  }
  
  public boolean o() {
    return this.d;
  }
  
  public final void p(boolean paramBoolean) {
    if (!this.p) {
      if (paramBoolean) {
        this.h = true;
        this.k = true;
      } 
      CopyOnWriteArrayList copyOnWriteArrayList = this.u;
      if (!copyOnWriteArrayList.isEmpty()) {
        w();
        for (WeakReference<hx0> weakReference : (Iterable<WeakReference<hx0>>)copyOnWriteArrayList) {
          hx0 hx0 = weakReference.get();
          if (hx0 == null) {
            copyOnWriteArrayList.remove(weakReference);
            continue;
          } 
          hx0.g();
        } 
        v();
        return;
      } 
    } else {
      this.q = true;
      if (paramBoolean)
        this.r = true; 
    } 
  }
  
  public final boolean performIdentifierAction(int paramInt1, int paramInt2) {
    return q(findItem(paramInt1), null, paramInt2);
  }
  
  public final boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
    boolean bool;
    uw0 uw01 = g(paramInt1, paramKeyEvent);
    if (uw01 != null) {
      bool = q(uw01, null, paramInt2);
    } else {
      bool = false;
    } 
    if ((paramInt2 & 0x2) != 0)
      c(true); 
    return bool;
  }
  
  public final boolean q(MenuItem paramMenuItem, hx0 paramhx0, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast uw0
    //   4: astore_1
    //   5: iconst_0
    //   6: istore #7
    //   8: iconst_0
    //   9: istore #6
    //   11: aload_1
    //   12: ifnull -> 444
    //   15: aload_1
    //   16: invokevirtual isEnabled : ()Z
    //   19: ifne -> 25
    //   22: goto -> 444
    //   25: aload_1
    //   26: getfield n : Lrw0;
    //   29: astore #8
    //   31: aload_1
    //   32: getfield p : Landroid/view/MenuItem$OnMenuItemClickListener;
    //   35: astore #9
    //   37: aload #9
    //   39: ifnull -> 59
    //   42: aload #9
    //   44: aload_1
    //   45: invokeinterface onMenuItemClick : (Landroid/view/MenuItem;)Z
    //   50: ifeq -> 59
    //   53: iconst_1
    //   54: istore #5
    //   56: goto -> 139
    //   59: aload #8
    //   61: aload #8
    //   63: aload_1
    //   64: invokevirtual e : (Lrw0;Landroid/view/MenuItem;)Z
    //   67: ifeq -> 73
    //   70: goto -> 53
    //   73: aload_1
    //   74: getfield g : Landroid/content/Intent;
    //   77: astore #9
    //   79: aload #9
    //   81: ifnull -> 111
    //   84: aload #8
    //   86: getfield a : Landroid/content/Context;
    //   89: aload #9
    //   91: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   94: goto -> 53
    //   97: astore #8
    //   99: ldc_w 'MenuItemImpl'
    //   102: ldc_w 'Can't find activity to handle intent; ignoring'
    //   105: aload #8
    //   107: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   110: pop
    //   111: aload_1
    //   112: getfield A : Lvw0;
    //   115: astore #8
    //   117: aload #8
    //   119: ifnull -> 136
    //   122: aload #8
    //   124: getfield b : Landroid/view/ActionProvider;
    //   127: invokevirtual onPerformDefaultAction : ()Z
    //   130: ifeq -> 136
    //   133: goto -> 53
    //   136: iconst_0
    //   137: istore #5
    //   139: aload_1
    //   140: getfield A : Lvw0;
    //   143: astore #8
    //   145: aload #8
    //   147: ifnull -> 167
    //   150: aload #8
    //   152: getfield b : Landroid/view/ActionProvider;
    //   155: invokevirtual hasSubMenu : ()Z
    //   158: ifeq -> 167
    //   161: iconst_1
    //   162: istore #4
    //   164: goto -> 170
    //   167: iconst_0
    //   168: istore #4
    //   170: aload_1
    //   171: invokevirtual e : ()Z
    //   174: ifeq -> 207
    //   177: iload #5
    //   179: aload_1
    //   180: invokevirtual expandActionView : ()Z
    //   183: ior
    //   184: istore #5
    //   186: iload #5
    //   188: istore #6
    //   190: iload #5
    //   192: ifeq -> 441
    //   195: aload_0
    //   196: iconst_1
    //   197: invokevirtual c : (Z)V
    //   200: iload #5
    //   202: istore #6
    //   204: goto -> 441
    //   207: aload_1
    //   208: invokevirtual hasSubMenu : ()Z
    //   211: ifne -> 244
    //   214: iload #4
    //   216: ifeq -> 222
    //   219: goto -> 244
    //   222: iload #5
    //   224: istore #6
    //   226: iload_3
    //   227: iconst_1
    //   228: iand
    //   229: ifne -> 441
    //   232: aload_0
    //   233: iconst_1
    //   234: invokevirtual c : (Z)V
    //   237: iload #5
    //   239: istore #6
    //   241: goto -> 441
    //   244: iload_3
    //   245: iconst_4
    //   246: iand
    //   247: ifne -> 255
    //   250: aload_0
    //   251: iconst_0
    //   252: invokevirtual c : (Z)V
    //   255: aload_1
    //   256: invokevirtual hasSubMenu : ()Z
    //   259: ifne -> 293
    //   262: new tq1
    //   265: dup
    //   266: aload_0
    //   267: getfield a : Landroid/content/Context;
    //   270: aload_0
    //   271: aload_1
    //   272: invokespecial <init> : (Landroid/content/Context;Lrw0;Luw0;)V
    //   275: astore #9
    //   277: aload_1
    //   278: aload #9
    //   280: putfield o : Ltq1;
    //   283: aload #9
    //   285: aload_1
    //   286: getfield e : Ljava/lang/CharSequence;
    //   289: invokevirtual setHeaderTitle : (Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    //   292: pop
    //   293: aload_1
    //   294: getfield o : Ltq1;
    //   297: astore_1
    //   298: iload #4
    //   300: ifeq -> 312
    //   303: aload #8
    //   305: getfield b : Landroid/view/ActionProvider;
    //   308: aload_1
    //   309: invokevirtual onPrepareSubMenu : (Landroid/view/SubMenu;)V
    //   312: aload_0
    //   313: getfield u : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   316: astore #8
    //   318: aload #8
    //   320: invokevirtual isEmpty : ()Z
    //   323: ifeq -> 329
    //   326: goto -> 416
    //   329: aload_2
    //   330: ifnull -> 342
    //   333: aload_2
    //   334: aload_1
    //   335: invokeinterface j : (Ltq1;)Z
    //   340: istore #6
    //   342: aload #8
    //   344: invokevirtual iterator : ()Ljava/util/Iterator;
    //   347: astore_2
    //   348: iload #6
    //   350: istore #7
    //   352: aload_2
    //   353: invokeinterface hasNext : ()Z
    //   358: ifeq -> 416
    //   361: aload_2
    //   362: invokeinterface next : ()Ljava/lang/Object;
    //   367: checkcast java/lang/ref/WeakReference
    //   370: astore #10
    //   372: aload #10
    //   374: invokevirtual get : ()Ljava/lang/Object;
    //   377: checkcast hx0
    //   380: astore #9
    //   382: aload #9
    //   384: ifnonnull -> 398
    //   387: aload #8
    //   389: aload #10
    //   391: invokevirtual remove : (Ljava/lang/Object;)Z
    //   394: pop
    //   395: goto -> 348
    //   398: iload #6
    //   400: ifne -> 348
    //   403: aload #9
    //   405: aload_1
    //   406: invokeinterface j : (Ltq1;)Z
    //   411: istore #6
    //   413: goto -> 348
    //   416: iload #5
    //   418: iload #7
    //   420: ior
    //   421: istore #5
    //   423: iload #5
    //   425: istore #6
    //   427: iload #5
    //   429: ifne -> 441
    //   432: aload_0
    //   433: iconst_1
    //   434: invokevirtual c : (Z)V
    //   437: iload #5
    //   439: istore #6
    //   441: iload #6
    //   443: ireturn
    //   444: iconst_0
    //   445: ireturn
    // Exception table:
    //   from	to	target	type
    //   84	94	97	android/content/ActivityNotFoundException
  }
  
  public final void r(hx0 paramhx0) {
    CopyOnWriteArrayList copyOnWriteArrayList = this.u;
    for (WeakReference<hx0> weakReference : (Iterable<WeakReference<hx0>>)copyOnWriteArrayList) {
      hx0 hx01 = weakReference.get();
      if (hx01 == null || hx01 == paramhx0)
        copyOnWriteArrayList.remove(weakReference); 
    } 
  }
  
  public final void removeGroup(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Ljava/util/ArrayList;
    //   4: astore #5
    //   6: aload #5
    //   8: invokevirtual size : ()I
    //   11: istore #4
    //   13: iconst_0
    //   14: istore_3
    //   15: iconst_0
    //   16: istore_2
    //   17: iload_2
    //   18: iload #4
    //   20: if_icmpge -> 48
    //   23: aload #5
    //   25: iload_2
    //   26: invokevirtual get : (I)Ljava/lang/Object;
    //   29: checkcast uw0
    //   32: getfield b : I
    //   35: iload_1
    //   36: if_icmpne -> 42
    //   39: goto -> 50
    //   42: iinc #2, 1
    //   45: goto -> 17
    //   48: iconst_m1
    //   49: istore_2
    //   50: iload_2
    //   51: iflt -> 119
    //   54: aload #5
    //   56: invokevirtual size : ()I
    //   59: istore #4
    //   61: iload_3
    //   62: iload #4
    //   64: iload_2
    //   65: isub
    //   66: if_icmpge -> 114
    //   69: aload #5
    //   71: iload_2
    //   72: invokevirtual get : (I)Ljava/lang/Object;
    //   75: checkcast uw0
    //   78: getfield b : I
    //   81: iload_1
    //   82: if_icmpne -> 114
    //   85: iload_2
    //   86: iflt -> 108
    //   89: iload_2
    //   90: aload #5
    //   92: invokevirtual size : ()I
    //   95: if_icmplt -> 101
    //   98: goto -> 108
    //   101: aload #5
    //   103: iload_2
    //   104: invokevirtual remove : (I)Ljava/lang/Object;
    //   107: pop
    //   108: iinc #3, 1
    //   111: goto -> 61
    //   114: aload_0
    //   115: iconst_1
    //   116: invokevirtual p : (Z)V
    //   119: return
  }
  
  public final void removeItem(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Ljava/util/ArrayList;
    //   4: astore #4
    //   6: aload #4
    //   8: invokevirtual size : ()I
    //   11: istore_3
    //   12: iconst_0
    //   13: istore_2
    //   14: iload_2
    //   15: iload_3
    //   16: if_icmpge -> 44
    //   19: aload #4
    //   21: iload_2
    //   22: invokevirtual get : (I)Ljava/lang/Object;
    //   25: checkcast uw0
    //   28: getfield a : I
    //   31: iload_1
    //   32: if_icmpne -> 38
    //   35: goto -> 46
    //   38: iinc #2, 1
    //   41: goto -> 14
    //   44: iconst_m1
    //   45: istore_2
    //   46: iload_2
    //   47: iflt -> 74
    //   50: iload_2
    //   51: aload #4
    //   53: invokevirtual size : ()I
    //   56: if_icmplt -> 62
    //   59: goto -> 74
    //   62: aload #4
    //   64: iload_2
    //   65: invokevirtual remove : (I)Ljava/lang/Object;
    //   68: pop
    //   69: aload_0
    //   70: iconst_1
    //   71: invokevirtual p : (Z)V
    //   74: return
  }
  
  public final void s(Bundle paramBundle) {
    if (paramBundle != null) {
      SparseArray sparseArray = paramBundle.getSparseParcelableArray(j());
      int j = this.f.size();
      int i;
      for (i = 0; i < j; i++) {
        MenuItem menuItem = getItem(i);
        View view = menuItem.getActionView();
        if (view != null && view.getId() != -1)
          view.restoreHierarchyState(sparseArray); 
        if (menuItem.hasSubMenu())
          ((tq1)menuItem.getSubMenu()).s(paramBundle); 
      } 
      i = paramBundle.getInt("android:menu:expandedactionview");
      if (i > 0) {
        MenuItem menuItem = findItem(i);
        if (menuItem != null)
          menuItem.expandActionView(); 
      } 
    } 
  }
  
  public final void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    ArrayList<uw0> arrayList = this.f;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      uw0 uw01 = arrayList.get(b);
      if (uw01.b == paramInt) {
        boolean bool;
        int j = uw01.x;
        if (paramBoolean2) {
          bool = true;
        } else {
          bool = false;
        } 
        uw01.x = j & 0xFFFFFFFB | bool;
        uw01.setCheckable(paramBoolean1);
      } 
    } 
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public final void setGroupEnabled(int paramInt, boolean paramBoolean) {
    ArrayList<uw0> arrayList = this.f;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      uw0 uw01 = arrayList.get(b);
      if (uw01.b == paramInt)
        uw01.setEnabled(paramBoolean); 
    } 
  }
  
  public final void setGroupVisible(int paramInt, boolean paramBoolean) {
    ArrayList<uw0> arrayList = this.f;
    int i = arrayList.size();
    byte b1 = 0;
    byte b2;
    for (b2 = 0; b1 < i; b2 = b) {
      uw0 uw01 = arrayList.get(b1);
      byte b = b2;
      if (uw01.b == paramInt) {
        int j = uw01.x;
        if (paramBoolean) {
          b = 0;
        } else {
          b = 8;
        } 
        int k = j & 0xFFFFFFF7 | b;
        uw01.x = k;
        b = b2;
        if (j != k)
          b = 1; 
      } 
      b1++;
    } 
    if (b2 != 0)
      p(true); 
  }
  
  public void setQwertyMode(boolean paramBoolean) {
    this.c = paramBoolean;
    p(false);
  }
  
  public final int size() {
    return this.f.size();
  }
  
  public final void t(Bundle paramBundle) {
    int i = this.f.size();
    SparseArray sparseArray = null;
    byte b = 0;
    while (b < i) {
      MenuItem menuItem = getItem(b);
      View view = menuItem.getActionView();
      SparseArray sparseArray1 = sparseArray;
      if (view != null) {
        sparseArray1 = sparseArray;
        if (view.getId() != -1) {
          SparseArray sparseArray2 = sparseArray;
          if (sparseArray == null)
            sparseArray2 = new SparseArray(); 
          view.saveHierarchyState(sparseArray2);
          sparseArray1 = sparseArray2;
          if (menuItem.isActionViewExpanded()) {
            paramBundle.putInt("android:menu:expandedactionview", menuItem.getItemId());
            sparseArray1 = sparseArray2;
          } 
        } 
      } 
      if (menuItem.hasSubMenu())
        ((tq1)menuItem.getSubMenu()).t(paramBundle); 
      b++;
      sparseArray = sparseArray1;
    } 
    if (sparseArray != null)
      paramBundle.putSparseParcelableArray(j(), sparseArray); 
  }
  
  public final void u(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView) {
    if (paramView != null) {
      this.o = paramView;
      this.m = null;
      this.n = null;
    } else {
      if (paramInt1 > 0) {
        this.m = this.b.getText(paramInt1);
      } else if (paramCharSequence != null) {
        this.m = paramCharSequence;
      } 
      if (paramInt2 > 0) {
        this.n = this.a.getDrawable(paramInt2);
      } else if (paramDrawable != null) {
        this.n = paramDrawable;
      } 
      this.o = null;
    } 
    p(false);
  }
  
  public final void v() {
    this.p = false;
    if (this.q) {
      this.q = false;
      p(this.r);
    } 
  }
  
  public final void w() {
    if (!this.p) {
      this.p = true;
      this.q = false;
      this.r = false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */