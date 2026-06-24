import android.view.ViewTreeObserver;

public final class iu0 implements ViewTreeObserver.OnGlobalLayoutListener {
  public final boolean b;
  
  public final qu0 c;
  
  public iu0(qu0 paramqu0, boolean paramBoolean) {
    this.c = paramqu0;
    this.b = paramBoolean;
  }
  
  public final void onGlobalLayout() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Lqu0;
    //   4: astore #12
    //   6: aload #12
    //   8: getfield w : Landroid/widget/FrameLayout;
    //   11: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
    //   14: aload_0
    //   15: invokevirtual removeGlobalOnLayoutListener : (Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //   18: aload #12
    //   20: getfield i0 : Z
    //   23: ifeq -> 33
    //   26: aload #12
    //   28: iconst_1
    //   29: putfield j0 : Z
    //   32: return
    //   33: aload #12
    //   35: getfield l : Lhv0;
    //   38: astore #10
    //   40: aload #12
    //   42: getfield D : Landroid/widget/LinearLayout;
    //   45: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   48: getfield height : I
    //   51: istore_1
    //   52: aload #12
    //   54: getfield D : Landroid/widget/LinearLayout;
    //   57: iconst_m1
    //   58: invokestatic o : (Landroid/view/View;I)V
    //   61: aload #12
    //   63: aload #12
    //   65: invokevirtual i : ()Z
    //   68: invokevirtual u : (Z)V
    //   71: aload #12
    //   73: invokevirtual getWindow : ()Landroid/view/Window;
    //   76: invokevirtual getDecorView : ()Landroid/view/View;
    //   79: astore #11
    //   81: aload #11
    //   83: aload #12
    //   85: invokevirtual getWindow : ()Landroid/view/Window;
    //   88: invokevirtual getAttributes : ()Landroid/view/WindowManager$LayoutParams;
    //   91: getfield width : I
    //   94: ldc 1073741824
    //   96: invokestatic makeMeasureSpec : (II)I
    //   99: iconst_0
    //   100: invokevirtual measure : (II)V
    //   103: aload #12
    //   105: getfield D : Landroid/widget/LinearLayout;
    //   108: iload_1
    //   109: invokestatic o : (Landroid/view/View;I)V
    //   112: aload #12
    //   114: getfield x : Landroid/widget/ImageView;
    //   117: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   120: instanceof android/graphics/drawable/BitmapDrawable
    //   123: ifeq -> 206
    //   126: aload #12
    //   128: getfield x : Landroid/widget/ImageView;
    //   131: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   134: checkcast android/graphics/drawable/BitmapDrawable
    //   137: invokevirtual getBitmap : ()Landroid/graphics/Bitmap;
    //   140: astore #9
    //   142: aload #9
    //   144: ifnull -> 206
    //   147: aload #12
    //   149: aload #9
    //   151: invokevirtual getWidth : ()I
    //   154: aload #9
    //   156: invokevirtual getHeight : ()I
    //   159: invokevirtual l : (II)I
    //   162: istore_1
    //   163: aload #12
    //   165: getfield x : Landroid/widget/ImageView;
    //   168: astore #13
    //   170: aload #9
    //   172: invokevirtual getWidth : ()I
    //   175: aload #9
    //   177: invokevirtual getHeight : ()I
    //   180: if_icmplt -> 191
    //   183: getstatic android/widget/ImageView$ScaleType.FIT_XY : Landroid/widget/ImageView$ScaleType;
    //   186: astore #9
    //   188: goto -> 196
    //   191: getstatic android/widget/ImageView$ScaleType.FIT_CENTER : Landroid/widget/ImageView$ScaleType;
    //   194: astore #9
    //   196: aload #13
    //   198: aload #9
    //   200: invokevirtual setScaleType : (Landroid/widget/ImageView$ScaleType;)V
    //   203: goto -> 208
    //   206: iconst_0
    //   207: istore_1
    //   208: aload #12
    //   210: aload #12
    //   212: invokevirtual i : ()Z
    //   215: invokevirtual m : (Z)I
    //   218: istore #5
    //   220: aload #12
    //   222: getfield J : Ljava/util/ArrayList;
    //   225: invokevirtual size : ()I
    //   228: istore #4
    //   230: aload #12
    //   232: invokevirtual n : ()Z
    //   235: ifeq -> 263
    //   238: aload #12
    //   240: getfield R : I
    //   243: istore_2
    //   244: aload #10
    //   246: getfield w : Ljava/util/ArrayList;
    //   249: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   252: invokeinterface size : ()I
    //   257: iload_2
    //   258: imul
    //   259: istore_2
    //   260: goto -> 265
    //   263: iconst_0
    //   264: istore_2
    //   265: iload_2
    //   266: istore_3
    //   267: iload #4
    //   269: ifle -> 280
    //   272: iload_2
    //   273: aload #12
    //   275: getfield T : I
    //   278: iadd
    //   279: istore_3
    //   280: iload_3
    //   281: aload #12
    //   283: getfield S : I
    //   286: invokestatic min : (II)I
    //   289: istore_2
    //   290: aload #12
    //   292: getfield h0 : Z
    //   295: ifeq -> 301
    //   298: goto -> 303
    //   301: iconst_0
    //   302: istore_2
    //   303: iload_1
    //   304: iload_2
    //   305: invokestatic max : (II)I
    //   308: iload #5
    //   310: iadd
    //   311: istore_3
    //   312: new android/graphics/Rect
    //   315: dup
    //   316: invokespecial <init> : ()V
    //   319: astore #9
    //   321: aload #11
    //   323: aload #9
    //   325: invokevirtual getWindowVisibleDisplayFrame : (Landroid/graphics/Rect;)V
    //   328: aload #12
    //   330: getfield v : Landroid/widget/LinearLayout;
    //   333: invokevirtual getMeasuredHeight : ()I
    //   336: istore #6
    //   338: aload #12
    //   340: getfield w : Landroid/widget/FrameLayout;
    //   343: invokevirtual getMeasuredHeight : ()I
    //   346: istore #4
    //   348: aload #9
    //   350: invokevirtual height : ()I
    //   353: iload #6
    //   355: iload #4
    //   357: isub
    //   358: isub
    //   359: istore #4
    //   361: iload_1
    //   362: ifle -> 392
    //   365: iload_3
    //   366: iload #4
    //   368: if_icmpgt -> 392
    //   371: aload #12
    //   373: getfield x : Landroid/widget/ImageView;
    //   376: iconst_0
    //   377: invokevirtual setVisibility : (I)V
    //   380: aload #12
    //   382: getfield x : Landroid/widget/ImageView;
    //   385: iload_1
    //   386: invokestatic o : (Landroid/view/View;I)V
    //   389: goto -> 442
    //   392: aload #12
    //   394: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   397: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   400: getfield height : I
    //   403: istore_1
    //   404: aload #12
    //   406: getfield D : Landroid/widget/LinearLayout;
    //   409: invokevirtual getMeasuredHeight : ()I
    //   412: iload_1
    //   413: iadd
    //   414: aload #12
    //   416: getfield w : Landroid/widget/FrameLayout;
    //   419: invokevirtual getMeasuredHeight : ()I
    //   422: if_icmplt -> 435
    //   425: aload #12
    //   427: getfield x : Landroid/widget/ImageView;
    //   430: bipush #8
    //   432: invokevirtual setVisibility : (I)V
    //   435: iload_2
    //   436: iload #5
    //   438: iadd
    //   439: istore_3
    //   440: iconst_0
    //   441: istore_1
    //   442: aload #12
    //   444: invokevirtual i : ()Z
    //   447: ifeq -> 468
    //   450: iload_3
    //   451: iload #4
    //   453: if_icmpgt -> 468
    //   456: aload #12
    //   458: getfield E : Landroid/widget/RelativeLayout;
    //   461: iconst_0
    //   462: invokevirtual setVisibility : (I)V
    //   465: goto -> 478
    //   468: aload #12
    //   470: getfield E : Landroid/widget/RelativeLayout;
    //   473: bipush #8
    //   475: invokevirtual setVisibility : (I)V
    //   478: aload #12
    //   480: getfield E : Landroid/widget/RelativeLayout;
    //   483: invokevirtual getVisibility : ()I
    //   486: ifne -> 495
    //   489: iconst_1
    //   490: istore #7
    //   492: goto -> 498
    //   495: iconst_0
    //   496: istore #7
    //   498: aload #12
    //   500: iload #7
    //   502: invokevirtual u : (Z)V
    //   505: aload #12
    //   507: getfield E : Landroid/widget/RelativeLayout;
    //   510: invokevirtual getVisibility : ()I
    //   513: ifne -> 522
    //   516: iconst_1
    //   517: istore #7
    //   519: goto -> 525
    //   522: iconst_0
    //   523: istore #7
    //   525: aload #12
    //   527: iload #7
    //   529: invokevirtual m : (Z)I
    //   532: istore_3
    //   533: iload_1
    //   534: iload_2
    //   535: invokestatic max : (II)I
    //   538: iload_3
    //   539: iadd
    //   540: istore_1
    //   541: iload_1
    //   542: iload #4
    //   544: if_icmple -> 560
    //   547: iload_2
    //   548: iload_1
    //   549: iload #4
    //   551: isub
    //   552: isub
    //   553: istore_2
    //   554: iload #4
    //   556: istore_1
    //   557: goto -> 560
    //   560: aload #12
    //   562: getfield D : Landroid/widget/LinearLayout;
    //   565: invokevirtual clearAnimation : ()V
    //   568: aload #12
    //   570: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   573: invokevirtual clearAnimation : ()V
    //   576: aload #12
    //   578: getfield w : Landroid/widget/FrameLayout;
    //   581: invokevirtual clearAnimation : ()V
    //   584: aload #12
    //   586: getfield D : Landroid/widget/LinearLayout;
    //   589: astore #11
    //   591: aload_0
    //   592: getfield b : Z
    //   595: istore #7
    //   597: iload #7
    //   599: ifeq -> 635
    //   602: aload #12
    //   604: aload #11
    //   606: iload_3
    //   607: invokevirtual g : (Landroid/view/View;I)V
    //   610: aload #12
    //   612: aload #12
    //   614: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   617: iload_2
    //   618: invokevirtual g : (Landroid/view/View;I)V
    //   621: aload #12
    //   623: aload #12
    //   625: getfield w : Landroid/widget/FrameLayout;
    //   628: iload_1
    //   629: invokevirtual g : (Landroid/view/View;I)V
    //   632: goto -> 659
    //   635: aload #11
    //   637: iload_3
    //   638: invokestatic o : (Landroid/view/View;I)V
    //   641: aload #12
    //   643: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   646: iload_2
    //   647: invokestatic o : (Landroid/view/View;I)V
    //   650: aload #12
    //   652: getfield w : Landroid/widget/FrameLayout;
    //   655: iload_1
    //   656: invokestatic o : (Landroid/view/View;I)V
    //   659: aload #12
    //   661: getfield u : Landroid/widget/FrameLayout;
    //   664: aload #9
    //   666: invokevirtual height : ()I
    //   669: invokestatic o : (Landroid/view/View;I)V
    //   672: aload #10
    //   674: getfield w : Ljava/util/ArrayList;
    //   677: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   680: astore #13
    //   682: aload #13
    //   684: invokeinterface isEmpty : ()Z
    //   689: istore #8
    //   691: aload #12
    //   693: getfield J : Ljava/util/ArrayList;
    //   696: astore #9
    //   698: iload #8
    //   700: ifeq -> 717
    //   703: aload #9
    //   705: invokevirtual clear : ()V
    //   708: aload #12
    //   710: getfield I : Lpu0;
    //   713: invokevirtual notifyDataSetChanged : ()V
    //   716: return
    //   717: new java/util/HashSet
    //   720: dup
    //   721: aload #9
    //   723: invokespecial <init> : (Ljava/util/Collection;)V
    //   726: new java/util/HashSet
    //   729: dup
    //   730: aload #13
    //   732: invokespecial <init> : (Ljava/util/Collection;)V
    //   735: invokevirtual equals : (Ljava/lang/Object;)Z
    //   738: ifeq -> 750
    //   741: aload #12
    //   743: getfield I : Lpu0;
    //   746: invokevirtual notifyDataSetChanged : ()V
    //   749: return
    //   750: iload #7
    //   752: ifeq -> 858
    //   755: aload #12
    //   757: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   760: astore #11
    //   762: aload #12
    //   764: getfield I : Lpu0;
    //   767: astore #14
    //   769: new java/util/HashMap
    //   772: dup
    //   773: invokespecial <init> : ()V
    //   776: astore #10
    //   778: aload #11
    //   780: invokevirtual getFirstVisiblePosition : ()I
    //   783: istore_2
    //   784: iconst_0
    //   785: istore_1
    //   786: aload #10
    //   788: astore #9
    //   790: iload_1
    //   791: aload #11
    //   793: invokevirtual getChildCount : ()I
    //   796: if_icmpge -> 861
    //   799: aload #14
    //   801: iload_2
    //   802: iload_1
    //   803: iadd
    //   804: invokevirtual getItem : (I)Ljava/lang/Object;
    //   807: astore #15
    //   809: aload #11
    //   811: iload_1
    //   812: invokevirtual getChildAt : (I)Landroid/view/View;
    //   815: astore #9
    //   817: aload #10
    //   819: aload #15
    //   821: new android/graphics/Rect
    //   824: dup
    //   825: aload #9
    //   827: invokevirtual getLeft : ()I
    //   830: aload #9
    //   832: invokevirtual getTop : ()I
    //   835: aload #9
    //   837: invokevirtual getRight : ()I
    //   840: aload #9
    //   842: invokevirtual getBottom : ()I
    //   845: invokespecial <init> : (IIII)V
    //   848: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   851: pop
    //   852: iinc #1, 1
    //   855: goto -> 786
    //   858: aconst_null
    //   859: astore #9
    //   861: iload #7
    //   863: ifeq -> 995
    //   866: aload #12
    //   868: getfield m : Landroid/content/Context;
    //   871: astore #15
    //   873: aload #12
    //   875: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   878: astore #16
    //   880: aload #12
    //   882: getfield I : Lpu0;
    //   885: astore #14
    //   887: new java/util/HashMap
    //   890: dup
    //   891: invokespecial <init> : ()V
    //   894: astore #11
    //   896: aload #16
    //   898: invokevirtual getFirstVisiblePosition : ()I
    //   901: istore_2
    //   902: iconst_0
    //   903: istore_1
    //   904: aload #11
    //   906: astore #10
    //   908: iload_1
    //   909: aload #16
    //   911: invokevirtual getChildCount : ()I
    //   914: if_icmpge -> 998
    //   917: aload #14
    //   919: iload_2
    //   920: iload_1
    //   921: iadd
    //   922: invokevirtual getItem : (I)Ljava/lang/Object;
    //   925: astore #17
    //   927: aload #16
    //   929: iload_1
    //   930: invokevirtual getChildAt : (I)Landroid/view/View;
    //   933: astore #10
    //   935: aload #10
    //   937: invokevirtual getWidth : ()I
    //   940: aload #10
    //   942: invokevirtual getHeight : ()I
    //   945: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   948: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   951: astore #18
    //   953: aload #10
    //   955: new android/graphics/Canvas
    //   958: dup
    //   959: aload #18
    //   961: invokespecial <init> : (Landroid/graphics/Bitmap;)V
    //   964: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   967: aload #11
    //   969: aload #17
    //   971: new android/graphics/drawable/BitmapDrawable
    //   974: dup
    //   975: aload #15
    //   977: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   980: aload #18
    //   982: invokespecial <init> : (Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   985: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   988: pop
    //   989: iinc #1, 1
    //   992: goto -> 904
    //   995: aconst_null
    //   996: astore #10
    //   998: aload #12
    //   1000: getfield J : Ljava/util/ArrayList;
    //   1003: astore #14
    //   1005: new java/util/HashSet
    //   1008: dup
    //   1009: aload #13
    //   1011: invokespecial <init> : (Ljava/util/Collection;)V
    //   1014: astore #11
    //   1016: aload #11
    //   1018: aload #14
    //   1020: invokevirtual removeAll : (Ljava/util/Collection;)Z
    //   1023: pop
    //   1024: aload #12
    //   1026: aload #11
    //   1028: putfield K : Ljava/util/HashSet;
    //   1031: new java/util/HashSet
    //   1034: dup
    //   1035: aload #12
    //   1037: getfield J : Ljava/util/ArrayList;
    //   1040: invokespecial <init> : (Ljava/util/Collection;)V
    //   1043: astore #11
    //   1045: aload #11
    //   1047: aload #13
    //   1049: invokevirtual removeAll : (Ljava/util/Collection;)Z
    //   1052: pop
    //   1053: aload #12
    //   1055: aload #11
    //   1057: putfield L : Ljava/util/HashSet;
    //   1060: aload #12
    //   1062: getfield J : Ljava/util/ArrayList;
    //   1065: iconst_0
    //   1066: aload #12
    //   1068: getfield K : Ljava/util/HashSet;
    //   1071: invokevirtual addAll : (ILjava/util/Collection;)Z
    //   1074: pop
    //   1075: aload #12
    //   1077: getfield J : Ljava/util/ArrayList;
    //   1080: aload #12
    //   1082: getfield L : Ljava/util/HashSet;
    //   1085: invokevirtual removeAll : (Ljava/util/Collection;)Z
    //   1088: pop
    //   1089: aload #12
    //   1091: getfield I : Lpu0;
    //   1094: invokevirtual notifyDataSetChanged : ()V
    //   1097: iload #7
    //   1099: ifeq -> 1180
    //   1102: aload #12
    //   1104: getfield h0 : Z
    //   1107: ifeq -> 1180
    //   1110: aload #12
    //   1112: getfield K : Ljava/util/HashSet;
    //   1115: invokevirtual size : ()I
    //   1118: istore_1
    //   1119: aload #12
    //   1121: getfield L : Ljava/util/HashSet;
    //   1124: invokevirtual size : ()I
    //   1127: iload_1
    //   1128: iadd
    //   1129: ifle -> 1180
    //   1132: aload #12
    //   1134: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   1137: iconst_0
    //   1138: invokevirtual setEnabled : (Z)V
    //   1141: aload #12
    //   1143: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   1146: invokevirtual requestLayout : ()V
    //   1149: aload #12
    //   1151: iconst_1
    //   1152: putfield i0 : Z
    //   1155: aload #12
    //   1157: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   1160: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
    //   1163: new ku0
    //   1166: dup
    //   1167: aload #12
    //   1169: aload #9
    //   1171: aload #10
    //   1173: invokespecial <init> : (Lqu0;Ljava/util/HashMap;Ljava/util/HashMap;)V
    //   1176: invokevirtual addOnGlobalLayoutListener : (Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //   1179: return
    //   1180: aload #12
    //   1182: aconst_null
    //   1183: putfield K : Ljava/util/HashSet;
    //   1186: aload #12
    //   1188: aconst_null
    //   1189: putfield L : Ljava/util/HashSet;
    //   1192: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */