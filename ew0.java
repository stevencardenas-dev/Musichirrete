import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.musicolet.RemoteMediaControlReceiver;
import in.krosbits.utils.SgV.zpEN;
import java.util.ArrayList;
import java.util.Iterator;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;

public abstract class ew0 {
  public static p01 a;
  
  public static final String b = new String(Base64.decode(zpEN.atErvDau, 0));
  
  public static final l01 c = new l01(1);
  
  public static boolean d = true;
  
  public static p01 a(Context paramContext) {
    if (a == null) {
      long l;
      Bundle bundle1;
      PendingIntent pendingIntent1 = PendingIntent.getBroadcast(paramContext, 0, new Intent(paramContext, RemoteMediaControlReceiver.class), 167772160);
      p01 p014 = new p01(paramContext, pendingIntent1);
      a = p014;
      ((m01)p014.c).a.setFlags(7);
      boolean bool = MyApplication.o().getBoolean("k_b_msflcpbt", true);
      d = bool;
      ((m01)a.c).a.setRatingType(bool);
      int i = b();
      bool = MusicService.C0;
      p014 = a;
      Bundle bundle2 = c(bool, i);
      ((m01)p014.c).a.setExtras(bundle2);
      ((m01)a.c).a.setQueueTitle("Musicolet");
      ((m01)a.c).a.setMediaButtonReceiver(pendingIntent1);
      ArrayList arrayList = new ArrayList();
      if (d) {
        l = 6561791L;
      } else {
        l = 8063L;
      } 
      PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(0, -1L, 0L, 1.0F, l, 0, null, SystemClock.elapsedRealtime(), arrayList, -1L, null);
      a.p(playbackStateCompat);
      p01 p012 = a;
      PendingIntent pendingIntent2 = PendingIntent.getActivity(paramContext, 0, (new Intent(paramContext, MusicActivity.class)).addFlags(268435456), 167772160, ag0.r());
      ((m01)p012.c).a.setSessionActivity(pendingIntent2);
      p01 p013 = a;
      Handler handler = ag0.m;
      m01 m01 = (m01)p013.c;
      l01 l011 = c;
      if (l011 == null) {
        m01.b(null, null);
      } else {
        if (handler == null)
          handler = new Handler(); 
        m01.b(l011, handler);
      } 
      a.s(bool);
      a.r(i);
      p01 p011 = a;
      ((m01)p011.c).a.setActive(true);
      (new Thread(new l3(9))).start();
      Iterator iterator = ((ArrayList)p011.f).iterator();
      if (!iterator.hasNext()) {
        iv0.d(paramContext);
        iv0.k(((m01)a.c).a);
        MediaSession mediaSession = ((m01)a.c).a;
        if (mediaSession != null) {
          bundle1 = new Bundle();
          bundle1.putInt("repeat", 0);
          bundle1.putInt("shuffle", 0);
          mediaSession.sendSessionEvent(b, bundle1);
        } 
      } else {
        throw x41.g(bundle1);
      } 
    } 
    return a;
  }
  
  public static int b() {
    int i = MyApplication.u().getInt(fXMDNeMWaILNVh.JIA, 2);
    return (i == 2) ? ((MyApplication.u().getInt("RQM", 2) == 3) ? 2 : 0) : ((i == 3) ? 1 : -1);
  }
  
  public static Bundle c(int paramInt1, int paramInt2) {
    boolean bool1;
    Bundle bundle1 = new Bundle();
    boolean bool2 = true;
    bundle1.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
    bundle1.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
    bundle1.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
    if (paramInt2 == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    bundle1.putInt("com.sec.android.app.music.EXTRA_REPEAT", bool1);
    if (paramInt1 == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    bundle1.putInt("com.sec.android.app.music.EXTRA_SHUFFLE", bool1);
    Bundle bundle2 = new Bundle();
    if (paramInt2 == 1) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    } 
    bundle2.putInt("repeat", paramInt2);
    if (paramInt1 == 1) {
      paramInt1 = bool2;
    } else {
      paramInt1 = 0;
    } 
    bundle2.putInt("shuffle", paramInt1);
    bundle1.putBundle(b, bundle2);
    return bundle1;
  }
  
  public static void d(MusicService paramMusicService, String paramString) {
    if (paramMusicService.w && paramString != null) {
      Context context = paramMusicService.getApplicationContext();
      try {
        ArrayList arrayList3;
        q3 q3;
        k90 k90;
        b81 b81;
        ArrayList arrayList2;
        String str1;
        ArrayList arrayList1;
        if (paramString.equals("musicolet.media.r.2")) {
          arrayList3 = MyApplication.j.c.i(new int[0]);
          z51.E(-1, arrayList3);
          return;
        } 
        boolean bool = arrayList3.startsWith("musicolet.media.r.3.s_");
        if (bool) {
          int k = Integer.parseInt(arrayList3.substring(22));
          int j = MyApplication.o().getInt("I_K_SRTBYF_PL", 0);
          return;
        } 
        bool = arrayList3.startsWith("musicolet.media.r.4.s_");
        int i = 12;
        String str2 = "I_K_SRTBYF_AL";
        if (bool) {
          String[] arrayOfString = arrayList3.substring(22).split("_");
          i = Integer.parseInt(arrayOfString[0]);
          int j = Integer.parseInt(arrayOfString[1]);
          q3 = MyApplication.j.c.e().get(i);
          return;
        } 
        bool = q3.startsWith("musicolet.media.r.5.s_");
        if (bool) {
          String[] arrayOfString = q3.substring(22).split("_");
          int k = Integer.parseInt(arrayOfString[0]);
          int j = Integer.parseInt(arrayOfString[1]);
          q3 = MyApplication.j.c.f().get(k);
          bool = MyApplication.o().getBoolean("k_b_arsubcme", true);
          if (!bool)
            i = 4; 
          if (!bool)
            str2 = "I_K_SRTBYF_AR"; 
          return;
        } 
        if (q3.startsWith("musicolet.media.r.9.s_")) {
          String[] arrayOfString = q3.substring(22).split("_");
          int k = Integer.parseInt(arrayOfString[0]);
          int j = Integer.parseInt(arrayOfString[1]);
          q3 = MyApplication.j.c.d().get(k);
          bool = MyApplication.o().getBoolean("k_b_arsubcme", true);
          if (!bool)
            i = 4; 
          if (!bool)
            str2 = "I_K_SRTBYF_AR"; 
          return;
        } 
        if (q3.startsWith("musicolet.media.r.8.s_")) {
          String[] arrayOfString = q3.substring(22).split("_");
          int k = Integer.parseInt(arrayOfString[0]);
          int j = Integer.parseInt(arrayOfString[1]);
          q3 = MyApplication.j.c.g().get(k);
          bool = MyApplication.o().getBoolean("k_b_arsubcme", true);
          if (!bool)
            i = 4; 
          if (!bool)
            str2 = "I_K_SRTBYF_AR"; 
          return;
        } 
        if (q3.startsWith("musicolet.media.r.6.s_")) {
          String[] arrayOfString = q3.substring(22).split("_");
          i = Integer.parseInt(arrayOfString[0]);
          int j = Integer.parseInt(arrayOfString[1]);
          q3 = MyApplication.j.c.h().get(i);
          return;
        } 
        bool = q3.startsWith("musicolet.media.r.10.s_");
        if (bool) {
          String[] arrayOfString = q3.substring(23).split("_");
          int j = Integer.parseInt(arrayOfString[0]);
          i = Integer.parseInt(arrayOfString[1]);
          k90 = ((ArrayList<k90>)MyApplication.j.c.q.clone()).get(j);
          return;
        } 
        if (k90.startsWith("musicolet.media.r.11.s_")) {
          String[] arrayOfString = k90.substring(23).split("_");
          int j = Integer.parseInt(arrayOfString[0]);
          i = Integer.parseInt(arrayOfString[1]);
          str2 = c81.g(MyApplication.i.getApplicationContext()).get(j);
          b81 = c81.f(MyApplication.i.getApplicationContext(), str2);
          ArrayList arrayList = c81.d(b81.c);
          j = c81.e(str2);
          if (j != -1)
            z51.R(j, arrayList); 
          return;
        } 
        if (b81.startsWith("musicolet.media.r.12.s_")) {
          i = Integer.parseInt(b81.substring(23));
          b81 = c81.a;
          arrayList2 = c81.d((c81.c(MyApplication.i.getApplicationContext())).c);
          z51.R(MyApplication.o().getInt("I_K_SRTBYF_PL", 0), arrayList2);
          return;
        } 
        if (arrayList2.startsWith("musicolet.media.r.13_pa_")) {
          str1 = arrayList2.substring(24);
          ml0 ml0 = MyApplication.F.c(str1);
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(ml0.b(ml0.b));
          stringBuilder.append(PwbbJfsdcHrAjW.YzPIOJHehU);
          String str = stringBuilder.toString();
          return;
        } 
        if (str1.startsWith("musicolet.media.r.13_ps_")) {
          str2 = str1.substring(24);
          i = str2.lastIndexOf('_');
          str1 = str2.substring(0, i);
          i = Integer.parseInt(str2.substring(i + 1));
          ml0 ml0 = MyApplication.F.c(str1);
          arrayList1 = MyApplication.j.c.m(str1);
          z51.R(MyApplication.o().getInt("I_K_SRTBYF_F", 30), arrayList1);
          return;
        } 
      } finally {
        paramMusicService = null;
      } 
    } 
  }
  
  public static void e(MusicService paramMusicService, String paramString, Bundle paramBundle) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: ldc_w 'VSrc: '
    //   7: invokespecial <init> : (Ljava/lang/String;)V
    //   10: astore #6
    //   12: aload #6
    //   14: aload_1
    //   15: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: pop
    //   19: aload #6
    //   21: ldc_w ', extr='
    //   24: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: aload #6
    //   30: aload_2
    //   31: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload #6
    //   37: invokevirtual toString : ()Ljava/lang/String;
    //   40: invokestatic F : (Ljava/lang/String;)V
    //   43: aload_1
    //   44: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   47: ifeq -> 82
    //   50: invokestatic d : ()V
    //   53: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   56: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   59: new android/content/Intent
    //   62: dup
    //   63: aload_0
    //   64: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   67: ldc in/krosbits/musicolet/MusicService
    //   69: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   72: ldc_w 'musicolet.media.r.1'
    //   75: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   78: invokestatic n0 : (Landroid/content/Context;Landroid/content/Intent;)V
    //   81: return
    //   82: aload_2
    //   83: ldc_w 'android.intent.extra.focus'
    //   86: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   89: astore #6
    //   91: aload #6
    //   93: ldc_w 'vnd.android.cursor.item/artist'
    //   96: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   99: ifeq -> 113
    //   102: iconst_1
    //   103: istore_3
    //   104: iconst_0
    //   105: istore #4
    //   107: iconst_0
    //   108: istore #5
    //   110: goto -> 162
    //   113: aload #6
    //   115: ldc_w 'vnd.android.cursor.item/album'
    //   118: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   121: ifeq -> 135
    //   124: iconst_1
    //   125: istore #4
    //   127: iconst_0
    //   128: istore_3
    //   129: iconst_0
    //   130: istore #5
    //   132: goto -> 162
    //   135: aload #6
    //   137: ldc_w 'vnd.android.cursor.item/genre'
    //   140: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   143: ifeq -> 157
    //   146: iconst_1
    //   147: istore #5
    //   149: iconst_0
    //   150: istore_3
    //   151: iconst_0
    //   152: istore #4
    //   154: goto -> 162
    //   157: iconst_0
    //   158: istore_3
    //   159: goto -> 104
    //   162: iload_3
    //   163: ifeq -> 272
    //   166: aload_2
    //   167: ldc_w 'android.intent.extra.artist'
    //   170: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   173: astore #6
    //   175: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   178: getfield c : Llm0;
    //   181: astore_2
    //   182: aload_2
    //   183: invokevirtual getClass : ()Ljava/lang/Class;
    //   186: pop
    //   187: aload #6
    //   189: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   192: astore #6
    //   194: aload_2
    //   195: getfield i : Ljava/util/ArrayList;
    //   198: astore #7
    //   200: aload #7
    //   202: invokevirtual size : ()I
    //   205: istore #4
    //   207: iconst_0
    //   208: istore_3
    //   209: iload_3
    //   210: iload #4
    //   212: if_icmpge -> 260
    //   215: aload #7
    //   217: iload_3
    //   218: invokevirtual get : (I)Ljava/lang/Object;
    //   221: astore #8
    //   223: iinc #3, 1
    //   226: aload #8
    //   228: checkcast q3
    //   231: astore #8
    //   233: aload #8
    //   235: iconst_0
    //   236: invokevirtual k : (Z)Ljava/lang/String;
    //   239: aload #6
    //   241: invokevirtual equals : (Ljava/lang/Object;)Z
    //   244: ifeq -> 209
    //   247: aload #8
    //   249: aload_2
    //   250: iconst_0
    //   251: newarray int
    //   253: invokevirtual l : (Llm0;[I)Ljava/util/ArrayList;
    //   256: astore_2
    //   257: goto -> 501
    //   260: new java/util/ArrayList
    //   263: dup
    //   264: iconst_0
    //   265: invokespecial <init> : (I)V
    //   268: astore_2
    //   269: goto -> 501
    //   272: iload #4
    //   274: ifeq -> 388
    //   277: aload_2
    //   278: ldc_w 'android.intent.extra.album'
    //   281: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   284: astore #6
    //   286: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   289: getfield c : Llm0;
    //   292: astore_2
    //   293: aload_2
    //   294: invokevirtual getClass : ()Ljava/lang/Class;
    //   297: pop
    //   298: aload #6
    //   300: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   303: astore #6
    //   305: aload_2
    //   306: getfield g : Ljava/util/ArrayList;
    //   309: astore #7
    //   311: aload #7
    //   313: invokevirtual size : ()I
    //   316: istore #4
    //   318: iconst_0
    //   319: istore_3
    //   320: iload_3
    //   321: iload #4
    //   323: if_icmpge -> 376
    //   326: aload #7
    //   328: iload_3
    //   329: invokevirtual get : (I)Ljava/lang/Object;
    //   332: astore #8
    //   334: iinc #3, 1
    //   337: aload #8
    //   339: checkcast q3
    //   342: astore #8
    //   344: aload #8
    //   346: iconst_0
    //   347: invokevirtual k : (Z)Ljava/lang/String;
    //   350: aload #6
    //   352: invokevirtual equals : (Ljava/lang/Object;)Z
    //   355: ifeq -> 320
    //   358: aload #8
    //   360: aload_2
    //   361: iconst_1
    //   362: newarray int
    //   364: dup
    //   365: iconst_0
    //   366: bipush #12
    //   368: iastore
    //   369: invokevirtual l : (Llm0;[I)Ljava/util/ArrayList;
    //   372: astore_2
    //   373: goto -> 501
    //   376: new java/util/ArrayList
    //   379: dup
    //   380: iconst_0
    //   381: invokespecial <init> : (I)V
    //   384: astore_2
    //   385: goto -> 501
    //   388: iload #5
    //   390: ifeq -> 499
    //   393: aload_2
    //   394: ldc_w 'android.intent.extra.genre'
    //   397: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   400: astore #6
    //   402: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   405: getfield c : Llm0;
    //   408: astore_2
    //   409: aload_2
    //   410: invokevirtual getClass : ()Ljava/lang/Class;
    //   413: pop
    //   414: aload #6
    //   416: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   419: astore #6
    //   421: aload_2
    //   422: getfield m : Ljava/util/ArrayList;
    //   425: astore #7
    //   427: aload #7
    //   429: invokevirtual size : ()I
    //   432: istore #4
    //   434: iconst_0
    //   435: istore_3
    //   436: iload_3
    //   437: iload #4
    //   439: if_icmpge -> 487
    //   442: aload #7
    //   444: iload_3
    //   445: invokevirtual get : (I)Ljava/lang/Object;
    //   448: astore #8
    //   450: iinc #3, 1
    //   453: aload #8
    //   455: checkcast q3
    //   458: astore #8
    //   460: aload #8
    //   462: iconst_0
    //   463: invokevirtual k : (Z)Ljava/lang/String;
    //   466: aload #6
    //   468: invokevirtual equals : (Ljava/lang/Object;)Z
    //   471: ifeq -> 436
    //   474: aload #8
    //   476: aload_2
    //   477: iconst_0
    //   478: newarray int
    //   480: invokevirtual l : (Llm0;[I)Ljava/util/ArrayList;
    //   483: astore_2
    //   484: goto -> 501
    //   487: new java/util/ArrayList
    //   490: dup
    //   491: iconst_0
    //   492: invokespecial <init> : (I)V
    //   495: astore_2
    //   496: goto -> 501
    //   499: aconst_null
    //   500: astore_2
    //   501: aload_2
    //   502: ifnull -> 515
    //   505: aload_2
    //   506: astore #6
    //   508: aload_2
    //   509: invokevirtual isEmpty : ()Z
    //   512: ifeq -> 527
    //   515: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   518: getfield c : Llm0;
    //   521: aload_1
    //   522: invokevirtual k : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   525: astore #6
    //   527: aload #6
    //   529: invokevirtual isEmpty : ()Z
    //   532: ifne -> 550
    //   535: aload_0
    //   536: aload #6
    //   538: iconst_0
    //   539: ldc_w 'Search: '
    //   542: aload_1
    //   543: invokestatic k : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   546: iconst_1
    //   547: invokevirtual k : (Ljava/util/ArrayList;ILjava/lang/String;Z)V
    //   550: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ew0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */