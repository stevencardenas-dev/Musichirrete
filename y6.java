import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;

public final class y6 {
  public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
  
  public static y6 c;
  
  public ig1 a;
  
  public static y6 a() {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{y6}} */
    try {
      if (c == null)
        d(); 
    } finally {
      Exception exception;
    } 
    y6 y61 = c;
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{y6}} */
    return y61;
  }
  
  public static PorterDuffColorFilter c(int paramInt, PorterDuff.Mode paramMode) {
    // Byte code:
    //   0: ldc y6
    //   2: monitorenter
    //   3: iload_0
    //   4: aload_1
    //   5: invokestatic f : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   8: astore_1
    //   9: ldc y6
    //   11: monitorexit
    //   12: aload_1
    //   13: areturn
    //   14: astore_1
    //   15: ldc y6
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   3	9	14	finally
    //   15	18	14	finally
  }
  
  public static void d() {
    // Byte code:
    //   0: ldc y6
    //   2: monitorenter
    //   3: getstatic y6.c : Ly6;
    //   6: ifnonnull -> 240
    //   9: new y6
    //   12: astore_0
    //   13: aload_0
    //   14: invokespecial <init> : ()V
    //   17: aload_0
    //   18: putstatic y6.c : Ly6;
    //   21: aload_0
    //   22: invokestatic c : ()Lig1;
    //   25: putfield a : Lig1;
    //   28: getstatic y6.c : Ly6;
    //   31: getfield a : Lig1;
    //   34: astore_0
    //   35: new m2
    //   38: astore_1
    //   39: aload_1
    //   40: invokespecial <init> : ()V
    //   43: aload_1
    //   44: iconst_3
    //   45: newarray int
    //   47: dup
    //   48: iconst_0
    //   49: ldc 2131230836
    //   51: iastore
    //   52: dup
    //   53: iconst_1
    //   54: ldc 2131230834
    //   56: iastore
    //   57: dup
    //   58: iconst_2
    //   59: ldc 2131230760
    //   61: iastore
    //   62: putfield a : Ljava/lang/Object;
    //   65: aload_1
    //   66: bipush #7
    //   68: newarray int
    //   70: dup
    //   71: iconst_0
    //   72: ldc 2131230784
    //   74: iastore
    //   75: dup
    //   76: iconst_1
    //   77: ldc 2131230819
    //   79: iastore
    //   80: dup
    //   81: iconst_2
    //   82: ldc 2131230791
    //   84: iastore
    //   85: dup
    //   86: iconst_3
    //   87: ldc 2131230786
    //   89: iastore
    //   90: dup
    //   91: iconst_4
    //   92: ldc 2131230787
    //   94: iastore
    //   95: dup
    //   96: iconst_5
    //   97: ldc 2131230790
    //   99: iastore
    //   100: dup
    //   101: bipush #6
    //   103: ldc 2131230789
    //   105: iastore
    //   106: putfield b : Ljava/lang/Object;
    //   109: aload_1
    //   110: bipush #7
    //   112: newarray int
    //   114: dup
    //   115: iconst_0
    //   116: ldc 2131230833
    //   118: iastore
    //   119: dup
    //   120: iconst_1
    //   121: ldc 2131230835
    //   123: iastore
    //   124: dup
    //   125: iconst_2
    //   126: ldc 2131230777
    //   128: iastore
    //   129: dup
    //   130: iconst_3
    //   131: ldc 2131230829
    //   133: iastore
    //   134: dup
    //   135: iconst_4
    //   136: ldc 2131230830
    //   138: iastore
    //   139: dup
    //   140: iconst_5
    //   141: ldc 2131230831
    //   143: iastore
    //   144: dup
    //   145: bipush #6
    //   147: ldc 2131230832
    //   149: iastore
    //   150: putfield c : Ljava/lang/Object;
    //   153: aload_1
    //   154: iconst_3
    //   155: newarray int
    //   157: dup
    //   158: iconst_0
    //   159: ldc 2131230809
    //   161: iastore
    //   162: dup
    //   163: iconst_1
    //   164: ldc 2131230775
    //   166: iastore
    //   167: dup
    //   168: iconst_2
    //   169: ldc 2131230808
    //   171: iastore
    //   172: putfield d : Ljava/lang/Object;
    //   175: aload_1
    //   176: iconst_2
    //   177: newarray int
    //   179: dup
    //   180: iconst_0
    //   181: ldc 2131230827
    //   183: iastore
    //   184: dup
    //   185: iconst_1
    //   186: ldc 2131230837
    //   188: iastore
    //   189: putfield e : Ljava/lang/Object;
    //   192: aload_1
    //   193: iconst_4
    //   194: newarray int
    //   196: dup
    //   197: iconst_0
    //   198: ldc 2131230763
    //   200: iastore
    //   201: dup
    //   202: iconst_1
    //   203: ldc 2131230769
    //   205: iastore
    //   206: dup
    //   207: iconst_2
    //   208: ldc 2131230764
    //   210: iastore
    //   211: dup
    //   212: iconst_3
    //   213: ldc 2131230770
    //   215: iastore
    //   216: putfield f : Ljava/lang/Object;
    //   219: aload_0
    //   220: monitorenter
    //   221: aload_0
    //   222: aload_1
    //   223: putfield e : Lm2;
    //   226: aload_0
    //   227: monitorexit
    //   228: goto -> 240
    //   231: astore_1
    //   232: aload_0
    //   233: monitorexit
    //   234: aload_1
    //   235: athrow
    //   236: astore_0
    //   237: goto -> 244
    //   240: ldc y6
    //   242: monitorexit
    //   243: return
    //   244: ldc y6
    //   246: monitorexit
    //   247: aload_0
    //   248: athrow
    // Exception table:
    //   from	to	target	type
    //   3	221	236	finally
    //   221	226	231	finally
    //   226	228	236	finally
    //   232	234	231	finally
    //   234	236	236	finally
    //   244	247	236	finally
  }
  
  public static void e(Drawable paramDrawable, up paramup, int[] paramArrayOfint) {
    PorterDuff.Mode mode = ig1.f;
    int[] arrayOfInt = paramDrawable.getState();
    if (paramDrawable.mutate() == paramDrawable) {
      if (paramDrawable instanceof android.graphics.drawable.LayerDrawable && paramDrawable.isStateful()) {
        paramDrawable.setState(new int[0]);
        paramDrawable.setState(arrayOfInt);
      } 
      boolean bool = paramup.b;
      if (bool || paramup.a) {
        PorterDuff.Mode mode1;
        PorterDuffColorFilter porterDuffColorFilter2 = null;
        if (bool) {
          ColorStateList colorStateList = (ColorStateList)paramup.c;
        } else {
          arrayOfInt = null;
        } 
        if (paramup.a) {
          mode1 = (PorterDuff.Mode)paramup.d;
        } else {
          mode1 = ig1.f;
        } 
        PorterDuffColorFilter porterDuffColorFilter1 = porterDuffColorFilter2;
        if (arrayOfInt != null)
          if (mode1 == null) {
            porterDuffColorFilter1 = porterDuffColorFilter2;
          } else {
            porterDuffColorFilter1 = ig1.f(arrayOfInt.getColorForState(paramArrayOfint, 0), mode1);
          }  
        paramDrawable.setColorFilter((ColorFilter)porterDuffColorFilter1);
        return;
      } 
      paramDrawable.clearColorFilter();
      return;
    } 
    Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
  }
  
  public final Drawable b(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Lig1;
    //   6: aload_1
    //   7: iload_2
    //   8: invokevirtual d : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
    //   17	19	16	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */