package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f0;
import fu1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kt0;
import l0;
import m12;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2;
import q2;
import qj;
import qv;
import vk0;
import yb2;

public class MediaInfo extends f0 implements ReflectedParcelable {
  public static final Parcelable.Creator<MediaInfo> CREATOR = (Parcelable.Creator<MediaInfo>)new yb2(13);
  
  public final String b;
  
  public final int c;
  
  public final String e;
  
  public final kt0 f;
  
  public final long g;
  
  public final List h;
  
  public final fu1 i;
  
  public String j;
  
  public List k;
  
  public List l;
  
  public final String m;
  
  public final m12 n;
  
  public final long o;
  
  public final String p;
  
  public final String q;
  
  public final String r;
  
  public final String s;
  
  public final JSONObject t;
  
  public MediaInfo(String paramString1, int paramInt, String paramString2, kt0 paramkt0, long paramLong1, List paramList, fu1 paramfu1, String paramString3, ArrayList paramArrayList1, ArrayList paramArrayList2, String paramString4, m12 paramm12, long paramLong2, String paramString5, String paramString6, String paramString7, String paramString8) {
    this.b = paramString1;
    this.c = paramInt;
    this.e = paramString2;
    this.f = paramkt0;
    this.g = paramLong1;
    this.h = paramList;
    this.i = paramfu1;
    this.j = paramString3;
    if (paramString3 != null) {
      try {
        JSONObject jSONObject = new JSONObject();
        this(this.j);
        this.t = jSONObject;
      } catch (JSONException jSONException) {
        this.t = null;
        this.j = null;
      } 
    } else {
      this.t = null;
    } 
    this.k = paramArrayList1;
    this.l = paramArrayList2;
    this.m = paramString4;
    this.n = paramm12;
    this.o = paramLong2;
    this.p = paramString5;
    this.q = paramString6;
    this.r = paramString7;
    this.s = paramString8;
    if (this.b != null || paramString6 != null || paramString4 != null)
      return; 
    l0.l("Either contentID or contentUrl or entity should be set");
    throw null;
  }
  
  public MediaInfo(JSONObject paramJSONObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: ldc 'contentId'
    //   4: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   7: iconst_m1
    //   8: aconst_null
    //   9: aconst_null
    //   10: ldc2_w -1
    //   13: aconst_null
    //   14: aconst_null
    //   15: aconst_null
    //   16: aconst_null
    //   17: aconst_null
    //   18: aconst_null
    //   19: aconst_null
    //   20: ldc2_w -1
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Lkt0;JLjava/util/List;Lfu1;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Lm12;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   30: aload_1
    //   31: ldc 'streamType'
    //   33: ldc 'NONE'
    //   35: invokevirtual optString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   38: astore #14
    //   40: ldc 'NONE'
    //   42: aload #14
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifeq -> 58
    //   50: aload_0
    //   51: iconst_0
    //   52: putfield c : I
    //   55: goto -> 99
    //   58: ldc 'BUFFERED'
    //   60: aload #14
    //   62: invokevirtual equals : (Ljava/lang/Object;)Z
    //   65: ifeq -> 76
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield c : I
    //   73: goto -> 99
    //   76: ldc 'LIVE'
    //   78: aload #14
    //   80: invokevirtual equals : (Ljava/lang/Object;)Z
    //   83: ifeq -> 94
    //   86: aload_0
    //   87: iconst_2
    //   88: putfield c : I
    //   91: goto -> 99
    //   94: aload_0
    //   95: iconst_m1
    //   96: putfield c : I
    //   99: aload_0
    //   100: aload_1
    //   101: ldc 'contentType'
    //   103: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   106: putfield e : Ljava/lang/String;
    //   109: aload_1
    //   110: ldc 'metadata'
    //   112: invokevirtual has : (Ljava/lang/String;)Z
    //   115: ifeq -> 155
    //   118: aload_1
    //   119: ldc 'metadata'
    //   121: invokevirtual getJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   124: astore #15
    //   126: new kt0
    //   129: dup
    //   130: aload #15
    //   132: ldc 'metadataType'
    //   134: invokevirtual getInt : (Ljava/lang/String;)I
    //   137: invokespecial <init> : (I)V
    //   140: astore #14
    //   142: aload_0
    //   143: aload #14
    //   145: putfield f : Lkt0;
    //   148: aload #14
    //   150: aload #15
    //   152: invokevirtual i : (Lorg/json/JSONObject;)V
    //   155: aload_0
    //   156: ldc2_w -1
    //   159: putfield g : J
    //   162: aload_0
    //   163: getfield c : I
    //   166: iconst_2
    //   167: if_icmpeq -> 226
    //   170: aload_1
    //   171: ldc 'duration'
    //   173: invokevirtual has : (Ljava/lang/String;)Z
    //   176: ifeq -> 226
    //   179: aload_1
    //   180: ldc 'duration'
    //   182: invokevirtual isNull : (Ljava/lang/String;)Z
    //   185: ifne -> 226
    //   188: aload_1
    //   189: ldc 'duration'
    //   191: dconst_0
    //   192: invokevirtual optDouble : (Ljava/lang/String;D)D
    //   195: dstore_2
    //   196: dload_2
    //   197: invokestatic isNaN : (D)Z
    //   200: ifne -> 226
    //   203: dload_2
    //   204: invokestatic isInfinite : (D)Z
    //   207: ifne -> 226
    //   210: dload_2
    //   211: dconst_0
    //   212: dcmpl
    //   213: iflt -> 226
    //   216: aload_0
    //   217: dload_2
    //   218: ldc2_w 1000.0
    //   221: dmul
    //   222: d2l
    //   223: putfield g : J
    //   226: aload_1
    //   227: ldc 'tracks'
    //   229: invokevirtual has : (Ljava/lang/String;)Z
    //   232: ifeq -> 679
    //   235: new java/util/ArrayList
    //   238: dup
    //   239: invokespecial <init> : ()V
    //   242: astore #15
    //   244: aload_1
    //   245: ldc 'tracks'
    //   247: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   250: astore #17
    //   252: iconst_0
    //   253: istore #6
    //   255: iload #6
    //   257: aload #17
    //   259: invokevirtual length : ()I
    //   262: if_icmpge -> 663
    //   265: aload #17
    //   267: iload #6
    //   269: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
    //   272: astore #16
    //   274: aload #16
    //   276: ldc 'trackId'
    //   278: invokevirtual getLong : (Ljava/lang/String;)J
    //   281: lstore #12
    //   283: aload #16
    //   285: ldc 'type'
    //   287: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   290: astore #14
    //   292: ldc 'TEXT'
    //   294: aload #14
    //   296: invokevirtual equals : (Ljava/lang/Object;)Z
    //   299: ifeq -> 308
    //   302: iconst_1
    //   303: istore #5
    //   305: goto -> 344
    //   308: ldc 'AUDIO'
    //   310: aload #14
    //   312: invokevirtual equals : (Ljava/lang/Object;)Z
    //   315: ifeq -> 324
    //   318: iconst_2
    //   319: istore #5
    //   321: goto -> 344
    //   324: getstatic androidx/recyclerview/widget/dVrV/jLnXOLx.qBWJyTUCVJObO : Ljava/lang/String;
    //   327: aload #14
    //   329: invokevirtual equals : (Ljava/lang/Object;)Z
    //   332: ifeq -> 341
    //   335: iconst_3
    //   336: istore #5
    //   338: goto -> 344
    //   341: iconst_0
    //   342: istore #5
    //   344: aload #16
    //   346: ldc 'trackContentId'
    //   348: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   351: astore #21
    //   353: aload #16
    //   355: ldc 'trackContentType'
    //   357: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   360: astore #20
    //   362: aload #16
    //   364: ldc 'name'
    //   366: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   369: astore #19
    //   371: aload #16
    //   373: ldc 'language'
    //   375: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   378: astore #18
    //   380: aload #16
    //   382: ldc 'subtype'
    //   384: invokevirtual has : (Ljava/lang/String;)Z
    //   387: ifeq -> 485
    //   390: aload #16
    //   392: ldc 'subtype'
    //   394: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   397: astore #14
    //   399: ldc 'SUBTITLES'
    //   401: aload #14
    //   403: invokevirtual equals : (Ljava/lang/Object;)Z
    //   406: ifeq -> 415
    //   409: iconst_1
    //   410: istore #4
    //   412: goto -> 488
    //   415: ldc 'CAPTIONS'
    //   417: aload #14
    //   419: invokevirtual equals : (Ljava/lang/Object;)Z
    //   422: ifeq -> 431
    //   425: iconst_2
    //   426: istore #4
    //   428: goto -> 488
    //   431: ldc 'DESCRIPTIONS'
    //   433: aload #14
    //   435: invokevirtual equals : (Ljava/lang/Object;)Z
    //   438: ifeq -> 447
    //   441: iconst_3
    //   442: istore #4
    //   444: goto -> 488
    //   447: ldc 'CHAPTERS'
    //   449: aload #14
    //   451: invokevirtual equals : (Ljava/lang/Object;)Z
    //   454: ifeq -> 463
    //   457: iconst_4
    //   458: istore #4
    //   460: goto -> 488
    //   463: ldc 'METADATA'
    //   465: aload #14
    //   467: invokevirtual equals : (Ljava/lang/Object;)Z
    //   470: ifeq -> 479
    //   473: iconst_5
    //   474: istore #4
    //   476: goto -> 488
    //   479: iconst_m1
    //   480: istore #4
    //   482: goto -> 488
    //   485: iconst_0
    //   486: istore #4
    //   488: aload #16
    //   490: ldc 'roles'
    //   492: invokevirtual has : (Ljava/lang/String;)Z
    //   495: ifeq -> 617
    //   498: getstatic im2.f : Lgm2;
    //   501: astore #14
    //   503: iconst_4
    //   504: anewarray java/lang/Object
    //   507: astore #14
    //   509: aload #16
    //   511: ldc 'roles'
    //   513: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   516: astore #22
    //   518: iconst_0
    //   519: istore #7
    //   521: iconst_0
    //   522: istore #8
    //   524: iload #7
    //   526: aload #22
    //   528: invokevirtual length : ()I
    //   531: if_icmpge -> 605
    //   534: aload #22
    //   536: iload #7
    //   538: invokevirtual optString : (I)Ljava/lang/String;
    //   541: astore #23
    //   543: aload #23
    //   545: invokevirtual getClass : ()Ljava/lang/Class;
    //   548: pop
    //   549: aload #14
    //   551: arraylength
    //   552: istore #11
    //   554: iload #8
    //   556: iconst_1
    //   557: iadd
    //   558: istore #9
    //   560: iload #11
    //   562: iload #9
    //   564: invokestatic s0 : (II)I
    //   567: istore #10
    //   569: iload #10
    //   571: iload #11
    //   573: if_icmpgt -> 579
    //   576: goto -> 588
    //   579: aload #14
    //   581: iload #10
    //   583: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   586: astore #14
    //   588: aload #14
    //   590: iload #8
    //   592: aload #23
    //   594: aastore
    //   595: iinc #7, 1
    //   598: iload #9
    //   600: istore #8
    //   602: goto -> 524
    //   605: iload #8
    //   607: aload #14
    //   609: invokestatic h : (I[Ljava/lang/Object;)Lom2;
    //   612: astore #14
    //   614: goto -> 620
    //   617: aconst_null
    //   618: astore #14
    //   620: aload #15
    //   622: new com/google/android/gms/cast/MediaTrack
    //   625: dup
    //   626: lload #12
    //   628: iload #5
    //   630: aload #21
    //   632: aload #20
    //   634: aload #19
    //   636: aload #18
    //   638: iload #4
    //   640: aload #14
    //   642: aload #16
    //   644: ldc_w 'customData'
    //   647: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   650: invokespecial <init> : (JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lorg/json/JSONObject;)V
    //   653: invokevirtual add : (Ljava/lang/Object;)Z
    //   656: pop
    //   657: iinc #6, 1
    //   660: goto -> 255
    //   663: aload_0
    //   664: new java/util/ArrayList
    //   667: dup
    //   668: aload #15
    //   670: invokespecial <init> : (Ljava/util/Collection;)V
    //   673: putfield h : Ljava/util/List;
    //   676: goto -> 684
    //   679: aload_0
    //   680: aconst_null
    //   681: putfield h : Ljava/util/List;
    //   684: aload_1
    //   685: ldc_w 'textTrackStyle'
    //   688: invokevirtual has : (Ljava/lang/String;)Z
    //   691: ifeq -> 1310
    //   694: aload_1
    //   695: ldc_w 'textTrackStyle'
    //   698: invokevirtual getJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   701: astore #14
    //   703: new fu1
    //   706: dup
    //   707: fconst_1
    //   708: iconst_0
    //   709: iconst_0
    //   710: iconst_m1
    //   711: iconst_0
    //   712: iconst_m1
    //   713: iconst_0
    //   714: iconst_0
    //   715: aconst_null
    //   716: iconst_m1
    //   717: iconst_m1
    //   718: aconst_null
    //   719: invokespecial <init> : (FIIIIIIILjava/lang/String;IILjava/lang/String;)V
    //   722: astore #15
    //   724: aload #15
    //   726: aload #14
    //   728: ldc_w 'fontScale'
    //   731: dconst_1
    //   732: invokevirtual optDouble : (Ljava/lang/String;D)D
    //   735: d2f
    //   736: putfield b : F
    //   739: aload #15
    //   741: aload #14
    //   743: ldc_w 'foregroundColor'
    //   746: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   749: invokestatic f : (Ljava/lang/String;)I
    //   752: putfield c : I
    //   755: aload #15
    //   757: aload #14
    //   759: ldc_w 'backgroundColor'
    //   762: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   765: invokestatic f : (Ljava/lang/String;)I
    //   768: putfield e : I
    //   771: aload #14
    //   773: ldc_w 'edgeType'
    //   776: invokevirtual has : (Ljava/lang/String;)Z
    //   779: ifeq -> 886
    //   782: aload #14
    //   784: ldc_w 'edgeType'
    //   787: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   790: astore #16
    //   792: ldc 'NONE'
    //   794: aload #16
    //   796: invokevirtual equals : (Ljava/lang/Object;)Z
    //   799: ifeq -> 811
    //   802: aload #15
    //   804: iconst_0
    //   805: putfield f : I
    //   808: goto -> 886
    //   811: ldc_w 'OUTLINE'
    //   814: aload #16
    //   816: invokevirtual equals : (Ljava/lang/Object;)Z
    //   819: ifeq -> 835
    //   822: iconst_1
    //   823: istore #4
    //   825: aload #15
    //   827: iload #4
    //   829: putfield f : I
    //   832: goto -> 886
    //   835: ldc_w 'DROP_SHADOW'
    //   838: aload #16
    //   840: invokevirtual equals : (Ljava/lang/Object;)Z
    //   843: ifeq -> 852
    //   846: iconst_2
    //   847: istore #4
    //   849: goto -> 825
    //   852: ldc_w 'RAISED'
    //   855: aload #16
    //   857: invokevirtual equals : (Ljava/lang/Object;)Z
    //   860: ifeq -> 869
    //   863: iconst_3
    //   864: istore #4
    //   866: goto -> 825
    //   869: ldc_w 'DEPRESSED'
    //   872: aload #16
    //   874: invokevirtual equals : (Ljava/lang/Object;)Z
    //   877: ifeq -> 886
    //   880: aload #15
    //   882: iconst_4
    //   883: putfield f : I
    //   886: aload #15
    //   888: aload #14
    //   890: ldc_w 'edgeColor'
    //   893: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   896: invokestatic f : (Ljava/lang/String;)I
    //   899: putfield g : I
    //   902: aload #14
    //   904: ldc_w 'windowType'
    //   907: invokevirtual has : (Ljava/lang/String;)Z
    //   910: ifeq -> 939
    //   913: aload #14
    //   915: ldc_w 'windowType'
    //   918: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   921: astore #16
    //   923: ldc 'NONE'
    //   925: aload #16
    //   927: invokevirtual equals : (Ljava/lang/Object;)Z
    //   930: ifeq -> 942
    //   933: aload #15
    //   935: iconst_0
    //   936: putfield h : I
    //   939: goto -> 979
    //   942: ldc_w 'NORMAL'
    //   945: aload #16
    //   947: invokevirtual equals : (Ljava/lang/Object;)Z
    //   950: ifeq -> 962
    //   953: aload #15
    //   955: iconst_1
    //   956: putfield h : I
    //   959: goto -> 939
    //   962: ldc_w 'ROUNDED_CORNERS'
    //   965: aload #16
    //   967: invokevirtual equals : (Ljava/lang/Object;)Z
    //   970: ifeq -> 939
    //   973: aload #15
    //   975: iconst_2
    //   976: putfield h : I
    //   979: aload #15
    //   981: aload #14
    //   983: ldc_w 'windowColor'
    //   986: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   989: invokestatic f : (Ljava/lang/String;)I
    //   992: putfield i : I
    //   995: aload #15
    //   997: getfield h : I
    //   1000: iconst_2
    //   1001: if_icmpne -> 1018
    //   1004: aload #15
    //   1006: aload #14
    //   1008: ldc_w 'windowRoundedCornerRadius'
    //   1011: iconst_0
    //   1012: invokevirtual optInt : (Ljava/lang/String;I)I
    //   1015: putfield j : I
    //   1018: aload #15
    //   1020: aload #14
    //   1022: ldc_w 'fontFamily'
    //   1025: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   1028: putfield k : Ljava/lang/String;
    //   1031: aload #14
    //   1033: ldc_w 'fontGenericFamily'
    //   1036: invokevirtual has : (Ljava/lang/String;)Z
    //   1039: ifeq -> 1189
    //   1042: aload #14
    //   1044: ldc_w 'fontGenericFamily'
    //   1047: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1050: astore #16
    //   1052: ldc_w 'SANS_SERIF'
    //   1055: aload #16
    //   1057: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1060: ifeq -> 1072
    //   1063: aload #15
    //   1065: iconst_0
    //   1066: putfield l : I
    //   1069: goto -> 1189
    //   1072: ldc_w 'MONOSPACED_SANS_SERIF'
    //   1075: aload #16
    //   1077: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1080: ifeq -> 1096
    //   1083: iconst_1
    //   1084: istore #4
    //   1086: aload #15
    //   1088: iload #4
    //   1090: putfield l : I
    //   1093: goto -> 1189
    //   1096: ldc_w 'SERIF'
    //   1099: aload #16
    //   1101: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1104: ifeq -> 1113
    //   1107: iconst_2
    //   1108: istore #4
    //   1110: goto -> 1086
    //   1113: ldc_w 'MONOSPACED_SERIF'
    //   1116: aload #16
    //   1118: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1121: ifeq -> 1130
    //   1124: iconst_3
    //   1125: istore #4
    //   1127: goto -> 1086
    //   1130: ldc_w 'CASUAL'
    //   1133: aload #16
    //   1135: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1138: ifeq -> 1154
    //   1141: iconst_4
    //   1142: istore #4
    //   1144: aload #15
    //   1146: iload #4
    //   1148: putfield l : I
    //   1151: goto -> 1189
    //   1154: ldc_w 'CURSIVE'
    //   1157: aload #16
    //   1159: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1162: ifeq -> 1171
    //   1165: iconst_5
    //   1166: istore #4
    //   1168: goto -> 1144
    //   1171: ldc_w 'SMALL_CAPITALS'
    //   1174: aload #16
    //   1176: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1179: ifeq -> 1189
    //   1182: aload #15
    //   1184: bipush #6
    //   1186: putfield l : I
    //   1189: aload #14
    //   1191: ldc_w 'fontStyle'
    //   1194: invokevirtual has : (Ljava/lang/String;)Z
    //   1197: ifeq -> 1288
    //   1200: aload #14
    //   1202: ldc_w 'fontStyle'
    //   1205: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1208: astore #16
    //   1210: ldc_w 'NORMAL'
    //   1213: aload #16
    //   1215: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1218: ifeq -> 1230
    //   1221: aload #15
    //   1223: iconst_0
    //   1224: putfield m : I
    //   1227: goto -> 1288
    //   1230: ldc_w 'BOLD'
    //   1233: aload #16
    //   1235: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1238: ifeq -> 1254
    //   1241: iconst_1
    //   1242: istore #4
    //   1244: aload #15
    //   1246: iload #4
    //   1248: putfield m : I
    //   1251: goto -> 1288
    //   1254: ldc_w 'ITALIC'
    //   1257: aload #16
    //   1259: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1262: ifeq -> 1271
    //   1265: iconst_2
    //   1266: istore #4
    //   1268: goto -> 1244
    //   1271: ldc_w 'BOLD_ITALIC'
    //   1274: aload #16
    //   1276: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1279: ifeq -> 1288
    //   1282: iconst_3
    //   1283: istore #4
    //   1285: goto -> 1244
    //   1288: aload #15
    //   1290: aload #14
    //   1292: ldc_w 'customData'
    //   1295: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   1298: putfield o : Lorg/json/JSONObject;
    //   1301: aload_0
    //   1302: aload #15
    //   1304: putfield i : Lfu1;
    //   1307: goto -> 1315
    //   1310: aload_0
    //   1311: aconst_null
    //   1312: putfield i : Lfu1;
    //   1315: aload_0
    //   1316: aload_1
    //   1317: invokevirtual e : (Lorg/json/JSONObject;)V
    //   1320: aload_0
    //   1321: aload_1
    //   1322: ldc_w 'customData'
    //   1325: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   1328: putfield t : Lorg/json/JSONObject;
    //   1331: aload_0
    //   1332: aload_1
    //   1333: ldc_w 'entity'
    //   1336: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   1339: putfield m : Ljava/lang/String;
    //   1342: aload_0
    //   1343: aload_1
    //   1344: ldc_w 'atvEntity'
    //   1347: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   1350: putfield p : Ljava/lang/String;
    //   1353: aload_1
    //   1354: ldc_w 'vmapAdsRequest'
    //   1357: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   1360: astore #14
    //   1362: aload #14
    //   1364: ifnonnull -> 1373
    //   1367: aconst_null
    //   1368: astore #14
    //   1370: goto -> 1398
    //   1373: new m12
    //   1376: dup
    //   1377: aload #14
    //   1379: ldc_w 'adTagUrl'
    //   1382: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   1385: aload #14
    //   1387: ldc_w 'adsResponse'
    //   1390: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   1393: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   1396: astore #14
    //   1398: aload_0
    //   1399: aload #14
    //   1401: putfield n : Lm12;
    //   1404: aload_1
    //   1405: ldc_w 'startAbsoluteTime'
    //   1408: invokevirtual has : (Ljava/lang/String;)Z
    //   1411: ifeq -> 1462
    //   1414: aload_1
    //   1415: ldc_w 'startAbsoluteTime'
    //   1418: invokevirtual isNull : (Ljava/lang/String;)Z
    //   1421: ifne -> 1462
    //   1424: aload_1
    //   1425: ldc_w 'startAbsoluteTime'
    //   1428: invokevirtual optDouble : (Ljava/lang/String;)D
    //   1431: dstore_2
    //   1432: dload_2
    //   1433: invokestatic isNaN : (D)Z
    //   1436: ifne -> 1462
    //   1439: dload_2
    //   1440: invokestatic isInfinite : (D)Z
    //   1443: ifne -> 1462
    //   1446: dload_2
    //   1447: dconst_0
    //   1448: dcmpl
    //   1449: iflt -> 1462
    //   1452: aload_0
    //   1453: dload_2
    //   1454: ldc2_w 1000.0
    //   1457: dmul
    //   1458: d2l
    //   1459: putfield o : J
    //   1462: aload_1
    //   1463: ldc_w 'contentUrl'
    //   1466: invokevirtual has : (Ljava/lang/String;)Z
    //   1469: ifeq -> 1483
    //   1472: aload_0
    //   1473: aload_1
    //   1474: ldc_w 'contentUrl'
    //   1477: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   1480: putfield q : Ljava/lang/String;
    //   1483: aload_0
    //   1484: aload_1
    //   1485: ldc_w 'hlsSegmentFormat'
    //   1488: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   1491: putfield r : Ljava/lang/String;
    //   1494: aload_0
    //   1495: aload_1
    //   1496: ldc_w 'hlsVideoSegmentFormat'
    //   1499: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   1502: putfield s : Ljava/lang/String;
    //   1505: return
  }
  
  public final void e(JSONObject paramJSONObject) {
    // Byte code:
    //   0: getstatic com/google/android/gms/common/internal/Qg/jHxlGgUTadw.FsuQN : Ljava/lang/String;
    //   3: astore #12
    //   5: aload_1
    //   6: aload #12
    //   8: invokevirtual has : (Ljava/lang/String;)Z
    //   11: istore #11
    //   13: ldc2_w 1000
    //   16: lstore #5
    //   18: iconst_0
    //   19: istore #4
    //   21: iload #11
    //   23: ifeq -> 359
    //   26: aload_1
    //   27: aload #12
    //   29: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   32: astore #14
    //   34: new java/util/ArrayList
    //   37: dup
    //   38: aload #14
    //   40: invokevirtual length : ()I
    //   43: invokespecial <init> : (I)V
    //   46: astore #15
    //   48: iconst_0
    //   49: istore_2
    //   50: iload_2
    //   51: aload #14
    //   53: invokevirtual length : ()I
    //   56: if_icmpge -> 343
    //   59: aload #14
    //   61: iload_2
    //   62: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
    //   65: astore #17
    //   67: aload #17
    //   69: ifnonnull -> 78
    //   72: aconst_null
    //   73: astore #12
    //   75: goto -> 316
    //   78: aload #17
    //   80: ldc_w 'id'
    //   83: invokevirtual has : (Ljava/lang/String;)Z
    //   86: ifeq -> 72
    //   89: aload #17
    //   91: ldc_w 'position'
    //   94: invokevirtual has : (Ljava/lang/String;)Z
    //   97: ifne -> 103
    //   100: goto -> 72
    //   103: aload #17
    //   105: ldc_w 'id'
    //   108: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   111: astore #16
    //   113: aload #17
    //   115: ldc_w 'position'
    //   118: invokevirtual getLong : (Ljava/lang/String;)J
    //   121: lstore #9
    //   123: getstatic qj.a : Ljava/util/regex/Pattern;
    //   126: astore #12
    //   128: aload #17
    //   130: ldc_w 'isWatched'
    //   133: invokevirtual optBoolean : (Ljava/lang/String;)Z
    //   136: istore #11
    //   138: aload #17
    //   140: ldc 'duration'
    //   142: invokevirtual optLong : (Ljava/lang/String;)J
    //   145: lstore #7
    //   147: aload #17
    //   149: getstatic com/google/android/gms/common/util/DyJ/oXrNDUqUkE.nnsVtsyJkAn : Ljava/lang/String;
    //   152: invokevirtual optJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   155: astore #18
    //   157: iconst_0
    //   158: anewarray java/lang/String
    //   161: astore #12
    //   163: aload #18
    //   165: ifnull -> 222
    //   168: aload #18
    //   170: invokevirtual length : ()I
    //   173: anewarray java/lang/String
    //   176: astore #13
    //   178: iconst_0
    //   179: istore_3
    //   180: aload #13
    //   182: astore #12
    //   184: iload_3
    //   185: aload #18
    //   187: invokevirtual length : ()I
    //   190: if_icmpge -> 214
    //   193: aload #13
    //   195: iload_3
    //   196: aload #18
    //   198: iload_3
    //   199: invokevirtual getString : (I)Ljava/lang/String;
    //   202: aastore
    //   203: iinc #3, 1
    //   206: goto -> 180
    //   209: astore #12
    //   211: goto -> 269
    //   214: goto -> 225
    //   217: astore #12
    //   219: goto -> 269
    //   222: goto -> 214
    //   225: new q2
    //   228: dup
    //   229: lload #9
    //   231: lload #5
    //   233: lmul
    //   234: aload #16
    //   236: lload #7
    //   238: lload #5
    //   240: lmul
    //   241: iload #11
    //   243: aload #12
    //   245: aload #17
    //   247: ldc_w 'isEmbedded'
    //   250: invokevirtual optBoolean : (Ljava/lang/String;)Z
    //   253: aload #17
    //   255: ldc_w 'expanded'
    //   258: invokevirtual optBoolean : (Ljava/lang/String;)Z
    //   261: invokespecial <init> : (JLjava/lang/String;JZ[Ljava/lang/String;ZZ)V
    //   264: astore #12
    //   266: goto -> 316
    //   269: aload #12
    //   271: invokevirtual getMessage : ()Ljava/lang/String;
    //   274: astore #12
    //   276: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   279: astore #13
    //   281: new java/lang/StringBuilder
    //   284: dup
    //   285: ldc_w 'Error while creating an AdBreakInfo from JSON: '
    //   288: invokespecial <init> : (Ljava/lang/String;)V
    //   291: astore #13
    //   293: aload #13
    //   295: aload #12
    //   297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: pop
    //   301: ldc_w 'AdBreakInfo'
    //   304: aload #13
    //   306: invokevirtual toString : ()Ljava/lang/String;
    //   309: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   312: pop
    //   313: goto -> 72
    //   316: aload #12
    //   318: ifnull -> 335
    //   321: aload #15
    //   323: aload #12
    //   325: invokevirtual add : (Ljava/lang/Object;)Z
    //   328: pop
    //   329: iinc #2, 1
    //   332: goto -> 50
    //   335: aload #15
    //   337: invokevirtual clear : ()V
    //   340: goto -> 343
    //   343: aload_0
    //   344: new java/util/ArrayList
    //   347: dup
    //   348: aload #15
    //   350: invokespecial <init> : (Ljava/util/Collection;)V
    //   353: putfield k : Ljava/util/List;
    //   356: goto -> 364
    //   359: ldc2_w 1000
    //   362: lstore #5
    //   364: aload_1
    //   365: ldc_w 'breakClips'
    //   368: invokevirtual has : (Ljava/lang/String;)Z
    //   371: ifeq -> 792
    //   374: aload_1
    //   375: ldc_w 'breakClips'
    //   378: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   381: astore #15
    //   383: new java/util/ArrayList
    //   386: dup
    //   387: aload #15
    //   389: invokevirtual length : ()I
    //   392: invokespecial <init> : (I)V
    //   395: astore #14
    //   397: iload #4
    //   399: istore_2
    //   400: iload_2
    //   401: aload #15
    //   403: invokevirtual length : ()I
    //   406: if_icmpge -> 779
    //   409: aload #15
    //   411: iload_2
    //   412: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
    //   415: astore #23
    //   417: aload #23
    //   419: ifnonnull -> 427
    //   422: aconst_null
    //   423: astore_1
    //   424: goto -> 757
    //   427: aload #23
    //   429: ldc_w 'id'
    //   432: invokevirtual has : (Ljava/lang/String;)Z
    //   435: ifne -> 441
    //   438: goto -> 422
    //   441: aload #23
    //   443: ldc_w 'id'
    //   446: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   449: astore #18
    //   451: aload #23
    //   453: ldc 'duration'
    //   455: invokevirtual optLong : (Ljava/lang/String;)J
    //   458: lstore #9
    //   460: aload #23
    //   462: ldc_w 'clickThroughUrl'
    //   465: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   468: astore #17
    //   470: aload #23
    //   472: ldc_w 'contentUrl'
    //   475: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   478: astore #16
    //   480: aload #23
    //   482: ldc_w 'mimeType'
    //   485: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   488: astore #12
    //   490: aload #12
    //   492: astore_1
    //   493: aload #12
    //   495: ifnonnull -> 506
    //   498: aload #23
    //   500: ldc 'contentType'
    //   502: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   505: astore_1
    //   506: goto -> 513
    //   509: astore_1
    //   510: goto -> 713
    //   513: aload #23
    //   515: ldc_w 'title'
    //   518: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   521: astore #22
    //   523: aload #23
    //   525: ldc_w 'customData'
    //   528: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   531: astore #13
    //   533: aload #23
    //   535: ldc 'contentId'
    //   537: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   540: astore #20
    //   542: aload #23
    //   544: ldc_w 'posterUrl'
    //   547: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   550: astore #19
    //   552: aload #23
    //   554: ldc_w 'whenSkippable'
    //   557: invokevirtual has : (Ljava/lang/String;)Z
    //   560: ifeq -> 586
    //   563: aload #23
    //   565: ldc_w 'whenSkippable'
    //   568: invokevirtual get : (Ljava/lang/String;)Ljava/lang/Object;
    //   571: checkcast java/lang/Integer
    //   574: invokevirtual intValue : ()I
    //   577: i2l
    //   578: lload #5
    //   580: lmul
    //   581: lstore #7
    //   583: goto -> 594
    //   586: ldc2_w -1
    //   589: lstore #7
    //   591: goto -> 583
    //   594: aload #23
    //   596: ldc_w 'hlsSegmentFormat'
    //   599: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   602: astore #21
    //   604: aload #23
    //   606: ldc_w 'vastAdsRequest'
    //   609: invokevirtual optJSONObject : (Ljava/lang/String;)Lorg/json/JSONObject;
    //   612: astore #12
    //   614: aload #12
    //   616: ifnonnull -> 625
    //   619: aconst_null
    //   620: astore #12
    //   622: goto -> 650
    //   625: new m12
    //   628: dup
    //   629: aload #12
    //   631: ldc_w 'adTagUrl'
    //   634: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   637: aload #12
    //   639: ldc_w 'adsResponse'
    //   642: invokestatic a : (Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   645: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   648: astore #12
    //   650: aload #13
    //   652: ifnull -> 663
    //   655: aload #13
    //   657: invokevirtual length : ()I
    //   660: ifne -> 669
    //   663: aconst_null
    //   664: astore #13
    //   666: goto -> 676
    //   669: aload #13
    //   671: invokevirtual toString : ()Ljava/lang/String;
    //   674: astore #13
    //   676: new p2
    //   679: dup
    //   680: aload #18
    //   682: aload #22
    //   684: lload #9
    //   686: lload #5
    //   688: lmul
    //   689: aload #16
    //   691: aload_1
    //   692: aload #17
    //   694: aload #13
    //   696: aload #20
    //   698: aload #19
    //   700: lload #7
    //   702: aload #21
    //   704: aload #12
    //   706: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lm12;)V
    //   709: astore_1
    //   710: goto -> 757
    //   713: aload_1
    //   714: invokevirtual getMessage : ()Ljava/lang/String;
    //   717: astore_1
    //   718: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   721: astore #12
    //   723: new java/lang/StringBuilder
    //   726: dup
    //   727: ldc_w 'Error while creating an AdBreakClipInfo from JSON: '
    //   730: invokespecial <init> : (Ljava/lang/String;)V
    //   733: astore #12
    //   735: aload #12
    //   737: aload_1
    //   738: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   741: pop
    //   742: ldc_w 'AdBreakClipInfo'
    //   745: aload #12
    //   747: invokevirtual toString : ()Ljava/lang/String;
    //   750: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   753: pop
    //   754: goto -> 422
    //   757: aload_1
    //   758: ifnull -> 774
    //   761: aload #14
    //   763: aload_1
    //   764: invokevirtual add : (Ljava/lang/Object;)Z
    //   767: pop
    //   768: iinc #2, 1
    //   771: goto -> 400
    //   774: aload #14
    //   776: invokevirtual clear : ()V
    //   779: aload_0
    //   780: new java/util/ArrayList
    //   783: dup
    //   784: aload #14
    //   786: invokespecial <init> : (Ljava/util/Collection;)V
    //   789: putfield l : Ljava/util/List;
    //   792: return
    // Exception table:
    //   from	to	target	type
    //   103	163	217	org/json/JSONException
    //   168	178	217	org/json/JSONException
    //   184	203	209	org/json/JSONException
    //   225	266	209	org/json/JSONException
    //   441	490	509	org/json/JSONException
    //   498	506	509	org/json/JSONException
    //   513	583	509	org/json/JSONException
    //   594	614	509	org/json/JSONException
    //   625	650	509	org/json/JSONException
    //   655	663	509	org/json/JSONException
    //   669	676	509	org/json/JSONException
    //   676	710	509	org/json/JSONException
  }
  
  public final boolean equals(Object paramObject) {
    boolean bool1;
    boolean bool2;
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof MediaInfo))
      return false; 
    paramObject = paramObject;
    JSONObject jSONObject1 = this.t;
    if (jSONObject1 != null) {
      bool1 = false;
    } else {
      bool1 = true;
    } 
    JSONObject jSONObject2 = ((MediaInfo)paramObject).t;
    if (jSONObject2 != null) {
      bool2 = false;
    } else {
      bool2 = true;
    } 
    return (bool1 != bool2) ? false : ((jSONObject1 != null && jSONObject2 != null && !vk0.a(jSONObject1, jSONObject2)) ? false : ((qj.c(this.b, ((MediaInfo)paramObject).b) && this.c == ((MediaInfo)paramObject).c && qj.c(this.e, ((MediaInfo)paramObject).e) && qj.c(this.f, ((MediaInfo)paramObject).f) && this.g == ((MediaInfo)paramObject).g && qj.c(this.h, ((MediaInfo)paramObject).h) && qj.c(this.i, ((MediaInfo)paramObject).i) && qj.c(this.k, ((MediaInfo)paramObject).k) && qj.c(this.l, ((MediaInfo)paramObject).l) && qj.c(this.m, ((MediaInfo)paramObject).m) && qj.c(this.n, ((MediaInfo)paramObject).n) && this.o == ((MediaInfo)paramObject).o && qj.c(this.p, ((MediaInfo)paramObject).p) && qj.c(this.q, ((MediaInfo)paramObject).q) && qj.c(this.r, ((MediaInfo)paramObject).r) && qj.c(this.s, ((MediaInfo)paramObject).s))));
  }
  
  public final JSONObject f() {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("contentId", this.b);
      jSONObject.putOpt("contentUrl", this.q);
      int i = this.c;
      if (i != 1) {
        if (i != 2) {
          str3 = "NONE";
        } else {
          str3 = "LIVE";
        } 
      } else {
        str3 = "BUFFERED";
      } 
      jSONObject.put(xveccWbRzqx.xWLSokrHzKHT, str3);
      String str3 = this.e;
      if (str3 != null)
        jSONObject.put("contentType", str3); 
      kt0 kt01 = this.f;
      if (kt01 != null)
        jSONObject.put("metadata", kt01.f()); 
      long l = this.g;
      if (l <= -1L) {
        jSONObject.put("duration", JSONObject.NULL);
      } else {
        Pattern pattern = qj.a;
        jSONObject.put("duration", l / 1000.0D);
      } 
      List list = this.h;
      if (list != null) {
        JSONArray jSONArray = new JSONArray();
        this();
        Iterator<MediaTrack> iterator = list.iterator();
        while (iterator.hasNext())
          jSONArray.put(((MediaTrack)iterator.next()).e()); 
        jSONObject.put("tracks", jSONArray);
      } 
      fu1 fu11 = this.i;
      if (fu11 != null)
        jSONObject.put("textTrackStyle", fu11.e()); 
      JSONObject jSONObject1 = this.t;
      if (jSONObject1 != null)
        jSONObject.put("customData", jSONObject1); 
      String str2 = this.m;
      if (str2 != null)
        jSONObject.put("entity", str2); 
      if (this.k != null) {
        JSONArray jSONArray = new JSONArray();
        this();
        Iterator<q2> iterator = this.k.iterator();
        while (iterator.hasNext())
          jSONArray.put(((q2)iterator.next()).e()); 
        jSONObject.put("breaks", jSONArray);
      } 
      if (this.l != null) {
        JSONArray jSONArray = new JSONArray();
        this();
        Iterator<p2> iterator = this.l.iterator();
        while (iterator.hasNext())
          jSONArray.put(((p2)iterator.next()).e()); 
        jSONObject.put("breakClips", jSONArray);
      } 
      m12 m121 = this.n;
      if (m121 != null)
        jSONObject.put("vmapAdsRequest", m121.e()); 
      l = this.o;
      if (l != -1L) {
        Pattern pattern = qj.a;
        jSONObject.put("startAbsoluteTime", l / 1000.0D);
      } 
      jSONObject.putOpt("atvEntity", this.p);
      String str1 = this.r;
      if (str1 != null)
        jSONObject.put("hlsSegmentFormat", str1); 
      str1 = this.s;
      if (str1 != null)
        jSONObject.put("hlsVideoSegmentFormat", str1); 
    } catch (JSONException jSONException) {}
    return jSONObject;
  }
  
  public final int hashCode() {
    int i = this.c;
    long l1 = this.g;
    String str2 = String.valueOf(this.t);
    List list2 = this.k;
    List list1 = this.l;
    long l2 = this.o;
    String str3 = this.r;
    String str1 = this.s;
    return Arrays.hashCode(new Object[] { 
          this.b, Integer.valueOf(i), this.e, this.f, Long.valueOf(l1), str2, this.h, this.i, list2, list1, 
          this.m, this.n, Long.valueOf(l2), this.p, str3, str1 });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    List list1 = null;
    JSONObject jSONObject = this.t;
    if (jSONObject == null) {
      jSONObject = null;
    } else {
      str1 = jSONObject.toString();
    } 
    this.j = str1;
    int i = qv.D0(paramParcel, 20293);
    String str2 = this.b;
    String str1 = str2;
    if (str2 == null)
      str1 = ""; 
    qv.v0(paramParcel, 2, str1);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.c);
    qv.v0(paramParcel, 4, this.e);
    qv.u0(paramParcel, 5, (Parcelable)this.f, paramInt);
    qv.C0(paramParcel, 6, 8);
    paramParcel.writeLong(this.g);
    qv.y0(paramParcel, 7, this.h);
    qv.u0(paramParcel, 8, (Parcelable)this.i, paramInt);
    qv.v0(paramParcel, 9, this.j);
    List<?> list = this.k;
    if (list == null) {
      list = null;
    } else {
      list = Collections.unmodifiableList(list);
    } 
    qv.y0(paramParcel, 10, list);
    list = this.l;
    if (list == null) {
      list = list1;
    } else {
      list = Collections.unmodifiableList(list);
    } 
    qv.y0(paramParcel, 11, list);
    qv.v0(paramParcel, 12, this.m);
    qv.u0(paramParcel, 13, (Parcelable)this.n, paramInt);
    qv.C0(paramParcel, 14, 8);
    paramParcel.writeLong(this.o);
    qv.v0(paramParcel, 15, this.p);
    qv.v0(paramParcel, 16, this.q);
    qv.v0(paramParcel, 17, this.r);
    qv.v0(paramParcel, 18, this.s);
    qv.G0(paramParcel, i);
  }
  
  static {
    Pattern pattern = qj.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\cast\MediaInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */