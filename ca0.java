import android.content.Context;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class ca0 {
  public static final vp0 a = new vp0(16);
  
  public static final ThreadPoolExecutor b;
  
  public static final Object c = new Object();
  
  public static final zm1 d = new zm1(0);
  
  public static String a(int paramInt, List paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramList.size(); b++) {
      stringBuilder.append(((y90)paramList.get(b)).g);
      stringBuilder.append("-");
      stringBuilder.append(paramInt);
      if (b < paramList.size() - 1)
        stringBuilder.append(";"); 
    } 
    return stringBuilder.toString();
  }
  
  public static ba0 b(String paramString, Context paramContext, List paramList, int paramInt) {
    // Byte code:
    //   0: getstatic ca0.a : Lvp0;
    //   3: astore #7
    //   5: ldc 'getFontSync'
    //   7: invokestatic p0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10: invokestatic beginSection : (Ljava/lang/String;)V
    //   13: aload #7
    //   15: aload_0
    //   16: invokevirtual f : (Ljava/lang/Object;)Ljava/lang/Object;
    //   19: checkcast android/graphics/Typeface
    //   22: astore #8
    //   24: aload #8
    //   26: ifnull -> 44
    //   29: new ba0
    //   32: dup
    //   33: aload #8
    //   35: invokespecial <init> : (Landroid/graphics/Typeface;)V
    //   38: astore_0
    //   39: invokestatic endSection : ()V
    //   42: aload_0
    //   43: areturn
    //   44: aload_1
    //   45: aload_2
    //   46: invokestatic a : (Landroid/content/Context;Ljava/util/List;)Li80;
    //   49: astore #8
    //   51: aload #8
    //   53: getfield b : Ljava/util/List;
    //   56: astore_2
    //   57: aload #8
    //   59: getfield a : I
    //   62: istore #4
    //   64: iload #4
    //   66: ifeq -> 89
    //   69: iload #4
    //   71: iconst_1
    //   72: if_icmpeq -> 82
    //   75: bipush #-3
    //   77: istore #4
    //   79: goto -> 175
    //   82: bipush #-2
    //   84: istore #4
    //   86: goto -> 175
    //   89: aload_2
    //   90: iconst_0
    //   91: invokeinterface get : (I)Ljava/lang/Object;
    //   96: checkcast [Lha0;
    //   99: astore #8
    //   101: aload #8
    //   103: ifnull -> 172
    //   106: aload #8
    //   108: arraylength
    //   109: ifne -> 115
    //   112: goto -> 172
    //   115: aload #8
    //   117: arraylength
    //   118: istore #6
    //   120: iconst_0
    //   121: istore #4
    //   123: iload #4
    //   125: iload #6
    //   127: if_icmpge -> 166
    //   130: aload #8
    //   132: iload #4
    //   134: aaload
    //   135: getfield f : I
    //   138: istore #5
    //   140: iload #5
    //   142: ifeq -> 160
    //   145: iload #5
    //   147: ifge -> 153
    //   150: goto -> 75
    //   153: iload #5
    //   155: istore #4
    //   157: goto -> 175
    //   160: iinc #4, 1
    //   163: goto -> 123
    //   166: iconst_0
    //   167: istore #4
    //   169: goto -> 175
    //   172: iconst_1
    //   173: istore #4
    //   175: iload #4
    //   177: ifeq -> 195
    //   180: new ba0
    //   183: dup
    //   184: iload #4
    //   186: invokespecial <init> : (I)V
    //   189: astore_0
    //   190: invokestatic endSection : ()V
    //   193: aload_0
    //   194: areturn
    //   195: aload_2
    //   196: invokeinterface size : ()I
    //   201: iconst_1
    //   202: if_icmple -> 248
    //   205: getstatic android/os/Build$VERSION.SDK_INT : I
    //   208: bipush #29
    //   210: if_icmplt -> 248
    //   213: getstatic sz1.a : Lqz1;
    //   216: astore #8
    //   218: ldc 'TypefaceCompat.createFromFontInfoWithFallback'
    //   220: invokestatic p0 : (Ljava/lang/String;)Ljava/lang/String;
    //   223: invokestatic beginSection : (Ljava/lang/String;)V
    //   226: getstatic sz1.a : Lqz1;
    //   229: aload_1
    //   230: aload_2
    //   231: iload_3
    //   232: invokevirtual l : (Landroid/content/Context;Ljava/util/List;I)Landroid/graphics/Typeface;
    //   235: astore_1
    //   236: invokestatic endSection : ()V
    //   239: goto -> 285
    //   242: astore_0
    //   243: invokestatic endSection : ()V
    //   246: aload_0
    //   247: athrow
    //   248: aload_2
    //   249: iconst_0
    //   250: invokeinterface get : (I)Ljava/lang/Object;
    //   255: checkcast [Lha0;
    //   258: astore_2
    //   259: getstatic sz1.a : Lqz1;
    //   262: astore #8
    //   264: ldc 'TypefaceCompat.createFromFontInfo'
    //   266: invokestatic p0 : (Ljava/lang/String;)Ljava/lang/String;
    //   269: invokestatic beginSection : (Ljava/lang/String;)V
    //   272: getstatic sz1.a : Lqz1;
    //   275: aload_1
    //   276: aload_2
    //   277: iload_3
    //   278: invokevirtual k : (Landroid/content/Context;[Lha0;I)Landroid/graphics/Typeface;
    //   281: astore_1
    //   282: invokestatic endSection : ()V
    //   285: aload_1
    //   286: ifnull -> 311
    //   289: aload #7
    //   291: aload_0
    //   292: aload_1
    //   293: invokevirtual j : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   296: pop
    //   297: new ba0
    //   300: dup
    //   301: aload_1
    //   302: invokespecial <init> : (Landroid/graphics/Typeface;)V
    //   305: astore_0
    //   306: invokestatic endSection : ()V
    //   309: aload_0
    //   310: areturn
    //   311: new ba0
    //   314: dup
    //   315: bipush #-3
    //   317: invokespecial <init> : (I)V
    //   320: astore_0
    //   321: invokestatic endSection : ()V
    //   324: aload_0
    //   325: areturn
    //   326: astore_0
    //   327: invokestatic endSection : ()V
    //   330: aload_0
    //   331: athrow
    //   332: astore_0
    //   333: new ba0
    //   336: dup
    //   337: iconst_m1
    //   338: invokespecial <init> : (I)V
    //   341: astore_0
    //   342: invokestatic endSection : ()V
    //   345: aload_0
    //   346: areturn
    //   347: astore_0
    //   348: invokestatic endSection : ()V
    //   351: aload_0
    //   352: athrow
    // Exception table:
    //   from	to	target	type
    //   13	24	347	finally
    //   29	39	347	finally
    //   44	51	332	android/content/pm/PackageManager$NameNotFoundException
    //   44	51	347	finally
    //   51	64	347	finally
    //   89	101	347	finally
    //   106	112	347	finally
    //   115	120	347	finally
    //   130	140	347	finally
    //   180	190	347	finally
    //   195	226	347	finally
    //   226	236	242	finally
    //   236	239	347	finally
    //   243	248	347	finally
    //   248	272	347	finally
    //   272	282	326	finally
    //   282	285	347	finally
    //   289	306	347	finally
    //   311	321	347	finally
    //   327	332	347	finally
    //   333	342	347	finally
  }
  
  static {
    cg1 cg1 = new cg1(0);
    LinkedBlockingDeque<Runnable> linkedBlockingDeque = new LinkedBlockingDeque();
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, linkedBlockingDeque, cg1);
    threadPoolExecutor.allowCoreThreadTimeOut(true);
    b = threadPoolExecutor;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ca0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */