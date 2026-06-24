package in.krosbits.musicolet;

import ag0;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import d51;
import hc;
import in.krosbits.utils.SgV.zpEN;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import jt1;
import kd;
import km0;
import m92;
import org.jaudiotagger.tag.Tag;
import ss0;
import uf1;
import z21;
import zo2;

public class ReplayGainReadCalcService extends Service {
  public static Set r;
  
  public static boolean s;
  
  public static boolean t;
  
  public static int u;
  
  public static int v;
  
  public static String w;
  
  public static boolean x;
  
  public boolean b;
  
  public boolean c;
  
  public boolean e;
  
  public boolean f;
  
  public boolean g = false;
  
  public final HashSet h = new HashSet();
  
  public final HashSet i = new HashSet();
  
  public km0 j;
  
  public jt1 k;
  
  public boolean l = false;
  
  public boolean m = false;
  
  public boolean n = false;
  
  public boolean o = false;
  
  public final uf1 p = new uf1(this, 0);
  
  public Thread q;
  
  public static String a(km0 paramkm0) {
    try {
      Tag tag = m92.C(paramkm0);
    } finally {
      Exception exception1 = null;
    } 
    Exception exception = null;
    Uri uri = null;
    try {
      Uri uri1 = paramkm0.d().j();
      jt1 jt11 = new jt1();
      this(MyApplication.i.getApplicationContext(), uri1, 0);
      uri1 = uri;
      jt1 jt12 = jt11;
    } finally {
      null = null;
      paramkm0 = null;
    } 
    return (String)SYNTHETIC_LOCAL_VARIABLE_1;
  }
  
  public static void b(HashSet paramHashSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    if (paramHashSet != null && !paramHashSet.isEmpty()) {
      if (t) {
        ag0.O0(2131886550, 0);
        return;
      } 
      u = 0;
      v = paramHashSet.size();
      t = true;
      r = paramHashSet;
      try {
        Context context = MyApplication.i.getApplicationContext();
        Intent intent = new Intent();
        return;
      } finally {
        paramHashSet = null;
        paramHashSet.printStackTrace();
      } 
    } 
  }
  
  public final void c() {
    Thread thread = this.q;
    if (thread == null || !thread.isAlive()) {
      t = true;
      x = false;
      thread = new Thread((Runnable)this.p);
      this.q = thread;
      thread.start();
    } 
    d51 d51 = new d51(MyApplication.i.getApplicationContext(), zpEN.izmDfCrwtS);
    if (!this.n && !this.m) {
      boolean bool;
      String str;
      HashSet hashSet = this.i;
      int m = hashSet.size();
      int i1 = this.h.size();
      int n = hashSet.size();
      km0 km01 = this.j;
      if (km01 != null && !this.o) {
        k = 1;
      } else {
        k = 0;
      } 
      int k = n + i1 + k;
      if (this.l) {
        str = getString(2131886279);
      } else {
        Locale locale = Locale.ENGLISH;
        if (km01 != null) {
          str = km01.g;
        } else {
          str = getString(2131887105);
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m);
        stringBuilder.append("/");
        stringBuilder.append(k);
        stringBuilder.append(" • ");
        stringBuilder.append(str);
        str = stringBuilder.toString();
      } 
      if (this.l || this.j == null) {
        bool = true;
      } else {
        bool = false;
      } 
      w = str;
      u = m;
      v = k;
      s = bool;
    } else {
      boolean bool;
      String str;
      if (this.l) {
        str = getString(2131886279);
      } else {
        str = w;
      } 
      w = str;
      if (this.l || s) {
        bool = true;
      } else {
        bool = false;
      } 
      s = bool;
    } 
    if (v < 0)
      v = 0; 
    int j = u;
    int i = v;
    if (j > i)
      u = i; 
    if (i == 0 && !s)
      s = true; 
    d51.o(2131231383);
    d51.i(getString(2131887142));
    d51.h(w);
    d51.n(v, u, s);
    d51.l(true);
    d51.g(PendingIntent.getActivity(MyApplication.i.getApplicationContext(), 0, new Intent(MyApplication.i.getApplicationContext(), RGReadCalcActivity.class), 167772160, ag0.r()));
    d51.c();
    if (!this.l) {
      String str = getString(2131886278);
      d51.a(2131231115, PendingIntent.getService(MyApplication.i.getApplicationContext(), 0, (new Intent(MyApplication.i.getApplicationContext(), ReplayGainReadCalcService.class)).setAction("st0"), 33554432), str);
    } 
    Notification notification = d51.c();
    if (!this.g) {
      try {
        zo2.U(this, 160, notification);
      } finally {
        notification = null;
      } 
    } else {
      (new z21(MyApplication.i.getApplicationContext())).c(160, notification);
    } 
    RGReadCalcActivity rGReadCalcActivity = RGReadCalcActivity.j0;
    if (rGReadCalcActivity != null)
      rGReadCalcActivity.o0(); 
  }
  
  public final IBinder onBind(Intent paramIntent) {
    return null;
  }
  
  public final void onDestroy() {
    HashSet hashSet = this.i;
    Set set = r;
    if (set != null) {
      set.clear();
      r = null;
    } 
    this.j = null;
    stopForeground(true);
    (new z21(MyApplication.i.getApplicationContext())).b(160);
    RGReadCalcActivity rGReadCalcActivity = RGReadCalcActivity.j0;
    if (rGReadCalcActivity != null)
      rGReadCalcActivity.o0(); 
    SettingsActivity settingsActivity = SettingsActivity.m0;
    if (settingsActivity != null)
      settingsActivity.i0(); 
    try {
      ss0 ss0 = MusicActivity.S0;
      if (ss0 != null && ss0.isShowing()) {
        Integer integer = ss0.v;
        if (integer != null) {
          km0 km01 = (km0)MyApplication.j.c.e.get(integer);
          if (hashSet.contains(km01))
            MusicActivity.F0((Context)MusicActivity.R0, km01, new int[0]); 
        } 
      } 
    } finally {}
    if (!this.l && hashSet.size() > 0 && this.f) {
      StringBuilder stringBuilder = new StringBuilder("✔️ ");
      stringBuilder.append(getString(2131886467));
      stringBuilder.append(" : ");
      stringBuilder.append(getString(2131887142));
      ag0.P0(1, stringBuilder.toString(), true);
    } 
    if (!this.l && MusicService.g1 && MusicService.P0 != null && MusicService.F0)
      MusicService.Z(); 
    if (!this.l && MusicService.P0 != null && MusicService.F0)
      try {
        hc hc = MusicService.E0;
        if (hc instanceof kd) {
          kd kd = (kd)hc;
          km0 km01 = MusicService.P0.V(1, true, true, new String[1]);
          if (km01 != null && hashSet.contains(km01) && (kd.u > 0 || kd.t)) {
            kd.q = null;
            kd.L();
          } 
        } 
      } finally {
        hashSet = null;
      }  
    super.onDestroy();
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    Set set;
    String str = paramIntent.getAction();
    if ("st1".equals(str)) {
      set = r;
      if (set != null) {
        set.removeAll(this.i);
        this.h.addAll(r);
      } 
      this.b = paramIntent.getBooleanExtra("fr", false);
      this.c = paramIntent.getBooleanExtra("fa", false);
      this.e = paramIntent.getBooleanExtra("ca", false);
      this.f = paramIntent.getBooleanExtra("sfa", false);
      c();
      Set set1 = r;
      if (set1 != null) {
        set1.clear();
        r = null;
      } 
    } else if ("st0".equals(set)) {
      this.l = true;
      x = true;
      c();
      jt1 jt11 = this.k;
      if (jt11 != null)
        jt11.b.h(); 
    } 
    return 2;
  }
  
  public final void onTimeout(int paramInt) {
    super.onTimeout(paramInt);
    this.g = true;
    stopForeground(2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\ReplayGainReadCalcService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */