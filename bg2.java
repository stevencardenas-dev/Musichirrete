import android.content.Context;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class bg2 implements dw1, p20, ke2, jf2, zl2, ue2 {
  public static final bg2 c = new bg2(8);
  
  public static final bg2 e = new bg2(11);
  
  public final int b;
  
  public static final sl2 f(Object<Object, Object> paramObject1, Object<Object, Object> paramObject2) {
    sl2 sl21 = (sl2)paramObject1;
    sl2 sl22 = (sl2)paramObject2;
    paramObject2 = (Object<Object, Object>)sl21;
    if (!sl22.isEmpty()) {
      paramObject1 = (Object<Object, Object>)sl21;
      if (!sl21.b)
        if (sl21.isEmpty()) {
          paramObject1 = (Object<Object, Object>)new sl2();
        } else {
          paramObject1 = (Object<Object, Object>)new LinkedHashMap<Object, Object>(sl21);
          ((sl2)paramObject1).b = true;
        }  
      paramObject1.b();
      paramObject2 = paramObject1;
      if (!sl22.isEmpty()) {
        paramObject1.putAll(sl22);
        paramObject2 = paramObject1;
      } 
    } 
    return (sl2)paramObject2;
  }
  
  public Object a() {
    rp0 rp0;
    kj kj;
    switch (this.b) {
      default:
        rp0 = gc2.v;
        rp0 = kj.k;
        n21.j();
        kj = kj.m;
        n21.m(kj);
        n21.j();
        return kj.e.b;
      case 8:
        break;
    } 
    throw new IllegalStateException();
  }
  
  public Object apply(Object paramObject) {
    return ((fo2)paramObject).b();
  }
  
  public Object[] b(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2) {
    return (Object[])n21.a0(paramObject, "makePathElements", Object[].class, List.class, paramArrayList1);
  }
  
  public int c(Context paramContext) {
    try {
      StringBuilder stringBuilder1;
      ClassLoader classLoader = paramContext.getApplicationContext().getClassLoader();
      null = "com.google.android.gms.cast.framework.dynamite".length();
      StringBuilder stringBuilder2 = new StringBuilder();
      this(null + 61);
      stringBuilder2.append("com.google.android.gms.dynamite.descriptors.com.google.android.gms.cast.framework.dynamite.ModuleDescriptor");
      Class<?> clazz = classLoader.loadClass(stringBuilder2.toString());
      Field field1 = clazz.getDeclaredField("MODULE_ID");
      Field field2 = clazz.getDeclaredField("MODULE_VERSION");
      if (!z51.g(field1.get(null), "com.google.android.gms.cast.framework.dynamite")) {
        String str = String.valueOf(field1.get(null));
        null = str.length();
        int i = "com.google.android.gms.cast.framework.dynamite".length();
        stringBuilder1 = new StringBuilder();
        this(null + 50 + i + 1);
        stringBuilder1.append("Module descriptor id '");
        stringBuilder1.append(str);
        stringBuilder1.append("' didn't match expected id 'com.google.android.gms.cast.framework.dynamite'");
        Log.e("DynamiteModule", stringBuilder1.toString());
        return 0;
      } 
      return stringBuilder1.getInt(null);
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder("com.google.android.gms.cast.framework.dynamite".length() + 45);
      stringBuilder.append("Local module descriptor class for com.google.android.gms.cast.framework.dynamite not found.");
      Log.w("DynamiteModule", stringBuilder.toString());
    } catch (Exception exception) {
      Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(exception.getMessage())));
    } 
    return 0;
  }
  
  public boolean d(Object paramObject, File paramFile1, File paramFile2) {
    return true;
  }
  
  public int e(Context paramContext, boolean paramBoolean) {
    // Byte code:
    //   0: ldc r20
    //   2: monitorenter
    //   3: getstatic r20.c : Ljava/lang/Boolean;
    //   6: astore #11
    //   8: iconst_1
    //   9: istore #4
    //   11: aconst_null
    //   12: astore #8
    //   14: aconst_null
    //   15: astore #10
    //   17: aconst_null
    //   18: astore #9
    //   20: iconst_0
    //   21: istore_3
    //   22: aload #11
    //   24: astore #7
    //   26: aload #11
    //   28: ifnonnull -> 420
    //   31: aload_1
    //   32: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   35: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   38: ldc com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader
    //   40: invokevirtual getName : ()Ljava/lang/String;
    //   43: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   46: ldc 'sClassLoader'
    //   48: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   51: astore #12
    //   53: aload #12
    //   55: invokevirtual getDeclaringClass : ()Ljava/lang/Class;
    //   58: astore #11
    //   60: aload #11
    //   62: monitorenter
    //   63: aload #12
    //   65: aconst_null
    //   66: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   69: checkcast java/lang/ClassLoader
    //   72: astore #7
    //   74: aload #7
    //   76: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   79: if_acmpne -> 95
    //   82: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   85: astore #7
    //   87: goto -> 329
    //   90: astore #7
    //   92: goto -> 335
    //   95: aload #7
    //   97: ifnull -> 113
    //   100: aload #7
    //   102: invokestatic d : (Ljava/lang/ClassLoader;)V
    //   105: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   108: astore #7
    //   110: goto -> 329
    //   113: aload_1
    //   114: invokestatic b : (Landroid/content/Context;)Z
    //   117: ifne -> 133
    //   120: aload #11
    //   122: monitorexit
    //   123: ldc r20
    //   125: monitorexit
    //   126: iconst_0
    //   127: ireturn
    //   128: astore #7
    //   130: goto -> 1212
    //   133: getstatic r20.e : Z
    //   136: ifne -> 315
    //   139: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   142: astore #13
    //   144: aload #13
    //   146: aconst_null
    //   147: invokevirtual equals : (Ljava/lang/Object;)Z
    //   150: istore #6
    //   152: iload #6
    //   154: ifeq -> 160
    //   157: goto -> 315
    //   160: aload_1
    //   161: iload_2
    //   162: iconst_1
    //   163: invokestatic c : (Landroid/content/Context;ZZ)I
    //   166: istore #5
    //   168: getstatic r20.d : Ljava/lang/String;
    //   171: astore #7
    //   173: aload #7
    //   175: ifnull -> 287
    //   178: aload #7
    //   180: invokevirtual isEmpty : ()Z
    //   183: ifeq -> 189
    //   186: goto -> 287
    //   189: invokestatic v0 : ()Ljava/lang/ClassLoader;
    //   192: astore #7
    //   194: aload #7
    //   196: ifnull -> 202
    //   199: goto -> 260
    //   202: getstatic android/os/Build$VERSION.SDK_INT : I
    //   205: bipush #29
    //   207: if_icmplt -> 236
    //   210: invokestatic b : ()V
    //   213: getstatic r20.d : Ljava/lang/String;
    //   216: astore #7
    //   218: aload #7
    //   220: invokestatic m : (Ljava/lang/Object;)V
    //   223: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   226: aload #7
    //   228: invokestatic a : (Ljava/lang/ClassLoader;Ljava/lang/String;)Ldalvik/system/DelegateLastClassLoader;
    //   231: astore #7
    //   233: goto -> 260
    //   236: getstatic r20.d : Ljava/lang/String;
    //   239: astore #7
    //   241: aload #7
    //   243: invokestatic m : (Ljava/lang/Object;)V
    //   246: new dalvik/system/PathClassLoader
    //   249: dup
    //   250: aload #7
    //   252: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   255: invokespecial <init> : (Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   258: astore #7
    //   260: aload #7
    //   262: invokestatic d : (Ljava/lang/ClassLoader;)V
    //   265: aload #12
    //   267: aconst_null
    //   268: aload #7
    //   270: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   273: aload #13
    //   275: putstatic r20.c : Ljava/lang/Boolean;
    //   278: aload #11
    //   280: monitorexit
    //   281: ldc r20
    //   283: monitorexit
    //   284: iload #5
    //   286: ireturn
    //   287: aload #11
    //   289: monitorexit
    //   290: ldc r20
    //   292: monitorexit
    //   293: iload #5
    //   295: ireturn
    //   296: astore #7
    //   298: aload #12
    //   300: aconst_null
    //   301: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   304: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   307: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   310: astore #7
    //   312: goto -> 329
    //   315: aload #12
    //   317: aconst_null
    //   318: invokestatic getSystemClassLoader : ()Ljava/lang/ClassLoader;
    //   321: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   324: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   327: astore #7
    //   329: aload #11
    //   331: monitorexit
    //   332: goto -> 415
    //   335: aload #11
    //   337: monitorexit
    //   338: aload #7
    //   340: athrow
    //   341: astore #7
    //   343: goto -> 353
    //   346: astore #7
    //   348: goto -> 353
    //   351: astore #7
    //   353: aload #7
    //   355: invokevirtual toString : ()Ljava/lang/String;
    //   358: astore #7
    //   360: aload #7
    //   362: invokevirtual length : ()I
    //   365: istore #5
    //   367: new java/lang/StringBuilder
    //   370: astore #11
    //   372: aload #11
    //   374: iload #5
    //   376: bipush #30
    //   378: iadd
    //   379: invokespecial <init> : (I)V
    //   382: aload #11
    //   384: ldc_w 'Failed to load module via V2: '
    //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: pop
    //   391: aload #11
    //   393: aload #7
    //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: ldc 'DynamiteModule'
    //   401: aload #11
    //   403: invokevirtual toString : ()Ljava/lang/String;
    //   406: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   409: pop
    //   410: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   413: astore #7
    //   415: aload #7
    //   417: putstatic r20.c : Ljava/lang/Boolean;
    //   420: ldc r20
    //   422: monitorexit
    //   423: aload #7
    //   425: invokevirtual booleanValue : ()Z
    //   428: istore #6
    //   430: iload #6
    //   432: ifeq -> 520
    //   435: aload_1
    //   436: iload_2
    //   437: iconst_0
    //   438: invokestatic c : (Landroid/content/Context;ZZ)I
    //   441: istore_2
    //   442: goto -> 1195
    //   445: astore #7
    //   447: goto -> 1218
    //   450: astore #8
    //   452: getstatic androidx/recyclerview/widget/dVrV/jLnXOLx.UhiocFfKU : Ljava/lang/String;
    //   455: astore #7
    //   457: aload #8
    //   459: invokevirtual getMessage : ()Ljava/lang/String;
    //   462: astore #8
    //   464: aload #8
    //   466: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   469: invokevirtual length : ()I
    //   472: istore_2
    //   473: new java/lang/StringBuilder
    //   476: astore #9
    //   478: aload #9
    //   480: iload_2
    //   481: bipush #42
    //   483: iadd
    //   484: invokespecial <init> : (I)V
    //   487: aload #9
    //   489: ldc_w 'Failed to retrieve remote module version: '
    //   492: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: pop
    //   496: aload #9
    //   498: aload #8
    //   500: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   503: pop
    //   504: aload #7
    //   506: aload #9
    //   508: invokevirtual toString : ()Ljava/lang/String;
    //   511: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   514: pop
    //   515: iload_3
    //   516: istore_2
    //   517: goto -> 1195
    //   520: aload_1
    //   521: invokestatic e : (Landroid/content/Context;)Lrp2;
    //   524: astore #11
    //   526: aload #11
    //   528: ifnonnull -> 536
    //   531: iload_3
    //   532: istore_2
    //   533: goto -> 1195
    //   536: aload #8
    //   538: astore #7
    //   540: aload #11
    //   542: aload #11
    //   544: invokevirtual o : ()Landroid/os/Parcel;
    //   547: bipush #6
    //   549: invokevirtual m : (Landroid/os/Parcel;I)Landroid/os/Parcel;
    //   552: astore #12
    //   554: aload #8
    //   556: astore #7
    //   558: aload #12
    //   560: invokevirtual readInt : ()I
    //   563: istore #5
    //   565: aload #8
    //   567: astore #7
    //   569: aload #12
    //   571: invokevirtual recycle : ()V
    //   574: iload #5
    //   576: iconst_3
    //   577: if_icmplt -> 865
    //   580: aload #8
    //   582: astore #7
    //   584: getstatic r20.h : Ljava/lang/ThreadLocal;
    //   587: astore #12
    //   589: aload #8
    //   591: astore #7
    //   593: aload #12
    //   595: invokevirtual get : ()Ljava/lang/Object;
    //   598: checkcast ep2
    //   601: astore #13
    //   603: aload #13
    //   605: ifnull -> 640
    //   608: aload #8
    //   610: astore #7
    //   612: aload #13
    //   614: getfield a : Landroid/database/Cursor;
    //   617: astore #13
    //   619: aload #13
    //   621: ifnull -> 640
    //   624: aload #8
    //   626: astore #7
    //   628: aload #13
    //   630: iconst_0
    //   631: invokeinterface getInt : (I)I
    //   636: istore_2
    //   637: goto -> 1195
    //   640: aload #8
    //   642: astore #7
    //   644: new j31
    //   647: astore #13
    //   649: aload #8
    //   651: astore #7
    //   653: aload #13
    //   655: aload_1
    //   656: invokespecial <init> : (Ljava/lang/Object;)V
    //   659: aload #8
    //   661: astore #7
    //   663: aload #11
    //   665: aload #13
    //   667: iload_2
    //   668: getstatic r20.i : Lrf;
    //   671: invokevirtual get : ()Ljava/lang/Object;
    //   674: checkcast java/lang/Long
    //   677: invokevirtual longValue : ()J
    //   680: invokevirtual u0 : (Lj31;ZJ)Lsg0;
    //   683: invokestatic q0 : (Lsg0;)Ljava/lang/Object;
    //   686: checkcast android/database/Cursor
    //   689: astore #8
    //   691: aload #8
    //   693: ifnull -> 805
    //   696: aload #8
    //   698: invokeinterface moveToFirst : ()Z
    //   703: ifne -> 709
    //   706: goto -> 805
    //   709: aload #8
    //   711: iconst_0
    //   712: invokeinterface getInt : (I)I
    //   717: istore #5
    //   719: iload #5
    //   721: ifle -> 773
    //   724: aload #12
    //   726: invokevirtual get : ()Ljava/lang/Object;
    //   729: checkcast ep2
    //   732: astore #7
    //   734: aload #7
    //   736: ifnull -> 760
    //   739: aload #7
    //   741: getfield a : Landroid/database/Cursor;
    //   744: ifnonnull -> 760
    //   747: aload #7
    //   749: aload #8
    //   751: putfield a : Landroid/database/Cursor;
    //   754: iload #4
    //   756: istore_2
    //   757: goto -> 762
    //   760: iconst_0
    //   761: istore_2
    //   762: iload_2
    //   763: ifeq -> 773
    //   766: aload #9
    //   768: astore #7
    //   770: goto -> 777
    //   773: aload #8
    //   775: astore #7
    //   777: aload #7
    //   779: ifnull -> 789
    //   782: aload #7
    //   784: invokeinterface close : ()V
    //   789: iload #5
    //   791: istore_2
    //   792: goto -> 1195
    //   795: astore #9
    //   797: goto -> 833
    //   800: astore #7
    //   802: goto -> 844
    //   805: ldc 'DynamiteModule'
    //   807: ldc_w 'Failed to retrieve remote module version.'
    //   810: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   813: pop
    //   814: iload_3
    //   815: istore_2
    //   816: aload #8
    //   818: ifnull -> 1195
    //   821: aload #8
    //   823: invokeinterface close : ()V
    //   828: iload_3
    //   829: istore_2
    //   830: goto -> 1195
    //   833: aload #8
    //   835: astore #7
    //   837: aload #9
    //   839: astore #8
    //   841: goto -> 1197
    //   844: aload #7
    //   846: astore #9
    //   848: goto -> 1093
    //   851: astore #8
    //   853: goto -> 1197
    //   856: astore #9
    //   858: aload #10
    //   860: astore #8
    //   862: goto -> 1093
    //   865: iload #5
    //   867: iconst_2
    //   868: if_icmpne -> 982
    //   871: aload #8
    //   873: astore #7
    //   875: ldc 'DynamiteModule'
    //   877: getstatic androidx/recyclerview/widget/dVrV/jLnXOLx.tGomyyLGJax : Ljava/lang/String;
    //   880: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   883: pop
    //   884: aload #8
    //   886: astore #7
    //   888: new j31
    //   891: astore #9
    //   893: aload #8
    //   895: astore #7
    //   897: aload #9
    //   899: aload_1
    //   900: invokespecial <init> : (Ljava/lang/Object;)V
    //   903: aload #8
    //   905: astore #7
    //   907: aload #11
    //   909: invokevirtual o : ()Landroid/os/Parcel;
    //   912: astore #12
    //   914: aload #8
    //   916: astore #7
    //   918: aload #12
    //   920: aload #9
    //   922: invokestatic b : (Landroid/os/Parcel;Landroid/os/IInterface;)V
    //   925: aload #8
    //   927: astore #7
    //   929: aload #12
    //   931: ldc 'com.google.android.gms.cast.framework.dynamite'
    //   933: invokevirtual writeString : (Ljava/lang/String;)V
    //   936: aload #8
    //   938: astore #7
    //   940: aload #12
    //   942: iload_2
    //   943: invokevirtual writeInt : (I)V
    //   946: aload #8
    //   948: astore #7
    //   950: aload #11
    //   952: aload #12
    //   954: iconst_5
    //   955: invokevirtual m : (Landroid/os/Parcel;I)Landroid/os/Parcel;
    //   958: astore #9
    //   960: aload #8
    //   962: astore #7
    //   964: aload #9
    //   966: invokevirtual readInt : ()I
    //   969: istore_2
    //   970: aload #8
    //   972: astore #7
    //   974: aload #9
    //   976: invokevirtual recycle : ()V
    //   979: goto -> 1195
    //   982: aload #8
    //   984: astore #7
    //   986: ldc 'DynamiteModule'
    //   988: ldc_w 'IDynamite loader version < 2, falling back to getModuleVersion2'
    //   991: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   994: pop
    //   995: aload #8
    //   997: astore #7
    //   999: new j31
    //   1002: astore #12
    //   1004: aload #8
    //   1006: astore #7
    //   1008: aload #12
    //   1010: aload_1
    //   1011: invokespecial <init> : (Ljava/lang/Object;)V
    //   1014: aload #8
    //   1016: astore #7
    //   1018: aload #11
    //   1020: invokevirtual o : ()Landroid/os/Parcel;
    //   1023: astore #9
    //   1025: aload #8
    //   1027: astore #7
    //   1029: aload #9
    //   1031: aload #12
    //   1033: invokestatic b : (Landroid/os/Parcel;Landroid/os/IInterface;)V
    //   1036: aload #8
    //   1038: astore #7
    //   1040: aload #9
    //   1042: ldc 'com.google.android.gms.cast.framework.dynamite'
    //   1044: invokevirtual writeString : (Ljava/lang/String;)V
    //   1047: aload #8
    //   1049: astore #7
    //   1051: aload #9
    //   1053: iload_2
    //   1054: invokevirtual writeInt : (I)V
    //   1057: aload #8
    //   1059: astore #7
    //   1061: aload #11
    //   1063: aload #9
    //   1065: iconst_3
    //   1066: invokevirtual m : (Landroid/os/Parcel;I)Landroid/os/Parcel;
    //   1069: astore #9
    //   1071: aload #8
    //   1073: astore #7
    //   1075: aload #9
    //   1077: invokevirtual readInt : ()I
    //   1080: istore_2
    //   1081: aload #8
    //   1083: astore #7
    //   1085: aload #9
    //   1087: invokevirtual recycle : ()V
    //   1090: goto -> 979
    //   1093: aload #8
    //   1095: astore #7
    //   1097: aload #9
    //   1099: invokevirtual getMessage : ()Ljava/lang/String;
    //   1102: astore #9
    //   1104: aload #8
    //   1106: astore #7
    //   1108: aload #9
    //   1110: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1113: invokevirtual length : ()I
    //   1116: istore_2
    //   1117: aload #8
    //   1119: astore #7
    //   1121: new java/lang/StringBuilder
    //   1124: astore #10
    //   1126: aload #8
    //   1128: astore #7
    //   1130: aload #10
    //   1132: iload_2
    //   1133: bipush #42
    //   1135: iadd
    //   1136: invokespecial <init> : (I)V
    //   1139: aload #8
    //   1141: astore #7
    //   1143: aload #10
    //   1145: ldc_w 'Failed to retrieve remote module version: '
    //   1148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1151: pop
    //   1152: aload #8
    //   1154: astore #7
    //   1156: aload #10
    //   1158: aload #9
    //   1160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1163: pop
    //   1164: aload #8
    //   1166: astore #7
    //   1168: ldc 'DynamiteModule'
    //   1170: aload #10
    //   1172: invokevirtual toString : ()Ljava/lang/String;
    //   1175: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1178: pop
    //   1179: iload_3
    //   1180: istore_2
    //   1181: aload #8
    //   1183: ifnull -> 1195
    //   1186: aload #8
    //   1188: invokeinterface close : ()V
    //   1193: iload_3
    //   1194: istore_2
    //   1195: iload_2
    //   1196: ireturn
    //   1197: aload #7
    //   1199: ifnull -> 1209
    //   1202: aload #7
    //   1204: invokeinterface close : ()V
    //   1209: aload #8
    //   1211: athrow
    //   1212: ldc r20
    //   1214: monitorexit
    //   1215: aload #7
    //   1217: athrow
    //   1218: aload_1
    //   1219: invokestatic m : (Ljava/lang/Object;)V
    //   1222: goto -> 1237
    //   1225: astore_1
    //   1226: ldc_w 'CrashUtils'
    //   1229: ldc_w 'Error adding exception to DropBox!'
    //   1232: aload_1
    //   1233: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1236: pop
    //   1237: aload #7
    //   1239: athrow
    //   1240: astore #7
    //   1242: goto -> 105
    // Exception table:
    //   from	to	target	type
    //   0	3	445	finally
    //   3	8	128	finally
    //   31	63	351	java/lang/ClassNotFoundException
    //   31	63	346	java/lang/IllegalAccessException
    //   31	63	341	java/lang/NoSuchFieldException
    //   31	63	128	finally
    //   63	87	90	finally
    //   100	105	1240	o20
    //   100	105	90	finally
    //   105	110	90	finally
    //   113	123	90	finally
    //   123	126	128	finally
    //   133	152	90	finally
    //   160	173	296	o20
    //   160	173	90	finally
    //   178	186	296	o20
    //   178	186	90	finally
    //   189	194	296	o20
    //   189	194	90	finally
    //   202	233	296	o20
    //   202	233	90	finally
    //   236	260	296	o20
    //   236	260	90	finally
    //   260	278	296	o20
    //   260	278	90	finally
    //   278	281	90	finally
    //   281	284	128	finally
    //   287	290	90	finally
    //   290	293	128	finally
    //   298	312	90	finally
    //   315	329	90	finally
    //   329	332	90	finally
    //   335	338	90	finally
    //   338	341	351	java/lang/ClassNotFoundException
    //   338	341	346	java/lang/IllegalAccessException
    //   338	341	341	java/lang/NoSuchFieldException
    //   338	341	128	finally
    //   353	415	128	finally
    //   415	420	128	finally
    //   420	423	128	finally
    //   423	430	445	finally
    //   435	442	450	o20
    //   435	442	445	finally
    //   452	515	445	finally
    //   520	526	445	finally
    //   540	554	856	android/os/RemoteException
    //   540	554	851	finally
    //   558	565	856	android/os/RemoteException
    //   558	565	851	finally
    //   569	574	856	android/os/RemoteException
    //   569	574	851	finally
    //   584	589	856	android/os/RemoteException
    //   584	589	851	finally
    //   593	603	856	android/os/RemoteException
    //   593	603	851	finally
    //   612	619	856	android/os/RemoteException
    //   612	619	851	finally
    //   628	637	856	android/os/RemoteException
    //   628	637	851	finally
    //   644	649	856	android/os/RemoteException
    //   644	649	851	finally
    //   653	659	856	android/os/RemoteException
    //   653	659	851	finally
    //   663	691	856	android/os/RemoteException
    //   663	691	851	finally
    //   696	706	800	android/os/RemoteException
    //   696	706	795	finally
    //   709	719	800	android/os/RemoteException
    //   709	719	795	finally
    //   724	734	800	android/os/RemoteException
    //   724	734	795	finally
    //   739	754	800	android/os/RemoteException
    //   739	754	795	finally
    //   782	789	445	finally
    //   805	814	800	android/os/RemoteException
    //   805	814	795	finally
    //   821	828	445	finally
    //   875	884	856	android/os/RemoteException
    //   875	884	851	finally
    //   888	893	856	android/os/RemoteException
    //   888	893	851	finally
    //   897	903	856	android/os/RemoteException
    //   897	903	851	finally
    //   907	914	856	android/os/RemoteException
    //   907	914	851	finally
    //   918	925	856	android/os/RemoteException
    //   918	925	851	finally
    //   929	936	856	android/os/RemoteException
    //   929	936	851	finally
    //   940	946	856	android/os/RemoteException
    //   940	946	851	finally
    //   950	960	856	android/os/RemoteException
    //   950	960	851	finally
    //   964	970	856	android/os/RemoteException
    //   964	970	851	finally
    //   974	979	856	android/os/RemoteException
    //   974	979	851	finally
    //   986	995	856	android/os/RemoteException
    //   986	995	851	finally
    //   999	1004	856	android/os/RemoteException
    //   999	1004	851	finally
    //   1008	1014	856	android/os/RemoteException
    //   1008	1014	851	finally
    //   1018	1025	856	android/os/RemoteException
    //   1018	1025	851	finally
    //   1029	1036	856	android/os/RemoteException
    //   1029	1036	851	finally
    //   1040	1047	856	android/os/RemoteException
    //   1040	1047	851	finally
    //   1051	1057	856	android/os/RemoteException
    //   1051	1057	851	finally
    //   1061	1071	856	android/os/RemoteException
    //   1061	1071	851	finally
    //   1075	1081	856	android/os/RemoteException
    //   1075	1081	851	finally
    //   1085	1090	856	android/os/RemoteException
    //   1085	1090	851	finally
    //   1097	1104	851	finally
    //   1108	1117	851	finally
    //   1121	1126	851	finally
    //   1130	1139	851	finally
    //   1143	1152	851	finally
    //   1156	1164	851	finally
    //   1168	1179	851	finally
    //   1186	1193	445	finally
    //   1202	1209	445	finally
    //   1209	1212	445	finally
    //   1212	1215	128	finally
    //   1215	1218	445	finally
    //   1218	1222	1225	java/lang/Exception
  }
  
  public boolean k(ClassLoader paramClassLoader, File paramFile1, File paramFile2, boolean paramBoolean) {
    return wf2.G0(paramClassLoader, paramFile1, paramFile2, paramBoolean, (fb0)new Object(), "path", new eg2(0));
  }
  
  public void m(ClassLoader paramClassLoader, HashSet paramHashSet) {
    zo2.a0(paramClassLoader, paramHashSet, new bg2(0));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */