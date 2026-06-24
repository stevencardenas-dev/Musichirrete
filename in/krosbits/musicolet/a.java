package in.krosbits.musicolet;

import a51;
import ag0;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import c70;
import c81;
import cn;
import g92;
import im0;
import in.krosbits.nativex.NativeLibx;
import java.io.File;
import java.util.Calendar;
import l51;
import lm0;
import n0;
import n21;
import qz1;
import tb;
import ui0;
import wf2;
import wn1;
import ws2;
import z51;

public final class a extends AsyncTask {
  public final void a() {
    publishProgress(new Object[0]);
  }
  
  public final Object doInBackground(Object... paramVarArgs) {
    /* monitor enter ThisExpression{ObjectType{in/krosbits/musicolet/a}} */
    try {
      long l = System.currentTimeMillis();
      SharedPreferences sharedPreferences = MyApplication.o();
      b = 0;
      MyApplication.a(sharedPreferences.getInt("FLSHFAQ", 0));
      NativeLibx nativeLibx = new NativeLibx();
      super();
      boolean bool2 = NativeLibx.c;
      bool1 = true;
      if (!bool2) {
        System.loadLibrary("_musicolet");
        NativeLibx.c = true;
      } 
      MyApplication.u = nativeLibx;
      nativeLibx.list();
      try {
        Object object = NativeLibx.a;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          if (!NativeLibx.b) {
            NativeLibx.b = true;
            object.notifyAll();
          } 
        } finally {}
      } finally {
        nativeLibx = null;
      } 
      MyApplication.w = 1;
      MyApplication.m = null;
      publishProgress(new Object[0]);
      b.d(MyApplication.i.getApplicationContext());
      l1 = System.currentTimeMillis();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("AI:U?");
      stringBuilder.append(l1 - l);
      n21.F(stringBuilder.toString());
      MyApplication.F.m(false);
      try {
        MyApplication.f = BluetoothAdapter.getDefaultAdapter().getName();
      } finally {}
      n21.F("AI:t1");
      MyApplication.l = MyApplication.j();
      n21.F("AI:t2");
      int[] arrayOfInt = MyApplication.l;
      if (arrayOfInt != null && arrayOfInt.length > 0) {
        MyApplication.w = -1;
        MyApplication.m = MyApplication.i.getApplicationContext().getString(2131886969);
        c70 c701 = new c70();
        this(1);
        MyApplication.x = c701;
        IntentFilter intentFilter1 = new IntentFilter();
        this("ACTPG");
        cn.o(MyApplication.i.getApplicationContext()).t((BroadcastReceiver)MyApplication.x, intentFilter1);
        publishProgress(new Object[0]);
        QsService.a(MyApplication.i.getApplicationContext());
        /* monitor exit ThisExpression{ObjectType{in/krosbits/musicolet/a}} */
        return null;
      } 
    } finally {}
    MyApplication.m = null;
    ws2.i0();
    MyApplication.w = 2;
    MyApplication.j.getReadableDatabase();
    boolean bool = MyApplication.g().getBoolean("FSP_PRDVSFG", false);
    if (bool)
      try {
        MyApplication.m = MyApplication.i.getApplicationContext().getString(2131886400);
        publishProgress(new Object[0]);
        wn1.z(MyApplication.j.getWritableDatabase());
        MyApplication.g().edit().remove("FSP_PRDVSFG").apply();
        MyApplication.m = null;
        publishProgress(new Object[0]);
      } finally {
        paramVarArgs = null;
        paramVarArgs.printStackTrace();
        ag0.O0(2131886515, 1);
        try {
          Thread.sleep(5000L);
        } finally {}
      }  
    wn1 wn1 = MyApplication.j;
    if (wn1.c == null) {
      wn1.o();
      MyApplication.q = null;
      MyApplication.h();
      c81.g(MyApplication.i.getApplicationContext());
      c81.c(MyApplication.i.getApplicationContext());
    } 
    long l2 = System.currentTimeMillis();
    StringBuilder stringBuilder2 = new StringBuilder();
    this();
    byte b;
    boolean bool1;
    stringBuilder2.append("AI:lb?");
    stringBuilder2.append(l2 - l1);
    n21.F(stringBuilder2.toString());
    l51.j();
    MyApplication myApplication = MyApplication.i;
    myApplication.getClass();
    lm0.M = Calendar.getInstance();
    IntentFilter intentFilter = new IntentFilter();
    this("android.intent.action.DATE_CHANGED");
    intentFilter.addAction("android.intent.action.TIME_SET");
    intentFilter.addAction("android.intent.action.WALLPAPER_CHANGED");
    c70 c70 = new c70();
    this(0);
    n0.s((ContextWrapper)myApplication, (BroadcastReceiver)c70, intentFilter);
    a51.b();
    long l1 = System.currentTimeMillis();
    StringBuilder stringBuilder1 = new StringBuilder();
    this();
    stringBuilder1.append("AI:pf?");
    stringBuilder1.append(l1 - l2);
    n21.F(stringBuilder1.toString());
    l1 = MyApplication.x().getLong("stlldcatbkp", 0L);
    l2 = MyApplication.x().getLong("stllatbkp", 0L);
    if (l1 > 0L && l1 < System.currentTimeMillis() && l2 < l1 && MyApplication.o().getBoolean("k_b_atbkpe", true))
      MyApplication.R = true; 
    tb.j();
    int i = Build.VERSION.SDK_INT;
    bool = bool1;
    if (i >= 26)
      if (!TextUtils.isEmpty(qz1.A("ro.build.rom.id"))) {
        bool = bool1;
      } else {
        bool = false;
      }  
    ag0.k = bool;
    bool = MyApplication.g().getBoolean("FSP_WPA", false);
    ag0.l = bool;
    if (bool)
      MyApplication.g().edit().putBoolean("FSP_WPA", false).commit(); 
    z51.C = MyApplication.g().getBoolean("FSP_PLDC", false);
    ag0.f = MyApplication.x().getBoolean("s_udltsbtotga", false);
    if (i == 33) {
      wf2.S();
      wf2.U();
    } 
    if (i >= 33)
      wf2.T(); 
    ui0.t();
    g92.z();
    try {
      File[] arrayOfFile = MyApplication.i.getApplicationContext().getCacheDir().listFiles();
      i = arrayOfFile.length;
    } finally {
      stringBuilder1 = null;
    } 
    MyApplication.w = 3;
    /* monitor exit ThisExpression{ObjectType{in/krosbits/musicolet/a}} */
    return null;
  }
  
  public final void onPostExecute(Object paramObject) {
    super.onPostExecute(paramObject);
    if (MyApplication.w == 3) {
      MyApplication.i.B();
      if (!b.d) {
        if (MyApplication.o().getBoolean("k_b_atsc", true)) {
          boolean bool;
          if (b.e) {
            b.e = false;
            bool = true;
          } else {
            bool = false;
          } 
          int i = MyApplication.b;
          int j = b.c;
          if (i < j)
            MyApplication.b = j; 
          paramObject = new im0(false, bool, false);
          ((im0)paramObject).M = true;
          ((im0)paramObject).N = true;
          im0.w((im0)paramObject);
          return;
        } 
        im0.m();
      } 
    } 
  }
  
  public final void onProgressUpdate(Object... paramVarArgs) {
    super.onProgressUpdate(paramVarArgs);
    String str = MyApplication.f;
    Intent intent = new Intent("ACTASCH");
    cn.o(MyApplication.i.getApplicationContext()).v(intent);
    MyApplication.z();
    StringBuilder stringBuilder = new StringBuilder("AI:s?");
    stringBuilder.append(MyApplication.w);
    stringBuilder.append(";s?");
    stringBuilder.append(MyApplication.m);
    n21.F(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */