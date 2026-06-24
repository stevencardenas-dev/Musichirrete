import android.animation.Animator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.window.ldG.XUaAMlaMSa;
import java.util.HashMap;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public final class bk extends kw1 {
  public static final String[] F = new String[] { "android:changeBounds:bounds", GMDx.ppcOOrTbZuFmiM, "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
  
  public static final xj G = new xj(PointF.class, "topLeft", 0);
  
  public static final xj H = new xj(PointF.class, "bottomRight", 1);
  
  public static final xj I = new xj(PointF.class, "bottomRight", 2);
  
  public static final xj J = new xj(PointF.class, "topLeft", 3);
  
  public static final xj K = new xj(PointF.class, XUaAMlaMSa.pZLb, 4);
  
  public static void M(tw1 paramtw1) {
    View view = paramtw1.b;
    HashMap<String, Rect> hashMap = paramtw1.a;
    if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
      hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
      hashMap.put("android:changeBounds:parent", view.getParent());
      return;
    } 
  }
  
  public final void d(tw1 paramtw1) {
    M(paramtw1);
  }
  
  public final void g(tw1 paramtw1) {
    M(paramtw1);
  }
  
  public final Animator k(ViewGroup paramViewGroup, tw1 paramtw11, tw1 paramtw12) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 701
    //   4: aload_2
    //   5: getfield a : Ljava/util/HashMap;
    //   8: astore #22
    //   10: aload_3
    //   11: ifnonnull -> 17
    //   14: goto -> 701
    //   17: aload_3
    //   18: getfield a : Ljava/util/HashMap;
    //   21: astore_1
    //   22: aload #22
    //   24: ldc 'android:changeBounds:parent'
    //   26: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast android/view/ViewGroup
    //   32: astore_2
    //   33: aload_1
    //   34: ldc 'android:changeBounds:parent'
    //   36: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   39: checkcast android/view/ViewGroup
    //   42: astore #23
    //   44: aload_2
    //   45: ifnull -> 701
    //   48: aload #23
    //   50: ifnonnull -> 56
    //   53: goto -> 701
    //   56: aload_3
    //   57: getfield b : Landroid/view/View;
    //   60: astore_2
    //   61: aload #22
    //   63: ldc 'android:changeBounds:bounds'
    //   65: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   68: checkcast android/graphics/Rect
    //   71: astore #23
    //   73: aload_1
    //   74: ldc 'android:changeBounds:bounds'
    //   76: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   79: checkcast android/graphics/Rect
    //   82: astore_3
    //   83: aload #23
    //   85: getfield left : I
    //   88: istore #11
    //   90: aload_3
    //   91: getfield left : I
    //   94: istore #15
    //   96: aload #23
    //   98: getfield top : I
    //   101: istore #18
    //   103: aload_3
    //   104: getfield top : I
    //   107: istore #19
    //   109: aload #23
    //   111: getfield right : I
    //   114: istore #10
    //   116: aload_3
    //   117: getfield right : I
    //   120: istore #21
    //   122: aload #23
    //   124: getfield bottom : I
    //   127: istore #20
    //   129: aload_3
    //   130: getfield bottom : I
    //   133: istore #13
    //   135: iload #10
    //   137: iload #11
    //   139: isub
    //   140: istore #16
    //   142: iload #20
    //   144: iload #18
    //   146: isub
    //   147: istore #12
    //   149: iload #21
    //   151: iload #15
    //   153: isub
    //   154: istore #17
    //   156: iload #13
    //   158: iload #19
    //   160: isub
    //   161: istore #14
    //   163: aload #22
    //   165: ldc 'android:changeBounds:clip'
    //   167: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   170: checkcast android/graphics/Rect
    //   173: astore_3
    //   174: aload_1
    //   175: ldc 'android:changeBounds:clip'
    //   177: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   180: checkcast android/graphics/Rect
    //   183: astore_1
    //   184: iload #16
    //   186: ifeq -> 194
    //   189: iload #12
    //   191: ifne -> 204
    //   194: iload #17
    //   196: ifeq -> 257
    //   199: iload #14
    //   201: ifeq -> 257
    //   204: iload #11
    //   206: iload #15
    //   208: if_icmpne -> 227
    //   211: iload #18
    //   213: iload #19
    //   215: if_icmpeq -> 221
    //   218: goto -> 227
    //   221: iconst_0
    //   222: istore #9
    //   224: goto -> 230
    //   227: iconst_1
    //   228: istore #9
    //   230: iload #10
    //   232: iload #21
    //   234: if_icmpne -> 248
    //   237: iload #9
    //   239: istore #8
    //   241: iload #20
    //   243: iload #13
    //   245: if_icmpeq -> 260
    //   248: iload #9
    //   250: iconst_1
    //   251: iadd
    //   252: istore #8
    //   254: goto -> 260
    //   257: iconst_0
    //   258: istore #8
    //   260: aload_3
    //   261: ifnull -> 272
    //   264: aload_3
    //   265: aload_1
    //   266: invokevirtual equals : (Ljava/lang/Object;)Z
    //   269: ifeq -> 288
    //   272: iload #8
    //   274: istore #9
    //   276: aload_3
    //   277: ifnonnull -> 294
    //   280: iload #8
    //   282: istore #9
    //   284: aload_1
    //   285: ifnull -> 294
    //   288: iload #8
    //   290: iconst_1
    //   291: iadd
    //   292: istore #9
    //   294: iload #9
    //   296: ifle -> 701
    //   299: aload_2
    //   300: iload #11
    //   302: iload #18
    //   304: iload #10
    //   306: iload #20
    //   308: invokestatic a : (Landroid/view/View;IIII)V
    //   311: iload #9
    //   313: iconst_2
    //   314: if_icmpne -> 539
    //   317: iload #16
    //   319: iload #17
    //   321: if_icmpne -> 385
    //   324: iload #12
    //   326: iload #14
    //   328: if_icmpne -> 385
    //   331: aload_0
    //   332: getfield y : Lfb0;
    //   335: astore_1
    //   336: iload #11
    //   338: i2f
    //   339: fstore #6
    //   341: iload #18
    //   343: i2f
    //   344: fstore #7
    //   346: iload #15
    //   348: i2f
    //   349: fstore #4
    //   351: iload #19
    //   353: i2f
    //   354: fstore #5
    //   356: aload_1
    //   357: invokevirtual getClass : ()Ljava/lang/Class;
    //   360: pop
    //   361: fload #6
    //   363: fload #7
    //   365: fload #4
    //   367: fload #5
    //   369: invokestatic j : (FFFF)Landroid/graphics/Path;
    //   372: astore_1
    //   373: aload_2
    //   374: getstatic bk.K : Lxj;
    //   377: aload_1
    //   378: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   381: astore_1
    //   382: goto -> 661
    //   385: new ak
    //   388: dup
    //   389: aload_2
    //   390: invokespecial <init> : (Landroid/view/View;)V
    //   393: astore_3
    //   394: aload_0
    //   395: getfield y : Lfb0;
    //   398: astore_1
    //   399: iload #11
    //   401: i2f
    //   402: fstore #6
    //   404: iload #18
    //   406: i2f
    //   407: fstore #4
    //   409: iload #15
    //   411: i2f
    //   412: fstore #7
    //   414: iload #19
    //   416: i2f
    //   417: fstore #5
    //   419: aload_1
    //   420: invokevirtual getClass : ()Ljava/lang/Class;
    //   423: pop
    //   424: fload #6
    //   426: fload #4
    //   428: fload #7
    //   430: fload #5
    //   432: invokestatic j : (FFFF)Landroid/graphics/Path;
    //   435: astore_1
    //   436: aload_3
    //   437: getstatic bk.G : Lxj;
    //   440: aload_1
    //   441: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   444: astore #22
    //   446: aload_0
    //   447: getfield y : Lfb0;
    //   450: astore_1
    //   451: iload #10
    //   453: i2f
    //   454: fstore #6
    //   456: iload #20
    //   458: i2f
    //   459: fstore #7
    //   461: iload #21
    //   463: i2f
    //   464: fstore #5
    //   466: iload #13
    //   468: i2f
    //   469: fstore #4
    //   471: aload_1
    //   472: invokevirtual getClass : ()Ljava/lang/Class;
    //   475: pop
    //   476: fload #6
    //   478: fload #7
    //   480: fload #5
    //   482: fload #4
    //   484: invokestatic j : (FFFF)Landroid/graphics/Path;
    //   487: astore_1
    //   488: aload_3
    //   489: getstatic bk.H : Lxj;
    //   492: aload_1
    //   493: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   496: astore #23
    //   498: new android/animation/AnimatorSet
    //   501: dup
    //   502: invokespecial <init> : ()V
    //   505: astore_1
    //   506: aload_1
    //   507: iconst_2
    //   508: anewarray android/animation/Animator
    //   511: dup
    //   512: iconst_0
    //   513: aload #22
    //   515: aastore
    //   516: dup
    //   517: iconst_1
    //   518: aload #23
    //   520: aastore
    //   521: invokevirtual playTogether : ([Landroid/animation/Animator;)V
    //   524: aload_1
    //   525: new yj
    //   528: dup
    //   529: aload_3
    //   530: invokespecial <init> : (Lak;)V
    //   533: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   536: goto -> 661
    //   539: iload #11
    //   541: iload #15
    //   543: if_icmpne -> 610
    //   546: iload #18
    //   548: iload #19
    //   550: if_icmpeq -> 556
    //   553: goto -> 610
    //   556: aload_0
    //   557: getfield y : Lfb0;
    //   560: astore_1
    //   561: iload #10
    //   563: i2f
    //   564: fstore #6
    //   566: iload #20
    //   568: i2f
    //   569: fstore #4
    //   571: iload #21
    //   573: i2f
    //   574: fstore #5
    //   576: iload #13
    //   578: i2f
    //   579: fstore #7
    //   581: aload_1
    //   582: invokevirtual getClass : ()Ljava/lang/Class;
    //   585: pop
    //   586: fload #6
    //   588: fload #4
    //   590: fload #5
    //   592: fload #7
    //   594: invokestatic j : (FFFF)Landroid/graphics/Path;
    //   597: astore_1
    //   598: aload_2
    //   599: getstatic bk.I : Lxj;
    //   602: aload_1
    //   603: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   606: astore_1
    //   607: goto -> 661
    //   610: aload_0
    //   611: getfield y : Lfb0;
    //   614: astore_1
    //   615: iload #11
    //   617: i2f
    //   618: fstore #5
    //   620: iload #18
    //   622: i2f
    //   623: fstore #6
    //   625: iload #15
    //   627: i2f
    //   628: fstore #7
    //   630: iload #19
    //   632: i2f
    //   633: fstore #4
    //   635: aload_1
    //   636: invokevirtual getClass : ()Ljava/lang/Class;
    //   639: pop
    //   640: fload #5
    //   642: fload #6
    //   644: fload #7
    //   646: fload #4
    //   648: invokestatic j : (FFFF)Landroid/graphics/Path;
    //   651: astore_1
    //   652: aload_2
    //   653: getstatic bk.J : Lxj;
    //   656: aload_1
    //   657: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   660: astore_1
    //   661: aload_2
    //   662: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   665: instanceof android/view/ViewGroup
    //   668: ifeq -> 699
    //   671: aload_2
    //   672: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   675: checkcast android/view/ViewGroup
    //   678: astore_2
    //   679: aload_2
    //   680: iconst_1
    //   681: invokestatic m0 : (Landroid/view/ViewGroup;Z)V
    //   684: aload_0
    //   685: invokevirtual p : ()Lkw1;
    //   688: new zj
    //   691: dup
    //   692: aload_2
    //   693: invokespecial <init> : (Landroid/view/ViewGroup;)V
    //   696: invokevirtual a : (Ljw1;)V
    //   699: aload_1
    //   700: areturn
    //   701: aconst_null
    //   702: areturn
  }
  
  public final String[] r() {
    return F;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */