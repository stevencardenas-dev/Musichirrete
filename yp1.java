import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import in.krosbits.musicolet.GhostSearchActivity;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;

public final class yp1 {
  public static String e = Environment.getExternalStorageDirectory().getAbsolutePath();
  
  public static HashSet f = null;
  
  public static zi g;
  
  public static final String h = zLtYiJUm.rHhjNhMQr;
  
  public static final StorageManager i = (StorageManager)MyApplication.i.getApplicationContext().getSystemService("storage");
  
  public boolean a = false;
  
  public ArrayList b = null;
  
  public xp1 c;
  
  public Boolean d;
  
  public yp1() {
    g = null;
    e = Environment.getExternalStorageDirectory().getAbsolutePath();
  }
  
  public static boolean a() {
    return (MyApplication.j.c.s > 10800000L && !Integer.valueOf(2).equals(GhostSearchActivity.b));
  }
  
  public static zi n() {
    // Byte code:
    //   0: getstatic yp1.g : Lzi;
    //   3: ifnonnull -> 359
    //   6: ldc 'SM>G_UTPM'
    //   8: invokestatic F : (Ljava/lang/String;)V
    //   11: new java/util/HashSet
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: new java/util/HashSet
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #6
    //   29: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   32: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   35: invokestatic F : (Landroid/content/Context;)Ljava/util/ArrayList;
    //   38: astore #7
    //   40: aload #7
    //   42: invokevirtual size : ()I
    //   45: pop
    //   46: aload #7
    //   48: invokevirtual size : ()I
    //   51: istore_1
    //   52: iconst_0
    //   53: istore_0
    //   54: iload_0
    //   55: iload_1
    //   56: if_icmpge -> 123
    //   59: aload #7
    //   61: iload_0
    //   62: invokevirtual get : (I)Ljava/lang/Object;
    //   65: astore_3
    //   66: iinc #0, 1
    //   69: aload_3
    //   70: checkcast java/lang/String
    //   73: astore_3
    //   74: new java/io/File
    //   77: astore #4
    //   79: aload #4
    //   81: aload_3
    //   82: invokespecial <init> : (Ljava/lang/String;)V
    //   85: aload #6
    //   87: aload #4
    //   89: invokevirtual getName : ()Ljava/lang/String;
    //   92: invokevirtual add : (Ljava/lang/Object;)Z
    //   95: pop
    //   96: aload #4
    //   98: invokevirtual getCanonicalPath : ()Ljava/lang/String;
    //   101: astore #4
    //   103: aload #4
    //   105: astore_3
    //   106: goto -> 113
    //   109: astore_3
    //   110: goto -> 198
    //   113: aload #5
    //   115: aload_3
    //   116: invokevirtual add : (Ljava/lang/Object;)Z
    //   119: pop
    //   120: goto -> 54
    //   123: invokestatic y : ()Ljava/util/HashSet;
    //   126: invokevirtual iterator : ()Ljava/util/Iterator;
    //   129: astore #7
    //   131: aload #7
    //   133: invokeinterface hasNext : ()Z
    //   138: ifeq -> 202
    //   141: aload #7
    //   143: invokeinterface next : ()Ljava/lang/Object;
    //   148: checkcast java/lang/String
    //   151: astore_3
    //   152: new java/io/File
    //   155: astore #4
    //   157: aload #4
    //   159: aload_3
    //   160: invokespecial <init> : (Ljava/lang/String;)V
    //   163: aload #6
    //   165: aload #4
    //   167: invokevirtual getName : ()Ljava/lang/String;
    //   170: invokevirtual contains : (Ljava/lang/Object;)Z
    //   173: istore_2
    //   174: iload_2
    //   175: ifne -> 131
    //   178: aload #4
    //   180: invokevirtual getCanonicalPath : ()Ljava/lang/String;
    //   183: astore #4
    //   185: aload #4
    //   187: astore_3
    //   188: aload #5
    //   190: aload_3
    //   191: invokevirtual add : (Ljava/lang/Object;)Z
    //   194: pop
    //   195: goto -> 131
    //   198: aload_3
    //   199: invokevirtual printStackTrace : ()V
    //   202: new java/util/HashMap
    //   205: dup
    //   206: aload #5
    //   208: invokevirtual size : ()I
    //   211: invokespecial <init> : (I)V
    //   214: astore #7
    //   216: invokestatic getExternalStorageDirectory : ()Ljava/io/File;
    //   219: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   222: astore #6
    //   224: aload #5
    //   226: invokevirtual iterator : ()Ljava/util/Iterator;
    //   229: astore #5
    //   231: aload #5
    //   233: invokeinterface hasNext : ()Z
    //   238: ifeq -> 354
    //   241: aload #5
    //   243: invokeinterface next : ()Ljava/lang/Object;
    //   248: checkcast java/lang/String
    //   251: astore #4
    //   253: aload #6
    //   255: aload #4
    //   257: invokevirtual equals : (Ljava/lang/Object;)Z
    //   260: ifeq -> 269
    //   263: ldc 'primary'
    //   265: astore_3
    //   266: goto -> 300
    //   269: aload #4
    //   271: ifnull -> 297
    //   274: aload #4
    //   276: aload #4
    //   278: bipush #47
    //   280: invokevirtual lastIndexOf : (I)I
    //   283: iconst_1
    //   284: iadd
    //   285: invokevirtual substring : (I)Ljava/lang/String;
    //   288: astore_3
    //   289: goto -> 300
    //   292: astore_3
    //   293: aload_3
    //   294: invokevirtual printStackTrace : ()V
    //   297: aload #4
    //   299: astore_3
    //   300: aload #7
    //   302: aload_3
    //   303: aload #4
    //   305: invokevirtual a : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   308: pop
    //   309: new java/lang/StringBuilder
    //   312: dup
    //   313: ldc 'SM>G_UTPM> '
    //   315: invokespecial <init> : (Ljava/lang/String;)V
    //   318: astore #8
    //   320: aload #8
    //   322: aload_3
    //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: pop
    //   327: aload #8
    //   329: ldc '-'
    //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload #8
    //   337: aload #4
    //   339: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: pop
    //   343: aload #8
    //   345: invokevirtual toString : ()Ljava/lang/String;
    //   348: invokestatic F : (Ljava/lang/String;)V
    //   351: goto -> 231
    //   354: aload #7
    //   356: putstatic yp1.g : Lzi;
    //   359: getstatic yp1.g : Lzi;
    //   362: areturn
    //   363: astore #4
    //   365: goto -> 113
    //   368: astore #4
    //   370: goto -> 188
    // Exception table:
    //   from	to	target	type
    //   29	52	109	finally
    //   59	66	109	finally
    //   69	96	109	finally
    //   96	103	363	java/io/IOException
    //   96	103	109	finally
    //   113	120	109	finally
    //   123	131	109	finally
    //   131	174	109	finally
    //   178	185	368	java/io/IOException
    //   178	185	109	finally
    //   188	195	109	finally
    //   274	289	292	finally
  }
  
  public static String o(String paramString) {
    try {
      if (paramString.startsWith("Storage/")) {
        int i = paramString.indexOf('/', 8);
        return (i > 8) ? paramString.substring(8, i) : paramString.substring(8);
      } 
    } finally {}
    return null;
  }
  
  public final xp1 b(String paramString) {
    if (paramString != null) {
      String str = paramString.toLowerCase(Locale.ENGLISH);
      byte b = 0;
      ArrayList<Object> arrayList = m(false);
      int i = arrayList.size();
      while (b < i) {
        xp1 xp11 = (xp1)arrayList.get(b);
        b++;
        xp11 = xp11;
        if (str.equals(xp11.n))
          return xp11; 
      } 
    } 
    return null;
  }
  
  public final ml0 c(String paramString) {
    try {
      xp1 xp11 = b(o(paramString));
      if (xp11 != null) {
        Exception exception;
        try {
          int i = paramString.indexOf('/', 8);
        } finally {
          exception = null;
        } 
        if (exception.length() == 0)
          return new ml0(xp11.c()); 
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append(xp11.c());
        stringBuilder.append('/');
        stringBuilder.append((String)exception);
        return new ml0(stringBuilder.toString());
      } 
    } finally {
      Exception exception;
    } 
    return new ml0(paramString);
  }
  
  public final v00 d(String paramString) {
    try {
      if (p()) {
        xp1 xp11 = b(o(paramString));
        if (xp11 != null) {
          try {
            int i = paramString.indexOf('/', 8);
          } finally {
            paramString = null;
          } 
          if (paramString != null)
            return xp11.d().A(paramString); 
        } 
      } else if (Build.VERSION.SDK_INT >= 30) {
        return MyApplication.G.c(paramString);
      } 
    } finally {
      paramString = null;
    } 
  }
  
  public final String e(u00 paramu00, boolean paramBoolean) {
    String str3 = null;
    String str1 = null;
    String str2 = str3;
    try {
      String str;
      if (paramu00 instanceof v00) {
        str2 = str3;
        String str4 = ((v00)paramu00).b.toString();
        if (str4 != null) {
          str2 = str3;
          if (!str4.startsWith("~")) {
            if (paramBoolean) {
              str2 = str3;
              return ml0.a((c(str4)).b);
            } 
            return str4;
          } 
        } 
      } 
      str2 = str3;
      if (paramu00 instanceof cd1) {
        str2 = str3;
        paramu00 = paramu00;
        str2 = str3;
        if (((v00)paramu00).b.toString().startsWith("Storage")) {
          str2 = str3;
          str = ((v00)paramu00).b.toString();
        } else {
          str2 = str3;
          str = f(str.H());
        } 
        str1 = str;
      } else {
        str2 = str3;
        if (str.j().toString().startsWith("content:")) {
          str2 = str3;
          str1 = v00.B(MyApplication.i.getApplicationContext(), str.j());
        } 
      } 
      str2 = str1;
      if (str1 != null) {
        str2 = str1;
        if (paramBoolean) {
          str2 = str1;
          return ml0.a((c(str1)).b);
        } 
      } 
    } catch (Exception exception) {}
    return str2;
  }
  
  public final String f(String paramString) {
    xp1 xp11 = h(paramString);
    if (xp11 != null) {
      String str;
      try {
        str = xp11.e;
        int i = xp11.l.length();
        if (paramString.length() > i) {
          String str1 = "/".concat(paramString.substring(i + 1));
        } else {
          String str1 = "";
        } 
      } finally {}
      StringBuilder stringBuilder = new StringBuilder();
      this("Storage/");
      stringBuilder.append(str);
      stringBuilder.append((String)xp11);
      return stringBuilder.toString();
    } 
    if (paramString.startsWith("/storage/"))
      try {
        return "Storage/".concat(paramString.substring(9));
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    if (paramString.startsWith("/mnt/media_rw/"))
      try {
        return "Storage/".concat(paramString.substring(14));
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return null;
  }
  
  public final String g(v00 paramv00) {
    if (paramv00 instanceof cd1)
      return ((cd1)paramv00).H(); 
    String str = paramv00.y();
    if (str != null) {
      String str1 = paramv00.w();
      if (str1 != null) {
        String str2;
        xp1 xp11 = b(str);
        if (xp11 != null) {
          String str3 = xp11.l;
        } else {
          xp11 = null;
        } 
        xp1 xp12 = xp11;
        if (xp11 == null)
          str2 = (String)n().get(str); 
        if (str2 != null) {
          String str3;
          StringBuilder stringBuilder = x41.p(str2);
          if (!str1.isEmpty()) {
            str3 = "/";
          } else {
            str3 = "";
          } 
          return x41.n(stringBuilder, str3, str1);
        } 
      } 
    } 
    return null;
  }
  
  public final xp1 h(String paramString) {
    byte b = 0;
    try {
      ArrayList<Object> arrayList = m(false);
      int i = arrayList.size();
    } finally {
      paramString = null;
    } 
    return null;
  }
  
  public final xp1 i() {
    /* monitor enter ThisExpression{ObjectType{yp1}} */
    try {
      if (this.b == null)
        q(); 
    } finally {
      Exception exception;
    } 
    if (this.c == null) {
      ArrayList<Object> arrayList = this.b;
      if (arrayList != null) {
        int i = arrayList.size();
        byte b = 0;
        while (b < i) {
          xp1 xp12 = (xp1)arrayList.get(b);
          b++;
          xp12 = xp12;
          if (xp12.a) {
            this.c = xp12;
            break;
          } 
        } 
      } 
    } 
    xp1 xp11 = this.c;
    /* monitor exit ThisExpression{ObjectType{yp1}} */
    return xp11;
  }
  
  public final ArrayList j() {
    boolean bool = p();
    int i = 0;
    if (bool) {
      ArrayList<Object> arrayList = m(false);
      ArrayList<v00> arrayList1 = new ArrayList(arrayList.size());
      int j = arrayList.size();
      while (i < j) {
        xp1 xp11 = (xp1)arrayList.get(i);
        int k = i + 1;
        xp11 = xp11;
        i = k;
        if (xp11.j != -2) {
          v00 v00 = xp11.d();
          i = k;
          if (v00 != null) {
            arrayList1.add(v00);
            i = k;
          } 
        } 
      } 
      return arrayList1;
    } 
    return (Build.VERSION.SDK_INT >= 30) ? MyApplication.G.b() : new ArrayList(0);
  }
  
  public final ArrayList k() {
    int i = 0;
    ArrayList<Object> arrayList = m(false);
    ArrayList<xp1> arrayList1 = new ArrayList(arrayList.size());
    if (p()) {
      int j = arrayList.size();
      while (i < j) {
        xp1 xp11 = (xp1)arrayList.get(i);
        int k = i + 1;
        xp11 = xp11;
        i = k;
        if (xp11.i) {
          i = k;
          if (xp11.j == -2) {
            arrayList1.add(xp11);
            i = k;
          } 
        } 
      } 
    } 
    return arrayList1;
  }
  
  public final v00 l(v00 paramv00) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof cd1
    //   4: ifeq -> 539
    //   7: new java/lang/StringBuilder
    //   10: dup
    //   11: ldc_w 'SM>G_SRD: '
    //   14: invokespecial <init> : (Ljava/lang/String;)V
    //   17: astore_2
    //   18: aload_2
    //   19: aload_1
    //   20: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload_2
    //   25: ldc_w ', '
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload_2
    //   33: aload_1
    //   34: getfield b : Ld61;
    //   37: invokevirtual toString : ()Ljava/lang/String;
    //   40: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_2
    //   45: invokevirtual toString : ()Ljava/lang/String;
    //   48: invokestatic F : (Ljava/lang/String;)V
    //   51: new java/lang/StringBuilder
    //   54: dup
    //   55: ldc_w 'G_SRD>u:>'
    //   58: invokespecial <init> : (Ljava/lang/String;)V
    //   61: astore_2
    //   62: aload_2
    //   63: aload_1
    //   64: invokevirtual y : ()Ljava/lang/String;
    //   67: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: pop
    //   71: aload_2
    //   72: invokevirtual toString : ()Ljava/lang/String;
    //   75: invokestatic F : (Ljava/lang/String;)V
    //   78: aload_0
    //   79: aload_1
    //   80: invokevirtual y : ()Ljava/lang/String;
    //   83: invokevirtual b : (Ljava/lang/String;)Lxp1;
    //   86: astore #4
    //   88: new java/lang/StringBuilder
    //   91: dup
    //   92: ldc_w 'G_SRD>v:>'
    //   95: invokespecial <init> : (Ljava/lang/String;)V
    //   98: astore_3
    //   99: aload_3
    //   100: aload #4
    //   102: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_3
    //   107: ldc_w ', '
    //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload #4
    //   116: ifnull -> 131
    //   119: aload #4
    //   121: getfield c : Z
    //   124: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   127: astore_2
    //   128: goto -> 135
    //   131: ldc_w 'n'
    //   134: astore_2
    //   135: aload_3
    //   136: aload_2
    //   137: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload_3
    //   142: invokevirtual toString : ()Ljava/lang/String;
    //   145: invokestatic F : (Ljava/lang/String;)V
    //   148: aload #4
    //   150: ifnull -> 515
    //   153: aload #4
    //   155: getfield l : Ljava/lang/String;
    //   158: astore #5
    //   160: aload #4
    //   162: getfield c : Z
    //   165: ifeq -> 515
    //   168: aload_1
    //   169: getfield b : Ld61;
    //   172: invokevirtual toString : ()Ljava/lang/String;
    //   175: ldc_w 'Storage'
    //   178: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   181: ifeq -> 192
    //   184: aload_1
    //   185: invokevirtual w : ()Ljava/lang/String;
    //   188: astore_3
    //   189: goto -> 194
    //   192: aconst_null
    //   193: astore_3
    //   194: aload_3
    //   195: astore_2
    //   196: aload_3
    //   197: ifnonnull -> 275
    //   200: new java/lang/StringBuilder
    //   203: dup
    //   204: invokespecial <init> : ()V
    //   207: astore_2
    //   208: aload_2
    //   209: aload #5
    //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: pop
    //   215: aload_2
    //   216: ldc_w '/'
    //   219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: aload_2
    //   224: invokevirtual toString : ()Ljava/lang/String;
    //   227: astore_2
    //   228: aload_1
    //   229: invokevirtual j : ()Landroid/net/Uri;
    //   232: invokevirtual getPath : ()Ljava/lang/String;
    //   235: astore #6
    //   237: aload #6
    //   239: aload_2
    //   240: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   243: ifeq -> 259
    //   246: aload #6
    //   248: aload_2
    //   249: invokevirtual length : ()I
    //   252: invokevirtual substring : (I)Ljava/lang/String;
    //   255: astore_2
    //   256: goto -> 275
    //   259: aload_3
    //   260: astore_2
    //   261: aload #6
    //   263: aload #5
    //   265: invokevirtual equals : (Ljava/lang/Object;)Z
    //   268: ifeq -> 275
    //   271: ldc_w ''
    //   274: astore_2
    //   275: new java/lang/StringBuilder
    //   278: dup
    //   279: ldc_w 'G_SRD>rp>'
    //   282: invokespecial <init> : (Ljava/lang/String;)V
    //   285: astore_3
    //   286: aload_3
    //   287: aload_2
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload_3
    //   293: invokevirtual toString : ()Ljava/lang/String;
    //   296: invokestatic F : (Ljava/lang/String;)V
    //   299: aload_2
    //   300: ifnull -> 515
    //   303: aload #4
    //   305: getfield e : Ljava/lang/String;
    //   308: invokestatic Q : (Ljava/lang/String;)Ljava/lang/String;
    //   311: astore_3
    //   312: invokestatic v : ()Landroid/content/SharedPreferences;
    //   315: aload_3
    //   316: aconst_null
    //   317: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   322: astore_3
    //   323: aload_3
    //   324: ifnull -> 340
    //   327: aload_3
    //   328: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   331: astore_3
    //   332: goto -> 342
    //   335: astore_3
    //   336: aload_3
    //   337: invokevirtual printStackTrace : ()V
    //   340: aconst_null
    //   341: astore_3
    //   342: aload_3
    //   343: ifnull -> 349
    //   346: goto -> 355
    //   349: aload #4
    //   351: invokevirtual b : ()Landroid/net/Uri;
    //   354: astore_3
    //   355: new java/lang/StringBuilder
    //   358: dup
    //   359: ldc_w 'G_SRD?ssu: '
    //   362: invokespecial <init> : (Ljava/lang/String;)V
    //   365: astore #5
    //   367: aload #5
    //   369: aload_3
    //   370: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: aload #5
    //   376: invokevirtual toString : ()Ljava/lang/String;
    //   379: invokestatic F : (Ljava/lang/String;)V
    //   382: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   385: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   388: astore #5
    //   390: aload #4
    //   392: getfield e : Ljava/lang/String;
    //   395: astore #4
    //   397: aload_3
    //   398: ifnonnull -> 406
    //   401: aconst_null
    //   402: astore_3
    //   403: goto -> 433
    //   406: new ww1
    //   409: dup
    //   410: aconst_null
    //   411: aload #5
    //   413: aload_3
    //   414: invokestatic z : (Landroid/net/Uri;)Landroid/net/Uri;
    //   417: aconst_null
    //   418: ldc_w 'Storage'
    //   421: aload #4
    //   423: ldc_w 'vnd.android.document/directory'
    //   426: ldc2_w -1
    //   429: invokespecial <init> : (Lww1;Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    //   432: astore_3
    //   433: new java/lang/StringBuilder
    //   436: dup
    //   437: ldc_w 'G_SRD?vdf: '
    //   440: invokespecial <init> : (Ljava/lang/String;)V
    //   443: astore #4
    //   445: aload #4
    //   447: aload_3
    //   448: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   451: pop
    //   452: aload #4
    //   454: invokevirtual toString : ()Ljava/lang/String;
    //   457: invokestatic F : (Ljava/lang/String;)V
    //   460: aload_3
    //   461: aload_2
    //   462: invokevirtual A : (Ljava/lang/String;)Lv00;
    //   465: astore_2
    //   466: aload_2
    //   467: ifnull -> 515
    //   470: new java/lang/StringBuilder
    //   473: dup
    //   474: ldc_w 'SM>G_SRD>r: '
    //   477: invokespecial <init> : (Ljava/lang/String;)V
    //   480: astore_3
    //   481: aload_3
    //   482: aload_2
    //   483: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   486: pop
    //   487: aload_3
    //   488: invokevirtual toString : ()Ljava/lang/String;
    //   491: invokestatic F : (Ljava/lang/String;)V
    //   494: aload_2
    //   495: new d61
    //   498: dup
    //   499: aload_1
    //   500: getfield b : Ld61;
    //   503: invokevirtual toString : ()Ljava/lang/String;
    //   506: aconst_null
    //   507: invokespecial <init> : (Ljava/lang/String;Lq01;)V
    //   510: putfield b : Ld61;
    //   513: aload_2
    //   514: areturn
    //   515: new java/lang/StringBuilder
    //   518: dup
    //   519: ldc_w 'SM>G_SRD>r: '
    //   522: invokespecial <init> : (Ljava/lang/String;)V
    //   525: astore_2
    //   526: aload_2
    //   527: aload_1
    //   528: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   531: pop
    //   532: aload_2
    //   533: invokevirtual toString : ()Ljava/lang/String;
    //   536: invokestatic F : (Ljava/lang/String;)V
    //   539: aload_1
    //   540: areturn
    //   541: astore_2
    //   542: aload_3
    //   543: astore_2
    //   544: goto -> 275
    // Exception table:
    //   from	to	target	type
    //   246	256	541	finally
    //   327	332	335	finally
  }
  
  public final ArrayList m(boolean paramBoolean) {
    /* monitor enter ThisExpression{ObjectType{yp1}} */
    try {
      if (this.b == null)
        q(); 
    } finally {
      Exception exception;
    } 
    if (paramBoolean) {
      ArrayList arrayList1 = new ArrayList(this.b);
      /* monitor exit ThisExpression{ObjectType{yp1}} */
      return arrayList1;
    } 
    ArrayList arrayList = this.b;
    /* monitor exit ThisExpression{ObjectType{yp1}} */
    return arrayList;
  }
  
  public final boolean p() {
    if (this.b == null)
      return (Build.VERSION.SDK_INT <= 29 || MyApplication.v().getBoolean("SAF_B_LGCSTM", true)); 
    if (this.d == null) {
      boolean bool1;
      int i = Build.VERSION.SDK_INT;
      if (i <= 29 || MyApplication.v().getBoolean("SAF_B_LGCSTM", true)) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      boolean bool2 = bool1;
      if (i >= 30) {
        bool2 = bool1;
        if (bool1) {
          boolean bool;
          ArrayList<Object> arrayList = this.b;
          int j = arrayList.size();
          i = 0;
          while (true) {
            bool = bool1;
            if (i < j) {
              Object object = arrayList.get(i);
              i++;
              if (((xp1)object).i) {
                bool = false;
                break;
              } 
              continue;
            } 
            break;
          } 
          bool2 = bool;
          if (!bool) {
            if (MyApplication.o().getBoolean("b_icdalfl", true))
              MyApplication.v().edit().putStringSet("SAF_SS_SMSU", new HashSet(Collections.singletonList(lw0.r.toString()))).apply(); 
            this.a = true;
            MyApplication.v().edit().putBoolean("SAF_B_LGCSTM", false).apply();
            bool2 = bool;
          } 
        } 
      } 
      this.d = Boolean.valueOf(bool2);
    } 
    return this.d.booleanValue();
  }
  
  public final void q() {
    // Byte code:
    //   0: getstatic org/jaudiotagger/audio/dff/vR/CKYHNesT.sXOAyHwHrY : Ljava/lang/String;
    //   3: invokestatic F : (Ljava/lang/String;)V
    //   6: aload_0
    //   7: aconst_null
    //   8: putfield b : Ljava/util/ArrayList;
    //   11: aload_0
    //   12: aconst_null
    //   13: putfield c : Lxp1;
    //   16: new java/util/HashSet
    //   19: dup
    //   20: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   23: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   26: invokestatic F : (Landroid/content/Context;)Ljava/util/ArrayList;
    //   29: invokespecial <init> : (Ljava/util/Collection;)V
    //   32: putstatic yp1.f : Ljava/util/HashSet;
    //   35: getstatic yp1.i : Landroid/os/storage/StorageManager;
    //   38: astore #7
    //   40: aload #7
    //   42: invokevirtual getStorageVolumes : ()Ljava/util/List;
    //   45: astore #8
    //   47: new java/util/ArrayList
    //   50: dup
    //   51: aload #8
    //   53: invokeinterface size : ()I
    //   58: invokespecial <init> : (I)V
    //   61: astore #6
    //   63: iconst_0
    //   64: istore_2
    //   65: iconst_0
    //   66: istore_1
    //   67: iload_1
    //   68: aload #8
    //   70: invokeinterface size : ()I
    //   75: if_icmpge -> 287
    //   78: aload #8
    //   80: iload_1
    //   81: invokeinterface get : (I)Ljava/lang/Object;
    //   86: checkcast android/os/storage/StorageVolume
    //   89: astore #10
    //   91: aload #10
    //   93: invokevirtual getState : ()Ljava/lang/String;
    //   96: astore #9
    //   98: getstatic android/os/Build$VERSION.SDK_INT : I
    //   101: bipush #30
    //   103: if_icmplt -> 128
    //   106: aload #10
    //   108: invokevirtual getDirectory : ()Ljava/io/File;
    //   111: astore #4
    //   113: aload #4
    //   115: ifnull -> 128
    //   118: aload #4
    //   120: invokevirtual getPath : ()Ljava/lang/String;
    //   123: astore #4
    //   125: goto -> 131
    //   128: aconst_null
    //   129: astore #4
    //   131: aload #4
    //   133: astore #5
    //   135: aload #4
    //   137: ifnonnull -> 177
    //   140: ldc_w android/os/storage/StorageVolume
    //   143: ldc_w 'getPath'
    //   146: aconst_null
    //   147: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   150: aload #10
    //   152: aconst_null
    //   153: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   156: astore #11
    //   158: aload #4
    //   160: astore #5
    //   162: aload #11
    //   164: instanceof java/lang/String
    //   167: ifeq -> 177
    //   170: aload #11
    //   172: checkcast java/lang/String
    //   175: astore #5
    //   177: new xp1
    //   180: astore #4
    //   182: aload #4
    //   184: aload #10
    //   186: invokevirtual isPrimary : ()Z
    //   189: aload #10
    //   191: invokevirtual isRemovable : ()Z
    //   194: ldc_w 'mounted_ro'
    //   197: aload #10
    //   199: invokevirtual getState : ()Ljava/lang/String;
    //   202: invokevirtual equals : (Ljava/lang/Object;)Z
    //   205: aload #10
    //   207: invokevirtual getUuid : ()Ljava/lang/String;
    //   210: aload #10
    //   212: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   215: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   218: invokevirtual getDescription : (Landroid/content/Context;)Ljava/lang/String;
    //   221: aload #9
    //   223: aload #10
    //   225: aload #5
    //   227: invokespecial <init> : (ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/storage/StorageVolume;Ljava/lang/String;)V
    //   230: aload #6
    //   232: aload #4
    //   234: invokevirtual add : (Ljava/lang/Object;)Z
    //   237: pop
    //   238: aload #4
    //   240: getfield a : Z
    //   243: ifeq -> 281
    //   246: aload_0
    //   247: aload #4
    //   249: putfield c : Lxp1;
    //   252: goto -> 281
    //   255: astore #4
    //   257: goto -> 265
    //   260: astore #4
    //   262: goto -> 273
    //   265: aload #4
    //   267: invokevirtual printStackTrace : ()V
    //   270: goto -> 281
    //   273: aload #4
    //   275: invokevirtual getMessage : ()Ljava/lang/String;
    //   278: invokestatic v : (Ljava/lang/String;)V
    //   281: iinc #1, 1
    //   284: goto -> 67
    //   287: getstatic android/os/Build$VERSION.SDK_INT : I
    //   290: bipush #30
    //   292: if_icmplt -> 500
    //   295: new java/util/HashSet
    //   298: astore #4
    //   300: aload #4
    //   302: aload #6
    //   304: invokevirtual size : ()I
    //   307: invokespecial <init> : (I)V
    //   310: aload #6
    //   312: invokevirtual size : ()I
    //   315: istore_3
    //   316: iconst_0
    //   317: istore_1
    //   318: iload_1
    //   319: iload_3
    //   320: if_icmpge -> 356
    //   323: aload #6
    //   325: iload_1
    //   326: invokevirtual get : (I)Ljava/lang/Object;
    //   329: astore #5
    //   331: iinc #1, 1
    //   334: aload #4
    //   336: aload #5
    //   338: checkcast xp1
    //   341: getfield n : Ljava/lang/String;
    //   344: invokevirtual add : (Ljava/lang/Object;)Z
    //   347: pop
    //   348: goto -> 318
    //   351: astore #4
    //   353: goto -> 495
    //   356: aload #7
    //   358: invokevirtual getRecentStorageVolumes : ()Ljava/util/List;
    //   361: invokeinterface iterator : ()Ljava/util/Iterator;
    //   366: astore #10
    //   368: aload #10
    //   370: invokeinterface hasNext : ()Z
    //   375: ifeq -> 500
    //   378: aload #10
    //   380: invokeinterface next : ()Ljava/lang/Object;
    //   385: checkcast android/os/storage/StorageVolume
    //   388: astore #8
    //   390: aload #8
    //   392: invokevirtual getState : ()Ljava/lang/String;
    //   395: astore #7
    //   397: aload #8
    //   399: invokevirtual getUuid : ()Ljava/lang/String;
    //   402: astore #5
    //   404: aload #5
    //   406: ifnull -> 368
    //   409: ldc_w 'mounted'
    //   412: aload #7
    //   414: invokevirtual equals : (Ljava/lang/Object;)Z
    //   417: ifne -> 431
    //   420: ldc_w 'mounted_ro'
    //   423: aload #7
    //   425: invokevirtual equals : (Ljava/lang/Object;)Z
    //   428: ifeq -> 368
    //   431: aload #4
    //   433: aload #5
    //   435: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   438: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   441: invokevirtual contains : (Ljava/lang/Object;)Z
    //   444: ifne -> 368
    //   447: new xp1
    //   450: astore #9
    //   452: aload #9
    //   454: iconst_0
    //   455: iconst_1
    //   456: ldc_w 'mounted_ro'
    //   459: aload #7
    //   461: invokevirtual equals : (Ljava/lang/Object;)Z
    //   464: aload #5
    //   466: aload #8
    //   468: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   471: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   474: invokevirtual getDescription : (Landroid/content/Context;)Ljava/lang/String;
    //   477: aload #7
    //   479: aconst_null
    //   480: aconst_null
    //   481: invokespecial <init> : (ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/storage/StorageVolume;Ljava/lang/String;)V
    //   484: aload #6
    //   486: aload #9
    //   488: invokevirtual add : (Ljava/lang/Object;)Z
    //   491: pop
    //   492: goto -> 368
    //   495: aload #4
    //   497: invokevirtual printStackTrace : ()V
    //   500: aload #6
    //   502: new w00
    //   505: dup
    //   506: bipush #13
    //   508: invokespecial <init> : (I)V
    //   511: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   514: aload_0
    //   515: aload #6
    //   517: putfield b : Ljava/util/ArrayList;
    //   520: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   523: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   526: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   529: invokevirtual getPersistedUriPermissions : ()Ljava/util/List;
    //   532: astore #5
    //   534: aload #5
    //   536: invokeinterface size : ()I
    //   541: ifne -> 547
    //   544: goto -> 759
    //   547: new java/util/HashSet
    //   550: dup
    //   551: aload #5
    //   553: invokeinterface size : ()I
    //   558: invokespecial <init> : (I)V
    //   561: astore #4
    //   563: aload #5
    //   565: invokeinterface iterator : ()Ljava/util/Iterator;
    //   570: astore #6
    //   572: aload #6
    //   574: invokeinterface hasNext : ()Z
    //   579: ifeq -> 607
    //   582: aload #4
    //   584: aload #6
    //   586: invokeinterface next : ()Ljava/lang/Object;
    //   591: checkcast android/content/UriPermission
    //   594: invokevirtual getUri : ()Landroid/net/Uri;
    //   597: invokevirtual toString : ()Ljava/lang/String;
    //   600: invokevirtual add : (Ljava/lang/Object;)Z
    //   603: pop
    //   604: goto -> 572
    //   607: new java/util/ArrayList
    //   610: dup
    //   611: aload #5
    //   613: invokeinterface size : ()I
    //   618: invokespecial <init> : (I)V
    //   621: astore #5
    //   623: aload_0
    //   624: iconst_0
    //   625: invokevirtual m : (Z)Ljava/util/ArrayList;
    //   628: astore #6
    //   630: aload #6
    //   632: invokevirtual size : ()I
    //   635: istore_3
    //   636: iload_2
    //   637: istore_1
    //   638: iload_1
    //   639: iload_3
    //   640: if_icmpge -> 747
    //   643: aload #6
    //   645: iload_1
    //   646: invokevirtual get : (I)Ljava/lang/Object;
    //   649: astore #7
    //   651: iload_1
    //   652: iconst_1
    //   653: iadd
    //   654: istore_2
    //   655: aload #7
    //   657: checkcast xp1
    //   660: astore #7
    //   662: aload #7
    //   664: getfield e : Ljava/lang/String;
    //   667: invokestatic Q : (Ljava/lang/String;)Ljava/lang/String;
    //   670: astore #8
    //   672: invokestatic v : ()Landroid/content/SharedPreferences;
    //   675: aload #8
    //   677: aconst_null
    //   678: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   683: astore #8
    //   685: iload_2
    //   686: istore_1
    //   687: aload #8
    //   689: ifnull -> 638
    //   692: iload_2
    //   693: istore_1
    //   694: aload #4
    //   696: aload #8
    //   698: invokevirtual contains : (Ljava/lang/Object;)Z
    //   701: ifne -> 638
    //   704: aload #7
    //   706: getfield e : Ljava/lang/String;
    //   709: invokestatic Q : (Ljava/lang/String;)Ljava/lang/String;
    //   712: astore #8
    //   714: invokestatic v : ()Landroid/content/SharedPreferences;
    //   717: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   722: aload #8
    //   724: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   729: invokeinterface apply : ()V
    //   734: aload #5
    //   736: aload #7
    //   738: invokevirtual add : (Ljava/lang/Object;)Z
    //   741: pop
    //   742: iload_2
    //   743: istore_1
    //   744: goto -> 638
    //   747: aload #5
    //   749: invokevirtual size : ()I
    //   752: ifle -> 759
    //   755: aload_0
    //   756: invokevirtual q : ()V
    //   759: return
    //   760: astore #5
    //   762: aload #4
    //   764: astore #5
    //   766: goto -> 177
    // Exception table:
    //   from	to	target	type
    //   140	158	760	finally
    //   162	177	760	finally
    //   177	252	260	java/lang/IllegalArgumentException
    //   177	252	255	finally
    //   287	316	351	finally
    //   323	331	351	finally
    //   334	348	351	finally
    //   356	368	351	finally
    //   368	404	351	finally
    //   409	431	351	finally
    //   431	492	351	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */