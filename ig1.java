import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class ig1 {
  public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
  
  public static ig1 g;
  
  public static final tp0 h = new tp0(6, 1);
  
  public WeakHashMap a;
  
  public final WeakHashMap b = new WeakHashMap<Object, Object>(0);
  
  public TypedValue c;
  
  public boolean d;
  
  public m2 e;
  
  public static ig1 c() {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{ig1}} */
    try {
      if (g == null) {
        ig1 ig12 = new ig1();
        this();
        g = ig12;
      } 
    } finally {
      Exception exception;
    } 
    ig1 ig11 = g;
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{ig1}} */
    return ig11;
  }
  
  public static PorterDuffColorFilter f(int paramInt, PorterDuff.Mode paramMode) {
    PorterDuffColorFilter porterDuffColorFilter;
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{ig1}} */
    try {
      tp0 tp01 = h;
      tp01.getClass();
      int i = (31 + paramInt) * 31;
      PorterDuffColorFilter porterDuffColorFilter1 = (PorterDuffColorFilter)tp01.f(Integer.valueOf(paramMode.hashCode() + i));
      porterDuffColorFilter = porterDuffColorFilter1;
      if (porterDuffColorFilter1 == null) {
        porterDuffColorFilter = new PorterDuffColorFilter();
        this(paramInt, paramMode);
        PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter)tp01.j(Integer.valueOf(paramMode.hashCode() + i), porterDuffColorFilter);
      } 
    } finally {}
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{ig1}} */
    return porterDuffColorFilter;
  }
  
  public final void a(Context paramContext, int paramInt, ColorStateList paramColorStateList) {
    if (this.a == null)
      this.a = new WeakHashMap<Object, Object>(); 
    eo1 eo12 = (eo1)this.a.get(paramContext);
    eo1 eo11 = eo12;
    if (eo12 == null) {
      eo11 = new eo1();
      this.a.put(paramContext, eo11);
    } 
    int i = eo11.e;
    if (i != 0) {
      int[] arrayOfInt = eo11.b;
      if (paramInt <= arrayOfInt[i - 1]) {
        int j = ws2.f(i, paramInt, arrayOfInt);
        if (j >= 0) {
          eo11.c[j] = paramColorStateList;
          return;
        } 
        i = j ^ 0xFFFFFFFF;
        j = eo11.e;
        if (i < j) {
          Object[] arrayOfObject = eo11.c;
          if (arrayOfObject[i] == dd1.h) {
            eo11.b[i] = paramInt;
            arrayOfObject[i] = paramColorStateList;
            return;
          } 
        } 
        if (j >= eo11.b.length) {
          int m;
          int n = (j + 1) * 4;
          j = 4;
          while (true) {
            m = n;
            if (j < 32) {
              m = (1 << j) - 12;
              if (n <= m)
                break; 
              j++;
              continue;
            } 
            break;
          } 
          j = m / 4;
          eo11.b = Arrays.copyOf(eo11.b, j);
          eo11.c = Arrays.copyOf(eo11.c, j);
        } 
        int k = eo11.e;
        if (k - i != 0) {
          arrayOfInt = eo11.b;
          j = i + 1;
          g9.E0(j, i, k, arrayOfInt, arrayOfInt);
          Object[] arrayOfObject = eo11.c;
          g9.F0(j, i, eo11.e, arrayOfObject, arrayOfObject);
        } 
        eo11.b[i] = paramInt;
        eo11.c[i] = paramColorStateList;
        eo11.e++;
        return;
      } 
    } 
    if (i >= eo11.b.length) {
      int k;
      int m = (i + 1) * 4;
      int j = 4;
      while (true) {
        k = m;
        if (j < 32) {
          k = (1 << j) - 12;
          if (m <= k)
            break; 
          j++;
          continue;
        } 
        break;
      } 
      j = k / 4;
      eo11.b = Arrays.copyOf(eo11.b, j);
      eo11.c = Arrays.copyOf(eo11.c, j);
    } 
    eo11.b[i] = paramInt;
    eo11.c[i] = paramColorStateList;
    eo11.e = i + 1;
  }
  
  public final Drawable b(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroid/util/TypedValue;
    //   4: ifnonnull -> 18
    //   7: aload_0
    //   8: new android/util/TypedValue
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield c : Landroid/util/TypedValue;
    //   18: aload_0
    //   19: getfield c : Landroid/util/TypedValue;
    //   22: astore #8
    //   24: aload_1
    //   25: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   28: iload_2
    //   29: aload #8
    //   31: iconst_1
    //   32: invokevirtual getValue : (ILandroid/util/TypedValue;Z)V
    //   35: aload #8
    //   37: getfield assetCookie : I
    //   40: i2l
    //   41: bipush #32
    //   43: lshl
    //   44: aload #8
    //   46: getfield data : I
    //   49: i2l
    //   50: lor
    //   51: lstore #4
    //   53: aload_0
    //   54: monitorenter
    //   55: aload_0
    //   56: getfield b : Ljava/util/WeakHashMap;
    //   59: aload_1
    //   60: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   63: checkcast sp0
    //   66: astore #6
    //   68: aconst_null
    //   69: astore #7
    //   71: aload #6
    //   73: ifnonnull -> 84
    //   76: aload_0
    //   77: monitorexit
    //   78: aconst_null
    //   79: astore #6
    //   81: goto -> 198
    //   84: aload #6
    //   86: lload #4
    //   88: invokevirtual b : (J)Ljava/lang/Object;
    //   91: checkcast java/lang/ref/WeakReference
    //   94: astore #9
    //   96: aload #9
    //   98: ifnull -> 193
    //   101: aload #9
    //   103: invokevirtual get : ()Ljava/lang/Object;
    //   106: checkcast android/graphics/drawable/Drawable$ConstantState
    //   109: astore #9
    //   111: aload #9
    //   113: ifnull -> 136
    //   116: aload #9
    //   118: aload_1
    //   119: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   122: invokevirtual newDrawable : (Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    //   125: astore #6
    //   127: aload_0
    //   128: monitorexit
    //   129: goto -> 198
    //   132: astore_1
    //   133: goto -> 431
    //   136: aload #6
    //   138: getfield c : [J
    //   141: aload #6
    //   143: getfield f : I
    //   146: lload #4
    //   148: invokestatic g : ([JIJ)I
    //   151: istore_3
    //   152: iload_3
    //   153: iflt -> 193
    //   156: aload #6
    //   158: getfield e : [Ljava/lang/Object;
    //   161: astore #9
    //   163: aload #9
    //   165: iload_3
    //   166: aaload
    //   167: astore #10
    //   169: getstatic ws2.g : Ljava/lang/Object;
    //   172: astore #11
    //   174: aload #10
    //   176: aload #11
    //   178: if_acmpeq -> 193
    //   181: aload #9
    //   183: iload_3
    //   184: aload #11
    //   186: aastore
    //   187: aload #6
    //   189: iconst_1
    //   190: putfield b : Z
    //   193: aload_0
    //   194: monitorexit
    //   195: goto -> 78
    //   198: aload #6
    //   200: ifnull -> 206
    //   203: aload #6
    //   205: areturn
    //   206: aload_0
    //   207: getfield e : Lm2;
    //   210: ifnonnull -> 220
    //   213: aload #7
    //   215: astore #6
    //   217: goto -> 317
    //   220: iload_2
    //   221: ldc 2131230776
    //   223: if_icmpne -> 262
    //   226: new android/graphics/drawable/LayerDrawable
    //   229: dup
    //   230: iconst_2
    //   231: anewarray android/graphics/drawable/Drawable
    //   234: dup
    //   235: iconst_0
    //   236: aload_0
    //   237: aload_1
    //   238: ldc 2131230775
    //   240: invokevirtual d : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   243: aastore
    //   244: dup
    //   245: iconst_1
    //   246: aload_0
    //   247: aload_1
    //   248: ldc 2131230777
    //   250: invokevirtual d : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   253: aastore
    //   254: invokespecial <init> : ([Landroid/graphics/drawable/Drawable;)V
    //   257: astore #6
    //   259: goto -> 317
    //   262: iload_2
    //   263: ldc 2131230811
    //   265: if_icmpne -> 280
    //   268: aload_0
    //   269: aload_1
    //   270: ldc 2131165243
    //   272: invokestatic e : (Lig1;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;
    //   275: astore #6
    //   277: goto -> 317
    //   280: iload_2
    //   281: ldc 2131230810
    //   283: if_icmpne -> 298
    //   286: aload_0
    //   287: aload_1
    //   288: ldc 2131165244
    //   290: invokestatic e : (Lig1;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;
    //   293: astore #6
    //   295: goto -> 317
    //   298: aload #7
    //   300: astore #6
    //   302: iload_2
    //   303: ldc 2131230812
    //   305: if_icmpne -> 317
    //   308: aload_0
    //   309: aload_1
    //   310: ldc 2131165245
    //   312: invokestatic e : (Lig1;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;
    //   315: astore #6
    //   317: aload #6
    //   319: ifnull -> 428
    //   322: aload #6
    //   324: aload #8
    //   326: getfield changingConfigurations : I
    //   329: invokevirtual setChangingConfigurations : (I)V
    //   332: aload_0
    //   333: monitorenter
    //   334: aload #6
    //   336: invokevirtual getConstantState : ()Landroid/graphics/drawable/Drawable$ConstantState;
    //   339: astore #9
    //   341: aload #9
    //   343: ifnull -> 419
    //   346: aload_0
    //   347: getfield b : Ljava/util/WeakHashMap;
    //   350: aload_1
    //   351: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   354: checkcast sp0
    //   357: astore #8
    //   359: aload #8
    //   361: astore #7
    //   363: aload #8
    //   365: ifnonnull -> 396
    //   368: new sp0
    //   371: astore #7
    //   373: aload #7
    //   375: invokespecial <init> : ()V
    //   378: aload_0
    //   379: getfield b : Ljava/util/WeakHashMap;
    //   382: aload_1
    //   383: aload #7
    //   385: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   388: pop
    //   389: goto -> 396
    //   392: astore_1
    //   393: goto -> 424
    //   396: new java/lang/ref/WeakReference
    //   399: astore_1
    //   400: aload_1
    //   401: aload #9
    //   403: invokespecial <init> : (Ljava/lang/Object;)V
    //   406: aload #7
    //   408: lload #4
    //   410: aload_1
    //   411: invokevirtual d : (JLjava/lang/Object;)V
    //   414: aload_0
    //   415: monitorexit
    //   416: aload #6
    //   418: areturn
    //   419: aload_0
    //   420: monitorexit
    //   421: aload #6
    //   423: areturn
    //   424: aload_0
    //   425: monitorexit
    //   426: aload_1
    //   427: athrow
    //   428: aload #6
    //   430: areturn
    //   431: aload_0
    //   432: monitorexit
    //   433: aload_1
    //   434: athrow
    // Exception table:
    //   from	to	target	type
    //   55	68	132	finally
    //   84	96	132	finally
    //   101	111	132	finally
    //   116	127	132	finally
    //   136	152	132	finally
    //   156	163	132	finally
    //   169	174	132	finally
    //   187	193	132	finally
    //   334	341	392	finally
    //   346	359	392	finally
    //   368	389	392	finally
    //   396	414	392	finally
    //   424	426	392	finally
    //   431	433	132	finally
  }
  
  public final Drawable d(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: iload_2
    //   5: iconst_0
    //   6: invokevirtual e : (Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    //   9: astore_1
    //   10: aload_0
    //   11: monitorexit
    //   12: aload_1
    //   13: areturn
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	14	finally
    //   15	17	14	finally
  }
  
  public final Drawable e(Context paramContext, int paramInt, boolean paramBoolean) {
    Drawable drawable1;
    /* monitor enter ThisExpression{ObjectType{ig1}} */
    try {
      IllegalStateException illegalStateException;
      if (!this.d) {
        this.d = true;
        Drawable drawable3 = d(paramContext, 2131230838);
        if (drawable3 == null || (!(drawable3 instanceof w12) && !"android.graphics.drawable.VectorDrawable".equals(drawable3.getClass().getName()))) {
          this.d = false;
          illegalStateException = new IllegalStateException();
          this("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
          throw illegalStateException;
        } 
      } 
      Drawable drawable = b((Context)illegalStateException, paramInt);
      drawable1 = drawable;
      if (drawable == null)
        drawable1 = illegalStateException.getDrawable(paramInt); 
    } finally {}
    Drawable drawable2 = drawable1;
    if (drawable1 != null)
      drawable2 = h(paramContext, paramInt, paramBoolean, drawable1); 
    if (drawable2 != null)
      l10.a(drawable2); 
    /* monitor exit ThisExpression{ObjectType{ig1}} */
    return drawable2;
  }
  
  public final ColorStateList g(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/WeakHashMap;
    //   6: astore #4
    //   8: aconst_null
    //   9: astore #6
    //   11: aload #4
    //   13: ifnull -> 89
    //   16: aload #4
    //   18: aload_1
    //   19: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast eo1
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 89
    //   32: aload #4
    //   34: getfield b : [I
    //   37: astore #5
    //   39: aload #4
    //   41: getfield e : I
    //   44: iload_2
    //   45: aload #5
    //   47: invokestatic f : (II[I)I
    //   50: istore_3
    //   51: iload_3
    //   52: iflt -> 76
    //   55: aload #4
    //   57: getfield c : [Ljava/lang/Object;
    //   60: iload_3
    //   61: aaload
    //   62: astore #5
    //   64: aload #5
    //   66: astore #4
    //   68: aload #5
    //   70: getstatic dd1.h : Ljava/lang/Object;
    //   73: if_acmpne -> 79
    //   76: aconst_null
    //   77: astore #4
    //   79: aload #4
    //   81: checkcast android/content/res/ColorStateList
    //   84: astore #4
    //   86: goto -> 92
    //   89: aconst_null
    //   90: astore #4
    //   92: aload #4
    //   94: astore #5
    //   96: aload #4
    //   98: ifnonnull -> 152
    //   101: aload_0
    //   102: getfield e : Lm2;
    //   105: astore #4
    //   107: aload #4
    //   109: ifnonnull -> 119
    //   112: aload #6
    //   114: astore #4
    //   116: goto -> 128
    //   119: aload #4
    //   121: aload_1
    //   122: iload_2
    //   123: invokevirtual f : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   126: astore #4
    //   128: aload #4
    //   130: ifnull -> 148
    //   133: aload_0
    //   134: aload_1
    //   135: iload_2
    //   136: aload #4
    //   138: invokevirtual a : (Landroid/content/Context;ILandroid/content/res/ColorStateList;)V
    //   141: goto -> 148
    //   144: astore_1
    //   145: goto -> 157
    //   148: aload #4
    //   150: astore #5
    //   152: aload_0
    //   153: monitorexit
    //   154: aload #5
    //   156: areturn
    //   157: aload_0
    //   158: monitorexit
    //   159: aload_1
    //   160: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	144	finally
    //   16	27	144	finally
    //   32	51	144	finally
    //   55	64	144	finally
    //   68	76	144	finally
    //   79	86	144	finally
    //   101	107	144	finally
    //   119	128	144	finally
    //   133	141	144	finally
    //   157	159	144	finally
  }
  
  public final Drawable h(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: invokevirtual g : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   6: astore #11
    //   8: aconst_null
    //   9: astore #10
    //   11: aload #11
    //   13: ifnull -> 70
    //   16: aload #4
    //   18: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   21: astore #4
    //   23: aload #4
    //   25: aload #11
    //   27: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)V
    //   30: aload_0
    //   31: getfield e : Lm2;
    //   34: ifnonnull -> 43
    //   37: aload #10
    //   39: astore_1
    //   40: goto -> 57
    //   43: aload #10
    //   45: astore_1
    //   46: iload_2
    //   47: ldc_w 2131230825
    //   50: if_icmpne -> 57
    //   53: getstatic android/graphics/PorterDuff$Mode.MULTIPLY : Landroid/graphics/PorterDuff$Mode;
    //   56: astore_1
    //   57: aload_1
    //   58: ifnull -> 67
    //   61: aload #4
    //   63: aload_1
    //   64: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   67: aload #4
    //   69: areturn
    //   70: aload_0
    //   71: getfield e : Lm2;
    //   74: astore #10
    //   76: ldc_w 2130968901
    //   79: istore #6
    //   81: aload #10
    //   83: ifnull -> 273
    //   86: iload_2
    //   87: ldc_w 2131230820
    //   90: if_icmpne -> 174
    //   93: aload #4
    //   95: checkcast android/graphics/drawable/LayerDrawable
    //   98: astore #10
    //   100: aload #10
    //   102: ldc_w 16908288
    //   105: invokevirtual findDrawableByLayerId : (I)Landroid/graphics/drawable/Drawable;
    //   108: astore #12
    //   110: aload_1
    //   111: ldc_w 2130968901
    //   114: invokestatic c : (Landroid/content/Context;I)I
    //   117: istore_2
    //   118: getstatic y6.b : Landroid/graphics/PorterDuff$Mode;
    //   121: astore #11
    //   123: aload #12
    //   125: iload_2
    //   126: aload #11
    //   128: invokestatic g : (Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   131: aload #10
    //   133: ldc_w 16908303
    //   136: invokevirtual findDrawableByLayerId : (I)Landroid/graphics/drawable/Drawable;
    //   139: aload_1
    //   140: ldc_w 2130968901
    //   143: invokestatic c : (Landroid/content/Context;I)I
    //   146: aload #11
    //   148: invokestatic g : (Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   151: aload #10
    //   153: ldc_w 16908301
    //   156: invokevirtual findDrawableByLayerId : (I)Landroid/graphics/drawable/Drawable;
    //   159: aload_1
    //   160: ldc_w 2130968899
    //   163: invokestatic c : (Landroid/content/Context;I)I
    //   166: aload #11
    //   168: invokestatic g : (Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   171: aload #4
    //   173: areturn
    //   174: iload_2
    //   175: ldc 2131230811
    //   177: if_icmpeq -> 192
    //   180: iload_2
    //   181: ldc 2131230810
    //   183: if_icmpeq -> 192
    //   186: iload_2
    //   187: ldc 2131230812
    //   189: if_icmpne -> 273
    //   192: aload #4
    //   194: checkcast android/graphics/drawable/LayerDrawable
    //   197: astore #11
    //   199: aload #11
    //   201: ldc_w 16908288
    //   204: invokevirtual findDrawableByLayerId : (I)Landroid/graphics/drawable/Drawable;
    //   207: astore #12
    //   209: aload_1
    //   210: ldc_w 2130968901
    //   213: invokestatic b : (Landroid/content/Context;I)I
    //   216: istore_2
    //   217: getstatic y6.b : Landroid/graphics/PorterDuff$Mode;
    //   220: astore #10
    //   222: aload #12
    //   224: iload_2
    //   225: aload #10
    //   227: invokestatic g : (Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   230: aload #11
    //   232: ldc_w 16908303
    //   235: invokevirtual findDrawableByLayerId : (I)Landroid/graphics/drawable/Drawable;
    //   238: aload_1
    //   239: ldc_w 2130968899
    //   242: invokestatic c : (Landroid/content/Context;I)I
    //   245: aload #10
    //   247: invokestatic g : (Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   250: aload #11
    //   252: ldc_w 16908301
    //   255: invokevirtual findDrawableByLayerId : (I)Landroid/graphics/drawable/Drawable;
    //   258: aload_1
    //   259: ldc_w 2130968899
    //   262: invokestatic c : (Landroid/content/Context;I)I
    //   265: aload #10
    //   267: invokestatic g : (Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    //   270: aload #4
    //   272: areturn
    //   273: aload_0
    //   274: getfield e : Lm2;
    //   277: astore #11
    //   279: iconst_0
    //   280: istore #8
    //   282: iload #8
    //   284: istore #5
    //   286: aload #11
    //   288: ifnull -> 477
    //   291: getstatic y6.b : Landroid/graphics/PorterDuff$Mode;
    //   294: astore #10
    //   296: aload #11
    //   298: getfield a : Ljava/lang/Object;
    //   301: checkcast [I
    //   304: iload_2
    //   305: invokestatic b : ([II)Z
    //   308: ifeq -> 327
    //   311: iload #6
    //   313: istore_2
    //   314: iconst_1
    //   315: istore #5
    //   317: iconst_m1
    //   318: istore #6
    //   320: iload #5
    //   322: istore #7
    //   324: goto -> 430
    //   327: aload #11
    //   329: getfield c : Ljava/lang/Object;
    //   332: checkcast [I
    //   335: iload_2
    //   336: invokestatic b : ([II)Z
    //   339: ifeq -> 349
    //   342: ldc_w 2130968899
    //   345: istore_2
    //   346: goto -> 314
    //   349: aload #11
    //   351: getfield d : Ljava/lang/Object;
    //   354: checkcast [I
    //   357: iload_2
    //   358: invokestatic b : ([II)Z
    //   361: istore #9
    //   363: ldc_w 16842801
    //   366: istore #5
    //   368: iload #9
    //   370: ifeq -> 384
    //   373: getstatic android/graphics/PorterDuff$Mode.MULTIPLY : Landroid/graphics/PorterDuff$Mode;
    //   376: astore #10
    //   378: iload #5
    //   380: istore_2
    //   381: goto -> 314
    //   384: iload_2
    //   385: ldc_w 2131230797
    //   388: if_icmpne -> 409
    //   391: ldc_w 40.8
    //   394: invokestatic round : (F)I
    //   397: istore #6
    //   399: ldc_w 16842800
    //   402: istore_2
    //   403: iconst_1
    //   404: istore #7
    //   406: goto -> 430
    //   409: iload_2
    //   410: ldc_w 2131230779
    //   413: if_icmpne -> 422
    //   416: iload #5
    //   418: istore_2
    //   419: goto -> 314
    //   422: iconst_0
    //   423: istore #5
    //   425: iconst_0
    //   426: istore_2
    //   427: goto -> 317
    //   430: iload #8
    //   432: istore #5
    //   434: iload #7
    //   436: ifeq -> 477
    //   439: aload #4
    //   441: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   444: astore #11
    //   446: aload #11
    //   448: aload_1
    //   449: iload_2
    //   450: invokestatic c : (Landroid/content/Context;I)I
    //   453: aload #10
    //   455: invokestatic c : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   458: invokevirtual setColorFilter : (Landroid/graphics/ColorFilter;)V
    //   461: iload #6
    //   463: iconst_m1
    //   464: if_icmpeq -> 474
    //   467: aload #11
    //   469: iload #6
    //   471: invokevirtual setAlpha : (I)V
    //   474: iconst_1
    //   475: istore #5
    //   477: iload #5
    //   479: ifne -> 488
    //   482: iload_3
    //   483: ifeq -> 488
    //   486: aconst_null
    //   487: areturn
    //   488: aload #4
    //   490: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ig1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */