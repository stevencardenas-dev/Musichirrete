import android.content.Context;

public final class dx extends hd {
  public final boolean b;
  
  public boolean c;
  
  public g7 d;
  
  public dx(go1 paramgo1, boolean paramBoolean) {
    super(paramgo1);
    this.b = paramBoolean;
  }
  
  public final g7 l(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Z
    //   4: ifeq -> 12
    //   7: aload_0
    //   8: getfield d : Lg7;
    //   11: areturn
    //   12: aload_0
    //   13: getfield a : Ljava/lang/Object;
    //   16: checkcast go1
    //   19: astore #8
    //   21: aload #8
    //   23: getfield c : Lua0;
    //   26: astore #7
    //   28: aload #8
    //   30: getfield a : I
    //   33: iconst_2
    //   34: if_icmpne -> 42
    //   37: iconst_1
    //   38: istore_3
    //   39: goto -> 44
    //   42: iconst_0
    //   43: istore_3
    //   44: aload #7
    //   46: getfield N : Lsa0;
    //   49: astore #8
    //   51: aload #8
    //   53: ifnonnull -> 62
    //   56: iconst_0
    //   57: istore #4
    //   59: goto -> 69
    //   62: aload #8
    //   64: getfield f : I
    //   67: istore #4
    //   69: aload_0
    //   70: getfield b : Z
    //   73: ifeq -> 116
    //   76: iload_3
    //   77: ifeq -> 99
    //   80: aload #8
    //   82: ifnonnull -> 90
    //   85: iconst_0
    //   86: istore_2
    //   87: goto -> 151
    //   90: aload #8
    //   92: getfield d : I
    //   95: istore_2
    //   96: goto -> 151
    //   99: aload #8
    //   101: ifnonnull -> 107
    //   104: goto -> 85
    //   107: aload #8
    //   109: getfield e : I
    //   112: istore_2
    //   113: goto -> 151
    //   116: iload_3
    //   117: ifeq -> 137
    //   120: aload #8
    //   122: ifnonnull -> 128
    //   125: goto -> 85
    //   128: aload #8
    //   130: getfield b : I
    //   133: istore_2
    //   134: goto -> 151
    //   137: aload #8
    //   139: ifnonnull -> 145
    //   142: goto -> 85
    //   145: aload #8
    //   147: getfield c : I
    //   150: istore_2
    //   151: aload #7
    //   153: iconst_0
    //   154: iconst_0
    //   155: iconst_0
    //   156: iconst_0
    //   157: invokevirtual w0 : (IIII)V
    //   160: aload #7
    //   162: getfield J : Landroid/view/ViewGroup;
    //   165: astore #9
    //   167: aconst_null
    //   168: astore #8
    //   170: aload #9
    //   172: ifnull -> 196
    //   175: aload #9
    //   177: ldc 2131297960
    //   179: invokevirtual getTag : (I)Ljava/lang/Object;
    //   182: ifnull -> 196
    //   185: aload #7
    //   187: getfield J : Landroid/view/ViewGroup;
    //   190: ldc 2131297960
    //   192: aconst_null
    //   193: invokevirtual setTag : (ILjava/lang/Object;)V
    //   196: aload #7
    //   198: getfield J : Landroid/view/ViewGroup;
    //   201: astore #7
    //   203: aload #7
    //   205: ifnull -> 223
    //   208: aload #7
    //   210: invokevirtual getLayoutTransition : ()Landroid/animation/LayoutTransition;
    //   213: ifnull -> 223
    //   216: aload #8
    //   218: astore #7
    //   220: goto -> 529
    //   223: iload_2
    //   224: istore #5
    //   226: iload_2
    //   227: ifne -> 382
    //   230: iload_2
    //   231: istore #5
    //   233: iload #4
    //   235: ifeq -> 382
    //   238: iload #4
    //   240: sipush #4097
    //   243: if_icmpeq -> 366
    //   246: iload #4
    //   248: sipush #8194
    //   251: if_icmpeq -> 350
    //   254: iload #4
    //   256: sipush #8197
    //   259: if_icmpeq -> 326
    //   262: iload #4
    //   264: sipush #4099
    //   267: if_icmpeq -> 310
    //   270: iload #4
    //   272: sipush #4100
    //   275: if_icmpeq -> 286
    //   278: iconst_m1
    //   279: istore_2
    //   280: iload_2
    //   281: istore #5
    //   283: goto -> 382
    //   286: iload_3
    //   287: ifeq -> 300
    //   290: aload_1
    //   291: ldc 16842936
    //   293: invokestatic s0 : (Landroid/content/Context;I)I
    //   296: istore_2
    //   297: goto -> 280
    //   300: aload_1
    //   301: ldc 16842937
    //   303: invokestatic s0 : (Landroid/content/Context;I)I
    //   306: istore_2
    //   307: goto -> 280
    //   310: iload_3
    //   311: ifeq -> 320
    //   314: ldc 2130837511
    //   316: istore_2
    //   317: goto -> 280
    //   320: ldc 2130837512
    //   322: istore_2
    //   323: goto -> 280
    //   326: iload_3
    //   327: ifeq -> 340
    //   330: aload_1
    //   331: ldc 16842938
    //   333: invokestatic s0 : (Landroid/content/Context;I)I
    //   336: istore_2
    //   337: goto -> 280
    //   340: aload_1
    //   341: ldc 16842939
    //   343: invokestatic s0 : (Landroid/content/Context;I)I
    //   346: istore_2
    //   347: goto -> 280
    //   350: iload_3
    //   351: ifeq -> 360
    //   354: ldc 2130837509
    //   356: istore_2
    //   357: goto -> 280
    //   360: ldc 2130837510
    //   362: istore_2
    //   363: goto -> 280
    //   366: iload_3
    //   367: ifeq -> 376
    //   370: ldc 2130837513
    //   372: istore_2
    //   373: goto -> 280
    //   376: ldc 2130837514
    //   378: istore_2
    //   379: goto -> 280
    //   382: aload #8
    //   384: astore #7
    //   386: iload #5
    //   388: ifeq -> 529
    //   391: ldc 'anim'
    //   393: aload_1
    //   394: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   397: iload #5
    //   399: invokevirtual getResourceTypeName : (I)Ljava/lang/String;
    //   402: invokevirtual equals : (Ljava/lang/Object;)Z
    //   405: istore #6
    //   407: iload #6
    //   409: ifeq -> 455
    //   412: aload_1
    //   413: iload #5
    //   415: invokestatic loadAnimation : (Landroid/content/Context;I)Landroid/view/animation/Animation;
    //   418: astore #9
    //   420: aload #8
    //   422: astore #7
    //   424: aload #9
    //   426: ifnull -> 529
    //   429: new g7
    //   432: astore #7
    //   434: aload #7
    //   436: bipush #20
    //   438: aload #9
    //   440: invokespecial <init> : (ILjava/lang/Object;)V
    //   443: aload #7
    //   445: astore_1
    //   446: aload_1
    //   447: astore #7
    //   449: goto -> 529
    //   452: astore_1
    //   453: aload_1
    //   454: athrow
    //   455: aload_1
    //   456: iload #5
    //   458: invokestatic loadAnimator : (Landroid/content/Context;I)Landroid/animation/Animator;
    //   461: astore #9
    //   463: aload #8
    //   465: astore #7
    //   467: aload #9
    //   469: ifnull -> 529
    //   472: new g7
    //   475: dup
    //   476: aload #9
    //   478: invokespecial <init> : (Landroid/animation/Animator;)V
    //   481: astore #7
    //   483: aload #7
    //   485: astore_1
    //   486: goto -> 446
    //   489: astore #7
    //   491: iload #6
    //   493: ifne -> 526
    //   496: aload_1
    //   497: iload #5
    //   499: invokestatic loadAnimation : (Landroid/content/Context;I)Landroid/view/animation/Animation;
    //   502: astore_1
    //   503: aload #8
    //   505: astore #7
    //   507: aload_1
    //   508: ifnull -> 529
    //   511: new g7
    //   514: dup
    //   515: bipush #20
    //   517: aload_1
    //   518: invokespecial <init> : (ILjava/lang/Object;)V
    //   521: astore #7
    //   523: goto -> 529
    //   526: aload #7
    //   528: athrow
    //   529: aload_0
    //   530: aload #7
    //   532: putfield d : Lg7;
    //   535: aload_0
    //   536: iconst_1
    //   537: putfield c : Z
    //   540: aload #7
    //   542: areturn
    //   543: astore #7
    //   545: goto -> 455
    // Exception table:
    //   from	to	target	type
    //   412	420	452	android/content/res/Resources$NotFoundException
    //   412	420	543	java/lang/RuntimeException
    //   429	443	452	android/content/res/Resources$NotFoundException
    //   429	443	543	java/lang/RuntimeException
    //   455	463	489	java/lang/RuntimeException
    //   472	483	489	java/lang/RuntimeException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */