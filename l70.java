import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

public final class l70 extends kw1 {
  public static final String[] G = new String[] { "android:visibility:visibility", "android:visibility:parent" };
  
  public final int F = 3;
  
  public l70() {}
  
  public l70(int paramInt) {
    this();
    this.F = paramInt;
  }
  
  public static void M(tw1 paramtw1) {
    View view = paramtw1.b;
    int i = view.getVisibility();
    HashMap<String, Integer> hashMap = paramtw1.a;
    hashMap.put("android:visibility:visibility", Integer.valueOf(i));
    hashMap.put("android:visibility:parent", view.getParent());
    int[] arrayOfInt = new int[2];
    view.getLocationOnScreen(arrayOfInt);
    hashMap.put("android:visibility:screenLocation", arrayOfInt);
  }
  
  public static float O(tw1 paramtw1, float paramFloat) {
    if (paramtw1 != null) {
      Float float_ = (Float)paramtw1.a.get("android:fade:transitionAlpha");
      if (float_ != null)
        return float_.floatValue(); 
    } 
    return paramFloat;
  }
  
  public static o42 P(tw1 paramtw11, tw1 paramtw12) {
    // Byte code:
    //   0: new java/lang/Object
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload #4
    //   11: iconst_0
    //   12: putfield a : Z
    //   15: aload #4
    //   17: iconst_0
    //   18: putfield b : Z
    //   21: aload_0
    //   22: ifnull -> 77
    //   25: aload_0
    //   26: getfield a : Ljava/util/HashMap;
    //   29: astore #5
    //   31: aload #5
    //   33: ldc 'android:visibility:visibility'
    //   35: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   38: ifeq -> 77
    //   41: aload #4
    //   43: aload #5
    //   45: ldc 'android:visibility:visibility'
    //   47: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   50: checkcast java/lang/Integer
    //   53: invokevirtual intValue : ()I
    //   56: putfield c : I
    //   59: aload #4
    //   61: aload #5
    //   63: ldc 'android:visibility:parent'
    //   65: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   68: checkcast android/view/ViewGroup
    //   71: putfield e : Landroid/view/ViewGroup;
    //   74: goto -> 89
    //   77: aload #4
    //   79: iconst_m1
    //   80: putfield c : I
    //   83: aload #4
    //   85: aconst_null
    //   86: putfield e : Landroid/view/ViewGroup;
    //   89: aload_1
    //   90: ifnull -> 145
    //   93: aload_1
    //   94: getfield a : Ljava/util/HashMap;
    //   97: astore #5
    //   99: aload #5
    //   101: ldc 'android:visibility:visibility'
    //   103: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   106: ifeq -> 145
    //   109: aload #4
    //   111: aload #5
    //   113: ldc 'android:visibility:visibility'
    //   115: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   118: checkcast java/lang/Integer
    //   121: invokevirtual intValue : ()I
    //   124: putfield d : I
    //   127: aload #4
    //   129: aload #5
    //   131: ldc 'android:visibility:parent'
    //   133: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   136: checkcast android/view/ViewGroup
    //   139: putfield f : Landroid/view/ViewGroup;
    //   142: goto -> 157
    //   145: aload #4
    //   147: iconst_m1
    //   148: putfield d : I
    //   151: aload #4
    //   153: aconst_null
    //   154: putfield f : Landroid/view/ViewGroup;
    //   157: aload_0
    //   158: ifnull -> 287
    //   161: aload_1
    //   162: ifnull -> 287
    //   165: aload #4
    //   167: getfield c : I
    //   170: istore_3
    //   171: aload #4
    //   173: getfield d : I
    //   176: istore_2
    //   177: iload_3
    //   178: iload_2
    //   179: if_icmpne -> 198
    //   182: aload #4
    //   184: getfield e : Landroid/view/ViewGroup;
    //   187: aload #4
    //   189: getfield f : Landroid/view/ViewGroup;
    //   192: if_acmpne -> 198
    //   195: goto -> 338
    //   198: iload_3
    //   199: iload_2
    //   200: if_icmpeq -> 241
    //   203: iload_3
    //   204: ifne -> 222
    //   207: aload #4
    //   209: iconst_0
    //   210: putfield b : Z
    //   213: aload #4
    //   215: iconst_1
    //   216: putfield a : Z
    //   219: aload #4
    //   221: areturn
    //   222: iload_2
    //   223: ifne -> 338
    //   226: aload #4
    //   228: iconst_1
    //   229: putfield b : Z
    //   232: aload #4
    //   234: iconst_1
    //   235: putfield a : Z
    //   238: aload #4
    //   240: areturn
    //   241: aload #4
    //   243: getfield f : Landroid/view/ViewGroup;
    //   246: ifnonnull -> 264
    //   249: aload #4
    //   251: iconst_0
    //   252: putfield b : Z
    //   255: aload #4
    //   257: iconst_1
    //   258: putfield a : Z
    //   261: aload #4
    //   263: areturn
    //   264: aload #4
    //   266: getfield e : Landroid/view/ViewGroup;
    //   269: ifnonnull -> 338
    //   272: aload #4
    //   274: iconst_1
    //   275: putfield b : Z
    //   278: aload #4
    //   280: iconst_1
    //   281: putfield a : Z
    //   284: aload #4
    //   286: areturn
    //   287: aload_0
    //   288: ifnonnull -> 314
    //   291: aload #4
    //   293: getfield d : I
    //   296: ifne -> 314
    //   299: aload #4
    //   301: iconst_1
    //   302: putfield b : Z
    //   305: aload #4
    //   307: iconst_1
    //   308: putfield a : Z
    //   311: aload #4
    //   313: areturn
    //   314: aload_1
    //   315: ifnonnull -> 338
    //   318: aload #4
    //   320: getfield c : I
    //   323: ifne -> 338
    //   326: aload #4
    //   328: iconst_0
    //   329: putfield b : Z
    //   332: aload #4
    //   334: iconst_1
    //   335: putfield a : Z
    //   338: aload #4
    //   340: areturn
  }
  
  public final ObjectAnimator N(View paramView, float paramFloat1, float paramFloat2) {
    if (paramFloat1 == paramFloat2)
      return null; 
    c42.a.M(paramView, paramFloat1);
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(paramView, c42.b, new float[] { paramFloat2 });
    k70 k70 = new k70(paramView);
    objectAnimator.addListener((Animator.AnimatorListener)k70);
    p().a(k70);
    return objectAnimator;
  }
  
  public final void d(tw1 paramtw1) {
    M(paramtw1);
  }
  
  public final void g(tw1 paramtw1) {
    M(paramtw1);
    View view = paramtw1.b;
    Float float_2 = (Float)view.getTag(2131297670);
    Float float_1 = float_2;
    if (float_2 == null)
      if (view.getVisibility() == 0) {
        float_1 = Float.valueOf(c42.a.q(view));
      } else {
        float_1 = Float.valueOf(0.0F);
      }  
    paramtw1.a.put("android:fade:transitionAlpha", float_1);
  }
  
  public final Animator k(ViewGroup paramViewGroup, tw1 paramtw11, tw1 paramtw12) {
    // Byte code:
    //   0: aload_2
    //   1: aload_3
    //   2: invokestatic P : (Ltw1;Ltw1;)Lo42;
    //   5: astore #14
    //   7: aload #14
    //   9: getfield a : Z
    //   12: ifeq -> 34
    //   15: aload #14
    //   17: getfield e : Landroid/view/ViewGroup;
    //   20: ifnonnull -> 37
    //   23: aload #14
    //   25: getfield f : Landroid/view/ViewGroup;
    //   28: ifnull -> 34
    //   31: goto -> 37
    //   34: goto -> 1188
    //   37: aload #14
    //   39: getfield b : Z
    //   42: istore #13
    //   44: aload_0
    //   45: getfield F : I
    //   48: istore #7
    //   50: iconst_1
    //   51: istore #5
    //   53: iload #13
    //   55: ifeq -> 133
    //   58: iload #7
    //   60: iconst_1
    //   61: iand
    //   62: iconst_1
    //   63: if_icmpne -> 34
    //   66: aload_3
    //   67: ifnonnull -> 73
    //   70: goto -> 34
    //   73: aload_3
    //   74: getfield b : Landroid/view/View;
    //   77: astore_1
    //   78: aload_2
    //   79: ifnonnull -> 114
    //   82: aload_1
    //   83: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   86: checkcast android/view/View
    //   89: astore_3
    //   90: aload_0
    //   91: aload_3
    //   92: iconst_0
    //   93: invokevirtual o : (Landroid/view/View;Z)Ltw1;
    //   96: aload_0
    //   97: aload_3
    //   98: iconst_0
    //   99: invokevirtual s : (Landroid/view/View;Z)Ltw1;
    //   102: invokestatic P : (Ltw1;Ltw1;)Lo42;
    //   105: getfield a : Z
    //   108: ifeq -> 114
    //   111: goto -> 34
    //   114: getstatic c42.a : Li42;
    //   117: invokevirtual getClass : ()Ljava/lang/Class;
    //   120: pop
    //   121: aload_0
    //   122: aload_1
    //   123: aload_2
    //   124: fconst_0
    //   125: invokestatic O : (Ltw1;F)F
    //   128: fconst_1
    //   129: invokevirtual N : (Landroid/view/View;FF)Landroid/animation/ObjectAnimator;
    //   132: areturn
    //   133: aload #14
    //   135: getfield d : I
    //   138: istore #6
    //   140: iload #7
    //   142: iconst_2
    //   143: iand
    //   144: iconst_2
    //   145: if_icmpeq -> 151
    //   148: goto -> 34
    //   151: aload_2
    //   152: ifnonnull -> 158
    //   155: goto -> 34
    //   158: aload_2
    //   159: getfield b : Landroid/view/View;
    //   162: astore #18
    //   164: aload_3
    //   165: ifnull -> 177
    //   168: aload_3
    //   169: getfield b : Landroid/view/View;
    //   172: astore #14
    //   174: goto -> 180
    //   177: aconst_null
    //   178: astore #14
    //   180: aload #18
    //   182: ldc 2131297432
    //   184: invokevirtual getTag : (I)Ljava/lang/Object;
    //   187: checkcast android/view/View
    //   190: astore #15
    //   192: aload #15
    //   194: ifnull -> 203
    //   197: aconst_null
    //   198: astore #14
    //   200: goto -> 895
    //   203: aload #14
    //   205: ifnull -> 264
    //   208: aload #14
    //   210: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   213: ifnonnull -> 219
    //   216: goto -> 264
    //   219: iload #6
    //   221: iconst_4
    //   222: if_icmpne -> 228
    //   225: goto -> 235
    //   228: aload #18
    //   230: aload #14
    //   232: if_acmpne -> 244
    //   235: iconst_0
    //   236: istore #5
    //   238: aconst_null
    //   239: astore #15
    //   241: goto -> 275
    //   244: iconst_1
    //   245: istore #5
    //   247: aconst_null
    //   248: astore #14
    //   250: aconst_null
    //   251: astore #16
    //   253: aload #14
    //   255: astore #15
    //   257: aload #16
    //   259: astore #14
    //   261: goto -> 275
    //   264: aload #14
    //   266: ifnull -> 244
    //   269: iconst_0
    //   270: istore #5
    //   272: goto -> 250
    //   275: iload #5
    //   277: ifeq -> 892
    //   280: aload #18
    //   282: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   285: ifnonnull -> 298
    //   288: iconst_0
    //   289: istore #5
    //   291: aload #18
    //   293: astore #15
    //   295: goto -> 895
    //   298: aload #18
    //   300: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   303: instanceof android/view/View
    //   306: ifeq -> 892
    //   309: aload #18
    //   311: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   314: checkcast android/view/View
    //   317: astore #16
    //   319: aload_0
    //   320: aload #16
    //   322: iconst_1
    //   323: invokevirtual s : (Landroid/view/View;Z)Ltw1;
    //   326: astore #17
    //   328: aload #17
    //   330: aload_0
    //   331: aload #16
    //   333: iconst_1
    //   334: invokevirtual o : (Landroid/view/View;Z)Ltw1;
    //   337: invokestatic P : (Ltw1;Ltw1;)Lo42;
    //   340: getfield a : Z
    //   343: ifne -> 861
    //   346: getstatic sw1.a : Z
    //   349: istore #13
    //   351: new android/graphics/Matrix
    //   354: dup
    //   355: invokespecial <init> : ()V
    //   358: astore #17
    //   360: aload #17
    //   362: aload #16
    //   364: invokevirtual getScrollX : ()I
    //   367: ineg
    //   368: i2f
    //   369: aload #16
    //   371: invokevirtual getScrollY : ()I
    //   374: ineg
    //   375: i2f
    //   376: invokevirtual setTranslate : (FF)V
    //   379: getstatic c42.a : Li42;
    //   382: astore #15
    //   384: aload #15
    //   386: aload #18
    //   388: aload #17
    //   390: invokevirtual b0 : (Landroid/view/View;Landroid/graphics/Matrix;)V
    //   393: aload #15
    //   395: aload_1
    //   396: aload #17
    //   398: invokevirtual c0 : (Landroid/view/ViewGroup;Landroid/graphics/Matrix;)V
    //   401: new android/graphics/RectF
    //   404: dup
    //   405: fconst_0
    //   406: fconst_0
    //   407: aload #18
    //   409: invokevirtual getWidth : ()I
    //   412: i2f
    //   413: aload #18
    //   415: invokevirtual getHeight : ()I
    //   418: i2f
    //   419: invokespecial <init> : (FFFF)V
    //   422: astore #15
    //   424: aload #17
    //   426: aload #15
    //   428: invokevirtual mapRect : (Landroid/graphics/RectF;)Z
    //   431: pop
    //   432: aload #15
    //   434: getfield left : F
    //   437: invokestatic round : (F)I
    //   440: istore #7
    //   442: aload #15
    //   444: getfield top : F
    //   447: invokestatic round : (F)I
    //   450: istore #10
    //   452: aload #15
    //   454: getfield right : F
    //   457: invokestatic round : (F)I
    //   460: istore #9
    //   462: aload #15
    //   464: getfield bottom : F
    //   467: invokestatic round : (F)I
    //   470: istore #8
    //   472: new android/widget/ImageView
    //   475: dup
    //   476: aload #18
    //   478: invokevirtual getContext : ()Landroid/content/Context;
    //   481: invokespecial <init> : (Landroid/content/Context;)V
    //   484: astore #19
    //   486: aload #19
    //   488: getstatic android/widget/ImageView$ScaleType.CENTER_CROP : Landroid/widget/ImageView$ScaleType;
    //   491: invokevirtual setScaleType : (Landroid/widget/ImageView$ScaleType;)V
    //   494: aload #18
    //   496: invokevirtual isAttachedToWindow : ()Z
    //   499: istore #13
    //   501: aload_1
    //   502: ifnull -> 518
    //   505: aload_1
    //   506: invokevirtual isAttachedToWindow : ()Z
    //   509: ifeq -> 518
    //   512: iconst_1
    //   513: istore #5
    //   515: goto -> 521
    //   518: iconst_0
    //   519: istore #5
    //   521: iload #13
    //   523: ifne -> 568
    //   526: iload #5
    //   528: ifne -> 537
    //   531: aconst_null
    //   532: astore #17
    //   534: goto -> 799
    //   537: aload #18
    //   539: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   542: checkcast android/view/ViewGroup
    //   545: astore #16
    //   547: aload #16
    //   549: aload #18
    //   551: invokevirtual indexOfChild : (Landroid/view/View;)I
    //   554: istore #5
    //   556: aload_1
    //   557: invokevirtual getOverlay : ()Landroid/view/ViewGroupOverlay;
    //   560: aload #18
    //   562: invokevirtual add : (Landroid/view/View;)V
    //   565: goto -> 574
    //   568: aconst_null
    //   569: astore #16
    //   571: iconst_0
    //   572: istore #5
    //   574: aload #15
    //   576: invokevirtual width : ()F
    //   579: invokestatic round : (F)I
    //   582: istore #12
    //   584: aload #15
    //   586: invokevirtual height : ()F
    //   589: invokestatic round : (F)I
    //   592: istore #11
    //   594: iload #12
    //   596: ifle -> 765
    //   599: iload #11
    //   601: ifle -> 765
    //   604: fconst_1
    //   605: ldc_w 1048576.0
    //   608: iload #12
    //   610: iload #11
    //   612: imul
    //   613: i2f
    //   614: fdiv
    //   615: invokestatic min : (FF)F
    //   618: fstore #4
    //   620: iload #12
    //   622: i2f
    //   623: fload #4
    //   625: fmul
    //   626: invokestatic round : (F)I
    //   629: istore #12
    //   631: iload #11
    //   633: i2f
    //   634: fload #4
    //   636: fmul
    //   637: invokestatic round : (F)I
    //   640: istore #11
    //   642: aload #17
    //   644: aload #15
    //   646: getfield left : F
    //   649: fneg
    //   650: aload #15
    //   652: getfield top : F
    //   655: fneg
    //   656: invokevirtual postTranslate : (FF)Z
    //   659: pop
    //   660: aload #17
    //   662: fload #4
    //   664: fload #4
    //   666: invokevirtual postScale : (FF)Z
    //   669: pop
    //   670: getstatic sw1.a : Z
    //   673: ifeq -> 725
    //   676: new android/graphics/Picture
    //   679: dup
    //   680: invokespecial <init> : ()V
    //   683: astore #20
    //   685: aload #20
    //   687: iload #12
    //   689: iload #11
    //   691: invokevirtual beginRecording : (II)Landroid/graphics/Canvas;
    //   694: astore #15
    //   696: aload #15
    //   698: aload #17
    //   700: invokevirtual concat : (Landroid/graphics/Matrix;)V
    //   703: aload #18
    //   705: aload #15
    //   707: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   710: aload #20
    //   712: invokevirtual endRecording : ()V
    //   715: aload #20
    //   717: invokestatic a : (Landroid/graphics/Picture;)Landroid/graphics/Bitmap;
    //   720: astore #15
    //   722: goto -> 768
    //   725: iload #12
    //   727: iload #11
    //   729: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   732: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   735: astore #15
    //   737: new android/graphics/Canvas
    //   740: dup
    //   741: aload #15
    //   743: invokespecial <init> : (Landroid/graphics/Bitmap;)V
    //   746: astore #20
    //   748: aload #20
    //   750: aload #17
    //   752: invokevirtual concat : (Landroid/graphics/Matrix;)V
    //   755: aload #18
    //   757: aload #20
    //   759: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   762: goto -> 768
    //   765: aconst_null
    //   766: astore #15
    //   768: aload #15
    //   770: astore #17
    //   772: iload #13
    //   774: ifne -> 799
    //   777: aload_1
    //   778: invokevirtual getOverlay : ()Landroid/view/ViewGroupOverlay;
    //   781: aload #18
    //   783: invokevirtual remove : (Landroid/view/View;)V
    //   786: aload #16
    //   788: aload #18
    //   790: iload #5
    //   792: invokevirtual addView : (Landroid/view/View;I)V
    //   795: aload #15
    //   797: astore #17
    //   799: aload #17
    //   801: ifnull -> 811
    //   804: aload #19
    //   806: aload #17
    //   808: invokevirtual setImageBitmap : (Landroid/graphics/Bitmap;)V
    //   811: aload #19
    //   813: iload #9
    //   815: iload #7
    //   817: isub
    //   818: ldc_w 1073741824
    //   821: invokestatic makeMeasureSpec : (II)I
    //   824: iload #8
    //   826: iload #10
    //   828: isub
    //   829: ldc_w 1073741824
    //   832: invokestatic makeMeasureSpec : (II)I
    //   835: invokevirtual measure : (II)V
    //   838: aload #19
    //   840: iload #7
    //   842: iload #10
    //   844: iload #9
    //   846: iload #8
    //   848: invokevirtual layout : (IIII)V
    //   851: aload #19
    //   853: astore #15
    //   855: iconst_0
    //   856: istore #5
    //   858: goto -> 895
    //   861: aload #16
    //   863: invokevirtual getId : ()I
    //   866: istore #5
    //   868: aload #16
    //   870: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   873: ifnonnull -> 892
    //   876: iload #5
    //   878: iconst_m1
    //   879: if_icmpeq -> 892
    //   882: aload_1
    //   883: iload #5
    //   885: invokevirtual findViewById : (I)Landroid/view/View;
    //   888: pop
    //   889: goto -> 892
    //   892: goto -> 855
    //   895: aload #15
    //   897: ifnull -> 1090
    //   900: iload #5
    //   902: ifne -> 987
    //   905: aload_2
    //   906: getfield a : Ljava/util/HashMap;
    //   909: ldc 'android:visibility:screenLocation'
    //   911: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   914: checkcast [I
    //   917: astore #14
    //   919: aload #14
    //   921: iconst_0
    //   922: iaload
    //   923: istore #6
    //   925: aload #14
    //   927: iconst_1
    //   928: iaload
    //   929: istore #7
    //   931: iconst_2
    //   932: newarray int
    //   934: astore #14
    //   936: aload_1
    //   937: aload #14
    //   939: invokevirtual getLocationOnScreen : ([I)V
    //   942: aload #15
    //   944: iload #6
    //   946: aload #14
    //   948: iconst_0
    //   949: iaload
    //   950: isub
    //   951: aload #15
    //   953: invokevirtual getLeft : ()I
    //   956: isub
    //   957: invokevirtual offsetLeftAndRight : (I)V
    //   960: aload #15
    //   962: iload #7
    //   964: aload #14
    //   966: iconst_1
    //   967: iaload
    //   968: isub
    //   969: aload #15
    //   971: invokevirtual getTop : ()I
    //   974: isub
    //   975: invokevirtual offsetTopAndBottom : (I)V
    //   978: aload_1
    //   979: invokevirtual getOverlay : ()Landroid/view/ViewGroupOverlay;
    //   982: aload #15
    //   984: invokevirtual add : (Landroid/view/View;)V
    //   987: getstatic c42.a : Li42;
    //   990: astore #14
    //   992: aload #14
    //   994: invokevirtual getClass : ()Ljava/lang/Class;
    //   997: pop
    //   998: aload_0
    //   999: aload #15
    //   1001: aload_2
    //   1002: fconst_1
    //   1003: invokestatic O : (Ltw1;F)F
    //   1006: fconst_0
    //   1007: invokevirtual N : (Landroid/view/View;FF)Landroid/animation/ObjectAnimator;
    //   1010: astore_2
    //   1011: aload_2
    //   1012: ifnonnull -> 1027
    //   1015: aload #14
    //   1017: aload #15
    //   1019: aload_3
    //   1020: fconst_1
    //   1021: invokestatic O : (Ltw1;F)F
    //   1024: invokevirtual M : (Landroid/view/View;F)V
    //   1027: iload #5
    //   1029: ifne -> 1088
    //   1032: aload_2
    //   1033: ifnonnull -> 1047
    //   1036: aload_1
    //   1037: invokevirtual getOverlay : ()Landroid/view/ViewGroupOverlay;
    //   1040: aload #15
    //   1042: invokevirtual remove : (Landroid/view/View;)V
    //   1045: aload_2
    //   1046: areturn
    //   1047: aload #18
    //   1049: ldc 2131297432
    //   1051: aload #15
    //   1053: invokevirtual setTag : (ILjava/lang/Object;)V
    //   1056: new n42
    //   1059: dup
    //   1060: aload_0
    //   1061: aload_1
    //   1062: aload #15
    //   1064: aload #18
    //   1066: invokespecial <init> : (Ll70;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    //   1069: astore_1
    //   1070: aload_2
    //   1071: aload_1
    //   1072: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   1075: aload_2
    //   1076: aload_1
    //   1077: invokevirtual addPauseListener : (Landroid/animation/Animator$AnimatorPauseListener;)V
    //   1080: aload_0
    //   1081: invokevirtual p : ()Lkw1;
    //   1084: aload_1
    //   1085: invokevirtual a : (Ljw1;)V
    //   1088: aload_2
    //   1089: areturn
    //   1090: aload #14
    //   1092: ifnull -> 1188
    //   1095: aload #14
    //   1097: invokevirtual getVisibility : ()I
    //   1100: istore #5
    //   1102: aload #14
    //   1104: iconst_0
    //   1105: invokestatic b : (Landroid/view/View;I)V
    //   1108: getstatic c42.a : Li42;
    //   1111: astore #15
    //   1113: aload #15
    //   1115: invokevirtual getClass : ()Ljava/lang/Class;
    //   1118: pop
    //   1119: aload_0
    //   1120: aload #14
    //   1122: aload_2
    //   1123: fconst_1
    //   1124: invokestatic O : (Ltw1;F)F
    //   1127: fconst_0
    //   1128: invokevirtual N : (Landroid/view/View;FF)Landroid/animation/ObjectAnimator;
    //   1131: astore_1
    //   1132: aload_1
    //   1133: ifnonnull -> 1148
    //   1136: aload #15
    //   1138: aload #14
    //   1140: aload_3
    //   1141: fconst_1
    //   1142: invokestatic O : (Ltw1;F)F
    //   1145: invokevirtual M : (Landroid/view/View;F)V
    //   1148: aload_1
    //   1149: ifnull -> 1179
    //   1152: new m42
    //   1155: dup
    //   1156: aload #14
    //   1158: iload #6
    //   1160: invokespecial <init> : (Landroid/view/View;I)V
    //   1163: astore_2
    //   1164: aload_1
    //   1165: aload_2
    //   1166: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   1169: aload_0
    //   1170: invokevirtual p : ()Lkw1;
    //   1173: aload_2
    //   1174: invokevirtual a : (Ljw1;)V
    //   1177: aload_1
    //   1178: areturn
    //   1179: aload #14
    //   1181: iload #5
    //   1183: invokestatic b : (Landroid/view/View;I)V
    //   1186: aload_1
    //   1187: areturn
    //   1188: aconst_null
    //   1189: areturn
  }
  
  public final String[] r() {
    return G;
  }
  
  public final boolean u(tw1 paramtw11, tw1 paramtw12) {
    if ((paramtw11 != null || paramtw12 != null) && (paramtw11 == null || paramtw12 == null || paramtw12.a.containsKey("android:visibility:visibility") == paramtw11.a.containsKey("android:visibility:visibility"))) {
      o42 o42 = P(paramtw11, paramtw12);
      if (o42.a && (o42.c == 0 || o42.d == 0))
        return true; 
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */