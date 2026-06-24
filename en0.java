import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

public abstract class en0 extends ViewGroup {
  public static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
  
  public static final int HORIZONTAL = 0;
  
  public static final int INDEX_BOTTOM = 2;
  
  public static final int INDEX_CENTER_VERTICAL = 0;
  
  public static final int INDEX_FILL = 3;
  
  public static final int INDEX_TOP = 1;
  
  public static final int SHOW_DIVIDER_BEGINNING = 1;
  
  public static final int SHOW_DIVIDER_END = 4;
  
  public static final int SHOW_DIVIDER_MIDDLE = 2;
  
  public static final int SHOW_DIVIDER_NONE = 0;
  
  public static final int VERTICAL = 1;
  
  public static final int VERTICAL_GRAVITY_COUNT = 4;
  
  public boolean mBaselineAligned = true;
  
  public int mBaselineAlignedChildIndex = -1;
  
  public int mBaselineChildTop = 0;
  
  public Drawable mDivider;
  
  public int mDividerHeight;
  
  public int mDividerPadding;
  
  public int mDividerWidth;
  
  public int mGravity = 8388659;
  
  public int[] mMaxAscent;
  
  public int[] mMaxDescent;
  
  public int mOrientation;
  
  public int mShowDividers;
  
  public int mTotalLength;
  
  public boolean mUseLargestChild;
  
  public float mWeightSum;
  
  public en0(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    int[] arrayOfInt = nc1.n;
    zv0 zv0 = zv0.y(paramInt, 0, paramContext, paramAttributeSet, arrayOfInt);
    v22.m((View)this, paramContext, arrayOfInt, paramAttributeSet, (TypedArray)zv0.e, paramInt);
    TypedArray typedArray = (TypedArray)zv0.e;
    paramInt = typedArray.getInt(1, -1);
    if (paramInt >= 0)
      setOrientation(paramInt); 
    paramInt = typedArray.getInt(0, -1);
    if (paramInt >= 0)
      setGravity(paramInt); 
    boolean bool = typedArray.getBoolean(2, true);
    if (!bool)
      setBaselineAligned(bool); 
    this.mWeightSum = typedArray.getFloat(4, -1.0F);
    this.mBaselineAlignedChildIndex = typedArray.getInt(3, -1);
    this.mUseLargestChild = typedArray.getBoolean(7, false);
    setDividerDrawable(zv0.o(5));
    this.mShowDividers = typedArray.getInt(8, 0);
    this.mDividerPadding = typedArray.getDimensionPixelSize(6, 0);
    zv0.z();
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof dn0;
  }
  
  public void drawDividersHorizontal(Canvas paramCanvas) {
    int k = getVirtualChildCount();
    boolean bool = d42.a;
    int i = getLayoutDirection();
    int j = 0;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    } 
    while (j < k) {
      View view = getVirtualChildAt(j);
      if (view != null && view.getVisibility() != 8 && hasDividerBeforeChildAt(j)) {
        int m;
        dn0 dn0 = (dn0)view.getLayoutParams();
        if (i != 0) {
          m = view.getRight() + dn0.rightMargin;
        } else {
          m = view.getLeft() - dn0.leftMargin - this.mDividerWidth;
        } 
        drawVerticalDivider(paramCanvas, m);
      } 
      j++;
    } 
    if (hasDividerBeforeChildAt(k)) {
      View view = getVirtualChildAt(k - 1);
      if (view == null) {
        if (i != 0) {
          i = getPaddingLeft();
        } else {
          j = getWidth() - getPaddingRight();
          i = this.mDividerWidth;
          i = j - i;
        } 
      } else {
        dn0 dn0 = (dn0)view.getLayoutParams();
        if (i != 0) {
          j = view.getLeft() - dn0.leftMargin;
          i = this.mDividerWidth;
        } else {
          i = view.getRight() + dn0.rightMargin;
          drawVerticalDivider(paramCanvas, i);
        } 
        i = j - i;
      } 
    } else {
      return;
    } 
    drawVerticalDivider(paramCanvas, i);
  }
  
  public void drawDividersVertical(Canvas paramCanvas) {
    int j = getVirtualChildCount();
    int i;
    for (i = 0; i < j; i++) {
      View view = getVirtualChildAt(i);
      if (view != null && view.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
        dn0 dn0 = (dn0)view.getLayoutParams();
        drawHorizontalDivider(paramCanvas, view.getTop() - dn0.topMargin - this.mDividerHeight);
      } 
    } 
    if (hasDividerBeforeChildAt(j)) {
      View view = getVirtualChildAt(j - 1);
      if (view == null) {
        i = getHeight() - getPaddingBottom() - this.mDividerHeight;
      } else {
        dn0 dn0 = (dn0)view.getLayoutParams();
        i = view.getBottom() + dn0.bottomMargin;
      } 
      drawHorizontalDivider(paramCanvas, i);
    } 
  }
  
  public void drawHorizontalDivider(Canvas paramCanvas, int paramInt) {
    this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, paramInt, getWidth() - getPaddingRight() - this.mDividerPadding, this.mDividerHeight + paramInt);
    this.mDivider.draw(paramCanvas);
  }
  
  public void drawVerticalDivider(Canvas paramCanvas, int paramInt) {
    this.mDivider.setBounds(paramInt, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + paramInt, getHeight() - getPaddingBottom() - this.mDividerPadding);
    this.mDivider.draw(paramCanvas);
  }
  
  public dn0 generateDefaultLayoutParams() {
    int i = this.mOrientation;
    return (dn0)((i == 0) ? new LinearLayout.LayoutParams(-2, -2) : ((i == 1) ? new LinearLayout.LayoutParams(-1, -2) : null));
  }
  
  public dn0 generateLayoutParams(AttributeSet paramAttributeSet) {
    return (dn0)new LinearLayout.LayoutParams(getContext(), paramAttributeSet);
  }
  
  public dn0 generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (dn0)((paramLayoutParams instanceof dn0) ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams) : ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams) : new LinearLayout.LayoutParams(paramLayoutParams)));
  }
  
  public int getBaseline() {
    if (this.mBaselineAlignedChildIndex < 0)
      return super.getBaseline(); 
    int i = getChildCount();
    int j = this.mBaselineAlignedChildIndex;
    if (i > j) {
      View view = getChildAt(j);
      int k = view.getBaseline();
      if (k == -1) {
        if (this.mBaselineAlignedChildIndex == 0)
          return -1; 
        l0.f("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        return 0;
      } 
      j = this.mBaselineChildTop;
      i = j;
      if (this.mOrientation == 1) {
        int m = this.mGravity & 0x70;
        i = j;
        if (m != 48)
          if (m != 16) {
            if (m != 80) {
              i = j;
            } else {
              i = getBottom() - getTop() - getPaddingBottom() - this.mTotalLength;
            } 
          } else {
            i = j + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.mTotalLength) / 2;
          }  
      } 
      return i + ((dn0)view.getLayoutParams()).topMargin + k;
    } 
    l0.f("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    return 0;
  }
  
  public int getBaselineAlignedChildIndex() {
    return this.mBaselineAlignedChildIndex;
  }
  
  public int getChildrenSkipCount(View paramView, int paramInt) {
    return 0;
  }
  
  public Drawable getDividerDrawable() {
    return this.mDivider;
  }
  
  public int getDividerPadding() {
    return this.mDividerPadding;
  }
  
  public int getDividerWidth() {
    return this.mDividerWidth;
  }
  
  public int getGravity() {
    return this.mGravity;
  }
  
  public int getLocationOffset(View paramView) {
    return 0;
  }
  
  public int getNextLocationOffset(View paramView) {
    return 0;
  }
  
  public int getOrientation() {
    return this.mOrientation;
  }
  
  public int getShowDividers() {
    return this.mShowDividers;
  }
  
  public View getVirtualChildAt(int paramInt) {
    return getChildAt(paramInt);
  }
  
  public int getVirtualChildCount() {
    return getChildCount();
  }
  
  public float getWeightSum() {
    return this.mWeightSum;
  }
  
  public boolean hasDividerBeforeChildAt(int paramInt) {
    if (paramInt == 0)
      return ((this.mShowDividers & 0x1) != 0); 
    int j = getChildCount();
    int i = this.mShowDividers;
    if (paramInt == j)
      return ((i & 0x4) != 0); 
    if ((i & 0x2) != 0)
      while (--paramInt >= 0) {
        if (getChildAt(paramInt).getVisibility() != 8)
          return true; 
        paramInt--;
      }  
    return false;
  }
  
  public boolean isBaselineAligned() {
    return this.mBaselineAligned;
  }
  
  public boolean isMeasureWithLargestChildEnabled() {
    return this.mUseLargestChild;
  }
  
  public void layoutHorizontal(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: getstatic d42.a : Z
    //   3: istore #19
    //   5: aload_0
    //   6: invokevirtual getLayoutDirection : ()I
    //   9: istore #5
    //   11: iconst_0
    //   12: istore #10
    //   14: iconst_1
    //   15: istore #8
    //   17: iload #5
    //   19: iconst_1
    //   20: if_icmpne -> 29
    //   23: iconst_1
    //   24: istore #5
    //   26: goto -> 32
    //   29: iconst_0
    //   30: istore #5
    //   32: aload_0
    //   33: invokevirtual getPaddingTop : ()I
    //   36: istore #11
    //   38: iload #4
    //   40: iload_2
    //   41: isub
    //   42: istore #13
    //   44: aload_0
    //   45: invokevirtual getPaddingBottom : ()I
    //   48: istore #12
    //   50: iload #13
    //   52: iload #11
    //   54: isub
    //   55: aload_0
    //   56: invokevirtual getPaddingBottom : ()I
    //   59: isub
    //   60: istore #7
    //   62: aload_0
    //   63: invokevirtual getVirtualChildCount : ()I
    //   66: istore #14
    //   68: aload_0
    //   69: getfield mGravity : I
    //   72: istore #15
    //   74: aload_0
    //   75: getfield mBaselineAligned : Z
    //   78: istore #19
    //   80: aload_0
    //   81: getfield mMaxAscent : [I
    //   84: astore #21
    //   86: aload_0
    //   87: getfield mMaxDescent : [I
    //   90: astore #20
    //   92: ldc_w 8388615
    //   95: iload #15
    //   97: iand
    //   98: aload_0
    //   99: invokevirtual getLayoutDirection : ()I
    //   102: invokestatic getAbsoluteGravity : (II)I
    //   105: istore_2
    //   106: iconst_2
    //   107: istore #9
    //   109: iload_2
    //   110: iconst_1
    //   111: if_icmpeq -> 144
    //   114: iload_2
    //   115: iconst_5
    //   116: if_icmpeq -> 127
    //   119: aload_0
    //   120: invokevirtual getPaddingLeft : ()I
    //   123: istore_2
    //   124: goto -> 160
    //   127: aload_0
    //   128: invokevirtual getPaddingLeft : ()I
    //   131: iload_3
    //   132: iadd
    //   133: iload_1
    //   134: isub
    //   135: aload_0
    //   136: getfield mTotalLength : I
    //   139: isub
    //   140: istore_2
    //   141: goto -> 160
    //   144: aload_0
    //   145: invokevirtual getPaddingLeft : ()I
    //   148: iload_3
    //   149: iload_1
    //   150: isub
    //   151: aload_0
    //   152: getfield mTotalLength : I
    //   155: isub
    //   156: iconst_2
    //   157: idiv
    //   158: iadd
    //   159: istore_2
    //   160: iload #5
    //   162: ifeq -> 184
    //   165: iload #14
    //   167: iconst_1
    //   168: isub
    //   169: istore #4
    //   171: iconst_m1
    //   172: istore #6
    //   174: iload #10
    //   176: istore #5
    //   178: iload #11
    //   180: istore_3
    //   181: goto -> 197
    //   184: iconst_0
    //   185: istore #4
    //   187: iconst_1
    //   188: istore #6
    //   190: iload #11
    //   192: istore_3
    //   193: iload #10
    //   195: istore #5
    //   197: iload #5
    //   199: iload #14
    //   201: if_icmpge -> 567
    //   204: iload #6
    //   206: iload #5
    //   208: imul
    //   209: iload #4
    //   211: iadd
    //   212: istore #17
    //   214: aload_0
    //   215: iload #17
    //   217: invokevirtual getVirtualChildAt : (I)Landroid/view/View;
    //   220: astore #22
    //   222: aload #22
    //   224: ifnonnull -> 239
    //   227: aload_0
    //   228: iload #17
    //   230: invokevirtual measureNullChild : (I)I
    //   233: iload_2
    //   234: iadd
    //   235: istore_2
    //   236: goto -> 561
    //   239: aload #22
    //   241: invokevirtual getVisibility : ()I
    //   244: bipush #8
    //   246: if_icmpeq -> 558
    //   249: aload #22
    //   251: invokevirtual getMeasuredWidth : ()I
    //   254: istore #16
    //   256: aload #22
    //   258: invokevirtual getMeasuredHeight : ()I
    //   261: istore #18
    //   263: aload #22
    //   265: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   268: checkcast dn0
    //   271: astore #23
    //   273: iload #19
    //   275: ifeq -> 297
    //   278: aload #23
    //   280: getfield height : I
    //   283: iconst_m1
    //   284: if_icmpeq -> 297
    //   287: aload #22
    //   289: invokevirtual getBaseline : ()I
    //   292: istore #10
    //   294: goto -> 300
    //   297: iconst_m1
    //   298: istore #10
    //   300: aload #23
    //   302: getfield gravity : I
    //   305: istore #11
    //   307: iload #11
    //   309: istore_1
    //   310: iload #11
    //   312: ifge -> 321
    //   315: iload #15
    //   317: bipush #112
    //   319: iand
    //   320: istore_1
    //   321: iload_1
    //   322: bipush #112
    //   324: iand
    //   325: istore_1
    //   326: iload_1
    //   327: bipush #16
    //   329: if_icmpeq -> 432
    //   332: iload_1
    //   333: bipush #48
    //   335: if_icmpeq -> 399
    //   338: iload_1
    //   339: bipush #80
    //   341: if_icmpeq -> 349
    //   344: iload_3
    //   345: istore_1
    //   346: goto -> 458
    //   349: iload #13
    //   351: iload #12
    //   353: isub
    //   354: iload #18
    //   356: isub
    //   357: aload #23
    //   359: getfield bottomMargin : I
    //   362: isub
    //   363: istore #11
    //   365: iload #11
    //   367: istore_1
    //   368: iload #10
    //   370: iconst_m1
    //   371: if_icmpeq -> 458
    //   374: aload #22
    //   376: invokevirtual getMeasuredHeight : ()I
    //   379: istore_1
    //   380: aload #20
    //   382: iload #9
    //   384: iaload
    //   385: iload_1
    //   386: iload #10
    //   388: isub
    //   389: isub
    //   390: istore_1
    //   391: iload #11
    //   393: iload_1
    //   394: isub
    //   395: istore_1
    //   396: goto -> 458
    //   399: iload_3
    //   400: aload #23
    //   402: getfield topMargin : I
    //   405: iadd
    //   406: istore #11
    //   408: iload #11
    //   410: istore_1
    //   411: iload #10
    //   413: iconst_m1
    //   414: if_icmpeq -> 458
    //   417: aload #21
    //   419: iload #8
    //   421: iaload
    //   422: iload #10
    //   424: isub
    //   425: iload #11
    //   427: iadd
    //   428: istore_1
    //   429: goto -> 458
    //   432: iload #7
    //   434: iload #18
    //   436: isub
    //   437: iconst_2
    //   438: idiv
    //   439: iload_3
    //   440: iadd
    //   441: aload #23
    //   443: getfield topMargin : I
    //   446: iadd
    //   447: istore #11
    //   449: aload #23
    //   451: getfield bottomMargin : I
    //   454: istore_1
    //   455: goto -> 391
    //   458: iload_2
    //   459: istore #10
    //   461: aload_0
    //   462: iload #17
    //   464: invokevirtual hasDividerBeforeChildAt : (I)Z
    //   467: ifeq -> 478
    //   470: iload_2
    //   471: aload_0
    //   472: getfield mDividerWidth : I
    //   475: iadd
    //   476: istore #10
    //   478: iload #10
    //   480: aload #23
    //   482: getfield leftMargin : I
    //   485: iadd
    //   486: istore_2
    //   487: aload_0
    //   488: aload #22
    //   490: invokevirtual getLocationOffset : (Landroid/view/View;)I
    //   493: iload_2
    //   494: iadd
    //   495: istore #10
    //   497: aload #22
    //   499: iload #10
    //   501: iload_1
    //   502: iload #10
    //   504: iload #16
    //   506: iadd
    //   507: iload #18
    //   509: iload_1
    //   510: iadd
    //   511: invokevirtual layout : (IIII)V
    //   514: aload #23
    //   516: getfield rightMargin : I
    //   519: istore #10
    //   521: aload_0
    //   522: aload #22
    //   524: invokevirtual getNextLocationOffset : (Landroid/view/View;)I
    //   527: istore_1
    //   528: aload_0
    //   529: aload #22
    //   531: iload #17
    //   533: invokevirtual getChildrenSkipCount : (Landroid/view/View;I)I
    //   536: istore #11
    //   538: iload_1
    //   539: iload #16
    //   541: iload #10
    //   543: iadd
    //   544: iadd
    //   545: iload_2
    //   546: iadd
    //   547: istore_2
    //   548: iload #11
    //   550: iload #5
    //   552: iadd
    //   553: istore #5
    //   555: goto -> 561
    //   558: goto -> 236
    //   561: iinc #5, 1
    //   564: goto -> 197
    //   567: return
  }
  
  public void layoutVertical(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int n = getPaddingRight();
    int k = getPaddingRight();
    int m = getVirtualChildCount();
    int i1 = this.mGravity;
    paramInt1 = i1 & 0x70;
    if (paramInt1 != 16) {
      if (paramInt1 != 80) {
        paramInt1 = getPaddingTop();
      } else {
        paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - this.mTotalLength;
      } 
    } else {
      paramInt1 = getPaddingTop();
      paramInt1 = (paramInt4 - paramInt2 - this.mTotalLength) / 2 + paramInt1;
    } 
    paramInt2 = 0;
    while (paramInt2 < m) {
      View view = getVirtualChildAt(paramInt2);
      if (view == null) {
        paramInt3 = measureNullChild(paramInt2) + paramInt1;
        paramInt4 = paramInt2;
      } else {
        paramInt3 = paramInt1;
        paramInt4 = paramInt2;
        if (view.getVisibility() != 8) {
          int i3 = view.getMeasuredWidth();
          int i2 = view.getMeasuredHeight();
          dn0 dn0 = (dn0)view.getLayoutParams();
          paramInt4 = dn0.gravity;
          paramInt3 = paramInt4;
          if (paramInt4 < 0)
            paramInt3 = i1 & 0x800007; 
          paramInt3 = Gravity.getAbsoluteGravity(paramInt3, getLayoutDirection()) & 0x7;
          if (paramInt3 != 1) {
            if (paramInt3 != 5) {
              paramInt3 = dn0.leftMargin + i;
            } else {
              paramInt3 = j - n - i3;
              paramInt4 = dn0.rightMargin;
              paramInt3 -= paramInt4;
            } 
          } else {
            paramInt3 = (j - i - k - i3) / 2 + i + dn0.leftMargin;
            paramInt4 = dn0.rightMargin;
            paramInt3 -= paramInt4;
          } 
          paramInt4 = paramInt1;
          if (hasDividerBeforeChildAt(paramInt2))
            paramInt4 = paramInt1 + this.mDividerHeight; 
          paramInt1 = paramInt4 + dn0.topMargin;
          paramInt4 = getLocationOffset(view) + paramInt1;
          view.layout(paramInt3, paramInt4, i3 + paramInt3, paramInt4 + i2);
          i3 = dn0.bottomMargin;
          paramInt3 = getNextLocationOffset(view);
          paramInt4 = paramInt2 + getChildrenSkipCount(view, paramInt2);
          paramInt3 = paramInt3 + i2 + i3 + paramInt1;
        } 
      } 
      paramInt2 = paramInt4 + 1;
      paramInt1 = paramInt3;
    } 
  }
  
  public void measureChildBeforeLayout(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    measureChildWithMargins(paramView, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void measureHorizontal(int paramInt1, int paramInt2) {
    boolean bool;
    this.mTotalLength = 0;
    int i7 = getVirtualChildCount();
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i8 = View.MeasureSpec.getMode(paramInt2);
    if (this.mMaxAscent == null || this.mMaxDescent == null) {
      this.mMaxAscent = new int[4];
      this.mMaxDescent = new int[4];
    } 
    int[] arrayOfInt1 = this.mMaxAscent;
    int[] arrayOfInt2 = this.mMaxDescent;
    arrayOfInt1[3] = -1;
    arrayOfInt1[2] = -1;
    arrayOfInt1[1] = -1;
    arrayOfInt1[0] = -1;
    arrayOfInt2[3] = -1;
    arrayOfInt2[2] = -1;
    arrayOfInt2[1] = -1;
    arrayOfInt2[0] = -1;
    boolean bool2 = this.mBaselineAligned;
    boolean bool1 = this.mUseLargestChild;
    if (i2 == 1073741824) {
      bool = true;
    } else {
      bool = false;
    } 
    int i4 = 0;
    int m = 0;
    int i3 = m;
    int k = i3;
    int i5 = k;
    int n = i5;
    int i = 1;
    float f = 0.0F;
    int j = n;
    int i1 = j;
    while (true) {
      if (i4 < i7) {
        View view = getVirtualChildAt(i4);
        if (view == null) {
          int i9 = this.mTotalLength;
          this.mTotalLength = measureNullChild(i4) + i9;
        } else if (view.getVisibility() == 8) {
          i4 += getChildrenSkipCount(view, i4);
        } else {
          int i9;
          int i10;
          if (hasDividerBeforeChildAt(i4))
            this.mTotalLength += this.mDividerWidth; 
          dn0 dn0 = (dn0)view.getLayoutParams();
          float f1 = dn0.weight;
          f += f1;
          if (i2 == 1073741824 && dn0.width == 0 && f1 > 0.0F) {
            i9 = this.mTotalLength;
            if (bool) {
              this.mTotalLength = dn0.leftMargin + dn0.rightMargin + i9;
            } else {
              this.mTotalLength = Math.max(i9, dn0.leftMargin + i9 + dn0.rightMargin);
            } 
            if (bool2) {
              i9 = View.MeasureSpec.makeMeasureSpec(0, 0);
              view.measure(i9, i9);
            } else {
              k = 1;
            } 
            boolean bool5 = bool1;
            i9 = i3;
            i10 = k;
          } else {
            if (dn0.width == 0 && f1 > 0.0F) {
              dn0.width = -2;
              i9 = 0;
            } else {
              i9 = Integer.MIN_VALUE;
            } 
            if (f == 0.0F) {
              i10 = this.mTotalLength;
            } else {
              i10 = 0;
            } 
            boolean bool5 = bool1;
            measureChildBeforeLayout(view, i4, paramInt1, i10, paramInt2, 0);
            if (i9 != Integer.MIN_VALUE)
              dn0.width = i9; 
            int i13 = view.getMeasuredWidth();
            i9 = this.mTotalLength;
            if (bool) {
              i10 = dn0.leftMargin;
              int i14 = dn0.rightMargin;
              this.mTotalLength = getNextLocationOffset(view) + i10 + i13 + i14 + i9;
            } else {
              int i14 = dn0.leftMargin;
              i10 = dn0.rightMargin;
              this.mTotalLength = Math.max(i9, getNextLocationOffset(view) + i9 + i13 + i14 + i10);
            } 
            i9 = i3;
            i10 = k;
            if (bool5) {
              i9 = Math.max(i13, i3);
              i10 = k;
            } 
          } 
          boolean bool4 = bool1;
          if (i8 != 1073741824 && dn0.height == -1) {
            k = 1;
            n = 1;
          } else {
            k = 0;
          } 
          int i11 = dn0.topMargin + dn0.bottomMargin;
          i3 = view.getMeasuredHeight() + i11;
          int i12 = View.combineMeasuredStates(i5, view.getMeasuredState());
          if (bool2) {
            int i13 = view.getBaseline();
            if (i13 != -1) {
              int i14 = dn0.gravity;
              i5 = i14;
              if (i14 < 0)
                i5 = this.mGravity; 
              i5 = ((i5 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              arrayOfInt1[i5] = Math.max(arrayOfInt1[i5], i13);
              arrayOfInt2[i5] = Math.max(arrayOfInt2[i5], i3 - i13);
            } 
          } 
          m = Math.max(m, i3);
          if (i && dn0.height == -1) {
            i = 1;
          } else {
            i = 0;
          } 
          if (dn0.weight > 0.0F) {
            if (k == 0)
              i11 = i3; 
            i1 = Math.max(i1, i11);
          } else {
            if (k != 0)
              i3 = i11; 
            j = Math.max(j, i3);
          } 
          i4 += getChildrenSkipCount(view, i4);
          i5 = i12;
          k = i10;
          i3 = i9;
          i4++;
        } 
        boolean bool3 = bool1;
      } else {
        break;
      } 
      i4++;
    } 
    if (this.mTotalLength > 0 && hasDividerBeforeChildAt(i7))
      this.mTotalLength += this.mDividerWidth; 
    i4 = arrayOfInt1[1];
    if (i4 != -1 || arrayOfInt1[0] != -1 || arrayOfInt1[2] != -1 || arrayOfInt1[3] != -1) {
      i4 = Math.max(arrayOfInt1[3], Math.max(arrayOfInt1[0], Math.max(i4, arrayOfInt1[2])));
      m = Math.max(m, Math.max(arrayOfInt2[3], Math.max(arrayOfInt2[0], Math.max(arrayOfInt2[1], arrayOfInt2[2]))) + i4);
    } 
    i4 = i2;
    if (bool1 && (i4 == Integer.MIN_VALUE || i4 == 0)) {
      this.mTotalLength = 0;
      for (i2 = 0; i2 < i7; i2++) {
        View view = getVirtualChildAt(i2);
        if (view == null) {
          int i9 = this.mTotalLength;
          this.mTotalLength = measureNullChild(i2) + i9;
        } else if (view.getVisibility() == 8) {
          i2 += getChildrenSkipCount(view, i2);
        } else {
          dn0 dn0 = (dn0)view.getLayoutParams();
          int i9 = this.mTotalLength;
          if (bool) {
            int i10 = dn0.leftMargin;
            int i11 = dn0.rightMargin;
            this.mTotalLength = getNextLocationOffset(view) + i10 + i3 + i11 + i9;
          } else {
            int i10 = dn0.leftMargin;
            int i11 = dn0.rightMargin;
            this.mTotalLength = Math.max(i9, getNextLocationOffset(view) + i9 + i3 + i10 + i11);
          } 
        } 
      } 
    } 
    int i6 = this.mTotalLength;
    i2 = getPaddingLeft();
    i2 = getPaddingRight() + i2 + i6;
    this.mTotalLength = i2;
    i6 = View.resolveSizeAndState(Math.max(i2, getSuggestedMinimumWidth()), paramInt1, 0);
    i2 = (0xFFFFFF & i6) - this.mTotalLength;
    if (k != 0 || (i2 != 0 && f > 0.0F)) {
      float f1 = this.mWeightSum;
      if (f1 > 0.0F)
        f = f1; 
      arrayOfInt1[3] = -1;
      arrayOfInt1[2] = -1;
      arrayOfInt1[1] = -1;
      arrayOfInt1[0] = -1;
      arrayOfInt2[3] = -1;
      arrayOfInt2[2] = -1;
      arrayOfInt2[1] = -1;
      arrayOfInt2[0] = -1;
      this.mTotalLength = 0;
      i1 = -1;
      i3 = 0;
      k = i;
      i = i5;
      m = j;
      j = i6;
      while (i3 < i7) {
        View view = getVirtualChildAt(i3);
        if (view != null && view.getVisibility() != 8) {
          dn0 dn0 = (dn0)view.getLayoutParams();
          f1 = dn0.weight;
          if (f1 > 0.0F) {
            i6 = (int)(i2 * f1 / f);
            f -= f1;
            i5 = i2 - i6;
            i2 = getPaddingTop();
            int i11 = ViewGroup.getChildMeasureSpec(paramInt2, getPaddingBottom() + i2 + dn0.topMargin + dn0.bottomMargin, dn0.height);
            if (dn0.width != 0 || i4 != 1073741824) {
              i6 = view.getMeasuredWidth() + i6;
              i2 = i6;
              if (i6 < 0)
                i2 = 0; 
              view.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), i11);
            } else {
              if (i6 > 0) {
                i2 = i6;
              } else {
                i2 = 0;
              } 
              view.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), i11);
            } 
            i = View.combineMeasuredStates(i, view.getMeasuredState() & 0xFF000000);
            i2 = i5;
          } 
          i5 = this.mTotalLength;
          if (bool) {
            int i12 = view.getMeasuredWidth();
            int i11 = dn0.leftMargin;
            i6 = dn0.rightMargin;
            this.mTotalLength = getNextLocationOffset(view) + i12 + i11 + i6 + i5;
          } else {
            i6 = view.getMeasuredWidth();
            int i11 = dn0.leftMargin;
            int i12 = dn0.rightMargin;
            this.mTotalLength = Math.max(i5, getNextLocationOffset(view) + i6 + i5 + i11 + i12);
          } 
          if (i8 != 1073741824 && dn0.height == -1) {
            i5 = 1;
          } else {
            i5 = 0;
          } 
          int i10 = dn0.topMargin + dn0.bottomMargin;
          int i9 = view.getMeasuredHeight() + i10;
          i6 = Math.max(i1, i9);
          if (i5 != 0) {
            i1 = i10;
          } else {
            i1 = i9;
          } 
          i1 = Math.max(m, i1);
          if (k != 0 && dn0.height == -1) {
            k = 1;
          } else {
            k = 0;
          } 
          if (bool2) {
            i10 = view.getBaseline();
            if (i10 != -1) {
              i5 = dn0.gravity;
              m = i5;
              if (i5 < 0)
                m = this.mGravity; 
              m = ((m & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              arrayOfInt1[m] = Math.max(arrayOfInt1[m], i10);
              arrayOfInt2[m] = Math.max(arrayOfInt2[m], i9 - i10);
            } 
          } 
          m = i1;
          i1 = i6;
        } 
        i3++;
      } 
      i2 = this.mTotalLength;
      i3 = getPaddingLeft();
      this.mTotalLength = getPaddingRight() + i3 + i2;
      i2 = arrayOfInt1[1];
      if (i2 != -1 || arrayOfInt1[0] != -1 || arrayOfInt1[2] != -1 || arrayOfInt1[3] != -1) {
        i2 = Math.max(arrayOfInt1[3], Math.max(arrayOfInt1[0], Math.max(i2, arrayOfInt1[2])));
        i1 = Math.max(i1, Math.max(arrayOfInt2[3], Math.max(arrayOfInt2[0], Math.max(arrayOfInt2[1], arrayOfInt2[2]))) + i2);
      } 
      i3 = m;
      i2 = j;
      i5 = i;
      m = i1;
      j = i3;
    } else {
      k = Math.max(j, i1);
      if (bool1 && i4 != 1073741824)
        for (j = 0; j < i7; j++) {
          View view = getVirtualChildAt(j);
          if (view != null && view.getVisibility() != 8 && ((dn0)view.getLayoutParams()).weight > 0.0F)
            view.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824)); 
        }  
      i2 = i6;
      j = k;
      k = i;
    } 
    if (k != 0 || i8 == 1073741824)
      j = m; 
    i = getPaddingTop();
    setMeasuredDimension(i2 | i5 & 0xFF000000, View.resolveSizeAndState(Math.max(getPaddingBottom() + i + j, getSuggestedMinimumHeight()), paramInt2, i5 << 16));
    if (n != 0) {
      i = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
      for (paramInt2 = 0; paramInt2 < i7; paramInt2++) {
        View view = getVirtualChildAt(paramInt2);
        if (view.getVisibility() != 8) {
          dn0 dn0 = (dn0)view.getLayoutParams();
          if (dn0.height == -1) {
            j = dn0.width;
            dn0.width = view.getMeasuredWidth();
            measureChildWithMargins(view, paramInt1, 0, i, 0);
            dn0.width = j;
          } 
        } 
      } 
    } 
  }
  
  public int measureNullChild(int paramInt) {
    return 0;
  }
  
  public void measureVertical(int paramInt1, int paramInt2) {
    this.mTotalLength = 0;
    int i6 = getVirtualChildCount();
    int i9 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    int i10 = this.mBaselineAlignedChildIndex;
    boolean bool = this.mUseLargestChild;
    int i3 = 0;
    int m = 0;
    int n = m;
    int i5 = n;
    int i = i5;
    int k = i;
    int i4 = k;
    int i1 = i4;
    float f = 0.0F;
    int j;
    for (j = 1;; j = i11) {
      int i11;
      if (i3 < i6) {
        View view = getVirtualChildAt(i3);
        if (view == null) {
          int i12 = this.mTotalLength;
          this.mTotalLength = measureNullChild(i3) + i12;
        } else if (view.getVisibility() == 8) {
          i3 += getChildrenSkipCount(view, i3);
        } else {
          int i12;
          if (hasDividerBeforeChildAt(i3))
            this.mTotalLength += this.mDividerHeight; 
          dn0 dn0 = (dn0)view.getLayoutParams();
          float f1 = dn0.weight;
          f += f1;
          if (i2 == 1073741824 && dn0.height == 0 && f1 > 0.0F) {
            i4 = this.mTotalLength;
            this.mTotalLength = Math.max(i4, dn0.topMargin + i4 + dn0.bottomMargin);
            i4 = 1;
            i12 = i;
          } else {
            if (dn0.height == 0 && f1 > 0.0F) {
              dn0.height = -2;
              i12 = 0;
            } else {
              i12 = Integer.MIN_VALUE;
            } 
            if (f == 0.0F) {
              i13 = this.mTotalLength;
            } else {
              i13 = 0;
            } 
            int i14 = i;
            measureChildBeforeLayout(view, i3, paramInt1, 0, paramInt2, i13);
            if (i12 != Integer.MIN_VALUE)
              dn0.height = i12; 
            i14 = view.getMeasuredHeight();
            int i13 = this.mTotalLength;
            int i15 = dn0.topMargin;
            i12 = dn0.bottomMargin;
            this.mTotalLength = Math.max(i13, getNextLocationOffset(view) + i13 + i14 + i15 + i12);
            if (bool)
              n = Math.max(i14, n); 
          } 
          if (i10 >= 0 && i10 == i3 + 1)
            this.mBaselineChildTop = this.mTotalLength; 
          if (i3 >= i10 || dn0.weight <= 0.0F) {
            if (i9 != 1073741824 && dn0.width == -1) {
              i12 = 1;
              i1 = 1;
            } else {
              i12 = 0;
            } 
            int i13 = dn0.leftMargin + dn0.rightMargin;
            int i14 = view.getMeasuredWidth() + i13;
            i5 = Math.max(i5, i14);
            int i15 = View.combineMeasuredStates(i, view.getMeasuredState());
            if (j && dn0.width == -1) {
              i = 1;
            } else {
              i = 0;
            } 
            if (dn0.weight > 0.0F) {
              if (!i12)
                i13 = i14; 
              m = Math.max(m, i13);
              j = k;
              k = m;
            } else {
              if (!i12)
                i13 = i14; 
              j = Math.max(k, i13);
              k = m;
            } 
            i13 = i3 + getChildrenSkipCount(view, i3);
            m = k;
            i3 = i15;
            i12 = i;
            k = j;
            i = i3;
            i3 = i13;
          } else {
            l0.f("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
            return;
          } 
          i3++;
          j = i12;
        } 
        i11 = j;
      } else {
        break;
      } 
      i3++;
    } 
    if (this.mTotalLength > 0 && hasDividerBeforeChildAt(i6))
      this.mTotalLength += this.mDividerHeight; 
    int i7 = i2;
    if (bool && (i7 == Integer.MIN_VALUE || i7 == 0)) {
      this.mTotalLength = 0;
      for (i2 = 0; i2 < i6; i2++) {
        View view = getVirtualChildAt(i2);
        if (view == null) {
          i3 = this.mTotalLength;
          this.mTotalLength = measureNullChild(i2) + i3;
        } else if (view.getVisibility() == 8) {
          i2 += getChildrenSkipCount(view, i2);
        } else {
          dn0 dn0 = (dn0)view.getLayoutParams();
          int i12 = this.mTotalLength;
          int i11 = dn0.topMargin;
          i3 = dn0.bottomMargin;
          this.mTotalLength = Math.max(i12, getNextLocationOffset(view) + i12 + n + i11 + i3);
        } 
      } 
    } 
    i3 = this.mTotalLength;
    i2 = getPaddingTop();
    i2 = getPaddingBottom() + i2 + i3;
    this.mTotalLength = i2;
    int i8 = View.resolveSizeAndState(Math.max(i2, getSuggestedMinimumHeight()), paramInt2, 0);
    i2 = (0xFFFFFF & i8) - this.mTotalLength;
    if (i4 != 0 || (i2 != 0 && f > 0.0F)) {
      float f1 = this.mWeightSum;
      if (f1 > 0.0F)
        f = f1; 
      this.mTotalLength = 0;
      i3 = 0;
      i4 = i7;
      while (i3 < i6) {
        View view = getVirtualChildAt(i3);
        if (view.getVisibility() == 8) {
          m = i2;
        } else {
          dn0 dn0 = (dn0)view.getLayoutParams();
          float f2 = dn0.weight;
          m = i2;
          n = i;
          f1 = f;
          if (f2 > 0.0F) {
            m = (int)(i2 * f2 / f);
            f1 = f - f2;
            i2 -= m;
            n = getPaddingLeft();
            i7 = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + n + dn0.leftMargin + dn0.rightMargin, dn0.width);
            if (dn0.height != 0 || i4 != 1073741824) {
              n = view.getMeasuredHeight() + m;
              m = n;
              if (n < 0)
                m = 0; 
              view.measure(i7, View.MeasureSpec.makeMeasureSpec(m, 1073741824));
            } else {
              if (m <= 0)
                m = 0; 
              view.measure(i7, View.MeasureSpec.makeMeasureSpec(m, 1073741824));
            } 
            n = View.combineMeasuredStates(i, view.getMeasuredState() & 0xFFFFFF00);
            m = i2;
          } 
          i = dn0.leftMargin + dn0.rightMargin;
          i2 = view.getMeasuredWidth() + i;
          i5 = Math.max(i5, i2);
          if (i9 == 1073741824 || dn0.width != -1)
            i = i2; 
          k = Math.max(k, i);
          if (j != 0 && dn0.width == -1) {
            i = 1;
          } else {
            i = 0;
          } 
          j = this.mTotalLength;
          i7 = view.getMeasuredHeight();
          int i11 = dn0.topMargin;
          i2 = dn0.bottomMargin;
          this.mTotalLength = Math.max(j, getNextLocationOffset(view) + i7 + j + i11 + i2);
          f = f1;
          j = i;
          i = n;
        } 
        i3++;
        i2 = m;
      } 
      n = this.mTotalLength;
      m = getPaddingTop();
      this.mTotalLength = getPaddingBottom() + m + n;
      m = k;
      i3 = j;
      i2 = i;
      k = i5;
    } else {
      int i11 = Math.max(k, m);
      m = i11;
      k = i5;
      i2 = i;
      i3 = j;
      if (bool) {
        m = i11;
        k = i5;
        i2 = i;
        i3 = j;
        if (i7 != 1073741824) {
          i4 = 0;
          while (true) {
            m = i11;
            k = i5;
            i2 = i;
            i3 = j;
            if (i4 < i6) {
              View view = getVirtualChildAt(i4);
              if (view != null && view.getVisibility() != 8 && ((dn0)view.getLayoutParams()).weight > 0.0F)
                view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(n, 1073741824)); 
              i4++;
              continue;
            } 
            break;
          } 
        } 
      } 
    } 
    if (i3 != 0 || i9 == 1073741824)
      m = k; 
    i = getPaddingLeft();
    setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + i + m, getSuggestedMinimumWidth()), paramInt1, i2), i8);
    if (i1 != 0) {
      i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
      for (paramInt1 = 0; paramInt1 < i6; paramInt1++) {
        View view = getVirtualChildAt(paramInt1);
        if (view.getVisibility() != 8) {
          dn0 dn0 = (dn0)view.getLayoutParams();
          if (dn0.width == -1) {
            j = dn0.height;
            dn0.height = view.getMeasuredHeight();
            measureChildWithMargins(view, i, 0, paramInt2, 0);
            dn0.height = j;
          } 
        } 
      } 
    } 
  }
  
  public void onDraw(Canvas paramCanvas) {
    if (this.mDivider == null)
      return; 
    if (this.mOrientation == 1) {
      drawDividersVertical(paramCanvas);
      return;
    } 
    drawDividersHorizontal(paramCanvas);
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.mOrientation == 1) {
      layoutVertical(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    layoutHorizontal(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    if (this.mOrientation == 1) {
      measureVertical(paramInt1, paramInt2);
      return;
    } 
    measureHorizontal(paramInt1, paramInt2);
  }
  
  public void setBaselineAligned(boolean paramBoolean) {
    this.mBaselineAligned = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt) {
    if (paramInt >= 0 && paramInt < getChildCount()) {
      this.mBaselineAlignedChildIndex = paramInt;
      return;
    } 
    paramInt = getChildCount();
    StringBuilder stringBuilder = new StringBuilder("base aligned child index out of range (0, ");
    stringBuilder.append(paramInt);
    stringBuilder.append(")");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void setDividerDrawable(Drawable paramDrawable) {
    if (paramDrawable == this.mDivider)
      return; 
    this.mDivider = paramDrawable;
    boolean bool = false;
    if (paramDrawable != null) {
      this.mDividerWidth = paramDrawable.getIntrinsicWidth();
      this.mDividerHeight = paramDrawable.getIntrinsicHeight();
    } else {
      this.mDividerWidth = 0;
      this.mDividerHeight = 0;
    } 
    if (paramDrawable == null)
      bool = true; 
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt) {
    this.mDividerPadding = paramInt;
  }
  
  public void setGravity(int paramInt) {
    if (this.mGravity != paramInt) {
      int i = paramInt;
      if ((0x800007 & paramInt) == 0)
        i = paramInt | 0x800003; 
      paramInt = i;
      if ((i & 0x70) == 0)
        paramInt = i | 0x30; 
      this.mGravity = paramInt;
      requestLayout();
    } 
  }
  
  public void setHorizontalGravity(int paramInt) {
    int i = paramInt & 0x800007;
    paramInt = this.mGravity;
    if ((0x800007 & paramInt) != i) {
      this.mGravity = i | 0xFF7FFFF8 & paramInt;
      requestLayout();
    } 
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean) {
    this.mUseLargestChild = paramBoolean;
  }
  
  public void setOrientation(int paramInt) {
    if (this.mOrientation != paramInt) {
      this.mOrientation = paramInt;
      requestLayout();
    } 
  }
  
  public void setShowDividers(int paramInt) {
    if (paramInt != this.mShowDividers)
      requestLayout(); 
    this.mShowDividers = paramInt;
  }
  
  public void setVerticalGravity(int paramInt) {
    paramInt &= 0x70;
    int i = this.mGravity;
    if ((i & 0x70) != paramInt) {
      this.mGravity = paramInt | i & 0xFFFFFF8F;
      requestLayout();
    } 
  }
  
  public void setWeightSum(float paramFloat) {
    this.mWeightSum = Math.max(0.0F, paramFloat);
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\en0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */