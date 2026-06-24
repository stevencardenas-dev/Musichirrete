import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;

public final class gf1 {
  public final Context a;
  
  public final ee0 b;
  
  public final Handler c;
  
  public final PackageManager d;
  
  public final ArrayList e = new ArrayList();
  
  public boolean f;
  
  public boolean g;
  
  public final q6 h = new q6(7, this);
  
  public final e3 i = new e3(28, this);
  
  public gf1(Context paramContext, ee0 paramee0) {
    this.a = paramContext;
    this.b = paramee0;
    this.c = new Handler();
    this.d = paramContext.getPackageManager();
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Z
    //   4: ifne -> 10
    //   7: goto -> 729
    //   10: new java/util/ArrayList
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore #6
    //   19: getstatic android/os/Build$VERSION.SDK_INT : I
    //   22: istore_1
    //   23: aload_0
    //   24: getfield a : Landroid/content/Context;
    //   27: astore #7
    //   29: aload_0
    //   30: getfield d : Landroid/content/pm/PackageManager;
    //   33: astore #8
    //   35: iload_1
    //   36: bipush #30
    //   38: if_icmplt -> 138
    //   41: new android/content/Intent
    //   44: dup
    //   45: ldc 'android.media.MediaRoute2ProviderService'
    //   47: invokespecial <init> : (Ljava/lang/String;)V
    //   50: astore #9
    //   52: new java/util/ArrayList
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: astore #6
    //   61: aload #8
    //   63: aload #9
    //   65: iconst_0
    //   66: invokevirtual queryIntentServices : (Landroid/content/Intent;I)Ljava/util/List;
    //   69: invokeinterface iterator : ()Ljava/util/Iterator;
    //   74: astore #10
    //   76: aload #10
    //   78: invokeinterface hasNext : ()Z
    //   83: ifeq -> 138
    //   86: aload #10
    //   88: invokeinterface next : ()Ljava/lang/Object;
    //   93: checkcast android/content/pm/ResolveInfo
    //   96: getfield serviceInfo : Landroid/content/pm/ServiceInfo;
    //   99: astore #9
    //   101: aload_0
    //   102: getfield f : Z
    //   105: ifeq -> 127
    //   108: aload #7
    //   110: invokevirtual getPackageName : ()Ljava/lang/String;
    //   113: aload #9
    //   115: getfield packageName : Ljava/lang/String;
    //   118: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   121: ifne -> 127
    //   124: goto -> 76
    //   127: aload #6
    //   129: aload #9
    //   131: invokevirtual add : (Ljava/lang/Object;)Z
    //   134: pop
    //   135: goto -> 76
    //   138: aload #8
    //   140: new android/content/Intent
    //   143: dup
    //   144: ldc 'android.media.MediaRouteProviderService'
    //   146: invokespecial <init> : (Ljava/lang/String;)V
    //   149: iconst_0
    //   150: invokevirtual queryIntentServices : (Landroid/content/Intent;I)Ljava/util/List;
    //   153: invokeinterface iterator : ()Ljava/util/Iterator;
    //   158: astore #10
    //   160: iconst_0
    //   161: istore_2
    //   162: aload #10
    //   164: invokeinterface hasNext : ()Z
    //   169: istore #5
    //   171: aload_0
    //   172: getfield b : Lee0;
    //   175: astore #9
    //   177: aload_0
    //   178: getfield e : Ljava/util/ArrayList;
    //   181: astore #8
    //   183: iload #5
    //   185: ifeq -> 590
    //   188: aload #10
    //   190: invokeinterface next : ()Ljava/lang/Object;
    //   195: checkcast android/content/pm/ResolveInfo
    //   198: getfield serviceInfo : Landroid/content/pm/ServiceInfo;
    //   201: astore #11
    //   203: aload #11
    //   205: ifnonnull -> 211
    //   208: goto -> 162
    //   211: getstatic iv0.c : Lee0;
    //   214: ifnonnull -> 223
    //   217: iconst_0
    //   218: istore #5
    //   220: goto -> 231
    //   223: invokestatic c : ()Lee0;
    //   226: invokevirtual h : ()Z
    //   229: istore #5
    //   231: iload #5
    //   233: ifeq -> 322
    //   236: aload #6
    //   238: invokeinterface isEmpty : ()Z
    //   243: ifeq -> 249
    //   246: goto -> 322
    //   249: aload #6
    //   251: invokevirtual size : ()I
    //   254: istore #4
    //   256: iconst_0
    //   257: istore_1
    //   258: iload_1
    //   259: iload #4
    //   261: if_icmpge -> 322
    //   264: aload #6
    //   266: iload_1
    //   267: invokevirtual get : (I)Ljava/lang/Object;
    //   270: astore #12
    //   272: iload_1
    //   273: iconst_1
    //   274: iadd
    //   275: istore_3
    //   276: aload #12
    //   278: checkcast android/content/pm/ServiceInfo
    //   281: astore #12
    //   283: iload_3
    //   284: istore_1
    //   285: aload #11
    //   287: getfield packageName : Ljava/lang/String;
    //   290: aload #12
    //   292: getfield packageName : Ljava/lang/String;
    //   295: invokevirtual equals : (Ljava/lang/Object;)Z
    //   298: ifeq -> 258
    //   301: iload_3
    //   302: istore_1
    //   303: aload #11
    //   305: getfield name : Ljava/lang/String;
    //   308: aload #12
    //   310: getfield name : Ljava/lang/String;
    //   313: invokevirtual equals : (Ljava/lang/Object;)Z
    //   316: ifeq -> 258
    //   319: goto -> 162
    //   322: aload #11
    //   324: getfield packageName : Ljava/lang/String;
    //   327: astore #12
    //   329: aload #11
    //   331: getfield name : Ljava/lang/String;
    //   334: astore #14
    //   336: aload #8
    //   338: invokevirtual size : ()I
    //   341: istore_3
    //   342: iconst_0
    //   343: istore_1
    //   344: iload_1
    //   345: iload_3
    //   346: if_icmpge -> 398
    //   349: aload #8
    //   351: iload_1
    //   352: invokevirtual get : (I)Ljava/lang/Object;
    //   355: checkcast ff1
    //   358: getfield k : Landroid/content/ComponentName;
    //   361: astore #13
    //   363: aload #13
    //   365: invokevirtual getPackageName : ()Ljava/lang/String;
    //   368: aload #12
    //   370: invokevirtual equals : (Ljava/lang/Object;)Z
    //   373: ifeq -> 392
    //   376: aload #13
    //   378: invokevirtual getClassName : ()Ljava/lang/String;
    //   381: aload #14
    //   383: invokevirtual equals : (Ljava/lang/Object;)Z
    //   386: ifeq -> 392
    //   389: goto -> 400
    //   392: iinc #1, 1
    //   395: goto -> 344
    //   398: iconst_m1
    //   399: istore_1
    //   400: iload_1
    //   401: ifge -> 491
    //   404: new ff1
    //   407: dup
    //   408: aload #7
    //   410: new android/content/ComponentName
    //   413: dup
    //   414: aload #11
    //   416: getfield packageName : Ljava/lang/String;
    //   419: aload #11
    //   421: getfield name : Ljava/lang/String;
    //   424: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   427: invokespecial <init> : (Landroid/content/Context;Landroid/content/ComponentName;)V
    //   430: astore #11
    //   432: aload #11
    //   434: new f
    //   437: dup
    //   438: aload_0
    //   439: aload #11
    //   441: invokespecial <init> : (Lgf1;Lff1;)V
    //   444: putfield r : Lf;
    //   447: aload #11
    //   449: getfield n : Z
    //   452: ifne -> 466
    //   455: aload #11
    //   457: iconst_1
    //   458: putfield n : Z
    //   461: aload #11
    //   463: invokevirtual l : ()V
    //   466: iload_2
    //   467: iconst_1
    //   468: iadd
    //   469: istore_1
    //   470: aload #8
    //   472: iload_2
    //   473: aload #11
    //   475: invokevirtual add : (ILjava/lang/Object;)V
    //   478: aload #9
    //   480: aload #11
    //   482: iconst_0
    //   483: invokevirtual a : (Lzu0;Z)V
    //   486: iload_1
    //   487: istore_2
    //   488: goto -> 162
    //   491: iload_1
    //   492: iload_2
    //   493: if_icmplt -> 162
    //   496: aload #8
    //   498: iload_1
    //   499: invokevirtual get : (I)Ljava/lang/Object;
    //   502: checkcast ff1
    //   505: astore #9
    //   507: aload #9
    //   509: getfield n : Z
    //   512: ifne -> 526
    //   515: aload #9
    //   517: iconst_1
    //   518: putfield n : Z
    //   521: aload #9
    //   523: invokevirtual l : ()V
    //   526: aload #9
    //   528: getfield p : Laf1;
    //   531: ifnonnull -> 574
    //   534: aload #9
    //   536: getfield n : Z
    //   539: ifeq -> 574
    //   542: aload #9
    //   544: getfield g : Ltu0;
    //   547: ifnull -> 553
    //   550: goto -> 564
    //   553: aload #9
    //   555: getfield m : Ljava/util/ArrayList;
    //   558: invokevirtual isEmpty : ()Z
    //   561: ifne -> 574
    //   564: aload #9
    //   566: invokevirtual k : ()V
    //   569: aload #9
    //   571: invokevirtual h : ()V
    //   574: iload_2
    //   575: iconst_1
    //   576: iadd
    //   577: istore_3
    //   578: aload #8
    //   580: iload_1
    //   581: iload_2
    //   582: invokestatic swap : (Ljava/util/List;II)V
    //   585: iload_3
    //   586: istore_1
    //   587: goto -> 486
    //   590: iload_2
    //   591: aload #8
    //   593: invokevirtual size : ()I
    //   596: if_icmpge -> 729
    //   599: aload #8
    //   601: invokevirtual size : ()I
    //   604: iconst_1
    //   605: isub
    //   606: istore_1
    //   607: iload_1
    //   608: iload_2
    //   609: if_icmplt -> 729
    //   612: aload #8
    //   614: iload_1
    //   615: invokevirtual get : (I)Ljava/lang/Object;
    //   618: checkcast ff1
    //   621: astore #7
    //   623: aload #9
    //   625: aload #7
    //   627: invokevirtual d : (Lzu0;)Lgv0;
    //   630: astore #6
    //   632: aload #6
    //   634: ifnull -> 690
    //   637: aload #7
    //   639: invokevirtual getClass : ()Ljava/lang/Class;
    //   642: pop
    //   643: invokestatic b : ()V
    //   646: aload #7
    //   648: aconst_null
    //   649: putfield f : Lae0;
    //   652: aload #7
    //   654: aconst_null
    //   655: invokevirtual g : (Ltu0;)V
    //   658: aload #9
    //   660: aload #6
    //   662: aconst_null
    //   663: invokevirtual o : (Lgv0;Lav0;)V
    //   666: aload #9
    //   668: getfield a : Lbe0;
    //   671: sipush #514
    //   674: aload #6
    //   676: invokevirtual b : (ILjava/lang/Object;)V
    //   679: aload #9
    //   681: getfield m : Ljava/util/ArrayList;
    //   684: aload #6
    //   686: invokevirtual remove : (Ljava/lang/Object;)Z
    //   689: pop
    //   690: aload #8
    //   692: aload #7
    //   694: invokevirtual remove : (Ljava/lang/Object;)Z
    //   697: pop
    //   698: aload #7
    //   700: aconst_null
    //   701: putfield r : Lf;
    //   704: aload #7
    //   706: getfield n : Z
    //   709: ifeq -> 723
    //   712: aload #7
    //   714: iconst_0
    //   715: putfield n : Z
    //   718: aload #7
    //   720: invokevirtual l : ()V
    //   723: iinc #1, -1
    //   726: goto -> 607
    //   729: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */