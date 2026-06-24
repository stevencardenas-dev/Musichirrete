package in.krosbits.musicolet;

import a80;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import km0;
import m92;
import ms0;
import pc;
import qy;
import rs0;
import ss0;
import vi2;
import z70;

public class FileUtilsActivity extends pc implements rs0 {
  public static km0[] U;
  
  public static boolean V;
  
  public ss0 R;
  
  public ss0 S;
  
  public PowerManager.WakeLock T;
  
  public static void l0(FileUtilsActivity paramFileUtilsActivity, String paramString1, String paramString2) {
    // Byte code:
    //   0: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   3: getfield c : Llm0;
    //   6: getstatic in/krosbits/musicolet/MusicService.V0 : Lwo;
    //   9: invokevirtual b : (Lwo;)Lkm0;
    //   12: astore #10
    //   14: iconst_0
    //   15: istore #7
    //   17: iconst_0
    //   18: istore #4
    //   20: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   23: astore #11
    //   25: aload #11
    //   27: ifnonnull -> 39
    //   30: aload_0
    //   31: invokevirtual finish : ()V
    //   34: return
    //   35: astore_1
    //   36: goto -> 578
    //   39: new q01
    //   42: astore #11
    //   44: aload #11
    //   46: iconst_0
    //   47: invokespecial <init> : (I)V
    //   50: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   53: aload_1
    //   54: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   57: astore #17
    //   59: aload #17
    //   61: aload_2
    //   62: invokevirtual x : (Ljava/lang/String;)Lv00;
    //   65: astore #12
    //   67: aload #12
    //   69: invokevirtual k : ()Z
    //   72: istore #9
    //   74: iconst_1
    //   75: istore #8
    //   77: iload #9
    //   79: ifeq -> 110
    //   82: iconst_0
    //   83: aload_0
    //   84: ldc 2131886601
    //   86: iconst_1
    //   87: anewarray java/lang/Object
    //   90: dup
    //   91: iconst_0
    //   92: aload #12
    //   94: invokevirtual h : ()Ljava/lang/String;
    //   97: aastore
    //   98: invokevirtual getString : (I[Ljava/lang/Object;)Ljava/lang/String;
    //   101: iconst_1
    //   102: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   105: aload_0
    //   106: invokevirtual finish : ()V
    //   109: return
    //   110: invokestatic y : ()Lkm0;
    //   113: astore #13
    //   115: aload #13
    //   117: ifnull -> 184
    //   120: aload #13
    //   122: invokevirtual d : ()Lv00;
    //   125: getfield b : Ld61;
    //   128: invokevirtual toString : ()Ljava/lang/String;
    //   131: astore #13
    //   133: new java/lang/StringBuilder
    //   136: astore #14
    //   138: aload #14
    //   140: invokespecial <init> : ()V
    //   143: aload #14
    //   145: aload_1
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: aload #14
    //   152: getstatic org/jaudiotagger/audio/opus/bsQ/uvJYmft.ichysINCotlwZRv : Ljava/lang/String;
    //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: aload #13
    //   161: aload #14
    //   163: invokevirtual toString : ()Ljava/lang/String;
    //   166: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   169: ifeq -> 184
    //   172: invokestatic o0 : ()Z
    //   175: istore #9
    //   177: iload #9
    //   179: istore #7
    //   181: goto -> 187
    //   184: iconst_0
    //   185: istore #7
    //   187: aload_0
    //   188: aload_0
    //   189: ldc 2131887180
    //   191: invokevirtual getString : (I)Ljava/lang/String;
    //   194: iconst_m1
    //   195: iconst_m1
    //   196: aload_0
    //   197: ldc 2131887181
    //   199: invokevirtual getString : (I)Ljava/lang/String;
    //   202: invokevirtual m0 : (Ljava/lang/String;IILjava/lang/String;)V
    //   205: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   208: getfield c : Llm0;
    //   211: aload_1
    //   212: invokevirtual n : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   215: astore #15
    //   217: new java/util/HashMap
    //   220: astore #13
    //   222: aload #13
    //   224: aload #15
    //   226: invokevirtual size : ()I
    //   229: invokespecial <init> : (I)V
    //   232: new java/util/HashMap
    //   235: astore #14
    //   237: aload #14
    //   239: aload #15
    //   241: invokevirtual size : ()I
    //   244: invokespecial <init> : (I)V
    //   247: new java/util/ArrayList
    //   250: astore #16
    //   252: aload #16
    //   254: aload #15
    //   256: invokevirtual size : ()I
    //   259: invokespecial <init> : (I)V
    //   262: getstatic in/krosbits/musicolet/FileUtilsActivity.V : Z
    //   265: ifeq -> 319
    //   268: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   271: aload #17
    //   273: invokevirtual l : (Lv00;)Lv00;
    //   276: astore #17
    //   278: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   281: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   284: pop
    //   285: aload #17
    //   287: aload_2
    //   288: invokevirtual o : (Ljava/lang/String;)Z
    //   291: ifeq -> 299
    //   294: iconst_1
    //   295: istore_3
    //   296: goto -> 321
    //   299: aload #17
    //   301: aload_2
    //   302: invokevirtual x : (Ljava/lang/String;)Lv00;
    //   305: invokevirtual k : ()Z
    //   308: pop
    //   309: goto -> 319
    //   312: goto -> 578
    //   315: astore_1
    //   316: goto -> 312
    //   319: iconst_0
    //   320: istore_3
    //   321: aload #15
    //   323: invokevirtual size : ()I
    //   326: istore #6
    //   328: iconst_0
    //   329: istore #5
    //   331: iload #5
    //   333: iload #6
    //   335: if_icmpge -> 476
    //   338: aload #15
    //   340: iload #5
    //   342: invokevirtual get : (I)Ljava/lang/Object;
    //   345: astore_2
    //   346: iinc #5, 1
    //   349: aload_2
    //   350: checkcast km0
    //   353: astore #17
    //   355: aload #17
    //   357: getfield c : Lqn1;
    //   360: getfield f : Lwo;
    //   363: astore_2
    //   364: aload #17
    //   366: invokevirtual d : ()Lv00;
    //   369: astore #17
    //   371: aload #12
    //   373: aload #17
    //   375: getfield b : Ld61;
    //   378: invokevirtual toString : ()Ljava/lang/String;
    //   381: aload_1
    //   382: invokevirtual length : ()I
    //   385: iconst_1
    //   386: iadd
    //   387: invokevirtual substring : (I)Ljava/lang/String;
    //   390: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   393: astore #18
    //   395: new wo
    //   398: astore #19
    //   400: aload #19
    //   402: aload #18
    //   404: invokevirtual j : ()Landroid/net/Uri;
    //   407: invokevirtual toString : ()Ljava/lang/String;
    //   410: aload #11
    //   412: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   415: iload_3
    //   416: ifne -> 435
    //   419: aload #17
    //   421: invokevirtual f : ()Z
    //   424: ifne -> 473
    //   427: aload #18
    //   429: invokevirtual f : ()Z
    //   432: ifeq -> 473
    //   435: aload #13
    //   437: aload_2
    //   438: aload #19
    //   440: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   443: pop
    //   444: aload #14
    //   446: aload_2
    //   447: aload #18
    //   449: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   452: pop
    //   453: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   456: aload #18
    //   458: invokevirtual g : (Lv00;)Ljava/lang/String;
    //   461: astore_2
    //   462: aload_2
    //   463: ifnull -> 473
    //   466: aload #16
    //   468: aload_2
    //   469: invokevirtual add : (Ljava/lang/Object;)Z
    //   472: pop
    //   473: goto -> 331
    //   476: aload #13
    //   478: invokevirtual isEmpty : ()Z
    //   481: ifne -> 544
    //   484: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   487: aload #14
    //   489: invokevirtual x : (Ljava/util/HashMap;)V
    //   492: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   495: invokevirtual o : ()V
    //   498: invokestatic b : ()V
    //   501: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   504: getfield c : Llm0;
    //   507: aload #13
    //   509: putfield w : Ljava/util/HashMap;
    //   512: invokestatic r : ()V
    //   515: iload #4
    //   517: invokestatic q0 : (Z)V
    //   520: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   523: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   526: aload #16
    //   528: iload #4
    //   530: anewarray java/lang/String
    //   533: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   536: checkcast [Ljava/lang/String;
    //   539: aconst_null
    //   540: aconst_null
    //   541: invokestatic scanFile : (Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V
    //   544: iload_3
    //   545: ifeq -> 559
    //   548: aload_0
    //   549: ldc_w 2131886598
    //   552: invokevirtual getString : (I)Ljava/lang/String;
    //   555: astore_1
    //   556: goto -> 567
    //   559: aload_0
    //   560: ldc_w 2131886550
    //   563: invokevirtual getString : (I)Ljava/lang/String;
    //   566: astore_1
    //   567: aload_0
    //   568: aload #10
    //   570: iload #7
    //   572: aload_1
    //   573: invokevirtual n0 : (Lkm0;ZLjava/lang/String;)V
    //   576: return
    //   577: astore_1
    //   578: aload_1
    //   579: invokevirtual printStackTrace : ()V
    //   582: aload_0
    //   583: aload #10
    //   585: iload #7
    //   587: aload_0
    //   588: ldc_w 2131886550
    //   591: invokevirtual getString : (I)Ljava/lang/String;
    //   594: invokevirtual n0 : (Lkm0;ZLjava/lang/String;)V
    //   597: return
    // Exception table:
    //   from	to	target	type
    //   20	25	577	finally
    //   30	34	35	finally
    //   39	74	577	finally
    //   82	109	35	finally
    //   110	115	577	finally
    //   120	177	35	finally
    //   187	294	315	finally
    //   299	309	315	finally
    //   321	328	315	finally
    //   338	346	315	finally
    //   349	415	315	finally
    //   419	435	315	finally
    //   435	462	315	finally
    //   466	473	315	finally
    //   476	544	315	finally
    //   548	556	315	finally
    //   559	567	315	finally
    //   567	576	315	finally
  }
  
  public final void Q(ss0 paramss0, qy paramqy) {
    if (paramqy == qy.e) {
      if (V) {
        ms0 ms0 = new ms0((Context)this);
        ms0.J = false;
        ms0.K = false;
        ms0.c(2131886279);
        ms0.o(0, true);
        m92.T(ms0);
        this.S = ms0.p();
      } 
      V = false;
    } 
  }
  
  public final void m0(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    if (V)
      runOnUiThread((Runnable)new z70(this, paramInt1, paramInt2, paramString1, paramString2)); 
  }
  
  public final void n0(km0 paramkm0, boolean paramBoolean, String paramString) {
    runOnUiThread((Runnable)new a80(this, paramkm0, paramBoolean, paramString));
  }
  
  public final void onCreate(Bundle paramBundle) {
    m92.d(this);
    super.onCreate(paramBundle);
    (new Thread((Runnable)new vi2(this, getIntent(), 9, false))).start();
    getWindow().addFlags(128);
    PowerManager.WakeLock wakeLock = MyApplication.p().newWakeLock(1, "FUA:");
    this.T = wakeLock;
    wakeLock.setReferenceCounted(false);
    this.T.acquire();
  }
  
  public final void onDestroy() {
    V = false;
    PowerManager.WakeLock wakeLock = this.T;
    if (wakeLock != null && wakeLock.isHeld())
      this.T.release(); 
    ss0 ss01 = this.R;
    if (ss01 != null)
      ss01.dismiss(); 
    ss01 = this.S;
    if (ss01 != null)
      ss01.dismiss(); 
    this.R = null;
    this.S = null;
    this.T = null;
    super.onDestroy();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\FileUtilsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */