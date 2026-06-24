import in.krosbits.musicolet.MyApplication;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Pattern;

public final class q3 implements xj1, Serializable {
  public static final String C = MyApplication.i.getApplicationContext().getString(2131887552);
  
  public static final String D = MyApplication.i.getApplicationContext().getString(2131887550);
  
  public static final String E = MyApplication.i.getApplicationContext().getString(2131887553);
  
  public WeakReference A;
  
  public WeakReference B;
  
  public final int b;
  
  public final String c;
  
  public String e;
  
  public String f;
  
  public String g;
  
  public int h = -1;
  
  public int i;
  
  public int j;
  
  public long k;
  
  public long l;
  
  public ArrayList m;
  
  public zi n;
  
  public zi o;
  
  public zi p;
  
  public zi q;
  
  public final String r;
  
  public int s;
  
  public boolean t = false;
  
  public boolean u = false;
  
  public boolean v = false;
  
  public boolean w = false;
  
  public boolean x;
  
  public boolean y;
  
  public boolean z;
  
  public q3(int paramInt, String paramString1, String paramString2) {
    this(paramString1, paramInt);
    this.r = paramString2;
  }
  
  public q3(String paramString, int paramInt) {
    this.b = paramInt;
    this.c = paramString;
  }
  
  public final boolean a(String[] paramArrayOfString) {
    return ag0.g0(k(true), paramArrayOfString);
  }
  
  public final void b(km0 paramkm0, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: iload_2
    //   1: ifeq -> 31
    //   4: aload_0
    //   5: getfield m : Ljava/util/ArrayList;
    //   8: ifnonnull -> 22
    //   11: aload_0
    //   12: new java/util/ArrayList
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: putfield m : Ljava/util/ArrayList;
    //   22: aload_0
    //   23: getfield m : Ljava/util/ArrayList;
    //   26: aload_1
    //   27: invokevirtual add : (Ljava/lang/Object;)Z
    //   30: pop
    //   31: iload_3
    //   32: ifeq -> 144
    //   35: aload_0
    //   36: aload_0
    //   37: getfield s : I
    //   40: iconst_1
    //   41: iadd
    //   42: putfield s : I
    //   45: aload_0
    //   46: getfield h : I
    //   49: istore #6
    //   51: iload #6
    //   53: iflt -> 86
    //   56: aload_1
    //   57: getfield q : I
    //   60: istore #7
    //   62: iload #7
    //   64: iload #6
    //   66: if_icmpge -> 102
    //   69: aload_0
    //   70: iload #7
    //   72: putfield h : I
    //   75: aload_0
    //   76: aload_1
    //   77: getfield b : I
    //   80: putfield i : I
    //   83: goto -> 102
    //   86: aload_0
    //   87: aload_1
    //   88: getfield q : I
    //   91: putfield h : I
    //   94: aload_0
    //   95: aload_1
    //   96: getfield b : I
    //   99: putfield i : I
    //   102: aload_0
    //   103: getfield j : I
    //   106: istore #7
    //   108: aload_1
    //   109: getfield p : I
    //   112: istore #6
    //   114: iload #7
    //   116: iload #6
    //   118: if_icmpge -> 127
    //   121: aload_0
    //   122: iload #6
    //   124: putfield j : I
    //   127: aload_0
    //   128: aload_0
    //   129: getfield l : J
    //   132: aload_1
    //   133: getfield c : Lqn1;
    //   136: getfield g : I
    //   139: i2l
    //   140: ladd
    //   141: putfield l : J
    //   144: aload_0
    //   145: getfield b : I
    //   148: bipush #10
    //   150: if_icmpne -> 911
    //   153: iload_3
    //   154: ifeq -> 348
    //   157: aload_0
    //   158: getfield e : Ljava/lang/String;
    //   161: astore #15
    //   163: aload #15
    //   165: ifnonnull -> 182
    //   168: aload_0
    //   169: aload_1
    //   170: getfield c : Lqn1;
    //   173: getfield e : Ljava/lang/String;
    //   176: putfield e : Ljava/lang/String;
    //   179: goto -> 216
    //   182: aload_0
    //   183: getfield x : Z
    //   186: ifne -> 216
    //   189: aload #15
    //   191: aload_1
    //   192: getfield c : Lqn1;
    //   195: getfield e : Ljava/lang/String;
    //   198: invokevirtual equals : (Ljava/lang/Object;)Z
    //   201: ifne -> 216
    //   204: aload_0
    //   205: getstatic q3.C : Ljava/lang/String;
    //   208: putfield e : Ljava/lang/String;
    //   211: aload_0
    //   212: iconst_1
    //   213: putfield x : Z
    //   216: aload_0
    //   217: getfield f : Ljava/lang/String;
    //   220: astore #15
    //   222: aload #15
    //   224: ifnonnull -> 238
    //   227: aload_0
    //   228: aload_1
    //   229: getfield j : Ljava/lang/String;
    //   232: putfield f : Ljava/lang/String;
    //   235: goto -> 269
    //   238: aload_0
    //   239: getfield y : Z
    //   242: ifne -> 269
    //   245: aload #15
    //   247: aload_1
    //   248: getfield j : Ljava/lang/String;
    //   251: invokevirtual equals : (Ljava/lang/Object;)Z
    //   254: ifne -> 269
    //   257: aload_0
    //   258: getstatic q3.D : Ljava/lang/String;
    //   261: putfield f : Ljava/lang/String;
    //   264: aload_0
    //   265: iconst_1
    //   266: putfield y : Z
    //   269: aload_0
    //   270: getfield g : Ljava/lang/String;
    //   273: astore #15
    //   275: aload #15
    //   277: ifnonnull -> 291
    //   280: aload_0
    //   281: aload_1
    //   282: getfield f : Ljava/lang/String;
    //   285: putfield g : Ljava/lang/String;
    //   288: goto -> 322
    //   291: aload_0
    //   292: getfield z : Z
    //   295: ifne -> 322
    //   298: aload #15
    //   300: aload_1
    //   301: getfield f : Ljava/lang/String;
    //   304: invokevirtual equals : (Ljava/lang/Object;)Z
    //   307: ifne -> 322
    //   310: aload_0
    //   311: getstatic q3.E : Ljava/lang/String;
    //   314: putfield g : Ljava/lang/String;
    //   317: aload_0
    //   318: iconst_1
    //   319: putfield z : Z
    //   322: aload_0
    //   323: getfield k : J
    //   326: lstore #11
    //   328: aload_1
    //   329: getfield k : J
    //   332: lstore #13
    //   334: lload #11
    //   336: lload #13
    //   338: lcmp
    //   339: ifge -> 348
    //   342: aload_0
    //   343: lload #13
    //   345: putfield k : J
    //   348: iload #4
    //   350: ifne -> 358
    //   353: iload #5
    //   355: ifeq -> 911
    //   358: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   361: getfield c : Llm0;
    //   364: astore #15
    //   366: aconst_null
    //   367: astore #17
    //   369: aload #15
    //   371: ifnull -> 384
    //   374: aload #15
    //   376: getfield E : Ljava/util/regex/Pattern;
    //   379: astore #15
    //   381: goto -> 387
    //   384: aconst_null
    //   385: astore #15
    //   387: aload_1
    //   388: getfield c : Lqn1;
    //   391: getfield e : Ljava/lang/String;
    //   394: astore #18
    //   396: ldc '<unknown>'
    //   398: astore #16
    //   400: iconst_0
    //   401: istore #9
    //   403: iconst_0
    //   404: istore #8
    //   406: aload #15
    //   408: ifnull -> 514
    //   411: aload #15
    //   413: aload #18
    //   415: invokevirtual split : (Ljava/lang/CharSequence;)[Ljava/lang/String;
    //   418: astore #15
    //   420: aload #15
    //   422: arraylength
    //   423: istore #10
    //   425: iconst_0
    //   426: istore #6
    //   428: iconst_0
    //   429: istore #7
    //   431: iload #7
    //   433: iload #10
    //   435: if_icmpge -> 490
    //   438: aload #15
    //   440: iload #7
    //   442: aaload
    //   443: invokevirtual trim : ()Ljava/lang/String;
    //   446: astore #19
    //   448: aload #19
    //   450: invokevirtual isEmpty : ()Z
    //   453: ifne -> 484
    //   456: aload_0
    //   457: aload #19
    //   459: bipush #11
    //   461: invokevirtual i : (Ljava/lang/String;I)Lq3;
    //   464: astore #19
    //   466: iload #5
    //   468: ifeq -> 481
    //   471: aload #19
    //   473: aload_1
    //   474: iconst_1
    //   475: iconst_1
    //   476: iconst_0
    //   477: iconst_0
    //   478: invokevirtual d : (Lkm0;ZZZZ)V
    //   481: iconst_1
    //   482: istore #6
    //   484: iinc #7, 1
    //   487: goto -> 431
    //   490: iload #6
    //   492: istore #7
    //   494: aload #18
    //   496: astore #15
    //   498: iload #6
    //   500: ifne -> 521
    //   503: ldc '<unknown>'
    //   505: astore #15
    //   507: iload #6
    //   509: istore #7
    //   511: goto -> 521
    //   514: iconst_0
    //   515: istore #7
    //   517: aload #18
    //   519: astore #15
    //   521: iload #7
    //   523: ifne -> 554
    //   526: aload_0
    //   527: aload #15
    //   529: bipush #11
    //   531: invokevirtual i : (Ljava/lang/String;I)Lq3;
    //   534: astore #15
    //   536: iload #5
    //   538: ifeq -> 554
    //   541: aload #15
    //   543: aload_1
    //   544: iconst_1
    //   545: iconst_1
    //   546: iconst_0
    //   547: iconst_0
    //   548: invokevirtual d : (Lkm0;ZZZZ)V
    //   551: goto -> 554
    //   554: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   557: getfield c : Llm0;
    //   560: astore #15
    //   562: aload #15
    //   564: ifnull -> 577
    //   567: aload #15
    //   569: getfield F : Ljava/util/regex/Pattern;
    //   572: astore #15
    //   574: goto -> 580
    //   577: aconst_null
    //   578: astore #15
    //   580: aload_1
    //   581: getfield j : Ljava/lang/String;
    //   584: astore #18
    //   586: aload #15
    //   588: ifnull -> 694
    //   591: aload #15
    //   593: aload #18
    //   595: invokevirtual split : (Ljava/lang/CharSequence;)[Ljava/lang/String;
    //   598: astore #15
    //   600: aload #15
    //   602: arraylength
    //   603: istore #10
    //   605: iconst_0
    //   606: istore #6
    //   608: iconst_0
    //   609: istore #7
    //   611: iload #7
    //   613: iload #10
    //   615: if_icmpge -> 670
    //   618: aload #15
    //   620: iload #7
    //   622: aaload
    //   623: invokevirtual trim : ()Ljava/lang/String;
    //   626: astore #19
    //   628: aload #19
    //   630: invokevirtual isEmpty : ()Z
    //   633: ifne -> 664
    //   636: aload_0
    //   637: aload #19
    //   639: bipush #12
    //   641: invokevirtual h : (Ljava/lang/String;I)Lq3;
    //   644: astore #19
    //   646: iload #5
    //   648: ifeq -> 661
    //   651: aload #19
    //   653: aload_1
    //   654: iconst_1
    //   655: iconst_1
    //   656: iconst_0
    //   657: iconst_0
    //   658: invokevirtual c : (Lkm0;ZZZZ)V
    //   661: iconst_1
    //   662: istore #6
    //   664: iinc #7, 1
    //   667: goto -> 611
    //   670: iload #6
    //   672: istore #7
    //   674: aload #18
    //   676: astore #15
    //   678: iload #6
    //   680: ifne -> 701
    //   683: ldc '<unknown>'
    //   685: astore #15
    //   687: iload #6
    //   689: istore #7
    //   691: goto -> 701
    //   694: iconst_0
    //   695: istore #7
    //   697: aload #18
    //   699: astore #15
    //   701: iload #7
    //   703: ifne -> 734
    //   706: aload_0
    //   707: aload #15
    //   709: bipush #12
    //   711: invokevirtual h : (Ljava/lang/String;I)Lq3;
    //   714: astore #15
    //   716: iload #5
    //   718: ifeq -> 734
    //   721: aload #15
    //   723: aload_1
    //   724: iconst_1
    //   725: iconst_1
    //   726: iconst_0
    //   727: iconst_0
    //   728: invokevirtual c : (Lkm0;ZZZZ)V
    //   731: goto -> 734
    //   734: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   737: getfield c : Llm0;
    //   740: astore #18
    //   742: aload #17
    //   744: astore #15
    //   746: aload #18
    //   748: ifnull -> 758
    //   751: aload #18
    //   753: getfield G : Ljava/util/regex/Pattern;
    //   756: astore #15
    //   758: aload_1
    //   759: getfield f : Ljava/lang/String;
    //   762: astore #17
    //   764: iload #9
    //   766: istore #7
    //   768: aload #15
    //   770: ifnull -> 877
    //   773: aload #15
    //   775: aload #17
    //   777: invokevirtual split : (Ljava/lang/CharSequence;)[Ljava/lang/String;
    //   780: astore #15
    //   782: aload #15
    //   784: arraylength
    //   785: istore #9
    //   787: iconst_0
    //   788: istore #6
    //   790: iload #8
    //   792: istore #7
    //   794: iload #7
    //   796: iload #9
    //   798: if_icmpge -> 853
    //   801: aload #15
    //   803: iload #7
    //   805: aaload
    //   806: invokevirtual trim : ()Ljava/lang/String;
    //   809: astore #18
    //   811: aload #18
    //   813: invokevirtual isEmpty : ()Z
    //   816: ifne -> 847
    //   819: aload_0
    //   820: aload #18
    //   822: bipush #13
    //   824: invokevirtual j : (Ljava/lang/String;I)Lq3;
    //   827: astore #18
    //   829: iload #5
    //   831: ifeq -> 844
    //   834: aload #18
    //   836: aload_1
    //   837: iconst_1
    //   838: iconst_1
    //   839: iconst_0
    //   840: iconst_0
    //   841: invokevirtual e : (Lkm0;ZZZZ)V
    //   844: iconst_1
    //   845: istore #6
    //   847: iinc #7, 1
    //   850: goto -> 794
    //   853: iload #6
    //   855: istore #8
    //   857: iload #8
    //   859: istore #7
    //   861: iload #6
    //   863: ifne -> 877
    //   866: aload #16
    //   868: astore #15
    //   870: iload #8
    //   872: istore #7
    //   874: goto -> 881
    //   877: aload #17
    //   879: astore #15
    //   881: iload #7
    //   883: ifne -> 911
    //   886: aload_0
    //   887: aload #15
    //   889: bipush #13
    //   891: invokevirtual j : (Ljava/lang/String;I)Lq3;
    //   894: astore #15
    //   896: iload #5
    //   898: ifeq -> 911
    //   901: aload #15
    //   903: aload_1
    //   904: iconst_1
    //   905: iconst_1
    //   906: iconst_0
    //   907: iconst_0
    //   908: invokevirtual e : (Lkm0;ZZZZ)V
    //   911: return
  }
  
  public final void c(km0 paramkm0, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    if (paramBoolean1) {
      if (this.m == null)
        this.m = new ArrayList(); 
      this.m.add(paramkm0);
    } 
    if (paramBoolean2) {
      this.s++;
      this.l += paramkm0.c.g;
    } 
    if (this.b == 30) {
      if (paramBoolean2) {
        long l1 = this.k;
        long l2 = paramkm0.k;
        if (l1 < l2)
          this.k = l2; 
      } 
      if (paramBoolean3 || paramBoolean4) {
        int i = MyApplication.j.c.D;
        String str2 = paramkm0.c.c;
        String str1 = paramkm0.j;
        String str3 = paramkm0.f;
        str1 = km0.n(i, paramkm0.p, str2, str1, str3);
        q3 q31 = g(31, paramkm0.c.c, str1);
        if (paramBoolean4)
          q31.b(paramkm0, true, true, false, false); 
      } 
    } 
  }
  
  public final void d(km0 paramkm0, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    if (paramBoolean1) {
      if (this.m == null)
        this.m = new ArrayList(); 
      this.m.add(paramkm0);
    } 
    if (paramBoolean2) {
      this.s++;
      this.l += paramkm0.c.g;
    } 
    if (this.b == 20) {
      if (paramBoolean2) {
        long l1 = this.k;
        long l2 = paramkm0.k;
        if (l1 < l2)
          this.k = l2; 
      } 
      if (paramBoolean3 || paramBoolean4) {
        int i = MyApplication.j.c.D;
        String str2 = paramkm0.c.c;
        String str1 = paramkm0.j;
        String str3 = paramkm0.f;
        str1 = km0.n(i, paramkm0.p, str2, str1, str3);
        q3 q31 = g(21, paramkm0.c.c, str1);
        if (paramBoolean4)
          q31.b(paramkm0, true, true, false, false); 
      } 
    } 
  }
  
  public final void e(km0 paramkm0, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    if (paramBoolean1) {
      if (this.m == null)
        this.m = new ArrayList(); 
      this.m.add(paramkm0);
    } 
    if (paramBoolean2) {
      this.s++;
      this.l += paramkm0.c.g;
    } 
    if (this.b == 50) {
      if (paramBoolean2) {
        long l1 = this.k;
        long l2 = paramkm0.k;
        if (l1 < l2)
          this.k = l2; 
      } 
      if (paramBoolean3 || paramBoolean4) {
        int i = MyApplication.j.c.D;
        String str1 = paramkm0.c.c;
        String str2 = paramkm0.j;
        String str3 = paramkm0.f;
        str1 = km0.n(i, paramkm0.p, str1, str2, str3);
        q3 q31 = g(51, paramkm0.c.c, str1);
        if (paramBoolean4)
          q31.b(paramkm0, true, true, false, false); 
      } 
    } 
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject instanceof q3) ? Objects.equals(((q3)paramObject).r, this.r) : (!(this != paramObject)));
  }
  
  public final void f(km0 paramkm0, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    if (paramBoolean1) {
      if (this.m == null)
        this.m = new ArrayList(); 
      this.m.add(paramkm0);
    } 
    if (paramBoolean2) {
      this.s++;
      this.l += paramkm0.c.g;
    } 
    if (this.b == 40) {
      if (paramBoolean2) {
        long l1 = this.k;
        long l2 = paramkm0.k;
        if (l1 < l2)
          this.k = l2; 
      } 
      if (paramBoolean3 || paramBoolean4) {
        String str2;
        Pattern pattern;
        int i = MyApplication.j.c.D;
        qn1 qn1 = paramkm0.c;
        String str5 = paramkm0.f;
        String str6 = paramkm0.j;
        String str3 = qn1.c;
        str3 = km0.n(i, paramkm0.p, str3, str6, str5);
        q3 q31 = g(41, qn1.c, str3);
        if (paramBoolean4)
          q31.b(paramkm0, true, true, false, false); 
        lm0 lm02 = MyApplication.j.c;
        String str4 = null;
        if (lm02 != null) {
          pattern = lm02.E;
        } else {
          lm02 = null;
        } 
        String str7 = qn1.e;
        boolean bool2 = false;
        boolean bool1 = false;
        if (lm02 != null) {
          String[] arrayOfString = lm02.split(str7);
          j = arrayOfString.length;
          byte b = 0;
          i = 0;
          while (b < j) {
            String str = arrayOfString[b].trim();
            if (!str.isEmpty()) {
              q3 q32 = i(str, 42);
              if (paramBoolean4)
                q32.d(paramkm0, true, true, false, false); 
              i = 1;
            } 
            b++;
          } 
          j = i;
          str2 = str7;
          if (i == 0) {
            str2 = "<unknown>";
            j = i;
          } 
        } else {
          j = 0;
          str2 = str7;
        } 
        if (!j) {
          q3 q32 = i(str2, 42);
          if (paramBoolean4)
            q32.d(paramkm0, true, true, false, false); 
        } 
        lm0 lm01 = MyApplication.j.c;
        if (lm01 != null) {
          pattern = lm01.F;
        } else {
          lm01 = null;
        } 
        if (lm01 != null) {
          String[] arrayOfString = lm01.split(str6);
          int k = arrayOfString.length;
          j = 0;
          i = 0;
          while (j < k) {
            str7 = arrayOfString[j].trim();
            if (!str7.isEmpty()) {
              q3 q32 = h(str7, 43);
              if (paramBoolean4)
                q32.c(paramkm0, true, true, false, false); 
              i = 1;
            } 
            j++;
          } 
          j = i;
          str1 = str6;
          if (i == 0) {
            str1 = "<unknown>";
            j = i;
          } 
        } else {
          j = 0;
          str1 = str6;
        } 
        if (j == 0) {
          q3 q32 = h(str1, 43);
          if (paramBoolean4)
            q32.c(paramkm0, true, true, false, false); 
        } 
        lm0 lm03 = MyApplication.j.c;
        String str1 = str4;
        if (lm03 != null)
          pattern = lm03.G; 
        str4 = str5;
        int j = bool2;
        if (pattern != null) {
          String[] arrayOfString = pattern.split(str5);
          int k = arrayOfString.length;
          i = 0;
          for (j = bool1; j < k; j++) {
            str4 = arrayOfString[j].trim();
            if (!str4.isEmpty()) {
              q3 q32 = j(str4, 44);
              if (paramBoolean4)
                q32.e(paramkm0, true, true, false, false); 
              i = 1;
            } 
          } 
          k = i;
          str4 = str5;
          j = k;
          if (i == 0) {
            str4 = "<unknown>";
            j = k;
          } 
        } 
        if (j == 0) {
          q3 q32 = j(str4, 44);
          if (paramBoolean4)
            q32.e(paramkm0, true, true, false, false); 
        } 
      } 
    } 
  }
  
  public final q3 g(int paramInt, String paramString1, String paramString2) {
    if (this.n == null)
      this.n = (zi)new HashMap<Object, Object>(); 
    q3 q32 = (q3)this.n.get(paramString2);
    q3 q31 = q32;
    if (q32 == null) {
      q31 = new q3(paramInt, paramString1, paramString2);
      this.n.a(paramString2, q31);
    } 
    return q31;
  }
  
  public final String getName() {
    return this.c;
  }
  
  public final q3 h(String paramString, int paramInt) {
    if (this.p == null)
      this.p = (zi)new HashMap<Object, Object>(); 
    q3 q32 = (q3)this.p.get(paramString);
    q3 q31 = q32;
    if (q32 == null) {
      q31 = new q3(paramString, paramInt);
      this.p.a(paramString, q31);
    } 
    return q31;
  }
  
  public final int hashCode() {
    String str = this.r;
    return (str != null) ? str.hashCode() : super.hashCode();
  }
  
  public final q3 i(String paramString, int paramInt) {
    if (this.o == null)
      this.o = (zi)new HashMap<Object, Object>(); 
    q3 q32 = (q3)this.o.get(paramString);
    q3 q31 = q32;
    if (q32 == null) {
      q31 = new q3(paramString, paramInt);
      this.o.a(paramString, q31);
    } 
    return q31;
  }
  
  public final q3 j(String paramString, int paramInt) {
    if (this.q == null)
      this.q = (zi)new HashMap<Object, Object>(); 
    q3 q32 = (q3)this.q.get(paramString);
    q3 q31 = q32;
    if (q32 == null) {
      q31 = new q3(paramString, paramInt);
      this.q.a(paramString, q31);
    } 
    return q31;
  }
  
  public final String k(boolean paramBoolean) {
    String str3 = this.c;
    String str1 = null;
    String str2 = null;
    if (paramBoolean) {
      WeakReference<String> weakReference1 = this.A;
      str1 = str2;
      if (weakReference1 != null)
        str1 = weakReference1.get(); 
      if (str1 == null) {
        str1 = ag0.i0(str3.toUpperCase().toLowerCase());
        this.A = new WeakReference<String>(str1);
        return str1;
      } 
      return str1;
    } 
    WeakReference<String> weakReference = this.B;
    if (weakReference != null)
      str1 = weakReference.get(); 
    if (str1 == null) {
      str1 = str3.toLowerCase();
      this.B = new WeakReference<String>(str1);
      return str1;
    } 
    return str1;
  }
  
  public final ArrayList l(lm0 paramlm0, int... paramVarArgs) {
    m(paramlm0);
    ArrayList arrayList = new ArrayList(this.m);
    if (paramVarArgs.length > 0) {
      int i = paramVarArgs[0];
      if (i >= 0)
        z51.R(i, arrayList); 
    } 
    return arrayList;
  }
  
  public final void m(lm0 paramlm0) {
    ArrayList<Object> arrayList;
    boolean bool = this.u;
    int n = this.b;
    int j = 0;
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    int m = 0;
    int k = 0;
    if (bool) {
      if (!this.t || !this.v || !this.w) {
        if (n == 10) {
          arrayList = this.m;
          j = arrayList.size();
          i = k;
          while (i < j) {
            km0 km0 = (km0)arrayList.get(i);
            i++;
            b(km0, false, this.t ^ true, this.v ^ true, this.w ^ true);
          } 
        } else if (n == 20) {
          ArrayList<lm0> arrayList1 = this.m;
          k = arrayList1.size();
          i = j;
          while (i < k) {
            paramlm0 = arrayList1.get(i);
            i++;
            d((km0)paramlm0, false, this.t ^ true, this.v ^ true, this.w ^ true);
          } 
        } else if (n == 30) {
          arrayList = this.m;
          j = arrayList.size();
          while (i < j) {
            km0 km0 = (km0)arrayList.get(i);
            i++;
            c(km0, false, this.t ^ true, this.v ^ true, this.w ^ true);
          } 
        } else if (n == 50) {
          ArrayList<lm0> arrayList1 = this.m;
          j = arrayList1.size();
          i = bool1;
          while (i < j) {
            paramlm0 = arrayList1.get(i);
            i++;
            e((km0)paramlm0, false, this.t ^ true, this.v ^ true, this.w ^ true);
          } 
        } else if (n == 40) {
          arrayList = this.m;
          j = arrayList.size();
          i = bool2;
          while (i < j) {
            km0 km0 = (km0)arrayList.get(i);
            i++;
            f(km0, false, this.t ^ true, this.v ^ true, this.w ^ true);
          } 
        } 
        this.w = true;
        this.v = true;
        this.t = true;
        return;
      } 
      return;
    } 
    if (this.m == null)
      this.m = new ArrayList(); 
    String str = this.r;
    if (n == 10) {
      arrayList = arrayList.i(new int[0]);
      k = arrayList.size();
      i = m;
      while (i < k) {
        km0 km0 = (km0)arrayList.get(i);
        j = i + 1;
        km0 = km0;
        i = j;
        if (km0.m(MyApplication.j.c.D).equalsIgnoreCase(str)) {
          b(km0, true, this.t ^ true, this.v ^ true, this.w ^ true);
          i = j;
        } 
      } 
    } else if (n == 20) {
      ArrayList<km0> arrayList1 = arrayList.i(new int[0]);
      k = arrayList1.size();
      for (i = 0; i < k; i++) {
        km0 km0 = arrayList1.get(i);
        String str1 = km0.c.e;
        Pattern pattern = ((lm0)arrayList).E;
        if (pattern != null) {
          String[] arrayOfString = pattern.split(str1);
        } else {
          pattern = null;
        } 
        if (pattern != null) {
          m = pattern.length;
          for (j = 0; j < m; j++) {
            if (pattern[j].trim().equalsIgnoreCase(str)) {
              d(km0, true, this.t ^ true, this.v ^ true, this.w ^ true);
              break;
            } 
          } 
        } else if (str1.equalsIgnoreCase(str)) {
          d(km0, true, this.t ^ true, this.v ^ true, this.w ^ true);
        } 
      } 
    } else if (n == 30) {
      ArrayList<km0> arrayList1 = arrayList.i(new int[0]);
      k = arrayList1.size();
      for (i = 0; i < k; i++) {
        km0 km0 = arrayList1.get(i);
        String str1 = km0.j;
        Pattern pattern = ((lm0)arrayList).F;
        if (pattern != null) {
          String[] arrayOfString = pattern.split(str1);
        } else {
          pattern = null;
        } 
        if (pattern != null) {
          m = pattern.length;
          for (j = 0; j < m; j++) {
            if (pattern[j].trim().equalsIgnoreCase(str)) {
              c(km0, true, this.t ^ true, this.v ^ true, this.w ^ true);
              break;
            } 
          } 
        } else if (str1.equalsIgnoreCase(str)) {
          c(km0, true, this.t ^ true, this.v ^ true, this.w ^ true);
        } 
      } 
    } else if (n == 50) {
      ArrayList<km0> arrayList1 = arrayList.i(new int[0]);
      k = arrayList1.size();
      for (i = 0; i < k; i++) {
        km0 km0 = arrayList1.get(i);
        String str1 = km0.f;
        Pattern pattern = ((lm0)arrayList).G;
        if (pattern != null) {
          String[] arrayOfString = pattern.split(str1);
        } else {
          pattern = null;
        } 
        if (pattern != null) {
          m = pattern.length;
          for (j = 0; j < m; j++) {
            if (pattern[j].trim().equalsIgnoreCase(str)) {
              e(km0, true, this.t ^ true, this.v ^ true, this.w ^ true);
              break;
            } 
          } 
        } else if (str1.equalsIgnoreCase(str)) {
          e(km0, true, this.t ^ true, this.v ^ true, this.w ^ true);
        } 
      } 
    } else if (n == 40) {
      ArrayList<km0> arrayList1 = arrayList.i(new int[0]);
      k = arrayList1.size();
      for (i = 0; i < k; i++) {
        km0 km0 = arrayList1.get(i);
        String str1 = km0.e;
        Pattern pattern = ((lm0)arrayList).H;
        if (pattern != null) {
          String[] arrayOfString = pattern.split(str1);
        } else {
          pattern = null;
        } 
        if (pattern != null) {
          m = pattern.length;
          for (j = 0; j < m; j++) {
            if (pattern[j].trim().equalsIgnoreCase(str)) {
              f(km0, true, this.t ^ true, this.v ^ true, this.w ^ true);
              break;
            } 
          } 
        } else if (str1.equalsIgnoreCase(str)) {
          f(km0, true, this.t ^ true, this.v ^ true, this.w ^ true);
        } 
      } 
    } 
    this.w = true;
    this.v = true;
    this.t = true;
    this.u = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */