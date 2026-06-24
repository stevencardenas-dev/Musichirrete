import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipFile;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public final class n2 implements j70, sh2, ao2, kk2 {
  public static n2 h;
  
  public final int b;
  
  public Object c;
  
  public Object e;
  
  public Object f;
  
  public Object g;
  
  public n2(int paramInt) {
    mp mp;
    this.c = new ArrayList();
    this.e = new HashMap<Object, Object>();
    this.f = new HashMap<Object, Object>();
  }
  
  public n2(Context paramContext, ActionMode.Callback paramCallback) {
    this.e = paramContext;
    this.c = paramCallback;
    this.f = new ArrayList();
    this.g = new zm1(0);
  }
  
  public n2(Context paramContext, View paramView) {
    rw0 rw0 = new rw0(paramContext);
    this.c = rw0;
    rw0.e = new bh0(19, this);
    bx0 bx0 = new bx0(paramContext, rw0, paramView, false, 2130969811, 0);
    this.e = bx0;
    bx0.f = 0;
    bx0.j = new ax0(1, this);
  }
  
  public n2(Context paramContext, String paramString, ds1 paramds1) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{m92}} */
    try {
      if (m92.a == null) {
        Context context = paramContext.getApplicationContext();
        if (context == null)
          context = paramContext; 
        p92 p921 = new p92();
        this(context);
        m92.a = p921;
      } 
    } finally {}
    p92 p92 = m92.a;
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{m92}} */
    this.c = p92.b.c();
    byte[] arrayOfByte = paramString.getBytes();
    this.e = (new zb(0)).d(arrayOfByte);
    this.f = paramds1;
    this.g = paramContext.getResources();
  }
  
  public n2(FrameLayout paramFrameLayout, MaterialButton paramMaterialButton1, MaterialButton paramMaterialButton2, TextView paramTextView, LinearLayout paramLinearLayout) {
    this.c = paramMaterialButton1;
    this.e = paramMaterialButton2;
    this.f = paramTextView;
    this.g = paramLinearLayout;
  }
  
  public n2(f paramf) {
    this.c = paramf;
    this.e = new e11();
    new LinkedHashSet();
    this.f = new LinkedHashSet();
    this.g = new LinkedHashSet();
  }
  
  public n2(String paramString1, String paramString2) {
    this.e = new ArrayList();
    this.f = new ArrayList();
    this.g = new HashSet();
    Bundle bundle = new Bundle();
    this.c = bundle;
    if (paramString1 != null) {
      bundle.putString("id", paramString1);
      if (paramString2 != null) {
        bundle.putString("name", paramString2);
        return;
      } 
      k91.h("name must not be null");
      throw null;
    } 
    k91.h("id must not be null");
    throw null;
  }
  
  public n2(ExecutorService paramExecutorService) {
    this.f = new Handler(Looper.getMainLooper());
    this.g = new ki1(1, this);
    tk1 tk1 = new tk1(paramExecutorService, 0);
    this.c = tk1;
    this.e = qz1.t(tk1);
  }
  
  public n2(k32 paramk32, j32 paramj32, gt paramgt) {
    this.c = paramk32;
    this.e = paramj32;
    this.f = paramgt;
    this.g = new zb0(14);
  }
  
  public n2(su0 paramsu0) {
    this.e = new ArrayList();
    this.f = new ArrayList();
    this.g = new HashSet();
    this.c = new Bundle(paramsu0.a);
    this.e = paramsu0.c();
    this.f = paramsu0.b();
    this.g = paramsu0.a();
  }
  
  public n2(w9 paramw9, j01 paramj01) {
    this.c = paramw9;
    this.e = paramj01;
    this.f = new Object();
    this.g = new LinkedHashMap<Object, Object>();
  }
  
  public static void h(n2 paramn2, w31 paramw31) {
    paramn2.getClass();
    if (((LinkedHashSet<w31>)paramn2.f).add(paramw31)) {
      e11 e11 = (e11)paramn2.e;
      e11.getClass();
      if (paramw31.c == null) {
        e11.e.addFirst(paramw31);
        paramw31.c = paramn2;
        e11.b();
        return;
      } 
      k91.g(paramw31, "' is already registered with a dispatcher", "Handler '");
    } 
  }
  
  public static String n(int[] paramArrayOfint) {
    char[] arrayOfChar = new char[paramArrayOfint.length];
    char c = 'ऩ';
    byte b = 0;
    while (b < paramArrayOfint.length) {
      arrayOfChar[b] = (char)(paramArrayOfint[b] - c);
      b++;
      c++;
    } 
    return new String(arrayOfChar);
  }
  
  public static n2 x() {
    if (h == null)
      h = new n2(11); 
    return h;
  }
  
  public boolean A(ge paramge) {
    nn1 nn1 = (nn1)this.f;
    return (nn1 != null && paramge != null && nn1.a.get() == paramge);
  }
  
  public void B(sb0 paramsb0) {
    ua0 ua0 = paramsb0.c;
    String str = ua0.h;
    HashMap<String, sb0> hashMap = (HashMap)this.e;
    if (hashMap.get(str) != null)
      return; 
    hashMap.put(ua0.h, paramsb0);
    if (ua0.G) {
      boolean bool = ua0.F;
      ob0 ob0 = (ob0)this.g;
      if (bool) {
        HashMap<String, ua0> hashMap1 = ob0.b;
        if (ob0.g) {
          if (lb0.M(2))
            Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved"); 
        } else if (!hashMap1.containsKey(ua0.h)) {
          hashMap1.put(ua0.h, ua0);
          if (lb0.M(2)) {
            StringBuilder stringBuilder = new StringBuilder("Updating retained Fragments: Added ");
            stringBuilder.append(ua0);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
        } 
      } else {
        ob0.h(ua0);
      } 
      ua0.G = false;
    } 
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("Added fragment to active set ");
      stringBuilder.append(ua0);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public void C(sb0 paramsb0) {
    HashMap<String, sb0> hashMap = (HashMap)this.e;
    ua0 ua0 = paramsb0.c;
    if (ua0.F)
      ((ob0)this.g).h(ua0); 
    if (hashMap.get(ua0.h) == paramsb0 && (sb0)hashMap.put(ua0.h, null) != null && lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("Removed fragment from active set ");
      stringBuilder.append(ua0);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public boolean D(y1 paramy1, MenuItem paramMenuItem) {
    return ((ActionMode.Callback)this.c).onActionItemClicked(s(paramy1), new yw0((Context)this.e, (dr1)paramMenuItem));
  }
  
  public boolean E(y1 paramy1, Menu paramMenu) {
    ActionMode.Callback callback = (ActionMode.Callback)this.c;
    yq1 yq1 = s(paramy1);
    zm1 zm1 = (zm1)this.g;
    Menu menu2 = (Menu)zm1.get(paramMenu);
    Menu menu1 = menu2;
    if (menu2 == null) {
      menu1 = new kx0((Context)this.e, (rw0)paramMenu);
      zm1.put(paramMenu, menu1);
    } 
    return callback.onCreateActionMode(yq1, menu1);
  }
  
  public void F(ge paramge) {
    Object object = this.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (A(paramge)) {
        nn1 nn1 = (nn1)this.f;
        if (!nn1.c) {
          nn1.c = true;
          ((Handler)this.e).removeCallbacksAndMessages(nn1);
        } 
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public void G(ge paramge) {
    Object object = this.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (A(paramge)) {
        nn1 nn1 = (nn1)this.f;
        if (nn1.c) {
          nn1.c = false;
          H(nn1);
        } 
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public void H(nn1 paramnn1) {
    Handler handler = (Handler)this.e;
    int i = paramnn1.b;
    if (i == -2)
      return; 
    if (i <= 0)
      if (i == -1) {
        i = 1500;
      } else {
        i = 2750;
      }  
    handler.removeCallbacksAndMessages(paramnn1);
    handler.sendMessageDelayed(Message.obtain(handler, 0, paramnn1), i);
  }
  
  public Bundle I(String paramString, Bundle paramBundle) {
    HashMap<String, Bundle> hashMap = (HashMap)this.f;
    return (paramBundle != null) ? hashMap.put(paramString, paramBundle) : hashMap.remove(paramString);
  }
  
  public void J() {
    nn1 nn1 = (nn1)this.g;
    if (nn1 != null) {
      this.f = nn1;
      this.g = null;
      ge ge = nn1.a.get();
      if (ge != null) {
        Handler handler = je.y;
        handler.sendMessage(handler.obtainMessage(0, ge.a));
        return;
      } 
      this.f = null;
    } 
  }
  
  public void K(fp1 paramfp1) {
    paramfp1.getClass();
    e6 e6 = new e6(25, this, paramfp1);
    synchronized (this.f) {
      Runnable runnable = ((LinkedHashMap<fp1, Runnable>)this.g).put(paramfp1, e6);
      ((w9)this.c).a.postDelayed(e6, 5400000L);
      return;
    } 
  }
  
  public Object a() {
    switch (this.b) {
      default:
        return new m70(((dd2)this.c).c.b, (File)((sh2)this.e).a(), (sr2)((sh2)this.f).a(), hh2.b((gd2)this.g));
      case 19:
        break;
    } 
    Object object = ((sh2)this.c).a();
    bv2 bv2 = (bv2)((sh2)this.e).a();
    sr2 sr2 = (sr2)((sh2)this.f).a();
    gg2 gg2 = (gg2)((sh2)this.g).a();
    return new hc2((dg2)object, bv2, sr2, gg2);
  }
  
  public void a() {
    bv2 bv2 = (bv2)this.g;
    tb2 tb2 = (tb2)this.c;
    bv2.g.post(new o61(bv2, tb2, 5, 0));
  }
  
  public void b(ZipFile paramZipFile, HashSet paramHashSet) {
    ((gp2)this.g).c((qf2)this.c, paramHashSet, new a42(18, this));
  }
  
  public void c(int paramInt) {
    bv2 bv2 = (bv2)this.g;
    tb2 tb2 = (tb2)this.c;
    bv2.g.post(new o61(bv2, tb2, 6, paramInt));
  }
  
  public void d() {
    Intent intent = (Intent)this.e;
    if (!intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
      intent.putExtra("triggered_from_app_after_verification", true);
      ((Context)this.f).sendBroadcast(intent);
      return;
    } 
    ((bv2)this.g).a.b("Splits copied and verified more than once.", new Object[0]);
  }
  
  public void e(ArrayList<Object> paramArrayList) {
    if (paramArrayList != null) {
      if (!paramArrayList.isEmpty()) {
        int j = paramArrayList.size();
        int i = 0;
        while (i < j) {
          IntentFilter intentFilter = (IntentFilter)paramArrayList.get(i);
          int k = i + 1;
          intentFilter = intentFilter;
          i = k;
          if (intentFilter != null) {
            ArrayList<IntentFilter> arrayList = (ArrayList)this.f;
            i = k;
            if (!arrayList.contains(intentFilter)) {
              arrayList.add(intentFilter);
              i = k;
            } 
          } 
        } 
      } 
      return;
    } 
    l0.l("filters must not be null");
  }
  
  public void f(ua0 paramua0) {
    if (!((ArrayList)this.c).contains(paramua0))
      synchronized ((ArrayList)this.c) {
        ((ArrayList<ua0>)this.c).add(paramua0);
        paramua0.n = true;
        return;
      }  
    m60.o(zLtYiJUm.WPiEgzijBzFObK, paramua0);
  }
  
  public void g(ArrayList<Object> paramArrayList) {
    if (!paramArrayList.isEmpty()) {
      int j = paramArrayList.size();
      int i = 0;
      while (i < j) {
        String str = (String)paramArrayList.get(i);
        int k = i + 1;
        str = str;
        ArrayList<String> arrayList = (ArrayList)this.e;
        if (!TextUtils.isEmpty(str)) {
          i = k;
          if (!arrayList.contains(str)) {
            arrayList.add(str);
            i = k;
          } 
          continue;
        } 
        l0.l("groupMemberId must not be empty");
      } 
    } 
  }
  
  public Object get() {
    return new n2(((fb1)this.c).get(), ((fb1)this.e).get(), ((zv0)this.f).get(), ((fb1)this.g).get(), 16);
  }
  
  public void i(d11 paramd11) {
    if (((LinkedHashSet<d11>)this.g).add(paramd11))
      ((e11)this.e).a(this, paramd11, -1); 
  }
  
  public void j(v31 paramv31, int paramInt) {
    if (paramInt == 1 || paramInt == 0) {
      if (((LinkedHashSet<v31>)this.g).add(paramv31))
        ((e11)this.e).a(this, paramv31, paramInt); 
      return;
    } 
    k91.e(ga1.i("Unsupported priority value: ", paramInt));
  }
  
  public su0 k() {
    Bundle bundle = (Bundle)this.c;
    bundle.putParcelableArrayList("controlFilters", new ArrayList((ArrayList)this.f));
    bundle.putStringArrayList("groupMemberIds", new ArrayList((ArrayList)this.e));
    bundle.putStringArrayList("allowedPackages", new ArrayList((HashSet)this.g));
    return new su0(bundle);
  }
  
  public void l(fp1 paramfp1) {
    paramfp1.getClass();
    synchronized (this.f) {
      Runnable runnable = (Runnable)((LinkedHashMap)this.g).remove(paramfp1);
      if (runnable != null)
        ((w9)this.c).a.removeCallbacks(runnable); 
      return;
    } 
  }
  
  public boolean m(nn1 paramnn1, int paramInt) {
    ge ge = paramnn1.a.get();
    if (ge != null) {
      ((Handler)this.e).removeCallbacksAndMessages(paramnn1);
      Handler handler = je.y;
      handler.sendMessage(handler.obtainMessage(1, paramInt, 0, ge.a));
      return true;
    } 
    return false;
  }
  
  public void o(Object paramObject, ArrayList<Object> paramArrayList, HashSet<Object> paramHashSet) {
    if (paramArrayList.contains(paramObject))
      return; 
    if (!paramHashSet.contains(paramObject)) {
      paramHashSet.add(paramObject);
      ArrayList arrayList = (ArrayList)((zm1)this.e).get(paramObject);
      if (arrayList != null) {
        int i = arrayList.size();
        for (byte b = 0; b < i; b++)
          o(arrayList.get(b), paramArrayList, paramHashSet); 
      } 
      paramHashSet.remove(paramObject);
      paramArrayList.add(paramObject);
      return;
    } 
    l0.f("This graph contains cyclic dependencies");
  }
  
  public void p(d11 paramd11, b11 paramb11) {
    e11 e11 = (e11)this.e;
    e11.getClass();
    if (e11.g == 0) {
      w31 w31 = e11.c(-1);
      e11.f = w31;
      e11.g = -1;
      e11.h = paramd11;
      if (paramb11 != null) {
        if (w31 != null) {
          lb0 lb0;
          l90 l90 = w31.d;
          new kb(paramb11);
          switch (l90.d) {
            case 1:
              lb0 = (lb0)l90.e;
              if (lb0.M(3)) {
                StringBuilder stringBuilder = new StringBuilder("handleOnBackStarted. PREDICTIVE_BACK = true fragment manager ");
                stringBuilder.append(lb0);
                Log.d("FragmentManager", stringBuilder.toString());
              } 
              lb0.w();
              lb0.x(new kb0(lb0), false);
              break;
          } 
        } 
        ip1 ip1 = e11.a;
        g11 g11 = new g11(paramb11);
        ip1.getClass();
        ip1.g(null, g11);
      } 
    } 
  }
  
  public ua0 q(String paramString) {
    sb0 sb0 = (sb0)((HashMap)this.e).get(paramString);
    return (sb0 != null) ? sb0.c : null;
  }
  
  public ua0 r(String paramString) {
    for (sb0 sb0 : ((HashMap)this.e).values()) {
      if (sb0 != null) {
        ua0 ua0 = sb0.c;
        if (!paramString.equals(ua0.h))
          ua0 = ua0.y.c.r(paramString); 
        if (ua0 != null)
          return ua0; 
      } 
    } 
    return null;
  }
  
  public yq1 s(y1 paramy1) {
    ArrayList<yq1> arrayList = (ArrayList)this.f;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      yq1 yq11 = arrayList.get(b);
      if (yq11 != null && yq11.b == paramy1)
        return yq11; 
    } 
    yq1 yq1 = new yq1((Context)this.e, paramy1);
    arrayList.add(yq1);
    return yq1;
  }
  
  public ArrayList t() {
    ArrayList<sb0> arrayList = new ArrayList();
    for (sb0 sb0 : ((HashMap)this.e).values()) {
      if (sb0 != null)
        arrayList.add(sb0); 
    } 
    return arrayList;
  }
  
  public ArrayList u() {
    ArrayList<ua0> arrayList = new ArrayList();
    for (sb0 sb0 : ((HashMap)this.e).values()) {
      if (sb0 != null) {
        arrayList.add(sb0.c);
        continue;
      } 
      arrayList.add(null);
    } 
    return arrayList;
  }
  
  public List v() {
    if (((ArrayList)this.c).isEmpty())
      return Collections.EMPTY_LIST; 
    synchronized ((ArrayList)this.c) {
      ArrayList arrayList = new ArrayList();
      this((ArrayList)this.c);
      return arrayList;
    } 
  }
  
  public String w() {
    if ((String)this.f == null) {
      Map map = (Map)this.e;
      StringWriter stringWriter = new StringWriter();
      try {
        qz1.U(map, stringWriter);
        String str = stringWriter.toString();
        this.f = str;
      } catch (IOException iOException) {
        k91.n(iOException);
        return null;
      } 
    } 
    return (String)this.f;
  }
  
  public String y(String paramString) {
    return (String)((Map)this.e).get(paramString);
  }
  
  public g32 z(ll paramll, String paramString) {
    g32 g32;
    zb0 zb0 = (zb0)this.g;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{zb0}, name=null} */
    try {
      wm0 wm0;
      k32 k32 = (k32)this.c;
      k32.getClass();
      g32 g321 = (g32)k32.a.get(paramString);
      if (paramll.d(g321)) {
        j32 j32 = (j32)this.e;
        if (j32 instanceof vi1) {
          vi1 vi1 = (vi1)j32;
          g321.getClass();
          wm0 = vi1.f;
          if (wm0 != null) {
            j01 j01 = vi1.g;
            j01.getClass();
            qz1.c(g321, j01, wm0);
          } 
        } 
        g321.getClass();
        g32 = g321;
      } else {
        g32 g322;
        uz0 uz0 = new uz0();
        this((gt)this.f);
        fb0 fb0 = ui0.i;
        uz0.a.put(fb0, g32);
        j32 j32 = (j32)this.e;
        try {
          g32 g324 = j32.l((ll)wm0, uz0);
          g322 = g324;
        } catch (AbstractMethodError abstractMethodError) {
          try {
            Class clazz = ((ll)g322).a;
            clazz.getClass();
            g32 g324 = j32.g(clazz, uz0);
            g322 = g324;
          } catch (AbstractMethodError abstractMethodError1) {
            Class clazz = ((ll)g322).a;
            clazz.getClass();
            g322 = j32.a(clazz);
          } 
        } 
        k32 k321 = (k32)this.c;
        k321.getClass();
        g322.getClass();
        g32 g323 = k321.a.put(g32, g322);
        g32 = g322;
        if (g323 != null) {
          g323.b();
          g32 = g322;
        } 
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{zb0}, name=null} */
    return g32;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */