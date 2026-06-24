import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import com.sdsmdg.harjot.crollerTest.TG.ckOPp;
import in.krosbits.utils.SgV.YbNJ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jaudiotagger.audio.dff.vR.CKYHNesT;

public final class jx {
  public final ViewGroup a;
  
  public final ArrayList b;
  
  public final ArrayList c;
  
  public boolean d;
  
  public boolean e;
  
  public boolean f;
  
  public jx(ViewGroup paramViewGroup) {
    this.a = paramViewGroup;
    this.b = new ArrayList();
    this.c = new ArrayList();
  }
  
  public static final jx i(ViewGroup paramViewGroup, lb0 paramlb0) {
    paramViewGroup.getClass();
    paramlb0.getClass();
    paramlb0.K().getClass();
    Object object = paramViewGroup.getTag(2131297520);
    if (object instanceof jx)
      return (jx)object; 
    object = new jx(paramViewGroup);
    paramViewGroup.setTag(2131297520, object);
    return (jx)object;
  }
  
  public static boolean j(ArrayList<Object> paramArrayList) {
    int j = paramArrayList.size();
    int i = 0;
    label31: while (true) {
      byte b = 1;
      while (i < j) {
        go1 go1 = (go1)paramArrayList.get(i);
        int k = i + 1;
        go1 = go1;
        if (!go1.k.isEmpty()) {
          ArrayList<Object> arrayList = go1.k;
          if (arrayList != null && arrayList.isEmpty()) {
            i = k;
            continue label31;
          } 
          int m = arrayList.size();
          b = 0;
          while (true) {
            i = k;
            if (b < m) {
              fo1 fo1 = (fo1)arrayList.get(b);
              b++;
              fo1 = fo1;
              fo1.getClass();
              if (!(fo1 instanceof fx))
                break; 
              continue;
            } 
            continue label31;
          } 
        } 
        b = 0;
        i = k;
      } 
      if (b != 0) {
        ArrayList arrayList = new ArrayList();
        int k = paramArrayList.size();
        i = 0;
        while (i < k) {
          Object object = paramArrayList.get(i);
          i++;
          tm.l0(arrayList, ((go1)object).k);
        } 
        if (!arrayList.isEmpty())
          return true; 
      } 
      return false;
    } 
  }
  
  public final void a(go1 paramgo1) {
    paramgo1.getClass();
    if (paramgo1.i) {
      ga1.a(paramgo1.a, paramgo1.c.v0(), this.a);
      paramgo1.i = false;
    } 
  }
  
  public final void b(ArrayList paramArrayList, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_2
    //   1: invokestatic M : (I)Z
    //   4: ifeq -> 15
    //   7: ldc 'FragmentManager'
    //   9: ldc 'Collecting Effects'
    //   11: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   14: pop
    //   15: aload_1
    //   16: invokevirtual size : ()I
    //   19: istore #5
    //   21: iconst_0
    //   22: istore_3
    //   23: aconst_null
    //   24: astore #8
    //   26: iload_3
    //   27: iload #5
    //   29: if_icmpge -> 151
    //   32: aload_1
    //   33: iload_3
    //   34: invokevirtual get : (I)Ljava/lang/Object;
    //   37: astore #7
    //   39: iload_3
    //   40: iconst_1
    //   41: iadd
    //   42: istore #4
    //   44: aload #7
    //   46: checkcast go1
    //   49: astore #10
    //   51: aload #10
    //   53: getfield c : Lua0;
    //   56: getfield K : Landroid/view/View;
    //   59: astore #9
    //   61: aload #9
    //   63: invokevirtual getClass : ()Ljava/lang/Class;
    //   66: pop
    //   67: aload #9
    //   69: invokevirtual getAlpha : ()F
    //   72: fconst_0
    //   73: fcmpg
    //   74: ifne -> 91
    //   77: aload #9
    //   79: invokevirtual getVisibility : ()I
    //   82: ifne -> 91
    //   85: iload #4
    //   87: istore_3
    //   88: goto -> 23
    //   91: aload #9
    //   93: invokevirtual getVisibility : ()I
    //   96: istore #6
    //   98: iload #6
    //   100: ifeq -> 136
    //   103: iload #4
    //   105: istore_3
    //   106: iload #6
    //   108: iconst_4
    //   109: if_icmpeq -> 23
    //   112: iload #6
    //   114: bipush #8
    //   116: if_icmpne -> 125
    //   119: iload #4
    //   121: istore_3
    //   122: goto -> 23
    //   125: ldc 'Unknown visibility '
    //   127: iload #6
    //   129: invokestatic i : (Ljava/lang/String;I)Ljava/lang/String;
    //   132: invokestatic l : (Ljava/lang/String;)V
    //   135: return
    //   136: iload #4
    //   138: istore_3
    //   139: aload #10
    //   141: getfield a : I
    //   144: iconst_2
    //   145: if_icmpeq -> 23
    //   148: goto -> 154
    //   151: aconst_null
    //   152: astore #7
    //   154: aload #7
    //   156: checkcast go1
    //   159: astore #9
    //   161: aload_1
    //   162: aload_1
    //   163: invokevirtual size : ()I
    //   166: invokevirtual listIterator : (I)Ljava/util/ListIterator;
    //   169: astore #10
    //   171: aload #8
    //   173: astore #7
    //   175: aload #10
    //   177: invokeinterface hasPrevious : ()Z
    //   182: ifeq -> 281
    //   185: aload #10
    //   187: invokeinterface previous : ()Ljava/lang/Object;
    //   192: astore #7
    //   194: aload #7
    //   196: checkcast go1
    //   199: astore #12
    //   201: aload #12
    //   203: getfield c : Lua0;
    //   206: getfield K : Landroid/view/View;
    //   209: astore #11
    //   211: aload #11
    //   213: invokevirtual getClass : ()Ljava/lang/Class;
    //   216: pop
    //   217: aload #11
    //   219: invokevirtual getAlpha : ()F
    //   222: fconst_0
    //   223: fcmpg
    //   224: ifne -> 238
    //   227: aload #11
    //   229: invokevirtual getVisibility : ()I
    //   232: ifne -> 238
    //   235: goto -> 272
    //   238: aload #11
    //   240: invokevirtual getVisibility : ()I
    //   243: istore_3
    //   244: iload_3
    //   245: ifeq -> 171
    //   248: iload_3
    //   249: iconst_4
    //   250: if_icmpeq -> 272
    //   253: iload_3
    //   254: bipush #8
    //   256: if_icmpne -> 262
    //   259: goto -> 272
    //   262: ldc 'Unknown visibility '
    //   264: iload_3
    //   265: invokestatic i : (Ljava/lang/String;I)Ljava/lang/String;
    //   268: invokestatic l : (Ljava/lang/String;)V
    //   271: return
    //   272: aload #12
    //   274: getfield a : I
    //   277: iconst_2
    //   278: if_icmpne -> 171
    //   281: aload #7
    //   283: checkcast go1
    //   286: astore #10
    //   288: iconst_2
    //   289: invokestatic M : (I)Z
    //   292: ifeq -> 342
    //   295: new java/lang/StringBuilder
    //   298: dup
    //   299: getstatic com/google/android/gms/common/api/Gldr/hbrAVtEa.NlbKIFWGGB : Ljava/lang/String;
    //   302: invokespecial <init> : (Ljava/lang/String;)V
    //   305: astore #7
    //   307: aload #7
    //   309: aload #9
    //   311: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   314: pop
    //   315: aload #7
    //   317: ldc ' to '
    //   319: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: aload #7
    //   325: aload #10
    //   327: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   330: pop
    //   331: ldc 'FragmentManager'
    //   333: aload #7
    //   335: invokevirtual toString : ()Ljava/lang/String;
    //   338: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   341: pop
    //   342: new java/util/ArrayList
    //   345: dup
    //   346: invokespecial <init> : ()V
    //   349: astore #7
    //   351: new java/util/ArrayList
    //   354: dup
    //   355: invokespecial <init> : ()V
    //   358: astore #8
    //   360: aload_1
    //   361: invokestatic q0 : (Ljava/util/List;)Ljava/lang/Object;
    //   364: checkcast go1
    //   367: getfield c : Lua0;
    //   370: astore #11
    //   372: aload_1
    //   373: invokevirtual size : ()I
    //   376: istore #4
    //   378: iconst_0
    //   379: istore_3
    //   380: iload_3
    //   381: iload #4
    //   383: if_icmpge -> 459
    //   386: aload_1
    //   387: iload_3
    //   388: invokevirtual get : (I)Ljava/lang/Object;
    //   391: astore #12
    //   393: iinc #3, 1
    //   396: aload #12
    //   398: checkcast go1
    //   401: getfield c : Lua0;
    //   404: getfield N : Lsa0;
    //   407: astore #13
    //   409: aload #11
    //   411: getfield N : Lsa0;
    //   414: astore #12
    //   416: aload #13
    //   418: aload #12
    //   420: getfield b : I
    //   423: putfield b : I
    //   426: aload #13
    //   428: aload #12
    //   430: getfield c : I
    //   433: putfield c : I
    //   436: aload #13
    //   438: aload #12
    //   440: getfield d : I
    //   443: putfield d : I
    //   446: aload #13
    //   448: aload #12
    //   450: getfield e : I
    //   453: putfield e : I
    //   456: goto -> 380
    //   459: aload_1
    //   460: invokevirtual size : ()I
    //   463: istore #6
    //   465: iconst_0
    //   466: istore_3
    //   467: iconst_1
    //   468: istore #5
    //   470: iload_3
    //   471: iload #6
    //   473: if_icmpge -> 705
    //   476: aload_1
    //   477: iload_3
    //   478: invokevirtual get : (I)Ljava/lang/Object;
    //   481: astore #11
    //   483: iload_3
    //   484: iconst_1
    //   485: iadd
    //   486: istore #4
    //   488: aload #11
    //   490: checkcast go1
    //   493: astore #11
    //   495: aload #7
    //   497: new dx
    //   500: dup
    //   501: aload #11
    //   503: iload_2
    //   504: invokespecial <init> : (Lgo1;Z)V
    //   507: invokevirtual add : (Ljava/lang/Object;)Z
    //   510: pop
    //   511: iload_2
    //   512: ifeq -> 533
    //   515: aload #11
    //   517: aload #9
    //   519: if_acmpne -> 528
    //   522: iload #5
    //   524: istore_3
    //   525: goto -> 543
    //   528: iconst_0
    //   529: istore_3
    //   530: goto -> 543
    //   533: aload #11
    //   535: aload #10
    //   537: if_acmpne -> 528
    //   540: iload #5
    //   542: istore_3
    //   543: aload #11
    //   545: getfield c : Lua0;
    //   548: astore #13
    //   550: new hd
    //   553: dup
    //   554: aload #11
    //   556: invokespecial <init> : (Lgo1;)V
    //   559: astore #12
    //   561: aload #11
    //   563: getfield a : I
    //   566: iconst_2
    //   567: if_icmpne -> 593
    //   570: iload_2
    //   571: ifeq -> 584
    //   574: aload #13
    //   576: getfield N : Lsa0;
    //   579: astore #14
    //   581: goto -> 613
    //   584: aload #13
    //   586: invokevirtual getClass : ()Ljava/lang/Class;
    //   589: pop
    //   590: goto -> 613
    //   593: iload_2
    //   594: ifeq -> 607
    //   597: aload #13
    //   599: getfield N : Lsa0;
    //   602: astore #14
    //   604: goto -> 613
    //   607: aload #13
    //   609: invokevirtual getClass : ()Ljava/lang/Class;
    //   612: pop
    //   613: aload #11
    //   615: getfield a : I
    //   618: iconst_2
    //   619: if_icmpne -> 643
    //   622: iload_2
    //   623: ifeq -> 636
    //   626: aload #13
    //   628: getfield N : Lsa0;
    //   631: astore #14
    //   633: goto -> 643
    //   636: aload #13
    //   638: getfield N : Lsa0;
    //   641: astore #14
    //   643: iload_3
    //   644: ifeq -> 667
    //   647: iload_2
    //   648: ifeq -> 661
    //   651: aload #13
    //   653: getfield N : Lsa0;
    //   656: astore #13
    //   658: goto -> 667
    //   661: aload #13
    //   663: invokevirtual getClass : ()Ljava/lang/Class;
    //   666: pop
    //   667: aload #8
    //   669: aload #12
    //   671: invokevirtual add : (Ljava/lang/Object;)Z
    //   674: pop
    //   675: new ax
    //   678: dup
    //   679: aload_0
    //   680: aload #11
    //   682: iconst_0
    //   683: invokespecial <init> : (Ljx;Lgo1;I)V
    //   686: astore #12
    //   688: aload #11
    //   690: getfield d : Ljava/util/ArrayList;
    //   693: aload #12
    //   695: invokevirtual add : (Ljava/lang/Object;)Z
    //   698: pop
    //   699: iload #4
    //   701: istore_3
    //   702: goto -> 467
    //   705: new java/util/ArrayList
    //   708: dup
    //   709: invokespecial <init> : ()V
    //   712: astore_1
    //   713: aload #8
    //   715: invokevirtual size : ()I
    //   718: istore #5
    //   720: iconst_0
    //   721: istore_3
    //   722: iload_3
    //   723: iload #5
    //   725: if_icmpge -> 768
    //   728: aload #8
    //   730: iload_3
    //   731: invokevirtual get : (I)Ljava/lang/Object;
    //   734: astore #9
    //   736: iload_3
    //   737: iconst_1
    //   738: iadd
    //   739: istore #4
    //   741: iload #4
    //   743: istore_3
    //   744: aload #9
    //   746: checkcast ix
    //   749: invokevirtual g : ()Z
    //   752: ifne -> 722
    //   755: aload_1
    //   756: aload #9
    //   758: invokevirtual add : (Ljava/lang/Object;)Z
    //   761: pop
    //   762: iload #4
    //   764: istore_3
    //   765: goto -> 722
    //   768: new java/util/ArrayList
    //   771: dup
    //   772: invokespecial <init> : ()V
    //   775: astore #8
    //   777: aload_1
    //   778: invokevirtual size : ()I
    //   781: istore #4
    //   783: iconst_0
    //   784: istore_3
    //   785: iload_3
    //   786: iload #4
    //   788: if_icmpge -> 813
    //   791: aload_1
    //   792: iload_3
    //   793: invokevirtual get : (I)Ljava/lang/Object;
    //   796: astore #9
    //   798: iinc #3, 1
    //   801: aload #9
    //   803: checkcast ix
    //   806: invokevirtual getClass : ()Ljava/lang/Class;
    //   809: pop
    //   810: goto -> 785
    //   813: aload #8
    //   815: invokevirtual size : ()I
    //   818: istore #4
    //   820: iconst_0
    //   821: istore_3
    //   822: iload_3
    //   823: iload #4
    //   825: if_icmpge -> 849
    //   828: aload #8
    //   830: iload_3
    //   831: invokevirtual get : (I)Ljava/lang/Object;
    //   834: astore_1
    //   835: iinc #3, 1
    //   838: aload_1
    //   839: checkcast ix
    //   842: invokevirtual getClass : ()Ljava/lang/Class;
    //   845: pop
    //   846: goto -> 822
    //   849: new java/util/ArrayList
    //   852: dup
    //   853: invokespecial <init> : ()V
    //   856: astore_1
    //   857: new java/util/ArrayList
    //   860: dup
    //   861: invokespecial <init> : ()V
    //   864: astore #9
    //   866: aload #7
    //   868: invokevirtual size : ()I
    //   871: istore #4
    //   873: iconst_0
    //   874: istore_3
    //   875: iload_3
    //   876: iload #4
    //   878: if_icmpge -> 914
    //   881: aload #7
    //   883: iload_3
    //   884: invokevirtual get : (I)Ljava/lang/Object;
    //   887: astore #8
    //   889: iinc #3, 1
    //   892: aload #9
    //   894: aload #8
    //   896: checkcast dx
    //   899: getfield a : Ljava/lang/Object;
    //   902: checkcast go1
    //   905: getfield k : Ljava/util/ArrayList;
    //   908: invokestatic l0 : (Ljava/util/AbstractList;Ljava/lang/Iterable;)V
    //   911: goto -> 875
    //   914: aload #9
    //   916: invokevirtual isEmpty : ()Z
    //   919: istore_2
    //   920: aload #7
    //   922: invokevirtual size : ()I
    //   925: istore #6
    //   927: iconst_0
    //   928: istore_3
    //   929: iconst_0
    //   930: istore #4
    //   932: iload #4
    //   934: iload #6
    //   936: if_icmpge -> 1155
    //   939: aload #7
    //   941: iload #4
    //   943: invokevirtual get : (I)Ljava/lang/Object;
    //   946: astore #8
    //   948: iload #4
    //   950: iconst_1
    //   951: iadd
    //   952: istore #5
    //   954: aload #8
    //   956: checkcast dx
    //   959: astore #9
    //   961: aload_0
    //   962: getfield a : Landroid/view/ViewGroup;
    //   965: invokevirtual getContext : ()Landroid/content/Context;
    //   968: astore #10
    //   970: aload #9
    //   972: getfield a : Ljava/lang/Object;
    //   975: checkcast go1
    //   978: astore #8
    //   980: aload #10
    //   982: invokevirtual getClass : ()Ljava/lang/Class;
    //   985: pop
    //   986: aload #9
    //   988: aload #10
    //   990: invokevirtual l : (Landroid/content/Context;)Lg7;
    //   993: astore #10
    //   995: aload #10
    //   997: ifnonnull -> 1007
    //   1000: iload #5
    //   1002: istore #4
    //   1004: goto -> 932
    //   1007: aload #10
    //   1009: getfield e : Ljava/lang/Object;
    //   1012: checkcast android/animation/AnimatorSet
    //   1015: ifnonnull -> 1032
    //   1018: aload_1
    //   1019: aload #9
    //   1021: invokevirtual add : (Ljava/lang/Object;)Z
    //   1024: pop
    //   1025: iload #5
    //   1027: istore #4
    //   1029: goto -> 932
    //   1032: aload #8
    //   1034: getfield c : Lua0;
    //   1037: astore #10
    //   1039: aload #8
    //   1041: getfield k : Ljava/util/ArrayList;
    //   1044: invokevirtual isEmpty : ()Z
    //   1047: ifne -> 1106
    //   1050: iload #5
    //   1052: istore #4
    //   1054: iconst_2
    //   1055: invokestatic M : (I)Z
    //   1058: ifeq -> 932
    //   1061: new java/lang/StringBuilder
    //   1064: dup
    //   1065: ldc 'Ignoring Animator set on '
    //   1067: invokespecial <init> : (Ljava/lang/String;)V
    //   1070: astore #8
    //   1072: aload #8
    //   1074: aload #10
    //   1076: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1079: pop
    //   1080: aload #8
    //   1082: ldc ' as this Fragment was involved in a Transition.'
    //   1084: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1087: pop
    //   1088: ldc 'FragmentManager'
    //   1090: aload #8
    //   1092: invokevirtual toString : ()Ljava/lang/String;
    //   1095: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   1098: pop
    //   1099: iload #5
    //   1101: istore #4
    //   1103: goto -> 932
    //   1106: aload #8
    //   1108: getfield a : I
    //   1111: iconst_3
    //   1112: if_icmpne -> 1124
    //   1115: aload #8
    //   1117: iconst_0
    //   1118: putfield i : Z
    //   1121: goto -> 1124
    //   1124: new fx
    //   1127: dup
    //   1128: aload #9
    //   1130: invokespecial <init> : (Ldx;)V
    //   1133: astore #9
    //   1135: aload #8
    //   1137: getfield j : Ljava/util/ArrayList;
    //   1140: aload #9
    //   1142: invokevirtual add : (Ljava/lang/Object;)Z
    //   1145: pop
    //   1146: iconst_1
    //   1147: istore_3
    //   1148: iload #5
    //   1150: istore #4
    //   1152: goto -> 932
    //   1155: aload_1
    //   1156: invokevirtual size : ()I
    //   1159: istore #6
    //   1161: iconst_0
    //   1162: istore #4
    //   1164: iload #4
    //   1166: iload #6
    //   1168: if_icmpge -> 1358
    //   1171: aload_1
    //   1172: iload #4
    //   1174: invokevirtual get : (I)Ljava/lang/Object;
    //   1177: astore #7
    //   1179: iload #4
    //   1181: iconst_1
    //   1182: iadd
    //   1183: istore #5
    //   1185: aload #7
    //   1187: checkcast dx
    //   1190: astore #9
    //   1192: aload #9
    //   1194: getfield a : Ljava/lang/Object;
    //   1197: checkcast go1
    //   1200: astore #8
    //   1202: aload #8
    //   1204: getfield c : Lua0;
    //   1207: astore #7
    //   1209: iload_2
    //   1210: ifne -> 1269
    //   1213: iload #5
    //   1215: istore #4
    //   1217: iconst_2
    //   1218: invokestatic M : (I)Z
    //   1221: ifeq -> 1164
    //   1224: new java/lang/StringBuilder
    //   1227: dup
    //   1228: ldc 'Ignoring Animation set on '
    //   1230: invokespecial <init> : (Ljava/lang/String;)V
    //   1233: astore #8
    //   1235: aload #8
    //   1237: aload #7
    //   1239: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1242: pop
    //   1243: aload #8
    //   1245: ldc ' as Animations cannot run alongside Transitions.'
    //   1247: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1250: pop
    //   1251: ldc 'FragmentManager'
    //   1253: aload #8
    //   1255: invokevirtual toString : ()Ljava/lang/String;
    //   1258: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   1261: pop
    //   1262: iload #5
    //   1264: istore #4
    //   1266: goto -> 1164
    //   1269: iload_3
    //   1270: ifeq -> 1329
    //   1273: iload #5
    //   1275: istore #4
    //   1277: iconst_2
    //   1278: invokestatic M : (I)Z
    //   1281: ifeq -> 1164
    //   1284: new java/lang/StringBuilder
    //   1287: dup
    //   1288: ldc 'Ignoring Animation set on '
    //   1290: invokespecial <init> : (Ljava/lang/String;)V
    //   1293: astore #8
    //   1295: aload #8
    //   1297: aload #7
    //   1299: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1302: pop
    //   1303: aload #8
    //   1305: ldc ' as Animations cannot run alongside Animators.'
    //   1307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1310: pop
    //   1311: ldc 'FragmentManager'
    //   1313: aload #8
    //   1315: invokevirtual toString : ()Ljava/lang/String;
    //   1318: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   1321: pop
    //   1322: iload #5
    //   1324: istore #4
    //   1326: goto -> 1164
    //   1329: new cx
    //   1332: dup
    //   1333: aload #9
    //   1335: invokespecial <init> : (Ldx;)V
    //   1338: astore #7
    //   1340: aload #8
    //   1342: getfield j : Ljava/util/ArrayList;
    //   1345: aload #7
    //   1347: invokevirtual add : (Ljava/lang/Object;)Z
    //   1350: pop
    //   1351: iload #5
    //   1353: istore #4
    //   1355: goto -> 1164
    //   1358: return
  }
  
  public final void c(List<go1> paramList) {
    paramList.getClass();
    ArrayList arrayList = new ArrayList();
    Iterator iterator = paramList.iterator();
    while (iterator.hasNext())
      tm.l0(arrayList, ((go1)iterator.next()).k); 
    List<fo1> list = nm.v0(nm.x0(arrayList));
    int i = list.size();
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++)
      ((fo1)list.get(b)).b(this.a); 
    i = paramList.size();
    for (b = 0; b < i; b++)
      a(paramList.get(b)); 
    list = nm.v0(paramList);
    i = list.size();
    for (b = bool; b < i; b++) {
      go1 go1 = (go1)list.get(b);
      if (go1.k.isEmpty())
        go1.b(); 
    } 
  }
  
  public final void d(int paramInt1, int paramInt2, sb0 paramsb0) {
    ArrayList arrayList = this.b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
    try {
      ua0 ua01 = paramsb0.c;
      ua01.getClass();
      go1 go12 = f(ua01);
      go1 go11 = go12;
      if (go12 == null) {
        ua0 = paramsb0.c;
        if (ua0.p || ua0.o) {
          go1 go13 = g(ua0);
        } else {
          ua0 = null;
        } 
      } 
    } finally {}
    if (ua0 != null) {
      ua0.d(paramInt1, paramInt2);
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
      return;
    } 
    go1 go1 = new go1();
    this(paramInt1, paramInt2, paramsb0);
    ua0 ua0;
    this.b.add(go1);
    ax ax = new ax();
    this(this, go1, 1);
    go1.d.add(ax);
    ax = new ax();
    this(this, go1, 2);
    go1.d.add(ax);
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
  }
  
  public final void e() {
    if (this.f)
      return; 
    if (!this.a.isAttachedToWindow()) {
      h();
      this.e = false;
      return;
    } 
    synchronized (this.b) {
      ArrayList<? extends E> arrayList1 = this.c;
      arrayList1.getClass();
      ArrayList<ArrayList<? extends E>> arrayList = new ArrayList();
      this(arrayList1);
      this.c.clear();
      int j = arrayList.size();
      int i = 0;
      while (true) {
        boolean bool1 = true;
        boolean bool = true;
        if (i < j) {
          arrayList1 = arrayList.get(i);
          i++;
          go1 go1 = (go1)arrayList1;
          if (this.b.isEmpty() || !go1.c.p)
            bool = false; 
          go1.g = bool;
          continue;
        } 
        int k = arrayList.size();
        i = 0;
        while (i < k) {
          arrayList1 = arrayList.get(i);
          j = i + 1;
          go1 go1 = (go1)arrayList1;
          if (this.d) {
            if (lb0.M(2)) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("SpecialEffectsController: Completing non-seekable operation ");
              stringBuilder.append(go1);
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            go1.b();
          } else {
            if (lb0.M(2)) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("SpecialEffectsController: Cancelling operation ");
              stringBuilder.append(go1);
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            go1.a(this.a);
          } 
          this.d = false;
          i = j;
          if (!go1.f) {
            this.c.add(go1);
            i = j;
          } 
        } 
        if (!this.b.isEmpty()) {
          l();
          arrayList1 = this.b;
          arrayList1.getClass();
          arrayList = new ArrayList<ArrayList<? extends E>>();
          this(arrayList1);
          bool = arrayList.isEmpty();
          if (bool)
            return; 
          this.b.clear();
          this.c.addAll(arrayList);
          if (lb0.M(2))
            Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations"); 
          b(arrayList, this.e);
          boolean bool2 = j(arrayList);
          k = arrayList.size();
          i = 0;
          bool = true;
          while (i < k) {
            arrayList1 = arrayList.get(i);
            j = i + 1;
            i = j;
            if (!((go1)arrayList1).c.p) {
              bool = false;
              i = j;
            } 
          } 
          if (!bool || bool2)
            bool1 = false; 
          this.d = bool1;
          if (lb0.M(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(CKYHNesT.fEBy);
            stringBuilder.append(bool2);
            stringBuilder.append(" \ntransition = ");
            stringBuilder.append(bool);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          if (!bool) {
            k(arrayList);
            c(arrayList);
          } else if (bool2) {
            k(arrayList);
            j = arrayList.size();
            for (i = 0; i < j; i++)
              a((go1)arrayList.get(i)); 
          } 
          this.e = false;
          if (lb0.M(2))
            Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations"); 
        } 
        return;
      } 
    } 
  }
  
  public final go1 f(ua0 paramua0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/util/ArrayList;
    //   4: astore #6
    //   6: aload #6
    //   8: invokevirtual size : ()I
    //   11: istore #4
    //   13: iconst_0
    //   14: istore_2
    //   15: iload_2
    //   16: iload #4
    //   18: if_icmpge -> 70
    //   21: aload #6
    //   23: iload_2
    //   24: invokevirtual get : (I)Ljava/lang/Object;
    //   27: astore #5
    //   29: iload_2
    //   30: iconst_1
    //   31: iadd
    //   32: istore_3
    //   33: aload #5
    //   35: checkcast go1
    //   38: astore #7
    //   40: iload_3
    //   41: istore_2
    //   42: aload #7
    //   44: getfield c : Lua0;
    //   47: aload_1
    //   48: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   51: ifeq -> 15
    //   54: iload_3
    //   55: istore_2
    //   56: aload #7
    //   58: getfield e : Z
    //   61: ifne -> 15
    //   64: aload #5
    //   66: astore_1
    //   67: goto -> 72
    //   70: aconst_null
    //   71: astore_1
    //   72: aload_1
    //   73: checkcast go1
    //   76: areturn
  }
  
  public final go1 g(ua0 paramua0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/util/ArrayList;
    //   4: astore #7
    //   6: aload #7
    //   8: invokevirtual size : ()I
    //   11: istore #4
    //   13: iconst_0
    //   14: istore_2
    //   15: iload_2
    //   16: iload #4
    //   18: if_icmpge -> 70
    //   21: aload #7
    //   23: iload_2
    //   24: invokevirtual get : (I)Ljava/lang/Object;
    //   27: astore #5
    //   29: iload_2
    //   30: iconst_1
    //   31: iadd
    //   32: istore_3
    //   33: aload #5
    //   35: checkcast go1
    //   38: astore #6
    //   40: iload_3
    //   41: istore_2
    //   42: aload #6
    //   44: getfield c : Lua0;
    //   47: aload_1
    //   48: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   51: ifeq -> 15
    //   54: iload_3
    //   55: istore_2
    //   56: aload #6
    //   58: getfield e : Z
    //   61: ifne -> 15
    //   64: aload #5
    //   66: astore_1
    //   67: goto -> 72
    //   70: aconst_null
    //   71: astore_1
    //   72: aload_1
    //   73: checkcast go1
    //   76: areturn
  }
  
  public final void h() {
    if (lb0.M(2))
      Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete"); 
    boolean bool1 = this.a.isAttachedToWindow();
    ArrayList arrayList1 = this.b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
    try {
      l();
      k(this.b);
      ArrayList<? extends E> arrayList3 = this.c;
      arrayList3.getClass();
      arrayList2 = new ArrayList();
      this(arrayList3);
      int j = arrayList2.size();
      bool = false;
      byte b1 = 0;
      while (b1 < j) {
        arrayList3 = arrayList2.get(b1);
        b1++;
        ((go1)arrayList3).g = false;
      } 
    } finally {
      Exception exception;
    } 
    int i = arrayList2.size();
    byte b = 0;
    while (b < i) {
      go1 go11 = (go1)arrayList2.get(b);
      b++;
      go1 go12 = go11;
      if (lb0.M(2)) {
        String str;
        if (bool1) {
          str = "";
        } else {
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("Container ");
          stringBuilder1.append(this.a);
          stringBuilder1.append(" is not attached to window. ");
          str = stringBuilder1.toString();
        } 
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(YbNJ.QfmjYd);
        stringBuilder.append(str);
        stringBuilder.append("Cancelling running operation ");
        stringBuilder.append(go12);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      go12.a(this.a);
    } 
    ArrayList<? extends E> arrayList = this.b;
    arrayList.getClass();
    ArrayList<ArrayList<? extends E>> arrayList2 = new ArrayList<ArrayList<? extends E>>();
    this(arrayList);
    boolean bool;
    i = arrayList2.size();
    b = 0;
    while (b < i) {
      arrayList = arrayList2.get(b);
      b++;
      ((go1)arrayList).g = false;
    } 
    i = arrayList2.size();
    b = bool;
    while (b < i) {
      arrayList = arrayList2.get(b);
      b++;
      go1 go1 = (go1)arrayList;
      if (lb0.M(2)) {
        String str;
        if (bool1) {
          str = "";
        } else {
          StringBuilder stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("Container ");
          stringBuilder1.append(this.a);
          stringBuilder1.append(" is not attached to window. ");
          str = stringBuilder1.toString();
        } 
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("SpecialEffectsController: ");
        stringBuilder.append(str);
        stringBuilder.append("Cancelling pending operation ");
        stringBuilder.append(go1);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      go1.a(this.a);
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/ArrayList}, name=null} */
  }
  
  public final void k(List<go1> paramList) {
    int i = paramList.size();
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      go1 go1 = paramList.get(b);
      sb0 sb0 = go1.l;
      if (!go1.h) {
        StringBuilder stringBuilder;
        go1.h = true;
        int j = go1.b;
        String str = ybWnIKHovcRr.GvwHYbzEX;
        if (j == 2) {
          float f1;
          ua0 ua0 = sb0.c;
          ua0.getClass();
          View view2 = ua0.K.findFocus();
          if (view2 != null) {
            (ua0.L()).k = view2;
            if (lb0.M(2)) {
              StringBuilder stringBuilder1 = new StringBuilder("requestFocus: Saved focused view ");
              stringBuilder1.append(view2);
              stringBuilder1.append(" for Fragment ");
              stringBuilder1.append(ua0);
              Log.v(str, stringBuilder1.toString());
            } 
          } 
          View view1 = go1.c.v0();
          if (view1.getParent() == null) {
            if (lb0.M(2)) {
              StringBuilder stringBuilder1 = new StringBuilder("Adding fragment ");
              stringBuilder1.append(ua0);
              stringBuilder1.append(" view ");
              stringBuilder1.append(view1);
              stringBuilder1.append(" to container in onStart");
              Log.v(str, stringBuilder1.toString());
            } 
            sb0.b();
            view1.setAlpha(0.0F);
          } 
          if (view1.getAlpha() == 0.0F && view1.getVisibility() == 0) {
            if (lb0.M(2)) {
              stringBuilder = new StringBuilder("Making view ");
              stringBuilder.append(view1);
              stringBuilder.append(" INVISIBLE in onStart");
              Log.v(str, stringBuilder.toString());
            } 
            view1.setVisibility(4);
          } 
          sa0 sa0 = ua0.N;
          float f2 = 1.0F;
          if (sa0 == null) {
            f1 = 1.0F;
          } else {
            f1 = sa0.j;
          } 
          view1.setAlpha(f1);
          if (lb0.M(2)) {
            stringBuilder = new StringBuilder("Setting view alpha to ");
            sa0 sa01 = ua0.N;
            if (sa01 == null) {
              f1 = f2;
            } else {
              f1 = sa01.j;
            } 
            stringBuilder.append(f1);
            stringBuilder.append(" in onStart");
            Log.v(str, stringBuilder.toString());
          } 
        } else if (j == 3) {
          ua0 ua0 = ((sb0)stringBuilder).c;
          ua0.getClass();
          View view = ua0.v0();
          if (lb0.M(2)) {
            stringBuilder = new StringBuilder("Clearing focus ");
            stringBuilder.append(view.findFocus());
            stringBuilder.append(" on view ");
            stringBuilder.append(view);
            stringBuilder.append(" for Fragment ");
            stringBuilder.append(ua0);
            Log.v(str, stringBuilder.toString());
          } 
          view.clearFocus();
        } 
      } 
    } 
    ArrayList arrayList = new ArrayList();
    Iterator<go1> iterator = paramList.iterator();
    while (iterator.hasNext())
      tm.l0(arrayList, ((go1)iterator.next()).k); 
    List<fo1> list = nm.v0(nm.x0(arrayList));
    i = list.size();
    for (b = bool; b < i; b++) {
      fo1 fo1 = list.get(b);
      fo1.getClass();
      ViewGroup viewGroup = this.a;
      viewGroup.getClass();
      if (!fo1.a)
        fo1.d(viewGroup); 
      fo1.a = true;
    } 
  }
  
  public final void l() {
    ArrayList<Object> arrayList = this.b;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      go1 go1 = (go1)arrayList.get(i);
      int k = i + 1;
      go1 = go1;
      int m = go1.b;
      byte b = 2;
      i = k;
      if (m == 2) {
        m = go1.c.v0().getVisibility();
        i = b;
        if (m != 0) {
          i = 4;
          if (m != 4)
            if (m == 8) {
              i = 3;
            } else {
              l0.l(ga1.i(ckOPp.TepQHa, m));
              return;
            }  
        } 
        go1.d(i, 1);
        i = k;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */