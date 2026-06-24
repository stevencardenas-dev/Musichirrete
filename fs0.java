import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.TreeMap;

public abstract class fs0 extends LinearLayout {
  public final ArrayList b;
  
  public final ArrayList c;
  
  public final bh0 e;
  
  public final es0 f;
  
  public Integer[] g;
  
  public kp1 h;
  
  public mp1 i;
  
  public int j;
  
  public op1 k;
  
  public boolean l;
  
  public fs0(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: ldc 2131952743
    //   6: invokestatic n0 : (Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;
    //   9: aload_2
    //   10: iload_3
    //   11: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   14: aload_0
    //   15: new java/util/ArrayList
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: putfield b : Ljava/util/ArrayList;
    //   25: aload_0
    //   26: new java/util/ArrayList
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: putfield c : Ljava/util/ArrayList;
    //   36: aload_0
    //   37: checkcast com/google/android/material/button/MaterialButtonToggleGroup
    //   40: astore_1
    //   41: aload_0
    //   42: new bh0
    //   45: dup
    //   46: bipush #6
    //   48: aload_1
    //   49: invokespecial <init> : (ILjava/lang/Object;)V
    //   52: putfield e : Lbh0;
    //   55: aload_0
    //   56: new es0
    //   59: dup
    //   60: iconst_0
    //   61: aload_1
    //   62: invokespecial <init> : (ILjava/lang/Object;)V
    //   65: putfield f : Les0;
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield l : Z
    //   73: aload_0
    //   74: invokevirtual getContext : ()Landroid/content/Context;
    //   77: astore #6
    //   79: aload #6
    //   81: aload_2
    //   82: getstatic zb1.o : [I
    //   85: iload_3
    //   86: ldc 2131952743
    //   88: iconst_0
    //   89: newarray int
    //   91: invokestatic S : (Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;
    //   94: astore #5
    //   96: aload #5
    //   98: iconst_2
    //   99: invokevirtual hasValue : (I)Z
    //   102: istore #4
    //   104: aconst_null
    //   105: astore_2
    //   106: iload #4
    //   108: ifeq -> 307
    //   111: aload #5
    //   113: iconst_2
    //   114: iconst_0
    //   115: invokevirtual getResourceId : (II)I
    //   118: istore_3
    //   119: iload_3
    //   120: ifne -> 128
    //   123: aconst_null
    //   124: astore_1
    //   125: goto -> 302
    //   128: aload #6
    //   130: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   133: iload_3
    //   134: invokevirtual getResourceTypeName : (I)Ljava/lang/String;
    //   137: ldc 'xml'
    //   139: invokevirtual equals : (Ljava/lang/Object;)Z
    //   142: ifne -> 148
    //   145: goto -> 123
    //   148: aload #6
    //   150: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   153: iload_3
    //   154: invokevirtual getXml : (I)Landroid/content/res/XmlResourceParser;
    //   157: astore #7
    //   159: new op1
    //   162: astore_1
    //   163: aload_1
    //   164: invokespecial <init> : ()V
    //   167: aload_1
    //   168: bipush #10
    //   170: anewarray [I
    //   173: putfield c : [[I
    //   176: aload_1
    //   177: bipush #10
    //   179: anewarray bh0
    //   182: putfield d : [Lbh0;
    //   185: aload #7
    //   187: invokestatic asAttributeSet : (Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   190: astore #8
    //   192: aload #7
    //   194: invokeinterface next : ()I
    //   199: istore_3
    //   200: iload_3
    //   201: iconst_2
    //   202: if_icmpeq -> 213
    //   205: iload_3
    //   206: iconst_1
    //   207: if_icmpeq -> 213
    //   210: goto -> 192
    //   213: iload_3
    //   214: iconst_2
    //   215: if_icmpne -> 265
    //   218: aload #7
    //   220: invokeinterface getName : ()Ljava/lang/String;
    //   225: ldc 'selector'
    //   227: invokevirtual equals : (Ljava/lang/Object;)Z
    //   230: ifeq -> 255
    //   233: aload_1
    //   234: aload #6
    //   236: aload #7
    //   238: aload #8
    //   240: aload #6
    //   242: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   245: invokevirtual a : (Landroid/content/Context;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    //   248: goto -> 255
    //   251: astore_1
    //   252: goto -> 277
    //   255: aload #7
    //   257: invokeinterface close : ()V
    //   262: goto -> 302
    //   265: new org/xmlpull/v1/XmlPullParserException
    //   268: astore_1
    //   269: aload_1
    //   270: ldc 'No start tag found'
    //   272: invokespecial <init> : (Ljava/lang/String;)V
    //   275: aload_1
    //   276: athrow
    //   277: aload #7
    //   279: ifnull -> 300
    //   282: aload #7
    //   284: invokeinterface close : ()V
    //   289: goto -> 300
    //   292: astore #7
    //   294: aload_1
    //   295: aload #7
    //   297: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   300: aload_1
    //   301: athrow
    //   302: aload_0
    //   303: aload_1
    //   304: putfield k : Lop1;
    //   307: aload #5
    //   309: iconst_4
    //   310: invokevirtual hasValue : (I)Z
    //   313: ifeq -> 398
    //   316: aload #6
    //   318: aload #5
    //   320: iconst_4
    //   321: invokestatic b : (Landroid/content/Context;Landroid/content/res/TypedArray;I)Lmp1;
    //   324: astore_1
    //   325: aload_0
    //   326: aload_1
    //   327: putfield i : Lmp1;
    //   330: aload_1
    //   331: ifnonnull -> 398
    //   334: new lp1
    //   337: dup
    //   338: aload #6
    //   340: aload #5
    //   342: iconst_4
    //   343: iconst_0
    //   344: invokevirtual getResourceId : (II)I
    //   347: aload #5
    //   349: iconst_5
    //   350: iconst_0
    //   351: invokevirtual getResourceId : (II)I
    //   354: new k
    //   357: dup
    //   358: fconst_0
    //   359: invokespecial <init> : (F)V
    //   362: invokestatic a : (Landroid/content/Context;IILls;)Lul1;
    //   365: invokevirtual a : ()Lvl1;
    //   368: invokespecial <init> : (Lvl1;)V
    //   371: astore_1
    //   372: aload_1
    //   373: getfield a : I
    //   376: ifne -> 384
    //   379: aload_2
    //   380: astore_1
    //   381: goto -> 393
    //   384: new mp1
    //   387: dup
    //   388: aload_1
    //   389: invokespecial <init> : (Llp1;)V
    //   392: astore_1
    //   393: aload_0
    //   394: aload_1
    //   395: putfield i : Lmp1;
    //   398: aload #5
    //   400: iconst_3
    //   401: invokevirtual hasValue : (I)Z
    //   404: ifeq -> 620
    //   407: new k
    //   410: dup
    //   411: fconst_0
    //   412: invokespecial <init> : (F)V
    //   415: astore_2
    //   416: aload #5
    //   418: iconst_3
    //   419: iconst_0
    //   420: invokevirtual getResourceId : (II)I
    //   423: istore_3
    //   424: iload_3
    //   425: ifne -> 442
    //   428: aload #5
    //   430: iconst_3
    //   431: aload_2
    //   432: invokestatic c : (Landroid/content/res/TypedArray;ILls;)Lls;
    //   435: invokestatic b : (Lls;)Lkp1;
    //   438: astore_1
    //   439: goto -> 615
    //   442: aload #6
    //   444: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   447: iload_3
    //   448: invokevirtual getResourceTypeName : (I)Ljava/lang/String;
    //   451: ldc 'xml'
    //   453: invokevirtual equals : (Ljava/lang/Object;)Z
    //   456: ifne -> 473
    //   459: aload #5
    //   461: iconst_3
    //   462: aload_2
    //   463: invokestatic c : (Landroid/content/res/TypedArray;ILls;)Lls;
    //   466: invokestatic b : (Lls;)Lkp1;
    //   469: astore_1
    //   470: goto -> 615
    //   473: aload #6
    //   475: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   478: iload_3
    //   479: invokevirtual getXml : (I)Landroid/content/res/XmlResourceParser;
    //   482: astore #7
    //   484: new kp1
    //   487: astore_1
    //   488: aload_1
    //   489: invokespecial <init> : ()V
    //   492: aload #7
    //   494: invokestatic asAttributeSet : (Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   497: astore #8
    //   499: aload #7
    //   501: invokeinterface next : ()I
    //   506: istore_3
    //   507: iload_3
    //   508: iconst_2
    //   509: if_icmpeq -> 520
    //   512: iload_3
    //   513: iconst_1
    //   514: if_icmpeq -> 520
    //   517: goto -> 499
    //   520: iload_3
    //   521: iconst_2
    //   522: if_icmpne -> 572
    //   525: aload #7
    //   527: invokeinterface getName : ()Ljava/lang/String;
    //   532: ldc 'selector'
    //   534: invokevirtual equals : (Ljava/lang/Object;)Z
    //   537: ifeq -> 562
    //   540: aload_1
    //   541: aload #6
    //   543: aload #7
    //   545: aload #8
    //   547: aload #6
    //   549: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   552: invokevirtual d : (Landroid/content/Context;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    //   555: goto -> 562
    //   558: astore_1
    //   559: goto -> 584
    //   562: aload #7
    //   564: invokeinterface close : ()V
    //   569: goto -> 615
    //   572: new org/xmlpull/v1/XmlPullParserException
    //   575: astore_1
    //   576: aload_1
    //   577: ldc 'No start tag found'
    //   579: invokespecial <init> : (Ljava/lang/String;)V
    //   582: aload_1
    //   583: athrow
    //   584: aload #7
    //   586: ifnull -> 607
    //   589: aload #7
    //   591: invokeinterface close : ()V
    //   596: goto -> 607
    //   599: astore #6
    //   601: aload_1
    //   602: aload #6
    //   604: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   607: aload_1
    //   608: athrow
    //   609: astore_1
    //   610: aload_2
    //   611: invokestatic b : (Lls;)Lkp1;
    //   614: astore_1
    //   615: aload_0
    //   616: aload_1
    //   617: putfield h : Lkp1;
    //   620: aload_0
    //   621: aload #5
    //   623: iconst_1
    //   624: iconst_0
    //   625: invokevirtual getDimensionPixelSize : (II)I
    //   628: putfield j : I
    //   631: aload_0
    //   632: iconst_1
    //   633: invokevirtual setChildrenDrawingOrderEnabled : (Z)V
    //   636: aload_0
    //   637: aload #5
    //   639: iconst_0
    //   640: iconst_1
    //   641: invokevirtual getBoolean : (IZ)Z
    //   644: invokevirtual setEnabled : (Z)V
    //   647: aload #5
    //   649: invokevirtual recycle : ()V
    //   652: return
    //   653: astore_1
    //   654: goto -> 123
    // Exception table:
    //   from	to	target	type
    //   148	159	653	org/xmlpull/v1/XmlPullParserException
    //   148	159	653	java/io/IOException
    //   148	159	653	android/content/res/Resources$NotFoundException
    //   159	192	251	finally
    //   192	200	251	finally
    //   218	248	251	finally
    //   255	262	653	org/xmlpull/v1/XmlPullParserException
    //   255	262	653	java/io/IOException
    //   255	262	653	android/content/res/Resources$NotFoundException
    //   265	277	251	finally
    //   282	289	292	finally
    //   294	300	653	org/xmlpull/v1/XmlPullParserException
    //   294	300	653	java/io/IOException
    //   294	300	653	android/content/res/Resources$NotFoundException
    //   300	302	653	org/xmlpull/v1/XmlPullParserException
    //   300	302	653	java/io/IOException
    //   300	302	653	android/content/res/Resources$NotFoundException
    //   473	484	609	org/xmlpull/v1/XmlPullParserException
    //   473	484	609	java/io/IOException
    //   473	484	609	android/content/res/Resources$NotFoundException
    //   484	499	558	finally
    //   499	507	558	finally
    //   525	555	558	finally
    //   562	569	609	org/xmlpull/v1/XmlPullParserException
    //   562	569	609	java/io/IOException
    //   562	569	609	android/content/res/Resources$NotFoundException
    //   572	584	558	finally
    //   589	596	599	finally
    //   601	607	609	org/xmlpull/v1/XmlPullParserException
    //   601	607	609	java/io/IOException
    //   601	607	609	android/content/res/Resources$NotFoundException
    //   607	609	609	org/xmlpull/v1/XmlPullParserException
    //   607	609	609	java/io/IOException
    //   607	609	609	android/content/res/Resources$NotFoundException
  }
  
  private int getFirstVisibleChildIndex() {
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      if (c(b))
        return b; 
    } 
    return -1;
  }
  
  private int getLastVisibleChildIndex() {
    for (int i = getChildCount() - 1; i >= 0; i--) {
      if (c(i))
        return i; 
    } 
    return -1;
  }
  
  private void setGeneratedIdIfNeeded(MaterialButton paramMaterialButton) {
    if (paramMaterialButton.getId() == -1)
      paramMaterialButton.setId(View.generateViewId()); 
  }
  
  public final void a() {
    int i = getFirstVisibleChildIndex();
    if (i != -1) {
      for (int j = i + 1; j < getChildCount(); j++) {
        byte b;
        LinearLayout.LayoutParams layoutParams;
        MaterialButton materialButton2 = (MaterialButton)getChildAt(j);
        MaterialButton materialButton1 = (MaterialButton)getChildAt(j - 1);
        if (this.j <= 0) {
          b = Math.min(materialButton2.getStrokeWidth(), materialButton1.getStrokeWidth());
          materialButton2.setShouldDrawSurfaceColorStroke(true);
          materialButton1.setShouldDrawSurfaceColorStroke(true);
        } else {
          materialButton2.setShouldDrawSurfaceColorStroke(false);
          materialButton1.setShouldDrawSurfaceColorStroke(false);
          b = 0;
        } 
        ViewGroup.LayoutParams layoutParams1 = materialButton2.getLayoutParams();
        if (layoutParams1 instanceof LinearLayout.LayoutParams) {
          layoutParams = (LinearLayout.LayoutParams)layoutParams1;
        } else {
          layoutParams = new LinearLayout.LayoutParams(((ViewGroup.LayoutParams)layoutParams).width, ((ViewGroup.LayoutParams)layoutParams).height);
        } 
        if (getOrientation() == 0) {
          layoutParams.setMarginEnd(0);
          layoutParams.setMarginStart(this.j - b);
          layoutParams.topMargin = 0;
        } else {
          layoutParams.bottomMargin = 0;
          layoutParams.topMargin = this.j - b;
          layoutParams.setMarginStart(0);
        } 
        materialButton2.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      } 
      if (getChildCount() != 0 && i != -1) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)((MaterialButton)getChildAt(i)).getLayoutParams();
        if (getOrientation() == 1) {
          layoutParams.topMargin = 0;
          layoutParams.bottomMargin = 0;
          return;
        } 
        layoutParams.setMarginEnd(0);
        layoutParams.setMarginStart(0);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
      } 
    } 
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (!(paramView instanceof MaterialButton)) {
      Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
      return;
    } 
    d();
    this.l = true;
    super.addView(paramView, paramInt, paramLayoutParams);
    MaterialButton materialButton = (MaterialButton)paramView;
    setGeneratedIdIfNeeded(materialButton);
    materialButton.setOnPressedChangeListenerInternal(this.e);
    this.b.add(materialButton.getShapeAppearanceModel());
    this.c.add(materialButton.getStateListShapeAppearanceModel());
    materialButton.setEnabled(isEnabled());
  }
  
  public final void b() {
    if (this.k != null && getChildCount() != 0) {
      int k = getFirstVisibleChildIndex();
      int n = getLastVisibleChildIndex();
      int i = Integer.MAX_VALUE;
      int m;
      for (m = k; m <= n; m++) {
        if (c(m)) {
          boolean bool1 = c(m);
          int i2 = 0;
          boolean bool = false;
          int i1 = i2;
          if (bool1)
            if (this.k == null) {
              i1 = i2;
            } else {
              MaterialButton materialButton1;
              MaterialButton materialButton2 = (MaterialButton)getChildAt(m);
              op1 op11 = this.k;
              int i4 = materialButton2.getWidth();
              int i3 = -i4;
              i1 = 0;
              while (i1 < op11.a) {
                np1 np1 = (np1)(op11.d[i1]).c;
                int i5 = np1.a;
                float f = np1.b;
                if (i5 == 2) {
                  f = Math.max(i3, f);
                } else {
                  i2 = i3;
                  if (i5 == 1) {
                    f = Math.max(i3, i4 * f);
                  } else {
                    continue;
                  } 
                } 
                i2 = (int)f;
                continue;
                i1++;
                i3 = i2;
              } 
              i3 = Math.max(0, i3);
              i1 = m - 1;
              while (true) {
                materialButton2 = null;
                if (i1 >= 0) {
                  if (c(i1)) {
                    materialButton1 = (MaterialButton)getChildAt(i1);
                    break;
                  } 
                  i1--;
                  continue;
                } 
                op11 = null;
                break;
              } 
              if (op11 == null) {
                i1 = 0;
              } else {
                i1 = op11.getAllowedWidthDecrease();
              } 
              i4 = getChildCount();
              i2 = m + 1;
              while (true) {
                materialButton1 = materialButton2;
                if (i2 < i4) {
                  if (c(i2)) {
                    materialButton1 = (MaterialButton)getChildAt(i2);
                    break;
                  } 
                  i2++;
                  continue;
                } 
                break;
              } 
              if (materialButton1 == null) {
                i2 = bool;
              } else {
                i2 = materialButton1.getAllowedWidthDecrease();
              } 
              i1 = Math.min(i3, i1 + i2);
            }  
          i2 = i1;
          if (m != k) {
            i2 = i1;
            if (m != n)
              i2 = i1 / 2; 
          } 
          i = Math.min(i, i2);
        } 
      } 
      for (int j = k; j <= n; j++) {
        if (c(j)) {
          ((MaterialButton)getChildAt(j)).setSizeChange(this.k);
          MaterialButton materialButton = (MaterialButton)getChildAt(j);
          if (j == k || j == n) {
            m = i;
          } else {
            m = i * 2;
          } 
          materialButton.setWidthChangeMax(m);
        } 
      } 
    } 
  }
  
  public final boolean c(int paramInt) {
    return (getChildAt(paramInt).getVisibility() != 8);
  }
  
  public final void d() {
    for (byte b = 0; b < getChildCount(); b++) {
      MaterialButton materialButton = (MaterialButton)getChildAt(b);
      LinearLayout.LayoutParams layoutParams = materialButton.x;
      if (layoutParams != null) {
        materialButton.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        materialButton.x = null;
        materialButton.u = -1.0F;
      } 
    } 
  }
  
  public final void dispatchDraw(Canvas paramCanvas) {
    TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>(this.f);
    int i = getChildCount();
    for (byte b = 0; b < i; b++)
      treeMap.put(getChildAt(b), Integer.valueOf(b)); 
    this.g = (Integer[])treeMap.values().toArray((Object[])new Integer[0]);
    super.dispatchDraw(paramCanvas);
  }
  
  public final void e() {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Lkp1;
    //   4: ifnonnull -> 14
    //   7: aload_0
    //   8: getfield i : Lmp1;
    //   11: ifnull -> 550
    //   14: aload_0
    //   15: getfield l : Z
    //   18: ifne -> 24
    //   21: goto -> 550
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield l : Z
    //   29: aload_0
    //   30: invokevirtual getChildCount : ()I
    //   33: istore #7
    //   35: aload_0
    //   36: invokespecial getFirstVisibleChildIndex : ()I
    //   39: istore #8
    //   41: aload_0
    //   42: invokespecial getLastVisibleChildIndex : ()I
    //   45: istore #6
    //   47: iconst_0
    //   48: istore_3
    //   49: iload_3
    //   50: iload #7
    //   52: if_icmpge -> 550
    //   55: aload_0
    //   56: iload_3
    //   57: invokevirtual getChildAt : (I)Landroid/view/View;
    //   60: checkcast com/google/android/material/button/MaterialButton
    //   63: astore #11
    //   65: aload #11
    //   67: invokevirtual getVisibility : ()I
    //   70: bipush #8
    //   72: if_icmpne -> 78
    //   75: goto -> 544
    //   78: iload_3
    //   79: iload #8
    //   81: if_icmpne -> 89
    //   84: iconst_1
    //   85: istore_1
    //   86: goto -> 91
    //   89: iconst_0
    //   90: istore_1
    //   91: iload_3
    //   92: iload #6
    //   94: if_icmpne -> 103
    //   97: iconst_1
    //   98: istore #4
    //   100: goto -> 106
    //   103: iconst_0
    //   104: istore #4
    //   106: aload_0
    //   107: getfield i : Lmp1;
    //   110: astore #10
    //   112: aload #10
    //   114: ifnull -> 137
    //   117: aload #10
    //   119: astore #9
    //   121: iload_1
    //   122: ifne -> 150
    //   125: iload #4
    //   127: ifeq -> 137
    //   130: aload #10
    //   132: astore #9
    //   134: goto -> 150
    //   137: aload_0
    //   138: getfield c : Ljava/util/ArrayList;
    //   141: iload_3
    //   142: invokevirtual get : (I)Ljava/lang/Object;
    //   145: checkcast mp1
    //   148: astore #9
    //   150: aload #9
    //   152: ifnonnull -> 178
    //   155: new lp1
    //   158: dup
    //   159: aload_0
    //   160: getfield b : Ljava/util/ArrayList;
    //   163: iload_3
    //   164: invokevirtual get : (I)Ljava/lang/Object;
    //   167: checkcast vl1
    //   170: invokespecial <init> : (Lvl1;)V
    //   173: astore #9
    //   175: goto -> 320
    //   178: new java/lang/Object
    //   181: dup
    //   182: invokespecial <init> : ()V
    //   185: astore #10
    //   187: aload #9
    //   189: getfield a : I
    //   192: istore_2
    //   193: aload #10
    //   195: iload_2
    //   196: putfield a : I
    //   199: aload #10
    //   201: aload #9
    //   203: getfield b : Lvl1;
    //   206: putfield b : Lvl1;
    //   209: aload #9
    //   211: getfield c : [[I
    //   214: astore #12
    //   216: aload #12
    //   218: arraylength
    //   219: anewarray [I
    //   222: astore #14
    //   224: aload #10
    //   226: aload #14
    //   228: putfield c : [[I
    //   231: aload #9
    //   233: getfield d : [Lvl1;
    //   236: astore #13
    //   238: aload #10
    //   240: aload #13
    //   242: arraylength
    //   243: anewarray vl1
    //   246: putfield d : [Lvl1;
    //   249: aload #12
    //   251: iconst_0
    //   252: aload #14
    //   254: iconst_0
    //   255: iload_2
    //   256: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   259: aload #13
    //   261: iconst_0
    //   262: aload #10
    //   264: getfield d : [Lvl1;
    //   267: iconst_0
    //   268: aload #10
    //   270: getfield a : I
    //   273: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   276: aload #10
    //   278: aload #9
    //   280: getfield e : Lkp1;
    //   283: putfield e : Lkp1;
    //   286: aload #10
    //   288: aload #9
    //   290: getfield f : Lkp1;
    //   293: putfield f : Lkp1;
    //   296: aload #10
    //   298: aload #9
    //   300: getfield g : Lkp1;
    //   303: putfield g : Lkp1;
    //   306: aload #10
    //   308: aload #9
    //   310: getfield h : Lkp1;
    //   313: putfield h : Lkp1;
    //   316: aload #10
    //   318: astore #9
    //   320: aload_0
    //   321: invokevirtual getOrientation : ()I
    //   324: ifne -> 332
    //   327: iconst_1
    //   328: istore_2
    //   329: goto -> 334
    //   332: iconst_0
    //   333: istore_2
    //   334: aload_0
    //   335: invokevirtual getLayoutDirection : ()I
    //   338: iconst_1
    //   339: if_icmpne -> 348
    //   342: iconst_1
    //   343: istore #5
    //   345: goto -> 351
    //   348: iconst_0
    //   349: istore #5
    //   351: iload_2
    //   352: ifeq -> 401
    //   355: iload_1
    //   356: ifeq -> 364
    //   359: iconst_5
    //   360: istore_1
    //   361: goto -> 366
    //   364: iconst_0
    //   365: istore_1
    //   366: iload_1
    //   367: istore_2
    //   368: iload #4
    //   370: ifeq -> 378
    //   373: iload_1
    //   374: bipush #10
    //   376: ior
    //   377: istore_2
    //   378: iload_2
    //   379: istore_1
    //   380: iload #5
    //   382: ifeq -> 424
    //   385: iload_2
    //   386: bipush #10
    //   388: iand
    //   389: iconst_1
    //   390: ishr
    //   391: iload_2
    //   392: iconst_5
    //   393: iand
    //   394: iconst_1
    //   395: ishl
    //   396: ior
    //   397: istore_1
    //   398: goto -> 424
    //   401: iload_1
    //   402: ifeq -> 410
    //   405: iconst_3
    //   406: istore_2
    //   407: goto -> 412
    //   410: iconst_0
    //   411: istore_2
    //   412: iload_2
    //   413: istore_1
    //   414: iload #4
    //   416: ifeq -> 424
    //   419: iload_2
    //   420: bipush #12
    //   422: ior
    //   423: istore_1
    //   424: iload_1
    //   425: iconst_m1
    //   426: ixor
    //   427: istore_1
    //   428: aload_0
    //   429: getfield h : Lkp1;
    //   432: astore #10
    //   434: iload_1
    //   435: iconst_1
    //   436: ior
    //   437: iload_1
    //   438: if_icmpne -> 448
    //   441: aload #9
    //   443: aload #10
    //   445: putfield e : Lkp1;
    //   448: iload_1
    //   449: iconst_2
    //   450: ior
    //   451: iload_1
    //   452: if_icmpne -> 462
    //   455: aload #9
    //   457: aload #10
    //   459: putfield f : Lkp1;
    //   462: iload_1
    //   463: iconst_4
    //   464: ior
    //   465: iload_1
    //   466: if_icmpne -> 476
    //   469: aload #9
    //   471: aload #10
    //   473: putfield g : Lkp1;
    //   476: iload_1
    //   477: bipush #8
    //   479: ior
    //   480: iload_1
    //   481: if_icmpne -> 491
    //   484: aload #9
    //   486: aload #10
    //   488: putfield h : Lkp1;
    //   491: aload #9
    //   493: getfield a : I
    //   496: ifne -> 505
    //   499: aconst_null
    //   500: astore #9
    //   502: goto -> 516
    //   505: new mp1
    //   508: dup
    //   509: aload #9
    //   511: invokespecial <init> : (Llp1;)V
    //   514: astore #9
    //   516: aload #9
    //   518: invokevirtual d : ()Z
    //   521: ifeq -> 534
    //   524: aload #11
    //   526: aload #9
    //   528: invokevirtual setStateListShapeAppearanceModel : (Lmp1;)V
    //   531: goto -> 544
    //   534: aload #11
    //   536: aload #9
    //   538: invokevirtual c : ()Lvl1;
    //   541: invokevirtual setShapeAppearanceModel : (Lvl1;)V
    //   544: iinc #3, 1
    //   547: goto -> 49
    //   550: return
  }
  
  public op1 getButtonSizeChange() {
    return this.k;
  }
  
  public final int getChildDrawingOrder(int paramInt1, int paramInt2) {
    Integer[] arrayOfInteger = this.g;
    if (arrayOfInteger == null || paramInt2 >= arrayOfInteger.length) {
      Log.w("MButtonGroup", "Child order wasn't updated");
      return paramInt2;
    } 
    return arrayOfInteger[paramInt2].intValue();
  }
  
  public ls getInnerCornerSize() {
    return this.h.b;
  }
  
  public kp1 getInnerCornerSizeStateList() {
    return this.h;
  }
  
  public vl1 getShapeAppearance() {
    mp1 mp11 = this.i;
    return (mp11 == null) ? null : mp11.c();
  }
  
  public int getSpacing() {
    return this.j;
  }
  
  public mp1 getStateListShapeAppearance() {
    return this.i;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean) {
      d();
      b();
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    e();
    a();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final void onViewRemoved(View paramView) {
    super.onViewRemoved(paramView);
    if (paramView instanceof MaterialButton)
      ((MaterialButton)paramView).setOnPressedChangeListenerInternal(null); 
    int i = indexOfChild(paramView);
    if (i >= 0) {
      this.b.remove(i);
      this.c.remove(i);
    } 
    this.l = true;
    e();
    d();
    a();
  }
  
  public void setButtonSizeChange(op1 paramop1) {
    if (this.k != paramop1) {
      this.k = paramop1;
      b();
      requestLayout();
      invalidate();
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    for (byte b = 0; b < getChildCount(); b++)
      ((MaterialButton)getChildAt(b)).setEnabled(paramBoolean); 
  }
  
  public void setInnerCornerSize(ls paramls) {
    this.h = kp1.b(paramls);
    this.l = true;
    e();
    invalidate();
  }
  
  public void setInnerCornerSizeStateList(kp1 paramkp1) {
    this.h = paramkp1;
    this.l = true;
    e();
    invalidate();
  }
  
  public void setOrientation(int paramInt) {
    if (getOrientation() != paramInt)
      this.l = true; 
    super.setOrientation(paramInt);
  }
  
  public void setShapeAppearance(vl1 paramvl1) {
    mp1 mp11;
    lp1 lp1 = new lp1(paramvl1);
    if (lp1.a == 0) {
      lp1 = null;
    } else {
      mp11 = new mp1(lp1);
    } 
    this.i = mp11;
    this.l = true;
    e();
    invalidate();
  }
  
  public void setSpacing(int paramInt) {
    this.j = paramInt;
    invalidate();
    requestLayout();
  }
  
  public void setStateListShapeAppearance(mp1 parammp1) {
    this.i = parammp1;
    this.l = true;
    e();
    invalidate();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fs0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */