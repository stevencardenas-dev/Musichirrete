package in.krosbits.musicolet;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;

public abstract class b {
  public static boolean a;
  
  public static boolean b;
  
  public static int c;
  
  public static boolean d;
  
  public static boolean e;
  
  public static void a(Context paramContext) {
    // Byte code:
    //   0: invokestatic o : ()Landroid/content/SharedPreferences;
    //   3: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   8: astore #4
    //   10: iconst_0
    //   11: istore_3
    //   12: aload #4
    //   14: ldc 'RCPOS'
    //   16: iconst_0
    //   17: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   22: aload_0
    //   23: ldc 2131886711
    //   25: invokevirtual getString : (I)Ljava/lang/String;
    //   28: ldc '1'
    //   30: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   35: ldc 'THMR_BT'
    //   37: ldc '2'
    //   39: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   44: astore #5
    //   46: getstatic android/os/Build$VERSION.SDK_INT : I
    //   49: istore_2
    //   50: iload_2
    //   51: bipush #31
    //   53: if_icmplt -> 61
    //   56: iconst_2
    //   57: istore_1
    //   58: goto -> 63
    //   61: iconst_4
    //   62: istore_1
    //   63: aload #5
    //   65: ldc 'k_i_wdth'
    //   67: iload_1
    //   68: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   73: ldc 'k_b_w31sadpl'
    //   75: iconst_0
    //   76: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   81: ldc 'k_b_w31sfv'
    //   83: iconst_0
    //   84: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   89: ldc 'k_b_w41sffrw'
    //   91: iconst_0
    //   92: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   97: ldc 'k_b_w43sffrw'
    //   99: iconst_0
    //   100: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   105: ldc 'I_WIDTRS'
    //   107: bipush #90
    //   109: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   114: ldc 'k_b_ctrali'
    //   116: iconst_1
    //   117: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   122: aload_0
    //   123: ldc 2131886706
    //   125: invokevirtual getString : (I)Ljava/lang/String;
    //   128: ldc '2'
    //   130: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   135: ldc 'etu2'
    //   137: iconst_0
    //   138: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   143: ldc 'B_PF_FILNMIOTTL'
    //   145: iconst_0
    //   146: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   151: ldc 'B_R_AF'
    //   153: iconst_1
    //   154: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   159: ldc 'B_PF_EXOSWP'
    //   161: iconst_0
    //   162: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   167: ldc 'B_SYSLCSBG'
    //   169: iconst_1
    //   170: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   175: pop
    //   176: invokestatic I : ()Z
    //   179: ifeq -> 199
    //   182: iload_2
    //   183: bipush #30
    //   185: if_icmpne -> 199
    //   188: aload #4
    //   190: ldc 'k_i_adt'
    //   192: iconst_1
    //   193: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   198: pop
    //   199: iload_2
    //   200: bipush #28
    //   202: if_icmplt -> 987
    //   205: iload_2
    //   206: bipush #30
    //   208: if_icmpgt -> 987
    //   211: getstatic android/os/Build.BRAND : Ljava/lang/String;
    //   214: astore_0
    //   215: aload_0
    //   216: ldc '10.or'
    //   218: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   221: ifeq -> 227
    //   224: goto -> 501
    //   227: aload_0
    //   228: ldc 'Essential Products'
    //   230: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   233: ifeq -> 239
    //   236: goto -> 501
    //   239: aload_0
    //   240: ldc 'FUJITSU'
    //   242: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   245: ifeq -> 251
    //   248: goto -> 501
    //   251: aload_0
    //   252: ldc 'Fairphone'
    //   254: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   257: ifeq -> 263
    //   260: goto -> 501
    //   263: aload_0
    //   264: ldc 'Google'
    //   266: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   269: ifeq -> 275
    //   272: goto -> 501
    //   275: aload_0
    //   276: ldc 'Huawei'
    //   278: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   281: ifeq -> 287
    //   284: goto -> 501
    //   287: aload_0
    //   288: ldc 'Infinix'
    //   290: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   293: ifeq -> 299
    //   296: goto -> 501
    //   299: aload_0
    //   300: ldc 'LGE'
    //   302: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   305: ifeq -> 311
    //   308: goto -> 501
    //   311: aload_0
    //   312: ldc 'Lenovo'
    //   314: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   317: ifeq -> 323
    //   320: goto -> 501
    //   323: aload_0
    //   324: ldc 'Mototola'
    //   326: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   329: ifeq -> 335
    //   332: goto -> 501
    //   335: aload_0
    //   336: ldc 'Nokia'
    //   338: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   341: ifeq -> 347
    //   344: goto -> 501
    //   347: aload_0
    //   348: getstatic org/jaudiotagger/tag/id3/tT/hrSTyFuSIm.tkjcd : Ljava/lang/String;
    //   351: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   354: ifeq -> 360
    //   357: goto -> 501
    //   360: aload_0
    //   361: ldc 'Oppo'
    //   363: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   366: ifeq -> 372
    //   369: goto -> 501
    //   372: aload_0
    //   373: ldc 'Panasonic'
    //   375: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   378: ifeq -> 384
    //   381: goto -> 501
    //   384: aload_0
    //   385: ldc 'Razer'
    //   387: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   390: ifeq -> 396
    //   393: goto -> 501
    //   396: aload_0
    //   397: ldc 'Redmi'
    //   399: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   402: ifeq -> 408
    //   405: goto -> 501
    //   408: aload_0
    //   409: ldc 'Samsung'
    //   411: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   414: ifeq -> 420
    //   417: goto -> 501
    //   420: aload_0
    //   421: ldc 'Sharp'
    //   423: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   426: ifeq -> 432
    //   429: goto -> 501
    //   432: aload_0
    //   433: ldc 'Sony'
    //   435: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   438: ifeq -> 444
    //   441: goto -> 501
    //   444: aload_0
    //   445: ldc 'T-Mobile'
    //   447: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   450: ifeq -> 456
    //   453: goto -> 501
    //   456: aload_0
    //   457: ldc 'TCT (Alcatel)'
    //   459: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   462: ifeq -> 468
    //   465: goto -> 501
    //   468: aload_0
    //   469: ldc 'Vivo'
    //   471: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   474: ifeq -> 480
    //   477: goto -> 501
    //   480: aload_0
    //   481: ldc 'Xiaomi'
    //   483: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   486: ifeq -> 492
    //   489: goto -> 501
    //   492: aload_0
    //   493: ldc 'ZTE'
    //   495: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   498: ifeq -> 987
    //   501: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   504: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   507: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   510: astore_0
    //   511: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   514: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   517: invokevirtual getPackageName : ()Ljava/lang/String;
    //   520: astore #5
    //   522: new android/content/Intent
    //   525: astore #7
    //   527: new java/lang/StringBuilder
    //   530: astore #6
    //   532: aload #6
    //   534: ldc 'market://details?id='
    //   536: invokespecial <init> : (Ljava/lang/String;)V
    //   539: aload #6
    //   541: aload #5
    //   543: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   546: pop
    //   547: aload #7
    //   549: ldc 'android.intent.action.VIEW'
    //   551: aload #6
    //   553: invokevirtual toString : ()Ljava/lang/String;
    //   556: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   559: invokespecial <init> : (Ljava/lang/String;Landroid/net/Uri;)V
    //   562: aload_0
    //   563: aload #7
    //   565: ldc 1213056
    //   567: invokevirtual queryIntentActivities : (Landroid/content/Intent;I)Ljava/util/List;
    //   570: invokeinterface size : ()I
    //   575: iconst_1
    //   576: if_icmple -> 582
    //   579: goto -> 987
    //   582: new android/content/Intent
    //   585: astore #7
    //   587: new java/lang/StringBuilder
    //   590: astore #6
    //   592: aload #6
    //   594: ldc 'itms-apps://details?id='
    //   596: invokespecial <init> : (Ljava/lang/String;)V
    //   599: aload #6
    //   601: aload #5
    //   603: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: pop
    //   607: aload #7
    //   609: ldc 'android.intent.action.VIEW'
    //   611: aload #6
    //   613: invokevirtual toString : ()Ljava/lang/String;
    //   616: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   619: invokespecial <init> : (Ljava/lang/String;Landroid/net/Uri;)V
    //   622: aload_0
    //   623: aload #7
    //   625: sipush #640
    //   628: invokevirtual queryIntentActivities : (Landroid/content/Intent;I)Ljava/util/List;
    //   631: invokeinterface size : ()I
    //   636: ifle -> 642
    //   639: goto -> 987
    //   642: new android/content/Intent
    //   645: astore #7
    //   647: new java/lang/StringBuilder
    //   650: astore #6
    //   652: aload #6
    //   654: ldc 'appmarket://details?id='
    //   656: invokespecial <init> : (Ljava/lang/String;)V
    //   659: aload #6
    //   661: aload #5
    //   663: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   666: pop
    //   667: aload #7
    //   669: ldc 'android.intent.action.VIEW'
    //   671: aload #6
    //   673: invokevirtual toString : ()Ljava/lang/String;
    //   676: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   679: invokespecial <init> : (Ljava/lang/String;Landroid/net/Uri;)V
    //   682: aload_0
    //   683: aload #7
    //   685: sipush #640
    //   688: invokevirtual queryIntentActivities : (Landroid/content/Intent;I)Ljava/util/List;
    //   691: invokeinterface size : ()I
    //   696: ifle -> 702
    //   699: goto -> 987
    //   702: new android/content/Intent
    //   705: astore #7
    //   707: new java/lang/StringBuilder
    //   710: astore #6
    //   712: aload #6
    //   714: ldc 'mimarket://details?id='
    //   716: invokespecial <init> : (Ljava/lang/String;)V
    //   719: aload #6
    //   721: aload #5
    //   723: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   726: pop
    //   727: aload #7
    //   729: ldc 'android.intent.action.VIEW'
    //   731: aload #6
    //   733: invokevirtual toString : ()Ljava/lang/String;
    //   736: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   739: invokespecial <init> : (Ljava/lang/String;Landroid/net/Uri;)V
    //   742: aload_0
    //   743: aload #7
    //   745: sipush #640
    //   748: invokevirtual queryIntentActivities : (Landroid/content/Intent;I)Ljava/util/List;
    //   751: invokeinterface size : ()I
    //   756: ifle -> 762
    //   759: goto -> 987
    //   762: new android/content/Intent
    //   765: astore #7
    //   767: new java/lang/StringBuilder
    //   770: astore #6
    //   772: aload #6
    //   774: ldc 'oppomarket://details?packagename='
    //   776: invokespecial <init> : (Ljava/lang/String;)V
    //   779: aload #6
    //   781: aload #5
    //   783: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   786: pop
    //   787: aload #7
    //   789: ldc 'android.intent.action.VIEW'
    //   791: aload #6
    //   793: invokevirtual toString : ()Ljava/lang/String;
    //   796: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   799: invokespecial <init> : (Ljava/lang/String;Landroid/net/Uri;)V
    //   802: aload_0
    //   803: aload #7
    //   805: sipush #640
    //   808: invokevirtual queryIntentActivities : (Landroid/content/Intent;I)Ljava/util/List;
    //   811: invokeinterface size : ()I
    //   816: ifle -> 822
    //   819: goto -> 987
    //   822: new android/content/Intent
    //   825: astore #6
    //   827: new java/lang/StringBuilder
    //   830: astore #7
    //   832: aload #7
    //   834: ldc 'vivomarket://details?id='
    //   836: invokespecial <init> : (Ljava/lang/String;)V
    //   839: aload #7
    //   841: aload #5
    //   843: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   846: pop
    //   847: aload #6
    //   849: ldc 'android.intent.action.VIEW'
    //   851: aload #7
    //   853: invokevirtual toString : ()Ljava/lang/String;
    //   856: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   859: invokespecial <init> : (Ljava/lang/String;Landroid/net/Uri;)V
    //   862: aload_0
    //   863: aload #6
    //   865: sipush #640
    //   868: invokevirtual queryIntentActivities : (Landroid/content/Intent;I)Ljava/util/List;
    //   871: invokeinterface size : ()I
    //   876: ifle -> 882
    //   879: goto -> 987
    //   882: new android/content/Intent
    //   885: astore #6
    //   887: new java/lang/StringBuilder
    //   890: astore #7
    //   892: aload #7
    //   894: ldc 'samsungapps://ProductDetail/'
    //   896: invokespecial <init> : (Ljava/lang/String;)V
    //   899: aload #7
    //   901: aload #5
    //   903: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   906: pop
    //   907: aload #6
    //   909: ldc 'android.intent.action.VIEW'
    //   911: aload #7
    //   913: invokevirtual toString : ()Ljava/lang/String;
    //   916: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   919: invokespecial <init> : (Ljava/lang/String;Landroid/net/Uri;)V
    //   922: aload_0
    //   923: aload #6
    //   925: sipush #640
    //   928: invokevirtual queryIntentActivities : (Landroid/content/Intent;I)Ljava/util/List;
    //   931: invokeinterface size : ()I
    //   936: istore_1
    //   937: iload_1
    //   938: ifle -> 944
    //   941: goto -> 987
    //   944: invokestatic G : ()Z
    //   947: ifeq -> 953
    //   950: goto -> 987
    //   953: invokestatic D : ()Z
    //   956: ifeq -> 962
    //   959: goto -> 987
    //   962: ldc 'ro.build.rom.id'
    //   964: invokestatic A : (Ljava/lang/String;)Ljava/lang/String;
    //   967: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   970: ifne -> 976
    //   973: goto -> 987
    //   976: aload #4
    //   978: ldc 'k_b_mn_alex'
    //   980: iconst_1
    //   981: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   986: pop
    //   987: invokestatic G : ()Z
    //   990: ifeq -> 1013
    //   993: aload #4
    //   995: getstatic com/google/android/gms/common/internal/Qg/nFLlOYeP.ptqQoZI : Ljava/lang/String;
    //   998: iconst_0
    //   999: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   1004: ldc 'k_b_mn_crcbex'
    //   1006: iconst_0
    //   1007: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   1012: pop
    //   1013: aload #4
    //   1015: invokeinterface commit : ()Z
    //   1020: pop
    //   1021: invokestatic v : ()Landroid/content/SharedPreferences;
    //   1024: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1029: astore_0
    //   1030: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1033: istore_1
    //   1034: iload_1
    //   1035: bipush #29
    //   1037: if_icmpgt -> 1042
    //   1040: iconst_1
    //   1041: istore_3
    //   1042: aload_0
    //   1043: ldc_w 'SAF_B_LGCSTM'
    //   1046: iload_3
    //   1047: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   1052: pop
    //   1053: iload_1
    //   1054: bipush #30
    //   1056: if_icmplt -> 1085
    //   1059: aload_0
    //   1060: ldc_w 'SAF_SS_SMSU'
    //   1063: new java/util/HashSet
    //   1066: dup
    //   1067: getstatic lw0.r : Landroid/net/Uri;
    //   1070: invokevirtual toString : ()Ljava/lang/String;
    //   1073: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   1076: invokespecial <init> : (Ljava/util/Collection;)V
    //   1079: invokeinterface putStringSet : (Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
    //   1084: pop
    //   1085: aload_0
    //   1086: invokeinterface apply : ()V
    //   1091: invokestatic x : ()Landroid/content/SharedPreferences;
    //   1094: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1099: ldc_w 's_disl2'
    //   1102: invokestatic currentTimeMillis : ()J
    //   1105: l2d
    //   1106: ldc2_w 1000.0
    //   1109: ddiv
    //   1110: ldc2_w 3600.0
    //   1113: ddiv
    //   1114: ldc2_w 24.0
    //   1117: ddiv
    //   1118: d2i
    //   1119: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1124: invokeinterface apply : ()V
    //   1129: return
    //   1130: astore_0
    //   1131: goto -> 944
    // Exception table:
    //   from	to	target	type
    //   501	579	1130	finally
    //   582	639	1130	finally
    //   642	699	1130	finally
    //   702	759	1130	finally
    //   762	819	1130	finally
    //   822	879	1130	finally
    //   882	937	1130	finally
  }
  
  public static void b() {
    JSONArray jSONArray1 = new JSONArray(MyApplication.o().getString("S_PTH_SCN_J", "[]"));
    JSONArray jSONArray2 = new JSONArray();
    boolean bool = false;
    byte b1 = 0;
    while (true) {
      if (b1 < jSONArray1.length()) {
        try {
          String str1 = jSONArray1.getString(b1);
          str1 = MyApplication.F.f(str1);
          if (str1 != null)
            jSONArray2.put(str1); 
        } finally {
          Exception exception;
        } 
        b1++;
        continue;
      } 
      SharedPreferences.Editor editor = MyApplication.o().edit();
      editor.putString("S_PTH_SCN_J", jSONArray2.toString());
      String str = MyApplication.o().getString("jsa_icdfl", null);
      if (str != null) {
        JSONArray jSONArray3 = new JSONArray(str);
        JSONArray jSONArray4 = new JSONArray();
        b1 = bool;
        while (true) {
          if (b1 < jSONArray3.length()) {
            try {
              String str1 = jSONArray3.getString(b1);
              str1 = MyApplication.F.f(str1);
              if (str1 != null)
                jSONArray4.put(str1); 
            } finally {
              Exception exception;
            } 
            b1++;
            continue;
          } 
          editor.putString("jsa_icdfl", jSONArray4.toString());
          editor.commit();
          return;
        } 
        break;
      } 
      continue;
    } 
  }
  
  public static void c(Context paramContext) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: invokevirtual getFilesDir : ()Ljava/io/File;
    //   6: astore #5
    //   8: new java/io/File
    //   11: astore #7
    //   13: aload #7
    //   15: aload #5
    //   17: ldc_w '0.qstk'
    //   20: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   23: aload #7
    //   25: invokevirtual exists : ()Z
    //   28: ifeq -> 256
    //   31: new java/io/BufferedReader
    //   34: astore #5
    //   36: new java/io/FileReader
    //   39: astore #6
    //   41: aload #6
    //   43: aload #7
    //   45: invokespecial <init> : (Ljava/io/File;)V
    //   48: aload #5
    //   50: aload #6
    //   52: invokespecial <init> : (Ljava/io/Reader;)V
    //   55: aload #5
    //   57: invokevirtual readLine : ()Ljava/lang/String;
    //   60: astore #6
    //   62: aload #5
    //   64: invokevirtual close : ()V
    //   67: new org/json/JSONObject
    //   70: astore #9
    //   72: aload #9
    //   74: aload #6
    //   76: invokespecial <init> : (Ljava/lang/String;)V
    //   79: aload #9
    //   81: ldc_w 'S0_PQ'
    //   84: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   87: astore #10
    //   89: new java/util/Stack
    //   92: astore #8
    //   94: aload #8
    //   96: invokespecial <init> : ()V
    //   99: iconst_0
    //   100: istore_1
    //   101: iload_1
    //   102: aload #10
    //   104: invokevirtual length : ()I
    //   107: if_icmpge -> 219
    //   110: aload #10
    //   112: iload_1
    //   113: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
    //   116: astore #6
    //   118: aconst_null
    //   119: astore #5
    //   121: aload #6
    //   123: ldc_w 'S0_PQ_T'
    //   126: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   129: astore #11
    //   131: aload #6
    //   133: ldc_w 'S0_PQ_LKP'
    //   136: invokevirtual getInt : (Ljava/lang/String;)I
    //   139: istore_3
    //   140: aload #6
    //   142: ldc_w 'S0_PQ_CPS'
    //   145: invokevirtual getInt : (Ljava/lang/String;)I
    //   148: istore #4
    //   150: aload #6
    //   152: ldc_w 'S0_PQ_OQS'
    //   155: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   158: invokestatic F : (Lorg/json/JSONArray;)Ljava/util/ArrayList;
    //   161: astore #12
    //   163: new xn1
    //   166: astore #6
    //   168: aload #6
    //   170: iload #4
    //   172: aload #11
    //   174: aload #12
    //   176: aconst_null
    //   177: invokespecial <init> : (ILjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   180: aload #6
    //   182: iload_3
    //   183: invokevirtual l : (I)V
    //   186: aload #6
    //   188: astore #5
    //   190: goto -> 200
    //   193: astore #6
    //   195: aload #6
    //   197: invokevirtual printStackTrace : ()V
    //   200: aload #8
    //   202: aload #5
    //   204: invokevirtual push : (Ljava/lang/Object;)Ljava/lang/Object;
    //   207: pop
    //   208: iinc #1, 1
    //   211: goto -> 101
    //   214: astore #5
    //   216: goto -> 251
    //   219: aload #9
    //   221: ldc_w 'S0_CPQ'
    //   224: invokevirtual getInt : (Ljava/lang/String;)I
    //   227: istore_1
    //   228: new wk1
    //   231: astore #5
    //   233: aload #5
    //   235: aload #8
    //   237: iload_1
    //   238: invokespecial <init> : (Ljava/util/Stack;I)V
    //   241: aload #5
    //   243: aload #7
    //   245: invokestatic f : (Lwk1;Ljava/io/File;)V
    //   248: goto -> 256
    //   251: aload #5
    //   253: invokevirtual printStackTrace : ()V
    //   256: aload_0
    //   257: invokestatic g : (Landroid/content/Context;)Ljava/util/ArrayList;
    //   260: astore #5
    //   262: aload #5
    //   264: invokevirtual size : ()I
    //   267: istore_3
    //   268: iload_2
    //   269: istore_1
    //   270: iload_1
    //   271: iload_3
    //   272: if_icmpge -> 428
    //   275: aload #5
    //   277: iload_1
    //   278: invokevirtual get : (I)Ljava/lang/Object;
    //   281: astore #6
    //   283: iload_1
    //   284: iconst_1
    //   285: iadd
    //   286: istore_2
    //   287: aload #6
    //   289: checkcast java/lang/String
    //   292: astore #8
    //   294: aload_0
    //   295: invokevirtual getFilesDir : ()Ljava/io/File;
    //   298: astore #7
    //   300: new java/lang/StringBuilder
    //   303: astore #6
    //   305: aload #6
    //   307: invokespecial <init> : ()V
    //   310: aload #6
    //   312: aload #8
    //   314: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: pop
    //   318: aload #6
    //   320: ldc_w '.mpl'
    //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: pop
    //   327: aload #6
    //   329: invokevirtual toString : ()Ljava/lang/String;
    //   332: astore #8
    //   334: new java/io/File
    //   337: astore #6
    //   339: aload #6
    //   341: aload #7
    //   343: aload #8
    //   345: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   348: iload_2
    //   349: istore_1
    //   350: aload #6
    //   352: invokevirtual exists : ()Z
    //   355: ifeq -> 270
    //   358: new java/io/BufferedReader
    //   361: astore #8
    //   363: new java/io/FileReader
    //   366: astore #7
    //   368: aload #7
    //   370: aload #6
    //   372: invokespecial <init> : (Ljava/io/File;)V
    //   375: aload #8
    //   377: aload #7
    //   379: invokespecial <init> : (Ljava/io/Reader;)V
    //   382: aload #8
    //   384: invokevirtual readLine : ()Ljava/lang/String;
    //   387: astore #7
    //   389: aload #8
    //   391: invokevirtual close : ()V
    //   394: new org/json/JSONArray
    //   397: astore #8
    //   399: aload #8
    //   401: aload #7
    //   403: invokespecial <init> : (Ljava/lang/String;)V
    //   406: aload #8
    //   408: invokestatic F : (Lorg/json/JSONArray;)Ljava/util/ArrayList;
    //   411: aload #6
    //   413: invokestatic e : (Ljava/util/ArrayList;Ljava/io/File;)V
    //   416: iload_2
    //   417: istore_1
    //   418: goto -> 270
    //   421: astore #5
    //   423: aload #5
    //   425: invokevirtual printStackTrace : ()V
    //   428: aload_0
    //   429: invokevirtual getFilesDir : ()Ljava/io/File;
    //   432: astore #5
    //   434: new java/io/File
    //   437: astore_0
    //   438: aload_0
    //   439: aload #5
    //   441: ldc_w '0.favs'
    //   444: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   447: new java/io/BufferedReader
    //   450: astore #6
    //   452: new java/io/FileReader
    //   455: astore #5
    //   457: aload #5
    //   459: aload_0
    //   460: invokespecial <init> : (Ljava/io/File;)V
    //   463: aload #6
    //   465: aload #5
    //   467: invokespecial <init> : (Ljava/io/Reader;)V
    //   470: aload #6
    //   472: invokevirtual readLine : ()Ljava/lang/String;
    //   475: astore #5
    //   477: aload #6
    //   479: invokevirtual close : ()V
    //   482: new org/json/JSONArray
    //   485: astore #6
    //   487: aload #6
    //   489: aload #5
    //   491: invokespecial <init> : (Ljava/lang/String;)V
    //   494: aload #6
    //   496: invokestatic F : (Lorg/json/JSONArray;)Ljava/util/ArrayList;
    //   499: aload_0
    //   500: invokestatic e : (Ljava/util/ArrayList;Ljava/io/File;)V
    //   503: goto -> 519
    //   506: astore_0
    //   507: aload_0
    //   508: invokevirtual printStackTrace : ()V
    //   511: goto -> 519
    //   514: astore_0
    //   515: aload_0
    //   516: invokevirtual printStackTrace : ()V
    //   519: return
    // Exception table:
    //   from	to	target	type
    //   2	99	214	finally
    //   101	118	214	finally
    //   121	186	193	org/json/JSONException
    //   121	186	214	finally
    //   195	200	214	finally
    //   200	208	214	finally
    //   219	248	214	finally
    //   251	256	514	finally
    //   256	268	421	java/lang/Exception
    //   256	268	514	finally
    //   275	283	421	java/lang/Exception
    //   275	283	514	finally
    //   287	348	421	java/lang/Exception
    //   287	348	514	finally
    //   350	416	421	java/lang/Exception
    //   350	416	514	finally
    //   423	428	514	finally
    //   428	503	506	finally
    //   507	511	514	finally
  }
  
  public static void d(Context paramContext) {
    // Byte code:
    //   0: getstatic me/zhanghai/android/materialprogressbar/internal/pozR/kOkiWEITVb.SpFNuUowSmsosT : Ljava/lang/String;
    //   3: astore #10
    //   5: getstatic com/android/billingclient/api/wH/DJqHMztxflt.oqnpATyNMJPt : Ljava/lang/String;
    //   8: astore #11
    //   10: aload_0
    //   11: ldc_w 'USP'
    //   14: iconst_0
    //   15: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   18: astore #7
    //   20: aload_0
    //   21: ldc_w 'PP'
    //   24: iconst_0
    //   25: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   28: astore #9
    //   30: sipush #530
    //   33: putstatic in/krosbits/musicolet/b.c : I
    //   36: sipush #530
    //   39: putstatic in/krosbits/musicolet/MyApplication.b : I
    //   42: aload #7
    //   44: aload #11
    //   46: sipush #530
    //   49: invokeinterface getInt : (Ljava/lang/String;I)I
    //   54: istore_2
    //   55: iload_2
    //   56: istore_1
    //   57: iload_2
    //   58: sipush #20500
    //   61: if_icmplt -> 78
    //   64: iload_2
    //   65: istore_1
    //   66: iload_2
    //   67: sipush #23200
    //   70: if_icmpgt -> 78
    //   73: iload_2
    //   74: bipush #100
    //   76: idiv
    //   77: istore_1
    //   78: getstatic android/os/Build$VERSION.SDK_INT : I
    //   81: istore_2
    //   82: aload #7
    //   84: ldc_w 'LSDK'
    //   87: iload_2
    //   88: invokeinterface getInt : (Ljava/lang/String;I)I
    //   93: istore_3
    //   94: ldc_w '_0'
    //   97: astore #8
    //   99: aload #7
    //   101: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   106: aload #11
    //   108: sipush #530
    //   111: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   116: ldc_w 'LSDK'
    //   119: iload_2
    //   120: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   125: invokeinterface apply : ()V
    //   130: aload #7
    //   132: ldc_w 'FID'
    //   135: invokeinterface contains : (Ljava/lang/String;)Z
    //   140: ifne -> 170
    //   143: aload #7
    //   145: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   150: ldc_w 'FID'
    //   153: invokestatic currentTimeMillis : ()J
    //   156: invokeinterface putLong : (Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    //   161: invokeinterface apply : ()V
    //   166: aload_0
    //   167: invokestatic a : (Landroid/content/Context;)V
    //   170: iload_3
    //   171: iload_2
    //   172: if_icmpge -> 383
    //   175: new java/lang/StringBuilder
    //   178: astore #7
    //   180: aload #7
    //   182: ldc_w 'uhh:su>'
    //   185: invokespecial <init> : (Ljava/lang/String;)V
    //   188: aload #7
    //   190: iload_3
    //   191: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload #7
    //   197: ldc_w '>'
    //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: pop
    //   204: aload #7
    //   206: iload_2
    //   207: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: aload #7
    //   213: invokevirtual toString : ()Ljava/lang/String;
    //   216: invokestatic F : (Ljava/lang/String;)V
    //   219: iload_2
    //   220: bipush #30
    //   222: if_icmplt -> 303
    //   225: iload_3
    //   226: bipush #29
    //   228: if_icmpgt -> 303
    //   231: invokestatic o : ()Landroid/content/SharedPreferences;
    //   234: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   239: astore #7
    //   241: aload #7
    //   243: ldc_w 'k_b_st_ex_blayt'
    //   246: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   251: ldc_w 'k_i_nstl'
    //   254: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   259: pop
    //   260: invokestatic I : ()Z
    //   263: ifeq -> 296
    //   266: iload_2
    //   267: bipush #30
    //   269: if_icmpne -> 296
    //   272: invokestatic o : ()Landroid/content/SharedPreferences;
    //   275: ldc 'k_i_adt'
    //   277: invokeinterface contains : (Ljava/lang/String;)Z
    //   282: ifne -> 296
    //   285: aload #7
    //   287: ldc 'k_i_adt'
    //   289: iconst_1
    //   290: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   295: pop
    //   296: aload #7
    //   298: invokeinterface apply : ()V
    //   303: iload_2
    //   304: bipush #31
    //   306: if_icmplt -> 365
    //   309: iload_3
    //   310: bipush #30
    //   312: if_icmpgt -> 365
    //   315: invokestatic o : ()Landroid/content/SharedPreferences;
    //   318: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   323: astore #7
    //   325: aload #7
    //   327: ldc_w 'k_b_sclnot'
    //   330: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   335: pop
    //   336: aload #7
    //   338: ldc_w 'k_i_mn_bg'
    //   341: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   346: pop
    //   347: aload #7
    //   349: ldc_w 'k_i_nstl'
    //   352: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   357: pop
    //   358: aload #7
    //   360: invokeinterface apply : ()V
    //   365: iload_2
    //   366: bipush #33
    //   368: if_icmplt -> 383
    //   371: iload_3
    //   372: bipush #32
    //   374: if_icmpgt -> 383
    //   377: invokestatic L : ()V
    //   380: invokestatic V : ()V
    //   383: iload_1
    //   384: sipush #530
    //   387: if_icmpne -> 393
    //   390: goto -> 2578
    //   393: iload_1
    //   394: sipush #530
    //   397: if_icmpge -> 2578
    //   400: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   403: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   406: ldc_w 2131886400
    //   409: invokevirtual getString : (I)Ljava/lang/String;
    //   412: putstatic in/krosbits/musicolet/MyApplication.m : Ljava/lang/String;
    //   415: getstatic in/krosbits/musicolet/MyApplication.O : Lin/krosbits/musicolet/a;
    //   418: astore #7
    //   420: aload #7
    //   422: ifnull -> 430
    //   425: aload #7
    //   427: invokevirtual a : ()V
    //   430: iload_1
    //   431: bipush #50
    //   433: if_icmpgt -> 459
    //   436: new java/io/File
    //   439: astore #7
    //   441: aload #7
    //   443: aload_0
    //   444: invokevirtual getFilesDir : ()Ljava/io/File;
    //   447: ldc_w 'DefaultAlbumArt.musicolet_jpg'
    //   450: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   453: aload #7
    //   455: invokevirtual delete : ()Z
    //   458: pop
    //   459: iload_1
    //   460: bipush #79
    //   462: if_icmpgt -> 469
    //   465: aload_0
    //   466: invokestatic c : (Landroid/content/Context;)V
    //   469: iload_1
    //   470: bipush #80
    //   472: if_icmpgt -> 524
    //   475: aload_0
    //   476: ldc_w 2131886714
    //   479: invokevirtual getString : (I)Ljava/lang/String;
    //   482: astore #7
    //   484: aload #9
    //   486: aload #7
    //   488: ldc_w '30'
    //   491: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   496: invokestatic parseInt : (Ljava/lang/String;)I
    //   499: ifge -> 524
    //   502: aload #9
    //   504: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   509: aload #7
    //   511: ldc_w '30'
    //   514: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   519: invokeinterface apply : ()V
    //   524: iload_1
    //   525: bipush #123
    //   527: if_icmpgt -> 590
    //   530: aload #9
    //   532: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   537: ldc_w 'I_K_SRTBYF_AL'
    //   540: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   545: ldc_w 'I_K_SRTBYF_AR'
    //   548: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   553: ldc_w 'I_K_SRTBYF_ALAR'
    //   556: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   561: getstatic r3/IKWi/AyxAR.fJifARWDIY : Ljava/lang/String;
    //   564: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   569: ldc_w 'I_K_SRTBYF_F'
    //   572: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   577: ldc_w 'I_K_SRTBYF_PL'
    //   580: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   585: invokeinterface apply : ()V
    //   590: iload_1
    //   591: sipush #150
    //   594: if_icmplt -> 642
    //   597: iload_1
    //   598: sipush #154
    //   601: if_icmpgt -> 642
    //   604: invokestatic o : ()Landroid/content/SharedPreferences;
    //   607: ldc_w 'k_b_eqrefe'
    //   610: iconst_1
    //   611: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   616: istore #6
    //   618: invokestatic o : ()Landroid/content/SharedPreferences;
    //   621: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   626: ldc_w 'k_b_eqrefe'
    //   629: iload #6
    //   631: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   636: invokeinterface commit : ()Z
    //   641: pop
    //   642: iload_1
    //   643: sipush #158
    //   646: if_icmpgt -> 988
    //   649: invokestatic x : ()Landroid/content/SharedPreferences;
    //   652: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   657: ldc_w 'swcscshn'
    //   660: iconst_1
    //   661: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   666: invokeinterface commit : ()Z
    //   671: pop
    //   672: invokestatic o : ()Landroid/content/SharedPreferences;
    //   675: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   680: ldc_w 'k_i_boclalatnp'
    //   683: iconst_0
    //   684: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   689: invokeinterface commit : ()Z
    //   694: pop
    //   695: new java/util/HashSet
    //   698: astore #7
    //   700: aload #7
    //   702: invokestatic v : ()Landroid/content/SharedPreferences;
    //   705: invokeinterface getAll : ()Ljava/util/Map;
    //   710: invokeinterface keySet : ()Ljava/util/Set;
    //   715: invokespecial <init> : (Ljava/util/Collection;)V
    //   718: invokestatic v : ()Landroid/content/SharedPreferences;
    //   721: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   726: astore #11
    //   728: aload #7
    //   730: invokevirtual iterator : ()Ljava/util/Iterator;
    //   733: astore #12
    //   735: aload #12
    //   737: invokeinterface hasNext : ()Z
    //   742: ifeq -> 786
    //   745: aload #12
    //   747: invokeinterface next : ()Ljava/lang/Object;
    //   752: checkcast java/lang/String
    //   755: astore #7
    //   757: aload #7
    //   759: ldc_w 'SAF_S_URI_'
    //   762: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   765: ifeq -> 735
    //   768: aload #11
    //   770: aload #7
    //   772: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   777: pop
    //   778: goto -> 735
    //   781: astore #7
    //   783: goto -> 980
    //   786: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   789: iconst_0
    //   790: invokevirtual m : (Z)Ljava/util/ArrayList;
    //   793: astore #7
    //   795: new java/util/HashMap
    //   798: astore #12
    //   800: aload #12
    //   802: aload #7
    //   804: invokevirtual size : ()I
    //   807: invokespecial <init> : (I)V
    //   810: aload #7
    //   812: invokevirtual size : ()I
    //   815: istore_3
    //   816: iconst_0
    //   817: istore_2
    //   818: iload_2
    //   819: iload_3
    //   820: if_icmpge -> 860
    //   823: aload #7
    //   825: iload_2
    //   826: invokevirtual get : (I)Ljava/lang/Object;
    //   829: astore #13
    //   831: iinc #2, 1
    //   834: aload #13
    //   836: checkcast xp1
    //   839: astore #13
    //   841: aload #12
    //   843: aload #13
    //   845: invokevirtual b : ()Landroid/net/Uri;
    //   848: invokevirtual toString : ()Ljava/lang/String;
    //   851: aload #13
    //   853: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   856: pop
    //   857: goto -> 818
    //   860: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   863: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   866: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   869: invokevirtual getPersistedUriPermissions : ()Ljava/util/List;
    //   872: invokeinterface iterator : ()Ljava/util/Iterator;
    //   877: astore #7
    //   879: aload #7
    //   881: invokeinterface hasNext : ()Z
    //   886: ifeq -> 969
    //   889: aload #7
    //   891: invokeinterface next : ()Ljava/lang/Object;
    //   896: checkcast android/content/UriPermission
    //   899: invokevirtual getUri : ()Landroid/net/Uri;
    //   902: astore #13
    //   904: aload #13
    //   906: invokevirtual toString : ()Ljava/lang/String;
    //   909: astore #15
    //   911: aload #12
    //   913: aload #15
    //   915: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   918: checkcast xp1
    //   921: astore #14
    //   923: aload #14
    //   925: ifnull -> 966
    //   928: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   931: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   934: aload #13
    //   936: invokestatic g : (Landroid/content/Context;Landroid/net/Uri;)Lc91;
    //   939: invokevirtual f : ()Z
    //   942: ifeq -> 966
    //   945: aload #11
    //   947: aload #14
    //   949: getfield e : Ljava/lang/String;
    //   952: invokestatic Q : (Ljava/lang/String;)Ljava/lang/String;
    //   955: aload #15
    //   957: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   962: pop
    //   963: goto -> 966
    //   966: goto -> 879
    //   969: aload #11
    //   971: invokeinterface commit : ()Z
    //   976: pop
    //   977: goto -> 985
    //   980: aload #7
    //   982: invokevirtual printStackTrace : ()V
    //   985: invokestatic b : ()V
    //   988: iload_1
    //   989: sipush #196
    //   992: if_icmpgt -> 1033
    //   995: invokestatic o : ()Landroid/content/SharedPreferences;
    //   998: ldc_w 'I_K_SRTBYF_F'
    //   1001: iconst_0
    //   1002: invokeinterface getInt : (Ljava/lang/String;I)I
    //   1007: ifne -> 1033
    //   1010: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1013: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1018: ldc_w 'I_K_SRTBYF_F'
    //   1021: bipush #30
    //   1023: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1028: invokeinterface apply : ()V
    //   1033: iconst_2
    //   1034: istore_3
    //   1035: iload_1
    //   1036: sipush #197
    //   1039: if_icmpgt -> 1119
    //   1042: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1045: ldc_w 'k_b_fldjpg'
    //   1048: iconst_0
    //   1049: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   1054: ifeq -> 1079
    //   1057: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1060: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1065: ldc_w 'k_i_fldjpg'
    //   1068: iconst_2
    //   1069: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1074: invokeinterface apply : ()V
    //   1079: iconst_1
    //   1080: putstatic in/krosbits/musicolet/b.e : Z
    //   1083: invokestatic G : ()Z
    //   1086: ifeq -> 1119
    //   1089: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1092: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1097: ldc_w 'k_b_mn_crcbcm'
    //   1100: iconst_0
    //   1101: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   1106: ldc 'k_b_mn_crcbex'
    //   1108: iconst_0
    //   1109: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   1114: invokeinterface apply : ()V
    //   1119: iload_1
    //   1120: sipush #210
    //   1123: if_icmpgt -> 1239
    //   1126: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1129: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1132: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1135: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   1138: getfield locale : Ljava/util/Locale;
    //   1141: astore #7
    //   1143: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1146: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1149: aload #7
    //   1151: invokestatic P : (Landroid/content/Context;Ljava/util/Locale;)Z
    //   1154: ifne -> 1239
    //   1157: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1160: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1163: invokestatic q0 : (Landroid/content/Context;)Lko1;
    //   1166: aload #7
    //   1168: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   1171: invokeinterface d : (Ljava/util/List;)Ldu2;
    //   1176: pop
    //   1177: invokestatic g : ()Landroid/content/SharedPreferences;
    //   1180: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1185: ldc_w 'FSP_PLDC'
    //   1188: iconst_1
    //   1189: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   1194: invokeinterface apply : ()V
    //   1199: new java/lang/StringBuilder
    //   1202: astore #11
    //   1204: aload #11
    //   1206: invokespecial <init> : ()V
    //   1209: aload #11
    //   1211: ldc_w ''
    //   1214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1217: pop
    //   1218: aload #11
    //   1220: aload #7
    //   1222: invokevirtual toString : ()Ljava/lang/String;
    //   1225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1228: pop
    //   1229: iconst_0
    //   1230: aload #11
    //   1232: invokevirtual toString : ()Ljava/lang/String;
    //   1235: iconst_1
    //   1236: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   1239: iload_1
    //   1240: sipush #234
    //   1243: if_icmpgt -> 1316
    //   1246: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1249: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1254: astore #7
    //   1256: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1259: ldc_w 'etu'
    //   1262: ldc_w '0'
    //   1265: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1270: astore #11
    //   1272: aload #7
    //   1274: ldc 'etu2'
    //   1276: aload #11
    //   1278: invokestatic parseInt : (Ljava/lang/String;)I
    //   1281: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1286: pop
    //   1287: aload #7
    //   1289: invokeinterface apply : ()V
    //   1294: invokestatic g : ()Landroid/content/SharedPreferences;
    //   1297: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1302: ldc_w 'FSP_PRDVSFG'
    //   1305: iconst_1
    //   1306: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   1311: invokeinterface apply : ()V
    //   1316: iload_1
    //   1317: sipush #240
    //   1320: if_icmpgt -> 1408
    //   1323: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1326: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1331: astore #7
    //   1333: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1336: aload #10
    //   1338: aconst_null
    //   1339: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1344: astore #11
    //   1346: aload #11
    //   1348: ifnull -> 1374
    //   1351: aload #7
    //   1353: ldc_w 'k_i_aclaiacv'
    //   1356: aload #11
    //   1358: invokestatic parseInt : (Ljava/lang/String;)I
    //   1361: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1366: aload #10
    //   1368: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   1373: pop
    //   1374: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1377: bipush #30
    //   1379: if_icmplt -> 1401
    //   1382: aload #7
    //   1384: ldc_w 'k_b_st_ex_blayt'
    //   1387: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   1392: ldc_w 'k_i_nstl'
    //   1395: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   1400: pop
    //   1401: aload #7
    //   1403: invokeinterface apply : ()V
    //   1408: iload_1
    //   1409: sipush #265
    //   1412: if_icmpgt -> 1458
    //   1415: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1418: bipush #30
    //   1420: if_icmplt -> 1458
    //   1423: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1426: ldc_w 'k_i_nstl'
    //   1429: iconst_2
    //   1430: invokeinterface getInt : (Ljava/lang/String;I)I
    //   1435: istore_2
    //   1436: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1439: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1444: ldc_w 'k_i_nstl'
    //   1447: iload_2
    //   1448: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1453: invokeinterface apply : ()V
    //   1458: iload_1
    //   1459: sipush #271
    //   1462: if_icmpgt -> 1470
    //   1465: bipush #10
    //   1467: putstatic in/krosbits/musicolet/MyApplication.b : I
    //   1470: iload_1
    //   1471: sipush #282
    //   1474: if_icmpgt -> 1728
    //   1477: aload #9
    //   1479: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1484: astore #7
    //   1486: aload #9
    //   1488: ldc_w 'k_b_fdscnms'
    //   1491: iconst_0
    //   1492: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   1497: ifeq -> 1515
    //   1500: aload #7
    //   1502: ldc_w 'k_i_pfsnr'
    //   1505: iconst_1
    //   1506: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1511: pop
    //   1512: goto -> 1515
    //   1515: aload #9
    //   1517: ldc_w 'THMR_WT'
    //   1520: iconst_1
    //   1521: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   1526: istore #6
    //   1528: iload #6
    //   1530: ifeq -> 1547
    //   1533: aload #7
    //   1535: ldc 'k_i_wdth'
    //   1537: iconst_0
    //   1538: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1543: pop
    //   1544: goto -> 1558
    //   1547: aload #7
    //   1549: ldc 'k_i_wdth'
    //   1551: iconst_1
    //   1552: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1557: pop
    //   1558: invokestatic c0 : ()Z
    //   1561: ifeq -> 1614
    //   1564: aload #7
    //   1566: ldc_w 'k_b_sclnot'
    //   1569: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   1574: pop
    //   1575: aload #7
    //   1577: ldc_w 'k_i_mn_bg'
    //   1580: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   1585: pop
    //   1586: aload #9
    //   1588: ldc_w 'k_i_nstl'
    //   1591: getstatic jm1.d : I
    //   1594: invokeinterface getInt : (Ljava/lang/String;I)I
    //   1599: iconst_1
    //   1600: if_icmpne -> 1614
    //   1603: aload #7
    //   1605: ldc_w 'k_i_nstl'
    //   1608: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   1613: pop
    //   1614: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1617: bipush #30
    //   1619: if_icmplt -> 1654
    //   1622: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1625: ldc_w 'k_b_st_ex_blayt'
    //   1628: sipush #597
    //   1631: invokeinterface getInt : (Ljava/lang/String;I)I
    //   1636: invokestatic a : (I)I
    //   1639: iconst_4
    //   1640: if_icmple -> 1654
    //   1643: aload #7
    //   1645: ldc_w 'k_b_st_ex_blayt'
    //   1648: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   1653: pop
    //   1654: aload #7
    //   1656: invokeinterface apply : ()V
    //   1661: invokestatic x : ()Landroid/content/SharedPreferences;
    //   1664: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1669: ldc_w 's_disl2'
    //   1672: invokestatic currentTimeMillis : ()J
    //   1675: l2d
    //   1676: ldc2_w 1000.0
    //   1679: ddiv
    //   1680: ldc2_w 3600.0
    //   1683: ddiv
    //   1684: ldc2_w 24.0
    //   1687: ddiv
    //   1688: d2i
    //   1689: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1694: invokeinterface apply : ()V
    //   1699: invokestatic v : ()Landroid/content/SharedPreferences;
    //   1702: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1707: astore #7
    //   1709: aload #7
    //   1711: ldc_w 'SAF_B_LGCSTM'
    //   1714: iconst_1
    //   1715: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   1720: pop
    //   1721: aload #7
    //   1723: invokeinterface apply : ()V
    //   1728: iload_1
    //   1729: sipush #299
    //   1732: if_icmpgt -> 1783
    //   1735: invokestatic I : ()Z
    //   1738: ifeq -> 1783
    //   1741: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1744: bipush #30
    //   1746: if_icmpne -> 1783
    //   1749: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1752: ldc 'k_i_adt'
    //   1754: invokeinterface contains : (Ljava/lang/String;)Z
    //   1759: ifne -> 1783
    //   1762: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1765: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1770: ldc 'k_i_adt'
    //   1772: iconst_1
    //   1773: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1778: invokeinterface apply : ()V
    //   1783: iload_1
    //   1784: sipush #314
    //   1787: if_icmpgt -> 2110
    //   1790: aload #9
    //   1792: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   1797: astore #10
    //   1799: invokestatic c0 : ()Z
    //   1802: ifeq -> 1816
    //   1805: aload #10
    //   1807: ldc_w 'k_i_nstl'
    //   1810: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   1815: pop
    //   1816: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1819: ldc_w 'EQUPJA'
    //   1822: ldc_w '[]'
    //   1825: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1830: astore #7
    //   1832: aload #10
    //   1834: ldc_w 'EQUPJA'
    //   1837: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   1842: pop
    //   1843: aload #10
    //   1845: ldc_w 'EQUPJA_0'
    //   1848: aload #7
    //   1850: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   1855: pop
    //   1856: iconst_0
    //   1857: istore_2
    //   1858: aload #8
    //   1860: astore #7
    //   1862: iload_2
    //   1863: bipush #6
    //   1865: if_icmpge -> 2103
    //   1868: bipush #6
    //   1870: newarray int
    //   1872: dup
    //   1873: iconst_0
    //   1874: iconst_0
    //   1875: iastore
    //   1876: dup
    //   1877: iconst_1
    //   1878: iconst_1
    //   1879: iastore
    //   1880: dup
    //   1881: iconst_2
    //   1882: iconst_2
    //   1883: iastore
    //   1884: dup
    //   1885: iconst_3
    //   1886: iconst_3
    //   1887: iastore
    //   1888: dup
    //   1889: iconst_4
    //   1890: iconst_4
    //   1891: iastore
    //   1892: dup
    //   1893: iconst_5
    //   1894: iconst_5
    //   1895: iastore
    //   1896: iload_2
    //   1897: iaload
    //   1898: istore #4
    //   1900: new java/lang/StringBuilder
    //   1903: astore #8
    //   1905: aload #8
    //   1907: invokespecial <init> : ()V
    //   1910: aload #8
    //   1912: ldc_w 'EQSELP_'
    //   1915: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1918: pop
    //   1919: aload #8
    //   1921: iload #4
    //   1923: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1926: pop
    //   1927: aload #8
    //   1929: invokevirtual toString : ()Ljava/lang/String;
    //   1932: astore #11
    //   1934: invokestatic o : ()Landroid/content/SharedPreferences;
    //   1937: aload #11
    //   1939: iconst_0
    //   1940: invokeinterface getInt : (Ljava/lang/String;I)I
    //   1945: istore #5
    //   1947: aload #10
    //   1949: aload #11
    //   1951: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   1956: pop
    //   1957: new java/lang/StringBuilder
    //   1960: astore #8
    //   1962: aload #8
    //   1964: invokespecial <init> : ()V
    //   1967: aload #8
    //   1969: aload #11
    //   1971: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1974: pop
    //   1975: aload #8
    //   1977: aload #7
    //   1979: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1982: pop
    //   1983: aload #10
    //   1985: aload #8
    //   1987: invokevirtual toString : ()Ljava/lang/String;
    //   1990: iload #5
    //   1992: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   1997: pop
    //   1998: new java/lang/StringBuilder
    //   2001: astore #8
    //   2003: aload #8
    //   2005: invokespecial <init> : ()V
    //   2008: aload #8
    //   2010: ldc_w 'CEQPR_'
    //   2013: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2016: pop
    //   2017: aload #8
    //   2019: iload #4
    //   2021: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2024: pop
    //   2025: aload #8
    //   2027: invokevirtual toString : ()Ljava/lang/String;
    //   2030: astore #12
    //   2032: aload #9
    //   2034: aload #12
    //   2036: ldc_w '[]'
    //   2039: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2044: astore #11
    //   2046: aload #10
    //   2048: aload #12
    //   2050: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   2055: pop
    //   2056: new java/lang/StringBuilder
    //   2059: astore #8
    //   2061: aload #8
    //   2063: invokespecial <init> : ()V
    //   2066: aload #8
    //   2068: aload #12
    //   2070: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2073: pop
    //   2074: aload #8
    //   2076: aload #7
    //   2078: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2081: pop
    //   2082: aload #10
    //   2084: aload #8
    //   2086: invokevirtual toString : ()Ljava/lang/String;
    //   2089: aload #11
    //   2091: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   2096: pop
    //   2097: iinc #2, 1
    //   2100: goto -> 1862
    //   2103: aload #10
    //   2105: invokeinterface apply : ()V
    //   2110: iload_1
    //   2111: sipush #363
    //   2114: if_icmpgt -> 2128
    //   2117: getstatic android/os/Build$VERSION.SDK_INT : I
    //   2120: bipush #33
    //   2122: if_icmplt -> 2128
    //   2125: invokestatic L : ()V
    //   2128: iload_1
    //   2129: sipush #392
    //   2132: if_icmpgt -> 2179
    //   2135: invokestatic u : ()Landroid/content/SharedPreferences;
    //   2138: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   2143: ldc_w 'R_b_RPUMS'
    //   2146: iconst_0
    //   2147: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   2152: invokeinterface apply : ()V
    //   2157: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2160: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   2165: ldc_w 'k_b_usmpspm'
    //   2168: iconst_0
    //   2169: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   2174: invokeinterface apply : ()V
    //   2179: iload_1
    //   2180: sipush #401
    //   2183: if_icmpgt -> 2197
    //   2186: getstatic android/os/Build$VERSION.SDK_INT : I
    //   2189: bipush #33
    //   2191: if_icmplt -> 2197
    //   2194: invokestatic V : ()V
    //   2197: iload_1
    //   2198: sipush #434
    //   2201: if_icmpgt -> 2313
    //   2204: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2207: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   2212: astore #7
    //   2214: aload #7
    //   2216: ldc_w 'k_f_plyspd4'
    //   2219: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2222: ldc_w 'k_f_plyspd'
    //   2225: bipush #100
    //   2227: invokeinterface getInt : (Ljava/lang/String;I)I
    //   2232: bipush #100
    //   2234: imul
    //   2235: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   2240: pop
    //   2241: aload #7
    //   2243: ldc_w 'k_f_plyptch4'
    //   2246: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2249: ldc_w 'k_f_plyptch'
    //   2252: bipush #100
    //   2254: invokeinterface getInt : (Ljava/lang/String;I)I
    //   2259: bipush #100
    //   2261: imul
    //   2262: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   2267: pop
    //   2268: getstatic org/jaudiotagger/tag/mp4/bKj/fXMDNeMWaILNVh.QMnY : Ljava/lang/String;
    //   2271: astore #8
    //   2273: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2276: ldc_w 'k_b_ffrwnp'
    //   2279: iconst_1
    //   2280: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   2285: ifeq -> 2293
    //   2288: iload_3
    //   2289: istore_2
    //   2290: goto -> 2295
    //   2293: iconst_0
    //   2294: istore_2
    //   2295: aload #7
    //   2297: aload #8
    //   2299: iload_2
    //   2300: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   2305: pop
    //   2306: aload #7
    //   2308: invokeinterface apply : ()V
    //   2313: iload_1
    //   2314: sipush #449
    //   2317: if_icmpgt -> 2379
    //   2320: new java/io/File
    //   2323: astore #7
    //   2325: aload #7
    //   2327: aload_0
    //   2328: invokevirtual getCacheDir : ()Ljava/io/File;
    //   2331: ldc_w 'lrc_c'
    //   2334: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   2337: aload #7
    //   2339: invokevirtual isDirectory : ()Z
    //   2342: ifeq -> 2379
    //   2345: aload #7
    //   2347: invokevirtual listFiles : ()[Ljava/io/File;
    //   2350: astore_0
    //   2351: aload_0
    //   2352: arraylength
    //   2353: istore_3
    //   2354: iconst_0
    //   2355: istore_2
    //   2356: iload_2
    //   2357: iload_3
    //   2358: if_icmpge -> 2379
    //   2361: aload_0
    //   2362: iload_2
    //   2363: aaload
    //   2364: invokevirtual delete : ()Z
    //   2367: pop
    //   2368: iinc #2, 1
    //   2371: goto -> 2356
    //   2374: astore_0
    //   2375: aload_0
    //   2376: invokevirtual printStackTrace : ()V
    //   2379: iload_1
    //   2380: sipush #469
    //   2383: if_icmpgt -> 2496
    //   2386: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2389: ldc_w 'k_i_slptrh_h'
    //   2392: iconst_0
    //   2393: invokeinterface getInt : (Ljava/lang/String;I)I
    //   2398: istore_3
    //   2399: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2402: ldc_w 'k_i_slptrh_m'
    //   2405: iconst_0
    //   2406: invokeinterface getInt : (Ljava/lang/String;I)I
    //   2411: istore_2
    //   2412: iload_3
    //   2413: ifgt -> 2420
    //   2416: iload_2
    //   2417: ifle -> 2425
    //   2420: iload_3
    //   2421: iload_2
    //   2422: invokestatic c : (II)V
    //   2425: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2428: ldc_w 'k_i_slptrh_n'
    //   2431: iconst_0
    //   2432: invokeinterface getInt : (Ljava/lang/String;I)I
    //   2437: istore_2
    //   2438: iload_2
    //   2439: ifle -> 2446
    //   2442: iload_2
    //   2443: invokestatic d : (I)V
    //   2446: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2449: ldc_w 'k_imbgnp'
    //   2452: iconst_1
    //   2453: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   2458: istore #6
    //   2460: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2463: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   2468: astore_0
    //   2469: iload #6
    //   2471: ifeq -> 2479
    //   2474: iconst_3
    //   2475: istore_2
    //   2476: goto -> 2481
    //   2479: iconst_0
    //   2480: istore_2
    //   2481: aload_0
    //   2482: ldc_w 'k_i_npblam'
    //   2485: iload_2
    //   2486: invokeinterface putInt : (Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //   2491: invokeinterface apply : ()V
    //   2496: iload_1
    //   2497: sipush #504
    //   2500: if_icmpgt -> 2540
    //   2503: invokestatic v : ()Landroid/content/SharedPreferences;
    //   2506: ldc_w 'SAF_S_ATBKPFL'
    //   2509: aconst_null
    //   2510: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2515: ifnonnull -> 2540
    //   2518: invokestatic o : ()Landroid/content/SharedPreferences;
    //   2521: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   2526: ldc_w 'k_b_udnidcbkf'
    //   2529: iconst_1
    //   2530: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   2535: invokeinterface apply : ()V
    //   2540: iconst_1
    //   2541: putstatic in/krosbits/musicolet/b.a : Z
    //   2544: iload_1
    //   2545: sipush #290
    //   2548: if_icmplt -> 2555
    //   2551: iconst_0
    //   2552: putstatic in/krosbits/musicolet/b.a : Z
    //   2555: invokestatic g : ()Landroid/content/SharedPreferences;
    //   2558: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   2563: ldc_w 'FSP_WPA'
    //   2566: iconst_0
    //   2567: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   2572: invokeinterface commit : ()Z
    //   2577: pop
    //   2578: return
    //   2579: astore_0
    //   2580: aload_0
    //   2581: invokevirtual printStackTrace : ()V
    //   2584: return
    //   2585: astore #7
    //   2587: goto -> 969
    //   2590: astore #11
    //   2592: goto -> 1287
    //   2595: astore #10
    //   2597: goto -> 1374
    // Exception table:
    //   from	to	target	type
    //   10	55	2579	finally
    //   73	78	2579	finally
    //   78	94	2579	finally
    //   99	170	2579	finally
    //   175	219	2579	finally
    //   231	266	2579	finally
    //   272	296	2579	finally
    //   296	303	2579	finally
    //   315	365	2579	finally
    //   377	383	2579	finally
    //   400	420	2579	finally
    //   425	430	2579	finally
    //   436	459	2579	finally
    //   465	469	2579	finally
    //   475	524	2579	finally
    //   530	590	2579	finally
    //   604	642	2579	finally
    //   649	695	2579	finally
    //   695	735	781	finally
    //   735	778	781	finally
    //   786	816	2585	java/lang/Exception
    //   786	816	781	finally
    //   823	831	2585	java/lang/Exception
    //   823	831	781	finally
    //   834	857	2585	java/lang/Exception
    //   834	857	781	finally
    //   860	879	2585	java/lang/Exception
    //   860	879	781	finally
    //   879	923	2585	java/lang/Exception
    //   879	923	781	finally
    //   928	963	2585	java/lang/Exception
    //   928	963	781	finally
    //   969	977	781	finally
    //   980	985	2579	finally
    //   985	988	2579	finally
    //   995	1033	2579	finally
    //   1042	1079	2579	finally
    //   1079	1119	2579	finally
    //   1126	1239	2579	finally
    //   1246	1272	2579	finally
    //   1272	1287	2590	java/lang/NumberFormatException
    //   1272	1287	2579	finally
    //   1287	1316	2579	finally
    //   1323	1346	2579	finally
    //   1351	1374	2595	java/lang/NumberFormatException
    //   1351	1374	2579	finally
    //   1374	1401	2579	finally
    //   1401	1408	2579	finally
    //   1415	1458	2579	finally
    //   1465	1470	2579	finally
    //   1477	1512	2579	finally
    //   1515	1528	2579	finally
    //   1533	1544	2579	finally
    //   1547	1558	2579	finally
    //   1558	1614	2579	finally
    //   1614	1654	2579	finally
    //   1654	1728	2579	finally
    //   1735	1783	2579	finally
    //   1790	1816	2579	finally
    //   1816	1856	2579	finally
    //   1868	2097	2579	finally
    //   2103	2110	2579	finally
    //   2117	2128	2579	finally
    //   2135	2179	2579	finally
    //   2186	2197	2579	finally
    //   2204	2288	2579	finally
    //   2295	2313	2579	finally
    //   2320	2354	2374	finally
    //   2361	2368	2374	finally
    //   2375	2379	2579	finally
    //   2386	2412	2579	finally
    //   2420	2425	2579	finally
    //   2425	2438	2579	finally
    //   2442	2446	2579	finally
    //   2446	2469	2579	finally
    //   2481	2496	2579	finally
    //   2503	2540	2579	finally
    //   2540	2544	2579	finally
    //   2551	2555	2579	finally
    //   2555	2578	2579	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */