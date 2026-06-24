import android.content.Context;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class ah1 {
  public boolean a;
  
  public boolean b;
  
  public final gu c;
  
  public final f51 d;
  
  public final List e;
  
  public final np f;
  
  public ac0 g;
  
  public ah1(gu paramgu, f51 paramf51) {
    this.c = paramgu;
    this.d = paramf51;
    List list2 = paramgu.e;
    List list1 = list2;
    if (list2 == null)
      list1 = d40.b; 
    this.e = list1;
    uh1 uh1 = paramgu.p;
    boolean bool = true;
    if (uh1 == null) {
      if (hr1 != null) {
        Context context = paramgu.a;
        context.getClass();
        this.f = new fr1(new bh0(hr1.a(new gr1(context, str, new mi2(this, paramf51.a), false, false))));
      } else {
        l0.l("SQLiteManager was constructed with both null driver and open helper factory!");
        throw null;
      } 
    } else {
      StringBuilder stringBuilder;
      if (str == null) {
        rp rp = new rp(new g7(this, uh1));
      } else {
        g7 g7 = new g7(this, uh1);
        int i = ch1.ordinal();
        if (i != 1) {
          if (i == 2) {
            i = 4;
          } else {
            stringBuilder = new StringBuilder("Can't get max number of reader for journal mode '");
            stringBuilder.append(ch1);
            stringBuilder.append('\'');
            throw new IllegalStateException(stringBuilder.toString().toString());
          } 
        } else {
          i = 1;
        } 
        int j = ch1.ordinal();
        if (j == 1 || j == 2) {
          rp rp = new rp((g7)stringBuilder, str, i);
        } else {
          stringBuilder = new StringBuilder(KjdXPYm.ODS);
          stringBuilder.append(ch1);
          stringBuilder.append('\'');
          throw new IllegalStateException(stringBuilder.toString().toString());
        } 
      } 
      this.f = (np)stringBuilder;
    } 
    if (ch1 != ch1.e)
      bool = false; 
    ir1 ir1 = c();
    if (ir1 != null)
      ir1.setWriteAheadLoggingEnabled(bool); 
  }
  
  public ah1(gu paramgu, ps paramps) {
    this.c = paramgu;
    this.d = new f51(-1, "", "");
    List<pl> list1 = paramgu.e;
    d40<pl> d40 = d40.b;
    if (list1 == null) {
      list2 = d40;
    } else {
      list2 = list1;
    } 
    this.e = list2;
    l l = new l(3, this);
    List<pl> list2 = list1;
    if (list1 == null)
      list2 = d40; 
    pl pl = new pl(l);
    list1 = new ArrayList(list2.size() + 1);
    list1.addAll(list2);
    list1.add(pl);
    Context context = paramgu.a;
    c4 c4 = paramgu.d;
    Executor executor1 = paramgu.h;
    Executor executor2 = paramgu.i;
    list1 = paramgu.m;
    List list = paramgu.n;
    context.getClass();
    c4.getClass();
    executor1.getClass();
    executor2.getClass();
    list1.getClass();
    list.getClass();
    throw new j21(0);
  }
  
  public static final void a(ah1 paramah1, th1 paramth1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lf51;
    //   4: astore #6
    //   6: aload_0
    //   7: getfield c : Lgu;
    //   10: astore #9
    //   12: aload #9
    //   14: getfield g : Lch1;
    //   17: astore #7
    //   19: getstatic ch1.e : Lch1;
    //   22: astore #8
    //   24: aload #7
    //   26: aload #8
    //   28: if_acmpne -> 40
    //   31: aload_1
    //   32: ldc 'PRAGMA journal_mode = WAL'
    //   34: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   37: goto -> 46
    //   40: aload_1
    //   41: ldc 'PRAGMA journal_mode = TRUNCATE'
    //   43: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   46: aload #9
    //   48: getfield g : Lch1;
    //   51: aload #8
    //   53: if_acmpne -> 65
    //   56: aload_1
    //   57: ldc 'PRAGMA synchronous = NORMAL'
    //   59: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   62: goto -> 71
    //   65: aload_1
    //   66: ldc 'PRAGMA synchronous = FULL'
    //   68: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   71: aload_1
    //   72: invokestatic b : (Lth1;)V
    //   75: aload_1
    //   76: ldc 'PRAGMA user_version'
    //   78: invokeinterface O : (Ljava/lang/String;)Lai1;
    //   83: astore #7
    //   85: aload #7
    //   87: invokeinterface L : ()Z
    //   92: pop
    //   93: aload #7
    //   95: iconst_0
    //   96: invokeinterface getLong : (I)J
    //   101: lstore #4
    //   103: lload #4
    //   105: l2i
    //   106: istore_3
    //   107: aload #7
    //   109: aconst_null
    //   110: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   113: aload #6
    //   115: getfield a : I
    //   118: istore_2
    //   119: iload_3
    //   120: iload_2
    //   121: if_icmpeq -> 249
    //   124: aload_1
    //   125: ldc 'BEGIN EXCLUSIVE TRANSACTION'
    //   127: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   130: iload_3
    //   131: ifne -> 147
    //   134: aload_0
    //   135: aload_1
    //   136: invokevirtual d : (Lth1;)V
    //   139: goto -> 154
    //   142: astore #6
    //   144: goto -> 191
    //   147: aload_0
    //   148: aload_1
    //   149: iload_3
    //   150: iload_2
    //   151: invokevirtual e : (Lth1;II)V
    //   154: new java/lang/StringBuilder
    //   157: astore #6
    //   159: aload #6
    //   161: ldc_w 'PRAGMA user_version = '
    //   164: invokespecial <init> : (Ljava/lang/String;)V
    //   167: aload #6
    //   169: iload_2
    //   170: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload_1
    //   175: aload #6
    //   177: invokevirtual toString : ()Ljava/lang/String;
    //   180: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   183: getstatic l02.a : Ll02;
    //   186: astore #6
    //   188: goto -> 202
    //   191: new qg1
    //   194: dup
    //   195: aload #6
    //   197: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   200: astore #6
    //   202: aload #6
    //   204: instanceof qg1
    //   207: ifne -> 224
    //   210: aload #6
    //   212: checkcast l02
    //   215: astore #7
    //   217: aload_1
    //   218: ldc_w 'END TRANSACTION'
    //   221: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   224: aload #6
    //   226: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Throwable;
    //   229: astore #6
    //   231: aload #6
    //   233: ifnonnull -> 239
    //   236: goto -> 249
    //   239: aload_1
    //   240: ldc_w 'ROLLBACK TRANSACTION'
    //   243: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   246: aload #6
    //   248: athrow
    //   249: aload_0
    //   250: aload_1
    //   251: invokevirtual f : (Lth1;)V
    //   254: return
    //   255: astore_0
    //   256: aload_0
    //   257: athrow
    //   258: astore_1
    //   259: aload #7
    //   261: aload_0
    //   262: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   265: aload_1
    //   266: athrow
    // Exception table:
    //   from	to	target	type
    //   85	103	255	finally
    //   134	139	142	finally
    //   147	154	142	finally
    //   154	188	142	finally
    //   256	258	258	finally
  }
  
  public static void b(th1 paramth1) {
    ai1 ai1 = paramth1.O("PRAGMA busy_timeout");
    try {
      ai1.L();
      long l = ai1.getLong(0);
      z51.d(ai1, null);
      return;
    } finally {
      paramth1 = null;
    } 
  }
  
  public final ir1 c() {
    np np1 = this.f;
    if (np1 instanceof fr1) {
      np1 = np1;
    } else {
      np1 = null;
    } 
    return (np1 != null) ? (ir1)((fr1)np1).b.c : null;
  }
  
  public final void d(th1 paramth1) {
    String str;
    boolean bool;
    StringBuilder stringBuilder;
    paramth1.getClass();
    ai1 ai1 = paramth1.O("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
    try {
      boolean bool2 = ai1.L();
      boolean bool1 = false;
      bool = bool1;
      if (bool2) {
        long l = ai1.getLong(0);
        bool = bool1;
        if (l == 0L)
          bool = true; 
      } 
    } finally {
      Exception exception;
    } 
    z51.d(ai1, null);
    f51 f511 = this.d;
    f511.a(paramth1);
    if (!bool) {
      fh1 fh1 = f511.w(paramth1);
      if (!fh1.b) {
        str = fh1.a;
        stringBuilder = new StringBuilder("Pre-packaged database has an invalid schema: ");
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString().toString());
      } 
    } 
    g((th1)str);
    stringBuilder.s((th1)str);
    Iterator<pl> iterator = this.e.iterator();
    while (iterator.hasNext()) {
      ((pl)iterator.next()).getClass();
      if (str instanceof er1)
        ((er1)str).b.getClass(); 
    } 
  }
  
  public final void e(th1 paramth1, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: aload_0
    //   6: getfield c : Lgu;
    //   9: astore #11
    //   11: aload #11
    //   13: getfield d : Lc4;
    //   16: astore #12
    //   18: aload #12
    //   20: invokevirtual getClass : ()Ljava/lang/Class;
    //   23: pop
    //   24: iload_2
    //   25: iload_3
    //   26: if_icmpne -> 37
    //   29: getstatic d40.b : Ld40;
    //   32: astore #9
    //   34: goto -> 329
    //   37: iload_3
    //   38: iload_2
    //   39: if_icmple -> 48
    //   42: iconst_1
    //   43: istore #4
    //   45: goto -> 51
    //   48: iconst_0
    //   49: istore #4
    //   51: new java/util/ArrayList
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: astore #10
    //   60: iload_2
    //   61: istore #5
    //   63: iload #4
    //   65: ifeq -> 77
    //   68: iload #5
    //   70: iload_3
    //   71: if_icmpge -> 325
    //   74: goto -> 83
    //   77: iload #5
    //   79: iload_3
    //   80: if_icmple -> 325
    //   83: aload #12
    //   85: getfield a : Ljava/util/LinkedHashMap;
    //   88: astore #9
    //   90: iload #4
    //   92: ifeq -> 140
    //   95: aload #9
    //   97: iload #5
    //   99: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   102: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   105: checkcast java/util/TreeMap
    //   108: astore #9
    //   110: aload #9
    //   112: ifnonnull -> 121
    //   115: aconst_null
    //   116: astore #9
    //   118: goto -> 179
    //   121: new t51
    //   124: dup
    //   125: aload #9
    //   127: aload #9
    //   129: invokevirtual descendingKeySet : ()Ljava/util/NavigableSet;
    //   132: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   135: astore #9
    //   137: goto -> 179
    //   140: aload #9
    //   142: iload #5
    //   144: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   147: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   150: checkcast java/util/TreeMap
    //   153: astore #9
    //   155: aload #9
    //   157: ifnonnull -> 163
    //   160: goto -> 115
    //   163: new t51
    //   166: dup
    //   167: aload #9
    //   169: aload #9
    //   171: invokevirtual keySet : ()Ljava/util/Set;
    //   174: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   177: astore #9
    //   179: aload #9
    //   181: ifnonnull -> 187
    //   184: goto -> 319
    //   187: aload #9
    //   189: getfield b : Ljava/lang/Object;
    //   192: checkcast java/util/Map
    //   195: astore #13
    //   197: aload #9
    //   199: getfield c : Ljava/lang/Object;
    //   202: checkcast java/lang/Iterable
    //   205: invokeinterface iterator : ()Ljava/util/Iterator;
    //   210: astore #9
    //   212: aload #9
    //   214: invokeinterface hasNext : ()Z
    //   219: ifeq -> 311
    //   222: aload #9
    //   224: invokeinterface next : ()Ljava/lang/Object;
    //   229: checkcast java/lang/Number
    //   232: invokevirtual intValue : ()I
    //   235: istore #7
    //   237: iload #4
    //   239: ifeq -> 260
    //   242: iload #5
    //   244: iconst_1
    //   245: iadd
    //   246: iload #7
    //   248: if_icmpgt -> 212
    //   251: iload #7
    //   253: iload_3
    //   254: if_icmpgt -> 212
    //   257: goto -> 273
    //   260: iload_3
    //   261: iload #7
    //   263: if_icmpgt -> 212
    //   266: iload #7
    //   268: iload #5
    //   270: if_icmpge -> 212
    //   273: aload #13
    //   275: iload #7
    //   277: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   280: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   285: astore #9
    //   287: aload #9
    //   289: invokevirtual getClass : ()Ljava/lang/Class;
    //   292: pop
    //   293: aload #10
    //   295: aload #9
    //   297: invokevirtual add : (Ljava/lang/Object;)Z
    //   300: pop
    //   301: iconst_1
    //   302: istore #6
    //   304: iload #7
    //   306: istore #5
    //   308: goto -> 314
    //   311: iconst_0
    //   312: istore #6
    //   314: iload #6
    //   316: ifne -> 63
    //   319: aconst_null
    //   320: astore #9
    //   322: goto -> 329
    //   325: aload #10
    //   327: astore #9
    //   329: aload_0
    //   330: getfield d : Lf51;
    //   333: astore #10
    //   335: aload #9
    //   337: ifnull -> 450
    //   340: aload #10
    //   342: aload_1
    //   343: invokevirtual v : (Lth1;)V
    //   346: aload #9
    //   348: invokeinterface iterator : ()Ljava/util/Iterator;
    //   353: astore #9
    //   355: aload #9
    //   357: invokeinterface hasNext : ()Z
    //   362: ifeq -> 382
    //   365: aload #9
    //   367: invokeinterface next : ()Ljava/lang/Object;
    //   372: checkcast qx0
    //   375: aload_1
    //   376: invokevirtual b : (Lth1;)V
    //   379: goto -> 355
    //   382: aload #10
    //   384: aload_1
    //   385: invokevirtual w : (Lth1;)Lfh1;
    //   388: astore #9
    //   390: aload #9
    //   392: getfield b : Z
    //   395: ifeq -> 410
    //   398: aload #10
    //   400: aload_1
    //   401: invokevirtual u : (Lth1;)V
    //   404: aload_0
    //   405: aload_1
    //   406: invokevirtual g : (Lth1;)V
    //   409: return
    //   410: aload #9
    //   412: getfield a : Ljava/lang/String;
    //   415: astore #9
    //   417: new java/lang/StringBuilder
    //   420: dup
    //   421: ldc_w 'Migration didn't properly handle: '
    //   424: invokespecial <init> : (Ljava/lang/String;)V
    //   427: astore_1
    //   428: aload_1
    //   429: aload #9
    //   431: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   434: pop
    //   435: new java/lang/IllegalStateException
    //   438: dup
    //   439: aload_1
    //   440: invokevirtual toString : ()Ljava/lang/String;
    //   443: invokevirtual toString : ()Ljava/lang/String;
    //   446: invokespecial <init> : (Ljava/lang/String;)V
    //   449: athrow
    //   450: aload #11
    //   452: iload_2
    //   453: iload_3
    //   454: invokestatic O : (Lgu;II)Z
    //   457: ifne -> 801
    //   460: aload #11
    //   462: getfield o : Z
    //   465: ifeq -> 732
    //   468: aload_1
    //   469: ldc_w 'SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view''
    //   472: invokeinterface O : (Ljava/lang/String;)Lai1;
    //   477: astore #9
    //   479: new tn0
    //   482: astore #11
    //   484: aload #11
    //   486: bipush #10
    //   488: invokespecial <init> : (I)V
    //   491: aload #9
    //   493: invokeinterface L : ()Z
    //   498: ifeq -> 585
    //   501: aload #9
    //   503: iconst_0
    //   504: invokeinterface j : (I)Ljava/lang/String;
    //   509: astore #12
    //   511: aload #12
    //   513: ldc_w 'sqlite_'
    //   516: invokestatic G0 : (Ljava/lang/String;Ljava/lang/String;)Z
    //   519: ifne -> 491
    //   522: aload #12
    //   524: ldc_w 'android_metadata'
    //   527: invokevirtual equals : (Ljava/lang/Object;)Z
    //   530: ifeq -> 536
    //   533: goto -> 491
    //   536: aload #9
    //   538: iconst_1
    //   539: invokeinterface j : (I)Ljava/lang/String;
    //   544: ldc_w 'view'
    //   547: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   550: istore #8
    //   552: new t51
    //   555: astore #13
    //   557: aload #13
    //   559: aload #12
    //   561: iload #8
    //   563: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   566: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   569: aload #11
    //   571: aload #13
    //   573: invokevirtual add : (Ljava/lang/Object;)Z
    //   576: pop
    //   577: goto -> 491
    //   580: astore #10
    //   582: goto -> 719
    //   585: aload #11
    //   587: invokestatic b : (Ltn0;)Ltn0;
    //   590: astore #11
    //   592: aload #9
    //   594: aconst_null
    //   595: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   598: aload #11
    //   600: iconst_0
    //   601: invokevirtual listIterator : (I)Ljava/util/ListIterator;
    //   604: astore #9
    //   606: aload #9
    //   608: checkcast rn0
    //   611: astore #11
    //   613: aload #11
    //   615: invokevirtual hasNext : ()Z
    //   618: ifeq -> 738
    //   621: aload #11
    //   623: invokevirtual next : ()Ljava/lang/Object;
    //   626: checkcast t51
    //   629: astore #12
    //   631: aload #12
    //   633: getfield b : Ljava/lang/Object;
    //   636: checkcast java/lang/String
    //   639: astore #11
    //   641: aload #12
    //   643: getfield c : Ljava/lang/Object;
    //   646: checkcast java/lang/Boolean
    //   649: invokevirtual booleanValue : ()Z
    //   652: ifeq -> 687
    //   655: new java/lang/StringBuilder
    //   658: dup
    //   659: ldc_w 'DROP VIEW IF EXISTS '
    //   662: invokespecial <init> : (Ljava/lang/String;)V
    //   665: astore #12
    //   667: aload #12
    //   669: aload #11
    //   671: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   674: pop
    //   675: aload_1
    //   676: aload #12
    //   678: invokevirtual toString : ()Ljava/lang/String;
    //   681: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   684: goto -> 606
    //   687: new java/lang/StringBuilder
    //   690: dup
    //   691: ldc_w 'DROP TABLE IF EXISTS '
    //   694: invokespecial <init> : (Ljava/lang/String;)V
    //   697: astore #12
    //   699: aload #12
    //   701: aload #11
    //   703: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   706: pop
    //   707: aload_1
    //   708: aload #12
    //   710: invokevirtual toString : ()Ljava/lang/String;
    //   713: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   716: goto -> 606
    //   719: aload #10
    //   721: athrow
    //   722: astore_1
    //   723: aload #9
    //   725: aload #10
    //   727: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   730: aload_1
    //   731: athrow
    //   732: aload #10
    //   734: aload_1
    //   735: invokevirtual c : (Lth1;)V
    //   738: aload_0
    //   739: getfield e : Ljava/util/List;
    //   742: invokeinterface iterator : ()Ljava/util/Iterator;
    //   747: astore #9
    //   749: aload #9
    //   751: invokeinterface hasNext : ()Z
    //   756: ifeq -> 794
    //   759: aload #9
    //   761: invokeinterface next : ()Ljava/lang/Object;
    //   766: checkcast pl
    //   769: invokevirtual getClass : ()Ljava/lang/Class;
    //   772: pop
    //   773: aload_1
    //   774: instanceof er1
    //   777: ifeq -> 749
    //   780: aload_1
    //   781: checkcast er1
    //   784: getfield b : Lac0;
    //   787: invokevirtual getClass : ()Ljava/lang/Class;
    //   790: pop
    //   791: goto -> 749
    //   794: aload #10
    //   796: aload_1
    //   797: invokevirtual a : (Lth1;)V
    //   800: return
    //   801: new java/lang/StringBuilder
    //   804: dup
    //   805: ldc_w 'A migration from '
    //   808: invokespecial <init> : (Ljava/lang/String;)V
    //   811: astore_1
    //   812: aload_1
    //   813: iload_2
    //   814: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   817: pop
    //   818: aload_1
    //   819: ldc_w ' to '
    //   822: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   825: pop
    //   826: aload_1
    //   827: iload_3
    //   828: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   831: pop
    //   832: aload_1
    //   833: ldc_w ' was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.'
    //   836: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   839: pop
    //   840: new java/lang/IllegalStateException
    //   843: dup
    //   844: aload_1
    //   845: invokevirtual toString : ()Ljava/lang/String;
    //   848: invokevirtual toString : ()Ljava/lang/String;
    //   851: invokespecial <init> : (Ljava/lang/String;)V
    //   854: athrow
    // Exception table:
    //   from	to	target	type
    //   479	491	580	finally
    //   491	533	580	finally
    //   536	577	580	finally
    //   585	592	580	finally
    //   719	722	722	finally
  }
  
  public final void f(th1 paramth1) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: aload_1
    //   6: ldc_w 'SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table''
    //   9: invokeinterface O : (Ljava/lang/String;)Lai1;
    //   14: astore #5
    //   16: aload #5
    //   18: invokeinterface L : ()Z
    //   23: ifeq -> 50
    //   26: aload #5
    //   28: iconst_0
    //   29: invokeinterface getLong : (I)J
    //   34: lstore_3
    //   35: lload_3
    //   36: lconst_0
    //   37: lcmp
    //   38: ifeq -> 50
    //   41: iconst_1
    //   42: istore_2
    //   43: goto -> 52
    //   46: astore_1
    //   47: goto -> 568
    //   50: iconst_0
    //   51: istore_2
    //   52: aload #5
    //   54: aconst_null
    //   55: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   58: aload_0
    //   59: getfield d : Lf51;
    //   62: astore #6
    //   64: iload_2
    //   65: ifeq -> 222
    //   68: aload_1
    //   69: ldc_w 'SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1'
    //   72: invokeinterface O : (Ljava/lang/String;)Lai1;
    //   77: astore #7
    //   79: aload #7
    //   81: invokeinterface L : ()Z
    //   86: ifeq -> 107
    //   89: aload #7
    //   91: iconst_0
    //   92: invokeinterface j : (I)Ljava/lang/String;
    //   97: astore #5
    //   99: goto -> 110
    //   102: astore #5
    //   104: goto -> 209
    //   107: aconst_null
    //   108: astore #5
    //   110: aload #7
    //   112: aconst_null
    //   113: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   116: aload #6
    //   118: getfield b : Ljava/lang/Object;
    //   121: checkcast java/lang/String
    //   124: aload #5
    //   126: invokevirtual equals : (Ljava/lang/Object;)Z
    //   129: ifne -> 358
    //   132: aload #6
    //   134: getfield c : Ljava/lang/Object;
    //   137: checkcast java/lang/String
    //   140: aload #5
    //   142: invokevirtual equals : (Ljava/lang/Object;)Z
    //   145: ifeq -> 151
    //   148: goto -> 358
    //   151: aload #6
    //   153: getfield b : Ljava/lang/Object;
    //   156: checkcast java/lang/String
    //   159: astore #6
    //   161: new java/lang/StringBuilder
    //   164: dup
    //   165: ldc_w 'Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: '
    //   168: invokespecial <init> : (Ljava/lang/String;)V
    //   171: astore_1
    //   172: aload_1
    //   173: aload #6
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload_1
    //   180: getstatic org/jaudiotagger/audio/Hy/PwbbJfsdcHrAjW.rTMK : Ljava/lang/String;
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload_1
    //   188: aload #5
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: new java/lang/IllegalStateException
    //   197: dup
    //   198: aload_1
    //   199: invokevirtual toString : ()Ljava/lang/String;
    //   202: invokevirtual toString : ()Ljava/lang/String;
    //   205: invokespecial <init> : (Ljava/lang/String;)V
    //   208: athrow
    //   209: aload #5
    //   211: athrow
    //   212: astore_1
    //   213: aload #7
    //   215: aload #5
    //   217: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   220: aload_1
    //   221: athrow
    //   222: aload_1
    //   223: ldc 'BEGIN EXCLUSIVE TRANSACTION'
    //   225: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   228: aload #6
    //   230: aload_1
    //   231: invokevirtual w : (Lth1;)Lfh1;
    //   234: astore #5
    //   236: aload #5
    //   238: getfield b : Z
    //   241: ifeq -> 268
    //   244: aload #6
    //   246: aload_1
    //   247: invokevirtual u : (Lth1;)V
    //   250: aload_0
    //   251: aload_1
    //   252: invokevirtual g : (Lth1;)V
    //   255: getstatic l02.a : Ll02;
    //   258: astore #5
    //   260: goto -> 324
    //   263: astore #5
    //   265: goto -> 313
    //   268: new java/lang/IllegalStateException
    //   271: astore #8
    //   273: new java/lang/StringBuilder
    //   276: astore #7
    //   278: aload #7
    //   280: ldc_w 'Pre-packaged database has an invalid schema: '
    //   283: invokespecial <init> : (Ljava/lang/String;)V
    //   286: aload #7
    //   288: aload #5
    //   290: getfield a : Ljava/lang/String;
    //   293: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: pop
    //   297: aload #8
    //   299: aload #7
    //   301: invokevirtual toString : ()Ljava/lang/String;
    //   304: invokevirtual toString : ()Ljava/lang/String;
    //   307: invokespecial <init> : (Ljava/lang/String;)V
    //   310: aload #8
    //   312: athrow
    //   313: new qg1
    //   316: dup
    //   317: aload #5
    //   319: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   322: astore #5
    //   324: aload #5
    //   326: instanceof qg1
    //   329: ifne -> 346
    //   332: aload #5
    //   334: checkcast l02
    //   337: astore #7
    //   339: aload_1
    //   340: ldc_w 'END TRANSACTION'
    //   343: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   346: aload #5
    //   348: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Throwable;
    //   351: astore #5
    //   353: aload #5
    //   355: ifnonnull -> 558
    //   358: aload #6
    //   360: aload_1
    //   361: invokevirtual t : (Lth1;)V
    //   364: aload_0
    //   365: getfield e : Ljava/util/List;
    //   368: invokeinterface iterator : ()Ljava/util/Iterator;
    //   373: astore #7
    //   375: aload #7
    //   377: invokeinterface hasNext : ()Z
    //   382: ifeq -> 552
    //   385: aload #7
    //   387: invokeinterface next : ()Ljava/lang/Object;
    //   392: checkcast pl
    //   395: astore #8
    //   397: aload #8
    //   399: invokevirtual getClass : ()Ljava/lang/Class;
    //   402: pop
    //   403: aload_1
    //   404: instanceof er1
    //   407: ifeq -> 375
    //   410: aload_1
    //   411: checkcast er1
    //   414: getfield b : Lac0;
    //   417: astore #5
    //   419: aload #8
    //   421: getfield a : I
    //   424: istore_2
    //   425: aload #5
    //   427: invokevirtual getClass : ()Ljava/lang/Class;
    //   430: pop
    //   431: iload_2
    //   432: tableswitch default -> 452, 0 -> 469
    //   452: aload #8
    //   454: getfield b : Ljava/lang/Object;
    //   457: checkcast l
    //   460: aload #5
    //   462: invokevirtual h : (Ljava/lang/Object;)Ljava/lang/Object;
    //   465: pop
    //   466: goto -> 375
    //   469: aload #5
    //   471: invokevirtual a : ()V
    //   474: new java/lang/StringBuilder
    //   477: astore #6
    //   479: aload #6
    //   481: ldc_w 'DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < '
    //   484: invokespecial <init> : (Ljava/lang/String;)V
    //   487: aload #8
    //   489: getfield b : Ljava/lang/Object;
    //   492: checkcast fb0
    //   495: invokevirtual getClass : ()Ljava/lang/Class;
    //   498: pop
    //   499: aload #6
    //   501: invokestatic currentTimeMillis : ()J
    //   504: ldc2_w 86400000
    //   507: lsub
    //   508: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   511: pop
    //   512: aload #6
    //   514: ldc_w ' AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))'
    //   517: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   520: pop
    //   521: aload #5
    //   523: aload #6
    //   525: invokevirtual toString : ()Ljava/lang/String;
    //   528: invokevirtual h : (Ljava/lang/String;)V
    //   531: aload #5
    //   533: invokevirtual m : ()V
    //   536: aload #5
    //   538: invokevirtual g : ()V
    //   541: goto -> 375
    //   544: astore_1
    //   545: aload #5
    //   547: invokevirtual g : ()V
    //   550: aload_1
    //   551: athrow
    //   552: aload_0
    //   553: iconst_1
    //   554: putfield a : Z
    //   557: return
    //   558: aload_1
    //   559: ldc_w 'ROLLBACK TRANSACTION'
    //   562: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   565: aload #5
    //   567: athrow
    //   568: aload_1
    //   569: athrow
    //   570: astore #6
    //   572: aload #5
    //   574: aload_1
    //   575: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   578: aload #6
    //   580: athrow
    // Exception table:
    //   from	to	target	type
    //   16	35	46	finally
    //   79	99	102	finally
    //   209	212	212	finally
    //   228	260	263	finally
    //   268	313	263	finally
    //   474	536	544	finally
    //   568	570	570	finally
  }
  
  public final void g(th1 paramth1) {
    m92.n(paramth1, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    String str = (String)this.d.b;
    StringBuilder stringBuilder = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
    stringBuilder.append(str);
    stringBuilder.append("')");
    m92.n(paramth1, stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ah1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */