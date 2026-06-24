import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.f;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import in.krosbits.musicolet.FolderExcluderActivity;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.SettingsActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class j01 implements m91, j70, s31, y00, w92, c41, kf1, yi2 {
  public final int b;
  
  public Object c;
  
  public Object e;
  
  public j01(int paramInt) {
    ke0 ke0;
    this.c = new zm1(0);
    this.e = new sp0();
  }
  
  public j01(Context paramContext, p01 paramp01) {
    this.e = new ConcurrentHashMap<Object, Object>();
    this.c = new f(paramContext, ((m01)paramp01.c).b);
  }
  
  public j01(Context paramContext, rn2 paramrn2) {}
  
  public j01(WindowInsetsAnimation.Bounds paramBounds) {
    this.c = b62.g(paramBounds);
    this.e = b62.f(paramBounds);
  }
  
  public j01(bu parambu, u92 paramu92, fb0 paramfb0) {
    this.c = parambu;
    this.e = paramu92;
  }
  
  public j01(c4 paramc4) {
    this.c = paramc4;
    this.e = new Object();
  }
  
  public j01(ha1 paramha1) {
    this.e = paramha1;
  }
  
  public j01(SettingsActivity paramSettingsActivity) {
    LinearLayout linearLayout;
    ms0 ms0 = new ms0((Context)paramSettingsActivity);
    View view = LayoutInflater.from((Context)paramSettingsActivity).inflate(2131492970, null, false);
    int i = 2131296542;
    CheckBox checkBox = (CheckBox)ws2.C(view, 2131296542);
    if (checkBox != null) {
      i = 2131296995;
      LinearLayout linearLayout1 = (LinearLayout)ws2.C(view, 2131296995);
      if (linearLayout1 != null) {
        i = 2131297322;
        RadioButton radioButton = (RadioButton)ws2.C(view, 2131297322);
        if (radioButton != null) {
          i = 2131297334;
          RadioButton radioButton1 = (RadioButton)ws2.C(view, 2131297334);
          if (radioButton1 != null) {
            i = 2131297356;
            RadioButton radioButton2 = (RadioButton)ws2.C(view, 2131297356);
            if (radioButton2 != null) {
              i = 2131297357;
              RadioButton radioButton3 = (RadioButton)ws2.C(view, 2131297357);
              if (radioButton3 != null) {
                i = 2131297369;
                RadioGroup radioGroup = (RadioGroup)ws2.C(view, 2131297369);
                if (radioGroup != null) {
                  i = 2131297376;
                  RadioGroup radioGroup1 = (RadioGroup)ws2.C(view, 2131297376);
                  if (radioGroup1 != null) {
                    i = 2131297559;
                    SwitchCompat switchCompat = (SwitchCompat)ws2.C(view, 2131297559);
                    if (switchCompat != null) {
                      i = 2131297812;
                      TextView textView = (TextView)ws2.C(view, 2131297812);
                      if (textView != null) {
                        linearLayout = (LinearLayout)view;
                        this.e = new yy(linearLayout, checkBox, linearLayout1, radioButton, radioButton1, radioButton2, radioButton3, radioGroup, radioGroup1, switchCompat, textView);
                        ms0.f((View)linearLayout, true);
                        this.c = ms0.p();
                        G();
                        switchCompat.setOnCheckedChangeListener(new d21(this, 0));
                        checkBox.setOnCheckedChangeListener(new d21(this, 1));
                        radioGroup.setOnCheckedChangeListener(new e21(this, 0));
                        radioGroup1.setOnCheckedChangeListener(new e21(this, 1));
                        return;
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    k91.h("Missing required view with ID: ".concat(linearLayout.getResources().getResourceName(i)));
    throw null;
  }
  
  public j01(j01 paramj01, nt1 paramnt1) {
    this.c = paramnt1;
    Objects.requireNonNull(paramj01);
    this.e = paramj01;
  }
  
  public j01(ma1 paramma1, n2 paramn2) {
    this.c = paramma1;
    this.e = paramn2;
  }
  
  public j01(qd1 paramqd1) {
    this.c = paramqd1;
    Object object = new Object();
    ((g22)object).a = 0;
    this.e = object;
  }
  
  public j01(t32 paramt32) {
    this.e = paramt32;
    this.c = new Rect();
  }
  
  public j01(ti1 paramti1) {
    this.c = paramti1;
    this.e = new j01(8, paramti1);
  }
  
  public void A(he1 paramhe1) {
    sp0 sp0 = (sp0)this.e;
    for (int i = sp0.e() - 1; i >= 0; i--) {
      if (paramhe1 == sp0.f(i)) {
        Object[] arrayOfObject = sp0.e;
        Object object1 = arrayOfObject[i];
        Object object2 = ws2.g;
        if (object1 != object2) {
          arrayOfObject[i] = object2;
          sp0.b = true;
        } 
        break;
      } 
    } 
    e32 e32 = (e32)((zm1)this.c).remove(paramhe1);
    if (e32 != null) {
      e32.a = 0;
      e32.b = null;
      e32.c = null;
      e32.d.a(e32);
    } 
  }
  
  public void B() {
    if (((ti1)this.c).h) {
      v5 v52 = (v5)this.e;
      v5 v51 = v52;
      if (v52 == null)
        v51 = new v5(this); 
      this.e = v51;
      try {
        em0.class.getDeclaredConstructor(null);
        v52 = (v5)this.e;
        if (v52 != null) {
          String str = em0.class.getName();
          ((LinkedHashSet<String>)v52.b).add(str);
        } 
        return;
      } catch (NoSuchMethodException noSuchMethodException) {
        String str = em0.class.getSimpleName();
        StringBuilder stringBuilder = new StringBuilder("Class ");
        stringBuilder.append(str);
        stringBuilder.append(" must have default constructor in order to be automatically recreated");
        throw new IllegalArgumentException(stringBuilder.toString(), noSuchMethodException);
      } 
    } 
    tp.f("Can not perform this action after onSaveInstanceState");
  }
  
  public void C(fp1 paramfp1, zb0 paramzb0) {
    paramfp1.getClass();
    n2 n2 = (n2)this.e;
    ww ww = new ww(this, paramfp1, paramzb0, 8);
    ((tk1)n2.c).execute(ww);
  }
  
  public void D(fp1 paramfp1, int paramInt) {
    paramfp1.getClass();
    n2 n2 = (n2)this.e;
    tp1 tp1 = new tp1((ma1)this.c, paramfp1, false, paramInt);
    ((tk1)n2.c).execute(tp1);
  }
  
  public fp1 E(n72 paramn72) {
    synchronized (this.e) {
      return ((c4)this.c).g(paramn72);
    } 
  }
  
  public void F(g01 paramg01) {
    if (paramg01 != null) {
      if (((ConcurrentHashMap)this.e).remove(paramg01) == null) {
        Log.w(ckOPp.BjUnMtwWQfBsTl, "the callback has never been registered");
        return;
      } 
      try {
        ((f)this.c).b(paramg01);
        return;
      } finally {
        paramg01.d(null);
      } 
    } 
    l0.l("callback must not be null");
  }
  
  public void G() {
    RadioGroup radioGroup;
    SharedPreferences sharedPreferences = MyApplication.o();
    int i = 0;
    boolean bool = sharedPreferences.getBoolean("k_b_ornxpvbarwrw", false);
    yy yy = (yy)this.e;
    yy.i.setChecked(bool);
    LinearLayout linearLayout = yy.b;
    if (bool) {
      linearLayout.setVisibility(0);
      bool = MyApplication.o().getBoolean("k_i_oenxpvbowptw", false);
      yy.a.setChecked(bool);
      TextView textView = yy.j;
      if (!bool)
        i = 8; 
      textView.setVisibility(i);
      i = MyApplication.o().getInt("k_i_oenxpvbfltp", 1);
      radioGroup = yy.g;
      if (i == 1) {
        radioGroup.check(yy.d.getId());
      } else {
        radioGroup.check(yy.c.getId());
      } 
      i = MyApplication.o().getInt("k_i_oenxpvbowplps", 1);
      radioGroup = yy.h;
      if (i == 1) {
        radioGroup.check(yy.f.getId());
        return;
      } 
      radioGroup.check(yy.e.getId());
      return;
    } 
    radioGroup.setVisibility(8);
  }
  
  public int H(Context paramContext, he0 paramhe0) {
    n21.m(paramContext);
    n21.m(paramhe0);
    int i = paramhe0.g();
    synchronized ((SparseIntArray)this.c) {
      int j = null.get(i, -1);
      if (j != -1)
        return j; 
      null = (SparseIntArray)this.c;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{android/util/SparseIntArray}, name=null} */
      int k = 0;
      j = 0;
      while (true) {
        try {
          if (j < null.size()) {
            int m = null.keyAt(j);
            if (m > i && null.get(m) == 0) {
              j = k;
            } else {
              j++;
              continue;
            } 
          } else {
            j = -1;
          } 
        } finally {}
        k = j;
        if (j == -1)
          k = ((ke0)this.e).b(paramContext, i); 
        null.put(i, k);
        return k;
      } 
    } 
  }
  
  public void I(boolean paramBoolean, Status paramStatus) {
    Map<? extends K, ? extends V> map;
    synchronized ((Map)this.c) {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this(map);
      synchronized ((Map)this.e) {
        map = new HashMap<K, V>();
        super(null);
        for (Map.Entry<Object, Object> entry1 : hashMap.entrySet()) {
          if (paramBoolean || ((Boolean)entry1.getValue()).booleanValue())
            ((BasePendingResult)entry1.getKey()).c(paramStatus); 
        } 
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
          if (paramBoolean || ((Boolean)entry.getValue()).booleanValue())
            ((nt1)entry.getKey()).c(new l5(paramStatus)); 
        } 
        return;
      } 
    } 
  }
  
  public void J(cn2 paramcn2) {
    try {
      return;
    } finally {
      paramcn2 = null;
      ph2.i("BillingLogger", "Unable to log.", (Throwable)paramcn2);
    } 
  }
  
  public void K(cn2 paramcn2, int paramInt, long paramLong) {
    try {
      qn2 qn2 = (qn2)((rn2)this.c).l();
      qn2.b();
      rn2.C((rn2)qn2.c, paramInt);
      rn2 rn2 = (rn2)qn2.a();
      this.c = rn2;
      return;
    } finally {
      paramcn2 = null;
      ph2.i("BillingLogger", "Unable to log.", (Throwable)paramcn2);
    } 
  }
  
  public void L(cn2 paramcn2, long paramLong, boolean paramBoolean) {
    try {
      bn2 bn2 = (bn2)paramcn2.l();
      vn2 vn2 = (vn2)paramcn2.u().l();
      vn2.b();
      do2.q((do2)vn2.c, paramBoolean);
      bn2.b();
      cn2.p((cn2)bn2.c, (do2)vn2.a());
      cn2 cn21 = (cn2)bn2.a();
      rn2 rn2 = (rn2)this.c;
      return;
    } finally {
      paramcn2 = null;
      ph2.i("BillingLogger", "Unable to log.", (Throwable)paramcn2);
    } 
  }
  
  public void M(cn2 paramcn2, int paramInt, long paramLong, boolean paramBoolean) {
    try {
      qn2 qn2 = (qn2)((rn2)this.c).l();
      qn2.b();
      rn2.C((rn2)qn2.c, paramInt);
      this.c = qn2.a();
      bn2 bn2 = (bn2)paramcn2.l();
      vn2 vn2 = (vn2)paramcn2.u().l();
      vn2.b();
      do2.q((do2)vn2.c, paramBoolean);
      bn2.b();
      cn2.p((cn2)bn2.c, (do2)vn2.a());
      cn2 cn21 = (cn2)bn2.a();
      rn2 rn2 = (rn2)this.c;
      return;
    } finally {
      paramcn2 = null;
      ph2.i("BillingLogger", "Unable to log.", (Throwable)paramcn2);
    } 
  }
  
  public void N(nn2 paramnn2) {
    try {
      eo2 eo2 = fo2.q();
      eo2.c((rn2)this.c);
      eo2.b();
      fo2.t((fo2)eo2.c, paramnn2);
      return;
    } finally {
      paramnn2 = null;
      ph2.i("BillingLogger", "Unable to log.", (Throwable)paramnn2);
    } 
  }
  
  public void O(io2 paramio2) {
    try {
      sb sb = (sb)this.e;
      eo2 eo2 = fo2.q();
      eo2.c((rn2)this.c);
      eo2.b();
      return;
    } finally {
      paramio2 = null;
      ph2.i("BillingLogger", "Unable to log.", (Throwable)paramio2);
    } 
  }
  
  public void P(jo2 paramjo2) {
    if (paramjo2 == null)
      return; 
    try {
      eo2 eo2 = fo2.q();
      eo2.c((rn2)this.c);
      eo2.b();
      return;
    } finally {
      paramjo2 = null;
      ph2.i("BillingLogger", "Unable to log.", (Throwable)paramjo2);
    } 
  }
  
  public void Q(cn2 paramcn2, rn2 paramrn2) {
    if (paramcn2 == null)
      return; 
    try {
      eo2 eo2 = fo2.q();
      eo2.c(paramrn2);
      eo2.b();
      fo2.r((fo2)eo2.c, paramcn2);
      return;
    } finally {
      paramcn2 = null;
      ph2.i("BillingLogger", "Unable to log.", (Throwable)paramcn2);
    } 
  }
  
  public void R(kn2 paramkn2, rn2 paramrn2) {
    if (paramkn2 == null)
      return; 
    try {
      eo2 eo2 = fo2.q();
      eo2.c(paramrn2);
      eo2.b();
      return;
    } finally {
      paramkn2 = null;
      ph2.i("BillingLogger", "Unable to log.", (Throwable)paramkn2);
    } 
  }
  
  public void a(he1 paramhe1, p11 paramp11) {
    zm1 zm1 = (zm1)this.c;
    e32 e322 = (e32)zm1.get(paramhe1);
    e32 e321 = e322;
    if (e322 == null) {
      e321 = e32.a();
      zm1.put(paramhe1, e321);
    } 
    e321.c = paramp11;
    e321.a |= 0x8;
  }
  
  public void accept(Object paramObject1, Object paramObject2) {
    Status status;
    paramObject2 = paramObject2;
    pg2 pg2 = (pg2)this.c;
    String str = (String)this.e;
    paramObject1 = paramObject1;
    n21.q("Not connected to device", pg2.i());
    qd2 qd2 = (qd2)paramObject1.i();
    n5 n5 = g92.g0();
    paramObject1 = qd2.o();
    paramObject1.writeString(str);
    mh2.b((Parcel)paramObject1, n5);
    qd2.p0((Parcel)paramObject1, 5);
    paramObject1 = pg2.s;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=paramObject1} */
    try {
      if (pg2.p != null) {
        status = new Status();
        this(2001, null, null, null);
        l5 l5 = new l5();
        this(status);
        paramObject2.a(l5);
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=paramObject1} */
        return;
      } 
    } finally {}
    ((pg2)status).p = (nt1)paramObject2;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=paramObject1} */
  }
  
  public jb1 b() {
    String str = (String)this.e;
    if (!"first_party".equals(str)) {
      if ((String)this.c != null) {
        if (str != null)
          return new jb1(this); 
        l0.l("Product type must be provided.");
        return null;
      } 
      l0.l("Product id must be provided.");
      return null;
    } 
    l0.l(LHyji.yGuwKCud);
    return null;
  }
  
  public Object c() {
    return new s92(((bu)this.c).b, (ha2)((u92)this.e).c(), new zb0(24));
  }
  
  public void d() {
    int[] arrayOfInt = (int[])this.c;
    if (arrayOfInt != null)
      Arrays.fill(arrayOfInt, -1); 
    this.e = null;
  }
  
  public x62 e(View paramView, x62 paramx62) {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    boolean bool;
    int i2;
    int i3;
    int i4;
    boolean bool1;
    boolean bool2;
    sb sb;
    q20 q20;
    fi0 fi01;
    u62 u62;
    ViewGroup.MarginLayoutParams marginLayoutParams;
    BottomSheetBehavior bottomSheetBehavior;
    fi0 fi02;
    switch (this.b) {
      default:
        sb = (sb)this.c;
        q20 = (q20)this.e;
        i = q20.a;
        j = q20.b;
        i4 = q20.c;
        u62 = paramx62.a;
        fi01 = u62.h(519);
        fi02 = u62.h(32);
        bottomSheetBehavior = (BottomSheetBehavior)sb.c;
        k = fi01.b;
        i2 = fi01.c;
        i3 = fi01.a;
        bottomSheetBehavior.w = k;
        k = paramView.getLayoutDirection();
        bool = true;
        if (k == 1) {
          n = 1;
        } else {
          n = 0;
        } 
        k = paramView.getPaddingBottom();
        m = paramView.getPaddingLeft();
        i1 = paramView.getPaddingRight();
        bool1 = bottomSheetBehavior.o;
        if (bool1) {
          k = paramx62.a();
          bottomSheetBehavior.v = k;
          k += i4;
        } 
        if (bottomSheetBehavior.p) {
          if (n) {
            m = j;
          } else {
            m = i;
          } 
          m += i3;
        } 
        if (bottomSheetBehavior.q) {
          if (!n)
            i = j; 
          i1 = i + i2;
        } 
        marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
        if (bottomSheetBehavior.s && marginLayoutParams.leftMargin != i3) {
          marginLayoutParams.leftMargin = i3;
          j = 1;
        } else {
          j = 0;
        } 
        i = j;
        if (bottomSheetBehavior.t) {
          i = j;
          if (marginLayoutParams.rightMargin != i2) {
            marginLayoutParams.rightMargin = i2;
            i = 1;
          } 
        } 
        if (bottomSheetBehavior.u) {
          n = marginLayoutParams.topMargin;
          j = fi01.b;
          if (n != j) {
            marginLayoutParams.topMargin = j;
            i = bool;
          } 
        } 
        if (i != 0)
          paramView.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams); 
        paramView.setPadding(m, paramView.getPaddingTop(), i1, k);
        bool2 = sb.b;
        if (bool2)
          bottomSheetBehavior.m = fi02.d; 
        if (bool1 || bool2)
          bottomSheetBehavior.P(); 
        return paramx62;
      case 14:
        break;
    } 
    t32 t32 = (t32)this.e;
    x62 x621 = v22.i(paramView, paramx62);
    if (!x621.a.r()) {
      Rect rect = (Rect)this.c;
      rect.left = x621.b();
      rect.top = x621.d();
      rect.right = x621.c();
      rect.bottom = x621.a();
      j = t32.getChildCount();
      for (i = 0; i < j; i++) {
        paramx62 = v22.b(t32.getChildAt(i), x621);
        rect.left = Math.min(paramx62.b(), rect.left);
        rect.top = Math.min(paramx62.d(), rect.top);
        rect.right = Math.min(paramx62.c(), rect.right);
        rect.bottom = Math.min(paramx62.a(), rect.bottom);
      } 
      x621 = x621.f(rect.left, rect.top, rect.right, rect.bottom);
    } 
    return x621;
  }
  
  public void f(Context paramContext, v00 paramv00) {
    a52 a52 = (a52)this.e;
    Intent intent = new Intent(a52.P(), FolderExcluderActivity.class);
    intent.putExtra("EXT_N_FLD", paramv00.b.toString());
    a52.M().startActivityForResult(intent, 1);
  }
  
  public Bundle g(String paramString) {
    ti1 ti1 = (ti1)this.c;
    if (ti1.g) {
      Bundle bundle1;
      Bundle bundle2 = ti1.f;
      if (bundle2 == null)
        return null; 
      if (bundle2.containsKey(paramString)) {
        bundle1 = n21.B(paramString, bundle2);
      } else {
        bundle1 = null;
      } 
      bundle2.remove(paramString);
      if (bundle2.isEmpty())
        ti1.f = null; 
      return bundle1;
    } 
    tp.f("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
    return null;
  }
  
  public Object get() {
    zb0 zb0 = new zb0(20);
    Object object1 = new Object();
    Object object2 = ((fb1)this.c).get();
    fb1 fb1 = (fb1)this.e;
    object2 = object2;
    return new zh1(zb0, (am)object1, ab.f, (fj1)object2, fb1);
  }
  
  public boolean h(n72 paramn72) {
    synchronized (this.e) {
      return ((c4)this.c).a.containsKey(paramn72);
    } 
  }
  
  public void i(int paramInt) {
    int[] arrayOfInt = (int[])this.c;
    if (arrayOfInt == null) {
      arrayOfInt = new int[Math.max(paramInt, 10) + 1];
      this.c = arrayOfInt;
      Arrays.fill(arrayOfInt, -1);
      return;
    } 
    if (paramInt >= arrayOfInt.length) {
      int i;
      for (i = arrayOfInt.length; i <= paramInt; i *= 2);
      int[] arrayOfInt1 = new int[i];
      this.c = arrayOfInt1;
      System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt.length);
      arrayOfInt1 = (int[])this.c;
      Arrays.fill(arrayOfInt1, arrayOfInt.length, arrayOfInt1.length, -1);
    } 
  }
  
  public View j(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    byte b;
    g22 g22 = (g22)this.e;
    qd1 qd1 = (qd1)this.c;
    int i = qd1.d();
    int j = qd1.c();
    if (paramInt2 > paramInt1) {
      b = 1;
    } else {
      b = -1;
    } 
    View view;
    for (view = null; paramInt1 != paramInt2; view = view2) {
      View view1;
      switch (qd1.a) {
        default:
          view1 = qd1.b.F(paramInt1);
          break;
        case 0:
          view1 = qd1.b.F(paramInt1);
          break;
      } 
      int m = qd1.b(view1);
      int k = qd1.a(view1);
      g22.b = i;
      g22.c = j;
      g22.d = m;
      g22.e = k;
      if (paramInt3 != 0) {
        g22.a = paramInt3;
        if (g22.a())
          return view1; 
      } 
      View view2 = view;
      if (paramInt4 != 0) {
        g22.a = paramInt4;
        view2 = view;
        if (g22.a())
          view2 = view1; 
      } 
      paramInt1 += b;
    } 
    return view;
  }
  
  public PlaybackStateCompat k() {
    f f = (f)this.c;
    MediaSessionCompat.Token token = f.e;
    if (token.b() != null)
      try {
        return token.b().j();
      } catch (RemoteException remoteException) {
        Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", (Throwable)remoteException);
      }  
    PlaybackState playbackState = f.a.getPlaybackState();
    if (playbackState != null) {
      PlaybackStateCompat playbackStateCompat = PlaybackStateCompat.b(playbackState);
    } else {
      playbackState = null;
    } 
    return (PlaybackStateCompat)playbackState;
  }
  
  public si1 l() {
    ti1 ti1 = (ti1)this.c;
    fb0 fb0 = ti1.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
    try {
      Iterator<Map.Entry> iterator = ti1.d.entrySet().iterator();
      while (true) {
        boolean bool = iterator.hasNext();
        ti1 = null;
        String str = null;
        if (bool) {
          si1 si11;
          Map.Entry entry = iterator.next();
          String str1 = (String)entry.getKey();
          si1 si12 = (si1)entry.getValue();
          bool = ui0.c(str1, "androidx.lifecycle.internal.SavedStateHandlesProvider");
          str1 = str;
          if (bool)
            si11 = si12; 
          if (si11 != null)
            break; 
          continue;
        } 
        break;
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
    return (si1)ti1;
  }
  
  public boolean m(Preference paramPreference) {
    ((PreferenceGroup)this.c).T = Integer.MAX_VALUE;
    z91 z91 = (z91)this.e;
    Handler handler = z91.h;
    e3 e3 = z91.i;
    handler.removeCallbacks(e3);
    handler.post(e3);
    return true;
  }
  
  public boolean n(v00 paramv00) {
    return paramv00.equals(this.c) ^ true;
  }
  
  public boolean o(View paramView) {
    g22 g22 = (g22)this.e;
    qd1 qd1 = (qd1)this.c;
    int i = qd1.d();
    int j = qd1.c();
    int k = qd1.b(paramView);
    int m = qd1.a(paramView);
    g22.b = i;
    g22.c = j;
    g22.d = k;
    g22.e = m;
    g22.a = 24579;
    return g22.a();
  }
  
  public void p(int paramInt1, int paramInt2) {
    int[] arrayOfInt = (int[])this.c;
    if (arrayOfInt != null && paramInt1 < arrayOfInt.length) {
      int i = paramInt1 + paramInt2;
      i(i);
      arrayOfInt = (int[])this.c;
      System.arraycopy(arrayOfInt, paramInt1, arrayOfInt, i, arrayOfInt.length - paramInt1 - paramInt2);
      Arrays.fill((int[])this.c, paramInt1, i, -1);
      ArrayList arrayList = (ArrayList)this.e;
      if (arrayList != null)
        for (i = arrayList.size() - 1; i >= 0; i--) {
          yo1 yo1 = ((ArrayList<yo1>)this.e).get(i);
          int j = yo1.b;
          if (j >= paramInt1)
            yo1.b = j + paramInt2; 
        }  
    } 
  }
  
  public void q(du2 paramdu2) {
    switch (this.b) {
      default:
        ((Map)((j01)this.e).e).remove(this.c);
        return;
      case 20:
        break;
    } 
    null = (k92)this.c;
    nt1 nt1 = (nt1)this.e;
    synchronized (null.f) {
      null.e.remove(nt1);
      return;
    } 
  }
  
  public void r(int paramInt1, int paramInt2) {
    int[] arrayOfInt = (int[])this.c;
    if (arrayOfInt != null && paramInt1 < arrayOfInt.length) {
      int i = paramInt1 + paramInt2;
      i(i);
      arrayOfInt = (int[])this.c;
      System.arraycopy(arrayOfInt, i, arrayOfInt, paramInt1, arrayOfInt.length - paramInt1 - paramInt2);
      arrayOfInt = (int[])this.c;
      Arrays.fill(arrayOfInt, arrayOfInt.length - paramInt2, arrayOfInt.length, -1);
      ArrayList arrayList = (ArrayList)this.e;
      if (arrayList != null)
        for (int j = arrayList.size() - 1; j >= 0; j--) {
          yo1 yo1 = ((ArrayList<yo1>)this.e).get(j);
          int k = yo1.b;
          if (k >= paramInt1)
            if (k < i) {
              ((ArrayList)this.e).remove(j);
            } else {
              yo1.b = k - paramInt2;
            }  
        }  
    } 
  }
  
  public void s() {
    ((ti1)this.c).a();
  }
  
  public void t(Bundle paramBundle) {
    Bundle bundle;
    ti1 ti1 = (ti1)this.c;
    ui1 ui1 = ti1.a;
    if (!ti1.e)
      ti1.a(); 
    if (((pm0<pm0>)(ui1.N()).i).compareTo(pm0.f) < 0) {
      if (!ti1.g) {
        ui1 ui11 = null;
        ui1 = ui11;
        if (paramBundle != null) {
          ui1 = ui11;
          if (paramBundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key"))
            bundle = n21.B("androidx.lifecycle.BundlableSavedStateRegistry.key", paramBundle); 
        } 
        ti1.f = bundle;
        ti1.g = true;
        return;
      } 
      tp.f(FgdLmmRfTxSFKI.epKHYWXXO);
      return;
    } 
    pm0 pm0 = (pm0)(bundle.N()).i;
    StringBuilder stringBuilder = new StringBuilder("performRestore cannot be called when owner is ");
    stringBuilder.append(pm0);
    throw new IllegalStateException(stringBuilder.toString().toString());
  }
  
  public String toString() {
    StringBuilder stringBuilder2;
    switch (this.b) {
      default:
        return super.toString();
      case 17:
        stringBuilder2 = new StringBuilder("Bounds{lower=");
        stringBuilder2.append(this.c);
        stringBuilder2.append(" upper=");
        stringBuilder2.append(this.e);
        stringBuilder2.append("}");
        return stringBuilder2.toString();
      case 3:
        break;
    } 
    pn1 pn1 = (pn1)this.c;
    String str1 = "[ ";
    String str2 = str1;
    if (pn1 != null) {
      byte b = 0;
      while (true) {
        str2 = str1;
        if (b < 9) {
          StringBuilder stringBuilder = x41.p(str1);
          stringBuilder.append(((pn1)this.c).j[b]);
          stringBuilder.append(" ");
          String str = stringBuilder.toString();
          b++;
          continue;
        } 
        break;
      } 
    } 
    StringBuilder stringBuilder1 = ga1.l(str2, "] ");
    stringBuilder1.append(this.c);
    return stringBuilder1.toString();
  }
  
  public void u(Bundle paramBundle) {
    ti1 ti1 = (ti1)this.c;
    Bundle bundle2 = n21.e(Arrays.<t51>copyOf(new t51[0], 0));
    Bundle bundle1 = ti1.f;
    if (bundle1 != null)
      bundle2.putAll(bundle1); 
    fb0 fb0 = ti1.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
    try {
      for (Map.Entry entry : ti1.d.entrySet()) {
        String str = (String)entry.getKey();
        Bundle bundle = ((si1)entry.getValue()).a();
        str.getClass();
        bundle2.putBundle(str, bundle);
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
    if (!bundle2.isEmpty())
      paramBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2); 
  }
  
  public p11 v(he1 paramhe1, int paramInt) {
    zm1 zm1 = (zm1)this.c;
    int i = zm1.d(paramhe1);
    if (i >= 0) {
      e32 e32 = (e32)zm1.i(i);
      if (e32 != null) {
        int j = e32.a;
        if ((j & paramInt) != 0) {
          p11 p11;
          j &= paramInt ^ 0xFFFFFFFF;
          e32.a = j;
          if (paramInt == 4) {
            p11 = e32.b;
          } else if (paramInt == 8) {
            p11 = e32.c;
          } else {
            l0.l("Must provide flag PRE or POST");
            return null;
          } 
          if ((j & 0xC) == 0) {
            zm1.g(i);
            e32.a = 0;
            e32.b = null;
            e32.c = null;
            e32.d.a(e32);
          } 
          return p11;
        } 
      } 
    } 
    return null;
  }
  
  public void w(g01 paramg01) {
    if (paramg01 != null) {
      if (((ConcurrentHashMap<g01, Boolean>)this.e).putIfAbsent(paramg01, Boolean.TRUE) != null) {
        Log.w("MediaControllerCompat", "the callback has already been registered");
        return;
      } 
      Handler handler = new Handler();
      paramg01.d(handler);
      f f = (f)this.c;
      f.a.registerCallback(paramg01.a, handler);
      Object object = f.b;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        if (f.e.b() != null) {
          h01 h01 = new h01();
          this(paramg01);
          f.d.put(paramg01, h01);
          paramg01.c = h01;
          try {
            f.e.b().L(h01);
            paramg01.c(13, null, null);
          } catch (RemoteException remoteException) {
            Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)remoteException);
          } 
        } else {
          ((g01)remoteException).c = null;
          f.c.add(remoteException);
        } 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      return;
    } 
    l0.l("callback must not be null");
  }
  
  public void x(String paramString, si1 paramsi1) {
    paramsi1.getClass();
    ti1 ti1 = (ti1)this.c;
    fb0 fb0 = ti1.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
    try {
      if (!ti1.d.containsKey(paramString)) {
        ti1.d.put(paramString, paramsi1);
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{fb0}, name=null} */
        return;
      } 
    } finally {}
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    this("SavedStateProvider with the given key is already registered");
    throw illegalArgumentException;
  }
  
  public fp1 y(n72 paramn72) {
    paramn72.getClass();
    synchronized (this.e) {
      return ((c4)this.c).e(paramn72);
    } 
  }
  
  public void z(he1 paramhe1) {
    e32 e32 = (e32)((zm1)this.c).get(paramhe1);
    if (e32 == null)
      return; 
    e32.a &= 0xFFFFFFFE;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */