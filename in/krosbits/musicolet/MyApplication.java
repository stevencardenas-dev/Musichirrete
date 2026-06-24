package in.krosbits.musicolet;

import a01;
import ag0;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.MediaStore;
import c;
import c70;
import cn;
import com.google.android.gms.common.annotation.zQ.PVdqHjWVkmL;
import com.pairip.StartupLauncher;
import dd1;
import hi;
import im0;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import in.krosbits.nativex.NativeLibx;
import io1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jm1;
import ju;
import km0;
import l3;
import lm0;
import m92;
import n21;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;
import org.json.JSONArray;
import p3;
import u00;
import uo0;
import v00;
import v61;
import v90;
import w00;
import wk1;
import wn1;
import ws2;
import xn1;
import yk1;
import yp1;
import z51;
import zi1;
import zo2;

public class MyApplication extends Application implements Thread.UncaughtExceptionHandler {
  public static SharedPreferences A;
  
  public static SharedPreferences B;
  
  public static SharedPreferences C;
  
  public static final ThreadPoolExecutor D;
  
  public static final Handler E = new Handler(Looper.getMainLooper());
  
  public static yp1 F;
  
  public static v90 G;
  
  public static a01 H;
  
  public static MediaRouter I;
  
  public static AudioManager J;
  
  public static AlarmManager K;
  
  public static PowerManager L;
  
  public static NotificationManager M;
  
  public static boolean N = false;
  
  public static a O;
  
  public static final ExecutorService P = Executors.newSingleThreadExecutor((ThreadFactory)new Object());
  
  public static long Q;
  
  public static boolean R;
  
  public static Boolean S;
  
  public static Object a0;
  
  public static volatile transient int a0f9;
  
  public static volatile transient int a0fa;
  
  public static Object a1;
  
  public static int b;
  
  public static Object c;
  
  public static String f;
  
  public static boolean g;
  
  public static boolean h;
  
  public static MyApplication i;
  
  public static wn1 j;
  
  public static c k;
  
  public static int[] l;
  
  public static String m;
  
  public static Notification n;
  
  public static boolean o;
  
  public static float p;
  
  public static wk1 q;
  
  public static String r;
  
  public static int s;
  
  public static NativeLibx u;
  
  public static v61 v;
  
  public static int w;
  
  public static c70 x;
  
  public static SharedPreferences y;
  
  public static SharedPreferences z;
  
  public Thread.UncaughtExceptionHandler e;
  
  public volatile transient boolean t;
  
  static {
    if (Build.VERSION.SDK_INT == 29) {
      String str = Build.MODEL;
      if (str != null)
        str.toLowerCase(Locale.ENGLISH).startsWith("realme x"); 
    } 
  }
  
  public static void A() {
    O = (a)new AsyncTask();
    w = 0;
    z();
    O.executeOnExecutor(P, new Object[0]);
  }
  
  public static Object a() {
    return i.getApplicationContext();
  }
  
  public static Object b() {
    return i.getBaseContext();
  }
  
  public static AlarmManager c() {
    if (K == null)
      K = (AlarmManager)i.getApplicationContext().getSystemService("alarm"); 
    return K;
  }
  
  public static Context d() {
    return i.getApplicationContext();
  }
  
  public static AudioManager e() {
    if (J == null)
      J = (AudioManager)i.getApplicationContext().getSystemService("audio"); 
    return J;
  }
  
  public static void f() {
    if (N)
      return; 
    N = true;
    (new Thread((Runnable)new l3(8))).start();
  }
  
  public static SharedPreferences g() {
    if (y == null)
      y = i.getApplicationContext().getSharedPreferences("FSP", 0); 
    return y;
  }
  
  public static wk1 h() {
    // Byte code:
    //   0: ldc in/krosbits/musicolet/MyApplication
    //   2: monitorenter
    //   3: getstatic in/krosbits/musicolet/MyApplication.q : Lwk1;
    //   6: ifnull -> 12
    //   9: goto -> 27
    //   12: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   15: getfield c : Llm0;
    //   18: astore_0
    //   19: aload_0
    //   20: ifnull -> 40
    //   23: aload_0
    //   24: invokestatic t : (Llm0;)V
    //   27: getstatic in/krosbits/musicolet/MyApplication.q : Lwk1;
    //   30: astore_0
    //   31: ldc in/krosbits/musicolet/MyApplication
    //   33: monitorexit
    //   34: aload_0
    //   35: areturn
    //   36: astore_0
    //   37: goto -> 116
    //   40: new java/lang/IllegalStateException
    //   43: astore_0
    //   44: aload_0
    //   45: ldc_w 'MA.GQSW=N'
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: aload_0
    //   52: athrow
    //   53: astore_0
    //   54: aload_0
    //   55: invokevirtual printStackTrace : ()V
    //   58: new java/util/Stack
    //   61: astore_1
    //   62: aload_1
    //   63: invokespecial <init> : ()V
    //   66: new xn1
    //   69: astore_0
    //   70: new java/util/ArrayList
    //   73: astore_2
    //   74: aload_2
    //   75: invokespecial <init> : ()V
    //   78: aload_0
    //   79: iconst_0
    //   80: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   83: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   86: aload_1
    //   87: invokestatic O : (Landroid/content/Context;Ljava/util/Stack;)Ljava/lang/String;
    //   90: aload_2
    //   91: aconst_null
    //   92: invokespecial <init> : (ILjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   95: aload_1
    //   96: aload_0
    //   97: invokevirtual add : (Ljava/lang/Object;)Z
    //   100: pop
    //   101: new wk1
    //   104: dup
    //   105: aload_1
    //   106: iconst_0
    //   107: invokespecial <init> : (Ljava/util/Stack;I)V
    //   110: astore_0
    //   111: ldc in/krosbits/musicolet/MyApplication
    //   113: monitorexit
    //   114: aload_0
    //   115: areturn
    //   116: ldc in/krosbits/musicolet/MyApplication
    //   118: monitorexit
    //   119: aload_0
    //   120: athrow
    // Exception table:
    //   from	to	target	type
    //   3	9	36	finally
    //   12	19	36	finally
    //   23	27	36	finally
    //   27	31	36	finally
    //   40	53	53	java/lang/IllegalStateException
    //   40	53	36	finally
    //   54	111	36	finally
    //   116	119	36	finally
  }
  
  public static int i() {
    return a0fa;
  }
  
  public static int[] j() {
    ArrayList<Integer> arrayList = new ArrayList(5);
    SharedPreferences sharedPreferences = x();
    String str = LHyji.Rdrpgjwvy;
    byte b = 0;
    boolean bool = sharedPreferences.getBoolean(str, false);
    if (!WelcomeActivity.l0(1))
      arrayList.add(Integer.valueOf(1)); 
    if (!F.p() && (!bool || !WelcomeActivity.l0(4)))
      arrayList.add(Integer.valueOf(4)); 
    if (!bool) {
      arrayList.add(0, Integer.valueOf(0));
      arrayList.add(Integer.valueOf(3));
    } 
    int[] arrayOfInt = new int[arrayList.size()];
    while (b < arrayList.size()) {
      arrayOfInt[b] = ((Integer)arrayList.get(b)).intValue();
      b++;
    } 
    return arrayOfInt;
  }
  
  public static boolean k() {
    return (w == 4);
  }
  
  public static boolean l() {
    if (S == null) {
      S = Boolean.FALSE;
      try {
        String[] arrayOfString = (i.getApplicationContext().getPackageManager().getPackageInfo(i.getApplicationContext().getPackageName(), 0)).splitNames;
        StringBuilder stringBuilder = new StringBuilder();
        this("MA>iua:");
        stringBuilder.append(Arrays.toString((Object[])arrayOfString));
        n21.F(stringBuilder.toString());
      } finally {
        Exception exception = null;
      } 
    } 
    return S.booleanValue();
  }
  
  public static MediaRouter m() {
    if (I == null)
      I = (MediaRouter)i.getApplicationContext().getSystemService("media_router"); 
    return I;
  }
  
  public static NotificationManager n() {
    if (M == null)
      M = (NotificationManager)i.getApplicationContext().getSystemService("notification"); 
    return M;
  }
  
  public static SharedPreferences o() {
    if (z == null)
      z = i.getApplicationContext().getSharedPreferences("PP", 0); 
    return z;
  }
  
  public static PowerManager p() {
    if (L == null)
      L = (PowerManager)i.getApplicationContext().getSystemService("power"); 
    return L;
  }
  
  public static boolean q() {
    n21.F("MA rbsm: ");
    yp1 yp11 = F;
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool1 = bool3;
    if (yp11 != null) {
      bool1 = bool3;
      if (yp11.b != null) {
        Intent intent;
        yp1 yp12 = new yp1();
        yp12.m(false);
        if (!yp12.p() && yp12.a) {
          yp12.a = false;
          n21.F("MA rsm:rqrSS");
          try {
            Context context = i.getApplicationContext();
            intent = new Intent();
            this(i.getApplicationContext(), MusicService.class);
            context.stopService(intent);
          } finally {}
          A();
          return true;
        } 
        HashSet<v00> hashSet = new HashSet(F.j());
        ArrayList<Object> arrayList = intent.j();
        int i = arrayList.size();
        byte b = 0;
        while (b < i) {
          v00 v00 = (v00)arrayList.get(b);
          b++;
          v00 = v00;
          if (hashSet.contains(v00)) {
            hashSet.remove(v00);
            continue;
          } 
          hashSet.add(v00);
        } 
        F = (yp1)intent;
        n21.F("MA rsm>smc");
        bool1 = bool2;
        if (!hashSet.isEmpty()) {
          bool1 = bool2;
          if (F.p()) {
            n21.F(CKYHNesT.vCOBGFGvOI);
            im0 im0 = new im0(true, false, false);
            im0.o();
            arrayList = new ArrayList<Object>(hashSet.size());
            for (v00 v00 : hashSet) {
              if (!v00.f() || (im0.a(v00.b.toString()) == null && (im0.q || im0.y(v00, false) == null) && im0.j(v00)))
                arrayList.add(v00); 
            } 
            if (!arrayList.isEmpty()) {
              n21.F("MA rsb: st");
              im0 im01 = new im0(true, false, false);
              im01.K = true;
              im01.N = true;
              im0.w(im01);
            } 
            bool1 = true;
          } 
        } 
        zi1.b();
      } 
    } 
    return bool1;
  }
  
  public static void r() {
    H = (a01)new ContentObserver(E);
    ContentResolver contentResolver = i.getApplicationContext().getContentResolver();
    Iterator<Uri> iterator = wn1.d().iterator();
    while (iterator.hasNext())
      contentResolver.registerContentObserver(iterator.next(), true, (ContentObserver)H); 
    if (o().getBoolean("k_b_scvfl", false)) {
      iterator = wn1.m().iterator();
      while (iterator.hasNext())
        contentResolver.registerContentObserver(iterator.next(), true, (ContentObserver)H); 
    } 
  }
  
  public static void s() {
    Intent intent = (new Intent("a_thchal")).setClass(i.getApplicationContext(), MyReceiver.class);
    PendingIntent pendingIntent = PendingIntent.getBroadcast(i.getApplicationContext(), 0, intent, 167772160);
    c().cancel(pendingIntent);
    Q = 0L;
    if (Integer.parseInt(o().getString("THMR_BT", "2")) == 3) {
      int i = o().getInt("k_i_dstt", 360);
      int j = o().getInt("k_i_dedt", 1079);
      if (i != 0 || j != 1439) {
        Calendar calendar = Calendar.getInstance();
        calendar.getTimeInMillis();
        int k = calendar.get(11);
        k = calendar.get(12) + k * 60;
        if (k < i) {
          calendar.set(11, i / 60);
          calendar.set(12, i % 60);
          calendar.set(13, 5);
        } else if (k <= j) {
          i = j + 1;
          calendar.set(11, i / 60);
          calendar.set(12, i % 60);
          calendar.set(13, 5);
        } else {
          calendar.add(5, 1);
          calendar.set(11, i / 60);
          calendar.set(12, i % 60);
          calendar.set(13, 5);
        } 
        Q = calendar.getTimeInMillis();
        uo0.b(calendar);
        c().set(1, Q, pendingIntent);
      } 
    } 
  }
  
  public static void t(lm0 paramlm0) {
    n21.F(LHyji.KrCppqpqkXG);
    File file2 = new File(i.getApplicationContext().getFilesDir(), "0.qstk");
    km0 km0 = yk1.a;
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{yk1}} */
    try {
    
    } finally {
      paramlm0 = null;
      /* monitor exit TypeReferenceDotClassExpression{ObjectType{yk1}} */
    } 
    q = (wk1)paramlm0;
    int i = 0;
    if (paramlm0 == null || ((wk1)paramlm0).b.isEmpty()) {
      Stack<xn1> stack = new Stack();
      ArrayList arrayList = new ArrayList();
      stack.add(new xn1(0, ag0.O(i.getApplicationContext(), stack), arrayList, null));
      q = new wk1(stack, 0);
    } 
    File file1 = new File(i.getApplicationContext().getFilesDir(), "a.qstk");
    if (file1.isFile()) {
      n21.F("MA>UFWWA: e");
      try {
        km0 = yk1.a;
        DataInputStream dataInputStream = new DataInputStream();
        FileInputStream fileInputStream = new FileInputStream();
        this(file1);
        this(fileInputStream);
        int k = dataInputStream.readInt();
        int[] arrayOfInt = new int[k];
        int j;
        for (j = 0; j < k; j++)
          arrayOfInt[j] = dataInputStream.readInt(); 
        dataInputStream.close();
      } finally {
        file1 = null;
      } 
    } 
  }
  
  public static SharedPreferences u() {
    if (A == null)
      A = i.getApplicationContext().getSharedPreferences("RPN", 0); 
    return A;
  }
  
  public static SharedPreferences v() {
    if (C == null)
      C = i.getApplicationContext().getSharedPreferences("SAFP", 0); 
    return C;
  }
  
  public static void w() {
    Exception exception;
    String str;
    Process process2 = null;
    Process process1 = process2;
    try {
      BufferedWriter bufferedWriter;
      uo0 uo0 = uo0.b(Calendar.getInstance());
      process1 = process2;
      str = ju.a("yyyy-MM-dd HH-mm-ss").b(uo0);
      process1 = process2;
      String str1 = str.concat(".txt");
      process1 = process2;
      boolean bool = F.p();
      String str2 = "";
      int i = 2;
      if (bool) {
        process1 = process2;
        v00 v002 = ag0.y().A("more_logs");
        process1 = process2;
        if (!v002.f()) {
          process1 = process2;
          v002.E();
        } 
        process1 = process2;
        ArrayList<v00> arrayList = v002.D(null);
        process1 = process2;
        if (arrayList.size() > 2) {
          process1 = process2;
          w00 w00 = new w00();
          process1 = process2;
          this(6);
          process1 = process2;
          arrayList.sort((Comparator)w00);
          while (true) {
            process1 = process2;
            if (i < arrayList.size()) {
              process1 = process2;
              ((v00)arrayList.get(i)).e();
              i++;
              continue;
            } 
            break;
          } 
        } 
        process1 = process2;
        v00 v001 = v002.A(str1);
        process1 = process2;
        bufferedWriter = new BufferedWriter();
        process1 = process2;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter();
        process1 = process2;
        this(ws2.o((u00)v001));
        process1 = process2;
        this(outputStreamWriter);
      } else {
        process1 = process2;
        if (Build.VERSION.SDK_INT >= 30) {
          process1 = process2;
          ContentResolver contentResolver = i.getApplicationContext().getContentResolver();
          process1 = process2;
          StringBuilder stringBuilder = new StringBuilder();
          process1 = process2;
          this();
          process1 = process2;
          stringBuilder.append(Environment.DIRECTORY_DOCUMENTS);
          process1 = process2;
          stringBuilder.append("/Musicolet/logs/more_logs/");
          process1 = process2;
          String str3 = stringBuilder.toString();
          process1 = process2;
          Uri uri2 = MediaStore.Files.getContentUri("external_primary");
          process1 = process2;
          Cursor cursor = contentResolver.query(uri2, new String[] { "_id" }, "relative_path like ? ", new String[] { str3 }, "date_modified");
          if (cursor != null) {
            process1 = process2;
            i = cursor.getCount();
            while (true) {
              process1 = process2;
              if (cursor.moveToNext()) {
                process1 = process2;
                if (cursor.getPosition() < i - 2) {
                  process1 = process2;
                  int j = cursor.getInt(0);
                  process1 = process2;
                  StringBuilder stringBuilder1 = new StringBuilder();
                  process1 = process2;
                  this();
                  process1 = process2;
                  stringBuilder1.append("");
                  process1 = process2;
                  stringBuilder1.append(j);
                  process1 = process2;
                  contentResolver.delete(uri2, "_id=?", new String[] { stringBuilder1.toString() });
                  continue;
                } 
              } 
              break;
            } 
            process1 = process2;
            cursor.close();
          } 
          process1 = process2;
          ContentValues contentValues = new ContentValues();
          process1 = process2;
          this();
          process1 = process2;
          contentValues.put("_display_name", (String)bufferedWriter);
          process1 = process2;
          contentValues.put("relative_path", str3);
          process1 = process2;
          Uri uri1 = contentResolver.insert(uri2, contentValues);
          process1 = process2;
          OutputStreamWriter outputStreamWriter = new OutputStreamWriter();
          process1 = process2;
          this(contentResolver.openOutputStream(uri1, "wt"));
          process1 = process2;
          BufferedWriter bufferedWriter1 = new BufferedWriter(outputStreamWriter);
        } else {
          bufferedWriter = null;
        } 
      } 
    } finally {}
    if (exception != null) {
      String str1;
      process1 = process2;
      StringBuilder stringBuilder2 = new StringBuilder();
      process1 = process2;
      this();
      process1 = process2;
      stringBuilder2.append("Log file created at: ");
      process1 = process2;
      stringBuilder2.append(str);
      process1 = process2;
      exception.write(stringBuilder2.toString());
      process1 = process2;
      exception.newLine();
      process1 = process2;
      StringBuilder stringBuilder1 = new StringBuilder();
      process1 = process2;
      this();
      process1 = process2;
      stringBuilder1.append("Device:");
      process1 = process2;
      if (l())
        str1 = " "; 
      process1 = process2;
      stringBuilder1.append(str1);
      process1 = process2;
      stringBuilder1.append(Build.MANUFACTURER);
      process1 = process2;
      stringBuilder1.append(">");
      process1 = process2;
      stringBuilder1.append(Build.MODEL);
      process1 = process2;
      stringBuilder1.append(">");
      process1 = process2;
      stringBuilder1.append(Build.DEVICE);
      process1 = process2;
      stringBuilder1.append(" API:");
      process1 = process2;
      stringBuilder1.append(Build.VERSION.SDK_INT);
      process1 = process2;
      stringBuilder1.append(" ABI:");
      process1 = process2;
      stringBuilder1.append(Arrays.toString((Object[])Build.SUPPORTED_ABIS));
      process1 = process2;
      exception.write(stringBuilder1.toString());
      process1 = process2;
      exception.newLine();
      process1 = process2;
      exception.write("App: Musicolet 6.14 build530");
      process1 = process2;
      exception.newLine();
      process1 = process2;
      exception.write("------------");
      process1 = process2;
      exception.newLine();
      process1 = process2;
      Process process = Runtime.getRuntime().exec("logcat -d");
      process1 = process;
      BufferedReader bufferedReader = new BufferedReader();
      process1 = process;
      InputStreamReader inputStreamReader = new InputStreamReader();
      process1 = process;
      this(process.getInputStream());
      process1 = process;
      this(inputStreamReader);
      while (true) {
        process1 = process;
        String str2 = bufferedReader.readLine();
        if (str2 != null) {
          process1 = process;
          exception.write(str2);
          process1 = process;
          exception.newLine();
          continue;
        } 
        process1 = process;
        bufferedReader.close();
        process1 = process;
        exception.close();
        process1 = process;
        ag0.P0(1, "Logs file generated!", true);
        process1 = process;
        if (process1 != null)
          process1.destroy(); 
        break;
      } 
    } 
  }
  
  public static SharedPreferences x() {
    if (B == null)
      B = i.getApplicationContext().getSharedPreferences("USP", 0); 
    return B;
  }
  
  public static String y(int paramInt) {
    return i.getApplicationContext().getString(paramInt);
  }
  
  public static void z() {
    // Byte code:
    //   0: new d51
    //   3: dup
    //   4: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   7: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   10: ldc_w 'in.krosbits.musicolet.nid.2'
    //   13: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   16: astore #5
    //   18: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   21: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   24: ldc_w 2131886188
    //   27: invokevirtual getString : (I)Ljava/lang/String;
    //   30: astore_3
    //   31: getstatic in/krosbits/musicolet/MyApplication.m : Ljava/lang/String;
    //   34: astore_1
    //   35: invokestatic w : ()Landroid/app/PendingIntent;
    //   38: astore_2
    //   39: getstatic in/krosbits/musicolet/MyApplication.w : I
    //   42: iconst_m1
    //   43: if_icmpne -> 152
    //   46: getstatic in/krosbits/musicolet/MyApplication.l : [I
    //   49: astore #4
    //   51: aload #4
    //   53: ifnull -> 152
    //   56: aload #4
    //   58: arraylength
    //   59: ifle -> 152
    //   62: aload #4
    //   64: iconst_0
    //   65: iaload
    //   66: ifne -> 85
    //   69: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   72: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   75: ldc_w 2131887573
    //   78: invokevirtual getString : (I)Ljava/lang/String;
    //   81: astore_2
    //   82: goto -> 102
    //   85: getstatic in/krosbits/musicolet/MyApplication.m : Ljava/lang/String;
    //   88: astore_2
    //   89: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   92: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   95: ldc_w 2131886635
    //   98: invokevirtual getString : (I)Ljava/lang/String;
    //   101: astore_1
    //   102: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   105: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   108: iconst_0
    //   109: new android/content/Intent
    //   112: dup
    //   113: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   116: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   119: ldc_w in/krosbits/musicolet/MusicActivity
    //   122: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   125: ldc_w 268435456
    //   128: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   131: ldc_w 167772160
    //   134: invokestatic r : ()Landroid/os/Bundle;
    //   137: invokestatic getActivity : (Landroid/content/Context;ILandroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/PendingIntent;
    //   140: astore #4
    //   142: iconst_0
    //   143: istore_0
    //   144: aload_2
    //   145: astore_3
    //   146: aload #4
    //   148: astore_2
    //   149: goto -> 154
    //   152: iconst_1
    //   153: istore_0
    //   154: aload #5
    //   156: aload_3
    //   157: invokevirtual i : (Ljava/lang/CharSequence;)V
    //   160: aload #5
    //   162: aload_1
    //   163: invokevirtual h : (Ljava/lang/CharSequence;)V
    //   166: aload #5
    //   168: ldc_w 2131231578
    //   171: invokevirtual o : (I)V
    //   174: aload #5
    //   176: aload_2
    //   177: invokevirtual g : (Landroid/app/PendingIntent;)V
    //   180: aload #5
    //   182: iconst_1
    //   183: invokevirtual d : (Z)V
    //   186: iload_0
    //   187: ifeq -> 198
    //   190: aload #5
    //   192: iconst_0
    //   193: iconst_0
    //   194: iconst_1
    //   195: invokevirtual n : (IIZ)V
    //   198: aload #5
    //   200: invokevirtual c : ()Landroid/app/Notification;
    //   203: putstatic in/krosbits/musicolet/MyApplication.n : Landroid/app/Notification;
    //   206: getstatic in/krosbits/musicolet/MyApplication.o : Z
    //   209: ifeq -> 233
    //   212: new z21
    //   215: dup
    //   216: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   219: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   222: invokespecial <init> : (Landroid/content/Context;)V
    //   225: bipush #120
    //   227: getstatic in/krosbits/musicolet/MyApplication.n : Landroid/app/Notification;
    //   230: invokevirtual c : (ILandroid/app/Notification;)V
    //   233: return
  }
  
  public final void B() {
    boolean bool;
    O = null;
    u.getClass();
    this.t = false;
    p3.b = o().getBoolean("k_b_dsblaald", true);
    z51.q = null;
    ag0.h = o().getBoolean("B_PF_FILNMIOTTL", false);
    p3.c = o().getInt("k_i_fldjpg", jm1.e);
    ag0.i = o().getBoolean("k_b_hwsic", false);
    String str = o().getString(PwbbJfsdcHrAjW.PsKNHPyoRYDQJi, null);
    ag0.d = str;
    if (str != null) {
      bool = true;
    } else {
      bool = false;
    } 
    ag0.e = bool;
    MusicService.C0 = u().getBoolean("R_SM", false);
    w = 4;
    if (4 - a0f9 != 1) {
      w = 3;
    } else {
      a0f9 = o().getInt("FLSHFAQ", 0);
    } 
    Intent intent = new Intent("ACTASCH");
    cn.o(i.getApplicationContext()).v(intent);
    try {
      MediaBrowserServiceImpl mediaBrowserServiceImpl = MediaBrowserServiceImpl.b;
    } finally {
      intent = null;
    } 
    MusicService.Q0(i.getApplicationContext());
    QsService.a((Context)this);
    E.postDelayed((Runnable)new hi(120), 1000L);
    n = null;
    if (im0.h0)
      im0.n(); 
  }
  
  public void attachBaseContext(Context paramContext) {
    super.attachBaseContext(paramContext);
    Locale locale2 = (paramContext.getResources().getConfiguration()).locale;
    String str1 = locale2.getLanguage();
    String str2 = locale2.getCountry();
    String str3 = locale2.getVariant();
    r = (new JSONArray()).put(str1).put(str2).put(str3).toString();
    Locale locale1 = (z51.A(paramContext).getResources().getConfiguration()).locale;
    if (!(getResources().getConfiguration()).locale.equals(locale1))
      z51.h(getResources(), locale1); 
    io1.d((Context)this, false);
    if (!(getResources().getConfiguration()).locale.equals(locale1))
      z51.h(getResources(), locale1); 
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    Locale locale = paramConfiguration.locale;
    String str2 = locale.getLanguage();
    String str1 = locale.getCountry();
    String str3 = locale.getVariant();
    r = (new JSONArray()).put(str2).put(str1).put(str3).toString();
    z51.A((Context)this);
    p = getResources().getDimension(2131165390);
    n21.f = i.getApplicationContext();
    J = null;
    I = null;
    K = null;
    L = null;
    M = null;
    if (m92.l != ((getResources().getConfiguration()).uiMode & 0x30)) {
      m92.l = (getResources().getConfiguration()).uiMode & 0x30;
      m92.I(i.getApplicationContext());
      m92.i();
      m92.n = null;
      dd1.f();
      zo2.c();
      MusicService.O0();
      MusicService.Q0(i.getApplicationContext());
    } 
  }
  
  public final void onCreate() {
    PVdqHjWVkmL.tIFATY.invoke(null, new Object[] { this });
  }
  
  public final void onLowMemory() {
    super.onLowMemory();
    f();
    dd1.f();
  }
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable) {
    try {
      ag0.f(paramThread, paramThrowable);
      g().edit().putBoolean("FSP_WPA", false).commit();
      MusicActivity musicActivity = MusicActivity.R0;
      if (musicActivity != null)
        musicActivity.finishAffinity(); 
    } finally {
      Exception exception;
    } 
    try {
      this.e.uncaughtException(paramThread, paramThrowable);
    } finally {
      paramThread = null;
    } 
  }
  
  static {
    StartupLauncher.launch();
    LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue();
    D = new ThreadPoolExecutor(3, 3, 10L, TimeUnit.MILLISECONDS, linkedBlockingQueue);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\MyApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */