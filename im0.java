import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.google.android.material.tabs.xm.VDgS;
import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public final class im0 {
  public static im0 g0;
  
  public static boolean h0;
  
  public static boolean i0;
  
  public static final HashSet j0 = new HashSet(Arrays.asList((Object[])new String[] { 
          "mp3", "m4a", "m4b", "aac", "flac", "wav", "ogg", "mka", "amr", "gsm", 
          "mid", "xmf", "mxmf", "rtttl", "rtx", "ota", "imy", GMDx.FZkQWqMo }));
  
  public static final HashSet k0 = new HashSet(Arrays.asList((Object[])new String[] { 
          "aiff", "aif", "aifc", "aa", "ac3", "aac", "aiff", "alac", "amr", "ape", 
          "au", "awb", "caf", "dsf", "dff", "dsd", "dts", "flac", "gsm", "m4a", 
          "mpga", IGBYXeDFmKYajx.WIaylYYsRL, "mmf", "mp3", "mp2", xveccWbRzqx.uKERbn, "mpc", "ogg", "oga", "mogg", 
          "opus", "ra", "raw", "pcm", OETETTfAjV.vQqqFn, "tta", "tak", "voc", "wav", "wma", 
          "wv", "weba", "mka", "thd", "mlp" }));
  
  public static final HashSet l0 = new HashSet(Arrays.asList((Object[])new String[] { "3gp", "mp4", "ts", "mkv", "mpg", "mpeg", "webm", "m4v" }));
  
  public static final HashSet m0 = new HashSet(Arrays.asList((Object[])new String[] { 
          "3gp", "3gpp", "3g2", "mp4", uvJYmft.uXkyAnxMDlEjqD, "mkv", "mpg", "mpeg", "webm", "wmv", 
          "avi", "flv", "rm", "vob", "truehd", "ogx", "m4v" }));
  
  public static final HashSet n0 = new HashSet(Arrays.asList((Object[])new String[] { "m3u", "m3u8", "pls" }));
  
  public static final ExecutorService o0 = Executors.newSingleThreadExecutor();
  
  public ArrayList A;
  
  public PowerManager.WakeLock B;
  
  public boolean C;
  
  public boolean D;
  
  public boolean E;
  
  public final boolean[] F;
  
  public ArrayList G;
  
  public final boolean H;
  
  public final boolean I;
  
  public boolean J;
  
  public boolean K;
  
  public Intent L;
  
  public boolean M;
  
  public boolean N;
  
  public HashMap O;
  
  public final q01 P;
  
  public HashMap Q;
  
  public HashSet R;
  
  public HashSet S;
  
  public HashMap T;
  
  public HashMap U;
  
  public ArrayList V;
  
  public HashMap W;
  
  public HashSet X;
  
  public ArrayList Y;
  
  public String Z;
  
  public int a;
  
  public int a0;
  
  public int b;
  
  public int b0;
  
  public String c;
  
  public long c0;
  
  public String d;
  
  public final PendingIntent d0;
  
  public MediaMetadataRetriever e;
  
  public boolean e0;
  
  public boolean f;
  
  public boolean f0;
  
  public boolean g;
  
  public boolean h;
  
  public boolean i;
  
  public boolean j;
  
  public boolean k;
  
  public boolean l;
  
  public boolean m;
  
  public boolean n;
  
  public int o;
  
  public boolean p;
  
  public boolean q;
  
  public boolean r;
  
  public int s;
  
  public int t;
  
  public HashSet u;
  
  public HashSet v;
  
  public HashSet w;
  
  public ArrayList x;
  
  public ArrayList y;
  
  public ArrayList z;
  
  public im0(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    new Handler(Looper.getMainLooper());
    MyApplication.i.getApplicationContext().getString(2131887537);
    MyApplication.i.getApplicationContext().getString(2131886469);
    boolean bool = false;
    this.D = false;
    this.F = new boolean[1];
    this.P = new q01(0);
    Intent intent = (new Intent(MyApplication.i.getApplicationContext(), GhostSearchActivity.class)).setAction(LHyji.jawJZGAykJ).addFlags(268435456);
    this.d0 = PendingIntent.getActivity(MyApplication.i.getApplicationContext(), 0, intent, 167772160, ag0.r());
    this.e0 = false;
    this.E = paramBoolean1;
    this.G = null;
    this.H = paramBoolean2;
    paramBoolean1 = bool;
    if (MyApplication.o().getInt("k_i_pfsnr", 0) == 1)
      paramBoolean1 = true; 
    this.J = paramBoolean1;
    this.I = paramBoolean3;
  }
  
  public static int c(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    boolean bool = paramBoolean1;
    if (paramBoolean2)
      j = paramBoolean1 | 0x2; 
    int i = j;
    if (paramBoolean3)
      i = j | 0x10; 
    int j = i;
    if (paramBoolean4)
      j = i | 0x8; 
    return j;
  }
  
  public static int f(String paramString) {
    boolean bool;
    if (k0.contains(paramString) || m0.contains(paramString)) {
      bool = true;
    } else {
      bool = false;
    } 
    return (j0.contains(paramString) || l0.contains(paramString)) ? (bool | 0x400) : bool;
  }
  
  public static ArrayList g() {
    ArrayList<String> arrayList = new ArrayList(5);
    for (byte b = 0; b < 7; b++) {
      (new String[7])[0] = "ape";
      (new String[7])[1] = "caf";
      (new String[7])[2] = "dsf";
      (new String[7])[3] = "dts";
      (new String[7])[4] = "mpc";
      (new String[7])[5] = "voc";
      (new String[7])[6] = "wv";
      String str = (new String[7])[b];
      if (!j0.contains(str))
        arrayList.add(str.toUpperCase()); 
    } 
    arrayList.add("etc.");
    return arrayList;
  }
  
  public static void m() {
    // Byte code:
    //   0: getstatic in/krosbits/musicolet/MediaMountedReceiver.a : Z
    //   3: ifeq -> 13
    //   6: iconst_0
    //   7: putstatic in/krosbits/musicolet/MediaMountedReceiver.a : Z
    //   10: invokestatic a : ()V
    //   13: getstatic in/krosbits/musicolet/MyApplication.R : Z
    //   16: ifeq -> 31
    //   19: iconst_0
    //   20: putstatic in/krosbits/musicolet/MyApplication.R : Z
    //   23: invokestatic K : ()Lu00;
    //   26: aconst_null
    //   27: iconst_0
    //   28: invokestatic m : (Lu00;Landroid/content/Context;Z)V
    //   31: invokestatic x : ()Landroid/content/SharedPreferences;
    //   34: ldc_w 's_pmth2'
    //   37: lconst_0
    //   38: invokeinterface getLong : (Ljava/lang/String;J)J
    //   43: lstore_0
    //   44: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   47: getfield c : Llm0;
    //   50: astore_2
    //   51: aload_2
    //   52: getfield s : J
    //   55: ldc2_w 10800000
    //   58: lcmp
    //   59: ifle -> 108
    //   62: aload_2
    //   63: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   66: pop
    //   67: lload_0
    //   68: ldc2_w 10800000
    //   71: lcmp
    //   72: ifgt -> 108
    //   75: invokestatic x : ()Landroid/content/SharedPreferences;
    //   78: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   83: ldc_w 's_pmth2'
    //   86: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   89: getfield c : Llm0;
    //   92: getfield s : J
    //   95: invokeinterface putLong : (Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    //   100: invokeinterface apply : ()V
    //   105: goto -> 132
    //   108: invokestatic x : ()Landroid/content/SharedPreferences;
    //   111: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   116: ldc_w 's_pmth2'
    //   119: lload_0
    //   120: lconst_1
    //   121: ladd
    //   122: invokeinterface putLong : (Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    //   127: invokeinterface apply : ()V
    //   132: getstatic in/krosbits/musicolet/MyApplication.H : La01;
    //   135: ifnull -> 153
    //   138: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   141: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   144: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   147: getstatic in/krosbits/musicolet/MyApplication.H : La01;
    //   150: invokevirtual unregisterContentObserver : (Landroid/database/ContentObserver;)V
    //   153: aconst_null
    //   154: putstatic in/krosbits/musicolet/MyApplication.H : La01;
    //   157: invokestatic r : ()V
    //   160: invokestatic s : ()V
    //   163: return
  }
  
  public static void n() {
    h0 = false;
    if (MyApplication.o().getBoolean("k_b_mare", false) || MyApplication.o().getBoolean("k_b_malare", false) || MyApplication.o().getBoolean("k_b_mcme", false) || MyApplication.o().getBoolean("k_b_mgne", false)) {
      if (MyApplication.k()) {
        im0 im01 = new im0(false, false, true);
        im01.d = MyApplication.i.getApplicationContext().getString(2131886199);
        im01.K = true;
        w(im01);
        return;
      } 
      h0 = true;
      return;
    } 
  }
  
  public static void p() {
    if (i0)
      return; 
    HashSet<String> hashSet1 = new HashSet();
    HashSet<String> hashSet2 = new HashSet();
    MediaCodecInfo[] arrayOfMediaCodecInfo = (new MediaCodecList(0)).getCodecInfos();
    byte b = 0;
    while (true) {
      int i = arrayOfMediaCodecInfo.length;
      HashSet<String> hashSet4 = l0;
      HashSet<String> hashSet3 = j0;
      if (b < i) {
        String[] arrayOfString = arrayOfMediaCodecInfo[b].getSupportedTypes();
        for (i = 0; i < arrayOfString.length; i++) {
          String str1 = arrayOfString[i];
          String str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str1);
          if (str1.startsWith("audio/")) {
            if (str2 != null)
              hashSet3.add(str2); 
            hashSet1.add(str1);
          } else if (str1.startsWith("video/")) {
            if (str2 != null)
              hashSet4.add(str2); 
            hashSet2.add(str1);
          } 
        } 
        b++;
        continue;
      } 
      if (hashSet1.contains("audio/x-ms-wma") || hashSet1.contains("audio/x-lg-ms-wma"))
        hashSet3.add("wma"); 
      if (hashSet1.contains("audio/alac"))
        hashSet3.add("alac"); 
      if (hashSet1.contains("audio/opus"))
        hashSet3.add("opus"); 
      if (hashSet1.contains("audio/x-wv"))
        hashSet3.add(eRUgfgGAccgka.WYVN); 
      if (hashSet1.contains("audio/dts"))
        hashSet3.add("dts"); 
      if (hashSet1.contains("audio/vnd.dts"))
        hashSet3.add("dts"); 
      if (hashSet1.contains("audio/ape"))
        hashSet3.add("ape"); 
      if (hashSet1.contains("audio/x-ape"))
        hashSet3.add("ape"); 
      if (hashSet1.contains("audio/x-monkeys-audio"))
        hashSet3.add("ape"); 
      if (hashSet1.contains("audio/vnd.rn-realaudio"))
        hashSet3.add("ra"); 
      if (hashSet1.contains("audio/raw")) {
        hashSet3.add("alaw");
        hashSet3.add("ulaw");
      } 
      if (hashSet1.contains("audio/gsm") || hashSet1.contains("audio/x-gsm"))
        hashSet3.add("gsm"); 
      if (hashSet1.contains(VDgS.HwB)) {
        hashSet3.add("aif");
        hashSet3.add("aiff");
      } 
      if (hashSet1.contains("audio/x-aifc"))
        hashSet3.add("aifc"); 
      if (hashSet1.contains("audio/x-voc"))
        hashSet3.add("voc"); 
      if (hashSet1.contains("audio/x-monkeys-audio"))
        hashSet3.add("ape"); 
      if (hashSet1.contains("audio/x-snd"))
        hashSet3.add("snd"); 
      if (hashSet1.contains("audio/ac3"))
        hashSet3.add("ac3"); 
      if (hashSet1.contains("audio/x-dsd") || hashSet1.contains("audio/x-dsf") || hashSet1.contains("audio/x-dff") || hashSet1.contains("audio/dsd") || hashSet1.contains("audio/dsf") || hashSet1.contains("audio/dff")) {
        hashSet3.add("dsd");
        hashSet3.add("dsf");
        hashSet3.add("dff");
      } 
      if (hashSet2.contains("video/x-ms-wmv") || hashSet2.contains("video/x-ms-asf")) {
        hashSet4.add("wmv");
        hashSet3.add("wma");
      } 
      if (hashSet2.contains("video/x-msvideo"))
        hashSet4.add("avi"); 
      if (hashSet2.contains("audio/vnd.rn-realvideo"))
        hashSet4.add("rv"); 
      if (hashSet2.contains("video/x-flv"))
        hashSet4.add("flv"); 
      if (hashSet2.contains("video/divx")) {
        hashSet4.add("divx");
        hashSet4.add("avi");
      } 
      i0 = true;
      return;
    } 
  }
  
  public static void r() {
    Exception exception;
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{im0}} */
    try {
      lm0 lm0 = MyApplication.j.c;
      if ((MyApplication.h()).e || (MyApplication.h()).f)
        MusicService.q0(true); 
    } finally {}
    MyApplication.t((lm0)exception);
    c81.a = null;
    c81.b = null;
    c81.c(MyApplication.i.getApplicationContext());
    HashMap hashMap = ((lm0)exception).w;
    if (hashMap != null && !hashMap.isEmpty()) {
      ArrayList<Object> arrayList = c81.g(MyApplication.i.getApplicationContext());
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        String str = (String)arrayList.get(b);
        b++;
        str = str;
        c81.f(MyApplication.i.getApplicationContext(), str);
      } 
    } 
    my0.l((lm0)exception);
    ((lm0)exception).w = null;
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{im0}} */
  }
  
  public static void w(im0 paramim0) {
    im0 im01 = g0;
    if (im01 != null && im01.E) {
      StringBuilder stringBuilder = new StringBuilder("LIB_UA_C:");
      stringBuilder.append(im01);
      n21.F(stringBuilder.toString());
      if (im01.E)
        im01.F[0] = true; 
    } 
    z2 z2 = new z2(1, paramim0);
    String str = ag0.a;
    z2.executeOnExecutor(o0, new Object[0]);
  }
  
  public static v00 y(v00 paramv00, boolean paramBoolean) {
    v00 v001 = paramv00.A(".nomedia");
    if (v001 != null && v001.l())
      return paramv00; 
    if (paramBoolean) {
      paramv00 = (v00)paramv00.i();
      if (paramv00 != null)
        return y(paramv00, true); 
    } 
    return null;
  }
  
  public static v00 z(v00 paramv00, boolean paramBoolean) {
    boolean bool;
    String str = paramv00.b.toString();
    if (str != null && !str.isEmpty() && !str.equals("~")) {
      try {
        String str1 = str.substring(str.lastIndexOf('/') + 1);
      } finally {
        Exception exception = null;
      } 
    } else {
      str = paramv00.h();
    } 
    if (str != null) {
      bool = str.startsWith(".");
    } else {
      bool = false;
    } 
    if (bool)
      return paramv00; 
    if (paramBoolean && str != null) {
      paramv00 = (v00)paramv00.i();
      if (paramv00 != null)
        return z(paramv00, true); 
    } 
    return null;
  }
  
  public final String a(String paramString) {
    if (paramString == null)
      return null; 
    paramString = paramString.toLowerCase(Locale.ENGLISH);
    for (byte b = 0; b < this.z.size(); b++) {
      String str2 = this.z.get(b);
      String str1 = this.x.get(b);
      if (paramString.startsWith(str2) && (paramString.length() == str2.length() || (paramString.length() >= str2.length() + 1 && paramString.charAt(str2.length()) == '/')))
        return str1; 
    } 
    return null;
  }
  
  public final void b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e0 : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: getstatic com/google/android/material/textview/pJx/ybWnIKHovcRr.zfVRqeSRiTDYqsb : Ljava/lang/String;
    //   11: invokestatic F : (Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield e : Landroid/media/MediaMetadataRetriever;
    //   18: ifnull -> 41
    //   21: aload_0
    //   22: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   25: invokevirtual release : ()V
    //   28: goto -> 36
    //   31: astore_1
    //   32: aload_1
    //   33: invokevirtual printStackTrace : ()V
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield e : Landroid/media/MediaMetadataRetriever;
    //   41: aload_0
    //   42: getfield B : Landroid/os/PowerManager$WakeLock;
    //   45: astore_1
    //   46: aload_1
    //   47: ifnull -> 69
    //   50: aload_1
    //   51: invokevirtual isHeld : ()Z
    //   54: ifeq -> 64
    //   57: aload_0
    //   58: getfield B : Landroid/os/PowerManager$WakeLock;
    //   61: invokevirtual release : ()V
    //   64: aload_0
    //   65: aconst_null
    //   66: putfield B : Landroid/os/PowerManager$WakeLock;
    //   69: aload_0
    //   70: getfield L : Landroid/content/Intent;
    //   73: ifnull -> 95
    //   76: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   79: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   82: aload_0
    //   83: getfield L : Landroid/content/Intent;
    //   86: invokevirtual stopService : (Landroid/content/Intent;)Z
    //   89: pop
    //   90: aload_0
    //   91: aconst_null
    //   92: putfield L : Landroid/content/Intent;
    //   95: getstatic im0.g0 : Lim0;
    //   98: aload_0
    //   99: if_acmpne -> 106
    //   102: aconst_null
    //   103: putstatic im0.g0 : Lim0;
    //   106: aload_0
    //   107: monitorenter
    //   108: aload_0
    //   109: invokevirtual notifyAll : ()V
    //   112: aload_0
    //   113: monitorexit
    //   114: getstatic in/krosbits/musicolet/RestoreActivity.B0 : Ljava/lang/Object;
    //   117: astore_1
    //   118: aload_1
    //   119: monitorenter
    //   120: aload_1
    //   121: invokevirtual notifyAll : ()V
    //   124: aload_1
    //   125: monitorexit
    //   126: getstatic r3/a0.b : Lr3/a0;
    //   129: astore_1
    //   130: aload_1
    //   131: ifnull -> 175
    //   134: aload_1
    //   135: new r3/a0
    //   138: dup
    //   139: aload_0
    //   140: invokespecial <init> : (Ljava/lang/Object;)V
    //   143: invokevirtual a : ()Ljava/lang/Object;
    //   146: if_acmpne -> 175
    //   149: new java/lang/StringBuilder
    //   152: dup
    //   153: getstatic com/google/android/gms/dynamite/descriptors/com/google/android/gms/flags/Ou/tlzLOCPTHRhep.dmbjaM : Ljava/lang/String;
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: astore_1
    //   160: aload_1
    //   161: invokestatic currentTimeMillis : ()J
    //   164: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: aload_1
    //   169: invokevirtual toString : ()Ljava/lang/String;
    //   172: invokestatic F : (Ljava/lang/String;)V
    //   175: aload_0
    //   176: lconst_0
    //   177: putfield c0 : J
    //   180: aload_0
    //   181: iconst_0
    //   182: putfield b : I
    //   185: aload_0
    //   186: iconst_0
    //   187: putfield a : I
    //   190: aload_0
    //   191: invokevirtual x : ()V
    //   194: aload_0
    //   195: getfield M : Z
    //   198: ifeq -> 204
    //   201: invokestatic m : ()V
    //   204: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   207: astore_1
    //   208: aload_1
    //   209: ifnull -> 226
    //   212: aload_0
    //   213: getfield k : Z
    //   216: ifeq -> 226
    //   219: aload_1
    //   220: ldc2_w 1000
    //   223: invokevirtual a0 : (J)V
    //   226: aload_0
    //   227: getfield P : Lq01;
    //   230: getfield b : Ljava/util/HashMap;
    //   233: invokevirtual clear : ()V
    //   236: aload_0
    //   237: iconst_1
    //   238: putfield e0 : Z
    //   241: return
    //   242: astore_2
    //   243: aload_1
    //   244: monitorexit
    //   245: aload_2
    //   246: athrow
    //   247: astore_1
    //   248: aload_0
    //   249: monitorexit
    //   250: aload_1
    //   251: athrow
    //   252: astore_1
    //   253: goto -> 112
    //   256: astore_2
    //   257: goto -> 124
    // Exception table:
    //   from	to	target	type
    //   21	28	31	java/io/IOException
    //   108	112	252	finally
    //   112	114	247	finally
    //   120	124	256	finally
    //   124	126	242	finally
    //   243	245	242	finally
    //   248	250	247	finally
  }
  
  public final int d(String paramString) {
    if (!TextUtils.isEmpty(paramString)) {
      if (this.u.contains(paramString))
        return 0; 
      if (this.v.contains(paramString))
        return 1; 
      if (this.w.contains(paramString))
        return 2; 
    } 
    return -1;
  }
  
  public final Notification e() {
    d51 d51 = new d51(MyApplication.i.getApplicationContext(), "in.krosbits.musicolet.nid.5");
    d51.d(false);
    d51.l(true);
    d51.o(2131231084);
    d51.g(this.d0);
    s21 s21 = d51.b;
    Notification.Builder builder = d51.a;
    if (builder != null) {
      builder.setShowWhen(false);
    } else {
      s21.k = false;
    } 
    if (builder != null) {
      builder.setUsesChronometer(false);
    } else {
      s21.getClass();
    } 
    d51.i(this.d);
    d51.h(this.c);
    int i = this.a;
    int j = this.b;
    if (i > 0) {
      d51.n(i, j, false);
    } else {
      d51.n(i, j, true);
    } 
    return d51.c();
  }
  
  public final boolean h() {
    return this.F[0];
  }
  
  public final boolean i(int paramInt) {
    int i = this.s;
    return ((paramInt & i) == i && (this.t & paramInt) == 0);
  }
  
  public final boolean j(v00 paramv00) {
    if (this.C)
      return true; 
    if (paramv00 == null)
      return false; 
    String str = paramv00.b.toString();
    if (str != null) {
      str = str.toLowerCase(Locale.ENGLISH);
      ArrayList<Object> arrayList = this.A;
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        String str1 = (String)arrayList.get(i);
        int k = i + 1;
        str1 = str1;
        i = k;
        if (str.startsWith(str1)) {
          if (str.length() == str1.length())
            return true; 
          i = k;
          if (str.length() >= str1.length() + 1) {
            i = k;
            if (str.charAt(str1.length()) == '/')
              return true; 
          } 
        } 
      } 
    } 
    return false;
  }
  
  public final HashMap k() {
    // Byte code:
    //   0: aload_0
    //   1: astore #28
    //   3: aload #28
    //   5: astore #29
    //   7: aload #28
    //   9: getfield Q : Ljava/util/HashMap;
    //   12: ifnonnull -> 2462
    //   15: getstatic in/krosbits/utils/SgV/zpEN.DiztyXS : Ljava/lang/String;
    //   18: astore #35
    //   20: aload #28
    //   22: getfield I : Z
    //   25: istore #27
    //   27: iconst_0
    //   28: istore #5
    //   30: aload #28
    //   32: astore #29
    //   34: iload #27
    //   36: ifne -> 2437
    //   39: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   42: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   45: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   48: astore #32
    //   50: aload #28
    //   52: getfield G : Ljava/util/ArrayList;
    //   55: astore #29
    //   57: aload #29
    //   59: ifnull -> 94
    //   62: aload #29
    //   64: invokevirtual isEmpty : ()Z
    //   67: ifne -> 73
    //   70: goto -> 94
    //   73: new java/util/HashMap
    //   76: dup
    //   77: iconst_0
    //   78: invokespecial <init> : (I)V
    //   81: astore #30
    //   83: goto -> 2451
    //   86: astore #29
    //   88: aconst_null
    //   89: astore #30
    //   91: goto -> 2392
    //   94: invokestatic d : ()Ljava/util/List;
    //   97: invokeinterface iterator : ()Ljava/util/Iterator;
    //   102: astore #34
    //   104: aconst_null
    //   105: astore #29
    //   107: aconst_null
    //   108: astore #30
    //   110: aload #34
    //   112: invokeinterface hasNext : ()Z
    //   117: istore #27
    //   119: getstatic org/jaudiotagger/audio/dff/vR/CKYHNesT.eEkUCdmeCgK : Ljava/lang/String;
    //   122: astore #41
    //   124: aload #28
    //   126: getfield F : [Z
    //   129: astore #45
    //   131: aload #28
    //   133: getfield P : Lq01;
    //   136: astore #43
    //   138: iload #27
    //   140: ifeq -> 1425
    //   143: aload #34
    //   145: invokeinterface next : ()Ljava/lang/Object;
    //   150: checkcast android/net/Uri
    //   153: astore #37
    //   155: aload #45
    //   157: iload #5
    //   159: baload
    //   160: ifne -> 1407
    //   163: aload #28
    //   165: getfield J : Z
    //   168: istore #27
    //   170: iload #27
    //   172: ifeq -> 215
    //   175: iconst_3
    //   176: anewarray java/lang/String
    //   179: dup
    //   180: iconst_0
    //   181: ldc_w '_data'
    //   184: aastore
    //   185: dup
    //   186: iconst_1
    //   187: ldc_w 'duration'
    //   190: aastore
    //   191: dup
    //   192: iconst_2
    //   193: ldc_w 'date_modified'
    //   196: aastore
    //   197: astore #31
    //   199: goto -> 403
    //   202: astore #31
    //   204: aload #29
    //   206: astore #30
    //   208: aload #31
    //   210: astore #29
    //   212: goto -> 2392
    //   215: getstatic android/os/Build$VERSION.SDK_INT : I
    //   218: istore #6
    //   220: iload #6
    //   222: bipush #30
    //   224: if_icmplt -> 315
    //   227: bipush #12
    //   229: anewarray java/lang/String
    //   232: dup
    //   233: iconst_0
    //   234: ldc_w '_data'
    //   237: aastore
    //   238: dup
    //   239: iconst_1
    //   240: getstatic com/google/android/gms/auth/api/signin/cwa/RqlokDsQOju.DtKLwuMBgV : Ljava/lang/String;
    //   243: aastore
    //   244: dup
    //   245: iconst_2
    //   246: ldc_w 'artist'
    //   249: aastore
    //   250: dup
    //   251: iconst_3
    //   252: ldc_w 'album'
    //   255: aastore
    //   256: dup
    //   257: iconst_4
    //   258: ldc_w 'composer'
    //   261: aastore
    //   262: dup
    //   263: iconst_5
    //   264: ldc_w 'year'
    //   267: aastore
    //   268: dup
    //   269: bipush #6
    //   271: ldc_w 'duration'
    //   274: aastore
    //   275: dup
    //   276: bipush #7
    //   278: ldc_w 'track'
    //   281: aastore
    //   282: dup
    //   283: bipush #8
    //   285: ldc_w 'date_added'
    //   288: aastore
    //   289: dup
    //   290: bipush #9
    //   292: ldc_w 'date_modified'
    //   295: aastore
    //   296: dup
    //   297: bipush #10
    //   299: ldc_w 'album_artist'
    //   302: aastore
    //   303: dup
    //   304: bipush #11
    //   306: ldc_w 'genre'
    //   309: aastore
    //   310: astore #31
    //   312: goto -> 199
    //   315: bipush #12
    //   317: anewarray java/lang/String
    //   320: dup
    //   321: iconst_0
    //   322: ldc_w '_id'
    //   325: aastore
    //   326: dup
    //   327: iconst_1
    //   328: ldc_w '_data'
    //   331: aastore
    //   332: dup
    //   333: iconst_2
    //   334: ldc_w 'title'
    //   337: aastore
    //   338: dup
    //   339: iconst_3
    //   340: ldc_w 'artist'
    //   343: aastore
    //   344: dup
    //   345: iconst_4
    //   346: ldc_w 'album'
    //   349: aastore
    //   350: dup
    //   351: iconst_5
    //   352: getstatic com/google/android/material/textview/pJx/ybWnIKHovcRr.PyPob : Ljava/lang/String;
    //   355: aastore
    //   356: dup
    //   357: bipush #6
    //   359: ldc_w 'year'
    //   362: aastore
    //   363: dup
    //   364: bipush #7
    //   366: ldc_w 'duration'
    //   369: aastore
    //   370: dup
    //   371: bipush #8
    //   373: getstatic androidx/work/impl/diagnostics/UWhQ/OETETTfAjV.qAsqDCfCKXePug : Ljava/lang/String;
    //   376: aastore
    //   377: dup
    //   378: bipush #9
    //   380: ldc_w 'date_added'
    //   383: aastore
    //   384: dup
    //   385: bipush #10
    //   387: ldc_w 'date_modified'
    //   390: aastore
    //   391: dup
    //   392: bipush #11
    //   394: ldc_w 'album_artist'
    //   397: aastore
    //   398: astore #31
    //   400: goto -> 199
    //   403: aload #32
    //   405: aload #37
    //   407: aload #31
    //   409: aconst_null
    //   410: aconst_null
    //   411: aconst_null
    //   412: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   415: astore #31
    //   417: aload #31
    //   419: ifnull -> 1378
    //   422: aload #30
    //   424: ifnonnull -> 479
    //   427: new java/util/HashMap
    //   430: astore #29
    //   432: aload #31
    //   434: invokeinterface getCount : ()I
    //   439: i2d
    //   440: dstore_3
    //   441: aload #28
    //   443: getfield p : Z
    //   446: ifeq -> 456
    //   449: ldc2_w 1.2
    //   452: dstore_1
    //   453: goto -> 458
    //   456: dconst_1
    //   457: dstore_1
    //   458: aload #29
    //   460: dload_3
    //   461: dload_1
    //   462: dmul
    //   463: d2i
    //   464: invokespecial <init> : (I)V
    //   467: goto -> 483
    //   470: astore #29
    //   472: aload #31
    //   474: astore #30
    //   476: goto -> 2392
    //   479: aload #30
    //   481: astore #29
    //   483: aload #28
    //   485: astore #33
    //   487: aload #31
    //   489: ldc_w '_id'
    //   492: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   497: istore #19
    //   499: aload #28
    //   501: astore #33
    //   503: aload #31
    //   505: ldc_w '_data'
    //   508: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   513: istore #10
    //   515: aload #28
    //   517: astore #33
    //   519: aload #31
    //   521: ldc_w 'title'
    //   524: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   529: istore #11
    //   531: aload #28
    //   533: astore #33
    //   535: aload #31
    //   537: ldc_w 'artist'
    //   540: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   545: istore #9
    //   547: aload #28
    //   549: astore #33
    //   551: aload #31
    //   553: ldc_w 'album'
    //   556: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   561: istore #16
    //   563: aload #28
    //   565: astore #33
    //   567: aload #31
    //   569: ldc_w 'composer'
    //   572: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   577: istore #17
    //   579: aload #28
    //   581: astore #33
    //   583: aload #31
    //   585: ldc_w 'year'
    //   588: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   593: istore #20
    //   595: aload #28
    //   597: astore #33
    //   599: aload #31
    //   601: ldc_w 'duration'
    //   604: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   609: istore #18
    //   611: aload #28
    //   613: astore #33
    //   615: aload #31
    //   617: ldc_w 'track'
    //   620: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   625: istore #15
    //   627: aload #28
    //   629: astore #33
    //   631: aload #31
    //   633: aload #41
    //   635: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   640: istore #12
    //   642: aload #28
    //   644: astore #33
    //   646: aload #31
    //   648: ldc_w 'date_modified'
    //   651: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   656: istore #7
    //   658: aload #29
    //   660: astore #30
    //   662: aload #28
    //   664: astore #33
    //   666: getstatic android/os/Build$VERSION.SDK_INT : I
    //   669: istore #6
    //   671: aload #43
    //   673: astore #36
    //   675: aload #28
    //   677: astore #33
    //   679: aload #31
    //   681: aload #35
    //   683: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   688: istore #8
    //   690: iload #6
    //   692: bipush #30
    //   694: if_icmplt -> 712
    //   697: aload #31
    //   699: ldc_w 'genre'
    //   702: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   707: istore #6
    //   709: goto -> 715
    //   712: iconst_m1
    //   713: istore #6
    //   715: aload #28
    //   717: astore #33
    //   719: aload #28
    //   721: getfield J : Z
    //   724: istore #27
    //   726: iload #27
    //   728: ifne -> 736
    //   731: iload #6
    //   733: iflt -> 742
    //   736: aconst_null
    //   737: astore #29
    //   739: goto -> 749
    //   742: aload #37
    //   744: invokestatic h : (Landroid/net/Uri;)Ljava/util/HashMap;
    //   747: astore #29
    //   749: aload #28
    //   751: astore #33
    //   753: aload #31
    //   755: invokeinterface moveToNext : ()Z
    //   760: ifeq -> 1349
    //   763: aload #45
    //   765: iload #5
    //   767: baload
    //   768: istore #27
    //   770: iload #27
    //   772: ifne -> 1311
    //   775: aload #31
    //   777: iload #10
    //   779: invokeinterface getString : (I)Ljava/lang/String;
    //   784: astore #43
    //   786: iload #11
    //   788: iflt -> 813
    //   791: aload #31
    //   793: iload #11
    //   795: invokeinterface getString : (I)Ljava/lang/String;
    //   800: astore #37
    //   802: goto -> 816
    //   805: astore #29
    //   807: aload_0
    //   808: astore #28
    //   810: goto -> 472
    //   813: aconst_null
    //   814: astore #37
    //   816: iload #9
    //   818: iflt -> 835
    //   821: aload #31
    //   823: iload #9
    //   825: invokeinterface getString : (I)Ljava/lang/String;
    //   830: astore #38
    //   832: goto -> 838
    //   835: aconst_null
    //   836: astore #38
    //   838: iload #16
    //   840: iflt -> 857
    //   843: aload #31
    //   845: iload #16
    //   847: invokeinterface getString : (I)Ljava/lang/String;
    //   852: astore #39
    //   854: goto -> 860
    //   857: aconst_null
    //   858: astore #39
    //   860: iload #17
    //   862: iflt -> 879
    //   865: aload #31
    //   867: iload #17
    //   869: invokeinterface getString : (I)Ljava/lang/String;
    //   874: astore #40
    //   876: goto -> 882
    //   879: aconst_null
    //   880: astore #40
    //   882: iload #8
    //   884: iflt -> 901
    //   887: aload #31
    //   889: iload #8
    //   891: invokeinterface getString : (I)Ljava/lang/String;
    //   896: astore #41
    //   898: goto -> 904
    //   901: aconst_null
    //   902: astore #41
    //   904: iload #20
    //   906: iflt -> 923
    //   909: aload #31
    //   911: iload #20
    //   913: invokeinterface getInt : (I)I
    //   918: istore #13
    //   920: goto -> 930
    //   923: iload #5
    //   925: istore #13
    //   927: goto -> 920
    //   930: aload #31
    //   932: iload #18
    //   934: invokeinterface getLong : (I)J
    //   939: lstore #23
    //   941: iload #15
    //   943: iflt -> 960
    //   946: aload #31
    //   948: iload #15
    //   950: invokeinterface getInt : (I)I
    //   955: istore #14
    //   957: goto -> 964
    //   960: iload #5
    //   962: istore #14
    //   964: iload #12
    //   966: iflt -> 991
    //   969: aload #31
    //   971: iload #12
    //   973: invokeinterface getLong : (I)J
    //   978: lstore #21
    //   980: lload #21
    //   982: ldc2_w 1000
    //   985: lmul
    //   986: lstore #21
    //   988: goto -> 994
    //   991: lconst_0
    //   992: lstore #21
    //   994: aload #31
    //   996: iload #7
    //   998: invokeinterface getLong : (I)J
    //   1003: lstore #25
    //   1005: aload #29
    //   1007: ifnull -> 1047
    //   1010: iload #19
    //   1012: iflt -> 1047
    //   1015: aload #29
    //   1017: aload #31
    //   1019: iload #19
    //   1021: invokeinterface getLong : (I)J
    //   1026: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1029: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1032: checkcast java/lang/String
    //   1035: astore #28
    //   1037: aload #28
    //   1039: astore #42
    //   1041: aload_0
    //   1042: astore #33
    //   1044: goto -> 1072
    //   1047: iload #6
    //   1049: iflt -> 1066
    //   1052: aload #31
    //   1054: iload #6
    //   1056: invokeinterface getString : (I)Ljava/lang/String;
    //   1061: astore #28
    //   1063: goto -> 1037
    //   1066: aconst_null
    //   1067: astore #42
    //   1069: goto -> 1041
    //   1072: aload #33
    //   1074: astore #28
    //   1076: aload #33
    //   1078: getfield J : Z
    //   1081: ifeq -> 1094
    //   1084: lload #23
    //   1086: lconst_0
    //   1087: lcmp
    //   1088: ifgt -> 1152
    //   1091: goto -> 1296
    //   1094: aload #33
    //   1096: astore #28
    //   1098: aload #37
    //   1100: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1103: ifeq -> 1142
    //   1106: aload #33
    //   1108: astore #28
    //   1110: aload #38
    //   1112: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1115: ifeq -> 1142
    //   1118: aload #33
    //   1120: astore #28
    //   1122: aload #39
    //   1124: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1127: ifne -> 1091
    //   1130: goto -> 1142
    //   1133: astore #29
    //   1135: aload #31
    //   1137: astore #30
    //   1139: goto -> 2392
    //   1142: lload #23
    //   1144: lconst_0
    //   1145: lcmp
    //   1146: ifgt -> 1152
    //   1149: goto -> 1091
    //   1152: aload #33
    //   1154: astore #28
    //   1156: new km0
    //   1159: astore #44
    //   1161: aload #33
    //   1163: astore #28
    //   1165: new qn1
    //   1168: astore #46
    //   1170: aload #33
    //   1172: astore #28
    //   1174: aload #46
    //   1176: aconst_null
    //   1177: aload #37
    //   1179: aload #36
    //   1181: aload #39
    //   1183: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   1186: aload #36
    //   1188: aload #38
    //   1190: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   1193: lload #23
    //   1195: l2i
    //   1196: invokespecial <init> : (Lwo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   1199: aload #33
    //   1201: astore #28
    //   1203: aload #44
    //   1205: iconst_0
    //   1206: aload #46
    //   1208: aload #36
    //   1210: aload #42
    //   1212: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   1215: aload #36
    //   1217: aload #40
    //   1219: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   1222: aload #36
    //   1224: aload #41
    //   1226: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   1229: lload #21
    //   1231: lload #25
    //   1233: ldc2_w 1000
    //   1236: lmul
    //   1237: lconst_0
    //   1238: lconst_0
    //   1239: iconst_0
    //   1240: iconst_0
    //   1241: iconst_0
    //   1242: iconst_0
    //   1243: iload #13
    //   1245: iload #14
    //   1247: aconst_null
    //   1248: aconst_null
    //   1249: aconst_null
    //   1250: iconst_0
    //   1251: invokespecial <init> : (ILqn1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   1254: aload #33
    //   1256: astore #28
    //   1258: new d61
    //   1261: astore #37
    //   1263: aload #33
    //   1265: astore #28
    //   1267: aload #37
    //   1269: aload #43
    //   1271: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   1274: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   1277: aload #36
    //   1279: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   1282: aload #33
    //   1284: astore #28
    //   1286: aload #30
    //   1288: aload #37
    //   1290: aload #44
    //   1292: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1295: pop
    //   1296: aload #33
    //   1298: astore #28
    //   1300: goto -> 749
    //   1303: astore #29
    //   1305: aload_0
    //   1306: astore #28
    //   1308: goto -> 1135
    //   1311: aload #28
    //   1313: astore #29
    //   1315: aload #29
    //   1317: astore #28
    //   1319: new android/app/PendingIntent$CanceledException
    //   1322: astore #30
    //   1324: aload #29
    //   1326: astore #28
    //   1328: aload #30
    //   1330: invokespecial <init> : ()V
    //   1333: aload #29
    //   1335: astore #28
    //   1337: aload #30
    //   1339: athrow
    //   1340: astore #29
    //   1342: aload #33
    //   1344: astore #28
    //   1346: goto -> 472
    //   1349: aload #28
    //   1351: astore #29
    //   1353: aload #29
    //   1355: astore #28
    //   1357: aload #31
    //   1359: invokeinterface close : ()V
    //   1364: aconst_null
    //   1365: astore #31
    //   1367: aload #29
    //   1369: astore #28
    //   1371: aload #31
    //   1373: astore #29
    //   1375: goto -> 1382
    //   1378: aload #31
    //   1380: astore #29
    //   1382: goto -> 110
    //   1385: astore #30
    //   1387: aload #29
    //   1389: astore #31
    //   1391: aload #30
    //   1393: astore #29
    //   1395: aload #31
    //   1397: astore #30
    //   1399: goto -> 2392
    //   1402: astore #30
    //   1404: goto -> 1387
    //   1407: new android/app/PendingIntent$CanceledException
    //   1410: astore #30
    //   1412: aload #30
    //   1414: invokespecial <init> : ()V
    //   1417: aload #30
    //   1419: athrow
    //   1420: astore #30
    //   1422: goto -> 1387
    //   1425: ldc_w 'title'
    //   1428: astore #40
    //   1430: ldc_w 'date_modified'
    //   1433: astore #44
    //   1435: aload #28
    //   1437: astore #31
    //   1439: aload #31
    //   1441: astore #35
    //   1443: aload #29
    //   1445: astore #33
    //   1447: aload #30
    //   1449: astore #34
    //   1451: aload #31
    //   1453: astore #38
    //   1455: aload #29
    //   1457: astore #36
    //   1459: aload #30
    //   1461: astore #37
    //   1463: aload #31
    //   1465: getfield p : Z
    //   1468: ifeq -> 2276
    //   1471: aload #31
    //   1473: astore #35
    //   1475: aload #29
    //   1477: astore #33
    //   1479: aload #30
    //   1481: astore #34
    //   1483: invokestatic m : ()Ljava/util/List;
    //   1486: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1491: astore #42
    //   1493: aload #32
    //   1495: astore #39
    //   1497: aload #30
    //   1499: astore #28
    //   1501: aload #29
    //   1503: astore #30
    //   1505: aload #31
    //   1507: astore #29
    //   1509: aload #44
    //   1511: astore #32
    //   1513: aload #29
    //   1515: astore #35
    //   1517: aload #30
    //   1519: astore #33
    //   1521: aload #28
    //   1523: astore #34
    //   1525: aload #29
    //   1527: astore #38
    //   1529: aload #30
    //   1531: astore #36
    //   1533: aload #28
    //   1535: astore #37
    //   1537: aload #42
    //   1539: invokeinterface hasNext : ()Z
    //   1544: ifeq -> 2276
    //   1547: aload #29
    //   1549: astore #35
    //   1551: aload #30
    //   1553: astore #33
    //   1555: aload #28
    //   1557: astore #34
    //   1559: aload #42
    //   1561: invokeinterface next : ()Ljava/lang/Object;
    //   1566: checkcast android/net/Uri
    //   1569: astore #36
    //   1571: aload #45
    //   1573: iload #5
    //   1575: baload
    //   1576: ifne -> 2263
    //   1579: aload #29
    //   1581: astore #35
    //   1583: aload #30
    //   1585: astore #33
    //   1587: aload #28
    //   1589: astore #34
    //   1591: aload #29
    //   1593: getfield J : Z
    //   1596: ifeq -> 1674
    //   1599: aload #29
    //   1601: astore #35
    //   1603: aload #30
    //   1605: astore #33
    //   1607: aload #28
    //   1609: astore #34
    //   1611: iconst_3
    //   1612: anewarray java/lang/String
    //   1615: dup
    //   1616: iconst_0
    //   1617: ldc_w '_data'
    //   1620: aastore
    //   1621: dup
    //   1622: iconst_1
    //   1623: ldc_w 'duration'
    //   1626: aastore
    //   1627: dup
    //   1628: iconst_2
    //   1629: aload #32
    //   1631: aastore
    //   1632: astore #31
    //   1634: aload #31
    //   1636: astore #33
    //   1638: goto -> 1743
    //   1641: astore #29
    //   1643: aload #35
    //   1645: astore #31
    //   1647: aload #34
    //   1649: astore #28
    //   1651: aload #33
    //   1653: astore #30
    //   1655: aload #28
    //   1657: astore #32
    //   1659: aload #29
    //   1661: astore #33
    //   1663: aload #30
    //   1665: astore #28
    //   1667: aload #32
    //   1669: astore #29
    //   1671: goto -> 2291
    //   1674: aload #29
    //   1676: astore #35
    //   1678: aload #30
    //   1680: astore #33
    //   1682: aload #28
    //   1684: astore #34
    //   1686: bipush #7
    //   1688: anewarray java/lang/String
    //   1691: dup
    //   1692: iconst_0
    //   1693: ldc_w '_data'
    //   1696: aastore
    //   1697: dup
    //   1698: iconst_1
    //   1699: ldc_w 'title'
    //   1702: aastore
    //   1703: dup
    //   1704: iconst_2
    //   1705: ldc_w 'artist'
    //   1708: aastore
    //   1709: dup
    //   1710: iconst_3
    //   1711: ldc_w 'album'
    //   1714: aastore
    //   1715: dup
    //   1716: iconst_4
    //   1717: ldc_w 'duration'
    //   1720: aastore
    //   1721: dup
    //   1722: iconst_5
    //   1723: ldc_w 'date_added'
    //   1726: aastore
    //   1727: dup
    //   1728: bipush #6
    //   1730: ldc_w 'date_modified'
    //   1733: aastore
    //   1734: astore #31
    //   1736: aload #31
    //   1738: astore #33
    //   1740: goto -> 1638
    //   1743: aload #29
    //   1745: astore #31
    //   1747: aload #39
    //   1749: aload #36
    //   1751: aload #33
    //   1753: aconst_null
    //   1754: aconst_null
    //   1755: aconst_null
    //   1756: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   1759: astore #33
    //   1761: aload #33
    //   1763: ifnull -> 2235
    //   1766: aload #28
    //   1768: ifnonnull -> 1804
    //   1771: new java/util/HashMap
    //   1774: astore #29
    //   1776: aload #29
    //   1778: aload #33
    //   1780: invokeinterface getCount : ()I
    //   1785: invokespecial <init> : (I)V
    //   1788: aload #29
    //   1790: astore #28
    //   1792: goto -> 1804
    //   1795: astore #29
    //   1797: aload #33
    //   1799: astore #30
    //   1801: goto -> 1655
    //   1804: aload #33
    //   1806: ldc_w '_data'
    //   1809: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   1814: istore #7
    //   1816: aload #33
    //   1818: aload #40
    //   1820: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   1825: istore #10
    //   1827: aload #33
    //   1829: ldc_w 'artist'
    //   1832: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   1837: istore #6
    //   1839: aload #33
    //   1841: ldc_w 'album'
    //   1844: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   1849: istore #9
    //   1851: aload #33
    //   1853: ldc_w 'duration'
    //   1856: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   1861: istore #12
    //   1863: aload #33
    //   1865: aload #41
    //   1867: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   1872: istore #11
    //   1874: aload #33
    //   1876: aload #32
    //   1878: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   1883: istore #8
    //   1885: aload #33
    //   1887: invokeinterface moveToNext : ()Z
    //   1892: ifeq -> 2218
    //   1895: aload #45
    //   1897: iload #5
    //   1899: baload
    //   1900: ifne -> 2205
    //   1903: aload #33
    //   1905: iload #7
    //   1907: invokeinterface getString : (I)Ljava/lang/String;
    //   1912: astore #35
    //   1914: iload #10
    //   1916: iflt -> 1954
    //   1919: aload #33
    //   1921: iload #10
    //   1923: invokeinterface getString : (I)Ljava/lang/String;
    //   1928: astore #29
    //   1930: goto -> 1957
    //   1933: astore #32
    //   1935: aload #33
    //   1937: astore #30
    //   1939: aload #28
    //   1941: astore #29
    //   1943: aload #32
    //   1945: astore #33
    //   1947: aload #30
    //   1949: astore #28
    //   1951: goto -> 2291
    //   1954: aconst_null
    //   1955: astore #29
    //   1957: iload #6
    //   1959: iflt -> 1976
    //   1962: aload #33
    //   1964: iload #6
    //   1966: invokeinterface getString : (I)Ljava/lang/String;
    //   1971: astore #30
    //   1973: goto -> 1979
    //   1976: aconst_null
    //   1977: astore #30
    //   1979: iload #9
    //   1981: iflt -> 1998
    //   1984: aload #33
    //   1986: iload #9
    //   1988: invokeinterface getString : (I)Ljava/lang/String;
    //   1993: astore #34
    //   1995: goto -> 2004
    //   1998: aconst_null
    //   1999: astore #34
    //   2001: goto -> 1995
    //   2004: aload #33
    //   2006: iload #12
    //   2008: invokeinterface getLong : (I)J
    //   2013: lstore #23
    //   2015: iload #11
    //   2017: iflt -> 2038
    //   2020: aload #33
    //   2022: iload #11
    //   2024: invokeinterface getLong : (I)J
    //   2029: ldc2_w 1000
    //   2032: lmul
    //   2033: lstore #21
    //   2035: goto -> 2041
    //   2038: lconst_0
    //   2039: lstore #21
    //   2041: aload #33
    //   2043: iload #8
    //   2045: invokeinterface getLong : (I)J
    //   2050: lstore #25
    //   2052: aload #31
    //   2054: getfield J : Z
    //   2057: ifeq -> 2070
    //   2060: lload #23
    //   2062: lconst_0
    //   2063: lcmp
    //   2064: ifgt -> 2104
    //   2067: goto -> 1885
    //   2070: aload #29
    //   2072: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   2075: ifeq -> 2094
    //   2078: aload #30
    //   2080: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   2083: ifeq -> 2094
    //   2086: aload #34
    //   2088: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   2091: ifne -> 2067
    //   2094: lload #23
    //   2096: lconst_0
    //   2097: lcmp
    //   2098: ifgt -> 2104
    //   2101: goto -> 2067
    //   2104: new km0
    //   2107: astore #36
    //   2109: new qn1
    //   2112: astore #37
    //   2114: aload #37
    //   2116: aconst_null
    //   2117: aload #29
    //   2119: aload #43
    //   2121: aload #34
    //   2123: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   2126: aload #43
    //   2128: aload #30
    //   2130: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   2133: lload #23
    //   2135: l2i
    //   2136: invokespecial <init> : (Lwo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   2139: aload #36
    //   2141: iconst_0
    //   2142: aload #37
    //   2144: aconst_null
    //   2145: aconst_null
    //   2146: aconst_null
    //   2147: lload #21
    //   2149: lload #25
    //   2151: ldc2_w 1000
    //   2154: lmul
    //   2155: lconst_0
    //   2156: lconst_0
    //   2157: iconst_0
    //   2158: iconst_0
    //   2159: iconst_0
    //   2160: iconst_0
    //   2161: iconst_0
    //   2162: iconst_0
    //   2163: aconst_null
    //   2164: aconst_null
    //   2165: aconst_null
    //   2166: sipush #512
    //   2169: invokespecial <init> : (ILqn1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   2172: new d61
    //   2175: astore #29
    //   2177: aload #29
    //   2179: aload #35
    //   2181: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   2184: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   2187: aload #43
    //   2189: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   2192: aload #28
    //   2194: aload #29
    //   2196: aload #36
    //   2198: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2201: pop
    //   2202: goto -> 2067
    //   2205: new android/app/PendingIntent$CanceledException
    //   2208: astore #29
    //   2210: aload #29
    //   2212: invokespecial <init> : ()V
    //   2215: aload #29
    //   2217: athrow
    //   2218: aload #32
    //   2220: astore #29
    //   2222: aload #33
    //   2224: invokeinterface close : ()V
    //   2229: aconst_null
    //   2230: astore #30
    //   2232: goto -> 2243
    //   2235: aload #32
    //   2237: astore #29
    //   2239: aload #33
    //   2241: astore #30
    //   2243: aload #29
    //   2245: astore #32
    //   2247: aload #31
    //   2249: astore #29
    //   2251: goto -> 1513
    //   2254: aload #29
    //   2256: astore #31
    //   2258: astore #29
    //   2260: goto -> 1655
    //   2263: new android/app/PendingIntent$CanceledException
    //   2266: astore #31
    //   2268: aload #31
    //   2270: invokespecial <init> : ()V
    //   2273: aload #31
    //   2275: athrow
    //   2276: aload #38
    //   2278: astore #31
    //   2280: aload #37
    //   2282: astore #30
    //   2284: aload #36
    //   2286: astore #29
    //   2288: goto -> 2312
    //   2291: aload #31
    //   2293: astore #32
    //   2295: aload #28
    //   2297: astore #30
    //   2299: aload #33
    //   2301: invokevirtual printStackTrace : ()V
    //   2304: aload #29
    //   2306: astore #30
    //   2308: aload #28
    //   2310: astore #29
    //   2312: aload #30
    //   2314: ifnonnull -> 2352
    //   2317: aload #31
    //   2319: astore #32
    //   2321: aload #29
    //   2323: astore #30
    //   2325: new java/util/HashMap
    //   2328: dup
    //   2329: iload #5
    //   2331: invokespecial <init> : (I)V
    //   2334: astore #28
    //   2336: aload #28
    //   2338: astore #32
    //   2340: goto -> 2356
    //   2343: astore #29
    //   2345: aload #32
    //   2347: astore #28
    //   2349: goto -> 2392
    //   2352: aload #30
    //   2354: astore #32
    //   2356: aload #32
    //   2358: astore #30
    //   2360: aload #31
    //   2362: astore #28
    //   2364: aload #29
    //   2366: ifnull -> 2451
    //   2369: aload #29
    //   2371: invokeinterface close : ()V
    //   2376: aload #32
    //   2378: astore #30
    //   2380: aload #31
    //   2382: astore #28
    //   2384: goto -> 2451
    //   2387: astore #30
    //   2389: goto -> 1404
    //   2392: aload #29
    //   2394: invokevirtual printStackTrace : ()V
    //   2397: aload #28
    //   2399: astore #29
    //   2401: aload #30
    //   2403: ifnull -> 2437
    //   2406: aload #30
    //   2408: invokeinterface close : ()V
    //   2413: aload #28
    //   2415: astore #29
    //   2417: goto -> 2437
    //   2420: astore #28
    //   2422: aload #30
    //   2424: ifnull -> 2434
    //   2427: aload #30
    //   2429: invokeinterface close : ()V
    //   2434: aload #28
    //   2436: athrow
    //   2437: new java/util/HashMap
    //   2440: dup
    //   2441: iconst_0
    //   2442: invokespecial <init> : (I)V
    //   2445: astore #30
    //   2447: aload #29
    //   2449: astore #28
    //   2451: aload #28
    //   2453: aload #30
    //   2455: putfield Q : Ljava/util/HashMap;
    //   2458: aload #28
    //   2460: astore #29
    //   2462: aload #29
    //   2464: getfield Q : Ljava/util/HashMap;
    //   2467: areturn
    // Exception table:
    //   from	to	target	type
    //   39	57	86	finally
    //   62	70	86	finally
    //   73	83	86	finally
    //   94	104	86	finally
    //   110	119	2387	finally
    //   143	155	1402	finally
    //   163	170	1402	finally
    //   215	220	1402	finally
    //   227	312	202	finally
    //   315	400	1402	finally
    //   403	417	1385	finally
    //   427	449	470	finally
    //   458	467	470	finally
    //   487	499	1340	finally
    //   503	515	1340	finally
    //   519	531	1340	finally
    //   535	547	1340	finally
    //   551	563	1340	finally
    //   567	579	1340	finally
    //   583	595	1340	finally
    //   599	611	1340	finally
    //   615	627	1340	finally
    //   631	642	1340	finally
    //   646	658	1340	finally
    //   666	671	1340	finally
    //   679	690	1340	finally
    //   697	709	470	finally
    //   719	726	1340	finally
    //   742	749	470	finally
    //   753	763	1340	finally
    //   775	786	1303	finally
    //   791	802	805	finally
    //   821	832	805	finally
    //   843	854	805	finally
    //   865	876	805	finally
    //   887	898	805	finally
    //   909	920	805	finally
    //   930	941	1303	finally
    //   946	957	805	finally
    //   969	980	805	finally
    //   994	1005	1303	finally
    //   1015	1037	805	finally
    //   1052	1063	805	finally
    //   1076	1084	1133	finally
    //   1098	1106	1133	finally
    //   1110	1118	1133	finally
    //   1122	1130	1133	finally
    //   1156	1161	1133	finally
    //   1165	1170	1133	finally
    //   1174	1199	1133	finally
    //   1203	1254	1133	finally
    //   1258	1263	1133	finally
    //   1267	1282	1133	finally
    //   1286	1296	1133	finally
    //   1319	1324	1133	finally
    //   1328	1333	1133	finally
    //   1337	1340	1133	finally
    //   1357	1364	1133	finally
    //   1407	1420	1420	finally
    //   1463	1471	1641	finally
    //   1483	1493	1641	finally
    //   1537	1547	1641	finally
    //   1559	1571	1641	finally
    //   1591	1599	1641	finally
    //   1611	1634	1641	finally
    //   1686	1736	1641	finally
    //   1747	1761	2254	finally
    //   1771	1788	1795	finally
    //   1804	1885	1933	finally
    //   1885	1895	1933	finally
    //   1903	1914	1933	finally
    //   1919	1930	1933	finally
    //   1962	1973	1933	finally
    //   1984	1995	1933	finally
    //   2004	2015	1933	finally
    //   2020	2035	1933	finally
    //   2041	2060	1933	finally
    //   2070	2094	1933	finally
    //   2104	2202	1933	finally
    //   2205	2218	1933	finally
    //   2222	2229	1933	finally
    //   2263	2276	2254	finally
    //   2299	2304	2343	finally
    //   2325	2336	2343	finally
    //   2392	2397	2420	finally
  }
  
  public final MediaMetadataRetriever l() {
    if (this.e == null)
      this.e = new MediaMetadataRetriever(); 
    return this.e;
  }
  
  public final void o() {
    boolean bool;
    if (this.d == null)
      this.d = MyApplication.i.getApplicationContext().getString(2131887275); 
    this.a = 0;
    this.b = 0;
    this.c0 = 0L;
    if (this.M)
      try {
        long l = SystemClock.elapsedRealtime();
        if (l > 0L && l < 120000L) {
          l = 120000L - l;
          try {
            StringBuilder stringBuilder = new StringBuilder();
            this("LIBP>P::");
            stringBuilder.append(l);
            n21.F(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(MyApplication.i.getApplicationContext().getString(2131887105));
            stringBuilder.append(" (<");
            stringBuilder.append(l / 1000L);
            stringBuilder.append("s)");
            this.c = stringBuilder.toString();
            x();
            Thread.sleep(l);
          } catch (InterruptedException interruptedException) {}
          n21.F("LIBP>G0");
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    if (Build.VERSION.SDK_INT == 33) {
      wf2.S();
      wf2.U();
    } 
    this.c = MyApplication.i.getApplicationContext().getString(2131887117);
    x();
    this.o = MyApplication.o().getInt("k_i_adt", 0);
    this.p = MyApplication.o().getBoolean("k_b_scvfl", false);
    this.q = MyApplication.o().getBoolean("k_b_scnmfl", false);
    this.r = MyApplication.o().getBoolean("k_b_schdfl", false);
    this.n = MyApplication.o().getBoolean("k_b_cuarialarim", false);
    this.x = ag0.z();
    this.z = new ArrayList();
    ArrayList<Object> arrayList = this.x;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      String str = (String)arrayList.get(i);
      i++;
      str = str;
      this.z.add(str.toLowerCase(Locale.ENGLISH));
    } 
    try {
      if (MyApplication.o().getBoolean("b_icdalfl", true) && MyApplication.F.p()) {
        bool = true;
      } else {
        bool = false;
      } 
    } finally {}
    this.C = bool;
    if (!bool) {
      this.y = ag0.A();
      arrayList = new ArrayList<Object>();
      this();
      this.A = arrayList;
      arrayList = this.y;
      j = arrayList.size();
      i = 0;
      while (i < j) {
        String str = (String)arrayList.get(i);
        i++;
        str = str;
        this.A.add(str.toLowerCase(Locale.ENGLISH));
      } 
      if (Build.VERSION.SDK_INT >= 30 && !MyApplication.F.p()) {
        arrayList = MyApplication.G.d();
        int k = arrayList.size();
        i = 0;
        while (i < k) {
          String str1 = (String)arrayList.get(i);
          j = i + 1;
          String str2 = ((v00)str1).b.toString();
          str1 = str2.toLowerCase(Locale.ENGLISH);
          i = j;
          if (!this.A.contains(str1)) {
            this.y.add(str2);
            this.A.add(str1);
            i = j;
          } 
        } 
      } 
    } 
    this.s = 1;
    this.t = 2;
    if (!this.p)
      this.t = 514; 
    if (!this.r)
      this.t |= 0x8; 
    if (!this.q)
      this.t |= 0x10; 
    p();
    i = this.o;
    if (i == 1) {
      this.u = j0;
      this.v = l0;
    } else if (i == 0) {
      this.u = k0;
      this.v = m0;
    } 
    this.w = n0;
    yp1 yp1 = new yp1();
    MyApplication.F = yp1;
    yp1.m(false);
    MyApplication.F.p();
    yp1 = MyApplication.F;
    if (yp1.a) {
      yp1.a = false;
      n21.F("LIBP>rqrSS");
      try {
        Context context = MyApplication.i.getApplicationContext();
        Intent intent = new Intent();
        this(MyApplication.i.getApplicationContext(), MusicService.class);
        context.stopService(intent);
      } finally {}
      MyApplication.A();
      if (this.E)
        this.F[0] = true; 
    } 
    n21.F("LIBP>smc");
  }
  
  public final void q(v00 paramv00, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_1
    //   1: getfield b : Ld61;
    //   4: invokevirtual toString : ()Ljava/lang/String;
    //   7: astore #21
    //   9: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   12: astore #20
    //   14: new d61
    //   17: dup
    //   18: aload #21
    //   20: aload #20
    //   22: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   25: aconst_null
    //   26: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   29: astore #16
    //   31: aload_0
    //   32: getfield R : Ljava/util/HashSet;
    //   35: aload #16
    //   37: invokevirtual contains : (Ljava/lang/Object;)Z
    //   40: ifne -> 1229
    //   43: aload_0
    //   44: getfield F : [Z
    //   47: astore #17
    //   49: aload #17
    //   51: iconst_0
    //   52: baload
    //   53: ifeq -> 59
    //   56: goto -> 1229
    //   59: aload_0
    //   60: getfield P : Lq01;
    //   63: astore #18
    //   65: aload #16
    //   67: aload #18
    //   69: invokevirtual a : (Lq01;)V
    //   72: aload_0
    //   73: getfield R : Ljava/util/HashSet;
    //   76: aload #16
    //   78: invokevirtual add : (Ljava/lang/Object;)Z
    //   81: pop
    //   82: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   85: aload #21
    //   87: invokevirtual c : (Ljava/lang/String;)Lml0;
    //   90: getfield b : Ljava/lang/String;
    //   93: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   96: astore #19
    //   98: new java/lang/StringBuilder
    //   101: dup
    //   102: invokespecial <init> : ()V
    //   105: astore #22
    //   107: aload_0
    //   108: getfield S : Ljava/util/HashSet;
    //   111: invokevirtual isEmpty : ()Z
    //   114: ifeq -> 125
    //   117: ldc_w ''
    //   120: astore #16
    //   122: goto -> 179
    //   125: new java/lang/StringBuilder
    //   128: dup
    //   129: invokespecial <init> : ()V
    //   132: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   135: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   138: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   141: ldc_w 2131755066
    //   144: aload_0
    //   145: getfield S : Ljava/util/HashSet;
    //   148: invokevirtual size : ()I
    //   151: iconst_1
    //   152: anewarray java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload_0
    //   158: getfield S : Ljava/util/HashSet;
    //   161: invokevirtual size : ()I
    //   164: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   167: aastore
    //   168: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   171: ldc_w '\\n'
    //   174: invokestatic n : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   177: astore #16
    //   179: aload_0
    //   180: aload #22
    //   182: aload #16
    //   184: aload #19
    //   186: invokestatic n : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   189: putfield c : Ljava/lang/String;
    //   192: aload_0
    //   193: invokevirtual x : ()V
    //   196: aload_0
    //   197: aload_1
    //   198: invokevirtual j : (Lv00;)Z
    //   201: istore #11
    //   203: aload_0
    //   204: aload_1
    //   205: getfield b : Ld61;
    //   208: invokevirtual toString : ()Ljava/lang/String;
    //   211: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   214: ifnull -> 223
    //   217: iconst_1
    //   218: istore #10
    //   220: goto -> 226
    //   223: iconst_0
    //   224: istore #10
    //   226: iload_2
    //   227: ifne -> 246
    //   230: aload_1
    //   231: iconst_0
    //   232: invokestatic y : (Lv00;Z)Lv00;
    //   235: ifnull -> 241
    //   238: goto -> 246
    //   241: iconst_0
    //   242: istore_2
    //   243: goto -> 248
    //   246: iconst_1
    //   247: istore_2
    //   248: iload_3
    //   249: ifne -> 268
    //   252: aload_1
    //   253: iconst_0
    //   254: invokestatic z : (Lv00;Z)Lv00;
    //   257: ifnull -> 263
    //   260: goto -> 268
    //   263: iconst_0
    //   264: istore_3
    //   265: goto -> 270
    //   268: iconst_1
    //   269: istore_3
    //   270: iload #11
    //   272: iload #10
    //   274: iload_2
    //   275: iload_3
    //   276: invokestatic c : (ZZZZ)I
    //   279: istore #5
    //   281: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   284: getfield c : Llm0;
    //   287: astore #16
    //   289: aload #16
    //   291: ifnull -> 324
    //   294: aload #16
    //   296: getfield v : Ljava/util/HashMap;
    //   299: aload #21
    //   301: aload #20
    //   303: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   306: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   309: checkcast jm0
    //   312: ifnull -> 318
    //   315: goto -> 324
    //   318: iconst_1
    //   319: istore #4
    //   321: goto -> 327
    //   324: iconst_0
    //   325: istore #4
    //   327: aload_0
    //   328: iload #5
    //   330: invokevirtual i : (I)Z
    //   333: ifne -> 365
    //   336: aload_1
    //   337: instanceof cd1
    //   340: ifne -> 350
    //   343: aload_1
    //   344: instanceof ww1
    //   347: ifeq -> 365
    //   350: aload_0
    //   351: getfield D : Z
    //   354: ifne -> 1229
    //   357: iload #4
    //   359: ifeq -> 365
    //   362: goto -> 1229
    //   365: getstatic android/os/Build$VERSION.SDK_INT : I
    //   368: bipush #30
    //   370: if_icmplt -> 405
    //   373: aload_1
    //   374: instanceof lw0
    //   377: ifeq -> 405
    //   380: aload_1
    //   381: checkcast lw0
    //   384: astore #16
    //   386: aload_0
    //   387: getfield p : Z
    //   390: istore #10
    //   392: aload #16
    //   394: iconst_1
    //   395: putfield l : Z
    //   398: aload #16
    //   400: iload #10
    //   402: putfield k : Z
    //   405: aload_1
    //   406: aload #18
    //   408: invokevirtual D : (Lq01;)Ljava/util/ArrayList;
    //   411: astore #16
    //   413: aload #16
    //   415: invokevirtual size : ()I
    //   418: istore #7
    //   420: iconst_0
    //   421: istore #6
    //   423: iload #5
    //   425: istore #4
    //   427: aload #17
    //   429: astore_1
    //   430: iload #7
    //   432: istore #5
    //   434: iload #6
    //   436: iload #5
    //   438: if_icmpge -> 1229
    //   441: aload #16
    //   443: iload #6
    //   445: invokevirtual get : (I)Ljava/lang/Object;
    //   448: astore #17
    //   450: iload #6
    //   452: iconst_1
    //   453: iadd
    //   454: istore #7
    //   456: aload #17
    //   458: checkcast v00
    //   461: astore #17
    //   463: aload_1
    //   464: iconst_0
    //   465: baload
    //   466: ifeq -> 472
    //   469: goto -> 1229
    //   472: aload #17
    //   474: invokevirtual k : ()Z
    //   477: ifeq -> 488
    //   480: aload_0
    //   481: aload #17
    //   483: iload_2
    //   484: iload_3
    //   485: invokevirtual q : (Lv00;ZZ)V
    //   488: new wo
    //   491: dup
    //   492: aload #17
    //   494: invokevirtual j : ()Landroid/net/Uri;
    //   497: invokevirtual toString : ()Ljava/lang/String;
    //   500: aconst_null
    //   501: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   504: astore #24
    //   506: aload #17
    //   508: getfield b : Ld61;
    //   511: invokevirtual toString : ()Ljava/lang/String;
    //   514: astore #25
    //   516: new d61
    //   519: dup
    //   520: aload #25
    //   522: aconst_null
    //   523: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   526: astore #23
    //   528: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   531: astore #22
    //   533: new d61
    //   536: dup
    //   537: aload #25
    //   539: aload #22
    //   541: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   544: aconst_null
    //   545: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   548: astore #20
    //   550: aload_0
    //   551: getfield S : Ljava/util/HashSet;
    //   554: aload #20
    //   556: invokevirtual contains : (Ljava/lang/Object;)Z
    //   559: ifeq -> 569
    //   562: iload #7
    //   564: istore #6
    //   566: goto -> 434
    //   569: aload_0
    //   570: getfield O : Ljava/util/HashMap;
    //   573: aload #20
    //   575: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   578: checkcast hm0
    //   581: astore #21
    //   583: aload #21
    //   585: ifnonnull -> 851
    //   588: aload #17
    //   590: invokevirtual h : ()Ljava/lang/String;
    //   593: invokestatic C : (Ljava/lang/String;)Ljava/lang/String;
    //   596: astore #21
    //   598: aload_0
    //   599: aload #21
    //   601: invokevirtual d : (Ljava/lang/String;)I
    //   604: istore #9
    //   606: iload #9
    //   608: iconst_m1
    //   609: if_icmpne -> 615
    //   612: goto -> 562
    //   615: aload #20
    //   617: aload #18
    //   619: invokevirtual a : (Lq01;)V
    //   622: aload_0
    //   623: getfield S : Ljava/util/HashSet;
    //   626: aload #20
    //   628: invokevirtual add : (Ljava/lang/Object;)Z
    //   631: pop
    //   632: aload #17
    //   634: instanceof lw0
    //   637: ifeq -> 716
    //   640: aload #25
    //   642: invokestatic A : (Ljava/lang/String;)Ljava/lang/String;
    //   645: astore #20
    //   647: aload #20
    //   649: ifnull -> 698
    //   652: new d61
    //   655: dup
    //   656: aload #20
    //   658: aload #22
    //   660: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   663: aconst_null
    //   664: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   667: astore #22
    //   669: aload_0
    //   670: getfield R : Ljava/util/HashSet;
    //   673: aload #22
    //   675: invokevirtual contains : (Ljava/lang/Object;)Z
    //   678: ifne -> 698
    //   681: aload #22
    //   683: aload #18
    //   685: invokevirtual a : (Lq01;)V
    //   688: aload_0
    //   689: getfield R : Ljava/util/HashSet;
    //   692: aload #22
    //   694: invokevirtual add : (Ljava/lang/Object;)Z
    //   697: pop
    //   698: aload_0
    //   699: aload #20
    //   701: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   704: ifnull -> 716
    //   707: iload #4
    //   709: iconst_2
    //   710: ior
    //   711: istore #6
    //   713: goto -> 720
    //   716: iload #4
    //   718: istore #6
    //   720: iload #9
    //   722: iconst_2
    //   723: if_icmpne -> 748
    //   726: aload_0
    //   727: iload #6
    //   729: invokevirtual i : (I)Z
    //   732: ifeq -> 745
    //   735: aload_0
    //   736: getfield Y : Ljava/util/ArrayList;
    //   739: aload #17
    //   741: invokevirtual add : (Ljava/lang/Object;)Z
    //   744: pop
    //   745: goto -> 848
    //   748: iload #9
    //   750: ifeq -> 759
    //   753: iload #9
    //   755: iconst_1
    //   756: if_icmpne -> 848
    //   759: iload #6
    //   761: istore #8
    //   763: iload #9
    //   765: iconst_1
    //   766: if_icmpne -> 777
    //   769: iload #6
    //   771: sipush #512
    //   774: ior
    //   775: istore #8
    //   777: iload #8
    //   779: aload #21
    //   781: invokestatic f : (Ljava/lang/String;)I
    //   784: ior
    //   785: istore #6
    //   787: aload_0
    //   788: iload #6
    //   790: invokevirtual i : (I)Z
    //   793: ifeq -> 848
    //   796: aload_0
    //   797: aload #17
    //   799: invokevirtual s : (Lv00;)Lkm0;
    //   802: astore #17
    //   804: goto -> 817
    //   807: astore #17
    //   809: aload #17
    //   811: invokevirtual printStackTrace : ()V
    //   814: aconst_null
    //   815: astore #17
    //   817: aload #17
    //   819: ifnull -> 848
    //   822: aload #17
    //   824: aload #17
    //   826: getfield u : I
    //   829: bipush #-96
    //   831: iand
    //   832: iload #6
    //   834: ior
    //   835: putfield u : I
    //   838: aload_0
    //   839: getfield V : Ljava/util/ArrayList;
    //   842: aload #17
    //   844: invokevirtual add : (Ljava/lang/Object;)Z
    //   847: pop
    //   848: goto -> 1124
    //   851: aload #17
    //   853: instanceof lw0
    //   856: ifeq -> 938
    //   859: aload #25
    //   861: invokestatic A : (Ljava/lang/String;)Ljava/lang/String;
    //   864: astore #25
    //   866: aload #25
    //   868: ifnull -> 920
    //   871: new d61
    //   874: dup
    //   875: aload #25
    //   877: aload #22
    //   879: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   882: aconst_null
    //   883: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   886: astore #22
    //   888: aload_0
    //   889: getfield R : Ljava/util/HashSet;
    //   892: aload #22
    //   894: invokevirtual contains : (Ljava/lang/Object;)Z
    //   897: ifne -> 920
    //   900: aload #22
    //   902: aload #18
    //   904: invokevirtual a : (Lq01;)V
    //   907: aload_0
    //   908: getfield R : Ljava/util/HashSet;
    //   911: aload #22
    //   913: invokevirtual add : (Ljava/lang/Object;)Z
    //   916: pop
    //   917: goto -> 920
    //   920: aload_0
    //   921: aload #25
    //   923: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   926: ifnull -> 938
    //   929: iload #4
    //   931: iconst_2
    //   932: ior
    //   933: istore #6
    //   935: goto -> 942
    //   938: iload #4
    //   940: istore #6
    //   942: aload #20
    //   944: aload #18
    //   946: invokevirtual a : (Lq01;)V
    //   949: aload_0
    //   950: getfield S : Ljava/util/HashSet;
    //   953: aload #20
    //   955: invokevirtual add : (Ljava/lang/Object;)Z
    //   958: pop
    //   959: aload #24
    //   961: aload #21
    //   963: getfield c : Lqn1;
    //   966: getfield f : Lwo;
    //   969: invokevirtual equals : (Ljava/lang/Object;)Z
    //   972: ifne -> 1016
    //   975: aload #24
    //   977: aload #18
    //   979: invokevirtual e : (Lq01;)V
    //   982: aload #21
    //   984: aload #24
    //   986: putfield d : Lwo;
    //   989: aload #21
    //   991: getfield f : Ld61;
    //   994: aload #23
    //   996: invokevirtual equals : (Ljava/lang/Object;)Z
    //   999: ifne -> 1016
    //   1002: aload #23
    //   1004: aload #18
    //   1006: invokevirtual a : (Lq01;)V
    //   1009: aload #21
    //   1011: aload #23
    //   1013: putfield e : Ld61;
    //   1016: aload #17
    //   1018: invokevirtual m : ()J
    //   1021: lstore #14
    //   1023: aload #21
    //   1025: getfield a : J
    //   1028: lstore #12
    //   1030: aload_0
    //   1031: getfield H : Z
    //   1034: istore #10
    //   1036: lload #14
    //   1038: lload #12
    //   1040: lsub
    //   1041: ldc2_w 1000
    //   1044: lcmp
    //   1045: ifgt -> 1053
    //   1048: iload #10
    //   1050: ifeq -> 1091
    //   1053: aload_0
    //   1054: aload #17
    //   1056: invokevirtual s : (Lv00;)Lkm0;
    //   1059: astore #17
    //   1061: goto -> 1074
    //   1064: astore #17
    //   1066: aload #17
    //   1068: invokevirtual printStackTrace : ()V
    //   1071: aconst_null
    //   1072: astore #17
    //   1074: aload #17
    //   1076: ifnull -> 1091
    //   1079: aload_0
    //   1080: getfield T : Ljava/util/HashMap;
    //   1083: aload #20
    //   1085: aload #17
    //   1087: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1090: pop
    //   1091: aload #21
    //   1093: getfield b : I
    //   1096: bipush #95
    //   1098: iand
    //   1099: iload #6
    //   1101: if_icmpne -> 1109
    //   1104: iload #10
    //   1106: ifeq -> 1124
    //   1109: aload_0
    //   1110: getfield U : Ljava/util/HashMap;
    //   1113: aload #20
    //   1115: iload #6
    //   1117: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1120: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1123: pop
    //   1124: new java/lang/StringBuilder
    //   1127: dup
    //   1128: invokespecial <init> : ()V
    //   1131: astore #20
    //   1133: aload_0
    //   1134: getfield S : Ljava/util/HashSet;
    //   1137: invokevirtual isEmpty : ()Z
    //   1140: ifeq -> 1151
    //   1143: ldc_w ''
    //   1146: astore #17
    //   1148: goto -> 1205
    //   1151: new java/lang/StringBuilder
    //   1154: dup
    //   1155: invokespecial <init> : ()V
    //   1158: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1161: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1164: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1167: ldc_w 2131755066
    //   1170: aload_0
    //   1171: getfield S : Ljava/util/HashSet;
    //   1174: invokevirtual size : ()I
    //   1177: iconst_1
    //   1178: anewarray java/lang/Object
    //   1181: dup
    //   1182: iconst_0
    //   1183: aload_0
    //   1184: getfield S : Ljava/util/HashSet;
    //   1187: invokevirtual size : ()I
    //   1190: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1193: aastore
    //   1194: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   1197: ldc_w '\\n'
    //   1200: invokestatic n : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1203: astore #17
    //   1205: aload_0
    //   1206: aload #20
    //   1208: aload #17
    //   1210: aload #19
    //   1212: invokestatic n : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1215: putfield c : Ljava/lang/String;
    //   1218: aload_0
    //   1219: invokevirtual x : ()V
    //   1222: iload #7
    //   1224: istore #6
    //   1226: goto -> 434
    //   1229: return
    // Exception table:
    //   from	to	target	type
    //   796	804	807	finally
    //   1053	1061	1064	finally
  }
  
  public final km0 s(v00 paramv00) {
    // Byte code:
    //   0: aload_0
    //   1: getfield I : Z
    //   4: ifeq -> 10
    //   7: goto -> 4757
    //   10: aload_1
    //   11: invokevirtual j : ()Landroid/net/Uri;
    //   14: invokevirtual toString : ()Ljava/lang/String;
    //   17: astore #37
    //   19: aload_1
    //   20: getfield b : Ld61;
    //   23: invokevirtual toString : ()Ljava/lang/String;
    //   26: astore #21
    //   28: aload #21
    //   30: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   33: astore #36
    //   35: aload #21
    //   37: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   40: astore #21
    //   42: aload #21
    //   44: ifnonnull -> 53
    //   47: aconst_null
    //   48: astore #21
    //   50: goto -> 64
    //   53: new ml0
    //   56: dup
    //   57: aload #21
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: astore #21
    //   64: aload #21
    //   66: getfield b : Ljava/lang/String;
    //   69: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   72: astore #34
    //   74: aload #21
    //   76: getfield b : Ljava/lang/String;
    //   79: astore #38
    //   81: aload_1
    //   82: invokevirtual m : ()J
    //   85: lstore #18
    //   87: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   90: aload_1
    //   91: invokevirtual g : (Lv00;)Ljava/lang/String;
    //   94: astore #21
    //   96: aload #21
    //   98: ifnull -> 136
    //   101: new d61
    //   104: dup
    //   105: aload #21
    //   107: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   110: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   113: aconst_null
    //   114: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   117: astore #21
    //   119: aload_0
    //   120: invokevirtual k : ()Ljava/util/HashMap;
    //   123: aload #21
    //   125: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   128: checkcast km0
    //   131: astore #21
    //   133: goto -> 139
    //   136: aconst_null
    //   137: astore #21
    //   139: aload #21
    //   141: ifnull -> 330
    //   144: aload #21
    //   146: getfield l : J
    //   149: ldc2_w 1000
    //   152: ldiv
    //   153: lload #18
    //   155: ldc2_w 1000
    //   158: ldiv
    //   159: lcmp
    //   160: iflt -> 330
    //   163: aload #21
    //   165: getfield c : Lqn1;
    //   168: astore #22
    //   170: aload #22
    //   172: getfield g : I
    //   175: istore #8
    //   177: aload_0
    //   178: getfield J : Z
    //   181: ifne -> 294
    //   184: aload #22
    //   186: getfield b : Ljava/lang/String;
    //   189: astore #26
    //   191: aload #22
    //   193: getfield c : Ljava/lang/String;
    //   196: astore #23
    //   198: aload #22
    //   200: getfield e : Ljava/lang/String;
    //   203: astore #25
    //   205: aload #21
    //   207: getfield j : Ljava/lang/String;
    //   210: astore #24
    //   212: aload #21
    //   214: getfield f : Ljava/lang/String;
    //   217: astore #28
    //   219: aload #21
    //   221: getfield e : Ljava/lang/String;
    //   224: astore #22
    //   226: aload #21
    //   228: invokevirtual l : ()I
    //   231: istore #5
    //   233: aload #21
    //   235: invokevirtual c : ()I
    //   238: istore #4
    //   240: aload #21
    //   242: getfield p : I
    //   245: istore #7
    //   247: aload #21
    //   249: getfield k : J
    //   252: lstore #14
    //   254: aload #21
    //   256: getfield u : I
    //   259: sipush #512
    //   262: iand
    //   263: ifne -> 280
    //   266: aload #22
    //   268: astore #21
    //   270: iconst_1
    //   271: istore #6
    //   273: aload #26
    //   275: astore #22
    //   277: goto -> 336
    //   280: aload #22
    //   282: astore #21
    //   284: iconst_0
    //   285: istore #6
    //   287: aload #26
    //   289: astore #22
    //   291: goto -> 336
    //   294: aconst_null
    //   295: astore #24
    //   297: aconst_null
    //   298: astore #25
    //   300: aconst_null
    //   301: astore #23
    //   303: aconst_null
    //   304: astore #22
    //   306: aconst_null
    //   307: astore #21
    //   309: lconst_0
    //   310: lstore #14
    //   312: aconst_null
    //   313: astore #28
    //   315: iconst_0
    //   316: istore #6
    //   318: iconst_0
    //   319: istore #5
    //   321: iconst_0
    //   322: istore #4
    //   324: iconst_0
    //   325: istore #7
    //   327: goto -> 336
    //   330: iconst_0
    //   331: istore #8
    //   333: goto -> 294
    //   336: iload #6
    //   338: ifne -> 4112
    //   341: new wh
    //   344: dup
    //   345: aload_1
    //   346: invokespecial <init> : (Lu00;)V
    //   349: astore #39
    //   351: aload_0
    //   352: getfield J : Z
    //   355: istore #20
    //   357: aload #39
    //   359: getfield e : Ld02;
    //   362: astore #35
    //   364: iload #20
    //   366: ifeq -> 425
    //   369: iload #8
    //   371: sipush #300
    //   374: if_icmpgt -> 380
    //   377: goto -> 425
    //   380: iload #7
    //   382: istore #9
    //   384: aload #23
    //   386: astore #26
    //   388: aload #22
    //   390: astore #29
    //   392: iconst_0
    //   393: istore #12
    //   395: aload #21
    //   397: astore #23
    //   399: aload #29
    //   401: astore_1
    //   402: iload #6
    //   404: istore #11
    //   406: iload #5
    //   408: istore #6
    //   410: iload #4
    //   412: istore #7
    //   414: iload #9
    //   416: istore #5
    //   418: aload #28
    //   420: astore #21
    //   422: goto -> 1434
    //   425: aload #22
    //   427: astore #29
    //   429: aload #23
    //   431: astore #33
    //   433: aload #25
    //   435: astore #32
    //   437: iload #8
    //   439: istore #10
    //   441: aload #24
    //   443: astore #31
    //   445: aload #28
    //   447: astore #30
    //   449: aload_0
    //   450: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   453: aload #35
    //   455: invokevirtual getFileDescriptor : ()Ljava/io/FileDescriptor;
    //   458: invokevirtual setDataSource : (Ljava/io/FileDescriptor;)V
    //   461: iload #8
    //   463: istore #9
    //   465: iload #8
    //   467: sipush #300
    //   470: if_icmpgt -> 487
    //   473: aload_0
    //   474: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   477: bipush #9
    //   479: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   482: invokestatic parseInt : (Ljava/lang/String;)I
    //   485: istore #9
    //   487: aload #22
    //   489: astore #29
    //   491: aload #23
    //   493: astore #33
    //   495: aload #25
    //   497: astore #32
    //   499: iload #9
    //   501: istore #10
    //   503: aload #24
    //   505: astore #31
    //   507: aload #28
    //   509: astore #30
    //   511: aload_0
    //   512: getfield J : Z
    //   515: ifne -> 1223
    //   518: aload #22
    //   520: astore #29
    //   522: aload #23
    //   524: astore #33
    //   526: aload #25
    //   528: astore #32
    //   530: iload #9
    //   532: istore #10
    //   534: aload #24
    //   536: astore #31
    //   538: aload #28
    //   540: astore #30
    //   542: aload #22
    //   544: astore #27
    //   546: aload #22
    //   548: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   551: ifeq -> 616
    //   554: aload #22
    //   556: astore #29
    //   558: aload #23
    //   560: astore #33
    //   562: aload #25
    //   564: astore #32
    //   566: iload #9
    //   568: istore #10
    //   570: aload #24
    //   572: astore #31
    //   574: aload #28
    //   576: astore #30
    //   578: aload_0
    //   579: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   582: bipush #7
    //   584: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   587: astore #27
    //   589: goto -> 616
    //   592: astore #25
    //   594: aload #33
    //   596: astore #26
    //   598: aload #32
    //   600: astore #22
    //   602: iload #10
    //   604: istore #9
    //   606: aload #31
    //   608: astore #23
    //   610: aload #30
    //   612: astore_1
    //   613: goto -> 1391
    //   616: aload #27
    //   618: astore #29
    //   620: aload #23
    //   622: astore #33
    //   624: aload #25
    //   626: astore #32
    //   628: iload #9
    //   630: istore #10
    //   632: aload #24
    //   634: astore #31
    //   636: aload #28
    //   638: astore #30
    //   640: aload #23
    //   642: astore #26
    //   644: aload #23
    //   646: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   649: ifeq -> 686
    //   652: aload #27
    //   654: astore #29
    //   656: aload #23
    //   658: astore #33
    //   660: aload #25
    //   662: astore #32
    //   664: iload #9
    //   666: istore #10
    //   668: aload #24
    //   670: astore #31
    //   672: aload #28
    //   674: astore #30
    //   676: aload_0
    //   677: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   680: iconst_1
    //   681: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   684: astore #26
    //   686: aload #27
    //   688: astore #29
    //   690: aload #26
    //   692: astore #33
    //   694: aload #25
    //   696: astore #32
    //   698: iload #9
    //   700: istore #10
    //   702: aload #24
    //   704: astore #31
    //   706: aload #28
    //   708: astore #30
    //   710: aload #25
    //   712: astore #22
    //   714: aload #25
    //   716: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   719: ifeq -> 756
    //   722: aload #27
    //   724: astore #29
    //   726: aload #26
    //   728: astore #33
    //   730: aload #25
    //   732: astore #32
    //   734: iload #9
    //   736: istore #10
    //   738: aload #24
    //   740: astore #31
    //   742: aload #28
    //   744: astore #30
    //   746: aload_0
    //   747: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   750: iconst_2
    //   751: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   754: astore #22
    //   756: aload #27
    //   758: astore #29
    //   760: aload #26
    //   762: astore #33
    //   764: aload #22
    //   766: astore #32
    //   768: iload #9
    //   770: istore #10
    //   772: aload #24
    //   774: astore #31
    //   776: aload #28
    //   778: astore #30
    //   780: aload #24
    //   782: astore #23
    //   784: aload #24
    //   786: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   789: ifeq -> 827
    //   792: aload #27
    //   794: astore #29
    //   796: aload #26
    //   798: astore #33
    //   800: aload #22
    //   802: astore #32
    //   804: iload #9
    //   806: istore #10
    //   808: aload #24
    //   810: astore #31
    //   812: aload #28
    //   814: astore #30
    //   816: aload_0
    //   817: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   820: bipush #13
    //   822: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   825: astore #23
    //   827: aload #27
    //   829: astore #29
    //   831: aload #26
    //   833: astore #33
    //   835: aload #22
    //   837: astore #32
    //   839: iload #9
    //   841: istore #10
    //   843: aload #23
    //   845: astore #31
    //   847: aload #28
    //   849: astore #30
    //   851: aload #28
    //   853: astore_1
    //   854: aload #28
    //   856: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   859: ifeq -> 895
    //   862: aload #27
    //   864: astore #29
    //   866: aload #26
    //   868: astore #33
    //   870: aload #22
    //   872: astore #32
    //   874: iload #9
    //   876: istore #10
    //   878: aload #23
    //   880: astore #31
    //   882: aload #28
    //   884: astore #30
    //   886: aload_0
    //   887: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   890: iconst_4
    //   891: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   894: astore_1
    //   895: aload #27
    //   897: astore #29
    //   899: aload #26
    //   901: astore #33
    //   903: aload #22
    //   905: astore #32
    //   907: iload #9
    //   909: istore #10
    //   911: aload #23
    //   913: astore #31
    //   915: aload_1
    //   916: astore #30
    //   918: aload #21
    //   920: astore #24
    //   922: aload #21
    //   924: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   927: ifeq -> 964
    //   930: aload #27
    //   932: astore #29
    //   934: aload #26
    //   936: astore #33
    //   938: aload #22
    //   940: astore #32
    //   942: iload #9
    //   944: istore #10
    //   946: aload #23
    //   948: astore #31
    //   950: aload_1
    //   951: astore #30
    //   953: aload_0
    //   954: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   957: bipush #6
    //   959: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   962: astore #24
    //   964: iload #5
    //   966: ifne -> 1026
    //   969: aload_0
    //   970: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   973: iconst_0
    //   974: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   977: astore #25
    //   979: aload #25
    //   981: ifnull -> 1026
    //   984: aload #25
    //   986: bipush #47
    //   988: invokevirtual indexOf : (I)I
    //   991: istore #8
    //   993: aload #25
    //   995: astore #21
    //   997: iload #8
    //   999: ifle -> 1012
    //   1002: aload #25
    //   1004: iconst_0
    //   1005: iload #8
    //   1007: invokevirtual substring : (II)Ljava/lang/String;
    //   1010: astore #21
    //   1012: aload #21
    //   1014: invokestatic parseInt : (Ljava/lang/String;)I
    //   1017: istore #8
    //   1019: iload #8
    //   1021: istore #5
    //   1023: goto -> 1026
    //   1026: iload #4
    //   1028: istore #8
    //   1030: iload #4
    //   1032: ifne -> 1090
    //   1035: aload_0
    //   1036: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   1039: bipush #14
    //   1041: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   1044: astore #25
    //   1046: iload #4
    //   1048: istore #8
    //   1050: aload #25
    //   1052: ifnull -> 1090
    //   1055: aload #25
    //   1057: bipush #47
    //   1059: invokevirtual indexOf : (I)I
    //   1062: istore #8
    //   1064: aload #25
    //   1066: astore #21
    //   1068: iload #8
    //   1070: ifle -> 1083
    //   1073: aload #25
    //   1075: iconst_0
    //   1076: iload #8
    //   1078: invokevirtual substring : (II)Ljava/lang/String;
    //   1081: astore #21
    //   1083: aload #21
    //   1085: invokestatic parseInt : (Ljava/lang/String;)I
    //   1088: istore #8
    //   1090: iload #7
    //   1092: istore #10
    //   1094: iload #7
    //   1096: ifne -> 1167
    //   1099: aload_0
    //   1100: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   1103: bipush #8
    //   1105: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   1108: astore #25
    //   1110: aload #25
    //   1112: astore #21
    //   1114: aload #25
    //   1116: ifnonnull -> 1129
    //   1119: aload_0
    //   1120: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   1123: iconst_5
    //   1124: invokevirtual extractMetadata : (I)Ljava/lang/String;
    //   1127: astore #21
    //   1129: aload #21
    //   1131: astore #25
    //   1133: aload #21
    //   1135: ifnull -> 1160
    //   1138: aload #21
    //   1140: astore #25
    //   1142: aload #21
    //   1144: invokevirtual length : ()I
    //   1147: iconst_4
    //   1148: if_icmple -> 1160
    //   1151: aload #21
    //   1153: iconst_0
    //   1154: iconst_4
    //   1155: invokevirtual substring : (II)Ljava/lang/String;
    //   1158: astore #25
    //   1160: aload #25
    //   1162: invokestatic parseInt : (Ljava/lang/String;)I
    //   1165: istore #10
    //   1167: invokestatic currentTimeMillis : ()J
    //   1170: lstore #16
    //   1172: lload #16
    //   1174: lstore #14
    //   1176: aload #24
    //   1178: astore #21
    //   1180: aload #27
    //   1182: astore #29
    //   1184: aload #22
    //   1186: astore #27
    //   1188: aload #23
    //   1190: astore #24
    //   1192: iload #8
    //   1194: istore #4
    //   1196: aload_1
    //   1197: astore #28
    //   1199: goto -> 1239
    //   1202: astore #25
    //   1204: aload #24
    //   1206: astore #21
    //   1208: aload #27
    //   1210: astore #29
    //   1212: iload #8
    //   1214: istore #4
    //   1216: iload #10
    //   1218: istore #7
    //   1220: goto -> 1391
    //   1223: iload #7
    //   1225: istore #10
    //   1227: aload #25
    //   1229: astore #27
    //   1231: aload #23
    //   1233: astore #26
    //   1235: aload #22
    //   1237: astore #29
    //   1239: iload #9
    //   1241: ifle -> 1341
    //   1244: aload_0
    //   1245: getfield J : Z
    //   1248: istore #20
    //   1250: iload #20
    //   1252: ifne -> 1341
    //   1255: aload #29
    //   1257: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1260: ifeq -> 1315
    //   1263: aload #26
    //   1265: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1268: ifeq -> 1315
    //   1271: aload #27
    //   1273: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1276: istore #20
    //   1278: iload #20
    //   1280: ifeq -> 1315
    //   1283: iconst_1
    //   1284: istore #7
    //   1286: iconst_1
    //   1287: istore #6
    //   1289: goto -> 1344
    //   1292: astore #25
    //   1294: iconst_1
    //   1295: istore #6
    //   1297: aload #27
    //   1299: astore #22
    //   1301: aload #24
    //   1303: astore #23
    //   1305: iload #10
    //   1307: istore #7
    //   1309: aload #28
    //   1311: astore_1
    //   1312: goto -> 1391
    //   1315: iconst_0
    //   1316: istore #7
    //   1318: goto -> 1286
    //   1321: astore #25
    //   1323: aload #27
    //   1325: astore #22
    //   1327: aload #24
    //   1329: astore #23
    //   1331: iload #10
    //   1333: istore #7
    //   1335: aload #28
    //   1337: astore_1
    //   1338: goto -> 1391
    //   1341: iconst_0
    //   1342: istore #7
    //   1344: aload #39
    //   1346: invokevirtual q : ()V
    //   1349: iload #7
    //   1351: istore #12
    //   1353: aload #21
    //   1355: astore #23
    //   1357: aload #29
    //   1359: astore_1
    //   1360: aload #27
    //   1362: astore #25
    //   1364: iload #9
    //   1366: istore #8
    //   1368: iload #6
    //   1370: istore #11
    //   1372: iload #5
    //   1374: istore #6
    //   1376: iload #4
    //   1378: istore #7
    //   1380: iload #10
    //   1382: istore #5
    //   1384: aload #28
    //   1386: astore #21
    //   1388: goto -> 1434
    //   1391: aload #25
    //   1393: instanceof java/lang/RuntimeException
    //   1396: ifeq -> 1402
    //   1399: goto -> 1407
    //   1402: aload #25
    //   1404: invokevirtual printStackTrace : ()V
    //   1407: aload #39
    //   1409: invokevirtual q : ()V
    //   1412: aload #22
    //   1414: astore #25
    //   1416: iload #9
    //   1418: istore #8
    //   1420: aload #23
    //   1422: astore #24
    //   1424: iload #7
    //   1426: istore #9
    //   1428: aload_1
    //   1429: astore #28
    //   1431: goto -> 392
    //   1434: iload #11
    //   1436: ifeq -> 1507
    //   1439: iload #12
    //   1441: ifeq -> 1447
    //   1444: goto -> 1507
    //   1447: iload #7
    //   1449: istore #10
    //   1451: aload #24
    //   1453: astore #22
    //   1455: iload #8
    //   1457: istore #7
    //   1459: aload #25
    //   1461: astore #27
    //   1463: aload_1
    //   1464: astore #28
    //   1466: iload #5
    //   1468: istore #12
    //   1470: iload #10
    //   1472: istore #4
    //   1474: iload #6
    //   1476: istore #5
    //   1478: iconst_0
    //   1479: istore #9
    //   1481: aload #23
    //   1483: astore_1
    //   1484: aload #28
    //   1486: astore #25
    //   1488: aload #26
    //   1490: astore #24
    //   1492: aload #27
    //   1494: astore #23
    //   1496: iload #11
    //   1498: istore #8
    //   1500: iload #12
    //   1502: istore #6
    //   1504: goto -> 2797
    //   1507: aload #39
    //   1509: invokestatic readMagic : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   1512: astore #22
    //   1514: goto -> 1601
    //   1517: astore #27
    //   1519: aload #26
    //   1521: astore #22
    //   1523: aload_1
    //   1524: astore #28
    //   1526: aload #21
    //   1528: astore_1
    //   1529: aload #28
    //   1531: astore #21
    //   1533: iload #5
    //   1535: istore #9
    //   1537: iload #7
    //   1539: istore #4
    //   1541: iload #6
    //   1543: istore #5
    //   1545: iconst_0
    //   1546: istore #6
    //   1548: aload #27
    //   1550: astore #29
    //   1552: aload #23
    //   1554: astore #26
    //   1556: aload #21
    //   1558: astore #27
    //   1560: aload #22
    //   1562: astore #28
    //   1564: aload #25
    //   1566: astore #23
    //   1568: iload #8
    //   1570: istore #7
    //   1572: aload #24
    //   1574: astore #22
    //   1576: iload #6
    //   1578: istore #8
    //   1580: iload #9
    //   1582: istore #6
    //   1584: goto -> 2765
    //   1587: astore #22
    //   1589: aload #39
    //   1591: invokevirtual q : ()V
    //   1594: aload #39
    //   1596: invokestatic read : (Lu00;)Lorg/jaudiotagger/audio/AudioFile;
    //   1599: astore #22
    //   1601: aload #22
    //   1603: invokevirtual getAudioHeader : ()Lorg/jaudiotagger/audio/AudioHeader;
    //   1606: astore #30
    //   1608: aload #22
    //   1610: invokevirtual getTag : ()Lorg/jaudiotagger/tag/Tag;
    //   1613: astore #29
    //   1615: aload #29
    //   1617: ifnull -> 2707
    //   1620: aload_1
    //   1621: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1624: istore #20
    //   1626: iload #20
    //   1628: ifeq -> 1674
    //   1631: aload_1
    //   1632: astore #27
    //   1634: aload #29
    //   1636: getstatic org/jaudiotagger/tag/FieldKey.TITLE : Lorg/jaudiotagger/tag/FieldKey;
    //   1639: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   1644: astore_1
    //   1645: goto -> 1674
    //   1648: astore #28
    //   1650: aload #26
    //   1652: astore #22
    //   1654: aload #27
    //   1656: astore_1
    //   1657: aload #28
    //   1659: astore #27
    //   1661: aload #21
    //   1663: astore #26
    //   1665: aload_1
    //   1666: astore #21
    //   1668: aload #26
    //   1670: astore_1
    //   1671: goto -> 1533
    //   1674: aload #26
    //   1676: astore #28
    //   1678: aload #26
    //   1680: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1683: istore #20
    //   1685: aload #26
    //   1687: astore #22
    //   1689: iload #20
    //   1691: ifeq -> 1709
    //   1694: aload_1
    //   1695: astore #27
    //   1697: aload #29
    //   1699: getstatic org/jaudiotagger/tag/FieldKey.ALBUM : Lorg/jaudiotagger/tag/FieldKey;
    //   1702: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   1707: astore #22
    //   1709: aload #25
    //   1711: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1714: istore #20
    //   1716: iload #20
    //   1718: ifeq -> 1822
    //   1721: aload #22
    //   1723: astore #28
    //   1725: aload #29
    //   1727: getstatic org/jaudiotagger/tag/FieldKey.ARTIST : Lorg/jaudiotagger/tag/FieldKey;
    //   1730: invokeinterface getAll : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/util/List;
    //   1735: astore #26
    //   1737: aload #26
    //   1739: invokeinterface size : ()I
    //   1744: istore #4
    //   1746: iload #4
    //   1748: iconst_1
    //   1749: if_icmpgt -> 1755
    //   1752: goto -> 1766
    //   1755: new java/util/LinkedHashSet
    //   1758: dup
    //   1759: aload #26
    //   1761: invokespecial <init> : (Ljava/util/Collection;)V
    //   1764: astore #26
    //   1766: ldc_w '; '
    //   1769: aload #26
    //   1771: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   1774: astore #26
    //   1776: aload #26
    //   1778: astore #25
    //   1780: goto -> 1822
    //   1783: astore #27
    //   1785: aload #21
    //   1787: astore #26
    //   1789: aload_1
    //   1790: astore #21
    //   1792: aload #26
    //   1794: astore_1
    //   1795: goto -> 1533
    //   1798: astore #27
    //   1800: aload #21
    //   1802: astore #26
    //   1804: aload_1
    //   1805: astore #21
    //   1807: aload #26
    //   1809: astore_1
    //   1810: goto -> 1533
    //   1813: astore #27
    //   1815: aload #28
    //   1817: astore #22
    //   1819: goto -> 1661
    //   1822: aload #23
    //   1824: astore #26
    //   1826: aload #30
    //   1828: invokeinterface getPreciseTrackLength : ()D
    //   1833: dstore_2
    //   1834: dload_2
    //   1835: ldc2_w 1000.0
    //   1838: dmul
    //   1839: d2i
    //   1840: istore #12
    //   1842: iload #8
    //   1844: ifne -> 1854
    //   1847: iload #12
    //   1849: istore #4
    //   1851: goto -> 1858
    //   1854: iload #8
    //   1856: istore #4
    //   1858: aload #24
    //   1860: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1863: ifeq -> 2021
    //   1866: aload #29
    //   1868: getstatic org/jaudiotagger/tag/FieldKey.ALBUM_ARTIST : Lorg/jaudiotagger/tag/FieldKey;
    //   1871: invokeinterface getAll : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/util/List;
    //   1876: astore #23
    //   1878: aload #23
    //   1880: invokeinterface size : ()I
    //   1885: istore #9
    //   1887: iload #9
    //   1889: iconst_1
    //   1890: if_icmpgt -> 1896
    //   1893: goto -> 1915
    //   1896: aload #24
    //   1898: astore #27
    //   1900: aload #21
    //   1902: astore #28
    //   1904: new java/util/LinkedHashSet
    //   1907: dup
    //   1908: aload #23
    //   1910: invokespecial <init> : (Ljava/util/Collection;)V
    //   1913: astore #23
    //   1915: aload #24
    //   1917: astore #27
    //   1919: aload #21
    //   1921: astore #28
    //   1923: ldc_w '; '
    //   1926: aload #23
    //   1928: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   1931: astore #24
    //   1933: goto -> 2021
    //   1936: astore #29
    //   1938: iload #4
    //   1940: istore #8
    //   1942: aload #26
    //   1944: astore #23
    //   1946: aload #28
    //   1948: astore #21
    //   1950: iload #6
    //   1952: istore #9
    //   1954: aload #27
    //   1956: astore #24
    //   1958: aload #29
    //   1960: astore #26
    //   1962: iload #4
    //   1964: istore #6
    //   1966: iload #7
    //   1968: istore #10
    //   1970: iload #9
    //   1972: istore #6
    //   1974: aload #23
    //   1976: astore #28
    //   1978: aload #26
    //   1980: astore #27
    //   1982: aload #28
    //   1984: astore #23
    //   1986: aload_1
    //   1987: astore #28
    //   1989: iload #4
    //   1991: istore #8
    //   1993: iload #10
    //   1995: istore #7
    //   1997: goto -> 1526
    //   2000: astore #27
    //   2002: aload #26
    //   2004: astore #23
    //   2006: aload_1
    //   2007: astore #28
    //   2009: iload #4
    //   2011: istore #8
    //   2013: goto -> 1526
    //   2016: astore #27
    //   2018: goto -> 2002
    //   2021: aload #24
    //   2023: astore #27
    //   2025: aload #21
    //   2027: astore #28
    //   2029: aload #21
    //   2031: astore #23
    //   2033: aload #21
    //   2035: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   2038: ifeq -> 2120
    //   2041: aload #24
    //   2043: astore #27
    //   2045: aload #21
    //   2047: astore #28
    //   2049: aload #29
    //   2051: getstatic org/jaudiotagger/tag/FieldKey.COMPOSER : Lorg/jaudiotagger/tag/FieldKey;
    //   2054: invokeinterface getAll : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/util/List;
    //   2059: astore #23
    //   2061: aload #24
    //   2063: astore #27
    //   2065: aload #21
    //   2067: astore #28
    //   2069: aload #23
    //   2071: invokeinterface size : ()I
    //   2076: iconst_1
    //   2077: if_icmpgt -> 2083
    //   2080: goto -> 2102
    //   2083: aload #24
    //   2085: astore #27
    //   2087: aload #21
    //   2089: astore #28
    //   2091: new java/util/LinkedHashSet
    //   2094: dup
    //   2095: aload #23
    //   2097: invokespecial <init> : (Ljava/util/Collection;)V
    //   2100: astore #23
    //   2102: aload #24
    //   2104: astore #27
    //   2106: aload #21
    //   2108: astore #28
    //   2110: ldc_w '; '
    //   2113: aload #23
    //   2115: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   2118: astore #23
    //   2120: aload #24
    //   2122: astore #27
    //   2124: aload #23
    //   2126: astore #28
    //   2128: aload #26
    //   2130: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   2133: ifeq -> 2218
    //   2136: aload #24
    //   2138: astore #27
    //   2140: aload #23
    //   2142: astore #28
    //   2144: aload #29
    //   2146: getstatic org/jaudiotagger/tag/FieldKey.GENRE : Lorg/jaudiotagger/tag/FieldKey;
    //   2149: invokeinterface getAll : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/util/List;
    //   2154: astore #21
    //   2156: aload #24
    //   2158: astore #27
    //   2160: aload #23
    //   2162: astore #28
    //   2164: aload #21
    //   2166: invokeinterface size : ()I
    //   2171: iconst_1
    //   2172: if_icmpgt -> 2178
    //   2175: goto -> 2197
    //   2178: aload #24
    //   2180: astore #27
    //   2182: aload #23
    //   2184: astore #28
    //   2186: new java/util/LinkedHashSet
    //   2189: dup
    //   2190: aload #21
    //   2192: invokespecial <init> : (Ljava/util/Collection;)V
    //   2195: astore #21
    //   2197: aload #24
    //   2199: astore #27
    //   2201: aload #23
    //   2203: astore #28
    //   2205: ldc_w '; '
    //   2208: aload #21
    //   2210: invokestatic join : (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   2213: astore #21
    //   2215: goto -> 2222
    //   2218: aload #26
    //   2220: astore #21
    //   2222: iload #6
    //   2224: istore #9
    //   2226: iload #6
    //   2228: ifne -> 2287
    //   2231: aload #29
    //   2233: getstatic org/jaudiotagger/tag/FieldKey.TRACK : Lorg/jaudiotagger/tag/FieldKey;
    //   2236: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   2241: astore #27
    //   2243: iload #6
    //   2245: istore #9
    //   2247: aload #27
    //   2249: ifnull -> 2287
    //   2252: aload #27
    //   2254: bipush #47
    //   2256: invokevirtual indexOf : (I)I
    //   2259: istore #9
    //   2261: aload #27
    //   2263: astore #26
    //   2265: iload #9
    //   2267: ifle -> 2280
    //   2270: aload #27
    //   2272: iconst_0
    //   2273: iload #9
    //   2275: invokevirtual substring : (II)Ljava/lang/String;
    //   2278: astore #26
    //   2280: aload #26
    //   2282: invokestatic parseInt : (Ljava/lang/String;)I
    //   2285: istore #9
    //   2287: iload #7
    //   2289: istore #10
    //   2291: iload #7
    //   2293: ifne -> 2352
    //   2296: aload #29
    //   2298: getstatic org/jaudiotagger/tag/FieldKey.DISC_NO : Lorg/jaudiotagger/tag/FieldKey;
    //   2301: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   2306: astore #27
    //   2308: iload #7
    //   2310: istore #10
    //   2312: aload #27
    //   2314: ifnull -> 2352
    //   2317: aload #27
    //   2319: bipush #47
    //   2321: invokevirtual indexOf : (I)I
    //   2324: istore #6
    //   2326: aload #27
    //   2328: astore #26
    //   2330: iload #6
    //   2332: ifle -> 2345
    //   2335: aload #27
    //   2337: iconst_0
    //   2338: iload #6
    //   2340: invokevirtual substring : (II)Ljava/lang/String;
    //   2343: astore #26
    //   2345: aload #26
    //   2347: invokestatic parseInt : (Ljava/lang/String;)I
    //   2350: istore #10
    //   2352: iload #5
    //   2354: istore #6
    //   2356: iload #5
    //   2358: ifne -> 2472
    //   2361: aload #29
    //   2363: getstatic org/jaudiotagger/tag/FieldKey.YEAR : Lorg/jaudiotagger/tag/FieldKey;
    //   2366: invokeinterface getFirst : (Lorg/jaudiotagger/tag/FieldKey;)Ljava/lang/String;
    //   2371: astore #27
    //   2373: aload #27
    //   2375: astore #26
    //   2377: aload #27
    //   2379: ifnull -> 2428
    //   2382: aload #27
    //   2384: astore #26
    //   2386: aload #27
    //   2388: invokevirtual length : ()I
    //   2391: iconst_4
    //   2392: if_icmple -> 2428
    //   2395: aload #27
    //   2397: iconst_0
    //   2398: iconst_4
    //   2399: invokevirtual substring : (II)Ljava/lang/String;
    //   2402: astore #26
    //   2404: goto -> 2428
    //   2407: astore #26
    //   2409: iload #4
    //   2411: istore #6
    //   2413: aload #21
    //   2415: astore #28
    //   2417: iload #9
    //   2419: istore #6
    //   2421: aload #23
    //   2423: astore #21
    //   2425: goto -> 1978
    //   2428: aload #26
    //   2430: invokestatic parseInt : (Ljava/lang/String;)I
    //   2433: istore #6
    //   2435: goto -> 2472
    //   2438: astore #27
    //   2440: aload #26
    //   2442: bipush #59
    //   2444: invokevirtual indexOf : (I)I
    //   2447: istore #7
    //   2449: iload #5
    //   2451: istore #6
    //   2453: iload #7
    //   2455: iconst_m1
    //   2456: if_icmpeq -> 2472
    //   2459: aload #26
    //   2461: iconst_0
    //   2462: iload #7
    //   2464: invokevirtual substring : (II)Ljava/lang/String;
    //   2467: invokestatic parseInt : (Ljava/lang/String;)I
    //   2470: istore #6
    //   2472: invokestatic currentTimeMillis : ()J
    //   2475: lstore #16
    //   2477: iload #8
    //   2479: ifle -> 2544
    //   2482: iload #8
    //   2484: i2d
    //   2485: iload #12
    //   2487: i2d
    //   2488: dsub
    //   2489: ldc2_w 1000.0
    //   2492: ddiv
    //   2493: dstore_2
    //   2494: dload_2
    //   2495: invokestatic abs : (D)D
    //   2498: ldc2_w 4.0
    //   2501: dcmpl
    //   2502: ifle -> 2544
    //   2505: iconst_1
    //   2506: istore #5
    //   2508: goto -> 2547
    //   2511: aload #21
    //   2513: astore #27
    //   2515: astore #26
    //   2517: lload #16
    //   2519: lstore #14
    //   2521: iload #4
    //   2523: istore #5
    //   2525: iload #10
    //   2527: istore #7
    //   2529: iload #6
    //   2531: istore #5
    //   2533: aload #23
    //   2535: astore #21
    //   2537: aload #27
    //   2539: astore #23
    //   2541: goto -> 1962
    //   2544: iconst_0
    //   2545: istore #5
    //   2547: iload #8
    //   2549: iload #12
    //   2551: if_icmpne -> 2581
    //   2554: iload #12
    //   2556: ifne -> 2581
    //   2559: aload #39
    //   2561: invokevirtual n : ()J
    //   2564: lstore #14
    //   2566: lload #14
    //   2568: ldc2_w 1024
    //   2571: lcmp
    //   2572: ifle -> 2581
    //   2575: iconst_1
    //   2576: istore #7
    //   2578: goto -> 2584
    //   2581: iconst_0
    //   2582: istore #7
    //   2584: iload #5
    //   2586: ifne -> 2617
    //   2589: iload #7
    //   2591: ifne -> 2617
    //   2594: lload #16
    //   2596: lstore #14
    //   2598: aload #22
    //   2600: astore #26
    //   2602: iload #4
    //   2604: istore #7
    //   2606: iload #6
    //   2608: istore #5
    //   2610: aload #23
    //   2612: astore #22
    //   2614: goto -> 2727
    //   2617: new java/lang/Exception
    //   2620: astore #26
    //   2622: aload #26
    //   2624: invokespecial <init> : ()V
    //   2627: aload #26
    //   2629: athrow
    //   2630: astore #29
    //   2632: lload #16
    //   2634: lstore #14
    //   2636: iload #4
    //   2638: istore #7
    //   2640: aload_1
    //   2641: astore #27
    //   2643: aload #23
    //   2645: astore_1
    //   2646: iload #10
    //   2648: istore #4
    //   2650: iload #9
    //   2652: istore #5
    //   2654: iconst_1
    //   2655: istore #8
    //   2657: aload #21
    //   2659: astore #26
    //   2661: aload #22
    //   2663: astore #28
    //   2665: aload #25
    //   2667: astore #23
    //   2669: aload #24
    //   2671: astore #22
    //   2673: goto -> 2765
    //   2676: astore #26
    //   2678: iload #6
    //   2680: istore #5
    //   2682: goto -> 2409
    //   2685: astore #27
    //   2687: goto -> 1785
    //   2690: astore #27
    //   2692: goto -> 1661
    //   2695: astore #27
    //   2697: aload_1
    //   2698: astore #28
    //   2700: aload #26
    //   2702: astore #22
    //   2704: goto -> 1526
    //   2707: aload #21
    //   2709: astore #22
    //   2711: iload #7
    //   2713: istore #10
    //   2715: iload #6
    //   2717: istore #9
    //   2719: iload #8
    //   2721: istore #7
    //   2723: aload #23
    //   2725: astore #21
    //   2727: aload #39
    //   2729: invokevirtual q : ()V
    //   2732: aload #22
    //   2734: astore #29
    //   2736: iconst_1
    //   2737: istore #11
    //   2739: aload #21
    //   2741: astore #23
    //   2743: aload_1
    //   2744: astore #28
    //   2746: aload #25
    //   2748: astore #27
    //   2750: aload #24
    //   2752: astore #22
    //   2754: iload #9
    //   2756: istore #6
    //   2758: aload #29
    //   2760: astore #21
    //   2762: goto -> 1466
    //   2765: aload #29
    //   2767: invokevirtual printStackTrace : ()V
    //   2770: aload #39
    //   2772: invokevirtual q : ()V
    //   2775: aload_1
    //   2776: astore #21
    //   2778: iload #8
    //   2780: istore #9
    //   2782: iload #11
    //   2784: istore #8
    //   2786: aload #28
    //   2788: astore #24
    //   2790: aload #27
    //   2792: astore #25
    //   2794: aload #26
    //   2796: astore_1
    //   2797: iload #8
    //   2799: ifne -> 4055
    //   2802: iload #9
    //   2804: ifeq -> 2815
    //   2807: sipush #257
    //   2810: istore #10
    //   2812: goto -> 2822
    //   2815: bipush #35
    //   2817: istore #10
    //   2819: goto -> 2812
    //   2822: new jt1
    //   2825: astore #33
    //   2827: aload #33
    //   2829: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   2832: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   2835: aload #39
    //   2837: getfield b : Lu00;
    //   2840: invokevirtual j : ()Landroid/net/Uri;
    //   2843: iload #10
    //   2845: aload #35
    //   2847: invokevirtual getFd : ()I
    //   2850: aload #39
    //   2852: invokevirtual n : ()J
    //   2855: invokespecial <init> : (Landroid/content/Context;Landroid/net/Uri;IIJ)V
    //   2858: aload #33
    //   2860: getfield c : Z
    //   2863: istore #20
    //   2865: iload #20
    //   2867: ifeq -> 3967
    //   2870: iload #7
    //   2872: ifeq -> 2880
    //   2875: iload #9
    //   2877: ifeq -> 2883
    //   2880: goto -> 2886
    //   2883: goto -> 2938
    //   2886: aload_1
    //   2887: astore #32
    //   2889: aload #25
    //   2891: astore #31
    //   2893: aload #24
    //   2895: astore #30
    //   2897: aload #23
    //   2899: astore #29
    //   2901: iload #7
    //   2903: istore #13
    //   2905: aload #22
    //   2907: astore #28
    //   2909: iload #5
    //   2911: istore #12
    //   2913: iload #4
    //   2915: istore #11
    //   2917: iload #6
    //   2919: istore #10
    //   2921: aload #21
    //   2923: astore #27
    //   2925: aload #33
    //   2927: getfield j : J
    //   2930: l2d
    //   2931: ldc2_w 1000.0
    //   2934: ddiv
    //   2935: d2i
    //   2936: istore #7
    //   2938: iload #9
    //   2940: ifne -> 3921
    //   2943: aload_1
    //   2944: astore #32
    //   2946: aload #25
    //   2948: astore #31
    //   2950: aload #24
    //   2952: astore #30
    //   2954: aload #23
    //   2956: astore #29
    //   2958: iload #7
    //   2960: istore #13
    //   2962: aload #22
    //   2964: astore #28
    //   2966: iload #5
    //   2968: istore #12
    //   2970: iload #4
    //   2972: istore #11
    //   2974: iload #6
    //   2976: istore #10
    //   2978: aload #21
    //   2980: astore #27
    //   2982: aload #25
    //   2984: astore #26
    //   2986: aload #25
    //   2988: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   2991: ifeq -> 3090
    //   2994: aload_1
    //   2995: astore #32
    //   2997: aload #25
    //   2999: astore #31
    //   3001: aload #24
    //   3003: astore #30
    //   3005: aload #23
    //   3007: astore #29
    //   3009: iload #7
    //   3011: istore #13
    //   3013: aload #22
    //   3015: astore #28
    //   3017: iload #5
    //   3019: istore #12
    //   3021: iload #4
    //   3023: istore #11
    //   3025: iload #6
    //   3027: istore #10
    //   3029: aload #21
    //   3031: astore #27
    //   3033: aload #33
    //   3035: ldc_w 'title'
    //   3038: invokevirtual d : (Ljava/lang/String;)Ljava/lang/String;
    //   3041: astore #26
    //   3043: goto -> 3090
    //   3046: astore #26
    //   3048: aload #32
    //   3050: astore_1
    //   3051: aload #31
    //   3053: astore #25
    //   3055: aload #30
    //   3057: astore #24
    //   3059: aload #29
    //   3061: astore #23
    //   3063: iload #13
    //   3065: istore #7
    //   3067: aload #28
    //   3069: astore #22
    //   3071: iload #12
    //   3073: istore #5
    //   3075: iload #11
    //   3077: istore #4
    //   3079: iload #10
    //   3081: istore #6
    //   3083: aload #27
    //   3085: astore #21
    //   3087: goto -> 4002
    //   3090: aload_1
    //   3091: astore #32
    //   3093: aload #26
    //   3095: astore #31
    //   3097: aload #24
    //   3099: astore #30
    //   3101: aload #23
    //   3103: astore #29
    //   3105: iload #7
    //   3107: istore #13
    //   3109: aload #22
    //   3111: astore #28
    //   3113: iload #5
    //   3115: istore #12
    //   3117: iload #4
    //   3119: istore #11
    //   3121: iload #6
    //   3123: istore #10
    //   3125: aload #21
    //   3127: astore #27
    //   3129: aload #24
    //   3131: astore #25
    //   3133: aload #24
    //   3135: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   3138: ifeq -> 3190
    //   3141: aload_1
    //   3142: astore #32
    //   3144: aload #26
    //   3146: astore #31
    //   3148: aload #24
    //   3150: astore #30
    //   3152: aload #23
    //   3154: astore #29
    //   3156: iload #7
    //   3158: istore #13
    //   3160: aload #22
    //   3162: astore #28
    //   3164: iload #5
    //   3166: istore #12
    //   3168: iload #4
    //   3170: istore #11
    //   3172: iload #6
    //   3174: istore #10
    //   3176: aload #21
    //   3178: astore #27
    //   3180: aload #33
    //   3182: ldc_w 'album'
    //   3185: invokevirtual d : (Ljava/lang/String;)Ljava/lang/String;
    //   3188: astore #25
    //   3190: aload_1
    //   3191: astore #32
    //   3193: aload #26
    //   3195: astore #31
    //   3197: aload #25
    //   3199: astore #30
    //   3201: aload #23
    //   3203: astore #29
    //   3205: iload #7
    //   3207: istore #13
    //   3209: aload #22
    //   3211: astore #28
    //   3213: iload #5
    //   3215: istore #12
    //   3217: iload #4
    //   3219: istore #11
    //   3221: iload #6
    //   3223: istore #10
    //   3225: aload #21
    //   3227: astore #27
    //   3229: aload #23
    //   3231: astore #24
    //   3233: aload #23
    //   3235: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   3238: ifeq -> 3290
    //   3241: aload_1
    //   3242: astore #32
    //   3244: aload #26
    //   3246: astore #31
    //   3248: aload #25
    //   3250: astore #30
    //   3252: aload #23
    //   3254: astore #29
    //   3256: iload #7
    //   3258: istore #13
    //   3260: aload #22
    //   3262: astore #28
    //   3264: iload #5
    //   3266: istore #12
    //   3268: iload #4
    //   3270: istore #11
    //   3272: iload #6
    //   3274: istore #10
    //   3276: aload #21
    //   3278: astore #27
    //   3280: aload #33
    //   3282: ldc_w 'artist'
    //   3285: invokevirtual d : (Ljava/lang/String;)Ljava/lang/String;
    //   3288: astore #24
    //   3290: aload_1
    //   3291: astore #32
    //   3293: aload #26
    //   3295: astore #31
    //   3297: aload #25
    //   3299: astore #30
    //   3301: aload #24
    //   3303: astore #29
    //   3305: iload #7
    //   3307: istore #13
    //   3309: aload #22
    //   3311: astore #28
    //   3313: iload #5
    //   3315: istore #12
    //   3317: iload #4
    //   3319: istore #11
    //   3321: iload #6
    //   3323: istore #10
    //   3325: aload #21
    //   3327: astore #27
    //   3329: aload #22
    //   3331: astore #23
    //   3333: aload #22
    //   3335: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   3338: ifeq -> 3390
    //   3341: aload_1
    //   3342: astore #32
    //   3344: aload #26
    //   3346: astore #31
    //   3348: aload #25
    //   3350: astore #30
    //   3352: aload #24
    //   3354: astore #29
    //   3356: iload #7
    //   3358: istore #13
    //   3360: aload #22
    //   3362: astore #28
    //   3364: iload #5
    //   3366: istore #12
    //   3368: iload #4
    //   3370: istore #11
    //   3372: iload #6
    //   3374: istore #10
    //   3376: aload #21
    //   3378: astore #27
    //   3380: aload #33
    //   3382: ldc_w 'album_artist'
    //   3385: invokevirtual d : (Ljava/lang/String;)Ljava/lang/String;
    //   3388: astore #23
    //   3390: aload_1
    //   3391: astore #32
    //   3393: aload #26
    //   3395: astore #31
    //   3397: aload #25
    //   3399: astore #30
    //   3401: aload #24
    //   3403: astore #29
    //   3405: iload #7
    //   3407: istore #13
    //   3409: aload #23
    //   3411: astore #28
    //   3413: iload #5
    //   3415: istore #12
    //   3417: iload #4
    //   3419: istore #11
    //   3421: iload #6
    //   3423: istore #10
    //   3425: aload #21
    //   3427: astore #27
    //   3429: aload #21
    //   3431: astore #22
    //   3433: aload #21
    //   3435: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   3438: ifeq -> 3490
    //   3441: aload_1
    //   3442: astore #32
    //   3444: aload #26
    //   3446: astore #31
    //   3448: aload #25
    //   3450: astore #30
    //   3452: aload #24
    //   3454: astore #29
    //   3456: iload #7
    //   3458: istore #13
    //   3460: aload #23
    //   3462: astore #28
    //   3464: iload #5
    //   3466: istore #12
    //   3468: iload #4
    //   3470: istore #11
    //   3472: iload #6
    //   3474: istore #10
    //   3476: aload #21
    //   3478: astore #27
    //   3480: aload #33
    //   3482: ldc_w 'composer'
    //   3485: invokevirtual d : (Ljava/lang/String;)Ljava/lang/String;
    //   3488: astore #22
    //   3490: aload_1
    //   3491: astore #32
    //   3493: aload #26
    //   3495: astore #31
    //   3497: aload #25
    //   3499: astore #30
    //   3501: aload #24
    //   3503: astore #29
    //   3505: iload #7
    //   3507: istore #13
    //   3509: aload #23
    //   3511: astore #28
    //   3513: iload #5
    //   3515: istore #12
    //   3517: iload #4
    //   3519: istore #11
    //   3521: iload #6
    //   3523: istore #10
    //   3525: aload #22
    //   3527: astore #27
    //   3529: aload_1
    //   3530: astore #21
    //   3532: aload_1
    //   3533: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   3536: ifeq -> 3588
    //   3539: aload_1
    //   3540: astore #32
    //   3542: aload #26
    //   3544: astore #31
    //   3546: aload #25
    //   3548: astore #30
    //   3550: aload #24
    //   3552: astore #29
    //   3554: iload #7
    //   3556: istore #13
    //   3558: aload #23
    //   3560: astore #28
    //   3562: iload #5
    //   3564: istore #12
    //   3566: iload #4
    //   3568: istore #11
    //   3570: iload #6
    //   3572: istore #10
    //   3574: aload #22
    //   3576: astore #27
    //   3578: aload #33
    //   3580: ldc_w 'genre'
    //   3583: invokevirtual d : (Ljava/lang/String;)Ljava/lang/String;
    //   3586: astore #21
    //   3588: iload #6
    //   3590: istore #9
    //   3592: iload #6
    //   3594: ifne -> 3761
    //   3597: aload #21
    //   3599: astore #32
    //   3601: aload #26
    //   3603: astore #31
    //   3605: aload #25
    //   3607: astore #30
    //   3609: aload #24
    //   3611: astore #29
    //   3613: iload #7
    //   3615: istore #13
    //   3617: aload #23
    //   3619: astore #28
    //   3621: iload #5
    //   3623: istore #12
    //   3625: iload #4
    //   3627: istore #11
    //   3629: iload #6
    //   3631: istore #10
    //   3633: aload #22
    //   3635: astore #27
    //   3637: aload #33
    //   3639: ldc_w 'date'
    //   3642: invokevirtual d : (Ljava/lang/String;)Ljava/lang/String;
    //   3645: astore #35
    //   3647: aload #35
    //   3649: astore_1
    //   3650: aload #35
    //   3652: ifnull -> 3755
    //   3655: aload #21
    //   3657: astore #32
    //   3659: aload #26
    //   3661: astore #31
    //   3663: aload #25
    //   3665: astore #30
    //   3667: aload #24
    //   3669: astore #29
    //   3671: iload #7
    //   3673: istore #13
    //   3675: aload #23
    //   3677: astore #28
    //   3679: iload #5
    //   3681: istore #12
    //   3683: iload #4
    //   3685: istore #11
    //   3687: iload #6
    //   3689: istore #10
    //   3691: aload #22
    //   3693: astore #27
    //   3695: aload #35
    //   3697: astore_1
    //   3698: aload #35
    //   3700: invokevirtual length : ()I
    //   3703: iconst_4
    //   3704: if_icmple -> 3755
    //   3707: aload #21
    //   3709: astore #32
    //   3711: aload #26
    //   3713: astore #31
    //   3715: aload #25
    //   3717: astore #30
    //   3719: aload #24
    //   3721: astore #29
    //   3723: iload #7
    //   3725: istore #13
    //   3727: aload #23
    //   3729: astore #28
    //   3731: iload #5
    //   3733: istore #12
    //   3735: iload #4
    //   3737: istore #11
    //   3739: iload #6
    //   3741: istore #10
    //   3743: aload #22
    //   3745: astore #27
    //   3747: aload #35
    //   3749: iconst_0
    //   3750: iconst_4
    //   3751: invokevirtual substring : (II)Ljava/lang/String;
    //   3754: astore_1
    //   3755: aload_1
    //   3756: invokestatic parseInt : (Ljava/lang/String;)I
    //   3759: istore #9
    //   3761: iload #5
    //   3763: istore #6
    //   3765: iload #5
    //   3767: ifne -> 3812
    //   3770: aload #33
    //   3772: ldc_w 'track'
    //   3775: invokevirtual d : (Ljava/lang/String;)Ljava/lang/String;
    //   3778: astore #27
    //   3780: aload #27
    //   3782: bipush #47
    //   3784: invokevirtual lastIndexOf : (I)I
    //   3787: istore #6
    //   3789: aload #27
    //   3791: astore_1
    //   3792: iload #6
    //   3794: ifle -> 3806
    //   3797: aload #27
    //   3799: iconst_0
    //   3800: iload #6
    //   3802: invokevirtual substring : (II)Ljava/lang/String;
    //   3805: astore_1
    //   3806: aload_1
    //   3807: invokestatic parseInt : (Ljava/lang/String;)I
    //   3810: istore #6
    //   3812: iload #4
    //   3814: istore #5
    //   3816: iload #4
    //   3818: ifne -> 3834
    //   3821: aload #33
    //   3823: ldc_w 'disc'
    //   3826: invokevirtual d : (Ljava/lang/String;)Ljava/lang/String;
    //   3829: invokestatic parseInt : (Ljava/lang/String;)I
    //   3832: istore #5
    //   3834: aload #21
    //   3836: astore #32
    //   3838: aload #26
    //   3840: astore #31
    //   3842: aload #25
    //   3844: astore #30
    //   3846: aload #24
    //   3848: astore #29
    //   3850: iload #7
    //   3852: istore #13
    //   3854: aload #23
    //   3856: astore #28
    //   3858: iload #6
    //   3860: istore #12
    //   3862: iload #5
    //   3864: istore #11
    //   3866: iload #9
    //   3868: istore #10
    //   3870: aload #22
    //   3872: astore #27
    //   3874: invokestatic currentTimeMillis : ()J
    //   3877: lstore #16
    //   3879: lload #16
    //   3881: lstore #14
    //   3883: aload #21
    //   3885: astore_1
    //   3886: aload #26
    //   3888: astore #29
    //   3890: aload #25
    //   3892: astore #28
    //   3894: aload #24
    //   3896: astore #27
    //   3898: aload #23
    //   3900: astore #26
    //   3902: iload #6
    //   3904: istore #10
    //   3906: iload #5
    //   3908: istore #4
    //   3910: iload #9
    //   3912: istore #6
    //   3914: aload #22
    //   3916: astore #21
    //   3918: goto -> 3941
    //   3921: iload #5
    //   3923: istore #10
    //   3925: aload #22
    //   3927: astore #26
    //   3929: aload #23
    //   3931: astore #27
    //   3933: aload #24
    //   3935: astore #28
    //   3937: aload #25
    //   3939: astore #29
    //   3941: iconst_1
    //   3942: istore #8
    //   3944: aload #29
    //   3946: astore #25
    //   3948: aload #28
    //   3950: astore #24
    //   3952: aload #27
    //   3954: astore #23
    //   3956: aload #26
    //   3958: astore #22
    //   3960: iload #10
    //   3962: istore #5
    //   3964: goto -> 3967
    //   3967: aload #33
    //   3969: invokevirtual close : ()V
    //   3972: aload #39
    //   3974: invokevirtual q : ()V
    //   3977: iload #5
    //   3979: istore #9
    //   3981: iload #4
    //   3983: istore #5
    //   3985: iload #9
    //   3987: istore #4
    //   3989: goto -> 4058
    //   3992: astore #26
    //   3994: goto -> 4002
    //   3997: astore #26
    //   3999: aconst_null
    //   4000: astore #33
    //   4002: aload #26
    //   4004: invokevirtual printStackTrace : ()V
    //   4007: aload #33
    //   4009: ifnull -> 4017
    //   4012: aload #33
    //   4014: invokevirtual close : ()V
    //   4017: aload #39
    //   4019: invokevirtual q : ()V
    //   4022: iload #5
    //   4024: istore #9
    //   4026: iload #4
    //   4028: istore #5
    //   4030: iload #9
    //   4032: istore #4
    //   4034: goto -> 4058
    //   4037: astore_1
    //   4038: aload #33
    //   4040: ifnull -> 4048
    //   4043: aload #33
    //   4045: invokevirtual close : ()V
    //   4048: aload #39
    //   4050: invokevirtual q : ()V
    //   4053: aload_1
    //   4054: athrow
    //   4055: goto -> 3977
    //   4058: aload #39
    //   4060: invokevirtual p : ()V
    //   4063: iload #4
    //   4065: istore #9
    //   4067: aload #24
    //   4069: astore #27
    //   4071: aload #25
    //   4073: astore #29
    //   4075: aload_1
    //   4076: astore #26
    //   4078: aload #21
    //   4080: astore #28
    //   4082: aload #23
    //   4084: astore #25
    //   4086: goto -> 4155
    //   4089: astore_1
    //   4090: aload #39
    //   4092: invokevirtual q : ()V
    //   4095: aload_1
    //   4096: athrow
    //   4097: astore_1
    //   4098: aload #39
    //   4100: invokevirtual q : ()V
    //   4103: aload_1
    //   4104: athrow
    //   4105: astore_1
    //   4106: aload_1
    //   4107: invokevirtual printStackTrace : ()V
    //   4110: aconst_null
    //   4111: areturn
    //   4112: iload #8
    //   4114: istore #10
    //   4116: aload #21
    //   4118: astore #26
    //   4120: aload #22
    //   4122: astore #29
    //   4124: aload #23
    //   4126: astore #27
    //   4128: aload #24
    //   4130: astore #22
    //   4132: iload #6
    //   4134: istore #8
    //   4136: iload #5
    //   4138: istore #9
    //   4140: iload #4
    //   4142: istore #5
    //   4144: iload #7
    //   4146: istore #6
    //   4148: iload #10
    //   4150: istore #7
    //   4152: goto -> 4086
    //   4155: iload #8
    //   4157: ifeq -> 4757
    //   4160: aload #29
    //   4162: astore #23
    //   4164: aload #29
    //   4166: ifnull -> 4176
    //   4169: aload #29
    //   4171: invokevirtual trim : ()Ljava/lang/String;
    //   4174: astore #23
    //   4176: aload #27
    //   4178: astore #24
    //   4180: aload #27
    //   4182: ifnull -> 4192
    //   4185: aload #27
    //   4187: invokevirtual trim : ()Ljava/lang/String;
    //   4190: astore #24
    //   4192: aload #25
    //   4194: astore_1
    //   4195: aload #25
    //   4197: ifnull -> 4206
    //   4200: aload #25
    //   4202: invokevirtual trim : ()Ljava/lang/String;
    //   4205: astore_1
    //   4206: aload #22
    //   4208: astore #25
    //   4210: aload #22
    //   4212: ifnull -> 4222
    //   4215: aload #22
    //   4217: invokevirtual trim : ()Ljava/lang/String;
    //   4220: astore #25
    //   4222: aload #28
    //   4224: astore #22
    //   4226: aload #28
    //   4228: ifnull -> 4238
    //   4231: aload #28
    //   4233: invokevirtual trim : ()Ljava/lang/String;
    //   4236: astore #22
    //   4238: aload #26
    //   4240: ifnull -> 4366
    //   4243: aload #26
    //   4245: invokevirtual trim : ()Ljava/lang/String;
    //   4248: astore #21
    //   4250: aload #21
    //   4252: ldc_w '('
    //   4255: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4258: ifeq -> 4302
    //   4261: aload #21
    //   4263: ldc_w ')'
    //   4266: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   4269: ifeq -> 4302
    //   4272: aload #21
    //   4274: invokevirtual length : ()I
    //   4277: istore #4
    //   4279: aload #21
    //   4281: iconst_1
    //   4282: iload #4
    //   4284: iconst_1
    //   4285: isub
    //   4286: invokevirtual substring : (II)Ljava/lang/String;
    //   4289: astore #26
    //   4291: aload #26
    //   4293: astore #21
    //   4295: aload #21
    //   4297: astore #26
    //   4299: goto -> 4305
    //   4302: goto -> 4295
    //   4305: aload #26
    //   4307: astore #21
    //   4309: aload #26
    //   4311: invokevirtual length : ()I
    //   4314: ifle -> 4370
    //   4317: aload #26
    //   4319: astore #21
    //   4321: aload #26
    //   4323: iconst_0
    //   4324: invokevirtual charAt : (I)C
    //   4327: invokestatic isDigit : (C)Z
    //   4330: ifeq -> 4370
    //   4333: aload #26
    //   4335: invokestatic parseInt : (Ljava/lang/String;)I
    //   4338: istore #4
    //   4340: invokestatic getInstanceOf : ()Lorg/jaudiotagger/tag/reference/GenreTypes;
    //   4343: iload #4
    //   4345: invokevirtual getValueForId : (I)Ljava/lang/String;
    //   4348: astore #27
    //   4350: aload #26
    //   4352: astore #21
    //   4354: aload #27
    //   4356: ifnull -> 4370
    //   4359: aload #27
    //   4361: astore #21
    //   4363: goto -> 4370
    //   4366: aload #26
    //   4368: astore #21
    //   4370: aload #24
    //   4372: astore #29
    //   4374: aload #24
    //   4376: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   4379: ifeq -> 4386
    //   4382: aload #34
    //   4384: astore #29
    //   4386: aload #23
    //   4388: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   4391: ifne -> 4409
    //   4394: aload #23
    //   4396: astore #31
    //   4398: ldc_w '<unknown>'
    //   4401: aload #23
    //   4403: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4406: ifeq -> 4416
    //   4409: aload #36
    //   4411: invokestatic J : (Ljava/lang/String;)Ljava/lang/String;
    //   4414: astore #31
    //   4416: aload #25
    //   4418: astore #30
    //   4420: aload_0
    //   4421: getfield n : Z
    //   4424: ifeq -> 4464
    //   4427: aload #25
    //   4429: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   4432: ifne -> 4450
    //   4435: aload #25
    //   4437: astore #30
    //   4439: ldc_w '<unknown>'
    //   4442: aload #25
    //   4444: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4447: ifeq -> 4464
    //   4450: aload #25
    //   4452: astore #30
    //   4454: aload_1
    //   4455: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   4458: ifne -> 4464
    //   4461: aload_1
    //   4462: astore #30
    //   4464: aload_1
    //   4465: astore #23
    //   4467: aload #22
    //   4469: astore #24
    //   4471: aload #21
    //   4473: astore #25
    //   4475: aload #31
    //   4477: astore #28
    //   4479: aload #29
    //   4481: astore #26
    //   4483: aload #30
    //   4485: astore #27
    //   4487: getstatic wn1.f : Z
    //   4490: ifeq -> 4590
    //   4493: aload #31
    //   4495: iconst_0
    //   4496: invokestatic r0 : (Ljava/lang/String;Z)Ljava/lang/String;
    //   4499: astore #32
    //   4501: aload #29
    //   4503: iconst_0
    //   4504: invokestatic r0 : (Ljava/lang/String;Z)Ljava/lang/String;
    //   4507: astore #29
    //   4509: aload_1
    //   4510: iconst_0
    //   4511: invokestatic r0 : (Ljava/lang/String;Z)Ljava/lang/String;
    //   4514: astore #31
    //   4516: aload #30
    //   4518: iconst_1
    //   4519: invokestatic r0 : (Ljava/lang/String;Z)Ljava/lang/String;
    //   4522: astore_1
    //   4523: aload #22
    //   4525: iconst_1
    //   4526: invokestatic r0 : (Ljava/lang/String;Z)Ljava/lang/String;
    //   4529: astore #22
    //   4531: aload #21
    //   4533: iconst_0
    //   4534: invokestatic r0 : (Ljava/lang/String;Z)Ljava/lang/String;
    //   4537: astore #21
    //   4539: aload #31
    //   4541: astore #23
    //   4543: aload #22
    //   4545: astore #24
    //   4547: aload #21
    //   4549: astore #25
    //   4551: aload #32
    //   4553: astore #28
    //   4555: aload #29
    //   4557: astore #26
    //   4559: aload_1
    //   4560: astore #27
    //   4562: aload #32
    //   4564: ldc_w '<unknown>'
    //   4567: if_acmpne -> 4590
    //   4570: aconst_null
    //   4571: astore #24
    //   4573: aload #31
    //   4575: astore #23
    //   4577: aload #29
    //   4579: astore #26
    //   4581: aload_1
    //   4582: astore #27
    //   4584: aload #24
    //   4586: astore_1
    //   4587: goto -> 4601
    //   4590: aload #28
    //   4592: astore_1
    //   4593: aload #25
    //   4595: astore #21
    //   4597: aload #24
    //   4599: astore #22
    //   4601: iload #9
    //   4603: invokestatic abs : (I)I
    //   4606: istore #8
    //   4608: iload #5
    //   4610: invokestatic abs : (I)I
    //   4613: istore #5
    //   4615: iload #5
    //   4617: istore #4
    //   4619: iload #5
    //   4621: ifne -> 4644
    //   4624: iload #8
    //   4626: sipush #1000
    //   4629: idiv
    //   4630: istore #5
    //   4632: iload #5
    //   4634: istore #4
    //   4636: iload #5
    //   4638: ifne -> 4644
    //   4641: iconst_1
    //   4642: istore #4
    //   4644: aload_0
    //   4645: getfield P : Lq01;
    //   4648: astore #24
    //   4650: new km0
    //   4653: dup
    //   4654: iconst_0
    //   4655: new qn1
    //   4658: dup
    //   4659: new wo
    //   4662: dup
    //   4663: aload #37
    //   4665: aload #24
    //   4667: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   4670: aload_1
    //   4671: aload #24
    //   4673: aload #26
    //   4675: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   4678: aload #24
    //   4680: aload #23
    //   4682: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   4685: iload #7
    //   4687: invokespecial <init> : (Lwo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   4690: aload #24
    //   4692: aload #21
    //   4694: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   4697: aload #24
    //   4699: aload #22
    //   4701: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   4704: aload #24
    //   4706: aload #27
    //   4708: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   4711: lload #14
    //   4713: lload #18
    //   4715: lconst_0
    //   4716: lconst_0
    //   4717: iconst_0
    //   4718: iconst_0
    //   4719: iconst_0
    //   4720: iconst_0
    //   4721: iload #6
    //   4723: iload #8
    //   4725: sipush #1000
    //   4728: irem
    //   4729: iload #4
    //   4731: sipush #1000
    //   4734: imul
    //   4735: iadd
    //   4736: aload #24
    //   4738: aload #38
    //   4740: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   4743: aload #24
    //   4745: aload #34
    //   4747: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   4750: aload #36
    //   4752: iconst_0
    //   4753: invokespecial <init> : (ILqn1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   4756: areturn
    //   4757: aconst_null
    //   4758: areturn
    //   4759: astore_1
    //   4760: iload #8
    //   4762: istore #9
    //   4764: goto -> 487
    //   4767: astore #21
    //   4769: goto -> 1026
    //   4772: astore #21
    //   4774: goto -> 1026
    //   4777: astore #21
    //   4779: iload #4
    //   4781: istore #8
    //   4783: goto -> 1090
    //   4786: astore #21
    //   4788: iload #7
    //   4790: istore #10
    //   4792: goto -> 1167
    //   4795: astore #26
    //   4797: iload #6
    //   4799: istore #9
    //   4801: goto -> 2287
    //   4804: astore #26
    //   4806: iload #7
    //   4808: istore #10
    //   4810: goto -> 2352
    //   4813: astore #26
    //   4815: iload #5
    //   4817: istore #6
    //   4819: goto -> 2472
    //   4822: astore_1
    //   4823: iload #6
    //   4825: istore #9
    //   4827: goto -> 3761
    //   4830: astore_1
    //   4831: iload #5
    //   4833: istore #6
    //   4835: goto -> 3812
    //   4838: astore_1
    //   4839: iload #4
    //   4841: istore #5
    //   4843: goto -> 3834
    //   4846: astore #26
    //   4848: goto -> 4302
    //   4851: astore #26
    //   4853: goto -> 4295
    //   4856: astore #21
    //   4858: aload #26
    //   4860: astore #21
    //   4862: goto -> 4370
    // Exception table:
    //   from	to	target	type
    //   341	351	4105	finally
    //   449	461	592	finally
    //   473	487	4759	finally
    //   511	518	592	finally
    //   546	554	592	finally
    //   578	589	592	finally
    //   644	652	592	finally
    //   676	686	592	finally
    //   714	722	592	finally
    //   746	756	592	finally
    //   784	792	592	finally
    //   816	827	592	finally
    //   854	862	592	finally
    //   886	895	592	finally
    //   922	930	592	finally
    //   953	964	592	finally
    //   969	979	4767	finally
    //   984	993	4772	finally
    //   1002	1012	4772	finally
    //   1012	1019	4772	finally
    //   1035	1046	4777	finally
    //   1055	1064	4777	finally
    //   1073	1083	4777	finally
    //   1083	1090	4777	finally
    //   1099	1110	4786	finally
    //   1119	1129	4786	finally
    //   1142	1160	4786	finally
    //   1160	1167	4786	finally
    //   1167	1172	1202	finally
    //   1244	1250	1321	finally
    //   1255	1278	1292	finally
    //   1391	1399	4097	finally
    //   1402	1407	4097	finally
    //   1507	1514	1587	org/jaudiotagger/audio/exceptions/UnknownFileFormatException
    //   1507	1514	1587	org/jaudiotagger/tag/TagException
    //   1507	1514	1587	org/jaudiotagger/audio/exceptions/InvalidAudioFrameException
    //   1507	1514	1517	finally
    //   1589	1601	2695	finally
    //   1601	1615	2695	finally
    //   1620	1626	2695	finally
    //   1634	1645	1648	finally
    //   1678	1685	1813	finally
    //   1697	1709	1648	finally
    //   1709	1716	2690	finally
    //   1725	1737	1813	finally
    //   1737	1746	1798	finally
    //   1755	1766	1783	finally
    //   1766	1776	1783	finally
    //   1826	1834	2685	finally
    //   1858	1878	2016	finally
    //   1878	1887	2000	finally
    //   1904	1915	1936	finally
    //   1923	1933	1936	finally
    //   2033	2041	1936	finally
    //   2049	2061	1936	finally
    //   2069	2080	1936	finally
    //   2091	2102	1936	finally
    //   2110	2120	1936	finally
    //   2128	2136	1936	finally
    //   2144	2156	1936	finally
    //   2164	2175	1936	finally
    //   2186	2197	1936	finally
    //   2205	2215	1936	finally
    //   2231	2243	4795	finally
    //   2252	2261	4795	finally
    //   2270	2280	4795	finally
    //   2280	2287	4795	finally
    //   2296	2308	4804	finally
    //   2317	2326	4804	finally
    //   2335	2345	4804	finally
    //   2345	2352	4804	finally
    //   2361	2373	2407	finally
    //   2386	2404	2407	finally
    //   2428	2435	2438	finally
    //   2440	2449	2407	finally
    //   2459	2472	4813	finally
    //   2472	2477	2676	finally
    //   2494	2505	2511	finally
    //   2559	2566	2511	finally
    //   2617	2630	2630	finally
    //   2765	2770	4089	finally
    //   2822	2858	3997	finally
    //   2858	2865	3992	finally
    //   2925	2938	3046	finally
    //   2986	2994	3046	finally
    //   3033	3043	3046	finally
    //   3133	3141	3046	finally
    //   3180	3190	3046	finally
    //   3233	3241	3046	finally
    //   3280	3290	3046	finally
    //   3333	3341	3046	finally
    //   3380	3390	3046	finally
    //   3433	3441	3046	finally
    //   3480	3490	3046	finally
    //   3532	3539	3046	finally
    //   3578	3588	3046	finally
    //   3637	3647	3046	finally
    //   3698	3707	3046	finally
    //   3747	3755	3046	finally
    //   3755	3761	4822	finally
    //   3770	3789	4830	finally
    //   3797	3806	4830	finally
    //   3806	3812	4830	finally
    //   3821	3834	4838	finally
    //   3874	3879	3046	finally
    //   4002	4007	4037	finally
    //   4272	4279	4846	finally
    //   4279	4291	4851	finally
    //   4333	4350	4856	finally
  }
  
  public final void t() {
    this.N = true;
  }
  
  public final void u() {
    this.c0 = 0L;
    this.c = MyApplication.i.getApplicationContext().getString(2131886199);
    this.a = 0;
    this.b = 0;
    x();
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void v(SQLiteDatabase paramSQLiteDatabase) {
    // Byte code:
    //   0: aload_0
    //   1: astore #16
    //   3: aload_1
    //   4: astore #15
    //   6: ldc_w 'COL_DATE_ADDED'
    //   9: astore #25
    //   11: new java/lang/StringBuilder
    //   14: dup
    //   15: ldc_w 'LIBU>U1:'
    //   18: invokespecial <init> : (Ljava/lang/String;)V
    //   21: astore #17
    //   23: aload #17
    //   25: aload #16
    //   27: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload #17
    //   33: invokevirtual toString : ()Ljava/lang/String;
    //   36: invokestatic F : (Ljava/lang/String;)V
    //   39: getstatic im0.g0 : Lim0;
    //   42: astore #18
    //   44: iconst_1
    //   45: istore_3
    //   46: aload #18
    //   48: ifnull -> 109
    //   51: new java/lang/StringBuilder
    //   54: dup
    //   55: ldc_w 'LIBU>UC:'
    //   58: invokespecial <init> : (Ljava/lang/String;)V
    //   61: astore #17
    //   63: aload #17
    //   65: aload #18
    //   67: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   70: pop
    //   71: aload #17
    //   73: invokevirtual toString : ()Ljava/lang/String;
    //   76: invokestatic F : (Ljava/lang/String;)V
    //   79: aload #18
    //   81: getfield E : Z
    //   84: istore #7
    //   86: iload #7
    //   88: ifeq -> 104
    //   91: iload #7
    //   93: ifeq -> 104
    //   96: aload #18
    //   98: getfield F : [Z
    //   101: iconst_0
    //   102: iconst_1
    //   103: bastore
    //   104: aload #18
    //   106: invokevirtual wait : ()V
    //   109: aload #16
    //   111: putstatic im0.g0 : Lim0;
    //   114: new java/lang/StringBuilder
    //   117: dup
    //   118: ldc_w 'LIBU>U2:'
    //   121: invokespecial <init> : (Ljava/lang/String;)V
    //   124: astore #17
    //   126: aload #17
    //   128: aload #16
    //   130: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: aload #17
    //   136: invokevirtual toString : ()Ljava/lang/String;
    //   139: invokestatic F : (Ljava/lang/String;)V
    //   142: aload #16
    //   144: getfield K : Z
    //   147: ifeq -> 179
    //   150: aload #16
    //   152: new android/content/Intent
    //   155: dup
    //   156: invokestatic d : ()Landroid/content/Context;
    //   159: ldc_w in/krosbits/musicolet/LibDBUpdaterService
    //   162: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   165: putfield L : Landroid/content/Intent;
    //   168: invokestatic d : ()Landroid/content/Context;
    //   171: aload #16
    //   173: getfield L : Landroid/content/Intent;
    //   176: invokestatic n0 : (Landroid/content/Context;Landroid/content/Intent;)V
    //   179: aload #16
    //   181: getfield M : Z
    //   184: ifne -> 219
    //   187: aload #16
    //   189: invokestatic p : ()Landroid/os/PowerManager;
    //   192: iconst_1
    //   193: ldc_w 'musicolet:lbu'
    //   196: invokevirtual newWakeLock : (ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
    //   199: putfield B : Landroid/os/PowerManager$WakeLock;
    //   202: aload #16
    //   204: getfield B : Landroid/os/PowerManager$WakeLock;
    //   207: astore #17
    //   209: aload #17
    //   211: ifnull -> 219
    //   214: aload #17
    //   216: invokevirtual acquire : ()V
    //   219: invokestatic y : ()Lkm0;
    //   222: astore #19
    //   224: aload #19
    //   226: astore #18
    //   228: aload #16
    //   230: invokevirtual o : ()V
    //   233: aload #16
    //   235: getfield H : Z
    //   238: istore #9
    //   240: aload #16
    //   242: getfield P : Lq01;
    //   245: astore #17
    //   247: aload #16
    //   249: getfield I : Z
    //   252: istore #7
    //   254: iload #7
    //   256: ifne -> 4396
    //   259: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   262: invokevirtual getClass : ()Ljava/lang/Class;
    //   265: pop
    //   266: aload #16
    //   268: aload #15
    //   270: aload #16
    //   272: getfield F : [Z
    //   275: aload #17
    //   277: invokestatic a : (Landroid/database/sqlite/SQLiteDatabase;[ZLq01;)Ljava/util/HashMap;
    //   280: putfield O : Ljava/util/HashMap;
    //   283: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   286: invokevirtual getClass : ()Ljava/lang/Class;
    //   289: pop
    //   290: aload #16
    //   292: aload #15
    //   294: invokestatic q : (Landroid/database/sqlite/SQLiteDatabase;)Z
    //   297: putfield D : Z
    //   300: aload #16
    //   302: getfield G : Ljava/util/ArrayList;
    //   305: ifnull -> 317
    //   308: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   311: invokevirtual p : ()Z
    //   314: ifne -> 486
    //   317: aload #16
    //   319: getfield C : Z
    //   322: ifeq -> 339
    //   325: aload #16
    //   327: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   330: invokevirtual j : ()Ljava/util/ArrayList;
    //   333: putfield G : Ljava/util/ArrayList;
    //   336: goto -> 480
    //   339: aload #16
    //   341: getfield y : Ljava/util/ArrayList;
    //   344: ifnull -> 480
    //   347: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   350: invokevirtual p : ()Z
    //   353: ifeq -> 445
    //   356: aload #16
    //   358: new java/util/ArrayList
    //   361: dup
    //   362: aload #16
    //   364: getfield y : Ljava/util/ArrayList;
    //   367: invokevirtual size : ()I
    //   370: invokespecial <init> : (I)V
    //   373: putfield G : Ljava/util/ArrayList;
    //   376: aload #16
    //   378: getfield y : Ljava/util/ArrayList;
    //   381: astore #20
    //   383: aload #20
    //   385: invokevirtual size : ()I
    //   388: istore #4
    //   390: iconst_0
    //   391: istore_2
    //   392: iload_2
    //   393: iload #4
    //   395: if_icmpge -> 480
    //   398: aload #20
    //   400: iload_2
    //   401: invokevirtual get : (I)Ljava/lang/Object;
    //   404: astore #21
    //   406: iinc #2, 1
    //   409: aload #21
    //   411: checkcast java/lang/String
    //   414: astore #21
    //   416: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   419: aload #21
    //   421: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   424: astore #21
    //   426: aload #21
    //   428: ifnull -> 442
    //   431: aload #16
    //   433: getfield G : Ljava/util/ArrayList;
    //   436: aload #21
    //   438: invokevirtual add : (Ljava/lang/Object;)Z
    //   441: pop
    //   442: goto -> 392
    //   445: getstatic android/os/Build$VERSION.SDK_INT : I
    //   448: bipush #30
    //   450: if_icmplt -> 480
    //   453: getstatic in/krosbits/musicolet/MyApplication.G : Lv90;
    //   456: invokevirtual b : ()Ljava/util/ArrayList;
    //   459: astore #20
    //   461: aload #16
    //   463: aload #20
    //   465: putfield G : Ljava/util/ArrayList;
    //   468: aload #20
    //   470: getstatic in/krosbits/musicolet/MyApplication.G : Lv90;
    //   473: invokevirtual d : ()Ljava/util/ArrayList;
    //   476: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   479: pop
    //   480: aload #16
    //   482: iconst_1
    //   483: putfield f : Z
    //   486: aload #16
    //   488: new java/util/HashSet
    //   491: dup
    //   492: invokespecial <init> : ()V
    //   495: putfield R : Ljava/util/HashSet;
    //   498: aload #16
    //   500: new java/util/HashSet
    //   503: dup
    //   504: invokespecial <init> : ()V
    //   507: putfield S : Ljava/util/HashSet;
    //   510: aload #16
    //   512: new java/util/HashMap
    //   515: dup
    //   516: invokespecial <init> : ()V
    //   519: putfield T : Ljava/util/HashMap;
    //   522: aload #16
    //   524: new java/util/HashMap
    //   527: dup
    //   528: invokespecial <init> : ()V
    //   531: putfield U : Ljava/util/HashMap;
    //   534: aload #16
    //   536: new java/util/ArrayList
    //   539: dup
    //   540: invokespecial <init> : ()V
    //   543: putfield V : Ljava/util/ArrayList;
    //   546: aload #16
    //   548: new java/util/HashMap
    //   551: dup
    //   552: invokespecial <init> : ()V
    //   555: putfield W : Ljava/util/HashMap;
    //   558: aload #16
    //   560: new java/util/HashSet
    //   563: dup
    //   564: invokespecial <init> : ()V
    //   567: putfield X : Ljava/util/HashSet;
    //   570: aload #16
    //   572: new java/util/ArrayList
    //   575: dup
    //   576: invokespecial <init> : ()V
    //   579: putfield Y : Ljava/util/ArrayList;
    //   582: aload #16
    //   584: getfield G : Ljava/util/ArrayList;
    //   587: astore #20
    //   589: aload #20
    //   591: invokevirtual size : ()I
    //   594: istore #6
    //   596: iconst_0
    //   597: istore_2
    //   598: iload_2
    //   599: iload #6
    //   601: if_icmpge -> 697
    //   604: aload #20
    //   606: iload_2
    //   607: invokevirtual get : (I)Ljava/lang/Object;
    //   610: astore #21
    //   612: iload_2
    //   613: iconst_1
    //   614: iadd
    //   615: istore #5
    //   617: aload #21
    //   619: checkcast v00
    //   622: astore #22
    //   624: aload #22
    //   626: invokevirtual i : ()Lu00;
    //   629: checkcast v00
    //   632: astore #21
    //   634: aload #21
    //   636: ifnull -> 676
    //   639: aload #21
    //   641: iload_3
    //   642: invokestatic y : (Lv00;Z)Lv00;
    //   645: ifnull -> 653
    //   648: iload_3
    //   649: istore_2
    //   650: goto -> 655
    //   653: iconst_0
    //   654: istore_2
    //   655: aload #21
    //   657: iload_3
    //   658: invokestatic z : (Lv00;Z)Lv00;
    //   661: ifnull -> 670
    //   664: iload_3
    //   665: istore #4
    //   667: goto -> 673
    //   670: iconst_0
    //   671: istore #4
    //   673: goto -> 681
    //   676: iconst_0
    //   677: istore #4
    //   679: iconst_0
    //   680: istore_2
    //   681: aload #16
    //   683: aload #22
    //   685: iload_2
    //   686: iload #4
    //   688: invokevirtual q : (Lv00;ZZ)V
    //   691: iload #5
    //   693: istore_2
    //   694: goto -> 598
    //   697: aload #16
    //   699: getfield Q : Ljava/util/HashMap;
    //   702: astore #20
    //   704: aload #20
    //   706: ifnull -> 720
    //   709: aload #20
    //   711: invokevirtual clear : ()V
    //   714: aload #16
    //   716: aconst_null
    //   717: putfield Q : Ljava/util/HashMap;
    //   720: aload #16
    //   722: getfield x : Ljava/util/ArrayList;
    //   725: astore #20
    //   727: aload #20
    //   729: ifnull -> 743
    //   732: aload #20
    //   734: invokevirtual clear : ()V
    //   737: aload #16
    //   739: aconst_null
    //   740: putfield x : Ljava/util/ArrayList;
    //   743: aload #16
    //   745: getfield z : Ljava/util/ArrayList;
    //   748: astore #20
    //   750: aload #20
    //   752: ifnull -> 766
    //   755: aload #20
    //   757: invokevirtual clear : ()V
    //   760: aload #16
    //   762: aconst_null
    //   763: putfield z : Ljava/util/ArrayList;
    //   766: aload #16
    //   768: getfield y : Ljava/util/ArrayList;
    //   771: astore #20
    //   773: aload #20
    //   775: ifnull -> 789
    //   778: aload #20
    //   780: invokevirtual clear : ()V
    //   783: aload #16
    //   785: aconst_null
    //   786: putfield y : Ljava/util/ArrayList;
    //   789: aload #16
    //   791: getfield A : Ljava/util/ArrayList;
    //   794: astore #20
    //   796: aload #20
    //   798: ifnull -> 812
    //   801: aload #20
    //   803: invokevirtual clear : ()V
    //   806: aload #16
    //   808: aconst_null
    //   809: putfield A : Ljava/util/ArrayList;
    //   812: aload #15
    //   814: invokevirtual beginTransactionNonExclusive : ()V
    //   817: iload #7
    //   819: istore #8
    //   821: aload #16
    //   823: astore #22
    //   825: aload #15
    //   827: astore #20
    //   829: aload #16
    //   831: invokevirtual h : ()Z
    //   834: ifne -> 4247
    //   837: iload #7
    //   839: istore #8
    //   841: aload #16
    //   843: astore #22
    //   845: aload #15
    //   847: astore #20
    //   849: aload #16
    //   851: getfield O : Ljava/util/HashMap;
    //   854: invokevirtual keySet : ()Ljava/util/Set;
    //   857: astore #28
    //   859: iload #7
    //   861: istore #8
    //   863: aload #16
    //   865: astore #22
    //   867: aload #15
    //   869: astore #20
    //   871: new android/content/ContentValues
    //   874: astore #26
    //   876: iload #7
    //   878: istore #8
    //   880: aload #16
    //   882: astore #22
    //   884: aload #15
    //   886: astore #20
    //   888: aload #26
    //   890: bipush #16
    //   892: invokespecial <init> : (I)V
    //   895: iload #7
    //   897: istore #8
    //   899: aload #16
    //   901: astore #22
    //   903: aload #15
    //   905: astore #20
    //   907: new android/content/ContentValues
    //   910: astore #27
    //   912: iload #7
    //   914: istore #8
    //   916: aload #16
    //   918: astore #22
    //   920: aload #15
    //   922: astore #20
    //   924: aload #27
    //   926: bipush #16
    //   928: invokespecial <init> : (I)V
    //   931: iload #7
    //   933: istore #8
    //   935: aload #16
    //   937: astore #22
    //   939: aload #15
    //   941: astore #20
    //   943: aload #16
    //   945: lconst_0
    //   946: putfield c0 : J
    //   949: iload #7
    //   951: istore #8
    //   953: aload #16
    //   955: astore #22
    //   957: aload #15
    //   959: astore #20
    //   961: aload #16
    //   963: invokestatic d : ()Landroid/content/Context;
    //   966: ldc_w 2131887537
    //   969: invokevirtual getString : (I)Ljava/lang/String;
    //   972: putfield c : Ljava/lang/String;
    //   975: iload #7
    //   977: istore #8
    //   979: aload #16
    //   981: astore #22
    //   983: aload #15
    //   985: astore #20
    //   987: aload #16
    //   989: iconst_0
    //   990: putfield b : I
    //   993: iload #7
    //   995: istore #8
    //   997: aload #16
    //   999: astore #22
    //   1001: aload #15
    //   1003: astore #20
    //   1005: aload #16
    //   1007: aload #28
    //   1009: invokeinterface size : ()I
    //   1014: putfield a : I
    //   1017: iload #7
    //   1019: istore #8
    //   1021: aload #16
    //   1023: astore #22
    //   1025: aload #15
    //   1027: astore #20
    //   1029: new java/util/ArrayList
    //   1032: astore #24
    //   1034: iload #7
    //   1036: istore #8
    //   1038: aload #16
    //   1040: astore #22
    //   1042: aload #15
    //   1044: astore #20
    //   1046: aload #24
    //   1048: invokespecial <init> : ()V
    //   1051: iload #7
    //   1053: istore #8
    //   1055: aload #16
    //   1057: astore #22
    //   1059: aload #15
    //   1061: astore #20
    //   1063: aload #28
    //   1065: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1070: astore #21
    //   1072: iload #7
    //   1074: istore #8
    //   1076: aload #16
    //   1078: astore #22
    //   1080: aload #15
    //   1082: astore #20
    //   1084: aload #21
    //   1086: invokeinterface hasNext : ()Z
    //   1091: istore #10
    //   1093: iload #10
    //   1095: ifeq -> 1525
    //   1098: aload #16
    //   1100: astore #22
    //   1102: aload #15
    //   1104: astore #20
    //   1106: aload #21
    //   1108: invokeinterface next : ()Ljava/lang/Object;
    //   1113: checkcast d61
    //   1116: astore #29
    //   1118: aload #16
    //   1120: astore #22
    //   1122: aload #15
    //   1124: astore #20
    //   1126: aload #16
    //   1128: aload #16
    //   1130: getfield b : I
    //   1133: iconst_1
    //   1134: iadd
    //   1135: putfield b : I
    //   1138: aload #16
    //   1140: astore #22
    //   1142: aload #15
    //   1144: astore #20
    //   1146: aload #16
    //   1148: invokevirtual x : ()V
    //   1151: aload #16
    //   1153: astore #22
    //   1155: aload #15
    //   1157: astore #20
    //   1159: aload #16
    //   1161: invokevirtual h : ()Z
    //   1164: istore #8
    //   1166: iload #8
    //   1168: ifne -> 1487
    //   1171: aload #16
    //   1173: getfield O : Ljava/util/HashMap;
    //   1176: aload #29
    //   1178: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1181: checkcast hm0
    //   1184: astore #22
    //   1186: aload #22
    //   1188: getfield f : Ld61;
    //   1191: astore #23
    //   1193: aload #22
    //   1195: getfield c : Lqn1;
    //   1198: astore #20
    //   1200: aload #16
    //   1202: getfield S : Ljava/util/HashSet;
    //   1205: aload #29
    //   1207: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1210: istore #4
    //   1212: iload #4
    //   1214: istore_2
    //   1215: iload #4
    //   1217: ifne -> 1351
    //   1220: iload #4
    //   1222: istore_2
    //   1223: aload #16
    //   1225: getfield f : Z
    //   1228: ifne -> 1351
    //   1231: invokestatic d : ()Landroid/content/Context;
    //   1234: aload #20
    //   1236: getfield f : Lwo;
    //   1239: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   1242: invokestatic q : (Landroid/content/Context;Ljava/lang/String;)Lv00;
    //   1245: astore #29
    //   1247: aload #29
    //   1249: ifnull -> 1270
    //   1252: aload #29
    //   1254: invokevirtual l : ()Z
    //   1257: ifeq -> 1270
    //   1260: iload_3
    //   1261: istore_2
    //   1262: goto -> 1272
    //   1265: astore #23
    //   1267: goto -> 1428
    //   1270: iconst_0
    //   1271: istore_2
    //   1272: iload_2
    //   1273: ifne -> 1351
    //   1276: aload #29
    //   1278: ifnull -> 1351
    //   1281: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   1284: aload #23
    //   1286: invokevirtual toString : ()Ljava/lang/String;
    //   1289: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   1292: astore #29
    //   1294: aload #29
    //   1296: ifnull -> 1312
    //   1299: aload #29
    //   1301: invokevirtual l : ()Z
    //   1304: ifeq -> 1312
    //   1307: iload_3
    //   1308: istore_2
    //   1309: goto -> 1314
    //   1312: iconst_0
    //   1313: istore_2
    //   1314: iload_2
    //   1315: ifeq -> 1348
    //   1318: new wo
    //   1321: astore #30
    //   1323: aload #30
    //   1325: aload #29
    //   1327: invokevirtual j : ()Landroid/net/Uri;
    //   1330: invokevirtual toString : ()Ljava/lang/String;
    //   1333: aload #17
    //   1335: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   1338: aload #22
    //   1340: aload #30
    //   1342: putfield d : Lwo;
    //   1345: goto -> 1348
    //   1348: goto -> 1351
    //   1351: aload #22
    //   1353: iload_2
    //   1354: putfield g : Z
    //   1357: iload_2
    //   1358: ifne -> 1425
    //   1361: new sn1
    //   1364: astore #29
    //   1366: aload #23
    //   1368: invokevirtual toString : ()Ljava/lang/String;
    //   1371: astore #23
    //   1373: aload #20
    //   1375: getfield g : I
    //   1378: istore_2
    //   1379: iload_2
    //   1380: i2l
    //   1381: lstore #11
    //   1383: aload #29
    //   1385: aload #23
    //   1387: lload #11
    //   1389: aload #20
    //   1391: getfield b : Ljava/lang/String;
    //   1394: aload #20
    //   1396: getfield e : Ljava/lang/String;
    //   1399: invokespecial <init> : (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    //   1402: aload #22
    //   1404: aload #29
    //   1406: putfield h : Lsn1;
    //   1409: aload #24
    //   1411: aload #29
    //   1413: invokevirtual add : (Ljava/lang/Object;)Z
    //   1416: pop
    //   1417: goto -> 1441
    //   1420: astore #23
    //   1422: goto -> 1428
    //   1425: goto -> 1441
    //   1428: aload #16
    //   1430: astore #22
    //   1432: aload #15
    //   1434: astore #20
    //   1436: aload #23
    //   1438: invokevirtual printStackTrace : ()V
    //   1441: goto -> 1072
    //   1444: astore_1
    //   1445: aload #18
    //   1447: astore #19
    //   1449: iconst_0
    //   1450: istore_2
    //   1451: aload #17
    //   1453: astore #18
    //   1455: aload #19
    //   1457: astore #17
    //   1459: aload #16
    //   1461: astore #19
    //   1463: aload_1
    //   1464: astore #16
    //   1466: aload #15
    //   1468: astore_1
    //   1469: aload #19
    //   1471: astore #15
    //   1473: iload #7
    //   1475: istore #8
    //   1477: goto -> 4285
    //   1480: aload #15
    //   1482: astore #16
    //   1484: goto -> 4376
    //   1487: aload #16
    //   1489: astore #22
    //   1491: aload #15
    //   1493: astore #20
    //   1495: new android/app/PendingIntent$CanceledException
    //   1498: astore_1
    //   1499: aload #16
    //   1501: astore #22
    //   1503: aload #15
    //   1505: astore #20
    //   1507: aload_1
    //   1508: invokespecial <init> : ()V
    //   1511: aload #16
    //   1513: astore #22
    //   1515: aload #15
    //   1517: astore #20
    //   1519: aload_1
    //   1520: athrow
    //   1521: astore_1
    //   1522: goto -> 1445
    //   1525: iload #7
    //   1527: istore #8
    //   1529: aload #16
    //   1531: astore #22
    //   1533: aload #15
    //   1535: astore #20
    //   1537: aload #24
    //   1539: invokevirtual isEmpty : ()Z
    //   1542: istore #10
    //   1544: iload #10
    //   1546: ifne -> 1663
    //   1549: aload #16
    //   1551: astore #22
    //   1553: aload #15
    //   1555: astore #20
    //   1557: aload #16
    //   1559: getfield V : Ljava/util/ArrayList;
    //   1562: invokevirtual isEmpty : ()Z
    //   1565: ifne -> 1663
    //   1568: aload #16
    //   1570: astore #22
    //   1572: aload #15
    //   1574: astore #20
    //   1576: aload #16
    //   1578: lconst_0
    //   1579: putfield c0 : J
    //   1582: aload #16
    //   1584: astore #22
    //   1586: aload #15
    //   1588: astore #20
    //   1590: aload #16
    //   1592: invokestatic d : ()Landroid/content/Context;
    //   1595: ldc_w 2131887537
    //   1598: invokevirtual getString : (I)Ljava/lang/String;
    //   1601: putfield c : Ljava/lang/String;
    //   1604: aload #16
    //   1606: astore #22
    //   1608: aload #15
    //   1610: astore #20
    //   1612: aload #16
    //   1614: iconst_0
    //   1615: putfield b : I
    //   1618: aload #16
    //   1620: astore #22
    //   1622: aload #15
    //   1624: astore #20
    //   1626: aload #16
    //   1628: iconst_m1
    //   1629: putfield a : I
    //   1632: aload #16
    //   1634: astore #22
    //   1636: aload #15
    //   1638: astore #20
    //   1640: aload #16
    //   1642: invokevirtual x : ()V
    //   1645: aload #16
    //   1647: astore #22
    //   1649: aload #15
    //   1651: astore #20
    //   1653: aload #24
    //   1655: aload #16
    //   1657: getfield V : Ljava/util/ArrayList;
    //   1660: invokestatic o : (Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   1663: aload #16
    //   1665: astore #22
    //   1667: aload #15
    //   1669: astore #20
    //   1671: aload #16
    //   1673: lconst_0
    //   1674: putfield c0 : J
    //   1677: aload #16
    //   1679: astore #22
    //   1681: aload #15
    //   1683: astore #20
    //   1685: aload #16
    //   1687: invokestatic d : ()Landroid/content/Context;
    //   1690: ldc_w 2131887537
    //   1693: invokevirtual getString : (I)Ljava/lang/String;
    //   1696: putfield c : Ljava/lang/String;
    //   1699: aload #16
    //   1701: astore #22
    //   1703: aload #15
    //   1705: astore #20
    //   1707: aload #16
    //   1709: iconst_0
    //   1710: putfield b : I
    //   1713: aload #16
    //   1715: astore #22
    //   1717: aload #15
    //   1719: astore #20
    //   1721: aload #16
    //   1723: aload #28
    //   1725: invokeinterface size : ()I
    //   1730: putfield a : I
    //   1733: aload #16
    //   1735: astore #22
    //   1737: aload #15
    //   1739: astore #20
    //   1741: aload #28
    //   1743: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1748: astore #28
    //   1750: iconst_0
    //   1751: istore_2
    //   1752: aload #17
    //   1754: astore #19
    //   1756: aload #27
    //   1758: astore #21
    //   1760: aload #25
    //   1762: astore #23
    //   1764: aload #28
    //   1766: astore #25
    //   1768: aload #15
    //   1770: astore #17
    //   1772: aload #16
    //   1774: astore #15
    //   1776: aload #15
    //   1778: astore #22
    //   1780: aload #17
    //   1782: astore #20
    //   1784: aload #25
    //   1786: invokeinterface hasNext : ()Z
    //   1791: istore #10
    //   1793: getstatic androidx/work/impl/diagnostics/UWhQ/OETETTfAjV.dRZLdZPh : Ljava/lang/String;
    //   1796: astore #38
    //   1798: aload #18
    //   1800: astore #17
    //   1802: aload #19
    //   1804: astore #18
    //   1806: ldc_w 'COL_ARTIST'
    //   1809: astore #30
    //   1811: aload #23
    //   1813: astore #20
    //   1815: ldc_w 'COL_ALBUM'
    //   1818: astore #27
    //   1820: ldc_w 'COL_TITLE'
    //   1823: astore #28
    //   1825: ldc_w 'COL_LOGPATH'
    //   1828: astore #32
    //   1830: ldc_w ''
    //   1833: astore #23
    //   1835: ldc_w 'COL_PATH'
    //   1838: astore #34
    //   1840: ldc_w 'COL_GAINS'
    //   1843: astore #22
    //   1845: getstatic org/jaudiotagger/audio/real/Nq/JkpGFvCVQHzgc.tToAGYaLbyi : Ljava/lang/String;
    //   1848: astore #31
    //   1850: iload #10
    //   1852: ifeq -> 3367
    //   1855: aload #25
    //   1857: invokeinterface next : ()Ljava/lang/Object;
    //   1862: checkcast d61
    //   1865: astore #19
    //   1867: aload #15
    //   1869: aload #15
    //   1871: getfield b : I
    //   1874: iconst_1
    //   1875: iadd
    //   1876: putfield b : I
    //   1879: aload #15
    //   1881: invokevirtual x : ()V
    //   1884: aload #15
    //   1886: invokevirtual h : ()Z
    //   1889: istore #10
    //   1891: iload #10
    //   1893: ifne -> 3297
    //   1896: aload #15
    //   1898: getfield O : Ljava/util/HashMap;
    //   1901: aload #19
    //   1903: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1906: checkcast hm0
    //   1909: astore #23
    //   1911: aload #23
    //   1913: getfield g : Z
    //   1916: istore #10
    //   1918: aload #23
    //   1920: getfield c : Lqn1;
    //   1923: astore #22
    //   1925: iload #10
    //   1927: ifne -> 2616
    //   1930: aload #23
    //   1932: getfield h : Lsn1;
    //   1935: astore #16
    //   1937: aload #16
    //   1939: ifnull -> 1960
    //   1942: aload #16
    //   1944: invokevirtual a : ()Lkm0;
    //   1947: astore #19
    //   1949: goto -> 1963
    //   1952: astore #19
    //   1954: aload_1
    //   1955: astore #16
    //   1957: goto -> 3155
    //   1960: aconst_null
    //   1961: astore #19
    //   1963: aload #19
    //   1965: ifnull -> 2471
    //   1968: aload #15
    //   1970: getfield X : Ljava/util/HashSet;
    //   1973: astore #16
    //   1975: aload #16
    //   1977: aload #19
    //   1979: getfield c : Lqn1;
    //   1982: getfield f : Lwo;
    //   1985: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1988: ifne -> 2448
    //   1991: aload #26
    //   1993: invokevirtual clear : ()V
    //   1996: aload #19
    //   1998: getfield c : Lqn1;
    //   2001: getfield f : Lwo;
    //   2004: astore #27
    //   2006: new java/lang/StringBuilder
    //   2009: astore #15
    //   2011: aload #15
    //   2013: invokespecial <init> : ()V
    //   2016: aload #15
    //   2018: aload #19
    //   2020: getfield h : Ljava/lang/String;
    //   2023: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2026: pop
    //   2027: aload #15
    //   2029: ldc_w '/'
    //   2032: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2035: pop
    //   2036: aload #15
    //   2038: aload #19
    //   2040: getfield g : Ljava/lang/String;
    //   2043: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2046: pop
    //   2047: aload #15
    //   2049: invokevirtual toString : ()Ljava/lang/String;
    //   2052: astore #15
    //   2054: aload #26
    //   2056: ldc_w 'COL_PATH'
    //   2059: aload #27
    //   2061: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   2064: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2067: aload #26
    //   2069: ldc_w 'COL_LOGPATH'
    //   2072: aload #15
    //   2074: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2077: aload #26
    //   2079: aload #31
    //   2081: aload #19
    //   2083: getfield u : I
    //   2086: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2089: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   2092: aload #23
    //   2094: getfield a : J
    //   2097: lstore #13
    //   2099: aload #19
    //   2101: getfield l : J
    //   2104: lstore #11
    //   2106: lload #13
    //   2108: lload #11
    //   2110: lcmp
    //   2111: ifeq -> 2303
    //   2114: aload #26
    //   2116: ldc_w 'COL_TITLE'
    //   2119: aload #19
    //   2121: getfield c : Lqn1;
    //   2124: getfield b : Ljava/lang/String;
    //   2127: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2130: aload #26
    //   2132: ldc_w 'COL_ALBUM'
    //   2135: aload #19
    //   2137: getfield c : Lqn1;
    //   2140: getfield c : Ljava/lang/String;
    //   2143: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2146: aload #26
    //   2148: ldc_w 'COL_ARTIST'
    //   2151: aload #19
    //   2153: getfield c : Lqn1;
    //   2156: getfield e : Ljava/lang/String;
    //   2159: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2162: aload #26
    //   2164: ldc_w 'COL_DURATION'
    //   2167: aload #19
    //   2169: getfield c : Lqn1;
    //   2172: getfield g : I
    //   2175: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2178: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   2181: aload #26
    //   2183: ldc_w 'album_artist'
    //   2186: aload #19
    //   2188: getfield j : Ljava/lang/String;
    //   2191: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2194: aload #26
    //   2196: ldc_w 'COL_COMPOSER'
    //   2199: aload #19
    //   2201: getfield f : Ljava/lang/String;
    //   2204: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2207: aload #26
    //   2209: aload #38
    //   2211: aload #19
    //   2213: getfield e : Ljava/lang/String;
    //   2216: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2219: aload #26
    //   2221: ldc_w 'COL_YEAR'
    //   2224: aload #19
    //   2226: getfield p : I
    //   2229: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2232: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   2235: aload #26
    //   2237: ldc_w 'COL_TRACK_NO'
    //   2240: aload #19
    //   2242: getfield q : I
    //   2245: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2248: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   2251: aload #26
    //   2253: ldc_w 'COL_DATE_MODIFIED'
    //   2256: aload #19
    //   2258: getfield l : J
    //   2261: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2264: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   2267: aload #26
    //   2269: ldc_w 'COL_GAINS'
    //   2272: ldc_w ''
    //   2275: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2278: goto -> 2303
    //   2281: astore #15
    //   2283: aload_0
    //   2284: astore #16
    //   2286: aload_1
    //   2287: astore #19
    //   2289: aload_1
    //   2290: astore #19
    //   2292: aload #15
    //   2294: astore #19
    //   2296: aload #16
    //   2298: astore #15
    //   2300: goto -> 3155
    //   2303: aload_0
    //   2304: invokevirtual h : ()Z
    //   2307: ifne -> 2420
    //   2310: aload #22
    //   2312: getfield f : Lwo;
    //   2315: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   2318: astore #15
    //   2320: aload_1
    //   2321: ldc_w 'TABLE_SONGS'
    //   2324: aload #26
    //   2326: ldc_w 'COL_PATH = ? '
    //   2329: iconst_1
    //   2330: anewarray java/lang/String
    //   2333: dup
    //   2334: iconst_0
    //   2335: aload #15
    //   2337: aastore
    //   2338: invokevirtual update : (Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   2341: pop
    //   2342: aload_0
    //   2343: astore #15
    //   2345: aload #15
    //   2347: astore #16
    //   2349: aload #15
    //   2351: getfield W : Ljava/util/HashMap;
    //   2354: aload #22
    //   2356: getfield f : Lwo;
    //   2359: aload #27
    //   2361: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2364: pop
    //   2365: aload #15
    //   2367: astore #16
    //   2369: aload #15
    //   2371: getfield X : Ljava/util/HashSet;
    //   2374: aload #19
    //   2376: getfield c : Lqn1;
    //   2379: getfield f : Lwo;
    //   2382: invokevirtual add : (Ljava/lang/Object;)Z
    //   2385: pop
    //   2386: iload_3
    //   2387: istore #4
    //   2389: aload #15
    //   2391: astore #16
    //   2393: goto -> 2578
    //   2396: astore #15
    //   2398: aload_1
    //   2399: astore #19
    //   2401: goto -> 2289
    //   2404: astore #15
    //   2406: aload_0
    //   2407: astore #16
    //   2409: goto -> 2398
    //   2412: astore #15
    //   2414: aload_0
    //   2415: astore #16
    //   2417: goto -> 2398
    //   2420: aload_0
    //   2421: astore #15
    //   2423: aload #15
    //   2425: astore #16
    //   2427: new android/app/PendingIntent$CanceledException
    //   2430: astore #19
    //   2432: aload #15
    //   2434: astore #16
    //   2436: aload #19
    //   2438: invokespecial <init> : ()V
    //   2441: aload #15
    //   2443: astore #16
    //   2445: aload #19
    //   2447: athrow
    //   2448: aload_0
    //   2449: astore #15
    //   2451: goto -> 2474
    //   2454: astore #16
    //   2456: aload #15
    //   2458: astore #19
    //   2460: aload #16
    //   2462: astore #15
    //   2464: aload #19
    //   2466: astore #16
    //   2468: goto -> 2398
    //   2471: goto -> 2451
    //   2474: aload #15
    //   2476: astore #16
    //   2478: aload #15
    //   2480: invokevirtual h : ()Z
    //   2483: ifne -> 2591
    //   2486: aload #15
    //   2488: astore #16
    //   2490: aload #26
    //   2492: invokevirtual clear : ()V
    //   2495: aload #15
    //   2497: astore #16
    //   2499: aload #23
    //   2501: getfield b : I
    //   2504: istore #5
    //   2506: iload #5
    //   2508: bipush #64
    //   2510: ior
    //   2511: istore #6
    //   2513: aload #15
    //   2515: astore #16
    //   2517: iload_2
    //   2518: istore #4
    //   2520: iload #6
    //   2522: iload #5
    //   2524: if_icmpeq -> 2578
    //   2527: aload #15
    //   2529: astore #16
    //   2531: aload #26
    //   2533: aload #31
    //   2535: iload #6
    //   2537: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2540: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   2543: aload #15
    //   2545: astore #16
    //   2547: aload_1
    //   2548: ldc_w 'TABLE_SONGS'
    //   2551: aload #26
    //   2553: ldc_w 'COL_PATH = ? '
    //   2556: iconst_1
    //   2557: anewarray java/lang/String
    //   2560: dup
    //   2561: iconst_0
    //   2562: aload #22
    //   2564: getfield f : Lwo;
    //   2567: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   2570: aastore
    //   2571: invokevirtual update : (Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   2574: pop
    //   2575: goto -> 2386
    //   2578: aload_1
    //   2579: astore #15
    //   2581: aload #16
    //   2583: astore #15
    //   2585: iload #4
    //   2587: istore_2
    //   2588: goto -> 3116
    //   2591: aload #15
    //   2593: astore #16
    //   2595: new android/app/PendingIntent$CanceledException
    //   2598: astore #19
    //   2600: aload #15
    //   2602: astore #16
    //   2604: aload #19
    //   2606: invokespecial <init> : ()V
    //   2609: aload #15
    //   2611: astore #16
    //   2613: aload #19
    //   2615: athrow
    //   2616: aload #15
    //   2618: astore #16
    //   2620: aload #21
    //   2622: invokevirtual clear : ()V
    //   2625: aload #23
    //   2627: getfield d : Lwo;
    //   2630: astore #27
    //   2632: aload #27
    //   2634: ifnull -> 2725
    //   2637: aload #27
    //   2639: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   2642: astore #27
    //   2644: aload #21
    //   2646: ldc_w 'COL_PATH'
    //   2649: aload #27
    //   2651: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2654: aload #16
    //   2656: getfield W : Ljava/util/HashMap;
    //   2659: aload #22
    //   2661: getfield f : Lwo;
    //   2664: aload #23
    //   2666: getfield d : Lwo;
    //   2669: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2672: pop
    //   2673: aload #23
    //   2675: getfield e : Ld61;
    //   2678: astore #27
    //   2680: aload #27
    //   2682: ifnull -> 2715
    //   2685: aload #21
    //   2687: ldc_w 'COL_LOGPATH'
    //   2690: aload #27
    //   2692: invokevirtual toString : ()Ljava/lang/String;
    //   2695: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2698: goto -> 2715
    //   2701: astore #19
    //   2703: aload_1
    //   2704: astore #15
    //   2706: iload_3
    //   2707: istore_2
    //   2708: aload #16
    //   2710: astore #15
    //   2712: goto -> 3155
    //   2715: iload_3
    //   2716: istore_2
    //   2717: goto -> 2725
    //   2720: astore #19
    //   2722: goto -> 2703
    //   2725: iload_2
    //   2726: istore #4
    //   2728: aload #16
    //   2730: getfield T : Ljava/util/HashMap;
    //   2733: aload #19
    //   2735: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2738: checkcast km0
    //   2741: astore #27
    //   2743: iload_2
    //   2744: istore #5
    //   2746: aload #27
    //   2748: ifnull -> 2918
    //   2751: aload #21
    //   2753: ldc_w 'COL_TITLE'
    //   2756: aload #27
    //   2758: getfield c : Lqn1;
    //   2761: getfield b : Ljava/lang/String;
    //   2764: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2767: aload #21
    //   2769: ldc_w 'COL_ALBUM'
    //   2772: aload #27
    //   2774: getfield c : Lqn1;
    //   2777: getfield c : Ljava/lang/String;
    //   2780: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2783: aload #21
    //   2785: ldc_w 'COL_ARTIST'
    //   2788: aload #27
    //   2790: getfield c : Lqn1;
    //   2793: getfield e : Ljava/lang/String;
    //   2796: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2799: aload #21
    //   2801: ldc_w 'COL_DURATION'
    //   2804: aload #27
    //   2806: getfield c : Lqn1;
    //   2809: getfield g : I
    //   2812: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2815: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   2818: aload #21
    //   2820: ldc_w 'album_artist'
    //   2823: aload #27
    //   2825: getfield j : Ljava/lang/String;
    //   2828: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2831: aload #21
    //   2833: ldc_w 'COL_COMPOSER'
    //   2836: aload #27
    //   2838: getfield f : Ljava/lang/String;
    //   2841: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2844: aload #21
    //   2846: aload #38
    //   2848: aload #27
    //   2850: getfield e : Ljava/lang/String;
    //   2853: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2856: aload #21
    //   2858: ldc_w 'COL_YEAR'
    //   2861: aload #27
    //   2863: getfield p : I
    //   2866: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2869: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   2872: aload #21
    //   2874: ldc_w 'COL_TRACK_NO'
    //   2877: aload #27
    //   2879: getfield q : I
    //   2882: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2885: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   2888: aload #21
    //   2890: ldc_w 'COL_DATE_MODIFIED'
    //   2893: aload #27
    //   2895: getfield l : J
    //   2898: invokestatic valueOf : (J)Ljava/lang/Long;
    //   2901: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   2904: aload #21
    //   2906: ldc_w 'COL_GAINS'
    //   2909: ldc_w ''
    //   2912: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   2915: iload_3
    //   2916: istore #5
    //   2918: iload #5
    //   2920: istore #4
    //   2922: aload #16
    //   2924: getfield U : Ljava/util/HashMap;
    //   2927: aload #19
    //   2929: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2932: checkcast java/lang/Integer
    //   2935: astore #19
    //   2937: aload #23
    //   2939: getfield b : I
    //   2942: istore #6
    //   2944: aload #19
    //   2946: ifnull -> 2987
    //   2949: iload #5
    //   2951: istore #4
    //   2953: aload #21
    //   2955: aload #31
    //   2957: iload #6
    //   2959: bipush #-96
    //   2961: iand
    //   2962: aload #19
    //   2964: invokevirtual intValue : ()I
    //   2967: ior
    //   2968: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2971: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   2974: iload_3
    //   2975: istore_2
    //   2976: goto -> 3028
    //   2979: astore #19
    //   2981: iload #4
    //   2983: istore_2
    //   2984: goto -> 1954
    //   2987: iload #5
    //   2989: istore_2
    //   2990: iload #6
    //   2992: bipush #64
    //   2994: iand
    //   2995: ifeq -> 3028
    //   2998: iload #5
    //   3000: istore #4
    //   3002: iload #6
    //   3004: bipush #-65
    //   3006: iand
    //   3007: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3010: astore #19
    //   3012: iload #5
    //   3014: istore #4
    //   3016: aload #21
    //   3018: aload #31
    //   3020: aload #19
    //   3022: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   3025: goto -> 2974
    //   3028: iload_2
    //   3029: istore #4
    //   3031: aload #16
    //   3033: invokevirtual h : ()Z
    //   3036: ifne -> 3134
    //   3039: iload_2
    //   3040: istore #4
    //   3042: aload #23
    //   3044: getfield d : Lwo;
    //   3047: ifnonnull -> 3060
    //   3050: aload #27
    //   3052: ifnonnull -> 3060
    //   3055: aload #19
    //   3057: ifnull -> 3063
    //   3060: goto -> 3073
    //   3063: aload_1
    //   3064: astore #15
    //   3066: aload #16
    //   3068: astore #15
    //   3070: goto -> 3116
    //   3073: iload_2
    //   3074: istore #4
    //   3076: aload #22
    //   3078: getfield f : Lwo;
    //   3081: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   3084: astore #19
    //   3086: aload_1
    //   3087: astore #15
    //   3089: aload #15
    //   3091: ldc_w 'TABLE_SONGS'
    //   3094: aload #21
    //   3096: ldc_w 'COL_PATH = ? '
    //   3099: iconst_1
    //   3100: anewarray java/lang/String
    //   3103: dup
    //   3104: iconst_0
    //   3105: aload #19
    //   3107: aastore
    //   3108: invokevirtual update : (Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   3111: pop
    //   3112: aload #16
    //   3114: astore #15
    //   3116: aload_1
    //   3117: astore #16
    //   3119: goto -> 3196
    //   3122: aload_1
    //   3123: astore #15
    //   3125: astore #19
    //   3127: aload #16
    //   3129: astore #15
    //   3131: goto -> 3155
    //   3134: new android/app/PendingIntent$CanceledException
    //   3137: astore #15
    //   3139: aload #15
    //   3141: invokespecial <init> : ()V
    //   3144: aload #15
    //   3146: athrow
    //   3147: astore #15
    //   3149: aload_1
    //   3150: astore #19
    //   3152: goto -> 2289
    //   3155: aload_1
    //   3156: astore #16
    //   3158: aload #15
    //   3160: astore #22
    //   3162: iload_2
    //   3163: istore #4
    //   3165: aload #15
    //   3167: astore #16
    //   3169: aload #15
    //   3171: invokevirtual h : ()Z
    //   3174: ifne -> 3251
    //   3177: aload #15
    //   3179: astore #22
    //   3181: iload_2
    //   3182: istore #4
    //   3184: aload #15
    //   3186: astore #16
    //   3188: aload #19
    //   3190: invokevirtual printStackTrace : ()V
    //   3193: goto -> 3116
    //   3196: aload #17
    //   3198: astore #22
    //   3200: aload #18
    //   3202: astore #19
    //   3204: aload #16
    //   3206: astore #17
    //   3208: aload #20
    //   3210: astore #23
    //   3212: aload #22
    //   3214: astore #18
    //   3216: goto -> 1776
    //   3219: aload_1
    //   3220: astore #15
    //   3222: astore #15
    //   3224: iload #4
    //   3226: istore_2
    //   3227: aload #22
    //   3229: astore #16
    //   3231: aload #16
    //   3233: astore #19
    //   3235: aload #15
    //   3237: astore #16
    //   3239: aload #19
    //   3241: astore #15
    //   3243: goto -> 4285
    //   3246: astore #15
    //   3248: goto -> 4376
    //   3251: aload #15
    //   3253: astore #22
    //   3255: iload_2
    //   3256: istore #4
    //   3258: aload #15
    //   3260: astore #16
    //   3262: new android/app/PendingIntent$CanceledException
    //   3265: astore #19
    //   3267: aload #15
    //   3269: astore #22
    //   3271: iload_2
    //   3272: istore #4
    //   3274: aload #15
    //   3276: astore #16
    //   3278: aload #19
    //   3280: invokespecial <init> : ()V
    //   3283: aload #15
    //   3285: astore #22
    //   3287: iload_2
    //   3288: istore #4
    //   3290: aload #15
    //   3292: astore #16
    //   3294: aload #19
    //   3296: athrow
    //   3297: aload_1
    //   3298: astore #16
    //   3300: aload #15
    //   3302: astore #22
    //   3304: iload_2
    //   3305: istore #4
    //   3307: aload #15
    //   3309: astore #16
    //   3311: new android/app/PendingIntent$CanceledException
    //   3314: astore #19
    //   3316: aload #15
    //   3318: astore #22
    //   3320: iload_2
    //   3321: istore #4
    //   3323: aload #15
    //   3325: astore #16
    //   3327: aload #19
    //   3329: invokespecial <init> : ()V
    //   3332: aload #15
    //   3334: astore #22
    //   3336: iload_2
    //   3337: istore #4
    //   3339: aload #15
    //   3341: astore #16
    //   3343: aload #19
    //   3345: athrow
    //   3346: astore #16
    //   3348: aload #15
    //   3350: astore #22
    //   3352: aload_1
    //   3353: astore #15
    //   3355: aload #16
    //   3357: astore #15
    //   3359: goto -> 3227
    //   3362: astore #16
    //   3364: goto -> 1480
    //   3367: ldc_w 'COL_DATE_MODIFIED'
    //   3370: astore #29
    //   3372: ldc_w 'TABLE_SONGS'
    //   3375: astore #25
    //   3377: ldc_w 'COL_YEAR'
    //   3380: astore #33
    //   3382: ldc_w '/'
    //   3385: astore #35
    //   3387: aload #21
    //   3389: astore #26
    //   3391: aload #15
    //   3393: astore #16
    //   3395: aload #15
    //   3397: astore #19
    //   3399: aload #24
    //   3401: invokevirtual clear : ()V
    //   3404: aload #15
    //   3406: astore #16
    //   3408: aload #15
    //   3410: astore #19
    //   3412: aload #15
    //   3414: invokevirtual h : ()Z
    //   3417: istore #7
    //   3419: iload #7
    //   3421: ifne -> 4147
    //   3424: ldc_w 'COL_TRACK_NO'
    //   3427: astore #37
    //   3429: ldc_w 'album_artist'
    //   3432: astore #36
    //   3434: aload #15
    //   3436: astore #19
    //   3438: aload #15
    //   3440: lconst_0
    //   3441: putfield c0 : J
    //   3444: aload #15
    //   3446: astore #16
    //   3448: aload #15
    //   3450: astore #19
    //   3452: aload #15
    //   3454: invokestatic d : ()Landroid/content/Context;
    //   3457: ldc_w 2131886126
    //   3460: invokevirtual getString : (I)Ljava/lang/String;
    //   3463: putfield c : Ljava/lang/String;
    //   3466: aload #15
    //   3468: astore #16
    //   3470: aload #15
    //   3472: astore #19
    //   3474: aload #15
    //   3476: aload #15
    //   3478: getfield V : Ljava/util/ArrayList;
    //   3481: invokevirtual size : ()I
    //   3484: putfield a : I
    //   3487: aload #15
    //   3489: astore #16
    //   3491: aload #15
    //   3493: astore #19
    //   3495: aload #15
    //   3497: iconst_0
    //   3498: putfield b : I
    //   3501: iconst_0
    //   3502: istore #4
    //   3504: aload #25
    //   3506: astore #24
    //   3508: aload #23
    //   3510: astore #21
    //   3512: aload #20
    //   3514: astore #25
    //   3516: aload #37
    //   3518: astore #20
    //   3520: aload #36
    //   3522: astore #23
    //   3524: aload #15
    //   3526: astore #16
    //   3528: aload #15
    //   3530: astore #19
    //   3532: iload #4
    //   3534: aload #15
    //   3536: getfield V : Ljava/util/ArrayList;
    //   3539: invokevirtual size : ()I
    //   3542: if_icmpge -> 4074
    //   3545: aload #15
    //   3547: astore #16
    //   3549: aload #15
    //   3551: astore #19
    //   3553: aload #15
    //   3555: iload #4
    //   3557: putfield b : I
    //   3560: aload #15
    //   3562: astore #16
    //   3564: aload #15
    //   3566: astore #19
    //   3568: aload #15
    //   3570: invokevirtual x : ()V
    //   3573: aload #15
    //   3575: astore #16
    //   3577: aload #15
    //   3579: astore #19
    //   3581: aload #15
    //   3583: getfield V : Ljava/util/ArrayList;
    //   3586: iload #4
    //   3588: invokevirtual get : (I)Ljava/lang/Object;
    //   3591: checkcast km0
    //   3594: astore #36
    //   3596: aload #15
    //   3598: astore #16
    //   3600: aload #15
    //   3602: astore #19
    //   3604: aload #15
    //   3606: invokevirtual h : ()Z
    //   3609: ifne -> 4028
    //   3612: aload #15
    //   3614: astore #16
    //   3616: aload #15
    //   3618: astore #19
    //   3620: aload #15
    //   3622: getfield X : Ljava/util/HashSet;
    //   3625: astore #15
    //   3627: aload #15
    //   3629: aload #36
    //   3631: getfield c : Lqn1;
    //   3634: getfield f : Lwo;
    //   3637: invokevirtual contains : (Ljava/lang/Object;)Z
    //   3640: ifne -> 4003
    //   3643: aload #26
    //   3645: invokevirtual clear : ()V
    //   3648: aload #26
    //   3650: aload #34
    //   3652: aload #36
    //   3654: getfield c : Lqn1;
    //   3657: getfield f : Lwo;
    //   3660: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   3663: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   3666: new java/lang/StringBuilder
    //   3669: astore #15
    //   3671: aload #15
    //   3673: invokespecial <init> : ()V
    //   3676: aload #15
    //   3678: aload #36
    //   3680: getfield h : Ljava/lang/String;
    //   3683: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3686: pop
    //   3687: aload #15
    //   3689: aload #35
    //   3691: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3694: pop
    //   3695: aload #15
    //   3697: aload #36
    //   3699: getfield g : Ljava/lang/String;
    //   3702: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3705: pop
    //   3706: aload #26
    //   3708: aload #32
    //   3710: aload #15
    //   3712: invokevirtual toString : ()Ljava/lang/String;
    //   3715: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   3718: aload #26
    //   3720: aload #28
    //   3722: aload #36
    //   3724: getfield c : Lqn1;
    //   3727: getfield b : Ljava/lang/String;
    //   3730: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   3733: aload #26
    //   3735: aload #27
    //   3737: aload #36
    //   3739: getfield c : Lqn1;
    //   3742: getfield c : Ljava/lang/String;
    //   3745: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   3748: aload #26
    //   3750: aload #30
    //   3752: aload #36
    //   3754: getfield c : Lqn1;
    //   3757: getfield e : Ljava/lang/String;
    //   3760: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   3763: aload #26
    //   3765: ldc_w 'COL_DURATION'
    //   3768: aload #36
    //   3770: getfield c : Lqn1;
    //   3773: getfield g : I
    //   3776: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3779: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   3782: aload #26
    //   3784: aload #23
    //   3786: aload #36
    //   3788: getfield j : Ljava/lang/String;
    //   3791: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   3794: aload #26
    //   3796: ldc_w 'COL_COMPOSER'
    //   3799: aload #36
    //   3801: getfield f : Ljava/lang/String;
    //   3804: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   3807: aload #26
    //   3809: aload #38
    //   3811: aload #36
    //   3813: getfield e : Ljava/lang/String;
    //   3816: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   3819: aload #26
    //   3821: aload #33
    //   3823: aload #36
    //   3825: getfield p : I
    //   3828: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3831: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   3834: aload #26
    //   3836: aload #20
    //   3838: aload #36
    //   3840: getfield q : I
    //   3843: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3846: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   3849: aload #26
    //   3851: aload #29
    //   3853: aload #36
    //   3855: getfield l : J
    //   3858: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3861: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   3864: aload #26
    //   3866: aload #25
    //   3868: aload #36
    //   3870: getfield k : J
    //   3873: invokestatic valueOf : (J)Ljava/lang/Long;
    //   3876: invokevirtual put : (Ljava/lang/String;Ljava/lang/Long;)V
    //   3879: aload #26
    //   3881: aload #31
    //   3883: aload #36
    //   3885: getfield u : I
    //   3888: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3891: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   3894: aload #26
    //   3896: aload #22
    //   3898: aload #21
    //   3900: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   3903: aload_1
    //   3904: aload #24
    //   3906: aconst_null
    //   3907: aload #26
    //   3909: iconst_4
    //   3910: invokevirtual insertWithOnConflict : (Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   3913: ldc2_w -1
    //   3916: lcmp
    //   3917: ifne -> 3984
    //   3920: aload #26
    //   3922: aload #34
    //   3924: invokevirtual remove : (Ljava/lang/String;)V
    //   3927: aload #26
    //   3929: aload #25
    //   3931: invokevirtual remove : (Ljava/lang/String;)V
    //   3934: iload_3
    //   3935: anewarray java/lang/String
    //   3938: astore #15
    //   3940: aload #15
    //   3942: iconst_0
    //   3943: aload #36
    //   3945: getfield c : Lqn1;
    //   3948: getfield f : Lwo;
    //   3951: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   3954: aastore
    //   3955: aload_1
    //   3956: ldc_w 'TABLE_SONGS'
    //   3959: aload #26
    //   3961: ldc_w 'COL_PATH=?'
    //   3964: aload #15
    //   3966: iconst_4
    //   3967: invokevirtual updateWithOnConflict : (Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;I)I
    //   3970: pop
    //   3971: goto -> 4003
    //   3974: astore #15
    //   3976: goto -> 4003
    //   3979: astore #15
    //   3981: goto -> 3984
    //   3984: goto -> 4003
    //   3987: astore #15
    //   3989: aload_0
    //   3990: astore #19
    //   3992: goto -> 3235
    //   3995: astore #15
    //   3997: aload_0
    //   3998: astore #16
    //   4000: goto -> 4376
    //   4003: aload_0
    //   4004: astore #15
    //   4006: iconst_1
    //   4007: istore_3
    //   4008: iinc #4, 1
    //   4011: goto -> 3524
    //   4014: astore #15
    //   4016: goto -> 3231
    //   4019: astore #15
    //   4021: aload #19
    //   4023: astore #16
    //   4025: goto -> 3248
    //   4028: aload #15
    //   4030: astore #19
    //   4032: aload #19
    //   4034: astore #15
    //   4036: aload #19
    //   4038: astore #16
    //   4040: new android/app/PendingIntent$CanceledException
    //   4043: astore #20
    //   4045: aload #19
    //   4047: astore #15
    //   4049: aload #19
    //   4051: astore #16
    //   4053: aload #20
    //   4055: invokespecial <init> : ()V
    //   4058: aload #19
    //   4060: astore #15
    //   4062: aload #19
    //   4064: astore #16
    //   4066: aload #20
    //   4068: athrow
    //   4069: astore #16
    //   4071: goto -> 4285
    //   4074: aload_1
    //   4075: astore #20
    //   4077: aload #15
    //   4079: astore #19
    //   4081: iload #9
    //   4083: ifne -> 4102
    //   4086: aload #19
    //   4088: astore #15
    //   4090: aload #19
    //   4092: astore #16
    //   4094: aload #19
    //   4096: getfield l : Z
    //   4099: ifeq -> 4115
    //   4102: aload #19
    //   4104: astore #15
    //   4106: aload #19
    //   4108: astore #16
    //   4110: aload #20
    //   4112: invokestatic z : (Landroid/database/sqlite/SQLiteDatabase;)V
    //   4115: aload #19
    //   4117: astore #15
    //   4119: aload #19
    //   4121: astore #16
    //   4123: aload #20
    //   4125: invokevirtual setTransactionSuccessful : ()V
    //   4128: aload #19
    //   4130: astore #15
    //   4132: aload #20
    //   4134: astore_1
    //   4135: aload_1
    //   4136: invokevirtual endTransaction : ()V
    //   4139: goto -> 4296
    //   4142: astore #16
    //   4144: goto -> 4285
    //   4147: aload #15
    //   4149: astore #19
    //   4151: aload #19
    //   4153: astore #15
    //   4155: aload #19
    //   4157: astore #16
    //   4159: new android/app/PendingIntent$CanceledException
    //   4162: astore #20
    //   4164: aload #19
    //   4166: astore #15
    //   4168: aload #19
    //   4170: astore #16
    //   4172: aload #20
    //   4174: invokespecial <init> : ()V
    //   4177: aload #19
    //   4179: astore #15
    //   4181: aload #19
    //   4183: astore #16
    //   4185: aload #20
    //   4187: athrow
    //   4188: astore_1
    //   4189: aload #18
    //   4191: astore #20
    //   4193: aload #19
    //   4195: astore #18
    //   4197: aload #15
    //   4199: astore #16
    //   4201: aload #17
    //   4203: astore #15
    //   4205: aload #20
    //   4207: astore #17
    //   4209: goto -> 1459
    //   4212: astore #16
    //   4214: aload #17
    //   4216: astore #18
    //   4218: aload #19
    //   4220: astore #17
    //   4222: aload_0
    //   4223: astore #19
    //   4225: iconst_0
    //   4226: istore_2
    //   4227: aload #15
    //   4229: astore_1
    //   4230: aload #19
    //   4232: astore #15
    //   4234: goto -> 4285
    //   4237: astore #16
    //   4239: goto -> 4214
    //   4242: astore #16
    //   4244: goto -> 4214
    //   4247: aload #16
    //   4249: astore #18
    //   4251: aload #18
    //   4253: astore #16
    //   4255: new android/app/PendingIntent$CanceledException
    //   4258: astore #20
    //   4260: aload #18
    //   4262: astore #16
    //   4264: aload #20
    //   4266: invokespecial <init> : ()V
    //   4269: aload #18
    //   4271: astore #16
    //   4273: aload #20
    //   4275: athrow
    //   4276: astore #16
    //   4278: iload #7
    //   4280: istore #8
    //   4282: goto -> 4214
    //   4285: aload_1
    //   4286: astore #19
    //   4288: aload #16
    //   4290: invokevirtual printStackTrace : ()V
    //   4293: goto -> 4135
    //   4296: aload #15
    //   4298: getfield R : Ljava/util/HashSet;
    //   4301: astore #22
    //   4303: aload_1
    //   4304: astore #20
    //   4306: aload #15
    //   4308: astore #16
    //   4310: iload #8
    //   4312: istore #10
    //   4314: iload #9
    //   4316: istore #7
    //   4318: iload_2
    //   4319: istore_3
    //   4320: aload #17
    //   4322: astore #19
    //   4324: aload #18
    //   4326: astore #21
    //   4328: aload #22
    //   4330: ifnull -> 4418
    //   4333: aload #22
    //   4335: invokevirtual clear : ()V
    //   4338: aload #15
    //   4340: aconst_null
    //   4341: putfield R : Ljava/util/HashSet;
    //   4344: aload_1
    //   4345: astore #20
    //   4347: aload #15
    //   4349: astore #16
    //   4351: iload #8
    //   4353: istore #10
    //   4355: iload #9
    //   4357: istore #7
    //   4359: iload_2
    //   4360: istore_3
    //   4361: aload #17
    //   4363: astore #19
    //   4365: aload #18
    //   4367: astore #21
    //   4369: goto -> 4418
    //   4372: astore_1
    //   4373: goto -> 4389
    //   4376: aload_1
    //   4377: astore #19
    //   4379: aload #16
    //   4381: invokevirtual b : ()V
    //   4384: aload_1
    //   4385: invokevirtual endTransaction : ()V
    //   4388: return
    //   4389: aload #19
    //   4391: invokevirtual endTransaction : ()V
    //   4394: aload_1
    //   4395: athrow
    //   4396: iload #7
    //   4398: istore #10
    //   4400: iconst_0
    //   4401: istore_3
    //   4402: aload #17
    //   4404: astore #21
    //   4406: aload #18
    //   4408: astore #19
    //   4410: iload #9
    //   4412: istore #7
    //   4414: aload #15
    //   4416: astore #20
    //   4418: aload #16
    //   4420: getfield m : Z
    //   4423: ifne -> 4483
    //   4426: iload_3
    //   4427: ifne -> 4483
    //   4430: iload #7
    //   4432: ifne -> 4483
    //   4435: aload #16
    //   4437: getfield l : Z
    //   4440: ifne -> 4483
    //   4443: iload #10
    //   4445: ifne -> 4483
    //   4448: aload #16
    //   4450: getfield j : Z
    //   4453: ifne -> 4483
    //   4456: aload #16
    //   4458: getfield V : Ljava/util/ArrayList;
    //   4461: invokevirtual size : ()I
    //   4464: aload #16
    //   4466: getfield X : Ljava/util/HashSet;
    //   4469: invokevirtual size : ()I
    //   4472: if_icmple -> 4478
    //   4475: goto -> 4483
    //   4478: iconst_0
    //   4479: istore_2
    //   4480: goto -> 4485
    //   4483: iconst_1
    //   4484: istore_2
    //   4485: aload #16
    //   4487: getfield f0 : Z
    //   4490: ifeq -> 4503
    //   4493: aload #16
    //   4495: invokevirtual u : ()V
    //   4498: iconst_0
    //   4499: istore_2
    //   4500: goto -> 4503
    //   4503: aload #16
    //   4505: lconst_0
    //   4506: putfield c0 : J
    //   4509: aload #16
    //   4511: invokestatic d : ()Landroid/content/Context;
    //   4514: ldc_w 2131887537
    //   4517: invokevirtual getString : (I)Ljava/lang/String;
    //   4520: putfield c : Ljava/lang/String;
    //   4523: aload #16
    //   4525: iconst_0
    //   4526: putfield a : I
    //   4529: aload #16
    //   4531: iconst_0
    //   4532: putfield b : I
    //   4535: aload #16
    //   4537: iconst_0
    //   4538: putfield E : Z
    //   4541: aload #16
    //   4543: invokevirtual x : ()V
    //   4546: aload #16
    //   4548: getfield e : Landroid/media/MediaMetadataRetriever;
    //   4551: ifnull -> 4576
    //   4554: aload #16
    //   4556: invokevirtual l : ()Landroid/media/MediaMetadataRetriever;
    //   4559: invokevirtual release : ()V
    //   4562: goto -> 4570
    //   4565: astore_1
    //   4566: aload_1
    //   4567: invokevirtual printStackTrace : ()V
    //   4570: aload #16
    //   4572: aconst_null
    //   4573: putfield e : Landroid/media/MediaMetadataRetriever;
    //   4576: aload #16
    //   4578: getfield O : Ljava/util/HashMap;
    //   4581: astore_1
    //   4582: aload_1
    //   4583: ifnull -> 4596
    //   4586: aload_1
    //   4587: invokevirtual clear : ()V
    //   4590: aload #16
    //   4592: aconst_null
    //   4593: putfield O : Ljava/util/HashMap;
    //   4596: aload #16
    //   4598: getfield S : Ljava/util/HashSet;
    //   4601: astore_1
    //   4602: aload_1
    //   4603: ifnull -> 4616
    //   4606: aload_1
    //   4607: invokevirtual clear : ()V
    //   4610: aload #16
    //   4612: aconst_null
    //   4613: putfield S : Ljava/util/HashSet;
    //   4616: aload #16
    //   4618: getfield T : Ljava/util/HashMap;
    //   4621: astore_1
    //   4622: aload_1
    //   4623: ifnull -> 4636
    //   4626: aload_1
    //   4627: invokevirtual clear : ()V
    //   4630: aload #16
    //   4632: aconst_null
    //   4633: putfield T : Ljava/util/HashMap;
    //   4636: aload #16
    //   4638: getfield U : Ljava/util/HashMap;
    //   4641: astore_1
    //   4642: aload_1
    //   4643: ifnull -> 4656
    //   4646: aload_1
    //   4647: invokevirtual clear : ()V
    //   4650: aload #16
    //   4652: aconst_null
    //   4653: putfield U : Ljava/util/HashMap;
    //   4656: aload #16
    //   4658: getfield V : Ljava/util/ArrayList;
    //   4661: astore_1
    //   4662: aload_1
    //   4663: ifnull -> 4676
    //   4666: aload_1
    //   4667: invokevirtual clear : ()V
    //   4670: aload #16
    //   4672: aconst_null
    //   4673: putfield G : Ljava/util/ArrayList;
    //   4676: aload #16
    //   4678: getfield X : Ljava/util/HashSet;
    //   4681: astore_1
    //   4682: aload_1
    //   4683: ifnull -> 4696
    //   4686: aload_1
    //   4687: invokevirtual clear : ()V
    //   4690: aload #16
    //   4692: aconst_null
    //   4693: putfield X : Ljava/util/HashSet;
    //   4696: aload #21
    //   4698: getfield b : Ljava/util/HashMap;
    //   4701: invokevirtual clear : ()V
    //   4704: aload #16
    //   4706: getfield f : Z
    //   4709: ifeq -> 4727
    //   4712: invokestatic currentTimeMillis : ()J
    //   4715: lstore #11
    //   4717: lload #11
    //   4719: putstatic ag0.q : J
    //   4722: lload #11
    //   4724: putstatic ag0.p : J
    //   4727: iload_2
    //   4728: ifeq -> 4944
    //   4731: new lm0
    //   4734: astore_1
    //   4735: aload_1
    //   4736: aload #20
    //   4738: invokespecial <init> : (Landroid/database/sqlite/SQLiteDatabase;)V
    //   4741: goto -> 4812
    //   4744: astore_1
    //   4745: getstatic zi1.E : Lzi1;
    //   4748: ifnull -> 4942
    //   4751: aload #16
    //   4753: getfield K : Z
    //   4756: ifeq -> 4942
    //   4759: aload_1
    //   4760: invokevirtual printStackTrace : ()V
    //   4763: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   4766: astore_1
    //   4767: aload_1
    //   4768: ifnull -> 4784
    //   4771: aload #16
    //   4773: iconst_1
    //   4774: putfield g : Z
    //   4777: aload_1
    //   4778: invokevirtual m0 : ()V
    //   4781: goto -> 4796
    //   4784: getstatic in/krosbits/musicolet/SettingsActivity.m0 : Lin/krosbits/musicolet/SettingsActivity;
    //   4787: astore_1
    //   4788: aload_1
    //   4789: ifnull -> 4796
    //   4792: aload_1
    //   4793: invokevirtual finish : ()V
    //   4796: ldc2_w 3500
    //   4799: invokestatic sleep : (J)V
    //   4802: new lm0
    //   4805: dup
    //   4806: aload #20
    //   4808: invokespecial <init> : (Landroid/database/sqlite/SQLiteDatabase;)V
    //   4811: astore_1
    //   4812: aload_1
    //   4813: aload #16
    //   4815: getfield W : Ljava/util/HashMap;
    //   4818: putfield w : Ljava/util/HashMap;
    //   4821: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   4824: aload_1
    //   4825: putfield c : Llm0;
    //   4828: ldc_w 'NL>LIBU'
    //   4831: invokestatic F : (Ljava/lang/String;)V
    //   4834: aload #16
    //   4836: getfield W : Ljava/util/HashMap;
    //   4839: invokestatic g : (Ljava/util/HashMap;)V
    //   4842: aload #16
    //   4844: lconst_0
    //   4845: putfield c0 : J
    //   4848: aload #16
    //   4850: invokestatic d : ()Landroid/content/Context;
    //   4853: ldc_w 2131887538
    //   4856: invokevirtual getString : (I)Ljava/lang/String;
    //   4859: putfield c : Ljava/lang/String;
    //   4862: aload #16
    //   4864: iconst_0
    //   4865: putfield a : I
    //   4868: aload #16
    //   4870: iconst_0
    //   4871: putfield b : I
    //   4874: aload #16
    //   4876: invokevirtual x : ()V
    //   4879: invokestatic r : ()V
    //   4882: iload_3
    //   4883: ifne -> 4899
    //   4886: iload #10
    //   4888: ifne -> 4899
    //   4891: aload #16
    //   4893: getfield j : Z
    //   4896: ifeq -> 4909
    //   4899: getstatic p3.a : Ljava/util/HashMap;
    //   4902: invokevirtual clear : ()V
    //   4905: iconst_0
    //   4906: invokestatic q0 : (Z)V
    //   4909: aload #16
    //   4911: getfield h : Z
    //   4914: ifne -> 4944
    //   4917: aload #16
    //   4919: getfield W : Ljava/util/HashMap;
    //   4922: astore #15
    //   4924: aload #15
    //   4926: ifnull -> 4934
    //   4929: aload #15
    //   4931: invokevirtual clear : ()V
    //   4934: aload_1
    //   4935: aconst_null
    //   4936: putfield w : Ljava/util/HashMap;
    //   4939: goto -> 4944
    //   4942: aload_1
    //   4943: athrow
    //   4944: invokestatic y : ()Lkm0;
    //   4947: astore #15
    //   4949: aload #19
    //   4951: aload #15
    //   4953: if_acmpeq -> 5108
    //   4956: aload #19
    //   4958: ifnull -> 5108
    //   4961: aload #19
    //   4963: aload #15
    //   4965: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4968: ifne -> 5108
    //   4971: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   4974: ifnull -> 5108
    //   4977: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   4980: astore_1
    //   4981: aload_1
    //   4982: ifnull -> 5108
    //   4985: aload_1
    //   4986: invokevirtual B : ()Ljava/lang/String;
    //   4989: astore #17
    //   4991: aload #15
    //   4993: ifnull -> 5011
    //   4996: aload #15
    //   4998: getfield c : Lqn1;
    //   5001: getfield f : Lwo;
    //   5004: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   5007: astore_1
    //   5008: goto -> 5013
    //   5011: aconst_null
    //   5012: astore_1
    //   5013: aload #17
    //   5015: aload_1
    //   5016: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   5019: ifne -> 5108
    //   5022: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   5025: invokestatic d : ()Landroid/content/Context;
    //   5028: aload #17
    //   5030: invokestatic q : (Landroid/content/Context;Ljava/lang/String;)Lv00;
    //   5033: iconst_0
    //   5034: invokevirtual e : (Lu00;Z)Ljava/lang/String;
    //   5037: aload #15
    //   5039: invokevirtual d : ()Lv00;
    //   5042: getfield b : Ld61;
    //   5045: invokevirtual toString : ()Ljava/lang/String;
    //   5048: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   5051: istore #7
    //   5053: iload #7
    //   5055: iconst_1
    //   5056: ixor
    //   5057: istore_2
    //   5058: goto -> 5068
    //   5061: astore_1
    //   5062: aload_1
    //   5063: invokevirtual printStackTrace : ()V
    //   5066: iconst_1
    //   5067: istore_2
    //   5068: iload_2
    //   5069: ifeq -> 5082
    //   5072: invokestatic z : ()Lxn1;
    //   5075: iconst_0
    //   5076: invokevirtual l : (I)V
    //   5079: goto -> 5094
    //   5082: invokestatic z : ()Lxn1;
    //   5085: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   5088: invokevirtual A : ()I
    //   5091: invokevirtual l : (I)V
    //   5094: aload #16
    //   5096: getfield k : Z
    //   5099: ifne -> 5108
    //   5102: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   5105: invokevirtual j0 : ()V
    //   5108: aload #16
    //   5110: getfield f0 : Z
    //   5113: ifeq -> 5127
    //   5116: invokestatic y : ()V
    //   5119: goto -> 5127
    //   5122: astore_1
    //   5123: aload_1
    //   5124: invokevirtual printStackTrace : ()V
    //   5127: aload #16
    //   5129: invokevirtual b : ()V
    //   5132: return
    //   5133: astore #17
    //   5135: goto -> 109
    //   5138: astore #17
    //   5140: goto -> 202
    //   5143: astore_1
    //   5144: aload #22
    //   5146: astore #15
    //   5148: aload #20
    //   5150: astore_1
    //   5151: goto -> 1480
    //   5154: astore #15
    //   5156: goto -> 3984
    //   5159: astore #15
    //   5161: goto -> 4376
    //   5164: astore_1
    //   5165: goto -> 4802
    // Exception table:
    //   from	to	target	type
    //   104	109	5133	java/lang/InterruptedException
    //   187	202	5138	finally
    //   829	837	5143	android/app/PendingIntent$CanceledException
    //   829	837	4242	finally
    //   849	859	5143	android/app/PendingIntent$CanceledException
    //   849	859	4242	finally
    //   871	876	5143	android/app/PendingIntent$CanceledException
    //   871	876	4242	finally
    //   888	895	5143	android/app/PendingIntent$CanceledException
    //   888	895	4242	finally
    //   907	912	5143	android/app/PendingIntent$CanceledException
    //   907	912	4242	finally
    //   924	931	5143	android/app/PendingIntent$CanceledException
    //   924	931	4242	finally
    //   943	949	5143	android/app/PendingIntent$CanceledException
    //   943	949	4242	finally
    //   961	975	5143	android/app/PendingIntent$CanceledException
    //   961	975	4242	finally
    //   987	993	5143	android/app/PendingIntent$CanceledException
    //   987	993	4242	finally
    //   1005	1017	5143	android/app/PendingIntent$CanceledException
    //   1005	1017	4242	finally
    //   1029	1034	5143	android/app/PendingIntent$CanceledException
    //   1029	1034	4242	finally
    //   1046	1051	5143	android/app/PendingIntent$CanceledException
    //   1046	1051	4242	finally
    //   1063	1072	5143	android/app/PendingIntent$CanceledException
    //   1063	1072	4242	finally
    //   1084	1093	5143	android/app/PendingIntent$CanceledException
    //   1084	1093	4242	finally
    //   1106	1118	5143	android/app/PendingIntent$CanceledException
    //   1106	1118	1521	finally
    //   1126	1138	5143	android/app/PendingIntent$CanceledException
    //   1126	1138	1521	finally
    //   1146	1151	5143	android/app/PendingIntent$CanceledException
    //   1146	1151	1521	finally
    //   1159	1166	5143	android/app/PendingIntent$CanceledException
    //   1159	1166	1521	finally
    //   1171	1212	1265	finally
    //   1223	1247	1265	finally
    //   1252	1260	1265	finally
    //   1281	1294	1265	finally
    //   1299	1307	1265	finally
    //   1318	1345	1265	finally
    //   1351	1357	1265	finally
    //   1361	1379	1265	finally
    //   1383	1417	1420	finally
    //   1436	1441	5143	android/app/PendingIntent$CanceledException
    //   1436	1441	1444	finally
    //   1495	1499	5143	android/app/PendingIntent$CanceledException
    //   1495	1499	1444	finally
    //   1507	1511	5143	android/app/PendingIntent$CanceledException
    //   1507	1511	1444	finally
    //   1519	1521	5143	android/app/PendingIntent$CanceledException
    //   1519	1521	1444	finally
    //   1537	1544	5143	android/app/PendingIntent$CanceledException
    //   1537	1544	4212	finally
    //   1557	1568	5143	android/app/PendingIntent$CanceledException
    //   1557	1568	1444	finally
    //   1576	1582	5143	android/app/PendingIntent$CanceledException
    //   1576	1582	1444	finally
    //   1590	1604	5143	android/app/PendingIntent$CanceledException
    //   1590	1604	1444	finally
    //   1612	1618	5143	android/app/PendingIntent$CanceledException
    //   1612	1618	1444	finally
    //   1626	1632	5143	android/app/PendingIntent$CanceledException
    //   1626	1632	1444	finally
    //   1640	1645	5143	android/app/PendingIntent$CanceledException
    //   1640	1645	1444	finally
    //   1653	1663	5143	android/app/PendingIntent$CanceledException
    //   1653	1663	1444	finally
    //   1671	1677	5143	android/app/PendingIntent$CanceledException
    //   1671	1677	4237	finally
    //   1685	1699	5143	android/app/PendingIntent$CanceledException
    //   1685	1699	4212	finally
    //   1707	1713	5143	android/app/PendingIntent$CanceledException
    //   1707	1713	4212	finally
    //   1721	1733	5143	android/app/PendingIntent$CanceledException
    //   1721	1733	4212	finally
    //   1741	1750	5143	android/app/PendingIntent$CanceledException
    //   1741	1750	4212	finally
    //   1784	1793	5143	android/app/PendingIntent$CanceledException
    //   1784	1793	4188	finally
    //   1855	1891	3362	android/app/PendingIntent$CanceledException
    //   1855	1891	3346	finally
    //   1896	1925	1952	finally
    //   1930	1937	2454	finally
    //   1942	1949	1952	finally
    //   1968	1975	2454	finally
    //   1975	2106	2412	finally
    //   2114	2278	2281	finally
    //   2303	2320	2412	finally
    //   2320	2342	2404	finally
    //   2349	2365	2396	finally
    //   2369	2386	2396	finally
    //   2427	2432	2396	finally
    //   2436	2441	2396	finally
    //   2445	2448	2396	finally
    //   2478	2486	2396	finally
    //   2490	2495	2396	finally
    //   2499	2506	2396	finally
    //   2531	2543	2396	finally
    //   2547	2575	2396	finally
    //   2595	2600	2396	finally
    //   2604	2609	2396	finally
    //   2613	2616	2396	finally
    //   2620	2632	3147	finally
    //   2637	2644	2720	finally
    //   2644	2680	2701	finally
    //   2685	2698	2701	finally
    //   2728	2743	2979	finally
    //   2751	2915	2701	finally
    //   2922	2937	2979	finally
    //   2953	2974	2979	finally
    //   3002	3012	2979	finally
    //   3016	3025	2979	finally
    //   3031	3039	2979	finally
    //   3042	3050	2979	finally
    //   3076	3086	2979	finally
    //   3089	3112	3122	finally
    //   3134	3147	3122	finally
    //   3169	3177	3246	android/app/PendingIntent$CanceledException
    //   3169	3177	3219	finally
    //   3188	3193	3246	android/app/PendingIntent$CanceledException
    //   3188	3193	3219	finally
    //   3262	3267	3246	android/app/PendingIntent$CanceledException
    //   3262	3267	3219	finally
    //   3278	3283	3246	android/app/PendingIntent$CanceledException
    //   3278	3283	3219	finally
    //   3294	3297	3246	android/app/PendingIntent$CanceledException
    //   3294	3297	3219	finally
    //   3311	3316	3246	android/app/PendingIntent$CanceledException
    //   3311	3316	3219	finally
    //   3327	3332	3246	android/app/PendingIntent$CanceledException
    //   3327	3332	3219	finally
    //   3343	3346	3246	android/app/PendingIntent$CanceledException
    //   3343	3346	3219	finally
    //   3399	3404	4019	android/app/PendingIntent$CanceledException
    //   3399	3404	4014	finally
    //   3412	3419	4019	android/app/PendingIntent$CanceledException
    //   3412	3419	4014	finally
    //   3438	3444	4019	android/app/PendingIntent$CanceledException
    //   3438	3444	4142	finally
    //   3452	3466	4019	android/app/PendingIntent$CanceledException
    //   3452	3466	4014	finally
    //   3474	3487	4019	android/app/PendingIntent$CanceledException
    //   3474	3487	4014	finally
    //   3495	3501	4019	android/app/PendingIntent$CanceledException
    //   3495	3501	4014	finally
    //   3532	3545	4019	android/app/PendingIntent$CanceledException
    //   3532	3545	4014	finally
    //   3553	3560	4019	android/app/PendingIntent$CanceledException
    //   3553	3560	4014	finally
    //   3568	3573	4019	android/app/PendingIntent$CanceledException
    //   3568	3573	4014	finally
    //   3581	3596	4019	android/app/PendingIntent$CanceledException
    //   3581	3596	4014	finally
    //   3604	3612	4019	android/app/PendingIntent$CanceledException
    //   3604	3612	4014	finally
    //   3620	3627	4019	android/app/PendingIntent$CanceledException
    //   3620	3627	4014	finally
    //   3627	3849	3995	android/app/PendingIntent$CanceledException
    //   3627	3849	3987	finally
    //   3849	3903	3995	android/app/PendingIntent$CanceledException
    //   3849	3903	3987	finally
    //   3903	3934	5154	finally
    //   3934	3955	3979	finally
    //   3955	3971	3974	finally
    //   4040	4045	5159	android/app/PendingIntent$CanceledException
    //   4040	4045	4069	finally
    //   4053	4058	5159	android/app/PendingIntent$CanceledException
    //   4053	4058	4069	finally
    //   4066	4069	5159	android/app/PendingIntent$CanceledException
    //   4066	4069	4069	finally
    //   4094	4102	5159	android/app/PendingIntent$CanceledException
    //   4094	4102	4069	finally
    //   4110	4115	5159	android/app/PendingIntent$CanceledException
    //   4110	4115	4069	finally
    //   4123	4128	5159	android/app/PendingIntent$CanceledException
    //   4123	4128	4069	finally
    //   4159	4164	5159	android/app/PendingIntent$CanceledException
    //   4159	4164	4069	finally
    //   4172	4177	5159	android/app/PendingIntent$CanceledException
    //   4172	4177	4069	finally
    //   4185	4188	5159	android/app/PendingIntent$CanceledException
    //   4185	4188	4069	finally
    //   4255	4260	5159	android/app/PendingIntent$CanceledException
    //   4255	4260	4276	finally
    //   4264	4269	5159	android/app/PendingIntent$CanceledException
    //   4264	4269	4276	finally
    //   4273	4276	5159	android/app/PendingIntent$CanceledException
    //   4273	4276	4276	finally
    //   4288	4293	4372	finally
    //   4379	4384	4372	finally
    //   4554	4562	4565	java/io/IOException
    //   4731	4741	4744	java/lang/OutOfMemoryError
    //   4796	4802	5164	java/lang/InterruptedException
    //   5022	5053	5061	finally
    //   5116	5119	5122	java/lang/Exception
  }
  
  public final void x() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z : Ljava/lang/String;
    //   4: aload_0
    //   5: getfield c : Ljava/lang/String;
    //   8: if_acmpne -> 45
    //   11: aload_0
    //   12: getfield a0 : I
    //   15: aload_0
    //   16: getfield a : I
    //   19: if_icmpne -> 45
    //   22: aload_0
    //   23: getfield b0 : I
    //   26: aload_0
    //   27: getfield b : I
    //   30: if_icmpne -> 45
    //   33: aload_0
    //   34: getfield c0 : J
    //   37: lconst_0
    //   38: lcmp
    //   39: ifeq -> 45
    //   42: goto -> 277
    //   45: invokestatic currentTimeMillis : ()J
    //   48: lstore_1
    //   49: lload_1
    //   50: aload_0
    //   51: getfield c0 : J
    //   54: lsub
    //   55: ldc2_w 300
    //   58: lcmp
    //   59: ifle -> 277
    //   62: aload_0
    //   63: lload_1
    //   64: putfield c0 : J
    //   67: aload_0
    //   68: aload_0
    //   69: getfield b : I
    //   72: putfield b0 : I
    //   75: aload_0
    //   76: aload_0
    //   77: getfield a : I
    //   80: putfield a0 : I
    //   83: aload_0
    //   84: aload_0
    //   85: getfield c : Ljava/lang/String;
    //   88: putfield Z : Ljava/lang/String;
    //   91: getstatic in/krosbits/musicolet/DbCleanActivity.l0 : Lin/krosbits/musicolet/DbCleanActivity;
    //   94: astore #4
    //   96: aload #4
    //   98: ifnull -> 106
    //   101: aload #4
    //   103: invokevirtual m0 : ()V
    //   106: invokestatic b : ()V
    //   109: aload_0
    //   110: getfield L : Landroid/content/Intent;
    //   113: ifnull -> 230
    //   116: aload_0
    //   117: invokevirtual e : ()Landroid/app/Notification;
    //   120: astore #4
    //   122: getstatic in/krosbits/musicolet/LibDBUpdaterService.c : Lin/krosbits/musicolet/LibDBUpdaterService;
    //   125: astore #5
    //   127: aload #5
    //   129: ifnull -> 190
    //   132: aload #5
    //   134: getfield b : Z
    //   137: istore_3
    //   138: iload_3
    //   139: ifne -> 190
    //   142: aload #4
    //   144: ifnull -> 176
    //   147: aload #5
    //   149: sipush #140
    //   152: aload #4
    //   154: invokestatic U : (Landroid/app/Service;ILandroid/app/Notification;)V
    //   157: goto -> 230
    //   160: astore #4
    //   162: aload #4
    //   164: invokevirtual printStackTrace : ()V
    //   167: aload #5
    //   169: iconst_2
    //   170: invokevirtual stopForeground : (I)V
    //   173: goto -> 230
    //   176: aload #5
    //   178: iconst_1
    //   179: invokevirtual stopForeground : (Z)V
    //   182: aload #5
    //   184: invokevirtual stopSelf : ()V
    //   187: goto -> 230
    //   190: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   193: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   196: astore #6
    //   198: new z21
    //   201: astore #5
    //   203: aload #5
    //   205: aload #6
    //   207: invokespecial <init> : (Landroid/content/Context;)V
    //   210: aload #5
    //   212: sipush #140
    //   215: aload #4
    //   217: invokevirtual c : (ILandroid/app/Notification;)V
    //   220: goto -> 230
    //   223: astore #4
    //   225: aload #4
    //   227: invokevirtual printStackTrace : ()V
    //   230: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   233: ifnull -> 277
    //   236: getstatic im0.g0 : Lim0;
    //   239: ifnull -> 277
    //   242: getstatic in/krosbits/musicolet/MyApplication.w : I
    //   245: iconst_4
    //   246: if_icmpeq -> 277
    //   249: getstatic in/krosbits/musicolet/MusicActivity.R0 : Lin/krosbits/musicolet/MusicActivity;
    //   252: astore #5
    //   254: aload #5
    //   256: getfield o0 : Landroid/os/Handler;
    //   259: astore #4
    //   261: aload #4
    //   263: ifnull -> 277
    //   266: aload #4
    //   268: aload #5
    //   270: getfield I0 : Le3;
    //   273: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   276: pop
    //   277: return
    // Exception table:
    //   from	to	target	type
    //   122	127	223	finally
    //   132	138	223	finally
    //   147	157	160	finally
    //   162	173	223	finally
    //   176	187	223	finally
    //   190	220	223	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\im0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */