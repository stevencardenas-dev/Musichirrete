import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.util.Log;
import java.io.IOException;
import java.util.List;

public class xz1 extends qz1 {
  public static Font Z(FontFamily paramFontFamily, int paramInt) {
    if ((paramInt & 0x1) != 0) {
      i = 700;
    } else {
      i = 400;
    } 
    int j = 1;
    if ((paramInt & 0x2) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    FontStyle fontStyle = new FontStyle(i, paramInt);
    Font font = paramFontFamily.getFont(0);
    int i = c0(fontStyle, font.getStyle());
    paramInt = j;
    while (paramInt < paramFontFamily.getSize()) {
      Font font1 = paramFontFamily.getFont(paramInt);
      int k = c0(fontStyle, font1.getStyle());
      j = i;
      if (k < i) {
        font = font1;
        j = k;
      } 
      paramInt++;
      i = j;
    } 
    return font;
  }
  
  public static int c0(FontStyle paramFontStyle1, FontStyle paramFontStyle2) {
    byte b;
    int i = Math.abs(paramFontStyle1.getWeight() - paramFontStyle2.getWeight()) / 100;
    if (paramFontStyle1.getSlant() == paramFontStyle2.getSlant()) {
      b = 0;
    } else {
      b = 2;
    } 
    return i + b;
  }
  
  public final FontFamily a0(ha0[] paramArrayOfha0, ContentResolver paramContentResolver) {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: istore #4
    //   4: iconst_0
    //   5: istore_3
    //   6: aconst_null
    //   7: astore #6
    //   9: iload_3
    //   10: iload #4
    //   12: if_icmpge -> 251
    //   15: aload_1
    //   16: iload_3
    //   17: aaload
    //   18: astore #8
    //   20: aload #8
    //   22: getfield a : Landroid/net/Uri;
    //   25: invokevirtual getScheme : ()Ljava/lang/String;
    //   28: ldc 'systemfont'
    //   30: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   33: ifeq -> 47
    //   36: aload_0
    //   37: aload #8
    //   39: invokevirtual b0 : (Lha0;)Landroid/graphics/fonts/Font;
    //   42: astore #5
    //   44: goto -> 210
    //   47: aload #8
    //   49: getfield a : Landroid/net/Uri;
    //   52: astore #7
    //   54: aload #8
    //   56: getfield e : Ljava/lang/String;
    //   59: astore #5
    //   61: aload_2
    //   62: aload #7
    //   64: ldc 'r'
    //   66: aconst_null
    //   67: invokevirtual openFileDescriptor : (Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   70: astore #7
    //   72: aload #7
    //   74: ifnonnull -> 98
    //   77: aload #7
    //   79: ifnull -> 87
    //   82: aload #7
    //   84: invokevirtual close : ()V
    //   87: aconst_null
    //   88: astore #5
    //   90: goto -> 210
    //   93: astore #5
    //   95: goto -> 197
    //   98: new android/graphics/fonts/Font$Builder
    //   101: astore #9
    //   103: aload #9
    //   105: aload #7
    //   107: invokespecial <init> : (Landroid/os/ParcelFileDescriptor;)V
    //   110: aload #9
    //   112: aload #8
    //   114: getfield c : I
    //   117: invokevirtual setWeight : (I)Landroid/graphics/fonts/Font$Builder;
    //   120: aload #8
    //   122: getfield d : Z
    //   125: invokevirtual setSlant : (I)Landroid/graphics/fonts/Font$Builder;
    //   128: aload #8
    //   130: getfield b : I
    //   133: invokevirtual setTtcIndex : (I)Landroid/graphics/fonts/Font$Builder;
    //   136: astore #8
    //   138: aload #5
    //   140: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   143: ifne -> 162
    //   146: aload #8
    //   148: aload #5
    //   150: invokevirtual setFontVariationSettings : (Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;
    //   153: pop
    //   154: goto -> 162
    //   157: astore #5
    //   159: goto -> 177
    //   162: aload #8
    //   164: invokevirtual build : ()Landroid/graphics/fonts/Font;
    //   167: astore #5
    //   169: aload #7
    //   171: invokevirtual close : ()V
    //   174: goto -> 210
    //   177: aload #7
    //   179: invokevirtual close : ()V
    //   182: goto -> 194
    //   185: astore #7
    //   187: aload #5
    //   189: aload #7
    //   191: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   194: aload #5
    //   196: athrow
    //   197: ldc 'TypefaceCompatApi29Impl'
    //   199: ldc 'Font load failed'
    //   201: aload #5
    //   203: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   206: pop
    //   207: goto -> 87
    //   210: aload #5
    //   212: ifnonnull -> 218
    //   215: goto -> 245
    //   218: aload #6
    //   220: ifnonnull -> 237
    //   223: new android/graphics/fonts/FontFamily$Builder
    //   226: dup
    //   227: aload #5
    //   229: invokespecial <init> : (Landroid/graphics/fonts/Font;)V
    //   232: astore #6
    //   234: goto -> 245
    //   237: aload #6
    //   239: aload #5
    //   241: invokevirtual addFont : (Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    //   244: pop
    //   245: iinc #3, 1
    //   248: goto -> 9
    //   251: aload #6
    //   253: ifnonnull -> 258
    //   256: aconst_null
    //   257: areturn
    //   258: aload #6
    //   260: invokevirtual build : ()Landroid/graphics/fonts/FontFamily;
    //   263: areturn
    // Exception table:
    //   from	to	target	type
    //   47	72	93	java/io/IOException
    //   82	87	93	java/io/IOException
    //   98	154	157	finally
    //   162	169	157	finally
    //   169	174	93	java/io/IOException
    //   177	182	185	finally
    //   187	194	93	java/io/IOException
    //   194	197	93	java/io/IOException
  }
  
  public Font b0(ha0 paramha0) {
    throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
  }
  
  public final Typeface j(Context paramContext, ea0 paramea0, Resources paramResources, int paramInt) {
    try {
      fa0[] arrayOfFa0 = paramea0.a;
      int i = arrayOfFa0.length;
      byte b = 0;
      paramContext = null;
      while (true) {
        FontFamily.Builder builder;
        if (b < i) {
          fa0 fa0 = arrayOfFa0[b];
          try {
            Font.Builder builder1 = new Font.Builder();
            this(paramResources, fa0.f);
            Font font = builder1.setWeight(fa0.b).setSlant(fa0.c).setTtcIndex(fa0.e).setFontVariationSettings(fa0.d).build();
            if (paramContext == null) {
              FontFamily.Builder builder2 = new FontFamily.Builder();
              this(font);
              builder = builder2;
            } else {
              builder.addFont(font);
            } 
          } catch (IOException iOException) {}
          b++;
          continue;
        } 
        if (builder == null)
          return null; 
        FontFamily fontFamily = builder.build();
        Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder();
        this(fontFamily);
        return customFallbackBuilder.setStyle(Z(fontFamily, paramInt).getStyle()).build();
      } 
    } catch (Exception exception) {
      Log.w("TypefaceCompatApi29Impl", "Font load failed", exception);
      return null;
    } 
  }
  
  public final Typeface k(Context paramContext, ha0[] paramArrayOfha0, int paramInt) {
    ContentResolver contentResolver = paramContext.getContentResolver();
    try {
      FontFamily fontFamily = a0(paramArrayOfha0, contentResolver);
      if (fontFamily == null)
        return null; 
      Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder();
      this(fontFamily);
      return customFallbackBuilder.setStyle(Z(fontFamily, paramInt).getStyle()).build();
    } catch (Exception exception) {
      Log.w("TypefaceCompatApi29Impl", "Font load failed", exception);
      return null;
    } 
  }
  
  public final Typeface l(Context paramContext, List<ha0[]> paramList, int paramInt) {
    Typeface.CustomFallbackBuilder customFallbackBuilder;
    FontFamily fontFamily;
    ContentResolver contentResolver = paramContext.getContentResolver();
    try {
      fontFamily = a0(paramList.get(0), contentResolver);
      if (fontFamily == null)
        return null; 
      customFallbackBuilder = new Typeface.CustomFallbackBuilder();
      this(fontFamily);
      for (byte b = 1; b < paramList.size(); b++) {
        FontFamily fontFamily1 = a0(paramList.get(b), contentResolver);
        if (fontFamily1 != null)
          customFallbackBuilder.addCustomFallback(fontFamily1); 
      } 
    } catch (Exception exception) {}
    return customFallbackBuilder.setStyle(Z(fontFamily, paramInt).getStyle()).build();
  }
  
  public final Typeface m(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    try {
      Font.Builder builder = new Font.Builder();
      this(paramResources, paramInt1);
      Font font = builder.build();
      FontFamily.Builder builder1 = new FontFamily.Builder();
      this(font);
      FontFamily fontFamily = builder1.build();
      Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder();
      this(fontFamily);
      return customFallbackBuilder.setStyle(font.getStyle()).build();
    } catch (Exception exception) {
      Log.w("TypefaceCompatApi29Impl", "Font load failed", exception);
      return null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */