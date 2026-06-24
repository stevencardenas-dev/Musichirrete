import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import in.krosbits.android.widgets.SmartTextView;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public final class nb1 extends he1 implements View.OnTouchListener, View.OnClickListener, View.OnLongClickListener {
  public static final int I = (int)(MyApplication.p * 8.0F);
  
  public final SmartTextView A;
  
  public final SmartTextView B;
  
  public final SmartTextView C;
  
  public final ImageView D;
  
  public final ImageView E;
  
  public final mb1 F;
  
  public long G;
  
  public final xt0 H;
  
  public int w;
  
  public int x;
  
  public km0 y;
  
  public final SmartTextView z;
  
  public nb1(View paramView, mb1 parammb1, int paramInt) {
    // Byte code:
    //   0: getstatic m92.h : [I
    //   3: astore #8
    //   5: aload_0
    //   6: aload_1
    //   7: invokespecial <init> : (Landroid/view/View;)V
    //   10: aload_0
    //   11: new xt0
    //   14: dup
    //   15: bipush #9
    //   17: aload_0
    //   18: invokespecial <init> : (ILjava/lang/Object;)V
    //   21: putfield H : Lxt0;
    //   24: iload_3
    //   25: bipush #10
    //   27: if_icmpne -> 112
    //   30: aload_1
    //   31: ldc 2131297688
    //   33: invokevirtual findViewById : (I)Landroid/view/View;
    //   36: checkcast in/krosbits/android/widgets/SmartTextView
    //   39: astore #8
    //   41: aload_0
    //   42: aload #8
    //   44: putfield z : Lin/krosbits/android/widgets/SmartTextView;
    //   47: aload_1
    //   48: ldc 2131297750
    //   50: invokevirtual findViewById : (I)Landroid/view/View;
    //   53: checkcast in/krosbits/android/widgets/SmartTextView
    //   56: astore_2
    //   57: aload_0
    //   58: aload_2
    //   59: putfield B : Lin/krosbits/android/widgets/SmartTextView;
    //   62: aload_2
    //   63: iconst_0
    //   64: invokevirtual setVisibility : (I)V
    //   67: aload #8
    //   69: getstatic android/graphics/Typeface.DEFAULT_BOLD : Landroid/graphics/Typeface;
    //   72: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   75: aload_1
    //   76: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   79: ldc 112.0
    //   81: fmul
    //   82: f2i
    //   83: aload_1
    //   84: invokevirtual getPaddingTop : ()I
    //   87: aload_1
    //   88: invokevirtual getPaddingRight : ()I
    //   91: aload_1
    //   92: invokevirtual getPaddingBottom : ()I
    //   95: invokevirtual setPadding : (IIII)V
    //   98: aload_1
    //   99: aload_1
    //   100: invokevirtual getContext : ()Landroid/content/Context;
    //   103: ldc 2130969903
    //   105: invokestatic z : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   108: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   111: return
    //   112: aload_1
    //   113: ldc 2131297890
    //   115: invokevirtual findViewById : (I)Landroid/view/View;
    //   118: checkcast in/krosbits/android/widgets/SmartTextView
    //   121: astore #12
    //   123: aload_0
    //   124: aload #12
    //   126: putfield z : Lin/krosbits/android/widgets/SmartTextView;
    //   129: aload_1
    //   130: ldc 2131297685
    //   132: invokevirtual findViewById : (I)Landroid/view/View;
    //   135: checkcast in/krosbits/android/widgets/SmartTextView
    //   138: astore #10
    //   140: aload_0
    //   141: aload #10
    //   143: putfield A : Lin/krosbits/android/widgets/SmartTextView;
    //   146: aload_1
    //   147: ldc 2131297692
    //   149: invokevirtual findViewById : (I)Landroid/view/View;
    //   152: checkcast in/krosbits/android/widgets/SmartTextView
    //   155: astore #11
    //   157: aload_0
    //   158: aload #11
    //   160: putfield B : Lin/krosbits/android/widgets/SmartTextView;
    //   163: aload_1
    //   164: ldc 2131296876
    //   166: invokevirtual findViewById : (I)Landroid/view/View;
    //   169: checkcast in/krosbits/android/widgets/SmartImageView
    //   172: astore #13
    //   174: aload_1
    //   175: ldc 2131297740
    //   177: invokevirtual findViewById : (I)Landroid/view/View;
    //   180: checkcast in/krosbits/android/widgets/SmartTextView
    //   183: astore #14
    //   185: aload_0
    //   186: aload #14
    //   188: putfield C : Lin/krosbits/android/widgets/SmartTextView;
    //   191: aload_1
    //   192: ldc 2131296913
    //   194: invokevirtual findViewById : (I)Landroid/view/View;
    //   197: checkcast android/widget/ImageView
    //   200: astore #9
    //   202: aload_0
    //   203: aload #9
    //   205: putfield D : Landroid/widget/ImageView;
    //   208: aload_0
    //   209: aload_1
    //   210: ldc 2131296842
    //   212: invokevirtual findViewById : (I)Landroid/view/View;
    //   215: checkcast android/widget/ImageView
    //   218: putfield E : Landroid/widget/ImageView;
    //   221: aload_0
    //   222: aload_2
    //   223: putfield F : Lmb1;
    //   226: aload_1
    //   227: aload_0
    //   228: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   231: aload_1
    //   232: aload_0
    //   233: invokevirtual setOnLongClickListener : (Landroid/view/View$OnLongClickListener;)V
    //   236: aload #13
    //   238: aload_0
    //   239: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   242: aload_1
    //   243: ldc 2131296852
    //   245: invokevirtual findViewById : (I)Landroid/view/View;
    //   248: checkcast in/krosbits/android/widgets/SmartImageView
    //   251: astore #15
    //   253: aload #15
    //   255: aload_0
    //   256: invokevirtual setOnTouchListener : (Landroid/view/View$OnTouchListener;)V
    //   259: aload #9
    //   261: aload_0
    //   262: invokevirtual setOnTouchListener : (Landroid/view/View$OnTouchListener;)V
    //   265: iload_3
    //   266: bipush #16
    //   268: iand
    //   269: iconst_1
    //   270: if_icmple -> 279
    //   273: iconst_1
    //   274: istore #6
    //   276: goto -> 282
    //   279: iconst_0
    //   280: istore #6
    //   282: iload_3
    //   283: istore #5
    //   285: iload #6
    //   287: ifeq -> 296
    //   290: iload_3
    //   291: bipush #16
    //   293: ixor
    //   294: istore #5
    //   296: iload #6
    //   298: ifne -> 332
    //   301: aload #9
    //   303: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   306: astore_2
    //   307: aload_2
    //   308: iconst_0
    //   309: putfield width : I
    //   312: aload #9
    //   314: iconst_4
    //   315: invokevirtual setVisibility : (I)V
    //   318: aload_2
    //   319: checkcast android/widget/RelativeLayout$LayoutParams
    //   322: iconst_0
    //   323: putfield rightMargin : I
    //   326: aload #9
    //   328: aload_2
    //   329: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
    //   332: iload #5
    //   334: iconst_2
    //   335: irem
    //   336: istore_3
    //   337: iload #5
    //   339: iload_3
    //   340: isub
    //   341: istore #5
    //   343: iload #5
    //   345: ifeq -> 652
    //   348: iload #5
    //   350: iconst_2
    //   351: if_icmpeq -> 505
    //   354: iload #5
    //   356: bipush #6
    //   358: if_icmpeq -> 408
    //   361: aload_1
    //   362: invokevirtual getContext : ()Landroid/content/Context;
    //   365: astore_2
    //   366: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   369: fstore #4
    //   371: aload_1
    //   372: aload_2
    //   373: fload #4
    //   375: f2d
    //   376: ldc2_w 1.5
    //   379: dmul
    //   380: d2i
    //   381: fload #4
    //   383: ldc 8.0
    //   385: fmul
    //   386: iconst_0
    //   387: aload #8
    //   389: iconst_3
    //   390: iaload
    //   391: ldc 16777215
    //   393: iand
    //   394: ldc 1073741824
    //   396: ior
    //   397: iconst_0
    //   398: iconst_0
    //   399: invokestatic T : (Landroid/content/Context;IFIIII)Landroid/graphics/drawable/StateListDrawable;
    //   402: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   405: goto -> 764
    //   408: aload #15
    //   410: bipush #7
    //   412: invokevirtual setColorTintIndex : (I)V
    //   415: aload #13
    //   417: bipush #7
    //   419: invokevirtual setColorTintIndex : (I)V
    //   422: aload #12
    //   424: bipush #6
    //   426: invokevirtual setTextTintIndex : (I)V
    //   429: aload #10
    //   431: bipush #6
    //   433: invokevirtual setTextTintIndex : (I)V
    //   436: aload #11
    //   438: bipush #6
    //   440: invokevirtual setTextTintIndex : (I)V
    //   443: aload #14
    //   445: bipush #6
    //   447: invokevirtual setTextTintIndex : (I)V
    //   450: aload_1
    //   451: invokevirtual getContext : ()Landroid/content/Context;
    //   454: astore_2
    //   455: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   458: fstore #4
    //   460: aload_1
    //   461: aload_2
    //   462: fload #4
    //   464: f2d
    //   465: ldc2_w 1.5
    //   468: dmul
    //   469: d2i
    //   470: fload #4
    //   472: ldc 8.0
    //   474: fmul
    //   475: iconst_0
    //   476: aload #8
    //   478: bipush #7
    //   480: iaload
    //   481: ldc 16777215
    //   483: iand
    //   484: ldc 1073741824
    //   486: ior
    //   487: iconst_0
    //   488: iconst_0
    //   489: invokestatic T : (Landroid/content/Context;IFIIII)Landroid/graphics/drawable/StateListDrawable;
    //   492: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   495: aload #9
    //   497: ldc 0.5
    //   499: invokevirtual setAlpha : (F)V
    //   502: goto -> 405
    //   505: aload #15
    //   507: bipush #7
    //   509: invokevirtual setColorTintIndex : (I)V
    //   512: aload #13
    //   514: bipush #7
    //   516: invokevirtual setColorTintIndex : (I)V
    //   519: aload #12
    //   521: bipush #6
    //   523: invokevirtual setTextTintIndex : (I)V
    //   526: aload #10
    //   528: bipush #6
    //   530: invokevirtual setTextTintIndex : (I)V
    //   533: aload #11
    //   535: bipush #6
    //   537: invokevirtual setTextTintIndex : (I)V
    //   540: aload #14
    //   542: bipush #6
    //   544: invokevirtual setTextTintIndex : (I)V
    //   547: aload #12
    //   549: aload #12
    //   551: invokevirtual getTypeface : ()Landroid/graphics/Typeface;
    //   554: iconst_3
    //   555: invokevirtual setTypeface : (Landroid/graphics/Typeface;I)V
    //   558: aload #11
    //   560: aload #11
    //   562: invokevirtual getTypeface : ()Landroid/graphics/Typeface;
    //   565: iconst_2
    //   566: invokevirtual setTypeface : (Landroid/graphics/Typeface;I)V
    //   569: aload #10
    //   571: aload #10
    //   573: invokevirtual getTypeface : ()Landroid/graphics/Typeface;
    //   576: iconst_2
    //   577: invokevirtual setTypeface : (Landroid/graphics/Typeface;I)V
    //   580: aload #9
    //   582: ldc 0.5
    //   584: invokevirtual setAlpha : (F)V
    //   587: aload_1
    //   588: invokevirtual getContext : ()Landroid/content/Context;
    //   591: astore_2
    //   592: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   595: fstore #4
    //   597: fload #4
    //   599: f2d
    //   600: ldc2_w 1.5
    //   603: dmul
    //   604: d2i
    //   605: istore #6
    //   607: aload #8
    //   609: bipush #7
    //   611: iaload
    //   612: istore #5
    //   614: iload #5
    //   616: ldc 16777215
    //   618: iand
    //   619: istore #7
    //   621: aload_1
    //   622: aload_2
    //   623: iload #6
    //   625: fload #4
    //   627: ldc 8.0
    //   629: fmul
    //   630: iload #5
    //   632: iload #7
    //   634: ldc 1073741824
    //   636: ior
    //   637: iconst_0
    //   638: iload #7
    //   640: ldc 1996488704
    //   642: ior
    //   643: invokestatic T : (Landroid/content/Context;IFIIII)Landroid/graphics/drawable/StateListDrawable;
    //   646: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   649: goto -> 405
    //   652: aload #15
    //   654: iconst_4
    //   655: invokevirtual setColorTintIndex : (I)V
    //   658: aload #13
    //   660: iconst_4
    //   661: invokevirtual setColorTintIndex : (I)V
    //   664: aload #12
    //   666: iconst_4
    //   667: invokevirtual setTextTintIndex : (I)V
    //   670: aload #10
    //   672: iconst_4
    //   673: invokevirtual setTextTintIndex : (I)V
    //   676: aload #11
    //   678: iconst_4
    //   679: invokevirtual setTextTintIndex : (I)V
    //   682: aload #14
    //   684: iconst_4
    //   685: invokevirtual setTextTintIndex : (I)V
    //   688: aload #12
    //   690: aload #12
    //   692: invokevirtual getTypeface : ()Landroid/graphics/Typeface;
    //   695: iconst_1
    //   696: invokevirtual setTypeface : (Landroid/graphics/Typeface;I)V
    //   699: aload_1
    //   700: invokevirtual getContext : ()Landroid/content/Context;
    //   703: astore_2
    //   704: getstatic in/krosbits/musicolet/MyApplication.p : F
    //   707: fstore #4
    //   709: fload #4
    //   711: f2d
    //   712: ldc2_w 1.5
    //   715: dmul
    //   716: d2i
    //   717: istore #6
    //   719: aload #8
    //   721: iconst_3
    //   722: iaload
    //   723: istore #5
    //   725: aload_1
    //   726: aload_2
    //   727: iload #6
    //   729: fload #4
    //   731: ldc 8.0
    //   733: fmul
    //   734: iload #5
    //   736: iload #5
    //   738: ldc 16777215
    //   740: iand
    //   741: ldc 1073741824
    //   743: ior
    //   744: iconst_0
    //   745: aload #8
    //   747: iconst_4
    //   748: iaload
    //   749: ldc 16777215
    //   751: iand
    //   752: ldc 1996488704
    //   754: ior
    //   755: invokestatic T : (Landroid/content/Context;IFIIII)Landroid/graphics/drawable/StateListDrawable;
    //   758: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   761: goto -> 405
    //   764: iload_3
    //   765: iconst_1
    //   766: if_icmpne -> 774
    //   769: aload_1
    //   770: iconst_1
    //   771: invokevirtual setActivated : (Z)V
    //   774: return
  }
  
  public final void onClick(View paramView) {
    int i = c();
    if (i >= 0) {
      int j = paramView.getId();
      mb1 mb11 = this.F;
      if (j == 2131296876) {
        mb11.getClass();
      } else {
        mb11.getClass();
        if (my0.d()) {
          mb11.h = true;
          try {
            my0.j(mb11.d.h(i, MusicService.C0));
          } finally {
            mb11 = null;
          } 
        } else {
          lb1 lb1 = mb11.g;
          lb1.e0.j0.x0(lb1.c0, i);
        } 
      } 
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    int i = paramView.getId();
    mb1 mb11 = this.F;
    if (i == 2131296852) {
      mb11.getClass();
    } else {
      i = c();
      if (i >= 0) {
        mb11.getClass();
        if (my0.d())
          mb11.h = true; 
        try {
          my0.j(mb11.d.h(i, MusicService.C0));
        } finally {
          mb11 = null;
        } 
      } 
    } 
    return true;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore #5
    //   6: aload_2
    //   7: invokevirtual getX : ()F
    //   10: f2i
    //   11: istore_3
    //   12: aload_2
    //   13: invokevirtual getY : ()F
    //   16: f2i
    //   17: istore #4
    //   19: aload_1
    //   20: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   23: astore #9
    //   25: aload_0
    //   26: getfield H : Lxt0;
    //   29: astore #10
    //   31: aload_0
    //   32: getfield D : Landroid/widget/ImageView;
    //   35: astore #11
    //   37: aload_0
    //   38: getfield b : Landroid/view/View;
    //   41: astore #8
    //   43: iload #5
    //   45: ifne -> 107
    //   48: aload_0
    //   49: iload_3
    //   50: putfield x : I
    //   53: aload_0
    //   54: iload #4
    //   56: putfield w : I
    //   59: aload #9
    //   61: ifnull -> 72
    //   64: aload #9
    //   66: iconst_1
    //   67: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   72: aload_1
    //   73: invokevirtual getId : ()I
    //   76: ldc 2131296913
    //   78: if_icmpne -> 900
    //   81: aload #8
    //   83: iconst_1
    //   84: invokevirtual setPressed : (Z)V
    //   87: aload_0
    //   88: invokestatic currentTimeMillis : ()J
    //   91: putfield G : J
    //   94: aload #11
    //   96: aload #10
    //   98: ldc2_w 500
    //   101: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   104: pop
    //   105: iconst_1
    //   106: ireturn
    //   107: iload #5
    //   109: iconst_2
    //   110: if_icmpne -> 811
    //   113: iload_3
    //   114: aload_0
    //   115: getfield x : I
    //   118: isub
    //   119: invokestatic abs : (I)I
    //   122: istore_3
    //   123: iload #4
    //   125: aload_0
    //   126: getfield w : I
    //   129: isub
    //   130: invokestatic abs : (I)I
    //   133: istore #5
    //   135: getstatic nb1.I : I
    //   138: istore #4
    //   140: iload_3
    //   141: iload #4
    //   143: if_icmpgt -> 153
    //   146: iload #5
    //   148: iload #4
    //   150: if_icmple -> 900
    //   153: aload #9
    //   155: ifnull -> 166
    //   158: aload #9
    //   160: iconst_0
    //   161: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   166: aload_0
    //   167: getfield F : Lmb1;
    //   170: astore #10
    //   172: iload_3
    //   173: iload #5
    //   175: if_icmple -> 242
    //   178: invokestatic o : ()Landroid/content/SharedPreferences;
    //   181: ldc_w 'k_b_sraarm'
    //   184: iconst_1
    //   185: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   190: ifeq -> 208
    //   193: aload #10
    //   195: getfield g : Llb1;
    //   198: getfield s0 : Lij0;
    //   201: aload_0
    //   202: invokevirtual r : (Lhe1;)V
    //   205: goto -> 796
    //   208: aload #9
    //   210: ifnull -> 221
    //   213: aload #9
    //   215: iconst_0
    //   216: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   221: aload #9
    //   223: instanceof android/view/ViewGroup
    //   226: ifeq -> 796
    //   229: aload #9
    //   231: checkcast android/view/ViewGroup
    //   234: aload_2
    //   235: invokevirtual onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   238: pop
    //   239: goto -> 796
    //   242: aload_1
    //   243: invokevirtual getId : ()I
    //   246: ldc 2131296913
    //   248: if_icmpne -> 284
    //   251: aload #9
    //   253: ifnull -> 264
    //   256: aload #9
    //   258: iconst_0
    //   259: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   264: aload #9
    //   266: instanceof android/view/ViewGroup
    //   269: ifeq -> 809
    //   272: aload #9
    //   274: checkcast android/view/ViewGroup
    //   277: aload_2
    //   278: invokevirtual onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   281: pop
    //   282: iconst_0
    //   283: ireturn
    //   284: aload #10
    //   286: getfield g : Llb1;
    //   289: astore #11
    //   291: aload_0
    //   292: invokevirtual c : ()I
    //   295: pop
    //   296: aload_0
    //   297: getfield y : Lkm0;
    //   300: getfield b : I
    //   303: invokestatic e : (I)Z
    //   306: ifeq -> 787
    //   309: getstatic my0.c : Ljava/util/ArrayList;
    //   312: astore_1
    //   313: aload_1
    //   314: invokevirtual size : ()I
    //   317: iconst_1
    //   318: if_icmple -> 787
    //   321: aload #10
    //   323: getstatic in/krosbits/musicolet/MusicService.C0 : Z
    //   326: putfield p : Z
    //   329: aload_1
    //   330: invokevirtual size : ()I
    //   333: aload #10
    //   335: getfield d : Lxn1;
    //   338: getfield b : Ljava/util/ArrayList;
    //   341: invokevirtual size : ()I
    //   344: if_icmpge -> 355
    //   347: aload_1
    //   348: invokevirtual size : ()I
    //   351: istore_3
    //   352: goto -> 358
    //   355: bipush #16
    //   357: istore_3
    //   358: aload #10
    //   360: new java/util/ArrayList
    //   363: dup
    //   364: iload_3
    //   365: invokespecial <init> : (I)V
    //   368: putfield j : Ljava/util/ArrayList;
    //   371: aload #10
    //   373: iconst_0
    //   374: putfield m : Z
    //   377: aload_1
    //   378: invokevirtual size : ()I
    //   381: aload #10
    //   383: getfield d : Lxn1;
    //   386: getfield b : Ljava/util/ArrayList;
    //   389: invokevirtual size : ()I
    //   392: if_icmpge -> 415
    //   395: aload #10
    //   397: getfield d : Lxn1;
    //   400: getfield b : Ljava/util/ArrayList;
    //   403: invokevirtual size : ()I
    //   406: aload_1
    //   407: invokevirtual size : ()I
    //   410: isub
    //   411: istore_3
    //   412: goto -> 418
    //   415: bipush #16
    //   417: istore_3
    //   418: aload #10
    //   420: new java/util/ArrayList
    //   423: dup
    //   424: iload_3
    //   425: invokespecial <init> : (I)V
    //   428: putfield k : Ljava/util/ArrayList;
    //   431: aload #10
    //   433: getfield p : Z
    //   436: ifeq -> 451
    //   439: aload #10
    //   441: getfield d : Lxn1;
    //   444: invokevirtual f : ()Ljava/util/ArrayList;
    //   447: astore_1
    //   448: goto -> 453
    //   451: aconst_null
    //   452: astore_1
    //   453: aload #10
    //   455: iconst_m1
    //   456: putfield o : I
    //   459: aload #10
    //   461: iconst_m1
    //   462: putfield n : I
    //   465: aload #10
    //   467: getfield d : Lxn1;
    //   470: aload #10
    //   472: getfield p : Z
    //   475: invokevirtual e : (Z)I
    //   478: istore #6
    //   480: iconst_m1
    //   481: istore #4
    //   483: iconst_0
    //   484: istore_3
    //   485: iload_3
    //   486: aload #10
    //   488: getfield d : Lxn1;
    //   491: getfield b : Ljava/util/ArrayList;
    //   494: invokevirtual size : ()I
    //   497: if_icmpge -> 661
    //   500: aload #10
    //   502: getfield d : Lxn1;
    //   505: iload_3
    //   506: aload #10
    //   508: getfield p : Z
    //   511: invokevirtual h : (IZ)Lkm0;
    //   514: astore #8
    //   516: aload #8
    //   518: getfield b : I
    //   521: invokestatic e : (I)Z
    //   524: istore #7
    //   526: aload #10
    //   528: getfield j : Ljava/util/ArrayList;
    //   531: astore #12
    //   533: iload #7
    //   535: ifeq -> 567
    //   538: aload #10
    //   540: getfield p : Z
    //   543: ifeq -> 553
    //   546: aload_1
    //   547: iload_3
    //   548: invokevirtual get : (I)Ljava/lang/Object;
    //   551: astore #8
    //   553: aload #12
    //   555: aload #8
    //   557: invokevirtual add : (Ljava/lang/Object;)Z
    //   560: pop
    //   561: iconst_1
    //   562: istore #5
    //   564: goto -> 611
    //   567: aload #12
    //   569: invokevirtual size : ()I
    //   572: ifne -> 578
    //   575: iload_3
    //   576: istore #4
    //   578: aload #10
    //   580: getfield k : Ljava/util/ArrayList;
    //   583: astore #12
    //   585: aload #10
    //   587: getfield p : Z
    //   590: ifeq -> 600
    //   593: aload_1
    //   594: iload_3
    //   595: invokevirtual get : (I)Ljava/lang/Object;
    //   598: astore #8
    //   600: aload #12
    //   602: aload #8
    //   604: invokevirtual add : (Ljava/lang/Object;)Z
    //   607: pop
    //   608: iconst_0
    //   609: istore #5
    //   611: iload_3
    //   612: iload #6
    //   614: if_icmpne -> 655
    //   617: iload #5
    //   619: ifeq -> 640
    //   622: aload #10
    //   624: aload #10
    //   626: getfield j : Ljava/util/ArrayList;
    //   629: invokevirtual size : ()I
    //   632: iconst_1
    //   633: isub
    //   634: putfield n : I
    //   637: goto -> 655
    //   640: aload #10
    //   642: aload #10
    //   644: getfield k : Ljava/util/ArrayList;
    //   647: invokevirtual size : ()I
    //   650: iconst_1
    //   651: isub
    //   652: putfield o : I
    //   655: iinc #3, 1
    //   658: goto -> 485
    //   661: aload #10
    //   663: getfield j : Ljava/util/ArrayList;
    //   666: invokevirtual size : ()I
    //   669: iconst_1
    //   670: if_icmpgt -> 706
    //   673: aload #10
    //   675: iconst_0
    //   676: putfield m : Z
    //   679: aload #10
    //   681: aconst_null
    //   682: putfield k : Ljava/util/ArrayList;
    //   685: aload #10
    //   687: aconst_null
    //   688: putfield j : Ljava/util/ArrayList;
    //   691: aload #10
    //   693: iconst_m1
    //   694: putfield o : I
    //   697: aload #10
    //   699: iconst_m1
    //   700: putfield n : I
    //   703: goto -> 740
    //   706: aload #10
    //   708: iload #4
    //   710: iconst_1
    //   711: iadd
    //   712: putfield l : I
    //   715: aload #10
    //   717: iconst_0
    //   718: invokestatic c : (Z)Ljava/util/ArrayList;
    //   721: putfield q : Ljava/util/ArrayList;
    //   724: invokestatic a : ()V
    //   727: aload #11
    //   729: getfield m0 : Landroidx/recyclerview/widget/RecyclerView;
    //   732: aload #10
    //   734: getfield l : I
    //   737: invokevirtual k0 : (I)V
    //   740: aload #10
    //   742: getfield j : Ljava/util/ArrayList;
    //   745: ifnonnull -> 760
    //   748: aload #11
    //   750: getfield s0 : Lij0;
    //   753: aload_0
    //   754: invokevirtual q : (Lhe1;)V
    //   757: goto -> 796
    //   760: aload #11
    //   762: getfield m0 : Landroidx/recyclerview/widget/RecyclerView;
    //   765: new e6
    //   768: dup
    //   769: bipush #16
    //   771: aload #10
    //   773: aload_2
    //   774: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   777: ldc2_w 150
    //   780: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   783: pop
    //   784: goto -> 796
    //   787: aload #11
    //   789: getfield s0 : Lij0;
    //   792: aload_0
    //   793: invokevirtual q : (Lhe1;)V
    //   796: aload #9
    //   798: ifnull -> 809
    //   801: aload #9
    //   803: iconst_0
    //   804: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   809: iconst_0
    //   810: ireturn
    //   811: iload #5
    //   813: iconst_1
    //   814: if_icmpeq -> 823
    //   817: iload #5
    //   819: iconst_3
    //   820: if_icmpne -> 900
    //   823: aload_1
    //   824: invokevirtual getId : ()I
    //   827: ldc 2131296913
    //   829: if_icmpne -> 874
    //   832: aload #8
    //   834: iconst_0
    //   835: invokevirtual setPressed : (Z)V
    //   838: aload_0
    //   839: getfield G : J
    //   842: lconst_0
    //   843: lcmp
    //   844: ifle -> 874
    //   847: invokestatic currentTimeMillis : ()J
    //   850: aload_0
    //   851: getfield G : J
    //   854: lsub
    //   855: ldc2_w 500
    //   858: lcmp
    //   859: ifge -> 874
    //   862: iload #5
    //   864: iconst_1
    //   865: if_icmpne -> 874
    //   868: aload #8
    //   870: invokevirtual performClick : ()Z
    //   873: pop
    //   874: aload #11
    //   876: aload #10
    //   878: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   881: pop
    //   882: aload_0
    //   883: lconst_0
    //   884: putfield G : J
    //   887: aload #9
    //   889: ifnull -> 900
    //   892: aload #9
    //   894: iconst_0
    //   895: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   900: iconst_1
    //   901: ireturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */