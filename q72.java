import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import in.krosbits.musicolet.MyApplication;
import java.util.List;

public final class q72 {
  public static q72 k = null;
  
  public static q72 l = null;
  
  public static final Object m = new Object();
  
  public final Context a;
  
  public final ip b;
  
  public final WorkDatabase c;
  
  public final n2 d;
  
  public final List e;
  
  public final ma1 f;
  
  public final dh0 g;
  
  public boolean h;
  
  public BroadcastReceiver.PendingResult i;
  
  public final cn j;
  
  public q72(Context paramContext, ip paramip, n2 paramn2, WorkDatabase paramWorkDatabase, List paramList, ma1 paramma1, cn paramcn) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield h : Z
    //   9: aload_1
    //   10: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   13: astore #10
    //   15: aload #10
    //   17: invokevirtual isDeviceProtectedStorage : ()Z
    //   20: ifne -> 686
    //   23: new qp0
    //   26: dup
    //   27: aload_2
    //   28: getfield h : I
    //   31: invokespecial <init> : (I)V
    //   34: astore #11
    //   36: getstatic qp0.c : Ljava/lang/Object;
    //   39: astore_1
    //   40: aload_1
    //   41: monitorenter
    //   42: getstatic qp0.e : Lqp0;
    //   45: ifnonnull -> 60
    //   48: aload #11
    //   50: putstatic qp0.e : Lqp0;
    //   53: goto -> 60
    //   56: astore_2
    //   57: goto -> 682
    //   60: aload_1
    //   61: monitorexit
    //   62: aload_0
    //   63: aload #10
    //   65: putfield a : Landroid/content/Context;
    //   68: aload_0
    //   69: aload_3
    //   70: putfield d : Ln2;
    //   73: aload_0
    //   74: aload #4
    //   76: putfield c : Landroidx/work/impl/WorkDatabase;
    //   79: aload_0
    //   80: aload #6
    //   82: putfield f : Lma1;
    //   85: aload_0
    //   86: aload #7
    //   88: putfield j : Lcn;
    //   91: aload_0
    //   92: aload_2
    //   93: putfield b : Lip;
    //   96: aload_0
    //   97: aload #5
    //   99: putfield e : Ljava/util/List;
    //   102: aload_3
    //   103: getfield e : Ljava/lang/Object;
    //   106: checkcast rs
    //   109: astore_1
    //   110: aload_1
    //   111: invokevirtual getClass : ()Ljava/lang/Class;
    //   114: pop
    //   115: aload_1
    //   116: invokestatic a : (Los;)Las;
    //   119: astore #7
    //   121: aload_0
    //   122: new dh0
    //   125: dup
    //   126: aload #4
    //   128: iconst_1
    //   129: invokespecial <init> : (Landroidx/work/impl/WorkDatabase;I)V
    //   132: putfield g : Ldh0;
    //   135: aload_3
    //   136: getfield c : Ljava/lang/Object;
    //   139: checkcast tk1
    //   142: astore_1
    //   143: getstatic dj1.a : Ljava/lang/String;
    //   146: astore #11
    //   148: aload #6
    //   150: new cj1
    //   153: dup
    //   154: aload_1
    //   155: aload #5
    //   157: aload_2
    //   158: aload #4
    //   160: invokespecial <init> : (Ljava/util/concurrent/Executor;Ljava/util/List;Lip;Landroidx/work/impl/WorkDatabase;)V
    //   163: invokevirtual a : (Lz50;)V
    //   166: new ia0
    //   169: dup
    //   170: aload #10
    //   172: aload_0
    //   173: invokespecial <init> : (Landroid/content/Context;Lq72;)V
    //   176: astore_1
    //   177: aload_3
    //   178: getfield c : Ljava/lang/Object;
    //   181: checkcast tk1
    //   184: aload_1
    //   185: invokevirtual execute : (Ljava/lang/Runnable;)V
    //   188: getstatic k02.a : Ljava/lang/String;
    //   191: astore_1
    //   192: aload #10
    //   194: aload_2
    //   195: invokestatic a : (Landroid/content/Context;Lip;)Z
    //   198: ifeq -> 681
    //   201: aload #4
    //   203: invokevirtual v : ()Lc82;
    //   206: getfield a : Leh1;
    //   209: astore_2
    //   210: new ps
    //   213: dup
    //   214: bipush #14
    //   216: invokespecial <init> : (I)V
    //   219: astore_3
    //   220: aload_2
    //   221: invokevirtual f : ()Lyi0;
    //   224: astore #4
    //   226: iconst_1
    //   227: anewarray java/lang/String
    //   230: dup
    //   231: iconst_0
    //   232: ldc 'workspec'
    //   234: aastore
    //   235: iconst_1
    //   236: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   239: checkcast [Ljava/lang/String;
    //   242: astore_1
    //   243: aload #4
    //   245: getfield b : Ljx1;
    //   248: astore #4
    //   250: aload #4
    //   252: invokevirtual getClass : ()Ljava/lang/Class;
    //   255: pop
    //   256: new dl1
    //   259: dup
    //   260: invokespecial <init> : ()V
    //   263: astore #6
    //   265: aload_1
    //   266: arraylength
    //   267: istore #9
    //   269: iconst_0
    //   270: istore #8
    //   272: iload #8
    //   274: iload #9
    //   276: if_icmpge -> 350
    //   279: aload_1
    //   280: iload #8
    //   282: aaload
    //   283: astore #5
    //   285: aload #4
    //   287: getfield c : Ljava/util/LinkedHashMap;
    //   290: astore #12
    //   292: aload #5
    //   294: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   297: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   300: astore #11
    //   302: aload #11
    //   304: invokevirtual getClass : ()Ljava/lang/Class;
    //   307: pop
    //   308: aload #12
    //   310: aload #11
    //   312: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   315: checkcast java/util/Set
    //   318: astore #11
    //   320: aload #11
    //   322: ifnull -> 336
    //   325: aload #6
    //   327: aload #11
    //   329: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   332: pop
    //   333: goto -> 344
    //   336: aload #6
    //   338: aload #5
    //   340: invokevirtual add : (Ljava/lang/Object;)Z
    //   343: pop
    //   344: iinc #8, 1
    //   347: goto -> 272
    //   350: aload #6
    //   352: invokestatic h : (Ldl1;)Ldl1;
    //   355: iconst_0
    //   356: anewarray java/lang/String
    //   359: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   362: checkcast [Ljava/lang/String;
    //   365: astore #5
    //   367: aload #5
    //   369: arraylength
    //   370: istore #9
    //   372: iload #9
    //   374: newarray int
    //   376: astore #6
    //   378: iconst_0
    //   379: istore #8
    //   381: iload #8
    //   383: iload #9
    //   385: if_icmpge -> 463
    //   388: aload #5
    //   390: iload #8
    //   392: aaload
    //   393: astore_1
    //   394: aload #4
    //   396: getfield f : Ljava/util/LinkedHashMap;
    //   399: astore #11
    //   401: aload_1
    //   402: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   405: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   408: astore #12
    //   410: aload #12
    //   412: invokevirtual getClass : ()Ljava/lang/Class;
    //   415: pop
    //   416: aload #11
    //   418: aload #12
    //   420: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   423: checkcast java/lang/Integer
    //   426: astore #11
    //   428: aload #11
    //   430: ifnull -> 449
    //   433: aload #6
    //   435: iload #8
    //   437: aload #11
    //   439: invokevirtual intValue : ()I
    //   442: iastore
    //   443: iinc #8, 1
    //   446: goto -> 381
    //   449: ldc 'There is no table with name '
    //   451: aload_1
    //   452: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   455: invokestatic l : (Ljava/lang/String;)V
    //   458: aconst_null
    //   459: astore_1
    //   460: goto -> 475
    //   463: new t51
    //   466: dup
    //   467: aload #5
    //   469: aload #6
    //   471: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   474: astore_1
    //   475: aload_1
    //   476: getfield b : Ljava/lang/Object;
    //   479: checkcast [Ljava/lang/String;
    //   482: astore #5
    //   484: aload_1
    //   485: getfield c : Ljava/lang/Object;
    //   488: checkcast [I
    //   491: astore_1
    //   492: aload #5
    //   494: invokevirtual getClass : ()Ljava/lang/Class;
    //   497: pop
    //   498: aload_1
    //   499: invokevirtual getClass : ()Ljava/lang/Class;
    //   502: pop
    //   503: new ar
    //   506: dup
    //   507: iconst_1
    //   508: new vq
    //   511: dup
    //   512: aload #4
    //   514: aload_1
    //   515: aload #5
    //   517: aconst_null
    //   518: invokespecial <init> : (Ljx1;[I[Ljava/lang/String;Lcs;)V
    //   521: invokespecial <init> : (ILjava/lang/Object;)V
    //   524: astore_1
    //   525: getstatic b40.b : Lb40;
    //   528: astore #4
    //   530: getstatic hh.c : Lhh;
    //   533: astore #5
    //   535: aload_1
    //   536: instanceof kd0
    //   539: ifeq -> 560
    //   542: aload_1
    //   543: checkcast kd0
    //   546: aload #4
    //   548: iconst_0
    //   549: aload #5
    //   551: invokeinterface b : (Los;ILhh;)Lw80;
    //   556: astore_1
    //   557: goto -> 574
    //   560: new gk
    //   563: dup
    //   564: aload_1
    //   565: aload #4
    //   567: iconst_0
    //   568: aload #5
    //   570: invokespecial <init> : (Lw80;Los;ILhh;)V
    //   573: astore_1
    //   574: new d90
    //   577: dup
    //   578: new j90
    //   581: dup
    //   582: aload_1
    //   583: aload_2
    //   584: aload_3
    //   585: invokespecial <init> : (Lw80;Leh1;Lps;)V
    //   588: new pr1
    //   591: dup
    //   592: iconst_4
    //   593: aconst_null
    //   594: invokespecial <init> : (ILcs;)V
    //   597: iconst_0
    //   598: invokespecial <init> : (Lw80;Lhd0;I)V
    //   601: astore_1
    //   602: aload_1
    //   603: instanceof kd0
    //   606: ifeq -> 627
    //   609: aload_1
    //   610: checkcast kd0
    //   613: aload #4
    //   615: iconst_0
    //   616: aload #5
    //   618: invokeinterface b : (Los;ILhh;)Lw80;
    //   623: astore_1
    //   624: goto -> 641
    //   627: new gk
    //   630: dup
    //   631: aload_1
    //   632: aload #4
    //   634: iconst_0
    //   635: aload #5
    //   637: invokespecial <init> : (Lw80;Los;ILhh;)V
    //   640: astore_1
    //   641: aload #7
    //   643: aconst_null
    //   644: aconst_null
    //   645: new tq
    //   648: dup
    //   649: new d90
    //   652: dup
    //   653: aload_1
    //   654: invokestatic q : (Lw80;)Lw80;
    //   657: new j02
    //   660: dup
    //   661: aload #10
    //   663: aconst_null
    //   664: invokespecial <init> : (Landroid/content/Context;Lcs;)V
    //   667: iconst_1
    //   668: invokespecial <init> : (Lw80;Lhd0;I)V
    //   671: aconst_null
    //   672: iconst_1
    //   673: invokespecial <init> : (Ljava/lang/Object;Lcs;I)V
    //   676: iconst_3
    //   677: invokestatic L : (Lxs;Los;Lat;Lad0;I)Lbp1;
    //   680: pop
    //   681: return
    //   682: aload_1
    //   683: monitorexit
    //   684: aload_2
    //   685: athrow
    //   686: ldc_w 'Cannot initialize WorkManager in direct boot mode'
    //   689: invokestatic f : (Ljava/lang/String;)V
    //   692: aconst_null
    //   693: athrow
    // Exception table:
    //   from	to	target	type
    //   42	53	56	finally
    //   60	62	56	finally
    //   682	684	56	finally
  }
  
  public static q72 a(Context paramContext) {
    q72 q721;
    Object object = m;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      q72 q722;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        q722 = k;
        if (q722 != null) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        } else {
          q722 = l;
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        } 
      } finally {}
      q721 = q722;
      if (q722 == null) {
        Context context = paramContext.getApplicationContext();
        if (context instanceof MyApplication) {
          ip2 ip2 = new ip2();
          super();
          ip ip1 = new ip();
          this(ip2);
          b((MyApplication)context, ip1);
          q721 = a(context);
        } else {
          IllegalStateException illegalStateException = new IllegalStateException();
          this("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
          throw illegalStateException;
        } 
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    return q721;
  }
  
  public static void b(MyApplication paramMyApplication, ip paramip) {
    synchronized (m) {
      q72 q721 = k;
      if (q721 == null || l == null) {
        if (q721 == null) {
          Context context = paramMyApplication.getApplicationContext();
          if (l == null)
            l = ws2.x(context, paramip); 
          k = l;
        } 
        return;
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      this("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
      throw illegalStateException;
    } 
  }
  
  public final void c() {
    Object object = m;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      this.h = true;
      BroadcastReceiver.PendingResult pendingResult = this.i;
      if (pendingResult != null) {
        pendingResult.finish();
        this.i = null;
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public final void d() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lip;
    //   4: getfield m : Lhp2;
    //   7: astore_2
    //   8: new ii
    //   11: dup
    //   12: aload_0
    //   13: iconst_1
    //   14: invokespecial <init> : (Lq72;I)V
    //   17: astore_3
    //   18: aload_2
    //   19: invokevirtual getClass : ()Ljava/lang/Class;
    //   22: pop
    //   23: invokestatic N : ()Z
    //   26: istore_1
    //   27: iload_1
    //   28: ifeq -> 40
    //   31: ldc_w 'ReschedulingWork'
    //   34: invokestatic p0 : (Ljava/lang/String;)Ljava/lang/String;
    //   37: invokestatic beginSection : (Ljava/lang/String;)V
    //   40: aload_3
    //   41: invokevirtual a : ()Ljava/lang/Object;
    //   44: pop
    //   45: iload_1
    //   46: ifeq -> 52
    //   49: invokestatic endSection : ()V
    //   52: return
    //   53: astore_2
    //   54: iload_1
    //   55: ifeq -> 61
    //   58: invokestatic endSection : ()V
    //   61: aload_2
    //   62: athrow
    // Exception table:
    //   from	to	target	type
    //   31	40	53	finally
    //   40	45	53	finally
  }
  
  static {
    qp0.j("WorkManagerImpl");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */