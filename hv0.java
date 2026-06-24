import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;

public class hv0 {
  public final gv0 a;
  
  public final String b;
  
  public final String c;
  
  public String d;
  
  public String e;
  
  public Uri f;
  
  public boolean g;
  
  public final boolean h;
  
  public int i;
  
  public boolean j;
  
  public final ArrayList k = new ArrayList();
  
  public int l;
  
  public int m;
  
  public int n;
  
  public int o;
  
  public int p;
  
  public int q;
  
  public Display r;
  
  public int s = -1;
  
  public Bundle t;
  
  public IntentSender u;
  
  public su0 v;
  
  public ArrayList w = new ArrayList();
  
  public hv0(gv0 paramgv0, String paramString1, String paramString2, boolean paramBoolean) {
    this.a = paramgv0;
    this.b = paramString1;
    this.c = paramString2;
    this.h = paramBoolean;
  }
  
  public final fv0 a() {
    return (this instanceof fv0) ? (fv0)this : null;
  }
  
  public final Display b() {
    iv0.b();
    if (this.s >= 0 && this.r == null) {
      ee0 ee0 = iv0.c();
      int i = this.s;
      if (ee0.u == null)
        ee0.u = new bu(ee0.h); 
      this.r = ((DisplayManager)ee0.u.b.getSystemService("display")).getDisplay(i);
    } 
    return this.r;
  }
  
  public final zu0 c() {
    gv0 gv01 = this.a;
    gv01.getClass();
    iv0.b();
    return gv01.a;
  }
  
  public final boolean d() {
    iv0.b();
    hv0 hv01 = (iv0.c()).x;
    if (hv01 != null)
      return (hv01 == this || this.n == 3 || (TextUtils.equals(((ComponentName)(c()).c.c).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO"))); 
    tp.f("There is no default route.  The media router has not yet been fully initialized.");
    return false;
  }
  
  public final boolean e() {
    return this.w.isEmpty() ^ true;
  }
  
  public final boolean f() {
    return (this.v != null && this.g);
  }
  
  public final boolean g() {
    iv0.b();
    return (iv0.c().g() == this);
  }
  
  public final boolean h(cv0 paramcv0) {
    if (paramcv0 != null) {
      iv0.b();
      ArrayList<Object> arrayList = this.k;
      if (arrayList != null) {
        paramcv0.a();
        if (!paramcv0.b.isEmpty()) {
          int j = arrayList.size();
          int i = 0;
          label23: while (i < j) {
            IntentFilter intentFilter = (IntentFilter)arrayList.get(i);
            int k = i + 1;
            intentFilter = intentFilter;
            if (intentFilter == null) {
              i = k;
              continue;
            } 
            Iterator<String> iterator = paramcv0.b.iterator();
            while (true) {
              i = k;
              if (iterator.hasNext()) {
                if (intentFilter.hasCategory(iterator.next()))
                  return true; 
                continue;
              } 
              continue label23;
            } 
          } 
        } 
      } 
      return false;
    } 
    l0.l("selector must not be null");
    return false;
  }
  
  public final int i(su0 paramsu0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield v : Lsu0;
    //   4: astore #9
    //   6: iconst_0
    //   7: istore #7
    //   9: aload #9
    //   11: aload_1
    //   12: if_acmpeq -> 1113
    //   15: aload_0
    //   16: aload_1
    //   17: putfield v : Lsu0;
    //   20: aload_1
    //   21: ifnull -> 1113
    //   24: aload_1
    //   25: getfield a : Landroid/os/Bundle;
    //   28: astore #10
    //   30: aload_0
    //   31: getfield d : Ljava/lang/String;
    //   34: aload #10
    //   36: ldc 'name'
    //   38: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   41: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   44: ifne -> 63
    //   47: aload_0
    //   48: aload #10
    //   50: ldc 'name'
    //   52: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   55: putfield d : Ljava/lang/String;
    //   58: iconst_1
    //   59: istore_2
    //   60: goto -> 65
    //   63: iconst_0
    //   64: istore_2
    //   65: aload_0
    //   66: getfield e : Ljava/lang/String;
    //   69: aload #10
    //   71: ldc 'status'
    //   73: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   76: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   79: ifne -> 95
    //   82: aload_0
    //   83: aload #10
    //   85: ldc 'status'
    //   87: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   90: putfield e : Ljava/lang/String;
    //   93: iconst_1
    //   94: istore_2
    //   95: aload_0
    //   96: getfield f : Landroid/net/Uri;
    //   99: astore #11
    //   101: aload #10
    //   103: ldc 'iconUri'
    //   105: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   108: astore #9
    //   110: aload #9
    //   112: ifnonnull -> 121
    //   115: aconst_null
    //   116: astore #9
    //   118: goto -> 128
    //   121: aload #9
    //   123: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   126: astore #9
    //   128: aload #11
    //   130: aload #9
    //   132: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   135: ifne -> 173
    //   138: aload #10
    //   140: ldc 'iconUri'
    //   142: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   145: astore #9
    //   147: aload #9
    //   149: ifnonnull -> 158
    //   152: aconst_null
    //   153: astore #9
    //   155: goto -> 165
    //   158: aload #9
    //   160: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   163: astore #9
    //   165: aload_0
    //   166: aload #9
    //   168: putfield f : Landroid/net/Uri;
    //   171: iconst_1
    //   172: istore_2
    //   173: aload_0
    //   174: getfield g : Z
    //   177: aload #10
    //   179: ldc 'enabled'
    //   181: iconst_1
    //   182: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   185: if_icmpeq -> 202
    //   188: aload_0
    //   189: aload #10
    //   191: ldc 'enabled'
    //   193: iconst_1
    //   194: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   197: putfield g : Z
    //   200: iconst_1
    //   201: istore_2
    //   202: aload_0
    //   203: getfield i : I
    //   206: aload #10
    //   208: ldc_w 'connectionState'
    //   211: iconst_0
    //   212: invokevirtual getInt : (Ljava/lang/String;I)I
    //   215: if_icmpeq -> 233
    //   218: aload_0
    //   219: aload #10
    //   221: ldc_w 'connectionState'
    //   224: iconst_0
    //   225: invokevirtual getInt : (Ljava/lang/String;I)I
    //   228: putfield i : I
    //   231: iconst_1
    //   232: istore_2
    //   233: aload_1
    //   234: invokevirtual b : ()Ljava/util/ArrayList;
    //   237: astore #12
    //   239: aload_0
    //   240: getfield k : Ljava/util/ArrayList;
    //   243: astore #9
    //   245: aload #9
    //   247: aload #12
    //   249: if_acmpne -> 255
    //   252: goto -> 491
    //   255: aload #9
    //   257: ifnull -> 474
    //   260: aload #9
    //   262: invokevirtual listIterator : ()Ljava/util/ListIterator;
    //   265: astore #11
    //   267: aload #12
    //   269: invokevirtual listIterator : ()Ljava/util/ListIterator;
    //   272: astore #12
    //   274: aload #11
    //   276: invokeinterface hasNext : ()Z
    //   281: ifeq -> 451
    //   284: aload #12
    //   286: invokeinterface hasNext : ()Z
    //   291: ifeq -> 451
    //   294: aload #11
    //   296: invokeinterface next : ()Ljava/lang/Object;
    //   301: checkcast android/content/IntentFilter
    //   304: astore #13
    //   306: aload #12
    //   308: invokeinterface next : ()Ljava/lang/Object;
    //   313: checkcast android/content/IntentFilter
    //   316: astore #14
    //   318: aload #13
    //   320: aload #14
    //   322: if_acmpne -> 328
    //   325: goto -> 274
    //   328: aload #13
    //   330: ifnull -> 474
    //   333: aload #14
    //   335: ifnonnull -> 341
    //   338: goto -> 474
    //   341: aload #13
    //   343: invokevirtual countActions : ()I
    //   346: istore #4
    //   348: iload #4
    //   350: aload #14
    //   352: invokevirtual countActions : ()I
    //   355: if_icmpeq -> 361
    //   358: goto -> 474
    //   361: iconst_0
    //   362: istore_3
    //   363: iload_3
    //   364: iload #4
    //   366: if_icmpge -> 396
    //   369: aload #13
    //   371: iload_3
    //   372: invokevirtual getAction : (I)Ljava/lang/String;
    //   375: aload #14
    //   377: iload_3
    //   378: invokevirtual getAction : (I)Ljava/lang/String;
    //   381: invokevirtual equals : (Ljava/lang/Object;)Z
    //   384: ifne -> 390
    //   387: goto -> 474
    //   390: iinc #3, 1
    //   393: goto -> 363
    //   396: aload #13
    //   398: invokevirtual countCategories : ()I
    //   401: istore #4
    //   403: iload #4
    //   405: aload #14
    //   407: invokevirtual countCategories : ()I
    //   410: if_icmpeq -> 416
    //   413: goto -> 474
    //   416: iconst_0
    //   417: istore_3
    //   418: iload_3
    //   419: iload #4
    //   421: if_icmpge -> 274
    //   424: aload #13
    //   426: iload_3
    //   427: invokevirtual getCategory : (I)Ljava/lang/String;
    //   430: aload #14
    //   432: iload_3
    //   433: invokevirtual getCategory : (I)Ljava/lang/String;
    //   436: invokevirtual equals : (Ljava/lang/Object;)Z
    //   439: ifne -> 445
    //   442: goto -> 474
    //   445: iinc #3, 1
    //   448: goto -> 418
    //   451: aload #11
    //   453: invokeinterface hasNext : ()Z
    //   458: ifne -> 474
    //   461: aload #12
    //   463: invokeinterface hasNext : ()Z
    //   468: ifne -> 474
    //   471: goto -> 491
    //   474: aload #9
    //   476: invokevirtual clear : ()V
    //   479: aload #9
    //   481: aload_1
    //   482: invokevirtual b : ()Ljava/util/ArrayList;
    //   485: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   488: pop
    //   489: iconst_1
    //   490: istore_2
    //   491: aload_0
    //   492: getfield l : I
    //   495: aload #10
    //   497: ldc_w 'playbackType'
    //   500: iconst_1
    //   501: invokevirtual getInt : (Ljava/lang/String;I)I
    //   504: if_icmpeq -> 522
    //   507: aload_0
    //   508: aload #10
    //   510: ldc_w 'playbackType'
    //   513: iconst_1
    //   514: invokevirtual getInt : (Ljava/lang/String;I)I
    //   517: putfield l : I
    //   520: iconst_1
    //   521: istore_2
    //   522: aload_0
    //   523: getfield m : I
    //   526: aload #10
    //   528: ldc_w 'playbackStream'
    //   531: iconst_m1
    //   532: invokevirtual getInt : (Ljava/lang/String;I)I
    //   535: if_icmpeq -> 553
    //   538: aload_0
    //   539: aload #10
    //   541: ldc_w 'playbackStream'
    //   544: iconst_m1
    //   545: invokevirtual getInt : (Ljava/lang/String;I)I
    //   548: putfield m : I
    //   551: iconst_1
    //   552: istore_2
    //   553: aload_0
    //   554: getfield n : I
    //   557: aload #10
    //   559: ldc_w 'deviceType'
    //   562: invokevirtual getInt : (Ljava/lang/String;)I
    //   565: if_icmpeq -> 582
    //   568: aload_0
    //   569: aload #10
    //   571: ldc_w 'deviceType'
    //   574: invokevirtual getInt : (Ljava/lang/String;)I
    //   577: putfield n : I
    //   580: iconst_1
    //   581: istore_2
    //   582: aload_0
    //   583: getfield o : I
    //   586: istore #4
    //   588: getstatic org/jaudiotagger/audio/exceptions/yb/zLtYiJUm.icjnEyRCFNP : Ljava/lang/String;
    //   591: astore #9
    //   593: aload #10
    //   595: aload #9
    //   597: iconst_0
    //   598: invokevirtual getInt : (Ljava/lang/String;I)I
    //   601: istore #5
    //   603: iconst_3
    //   604: istore_3
    //   605: iload #4
    //   607: iload #5
    //   609: if_icmpeq -> 626
    //   612: aload_0
    //   613: aload #10
    //   615: aload #9
    //   617: iconst_0
    //   618: invokevirtual getInt : (Ljava/lang/String;I)I
    //   621: putfield o : I
    //   624: iconst_3
    //   625: istore_2
    //   626: aload_0
    //   627: getfield p : I
    //   630: aload #10
    //   632: ldc_w 'volume'
    //   635: invokevirtual getInt : (Ljava/lang/String;)I
    //   638: if_icmpeq -> 655
    //   641: aload_0
    //   642: aload #10
    //   644: ldc_w 'volume'
    //   647: invokevirtual getInt : (Ljava/lang/String;)I
    //   650: putfield p : I
    //   653: iconst_3
    //   654: istore_2
    //   655: aload_0
    //   656: getfield q : I
    //   659: aload #10
    //   661: ldc_w 'volumeMax'
    //   664: invokevirtual getInt : (Ljava/lang/String;)I
    //   667: if_icmpeq -> 687
    //   670: aload_0
    //   671: aload #10
    //   673: ldc_w 'volumeMax'
    //   676: invokevirtual getInt : (Ljava/lang/String;)I
    //   679: putfield q : I
    //   682: iload_3
    //   683: istore_2
    //   684: goto -> 687
    //   687: iload_2
    //   688: istore_3
    //   689: aload_0
    //   690: getfield s : I
    //   693: aload #10
    //   695: ldc_w 'presentationDisplayId'
    //   698: iconst_m1
    //   699: invokevirtual getInt : (Ljava/lang/String;I)I
    //   702: if_icmpeq -> 727
    //   705: aload_0
    //   706: aload #10
    //   708: ldc_w 'presentationDisplayId'
    //   711: iconst_m1
    //   712: invokevirtual getInt : (Ljava/lang/String;I)I
    //   715: putfield s : I
    //   718: aload_0
    //   719: aconst_null
    //   720: putfield r : Landroid/view/Display;
    //   723: iload_2
    //   724: iconst_5
    //   725: ior
    //   726: istore_3
    //   727: iload_3
    //   728: istore_2
    //   729: aload_0
    //   730: getfield t : Landroid/os/Bundle;
    //   733: aload #10
    //   735: ldc_w 'extras'
    //   738: invokevirtual getBundle : (Ljava/lang/String;)Landroid/os/Bundle;
    //   741: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   744: ifne -> 763
    //   747: aload_0
    //   748: aload #10
    //   750: ldc_w 'extras'
    //   753: invokevirtual getBundle : (Ljava/lang/String;)Landroid/os/Bundle;
    //   756: putfield t : Landroid/os/Bundle;
    //   759: iload_3
    //   760: iconst_1
    //   761: ior
    //   762: istore_2
    //   763: iload_2
    //   764: istore_3
    //   765: aload_0
    //   766: getfield u : Landroid/content/IntentSender;
    //   769: aload #10
    //   771: ldc_w 'settingsIntent'
    //   774: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   777: checkcast android/content/IntentSender
    //   780: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   783: ifne -> 805
    //   786: aload_0
    //   787: aload #10
    //   789: ldc_w 'settingsIntent'
    //   792: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   795: checkcast android/content/IntentSender
    //   798: putfield u : Landroid/content/IntentSender;
    //   801: iload_2
    //   802: iconst_1
    //   803: ior
    //   804: istore_3
    //   805: iload_3
    //   806: istore #4
    //   808: aload_0
    //   809: getfield j : Z
    //   812: aload #10
    //   814: ldc_w 'canDisconnect'
    //   817: iconst_0
    //   818: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   821: if_icmpeq -> 842
    //   824: aload_0
    //   825: aload #10
    //   827: ldc_w 'canDisconnect'
    //   830: iconst_0
    //   831: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   834: putfield j : Z
    //   837: iload_3
    //   838: iconst_5
    //   839: ior
    //   840: istore #4
    //   842: aload_1
    //   843: invokevirtual c : ()Ljava/util/ArrayList;
    //   846: astore #10
    //   848: new java/util/ArrayList
    //   851: dup
    //   852: invokespecial <init> : ()V
    //   855: astore #11
    //   857: aload #10
    //   859: invokevirtual size : ()I
    //   862: aload_0
    //   863: getfield w : Ljava/util/ArrayList;
    //   866: invokevirtual size : ()I
    //   869: if_icmpeq -> 877
    //   872: iconst_1
    //   873: istore_2
    //   874: goto -> 879
    //   877: iconst_0
    //   878: istore_2
    //   879: iload_2
    //   880: istore #6
    //   882: aload #10
    //   884: invokevirtual isEmpty : ()Z
    //   887: ifne -> 1094
    //   890: invokestatic c : ()Lee0;
    //   893: astore #9
    //   895: aload #10
    //   897: invokevirtual size : ()I
    //   900: istore #8
    //   902: iconst_0
    //   903: istore #5
    //   905: iload_2
    //   906: istore_3
    //   907: iload #7
    //   909: istore_2
    //   910: iload_3
    //   911: istore #6
    //   913: iload #5
    //   915: iload #8
    //   917: if_icmpge -> 1094
    //   920: aload #10
    //   922: iload #5
    //   924: invokevirtual get : (I)Ljava/lang/Object;
    //   927: astore_1
    //   928: iload #5
    //   930: iconst_1
    //   931: iadd
    //   932: istore #6
    //   934: aload_1
    //   935: checkcast java/lang/String
    //   938: astore #12
    //   940: aload #9
    //   942: invokevirtual getClass : ()Ljava/lang/Class;
    //   945: pop
    //   946: aload_0
    //   947: getfield a : Lgv0;
    //   950: getfield d : Lbh0;
    //   953: getfield c : Ljava/lang/Object;
    //   956: checkcast android/content/ComponentName
    //   959: invokevirtual flattenToShortString : ()Ljava/lang/String;
    //   962: astore_1
    //   963: aload #9
    //   965: getfield l : Ljava/util/HashMap;
    //   968: new u51
    //   971: dup
    //   972: aload_1
    //   973: aload #12
    //   975: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   978: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   981: checkcast java/lang/String
    //   984: astore #13
    //   986: aload #9
    //   988: getfield j : Ljava/util/ArrayList;
    //   991: astore #12
    //   993: aload #12
    //   995: invokevirtual size : ()I
    //   998: istore #7
    //   1000: iload_2
    //   1001: istore #5
    //   1003: iload #5
    //   1005: iload #7
    //   1007: if_icmpge -> 1044
    //   1010: aload #12
    //   1012: iload #5
    //   1014: invokevirtual get : (I)Ljava/lang/Object;
    //   1017: astore_1
    //   1018: iinc #5, 1
    //   1021: aload_1
    //   1022: checkcast hv0
    //   1025: astore_1
    //   1026: aload_1
    //   1027: getfield c : Ljava/lang/String;
    //   1030: aload #13
    //   1032: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1035: ifeq -> 1041
    //   1038: goto -> 1046
    //   1041: goto -> 1003
    //   1044: aconst_null
    //   1045: astore_1
    //   1046: iload_3
    //   1047: istore #5
    //   1049: aload_1
    //   1050: ifnull -> 1084
    //   1053: aload #11
    //   1055: aload_1
    //   1056: invokevirtual add : (Ljava/lang/Object;)Z
    //   1059: pop
    //   1060: iload_3
    //   1061: istore #5
    //   1063: iload_3
    //   1064: ifne -> 1084
    //   1067: iload_3
    //   1068: istore #5
    //   1070: aload_0
    //   1071: getfield w : Ljava/util/ArrayList;
    //   1074: aload_1
    //   1075: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1078: ifne -> 1084
    //   1081: iconst_1
    //   1082: istore #5
    //   1084: iload #5
    //   1086: istore_3
    //   1087: iload #6
    //   1089: istore #5
    //   1091: goto -> 910
    //   1094: iload #6
    //   1096: ifeq -> 1110
    //   1099: aload_0
    //   1100: aload #11
    //   1102: putfield w : Ljava/util/ArrayList;
    //   1105: iload #4
    //   1107: iconst_1
    //   1108: ior
    //   1109: ireturn
    //   1110: iload #4
    //   1112: ireturn
    //   1113: iconst_0
    //   1114: ireturn
  }
  
  public final void j(int paramInt) {
    iv0.b();
    ee0 ee0 = iv0.c();
    paramInt = Math.min(this.q, Math.max(0, paramInt));
    xu0 xu0 = ee0.f(this);
    if (xu0 != null)
      xu0.f(paramInt); 
  }
  
  public final void k(int paramInt) {
    iv0.b();
    if (paramInt != 0) {
      xu0 xu0 = iv0.c().f(this);
      if (xu0 != null)
        xu0.i(paramInt); 
    } 
  }
  
  public final void l(boolean paramBoolean) {
    iv0.b();
    iv0.c().k(this, 3, paramBoolean);
  }
  
  public final boolean m(String paramString) {
    iv0.b();
    ArrayList<Object> arrayList = this.k;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      IntentFilter intentFilter = (IntentFilter)arrayList.get(b);
      b++;
      if (((IntentFilter)intentFilter).hasCategory(paramString))
        return true; 
    } 
    return false;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
    stringBuilder.append(this.c);
    stringBuilder.append(", name=");
    stringBuilder.append(this.d);
    stringBuilder.append(", description=");
    stringBuilder.append(this.e);
    stringBuilder.append(", iconUri=");
    stringBuilder.append(this.f);
    stringBuilder.append(", enabled=");
    stringBuilder.append(this.g);
    stringBuilder.append(", isSystemRoute=");
    stringBuilder.append(this.h);
    stringBuilder.append(", connectionState=");
    stringBuilder.append(this.i);
    stringBuilder.append(", canDisconnect=");
    stringBuilder.append(this.j);
    stringBuilder.append(", playbackType=");
    stringBuilder.append(this.l);
    stringBuilder.append(", playbackStream=");
    stringBuilder.append(this.m);
    stringBuilder.append(", deviceType=");
    stringBuilder.append(this.n);
    stringBuilder.append(", volumeHandling=");
    stringBuilder.append(this.o);
    stringBuilder.append(", volume=");
    stringBuilder.append(this.p);
    stringBuilder.append(", volumeMax=");
    stringBuilder.append(this.q);
    stringBuilder.append(", presentationDisplayId=");
    stringBuilder.append(this.s);
    stringBuilder.append(", extras=");
    stringBuilder.append(this.t);
    stringBuilder.append(", settingsIntent=");
    stringBuilder.append(this.u);
    stringBuilder.append(", providerPackageName=");
    stringBuilder.append(((ComponentName)this.a.d.c).getPackageName());
    if (e()) {
      stringBuilder.append(", members=[");
      int i = this.w.size();
      for (byte b = 0; b < i; b++) {
        if (b > 0)
          stringBuilder.append(", "); 
        if (this.w.get(b) != this)
          stringBuilder.append(((hv0)this.w.get(b)).c); 
      } 
      stringBuilder.append(']');
    } 
    stringBuilder.append(" }");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */