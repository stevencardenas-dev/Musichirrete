import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class oe0 implements Handler.Callback {
  public static final Status q = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
  
  public static final Status r = new Status(4, "The user must be signed in to make this API call.", null, null);
  
  public static final Object s = new Object();
  
  public static oe0 t;
  
  public long b = 10000L;
  
  public boolean c = false;
  
  public rt1 e;
  
  public pb2 f;
  
  public final Context g;
  
  public final ke0 h;
  
  public final j01 i;
  
  public final AtomicInteger j;
  
  public final AtomicInteger k;
  
  public final ConcurrentHashMap l;
  
  public final d9 m;
  
  public final d9 n;
  
  public final cl o;
  
  public volatile boolean p;
  
  public oe0(Context paramContext, Looper paramLooper) {
    boolean bool = true;
    this.j = new AtomicInteger(1);
    this.k = new AtomicInteger(0);
    this.l = new ConcurrentHashMap<Object, Object>(5, 0.75F, 1);
    this.m = new d9(0);
    this.n = new d9(0);
    this.p = true;
    this.g = paramContext;
    cl cl1 = new cl(paramLooper, this, 4);
    Looper.getMainLooper();
    this.o = cl1;
    this.h = ke01;
    this.i = new j01(22);
    PackageManager packageManager = paramContext.getPackageManager();
    if (n21.j == null) {
      if (!ws2.S() || !packageManager.hasSystemFeature("android.hardware.type.automotive"))
        bool = false; 
      n21.j = Boolean.valueOf(bool);
    } 
    if (n21.j.booleanValue())
      this.p = false; 
    cl1.sendMessage(cl1.obtainMessage(6));
  }
  
  public static Status c(m5 paramm5, sp paramsp) {
    String str2 = (String)paramm5.b.e;
    String str1 = String.valueOf(paramsp);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 63 + str1.length());
    stringBuilder.append("API: ");
    stringBuilder.append(str2);
    stringBuilder.append(" is not available on this device. Connection failed with: ");
    stringBuilder.append(str1);
    return new Status(17, stringBuilder.toString(), paramsp.e, paramsp);
  }
  
  public static oe0 d(Context paramContext) {
    Object object = s;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (t == null) {
        HandlerThread handlerThread;
        Object object1 = bq2.g;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          handlerThread = bq2.i;
          if (handlerThread != null) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          } else {
            handlerThread = new HandlerThread();
            this("GoogleApiHandler", 9);
            bq2.i = handlerThread;
            handlerThread.start();
            handlerThread = bq2.i;
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          } 
        } finally {}
        object1 = handlerThread.getLooper();
        oe0 oe02 = new oe0();
        paramContext = paramContext.getApplicationContext();
        Object object2 = ke0.c;
        this(paramContext, (Looper)object1);
        t = oe02;
      } 
    } finally {}
    oe0 oe01 = t;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    return oe01;
  }
  
  public final qa2 a(je0 paramje0) {
    m5 m5 = paramje0.f;
    ConcurrentHashMap<m5, qa2> concurrentHashMap = this.l;
    qa2 qa22 = (qa2)concurrentHashMap.get(m5);
    qa2 qa21 = qa22;
    if (qa22 == null) {
      qa21 = new qa2(this, paramje0);
      concurrentHashMap.put(m5, qa21);
    } 
    if (qa21.f.q())
      this.n.add(m5); 
    qa21.q();
    return qa21;
  }
  
  public final void b(nt1 paramnt1, int paramInt, je0 paramje0) {
    // Byte code:
    //   0: iload_2
    //   1: ifeq -> 259
    //   4: aload_3
    //   5: getfield f : Lm5;
    //   8: astore_3
    //   9: aload_0
    //   10: invokevirtual e : ()Z
    //   13: ifne -> 19
    //   16: goto -> 149
    //   19: invokestatic n : ()Lgh1;
    //   22: getfield c : Ljava/lang/Object;
    //   25: checkcast hh1
    //   28: astore #9
    //   30: iconst_1
    //   31: istore #4
    //   33: aload #9
    //   35: ifnull -> 154
    //   38: aload #9
    //   40: getfield c : Z
    //   43: ifeq -> 149
    //   46: aload #9
    //   48: getfield e : Z
    //   51: istore #4
    //   53: aload_0
    //   54: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   57: aload_3
    //   58: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   61: checkcast qa2
    //   64: astore #9
    //   66: aload #9
    //   68: ifnull -> 146
    //   71: aload #9
    //   73: getfield f : Lhe0;
    //   76: astore #10
    //   78: aload #10
    //   80: instanceof yc
    //   83: ifeq -> 149
    //   86: aload #10
    //   88: checkcast yc
    //   91: astore #10
    //   93: aload #10
    //   95: getfield w : Lgn2;
    //   98: ifnull -> 146
    //   101: aload #10
    //   103: invokevirtual n : ()Z
    //   106: ifne -> 146
    //   109: aload #9
    //   111: aload #10
    //   113: iload_2
    //   114: invokestatic a : (Lqa2;Lyc;I)Lwp;
    //   117: astore #10
    //   119: aload #10
    //   121: ifnull -> 149
    //   124: aload #9
    //   126: aload #9
    //   128: getfield p : I
    //   131: iconst_1
    //   132: iadd
    //   133: putfield p : I
    //   136: aload #10
    //   138: getfield e : Z
    //   141: istore #4
    //   143: goto -> 154
    //   146: goto -> 154
    //   149: aconst_null
    //   150: astore_3
    //   151: goto -> 198
    //   154: lconst_0
    //   155: lstore #7
    //   157: iload #4
    //   159: ifeq -> 170
    //   162: invokestatic currentTimeMillis : ()J
    //   165: lstore #5
    //   167: goto -> 173
    //   170: lconst_0
    //   171: lstore #5
    //   173: iload #4
    //   175: ifeq -> 183
    //   178: invokestatic elapsedRealtime : ()J
    //   181: lstore #7
    //   183: new va2
    //   186: dup
    //   187: aload_0
    //   188: iload_2
    //   189: aload_3
    //   190: lload #5
    //   192: lload #7
    //   194: invokespecial <init> : (Loe0;ILm5;JJ)V
    //   197: astore_3
    //   198: aload_3
    //   199: ifnull -> 259
    //   202: aload_1
    //   203: getfield a : Ldu2;
    //   206: astore_1
    //   207: aload_0
    //   208: getfield o : Lcl;
    //   211: astore #9
    //   213: aload #9
    //   215: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   218: pop
    //   219: new a60
    //   222: dup
    //   223: aload #9
    //   225: iconst_2
    //   226: invokespecial <init> : (Landroid/os/Handler;I)V
    //   229: astore #9
    //   231: aload_1
    //   232: invokevirtual getClass : ()Ljava/lang/Class;
    //   235: pop
    //   236: new jn2
    //   239: dup
    //   240: aload #9
    //   242: aload_3
    //   243: invokespecial <init> : (Ljava/util/concurrent/Executor;Lc41;)V
    //   246: astore_3
    //   247: aload_1
    //   248: getfield b : Lm9;
    //   251: aload_3
    //   252: invokevirtual b : (Ljn2;)V
    //   255: aload_1
    //   256: invokevirtual j : ()V
    //   259: return
  }
  
  public final boolean e() {
    if (!this.c) {
      hh1 hh1 = (hh1)(gh1.n()).c;
      if (hh1 == null || hh1.c)
        synchronized ((SparseIntArray)this.i.c) {
          int i = null.get(203400000, -1);
          return (i == -1 || i == 0);
        }  
    } 
    return false;
  }
  
  public final boolean f(sp paramsp, int paramInt) {
    ke0 ke01 = this.h;
    ke01.getClass();
    Context context = this.g;
    if (!ii0.i(context)) {
      int i;
      int j = paramsp.c;
      PendingIntent pendingIntent = paramsp.e;
      if (j != 0 && pendingIntent != null) {
        i = 1;
      } else {
        i = 0;
      } 
      if (!i) {
        pendingIntent = null;
        Intent intent = ke01.a(j, context, null);
        if (intent != null)
          pendingIntent = PendingIntent.getActivity(context, 0, intent, 201326592); 
      } 
      if (pendingIntent != null) {
        i = GoogleApiActivity.c;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", (Parcelable)pendingIntent);
        intent.putExtra("failing_client_id", paramInt);
        intent.putExtra("notify_manager", true);
        ke01.f(context, j, PendingIntent.getActivity(context, 0, intent, ob2.a | 0x8000000));
        return true;
      } 
    } 
    return false;
  }
  
  public final void g(sp paramsp, int paramInt) {
    if (!f(paramsp, paramInt)) {
      cl cl1 = this.o;
      cl1.sendMessage(cl1.obtainMessage(5, paramInt, 0, paramsp));
    } 
  }
  
  public final boolean handleMessage(Message paramMessage) {
    // Byte code:
    //   0: aload_1
    //   1: getfield what : I
    //   4: istore_2
    //   5: ldc2_w 300000
    //   8: lstore #5
    //   10: iconst_0
    //   11: istore_3
    //   12: iload_2
    //   13: tableswitch default -> 104, 1 -> 2179, 2 -> 2171, 3 -> 2113, 4 -> 2010, 5 -> 1750, 6 -> 1558, 7 -> 1544, 8 -> 2010, 9 -> 1490, 10 -> 1419, 11 -> 1235, 12 -> 1104, 13 -> 2010, 14 -> 1096, 15 -> 1005, 16 -> 751, 17 -> 617, 18 -> 156, 19 -> 149
    //   104: new java/lang/StringBuilder
    //   107: dup
    //   108: iload_2
    //   109: invokestatic valueOf : (I)Ljava/lang/String;
    //   112: invokevirtual length : ()I
    //   115: bipush #20
    //   117: iadd
    //   118: invokespecial <init> : (I)V
    //   121: astore_1
    //   122: aload_1
    //   123: ldc_w 'Unknown message id: '
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload_1
    //   131: iload_2
    //   132: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: ldc_w 'GoogleApiManager'
    //   139: aload_1
    //   140: invokevirtual toString : ()Ljava/lang/String;
    //   143: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   146: pop
    //   147: iconst_0
    //   148: ireturn
    //   149: aload_0
    //   150: iconst_0
    //   151: putfield c : Z
    //   154: iconst_1
    //   155: ireturn
    //   156: aload_1
    //   157: getfield obj : Ljava/lang/Object;
    //   160: checkcast wa2
    //   163: astore_1
    //   164: aload_1
    //   165: getfield c : J
    //   168: lstore #5
    //   170: lload #5
    //   172: lconst_0
    //   173: lcmp
    //   174: ifne -> 309
    //   177: new rt1
    //   180: dup
    //   181: aload_1
    //   182: getfield b : I
    //   185: iconst_1
    //   186: anewarray px0
    //   189: dup
    //   190: iconst_0
    //   191: aload_1
    //   192: getfield a : Lpx0;
    //   195: aastore
    //   196: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   199: invokespecial <init> : (ILjava/util/List;)V
    //   202: astore_1
    //   203: aload_0
    //   204: getfield f : Lpb2;
    //   207: ifnonnull -> 242
    //   210: aload_0
    //   211: getfield g : Landroid/content/Context;
    //   214: astore #8
    //   216: getstatic st1.b : Lst1;
    //   219: astore #9
    //   221: aload_0
    //   222: new je0
    //   225: dup
    //   226: aload #8
    //   228: getstatic pb2.k : Lg7;
    //   231: aload #9
    //   233: getstatic ie0.c : Lie0;
    //   236: invokespecial <init> : (Landroid/content/Context;Lg7;Lj5;Lie0;)V
    //   239: putfield f : Lpb2;
    //   242: aload_0
    //   243: getfield f : Lpb2;
    //   246: astore #8
    //   248: aload #8
    //   250: invokevirtual getClass : ()Ljava/lang/Class;
    //   253: pop
    //   254: invokestatic b : ()Lah;
    //   257: astore #9
    //   259: aload #9
    //   261: iconst_1
    //   262: anewarray u70
    //   265: dup
    //   266: iconst_0
    //   267: getstatic dd1.i : Lu70;
    //   270: aastore
    //   271: putfield e : Ljava/lang/Object;
    //   274: aload #9
    //   276: iconst_0
    //   277: putfield c : Z
    //   280: aload #9
    //   282: new a42
    //   285: dup
    //   286: bipush #7
    //   288: aload_1
    //   289: invokespecial <init> : (ILjava/lang/Object;)V
    //   292: putfield d : Ljava/lang/Object;
    //   295: aload #8
    //   297: iconst_2
    //   298: aload #9
    //   300: invokevirtual a : ()Lah;
    //   303: invokevirtual c : (ILah;)Ldu2;
    //   306: pop
    //   307: iconst_1
    //   308: ireturn
    //   309: aload_0
    //   310: getfield e : Lrt1;
    //   313: astore #9
    //   315: aload #9
    //   317: ifnull -> 554
    //   320: aload #9
    //   322: getfield c : Ljava/util/List;
    //   325: astore #8
    //   327: aload #9
    //   329: getfield b : I
    //   332: aload_1
    //   333: getfield b : I
    //   336: if_icmpne -> 409
    //   339: aload #8
    //   341: ifnull -> 361
    //   344: aload #8
    //   346: invokeinterface size : ()I
    //   351: aload_1
    //   352: getfield d : I
    //   355: if_icmplt -> 361
    //   358: goto -> 409
    //   361: aload_0
    //   362: getfield e : Lrt1;
    //   365: astore #9
    //   367: aload_1
    //   368: getfield a : Lpx0;
    //   371: astore #8
    //   373: aload #9
    //   375: getfield c : Ljava/util/List;
    //   378: ifnonnull -> 393
    //   381: aload #9
    //   383: new java/util/ArrayList
    //   386: dup
    //   387: invokespecial <init> : ()V
    //   390: putfield c : Ljava/util/List;
    //   393: aload #9
    //   395: getfield c : Ljava/util/List;
    //   398: aload #8
    //   400: invokeinterface add : (Ljava/lang/Object;)Z
    //   405: pop
    //   406: goto -> 554
    //   409: aload_0
    //   410: getfield o : Lcl;
    //   413: bipush #17
    //   415: invokevirtual removeMessages : (I)V
    //   418: aload_0
    //   419: getfield e : Lrt1;
    //   422: astore #8
    //   424: aload #8
    //   426: ifnull -> 554
    //   429: aload #8
    //   431: getfield b : I
    //   434: ifgt -> 444
    //   437: aload_0
    //   438: invokevirtual e : ()Z
    //   441: ifeq -> 549
    //   444: aload_0
    //   445: getfield f : Lpb2;
    //   448: ifnonnull -> 483
    //   451: aload_0
    //   452: getfield g : Landroid/content/Context;
    //   455: astore #9
    //   457: getstatic st1.b : Lst1;
    //   460: astore #10
    //   462: aload_0
    //   463: new je0
    //   466: dup
    //   467: aload #9
    //   469: getstatic pb2.k : Lg7;
    //   472: aload #10
    //   474: getstatic ie0.c : Lie0;
    //   477: invokespecial <init> : (Landroid/content/Context;Lg7;Lj5;Lie0;)V
    //   480: putfield f : Lpb2;
    //   483: aload_0
    //   484: getfield f : Lpb2;
    //   487: astore #10
    //   489: aload #10
    //   491: invokevirtual getClass : ()Ljava/lang/Class;
    //   494: pop
    //   495: invokestatic b : ()Lah;
    //   498: astore #9
    //   500: aload #9
    //   502: iconst_1
    //   503: anewarray u70
    //   506: dup
    //   507: iconst_0
    //   508: getstatic dd1.i : Lu70;
    //   511: aastore
    //   512: putfield e : Ljava/lang/Object;
    //   515: aload #9
    //   517: iconst_0
    //   518: putfield c : Z
    //   521: aload #9
    //   523: new a42
    //   526: dup
    //   527: bipush #7
    //   529: aload #8
    //   531: invokespecial <init> : (ILjava/lang/Object;)V
    //   534: putfield d : Ljava/lang/Object;
    //   537: aload #10
    //   539: iconst_2
    //   540: aload #9
    //   542: invokevirtual a : ()Lah;
    //   545: invokevirtual c : (ILah;)Ldu2;
    //   548: pop
    //   549: aload_0
    //   550: aconst_null
    //   551: putfield e : Lrt1;
    //   554: aload_0
    //   555: getfield e : Lrt1;
    //   558: ifnonnull -> 2270
    //   561: new java/util/ArrayList
    //   564: dup
    //   565: invokespecial <init> : ()V
    //   568: astore #8
    //   570: aload #8
    //   572: aload_1
    //   573: getfield a : Lpx0;
    //   576: invokevirtual add : (Ljava/lang/Object;)Z
    //   579: pop
    //   580: aload_0
    //   581: new rt1
    //   584: dup
    //   585: aload_1
    //   586: getfield b : I
    //   589: aload #8
    //   591: invokespecial <init> : (ILjava/util/List;)V
    //   594: putfield e : Lrt1;
    //   597: aload_0
    //   598: getfield o : Lcl;
    //   601: astore_1
    //   602: aload_1
    //   603: aload_1
    //   604: bipush #17
    //   606: invokevirtual obtainMessage : (I)Landroid/os/Message;
    //   609: lload #5
    //   611: invokevirtual sendMessageDelayed : (Landroid/os/Message;J)Z
    //   614: pop
    //   615: iconst_1
    //   616: ireturn
    //   617: aload_0
    //   618: getfield e : Lrt1;
    //   621: astore_1
    //   622: aload_1
    //   623: ifnull -> 2270
    //   626: aload_1
    //   627: getfield b : I
    //   630: ifgt -> 640
    //   633: aload_0
    //   634: invokevirtual e : ()Z
    //   637: ifeq -> 744
    //   640: aload_0
    //   641: getfield f : Lpb2;
    //   644: ifnonnull -> 679
    //   647: aload_0
    //   648: getfield g : Landroid/content/Context;
    //   651: astore #8
    //   653: getstatic st1.b : Lst1;
    //   656: astore #9
    //   658: aload_0
    //   659: new je0
    //   662: dup
    //   663: aload #8
    //   665: getstatic pb2.k : Lg7;
    //   668: aload #9
    //   670: getstatic ie0.c : Lie0;
    //   673: invokespecial <init> : (Landroid/content/Context;Lg7;Lj5;Lie0;)V
    //   676: putfield f : Lpb2;
    //   679: aload_0
    //   680: getfield f : Lpb2;
    //   683: astore #9
    //   685: aload #9
    //   687: invokevirtual getClass : ()Ljava/lang/Class;
    //   690: pop
    //   691: invokestatic b : ()Lah;
    //   694: astore #8
    //   696: aload #8
    //   698: iconst_1
    //   699: anewarray u70
    //   702: dup
    //   703: iconst_0
    //   704: getstatic dd1.i : Lu70;
    //   707: aastore
    //   708: putfield e : Ljava/lang/Object;
    //   711: aload #8
    //   713: iconst_0
    //   714: putfield c : Z
    //   717: aload #8
    //   719: new a42
    //   722: dup
    //   723: bipush #7
    //   725: aload_1
    //   726: invokespecial <init> : (ILjava/lang/Object;)V
    //   729: putfield d : Ljava/lang/Object;
    //   732: aload #9
    //   734: iconst_2
    //   735: aload #8
    //   737: invokevirtual a : ()Lah;
    //   740: invokevirtual c : (ILah;)Ldu2;
    //   743: pop
    //   744: aload_0
    //   745: aconst_null
    //   746: putfield e : Lrt1;
    //   749: iconst_1
    //   750: ireturn
    //   751: aload_1
    //   752: getfield obj : Ljava/lang/Object;
    //   755: checkcast ra2
    //   758: astore #8
    //   760: aload_0
    //   761: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   764: astore_1
    //   765: aload_1
    //   766: aload #8
    //   768: getfield a : Lm5;
    //   771: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   774: ifeq -> 2270
    //   777: aload_1
    //   778: aload #8
    //   780: getfield a : Lm5;
    //   783: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   786: checkcast qa2
    //   789: astore_1
    //   790: aload_1
    //   791: getfield n : Ljava/util/ArrayList;
    //   794: aload #8
    //   796: invokevirtual remove : (Ljava/lang/Object;)Z
    //   799: ifeq -> 2270
    //   802: aload_1
    //   803: getfield q : Loe0;
    //   806: astore #9
    //   808: aload #9
    //   810: getfield o : Lcl;
    //   813: bipush #15
    //   815: aload #8
    //   817: invokevirtual removeMessages : (ILjava/lang/Object;)V
    //   820: aload #9
    //   822: getfield o : Lcl;
    //   825: bipush #16
    //   827: aload #8
    //   829: invokevirtual removeMessages : (ILjava/lang/Object;)V
    //   832: aload #8
    //   834: getfield b : Lu70;
    //   837: astore #9
    //   839: aload_1
    //   840: getfield e : Ljava/util/LinkedList;
    //   843: astore #10
    //   845: new java/util/ArrayList
    //   848: dup
    //   849: aload #10
    //   851: invokevirtual size : ()I
    //   854: invokespecial <init> : (I)V
    //   857: astore #8
    //   859: aload #10
    //   861: invokeinterface iterator : ()Ljava/util/Iterator;
    //   866: astore #11
    //   868: aload #11
    //   870: invokeinterface hasNext : ()Z
    //   875: ifeq -> 954
    //   878: aload #11
    //   880: invokeinterface next : ()Ljava/lang/Object;
    //   885: checkcast za2
    //   888: astore #12
    //   890: aload #12
    //   892: ifnull -> 868
    //   895: aload #12
    //   897: aload_1
    //   898: invokevirtual a : (Lqa2;)[Lu70;
    //   901: astore #13
    //   903: aload #13
    //   905: ifnull -> 868
    //   908: aload #13
    //   910: arraylength
    //   911: istore #4
    //   913: iconst_0
    //   914: istore_2
    //   915: iload_2
    //   916: iload #4
    //   918: if_icmpge -> 868
    //   921: aload #13
    //   923: iload_2
    //   924: aaload
    //   925: aload #9
    //   927: invokestatic g : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   930: ifeq -> 948
    //   933: iload_2
    //   934: iflt -> 868
    //   937: aload #8
    //   939: aload #12
    //   941: invokevirtual add : (Ljava/lang/Object;)Z
    //   944: pop
    //   945: goto -> 868
    //   948: iinc #2, 1
    //   951: goto -> 915
    //   954: aload #8
    //   956: invokevirtual size : ()I
    //   959: istore #4
    //   961: iload_3
    //   962: istore_2
    //   963: iload_2
    //   964: iload #4
    //   966: if_icmpge -> 2270
    //   969: aload #8
    //   971: iload_2
    //   972: invokevirtual get : (I)Ljava/lang/Object;
    //   975: checkcast za2
    //   978: astore_1
    //   979: aload #10
    //   981: aload_1
    //   982: invokevirtual remove : (Ljava/lang/Object;)Z
    //   985: pop
    //   986: aload_1
    //   987: new u02
    //   990: dup
    //   991: aload #9
    //   993: invokespecial <init> : (Lu70;)V
    //   996: invokevirtual d : (Ljava/lang/Exception;)V
    //   999: iinc #2, 1
    //   1002: goto -> 963
    //   1005: aload_1
    //   1006: getfield obj : Ljava/lang/Object;
    //   1009: checkcast ra2
    //   1012: astore_1
    //   1013: aload_0
    //   1014: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   1017: astore #8
    //   1019: aload #8
    //   1021: aload_1
    //   1022: getfield a : Lm5;
    //   1025: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   1028: ifeq -> 2270
    //   1031: aload #8
    //   1033: aload_1
    //   1034: getfield a : Lm5;
    //   1037: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1040: checkcast qa2
    //   1043: astore #8
    //   1045: aload #8
    //   1047: getfield n : Ljava/util/ArrayList;
    //   1050: aload_1
    //   1051: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1054: ifne -> 1060
    //   1057: goto -> 2270
    //   1060: aload #8
    //   1062: getfield m : Z
    //   1065: ifne -> 2270
    //   1068: aload #8
    //   1070: getfield f : Lhe0;
    //   1073: checkcast yc
    //   1076: invokevirtual m : ()Z
    //   1079: ifne -> 1089
    //   1082: aload #8
    //   1084: invokevirtual q : ()V
    //   1087: iconst_1
    //   1088: ireturn
    //   1089: aload #8
    //   1091: invokevirtual d : ()V
    //   1094: iconst_1
    //   1095: ireturn
    //   1096: aload_1
    //   1097: getfield obj : Ljava/lang/Object;
    //   1100: invokestatic f : (Ljava/lang/Object;)Ljava/lang/ClassCastException;
    //   1103: athrow
    //   1104: aload_0
    //   1105: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   1108: astore #8
    //   1110: aload #8
    //   1112: aload_1
    //   1113: getfield obj : Ljava/lang/Object;
    //   1116: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   1119: ifeq -> 2270
    //   1122: aload #8
    //   1124: aload_1
    //   1125: getfield obj : Ljava/lang/Object;
    //   1128: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1131: checkcast qa2
    //   1134: astore #8
    //   1136: aload #8
    //   1138: getfield q : Loe0;
    //   1141: getfield o : Lcl;
    //   1144: invokestatic i : (Landroid/os/Handler;)V
    //   1147: aload #8
    //   1149: getfield f : Lhe0;
    //   1152: astore #9
    //   1154: aload #9
    //   1156: checkcast yc
    //   1159: invokevirtual m : ()Z
    //   1162: ifeq -> 1233
    //   1165: aload #8
    //   1167: getfield j : Ljava/util/HashMap;
    //   1170: invokevirtual isEmpty : ()Z
    //   1173: ifeq -> 1233
    //   1176: aload #8
    //   1178: getfield h : Lj01;
    //   1181: astore_1
    //   1182: aload_1
    //   1183: getfield c : Ljava/lang/Object;
    //   1186: checkcast java/util/Map
    //   1189: invokeinterface isEmpty : ()Z
    //   1194: ifeq -> 1228
    //   1197: aload_1
    //   1198: getfield e : Ljava/lang/Object;
    //   1201: checkcast java/util/Map
    //   1204: invokeinterface isEmpty : ()Z
    //   1209: ifne -> 1215
    //   1212: goto -> 1228
    //   1215: aload #9
    //   1217: checkcast yc
    //   1220: ldc_w 'Timing out service connection.'
    //   1223: invokevirtual c : (Ljava/lang/String;)V
    //   1226: iconst_1
    //   1227: ireturn
    //   1228: aload #8
    //   1230: invokevirtual h : ()V
    //   1233: iconst_1
    //   1234: ireturn
    //   1235: aload_0
    //   1236: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   1239: astore #8
    //   1241: aload #8
    //   1243: aload_1
    //   1244: getfield obj : Ljava/lang/Object;
    //   1247: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   1250: ifeq -> 2270
    //   1253: aload #8
    //   1255: aload_1
    //   1256: getfield obj : Ljava/lang/Object;
    //   1259: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1262: checkcast qa2
    //   1265: astore #8
    //   1267: aload #8
    //   1269: getfield q : Loe0;
    //   1272: astore_1
    //   1273: aload_1
    //   1274: getfield o : Lcl;
    //   1277: invokestatic i : (Landroid/os/Handler;)V
    //   1280: aload #8
    //   1282: getfield m : Z
    //   1285: istore #7
    //   1287: iload #7
    //   1289: ifeq -> 2270
    //   1292: iload #7
    //   1294: ifeq -> 1341
    //   1297: aload #8
    //   1299: getfield q : Loe0;
    //   1302: astore #10
    //   1304: aload #8
    //   1306: getfield g : Lm5;
    //   1309: astore #9
    //   1311: aload #10
    //   1313: getfield o : Lcl;
    //   1316: bipush #11
    //   1318: aload #9
    //   1320: invokevirtual removeMessages : (ILjava/lang/Object;)V
    //   1323: aload #10
    //   1325: getfield o : Lcl;
    //   1328: bipush #9
    //   1330: aload #9
    //   1332: invokevirtual removeMessages : (ILjava/lang/Object;)V
    //   1335: aload #8
    //   1337: iconst_0
    //   1338: putfield m : Z
    //   1341: aload_1
    //   1342: getfield g : Landroid/content/Context;
    //   1345: astore #9
    //   1347: aload_1
    //   1348: getfield h : Lke0;
    //   1351: aload #9
    //   1353: getstatic le0.a : I
    //   1356: invokevirtual b : (Landroid/content/Context;I)I
    //   1359: bipush #18
    //   1361: if_icmpne -> 1382
    //   1364: new com/google/android/gms/common/api/Status
    //   1367: dup
    //   1368: bipush #21
    //   1370: ldc_w 'Connection timed out waiting for Google Play services update to complete.'
    //   1373: aconst_null
    //   1374: aconst_null
    //   1375: invokespecial <init> : (ILjava/lang/String;Landroid/app/PendingIntent;Lsp;)V
    //   1378: astore_1
    //   1379: goto -> 1397
    //   1382: new com/google/android/gms/common/api/Status
    //   1385: dup
    //   1386: bipush #22
    //   1388: ldc_w 'API failed to connect while resuming due to an unknown error.'
    //   1391: aconst_null
    //   1392: aconst_null
    //   1393: invokespecial <init> : (ILjava/lang/String;Landroid/app/PendingIntent;Lsp;)V
    //   1396: astore_1
    //   1397: aload #8
    //   1399: aload_1
    //   1400: invokevirtual g : (Lcom/google/android/gms/common/api/Status;)V
    //   1403: aload #8
    //   1405: getfield f : Lhe0;
    //   1408: checkcast yc
    //   1411: ldc_w 'Timing out connection while resuming.'
    //   1414: invokevirtual c : (Ljava/lang/String;)V
    //   1417: iconst_1
    //   1418: ireturn
    //   1419: aload_0
    //   1420: getfield n : Ld9;
    //   1423: astore_1
    //   1424: aload_1
    //   1425: invokevirtual getClass : ()Ljava/lang/Class;
    //   1428: pop
    //   1429: new x8
    //   1432: dup
    //   1433: aload_1
    //   1434: invokespecial <init> : (Ld9;)V
    //   1437: astore #8
    //   1439: aload #8
    //   1441: invokevirtual hasNext : ()Z
    //   1444: ifeq -> 1484
    //   1447: aload #8
    //   1449: invokevirtual next : ()Ljava/lang/Object;
    //   1452: checkcast m5
    //   1455: astore #9
    //   1457: aload_0
    //   1458: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   1461: aload #9
    //   1463: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1466: checkcast qa2
    //   1469: astore #9
    //   1471: aload #9
    //   1473: ifnull -> 1439
    //   1476: aload #9
    //   1478: invokevirtual p : ()V
    //   1481: goto -> 1439
    //   1484: aload_1
    //   1485: invokevirtual clear : ()V
    //   1488: iconst_1
    //   1489: ireturn
    //   1490: aload_0
    //   1491: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   1494: astore #8
    //   1496: aload #8
    //   1498: aload_1
    //   1499: getfield obj : Ljava/lang/Object;
    //   1502: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   1505: ifeq -> 2270
    //   1508: aload #8
    //   1510: aload_1
    //   1511: getfield obj : Ljava/lang/Object;
    //   1514: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1517: checkcast qa2
    //   1520: astore_1
    //   1521: aload_1
    //   1522: getfield q : Loe0;
    //   1525: getfield o : Lcl;
    //   1528: invokestatic i : (Landroid/os/Handler;)V
    //   1531: aload_1
    //   1532: getfield m : Z
    //   1535: ifeq -> 2270
    //   1538: aload_1
    //   1539: invokevirtual q : ()V
    //   1542: iconst_1
    //   1543: ireturn
    //   1544: aload_0
    //   1545: aload_1
    //   1546: getfield obj : Ljava/lang/Object;
    //   1549: checkcast je0
    //   1552: invokevirtual a : (Lje0;)Lqa2;
    //   1555: pop
    //   1556: iconst_1
    //   1557: ireturn
    //   1558: aload_0
    //   1559: getfield g : Landroid/content/Context;
    //   1562: astore_1
    //   1563: aload_1
    //   1564: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1567: instanceof android/app/Application
    //   1570: ifeq -> 2270
    //   1573: aload_1
    //   1574: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1577: checkcast android/app/Application
    //   1580: astore #8
    //   1582: getstatic pb.g : Lpb;
    //   1585: astore_1
    //   1586: aload_1
    //   1587: monitorenter
    //   1588: aload_1
    //   1589: getfield f : Z
    //   1592: ifne -> 1620
    //   1595: aload #8
    //   1597: aload_1
    //   1598: invokevirtual registerActivityLifecycleCallbacks : (Landroid/app/Application$ActivityLifecycleCallbacks;)V
    //   1601: aload #8
    //   1603: aload_1
    //   1604: invokevirtual registerComponentCallbacks : (Landroid/content/ComponentCallbacks;)V
    //   1607: aload_1
    //   1608: iconst_1
    //   1609: putfield f : Z
    //   1612: goto -> 1620
    //   1615: astore #8
    //   1617: goto -> 1745
    //   1620: aload_1
    //   1621: monitorexit
    //   1622: new pa2
    //   1625: dup
    //   1626: aload_0
    //   1627: invokespecial <init> : (Loe0;)V
    //   1630: astore #8
    //   1632: aload_1
    //   1633: monitorenter
    //   1634: aload_1
    //   1635: getfield e : Ljava/util/ArrayList;
    //   1638: aload #8
    //   1640: invokevirtual add : (Ljava/lang/Object;)Z
    //   1643: pop
    //   1644: aload_1
    //   1645: monitorexit
    //   1646: aload_1
    //   1647: getfield b : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   1650: astore #8
    //   1652: aload_1
    //   1653: getfield c : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   1656: astore_1
    //   1657: aload_1
    //   1658: invokevirtual get : ()Z
    //   1661: ifne -> 1717
    //   1664: invokestatic w : ()Z
    //   1667: ifne -> 1711
    //   1670: new android/app/ActivityManager$RunningAppProcessInfo
    //   1673: dup
    //   1674: invokespecial <init> : ()V
    //   1677: astore #9
    //   1679: aload #9
    //   1681: invokestatic getMyMemoryState : (Landroid/app/ActivityManager$RunningAppProcessInfo;)V
    //   1684: aload_1
    //   1685: iconst_1
    //   1686: invokevirtual getAndSet : (Z)Z
    //   1689: ifne -> 1717
    //   1692: aload #9
    //   1694: getfield importance : I
    //   1697: bipush #100
    //   1699: if_icmple -> 1717
    //   1702: aload #8
    //   1704: iconst_1
    //   1705: invokevirtual set : (Z)V
    //   1708: goto -> 1717
    //   1711: iconst_1
    //   1712: istore #7
    //   1714: goto -> 1724
    //   1717: aload #8
    //   1719: invokevirtual get : ()Z
    //   1722: istore #7
    //   1724: iload #7
    //   1726: ifne -> 2270
    //   1729: aload_0
    //   1730: ldc2_w 300000
    //   1733: putfield b : J
    //   1736: iconst_1
    //   1737: ireturn
    //   1738: astore #8
    //   1740: aload_1
    //   1741: monitorexit
    //   1742: aload #8
    //   1744: athrow
    //   1745: aload_1
    //   1746: monitorexit
    //   1747: aload #8
    //   1749: athrow
    //   1750: aload_1
    //   1751: getfield arg1 : I
    //   1754: istore_2
    //   1755: aload_1
    //   1756: getfield obj : Ljava/lang/Object;
    //   1759: checkcast sp
    //   1762: astore #8
    //   1764: aload_0
    //   1765: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   1768: invokevirtual values : ()Ljava/util/Collection;
    //   1771: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1776: astore #9
    //   1778: aload #9
    //   1780: invokeinterface hasNext : ()Z
    //   1785: ifeq -> 1810
    //   1788: aload #9
    //   1790: invokeinterface next : ()Ljava/lang/Object;
    //   1795: checkcast qa2
    //   1798: astore_1
    //   1799: aload_1
    //   1800: getfield k : I
    //   1803: iload_2
    //   1804: if_icmpne -> 1778
    //   1807: goto -> 1812
    //   1810: aconst_null
    //   1811: astore_1
    //   1812: aload_1
    //   1813: ifnull -> 1950
    //   1816: aload #8
    //   1818: getfield c : I
    //   1821: istore_3
    //   1822: iload_3
    //   1823: bipush #13
    //   1825: if_icmpne -> 1935
    //   1828: aload_0
    //   1829: getfield h : Lke0;
    //   1832: invokevirtual getClass : ()Ljava/lang/Class;
    //   1835: pop
    //   1836: getstatic pe0.c : I
    //   1839: istore_2
    //   1840: iload_3
    //   1841: invokestatic e : (I)Ljava/lang/String;
    //   1844: astore #9
    //   1846: aload #8
    //   1848: getfield f : Ljava/lang/String;
    //   1851: astore #8
    //   1853: new java/lang/StringBuilder
    //   1856: dup
    //   1857: aload #9
    //   1859: invokevirtual length : ()I
    //   1862: bipush #69
    //   1864: iadd
    //   1865: aload #8
    //   1867: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1870: invokevirtual length : ()I
    //   1873: iadd
    //   1874: invokespecial <init> : (I)V
    //   1877: astore #10
    //   1879: aload #10
    //   1881: ldc_w 'Error resolution was canceled by the user, original error message: '
    //   1884: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1887: pop
    //   1888: aload #10
    //   1890: aload #9
    //   1892: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1895: pop
    //   1896: aload #10
    //   1898: ldc_w ': '
    //   1901: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1904: pop
    //   1905: aload #10
    //   1907: aload #8
    //   1909: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1912: pop
    //   1913: aload_1
    //   1914: new com/google/android/gms/common/api/Status
    //   1917: dup
    //   1918: bipush #17
    //   1920: aload #10
    //   1922: invokevirtual toString : ()Ljava/lang/String;
    //   1925: aconst_null
    //   1926: aconst_null
    //   1927: invokespecial <init> : (ILjava/lang/String;Landroid/app/PendingIntent;Lsp;)V
    //   1930: invokevirtual g : (Lcom/google/android/gms/common/api/Status;)V
    //   1933: iconst_1
    //   1934: ireturn
    //   1935: aload_1
    //   1936: aload_1
    //   1937: getfield g : Lm5;
    //   1940: aload #8
    //   1942: invokestatic c : (Lm5;Lsp;)Lcom/google/android/gms/common/api/Status;
    //   1945: invokevirtual g : (Lcom/google/android/gms/common/api/Status;)V
    //   1948: iconst_1
    //   1949: ireturn
    //   1950: new java/lang/StringBuilder
    //   1953: dup
    //   1954: iload_2
    //   1955: invokestatic valueOf : (I)Ljava/lang/String;
    //   1958: invokevirtual length : ()I
    //   1961: bipush #65
    //   1963: iadd
    //   1964: invokespecial <init> : (I)V
    //   1967: astore_1
    //   1968: aload_1
    //   1969: ldc_w 'Could not find API instance '
    //   1972: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1975: pop
    //   1976: aload_1
    //   1977: iload_2
    //   1978: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1981: pop
    //   1982: aload_1
    //   1983: ldc_w ' while trying to fail enqueued calls.'
    //   1986: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1989: pop
    //   1990: ldc_w 'GoogleApiManager'
    //   1993: aload_1
    //   1994: invokevirtual toString : ()Ljava/lang/String;
    //   1997: new java/lang/Exception
    //   2000: dup
    //   2001: invokespecial <init> : ()V
    //   2004: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   2007: pop
    //   2008: iconst_1
    //   2009: ireturn
    //   2010: aload_1
    //   2011: getfield obj : Ljava/lang/Object;
    //   2014: checkcast ab2
    //   2017: astore #9
    //   2019: aload_0
    //   2020: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   2023: astore_1
    //   2024: aload #9
    //   2026: getfield c : Lje0;
    //   2029: astore #10
    //   2031: aload_1
    //   2032: aload #10
    //   2034: getfield f : Lm5;
    //   2037: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2040: checkcast qa2
    //   2043: astore #8
    //   2045: aload #8
    //   2047: astore_1
    //   2048: aload #8
    //   2050: ifnonnull -> 2060
    //   2053: aload_0
    //   2054: aload #10
    //   2056: invokevirtual a : (Lje0;)Lqa2;
    //   2059: astore_1
    //   2060: aload_1
    //   2061: getfield f : Lhe0;
    //   2064: invokevirtual q : ()Z
    //   2067: ifeq -> 2102
    //   2070: aload_0
    //   2071: getfield k : Ljava/util/concurrent/atomic/AtomicInteger;
    //   2074: invokevirtual get : ()I
    //   2077: aload #9
    //   2079: getfield b : I
    //   2082: if_icmpeq -> 2102
    //   2085: aload #9
    //   2087: getfield a : Lza2;
    //   2090: getstatic oe0.q : Lcom/google/android/gms/common/api/Status;
    //   2093: invokevirtual c : (Lcom/google/android/gms/common/api/Status;)V
    //   2096: aload_1
    //   2097: invokevirtual p : ()V
    //   2100: iconst_1
    //   2101: ireturn
    //   2102: aload_1
    //   2103: aload #9
    //   2105: getfield a : Lza2;
    //   2108: invokevirtual n : (Lza2;)V
    //   2111: iconst_1
    //   2112: ireturn
    //   2113: aload_0
    //   2114: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   2117: invokevirtual values : ()Ljava/util/Collection;
    //   2120: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2125: astore_1
    //   2126: aload_1
    //   2127: invokeinterface hasNext : ()Z
    //   2132: ifeq -> 2270
    //   2135: aload_1
    //   2136: invokeinterface next : ()Ljava/lang/Object;
    //   2141: checkcast qa2
    //   2144: astore #8
    //   2146: aload #8
    //   2148: getfield q : Loe0;
    //   2151: getfield o : Lcl;
    //   2154: invokestatic i : (Landroid/os/Handler;)V
    //   2157: aload #8
    //   2159: aconst_null
    //   2160: putfield o : Lsp;
    //   2163: aload #8
    //   2165: invokevirtual q : ()V
    //   2168: goto -> 2126
    //   2171: aload_1
    //   2172: getfield obj : Ljava/lang/Object;
    //   2175: invokestatic f : (Ljava/lang/Object;)Ljava/lang/ClassCastException;
    //   2178: athrow
    //   2179: iconst_1
    //   2180: aload_1
    //   2181: getfield obj : Ljava/lang/Object;
    //   2184: checkcast java/lang/Boolean
    //   2187: invokevirtual booleanValue : ()Z
    //   2190: if_icmpeq -> 2196
    //   2193: goto -> 2201
    //   2196: ldc2_w 10000
    //   2199: lstore #5
    //   2201: aload_0
    //   2202: lload #5
    //   2204: putfield b : J
    //   2207: aload_0
    //   2208: getfield o : Lcl;
    //   2211: astore_1
    //   2212: aload_1
    //   2213: bipush #12
    //   2215: invokevirtual removeMessages : (I)V
    //   2218: aload_0
    //   2219: getfield l : Ljava/util/concurrent/ConcurrentHashMap;
    //   2222: invokevirtual keySet : ()Ljava/util/Set;
    //   2225: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2230: astore #8
    //   2232: aload #8
    //   2234: invokeinterface hasNext : ()Z
    //   2239: ifeq -> 2270
    //   2242: aload_1
    //   2243: aload_1
    //   2244: bipush #12
    //   2246: aload #8
    //   2248: invokeinterface next : ()Ljava/lang/Object;
    //   2253: checkcast m5
    //   2256: invokevirtual obtainMessage : (ILjava/lang/Object;)Landroid/os/Message;
    //   2259: aload_0
    //   2260: getfield b : J
    //   2263: invokevirtual sendMessageDelayed : (Landroid/os/Message;J)Z
    //   2266: pop
    //   2267: goto -> 2232
    //   2270: iconst_1
    //   2271: ireturn
    // Exception table:
    //   from	to	target	type
    //   1588	1612	1615	finally
    //   1620	1622	1615	finally
    //   1634	1646	1738	finally
    //   1740	1742	1738	finally
    //   1745	1747	1615	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oe0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */