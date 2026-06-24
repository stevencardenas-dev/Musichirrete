import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class b8 {
  public final TextView a;
  
  public up b;
  
  public up c;
  
  public up d;
  
  public up e;
  
  public up f;
  
  public up g;
  
  public up h;
  
  public final j8 i;
  
  public int j = 0;
  
  public int k = -1;
  
  public Typeface l;
  
  public boolean m;
  
  public b8(TextView paramTextView) {
    this.a = paramTextView;
    this.i = new j8(paramTextView);
  }
  
  public static up c(Context paramContext, y6 paramy6, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: monitorenter
    //   2: aload_1
    //   3: getfield a : Lig1;
    //   6: aload_0
    //   7: iload_2
    //   8: invokevirtual g : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   11: astore_0
    //   12: aload_1
    //   13: monitorexit
    //   14: aload_0
    //   15: ifnull -> 38
    //   18: new java/lang/Object
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: astore_1
    //   26: aload_1
    //   27: iconst_1
    //   28: putfield b : Z
    //   31: aload_1
    //   32: aload_0
    //   33: putfield c : Ljava/lang/Object;
    //   36: aload_1
    //   37: areturn
    //   38: aconst_null
    //   39: areturn
    //   40: astore_0
    //   41: aload_1
    //   42: monitorexit
    //   43: aload_0
    //   44: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	40	finally
    //   41	43	40	finally
  }
  
  public static void h(EditorInfo paramEditorInfo, InputConnection paramInputConnection, TextView paramTextView) {
    int i = Build.VERSION.SDK_INT;
    if (i < 30 && paramInputConnection != null) {
      CharSequence charSequence = paramTextView.getText();
      if (i >= 30) {
        n0.w(paramEditorInfo, charSequence);
        return;
      } 
      charSequence.getClass();
      if (i >= 30) {
        n0.w(paramEditorInfo, charSequence);
        return;
      } 
      int j = paramEditorInfo.initialSelStart;
      i = paramEditorInfo.initialSelEnd;
      if (j > i) {
        k = i;
      } else {
        k = j;
      } 
      if (j > i)
        i = j; 
      int m = charSequence.length();
      if (k < 0 || i > m) {
        m30.c(paramEditorInfo, null, 0, 0);
        return;
      } 
      j = paramEditorInfo.inputType & 0xFFF;
      if (j == 129 || j == 225 || j == 18) {
        m30.c(paramEditorInfo, null, 0, 0);
        return;
      } 
      if (m <= 2048) {
        m30.c(paramEditorInfo, charSequence, k, i);
        return;
      } 
      int i1 = i - k;
      if (i1 > 1024) {
        j = 0;
      } else {
        j = i1;
      } 
      int n = charSequence.length();
      m = 2048 - j;
      int i2 = Math.min(n - i, m - Math.min(k, (int)(m * 0.8D)));
      n = Math.min(k, m - i2);
      int i3 = k - n;
      m = i3;
      int k = n;
      if (Character.isLowSurrogate(charSequence.charAt(i3))) {
        m = i3 + 1;
        k = n - 1;
      } 
      n = i2;
      if (Character.isHighSurrogate(charSequence.charAt(i + i2 - 1)))
        n = i2 - 1; 
      i2 = k + j;
      if (j != i1) {
        charSequence = TextUtils.concat(new CharSequence[] { charSequence.subSequence(m, m + k), charSequence.subSequence(i, n + i) });
      } else {
        charSequence = charSequence.subSequence(m, i2 + n + m);
      } 
      m30.c(paramEditorInfo, charSequence, k, i2);
      return;
    } 
  }
  
  public final void a(Drawable paramDrawable, up paramup) {
    if (paramDrawable != null && paramup != null)
      y6.e(paramDrawable, paramup, this.a.getDrawableState()); 
  }
  
  public final void b() {
    up up1 = this.b;
    TextView textView = this.a;
    if (up1 != null || this.c != null || this.d != null || this.e != null) {
      Drawable[] arrayOfDrawable = textView.getCompoundDrawables();
      a(arrayOfDrawable[0], this.b);
      a(arrayOfDrawable[1], this.c);
      a(arrayOfDrawable[2], this.d);
      a(arrayOfDrawable[3], this.e);
    } 
    if (this.f != null || this.g != null) {
      Drawable[] arrayOfDrawable = textView.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], this.f);
      a(arrayOfDrawable[2], this.g);
      return;
    } 
  }
  
  public final ColorStateList d() {
    up up1 = this.h;
    return (up1 != null) ? (ColorStateList)up1.c : null;
  }
  
  public final PorterDuff.Mode e() {
    up up1 = this.h;
    return (up1 != null) ? (PorterDuff.Mode)up1.d : null;
  }
  
  public final void f(AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroid/widget/TextView;
    //   4: astore #17
    //   6: aload #17
    //   8: invokevirtual getContext : ()Landroid/content/Context;
    //   11: astore #18
    //   13: invokestatic a : ()Ly6;
    //   16: astore #15
    //   18: getstatic nc1.h : [I
    //   21: astore #13
    //   23: iload_2
    //   24: iconst_0
    //   25: aload #18
    //   27: aload_1
    //   28: aload #13
    //   30: invokestatic y : (IILandroid/content/Context;Landroid/util/AttributeSet;[I)Lzv0;
    //   33: astore #12
    //   35: aload #17
    //   37: aload #17
    //   39: invokevirtual getContext : ()Landroid/content/Context;
    //   42: aload #13
    //   44: aload_1
    //   45: aload #12
    //   47: getfield e : Ljava/lang/Object;
    //   50: checkcast android/content/res/TypedArray
    //   53: iload_2
    //   54: invokestatic m : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V
    //   57: aload #12
    //   59: getfield e : Ljava/lang/Object;
    //   62: checkcast android/content/res/TypedArray
    //   65: astore #13
    //   67: aload #13
    //   69: iconst_0
    //   70: iconst_m1
    //   71: invokevirtual getResourceId : (II)I
    //   74: istore #7
    //   76: aload #13
    //   78: iconst_3
    //   79: invokevirtual hasValue : (I)Z
    //   82: ifeq -> 103
    //   85: aload_0
    //   86: aload #18
    //   88: aload #15
    //   90: aload #13
    //   92: iconst_3
    //   93: iconst_0
    //   94: invokevirtual getResourceId : (II)I
    //   97: invokestatic c : (Landroid/content/Context;Ly6;I)Lup;
    //   100: putfield b : Lup;
    //   103: aload #13
    //   105: iconst_1
    //   106: invokevirtual hasValue : (I)Z
    //   109: ifeq -> 130
    //   112: aload_0
    //   113: aload #18
    //   115: aload #15
    //   117: aload #13
    //   119: iconst_1
    //   120: iconst_0
    //   121: invokevirtual getResourceId : (II)I
    //   124: invokestatic c : (Landroid/content/Context;Ly6;I)Lup;
    //   127: putfield c : Lup;
    //   130: aload #13
    //   132: iconst_4
    //   133: invokevirtual hasValue : (I)Z
    //   136: ifeq -> 157
    //   139: aload_0
    //   140: aload #18
    //   142: aload #15
    //   144: aload #13
    //   146: iconst_4
    //   147: iconst_0
    //   148: invokevirtual getResourceId : (II)I
    //   151: invokestatic c : (Landroid/content/Context;Ly6;I)Lup;
    //   154: putfield d : Lup;
    //   157: aload #13
    //   159: iconst_2
    //   160: invokevirtual hasValue : (I)Z
    //   163: ifeq -> 184
    //   166: aload_0
    //   167: aload #18
    //   169: aload #15
    //   171: aload #13
    //   173: iconst_2
    //   174: iconst_0
    //   175: invokevirtual getResourceId : (II)I
    //   178: invokestatic c : (Landroid/content/Context;Ly6;I)Lup;
    //   181: putfield e : Lup;
    //   184: aload #13
    //   186: iconst_5
    //   187: invokevirtual hasValue : (I)Z
    //   190: ifeq -> 211
    //   193: aload_0
    //   194: aload #18
    //   196: aload #15
    //   198: aload #13
    //   200: iconst_5
    //   201: iconst_0
    //   202: invokevirtual getResourceId : (II)I
    //   205: invokestatic c : (Landroid/content/Context;Ly6;I)Lup;
    //   208: putfield f : Lup;
    //   211: aload #13
    //   213: bipush #6
    //   215: invokevirtual hasValue : (I)Z
    //   218: ifeq -> 240
    //   221: aload_0
    //   222: aload #18
    //   224: aload #15
    //   226: aload #13
    //   228: bipush #6
    //   230: iconst_0
    //   231: invokevirtual getResourceId : (II)I
    //   234: invokestatic c : (Landroid/content/Context;Ly6;I)Lup;
    //   237: putfield g : Lup;
    //   240: aload #12
    //   242: invokevirtual z : ()V
    //   245: aload #17
    //   247: invokevirtual getTransformationMethod : ()Landroid/text/method/TransformationMethod;
    //   250: instanceof android/text/method/PasswordTransformationMethod
    //   253: istore #11
    //   255: getstatic nc1.x : [I
    //   258: astore #14
    //   260: iload #7
    //   262: iconst_m1
    //   263: if_icmpeq -> 401
    //   266: aload #18
    //   268: iload #7
    //   270: aload #14
    //   272: invokevirtual obtainStyledAttributes : (I[I)Landroid/content/res/TypedArray;
    //   275: astore #12
    //   277: new zv0
    //   280: dup
    //   281: aload #18
    //   283: aload #12
    //   285: invokespecial <init> : (Landroid/content/Context;Landroid/content/res/TypedArray;)V
    //   288: astore #16
    //   290: iload #11
    //   292: ifne -> 321
    //   295: aload #12
    //   297: bipush #14
    //   299: invokevirtual hasValue : (I)Z
    //   302: ifeq -> 321
    //   305: aload #12
    //   307: bipush #14
    //   309: iconst_0
    //   310: invokevirtual getBoolean : (IZ)Z
    //   313: istore #9
    //   315: iconst_1
    //   316: istore #7
    //   318: goto -> 327
    //   321: iconst_0
    //   322: istore #7
    //   324: iconst_0
    //   325: istore #9
    //   327: aload_0
    //   328: aload #18
    //   330: aload #16
    //   332: invokevirtual n : (Landroid/content/Context;Lzv0;)V
    //   335: aload #12
    //   337: bipush #15
    //   339: invokevirtual hasValue : (I)Z
    //   342: ifeq -> 357
    //   345: aload #12
    //   347: bipush #15
    //   349: invokevirtual getString : (I)Ljava/lang/String;
    //   352: astore #13
    //   354: goto -> 360
    //   357: aconst_null
    //   358: astore #13
    //   360: getstatic android/os/Build$VERSION.SDK_INT : I
    //   363: bipush #26
    //   365: if_icmplt -> 390
    //   368: aload #12
    //   370: bipush #13
    //   372: invokevirtual hasValue : (I)Z
    //   375: ifeq -> 390
    //   378: aload #12
    //   380: bipush #13
    //   382: invokevirtual getString : (I)Ljava/lang/String;
    //   385: astore #12
    //   387: goto -> 393
    //   390: aconst_null
    //   391: astore #12
    //   393: aload #16
    //   395: invokevirtual z : ()V
    //   398: goto -> 413
    //   401: iconst_0
    //   402: istore #7
    //   404: iconst_0
    //   405: istore #9
    //   407: aconst_null
    //   408: astore #12
    //   410: aconst_null
    //   411: astore #13
    //   413: aload #18
    //   415: aload_1
    //   416: aload #14
    //   418: iload_2
    //   419: iconst_0
    //   420: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   423: astore #16
    //   425: new zv0
    //   428: dup
    //   429: aload #18
    //   431: aload #16
    //   433: invokespecial <init> : (Landroid/content/Context;Landroid/content/res/TypedArray;)V
    //   436: astore #19
    //   438: iload #7
    //   440: istore #8
    //   442: iload #9
    //   444: istore #10
    //   446: iload #11
    //   448: ifne -> 482
    //   451: iload #7
    //   453: istore #8
    //   455: iload #9
    //   457: istore #10
    //   459: aload #16
    //   461: bipush #14
    //   463: invokevirtual hasValue : (I)Z
    //   466: ifeq -> 482
    //   469: aload #16
    //   471: bipush #14
    //   473: iconst_0
    //   474: invokevirtual getBoolean : (IZ)Z
    //   477: istore #10
    //   479: iconst_1
    //   480: istore #8
    //   482: aload #16
    //   484: bipush #15
    //   486: invokevirtual hasValue : (I)Z
    //   489: ifeq -> 501
    //   492: aload #16
    //   494: bipush #15
    //   496: invokevirtual getString : (I)Ljava/lang/String;
    //   499: astore #13
    //   501: getstatic android/os/Build$VERSION.SDK_INT : I
    //   504: istore #7
    //   506: aload #12
    //   508: astore #14
    //   510: iload #7
    //   512: bipush #26
    //   514: if_icmplt -> 540
    //   517: aload #12
    //   519: astore #14
    //   521: aload #16
    //   523: bipush #13
    //   525: invokevirtual hasValue : (I)Z
    //   528: ifeq -> 540
    //   531: aload #16
    //   533: bipush #13
    //   535: invokevirtual getString : (I)Ljava/lang/String;
    //   538: astore #14
    //   540: iload #7
    //   542: bipush #28
    //   544: if_icmplt -> 573
    //   547: aload #16
    //   549: iconst_0
    //   550: invokevirtual hasValue : (I)Z
    //   553: ifeq -> 573
    //   556: aload #16
    //   558: iconst_0
    //   559: iconst_m1
    //   560: invokevirtual getDimensionPixelSize : (II)I
    //   563: ifne -> 573
    //   566: aload #17
    //   568: iconst_0
    //   569: fconst_0
    //   570: invokevirtual setTextSize : (IF)V
    //   573: aload_0
    //   574: aload #18
    //   576: aload #19
    //   578: invokevirtual n : (Landroid/content/Context;Lzv0;)V
    //   581: aload #19
    //   583: invokevirtual z : ()V
    //   586: iload #11
    //   588: ifne -> 603
    //   591: iload #8
    //   593: ifeq -> 603
    //   596: aload #17
    //   598: iload #10
    //   600: invokevirtual setAllCaps : (Z)V
    //   603: aload_0
    //   604: getfield l : Landroid/graphics/Typeface;
    //   607: astore #12
    //   609: aload #12
    //   611: ifnull -> 643
    //   614: aload_0
    //   615: getfield k : I
    //   618: iconst_m1
    //   619: if_icmpne -> 636
    //   622: aload #17
    //   624: aload #12
    //   626: aload_0
    //   627: getfield j : I
    //   630: invokevirtual setTypeface : (Landroid/graphics/Typeface;I)V
    //   633: goto -> 643
    //   636: aload #17
    //   638: aload #12
    //   640: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   643: aload #14
    //   645: ifnull -> 656
    //   648: aload #17
    //   650: aload #14
    //   652: invokestatic d : (Landroid/widget/TextView;Ljava/lang/String;)Z
    //   655: pop
    //   656: aload #13
    //   658: ifnull -> 671
    //   661: aload #17
    //   663: aload #13
    //   665: invokestatic a : (Ljava/lang/String;)Landroid/os/LocaleList;
    //   668: invokestatic b : (Landroid/widget/TextView;Landroid/os/LocaleList;)V
    //   671: aload_0
    //   672: getfield i : Lj8;
    //   675: astore #13
    //   677: aload #13
    //   679: getfield j : Landroid/content/Context;
    //   682: astore #16
    //   684: getstatic nc1.i : [I
    //   687: astore #12
    //   689: aload #16
    //   691: aload_1
    //   692: aload #12
    //   694: iload_2
    //   695: iconst_0
    //   696: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   699: astore #14
    //   701: aload #13
    //   703: getfield i : Landroid/widget/TextView;
    //   706: astore #19
    //   708: aload #19
    //   710: aload #19
    //   712: invokevirtual getContext : ()Landroid/content/Context;
    //   715: aload #12
    //   717: aload_1
    //   718: aload #14
    //   720: iload_2
    //   721: invokestatic m : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V
    //   724: aload #14
    //   726: iconst_5
    //   727: invokevirtual hasValue : (I)Z
    //   730: ifeq -> 745
    //   733: aload #13
    //   735: aload #14
    //   737: iconst_5
    //   738: iconst_0
    //   739: invokevirtual getInt : (II)I
    //   742: putfield a : I
    //   745: aload #14
    //   747: iconst_4
    //   748: invokevirtual hasValue : (I)Z
    //   751: ifeq -> 767
    //   754: aload #14
    //   756: iconst_4
    //   757: ldc_w -1.0
    //   760: invokevirtual getDimension : (IF)F
    //   763: fstore_3
    //   764: goto -> 774
    //   767: ldc_w -1.0
    //   770: fstore_3
    //   771: goto -> 764
    //   774: aload #14
    //   776: iconst_2
    //   777: invokevirtual hasValue : (I)Z
    //   780: ifeq -> 797
    //   783: aload #14
    //   785: iconst_2
    //   786: ldc_w -1.0
    //   789: invokevirtual getDimension : (IF)F
    //   792: fstore #5
    //   794: goto -> 805
    //   797: ldc_w -1.0
    //   800: fstore #5
    //   802: goto -> 794
    //   805: aload #14
    //   807: iconst_1
    //   808: invokevirtual hasValue : (I)Z
    //   811: ifeq -> 828
    //   814: aload #14
    //   816: iconst_1
    //   817: ldc_w -1.0
    //   820: invokevirtual getDimension : (IF)F
    //   823: fstore #4
    //   825: goto -> 836
    //   828: ldc_w -1.0
    //   831: fstore #4
    //   833: goto -> 825
    //   836: aload #14
    //   838: iconst_3
    //   839: invokevirtual hasValue : (I)Z
    //   842: ifeq -> 932
    //   845: aload #14
    //   847: iconst_3
    //   848: iconst_0
    //   849: invokevirtual getResourceId : (II)I
    //   852: istore_2
    //   853: iload_2
    //   854: ifle -> 932
    //   857: aload #14
    //   859: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   862: iload_2
    //   863: invokevirtual obtainTypedArray : (I)Landroid/content/res/TypedArray;
    //   866: astore #20
    //   868: aload #20
    //   870: invokevirtual length : ()I
    //   873: istore #7
    //   875: iload #7
    //   877: newarray int
    //   879: astore #19
    //   881: iload #7
    //   883: ifle -> 927
    //   886: iconst_0
    //   887: istore_2
    //   888: iload_2
    //   889: iload #7
    //   891: if_icmpge -> 911
    //   894: aload #19
    //   896: iload_2
    //   897: aload #20
    //   899: iload_2
    //   900: iconst_m1
    //   901: invokevirtual getDimensionPixelSize : (II)I
    //   904: iastore
    //   905: iinc #2, 1
    //   908: goto -> 888
    //   911: aload #13
    //   913: aload #19
    //   915: invokestatic b : ([I)[I
    //   918: putfield f : [I
    //   921: aload #13
    //   923: invokevirtual i : ()Z
    //   926: pop
    //   927: aload #20
    //   929: invokevirtual recycle : ()V
    //   932: aload #14
    //   934: invokevirtual recycle : ()V
    //   937: aload #13
    //   939: invokevirtual j : ()Z
    //   942: ifeq -> 1053
    //   945: aload #13
    //   947: getfield a : I
    //   950: iconst_1
    //   951: if_icmpne -> 1059
    //   954: aload #13
    //   956: getfield g : Z
    //   959: ifne -> 1044
    //   962: aload #16
    //   964: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   967: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   970: astore #14
    //   972: fload #5
    //   974: ldc_w -1.0
    //   977: fcmpl
    //   978: ifne -> 995
    //   981: iconst_2
    //   982: ldc_w 12.0
    //   985: aload #14
    //   987: invokestatic applyDimension : (IFLandroid/util/DisplayMetrics;)F
    //   990: fstore #5
    //   992: goto -> 995
    //   995: fload #4
    //   997: fstore #6
    //   999: fload #4
    //   1001: ldc_w -1.0
    //   1004: fcmpl
    //   1005: ifne -> 1019
    //   1008: iconst_2
    //   1009: ldc_w 112.0
    //   1012: aload #14
    //   1014: invokestatic applyDimension : (IFLandroid/util/DisplayMetrics;)F
    //   1017: fstore #6
    //   1019: fload_3
    //   1020: fstore #4
    //   1022: fload_3
    //   1023: ldc_w -1.0
    //   1026: fcmpl
    //   1027: ifne -> 1033
    //   1030: fconst_1
    //   1031: fstore #4
    //   1033: aload #13
    //   1035: fload #5
    //   1037: fload #6
    //   1039: fload #4
    //   1041: invokevirtual k : (FFF)V
    //   1044: aload #13
    //   1046: invokevirtual h : ()Z
    //   1049: pop
    //   1050: goto -> 1059
    //   1053: aload #13
    //   1055: iconst_0
    //   1056: putfield a : I
    //   1059: getstatic d42.c : Z
    //   1062: ifeq -> 1140
    //   1065: aload #13
    //   1067: getfield a : I
    //   1070: ifeq -> 1140
    //   1073: aload #13
    //   1075: getfield f : [I
    //   1078: astore #14
    //   1080: aload #14
    //   1082: arraylength
    //   1083: ifle -> 1140
    //   1086: aload #17
    //   1088: invokestatic a : (Landroid/widget/TextView;)I
    //   1091: i2f
    //   1092: ldc_w -1.0
    //   1095: fcmpl
    //   1096: ifeq -> 1132
    //   1099: aload #17
    //   1101: aload #13
    //   1103: getfield d : F
    //   1106: invokestatic round : (F)I
    //   1109: aload #13
    //   1111: getfield e : F
    //   1114: invokestatic round : (F)I
    //   1117: aload #13
    //   1119: getfield c : F
    //   1122: invokestatic round : (F)I
    //   1125: iconst_0
    //   1126: invokestatic b : (Landroid/widget/TextView;IIII)V
    //   1129: goto -> 1140
    //   1132: aload #17
    //   1134: aload #14
    //   1136: iconst_0
    //   1137: invokestatic c : (Landroid/widget/TextView;[II)V
    //   1140: aload #18
    //   1142: aload_1
    //   1143: aload #12
    //   1145: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   1148: astore #19
    //   1150: aload #19
    //   1152: bipush #8
    //   1154: iconst_m1
    //   1155: invokevirtual getResourceId : (II)I
    //   1158: istore_2
    //   1159: iload_2
    //   1160: iconst_m1
    //   1161: if_icmpeq -> 1177
    //   1164: aload #15
    //   1166: aload #18
    //   1168: iload_2
    //   1169: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1172: astore #14
    //   1174: goto -> 1183
    //   1177: aconst_null
    //   1178: astore #14
    //   1180: goto -> 1174
    //   1183: aload #19
    //   1185: bipush #13
    //   1187: iconst_m1
    //   1188: invokevirtual getResourceId : (II)I
    //   1191: istore_2
    //   1192: iload_2
    //   1193: iconst_m1
    //   1194: if_icmpeq -> 1210
    //   1197: aload #15
    //   1199: aload #18
    //   1201: iload_2
    //   1202: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1205: astore #12
    //   1207: goto -> 1213
    //   1210: aconst_null
    //   1211: astore #12
    //   1213: aload #19
    //   1215: bipush #9
    //   1217: iconst_m1
    //   1218: invokevirtual getResourceId : (II)I
    //   1221: istore_2
    //   1222: iload_2
    //   1223: iconst_m1
    //   1224: if_icmpeq -> 1240
    //   1227: aload #15
    //   1229: aload #18
    //   1231: iload_2
    //   1232: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1235: astore #13
    //   1237: goto -> 1246
    //   1240: aconst_null
    //   1241: astore #13
    //   1243: goto -> 1237
    //   1246: aload #19
    //   1248: bipush #6
    //   1250: iconst_m1
    //   1251: invokevirtual getResourceId : (II)I
    //   1254: istore_2
    //   1255: iload_2
    //   1256: iconst_m1
    //   1257: if_icmpeq -> 1272
    //   1260: aload #15
    //   1262: aload #18
    //   1264: iload_2
    //   1265: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1268: astore_1
    //   1269: goto -> 1274
    //   1272: aconst_null
    //   1273: astore_1
    //   1274: aload #19
    //   1276: bipush #10
    //   1278: iconst_m1
    //   1279: invokevirtual getResourceId : (II)I
    //   1282: istore_2
    //   1283: iload_2
    //   1284: iconst_m1
    //   1285: if_icmpeq -> 1301
    //   1288: aload #15
    //   1290: aload #18
    //   1292: iload_2
    //   1293: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1296: astore #16
    //   1298: goto -> 1304
    //   1301: aconst_null
    //   1302: astore #16
    //   1304: aload #19
    //   1306: bipush #7
    //   1308: iconst_m1
    //   1309: invokevirtual getResourceId : (II)I
    //   1312: istore_2
    //   1313: iload_2
    //   1314: iconst_m1
    //   1315: if_icmpeq -> 1331
    //   1318: aload #15
    //   1320: aload #18
    //   1322: iload_2
    //   1323: invokevirtual b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1326: astore #15
    //   1328: goto -> 1334
    //   1331: aconst_null
    //   1332: astore #15
    //   1334: aload #16
    //   1336: ifnonnull -> 1516
    //   1339: aload #15
    //   1341: ifnull -> 1347
    //   1344: goto -> 1516
    //   1347: aload #14
    //   1349: ifnonnull -> 1366
    //   1352: aload #12
    //   1354: ifnonnull -> 1366
    //   1357: aload #13
    //   1359: ifnonnull -> 1366
    //   1362: aload_1
    //   1363: ifnull -> 1589
    //   1366: aload #17
    //   1368: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   1371: astore #16
    //   1373: aload #16
    //   1375: iconst_0
    //   1376: aaload
    //   1377: astore #15
    //   1379: aload #15
    //   1381: ifnonnull -> 1391
    //   1384: aload #16
    //   1386: iconst_2
    //   1387: aaload
    //   1388: ifnull -> 1394
    //   1391: goto -> 1470
    //   1394: aload #17
    //   1396: invokevirtual getCompoundDrawables : ()[Landroid/graphics/drawable/Drawable;
    //   1399: astore #15
    //   1401: aload #14
    //   1403: ifnull -> 1409
    //   1406: goto -> 1415
    //   1409: aload #15
    //   1411: iconst_0
    //   1412: aaload
    //   1413: astore #14
    //   1415: aload #12
    //   1417: ifnull -> 1423
    //   1420: goto -> 1429
    //   1423: aload #15
    //   1425: iconst_1
    //   1426: aaload
    //   1427: astore #12
    //   1429: aload #13
    //   1431: ifnull -> 1437
    //   1434: goto -> 1443
    //   1437: aload #15
    //   1439: iconst_2
    //   1440: aaload
    //   1441: astore #13
    //   1443: aload_1
    //   1444: ifnull -> 1450
    //   1447: goto -> 1455
    //   1450: aload #15
    //   1452: iconst_3
    //   1453: aaload
    //   1454: astore_1
    //   1455: aload #17
    //   1457: aload #14
    //   1459: aload #12
    //   1461: aload #13
    //   1463: aload_1
    //   1464: invokevirtual setCompoundDrawablesWithIntrinsicBounds : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   1467: goto -> 1589
    //   1470: aload #12
    //   1472: ifnull -> 1478
    //   1475: goto -> 1484
    //   1478: aload #16
    //   1480: iconst_1
    //   1481: aaload
    //   1482: astore #12
    //   1484: aload_1
    //   1485: ifnull -> 1491
    //   1488: goto -> 1499
    //   1491: aload #16
    //   1493: iconst_3
    //   1494: aaload
    //   1495: astore_1
    //   1496: goto -> 1488
    //   1499: aload #17
    //   1501: aload #15
    //   1503: aload #12
    //   1505: aload #16
    //   1507: iconst_2
    //   1508: aaload
    //   1509: aload_1
    //   1510: invokevirtual setCompoundDrawablesRelativeWithIntrinsicBounds : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   1513: goto -> 1589
    //   1516: aload #17
    //   1518: invokevirtual getCompoundDrawablesRelative : ()[Landroid/graphics/drawable/Drawable;
    //   1521: astore #13
    //   1523: aload #16
    //   1525: ifnull -> 1531
    //   1528: goto -> 1537
    //   1531: aload #13
    //   1533: iconst_0
    //   1534: aaload
    //   1535: astore #16
    //   1537: aload #12
    //   1539: ifnull -> 1545
    //   1542: goto -> 1551
    //   1545: aload #13
    //   1547: iconst_1
    //   1548: aaload
    //   1549: astore #12
    //   1551: aload #15
    //   1553: ifnull -> 1559
    //   1556: goto -> 1565
    //   1559: aload #13
    //   1561: iconst_2
    //   1562: aaload
    //   1563: astore #15
    //   1565: aload_1
    //   1566: ifnull -> 1572
    //   1569: goto -> 1577
    //   1572: aload #13
    //   1574: iconst_3
    //   1575: aaload
    //   1576: astore_1
    //   1577: aload #17
    //   1579: aload #16
    //   1581: aload #12
    //   1583: aload #15
    //   1585: aload_1
    //   1586: invokevirtual setCompoundDrawablesRelativeWithIntrinsicBounds : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   1589: aload #19
    //   1591: bipush #11
    //   1593: invokevirtual hasValue : (I)Z
    //   1596: ifeq -> 1650
    //   1599: aload #19
    //   1601: bipush #11
    //   1603: invokevirtual hasValue : (I)Z
    //   1606: ifeq -> 1636
    //   1609: aload #19
    //   1611: bipush #11
    //   1613: iconst_0
    //   1614: invokevirtual getResourceId : (II)I
    //   1617: istore_2
    //   1618: iload_2
    //   1619: ifeq -> 1636
    //   1622: aload #18
    //   1624: iload_2
    //   1625: invokestatic y : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   1628: astore_1
    //   1629: aload_1
    //   1630: ifnull -> 1636
    //   1633: goto -> 1644
    //   1636: aload #19
    //   1638: bipush #11
    //   1640: invokevirtual getColorStateList : (I)Landroid/content/res/ColorStateList;
    //   1643: astore_1
    //   1644: aload #17
    //   1646: aload_1
    //   1647: invokevirtual setCompoundDrawableTintList : (Landroid/content/res/ColorStateList;)V
    //   1650: aload #19
    //   1652: bipush #12
    //   1654: invokevirtual hasValue : (I)Z
    //   1657: ifeq -> 1677
    //   1660: aload #17
    //   1662: aload #19
    //   1664: bipush #12
    //   1666: iconst_m1
    //   1667: invokevirtual getInt : (II)I
    //   1670: aconst_null
    //   1671: invokestatic c : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   1674: invokevirtual setCompoundDrawableTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   1677: aload #19
    //   1679: bipush #15
    //   1681: iconst_m1
    //   1682: invokevirtual getDimensionPixelSize : (II)I
    //   1685: istore #7
    //   1687: aload #19
    //   1689: bipush #18
    //   1691: iconst_m1
    //   1692: invokevirtual getDimensionPixelSize : (II)I
    //   1695: istore #8
    //   1697: aload #19
    //   1699: bipush #19
    //   1701: invokevirtual hasValue : (I)Z
    //   1704: ifeq -> 1760
    //   1707: aload #19
    //   1709: bipush #19
    //   1711: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   1714: astore_1
    //   1715: aload_1
    //   1716: ifnull -> 1745
    //   1719: aload_1
    //   1720: getfield type : I
    //   1723: iconst_5
    //   1724: if_icmpne -> 1745
    //   1727: aload_1
    //   1728: getfield data : I
    //   1731: istore_2
    //   1732: iload_2
    //   1733: invokestatic complexToFloat : (I)F
    //   1736: fstore_3
    //   1737: iload_2
    //   1738: bipush #15
    //   1740: iand
    //   1741: istore_2
    //   1742: goto -> 1767
    //   1745: aload #19
    //   1747: bipush #19
    //   1749: iconst_m1
    //   1750: invokevirtual getDimensionPixelSize : (II)I
    //   1753: i2f
    //   1754: fstore_3
    //   1755: iconst_m1
    //   1756: istore_2
    //   1757: goto -> 1767
    //   1760: ldc_w -1.0
    //   1763: fstore_3
    //   1764: goto -> 1755
    //   1767: aload #19
    //   1769: invokevirtual recycle : ()V
    //   1772: iload #7
    //   1774: iconst_m1
    //   1775: if_icmpeq -> 1785
    //   1778: aload #17
    //   1780: iload #7
    //   1782: invokestatic c0 : (Landroid/widget/TextView;I)V
    //   1785: iload #8
    //   1787: iconst_m1
    //   1788: if_icmpeq -> 1798
    //   1791: aload #17
    //   1793: iload #8
    //   1795: invokestatic d0 : (Landroid/widget/TextView;I)V
    //   1798: fload_3
    //   1799: ldc_w -1.0
    //   1802: fcmpl
    //   1803: ifeq -> 1856
    //   1806: iload_2
    //   1807: iconst_m1
    //   1808: if_icmpne -> 1819
    //   1811: aload #17
    //   1813: fload_3
    //   1814: f2i
    //   1815: invokestatic e0 : (Landroid/widget/TextView;I)V
    //   1818: return
    //   1819: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1822: bipush #34
    //   1824: if_icmplt -> 1835
    //   1827: aload #17
    //   1829: iload_2
    //   1830: fload_3
    //   1831: invokestatic l : (Landroid/widget/TextView;IF)V
    //   1834: return
    //   1835: aload #17
    //   1837: iload_2
    //   1838: fload_3
    //   1839: aload #17
    //   1841: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1844: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   1847: invokestatic applyDimension : (IFLandroid/util/DisplayMetrics;)F
    //   1850: invokestatic round : (F)I
    //   1853: invokestatic e0 : (Landroid/widget/TextView;I)V
    //   1856: return
  }
  
  public final void g(Context paramContext, int paramInt) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramInt, nc1.x);
    zv0 zv0 = new zv0(paramContext, typedArray);
    boolean bool = typedArray.hasValue(14);
    TextView textView = this.a;
    if (bool)
      textView.setAllCaps(typedArray.getBoolean(14, false)); 
    if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0)
      textView.setTextSize(0, 0.0F); 
    n(paramContext, zv0);
    if (Build.VERSION.SDK_INT >= 26 && typedArray.hasValue(13)) {
      String str = typedArray.getString(13);
      if (str != null)
        z7.d(textView, str); 
    } 
    zv0.z();
    Typeface typeface = this.l;
    if (typeface != null)
      textView.setTypeface(typeface, this.j); 
  }
  
  public final void i(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    j8 j81 = this.i;
    if (j81.j()) {
      DisplayMetrics displayMetrics = j81.j.getResources().getDisplayMetrics();
      j81.k(TypedValue.applyDimension(paramInt4, paramInt1, displayMetrics), TypedValue.applyDimension(paramInt4, paramInt2, displayMetrics), TypedValue.applyDimension(paramInt4, paramInt3, displayMetrics));
      if (j81.h())
        j81.a(); 
    } 
  }
  
  public final void j(int[] paramArrayOfint, int paramInt) {
    j8 j81 = this.i;
    if (j81.j()) {
      int i = paramArrayOfint.length;
      byte b = 0;
      if (i > 0) {
        int[] arrayOfInt1;
        int[] arrayOfInt2 = new int[i];
        if (paramInt == 0) {
          arrayOfInt1 = Arrays.copyOf(paramArrayOfint, i);
        } else {
          DisplayMetrics displayMetrics = j81.j.getResources().getDisplayMetrics();
          while (true) {
            arrayOfInt1 = arrayOfInt2;
            if (b < i) {
              arrayOfInt2[b] = Math.round(TypedValue.applyDimension(paramInt, paramArrayOfint[b], displayMetrics));
              b++;
              continue;
            } 
            break;
          } 
        } 
        j81.f = j8.b(arrayOfInt1);
        if (!j81.i()) {
          tp.g("None of the preset sizes is valid: ", Arrays.toString(paramArrayOfint));
          return;
        } 
      } else {
        j81.g = false;
      } 
      if (j81.h())
        j81.a(); 
    } 
  }
  
  public final void k(int paramInt) {
    j8 j81 = this.i;
    if (j81.j())
      if (paramInt != 0) {
        if (paramInt == 1) {
          DisplayMetrics displayMetrics = j81.j.getResources().getDisplayMetrics();
          j81.k(TypedValue.applyDimension(2, 12.0F, displayMetrics), TypedValue.applyDimension(2, 112.0F, displayMetrics), 1.0F);
          if (j81.h()) {
            j81.a();
            return;
          } 
        } else {
          l0.l(ga1.i("Unknown auto-size text type: ", paramInt));
          return;
        } 
      } else {
        j81.a = 0;
        j81.d = -1.0F;
        j81.e = -1.0F;
        j81.c = -1.0F;
        j81.f = new int[0];
        j81.b = false;
      }  
  }
  
  public final void l(ColorStateList paramColorStateList) {
    boolean bool;
    if (this.h == null)
      this.h = (up)new Object(); 
    up up1 = this.h;
    up1.c = paramColorStateList;
    if (paramColorStateList != null) {
      bool = true;
    } else {
      bool = false;
    } 
    up1.b = bool;
    this.b = up1;
    this.c = up1;
    this.d = up1;
    this.e = up1;
    this.f = up1;
    this.g = up1;
  }
  
  public final void m(PorterDuff.Mode paramMode) {
    boolean bool;
    if (this.h == null)
      this.h = (up)new Object(); 
    up up1 = this.h;
    up1.d = paramMode;
    if (paramMode != null) {
      bool = true;
    } else {
      bool = false;
    } 
    up1.a = bool;
    this.b = up1;
    this.c = up1;
    this.d = up1;
    this.e = up1;
    this.f = up1;
    this.g = up1;
  }
  
  public final void n(Context paramContext, zv0 paramzv0) {
    int i = this.j;
    TypedArray typedArray = (TypedArray)paramzv0.e;
    this.j = typedArray.getInt(2, i);
    int j = Build.VERSION.SDK_INT;
    if (j >= 28) {
      i = typedArray.getInt(11, -1);
      this.k = i;
      if (i != -1)
        this.j &= 0x2; 
    } 
    i = 10;
    boolean bool = typedArray.hasValue(10);
    boolean bool1 = true;
    if (bool || typedArray.hasValue(12)) {
      this.l = null;
      if (typedArray.hasValue(12))
        i = 12; 
      int k = this.k;
      int m = this.j;
      if (!paramContext.isRestricted()) {
        w7 w7 = new w7(this, k, m, new WeakReference<TextView>(this.a));
        try {
          Typeface typeface = paramzv0.q(i, this.j, w7);
          if (typeface != null)
            if (j >= 28 && this.k != -1) {
              typeface = Typeface.create(typeface, 0);
              j = this.k;
              if ((this.j & 0x2) != 0) {
                bool = true;
              } else {
                bool = false;
              } 
              this.l = a8.a(typeface, j, bool);
            } else {
              this.l = typeface;
            }  
          if (this.l == null) {
            bool = true;
          } else {
            bool = false;
          } 
          this.m = bool;
        } catch (UnsupportedOperationException|android.content.res.Resources.NotFoundException unsupportedOperationException) {}
      } 
      if (this.l == null) {
        String str = typedArray.getString(i);
        if (str != null) {
          Typeface typeface;
          if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
            typeface = Typeface.create(str, 0);
            i = this.k;
            if ((this.j & 0x2) != 0) {
              bool = bool1;
            } else {
              bool = false;
            } 
            this.l = a8.a(typeface, i, bool);
          } else {
            this.l = Typeface.create((String)typeface, this.j);
          } 
        } 
      } 
      return;
    } 
    if (typedArray.hasValue(1)) {
      this.m = false;
      i = typedArray.getInt(1, 1);
      if (i != 1) {
        if (i != 2) {
          if (i == 3) {
            this.l = Typeface.MONOSPACE;
            return;
          } 
        } else {
          this.l = Typeface.SERIF;
          return;
        } 
      } else {
        this.l = Typeface.SANS_SERIF;
        return;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */