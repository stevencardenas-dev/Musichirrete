import android.content.Context;
import android.view.Display;
import java.util.ArrayList;

public final class of {
  public boolean a;
  
  public Object b;
  
  public Object c;
  
  public Object d;
  
  public of(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_1
    //   5: ifnonnull -> 13
    //   8: aconst_null
    //   9: astore_3
    //   10: goto -> 18
    //   13: aload_1
    //   14: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   17: astore_3
    //   18: aload_0
    //   19: aload_3
    //   20: putfield b : Ljava/lang/Object;
    //   23: getstatic d12.a : I
    //   26: istore_2
    //   27: aload_1
    //   28: ifnull -> 75
    //   31: aload_1
    //   32: ldc 'phone'
    //   34: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   37: checkcast android/telephony/TelephonyManager
    //   40: astore_1
    //   41: aload_1
    //   42: ifnull -> 75
    //   45: aload_1
    //   46: invokevirtual getNetworkCountryIso : ()Ljava/lang/String;
    //   49: astore_1
    //   50: aload_1
    //   51: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   54: ifne -> 75
    //   57: aload_1
    //   58: ifnonnull -> 64
    //   61: goto -> 97
    //   64: aload_1
    //   65: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   68: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   71: astore_1
    //   72: goto -> 97
    //   75: invokestatic getDefault : ()Ljava/util/Locale;
    //   78: invokevirtual getCountry : ()Ljava/lang/String;
    //   81: astore_1
    //   82: aload_1
    //   83: ifnonnull -> 89
    //   86: goto -> 97
    //   89: aload_1
    //   90: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   93: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   96: astore_1
    //   97: getstatic wv.i : Ljava/util/Map;
    //   100: aload_1
    //   101: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   106: checkcast [I
    //   109: astore_3
    //   110: aload_3
    //   111: astore_1
    //   112: aload_3
    //   113: ifnonnull -> 136
    //   116: iconst_4
    //   117: newarray int
    //   119: astore_1
    //   120: aload_1
    //   121: iconst_0
    //   122: iconst_2
    //   123: iastore
    //   124: aload_1
    //   125: iconst_1
    //   126: iconst_2
    //   127: iastore
    //   128: aload_1
    //   129: iconst_2
    //   130: iconst_2
    //   131: iastore
    //   132: aload_1
    //   133: iconst_3
    //   134: iconst_2
    //   135: iastore
    //   136: new android/util/SparseArray
    //   139: dup
    //   140: bipush #6
    //   142: invokespecial <init> : (I)V
    //   145: astore_3
    //   146: aload_3
    //   147: iconst_0
    //   148: ldc2_w 1000000
    //   151: invokestatic valueOf : (J)Ljava/lang/Long;
    //   154: invokevirtual append : (ILjava/lang/Object;)V
    //   157: getstatic wv.j : [J
    //   160: astore #5
    //   162: aload_3
    //   163: iconst_2
    //   164: aload #5
    //   166: aload_1
    //   167: iconst_0
    //   168: iaload
    //   169: laload
    //   170: invokestatic valueOf : (J)Ljava/lang/Long;
    //   173: invokevirtual append : (ILjava/lang/Object;)V
    //   176: aload_3
    //   177: iconst_3
    //   178: getstatic wv.k : [J
    //   181: aload_1
    //   182: iconst_1
    //   183: iaload
    //   184: laload
    //   185: invokestatic valueOf : (J)Ljava/lang/Long;
    //   188: invokevirtual append : (ILjava/lang/Object;)V
    //   191: aload_3
    //   192: iconst_4
    //   193: getstatic wv.l : [J
    //   196: aload_1
    //   197: iconst_2
    //   198: iaload
    //   199: laload
    //   200: invokestatic valueOf : (J)Ljava/lang/Long;
    //   203: invokevirtual append : (ILjava/lang/Object;)V
    //   206: getstatic wv.m : [J
    //   209: astore #4
    //   211: aload_3
    //   212: iconst_5
    //   213: aload #4
    //   215: aload_1
    //   216: iconst_3
    //   217: iaload
    //   218: laload
    //   219: invokestatic valueOf : (J)Ljava/lang/Long;
    //   222: invokevirtual append : (ILjava/lang/Object;)V
    //   225: aload_3
    //   226: bipush #7
    //   228: aload #5
    //   230: aload_1
    //   231: iconst_0
    //   232: iaload
    //   233: laload
    //   234: invokestatic valueOf : (J)Ljava/lang/Long;
    //   237: invokevirtual append : (ILjava/lang/Object;)V
    //   240: aload_3
    //   241: bipush #9
    //   243: aload #4
    //   245: aload_1
    //   246: iconst_3
    //   247: iaload
    //   248: laload
    //   249: invokestatic valueOf : (J)Ljava/lang/Long;
    //   252: invokevirtual append : (ILjava/lang/Object;)V
    //   255: aload_0
    //   256: aload_3
    //   257: putfield c : Ljava/lang/Object;
    //   260: aload_0
    //   261: getstatic j30.f : Lj30;
    //   264: putfield d : Ljava/lang/Object;
    //   267: aload_0
    //   268: iconst_1
    //   269: putfield a : Z
    //   272: return
  }
  
  public boolean a() {
    ArrayList<Object> arrayList = (ArrayList)this.d;
    if (!((ArrayList)this.c).isEmpty())
      return true; 
    if (!arrayList.isEmpty()) {
      int i = arrayList.size();
      byte b = 0;
      label11: while (b < i) {
        Object object = arrayList.get(b);
        b++;
        if (!((h12)object).h.isEmpty())
          break label11; 
      } 
    } 
    return false;
  }
  
  public boolean b() {
    return ((tz0)this.b != null);
  }
  
  public void c() {
    this.a = true;
  }
  
  public boolean d(Display paramDisplay) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: iconst_0
    //   4: istore #5
    //   6: iconst_0
    //   7: istore_2
    //   8: iconst_0
    //   9: istore #6
    //   11: iload #6
    //   13: istore_3
    //   14: aload_0
    //   15: getfield c : Ljava/lang/Object;
    //   18: checkcast android/view/Display
    //   21: aload_1
    //   22: if_acmpeq -> 342
    //   25: iload #6
    //   27: istore_3
    //   28: aload_0
    //   29: getfield b : Ljava/lang/Object;
    //   32: checkcast tz0
    //   35: astore #7
    //   37: aload #7
    //   39: ifnull -> 92
    //   42: iload #6
    //   44: istore_3
    //   45: aload #7
    //   47: invokevirtual getDisplay : ()Landroid/view/Display;
    //   50: aload_1
    //   51: if_acmpeq -> 92
    //   54: iload #6
    //   56: istore_3
    //   57: ldc 'pss:up>d'
    //   59: invokestatic F : (Ljava/lang/String;)V
    //   62: iload #6
    //   64: istore_3
    //   65: aload_0
    //   66: getfield b : Ljava/lang/Object;
    //   69: checkcast tz0
    //   72: invokevirtual dismiss : ()V
    //   75: iload #6
    //   77: istore_3
    //   78: aload_0
    //   79: aconst_null
    //   80: putfield b : Ljava/lang/Object;
    //   83: goto -> 92
    //   86: astore_1
    //   87: iload_3
    //   88: istore_2
    //   89: goto -> 338
    //   92: iload #6
    //   94: istore_3
    //   95: iload #5
    //   97: istore_2
    //   98: invokestatic U : ()Z
    //   101: ifeq -> 305
    //   104: iload #6
    //   106: istore_3
    //   107: iload #5
    //   109: istore_2
    //   110: aload_0
    //   111: getfield b : Ljava/lang/Object;
    //   114: checkcast tz0
    //   117: ifnonnull -> 305
    //   120: iload #5
    //   122: istore_2
    //   123: aload_1
    //   124: ifnull -> 305
    //   127: iload #6
    //   129: istore_3
    //   130: iload #5
    //   132: istore_2
    //   133: aload_0
    //   134: getfield a : Z
    //   137: ifeq -> 305
    //   140: iload #6
    //   142: istore_3
    //   143: iload #5
    //   145: istore_2
    //   146: invokestatic o : ()Landroid/content/SharedPreferences;
    //   149: ldc 'k_b_mpsfscmr'
    //   151: iconst_1
    //   152: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   157: ifeq -> 305
    //   160: iload #6
    //   162: istore_3
    //   163: new java/lang/StringBuilder
    //   166: astore #7
    //   168: iload #6
    //   170: istore_3
    //   171: aload #7
    //   173: ldc 'pss:up>n>'
    //   175: invokespecial <init> : (Ljava/lang/String;)V
    //   178: iload #6
    //   180: istore_3
    //   181: aload #7
    //   183: aload_1
    //   184: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: iload #6
    //   190: istore_3
    //   191: aload #7
    //   193: invokevirtual toString : ()Ljava/lang/String;
    //   196: invokestatic F : (Ljava/lang/String;)V
    //   199: iload #6
    //   201: istore_3
    //   202: new tz0
    //   205: astore #7
    //   207: iload #6
    //   209: istore_3
    //   210: aload #7
    //   212: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   215: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   218: aload_1
    //   219: invokespecial <init> : (Landroid/content/Context;Landroid/view/Display;)V
    //   222: iload #6
    //   224: istore_3
    //   225: aload_0
    //   226: aload #7
    //   228: putfield b : Ljava/lang/Object;
    //   231: iload #6
    //   233: istore_3
    //   234: aload #7
    //   236: aload_0
    //   237: getfield d : Ljava/lang/Object;
    //   240: checkcast ty
    //   243: invokevirtual setOnDismissListener : (Landroid/content/DialogInterface$OnDismissListener;)V
    //   246: iload #6
    //   248: istore_3
    //   249: aload_0
    //   250: getfield b : Ljava/lang/Object;
    //   253: checkcast tz0
    //   256: invokevirtual show : ()V
    //   259: aload_0
    //   260: aload_1
    //   261: putfield c : Ljava/lang/Object;
    //   264: iconst_1
    //   265: istore_2
    //   266: goto -> 305
    //   269: astore_1
    //   270: iconst_1
    //   271: istore_2
    //   272: goto -> 338
    //   275: astore_1
    //   276: iconst_1
    //   277: istore_2
    //   278: goto -> 285
    //   281: astore_1
    //   282: iload #4
    //   284: istore_2
    //   285: iload_2
    //   286: istore_3
    //   287: ldc 'pss:up>e>'
    //   289: invokestatic v : (Ljava/lang/String;)V
    //   292: iload_2
    //   293: istore_3
    //   294: aload_1
    //   295: invokevirtual printStackTrace : ()V
    //   298: iload_2
    //   299: istore_3
    //   300: aload_0
    //   301: aconst_null
    //   302: putfield b : Ljava/lang/Object;
    //   305: iload_2
    //   306: istore_3
    //   307: aload_0
    //   308: getfield b : Ljava/lang/Object;
    //   311: checkcast tz0
    //   314: astore_1
    //   315: aload_1
    //   316: ifnull -> 328
    //   319: iload_2
    //   320: istore_3
    //   321: aload_1
    //   322: invokevirtual a : ()V
    //   325: goto -> 342
    //   328: iload_2
    //   329: istore_3
    //   330: aload_0
    //   331: aconst_null
    //   332: putfield c : Ljava/lang/Object;
    //   335: goto -> 342
    //   338: aload_1
    //   339: invokevirtual printStackTrace : ()V
    //   342: iload_2
    //   343: ireturn
    // Exception table:
    //   from	to	target	type
    //   14	25	86	finally
    //   28	37	86	finally
    //   45	54	86	finally
    //   57	62	86	finally
    //   65	75	86	finally
    //   78	83	86	finally
    //   98	104	86	finally
    //   110	120	86	finally
    //   133	140	86	finally
    //   146	160	86	finally
    //   163	168	86	finally
    //   171	178	86	finally
    //   181	188	86	finally
    //   191	199	86	finally
    //   202	207	86	finally
    //   210	222	86	finally
    //   225	231	86	finally
    //   234	246	86	finally
    //   249	259	281	android/view/WindowManager$InvalidDisplayException
    //   249	259	86	finally
    //   259	264	275	android/view/WindowManager$InvalidDisplayException
    //   259	264	269	finally
    //   287	292	86	finally
    //   294	298	86	finally
    //   300	305	86	finally
    //   307	315	86	finally
    //   321	325	86	finally
    //   330	335	86	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\of.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */