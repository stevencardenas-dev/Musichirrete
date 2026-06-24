import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class nf1 {
  public static final rp0 j = new rp0("RemoteMediaClient", null);
  
  public final Object a;
  
  public final cl b;
  
  public final te2 c;
  
  public final p01 d;
  
  public final rt0 e;
  
  public pg2 f;
  
  public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
  
  public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
  
  public final ConcurrentHashMap i;
  
  static {
    String str = te2.w;
  }
  
  public nf1(te2 paramte2) {
    new ConcurrentHashMap<Object, Object>();
    this.i = new ConcurrentHashMap<Object, Object>();
    this.a = new Object();
    this.b = new cl(Looper.getMainLooper(), 6);
    p01 p011 = new p01(this);
    this.d = p011;
    this.c = paramte2;
    paramte2.h = new a42(13, this);
    paramte2.c = p011;
    this.e = new rt0(this);
  }
  
  public static nf2 u() {
    BasePendingResult basePendingResult = new BasePendingResult();
    basePendingResult.e(new kf2((nf2)basePendingResult, new Status(17, null, null, null)));
    return (nf2)basePendingResult;
  }
  
  public static final void w(cg2 paramcg2) {
    try {
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw illegalArgumentException;
    } finally {
      Exception exception = null;
      illegalArgumentException.e(new kf2((cg2)illegalArgumentException, new Status(2100, null, null, null)));
    } 
  }
  
  public final long a() {
    synchronized (this.a) {
      n21.j();
      return this.c.o();
    } 
  }
  
  public final int b() {
    boolean bool;
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      n21.j();
      kw0 kw0 = d();
      if (kw0 != null) {
        bool = kw0.h;
      } else {
        bool = false;
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    return bool;
  }
  
  public final MediaInfo c() {
    synchronized (this.a) {
      MediaInfo mediaInfo;
      n21.j();
      kw0 kw0 = this.c.f;
      if (kw0 == null) {
        kw0 = null;
      } else {
        mediaInfo = kw0.b;
      } 
      return mediaInfo;
    } 
  }
  
  public final kw0 d() {
    synchronized (this.a) {
      n21.j();
      return this.c.f;
    } 
  }
  
  public final int e() {
    boolean bool;
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      n21.j();
      kw0 kw0 = d();
      if (kw0 != null) {
        bool = kw0.g;
      } else {
        bool = true;
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    return bool;
  }
  
  public final long f() {
    synchronized (this.a) {
      long l;
      MediaInfo mediaInfo;
      n21.j();
      kw0 kw0 = this.c.f;
      if (kw0 == null) {
        kw0 = null;
      } else {
        mediaInfo = kw0.b;
      } 
      if (mediaInfo != null) {
        l = mediaInfo.g;
      } else {
        l = 0L;
      } 
      return l;
    } 
  }
  
  public final boolean g() {
    n21.j();
    if (!h()) {
      n21.j();
      kw0 kw0 = d();
      if ((kw0 == null || kw0.g != 5) && !l() && !k() && !j())
        return false; 
    } 
    return true;
  }
  
  public final boolean h() {
    n21.j();
    kw0 kw0 = d();
    return (kw0 != null && kw0.g == 4);
  }
  
  public final boolean i() {
    n21.j();
    MediaInfo mediaInfo = c();
    return (mediaInfo != null && mediaInfo.c == 2);
  }
  
  public final boolean j() {
    n21.j();
    kw0 kw0 = d();
    return (kw0 != null && kw0.n != 0);
  }
  
  public final boolean k() {
    n21.j();
    kw0 kw0 = d();
    return !(kw0 == null || (kw0.g != 3 && (!i() || b() != 2)));
  }
  
  public final boolean l() {
    n21.j();
    kw0 kw0 = d();
    return (kw0 != null && kw0.g == 2);
  }
  
  public final boolean m() {
    n21.j();
    kw0 kw0 = d();
    return (kw0 != null && kw0.t);
  }
  
  public final void n(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Lte2;
    //   4: astore #11
    //   6: aload #11
    //   8: getfield j : Ldf2;
    //   11: astore #15
    //   13: aload #11
    //   15: getfield d : Ljava/util/List;
    //   18: astore #13
    //   20: aload #11
    //   22: getfield a : Lrp0;
    //   25: astore #10
    //   27: aload #10
    //   29: ldc 'message received: %s'
    //   31: iconst_1
    //   32: anewarray java/lang/Object
    //   35: dup
    //   36: iconst_0
    //   37: aload_1
    //   38: aastore
    //   39: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aload #10
    //   44: getfield a : Ljava/lang/String;
    //   47: astore #9
    //   49: new org/json/JSONObject
    //   52: astore #12
    //   54: aload #12
    //   56: aload_1
    //   57: invokespecial <init> : (Ljava/lang/String;)V
    //   60: aload #12
    //   62: ldc 'type'
    //   64: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   67: astore #16
    //   69: aload #12
    //   71: ldc 'requestId'
    //   73: ldc2_w -1
    //   76: invokevirtual optLong : (Ljava/lang/String;J)J
    //   79: lstore #7
    //   81: aload #16
    //   83: invokevirtual hashCode : ()I
    //   86: istore_3
    //   87: getstatic com/google/android/gms/common/api/internal/jEVH/KjdXPYm.iHyuoyYLZokoErE : Ljava/lang/String;
    //   90: astore #14
    //   92: iconst_0
    //   93: istore_2
    //   94: iload_3
    //   95: lookupswitch default -> 176, -1830647528 -> 1645, -1790231854 -> 1494, -1125000185 -> 1420, -262628938 -> 1393, 66247144 -> 1277, 154411710 -> 792, 431600379 -> 718, 823510221 -> 287, 2107149050 -> 179
    //   176: goto -> 1671
    //   179: aload #16
    //   181: ldc 'QUEUE_ITEM_IDS'
    //   183: invokevirtual equals : (Ljava/lang/Object;)Z
    //   186: ifeq -> 1671
    //   189: aload #11
    //   191: getfield s : Ldf2;
    //   194: lload #7
    //   196: iconst_0
    //   197: aconst_null
    //   198: invokevirtual d : (JILfb0;)V
    //   201: aload #11
    //   203: aload #12
    //   205: ldc 'QUEUE_ITEM_IDS'
    //   207: invokevirtual d : (Lorg/json/JSONObject;Ljava/lang/String;)V
    //   210: aload #11
    //   212: getfield h : La42;
    //   215: ifnull -> 1671
    //   218: aload #12
    //   220: aload #14
    //   222: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   225: invokestatic e : (Lorg/json/JSONArray;)[I
    //   228: astore #12
    //   230: aload #12
    //   232: ifnull -> 1671
    //   235: aload #11
    //   237: getfield h : La42;
    //   240: getfield c : Ljava/lang/Object;
    //   243: checkcast nf1
    //   246: getfield h : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   249: invokevirtual iterator : ()Ljava/util/Iterator;
    //   252: astore #11
    //   254: aload #11
    //   256: invokeinterface hasNext : ()Z
    //   261: ifeq -> 1671
    //   264: aload #11
    //   266: invokeinterface next : ()Ljava/lang/Object;
    //   271: checkcast zk
    //   274: aload #12
    //   276: invokevirtual g : ([I)V
    //   279: goto -> 254
    //   282: astore #11
    //   284: goto -> 1672
    //   287: aload #16
    //   289: ldc_w 'MEDIA_STATUS'
    //   292: invokevirtual equals : (Ljava/lang/Object;)Z
    //   295: ifeq -> 1671
    //   298: aload #12
    //   300: ldc_w 'status'
    //   303: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   306: astore #12
    //   308: aload #12
    //   310: invokevirtual length : ()I
    //   313: ifle -> 653
    //   316: aload #12
    //   318: iconst_0
    //   319: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
    //   322: astore #12
    //   324: aload #15
    //   326: lload #7
    //   328: invokevirtual c : (J)Z
    //   331: istore #5
    //   333: aload #11
    //   335: getfield o : Ldf2;
    //   338: astore #14
    //   340: aload #14
    //   342: invokevirtual b : ()Z
    //   345: istore #6
    //   347: iconst_1
    //   348: istore #4
    //   350: iload #6
    //   352: ifeq -> 373
    //   355: aload #14
    //   357: lload #7
    //   359: invokevirtual c : (J)Z
    //   362: ifeq -> 368
    //   365: goto -> 373
    //   368: iconst_1
    //   369: istore_2
    //   370: goto -> 403
    //   373: aload #11
    //   375: getfield p : Ldf2;
    //   378: astore #14
    //   380: aload #14
    //   382: invokevirtual b : ()Z
    //   385: ifeq -> 401
    //   388: aload #14
    //   390: lload #7
    //   392: invokevirtual c : (J)Z
    //   395: ifne -> 401
    //   398: goto -> 368
    //   401: iconst_0
    //   402: istore_2
    //   403: iload #5
    //   405: ifne -> 435
    //   408: aload #11
    //   410: getfield f : Lkw0;
    //   413: astore #14
    //   415: aload #14
    //   417: ifnonnull -> 423
    //   420: goto -> 435
    //   423: aload #14
    //   425: aload #12
    //   427: iload_2
    //   428: invokevirtual e : (Lorg/json/JSONObject;I)I
    //   431: istore_3
    //   432: goto -> 493
    //   435: new kw0
    //   438: astore #14
    //   440: aload #14
    //   442: aconst_null
    //   443: lconst_0
    //   444: iconst_0
    //   445: dconst_0
    //   446: iconst_0
    //   447: iconst_0
    //   448: lconst_0
    //   449: lconst_0
    //   450: dconst_0
    //   451: iconst_0
    //   452: aconst_null
    //   453: iconst_0
    //   454: iconst_0
    //   455: aconst_null
    //   456: iconst_0
    //   457: aconst_null
    //   458: iconst_0
    //   459: aconst_null
    //   460: aconst_null
    //   461: aconst_null
    //   462: aconst_null
    //   463: invokespecial <init> : (Lcom/google/android/gms/cast/MediaInfo;JIDIIJJDZ[JIILjava/lang/String;ILjava/util/ArrayList;ZLr2;Lf22;Lit0;Ltt0;)V
    //   466: aload #14
    //   468: aload #12
    //   470: iconst_0
    //   471: invokevirtual e : (Lorg/json/JSONObject;I)I
    //   474: pop
    //   475: aload #11
    //   477: aload #14
    //   479: putfield f : Lkw0;
    //   482: aload #11
    //   484: invokestatic elapsedRealtime : ()J
    //   487: putfield e : J
    //   490: bipush #127
    //   492: istore_3
    //   493: iload_3
    //   494: iconst_1
    //   495: iand
    //   496: ifeq -> 518
    //   499: aload #11
    //   501: invokestatic elapsedRealtime : ()J
    //   504: putfield e : J
    //   507: aload #11
    //   509: iconst_m1
    //   510: putfield i : I
    //   513: iconst_1
    //   514: istore_2
    //   515: goto -> 520
    //   518: iconst_0
    //   519: istore_2
    //   520: iload_3
    //   521: iconst_2
    //   522: iand
    //   523: ifeq -> 540
    //   526: aload #11
    //   528: invokestatic elapsedRealtime : ()J
    //   531: putfield e : J
    //   534: iload #4
    //   536: istore_2
    //   537: goto -> 540
    //   540: iload_3
    //   541: sipush #128
    //   544: iand
    //   545: ifeq -> 556
    //   548: aload #11
    //   550: invokestatic elapsedRealtime : ()J
    //   553: putfield e : J
    //   556: iload_3
    //   557: iconst_4
    //   558: iand
    //   559: ifeq -> 567
    //   562: aload #11
    //   564: invokevirtual g : ()V
    //   567: iload_3
    //   568: bipush #8
    //   570: iand
    //   571: ifeq -> 579
    //   574: aload #11
    //   576: invokevirtual h : ()V
    //   579: iload_3
    //   580: bipush #16
    //   582: iand
    //   583: ifeq -> 591
    //   586: aload #11
    //   588: invokevirtual i : ()V
    //   591: iload_3
    //   592: bipush #32
    //   594: iand
    //   595: ifeq -> 623
    //   598: aload #11
    //   600: invokestatic elapsedRealtime : ()J
    //   603: putfield e : J
    //   606: aload #11
    //   608: getfield h : La42;
    //   611: astore #12
    //   613: aload #12
    //   615: ifnull -> 623
    //   618: aload #12
    //   620: invokevirtual w : ()V
    //   623: iload_3
    //   624: bipush #64
    //   626: iand
    //   627: ifeq -> 641
    //   630: aload #11
    //   632: invokestatic elapsedRealtime : ()J
    //   635: putfield e : J
    //   638: goto -> 645
    //   641: iload_2
    //   642: ifeq -> 679
    //   645: aload #11
    //   647: invokevirtual f : ()V
    //   650: goto -> 679
    //   653: aload #11
    //   655: aconst_null
    //   656: putfield f : Lkw0;
    //   659: aload #11
    //   661: invokevirtual f : ()V
    //   664: aload #11
    //   666: invokevirtual g : ()V
    //   669: aload #11
    //   671: invokevirtual h : ()V
    //   674: aload #11
    //   676: invokevirtual i : ()V
    //   679: aload #13
    //   681: invokeinterface iterator : ()Ljava/util/Iterator;
    //   686: astore #11
    //   688: aload #11
    //   690: invokeinterface hasNext : ()Z
    //   695: ifeq -> 1671
    //   698: aload #11
    //   700: invokeinterface next : ()Ljava/lang/Object;
    //   705: checkcast df2
    //   708: lload #7
    //   710: iconst_0
    //   711: aconst_null
    //   712: invokevirtual d : (JILfb0;)V
    //   715: goto -> 688
    //   718: aload #16
    //   720: ldc_w 'INVALID_PLAYER_STATE'
    //   723: invokevirtual equals : (Ljava/lang/Object;)Z
    //   726: ifeq -> 1671
    //   729: aload #9
    //   731: aload #10
    //   733: ldc_w 'received unexpected error: Invalid Player State.'
    //   736: iconst_0
    //   737: anewarray java/lang/Object
    //   740: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   743: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   746: pop
    //   747: aload #13
    //   749: invokeinterface iterator : ()Ljava/util/Iterator;
    //   754: astore #11
    //   756: aload #11
    //   758: invokeinterface hasNext : ()Z
    //   763: ifeq -> 1671
    //   766: aload #11
    //   768: invokeinterface next : ()Ljava/lang/Object;
    //   773: checkcast df2
    //   776: lload #7
    //   778: sipush #2100
    //   781: aload #12
    //   783: invokestatic k : (Lorg/json/JSONObject;)Lfb0;
    //   786: invokevirtual d : (JILfb0;)V
    //   789: goto -> 756
    //   792: aload #16
    //   794: ldc_w 'QUEUE_CHANGE'
    //   797: invokevirtual equals : (Ljava/lang/Object;)Z
    //   800: ifeq -> 1671
    //   803: aload #11
    //   805: getfield u : Ldf2;
    //   808: lload #7
    //   810: iconst_0
    //   811: aconst_null
    //   812: invokevirtual d : (JILfb0;)V
    //   815: aload #11
    //   817: aload #12
    //   819: ldc_w 'QUEUE_CHANGE'
    //   822: invokevirtual d : (Lorg/json/JSONObject;Ljava/lang/String;)V
    //   825: aload #11
    //   827: getfield h : La42;
    //   830: ifnull -> 1671
    //   833: aload #12
    //   835: getstatic com/google/android/gms/common/internal/Qg/jHxlGgUTadw.clG : Ljava/lang/String;
    //   838: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   841: astore #15
    //   843: aload #12
    //   845: aload #14
    //   847: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   850: invokestatic e : (Lorg/json/JSONArray;)[I
    //   853: astore #13
    //   855: aload #12
    //   857: ldc_w 'insertBefore'
    //   860: iconst_0
    //   861: invokevirtual optInt : (Ljava/lang/String;I)I
    //   864: istore_2
    //   865: aload #13
    //   867: ifnull -> 1671
    //   870: aload #15
    //   872: invokevirtual hashCode : ()I
    //   875: istore_3
    //   876: iload_3
    //   877: lookupswitch default -> 920, -2130463047 -> 1218, -1881281404 -> 1160, -1785516855 -> 981, 1122976047 -> 923
    //   920: goto -> 1671
    //   923: aload #15
    //   925: ldc_w 'ITEMS_CHANGE'
    //   928: invokevirtual equals : (Ljava/lang/Object;)Z
    //   931: ifeq -> 1671
    //   934: aload #11
    //   936: getfield h : La42;
    //   939: getfield c : Ljava/lang/Object;
    //   942: checkcast nf1
    //   945: getfield h : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   948: invokevirtual iterator : ()Ljava/util/Iterator;
    //   951: astore #11
    //   953: aload #11
    //   955: invokeinterface hasNext : ()Z
    //   960: ifeq -> 1671
    //   963: aload #11
    //   965: invokeinterface next : ()Ljava/lang/Object;
    //   970: checkcast zk
    //   973: aload #13
    //   975: invokevirtual k : ([I)V
    //   978: goto -> 953
    //   981: aload #15
    //   983: ldc_w 'UPDATE'
    //   986: invokevirtual equals : (Ljava/lang/Object;)Z
    //   989: ifeq -> 1671
    //   992: aload #12
    //   994: aload #14
    //   996: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   999: invokestatic e : (Lorg/json/JSONArray;)[I
    //   1002: astore #13
    //   1004: ldc_w 'A list of item IDs is expected in a QUEUE UPDATE message.'
    //   1007: aload #13
    //   1009: invokestatic n : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1012: aload #12
    //   1014: ldc_w 'reorderItemIds'
    //   1017: invokevirtual optJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   1020: astore #14
    //   1022: aload #14
    //   1024: ifnull -> 1113
    //   1027: aload #13
    //   1029: invokestatic e : ([I)Ljava/util/ArrayList;
    //   1032: astore #13
    //   1034: aload #12
    //   1036: ldc_w 'insertBefore'
    //   1039: iconst_0
    //   1040: invokevirtual optInt : (Ljava/lang/String;I)I
    //   1043: istore_2
    //   1044: aload #14
    //   1046: invokestatic e : (Lorg/json/JSONArray;)[I
    //   1049: astore #12
    //   1051: aload #12
    //   1053: invokestatic m : (Ljava/lang/Object;)V
    //   1056: aload #12
    //   1058: invokestatic e : ([I)Ljava/util/ArrayList;
    //   1061: astore #12
    //   1063: aload #11
    //   1065: getfield h : La42;
    //   1068: getfield c : Ljava/lang/Object;
    //   1071: checkcast nf1
    //   1074: getfield h : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   1077: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1080: astore #11
    //   1082: aload #11
    //   1084: invokeinterface hasNext : ()Z
    //   1089: ifeq -> 1671
    //   1092: aload #11
    //   1094: invokeinterface next : ()Ljava/lang/Object;
    //   1099: checkcast zk
    //   1102: aload #13
    //   1104: aload #12
    //   1106: iload_2
    //   1107: invokevirtual q : (Ljava/util/ArrayList;Ljava/util/ArrayList;I)V
    //   1110: goto -> 1082
    //   1113: aload #11
    //   1115: getfield h : La42;
    //   1118: getfield c : Ljava/lang/Object;
    //   1121: checkcast nf1
    //   1124: getfield h : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   1127: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1130: astore #11
    //   1132: aload #11
    //   1134: invokeinterface hasNext : ()Z
    //   1139: ifeq -> 1671
    //   1142: aload #11
    //   1144: invokeinterface next : ()Ljava/lang/Object;
    //   1149: checkcast zk
    //   1152: aload #13
    //   1154: invokevirtual g : ([I)V
    //   1157: goto -> 1132
    //   1160: aload #15
    //   1162: ldc_w 'REMOVE'
    //   1165: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1168: ifeq -> 1671
    //   1171: aload #11
    //   1173: getfield h : La42;
    //   1176: getfield c : Ljava/lang/Object;
    //   1179: checkcast nf1
    //   1182: getfield h : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   1185: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1188: astore #11
    //   1190: aload #11
    //   1192: invokeinterface hasNext : ()Z
    //   1197: ifeq -> 1671
    //   1200: aload #11
    //   1202: invokeinterface next : ()Ljava/lang/Object;
    //   1207: checkcast zk
    //   1210: aload #13
    //   1212: invokevirtual m : ([I)V
    //   1215: goto -> 1190
    //   1218: aload #15
    //   1220: ldc_w 'INSERT'
    //   1223: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1226: ifeq -> 1671
    //   1229: aload #11
    //   1231: getfield h : La42;
    //   1234: getfield c : Ljava/lang/Object;
    //   1237: checkcast nf1
    //   1240: getfield h : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   1243: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1246: astore #11
    //   1248: aload #11
    //   1250: invokeinterface hasNext : ()Z
    //   1255: ifeq -> 1671
    //   1258: aload #11
    //   1260: invokeinterface next : ()Ljava/lang/Object;
    //   1265: checkcast zk
    //   1268: aload #13
    //   1270: iload_2
    //   1271: invokevirtual i : ([II)V
    //   1274: goto -> 1248
    //   1277: aload #16
    //   1279: ldc_w 'ERROR'
    //   1282: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1285: ifeq -> 1671
    //   1288: aload #13
    //   1290: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1295: astore #13
    //   1297: aload #13
    //   1299: invokeinterface hasNext : ()Z
    //   1304: ifeq -> 1333
    //   1307: aload #13
    //   1309: invokeinterface next : ()Ljava/lang/Object;
    //   1314: checkcast df2
    //   1317: lload #7
    //   1319: sipush #2100
    //   1322: aload #12
    //   1324: invokestatic k : (Lorg/json/JSONObject;)Lfb0;
    //   1327: invokevirtual d : (JILfb0;)V
    //   1330: goto -> 1297
    //   1333: aload #11
    //   1335: getfield h : La42;
    //   1338: ifnull -> 1671
    //   1341: aload #12
    //   1343: invokestatic e : (Lorg/json/JSONObject;)Lcom/google/android/gms/cast/MediaError;
    //   1346: pop
    //   1347: aload #11
    //   1349: getfield h : La42;
    //   1352: getfield c : Ljava/lang/Object;
    //   1355: checkcast nf1
    //   1358: getfield h : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   1361: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1364: astore #11
    //   1366: aload #11
    //   1368: invokeinterface hasNext : ()Z
    //   1373: ifeq -> 1671
    //   1376: aload #11
    //   1378: invokeinterface next : ()Ljava/lang/Object;
    //   1383: checkcast zk
    //   1386: invokevirtual getClass : ()Ljava/lang/Class;
    //   1389: pop
    //   1390: goto -> 1366
    //   1393: aload #16
    //   1395: ldc_w 'LOAD_FAILED'
    //   1398: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1401: ifeq -> 1671
    //   1404: aload #15
    //   1406: lload #7
    //   1408: sipush #2100
    //   1411: aload #12
    //   1413: invokestatic k : (Lorg/json/JSONObject;)Lfb0;
    //   1416: invokevirtual d : (JILfb0;)V
    //   1419: return
    //   1420: aload #16
    //   1422: ldc_w 'INVALID_REQUEST'
    //   1425: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1428: ifeq -> 1671
    //   1431: aload #9
    //   1433: aload #10
    //   1435: ldc_w 'received unexpected error: Invalid Request.'
    //   1438: iconst_0
    //   1439: anewarray java/lang/Object
    //   1442: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1445: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1448: pop
    //   1449: aload #13
    //   1451: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1456: astore #11
    //   1458: aload #11
    //   1460: invokeinterface hasNext : ()Z
    //   1465: ifeq -> 1671
    //   1468: aload #11
    //   1470: invokeinterface next : ()Ljava/lang/Object;
    //   1475: checkcast df2
    //   1478: lload #7
    //   1480: sipush #2001
    //   1483: aload #12
    //   1485: invokestatic k : (Lorg/json/JSONObject;)Lfb0;
    //   1488: invokevirtual d : (JILfb0;)V
    //   1491: goto -> 1458
    //   1494: aload #16
    //   1496: ldc_w 'QUEUE_ITEMS'
    //   1499: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1502: ifeq -> 1671
    //   1505: aload #11
    //   1507: getfield t : Ldf2;
    //   1510: lload #7
    //   1512: iconst_0
    //   1513: aconst_null
    //   1514: invokevirtual d : (JILfb0;)V
    //   1517: aload #11
    //   1519: aload #12
    //   1521: ldc_w 'QUEUE_ITEMS'
    //   1524: invokevirtual d : (Lorg/json/JSONObject;Ljava/lang/String;)V
    //   1527: aload #11
    //   1529: getfield h : La42;
    //   1532: ifnonnull -> 1538
    //   1535: goto -> 1671
    //   1538: aload #12
    //   1540: ldc_w 'items'
    //   1543: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   1546: astore #13
    //   1548: aload #13
    //   1550: invokevirtual length : ()I
    //   1553: anewarray ut0
    //   1556: astore #12
    //   1558: iload_2
    //   1559: aload #13
    //   1561: invokevirtual length : ()I
    //   1564: if_icmpge -> 1598
    //   1567: new bh0
    //   1570: astore #14
    //   1572: aload #14
    //   1574: aload #13
    //   1576: iload_2
    //   1577: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
    //   1580: invokespecial <init> : (Lorg/json/JSONObject;)V
    //   1583: aload #12
    //   1585: iload_2
    //   1586: aload #14
    //   1588: invokevirtual o : ()Lut0;
    //   1591: aastore
    //   1592: iinc #2, 1
    //   1595: goto -> 1558
    //   1598: aload #11
    //   1600: getfield h : La42;
    //   1603: getfield c : Ljava/lang/Object;
    //   1606: checkcast nf1
    //   1609: getfield h : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   1612: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1615: astore #11
    //   1617: aload #11
    //   1619: invokeinterface hasNext : ()Z
    //   1624: ifeq -> 1671
    //   1627: aload #11
    //   1629: invokeinterface next : ()Ljava/lang/Object;
    //   1634: checkcast zk
    //   1637: aload #12
    //   1639: invokevirtual o : ([Lut0;)V
    //   1642: goto -> 1617
    //   1645: aload #16
    //   1647: ldc_w 'LOAD_CANCELLED'
    //   1650: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1653: ifeq -> 1671
    //   1656: aload #15
    //   1658: lload #7
    //   1660: sipush #2101
    //   1663: aload #12
    //   1665: invokestatic k : (Lorg/json/JSONObject;)Lfb0;
    //   1668: invokevirtual d : (JILfb0;)V
    //   1671: return
    //   1672: aload #9
    //   1674: aload #10
    //   1676: ldc_w 'Message is malformed (%s); ignoring: %s'
    //   1679: iconst_2
    //   1680: anewarray java/lang/Object
    //   1683: dup
    //   1684: iconst_0
    //   1685: aload #11
    //   1687: invokevirtual getMessage : ()Ljava/lang/String;
    //   1690: aastore
    //   1691: dup
    //   1692: iconst_1
    //   1693: aload_1
    //   1694: aastore
    //   1695: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1698: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1701: pop
    //   1702: return
    // Exception table:
    //   from	to	target	type
    //   49	87	282	org/json/JSONException
    //   189	230	282	org/json/JSONException
    //   235	254	282	org/json/JSONException
    //   254	279	282	org/json/JSONException
    //   298	347	282	org/json/JSONException
    //   355	365	282	org/json/JSONException
    //   373	398	282	org/json/JSONException
    //   408	415	282	org/json/JSONException
    //   423	432	282	org/json/JSONException
    //   435	490	282	org/json/JSONException
    //   499	513	282	org/json/JSONException
    //   526	534	282	org/json/JSONException
    //   548	556	282	org/json/JSONException
    //   562	567	282	org/json/JSONException
    //   574	579	282	org/json/JSONException
    //   586	591	282	org/json/JSONException
    //   598	613	282	org/json/JSONException
    //   618	623	282	org/json/JSONException
    //   630	638	282	org/json/JSONException
    //   645	650	282	org/json/JSONException
    //   653	679	282	org/json/JSONException
    //   679	688	282	org/json/JSONException
    //   688	715	282	org/json/JSONException
    //   729	756	282	org/json/JSONException
    //   756	789	282	org/json/JSONException
    //   803	865	282	org/json/JSONException
    //   870	876	282	org/json/JSONException
    //   934	953	282	org/json/JSONException
    //   953	978	282	org/json/JSONException
    //   992	1022	282	org/json/JSONException
    //   1027	1082	282	org/json/JSONException
    //   1082	1110	282	org/json/JSONException
    //   1113	1132	282	org/json/JSONException
    //   1132	1157	282	org/json/JSONException
    //   1171	1190	282	org/json/JSONException
    //   1190	1215	282	org/json/JSONException
    //   1229	1248	282	org/json/JSONException
    //   1248	1274	282	org/json/JSONException
    //   1288	1297	282	org/json/JSONException
    //   1297	1330	282	org/json/JSONException
    //   1333	1366	282	org/json/JSONException
    //   1366	1390	282	org/json/JSONException
    //   1404	1419	282	org/json/JSONException
    //   1431	1458	282	org/json/JSONException
    //   1458	1491	282	org/json/JSONException
    //   1505	1535	282	org/json/JSONException
    //   1538	1558	282	org/json/JSONException
    //   1558	1592	282	org/json/JSONException
    //   1598	1617	282	org/json/JSONException
    //   1617	1642	282	org/json/JSONException
    //   1656	1671	282	org/json/JSONException
  }
  
  public final void o(zk paramzk) {
    n21.j();
    if (paramzk != null)
      this.h.add(paramzk); 
  }
  
  public final BasePendingResult p(ov0 paramov0) {
    n21.j();
    if (!v())
      return u(); 
    ce2 ce2 = new ce2(this, paramov0, 2);
    w(ce2);
    return ce2;
  }
  
  public final void q() {
    n21.j();
    int i = e();
    if (i == 4 || i == 2) {
      n21.j();
      if (!v()) {
        u();
        return;
      } 
      w(new hd2(this, 3, false));
      return;
    } 
    n21.j();
    if (!v()) {
      u();
      return;
    } 
    w(new hd2(this, 5, false));
  }
  
  public final void r(pg2 parampg2) {
    pg2 pg21 = this.f;
    if (pg21 != parampg2) {
      if (pg21 != null) {
        te2 te21 = this.c;
        List list = te21.d;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/List}, name=null} */
        try {
          Iterator<df2> iterator = list.iterator();
          while (iterator.hasNext())
            ((df2)iterator.next()).e(2002); 
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/List}, name=null} */
        te21.j();
        this.e.a();
        n21.j();
        String str = this.c.b;
        if (!TextUtils.isEmpty(str)) {
          HashMap hashMap;
          ah ah;
          synchronized (pg21.C) {
            nf1 nf11 = (nf1)hashMap.remove(str);
            ah = ah.b();
            ah.d = new p01(pg21, nf11, str, 15);
            ah.b = 8414;
            pg21.c(1, ah.a());
            this.d.c = null;
            this.b.removeCallbacksAndMessages(null);
          } 
        } else {
          l0.l("Channel namespace cannot be null or empty");
          return;
        } 
      } 
      this.f = parampg2;
      if (parampg2 != null)
        this.d.c = parampg2; 
    } 
  }
  
  public final void s() {
    HashMap<String, nf1> hashMap;
    ah ah;
    null = this.f;
    if (null == null)
      return; 
    n21.j();
    String str = this.c.b;
    qj.b(str);
    synchronized (null.C) {
      hashMap.put(str, this);
      ah = ah.b();
      ah.d = new zv0(null, str, this, 18);
      ah.b = 8413;
      null.c(1, ah.a());
      n21.j();
      if (!v()) {
        u();
        return;
      } 
      w(new hd2(this, 6));
      return;
    } 
  }
  
  public final int t() {
    if (c() != null && g()) {
      if (h())
        return 6; 
      if (l())
        return 3; 
      if (k())
        return 2; 
      if (j()) {
        n21.j();
        kw0 kw0 = d();
        ut0 ut0 = null;
        if (kw0 != null) {
          int i = kw0.n;
          Integer integer = (Integer)kw0.z.get(i);
          if (integer != null)
            ut0 = kw0.s.get(integer.intValue()); 
        } 
        if (ut0 != null && ut0.b != null)
          return 6; 
      } 
    } 
    return 0;
  }
  
  public final boolean v() {
    return (this.f != null);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */