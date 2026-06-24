import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class t60 implements Handler.Callback, mt0, gw0 {
  public int A;
  
  public boolean B;
  
  public boolean C;
  
  public int D;
  
  public s60 E;
  
  public long F;
  
  public int G;
  
  public boolean H;
  
  public final lz0[] b;
  
  public final lz0[] c;
  
  public final zv0 e;
  
  public final oz0 f;
  
  public final nw g;
  
  public final wv h;
  
  public final w9 i;
  
  public final HandlerThread j;
  
  public final cj k;
  
  public final tu1 l;
  
  public final su1 m;
  
  public final long n;
  
  public final ow o;
  
  public final r60 p;
  
  public final ArrayList q;
  
  public final qt0 r;
  
  public bk1 s;
  
  public q71 t;
  
  public ad u;
  
  public lz0[] v;
  
  public boolean w;
  
  public boolean x;
  
  public boolean y;
  
  public boolean z;
  
  public t60(lz0[] paramArrayOflz0, zv0 paramzv0, oz0 paramoz0, nw paramnw, wv paramwv, boolean paramBoolean, cj paramcj) {
    this.b = paramArrayOflz0;
    this.e = paramzv0;
    this.f = paramoz0;
    this.g = paramnw;
    this.h = paramwv;
    this.x = paramBoolean;
    this.A = 0;
    this.B = false;
    this.k = paramcj;
    this.r = new qt0();
    this.n = paramnw.i;
    this.s = bk1.c;
    vv1 vv1 = vv1.f;
    ru1 ru1 = uu1.a;
    fw0 fw0 = q71.n;
    this.t = new q71(ru1, fw0, -9223372036854775807L, -9223372036854775807L, 1, null, false, vv1, paramoz0, fw0, -9223372036854775807L, 0L, -9223372036854775807L);
    this.p = (r60)new Object();
    this.c = new lz0[paramArrayOflz0.length];
    for (byte b = 0; b < paramArrayOflz0.length; b++) {
      lz0 lz01 = paramArrayOflz0[b];
      lz01.b = b;
      lz0[] arrayOfLz0 = this.c;
      lz01.getClass();
      arrayOfLz0[b] = lz01;
    } 
    this.o = new ow(this);
    this.q = new ArrayList();
    this.v = new lz0[0];
    this.l = new tu1();
    this.m = new su1();
    paramzv0.c = paramwv;
    HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
    this.j = handlerThread;
    handlerThread.start();
    this.i = new w9(new Handler(handlerThread.getLooper(), this), 2);
    this.H = true;
  }
  
  public static void d(a81 parama81) {
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{a81}, name=parama81} */
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{a81}, name=parama81} */
    try {
      lz0 lz01 = parama81.a;
      int i = parama81.c;
      Object object = parama81.d;
      e01 e01 = lz01.j;
      if (i != 2) {
        if (i != 3) {
          if (i == 5)
            e01.m((jb)object); 
        } else {
          e01.l((k9)object);
        } 
      } else {
        e01.n(((Float)object).floatValue());
      } 
      return;
    } finally {
      parama81.a(true);
    } 
  }
  
  public static void h(lz0 paramlz0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : I
    //   4: iconst_2
    //   5: if_icmpne -> 1930
    //   8: aload_0
    //   9: getfield j : Le01;
    //   12: astore #20
    //   14: aload_0
    //   15: getfield c : I
    //   18: iconst_2
    //   19: if_icmpne -> 28
    //   22: iconst_1
    //   23: istore #16
    //   25: goto -> 31
    //   28: iconst_0
    //   29: istore #16
    //   31: iload #16
    //   33: invokestatic r : (Z)V
    //   36: aload_0
    //   37: iconst_1
    //   38: putfield c : I
    //   41: aload_0
    //   42: getfield q : Z
    //   45: ifeq -> 61
    //   48: aload #20
    //   50: invokevirtual g : ()Z
    //   53: ifeq -> 61
    //   56: iconst_1
    //   57: istore_2
    //   58: goto -> 63
    //   61: iconst_0
    //   62: istore_2
    //   63: aload #20
    //   65: invokevirtual h : ()Z
    //   68: ifeq -> 79
    //   71: aload #20
    //   73: getfield u : I
    //   76: ifne -> 82
    //   79: goto -> 1806
    //   82: aload #20
    //   84: getfield b : Lca;
    //   87: astore #18
    //   89: aload #18
    //   91: getfield c : Landroid/media/AudioTrack;
    //   94: astore #19
    //   96: aload #19
    //   98: invokevirtual getClass : ()Ljava/lang/Class;
    //   101: pop
    //   102: aload #19
    //   104: invokevirtual getPlayState : ()I
    //   107: iconst_3
    //   108: if_icmpne -> 1228
    //   111: aload #18
    //   113: getfield a : Lbh0;
    //   116: getfield c : Ljava/lang/Object;
    //   119: checkcast e01
    //   122: astore #19
    //   124: aload #18
    //   126: getfield b : [J
    //   129: astore #21
    //   131: aload #18
    //   133: invokevirtual a : ()J
    //   136: ldc2_w 1000000
    //   139: lmul
    //   140: aload #18
    //   142: getfield g : I
    //   145: i2l
    //   146: ldiv
    //   147: lstore #12
    //   149: lload #12
    //   151: lconst_0
    //   152: lcmp
    //   153: ifne -> 171
    //   156: aload #18
    //   158: astore #19
    //   160: iload_2
    //   161: istore_3
    //   162: aload #18
    //   164: astore #19
    //   166: iload_3
    //   167: istore_2
    //   168: goto -> 1232
    //   171: invokestatic nanoTime : ()J
    //   174: ldc2_w 1000
    //   177: ldiv
    //   178: lstore #10
    //   180: iload_2
    //   181: istore_3
    //   182: lload #10
    //   184: aload #18
    //   186: getfield k : J
    //   189: lsub
    //   190: ldc2_w 30000
    //   193: lcmp
    //   194: iflt -> 305
    //   197: aload #18
    //   199: getfield t : I
    //   202: istore_3
    //   203: aload #21
    //   205: iload_3
    //   206: lload #12
    //   208: lload #10
    //   210: lsub
    //   211: lastore
    //   212: aload #18
    //   214: iload_3
    //   215: iconst_1
    //   216: iadd
    //   217: bipush #10
    //   219: irem
    //   220: putfield t : I
    //   223: aload #18
    //   225: getfield u : I
    //   228: istore_3
    //   229: iload_3
    //   230: bipush #10
    //   232: if_icmpge -> 243
    //   235: aload #18
    //   237: iload_3
    //   238: iconst_1
    //   239: iadd
    //   240: putfield u : I
    //   243: aload #18
    //   245: lload #10
    //   247: putfield k : J
    //   250: aload #18
    //   252: lconst_0
    //   253: putfield j : J
    //   256: iconst_0
    //   257: istore #4
    //   259: aload #18
    //   261: getfield u : I
    //   264: istore #5
    //   266: iload_2
    //   267: istore_3
    //   268: iload #4
    //   270: iload #5
    //   272: if_icmpge -> 305
    //   275: aload #18
    //   277: getfield j : J
    //   280: lstore #6
    //   282: aload #18
    //   284: aload #21
    //   286: iload #4
    //   288: laload
    //   289: iload #5
    //   291: i2l
    //   292: ldiv
    //   293: lload #6
    //   295: ladd
    //   296: putfield j : J
    //   299: iinc #4, 1
    //   302: goto -> 259
    //   305: iload_3
    //   306: istore_2
    //   307: aload #18
    //   309: getfield h : Z
    //   312: ifeq -> 318
    //   315: goto -> 156
    //   318: aload #18
    //   320: getfield f : Lba;
    //   323: astore #21
    //   325: aload #21
    //   327: invokevirtual getClass : ()Ljava/lang/Class;
    //   330: pop
    //   331: aload #21
    //   333: getfield a : Laa;
    //   336: astore #23
    //   338: aload #23
    //   340: ifnull -> 647
    //   343: aload #23
    //   345: getfield e : Ljava/lang/Object;
    //   348: checkcast android/media/AudioTimestamp
    //   351: astore #22
    //   353: lload #10
    //   355: aload #21
    //   357: getfield e : J
    //   360: lsub
    //   361: aload #21
    //   363: getfield d : J
    //   366: lcmp
    //   367: ifge -> 373
    //   370: goto -> 609
    //   373: aload #21
    //   375: lload #10
    //   377: putfield e : J
    //   380: aload #23
    //   382: getfield d : Ljava/lang/Object;
    //   385: checkcast android/media/AudioTrack
    //   388: aload #22
    //   390: invokevirtual getTimestamp : (Landroid/media/AudioTimestamp;)Z
    //   393: istore #17
    //   395: iload #17
    //   397: ifeq -> 456
    //   400: aload #22
    //   402: getfield framePosition : J
    //   405: lstore #6
    //   407: aload #23
    //   409: getfield b : J
    //   412: lload #6
    //   414: lcmp
    //   415: ifle -> 430
    //   418: aload #23
    //   420: aload #23
    //   422: getfield a : J
    //   425: lconst_1
    //   426: ladd
    //   427: putfield a : J
    //   430: aload #23
    //   432: lload #6
    //   434: putfield b : J
    //   437: aload #23
    //   439: lload #6
    //   441: aload #23
    //   443: getfield a : J
    //   446: bipush #32
    //   448: lshl
    //   449: ladd
    //   450: putfield c : J
    //   453: goto -> 456
    //   456: aload #21
    //   458: getfield b : I
    //   461: istore_3
    //   462: iload_3
    //   463: ifeq -> 563
    //   466: iload_3
    //   467: iconst_1
    //   468: if_icmpeq -> 527
    //   471: iload_3
    //   472: iconst_2
    //   473: if_icmpeq -> 514
    //   476: iload_3
    //   477: iconst_3
    //   478: if_icmpeq -> 497
    //   481: iload_3
    //   482: iconst_4
    //   483: if_icmpne -> 489
    //   486: goto -> 507
    //   489: new java/lang/IllegalStateException
    //   492: dup
    //   493: invokespecial <init> : ()V
    //   496: athrow
    //   497: iload #17
    //   499: ifeq -> 507
    //   502: aload #21
    //   504: invokevirtual a : ()V
    //   507: iload #17
    //   509: istore #16
    //   511: goto -> 650
    //   514: iload #17
    //   516: ifne -> 507
    //   519: aload #21
    //   521: invokevirtual a : ()V
    //   524: goto -> 507
    //   527: iload #17
    //   529: ifeq -> 555
    //   532: aload #23
    //   534: getfield c : J
    //   537: aload #21
    //   539: getfield f : J
    //   542: lcmp
    //   543: ifle -> 507
    //   546: aload #21
    //   548: iconst_2
    //   549: invokevirtual b : (I)V
    //   552: goto -> 507
    //   555: aload #21
    //   557: invokevirtual a : ()V
    //   560: goto -> 507
    //   563: iload #17
    //   565: ifeq -> 615
    //   568: aload #22
    //   570: getfield nanoTime : J
    //   573: ldc2_w 1000
    //   576: ldiv
    //   577: aload #21
    //   579: getfield c : J
    //   582: lcmp
    //   583: iflt -> 609
    //   586: aload #21
    //   588: aload #23
    //   590: getfield c : J
    //   593: putfield f : J
    //   596: aload #21
    //   598: iconst_1
    //   599: invokevirtual b : (I)V
    //   602: iload #17
    //   604: istore #16
    //   606: goto -> 650
    //   609: iconst_0
    //   610: istore #16
    //   612: goto -> 650
    //   615: iload #17
    //   617: istore #16
    //   619: lload #10
    //   621: aload #21
    //   623: getfield c : J
    //   626: lsub
    //   627: ldc2_w 500000
    //   630: lcmp
    //   631: ifle -> 650
    //   634: aload #21
    //   636: iconst_3
    //   637: invokevirtual b : (I)V
    //   640: iload #17
    //   642: istore #16
    //   644: goto -> 650
    //   647: goto -> 370
    //   650: iload #16
    //   652: ifne -> 658
    //   655: goto -> 1014
    //   658: aload #23
    //   660: ifnull -> 683
    //   663: aload #23
    //   665: getfield e : Ljava/lang/Object;
    //   668: checkcast android/media/AudioTimestamp
    //   671: getfield nanoTime : J
    //   674: ldc2_w 1000
    //   677: ldiv
    //   678: lstore #6
    //   680: goto -> 688
    //   683: ldc2_w -9223372036854775807
    //   686: lstore #6
    //   688: aload #23
    //   690: ifnull -> 703
    //   693: aload #23
    //   695: getfield c : J
    //   698: lstore #8
    //   700: goto -> 708
    //   703: ldc2_w -1
    //   706: lstore #8
    //   708: lload #6
    //   710: lload #10
    //   712: lsub
    //   713: invokestatic abs : (J)J
    //   716: ldc2_w 5000000
    //   719: lcmp
    //   720: ifle -> 859
    //   723: new java/lang/StringBuilder
    //   726: dup
    //   727: ldc_w 'Spurious audio timestamp (system clock mismatch): '
    //   730: invokespecial <init> : (Ljava/lang/String;)V
    //   733: astore #22
    //   735: aload #22
    //   737: lload #8
    //   739: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   742: pop
    //   743: aload #22
    //   745: ldc_w ', '
    //   748: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   751: pop
    //   752: aload #22
    //   754: lload #6
    //   756: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   759: pop
    //   760: aload #22
    //   762: ldc_w ', '
    //   765: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   768: pop
    //   769: aload #22
    //   771: lload #10
    //   773: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   776: pop
    //   777: aload #22
    //   779: ldc_w ', '
    //   782: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   785: pop
    //   786: aload #22
    //   788: lload #12
    //   790: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   793: pop
    //   794: aload #22
    //   796: ldc_w ', '
    //   799: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   802: pop
    //   803: aload #22
    //   805: aload #19
    //   807: invokevirtual d : ()J
    //   810: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   813: pop
    //   814: aload #22
    //   816: ldc_w ', '
    //   819: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   822: pop
    //   823: aload #22
    //   825: aload #19
    //   827: invokevirtual e : ()J
    //   830: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   833: pop
    //   834: ldc_w 'AudioTrack'
    //   837: aload #22
    //   839: invokevirtual toString : ()Ljava/lang/String;
    //   842: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   845: pop
    //   846: aload #21
    //   848: iconst_4
    //   849: invokevirtual b : (I)V
    //   852: aload #18
    //   854: astore #19
    //   856: goto -> 1038
    //   859: lload #8
    //   861: ldc2_w 1000000
    //   864: lmul
    //   865: aload #18
    //   867: getfield g : I
    //   870: i2l
    //   871: ldiv
    //   872: lload #12
    //   874: lsub
    //   875: invokestatic abs : (J)J
    //   878: ldc2_w 5000000
    //   881: lcmp
    //   882: ifle -> 1021
    //   885: new java/lang/StringBuilder
    //   888: dup
    //   889: ldc_w 'Spurious audio timestamp (frame position mismatch): '
    //   892: invokespecial <init> : (Ljava/lang/String;)V
    //   895: astore #22
    //   897: aload #22
    //   899: lload #8
    //   901: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   904: pop
    //   905: aload #22
    //   907: ldc_w ', '
    //   910: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   913: pop
    //   914: aload #22
    //   916: lload #6
    //   918: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   921: pop
    //   922: aload #22
    //   924: ldc_w ', '
    //   927: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   930: pop
    //   931: aload #22
    //   933: lload #10
    //   935: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   938: pop
    //   939: aload #22
    //   941: ldc_w ', '
    //   944: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   947: pop
    //   948: aload #22
    //   950: lload #12
    //   952: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   955: pop
    //   956: aload #22
    //   958: ldc_w ', '
    //   961: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   964: pop
    //   965: aload #22
    //   967: aload #19
    //   969: invokevirtual d : ()J
    //   972: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   975: pop
    //   976: aload #22
    //   978: ldc_w ', '
    //   981: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   984: pop
    //   985: aload #22
    //   987: aload #19
    //   989: invokevirtual e : ()J
    //   992: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   995: pop
    //   996: ldc_w 'AudioTrack'
    //   999: aload #22
    //   1001: invokevirtual toString : ()Ljava/lang/String;
    //   1004: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1007: pop
    //   1008: aload #21
    //   1010: iconst_4
    //   1011: invokevirtual b : (I)V
    //   1014: aload #18
    //   1016: astore #19
    //   1018: goto -> 1038
    //   1021: aload #21
    //   1023: getfield b : I
    //   1026: iconst_4
    //   1027: if_icmpne -> 1014
    //   1030: aload #21
    //   1032: invokevirtual a : ()V
    //   1035: goto -> 1014
    //   1038: aload #18
    //   1040: astore #19
    //   1042: iload_2
    //   1043: istore_3
    //   1044: aload #19
    //   1046: getfield o : Z
    //   1049: ifeq -> 162
    //   1052: aload #19
    //   1054: getfield l : Ljava/lang/reflect/Method;
    //   1057: astore #21
    //   1059: iload_2
    //   1060: istore_3
    //   1061: aload #21
    //   1063: ifnull -> 162
    //   1066: iload_2
    //   1067: istore_3
    //   1068: lload #10
    //   1070: aload #19
    //   1072: getfield p : J
    //   1075: lsub
    //   1076: ldc2_w 500000
    //   1079: lcmp
    //   1080: iflt -> 162
    //   1083: aload #19
    //   1085: getfield c : Landroid/media/AudioTrack;
    //   1088: astore #22
    //   1090: aload #22
    //   1092: invokevirtual getClass : ()Ljava/lang/Class;
    //   1095: pop
    //   1096: aload #21
    //   1098: aload #22
    //   1100: aconst_null
    //   1101: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1104: checkcast java/lang/Integer
    //   1107: astore #21
    //   1109: getstatic d12.a : I
    //   1112: istore_3
    //   1113: aload #21
    //   1115: invokevirtual intValue : ()I
    //   1118: i2l
    //   1119: ldc2_w 1000
    //   1122: lmul
    //   1123: aload #19
    //   1125: getfield i : J
    //   1128: lsub
    //   1129: lstore #6
    //   1131: aload #19
    //   1133: lload #6
    //   1135: putfield m : J
    //   1138: lload #6
    //   1140: lconst_0
    //   1141: invokestatic max : (JJ)J
    //   1144: lstore #6
    //   1146: aload #19
    //   1148: lload #6
    //   1150: putfield m : J
    //   1153: lload #6
    //   1155: ldc2_w 5000000
    //   1158: lcmp
    //   1159: ifle -> 1209
    //   1162: new java/lang/StringBuilder
    //   1165: astore #21
    //   1167: aload #21
    //   1169: ldc_w 'Ignoring impossibly large audio latency: '
    //   1172: invokespecial <init> : (Ljava/lang/String;)V
    //   1175: aload #21
    //   1177: lload #6
    //   1179: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1182: pop
    //   1183: ldc_w 'AudioTrack'
    //   1186: aload #21
    //   1188: invokevirtual toString : ()Ljava/lang/String;
    //   1191: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1194: pop
    //   1195: aload #19
    //   1197: lconst_0
    //   1198: putfield m : J
    //   1201: goto -> 1209
    //   1204: astore #21
    //   1206: goto -> 1212
    //   1209: goto -> 1218
    //   1212: aload #19
    //   1214: aconst_null
    //   1215: putfield l : Ljava/lang/reflect/Method;
    //   1218: aload #19
    //   1220: lload #10
    //   1222: putfield p : J
    //   1225: goto -> 1232
    //   1228: aload #18
    //   1230: astore #19
    //   1232: invokestatic nanoTime : ()J
    //   1235: ldc2_w 1000
    //   1238: ldiv
    //   1239: lstore #10
    //   1241: aload #18
    //   1243: getfield f : Lba;
    //   1246: astore #19
    //   1248: aload #19
    //   1250: invokevirtual getClass : ()Ljava/lang/Class;
    //   1253: pop
    //   1254: aload #19
    //   1256: getfield b : I
    //   1259: iconst_2
    //   1260: if_icmpne -> 1269
    //   1263: iconst_1
    //   1264: istore #16
    //   1266: goto -> 1272
    //   1269: iconst_0
    //   1270: istore #16
    //   1272: iload #16
    //   1274: ifeq -> 1362
    //   1277: aload #19
    //   1279: getfield a : Laa;
    //   1282: astore #19
    //   1284: aload #19
    //   1286: ifnull -> 1299
    //   1289: aload #19
    //   1291: getfield c : J
    //   1294: lstore #6
    //   1296: goto -> 1304
    //   1299: ldc2_w -1
    //   1302: lstore #6
    //   1304: lload #6
    //   1306: ldc2_w 1000000
    //   1309: lmul
    //   1310: aload #18
    //   1312: getfield g : I
    //   1315: i2l
    //   1316: ldiv
    //   1317: lstore #8
    //   1319: aload #19
    //   1321: ifnull -> 1344
    //   1324: aload #19
    //   1326: getfield e : Ljava/lang/Object;
    //   1329: checkcast android/media/AudioTimestamp
    //   1332: getfield nanoTime : J
    //   1335: ldc2_w 1000
    //   1338: ldiv
    //   1339: lstore #6
    //   1341: goto -> 1349
    //   1344: ldc2_w -9223372036854775807
    //   1347: lstore #6
    //   1349: lload #10
    //   1351: lload #6
    //   1353: lsub
    //   1354: lload #8
    //   1356: ladd
    //   1357: lstore #6
    //   1359: goto -> 1423
    //   1362: aload #18
    //   1364: getfield u : I
    //   1367: ifne -> 1391
    //   1370: aload #18
    //   1372: invokevirtual a : ()J
    //   1375: ldc2_w 1000000
    //   1378: lmul
    //   1379: aload #18
    //   1381: getfield g : I
    //   1384: i2l
    //   1385: ldiv
    //   1386: lstore #8
    //   1388: goto -> 1401
    //   1391: aload #18
    //   1393: getfield j : J
    //   1396: lload #10
    //   1398: ladd
    //   1399: lstore #8
    //   1401: lload #8
    //   1403: lstore #6
    //   1405: iload_2
    //   1406: ifne -> 1423
    //   1409: lconst_0
    //   1410: lload #8
    //   1412: aload #18
    //   1414: getfield m : J
    //   1417: lsub
    //   1418: invokestatic max : (JJ)J
    //   1421: lstore #6
    //   1423: aload #18
    //   1425: getfield B : Z
    //   1428: iload #16
    //   1430: if_icmpeq -> 1453
    //   1433: aload #18
    //   1435: aload #18
    //   1437: getfield A : J
    //   1440: putfield D : J
    //   1443: aload #18
    //   1445: aload #18
    //   1447: getfield z : J
    //   1450: putfield C : J
    //   1453: lload #10
    //   1455: aload #18
    //   1457: getfield D : J
    //   1460: lsub
    //   1461: lstore #12
    //   1463: lload #6
    //   1465: lstore #8
    //   1467: lload #12
    //   1469: ldc2_w 1000000
    //   1472: lcmp
    //   1473: ifge -> 1519
    //   1476: aload #18
    //   1478: getfield C : J
    //   1481: lstore #8
    //   1483: lload #12
    //   1485: ldc2_w 1000
    //   1488: lmul
    //   1489: ldc2_w 1000000
    //   1492: ldiv
    //   1493: lstore #14
    //   1495: ldc2_w 1000
    //   1498: lload #14
    //   1500: lsub
    //   1501: lload #8
    //   1503: lload #12
    //   1505: ladd
    //   1506: lmul
    //   1507: lload #6
    //   1509: lload #14
    //   1511: lmul
    //   1512: ladd
    //   1513: ldc2_w 1000
    //   1516: ldiv
    //   1517: lstore #8
    //   1519: aload #18
    //   1521: lload #10
    //   1523: putfield A : J
    //   1526: aload #18
    //   1528: lload #8
    //   1530: putfield z : J
    //   1533: aload #18
    //   1535: iload #16
    //   1537: putfield B : Z
    //   1540: aload #20
    //   1542: getfield g : Lc01;
    //   1545: astore #18
    //   1547: lload #8
    //   1549: aload #20
    //   1551: invokevirtual e : ()J
    //   1554: ldc2_w 1000000
    //   1557: lmul
    //   1558: aload #18
    //   1560: getfield e : I
    //   1563: i2l
    //   1564: ldiv
    //   1565: invokestatic min : (JJ)J
    //   1568: lstore #6
    //   1570: aload #20
    //   1572: getfield v : J
    //   1575: lstore #8
    //   1577: aload #20
    //   1579: getfield c : Ljava/util/ArrayDeque;
    //   1582: astore #19
    //   1584: aconst_null
    //   1585: astore #18
    //   1587: aload #19
    //   1589: invokevirtual isEmpty : ()Z
    //   1592: ifne -> 1625
    //   1595: lload #6
    //   1597: aload #19
    //   1599: invokevirtual getFirst : ()Ljava/lang/Object;
    //   1602: checkcast d01
    //   1605: getfield c : J
    //   1608: lcmp
    //   1609: iflt -> 1625
    //   1612: aload #19
    //   1614: invokevirtual remove : ()Ljava/lang/Object;
    //   1617: checkcast d01
    //   1620: astore #18
    //   1622: goto -> 1587
    //   1625: aload #18
    //   1627: ifnull -> 1666
    //   1630: aload #20
    //   1632: aload #18
    //   1634: getfield a : Lr71;
    //   1637: putfield k : Lr71;
    //   1640: aload #20
    //   1642: aload #18
    //   1644: getfield c : J
    //   1647: putfield m : J
    //   1650: aload #20
    //   1652: aload #18
    //   1654: getfield b : J
    //   1657: aload #20
    //   1659: getfield v : J
    //   1662: lsub
    //   1663: putfield l : J
    //   1666: aload #20
    //   1668: getfield k : Lr71;
    //   1671: getfield a : F
    //   1674: fconst_1
    //   1675: fcmpl
    //   1676: ifne -> 1698
    //   1679: lload #6
    //   1681: aload #20
    //   1683: getfield l : J
    //   1686: ladd
    //   1687: aload #20
    //   1689: getfield m : J
    //   1692: lsub
    //   1693: lstore #6
    //   1695: goto -> 1784
    //   1698: aload #19
    //   1700: invokevirtual isEmpty : ()Z
    //   1703: istore #16
    //   1705: aload #20
    //   1707: getfield l : J
    //   1710: lstore #10
    //   1712: aload #20
    //   1714: getfield m : J
    //   1717: lstore #12
    //   1719: iload #16
    //   1721: ifeq -> 1741
    //   1724: lload #6
    //   1726: lload #12
    //   1728: lsub
    //   1729: lstore #6
    //   1731: lload #6
    //   1733: lload #10
    //   1735: ladd
    //   1736: lstore #6
    //   1738: goto -> 1784
    //   1741: lload #6
    //   1743: lload #12
    //   1745: lsub
    //   1746: lstore #6
    //   1748: aload #20
    //   1750: getfield k : Lr71;
    //   1753: getfield a : F
    //   1756: fstore_1
    //   1757: getstatic d12.a : I
    //   1760: istore_2
    //   1761: fload_1
    //   1762: fconst_1
    //   1763: fcmpl
    //   1764: ifne -> 1770
    //   1767: goto -> 1731
    //   1770: lload #6
    //   1772: l2d
    //   1773: fload_1
    //   1774: f2d
    //   1775: dmul
    //   1776: invokestatic round : (D)J
    //   1779: lstore #6
    //   1781: goto -> 1731
    //   1784: lconst_0
    //   1785: aload #20
    //   1787: getfield g : Lc01;
    //   1790: getfield e : I
    //   1793: i2l
    //   1794: ldiv
    //   1795: lload #6
    //   1797: ladd
    //   1798: lload #8
    //   1800: ladd
    //   1801: lstore #6
    //   1803: goto -> 1811
    //   1806: ldc2_w -9223372036854775808
    //   1809: lstore #6
    //   1811: lload #6
    //   1813: ldc2_w -9223372036854775808
    //   1816: lcmp
    //   1817: ifeq -> 1847
    //   1820: aload_0
    //   1821: getfield p : Z
    //   1824: ifeq -> 1830
    //   1827: goto -> 1841
    //   1830: aload_0
    //   1831: getfield o : J
    //   1834: lload #6
    //   1836: invokestatic max : (JJ)J
    //   1839: lstore #6
    //   1841: aload_0
    //   1842: lload #6
    //   1844: putfield o : J
    //   1847: aload #20
    //   1849: iconst_0
    //   1850: putfield H : Z
    //   1853: aload #20
    //   1855: invokevirtual h : ()Z
    //   1858: ifeq -> 1930
    //   1861: aload #20
    //   1863: getfield b : Lca;
    //   1866: astore_0
    //   1867: aload_0
    //   1868: lconst_0
    //   1869: putfield j : J
    //   1872: aload_0
    //   1873: iconst_0
    //   1874: putfield u : I
    //   1877: aload_0
    //   1878: iconst_0
    //   1879: putfield t : I
    //   1882: aload_0
    //   1883: lconst_0
    //   1884: putfield k : J
    //   1887: aload_0
    //   1888: lconst_0
    //   1889: putfield A : J
    //   1892: aload_0
    //   1893: lconst_0
    //   1894: putfield D : J
    //   1897: aload_0
    //   1898: getfield v : J
    //   1901: ldc2_w -9223372036854775807
    //   1904: lcmp
    //   1905: ifne -> 1930
    //   1908: aload_0
    //   1909: getfield f : Lba;
    //   1912: astore_0
    //   1913: aload_0
    //   1914: invokevirtual getClass : ()Ljava/lang/Class;
    //   1917: pop
    //   1918: aload_0
    //   1919: invokevirtual a : ()V
    //   1922: aload #20
    //   1924: getfield h : Landroid/media/AudioTrack;
    //   1927: invokevirtual pause : ()V
    //   1930: return
    // Exception table:
    //   from	to	target	type
    //   1083	1153	1204	java/lang/Exception
    //   1162	1201	1204	java/lang/Exception
  }
  
  public final long A(fw0 paramfw0, long paramLong, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual L : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield y : Z
    //   9: aload_0
    //   10: getfield t : Lq71;
    //   13: astore #9
    //   15: aload #9
    //   17: getfield e : I
    //   20: iconst_1
    //   21: if_icmpeq -> 40
    //   24: aload #9
    //   26: getfield a : Luu1;
    //   29: invokevirtual n : ()Z
    //   32: ifne -> 40
    //   35: aload_0
    //   36: iconst_2
    //   37: invokevirtual I : (I)V
    //   40: aload_0
    //   41: getfield r : Lqt0;
    //   44: astore #11
    //   46: aload #11
    //   48: getfield g : Lot0;
    //   51: astore #10
    //   53: aload #10
    //   55: astore #9
    //   57: aload #9
    //   59: ifnull -> 106
    //   62: aload_1
    //   63: aload #9
    //   65: getfield f : Lpt0;
    //   68: getfield a : Lfw0;
    //   71: invokevirtual equals : (Ljava/lang/Object;)Z
    //   74: ifeq -> 96
    //   77: aload #9
    //   79: getfield d : Z
    //   82: ifeq -> 96
    //   85: aload #11
    //   87: aload #9
    //   89: invokevirtual h : (Lot0;)Z
    //   92: pop
    //   93: goto -> 106
    //   96: aload #11
    //   98: invokevirtual a : ()Lot0;
    //   101: astore #9
    //   103: goto -> 57
    //   106: iload #4
    //   108: ifne -> 141
    //   111: aload #10
    //   113: aload #9
    //   115: if_acmpne -> 141
    //   118: aload #10
    //   120: astore_1
    //   121: aload #9
    //   123: ifnull -> 195
    //   126: aload #10
    //   128: astore_1
    //   129: aload #9
    //   131: getfield n : J
    //   134: lload_2
    //   135: ladd
    //   136: lconst_0
    //   137: lcmp
    //   138: ifge -> 195
    //   141: aload_0
    //   142: getfield v : [Llz0;
    //   145: astore_1
    //   146: aload_1
    //   147: arraylength
    //   148: istore #6
    //   150: iconst_0
    //   151: istore #5
    //   153: iload #5
    //   155: iload #6
    //   157: if_icmpge -> 174
    //   160: aload_0
    //   161: aload_1
    //   162: iload #5
    //   164: aaload
    //   165: invokevirtual e : (Llz0;)V
    //   168: iinc #5, 1
    //   171: goto -> 153
    //   174: aload_0
    //   175: iconst_0
    //   176: anewarray lz0
    //   179: putfield v : [Llz0;
    //   182: aload #9
    //   184: ifnull -> 193
    //   187: aload #9
    //   189: lconst_0
    //   190: putfield n : J
    //   193: aconst_null
    //   194: astore_1
    //   195: aload #9
    //   197: ifnull -> 263
    //   200: aload #9
    //   202: getfield a : Lnt0;
    //   205: astore #10
    //   207: aload_0
    //   208: aload_1
    //   209: invokevirtual P : (Lot0;)V
    //   212: lload_2
    //   213: lstore #7
    //   215: aload #9
    //   217: getfield e : Z
    //   220: ifeq -> 247
    //   223: aload #10
    //   225: lload_2
    //   226: invokeinterface l : (J)J
    //   231: lstore #7
    //   233: aload #10
    //   235: lload #7
    //   237: aload_0
    //   238: getfield n : J
    //   241: lsub
    //   242: invokeinterface m : (J)V
    //   247: aload_0
    //   248: lload #7
    //   250: invokevirtual v : (J)V
    //   253: aload_0
    //   254: invokevirtual p : ()V
    //   257: lload #7
    //   259: lstore_2
    //   260: goto -> 292
    //   263: aload #11
    //   265: iconst_1
    //   266: invokevirtual b : (Z)V
    //   269: aload_0
    //   270: aload_0
    //   271: getfield t : Lq71;
    //   274: getstatic vv1.f : Lvv1;
    //   277: aload_0
    //   278: getfield f : Loz0;
    //   281: invokevirtual c : (Lvv1;Loz0;)Lq71;
    //   284: putfield t : Lq71;
    //   287: aload_0
    //   288: lload_2
    //   289: invokevirtual v : (J)V
    //   292: aload_0
    //   293: iconst_0
    //   294: invokevirtual j : (Z)V
    //   297: aload_0
    //   298: getfield i : Lw9;
    //   301: iconst_2
    //   302: invokevirtual a : (I)V
    //   305: lload_2
    //   306: lreturn
  }
  
  public final void B(a81 parama81) {
    Looper looper = parama81.e.getLooper();
    w9 w91 = this.i;
    if (looper == w91.a.getLooper()) {
      d(parama81);
      int i = this.t.e;
      if (i == 3 || i == 2) {
        w91.a(2);
        return;
      } 
      return;
    } 
    w91.a.obtainMessage(16, parama81).sendToTarget();
  }
  
  public final void C(a81 parama81) {
    Handler handler = parama81.e;
    if (!handler.getLooper().getThread().isAlive()) {
      Log.w("TAG", "Trying to send message on a dead thread.");
      parama81.a(false);
      return;
    } 
    handler.post(new e(this, parama81));
  }
  
  public final void D(boolean paramBoolean, AtomicBoolean paramAtomicBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield C : Z
    //   4: iload_1
    //   5: if_icmpeq -> 61
    //   8: aload_0
    //   9: iload_1
    //   10: putfield C : Z
    //   13: iload_1
    //   14: ifne -> 61
    //   17: aload_0
    //   18: getfield b : [Llz0;
    //   21: astore #5
    //   23: aload #5
    //   25: arraylength
    //   26: istore #4
    //   28: iconst_0
    //   29: istore_3
    //   30: iload_3
    //   31: iload #4
    //   33: if_icmpge -> 61
    //   36: aload #5
    //   38: iload_3
    //   39: aaload
    //   40: astore #6
    //   42: aload #6
    //   44: getfield c : I
    //   47: ifne -> 55
    //   50: aload #6
    //   52: invokevirtual e : ()V
    //   55: iinc #3, 1
    //   58: goto -> 30
    //   61: aload_2
    //   62: ifnull -> 84
    //   65: aload_0
    //   66: monitorenter
    //   67: aload_2
    //   68: iconst_1
    //   69: invokevirtual set : (Z)V
    //   72: aload_0
    //   73: invokevirtual notifyAll : ()V
    //   76: aload_0
    //   77: monitorexit
    //   78: return
    //   79: astore_2
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_2
    //   83: athrow
    //   84: return
    // Exception table:
    //   from	to	target	type
    //   67	78	79	finally
    //   80	82	79	finally
  }
  
  public final void E(boolean paramBoolean) {
    this.y = false;
    this.x = paramBoolean;
    if (!paramBoolean) {
      L();
      O();
      return;
    } 
    int i = this.t.e;
    w9 w91 = this.i;
    if (i == 3) {
      J();
      w91.a(2);
      return;
    } 
    if (i == 2)
      w91.a(2); 
  }
  
  public final void F(r71 paramr71) {
    ow ow1 = this.o;
    cp1 cp1 = (cp1)ow1.c;
    if (cp1.b)
      cp1.b(cp1.a()); 
    cp1.e = paramr71;
    paramr71 = (r71)((cp1)ow1.c).e;
    this.i.a.obtainMessage(17, 1, 0, paramr71).sendToTarget();
  }
  
  public final void G(int paramInt) {
    this.A = paramInt;
    qt0 qt01 = this.r;
    qt01.e = paramInt;
    if (!qt01.k())
      y(true); 
    j(false);
  }
  
  public final void H(boolean paramBoolean) {
    this.B = paramBoolean;
    qt0 qt01 = this.r;
    qt01.f = paramBoolean;
    if (!qt01.k())
      y(true); 
    j(false);
  }
  
  public final void I(int paramInt) {
    q71 q711 = this.t;
    if (q711.e != paramInt)
      this.t = new q71(q711.a, q711.b, q711.c, q711.d, paramInt, q711.f, q711.g, q711.h, q711.i, q711.j, q711.k, q711.l, q711.m); 
  }
  
  public final void J() {
    this.y = false;
    ow ow1 = this.o;
    ow1.b = true;
    cp1 cp1 = (cp1)ow1.c;
    if (!cp1.b) {
      cp1.d = SystemClock.elapsedRealtime();
      cp1.b = true;
    } 
    for (lz0 lz01 : this.v) {
      boolean bool;
      if (lz01.c == 1) {
        bool = true;
      } else {
        bool = false;
      } 
      n21.r(bool);
      lz01.c = 2;
      lz01.j.i();
    } 
  }
  
  public final void K(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (paramBoolean1 || !this.C) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    u(paramBoolean1, true, paramBoolean2, paramBoolean2, paramBoolean2);
    int i = this.D;
    r60 r601 = this.p;
    r601.b += i + paramBoolean3;
    this.D = 0;
    this.g.b(true);
    I(1);
  }
  
  public final void L() {
    ow ow1 = this.o;
    byte b = 0;
    ow1.b = false;
    cp1 cp1 = (cp1)ow1.c;
    if (cp1.b) {
      cp1.b(cp1.a());
      cp1.b = false;
    } 
    lz0[] arrayOfLz0 = this.v;
    int i = arrayOfLz0.length;
    while (b < i) {
      h(arrayOfLz0[b]);
      b++;
    } 
  }
  
  public final void M() {
    boolean bool;
    ot0 ot0 = this.r.i;
    if (this.z || (ot0 != null && ot0.a.a())) {
      bool = true;
    } else {
      bool = false;
    } 
    q71 q711 = this.t;
    if (bool != q711.g)
      this.t = new q71(q711.a, q711.b, q711.c, q711.d, q711.e, q711.f, bool, q711.h, q711.i, q711.j, q711.k, q711.l, q711.m); 
  }
  
  public final void N(oz0 paramoz0) {
    xv1 xv1 = (xv1)paramoz0.e;
    byte b = 0;
    int i = 0;
    while (true) {
      lz0[] arrayOfLz0 = this.b;
      if (i < arrayOfLz0.length) {
        arrayOfLz0[i].getClass();
        i++;
        continue;
      } 
      nw nw1 = this.g;
      nw1.l = false;
      i = nw1.g;
      int j = i;
      if (i == -1) {
        i = 0;
        while (true) {
          j = i;
          if (b < arrayOfLz0.length) {
            j = i;
            if (xv1.b[b] != null) {
              arrayOfLz0[b].getClass();
              j = i + 3538944;
            } 
            b++;
            i = j;
            continue;
          } 
          break;
        } 
      } 
      nw1.j = j;
      nw1.a.a(j);
      return;
    } 
  }
  
  public final void O() {
    fw0 fw0;
    ot0 ot02 = this.r.g;
    if (ot02 == null)
      return; 
    if (ot02.d) {
      l1 = ot02.a.d();
    } else {
      l1 = -9223372036854775807L;
    } 
    if (l1 != -9223372036854775807L) {
      v(l1);
      if (l1 != this.t.m) {
        q71 q712 = this.t;
        fw0 = q712.b;
        long l = q712.d;
        this.t = c(fw0, l1, l);
        this.p.a(4);
      } 
    } else {
      ow ow1 = this.o;
      ot0 ot0 = this.r.h;
      ow1.a = true;
      if (ow1.b) {
        cp1 cp1 = (cp1)ow1.c;
        if (!cp1.b) {
          cp1.d = SystemClock.elapsedRealtime();
          cp1.b = true;
        } 
      } 
      if (ow1.a) {
        long l4 = ((cp1)ow1.c).a();
        this.F = l4;
        l1 = ((ot0)fw0).n;
        long l3 = this.t.m;
        if (!this.q.isEmpty() && !this.t.b.b()) {
          q71 q712 = this.t;
          if (q712.c == l3)
            boolean bool = this.H; 
          this.H = false;
          q712.a.b(q712.b.a);
          int i = Math.min(this.G, this.q.size());
          if (i <= 0 || this.q.get(i - 1) == null) {
            if (i >= this.q.size() || this.q.get(i) == null) {
              this.G = i;
            } else {
              tp.b();
              return;
            } 
          } else {
            tp.b();
            return;
          } 
        } 
        this.t.m = l4 - l1;
      } else {
        throw null;
      } 
    } 
    ot0 ot01 = this.r.i;
    this.t.k = ot01.d();
    q71 q711 = this.t;
    long l2 = q711.k;
    ot0 ot03 = this.r.i;
    long l1 = 0L;
    if (ot03 != null)
      l1 = Math.max(0L, l2 - this.F - ot03.n); 
    q711.l = l1;
  }
  
  public final void P(ot0 paramot0) {
    ot0 ot01 = this.r.g;
    if (ot01 != null && paramot0 != ot01) {
      lz0[] arrayOfLz0 = this.b;
      boolean[] arrayOfBoolean = new boolean[arrayOfLz0.length];
      byte b = 0;
      int i;
      for (i = 0; b < arrayOfLz0.length; i = j) {
        boolean bool;
        lz0 lz01 = arrayOfLz0[b];
        if (lz01.c != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        arrayOfBoolean[b] = bool;
        int j = i;
        if (ot01.m.b(b))
          j = i + 1; 
        if (arrayOfBoolean[b] && (!ot01.m.b(b) || (lz01.g && lz01.d == paramot0.c[b])))
          e(lz01); 
        b++;
      } 
      this.t = this.t.c(ot01.l, ot01.m);
      g(arrayOfBoolean, i);
    } 
  }
  
  public final void a(ad paramad, uu1 paramuu1) {
    q60 q60 = new q60(paramad, paramuu1);
    this.i.a.obtainMessage(8, q60).sendToTarget();
  }
  
  public final void b(nt0 paramnt0) {
    this.i.a.obtainMessage(9, paramnt0).sendToTarget();
  }
  
  public final q71 c(fw0 paramfw0, long paramLong1, long paramLong2) {
    this.H = true;
    q71 q711 = this.t;
    long l2 = q711.k;
    ot0 ot0 = this.r.i;
    long l1 = 0L;
    if (ot0 != null)
      l1 = Math.max(0L, l2 - this.F - ot0.n); 
    return q711.a(paramfw0, paramLong1, paramLong2, l1);
  }
  
  public final void e(lz0 paramlz0) {
    ow ow1 = this.o;
    ow1.getClass();
    boolean bool = true;
    if (paramlz0 == null)
      ow1.a = true; 
    h(paramlz0);
    if (paramlz0.c != 1)
      bool = false; 
    n21.r(bool);
    paramlz0.a.c = null;
    paramlz0.c = 0;
    paramlz0.d = null;
    paramlz0.g = false;
    paramlz0.n = null;
    e01 e01 = paramlz0.j;
    e01.c();
    e01.H = false;
    rv rv = paramlz0.k;
    if (rv != null) {
      ByteBuffer byteBuffer = rv.a;
      if (byteBuffer != null)
        byteBuffer.clear(); 
    } 
    paramlz0.k = null;
    paramlz0.l = null;
  }
  
  public final void f() {
    // Byte code:
    //   0: invokestatic uptimeMillis : ()J
    //   3: lstore #15
    //   5: aload_0
    //   6: getfield r : Lqt0;
    //   9: astore #19
    //   11: aload_0
    //   12: getfield u : Lad;
    //   15: astore #18
    //   17: aload #18
    //   19: ifnonnull -> 25
    //   22: goto -> 37
    //   25: aload_0
    //   26: getfield D : I
    //   29: ifle -> 42
    //   32: aload #18
    //   34: invokevirtual g : ()V
    //   37: iconst_0
    //   38: istore_2
    //   39: goto -> 1334
    //   42: aload_0
    //   43: getfield F : J
    //   46: lstore #9
    //   48: aload #19
    //   50: getfield i : Lot0;
    //   53: astore #18
    //   55: aload #18
    //   57: ifnull -> 111
    //   60: aload #18
    //   62: getfield k : Lot0;
    //   65: ifnonnull -> 74
    //   68: iconst_1
    //   69: istore #17
    //   71: goto -> 77
    //   74: iconst_0
    //   75: istore #17
    //   77: iload #17
    //   79: invokestatic r : (Z)V
    //   82: aload #18
    //   84: getfield d : Z
    //   87: ifeq -> 111
    //   90: aload #18
    //   92: getfield a : Lnt0;
    //   95: lload #9
    //   97: aload #18
    //   99: getfield n : J
    //   102: lsub
    //   103: invokeinterface o : (J)V
    //   108: goto -> 111
    //   111: aload #19
    //   113: getfield i : Lot0;
    //   116: astore #18
    //   118: aload #18
    //   120: ifnull -> 201
    //   123: aload #18
    //   125: getfield f : Lpt0;
    //   128: getfield f : Z
    //   131: ifne -> 198
    //   134: aload #18
    //   136: getfield d : Z
    //   139: ifeq -> 198
    //   142: aload #18
    //   144: getfield e : Z
    //   147: ifeq -> 167
    //   150: aload #18
    //   152: getfield a : Lnt0;
    //   155: invokeinterface j : ()J
    //   160: ldc2_w -9223372036854775808
    //   163: lcmp
    //   164: ifne -> 198
    //   167: aload #19
    //   169: getfield i : Lot0;
    //   172: getfield f : Lpt0;
    //   175: getfield d : J
    //   178: ldc2_w -9223372036854775807
    //   181: lcmp
    //   182: ifeq -> 198
    //   185: aload #19
    //   187: getfield j : I
    //   190: bipush #100
    //   192: if_icmpge -> 198
    //   195: goto -> 201
    //   198: goto -> 548
    //   201: aload_0
    //   202: getfield F : J
    //   205: lstore #9
    //   207: aload_0
    //   208: getfield t : Lq71;
    //   211: astore #18
    //   213: aload #19
    //   215: getfield i : Lot0;
    //   218: astore #20
    //   220: aload #20
    //   222: ifnonnull -> 245
    //   225: aload #19
    //   227: aload #18
    //   229: getfield b : Lfw0;
    //   232: aload #18
    //   234: getfield c : J
    //   237: invokevirtual d : (Lfw0;J)Lpt0;
    //   240: astore #18
    //   242: goto -> 256
    //   245: aload #19
    //   247: aload #20
    //   249: lload #9
    //   251: invokevirtual c : (Lot0;J)Lpt0;
    //   254: astore #18
    //   256: aload #18
    //   258: ifnonnull -> 315
    //   261: aload #19
    //   263: getfield i : Lot0;
    //   266: ifnull -> 305
    //   269: aload_0
    //   270: getfield v : [Llz0;
    //   273: astore #18
    //   275: aload #18
    //   277: arraylength
    //   278: istore_3
    //   279: iconst_0
    //   280: istore_2
    //   281: iload_2
    //   282: iload_3
    //   283: if_icmpge -> 305
    //   286: aload #18
    //   288: iload_2
    //   289: aaload
    //   290: invokevirtual c : ()Z
    //   293: ifne -> 299
    //   296: goto -> 198
    //   299: iinc #2, 1
    //   302: goto -> 281
    //   305: aload_0
    //   306: getfield u : Lad;
    //   309: invokevirtual g : ()V
    //   312: goto -> 198
    //   315: aload #18
    //   317: getfield b : J
    //   320: lstore #11
    //   322: aload_0
    //   323: getfield c : [Llz0;
    //   326: astore #21
    //   328: aload_0
    //   329: getfield e : Lzv0;
    //   332: astore #25
    //   334: aload_0
    //   335: getfield g : Lnw;
    //   338: getfield a : Luv;
    //   341: astore #23
    //   343: aload_0
    //   344: getfield u : Lad;
    //   347: astore #22
    //   349: aload_0
    //   350: getfield f : Loz0;
    //   353: astore #24
    //   355: aload #19
    //   357: getfield i : Lot0;
    //   360: astore #20
    //   362: aload #20
    //   364: ifnonnull -> 373
    //   367: lconst_0
    //   368: lstore #9
    //   370: goto -> 392
    //   373: aload #20
    //   375: getfield n : J
    //   378: aload #20
    //   380: getfield f : Lpt0;
    //   383: getfield d : J
    //   386: ladd
    //   387: lload #11
    //   389: lsub
    //   390: lstore #9
    //   392: new ot0
    //   395: dup
    //   396: aload #21
    //   398: lload #9
    //   400: aload #25
    //   402: aload #23
    //   404: aload #22
    //   406: aload #18
    //   408: aload #24
    //   410: invokespecial <init> : ([Llz0;JLzv0;Luv;Lad;Lpt0;Loz0;)V
    //   413: astore #20
    //   415: aload #19
    //   417: getfield i : Lot0;
    //   420: astore #18
    //   422: aload #18
    //   424: ifnull -> 460
    //   427: aload #20
    //   429: aload #18
    //   431: getfield k : Lot0;
    //   434: if_acmpne -> 440
    //   437: goto -> 457
    //   440: aload #18
    //   442: invokevirtual b : ()V
    //   445: aload #18
    //   447: aload #20
    //   449: putfield k : Lot0;
    //   452: aload #18
    //   454: invokevirtual c : ()V
    //   457: goto -> 477
    //   460: aload #19
    //   462: aload #20
    //   464: putfield g : Lot0;
    //   467: aload #19
    //   469: aload #20
    //   471: putfield h : Lot0;
    //   474: goto -> 457
    //   477: aload #19
    //   479: aconst_null
    //   480: putfield k : Ljava/lang/Object;
    //   483: aload #19
    //   485: aload #20
    //   487: putfield i : Lot0;
    //   490: aload #19
    //   492: aload #19
    //   494: getfield j : I
    //   497: iconst_1
    //   498: iadd
    //   499: putfield j : I
    //   502: aload #20
    //   504: getfield a : Lnt0;
    //   507: aload_0
    //   508: lload #11
    //   510: invokeinterface g : (Lmt0;J)V
    //   515: aload #19
    //   517: getfield g : Lot0;
    //   520: aload #20
    //   522: if_acmpne -> 543
    //   525: aload_0
    //   526: aload #20
    //   528: getfield f : Lpt0;
    //   531: getfield b : J
    //   534: aload #20
    //   536: getfield n : J
    //   539: ladd
    //   540: invokevirtual v : (J)V
    //   543: aload_0
    //   544: iconst_0
    //   545: invokevirtual j : (Z)V
    //   548: iconst_0
    //   549: istore #5
    //   551: aload_0
    //   552: getfield z : Z
    //   555: ifeq -> 632
    //   558: aload_0
    //   559: getfield r : Lqt0;
    //   562: getfield i : Lot0;
    //   565: astore #18
    //   567: aload #18
    //   569: ifnonnull -> 575
    //   572: goto -> 610
    //   575: aload #18
    //   577: getfield d : Z
    //   580: ifne -> 589
    //   583: lconst_0
    //   584: lstore #9
    //   586: goto -> 601
    //   589: aload #18
    //   591: getfield a : Lnt0;
    //   594: invokeinterface c : ()J
    //   599: lstore #9
    //   601: lload #9
    //   603: ldc2_w -9223372036854775808
    //   606: lcmp
    //   607: ifne -> 616
    //   610: iconst_0
    //   611: istore #17
    //   613: goto -> 619
    //   616: iconst_1
    //   617: istore #17
    //   619: aload_0
    //   620: iload #17
    //   622: putfield z : Z
    //   625: aload_0
    //   626: invokevirtual M : ()V
    //   629: goto -> 636
    //   632: aload_0
    //   633: invokevirtual p : ()V
    //   636: aload_0
    //   637: getfield b : [Llz0;
    //   640: astore #18
    //   642: aload #19
    //   644: getfield h : Lot0;
    //   647: astore #22
    //   649: aload #22
    //   651: ifnonnull -> 657
    //   654: goto -> 1101
    //   657: aload #22
    //   659: getfield k : Lot0;
    //   662: ifnonnull -> 735
    //   665: aload #22
    //   667: getfield f : Lpt0;
    //   670: getfield f : Z
    //   673: ifeq -> 1101
    //   676: iconst_0
    //   677: istore_2
    //   678: iload_2
    //   679: aload #18
    //   681: arraylength
    //   682: if_icmpge -> 1101
    //   685: aload #18
    //   687: iload_2
    //   688: aaload
    //   689: astore #20
    //   691: aload #22
    //   693: getfield c : [Lli1;
    //   696: iload_2
    //   697: aaload
    //   698: astore #21
    //   700: aload #21
    //   702: ifnull -> 729
    //   705: aload #20
    //   707: getfield d : Lli1;
    //   710: aload #21
    //   712: if_acmpne -> 729
    //   715: aload #20
    //   717: invokevirtual c : ()Z
    //   720: ifeq -> 729
    //   723: aload #20
    //   725: iconst_1
    //   726: putfield g : Z
    //   729: iinc #2, 1
    //   732: goto -> 678
    //   735: aload_0
    //   736: invokevirtual n : ()Z
    //   739: ifne -> 745
    //   742: goto -> 1101
    //   745: aload #22
    //   747: getfield k : Lot0;
    //   750: getfield d : Z
    //   753: ifne -> 759
    //   756: goto -> 1101
    //   759: aload #22
    //   761: getfield m : Loz0;
    //   764: astore #20
    //   766: aload #19
    //   768: getfield h : Lot0;
    //   771: astore #21
    //   773: aload #21
    //   775: ifnull -> 792
    //   778: aload #21
    //   780: getfield k : Lot0;
    //   783: ifnull -> 792
    //   786: iconst_1
    //   787: istore #17
    //   789: goto -> 795
    //   792: iconst_0
    //   793: istore #17
    //   795: iload #17
    //   797: invokestatic r : (Z)V
    //   800: aload #19
    //   802: getfield h : Lot0;
    //   805: getfield k : Lot0;
    //   808: astore #22
    //   810: aload #19
    //   812: aload #22
    //   814: putfield h : Lot0;
    //   817: aload #22
    //   819: getfield m : Loz0;
    //   822: astore #21
    //   824: aload #22
    //   826: getfield a : Lnt0;
    //   829: invokeinterface d : ()J
    //   834: ldc2_w -9223372036854775807
    //   837: lcmp
    //   838: ifeq -> 884
    //   841: aload_0
    //   842: getfield b : [Llz0;
    //   845: astore #20
    //   847: aload #20
    //   849: arraylength
    //   850: istore_3
    //   851: iconst_0
    //   852: istore_2
    //   853: iload_2
    //   854: iload_3
    //   855: if_icmpge -> 1101
    //   858: aload #20
    //   860: iload_2
    //   861: aaload
    //   862: astore #18
    //   864: aload #18
    //   866: getfield d : Lli1;
    //   869: ifnull -> 878
    //   872: aload #18
    //   874: iconst_1
    //   875: putfield g : Z
    //   878: iinc #2, 1
    //   881: goto -> 853
    //   884: iconst_0
    //   885: istore_2
    //   886: iload_2
    //   887: aload #18
    //   889: arraylength
    //   890: if_icmpge -> 1101
    //   893: aload #18
    //   895: iload_2
    //   896: aaload
    //   897: astore #23
    //   899: aload #20
    //   901: iload_2
    //   902: invokevirtual b : (I)Z
    //   905: ifeq -> 1095
    //   908: aload #23
    //   910: getfield g : Z
    //   913: ifne -> 1095
    //   916: aload #21
    //   918: getfield e : Ljava/lang/Object;
    //   921: checkcast xv1
    //   924: getfield b : [Lzd;
    //   927: iload_2
    //   928: aaload
    //   929: astore #24
    //   931: aload #21
    //   933: iload_2
    //   934: invokevirtual b : (I)Z
    //   937: istore #17
    //   939: aload_0
    //   940: getfield c : [Llz0;
    //   943: iload_2
    //   944: aaload
    //   945: invokevirtual getClass : ()Ljava/lang/Class;
    //   948: pop
    //   949: aload #20
    //   951: getfield c : Ljava/lang/Object;
    //   954: checkcast [Lpf1;
    //   957: iload_2
    //   958: aaload
    //   959: astore #25
    //   961: aload #21
    //   963: getfield c : Ljava/lang/Object;
    //   966: checkcast [Lpf1;
    //   969: iload_2
    //   970: aaload
    //   971: astore #26
    //   973: iload #17
    //   975: ifeq -> 1089
    //   978: aload #26
    //   980: aload #25
    //   982: invokevirtual equals : (Ljava/lang/Object;)Z
    //   985: ifeq -> 1089
    //   988: aload #24
    //   990: ifnull -> 1003
    //   993: aload #24
    //   995: getfield c : [I
    //   998: arraylength
    //   999: istore_3
    //   1000: goto -> 1005
    //   1003: iconst_0
    //   1004: istore_3
    //   1005: iload_3
    //   1006: anewarray la0
    //   1009: astore #25
    //   1011: iconst_0
    //   1012: istore #4
    //   1014: iload #4
    //   1016: iload_3
    //   1017: if_icmpge -> 1039
    //   1020: aload #25
    //   1022: iload #4
    //   1024: aload #24
    //   1026: getfield d : [Lla0;
    //   1029: iload #4
    //   1031: aaload
    //   1032: aastore
    //   1033: iinc #4, 1
    //   1036: goto -> 1014
    //   1039: aload #22
    //   1041: getfield c : [Lli1;
    //   1044: iload_2
    //   1045: aaload
    //   1046: astore #24
    //   1048: aload #22
    //   1050: getfield n : J
    //   1053: lstore #9
    //   1055: aload #23
    //   1057: getfield g : Z
    //   1060: iconst_1
    //   1061: ixor
    //   1062: invokestatic r : (Z)V
    //   1065: aload #23
    //   1067: aload #24
    //   1069: putfield d : Lli1;
    //   1072: aload #23
    //   1074: lload #9
    //   1076: putfield f : J
    //   1079: aload #23
    //   1081: lload #9
    //   1083: putfield e : J
    //   1086: goto -> 1095
    //   1089: aload #23
    //   1091: iconst_1
    //   1092: putfield g : Z
    //   1095: iinc #2, 1
    //   1098: goto -> 886
    //   1101: iconst_0
    //   1102: istore_3
    //   1103: iload #5
    //   1105: istore_2
    //   1106: aload_0
    //   1107: getfield x : Z
    //   1110: ifne -> 1116
    //   1113: goto -> 1334
    //   1116: aload #19
    //   1118: getfield g : Lot0;
    //   1121: astore #18
    //   1123: aload #18
    //   1125: ifnonnull -> 1131
    //   1128: goto -> 1113
    //   1131: aload #18
    //   1133: getfield k : Lot0;
    //   1136: astore #20
    //   1138: aload #20
    //   1140: ifnonnull -> 1146
    //   1143: goto -> 1113
    //   1146: aload #18
    //   1148: aload #19
    //   1150: getfield h : Lot0;
    //   1153: if_acmpne -> 1166
    //   1156: aload_0
    //   1157: invokevirtual n : ()Z
    //   1160: ifne -> 1166
    //   1163: goto -> 1113
    //   1166: aload_0
    //   1167: getfield F : J
    //   1170: aload #20
    //   1172: getfield f : Lpt0;
    //   1175: getfield b : J
    //   1178: aload #20
    //   1180: getfield n : J
    //   1183: ladd
    //   1184: lcmp
    //   1185: iflt -> 1113
    //   1188: iload_3
    //   1189: ifeq -> 1196
    //   1192: aload_0
    //   1193: invokevirtual q : ()V
    //   1196: aload #19
    //   1198: getfield g : Lot0;
    //   1201: astore #18
    //   1203: aload #18
    //   1205: aload #19
    //   1207: getfield h : Lot0;
    //   1210: if_acmpne -> 1258
    //   1213: aload_0
    //   1214: getfield b : [Llz0;
    //   1217: astore #21
    //   1219: aload #21
    //   1221: arraylength
    //   1222: istore #4
    //   1224: iload_2
    //   1225: istore_3
    //   1226: iload_3
    //   1227: iload #4
    //   1229: if_icmpge -> 1258
    //   1232: aload #21
    //   1234: iload_3
    //   1235: aaload
    //   1236: astore #20
    //   1238: aload #20
    //   1240: getfield d : Lli1;
    //   1243: ifnull -> 1252
    //   1246: aload #20
    //   1248: iconst_1
    //   1249: putfield g : Z
    //   1252: iinc #3, 1
    //   1255: goto -> 1226
    //   1258: aload #19
    //   1260: invokevirtual a : ()Lot0;
    //   1263: astore #20
    //   1265: aload_0
    //   1266: aload #18
    //   1268: invokevirtual P : (Lot0;)V
    //   1271: aload #20
    //   1273: getfield f : Lpt0;
    //   1276: astore #20
    //   1278: aload_0
    //   1279: aload_0
    //   1280: aload #20
    //   1282: getfield a : Lfw0;
    //   1285: aload #20
    //   1287: getfield b : J
    //   1290: ldc2_w -9223372036854775807
    //   1293: invokevirtual c : (Lfw0;JJ)Lq71;
    //   1296: putfield t : Lq71;
    //   1299: aload #18
    //   1301: getfield f : Lpt0;
    //   1304: getfield e : Z
    //   1307: ifeq -> 1315
    //   1310: iload_2
    //   1311: istore_3
    //   1312: goto -> 1317
    //   1315: iconst_3
    //   1316: istore_3
    //   1317: aload_0
    //   1318: getfield p : Lr60;
    //   1321: iload_3
    //   1322: invokevirtual a : (I)V
    //   1325: aload_0
    //   1326: invokevirtual O : ()V
    //   1329: iconst_1
    //   1330: istore_3
    //   1331: goto -> 1106
    //   1334: iconst_1
    //   1335: istore #8
    //   1337: aload_0
    //   1338: getfield t : Lq71;
    //   1341: getfield e : I
    //   1344: istore_3
    //   1345: iload_3
    //   1346: iconst_1
    //   1347: if_icmpeq -> 2606
    //   1350: iload_3
    //   1351: iconst_4
    //   1352: if_icmpeq -> 2606
    //   1355: getstatic da2.a : B
    //   1358: ifeq -> 1364
    //   1361: goto -> 2606
    //   1364: aload_0
    //   1365: getfield r : Lqt0;
    //   1368: getfield g : Lot0;
    //   1371: astore #18
    //   1373: ldc2_w 10
    //   1376: lstore #9
    //   1378: aload #18
    //   1380: ifnonnull -> 1415
    //   1383: aload_0
    //   1384: getfield i : Lw9;
    //   1387: astore #18
    //   1389: aload #18
    //   1391: getfield a : Landroid/os/Handler;
    //   1394: iconst_2
    //   1395: invokevirtual removeMessages : (I)V
    //   1398: aload #18
    //   1400: getfield a : Landroid/os/Handler;
    //   1403: iconst_2
    //   1404: lload #15
    //   1406: ldc2_w 10
    //   1409: ladd
    //   1410: invokevirtual sendEmptyMessageAtTime : (IJ)Z
    //   1413: pop
    //   1414: return
    //   1415: aload_0
    //   1416: invokevirtual O : ()V
    //   1419: aload #18
    //   1421: getfield d : Z
    //   1424: ifeq -> 1984
    //   1427: invokestatic elapsedRealtime : ()J
    //   1430: pop2
    //   1431: aload #18
    //   1433: getfield a : Lnt0;
    //   1436: aload_0
    //   1437: getfield t : Lq71;
    //   1440: getfield m : J
    //   1443: aload_0
    //   1444: getfield n : J
    //   1447: lsub
    //   1448: invokeinterface m : (J)V
    //   1453: iconst_1
    //   1454: istore #4
    //   1456: iconst_1
    //   1457: istore_3
    //   1458: iload_2
    //   1459: istore #5
    //   1461: aload_0
    //   1462: getfield b : [Llz0;
    //   1465: astore #19
    //   1467: iload #5
    //   1469: aload #19
    //   1471: arraylength
    //   1472: if_icmpge -> 1974
    //   1475: aload #19
    //   1477: iload #5
    //   1479: aaload
    //   1480: astore #19
    //   1482: aload #19
    //   1484: getfield c : I
    //   1487: ifne -> 1493
    //   1490: goto -> 1943
    //   1493: aload #19
    //   1495: getfield m : Lrv;
    //   1498: astore #20
    //   1500: aload #19
    //   1502: getfield q : Z
    //   1505: ifeq -> 1542
    //   1508: aload #19
    //   1510: getfield l : Lrv;
    //   1513: ifnonnull -> 1542
    //   1516: aload #19
    //   1518: getfield j : Le01;
    //   1521: invokevirtual k : ()V
    //   1524: goto -> 1726
    //   1527: astore #18
    //   1529: aload #19
    //   1531: aload #18
    //   1533: aload #19
    //   1535: getfield n : Lla0;
    //   1538: invokevirtual b : (Ljava/lang/Exception;Lla0;)Ll60;
    //   1541: athrow
    //   1542: aload #19
    //   1544: getfield n : Lla0;
    //   1547: ifnonnull -> 1711
    //   1550: aload #19
    //   1552: getfield a : Lgh1;
    //   1555: astore #21
    //   1557: aload #21
    //   1559: aconst_null
    //   1560: putfield c : Ljava/lang/Object;
    //   1563: aload #20
    //   1565: invokevirtual clear : ()V
    //   1568: aload #19
    //   1570: aload #21
    //   1572: aload #20
    //   1574: iconst_1
    //   1575: invokevirtual d : (Lgh1;Lrv;Z)I
    //   1578: istore #6
    //   1580: iload #6
    //   1582: bipush #-5
    //   1584: if_icmpne -> 1687
    //   1587: aload #21
    //   1589: getfield c : Ljava/lang/Object;
    //   1592: checkcast la0
    //   1595: astore #21
    //   1597: aload #21
    //   1599: invokevirtual getClass : ()Ljava/lang/Class;
    //   1602: pop
    //   1603: aload #19
    //   1605: getfield n : Lla0;
    //   1608: astore #20
    //   1610: aload #19
    //   1612: aload #21
    //   1614: putfield n : Lla0;
    //   1617: aload #20
    //   1619: ifnull -> 1635
    //   1622: aload #20
    //   1624: aload #21
    //   1626: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1629: ifeq -> 1635
    //   1632: goto -> 1641
    //   1635: aload #19
    //   1637: iconst_1
    //   1638: putfield r : Z
    //   1641: aload #19
    //   1643: getfield i : Lw9;
    //   1646: astore #20
    //   1648: aload #19
    //   1650: getfield n : Lla0;
    //   1653: astore #21
    //   1655: aload #20
    //   1657: getfield a : Landroid/os/Handler;
    //   1660: astore #22
    //   1662: aload #22
    //   1664: ifnull -> 1711
    //   1667: aload #22
    //   1669: new v9
    //   1672: dup
    //   1673: aload #20
    //   1675: aload #21
    //   1677: invokespecial <init> : (Lw9;Lla0;)V
    //   1680: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1683: pop
    //   1684: goto -> 1711
    //   1687: iload #6
    //   1689: bipush #-4
    //   1691: if_icmpne -> 1726
    //   1694: ldc_w 'MAR.rd>if==n>r=RBR!!'
    //   1697: invokestatic G : (Ljava/lang/String;)V
    //   1700: aload #20
    //   1702: invokevirtual isEndOfStream : ()Z
    //   1705: invokestatic r : (Z)V
    //   1708: goto -> 1726
    //   1711: aload #19
    //   1713: invokevirtual a : ()Z
    //   1716: istore #17
    //   1718: iload #17
    //   1720: ifeq -> 1726
    //   1723: goto -> 1711
    //   1726: iload #4
    //   1728: ifeq -> 1756
    //   1731: aload #19
    //   1733: getfield q : Z
    //   1736: ifeq -> 1756
    //   1739: aload #19
    //   1741: getfield j : Le01;
    //   1744: invokevirtual g : ()Z
    //   1747: ifeq -> 1756
    //   1750: iconst_1
    //   1751: istore #4
    //   1753: goto -> 1759
    //   1756: iload_2
    //   1757: istore #4
    //   1759: aload #18
    //   1761: getfield c : [Lli1;
    //   1764: iload #5
    //   1766: aaload
    //   1767: aload #19
    //   1769: getfield d : Lli1;
    //   1772: if_acmpeq -> 1781
    //   1775: iconst_1
    //   1776: istore #6
    //   1778: goto -> 1784
    //   1781: iload_2
    //   1782: istore #6
    //   1784: iload #6
    //   1786: ifne -> 1811
    //   1789: aload #18
    //   1791: getfield k : Lot0;
    //   1794: ifnull -> 1811
    //   1797: aload #19
    //   1799: invokevirtual c : ()Z
    //   1802: ifeq -> 1811
    //   1805: iconst_1
    //   1806: istore #7
    //   1808: goto -> 1814
    //   1811: iload_2
    //   1812: istore #7
    //   1814: iload #6
    //   1816: ifne -> 1909
    //   1819: iload #7
    //   1821: ifne -> 1909
    //   1824: aload #19
    //   1826: getfield j : Le01;
    //   1829: invokevirtual f : ()Z
    //   1832: ifne -> 1909
    //   1835: aload #19
    //   1837: getfield n : Lla0;
    //   1840: ifnull -> 1881
    //   1843: aload #19
    //   1845: invokevirtual c : ()Z
    //   1848: ifeq -> 1861
    //   1851: aload #19
    //   1853: getfield g : Z
    //   1856: istore #17
    //   1858: goto -> 1873
    //   1861: aload #19
    //   1863: getfield d : Lli1;
    //   1866: invokeinterface b : ()Z
    //   1871: istore #17
    //   1873: iload #17
    //   1875: ifeq -> 1881
    //   1878: goto -> 1909
    //   1881: aload #19
    //   1883: getfield q : Z
    //   1886: ifeq -> 1903
    //   1889: aload #19
    //   1891: getfield j : Le01;
    //   1894: invokevirtual g : ()Z
    //   1897: ifeq -> 1903
    //   1900: goto -> 1909
    //   1903: iload_2
    //   1904: istore #6
    //   1906: goto -> 1912
    //   1909: iconst_1
    //   1910: istore #6
    //   1912: iload_3
    //   1913: ifeq -> 1926
    //   1916: iload #6
    //   1918: ifeq -> 1926
    //   1921: iconst_1
    //   1922: istore_3
    //   1923: goto -> 1928
    //   1926: iload_2
    //   1927: istore_3
    //   1928: iload #6
    //   1930: ifne -> 1943
    //   1933: aload #19
    //   1935: getfield d : Lli1;
    //   1938: invokeinterface c : ()V
    //   1943: iinc #5, 1
    //   1946: goto -> 1461
    //   1949: astore #18
    //   1951: goto -> 1961
    //   1954: astore #18
    //   1956: goto -> 1961
    //   1959: astore #18
    //   1961: aload #19
    //   1963: aload #18
    //   1965: aload #19
    //   1967: getfield n : Lla0;
    //   1970: invokevirtual b : (Ljava/lang/Exception;Lla0;)Ll60;
    //   1973: athrow
    //   1974: iload_3
    //   1975: istore #5
    //   1977: lload #9
    //   1979: lstore #11
    //   1981: goto -> 2005
    //   1984: ldc2_w 10
    //   1987: lstore #11
    //   1989: aload #18
    //   1991: getfield a : Lnt0;
    //   1994: invokeinterface k : ()V
    //   1999: iconst_1
    //   2000: istore #5
    //   2002: iconst_1
    //   2003: istore #4
    //   2005: aload #18
    //   2007: getfield f : Lpt0;
    //   2010: getfield d : J
    //   2013: lstore #9
    //   2015: iload #4
    //   2017: ifeq -> 2073
    //   2020: aload #18
    //   2022: getfield d : Z
    //   2025: ifeq -> 2073
    //   2028: lload #9
    //   2030: ldc2_w -9223372036854775807
    //   2033: lcmp
    //   2034: ifeq -> 2050
    //   2037: lload #9
    //   2039: aload_0
    //   2040: getfield t : Lq71;
    //   2043: getfield m : J
    //   2046: lcmp
    //   2047: ifgt -> 2073
    //   2050: aload #18
    //   2052: getfield f : Lpt0;
    //   2055: getfield f : Z
    //   2058: ifeq -> 2073
    //   2061: aload_0
    //   2062: iconst_4
    //   2063: invokevirtual I : (I)V
    //   2066: aload_0
    //   2067: invokevirtual L : ()V
    //   2070: goto -> 2443
    //   2073: aload_0
    //   2074: getfield t : Lq71;
    //   2077: astore #18
    //   2079: aload #18
    //   2081: getfield e : I
    //   2084: iconst_2
    //   2085: if_icmpne -> 2392
    //   2088: aload_0
    //   2089: getfield v : [Llz0;
    //   2092: arraylength
    //   2093: ifne -> 2104
    //   2096: aload_0
    //   2097: invokevirtual o : ()Z
    //   2100: istore_3
    //   2101: goto -> 2369
    //   2104: iload #5
    //   2106: ifne -> 2114
    //   2109: iload_2
    //   2110: istore_3
    //   2111: goto -> 2369
    //   2114: aload #18
    //   2116: getfield g : Z
    //   2119: ifne -> 2128
    //   2122: iload #8
    //   2124: istore_3
    //   2125: goto -> 2369
    //   2128: aload_0
    //   2129: getfield r : Lqt0;
    //   2132: getfield i : Lot0;
    //   2135: astore #18
    //   2137: aload #18
    //   2139: getfield d : Z
    //   2142: ifeq -> 2187
    //   2145: aload #18
    //   2147: getfield e : Z
    //   2150: ifeq -> 2170
    //   2153: aload #18
    //   2155: getfield a : Lnt0;
    //   2158: invokeinterface j : ()J
    //   2163: ldc2_w -9223372036854775808
    //   2166: lcmp
    //   2167: ifne -> 2187
    //   2170: aload #18
    //   2172: getfield f : Lpt0;
    //   2175: getfield f : Z
    //   2178: ifeq -> 2187
    //   2181: iload #8
    //   2183: istore_3
    //   2184: goto -> 2369
    //   2187: aload_0
    //   2188: getfield g : Lnw;
    //   2191: astore #18
    //   2193: aload_0
    //   2194: getfield t : Lq71;
    //   2197: getfield k : J
    //   2200: lstore #9
    //   2202: aload_0
    //   2203: getfield r : Lqt0;
    //   2206: getfield i : Lot0;
    //   2209: astore #19
    //   2211: aload #19
    //   2213: ifnonnull -> 2222
    //   2216: lconst_0
    //   2217: lstore #9
    //   2219: goto -> 2241
    //   2222: lconst_0
    //   2223: lload #9
    //   2225: aload_0
    //   2226: getfield F : J
    //   2229: aload #19
    //   2231: getfield n : J
    //   2234: lsub
    //   2235: lsub
    //   2236: invokestatic max : (JJ)J
    //   2239: lstore #9
    //   2241: aload_0
    //   2242: getfield o : Low;
    //   2245: getfield c : Ljava/lang/Object;
    //   2248: checkcast cp1
    //   2251: getfield e : Ljava/lang/Object;
    //   2254: checkcast r71
    //   2257: getfield a : F
    //   2260: fstore_1
    //   2261: aload_0
    //   2262: getfield y : Z
    //   2265: istore #17
    //   2267: getstatic d12.a : I
    //   2270: istore_3
    //   2271: fload_1
    //   2272: fconst_1
    //   2273: fcmpl
    //   2274: ifne -> 2280
    //   2277: goto -> 2291
    //   2280: lload #9
    //   2282: l2d
    //   2283: fload_1
    //   2284: f2d
    //   2285: ddiv
    //   2286: invokestatic round : (D)J
    //   2289: lstore #9
    //   2291: iload #17
    //   2293: ifeq -> 2306
    //   2296: aload #18
    //   2298: getfield f : J
    //   2301: lstore #13
    //   2303: goto -> 2316
    //   2306: aload #18
    //   2308: getfield e : J
    //   2311: lstore #13
    //   2313: goto -> 2303
    //   2316: iload #8
    //   2318: istore_3
    //   2319: lload #13
    //   2321: lconst_0
    //   2322: lcmp
    //   2323: ifle -> 2369
    //   2326: iload #8
    //   2328: istore_3
    //   2329: lload #9
    //   2331: lload #13
    //   2333: lcmp
    //   2334: ifge -> 2369
    //   2337: aload #18
    //   2339: getfield h : Z
    //   2342: ifne -> 2109
    //   2345: aload #18
    //   2347: getfield a : Luv;
    //   2350: astore #19
    //   2352: aload #19
    //   2354: monitorenter
    //   2355: aload #19
    //   2357: monitorexit
    //   2358: aload #18
    //   2360: getfield j : I
    //   2363: ifgt -> 2109
    //   2366: iload #8
    //   2368: istore_3
    //   2369: iload_3
    //   2370: ifeq -> 2392
    //   2373: aload_0
    //   2374: iconst_3
    //   2375: invokevirtual I : (I)V
    //   2378: aload_0
    //   2379: getfield x : Z
    //   2382: ifeq -> 2443
    //   2385: aload_0
    //   2386: invokevirtual J : ()V
    //   2389: goto -> 2443
    //   2392: aload_0
    //   2393: getfield t : Lq71;
    //   2396: getfield e : I
    //   2399: iconst_3
    //   2400: if_icmpne -> 2443
    //   2403: aload_0
    //   2404: getfield v : [Llz0;
    //   2407: arraylength
    //   2408: ifne -> 2421
    //   2411: aload_0
    //   2412: invokevirtual o : ()Z
    //   2415: ifeq -> 2426
    //   2418: goto -> 2443
    //   2421: iload #5
    //   2423: ifne -> 2443
    //   2426: aload_0
    //   2427: aload_0
    //   2428: getfield x : Z
    //   2431: putfield y : Z
    //   2434: aload_0
    //   2435: iconst_2
    //   2436: invokevirtual I : (I)V
    //   2439: aload_0
    //   2440: invokevirtual L : ()V
    //   2443: aload_0
    //   2444: getfield t : Lq71;
    //   2447: getfield e : I
    //   2450: iconst_2
    //   2451: if_icmpne -> 2487
    //   2454: aload_0
    //   2455: getfield v : [Llz0;
    //   2458: astore #18
    //   2460: aload #18
    //   2462: arraylength
    //   2463: istore_3
    //   2464: iload_2
    //   2465: iload_3
    //   2466: if_icmpge -> 2487
    //   2469: aload #18
    //   2471: iload_2
    //   2472: aaload
    //   2473: getfield d : Lli1;
    //   2476: invokeinterface c : ()V
    //   2481: iinc #2, 1
    //   2484: goto -> 2464
    //   2487: aload_0
    //   2488: getfield x : Z
    //   2491: ifeq -> 2505
    //   2494: aload_0
    //   2495: getfield t : Lq71;
    //   2498: getfield e : I
    //   2501: iconst_3
    //   2502: if_icmpeq -> 2518
    //   2505: aload_0
    //   2506: getfield t : Lq71;
    //   2509: getfield e : I
    //   2512: istore_2
    //   2513: iload_2
    //   2514: iconst_2
    //   2515: if_icmpne -> 2549
    //   2518: aload_0
    //   2519: getfield i : Lw9;
    //   2522: astore #18
    //   2524: aload #18
    //   2526: getfield a : Landroid/os/Handler;
    //   2529: iconst_2
    //   2530: invokevirtual removeMessages : (I)V
    //   2533: aload #18
    //   2535: getfield a : Landroid/os/Handler;
    //   2538: iconst_2
    //   2539: lload #15
    //   2541: lload #11
    //   2543: ladd
    //   2544: invokevirtual sendEmptyMessageAtTime : (IJ)Z
    //   2547: pop
    //   2548: return
    //   2549: aload_0
    //   2550: getfield v : [Llz0;
    //   2553: arraylength
    //   2554: ifeq -> 2594
    //   2557: iload_2
    //   2558: iconst_4
    //   2559: if_icmpeq -> 2594
    //   2562: aload_0
    //   2563: getfield i : Lw9;
    //   2566: astore #18
    //   2568: aload #18
    //   2570: getfield a : Landroid/os/Handler;
    //   2573: iconst_2
    //   2574: invokevirtual removeMessages : (I)V
    //   2577: aload #18
    //   2579: getfield a : Landroid/os/Handler;
    //   2582: iconst_2
    //   2583: lload #15
    //   2585: ldc2_w 1000
    //   2588: ladd
    //   2589: invokevirtual sendEmptyMessageAtTime : (IJ)Z
    //   2592: pop
    //   2593: return
    //   2594: aload_0
    //   2595: getfield i : Lw9;
    //   2598: getfield a : Landroid/os/Handler;
    //   2601: iconst_2
    //   2602: invokevirtual removeMessages : (I)V
    //   2605: return
    //   2606: aload_0
    //   2607: getfield i : Lw9;
    //   2610: getfield a : Landroid/os/Handler;
    //   2613: iconst_2
    //   2614: invokevirtual removeMessages : (I)V
    //   2617: return
    // Exception table:
    //   from	to	target	type
    //   1516	1524	1527	z9
    //   1711	1718	1959	x9
    //   1711	1718	1954	y9
    //   1711	1718	1949	z9
  }
  
  public final void g(boolean[] paramArrayOfboolean, int paramInt) {
    this.v = new lz0[paramInt];
    qt0 qt01 = this.r;
    oz0 oz01 = qt01.g.m;
    paramInt = 0;
    while (true) {
      lz0[] arrayOfLz0 = this.b;
      if (paramInt < arrayOfLz0.length) {
        if (!oz01.b(paramInt))
          arrayOfLz0[paramInt].e(); 
        paramInt++;
        continue;
      } 
      paramInt = 0;
      byte b = 0;
      while (paramInt < arrayOfLz0.length) {
        if (oz01.b(paramInt)) {
          boolean bool = paramArrayOfboolean[paramInt];
          ot0 ot0 = qt01.g;
          lz0 lz01 = arrayOfLz0[paramInt];
          this.v[b] = lz01;
          if (lz01.c == 0) {
            int i;
            oz0 oz02 = ot0.m;
            pf1 pf1 = ((pf1[])oz02.c)[paramInt];
            zd zd = ((xv1)oz02.e).b[paramInt];
            if (zd != null) {
              i = zd.c.length;
            } else {
              i = 0;
            } 
            la0[] arrayOfLa0 = new la0[i];
            int j;
            for (j = 0; j < i; j++)
              arrayOfLa0[j] = zd.d[j]; 
            if (this.x && this.t.e == 3) {
              i = 1;
            } else {
              i = 0;
            } 
            li1 li1 = ot0.c[paramInt];
            long l2 = this.F;
            long l1 = ot0.n;
            e01 e01 = lz01.j;
            if (lz01.c == 0) {
              bool = true;
            } else {
              bool = false;
            } 
            n21.r(bool);
            lz01.c = 1;
            j = pf1.a;
            if (j != 0) {
              e01.getClass();
              if (d12.a >= 21) {
                bool = true;
              } else {
                bool = false;
              } 
              n21.r(bool);
              if (!e01.K || e01.I != j) {
                e01.K = true;
                e01.c();
              } 
            } else if (e01.K) {
              e01.K = false;
              e01.c();
            } 
            n21.r(lz01.g ^ true);
            lz01.d = li1;
            lz01.f = l1;
            lz01.e = l1;
            ui0.G("MAR.opR");
            lz01.o = l2;
            lz01.p = true;
            e01.c();
            lz01.q = false;
            rv rv = lz01.k;
            if (rv != null) {
              ByteBuffer byteBuffer = rv.a;
              if (byteBuffer != null)
                byteBuffer.clear(); 
            } 
            lz01.k = null;
            lz01.l = null;
            this.o.getClass();
            if (i != 0) {
              i = lz01.c;
              bool = true;
              if (i != 1)
                bool = false; 
              n21.r(bool);
              lz01.c = 2;
              e01.i();
            } 
          } 
          b++;
        } 
        paramInt++;
      } 
      return;
    } 
  }
  
  public final boolean handleMessage(Message paramMessage) {
    boolean bool1;
    boolean bool2;
    try {
      a81 a81;
      r71 r71;
      Set<Object> set;
      switch (paramMessage.what) {
        default:
          return false;
        case 17:
          r71 = (r71)paramMessage.obj;
          if (paramMessage.arg1 != 0) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          l(r71, bool1);
          q();
          return true;
        case 16:
          C((a81)paramMessage.obj);
          q();
          return true;
        case 15:
          a81 = (a81)paramMessage.obj;
          a81.getClass();
          B(a81);
          q();
          return true;
        case 14:
          if (((Message)a81).arg1 != 0) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          D(bool1, (AtomicBoolean)((Message)a81).obj);
          q();
          return true;
        case 13:
          if (((Message)a81).arg1 != 0) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          H(bool1);
          q();
          return true;
        case 12:
          G(((Message)a81).arg1);
          q();
          return true;
        case 11:
          t();
          q();
          return true;
        case 10:
          i((nt0)((Message)a81).obj);
          q();
          return true;
        case 9:
          set = ca2.a;
          if (set.contains(Integer.valueOf(754)) || set.contains(Integer.valueOf(2793)))
            k((nt0)((Message)a81).obj); 
          q();
          return true;
        case 8:
          m((q60)((Message)a81).obj);
          q();
          return true;
        case 7:
          s();
          return true;
        case 6:
          if (((Message)a81).arg1 != 0) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          K(false, bool1, true);
          q();
          return true;
        case 5:
          this.s = (bk1)((Message)a81).obj;
          q();
          return true;
        case 4:
          F((r71)((Message)a81).obj);
          q();
          return true;
        case 3:
          z((s60)((Message)a81).obj);
          q();
          return true;
        case 2:
          f();
          q();
          return true;
        case 1:
          if (((Message)a81).arg1 != 0) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          E(bool1);
          q();
          return true;
        case 0:
          break;
      } 
    } catch (l60 l60) {
    
    } catch (IOException iOException) {
    
    } catch (RuntimeException runtimeException) {
    
    } catch (OutOfMemoryError outOfMemoryError) {}
    ad ad1 = (ad)((Message)outOfMemoryError).obj;
    if (((Message)outOfMemoryError).arg1 != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (((Message)outOfMemoryError).arg2 != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    r(ad1, bool1, bool2);
    q();
    return true;
  }
  
  public final void i(nt0 paramnt0) {
    ot0 ot0 = this.r.i;
    if (ot0 != null && ot0.a == paramnt0) {
      long l = this.F;
      if (ot0 != null) {
        boolean bool;
        if (ot0.k == null) {
          bool = true;
        } else {
          bool = false;
        } 
        n21.r(bool);
        if (ot0.d)
          ot0.a.o(l - ot0.n); 
      } 
      p();
    } 
  }
  
  public final void j(boolean paramBoolean) {
    fw0 fw0;
    ot0 ot02 = this.r.i;
    if (ot02 == null) {
      fw0 = this.t.b;
    } else {
      fw0 = ot02.f.a;
    } 
    boolean bool = this.t.j.equals(fw0);
    if (!bool) {
      q71 q713 = this.t;
      this.t = new q71(q713.a, q713.b, q713.c, q713.d, q713.e, q713.f, q713.g, q713.h, q713.i, fw0, q713.k, q713.l, q713.m);
    } 
    q71 q711 = this.t;
    if (ot02 == null) {
      l1 = q711.m;
    } else {
      l1 = ot02.d();
    } 
    q711.k = l1;
    q71 q712 = this.t;
    long l2 = q712.k;
    ot0 ot01 = this.r.i;
    long l1 = 0L;
    if (ot01 != null)
      l1 = Math.max(0L, l2 - this.F - ot01.n); 
    q712.l = l1;
    if ((!bool || paramBoolean) && ot02 != null && ot02.d)
      N(ot02.m); 
  }
  
  public final void k(nt0 paramnt0) {
    qt0 qt01 = this.r;
    ot0 ot0 = qt01.i;
    if (ot0 != null) {
      nt0 nt01 = ot0.a;
      if (nt01 == paramnt0) {
        float f = ((r71)((cp1)this.o.c).e).a;
        uu1 uu1 = this.t.a;
        ot0.d = true;
        ot0.l = nt01.i();
        long l2 = ot0.a(ot0.f(f), ot0.f.b, false, new boolean[ot0.h.length]);
        long l3 = ot0.n;
        pt0 pt0 = ot0.f;
        long l1 = pt0.b;
        ot0.n = l1 - l2 + l3;
        if (l2 != l1)
          pt0 = new pt0(pt0.a, l2, pt0.c, pt0.d, pt0.e, pt0.f); 
        ot0.f = pt0;
        N(ot0.m);
        if (ot0 == qt01.g) {
          v(ot0.f.b);
          P(null);
        } 
        p();
      } 
    } 
  }
  
  public final void l(r71 paramr71, boolean paramBoolean) {
    cj cj1 = this.k;
    boolean bool = false;
    cj1.obtainMessage(1, paramBoolean, 0, paramr71).sendToTarget();
    float f = paramr71.a;
    for (ot0 ot0 = this.r.g; ot0 != null; ot0 = ot0.k) {
      zd[] arrayOfZd = (zd[])((xv1)ot0.m.e).b.clone();
      int j = arrayOfZd.length;
      for (paramBoolean = false; paramBoolean < j; paramBoolean++)
        zd zd = arrayOfZd[paramBoolean]; 
    } 
    lz0[] arrayOfLz0 = this.b;
    int i = arrayOfLz0.length;
    for (paramBoolean = bool; paramBoolean < i; paramBoolean++)
      lz0 lz01 = arrayOfLz0[paramBoolean]; 
  }
  
  public final void m(q60 paramq60) {
    // Byte code:
    //   0: aload_1
    //   1: getfield a : Lad;
    //   4: aload_0
    //   5: getfield u : Lad;
    //   8: if_acmpeq -> 12
    //   11: return
    //   12: aload_0
    //   13: getfield p : Lr60;
    //   16: astore #15
    //   18: aload_0
    //   19: getfield D : I
    //   22: istore_2
    //   23: aload #15
    //   25: aload #15
    //   27: getfield b : I
    //   30: iload_2
    //   31: iadd
    //   32: putfield b : I
    //   35: aload_0
    //   36: iconst_0
    //   37: putfield D : I
    //   40: aload_0
    //   41: getfield t : Lq71;
    //   44: astore #16
    //   46: aload #16
    //   48: getfield a : Luu1;
    //   51: astore #15
    //   53: aload_1
    //   54: getfield b : Luu1;
    //   57: astore_1
    //   58: aload_0
    //   59: getfield r : Lqt0;
    //   62: aload_1
    //   63: putfield d : Luu1;
    //   66: aload_0
    //   67: new q71
    //   70: dup
    //   71: aload_1
    //   72: aload #16
    //   74: getfield b : Lfw0;
    //   77: aload #16
    //   79: getfield c : J
    //   82: aload #16
    //   84: getfield d : J
    //   87: aload #16
    //   89: getfield e : I
    //   92: aload #16
    //   94: getfield f : Ll60;
    //   97: aload #16
    //   99: getfield g : Z
    //   102: aload #16
    //   104: getfield h : Lvv1;
    //   107: aload #16
    //   109: getfield i : Loz0;
    //   112: aload #16
    //   114: getfield j : Lfw0;
    //   117: aload #16
    //   119: getfield k : J
    //   122: aload #16
    //   124: getfield l : J
    //   127: aload #16
    //   129: getfield m : J
    //   132: invokespecial <init> : (Luu1;Lfw0;JJILl60;ZLvv1;Loz0;Lfw0;JJJ)V
    //   135: putfield t : Lq71;
    //   138: aload_0
    //   139: getfield q : Ljava/util/ArrayList;
    //   142: astore #16
    //   144: aload #16
    //   146: invokevirtual size : ()I
    //   149: istore_2
    //   150: iconst_1
    //   151: istore #13
    //   153: iinc #2, -1
    //   156: iload_2
    //   157: ifge -> 1146
    //   160: aload #16
    //   162: invokestatic sort : (Ljava/util/List;)V
    //   165: aload_0
    //   166: getfield t : Lq71;
    //   169: getfield b : Lfw0;
    //   172: astore #16
    //   174: aload #16
    //   176: invokevirtual b : ()Z
    //   179: istore #14
    //   181: aload_0
    //   182: getfield t : Lq71;
    //   185: astore #17
    //   187: iload #14
    //   189: ifeq -> 202
    //   192: aload #17
    //   194: getfield d : J
    //   197: lstore #5
    //   199: goto -> 212
    //   202: aload #17
    //   204: getfield m : J
    //   207: lstore #5
    //   209: goto -> 199
    //   212: aload_0
    //   213: getfield E : Ls60;
    //   216: astore #17
    //   218: aload #17
    //   220: ifnull -> 292
    //   223: aload_0
    //   224: aload #17
    //   226: invokevirtual w : (Ls60;)Landroid/util/Pair;
    //   229: astore_1
    //   230: aload_0
    //   231: aconst_null
    //   232: putfield E : Ls60;
    //   235: aload_1
    //   236: ifnonnull -> 265
    //   239: aload_0
    //   240: getfield t : Lq71;
    //   243: getfield e : I
    //   246: iconst_1
    //   247: if_icmpeq -> 255
    //   250: aload_0
    //   251: iconst_4
    //   252: invokevirtual I : (I)V
    //   255: aload_0
    //   256: iconst_0
    //   257: iconst_0
    //   258: iconst_1
    //   259: iconst_0
    //   260: iconst_1
    //   261: invokevirtual u : (ZZZZZ)V
    //   264: return
    //   265: aload_1
    //   266: getfield second : Ljava/lang/Object;
    //   269: checkcast java/lang/Long
    //   272: invokevirtual longValue : ()J
    //   275: lstore_3
    //   276: aload_0
    //   277: getfield r : Lqt0;
    //   280: lload_3
    //   281: aload_1
    //   282: getfield first : Ljava/lang/Object;
    //   285: invokevirtual i : (JLjava/lang/Object;)Lfw0;
    //   288: astore_1
    //   289: goto -> 568
    //   292: lload #5
    //   294: ldc2_w -9223372036854775807
    //   297: lcmp
    //   298: ifne -> 393
    //   301: aload_1
    //   302: invokevirtual n : ()Z
    //   305: ifne -> 393
    //   308: aload_1
    //   309: aload_0
    //   310: getfield B : Z
    //   313: invokevirtual a : (Z)I
    //   316: istore_2
    //   317: aload_1
    //   318: aload_0
    //   319: getfield l : Ltu1;
    //   322: aload_0
    //   323: getfield m : Lsu1;
    //   326: iload_2
    //   327: ldc2_w -9223372036854775807
    //   330: invokevirtual i : (Ltu1;Lsu1;IJ)Landroid/util/Pair;
    //   333: astore #15
    //   335: aload_0
    //   336: getfield r : Lqt0;
    //   339: astore #16
    //   341: aload #15
    //   343: getfield first : Ljava/lang/Object;
    //   346: astore_1
    //   347: aload #16
    //   349: aload #15
    //   351: getfield second : Ljava/lang/Object;
    //   354: checkcast java/lang/Long
    //   357: invokevirtual longValue : ()J
    //   360: aload_1
    //   361: invokevirtual i : (JLjava/lang/Object;)Lfw0;
    //   364: astore_1
    //   365: aload_1
    //   366: invokevirtual b : ()Z
    //   369: ifne -> 387
    //   372: aload #15
    //   374: getfield second : Ljava/lang/Object;
    //   377: checkcast java/lang/Long
    //   380: invokevirtual longValue : ()J
    //   383: lstore_3
    //   384: goto -> 390
    //   387: lload #5
    //   389: lstore_3
    //   390: goto -> 568
    //   393: aload_1
    //   394: aload #16
    //   396: getfield a : Ljava/lang/Object;
    //   399: invokevirtual b : (Ljava/lang/Object;)I
    //   402: iconst_m1
    //   403: if_icmpne -> 509
    //   406: aload_0
    //   407: aload #16
    //   409: getfield a : Ljava/lang/Object;
    //   412: aload #15
    //   414: aload_1
    //   415: invokevirtual x : (Ljava/lang/Object;Luu1;Luu1;)Ljava/lang/Object;
    //   418: astore #15
    //   420: aload #15
    //   422: ifnonnull -> 451
    //   425: aload_0
    //   426: getfield t : Lq71;
    //   429: getfield e : I
    //   432: iconst_1
    //   433: if_icmpeq -> 441
    //   436: aload_0
    //   437: iconst_4
    //   438: invokevirtual I : (I)V
    //   441: aload_0
    //   442: iconst_0
    //   443: iconst_0
    //   444: iconst_1
    //   445: iconst_0
    //   446: iconst_1
    //   447: invokevirtual u : (ZZZZZ)V
    //   450: return
    //   451: aload_1
    //   452: aload #15
    //   454: aload_0
    //   455: getfield m : Lsu1;
    //   458: invokevirtual g : (Ljava/lang/Object;Lsu1;)Lsu1;
    //   461: getfield c : I
    //   464: istore_2
    //   465: aload_1
    //   466: aload_0
    //   467: getfield l : Ltu1;
    //   470: aload_0
    //   471: getfield m : Lsu1;
    //   474: iload_2
    //   475: ldc2_w -9223372036854775807
    //   478: invokevirtual i : (Ltu1;Lsu1;IJ)Landroid/util/Pair;
    //   481: astore_1
    //   482: aload_1
    //   483: getfield second : Ljava/lang/Object;
    //   486: checkcast java/lang/Long
    //   489: invokevirtual longValue : ()J
    //   492: lstore_3
    //   493: aload_0
    //   494: getfield r : Lqt0;
    //   497: lload_3
    //   498: aload_1
    //   499: getfield first : Ljava/lang/Object;
    //   502: invokevirtual i : (JLjava/lang/Object;)Lfw0;
    //   505: astore_1
    //   506: goto -> 568
    //   509: aload_0
    //   510: getfield r : Lqt0;
    //   513: lload #5
    //   515: aload_0
    //   516: getfield t : Lq71;
    //   519: getfield b : Lfw0;
    //   522: getfield a : Ljava/lang/Object;
    //   525: invokevirtual i : (JLjava/lang/Object;)Lfw0;
    //   528: astore #15
    //   530: aload #15
    //   532: astore_1
    //   533: aload_0
    //   534: getfield t : Lq71;
    //   537: getfield b : Lfw0;
    //   540: invokevirtual b : ()Z
    //   543: ifne -> 565
    //   546: aload #15
    //   548: astore_1
    //   549: aload #15
    //   551: invokevirtual b : ()Z
    //   554: ifne -> 565
    //   557: aload_0
    //   558: getfield t : Lq71;
    //   561: getfield b : Lfw0;
    //   564: astore_1
    //   565: lload #5
    //   567: lstore_3
    //   568: aload_0
    //   569: getfield t : Lq71;
    //   572: getfield b : Lfw0;
    //   575: aload_1
    //   576: invokevirtual equals : (Ljava/lang/Object;)Z
    //   579: istore #14
    //   581: lconst_0
    //   582: lstore #7
    //   584: iload #14
    //   586: ifeq -> 1007
    //   589: lload #5
    //   591: lload_3
    //   592: lcmp
    //   593: ifne -> 1007
    //   596: aload_0
    //   597: getfield r : Lqt0;
    //   600: astore #17
    //   602: aload_0
    //   603: getfield F : J
    //   606: lstore #11
    //   608: aload #17
    //   610: getfield h : Lot0;
    //   613: astore_1
    //   614: ldc2_w -9223372036854775808
    //   617: lstore #9
    //   619: aload_1
    //   620: ifnonnull -> 629
    //   623: lload #7
    //   625: lstore_3
    //   626: goto -> 739
    //   629: aload_1
    //   630: getfield n : J
    //   633: lstore_3
    //   634: aload_1
    //   635: getfield d : Z
    //   638: ifne -> 644
    //   641: goto -> 739
    //   644: iconst_0
    //   645: istore_2
    //   646: lload_3
    //   647: lstore #5
    //   649: aload_0
    //   650: getfield b : [Llz0;
    //   653: astore #15
    //   655: lload #5
    //   657: lstore_3
    //   658: iload_2
    //   659: aload #15
    //   661: arraylength
    //   662: if_icmpge -> 739
    //   665: aload #15
    //   667: iload_2
    //   668: aaload
    //   669: astore #15
    //   671: lload #5
    //   673: lstore_3
    //   674: aload #15
    //   676: getfield c : I
    //   679: ifeq -> 730
    //   682: aload #15
    //   684: getfield d : Lli1;
    //   687: aload_1
    //   688: getfield c : [Lli1;
    //   691: iload_2
    //   692: aaload
    //   693: if_acmpeq -> 702
    //   696: lload #5
    //   698: lstore_3
    //   699: goto -> 730
    //   702: aload #15
    //   704: getfield f : J
    //   707: lstore_3
    //   708: lload_3
    //   709: ldc2_w -9223372036854775808
    //   712: lcmp
    //   713: ifne -> 723
    //   716: ldc2_w -9223372036854775808
    //   719: lstore_3
    //   720: goto -> 739
    //   723: lload_3
    //   724: lload #5
    //   726: invokestatic max : (JJ)J
    //   729: lstore_3
    //   730: iinc #2, 1
    //   733: lload_3
    //   734: lstore #5
    //   736: goto -> 649
    //   739: aload #17
    //   741: getfield g : Lot0;
    //   744: astore_1
    //   745: aconst_null
    //   746: astore #15
    //   748: lload #9
    //   750: lstore #5
    //   752: aload_1
    //   753: ifnull -> 955
    //   756: aload_1
    //   757: getfield f : Lpt0;
    //   760: astore #18
    //   762: aload #15
    //   764: ifnonnull -> 779
    //   767: aload #17
    //   769: aload #18
    //   771: invokevirtual f : (Lpt0;)Lpt0;
    //   774: astore #15
    //   776: goto -> 846
    //   779: aload #17
    //   781: aload #15
    //   783: lload #11
    //   785: invokevirtual c : (Lot0;J)Lpt0;
    //   788: astore #16
    //   790: aload #16
    //   792: ifnonnull -> 812
    //   795: aload #17
    //   797: aload #15
    //   799: invokevirtual h : (Lot0;)Z
    //   802: istore #13
    //   804: iload #13
    //   806: iconst_1
    //   807: ixor
    //   808: istore_2
    //   809: goto -> 992
    //   812: aload #18
    //   814: getfield b : J
    //   817: aload #16
    //   819: getfield b : J
    //   822: lcmp
    //   823: ifne -> 980
    //   826: aload #18
    //   828: getfield a : Lfw0;
    //   831: aload #16
    //   833: getfield a : Lfw0;
    //   836: invokevirtual equals : (Ljava/lang/Object;)Z
    //   839: ifeq -> 980
    //   842: aload #16
    //   844: astore #15
    //   846: aload_1
    //   847: aload #15
    //   849: putfield f : Lpt0;
    //   852: aload #18
    //   854: getfield d : J
    //   857: lstore #9
    //   859: aload #15
    //   861: getfield d : J
    //   864: lstore #7
    //   866: lload #9
    //   868: ldc2_w -9223372036854775807
    //   871: lcmp
    //   872: ifeq -> 965
    //   875: lload #9
    //   877: lload #7
    //   879: lcmp
    //   880: ifne -> 886
    //   883: goto -> 965
    //   886: lload #7
    //   888: ldc2_w -9223372036854775807
    //   891: lcmp
    //   892: ifne -> 903
    //   895: ldc2_w 9223372036854775807
    //   898: lstore #7
    //   900: goto -> 912
    //   903: aload_1
    //   904: getfield n : J
    //   907: lload #7
    //   909: ladd
    //   910: lstore #7
    //   912: aload_1
    //   913: aload #17
    //   915: getfield h : Lot0;
    //   918: if_acmpne -> 940
    //   921: lload_3
    //   922: lload #5
    //   924: lcmp
    //   925: ifeq -> 935
    //   928: lload_3
    //   929: lload #7
    //   931: lcmp
    //   932: iflt -> 940
    //   935: iconst_1
    //   936: istore_2
    //   937: goto -> 942
    //   940: iconst_0
    //   941: istore_2
    //   942: aload #17
    //   944: aload_1
    //   945: invokevirtual h : (Lot0;)Z
    //   948: ifne -> 960
    //   951: iload_2
    //   952: ifne -> 960
    //   955: iconst_1
    //   956: istore_2
    //   957: goto -> 992
    //   960: iconst_0
    //   961: istore_2
    //   962: goto -> 992
    //   965: aload_1
    //   966: getfield k : Lot0;
    //   969: astore #16
    //   971: aload_1
    //   972: astore #15
    //   974: aload #16
    //   976: astore_1
    //   977: goto -> 752
    //   980: aload #17
    //   982: aload #15
    //   984: invokevirtual h : (Lot0;)Z
    //   987: istore #13
    //   989: goto -> 804
    //   992: iload_2
    //   993: ifne -> 1004
    //   996: aload_0
    //   997: iconst_0
    //   998: invokevirtual y : (Z)V
    //   1001: goto -> 1140
    //   1004: goto -> 1140
    //   1007: aload_0
    //   1008: getfield r : Lqt0;
    //   1011: getfield g : Lot0;
    //   1014: astore #15
    //   1016: aload #15
    //   1018: ifnull -> 1076
    //   1021: aload #15
    //   1023: getfield k : Lot0;
    //   1026: astore #16
    //   1028: aload #16
    //   1030: ifnull -> 1076
    //   1033: aload #16
    //   1035: astore #15
    //   1037: aload #16
    //   1039: getfield f : Lpt0;
    //   1042: getfield a : Lfw0;
    //   1045: aload_1
    //   1046: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1049: ifeq -> 1021
    //   1052: aload #16
    //   1054: aload_0
    //   1055: getfield r : Lqt0;
    //   1058: aload #16
    //   1060: getfield f : Lpt0;
    //   1063: invokevirtual f : (Lpt0;)Lpt0;
    //   1066: putfield f : Lpt0;
    //   1069: aload #16
    //   1071: astore #15
    //   1073: goto -> 1021
    //   1076: aload_1
    //   1077: invokevirtual b : ()Z
    //   1080: ifeq -> 1090
    //   1083: lload #7
    //   1085: lstore #5
    //   1087: goto -> 1093
    //   1090: lload_3
    //   1091: lstore #5
    //   1093: aload_0
    //   1094: getfield r : Lqt0;
    //   1097: astore #15
    //   1099: aload #15
    //   1101: getfield g : Lot0;
    //   1104: aload #15
    //   1106: getfield h : Lot0;
    //   1109: if_acmpeq -> 1115
    //   1112: goto -> 1118
    //   1115: iconst_0
    //   1116: istore #13
    //   1118: aload_0
    //   1119: aload_0
    //   1120: aload_1
    //   1121: aload_0
    //   1122: aload_1
    //   1123: lload #5
    //   1125: iload #13
    //   1127: invokevirtual A : (Lfw0;JZ)J
    //   1130: lload_3
    //   1131: invokevirtual c : (Lfw0;JJ)Lq71;
    //   1134: putfield t : Lq71;
    //   1137: goto -> 1004
    //   1140: aload_0
    //   1141: iconst_0
    //   1142: invokevirtual j : (Z)V
    //   1145: return
    //   1146: aload #16
    //   1148: iload_2
    //   1149: invokevirtual get : (I)Ljava/lang/Object;
    //   1152: invokestatic t : (Ljava/lang/Object;)V
    //   1155: aconst_null
    //   1156: athrow
  }
  
  public final boolean n() {
    ot0 ot0 = this.r.h;
    if (!ot0.d)
      return false; 
    byte b = 0;
    while (true) {
      lz0[] arrayOfLz0 = this.b;
      if (b < arrayOfLz0.length) {
        lz0 lz01 = arrayOfLz0[b];
        li1 li1 = ot0.c[b];
        if (lz01.d == li1) {
          if (li1 != null && !lz01.c())
            continue; 
          b++;
          continue;
        } 
        continue;
      } 
      return true;
    } 
  }
  
  public final boolean o() {
    ot0 ot0 = this.r.g;
    long l = ot0.f.d;
    return (ot0.d && (l == -9223372036854775807L || this.t.m < l));
  }
  
  public final void p() {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : Lqt0;
    //   4: getfield i : Lot0;
    //   7: astore #13
    //   9: iconst_1
    //   10: istore #12
    //   12: aload #13
    //   14: ifnonnull -> 20
    //   17: goto -> 62
    //   20: aload #13
    //   22: getfield d : Z
    //   25: istore #11
    //   27: lconst_0
    //   28: lstore #7
    //   30: iload #11
    //   32: ifne -> 41
    //   35: lconst_0
    //   36: lstore #5
    //   38: goto -> 53
    //   41: aload #13
    //   43: getfield a : Lnt0;
    //   46: invokeinterface c : ()J
    //   51: lstore #5
    //   53: lload #5
    //   55: ldc2_w -9223372036854775808
    //   58: lcmp
    //   59: ifne -> 68
    //   62: iconst_0
    //   63: istore #11
    //   65: goto -> 335
    //   68: aload_0
    //   69: getfield r : Lqt0;
    //   72: getfield i : Lot0;
    //   75: astore #13
    //   77: aload #13
    //   79: getfield d : Z
    //   82: ifne -> 91
    //   85: lconst_0
    //   86: lstore #5
    //   88: goto -> 103
    //   91: aload #13
    //   93: getfield a : Lnt0;
    //   96: invokeinterface c : ()J
    //   101: lstore #5
    //   103: aload_0
    //   104: getfield r : Lqt0;
    //   107: getfield i : Lot0;
    //   110: astore #13
    //   112: aload #13
    //   114: ifnonnull -> 120
    //   117: goto -> 139
    //   120: lconst_0
    //   121: lload #5
    //   123: aload_0
    //   124: getfield F : J
    //   127: aload #13
    //   129: getfield n : J
    //   132: lsub
    //   133: lsub
    //   134: invokestatic max : (JJ)J
    //   137: lstore #7
    //   139: aload_0
    //   140: getfield o : Low;
    //   143: getfield c : Ljava/lang/Object;
    //   146: checkcast cp1
    //   149: getfield e : Ljava/lang/Object;
    //   152: checkcast r71
    //   155: getfield a : F
    //   158: fstore_1
    //   159: aload_0
    //   160: getfield g : Lnw;
    //   163: astore #14
    //   165: aload #14
    //   167: getfield a : Luv;
    //   170: astore #13
    //   172: aload #13
    //   174: monitorenter
    //   175: aload #13
    //   177: monitorexit
    //   178: aload #14
    //   180: getfield j : I
    //   183: ifgt -> 191
    //   186: iconst_1
    //   187: istore_2
    //   188: goto -> 193
    //   191: iconst_0
    //   192: istore_2
    //   193: aload #14
    //   195: getfield l : Z
    //   198: ifeq -> 211
    //   201: aload #14
    //   203: getfield c : J
    //   206: lstore #5
    //   208: goto -> 218
    //   211: aload #14
    //   213: getfield b : J
    //   216: lstore #5
    //   218: fload_1
    //   219: fconst_1
    //   220: fcmpl
    //   221: istore_3
    //   222: lload #5
    //   224: lstore #9
    //   226: iload_3
    //   227: ifle -> 265
    //   230: getstatic d12.a : I
    //   233: istore #4
    //   235: iload_3
    //   236: ifne -> 242
    //   239: goto -> 253
    //   242: lload #5
    //   244: l2d
    //   245: fload_1
    //   246: f2d
    //   247: dmul
    //   248: invokestatic round : (D)J
    //   251: lstore #5
    //   253: lload #5
    //   255: aload #14
    //   257: getfield d : J
    //   260: invokestatic min : (JJ)J
    //   263: lstore #9
    //   265: lload #7
    //   267: lload #9
    //   269: lcmp
    //   270: ifge -> 307
    //   273: aload #14
    //   275: getfield h : Z
    //   278: ifne -> 294
    //   281: iload_2
    //   282: ifne -> 288
    //   285: goto -> 294
    //   288: iconst_0
    //   289: istore #11
    //   291: goto -> 297
    //   294: iconst_1
    //   295: istore #11
    //   297: aload #14
    //   299: iload #11
    //   301: putfield k : Z
    //   304: goto -> 328
    //   307: lload #7
    //   309: aload #14
    //   311: getfield d : J
    //   314: lcmp
    //   315: ifge -> 322
    //   318: iload_2
    //   319: ifeq -> 328
    //   322: aload #14
    //   324: iconst_0
    //   325: putfield k : Z
    //   328: aload #14
    //   330: getfield k : Z
    //   333: istore #11
    //   335: aload_0
    //   336: iload #11
    //   338: putfield z : Z
    //   341: iload #11
    //   343: ifeq -> 407
    //   346: aload_0
    //   347: getfield r : Lqt0;
    //   350: getfield i : Lot0;
    //   353: astore #13
    //   355: aload_0
    //   356: getfield F : J
    //   359: lstore #5
    //   361: aload #13
    //   363: getfield k : Lot0;
    //   366: ifnonnull -> 376
    //   369: iload #12
    //   371: istore #11
    //   373: goto -> 379
    //   376: iconst_0
    //   377: istore #11
    //   379: iload #11
    //   381: invokestatic r : (Z)V
    //   384: aload #13
    //   386: getfield n : J
    //   389: lstore #7
    //   391: aload #13
    //   393: getfield a : Lnt0;
    //   396: lload #5
    //   398: lload #7
    //   400: lsub
    //   401: invokeinterface n : (J)Z
    //   406: pop
    //   407: aload_0
    //   408: invokevirtual M : ()V
    //   411: return
  }
  
  public final void q() {
    q71 q711 = this.t;
    r60 r601 = this.p;
    if (q711 != r601.a || r601.b > 0 || r601.c) {
      byte b;
      int i = r601.b;
      if (r601.c) {
        b = r601.d;
      } else {
        b = -1;
      } 
      this.k.obtainMessage(0, i, b, q711).sendToTarget();
      r601.a = this.t;
      r601.b = 0;
      r601.c = false;
      return;
    } 
  }
  
  public final void r(ad paramad, boolean paramBoolean1, boolean paramBoolean2) {
    this.D++;
    u(false, true, paramBoolean1, paramBoolean2, true);
    this.g.b(false);
    this.u = paramad;
    I(2);
    wv wv1 = this.h;
    wv1.getClass();
    paramad.h(this, wv1);
    this.i.a(2);
  }
  
  public final void s() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: iconst_1
    //   3: iconst_1
    //   4: iconst_1
    //   5: iconst_0
    //   6: invokevirtual u : (ZZZZZ)V
    //   9: aload_0
    //   10: getfield g : Lnw;
    //   13: iconst_1
    //   14: invokevirtual b : (Z)V
    //   17: aload_0
    //   18: iconst_1
    //   19: invokevirtual I : (I)V
    //   22: aload_0
    //   23: getfield j : Landroid/os/HandlerThread;
    //   26: invokevirtual quit : ()Z
    //   29: pop
    //   30: aload_0
    //   31: monitorenter
    //   32: aload_0
    //   33: iconst_1
    //   34: putfield w : Z
    //   37: aload_0
    //   38: invokevirtual notifyAll : ()V
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   32	43	44	finally
    //   45	47	44	finally
  }
  
  public final void t() {
    float f = ((r71)((cp1)this.o.c).e).a;
    qt0 qt01 = this.r;
    ot0 ot01 = qt01.g;
    ot0 ot02 = qt01.h;
    int i = 1;
    label61: while (ot01 != null && ot01.d) {
      boolean[] arrayOfBoolean1;
      boolean[] arrayOfBoolean2;
      lz0 lz01;
      ByteBuffer byteBuffer;
      uu1 uu1 = this.t.a;
      oz0 oz01 = ot01.f(f);
      oz0 oz02 = ot01.m;
      xv1 xv1 = (xv1)oz01.e;
      if (oz02 == null || ((xv1)oz02.e).a != xv1.a) {
        qt0 qt02 = this.r;
        if (i) {
          ot01 = qt02.g;
          boolean bool = qt02.h(ot01);
          arrayOfBoolean1 = new boolean[this.b.length];
          long l = ot01.a(oz01, this.t.m, bool, arrayOfBoolean1);
          q71 q711 = this.t;
          if (q711.e != 4 && l != q711.m) {
            q711 = this.t;
            this.t = c(q711.b, l, q711.d);
            this.p.a(4);
            v(l);
          } 
          arrayOfBoolean2 = new boolean[this.b.length];
          byte b1 = 0;
          int j = 0;
          while (true) {
            lz0[] arrayOfLz0 = this.b;
            if (b1 < arrayOfLz0.length) {
              lz01 = arrayOfLz0[b1];
              if (lz01.c != 0) {
                bool = true;
              } else {
                bool = false;
              } 
              arrayOfBoolean2[b1] = bool;
              li1 li1 = ot01.c[b1];
              i = j;
              if (li1 != null)
                i = j + 1; 
              if (bool)
                if (li1 != lz01.d) {
                  e(lz01);
                } else if (arrayOfBoolean1[b1]) {
                  l = this.F;
                  lz01.g = false;
                  lz01.f = l;
                  ui0.G("MAR.opR");
                  lz01.o = l;
                  lz01.p = true;
                  lz01.j.c();
                  lz01.q = false;
                  rv rv = lz01.k;
                  if (rv != null) {
                    byteBuffer = rv.a;
                    if (byteBuffer != null)
                      byteBuffer.clear(); 
                  } 
                  lz01.k = null;
                  lz01.l = null;
                }  
              b1++;
              j = i;
              continue;
            } 
            this.t = this.t.c(ot01.l, ot01.m);
            g(arrayOfBoolean2, j);
            j(true);
            if (this.t.e != 4) {
              p();
              O();
              this.i.a(2);
            } 
            break;
          } 
          break;
        } 
        arrayOfBoolean1.h(ot01);
        if (ot01.d) {
          ot01.a((oz0)arrayOfBoolean2, Math.max(ot01.f.b, this.F - ot01.n), false, new boolean[ot01.h.length]);
          continue;
        } 
        continue;
      } 
      for (byte b = 0; b < ((xv1)byteBuffer).a; b++) {
        if (!arrayOfBoolean2.a((oz0)lz01, b))
          continue label61; 
      } 
      if (ot01 == arrayOfBoolean1)
        i = 0; 
      ot01 = ot01.k;
    } 
  }
  
  public final void u(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5) {
    // Byte code:
    //   0: getstatic uu1.a : Lru1;
    //   3: astore #13
    //   5: aload_0
    //   6: getfield i : Lw9;
    //   9: getfield a : Landroid/os/Handler;
    //   12: iconst_2
    //   13: invokevirtual removeMessages : (I)V
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield y : Z
    //   21: aload_0
    //   22: getfield o : Low;
    //   25: astore #12
    //   27: aload #12
    //   29: iconst_0
    //   30: putfield b : Z
    //   33: aload #12
    //   35: getfield c : Ljava/lang/Object;
    //   38: checkcast cp1
    //   41: astore #12
    //   43: aload #12
    //   45: getfield b : Z
    //   48: ifeq -> 67
    //   51: aload #12
    //   53: aload #12
    //   55: invokevirtual a : ()J
    //   58: invokevirtual b : (J)V
    //   61: aload #12
    //   63: iconst_0
    //   64: putfield b : Z
    //   67: aload_0
    //   68: lconst_0
    //   69: putfield F : J
    //   72: aload_0
    //   73: getfield v : [Llz0;
    //   76: astore #14
    //   78: aload #14
    //   80: arraylength
    //   81: istore #7
    //   83: iconst_0
    //   84: istore #6
    //   86: getstatic in/krosbits/android/widgets/swipetoloadlayout/vZ/LHyji.JUUl : Ljava/lang/String;
    //   89: astore #17
    //   91: iload #6
    //   93: iload #7
    //   95: if_icmpge -> 137
    //   98: aload #14
    //   100: iload #6
    //   102: aaload
    //   103: astore #12
    //   105: aload_0
    //   106: aload #12
    //   108: invokevirtual e : (Llz0;)V
    //   111: goto -> 131
    //   114: astore #12
    //   116: goto -> 121
    //   119: astore #12
    //   121: aload #17
    //   123: ldc_w 'Disable failed.'
    //   126: aload #12
    //   128: invokestatic n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   131: iinc #6, 1
    //   134: goto -> 86
    //   137: iload_1
    //   138: ifeq -> 195
    //   141: aload_0
    //   142: getfield b : [Llz0;
    //   145: astore #12
    //   147: aload #12
    //   149: arraylength
    //   150: istore #7
    //   152: iconst_0
    //   153: istore #6
    //   155: iload #6
    //   157: iload #7
    //   159: if_icmpge -> 195
    //   162: aload #12
    //   164: iload #6
    //   166: aaload
    //   167: astore #14
    //   169: aload #14
    //   171: invokevirtual e : ()V
    //   174: goto -> 189
    //   177: astore #14
    //   179: aload #17
    //   181: ldc_w 'Reset failed.'
    //   184: aload #14
    //   186: invokestatic n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   189: iinc #6, 1
    //   192: goto -> 155
    //   195: aload_0
    //   196: iconst_0
    //   197: anewarray lz0
    //   200: putfield v : [Llz0;
    //   203: iload_3
    //   204: ifeq -> 215
    //   207: aload_0
    //   208: aconst_null
    //   209: putfield E : Ls60;
    //   212: goto -> 317
    //   215: iload #4
    //   217: ifeq -> 317
    //   220: aload_0
    //   221: getfield E : Ls60;
    //   224: ifnonnull -> 312
    //   227: aload_0
    //   228: getfield t : Lq71;
    //   231: getfield a : Luu1;
    //   234: invokevirtual n : ()Z
    //   237: ifne -> 312
    //   240: aload_0
    //   241: getfield t : Lq71;
    //   244: astore #12
    //   246: aload #12
    //   248: getfield a : Luu1;
    //   251: aload #12
    //   253: getfield b : Lfw0;
    //   256: getfield a : Ljava/lang/Object;
    //   259: aload_0
    //   260: getfield m : Lsu1;
    //   263: invokevirtual g : (Ljava/lang/Object;Lsu1;)Lsu1;
    //   266: pop
    //   267: aload_0
    //   268: getfield t : Lq71;
    //   271: getfield m : J
    //   274: lstore #10
    //   276: aload_0
    //   277: getfield m : Lsu1;
    //   280: astore #12
    //   282: aload #12
    //   284: getfield e : J
    //   287: lstore #8
    //   289: aload_0
    //   290: new s60
    //   293: dup
    //   294: aload #13
    //   296: aload #12
    //   298: getfield c : I
    //   301: lload #10
    //   303: lload #8
    //   305: ladd
    //   306: invokespecial <init> : (Luu1;IJ)V
    //   309: putfield E : Ls60;
    //   312: iconst_1
    //   313: istore_3
    //   314: goto -> 317
    //   317: aload_0
    //   318: getfield r : Lqt0;
    //   321: iload #4
    //   323: iconst_1
    //   324: ixor
    //   325: invokevirtual b : (Z)V
    //   328: aload_0
    //   329: iconst_0
    //   330: putfield z : Z
    //   333: iload #4
    //   335: ifeq -> 382
    //   338: aload_0
    //   339: getfield r : Lqt0;
    //   342: aload #13
    //   344: putfield d : Luu1;
    //   347: aload_0
    //   348: getfield q : Ljava/util/ArrayList;
    //   351: astore #12
    //   353: aload #12
    //   355: invokevirtual size : ()I
    //   358: ifgt -> 371
    //   361: aload_0
    //   362: getfield q : Ljava/util/ArrayList;
    //   365: invokevirtual clear : ()V
    //   368: goto -> 382
    //   371: aload #12
    //   373: iconst_0
    //   374: invokevirtual get : (I)Ljava/lang/Object;
    //   377: invokestatic t : (Ljava/lang/Object;)V
    //   380: aconst_null
    //   381: athrow
    //   382: aload_0
    //   383: getfield t : Lq71;
    //   386: astore #12
    //   388: iload_3
    //   389: ifeq -> 414
    //   392: aload #12
    //   394: aload_0
    //   395: getfield B : Z
    //   398: aload_0
    //   399: getfield l : Ltu1;
    //   402: aload_0
    //   403: getfield m : Lsu1;
    //   406: invokevirtual d : (ZLtu1;Lsu1;)Lfw0;
    //   409: astore #12
    //   411: goto -> 424
    //   414: aload #12
    //   416: getfield b : Lfw0;
    //   419: astore #12
    //   421: goto -> 411
    //   424: ldc2_w -9223372036854775807
    //   427: lstore #10
    //   429: iload_3
    //   430: ifeq -> 441
    //   433: ldc2_w -9223372036854775807
    //   436: lstore #8
    //   438: goto -> 450
    //   441: aload_0
    //   442: getfield t : Lq71;
    //   445: getfield m : J
    //   448: lstore #8
    //   450: iload_3
    //   451: ifeq -> 457
    //   454: goto -> 469
    //   457: aload_0
    //   458: getfield t : Lq71;
    //   461: getfield d : J
    //   464: lstore #10
    //   466: goto -> 454
    //   469: iload #4
    //   471: ifeq -> 477
    //   474: goto -> 489
    //   477: aload_0
    //   478: getfield t : Lq71;
    //   481: getfield a : Luu1;
    //   484: astore #13
    //   486: goto -> 474
    //   489: aload_0
    //   490: getfield t : Lq71;
    //   493: astore #16
    //   495: aload #16
    //   497: getfield e : I
    //   500: istore #6
    //   502: iload #5
    //   504: ifeq -> 513
    //   507: aconst_null
    //   508: astore #14
    //   510: goto -> 520
    //   513: aload #16
    //   515: getfield f : Ll60;
    //   518: astore #14
    //   520: iload #4
    //   522: ifeq -> 533
    //   525: getstatic vv1.f : Lvv1;
    //   528: astore #15
    //   530: goto -> 543
    //   533: aload #16
    //   535: getfield h : Lvv1;
    //   538: astore #15
    //   540: goto -> 530
    //   543: iload #4
    //   545: ifeq -> 557
    //   548: aload_0
    //   549: getfield f : Loz0;
    //   552: astore #16
    //   554: goto -> 567
    //   557: aload #16
    //   559: getfield i : Loz0;
    //   562: astore #16
    //   564: goto -> 554
    //   567: aload_0
    //   568: new q71
    //   571: dup
    //   572: aload #13
    //   574: aload #12
    //   576: lload #8
    //   578: lload #10
    //   580: iload #6
    //   582: aload #14
    //   584: iconst_0
    //   585: aload #15
    //   587: aload #16
    //   589: aload #12
    //   591: lload #8
    //   593: lconst_0
    //   594: lload #8
    //   596: invokespecial <init> : (Luu1;Lfw0;JJILl60;ZLvv1;Loz0;Lfw0;JJJ)V
    //   599: putfield t : Lq71;
    //   602: iload_2
    //   603: ifeq -> 643
    //   606: aload_0
    //   607: getfield u : Lad;
    //   610: astore #12
    //   612: aload #12
    //   614: ifnull -> 643
    //   617: aload #12
    //   619: aload_0
    //   620: invokevirtual l : (Lgw0;)V
    //   623: goto -> 638
    //   626: astore #12
    //   628: aload #17
    //   630: ldc_w 'Failed to release child source.'
    //   633: aload #12
    //   635: invokestatic n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   638: aload_0
    //   639: aconst_null
    //   640: putfield u : Lad;
    //   643: return
    // Exception table:
    //   from	to	target	type
    //   105	111	119	l60
    //   105	111	114	java/lang/RuntimeException
    //   169	174	177	java/lang/RuntimeException
    //   617	623	626	java/lang/RuntimeException
  }
  
  public final void v(long paramLong) {
    qt0 qt01 = this.r;
    ot0 ot02 = qt01.g;
    if (ot02 != null)
      paramLong += ot02.n; 
    this.F = paramLong;
    ((cp1)this.o.c).b(paramLong);
    for (lz0 lz01 : this.v) {
      paramLong = this.F;
      lz01.g = false;
      lz01.f = paramLong;
      ui0.G("MAR.opR");
      lz01.o = paramLong;
      lz01.p = true;
      lz01.j.c();
      lz01.q = false;
      rv rv = lz01.k;
      if (rv != null) {
        ByteBuffer byteBuffer = rv.a;
        if (byteBuffer != null)
          byteBuffer.clear(); 
      } 
      lz01.k = null;
      lz01.l = null;
    } 
    for (ot0 ot01 = qt01.g; ot01 != null; ot01 = ot01.k)
      for (zd zd : (zd[])((xv1)ot01.m.e).b.clone()); 
  }
  
  public final Pair w(s60 params60) {
    uu1 uu12 = this.t.a;
    uu1 uu11 = params60.a;
    if (!uu12.n()) {
      if (uu11.n())
        uu11 = uu12; 
      try {
        Pair pair = uu11.i(this.l, this.m, params60.b, params60.c);
        if (uu12 == uu11 || uu12.b(pair.first) != -1)
          return pair; 
        Object object = x(pair.first, uu11, uu12);
        if (object != null) {
          int i = (uu12.g(object, this.m)).c;
          return uu12.i(this.l, this.m, i, -9223372036854775807L);
        } 
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
    } 
    return null;
  }
  
  public final Object x(Object paramObject, uu1 paramuu11, uu1 paramuu12) {
    int j = paramuu11.b(paramObject);
    int k = paramuu11.h();
    byte b = 0;
    int i = -1;
    while (b < k && i == -1) {
      int m = this.A;
      boolean bool = this.B;
      j = paramuu11.d(j, this.m, this.l, m, bool);
      if (j == -1)
        break; 
      i = paramuu12.b(paramuu11.k(j));
      b++;
    } 
    return (i == -1) ? null : paramuu12.k(i);
  }
  
  public final void y(boolean paramBoolean) {
    fw0 fw0 = this.r.g.f.a;
    long l = A(fw0, this.t.m, true);
    if (l != this.t.m) {
      this.t = c(fw0, l, this.t.d);
      if (paramBoolean)
        this.p.a(4); 
    } 
  }
  
  public final void z(s60 params60) {
    // Byte code:
    //   0: aload_0
    //   1: getfield p : Lr60;
    //   4: astore #13
    //   6: aload #13
    //   8: aload #13
    //   10: getfield b : I
    //   13: iconst_1
    //   14: iadd
    //   15: putfield b : I
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual w : (Ls60;)Landroid/util/Pair;
    //   23: astore #14
    //   25: aload #14
    //   27: ifnonnull -> 66
    //   30: aload_0
    //   31: getfield t : Lq71;
    //   34: aload_0
    //   35: getfield B : Z
    //   38: aload_0
    //   39: getfield l : Ltu1;
    //   42: aload_0
    //   43: getfield m : Lsu1;
    //   46: invokevirtual d : (ZLtu1;Lsu1;)Lfw0;
    //   49: astore #13
    //   51: iconst_1
    //   52: istore_2
    //   53: ldc2_w -9223372036854775807
    //   56: lstore #4
    //   58: ldc2_w -9223372036854775807
    //   61: lstore #6
    //   63: goto -> 146
    //   66: aload #14
    //   68: getfield first : Ljava/lang/Object;
    //   71: astore #13
    //   73: aload #14
    //   75: getfield second : Ljava/lang/Object;
    //   78: checkcast java/lang/Long
    //   81: invokevirtual longValue : ()J
    //   84: lstore #4
    //   86: aload_0
    //   87: getfield r : Lqt0;
    //   90: lload #4
    //   92: aload #13
    //   94: invokevirtual i : (JLjava/lang/Object;)Lfw0;
    //   97: astore #13
    //   99: aload #13
    //   101: invokevirtual b : ()Z
    //   104: ifeq -> 115
    //   107: lconst_0
    //   108: lstore #6
    //   110: iconst_1
    //   111: istore_2
    //   112: goto -> 146
    //   115: aload #14
    //   117: getfield second : Ljava/lang/Object;
    //   120: checkcast java/lang/Long
    //   123: invokevirtual longValue : ()J
    //   126: lstore #6
    //   128: aload_1
    //   129: getfield c : J
    //   132: ldc2_w -9223372036854775807
    //   135: lcmp
    //   136: ifne -> 144
    //   139: iconst_1
    //   140: istore_2
    //   141: goto -> 146
    //   144: iconst_0
    //   145: istore_2
    //   146: aload_0
    //   147: getfield u : Lad;
    //   150: astore #14
    //   152: aload #14
    //   154: ifnull -> 166
    //   157: aload_0
    //   158: getfield D : I
    //   161: istore_3
    //   162: iload_3
    //   163: ifle -> 169
    //   166: goto -> 408
    //   169: lload #6
    //   171: ldc2_w -9223372036854775807
    //   174: lcmp
    //   175: ifne -> 203
    //   178: aload_0
    //   179: iconst_4
    //   180: invokevirtual I : (I)V
    //   183: aload_0
    //   184: iconst_0
    //   185: iconst_0
    //   186: iconst_1
    //   187: iconst_0
    //   188: iconst_1
    //   189: invokevirtual u : (ZZZZZ)V
    //   192: goto -> 413
    //   195: astore_1
    //   196: lload #4
    //   198: lstore #8
    //   200: goto -> 442
    //   203: aload #13
    //   205: aload_0
    //   206: getfield t : Lq71;
    //   209: getfield b : Lfw0;
    //   212: invokevirtual equals : (Ljava/lang/Object;)Z
    //   215: ifeq -> 338
    //   218: aload_0
    //   219: getfield r : Lqt0;
    //   222: getfield g : Lot0;
    //   225: astore_1
    //   226: aload_1
    //   227: ifnull -> 264
    //   230: aload_1
    //   231: getfield d : Z
    //   234: ifeq -> 264
    //   237: lload #6
    //   239: lconst_0
    //   240: lcmp
    //   241: ifeq -> 264
    //   244: aload_1
    //   245: getfield a : Lnt0;
    //   248: lload #6
    //   250: aload_0
    //   251: getfield s : Lbk1;
    //   254: invokeinterface e : (JLbk1;)J
    //   259: lstore #8
    //   261: goto -> 268
    //   264: lload #6
    //   266: lstore #8
    //   268: lload #8
    //   270: lstore #10
    //   272: lload #8
    //   274: invokestatic b : (J)J
    //   277: aload_0
    //   278: getfield t : Lq71;
    //   281: getfield m : J
    //   284: invokestatic b : (J)J
    //   287: lcmp
    //   288: ifne -> 335
    //   291: aload_0
    //   292: getfield t : Lq71;
    //   295: getfield m : J
    //   298: lstore #8
    //   300: aload_0
    //   301: aload_0
    //   302: aload #13
    //   304: lload #8
    //   306: lload #4
    //   308: invokevirtual c : (Lfw0;JJ)Lq71;
    //   311: putfield t : Lq71;
    //   314: iload_2
    //   315: ifeq -> 437
    //   318: aload_0
    //   319: getfield p : Lr60;
    //   322: iconst_2
    //   323: invokevirtual a : (I)V
    //   326: return
    //   327: astore_1
    //   328: lload #4
    //   330: lstore #8
    //   332: goto -> 200
    //   335: goto -> 345
    //   338: lload #6
    //   340: lstore #10
    //   342: goto -> 335
    //   345: aload_0
    //   346: getfield r : Lqt0;
    //   349: astore_1
    //   350: aload_1
    //   351: getfield g : Lot0;
    //   354: aload_1
    //   355: getfield h : Lot0;
    //   358: if_acmpeq -> 367
    //   361: iconst_1
    //   362: istore #12
    //   364: goto -> 370
    //   367: iconst_0
    //   368: istore #12
    //   370: aload_0
    //   371: aload #13
    //   373: lload #10
    //   375: iload #12
    //   377: invokevirtual A : (Lfw0;JZ)J
    //   380: lstore #8
    //   382: lload #6
    //   384: lload #8
    //   386: lcmp
    //   387: ifeq -> 395
    //   390: iconst_1
    //   391: istore_3
    //   392: goto -> 397
    //   395: iconst_0
    //   396: istore_3
    //   397: iload_2
    //   398: iload_3
    //   399: ior
    //   400: istore_2
    //   401: lload #8
    //   403: lstore #6
    //   405: goto -> 416
    //   408: aload_0
    //   409: aload_1
    //   410: putfield E : Ls60;
    //   413: goto -> 405
    //   416: aload_0
    //   417: aload_0
    //   418: aload #13
    //   420: lload #6
    //   422: lload #4
    //   424: invokevirtual c : (Lfw0;JJ)Lq71;
    //   427: putfield t : Lq71;
    //   430: iload_2
    //   431: ifeq -> 437
    //   434: goto -> 318
    //   437: return
    //   438: astore_1
    //   439: goto -> 328
    //   442: aload_0
    //   443: aload_0
    //   444: aload #13
    //   446: lload #6
    //   448: lload #4
    //   450: invokevirtual c : (Lfw0;JJ)Lq71;
    //   453: putfield t : Lq71;
    //   456: iload_2
    //   457: ifeq -> 468
    //   460: aload_0
    //   461: getfield p : Lr60;
    //   464: iconst_2
    //   465: invokevirtual a : (I)V
    //   468: aload_1
    //   469: athrow
    // Exception table:
    //   from	to	target	type
    //   146	152	195	finally
    //   157	162	327	finally
    //   178	192	195	finally
    //   203	226	327	finally
    //   230	237	195	finally
    //   244	261	195	finally
    //   272	300	327	finally
    //   345	361	438	finally
    //   370	382	438	finally
    //   408	413	438	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */