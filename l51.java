import android.content.ContentValues;
import androidx.profileinstaller.Vuyf.nBRIsU;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import in.krosbits.musicolet.MyApplication;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class l51 {
  public static final HashMap a = new HashMap<Object, Object>();
  
  public static void a(HashSet paramHashSet) {
    String[] arrayOfString = new String[1];
    try {
      File[] arrayOfFile = e().listFiles();
    } finally {
      paramHashSet = null;
    } 
  }
  
  public static void b(List paramList) {
    Iterator iterator = paramList.iterator();
    while (iterator.hasNext()) {
      if (((km0)iterator.next()).m > 0L) {
        String[] arrayOfString = new String[1];
        try {
          File[] arrayOfFile = e().listFiles();
          break;
        } finally {
          paramList = null;
        } 
        return;
      } 
    } 
  }
  
  public static void c(ArrayList<String> paramArrayList) {
    while (!paramArrayList.isEmpty() && (new File(e(), paramArrayList.get(0))).length() == 0L)
      paramArrayList.remove(0); 
  }
  
  public static String d(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    Date date;
    StringBuilder stringBuilder;
    byte b;
    String[] arrayOfString;
    if (paramBoolean1) {
      b = 10;
    } else {
      b = 32;
    } 
    if (nBRIsU.ZUGJPbblOLBOKIW.equals(paramString))
      return MyApplication.i.getApplicationContext().getString(2131886163); 
    if ("CPCc_Y".equals(paramString)) {
      date = lm0.M.getTime();
      return (new SimpleDateFormat("yyyy")).format(date);
    } 
    if ("CPCc_M".equals(date)) {
      Date date1 = lm0.M.getTime();
      if (paramBoolean2 || ws2.U()) {
        stringBuilder = new StringBuilder("MMMM");
        stringBuilder.append(b);
        stringBuilder.append("yyyy");
        return (new SimpleDateFormat(stringBuilder.toString())).format(date1);
      } 
      return (new SimpleDateFormat("MMMM")).format(date1);
    } 
    if ("CPCc_W".equals(stringBuilder)) {
      if (paramBoolean3) {
        Calendar calendar = lm0.M;
        stringBuilder = new StringBuilder();
        stringBuilder.append(MyApplication.y(2131887571));
        stringBuilder.append(" ");
        stringBuilder.append(calendar.get(3));
        stringBuilder.append(" - ");
        stringBuilder.append(calendar.get(1));
        return stringBuilder.toString();
      } 
      return MyApplication.i.getApplicationContext().getString(2131887502);
    } 
    paramBoolean1 = stringBuilder.startsWith("PCs_W_");
    String str = RqlokDsQOju.DnZNAOtIrBmR;
    if (paramBoolean1) {
      if (paramBoolean3) {
        arrayOfString = stringBuilder.substring(6).split(str);
        stringBuilder = new StringBuilder();
        stringBuilder.append(MyApplication.y(2131887571));
        stringBuilder.append(" ");
        stringBuilder.append(arrayOfString[1]);
        stringBuilder.append(" - ");
        stringBuilder.append(arrayOfString[0]);
        return stringBuilder.toString();
      } 
      return MyApplication.i.getApplicationContext().getString(2131887062);
    } 
    if (stringBuilder.startsWith("PCs_M_")) {
      String[] arrayOfString1 = stringBuilder.substring(6).split((String)arrayOfString);
      int i = Integer.parseInt(arrayOfString1[0]);
      int j = Integer.parseInt(arrayOfString1[1]);
      Calendar calendar = Calendar.getInstance();
      calendar.set(1, i);
      calendar.set(2, j);
      calendar.set(5, 1);
      stringBuilder = new StringBuilder("MMMM");
      stringBuilder.append(b);
      stringBuilder.append("yyyy");
      return (new SimpleDateFormat(stringBuilder.toString())).format(calendar.getTime());
    } 
    if (stringBuilder.startsWith("PCs_Y_")) {
      int i = Integer.parseInt(stringBuilder.substring(6));
      Calendar calendar = Calendar.getInstance();
      calendar.set(1, i);
      return (new SimpleDateFormat("yyyy")).format(calendar.getTime());
    } 
    return null;
  }
  
  public static File e() {
    File file = new File(MyApplication.i.getApplicationContext().getFilesDir(), "PCs");
    if (!file.exists())
      file.mkdirs(); 
    return file;
  }
  
  public static u51 f(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 'PCs_'
    //   4: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7: istore #6
    //   9: getstatic l51.a : Ljava/util/HashMap;
    //   12: astore #11
    //   14: aconst_null
    //   15: astore #10
    //   17: iconst_0
    //   18: istore_2
    //   19: iload #6
    //   21: ifeq -> 45
    //   24: aload #11
    //   26: aload_0
    //   27: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   30: checkcast java/util/ArrayList
    //   33: astore #7
    //   35: aload #7
    //   37: ifnull -> 45
    //   40: iconst_1
    //   41: istore_1
    //   42: goto -> 50
    //   45: aconst_null
    //   46: astore #7
    //   48: iconst_0
    //   49: istore_1
    //   50: aload #7
    //   52: astore #8
    //   54: aload #7
    //   56: ifnonnull -> 68
    //   59: new java/util/ArrayList
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: astore #8
    //   68: iload_1
    //   69: ifne -> 723
    //   72: getstatic androidx/work/impl/diagnostics/UWhQ/OETETTfAjV.sRA : Ljava/lang/String;
    //   75: aload_0
    //   76: invokevirtual equals : (Ljava/lang/Object;)Z
    //   79: ifeq -> 169
    //   82: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   85: getfield c : Llm0;
    //   88: iconst_0
    //   89: newarray int
    //   91: invokevirtual i : ([I)Ljava/util/ArrayList;
    //   94: astore #7
    //   96: aload #7
    //   98: invokevirtual size : ()I
    //   101: istore #4
    //   103: iconst_0
    //   104: istore_1
    //   105: iload_1
    //   106: iload #4
    //   108: if_icmpge -> 680
    //   111: aload #7
    //   113: iload_1
    //   114: invokevirtual get : (I)Ljava/lang/Object;
    //   117: astore #9
    //   119: iload_1
    //   120: iconst_1
    //   121: iadd
    //   122: istore_3
    //   123: aload #9
    //   125: checkcast km0
    //   128: astore #9
    //   130: aload #9
    //   132: getfield o : I
    //   135: istore #5
    //   137: iload_3
    //   138: istore_1
    //   139: iload #5
    //   141: ifle -> 105
    //   144: aload #8
    //   146: new u51
    //   149: dup
    //   150: aload #9
    //   152: iload #5
    //   154: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   157: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   160: invokevirtual add : (Ljava/lang/Object;)Z
    //   163: pop
    //   164: iload_3
    //   165: istore_1
    //   166: goto -> 105
    //   169: ldc 'CPCc_Y'
    //   171: aload_0
    //   172: invokevirtual equals : (Ljava/lang/Object;)Z
    //   175: ifeq -> 265
    //   178: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   181: getfield c : Llm0;
    //   184: iconst_0
    //   185: newarray int
    //   187: invokevirtual i : ([I)Ljava/util/ArrayList;
    //   190: astore #7
    //   192: aload #7
    //   194: invokevirtual size : ()I
    //   197: istore #4
    //   199: iconst_0
    //   200: istore_1
    //   201: iload_1
    //   202: iload #4
    //   204: if_icmpge -> 680
    //   207: aload #7
    //   209: iload_1
    //   210: invokevirtual get : (I)Ljava/lang/Object;
    //   213: astore #9
    //   215: iload_1
    //   216: iconst_1
    //   217: iadd
    //   218: istore_3
    //   219: aload #9
    //   221: checkcast km0
    //   224: astore #9
    //   226: aload #9
    //   228: invokevirtual j : ()I
    //   231: istore #5
    //   233: iload_3
    //   234: istore_1
    //   235: iload #5
    //   237: ifle -> 201
    //   240: aload #8
    //   242: new u51
    //   245: dup
    //   246: aload #9
    //   248: iload #5
    //   250: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   253: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   256: invokevirtual add : (Ljava/lang/Object;)Z
    //   259: pop
    //   260: iload_3
    //   261: istore_1
    //   262: goto -> 201
    //   265: ldc 'CPCc_M'
    //   267: aload_0
    //   268: invokevirtual equals : (Ljava/lang/Object;)Z
    //   271: ifeq -> 361
    //   274: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   277: getfield c : Llm0;
    //   280: iconst_0
    //   281: newarray int
    //   283: invokevirtual i : ([I)Ljava/util/ArrayList;
    //   286: astore #7
    //   288: aload #7
    //   290: invokevirtual size : ()I
    //   293: istore #4
    //   295: iconst_0
    //   296: istore_1
    //   297: iload_1
    //   298: iload #4
    //   300: if_icmpge -> 680
    //   303: aload #7
    //   305: iload_1
    //   306: invokevirtual get : (I)Ljava/lang/Object;
    //   309: astore #9
    //   311: iload_1
    //   312: iconst_1
    //   313: iadd
    //   314: istore_3
    //   315: aload #9
    //   317: checkcast km0
    //   320: astore #9
    //   322: aload #9
    //   324: invokevirtual f : ()I
    //   327: istore #5
    //   329: iload_3
    //   330: istore_1
    //   331: iload #5
    //   333: ifle -> 297
    //   336: aload #8
    //   338: new u51
    //   341: dup
    //   342: aload #9
    //   344: iload #5
    //   346: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   349: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   352: invokevirtual add : (Ljava/lang/Object;)Z
    //   355: pop
    //   356: iload_3
    //   357: istore_1
    //   358: goto -> 297
    //   361: ldc 'CPCc_W'
    //   363: aload_0
    //   364: invokevirtual equals : (Ljava/lang/Object;)Z
    //   367: ifeq -> 457
    //   370: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   373: getfield c : Llm0;
    //   376: iconst_0
    //   377: newarray int
    //   379: invokevirtual i : ([I)Ljava/util/ArrayList;
    //   382: astore #7
    //   384: aload #7
    //   386: invokevirtual size : ()I
    //   389: istore #4
    //   391: iconst_0
    //   392: istore_1
    //   393: iload_1
    //   394: iload #4
    //   396: if_icmpge -> 680
    //   399: aload #7
    //   401: iload_1
    //   402: invokevirtual get : (I)Ljava/lang/Object;
    //   405: astore #9
    //   407: iload_1
    //   408: iconst_1
    //   409: iadd
    //   410: istore_3
    //   411: aload #9
    //   413: checkcast km0
    //   416: astore #9
    //   418: aload #9
    //   420: invokevirtual h : ()I
    //   423: istore #5
    //   425: iload_3
    //   426: istore_1
    //   427: iload #5
    //   429: ifle -> 393
    //   432: aload #8
    //   434: new u51
    //   437: dup
    //   438: aload #9
    //   440: iload #5
    //   442: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   445: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   448: invokevirtual add : (Ljava/lang/Object;)Z
    //   451: pop
    //   452: iload_3
    //   453: istore_1
    //   454: goto -> 393
    //   457: iload #6
    //   459: ifeq -> 680
    //   462: new java/io/File
    //   465: dup
    //   466: invokestatic e : ()Ljava/io/File;
    //   469: aload_0
    //   470: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   473: astore #7
    //   475: aload #7
    //   477: invokevirtual length : ()J
    //   480: lconst_0
    //   481: lcmp
    //   482: ifle -> 680
    //   485: aload #7
    //   487: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   490: aconst_null
    //   491: iconst_1
    //   492: invokestatic openDatabase : (Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
    //   495: astore #7
    //   497: aload #7
    //   499: ldc 'TABLE_SONGS'
    //   501: iconst_2
    //   502: anewarray java/lang/String
    //   505: dup
    //   506: iconst_0
    //   507: ldc_w 'COL_PATH'
    //   510: aastore
    //   511: dup
    //   512: iconst_1
    //   513: ldc_w 'COL_NUM_PLAYED'
    //   516: aastore
    //   517: aconst_null
    //   518: aconst_null
    //   519: aconst_null
    //   520: aconst_null
    //   521: aconst_null
    //   522: invokevirtual query : (Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   525: astore #9
    //   527: aload #9
    //   529: ifnull -> 635
    //   532: aload #9
    //   534: invokeinterface moveToNext : ()Z
    //   539: ifeq -> 628
    //   542: aload #9
    //   544: iconst_0
    //   545: invokeinterface getString : (I)Ljava/lang/String;
    //   550: astore #13
    //   552: aload #9
    //   554: iconst_1
    //   555: invokeinterface getInt : (I)I
    //   560: istore_1
    //   561: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   564: getfield c : Llm0;
    //   567: astore #10
    //   569: new wo
    //   572: astore #12
    //   574: aload #12
    //   576: aload #13
    //   578: aconst_null
    //   579: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   582: aload #10
    //   584: aload #12
    //   586: invokevirtual b : (Lwo;)Lkm0;
    //   589: astore #12
    //   591: aload #12
    //   593: ifnull -> 532
    //   596: new u51
    //   599: astore #10
    //   601: aload #10
    //   603: aload #12
    //   605: iload_1
    //   606: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   609: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   612: aload #8
    //   614: aload #10
    //   616: invokevirtual add : (Ljava/lang/Object;)Z
    //   619: pop
    //   620: goto -> 532
    //   623: astore #9
    //   625: goto -> 649
    //   628: aload #9
    //   630: invokeinterface close : ()V
    //   635: aload #7
    //   637: invokevirtual close : ()V
    //   640: goto -> 680
    //   643: astore #9
    //   645: aload #10
    //   647: astore #7
    //   649: aload #9
    //   651: invokevirtual printStackTrace : ()V
    //   654: aload #7
    //   656: ifnull -> 680
    //   659: aload #7
    //   661: invokevirtual close : ()V
    //   664: goto -> 680
    //   667: astore_0
    //   668: aload #7
    //   670: ifnull -> 678
    //   673: aload #7
    //   675: invokevirtual close : ()V
    //   678: aload_0
    //   679: athrow
    //   680: new w00
    //   683: astore #7
    //   685: aload #7
    //   687: bipush #10
    //   689: invokespecial <init> : (I)V
    //   692: aload #8
    //   694: aload #7
    //   696: invokevirtual sort : (Ljava/util/Comparator;)V
    //   699: goto -> 709
    //   702: astore #7
    //   704: aload #7
    //   706: invokevirtual printStackTrace : ()V
    //   709: iload #6
    //   711: ifeq -> 723
    //   714: aload #11
    //   716: aload_0
    //   717: aload #8
    //   719: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   722: pop
    //   723: new java/util/ArrayList
    //   726: dup
    //   727: aload #8
    //   729: invokevirtual size : ()I
    //   732: invokespecial <init> : (I)V
    //   735: astore_0
    //   736: new java/util/ArrayList
    //   739: dup
    //   740: aload #8
    //   742: invokevirtual size : ()I
    //   745: invokespecial <init> : (I)V
    //   748: astore #7
    //   750: aload #8
    //   752: invokevirtual size : ()I
    //   755: istore_3
    //   756: iload_2
    //   757: istore_1
    //   758: iload_1
    //   759: iload_3
    //   760: if_icmpge -> 811
    //   763: aload #8
    //   765: iload_1
    //   766: invokevirtual get : (I)Ljava/lang/Object;
    //   769: astore #9
    //   771: iinc #1, 1
    //   774: aload #9
    //   776: checkcast u51
    //   779: astore #9
    //   781: aload_0
    //   782: aload #9
    //   784: getfield a : Ljava/lang/Object;
    //   787: checkcast km0
    //   790: invokevirtual add : (Ljava/lang/Object;)Z
    //   793: pop
    //   794: aload #7
    //   796: aload #9
    //   798: getfield b : Ljava/lang/Object;
    //   801: checkcast java/lang/Integer
    //   804: invokevirtual add : (Ljava/lang/Object;)Z
    //   807: pop
    //   808: goto -> 758
    //   811: new u51
    //   814: dup
    //   815: aload_0
    //   816: aload #7
    //   818: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   821: areturn
    // Exception table:
    //   from	to	target	type
    //   485	497	643	finally
    //   497	527	623	finally
    //   532	591	623	finally
    //   596	620	623	finally
    //   628	635	623	finally
    //   649	654	667	finally
    //   680	699	702	finally
  }
  
  public static void g(HashMap paramHashMap) {
    if (paramHashMap != null && !paramHashMap.isEmpty()) {
      String[] arrayOfString = new String[1];
      ContentValues contentValues = new ContentValues(1);
      try {
        File[] arrayOfFile = e().listFiles();
      } finally {
        paramHashMap = null;
      } 
    } 
  }
  
  public static void h(File paramFile, HashMap paramHashMap) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getName : ()Ljava/lang/String;
    //   4: astore #7
    //   6: aload #7
    //   8: ldc 'PCs_W_'
    //   10: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   13: ifeq -> 102
    //   16: invokestatic getInstance : ()Ljava/util/Calendar;
    //   19: astore #8
    //   21: aload #8
    //   23: getstatic lm0.M : Ljava/util/Calendar;
    //   26: invokevirtual getTimeInMillis : ()J
    //   29: invokevirtual setTimeInMillis : (J)V
    //   32: aload #8
    //   34: iconst_3
    //   35: iconst_m1
    //   36: invokevirtual add : (II)V
    //   39: aload #8
    //   41: iconst_3
    //   42: invokevirtual get : (I)I
    //   45: istore_3
    //   46: aload #8
    //   48: iconst_1
    //   49: invokevirtual get : (I)I
    //   52: istore_2
    //   53: new java/lang/StringBuilder
    //   56: dup
    //   57: ldc 'PCs_W_'
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: astore #8
    //   64: aload #8
    //   66: iload_2
    //   67: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   70: pop
    //   71: aload #8
    //   73: ldc_w '.'
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: aload #8
    //   82: iload_3
    //   83: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload #7
    //   89: aload #8
    //   91: invokevirtual toString : ()Ljava/lang/String;
    //   94: invokevirtual equals : (Ljava/lang/Object;)Z
    //   97: istore #6
    //   99: goto -> 267
    //   102: aload #7
    //   104: ldc_w 'PCs_M_'
    //   107: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   110: ifeq -> 210
    //   113: aload #7
    //   115: bipush #6
    //   117: invokevirtual substring : (I)Ljava/lang/String;
    //   120: ldc_w '\.'
    //   123: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   126: astore #8
    //   128: aload #8
    //   130: iconst_0
    //   131: aaload
    //   132: invokestatic parseInt : (Ljava/lang/String;)I
    //   135: istore #5
    //   137: aload #8
    //   139: iconst_1
    //   140: aaload
    //   141: invokestatic parseInt : (Ljava/lang/String;)I
    //   144: istore #4
    //   146: getstatic lm0.M : Ljava/util/Calendar;
    //   149: iconst_2
    //   150: invokevirtual get : (I)I
    //   153: istore_3
    //   154: getstatic lm0.M : Ljava/util/Calendar;
    //   157: iconst_1
    //   158: invokevirtual get : (I)I
    //   161: istore_2
    //   162: iload #5
    //   164: bipush #12
    //   166: imul
    //   167: iload #4
    //   169: iadd
    //   170: istore #4
    //   172: iload_2
    //   173: bipush #12
    //   175: imul
    //   176: iload_3
    //   177: iadd
    //   178: istore_2
    //   179: iload_2
    //   180: iload #4
    //   182: if_icmple -> 264
    //   185: iload_2
    //   186: iload #4
    //   188: isub
    //   189: bipush #12
    //   191: if_icmpgt -> 264
    //   194: iconst_1
    //   195: istore #6
    //   197: goto -> 267
    //   200: astore #8
    //   202: aload #8
    //   204: invokevirtual printStackTrace : ()V
    //   207: goto -> 264
    //   210: aload #7
    //   212: ldc_w 'PCs_Y_'
    //   215: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   218: ifeq -> 264
    //   221: aload #7
    //   223: bipush #6
    //   225: invokevirtual substring : (I)Ljava/lang/String;
    //   228: invokestatic parseInt : (Ljava/lang/String;)I
    //   231: istore_3
    //   232: getstatic lm0.M : Ljava/util/Calendar;
    //   235: iconst_1
    //   236: invokevirtual get : (I)I
    //   239: istore_2
    //   240: iload_2
    //   241: iload_3
    //   242: isub
    //   243: istore_2
    //   244: iload_2
    //   245: ifle -> 264
    //   248: iload_2
    //   249: bipush #10
    //   251: if_icmpgt -> 264
    //   254: goto -> 194
    //   257: astore #8
    //   259: aload #8
    //   261: invokevirtual printStackTrace : ()V
    //   264: iconst_0
    //   265: istore #6
    //   267: iload #6
    //   269: ifne -> 273
    //   272: return
    //   273: new java/io/File
    //   276: dup
    //   277: invokestatic e : ()Ljava/io/File;
    //   280: aload #7
    //   282: ldc_w '.tmp'
    //   285: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   288: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   291: astore #8
    //   293: aload #8
    //   295: invokevirtual exists : ()Z
    //   298: ifeq -> 307
    //   301: aload #8
    //   303: invokevirtual delete : ()Z
    //   306: pop
    //   307: aload #8
    //   309: invokevirtual exists : ()Z
    //   312: ifne -> 321
    //   315: aload #8
    //   317: invokevirtual createNewFile : ()Z
    //   320: pop
    //   321: new java/io/File
    //   324: dup
    //   325: invokestatic e : ()Ljava/io/File;
    //   328: aload #7
    //   330: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   333: astore #9
    //   335: aload #9
    //   337: invokevirtual exists : ()Z
    //   340: ifeq -> 349
    //   343: aload #9
    //   345: invokevirtual delete : ()Z
    //   348: pop
    //   349: aload_0
    //   350: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   353: aconst_null
    //   354: iconst_1
    //   355: invokestatic openDatabase : (Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
    //   358: astore_0
    //   359: goto -> 386
    //   362: astore_0
    //   363: goto -> 370
    //   366: astore_0
    //   367: goto -> 377
    //   370: aload_0
    //   371: invokevirtual printStackTrace : ()V
    //   374: goto -> 384
    //   377: aload_0
    //   378: invokevirtual getMessage : ()Ljava/lang/String;
    //   381: invokestatic v : (Ljava/lang/String;)V
    //   384: aconst_null
    //   385: astore_0
    //   386: aload_0
    //   387: ifnull -> 628
    //   390: aload_0
    //   391: ldc 'TABLE_SONGS'
    //   393: iconst_2
    //   394: anewarray java/lang/String
    //   397: dup
    //   398: iconst_0
    //   399: ldc_w 'COL_PATH'
    //   402: aastore
    //   403: dup
    //   404: iconst_1
    //   405: ldc_w 'COL_NUM_PLAYED'
    //   408: aastore
    //   409: aconst_null
    //   410: aconst_null
    //   411: aconst_null
    //   412: aconst_null
    //   413: aconst_null
    //   414: invokevirtual query : (Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   417: astore #7
    //   419: goto -> 435
    //   422: astore #7
    //   424: aload #7
    //   426: invokevirtual getMessage : ()Ljava/lang/String;
    //   429: invokestatic v : (Ljava/lang/String;)V
    //   432: aconst_null
    //   433: astore #7
    //   435: aload #7
    //   437: ifnull -> 624
    //   440: aload #7
    //   442: invokeinterface getCount : ()I
    //   447: ifle -> 617
    //   450: aload #8
    //   452: aconst_null
    //   453: invokestatic openOrCreateDatabase : (Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;
    //   456: astore #10
    //   458: aload #10
    //   460: invokevirtual beginTransaction : ()V
    //   463: aload #10
    //   465: ldc_w 'CREATE TABLE IF NOT EXISTS TABLE_SONGS ( COL_PATH TEXT primary key, COL_NUM_PLAYED  INTEGER DEFAULT 0 )'
    //   468: invokevirtual execSQL : (Ljava/lang/String;)V
    //   471: new android/content/ContentValues
    //   474: dup
    //   475: iconst_2
    //   476: invokespecial <init> : (I)V
    //   479: astore #11
    //   481: aload #7
    //   483: invokeinterface moveToNext : ()Z
    //   488: ifeq -> 574
    //   491: aload #7
    //   493: iconst_0
    //   494: invokeinterface getString : (I)Ljava/lang/String;
    //   499: astore #12
    //   501: aload #7
    //   503: iconst_1
    //   504: invokeinterface getInt : (I)I
    //   509: istore_2
    //   510: aload_1
    //   511: new wo
    //   514: dup
    //   515: aload #12
    //   517: aconst_null
    //   518: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   521: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   524: checkcast wo
    //   527: astore #12
    //   529: aload #12
    //   531: ifnull -> 481
    //   534: aload #11
    //   536: ldc_w 'COL_PATH'
    //   539: aload #12
    //   541: invokevirtual toString : ()Ljava/lang/String;
    //   544: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   547: aload #11
    //   549: ldc_w 'COL_NUM_PLAYED'
    //   552: iload_2
    //   553: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   556: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   559: aload #10
    //   561: ldc 'TABLE_SONGS'
    //   563: aconst_null
    //   564: aload #11
    //   566: iconst_5
    //   567: invokevirtual insertWithOnConflict : (Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   570: pop2
    //   571: goto -> 481
    //   574: aload #10
    //   576: invokevirtual setTransactionSuccessful : ()V
    //   579: aload #10
    //   581: invokevirtual endTransaction : ()V
    //   584: getstatic android/os/Build$VERSION.SDK_INT : I
    //   587: bipush #28
    //   589: if_icmplt -> 612
    //   592: aload #10
    //   594: ldc_w 'pragma wal_checkpoint(TRUNCATE);'
    //   597: aconst_null
    //   598: invokevirtual rawQuery : (Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   601: astore_1
    //   602: aload_1
    //   603: ifnull -> 612
    //   606: aload_1
    //   607: invokeinterface close : ()V
    //   612: aload #10
    //   614: invokevirtual close : ()V
    //   617: aload #7
    //   619: invokeinterface close : ()V
    //   624: aload_0
    //   625: invokevirtual close : ()V
    //   628: aload #8
    //   630: aload #9
    //   632: invokevirtual renameTo : (Ljava/io/File;)Z
    //   635: pop
    //   636: return
    //   637: astore_1
    //   638: goto -> 612
    // Exception table:
    //   from	to	target	type
    //   113	162	200	finally
    //   221	240	257	finally
    //   349	359	366	android/database/SQLException
    //   349	359	362	finally
    //   390	419	422	android/database/SQLException
    //   592	602	637	finally
    //   606	612	637	finally
  }
  
  public static void i(int paramInt, String paramString, ArrayList paramArrayList) {
    // Byte code:
    //   0: ldc_w 'PCS>S:1>'
    //   3: aload_1
    //   4: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   7: invokestatic F : (Ljava/lang/String;)V
    //   10: new java/io/File
    //   13: astore #5
    //   15: aload #5
    //   17: invokestatic e : ()Ljava/io/File;
    //   20: aload_1
    //   21: ldc_w '.tmp'
    //   24: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   27: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   30: aload #5
    //   32: invokevirtual exists : ()Z
    //   35: ifeq -> 44
    //   38: aload #5
    //   40: invokevirtual delete : ()Z
    //   43: pop
    //   44: aload #5
    //   46: invokevirtual exists : ()Z
    //   49: ifne -> 58
    //   52: aload #5
    //   54: invokevirtual createNewFile : ()Z
    //   57: pop
    //   58: new java/io/File
    //   61: astore #6
    //   63: aload #6
    //   65: invokestatic e : ()Ljava/io/File;
    //   68: aload_1
    //   69: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   72: aload #6
    //   74: invokevirtual exists : ()Z
    //   77: ifeq -> 86
    //   80: aload #6
    //   82: invokevirtual delete : ()Z
    //   85: pop
    //   86: aload_2
    //   87: invokevirtual isEmpty : ()Z
    //   90: ifne -> 301
    //   93: aload #5
    //   95: aconst_null
    //   96: invokestatic openOrCreateDatabase : (Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;
    //   99: astore_1
    //   100: aload_1
    //   101: invokevirtual beginTransaction : ()V
    //   104: aload_1
    //   105: ldc_w 'CREATE TABLE IF NOT EXISTS TABLE_SONGS ( COL_PATH TEXT primary key, COL_NUM_PLAYED  INTEGER DEFAULT 0 )'
    //   108: invokevirtual execSQL : (Ljava/lang/String;)V
    //   111: new android/content/ContentValues
    //   114: astore #7
    //   116: aload #7
    //   118: iconst_2
    //   119: invokespecial <init> : (I)V
    //   122: aload_2
    //   123: invokevirtual size : ()I
    //   126: istore #4
    //   128: iconst_0
    //   129: istore_3
    //   130: iload_3
    //   131: iload #4
    //   133: if_icmpge -> 253
    //   136: aload_2
    //   137: iload_3
    //   138: invokevirtual get : (I)Ljava/lang/Object;
    //   141: astore #8
    //   143: iinc #3, 1
    //   146: aload #8
    //   148: checkcast km0
    //   151: astore #8
    //   153: aload #7
    //   155: ldc_w 'COL_PATH'
    //   158: aload #8
    //   160: getfield c : Lqn1;
    //   163: getfield f : Lwo;
    //   166: invokestatic Q0 : (Ljava/lang/Object;)Ljava/lang/String;
    //   169: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   172: iload_0
    //   173: ifne -> 199
    //   176: aload #7
    //   178: ldc_w 'COL_NUM_PLAYED'
    //   181: aload #8
    //   183: getfield r : I
    //   186: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   189: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   192: goto -> 239
    //   195: astore_2
    //   196: goto -> 260
    //   199: iload_0
    //   200: iconst_1
    //   201: if_icmpne -> 223
    //   204: aload #7
    //   206: ldc_w 'COL_NUM_PLAYED'
    //   209: aload #8
    //   211: getfield s : I
    //   214: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   217: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   220: goto -> 239
    //   223: aload #7
    //   225: ldc_w 'COL_NUM_PLAYED'
    //   228: aload #8
    //   230: getfield t : I
    //   233: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   236: invokevirtual put : (Ljava/lang/String;Ljava/lang/Integer;)V
    //   239: aload_1
    //   240: ldc 'TABLE_SONGS'
    //   242: aconst_null
    //   243: aload #7
    //   245: iconst_5
    //   246: invokevirtual insertWithOnConflict : (Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   249: pop2
    //   250: goto -> 130
    //   253: aload_1
    //   254: invokevirtual setTransactionSuccessful : ()V
    //   257: goto -> 264
    //   260: aload_2
    //   261: invokevirtual printStackTrace : ()V
    //   264: aload_1
    //   265: invokevirtual endTransaction : ()V
    //   268: getstatic android/os/Build$VERSION.SDK_INT : I
    //   271: istore_0
    //   272: iload_0
    //   273: bipush #28
    //   275: if_icmplt -> 297
    //   278: aload_1
    //   279: ldc_w 'pragma wal_checkpoint(TRUNCATE);'
    //   282: aconst_null
    //   283: invokevirtual rawQuery : (Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   286: astore_2
    //   287: aload_2
    //   288: ifnull -> 297
    //   291: aload_2
    //   292: invokeinterface close : ()V
    //   297: aload_1
    //   298: invokevirtual close : ()V
    //   301: aload #5
    //   303: aload #6
    //   305: invokevirtual renameTo : (Ljava/io/File;)Z
    //   308: pop
    //   309: ldc_w 'PCS>S:11'
    //   312: invokestatic F : (Ljava/lang/String;)V
    //   315: goto -> 323
    //   318: astore_1
    //   319: aload_1
    //   320: invokevirtual printStackTrace : ()V
    //   323: return
    //   324: astore_2
    //   325: goto -> 297
    // Exception table:
    //   from	to	target	type
    //   10	44	318	finally
    //   44	58	318	finally
    //   58	86	318	finally
    //   86	111	318	finally
    //   111	128	195	finally
    //   136	143	195	finally
    //   146	172	195	finally
    //   176	192	195	finally
    //   204	220	195	finally
    //   223	239	195	finally
    //   239	250	195	finally
    //   253	257	195	finally
    //   260	264	318	finally
    //   264	272	318	finally
    //   278	287	324	finally
    //   291	297	324	finally
    //   297	301	318	finally
    //   301	315	318	finally
  }
  
  public static void j() {
    // Byte code:
    //   0: ldc 'PCs_W_'
    //   2: astore #7
    //   4: ldc_w 'PCS>U>1'
    //   7: invokestatic F : (Ljava/lang/String;)V
    //   10: invokestatic e : ()Ljava/io/File;
    //   13: invokevirtual listFiles : ()[Ljava/io/File;
    //   16: astore #11
    //   18: getstatic lm0.M : Ljava/util/Calendar;
    //   21: iconst_3
    //   22: invokevirtual get : (I)I
    //   25: pop
    //   26: getstatic lm0.M : Ljava/util/Calendar;
    //   29: iconst_2
    //   30: invokevirtual get : (I)I
    //   33: pop
    //   34: getstatic lm0.M : Ljava/util/Calendar;
    //   37: iconst_1
    //   38: invokevirtual get : (I)I
    //   41: pop
    //   42: invokestatic getInstance : ()Ljava/util/Calendar;
    //   45: astore #9
    //   47: aload #9
    //   49: getstatic lm0.M : Ljava/util/Calendar;
    //   52: invokevirtual getTimeInMillis : ()J
    //   55: invokevirtual setTimeInMillis : (J)V
    //   58: aload #9
    //   60: iconst_3
    //   61: iconst_m1
    //   62: invokevirtual add : (II)V
    //   65: aload #9
    //   67: iconst_3
    //   68: invokevirtual get : (I)I
    //   71: istore #4
    //   73: aload #9
    //   75: iconst_1
    //   76: invokevirtual get : (I)I
    //   79: istore_1
    //   80: new java/lang/StringBuilder
    //   83: astore #8
    //   85: aload #8
    //   87: ldc 'PCs_W_'
    //   89: invokespecial <init> : (Ljava/lang/String;)V
    //   92: aload #8
    //   94: iload_1
    //   95: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload #8
    //   101: ldc_w '.'
    //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload #8
    //   110: iload #4
    //   112: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload #8
    //   118: invokevirtual toString : ()Ljava/lang/String;
    //   121: astore #12
    //   123: new java/util/HashMap
    //   126: astore #10
    //   128: aload #10
    //   130: bipush #12
    //   132: invokespecial <init> : (I)V
    //   135: iconst_1
    //   136: istore_0
    //   137: iload_0
    //   138: bipush #12
    //   140: if_icmpgt -> 238
    //   143: aload #9
    //   145: getstatic lm0.M : Ljava/util/Calendar;
    //   148: invokevirtual getTimeInMillis : ()J
    //   151: invokevirtual setTimeInMillis : (J)V
    //   154: aload #9
    //   156: iconst_2
    //   157: iload_0
    //   158: ineg
    //   159: invokevirtual add : (II)V
    //   162: aload #9
    //   164: iconst_2
    //   165: invokevirtual get : (I)I
    //   168: istore_2
    //   169: aload #9
    //   171: iconst_1
    //   172: invokevirtual get : (I)I
    //   175: istore_3
    //   176: new java/lang/StringBuilder
    //   179: astore #8
    //   181: aload #8
    //   183: invokespecial <init> : ()V
    //   186: aload #8
    //   188: ldc_w 'PCs_M_'
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload #8
    //   197: iload_3
    //   198: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: aload #8
    //   204: ldc_w '.'
    //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: aload #8
    //   213: iload_2
    //   214: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: aload #10
    //   220: aload #8
    //   222: invokevirtual toString : ()Ljava/lang/String;
    //   225: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   228: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   231: pop
    //   232: iinc #0, 1
    //   235: goto -> 137
    //   238: new java/util/HashMap
    //   241: astore #8
    //   243: aload #8
    //   245: bipush #10
    //   247: invokespecial <init> : (I)V
    //   250: iconst_1
    //   251: istore_0
    //   252: iload_0
    //   253: bipush #10
    //   255: if_icmpgt -> 330
    //   258: aload #9
    //   260: getstatic lm0.M : Ljava/util/Calendar;
    //   263: invokevirtual getTimeInMillis : ()J
    //   266: invokevirtual setTimeInMillis : (J)V
    //   269: aload #9
    //   271: iconst_1
    //   272: iload_0
    //   273: ineg
    //   274: invokevirtual add : (II)V
    //   277: aload #9
    //   279: iconst_1
    //   280: invokevirtual get : (I)I
    //   283: istore_2
    //   284: new java/lang/StringBuilder
    //   287: astore #13
    //   289: aload #13
    //   291: invokespecial <init> : ()V
    //   294: aload #13
    //   296: ldc_w 'PCs_Y_'
    //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: pop
    //   303: aload #13
    //   305: iload_2
    //   306: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   309: pop
    //   310: aload #8
    //   312: aload #13
    //   314: invokevirtual toString : ()Ljava/lang/String;
    //   317: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   320: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   323: pop
    //   324: iinc #0, 1
    //   327: goto -> 252
    //   330: new java/util/ArrayList
    //   333: astore #9
    //   335: aload #9
    //   337: invokespecial <init> : ()V
    //   340: aload #11
    //   342: arraylength
    //   343: istore #5
    //   345: iconst_0
    //   346: istore_3
    //   347: iconst_0
    //   348: istore_2
    //   349: iload_2
    //   350: iload #5
    //   352: if_icmpge -> 505
    //   355: aload #11
    //   357: iload_2
    //   358: aaload
    //   359: astore #14
    //   361: aload #14
    //   363: invokevirtual getName : ()Ljava/lang/String;
    //   366: astore #13
    //   368: aload #13
    //   370: aload #7
    //   372: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   375: ifeq -> 395
    //   378: aload #13
    //   380: aload #12
    //   382: invokevirtual equals : (Ljava/lang/Object;)Z
    //   385: ifeq -> 433
    //   388: iconst_1
    //   389: istore_0
    //   390: iconst_1
    //   391: istore_3
    //   392: goto -> 478
    //   395: aload #13
    //   397: ldc_w 'PCs_M_'
    //   400: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   403: ifeq -> 436
    //   406: aload #10
    //   408: aload #13
    //   410: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   413: checkcast java/lang/Boolean
    //   416: ifnull -> 433
    //   419: aload #10
    //   421: aload #13
    //   423: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   426: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   429: pop
    //   430: goto -> 471
    //   433: goto -> 476
    //   436: aload #13
    //   438: ldc_w 'PCs_Y_'
    //   441: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   444: ifeq -> 476
    //   447: aload #8
    //   449: aload #13
    //   451: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   454: checkcast java/lang/Boolean
    //   457: ifnull -> 476
    //   460: aload #8
    //   462: aload #13
    //   464: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   467: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   470: pop
    //   471: iconst_1
    //   472: istore_0
    //   473: goto -> 478
    //   476: iconst_0
    //   477: istore_0
    //   478: iload_0
    //   479: ifeq -> 493
    //   482: aload #9
    //   484: aload #13
    //   486: invokevirtual add : (Ljava/lang/Object;)Z
    //   489: pop
    //   490: goto -> 499
    //   493: aload #14
    //   495: invokevirtual delete : ()Z
    //   498: pop
    //   499: iinc #2, 1
    //   502: goto -> 349
    //   505: new java/util/ArrayList
    //   508: astore #7
    //   510: aload #7
    //   512: invokespecial <init> : ()V
    //   515: invokestatic U : ()Z
    //   518: ifeq -> 545
    //   521: invokestatic o : ()Landroid/content/SharedPreferences;
    //   524: ldc_w 'k_b_aexpctcsvfe'
    //   527: iconst_0
    //   528: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   533: istore #6
    //   535: iload #6
    //   537: ifeq -> 545
    //   540: iconst_1
    //   541: istore_0
    //   542: goto -> 547
    //   545: iconst_0
    //   546: istore_0
    //   547: iload_3
    //   548: ifne -> 589
    //   551: iconst_0
    //   552: aload #12
    //   554: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   557: getfield c : Llm0;
    //   560: iload_1
    //   561: iload #4
    //   563: invokevirtual q : (II)Ljava/util/ArrayList;
    //   566: invokestatic i : (ILjava/lang/String;Ljava/util/ArrayList;)V
    //   569: aload #9
    //   571: aload #12
    //   573: invokevirtual add : (Ljava/lang/Object;)Z
    //   576: pop
    //   577: iload_0
    //   578: ifeq -> 589
    //   581: aload #7
    //   583: aload #12
    //   585: invokevirtual add : (Ljava/lang/Object;)Z
    //   588: pop
    //   589: aload #10
    //   591: invokevirtual keySet : ()Ljava/util/Set;
    //   594: invokeinterface iterator : ()Ljava/util/Iterator;
    //   599: astore #11
    //   601: aload #11
    //   603: invokeinterface hasNext : ()Z
    //   608: ifeq -> 714
    //   611: aload #11
    //   613: invokeinterface next : ()Ljava/lang/Object;
    //   618: checkcast java/lang/String
    //   621: astore #13
    //   623: aload #10
    //   625: aload #13
    //   627: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   630: checkcast java/lang/Boolean
    //   633: invokevirtual booleanValue : ()Z
    //   636: istore #6
    //   638: iload #6
    //   640: ifne -> 601
    //   643: aload #13
    //   645: bipush #6
    //   647: invokevirtual substring : (I)Ljava/lang/String;
    //   650: ldc_w '\.'
    //   653: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   656: astore #12
    //   658: aload #12
    //   660: iconst_0
    //   661: aaload
    //   662: invokestatic parseInt : (Ljava/lang/String;)I
    //   665: istore_2
    //   666: aload #12
    //   668: iconst_1
    //   669: aaload
    //   670: invokestatic parseInt : (Ljava/lang/String;)I
    //   673: istore_1
    //   674: iconst_1
    //   675: aload #13
    //   677: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   680: getfield c : Llm0;
    //   683: iload_1
    //   684: iload_2
    //   685: invokevirtual o : (II)Ljava/util/ArrayList;
    //   688: invokestatic i : (ILjava/lang/String;Ljava/util/ArrayList;)V
    //   691: aload #9
    //   693: aload #13
    //   695: invokevirtual add : (Ljava/lang/Object;)Z
    //   698: pop
    //   699: iload_0
    //   700: ifeq -> 601
    //   703: aload #7
    //   705: aload #13
    //   707: invokevirtual add : (Ljava/lang/Object;)Z
    //   710: pop
    //   711: goto -> 601
    //   714: aload #8
    //   716: invokevirtual keySet : ()Ljava/util/Set;
    //   719: invokeinterface iterator : ()Ljava/util/Iterator;
    //   724: astore #10
    //   726: aload #10
    //   728: invokeinterface hasNext : ()Z
    //   733: ifeq -> 825
    //   736: aload #10
    //   738: invokeinterface next : ()Ljava/lang/Object;
    //   743: checkcast java/lang/String
    //   746: astore #11
    //   748: aload #8
    //   750: aload #11
    //   752: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   755: checkcast java/lang/Boolean
    //   758: invokevirtual booleanValue : ()Z
    //   761: istore #6
    //   763: iload #6
    //   765: ifne -> 822
    //   768: aload #11
    //   770: bipush #6
    //   772: invokevirtual substring : (I)Ljava/lang/String;
    //   775: invokestatic parseInt : (Ljava/lang/String;)I
    //   778: istore_1
    //   779: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   782: getfield c : Llm0;
    //   785: iload_1
    //   786: invokevirtual p : (I)Ljava/util/ArrayList;
    //   789: astore #12
    //   791: iconst_2
    //   792: aload #11
    //   794: aload #12
    //   796: invokestatic i : (ILjava/lang/String;Ljava/util/ArrayList;)V
    //   799: aload #9
    //   801: aload #11
    //   803: invokevirtual add : (Ljava/lang/Object;)Z
    //   806: pop
    //   807: iload_0
    //   808: ifeq -> 726
    //   811: aload #7
    //   813: aload #11
    //   815: invokevirtual add : (Ljava/lang/Object;)Z
    //   818: pop
    //   819: goto -> 726
    //   822: goto -> 726
    //   825: getstatic lm0.M : Ljava/util/Calendar;
    //   828: astore #8
    //   830: aload #7
    //   832: invokevirtual size : ()I
    //   835: istore_1
    //   836: iconst_0
    //   837: istore_0
    //   838: iload_0
    //   839: iload_1
    //   840: if_icmpge -> 1105
    //   843: aload #7
    //   845: iload_0
    //   846: invokevirtual get : (I)Ljava/lang/Object;
    //   849: checkcast java/lang/String
    //   852: astore #8
    //   854: aload #8
    //   856: iconst_0
    //   857: iconst_1
    //   858: iconst_1
    //   859: invokestatic d : (Ljava/lang/String;ZZZ)Ljava/lang/String;
    //   862: astore #9
    //   864: new java/lang/StringBuilder
    //   867: astore #10
    //   869: aload #10
    //   871: invokespecial <init> : ()V
    //   874: aload #10
    //   876: ldc_w 2131886842
    //   879: invokestatic y : (I)Ljava/lang/String;
    //   882: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   885: pop
    //   886: aload #10
    //   888: ldc ' '
    //   890: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   893: pop
    //   894: aload #10
    //   896: ldc_w 2131887420
    //   899: invokestatic y : (I)Ljava/lang/String;
    //   902: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   905: pop
    //   906: aload #10
    //   908: ldc_w ' • '
    //   911: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   914: pop
    //   915: aload #10
    //   917: aload #9
    //   919: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   922: pop
    //   923: aload #10
    //   925: ldc_w '.csv'
    //   928: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   931: pop
    //   932: aload #10
    //   934: invokevirtual toString : ()Ljava/lang/String;
    //   937: invokestatic t : (Ljava/lang/String;)Lv00;
    //   940: astore #10
    //   942: aload #10
    //   944: aload #8
    //   946: iconst_0
    //   947: invokestatic U : (Lv00;Ljava/lang/String;I)Z
    //   950: istore #6
    //   952: iload #6
    //   954: ifne -> 978
    //   957: aload #10
    //   959: ifnull -> 978
    //   962: aload #10
    //   964: invokevirtual e : ()Z
    //   967: pop
    //   968: goto -> 978
    //   971: astore #10
    //   973: aload #10
    //   975: invokevirtual printStackTrace : ()V
    //   978: new java/lang/StringBuilder
    //   981: astore #10
    //   983: aload #10
    //   985: invokespecial <init> : ()V
    //   988: aload #10
    //   990: ldc_w 2131886842
    //   993: invokestatic y : (I)Ljava/lang/String;
    //   996: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   999: pop
    //   1000: aload #10
    //   1002: ldc ' '
    //   1004: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1007: pop
    //   1008: aload #10
    //   1010: ldc_w 2131886205
    //   1013: invokestatic y : (I)Ljava/lang/String;
    //   1016: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1019: pop
    //   1020: aload #10
    //   1022: ldc_w ' • '
    //   1025: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1028: pop
    //   1029: aload #10
    //   1031: aload #9
    //   1033: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1036: pop
    //   1037: aload #10
    //   1039: ldc_w '.csv'
    //   1042: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1045: pop
    //   1046: aload #10
    //   1048: invokevirtual toString : ()Ljava/lang/String;
    //   1051: invokestatic t : (Ljava/lang/String;)Lv00;
    //   1054: astore #9
    //   1056: aload #9
    //   1058: aload #8
    //   1060: iconst_1
    //   1061: invokestatic U : (Lv00;Ljava/lang/String;I)Z
    //   1064: istore #6
    //   1066: iload #6
    //   1068: ifne -> 1092
    //   1071: aload #9
    //   1073: ifnull -> 1092
    //   1076: aload #9
    //   1078: invokevirtual e : ()Z
    //   1081: pop
    //   1082: goto -> 1092
    //   1085: astore #8
    //   1087: aload #8
    //   1089: invokevirtual printStackTrace : ()V
    //   1092: iinc #0, 1
    //   1095: goto -> 838
    //   1098: astore #7
    //   1100: aload #7
    //   1102: invokevirtual printStackTrace : ()V
    //   1105: ldc_w 'PCS>U>6'
    //   1108: invokestatic F : (Ljava/lang/String;)V
    //   1111: return
    //   1112: astore #11
    //   1114: goto -> 589
    //   1117: astore #12
    //   1119: goto -> 601
    //   1122: astore #11
    //   1124: goto -> 822
    //   1127: astore #11
    //   1129: goto -> 726
    // Exception table:
    //   from	to	target	type
    //   10	135	1098	finally
    //   143	232	1098	finally
    //   238	250	1098	finally
    //   258	324	1098	finally
    //   330	345	1098	finally
    //   361	388	1098	finally
    //   395	430	1098	finally
    //   436	471	1098	finally
    //   482	490	1098	finally
    //   493	499	1098	finally
    //   505	535	1098	finally
    //   551	577	1112	java/lang/Exception
    //   551	577	1098	finally
    //   581	589	1112	java/lang/Exception
    //   581	589	1098	finally
    //   589	601	1098	finally
    //   601	638	1098	finally
    //   643	699	1117	java/lang/Exception
    //   643	699	1098	finally
    //   703	711	1117	java/lang/Exception
    //   703	711	1098	finally
    //   714	726	1098	finally
    //   726	763	1098	finally
    //   768	791	1122	java/lang/Exception
    //   768	791	1098	finally
    //   791	807	1127	java/lang/Exception
    //   791	807	1098	finally
    //   811	819	1127	java/lang/Exception
    //   811	819	1098	finally
    //   825	836	1098	finally
    //   843	952	1098	finally
    //   962	968	971	finally
    //   973	978	1098	finally
    //   978	1066	1098	finally
    //   1076	1082	1085	finally
    //   1087	1092	1098	finally
  }
  
  public static void k(HashMap paramHashMap) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isEmpty : ()Z
    //   4: ifeq -> 10
    //   7: goto -> 373
    //   10: iconst_1
    //   11: anewarray java/lang/String
    //   14: astore #11
    //   16: new android/content/ContentValues
    //   19: dup
    //   20: iconst_1
    //   21: invokespecial <init> : (I)V
    //   24: astore #10
    //   26: invokestatic e : ()Ljava/io/File;
    //   29: invokevirtual listFiles : ()[Ljava/io/File;
    //   32: astore #9
    //   34: aload #9
    //   36: ifnull -> 373
    //   39: aload #9
    //   41: arraylength
    //   42: istore_3
    //   43: iconst_0
    //   44: istore_1
    //   45: iload_1
    //   46: iload_3
    //   47: if_icmpge -> 373
    //   50: aload #9
    //   52: iload_1
    //   53: aaload
    //   54: astore #6
    //   56: aload #6
    //   58: invokevirtual getName : ()Ljava/lang/String;
    //   61: astore #7
    //   63: aload #7
    //   65: ldc 'shm'
    //   67: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   70: ifne -> 362
    //   73: aload #7
    //   75: ldc 'wal'
    //   77: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   80: ifne -> 362
    //   83: aload #7
    //   85: ldc 'journal'
    //   87: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   90: ifne -> 362
    //   93: aload #7
    //   95: ldc 'tmp'
    //   97: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   100: ifeq -> 106
    //   103: goto -> 362
    //   106: aload #6
    //   108: invokevirtual length : ()J
    //   111: lstore #4
    //   113: lload #4
    //   115: lconst_0
    //   116: lcmp
    //   117: ifne -> 123
    //   120: goto -> 362
    //   123: aconst_null
    //   124: astore #7
    //   126: aload #6
    //   128: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   131: aconst_null
    //   132: iconst_0
    //   133: invokestatic openDatabase : (Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
    //   136: astore #6
    //   138: aload #6
    //   140: astore #7
    //   142: aload #6
    //   144: invokevirtual beginTransaction : ()V
    //   147: aload_0
    //   148: invokevirtual keySet : ()Ljava/util/Set;
    //   151: invokeinterface iterator : ()Ljava/util/Iterator;
    //   156: astore #8
    //   158: aload #8
    //   160: invokeinterface hasNext : ()Z
    //   165: ifeq -> 283
    //   168: aload #8
    //   170: invokeinterface next : ()Ljava/lang/Object;
    //   175: checkcast wo
    //   178: astore #7
    //   180: aload #11
    //   182: iconst_0
    //   183: aload #7
    //   185: invokevirtual toString : ()Ljava/lang/String;
    //   188: aastore
    //   189: aload_0
    //   190: aload #7
    //   192: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   195: checkcast v00
    //   198: astore #7
    //   200: aload #7
    //   202: getfield b : Ld61;
    //   205: invokevirtual toString : ()Ljava/lang/String;
    //   208: astore #12
    //   210: getstatic in/krosbits/musicolet/MyApplication.F : Lyp1;
    //   213: aload #12
    //   215: invokevirtual d : (Ljava/lang/String;)Lv00;
    //   218: astore #12
    //   220: aload #12
    //   222: ifnull -> 245
    //   225: aload #12
    //   227: invokevirtual j : ()Landroid/net/Uri;
    //   230: invokevirtual toString : ()Ljava/lang/String;
    //   233: astore #7
    //   235: goto -> 255
    //   238: astore #8
    //   240: iconst_1
    //   241: istore_2
    //   242: goto -> 319
    //   245: aload #7
    //   247: invokevirtual j : ()Landroid/net/Uri;
    //   250: invokevirtual toString : ()Ljava/lang/String;
    //   253: astore #7
    //   255: aload #10
    //   257: getstatic r3/IKWi/AyxAR.dkLGukwwH : Ljava/lang/String;
    //   260: aload #7
    //   262: invokevirtual put : (Ljava/lang/String;Ljava/lang/String;)V
    //   265: aload #6
    //   267: ldc 'TABLE_SONGS'
    //   269: aload #10
    //   271: ldc 'COL_PATH=?'
    //   273: aload #11
    //   275: iconst_4
    //   276: invokevirtual updateWithOnConflict : (Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;I)I
    //   279: pop
    //   280: goto -> 158
    //   283: aload #6
    //   285: invokevirtual setTransactionSuccessful : ()V
    //   288: getstatic l51.a : Ljava/util/HashMap;
    //   291: invokevirtual clear : ()V
    //   294: aload #6
    //   296: invokevirtual endTransaction : ()V
    //   299: aload #6
    //   301: astore #7
    //   303: aload #7
    //   305: invokevirtual close : ()V
    //   308: goto -> 362
    //   311: astore #8
    //   313: iconst_0
    //   314: istore_2
    //   315: aload #7
    //   317: astore #6
    //   319: aload #8
    //   321: invokevirtual printStackTrace : ()V
    //   324: aload #6
    //   326: ifnull -> 362
    //   329: aload #6
    //   331: astore #7
    //   333: iload_2
    //   334: ifeq -> 303
    //   337: goto -> 294
    //   340: astore_0
    //   341: aload #6
    //   343: ifnull -> 360
    //   346: iload_2
    //   347: ifeq -> 355
    //   350: aload #6
    //   352: invokevirtual endTransaction : ()V
    //   355: aload #6
    //   357: invokevirtual close : ()V
    //   360: aload_0
    //   361: athrow
    //   362: iinc #1, 1
    //   365: goto -> 45
    //   368: astore_0
    //   369: aload_0
    //   370: invokevirtual printStackTrace : ()V
    //   373: return
    // Exception table:
    //   from	to	target	type
    //   26	34	368	finally
    //   39	43	368	finally
    //   56	103	368	finally
    //   106	113	368	finally
    //   126	138	311	finally
    //   142	147	311	finally
    //   147	158	238	finally
    //   158	220	238	finally
    //   225	235	238	finally
    //   245	255	238	finally
    //   255	280	238	finally
    //   283	294	238	finally
    //   294	299	368	finally
    //   303	308	368	finally
    //   319	324	340	finally
    //   350	355	368	finally
    //   355	360	368	finally
    //   360	362	368	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */