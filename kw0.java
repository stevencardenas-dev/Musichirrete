import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class kw0 extends f0 {
  public static final Parcelable.Creator<kw0> CREATOR = new yb2(20);
  
  public MediaInfo b;
  
  public long c;
  
  public int e;
  
  public double f;
  
  public int g;
  
  public int h;
  
  public long i;
  
  public long j;
  
  public double k;
  
  public boolean l;
  
  public long[] m;
  
  public int n;
  
  public int o;
  
  public String p;
  
  public JSONObject q;
  
  public int r;
  
  public final ArrayList s = new ArrayList();
  
  public boolean t;
  
  public r2 u;
  
  public f22 v;
  
  public it0 w;
  
  public tt0 x;
  
  public boolean y;
  
  public final SparseArray z = new SparseArray();
  
  public kw0(MediaInfo paramMediaInfo, long paramLong1, int paramInt1, double paramDouble1, int paramInt2, int paramInt3, long paramLong2, long paramLong3, double paramDouble2, boolean paramBoolean1, long[] paramArrayOflong, int paramInt4, int paramInt5, String paramString, int paramInt6, ArrayList paramArrayList, boolean paramBoolean2, r2 paramr2, f22 paramf22, it0 paramit0, tt0 paramtt0) {
    this.b = paramMediaInfo;
    this.c = paramLong1;
    this.e = paramInt1;
    this.f = paramDouble1;
    this.g = paramInt2;
    this.h = paramInt3;
    this.i = paramLong2;
    this.j = paramLong3;
    this.k = paramDouble2;
    this.l = paramBoolean1;
    this.m = paramArrayOflong;
    this.n = paramInt4;
    this.o = paramInt5;
    this.p = paramString;
    if (paramString != null) {
      try {
        JSONObject jSONObject = new JSONObject();
        this(this.p);
        this.q = jSONObject;
      } catch (JSONException jSONException) {
        this.q = null;
        this.p = null;
      } 
    } else {
      this.q = null;
    } 
    this.r = paramInt6;
    if (paramArrayList != null && !paramArrayList.isEmpty())
      f(paramArrayList); 
    this.t = paramBoolean2;
    this.u = paramr2;
    this.v = paramf22;
    this.w = paramit0;
    this.x = paramtt0;
    paramBoolean2 = false;
    paramBoolean1 = paramBoolean2;
    if (paramtt0 != null) {
      paramBoolean1 = paramBoolean2;
      if (paramtt0.l)
        paramBoolean1 = true; 
    } 
    this.y = paramBoolean1;
  }
  
  public final int e(JSONObject paramJSONObject, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'extendedStatus'
    //   3: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   6: astore #19
    //   8: aload #19
    //   10: ifnull -> 139
    //   13: new java/util/ArrayList
    //   16: astore #20
    //   18: aload #20
    //   20: invokespecial <init> : ()V
    //   23: aload_1
    //   24: invokevirtual keys : ()Ljava/util/Iterator;
    //   27: astore #21
    //   29: aload #21
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 58
    //   39: aload #20
    //   41: aload #21
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: checkcast java/lang/String
    //   51: invokevirtual add : (Ljava/lang/Object;)Z
    //   54: pop
    //   55: goto -> 29
    //   58: new org/json/JSONObject
    //   61: astore #21
    //   63: aload #21
    //   65: aload_1
    //   66: aload #20
    //   68: iconst_0
    //   69: anewarray java/lang/String
    //   72: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   75: checkcast [Ljava/lang/String;
    //   78: invokespecial <init> : (Lorg/json/JSONObject;[Ljava/lang/String;)V
    //   81: aload #19
    //   83: invokevirtual keys : ()Ljava/util/Iterator;
    //   86: astore #20
    //   88: aload #20
    //   90: invokeinterface hasNext : ()Z
    //   95: ifeq -> 128
    //   98: aload #20
    //   100: invokeinterface next : ()Ljava/lang/Object;
    //   105: checkcast java/lang/String
    //   108: astore #22
    //   110: aload #21
    //   112: aload #22
    //   114: aload #19
    //   116: aload #22
    //   118: invokevirtual get : (Ljava/lang/String;)Ljava/lang/Object;
    //   121: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   124: pop
    //   125: goto -> 88
    //   128: aload #21
    //   130: ldc 'extendedStatus'
    //   132: invokevirtual remove : (Ljava/lang/String;)Ljava/lang/Object;
    //   135: pop
    //   136: goto -> 142
    //   139: aload_1
    //   140: astore #21
    //   142: aload #21
    //   144: ldc 'mediaSessionId'
    //   146: invokevirtual getLong : (Ljava/lang/String;)J
    //   149: lstore #10
    //   151: lload #10
    //   153: aload_0
    //   154: getfield c : J
    //   157: lcmp
    //   158: ifeq -> 173
    //   161: aload_0
    //   162: lload #10
    //   164: putfield c : J
    //   167: iconst_1
    //   168: istore #6
    //   170: goto -> 176
    //   173: iconst_0
    //   174: istore #6
    //   176: getstatic com/pavelsikun/seekbarpreference/lu/FgdLmmRfTxSFKI.KWkCXZKkjfT : Ljava/lang/String;
    //   179: astore_1
    //   180: aload #21
    //   182: aload_1
    //   183: invokevirtual has : (Ljava/lang/String;)Z
    //   186: istore #18
    //   188: iconst_2
    //   189: istore #9
    //   191: iload #6
    //   193: istore #7
    //   195: iload #18
    //   197: ifeq -> 432
    //   200: aload #21
    //   202: aload_1
    //   203: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   206: astore_1
    //   207: aload_1
    //   208: ldc 'IDLE'
    //   210: invokevirtual equals : (Ljava/lang/Object;)Z
    //   213: ifeq -> 222
    //   216: iconst_1
    //   217: istore #5
    //   219: goto -> 286
    //   222: aload_1
    //   223: ldc 'PLAYING'
    //   225: invokevirtual equals : (Ljava/lang/Object;)Z
    //   228: ifeq -> 237
    //   231: iconst_2
    //   232: istore #5
    //   234: goto -> 286
    //   237: aload_1
    //   238: ldc 'PAUSED'
    //   240: invokevirtual equals : (Ljava/lang/Object;)Z
    //   243: ifeq -> 252
    //   246: iconst_3
    //   247: istore #5
    //   249: goto -> 286
    //   252: aload_1
    //   253: getstatic com/sdsmdg/harjot/crollerTest/TG/ckOPp.PQmq : Ljava/lang/String;
    //   256: invokevirtual equals : (Ljava/lang/Object;)Z
    //   259: ifeq -> 268
    //   262: iconst_4
    //   263: istore #5
    //   265: goto -> 286
    //   268: aload_1
    //   269: ldc 'LOADING'
    //   271: invokevirtual equals : (Ljava/lang/Object;)Z
    //   274: ifeq -> 283
    //   277: iconst_5
    //   278: istore #5
    //   280: goto -> 286
    //   283: iconst_0
    //   284: istore #5
    //   286: iload #6
    //   288: istore #8
    //   290: iload #5
    //   292: aload_0
    //   293: getfield g : I
    //   296: if_icmpeq -> 311
    //   299: aload_0
    //   300: iload #5
    //   302: putfield g : I
    //   305: iload #6
    //   307: iconst_2
    //   308: ior
    //   309: istore #8
    //   311: iload #8
    //   313: istore #7
    //   315: iload #5
    //   317: iconst_1
    //   318: if_icmpne -> 432
    //   321: iload #8
    //   323: istore #7
    //   325: aload #21
    //   327: ldc 'idleReason'
    //   329: invokevirtual has : (Ljava/lang/String;)Z
    //   332: ifeq -> 432
    //   335: aload #21
    //   337: ldc 'idleReason'
    //   339: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   342: astore_1
    //   343: aload_1
    //   344: ldc 'CANCELLED'
    //   346: invokevirtual equals : (Ljava/lang/Object;)Z
    //   349: ifeq -> 358
    //   352: iconst_2
    //   353: istore #5
    //   355: goto -> 407
    //   358: aload_1
    //   359: getstatic com/google/android/gms/common/internal/Qg/nFLlOYeP.iRxIYKf : Ljava/lang/String;
    //   362: invokevirtual equals : (Ljava/lang/Object;)Z
    //   365: ifeq -> 374
    //   368: iconst_3
    //   369: istore #5
    //   371: goto -> 407
    //   374: aload_1
    //   375: ldc 'FINISHED'
    //   377: invokevirtual equals : (Ljava/lang/Object;)Z
    //   380: ifeq -> 389
    //   383: iconst_1
    //   384: istore #5
    //   386: goto -> 407
    //   389: aload_1
    //   390: ldc 'ERROR'
    //   392: invokevirtual equals : (Ljava/lang/Object;)Z
    //   395: ifeq -> 404
    //   398: iconst_4
    //   399: istore #5
    //   401: goto -> 407
    //   404: iconst_0
    //   405: istore #5
    //   407: iload #8
    //   409: istore #7
    //   411: iload #5
    //   413: aload_0
    //   414: getfield h : I
    //   417: if_icmpeq -> 432
    //   420: aload_0
    //   421: iload #5
    //   423: putfield h : I
    //   426: iload #8
    //   428: iconst_2
    //   429: ior
    //   430: istore #7
    //   432: iload #7
    //   434: istore #5
    //   436: aload #21
    //   438: ldc 'playbackRate'
    //   440: invokevirtual has : (Ljava/lang/String;)Z
    //   443: ifeq -> 478
    //   446: aload #21
    //   448: ldc 'playbackRate'
    //   450: invokevirtual getDouble : (Ljava/lang/String;)D
    //   453: dstore_3
    //   454: iload #7
    //   456: istore #5
    //   458: aload_0
    //   459: getfield f : D
    //   462: dload_3
    //   463: dcmpl
    //   464: ifeq -> 478
    //   467: aload_0
    //   468: dload_3
    //   469: putfield f : D
    //   472: iload #7
    //   474: iconst_2
    //   475: ior
    //   476: istore #5
    //   478: iload #5
    //   480: istore #6
    //   482: aload #21
    //   484: ldc 'currentTime'
    //   486: invokevirtual has : (Ljava/lang/String;)Z
    //   489: ifeq -> 546
    //   492: aload #21
    //   494: ldc 'currentTime'
    //   496: invokevirtual getDouble : (Ljava/lang/String;)D
    //   499: dstore_3
    //   500: getstatic qj.a : Ljava/util/regex/Pattern;
    //   503: astore_1
    //   504: dload_3
    //   505: ldc2_w 1000.0
    //   508: dmul
    //   509: d2l
    //   510: lstore #10
    //   512: iload #5
    //   514: istore #6
    //   516: lload #10
    //   518: aload_0
    //   519: getfield i : J
    //   522: lcmp
    //   523: ifeq -> 538
    //   526: aload_0
    //   527: lload #10
    //   529: putfield i : J
    //   532: iload #5
    //   534: iconst_2
    //   535: ior
    //   536: istore #6
    //   538: iload #6
    //   540: sipush #128
    //   543: ior
    //   544: istore #6
    //   546: getstatic com/google/android/gms/common/internal/Qg/nFLlOYeP.FvQpzwwyyiWcl : Ljava/lang/String;
    //   549: astore_1
    //   550: iload #6
    //   552: istore #5
    //   554: aload #21
    //   556: aload_1
    //   557: invokevirtual has : (Ljava/lang/String;)Z
    //   560: ifeq -> 597
    //   563: aload #21
    //   565: aload_1
    //   566: invokevirtual getLong : (Ljava/lang/String;)J
    //   569: lstore #10
    //   571: iload #6
    //   573: istore #5
    //   575: lload #10
    //   577: aload_0
    //   578: getfield j : J
    //   581: lcmp
    //   582: ifeq -> 597
    //   585: aload_0
    //   586: lload #10
    //   588: putfield j : J
    //   591: iload #6
    //   593: iconst_2
    //   594: ior
    //   595: istore #5
    //   597: aload #21
    //   599: ldc_w 'volume'
    //   602: invokevirtual has : (Ljava/lang/String;)Z
    //   605: ifeq -> 688
    //   608: iload_2
    //   609: ifne -> 688
    //   612: aload #21
    //   614: ldc_w 'volume'
    //   617: invokevirtual getJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   620: astore_1
    //   621: aload_1
    //   622: ldc_w 'level'
    //   625: invokevirtual getDouble : (Ljava/lang/String;)D
    //   628: dstore_3
    //   629: iload #5
    //   631: istore #6
    //   633: dload_3
    //   634: aload_0
    //   635: getfield k : D
    //   638: dcmpl
    //   639: ifeq -> 653
    //   642: aload_0
    //   643: dload_3
    //   644: putfield k : D
    //   647: iload #5
    //   649: iconst_2
    //   650: ior
    //   651: istore #6
    //   653: aload_1
    //   654: ldc_w 'muted'
    //   657: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   660: istore #18
    //   662: iload #6
    //   664: istore_2
    //   665: iload #18
    //   667: aload_0
    //   668: getfield l : Z
    //   671: if_icmpeq -> 691
    //   674: aload_0
    //   675: iload #18
    //   677: putfield l : Z
    //   680: iload #6
    //   682: iconst_2
    //   683: ior
    //   684: istore_2
    //   685: goto -> 691
    //   688: iload #5
    //   690: istore_2
    //   691: aload #21
    //   693: ldc_w 'activeTrackIds'
    //   696: invokevirtual has : (Ljava/lang/String;)Z
    //   699: ifeq -> 714
    //   702: aload #21
    //   704: ldc_w 'activeTrackIds'
    //   707: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   710: astore_1
    //   711: goto -> 716
    //   714: aconst_null
    //   715: astore_1
    //   716: getstatic qj.a : Ljava/util/regex/Pattern;
    //   719: astore #19
    //   721: aload_1
    //   722: ifnonnull -> 731
    //   725: aconst_null
    //   726: astore #19
    //   728: goto -> 772
    //   731: aload_1
    //   732: invokevirtual length : ()I
    //   735: newarray long
    //   737: astore #20
    //   739: iconst_0
    //   740: istore #5
    //   742: aload #20
    //   744: astore #19
    //   746: iload #5
    //   748: aload_1
    //   749: invokevirtual length : ()I
    //   752: if_icmpge -> 772
    //   755: aload #20
    //   757: iload #5
    //   759: aload_1
    //   760: iload #5
    //   762: invokevirtual getLong : (I)J
    //   765: lastore
    //   766: iinc #5, 1
    //   769: goto -> 742
    //   772: aload_0
    //   773: getfield m : [J
    //   776: astore_1
    //   777: aload #19
    //   779: ifnull -> 837
    //   782: aload_1
    //   783: ifnonnull -> 789
    //   786: goto -> 844
    //   789: aload #19
    //   791: arraylength
    //   792: istore #5
    //   794: aload_1
    //   795: arraylength
    //   796: iload #5
    //   798: if_icmpne -> 844
    //   801: iconst_0
    //   802: istore #5
    //   804: iload_2
    //   805: istore #6
    //   807: iload #5
    //   809: aload #19
    //   811: arraylength
    //   812: if_icmpge -> 855
    //   815: aload_0
    //   816: getfield m : [J
    //   819: iload #5
    //   821: laload
    //   822: aload #19
    //   824: iload #5
    //   826: laload
    //   827: lcmp
    //   828: ifne -> 844
    //   831: iinc #5, 1
    //   834: goto -> 804
    //   837: iload_2
    //   838: istore #6
    //   840: aload_1
    //   841: ifnull -> 855
    //   844: aload_0
    //   845: aload #19
    //   847: putfield m : [J
    //   850: iload_2
    //   851: iconst_2
    //   852: ior
    //   853: istore #6
    //   855: iload #6
    //   857: istore #5
    //   859: aload #21
    //   861: ldc_w 'customData'
    //   864: invokevirtual has : (Ljava/lang/String;)Z
    //   867: ifeq -> 893
    //   870: aload_0
    //   871: aload #21
    //   873: ldc_w 'customData'
    //   876: invokevirtual getJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   879: putfield q : Lorg/json/JSONObject;
    //   882: aload_0
    //   883: aconst_null
    //   884: putfield p : Ljava/lang/String;
    //   887: iload #6
    //   889: iconst_2
    //   890: ior
    //   891: istore #5
    //   893: iload #5
    //   895: istore_2
    //   896: aload #21
    //   898: ldc_w 'media'
    //   901: invokevirtual has : (Ljava/lang/String;)Z
    //   904: ifeq -> 981
    //   907: aload #21
    //   909: ldc_w 'media'
    //   912: invokevirtual getJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   915: astore #20
    //   917: new com/google/android/gms/cast/MediaInfo
    //   920: dup
    //   921: aload #20
    //   923: invokespecial <init> : (Lorg/json/JSONObject;)V
    //   926: astore_1
    //   927: aload_0
    //   928: getfield b : Lcom/google/android/gms/cast/MediaInfo;
    //   931: astore #19
    //   933: aload #19
    //   935: ifnull -> 951
    //   938: iload #5
    //   940: istore #6
    //   942: aload #19
    //   944: aload_1
    //   945: invokevirtual equals : (Ljava/lang/Object;)Z
    //   948: ifne -> 962
    //   951: aload_0
    //   952: aload_1
    //   953: putfield b : Lcom/google/android/gms/cast/MediaInfo;
    //   956: iload #5
    //   958: iconst_2
    //   959: ior
    //   960: istore #6
    //   962: iload #6
    //   964: istore_2
    //   965: aload #20
    //   967: ldc_w 'metadata'
    //   970: invokevirtual has : (Ljava/lang/String;)Z
    //   973: ifeq -> 981
    //   976: iload #6
    //   978: iconst_4
    //   979: ior
    //   980: istore_2
    //   981: iload_2
    //   982: istore #5
    //   984: aload #21
    //   986: ldc_w 'currentItemId'
    //   989: invokevirtual has : (Ljava/lang/String;)Z
    //   992: ifeq -> 1028
    //   995: aload #21
    //   997: ldc_w 'currentItemId'
    //   1000: invokevirtual getInt : (Ljava/lang/String;)I
    //   1003: istore #6
    //   1005: iload_2
    //   1006: istore #5
    //   1008: aload_0
    //   1009: getfield e : I
    //   1012: iload #6
    //   1014: if_icmpeq -> 1028
    //   1017: aload_0
    //   1018: iload #6
    //   1020: putfield e : I
    //   1023: iload_2
    //   1024: iconst_2
    //   1025: ior
    //   1026: istore #5
    //   1028: aload #21
    //   1030: ldc_w 'preloadedItemId'
    //   1033: iconst_0
    //   1034: invokevirtual optInt : (Ljava/lang/String;I)I
    //   1037: istore #6
    //   1039: iload #5
    //   1041: istore_2
    //   1042: aload_0
    //   1043: getfield o : I
    //   1046: iload #6
    //   1048: if_icmpeq -> 1063
    //   1051: aload_0
    //   1052: iload #6
    //   1054: putfield o : I
    //   1057: iload #5
    //   1059: bipush #16
    //   1061: ior
    //   1062: istore_2
    //   1063: aload #21
    //   1065: ldc_w 'loadingItemId'
    //   1068: iconst_0
    //   1069: invokevirtual optInt : (Ljava/lang/String;I)I
    //   1072: istore #5
    //   1074: iload_2
    //   1075: istore #6
    //   1077: aload_0
    //   1078: getfield n : I
    //   1081: iload #5
    //   1083: if_icmpeq -> 1097
    //   1086: aload_0
    //   1087: iload #5
    //   1089: putfield n : I
    //   1092: iload_2
    //   1093: iconst_2
    //   1094: ior
    //   1095: istore #6
    //   1097: aload_0
    //   1098: getfield b : Lcom/google/android/gms/cast/MediaInfo;
    //   1101: astore_1
    //   1102: aload_1
    //   1103: ifnonnull -> 1111
    //   1106: iconst_m1
    //   1107: istore_2
    //   1108: goto -> 1116
    //   1111: aload_1
    //   1112: getfield c : I
    //   1115: istore_2
    //   1116: aload_0
    //   1117: getfield g : I
    //   1120: istore #7
    //   1122: aload_0
    //   1123: getfield h : I
    //   1126: istore #5
    //   1128: aload_0
    //   1129: getfield n : I
    //   1132: istore #8
    //   1134: aload_0
    //   1135: getfield s : Ljava/util/ArrayList;
    //   1138: astore #20
    //   1140: aload_0
    //   1141: getfield z : Landroid/util/SparseArray;
    //   1144: astore #19
    //   1146: iload #7
    //   1148: iconst_1
    //   1149: if_icmpeq -> 1155
    //   1152: goto -> 1189
    //   1155: iload #5
    //   1157: iconst_1
    //   1158: if_icmpeq -> 1184
    //   1161: iload #5
    //   1163: iconst_2
    //   1164: if_icmpeq -> 1176
    //   1167: iload #5
    //   1169: iconst_3
    //   1170: if_icmpeq -> 1184
    //   1173: goto -> 1596
    //   1176: iload_2
    //   1177: iconst_2
    //   1178: if_icmpne -> 1173
    //   1181: goto -> 1189
    //   1184: iload #8
    //   1186: ifeq -> 1596
    //   1189: aload #21
    //   1191: ldc_w 'repeatMode'
    //   1194: invokevirtual has : (Ljava/lang/String;)Z
    //   1197: ifeq -> 1247
    //   1200: aload #21
    //   1202: ldc_w 'repeatMode'
    //   1205: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1208: invokestatic I : (Ljava/lang/String;)Ljava/lang/Integer;
    //   1211: astore_1
    //   1212: aload_1
    //   1213: ifnonnull -> 1224
    //   1216: aload_0
    //   1217: getfield r : I
    //   1220: istore_2
    //   1221: goto -> 1229
    //   1224: aload_1
    //   1225: invokevirtual intValue : ()I
    //   1228: istore_2
    //   1229: aload_0
    //   1230: getfield r : I
    //   1233: iload_2
    //   1234: if_icmpeq -> 1247
    //   1237: aload_0
    //   1238: iload_2
    //   1239: putfield r : I
    //   1242: iconst_1
    //   1243: istore_2
    //   1244: goto -> 1249
    //   1247: iconst_0
    //   1248: istore_2
    //   1249: aload #21
    //   1251: ldc_w 'items'
    //   1254: invokevirtual has : (Ljava/lang/String;)Z
    //   1257: ifeq -> 1565
    //   1260: aload #21
    //   1262: ldc_w 'items'
    //   1265: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   1268: astore #24
    //   1270: aload #24
    //   1272: invokevirtual length : ()I
    //   1275: istore #8
    //   1277: new android/util/SparseArray
    //   1280: dup
    //   1281: invokespecial <init> : ()V
    //   1284: astore #22
    //   1286: iconst_0
    //   1287: istore #7
    //   1289: iload #9
    //   1291: istore #5
    //   1293: iload #7
    //   1295: iload #8
    //   1297: if_icmpge -> 1329
    //   1300: aload #22
    //   1302: iload #7
    //   1304: aload #24
    //   1306: iload #7
    //   1308: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
    //   1311: ldc_w 'itemId'
    //   1314: invokevirtual getInt : (Ljava/lang/String;)I
    //   1317: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1320: invokevirtual put : (ILjava/lang/Object;)V
    //   1323: iinc #7, 1
    //   1326: goto -> 1293
    //   1329: new java/util/ArrayList
    //   1332: dup
    //   1333: invokespecial <init> : ()V
    //   1336: astore #23
    //   1338: iconst_0
    //   1339: istore #7
    //   1341: iload #7
    //   1343: iload #8
    //   1345: if_icmpge -> 1525
    //   1348: aload #22
    //   1350: iload #7
    //   1352: invokevirtual get : (I)Ljava/lang/Object;
    //   1355: checkcast java/lang/Integer
    //   1358: astore #26
    //   1360: aload #24
    //   1362: iload #7
    //   1364: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
    //   1367: astore #25
    //   1369: aload #19
    //   1371: aload #26
    //   1373: invokevirtual intValue : ()I
    //   1376: invokevirtual get : (I)Ljava/lang/Object;
    //   1379: checkcast java/lang/Integer
    //   1382: astore_1
    //   1383: aload_1
    //   1384: ifnonnull -> 1392
    //   1387: aconst_null
    //   1388: astore_1
    //   1389: goto -> 1405
    //   1392: aload #20
    //   1394: aload_1
    //   1395: invokevirtual intValue : ()I
    //   1398: invokevirtual get : (I)Ljava/lang/Object;
    //   1401: checkcast ut0
    //   1404: astore_1
    //   1405: aload_1
    //   1406: ifnull -> 1451
    //   1409: iload_2
    //   1410: aload_1
    //   1411: aload #25
    //   1413: invokevirtual e : (Lorg/json/JSONObject;)Z
    //   1416: ior
    //   1417: istore_2
    //   1418: aload #23
    //   1420: aload_1
    //   1421: invokevirtual add : (Ljava/lang/Object;)Z
    //   1424: pop
    //   1425: iload #7
    //   1427: aload #19
    //   1429: aload #26
    //   1431: invokevirtual intValue : ()I
    //   1434: invokevirtual get : (I)Ljava/lang/Object;
    //   1437: checkcast java/lang/Integer
    //   1440: invokevirtual intValue : ()I
    //   1443: if_icmpeq -> 1519
    //   1446: iconst_1
    //   1447: istore_2
    //   1448: goto -> 1519
    //   1451: aload #26
    //   1453: invokevirtual intValue : ()I
    //   1456: aload_0
    //   1457: getfield e : I
    //   1460: if_icmpne -> 1501
    //   1463: aload_0
    //   1464: getfield b : Lcom/google/android/gms/cast/MediaInfo;
    //   1467: astore_1
    //   1468: aload_1
    //   1469: ifnull -> 1501
    //   1472: new bh0
    //   1475: dup
    //   1476: aload_1
    //   1477: invokespecial <init> : (Lcom/google/android/gms/cast/MediaInfo;)V
    //   1480: invokevirtual o : ()Lut0;
    //   1483: astore_1
    //   1484: aload_1
    //   1485: aload #25
    //   1487: invokevirtual e : (Lorg/json/JSONObject;)Z
    //   1490: pop
    //   1491: aload #23
    //   1493: aload_1
    //   1494: invokevirtual add : (Ljava/lang/Object;)Z
    //   1497: pop
    //   1498: goto -> 1446
    //   1501: aload #23
    //   1503: new ut0
    //   1506: dup
    //   1507: aload #25
    //   1509: invokespecial <init> : (Lorg/json/JSONObject;)V
    //   1512: invokevirtual add : (Ljava/lang/Object;)Z
    //   1515: pop
    //   1516: goto -> 1446
    //   1519: iinc #7, 1
    //   1522: goto -> 1341
    //   1525: aload #20
    //   1527: invokevirtual size : ()I
    //   1530: iload #8
    //   1532: if_icmpeq -> 1541
    //   1535: iconst_0
    //   1536: istore #7
    //   1538: goto -> 1544
    //   1541: iconst_1
    //   1542: istore #7
    //   1544: iload_2
    //   1545: iload #7
    //   1547: iconst_1
    //   1548: ixor
    //   1549: ior
    //   1550: istore #8
    //   1552: aload_0
    //   1553: aload #23
    //   1555: invokevirtual f : (Ljava/util/List;)V
    //   1558: iload #5
    //   1560: istore #7
    //   1562: goto -> 1571
    //   1565: iconst_2
    //   1566: istore #7
    //   1568: iload_2
    //   1569: istore #8
    //   1571: iload #6
    //   1573: istore_2
    //   1574: iload #7
    //   1576: istore #5
    //   1578: iload #8
    //   1580: ifeq -> 1593
    //   1583: iload #6
    //   1585: bipush #8
    //   1587: ior
    //   1588: istore_2
    //   1589: iload #7
    //   1591: istore #5
    //   1593: goto -> 1657
    //   1596: iconst_2
    //   1597: istore #7
    //   1599: aload_0
    //   1600: iconst_0
    //   1601: putfield e : I
    //   1604: aload_0
    //   1605: iconst_0
    //   1606: putfield n : I
    //   1609: aload_0
    //   1610: iconst_0
    //   1611: putfield o : I
    //   1614: iload #6
    //   1616: istore_2
    //   1617: iload #7
    //   1619: istore #5
    //   1621: aload #20
    //   1623: invokevirtual isEmpty : ()Z
    //   1626: ifne -> 1593
    //   1629: iload #6
    //   1631: bipush #8
    //   1633: ior
    //   1634: istore_2
    //   1635: aload_0
    //   1636: iconst_0
    //   1637: putfield r : I
    //   1640: aload #20
    //   1642: invokevirtual clear : ()V
    //   1645: aload #19
    //   1647: invokevirtual clear : ()V
    //   1650: iload #7
    //   1652: istore #5
    //   1654: goto -> 1593
    //   1657: aload #21
    //   1659: ldc_w 'breakStatus'
    //   1662: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   1665: astore_1
    //   1666: getstatic r2.CREATOR : Landroid/os/Parcelable$Creator;
    //   1669: astore #19
    //   1671: aload_1
    //   1672: ifnonnull -> 1680
    //   1675: aconst_null
    //   1676: astore_1
    //   1677: goto -> 1839
    //   1680: aload_1
    //   1681: ldc_w 'currentBreakTime'
    //   1684: invokevirtual has : (Ljava/lang/String;)Z
    //   1687: ifeq -> 1675
    //   1690: getstatic com/google/android/gms/cast/framework/internal/featurehighlight/aS/xveccWbRzqx.Qssm : Ljava/lang/String;
    //   1693: astore #20
    //   1695: aload_1
    //   1696: aload #20
    //   1698: invokevirtual has : (Ljava/lang/String;)Z
    //   1701: ifne -> 1707
    //   1704: goto -> 1675
    //   1707: aload_1
    //   1708: ldc_w 'currentBreakTime'
    //   1711: invokevirtual getLong : (Ljava/lang/String;)J
    //   1714: lstore #14
    //   1716: getstatic qj.a : Ljava/util/regex/Pattern;
    //   1719: astore #19
    //   1721: aload_1
    //   1722: aload #20
    //   1724: invokevirtual getLong : (Ljava/lang/String;)J
    //   1727: lstore #16
    //   1729: aload_1
    //   1730: getstatic com/sdsmdg/harjot/crollerTest/TG/ckOPp.yMIgE : Ljava/lang/String;
    //   1733: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   1736: astore #20
    //   1738: aload_1
    //   1739: ldc_w 'breakClipId'
    //   1742: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   1745: astore #19
    //   1747: aload_1
    //   1748: ldc_w 'whenSkippable'
    //   1751: ldc2_w -1
    //   1754: invokevirtual optLong : (Ljava/lang/String;J)J
    //   1757: lstore #12
    //   1759: lload #12
    //   1761: lstore #10
    //   1763: lload #12
    //   1765: ldc2_w -1
    //   1768: lcmp
    //   1769: ifeq -> 1780
    //   1772: lload #12
    //   1774: ldc2_w 1000
    //   1777: lmul
    //   1778: lstore #10
    //   1780: new r2
    //   1783: dup
    //   1784: lload #14
    //   1786: ldc2_w 1000
    //   1789: lmul
    //   1790: lload #16
    //   1792: ldc2_w 1000
    //   1795: lmul
    //   1796: aload #20
    //   1798: aload #19
    //   1800: lload #10
    //   1802: invokespecial <init> : (JJLjava/lang/String;Ljava/lang/String;J)V
    //   1805: astore_1
    //   1806: goto -> 1839
    //   1809: astore #19
    //   1811: getstatic r2.h : Lrp0;
    //   1814: astore_1
    //   1815: aload_1
    //   1816: getfield a : Ljava/lang/String;
    //   1819: aload_1
    //   1820: ldc_w 'Error while creating an AdBreakClipInfo from JSON'
    //   1823: iconst_0
    //   1824: anewarray java/lang/Object
    //   1827: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1830: aload #19
    //   1832: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1835: pop
    //   1836: goto -> 1675
    //   1839: aload_0
    //   1840: getfield u : Lr2;
    //   1843: astore #19
    //   1845: aload #19
    //   1847: ifnonnull -> 1854
    //   1850: aload_1
    //   1851: ifnonnull -> 1874
    //   1854: iload_2
    //   1855: istore #6
    //   1857: aload #19
    //   1859: ifnull -> 1918
    //   1862: iload_2
    //   1863: istore #6
    //   1865: aload #19
    //   1867: aload_1
    //   1868: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1871: ifne -> 1918
    //   1874: aload_1
    //   1875: ifnull -> 1898
    //   1878: aload_1
    //   1879: getfield e : Ljava/lang/String;
    //   1882: ifnonnull -> 1892
    //   1885: aload_1
    //   1886: getfield f : Ljava/lang/String;
    //   1889: ifnull -> 1898
    //   1892: iconst_1
    //   1893: istore #18
    //   1895: goto -> 1901
    //   1898: iconst_0
    //   1899: istore #18
    //   1901: aload_0
    //   1902: iload #18
    //   1904: putfield t : Z
    //   1907: aload_0
    //   1908: aload_1
    //   1909: putfield u : Lr2;
    //   1912: iload_2
    //   1913: bipush #32
    //   1915: ior
    //   1916: istore #6
    //   1918: aload #21
    //   1920: ldc_w 'videoInfo'
    //   1923: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   1926: astore_1
    //   1927: getstatic f22.f : Lrp0;
    //   1930: astore #19
    //   1932: aload_1
    //   1933: ifnonnull -> 1941
    //   1936: aconst_null
    //   1937: astore_1
    //   1938: goto -> 2114
    //   1941: aload_1
    //   1942: ldc_w 'hdrType'
    //   1945: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1948: astore #20
    //   1950: aload #20
    //   1952: invokevirtual hashCode : ()I
    //   1955: istore_2
    //   1956: iload_2
    //   1957: sipush #3218
    //   1960: if_icmpeq -> 2036
    //   1963: iload_2
    //   1964: ldc_w 103158
    //   1967: if_icmpeq -> 2020
    //   1970: iload_2
    //   1971: ldc_w 113729
    //   1974: if_icmpeq -> 2004
    //   1977: iload_2
    //   1978: ldc_w 99136405
    //   1981: if_icmpeq -> 1987
    //   1984: goto -> 2052
    //   1987: aload #20
    //   1989: ldc_w 'hdr10'
    //   1992: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1995: ifeq -> 2052
    //   1998: iload #5
    //   2000: istore_2
    //   2001: goto -> 2071
    //   2004: aload #20
    //   2006: ldc_w 'sdr'
    //   2009: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2012: ifeq -> 2052
    //   2015: iconst_1
    //   2016: istore_2
    //   2017: goto -> 2071
    //   2020: aload #20
    //   2022: ldc_w 'hdr'
    //   2025: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2028: ifeq -> 2052
    //   2031: iconst_4
    //   2032: istore_2
    //   2033: goto -> 2071
    //   2036: aload #20
    //   2038: ldc_w 'dv'
    //   2041: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2044: ifeq -> 2052
    //   2047: iconst_3
    //   2048: istore_2
    //   2049: goto -> 2071
    //   2052: aload #19
    //   2054: ldc_w 'Unknown HDR type: %s'
    //   2057: iconst_1
    //   2058: anewarray java/lang/Object
    //   2061: dup
    //   2062: iconst_0
    //   2063: aload #20
    //   2065: aastore
    //   2066: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   2069: iconst_0
    //   2070: istore_2
    //   2071: new f22
    //   2074: dup
    //   2075: aload_1
    //   2076: ldc_w 'width'
    //   2079: invokevirtual getInt : (Ljava/lang/String;)I
    //   2082: aload_1
    //   2083: ldc_w 'height'
    //   2086: invokevirtual getInt : (Ljava/lang/String;)I
    //   2089: iload_2
    //   2090: invokespecial <init> : (III)V
    //   2093: astore_1
    //   2094: goto -> 2114
    //   2097: astore_1
    //   2098: aload #19
    //   2100: aload_1
    //   2101: ldc_w 'Error while creating a VideoInfo instance from JSON'
    //   2104: iconst_0
    //   2105: anewarray java/lang/Object
    //   2108: invokevirtual a : (Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2111: goto -> 1936
    //   2114: aload_0
    //   2115: getfield v : Lf22;
    //   2118: astore #19
    //   2120: aload #19
    //   2122: ifnonnull -> 2129
    //   2125: aload_1
    //   2126: ifnonnull -> 2149
    //   2129: iload #6
    //   2131: istore_2
    //   2132: aload #19
    //   2134: ifnull -> 2160
    //   2137: iload #6
    //   2139: istore_2
    //   2140: aload #19
    //   2142: aload_1
    //   2143: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2146: ifne -> 2160
    //   2149: aload_0
    //   2150: aload_1
    //   2151: putfield v : Lf22;
    //   2154: iload #6
    //   2156: bipush #64
    //   2158: ior
    //   2159: istore_2
    //   2160: iload_2
    //   2161: istore #6
    //   2163: aload #21
    //   2165: ldc_w 'breakInfo'
    //   2168: invokevirtual has : (Ljava/lang/String;)Z
    //   2171: ifeq -> 2203
    //   2174: aload_0
    //   2175: getfield b : Lcom/google/android/gms/cast/MediaInfo;
    //   2178: astore_1
    //   2179: iload_2
    //   2180: istore #6
    //   2182: aload_1
    //   2183: ifnull -> 2203
    //   2186: aload_1
    //   2187: aload #21
    //   2189: ldc_w 'breakInfo'
    //   2192: invokevirtual getJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   2195: invokevirtual e : (Lorg/json/JSONObject;)V
    //   2198: iload_2
    //   2199: iconst_2
    //   2200: ior
    //   2201: istore #6
    //   2203: aload #21
    //   2205: ldc_w 'queueData'
    //   2208: invokevirtual has : (Ljava/lang/String;)Z
    //   2211: ifeq -> 3172
    //   2214: aload #21
    //   2216: ldc_w 'queueData'
    //   2219: invokevirtual getJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   2222: astore #26
    //   2224: aload #26
    //   2226: ifnonnull -> 2262
    //   2229: ldc2_w -1
    //   2232: lstore #10
    //   2234: aconst_null
    //   2235: astore #19
    //   2237: iconst_0
    //   2238: istore #7
    //   2240: iconst_0
    //   2241: istore #5
    //   2243: iconst_0
    //   2244: istore_2
    //   2245: iconst_0
    //   2246: istore #18
    //   2248: aconst_null
    //   2249: astore #23
    //   2251: aconst_null
    //   2252: astore #20
    //   2254: aconst_null
    //   2255: astore #22
    //   2257: aconst_null
    //   2258: astore_1
    //   2259: goto -> 3065
    //   2262: aload #26
    //   2264: ldc_w 'id'
    //   2267: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   2270: astore_1
    //   2271: aload #26
    //   2273: ldc_w 'entity'
    //   2276: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   2279: astore #23
    //   2281: aload #26
    //   2283: ldc_w 'queueType'
    //   2286: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   2289: astore #19
    //   2291: aload #19
    //   2293: invokevirtual hashCode : ()I
    //   2296: lookupswitch default -> 2380, -1803151310 -> 2516, -1758903120 -> 2500, -1632865838 -> 2483, -1319760993 -> 2467, -1088524588 -> 2450, 62359119 -> 2434, 73549584 -> 2417, 393100598 -> 2400, 902303413 -> 2383
    //   2380: goto -> 2532
    //   2383: aload #19
    //   2385: ldc_w 'LIVE_TV'
    //   2388: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2391: ifeq -> 2532
    //   2394: bipush #8
    //   2396: istore_2
    //   2397: goto -> 2534
    //   2400: aload #19
    //   2402: ldc_w 'VIDEO_PLAYLIST'
    //   2405: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2408: ifeq -> 2532
    //   2411: bipush #7
    //   2413: istore_2
    //   2414: goto -> 2534
    //   2417: aload #19
    //   2419: ldc_w 'MOVIE'
    //   2422: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2425: ifeq -> 2532
    //   2428: bipush #9
    //   2430: istore_2
    //   2431: goto -> 2534
    //   2434: aload #19
    //   2436: ldc_w 'ALBUM'
    //   2439: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2442: ifeq -> 2532
    //   2445: iconst_1
    //   2446: istore_2
    //   2447: goto -> 2534
    //   2450: aload #19
    //   2452: ldc_w 'TV_SERIES'
    //   2455: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2458: ifeq -> 2532
    //   2461: bipush #6
    //   2463: istore_2
    //   2464: goto -> 2534
    //   2467: aload #19
    //   2469: ldc_w 'AUDIOBOOK'
    //   2472: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2475: ifeq -> 2532
    //   2478: iconst_3
    //   2479: istore_2
    //   2480: goto -> 2534
    //   2483: aload #19
    //   2485: ldc_w 'PLAYLIST'
    //   2488: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2491: ifeq -> 2532
    //   2494: iload #5
    //   2496: istore_2
    //   2497: goto -> 2534
    //   2500: aload #19
    //   2502: ldc_w 'RADIO_STATION'
    //   2505: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2508: ifeq -> 2532
    //   2511: iconst_4
    //   2512: istore_2
    //   2513: goto -> 2534
    //   2516: aload #19
    //   2518: getstatic androidx/work/impl/utils/qnuS/eRUgfgGAccgka.zGdRM : Ljava/lang/String;
    //   2521: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2524: ifeq -> 2532
    //   2527: iconst_5
    //   2528: istore_2
    //   2529: goto -> 2534
    //   2532: iconst_0
    //   2533: istore_2
    //   2534: aload #26
    //   2536: ldc_w 'name'
    //   2539: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   2542: astore #24
    //   2544: aload #26
    //   2546: ldc_w 'containerMetadata'
    //   2549: invokevirtual has : (Ljava/lang/String;)Z
    //   2552: ifeq -> 2568
    //   2555: aload #26
    //   2557: ldc_w 'containerMetadata'
    //   2560: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   2563: astore #20
    //   2565: goto -> 2571
    //   2568: aconst_null
    //   2569: astore #20
    //   2571: aload #20
    //   2573: ifnull -> 2850
    //   2576: aload #20
    //   2578: getstatic com/google/android/gms/common/api/internal/jEVH/KjdXPYm.mmFA : Ljava/lang/String;
    //   2581: ldc_w ''
    //   2584: invokevirtual optString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2587: astore #19
    //   2589: aload #19
    //   2591: invokevirtual hashCode : ()I
    //   2594: istore #5
    //   2596: iload #5
    //   2598: ldc_w 6924225
    //   2601: if_icmpeq -> 2630
    //   2604: iload #5
    //   2606: ldc_w 828666841
    //   2609: if_icmpeq -> 2615
    //   2612: goto -> 2624
    //   2615: aload #19
    //   2617: ldc_w 'GENERIC_CONTAINER'
    //   2620: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2623: pop
    //   2624: iconst_0
    //   2625: istore #5
    //   2627: goto -> 2644
    //   2630: aload #19
    //   2632: ldc_w 'AUDIOBOOK_CONTAINER'
    //   2635: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2638: ifeq -> 2624
    //   2641: iconst_1
    //   2642: istore #5
    //   2644: aload #20
    //   2646: ldc_w 'title'
    //   2649: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   2652: astore #27
    //   2654: aload #20
    //   2656: ldc_w 'sections'
    //   2659: invokevirtual optJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   2662: astore #28
    //   2664: aload #28
    //   2666: ifnull -> 2749
    //   2669: new java/util/ArrayList
    //   2672: dup
    //   2673: invokespecial <init> : ()V
    //   2676: astore #25
    //   2678: iconst_0
    //   2679: istore #7
    //   2681: aload #25
    //   2683: astore #22
    //   2685: aload_1
    //   2686: astore #19
    //   2688: iload #7
    //   2690: aload #28
    //   2692: invokevirtual length : ()I
    //   2695: if_icmpge -> 2746
    //   2698: aload #28
    //   2700: iload #7
    //   2702: invokevirtual optJSONObject : (I)Lorg/json/JSONObject;
    //   2705: astore #22
    //   2707: aload #22
    //   2709: ifnull -> 2740
    //   2712: new kt0
    //   2715: dup
    //   2716: iconst_0
    //   2717: invokespecial <init> : (I)V
    //   2720: astore #19
    //   2722: aload #19
    //   2724: aload #22
    //   2726: invokevirtual i : (Lorg/json/JSONObject;)V
    //   2729: aload #25
    //   2731: aload #19
    //   2733: invokevirtual add : (Ljava/lang/Object;)Z
    //   2736: pop
    //   2737: goto -> 2740
    //   2740: iinc #7, 1
    //   2743: goto -> 2681
    //   2746: goto -> 2758
    //   2749: aconst_null
    //   2750: astore #22
    //   2752: aload_1
    //   2753: astore #19
    //   2755: goto -> 2746
    //   2758: aload #20
    //   2760: ldc_w 'containerImages'
    //   2763: invokevirtual optJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   2766: astore #25
    //   2768: aload #25
    //   2770: ifnull -> 2790
    //   2773: new java/util/ArrayList
    //   2776: dup
    //   2777: invokespecial <init> : ()V
    //   2780: astore_1
    //   2781: aload_1
    //   2782: aload #25
    //   2784: invokestatic a : (Ljava/util/List;Lorg/json/JSONArray;)V
    //   2787: goto -> 2792
    //   2790: aconst_null
    //   2791: astore_1
    //   2792: aload #20
    //   2794: ldc_w 'containerDuration'
    //   2797: dconst_0
    //   2798: invokevirtual optDouble : (Ljava/lang/String;D)D
    //   2801: dstore_3
    //   2802: new java/lang/Object
    //   2805: dup
    //   2806: invokespecial <init> : ()V
    //   2809: astore #20
    //   2811: aload #20
    //   2813: iload #5
    //   2815: putfield b : I
    //   2818: aload #20
    //   2820: aload #27
    //   2822: putfield c : Ljava/lang/String;
    //   2825: aload #20
    //   2827: aload #22
    //   2829: putfield e : Ljava/util/List;
    //   2832: aload #20
    //   2834: aload_1
    //   2835: putfield f : Ljava/util/List;
    //   2838: aload #20
    //   2840: dload_3
    //   2841: putfield g : D
    //   2844: aload #20
    //   2846: astore_1
    //   2847: goto -> 2859
    //   2850: aconst_null
    //   2851: astore #20
    //   2853: aload_1
    //   2854: astore #19
    //   2856: aload #20
    //   2858: astore_1
    //   2859: aload #26
    //   2861: ldc_w 'repeatMode'
    //   2864: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   2867: invokestatic I : (Ljava/lang/String;)Ljava/lang/Integer;
    //   2870: astore #20
    //   2872: aload #20
    //   2874: ifnull -> 2887
    //   2877: aload #20
    //   2879: invokevirtual intValue : ()I
    //   2882: istore #5
    //   2884: goto -> 2890
    //   2887: iconst_0
    //   2888: istore #5
    //   2890: aload #26
    //   2892: ldc_w 'items'
    //   2895: invokevirtual optJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   2898: astore #25
    //   2900: aload #25
    //   2902: ifnull -> 2971
    //   2905: new java/util/ArrayList
    //   2908: dup
    //   2909: invokespecial <init> : ()V
    //   2912: astore #22
    //   2914: iconst_0
    //   2915: istore #7
    //   2917: aload #22
    //   2919: astore #20
    //   2921: iload #7
    //   2923: aload #25
    //   2925: invokevirtual length : ()I
    //   2928: if_icmpge -> 2974
    //   2931: aload #25
    //   2933: iload #7
    //   2935: invokevirtual optJSONObject : (I)Lorg/json/JSONObject;
    //   2938: astore #20
    //   2940: aload #20
    //   2942: ifnull -> 2965
    //   2945: new ut0
    //   2948: astore #27
    //   2950: aload #27
    //   2952: aload #20
    //   2954: invokespecial <init> : (Lorg/json/JSONObject;)V
    //   2957: aload #22
    //   2959: aload #27
    //   2961: invokevirtual add : (Ljava/lang/Object;)Z
    //   2964: pop
    //   2965: iinc #7, 1
    //   2968: goto -> 2917
    //   2971: aconst_null
    //   2972: astore #20
    //   2974: aload #26
    //   2976: ldc_w 'startIndex'
    //   2979: iconst_0
    //   2980: invokevirtual optInt : (Ljava/lang/String;I)I
    //   2983: istore #8
    //   2985: aload #26
    //   2987: ldc_w 'startTime'
    //   2990: invokevirtual has : (Ljava/lang/String;)Z
    //   2993: ifeq -> 3018
    //   2996: aload #26
    //   2998: ldc_w 'startTime'
    //   3001: ldc2_w -1
    //   3004: l2d
    //   3005: invokevirtual optDouble : (Ljava/lang/String;D)D
    //   3008: ldc2_w 1000.0
    //   3011: dmul
    //   3012: d2l
    //   3013: lstore #10
    //   3015: goto -> 3023
    //   3018: ldc2_w -1
    //   3021: lstore #10
    //   3023: aload #26
    //   3025: ldc_w 'shuffle'
    //   3028: invokevirtual optBoolean : (Ljava/lang/String;)Z
    //   3031: istore #18
    //   3033: aload #24
    //   3035: astore #22
    //   3037: aload_1
    //   3038: astore #24
    //   3040: iload_2
    //   3041: istore #7
    //   3043: aload #22
    //   3045: astore_1
    //   3046: aload #20
    //   3048: astore #22
    //   3050: aload #23
    //   3052: astore #20
    //   3054: aload #19
    //   3056: astore #23
    //   3058: iload #8
    //   3060: istore_2
    //   3061: aload #24
    //   3063: astore #19
    //   3065: new java/lang/Object
    //   3068: dup
    //   3069: invokespecial <init> : ()V
    //   3072: astore #24
    //   3074: aload #24
    //   3076: aload #23
    //   3078: putfield b : Ljava/lang/String;
    //   3081: aload #24
    //   3083: aload #20
    //   3085: putfield c : Ljava/lang/String;
    //   3088: aload #24
    //   3090: iload #7
    //   3092: putfield e : I
    //   3095: aload #24
    //   3097: aload_1
    //   3098: putfield f : Ljava/lang/String;
    //   3101: aload #24
    //   3103: aload #19
    //   3105: putfield g : Lst0;
    //   3108: aload #24
    //   3110: iload #5
    //   3112: putfield h : I
    //   3115: aload #24
    //   3117: aload #22
    //   3119: putfield i : Ljava/util/List;
    //   3122: aload #24
    //   3124: iload_2
    //   3125: putfield j : I
    //   3128: aload #24
    //   3130: lload #10
    //   3132: putfield k : J
    //   3135: aload #24
    //   3137: iload #18
    //   3139: putfield l : Z
    //   3142: aload_0
    //   3143: aload #24
    //   3145: putfield x : Ltt0;
    //   3148: aload_0
    //   3149: getfield y : Z
    //   3152: iload #18
    //   3154: if_icmpeq -> 3172
    //   3157: aload_0
    //   3158: iload #18
    //   3160: putfield y : Z
    //   3163: iload #6
    //   3165: bipush #8
    //   3167: ior
    //   3168: istore_2
    //   3169: goto -> 3175
    //   3172: iload #6
    //   3174: istore_2
    //   3175: aload #21
    //   3177: ldc_w 'liveSeekableRange'
    //   3180: invokevirtual has : (Ljava/lang/String;)Z
    //   3183: ifeq -> 3346
    //   3186: iload_2
    //   3187: iconst_2
    //   3188: ior
    //   3189: istore #5
    //   3191: aload #21
    //   3193: ldc_w 'liveSeekableRange'
    //   3196: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   3199: astore #19
    //   3201: getstatic it0.CREATOR : Landroid/os/Parcelable$Creator;
    //   3204: astore_1
    //   3205: aload #19
    //   3207: ifnonnull -> 3215
    //   3210: aconst_null
    //   3211: astore_1
    //   3212: goto -> 3338
    //   3215: aload #19
    //   3217: ldc_w 'start'
    //   3220: invokevirtual has : (Ljava/lang/String;)Z
    //   3223: ifeq -> 3210
    //   3226: aload #19
    //   3228: ldc_w 'end'
    //   3231: invokevirtual has : (Ljava/lang/String;)Z
    //   3234: ifne -> 3240
    //   3237: goto -> 3210
    //   3240: aload #19
    //   3242: ldc_w 'start'
    //   3245: invokevirtual getDouble : (Ljava/lang/String;)D
    //   3248: dstore_3
    //   3249: getstatic qj.a : Ljava/util/regex/Pattern;
    //   3252: astore_1
    //   3253: new it0
    //   3256: dup
    //   3257: dload_3
    //   3258: ldc2_w 1000.0
    //   3261: dmul
    //   3262: d2l
    //   3263: aload #19
    //   3265: ldc_w 'end'
    //   3268: invokevirtual getDouble : (Ljava/lang/String;)D
    //   3271: ldc2_w 1000.0
    //   3274: dmul
    //   3275: d2l
    //   3276: aload #19
    //   3278: ldc_w 'isMovingWindow'
    //   3281: invokevirtual optBoolean : (Ljava/lang/String;)Z
    //   3284: aload #19
    //   3286: ldc_w 'isLiveDone'
    //   3289: invokevirtual optBoolean : (Ljava/lang/String;)Z
    //   3292: invokespecial <init> : (JJZZ)V
    //   3295: astore_1
    //   3296: goto -> 3338
    //   3299: astore_1
    //   3300: getstatic it0.g : Lrp0;
    //   3303: astore_1
    //   3304: ldc_w 'Ignoring Malformed MediaLiveSeekableRange: '
    //   3307: aload #19
    //   3309: invokevirtual toString : ()Ljava/lang/String;
    //   3312: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   3315: astore #19
    //   3317: aload_1
    //   3318: getfield a : Ljava/lang/String;
    //   3321: aload_1
    //   3322: aload #19
    //   3324: iconst_0
    //   3325: anewarray java/lang/Object
    //   3328: invokevirtual c : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   3331: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   3334: pop
    //   3335: goto -> 3210
    //   3338: aload_0
    //   3339: aload_1
    //   3340: putfield w : Lit0;
    //   3343: goto -> 3366
    //   3346: iload_2
    //   3347: istore #5
    //   3349: aload_0
    //   3350: getfield w : Lit0;
    //   3353: ifnull -> 3361
    //   3356: iload_2
    //   3357: iconst_2
    //   3358: ior
    //   3359: istore #5
    //   3361: aload_0
    //   3362: aconst_null
    //   3363: putfield w : Lit0;
    //   3366: iload #5
    //   3368: ireturn
    //   3369: astore #19
    //   3371: goto -> 139
    //   3374: astore #20
    //   3376: goto -> 2965
    // Exception table:
    //   from	to	target	type
    //   13	29	3369	org/json/JSONException
    //   29	55	3369	org/json/JSONException
    //   58	88	3369	org/json/JSONException
    //   88	125	3369	org/json/JSONException
    //   128	136	3369	org/json/JSONException
    //   1707	1759	1809	org/json/JSONException
    //   1780	1806	1809	org/json/JSONException
    //   1941	1956	2097	org/json/JSONException
    //   2052	2069	2097	org/json/JSONException
    //   2071	2094	2097	org/json/JSONException
    //   2945	2965	3374	org/json/JSONException
    //   3240	3296	3299	org/json/JSONException
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof kw0) {
      boolean bool1;
      boolean bool2;
      kw0 kw01 = (kw0)paramObject;
      if (this.q != null) {
        bool1 = false;
      } else {
        bool1 = true;
      } 
      if (kw01.q != null) {
        bool2 = false;
      } else {
        bool2 = true;
      } 
      if (bool1 == bool2 && this.c == kw01.c && this.e == kw01.e && this.f == kw01.f && this.g == kw01.g && this.h == kw01.h && this.i == kw01.i && this.k == kw01.k && this.l == kw01.l && this.n == kw01.n && this.o == kw01.o && this.r == kw01.r && Arrays.equals(this.m, kw01.m) && qj.c(Long.valueOf(this.j), Long.valueOf(kw01.j)) && qj.c(this.s, kw01.s) && qj.c(this.b, kw01.b)) {
        JSONObject jSONObject = this.q;
        if (jSONObject != null) {
          paramObject = kw01.q;
          if (paramObject != null && !vk0.a(jSONObject, paramObject))
            return false; 
        } 
        if (this.t == kw01.t && qj.c(this.u, kw01.u) && qj.c(this.v, kw01.v) && qj.c(this.w, kw01.w) && z51.g(this.x, kw01.x) && this.y == kw01.y)
          return true; 
      } 
    } 
    return false;
  }
  
  public final void f(List<ut0> paramList) {
    ArrayList<ut0> arrayList = this.s;
    arrayList.clear();
    SparseArray sparseArray = this.z;
    sparseArray.clear();
    if (paramList != null)
      for (byte b = 0; b < paramList.size(); b++) {
        ut0 ut0 = paramList.get(b);
        arrayList.add(ut0);
        sparseArray.put(ut0.c, Integer.valueOf(b));
      }  
  }
  
  public final int hashCode() {
    MediaInfo mediaInfo = this.b;
    long l2 = this.c;
    int j = this.e;
    double d1 = this.f;
    int i = this.g;
    int k = this.h;
    long l3 = this.i;
    long l1 = this.j;
    double d2 = this.k;
    boolean bool1 = this.l;
    int i1 = Arrays.hashCode(this.m);
    int n = this.n;
    int m = this.o;
    String str = String.valueOf(this.q);
    int i2 = this.r;
    boolean bool2 = this.t;
    r2 r21 = this.u;
    f22 f221 = this.v;
    it0 it01 = this.w;
    tt0 tt01 = this.x;
    return Arrays.hashCode(new Object[] { 
          mediaInfo, Long.valueOf(l2), Integer.valueOf(j), Double.valueOf(d1), Integer.valueOf(i), Integer.valueOf(k), Long.valueOf(l3), Long.valueOf(l1), Double.valueOf(d2), Boolean.valueOf(bool1), 
          Integer.valueOf(i1), Integer.valueOf(n), Integer.valueOf(m), str, Integer.valueOf(i2), this.s, Boolean.valueOf(bool2), r21, f221, it01, 
          tt01 });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    String str;
    JSONObject jSONObject = this.q;
    if (jSONObject == null) {
      jSONObject = null;
    } else {
      str = jSONObject.toString();
    } 
    this.p = str;
    int i = qv.D0(paramParcel, 20293);
    qv.u0(paramParcel, 2, (Parcelable)this.b, paramInt);
    long l = this.c;
    qv.C0(paramParcel, 3, 8);
    paramParcel.writeLong(l);
    int k = this.e;
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(k);
    double d = this.f;
    qv.C0(paramParcel, 5, 8);
    paramParcel.writeDouble(d);
    k = this.g;
    qv.C0(paramParcel, 6, 4);
    paramParcel.writeInt(k);
    k = this.h;
    qv.C0(paramParcel, 7, 4);
    paramParcel.writeInt(k);
    l = this.i;
    qv.C0(paramParcel, 8, 8);
    paramParcel.writeLong(l);
    l = this.j;
    qv.C0(paramParcel, 9, 8);
    paramParcel.writeLong(l);
    d = this.k;
    qv.C0(paramParcel, 10, 8);
    paramParcel.writeDouble(d);
    boolean bool2 = this.l;
    qv.C0(paramParcel, 11, 4);
    paramParcel.writeInt(bool2);
    qv.t0(paramParcel, 12, this.m);
    int j = this.n;
    qv.C0(paramParcel, 13, 4);
    paramParcel.writeInt(j);
    j = this.o;
    qv.C0(paramParcel, 14, 4);
    paramParcel.writeInt(j);
    qv.v0(paramParcel, 15, this.p);
    j = this.r;
    qv.C0(paramParcel, 16, 4);
    paramParcel.writeInt(j);
    qv.y0(paramParcel, 17, this.s);
    boolean bool1 = this.t;
    qv.C0(paramParcel, 18, 4);
    paramParcel.writeInt(bool1);
    qv.u0(paramParcel, 19, this.u, paramInt);
    qv.u0(paramParcel, 20, this.v, paramInt);
    qv.u0(paramParcel, 21, this.w, paramInt);
    qv.u0(paramParcel, 22, this.x, paramInt);
    qv.G0(paramParcel, i);
  }
  
  static {
    n21.l("MediaStatus", "The log tag cannot be null or empty.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */