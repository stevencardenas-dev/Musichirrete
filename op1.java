import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;

public final class op1 {
  public int a;
  
  public bh0 b;
  
  public int[][] c;
  
  public bh0[] d;
  
  public final void a(Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface getDepth : ()I
    //   6: iconst_1
    //   7: iadd
    //   8: istore #9
    //   10: aload_2
    //   11: invokeinterface next : ()I
    //   16: istore #5
    //   18: iload #5
    //   20: iconst_1
    //   21: if_icmpeq -> 466
    //   24: aload_2
    //   25: invokeinterface getDepth : ()I
    //   30: istore #6
    //   32: iload #6
    //   34: iload #9
    //   36: if_icmpge -> 45
    //   39: iload #5
    //   41: iconst_3
    //   42: if_icmpeq -> 466
    //   45: iload #5
    //   47: iconst_2
    //   48: if_icmpne -> 10
    //   51: iload #6
    //   53: iload #9
    //   55: if_icmpgt -> 10
    //   58: aload_2
    //   59: invokeinterface getName : ()Ljava/lang/String;
    //   64: ldc 'item'
    //   66: invokevirtual equals : (Ljava/lang/Object;)Z
    //   69: ifne -> 75
    //   72: goto -> 10
    //   75: aload_1
    //   76: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   79: astore #11
    //   81: getstatic zb1.F : [I
    //   84: astore #12
    //   86: aload #4
    //   88: ifnonnull -> 104
    //   91: aload #11
    //   93: aload_3
    //   94: aload #12
    //   96: invokevirtual obtainAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   99: astore #12
    //   101: goto -> 116
    //   104: aload #4
    //   106: aload_3
    //   107: aload #12
    //   109: iconst_0
    //   110: iconst_0
    //   111: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   114: astore #12
    //   116: aload #12
    //   118: iconst_0
    //   119: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   122: astore #11
    //   124: aload #11
    //   126: ifnonnull -> 132
    //   129: goto -> 202
    //   132: aload #11
    //   134: getfield type : I
    //   137: istore #5
    //   139: iload #5
    //   141: iconst_5
    //   142: if_icmpne -> 175
    //   145: new np1
    //   148: dup
    //   149: iconst_2
    //   150: aload #11
    //   152: getfield data : I
    //   155: aload #12
    //   157: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   160: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   163: invokestatic complexToDimensionPixelSize : (ILandroid/util/DisplayMetrics;)I
    //   166: i2f
    //   167: invokespecial <init> : (IF)V
    //   170: astore #11
    //   172: goto -> 205
    //   175: iload #5
    //   177: bipush #6
    //   179: if_icmpne -> 202
    //   182: new np1
    //   185: dup
    //   186: iconst_1
    //   187: aload #11
    //   189: fconst_1
    //   190: fconst_1
    //   191: invokevirtual getFraction : (FF)F
    //   194: invokespecial <init> : (IF)V
    //   197: astore #11
    //   199: goto -> 205
    //   202: aconst_null
    //   203: astore #11
    //   205: aload #12
    //   207: invokevirtual recycle : ()V
    //   210: aload_3
    //   211: invokeinterface getAttributeCount : ()I
    //   216: istore #10
    //   218: iload #10
    //   220: newarray int
    //   222: astore #12
    //   224: iconst_0
    //   225: istore #6
    //   227: iconst_0
    //   228: istore #5
    //   230: iload #6
    //   232: iload #10
    //   234: if_icmpge -> 305
    //   237: aload_3
    //   238: iload #6
    //   240: invokeinterface getAttributeNameResource : (I)I
    //   245: istore #8
    //   247: iload #5
    //   249: istore #7
    //   251: iload #8
    //   253: ldc 2130970292
    //   255: if_icmpeq -> 295
    //   258: aload_3
    //   259: iload #6
    //   261: iconst_0
    //   262: invokeinterface getAttributeBooleanValue : (IZ)Z
    //   267: ifeq -> 277
    //   270: iload #8
    //   272: istore #7
    //   274: goto -> 282
    //   277: iload #8
    //   279: ineg
    //   280: istore #7
    //   282: aload #12
    //   284: iload #5
    //   286: iload #7
    //   288: iastore
    //   289: iload #5
    //   291: iconst_1
    //   292: iadd
    //   293: istore #7
    //   295: iinc #6, 1
    //   298: iload #7
    //   300: istore #5
    //   302: goto -> 230
    //   305: aload #12
    //   307: iload #5
    //   309: invokestatic trimStateSet : ([II)[I
    //   312: astore #13
    //   314: new bh0
    //   317: dup
    //   318: bipush #25
    //   320: iconst_0
    //   321: invokespecial <init> : (IB)V
    //   324: astore #12
    //   326: aload #12
    //   328: aload #11
    //   330: putfield c : Ljava/lang/Object;
    //   333: aload_0
    //   334: getfield a : I
    //   337: istore #5
    //   339: iload #5
    //   341: ifeq -> 350
    //   344: aload #13
    //   346: arraylength
    //   347: ifne -> 356
    //   350: aload_0
    //   351: aload #12
    //   353: putfield b : Lbh0;
    //   356: aload_0
    //   357: getfield c : [[I
    //   360: astore #14
    //   362: iload #5
    //   364: aload #14
    //   366: arraylength
    //   367: if_icmplt -> 427
    //   370: iload #5
    //   372: bipush #10
    //   374: iadd
    //   375: istore #6
    //   377: iload #6
    //   379: anewarray [I
    //   382: astore #11
    //   384: aload #14
    //   386: iconst_0
    //   387: aload #11
    //   389: iconst_0
    //   390: iload #5
    //   392: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   395: aload_0
    //   396: aload #11
    //   398: putfield c : [[I
    //   401: iload #6
    //   403: anewarray bh0
    //   406: astore #11
    //   408: aload_0
    //   409: getfield d : [Lbh0;
    //   412: iconst_0
    //   413: aload #11
    //   415: iconst_0
    //   416: iload #5
    //   418: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   421: aload_0
    //   422: aload #11
    //   424: putfield d : [Lbh0;
    //   427: aload_0
    //   428: getfield c : [[I
    //   431: astore #11
    //   433: aload_0
    //   434: getfield a : I
    //   437: istore #5
    //   439: aload #11
    //   441: iload #5
    //   443: aload #13
    //   445: aastore
    //   446: aload_0
    //   447: getfield d : [Lbh0;
    //   450: iload #5
    //   452: aload #12
    //   454: aastore
    //   455: aload_0
    //   456: iload #5
    //   458: iconst_1
    //   459: iadd
    //   460: putfield a : I
    //   463: goto -> 10
    //   466: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\op1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */