import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.internal.BaselineLayout;

public abstract class w01 extends FrameLayout implements y01 {
  public static final u01 ACTIVE_INDICATOR_LABELED_TRANSFORM;
  
  public static final u01 ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
  
  public static final int[] CHECKED_STATE_SET = new int[] { 16842912 };
  
  public static final int INVALID_ITEM_POSITION = -1;
  
  public ValueAnimator activeIndicatorAnimator;
  
  public int activeIndicatorDesiredHeight = 0;
  
  public int activeIndicatorDesiredWidth = 0;
  
  public boolean activeIndicatorEnabled = false;
  
  public int activeIndicatorExpandedDesiredHeight = 0;
  
  public int activeIndicatorExpandedDesiredWidth = -2;
  
  public int activeIndicatorExpandedMarginHorizontal = 0;
  
  public int activeIndicatorLabelPadding;
  
  public int activeIndicatorMarginHorizontal = 0;
  
  public float activeIndicatorProgress = 0.0F;
  
  public boolean activeIndicatorResizeable = false;
  
  public u01 activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
  
  public final View activeIndicatorView;
  
  public ub badgeDrawable;
  
  public int badgeFixedEdge = 0;
  
  public boolean boldText = false;
  
  public final LinearLayout contentContainer;
  
  public BaselineLayout currentLabelGroup;
  
  public boolean expanded = false;
  
  public BaselineLayout expandedLabelGroup;
  
  public float expandedLabelScaleDownFactor;
  
  public float expandedLabelScaleUpFactor;
  
  public float expandedLabelShiftAmountY;
  
  public TextView expandedLargeLabel;
  
  public TextView expandedSmallLabel;
  
  public int horizontalTextAppearanceActive = 0;
  
  public int horizontalTextAppearanceInactive = 0;
  
  public final ImageView icon;
  
  public final FrameLayout iconContainer;
  
  public int iconLabelHorizontalSpacing;
  
  public ColorStateList iconTint;
  
  public boolean initialized = false;
  
  public final LinearLayout innerContentContainer;
  
  public boolean isShifting;
  
  public Rect itemActiveIndicatorExpandedPadding = new Rect();
  
  public Drawable itemBackground;
  
  public uw0 itemData;
  
  public int itemGravity = 49;
  
  public int itemIconGravity;
  
  public int itemPaddingBottom;
  
  public int itemPaddingTop;
  
  public int itemPosition = -1;
  
  public ColorStateList itemRippleColor;
  
  public final BaselineLayout labelGroup;
  
  public int labelVisibilityMode;
  
  public final TextView largeLabel;
  
  public boolean measurePaddingFromBaseline = false;
  
  public boolean onlyShowWhenExpanded = false;
  
  public Drawable originalIconDrawable;
  
  public float scaleDownFactor;
  
  public boolean scaleLabelSizeWithFont = false;
  
  public float scaleUpFactor;
  
  public float shiftAmountY;
  
  public final TextView smallLabel;
  
  public int textAppearanceActive = 0;
  
  public int textAppearanceInactive = 0;
  
  public ColorStateList textColor;
  
  public Drawable wrappedIconDrawable;
  
  static {
    ACTIVE_INDICATOR_LABELED_TRANSFORM = (u01)new Object();
    ACTIVE_INDICATOR_UNLABELED_TRANSFORM = (u01)new Object();
  }
  
  public w01(Context paramContext) {
    super(paramContext);
    LayoutInflater.from(paramContext).inflate(getItemLayoutResId(), (ViewGroup)this, true);
    this.contentContainer = (LinearLayout)findViewById(2131297242);
    LinearLayout linearLayout = (LinearLayout)findViewById(2131297245);
    this.innerContentContainer = linearLayout;
    this.activeIndicatorView = findViewById(2131297241);
    this.iconContainer = (FrameLayout)findViewById(2131297243);
    this.icon = (ImageView)findViewById(2131297244);
    BaselineLayout baselineLayout1 = (BaselineLayout)findViewById(2131297246);
    this.labelGroup = baselineLayout1;
    TextView textView2 = (TextView)findViewById(2131297248);
    this.smallLabel = textView2;
    TextView textView1 = (TextView)findViewById(2131297247);
    this.largeLabel = textView1;
    float f1 = getResources().getDimension(2131165336);
    float f2 = getResources().getDimension(2131165335);
    BaselineLayout baselineLayout2 = new BaselineLayout(getContext());
    this.expandedLabelGroup = baselineLayout2;
    baselineLayout2.setVisibility(8);
    this.expandedLabelGroup.setDuplicateParentStateEnabled(true);
    this.expandedLabelGroup.setMeasurePaddingFromBaseline(this.measurePaddingFromBaseline);
    TextView textView3 = new TextView(getContext());
    this.expandedSmallLabel = textView3;
    textView3.setMaxLines(1);
    TextView textView4 = this.expandedSmallLabel;
    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
    textView4.setEllipsize(truncateAt);
    this.expandedSmallLabel.setDuplicateParentStateEnabled(true);
    this.expandedSmallLabel.setIncludeFontPadding(false);
    this.expandedSmallLabel.setGravity(16);
    this.expandedSmallLabel.setTextSize(f1);
    textView4 = new TextView(getContext());
    this.expandedLargeLabel = textView4;
    textView4.setMaxLines(1);
    this.expandedLargeLabel.setEllipsize(truncateAt);
    this.expandedLargeLabel.setDuplicateParentStateEnabled(true);
    this.expandedLargeLabel.setVisibility(4);
    this.expandedLargeLabel.setIncludeFontPadding(false);
    this.expandedLargeLabel.setGravity(16);
    this.expandedLargeLabel.setTextSize(f2);
    this.expandedLabelGroup.addView((View)this.expandedSmallLabel);
    this.expandedLabelGroup.addView((View)this.expandedLargeLabel);
    this.currentLabelGroup = baselineLayout1;
    setBackgroundResource(getItemBackgroundResId());
    this.itemPaddingTop = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
    this.itemPaddingBottom = baselineLayout1.getPaddingBottom();
    this.activeIndicatorLabelPadding = 0;
    this.iconLabelHorizontalSpacing = 0;
    textView2.setImportantForAccessibility(2);
    textView1.setImportantForAccessibility(2);
    this.expandedSmallLabel.setImportantForAccessibility(2);
    this.expandedLargeLabel.setImportantForAccessibility(2);
    setFocusable(true);
    b();
    this.activeIndicatorExpandedDesiredHeight = getResources().getDimensionPixelSize(2131165891);
    linearLayout.addOnLayoutChangeListener(new ri(1, this));
  }
  
  public static void a(BottomNavigationItemView paramBottomNavigationItemView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (((w01)paramBottomNavigationItemView).icon.getVisibility() == 0) {
      ImageView imageView = ((w01)paramBottomNavigationItemView).icon;
      ub ub1 = ((w01)paramBottomNavigationItemView).badgeDrawable;
      if (ub1 != null) {
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        ub1.setBounds(rect);
        ub1.j((View)imageView, null);
      } 
    } 
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)((w01)paramBottomNavigationItemView).innerContentContainer.getLayoutParams();
    paramInt1 = paramInt3 - paramInt1 + layoutParams.rightMargin + layoutParams.leftMargin;
    paramInt3 = paramInt4 - paramInt2 + layoutParams.topMargin + layoutParams.bottomMargin;
    paramInt4 = ((w01)paramBottomNavigationItemView).itemIconGravity;
    paramInt2 = 1;
    if (paramInt4 == 1 && ((w01)paramBottomNavigationItemView).activeIndicatorExpandedDesiredWidth == -2) {
      layoutParams = (FrameLayout.LayoutParams)((w01)paramBottomNavigationItemView).activeIndicatorView.getLayoutParams();
      if (((w01)paramBottomNavigationItemView).activeIndicatorExpandedDesiredWidth == -2 && ((w01)paramBottomNavigationItemView).activeIndicatorView.getMeasuredWidth() != paramInt1) {
        layoutParams.width = Math.max(paramInt1, Math.min(((w01)paramBottomNavigationItemView).activeIndicatorDesiredWidth, paramBottomNavigationItemView.getMeasuredWidth() - ((w01)paramBottomNavigationItemView).activeIndicatorMarginHorizontal * 2));
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      } 
      if (((w01)paramBottomNavigationItemView).activeIndicatorView.getMeasuredHeight() < paramInt3) {
        layoutParams.height = paramInt3;
        paramInt1 = paramInt2;
      } 
      if (paramInt1 != 0)
        ((w01)paramBottomNavigationItemView).activeIndicatorView.setLayoutParams((ViewGroup.LayoutParams)layoutParams); 
    } 
  }
  
  private int getItemVisiblePosition() {
    ViewGroup viewGroup = (ViewGroup)getParent();
    int j = viewGroup.indexOfChild((View)this);
    byte b = 0;
    int i;
    for (i = 0; b < j; i = k) {
      View view = viewGroup.getChildAt(b);
      int k = i;
      if (view instanceof w01) {
        k = i;
        if (view.getVisibility() == 0)
          k = i + 1; 
      } 
      b++;
    } 
    return i;
  }
  
  private int getSuggestedIconWidth() {
    int i;
    ub ub1 = this.badgeDrawable;
    if (ub1 == null) {
      i = 0;
    } else {
      i = ub1.getMinimumWidth() - this.badgeDrawable.g.b.y.intValue();
    } 
    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.iconContainer.getLayoutParams();
    int j = Math.max(i, layoutParams.leftMargin);
    int k = this.icon.getMeasuredWidth();
    return Math.max(i, layoutParams.rightMargin) + k + j;
  }
  
  public static void i(int paramInt1, int paramInt2, int paramInt3, View paramView) {
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    layoutParams.topMargin = paramInt1;
    layoutParams.bottomMargin = paramInt2;
    layoutParams.gravity = paramInt3;
    paramView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
  }
  
  private void setLabelPivots(TextView paramTextView) {
    paramTextView.setPivotX((paramTextView.getWidth() / 2));
    paramTextView.setPivotY(paramTextView.getBaseline());
  }
  
  public final void b() {
    float f2 = this.smallLabel.getTextSize();
    float f1 = this.largeLabel.getTextSize();
    this.shiftAmountY = f2 - f1;
    this.scaleUpFactor = f1 * 1.0F / f2;
    this.scaleDownFactor = f2 * 1.0F / f1;
    f1 = this.expandedSmallLabel.getTextSize();
    f2 = this.expandedLargeLabel.getTextSize();
    this.expandedLabelShiftAmountY = f1 - f2;
    this.expandedLabelScaleUpFactor = f2 * 1.0F / f1;
    this.expandedLabelScaleDownFactor = f1 * 1.0F / f2;
  }
  
  public final void c() {
    RippleDrawable rippleDrawable;
    Drawable drawable4 = this.itemBackground;
    ColorStateList colorStateList = this.itemRippleColor;
    Drawable drawable3 = null;
    boolean bool2 = true;
    Drawable drawable2 = drawable4;
    Drawable drawable1 = drawable3;
    boolean bool1 = bool2;
    if (colorStateList != null) {
      drawable1 = getActiveIndicatorDrawable();
      if (this.activeIndicatorEnabled && getActiveIndicatorDrawable() != null && drawable1 != null) {
        RippleDrawable rippleDrawable1 = new RippleDrawable(yg1.c(this.itemRippleColor), null, drawable1);
        bool1 = false;
        drawable2 = drawable4;
      } else {
        drawable2 = drawable4;
        drawable1 = drawable3;
        bool1 = bool2;
        if (drawable4 == null) {
          rippleDrawable = new RippleDrawable(yg1.a(this.itemRippleColor), null, null);
          bool1 = bool2;
          drawable1 = drawable3;
        } 
      } 
    } 
    this.iconContainer.setPadding(0, 0, 0, 0);
    this.iconContainer.setForeground(drawable1);
    setBackground((Drawable)rippleDrawable);
    if (Build.VERSION.SDK_INT >= 26)
      setDefaultFocusHighlightEnabled(bool1); 
  }
  
  public void clear() {
    removeBadge();
    this.itemData = null;
    this.activeIndicatorProgress = 0.0F;
    this.initialized = false;
  }
  
  public final void d(float paramFloat1, float paramFloat2) {
    float f;
    u01 u011 = this.activeIndicatorTransform;
    View view = this.activeIndicatorView;
    u011.getClass();
    view.setScaleX(g5.a(0.4F, 1.0F, paramFloat1));
    view.setScaleY(u011.a(paramFloat1));
    int i = paramFloat2 cmp 0.0F;
    if (i == 0) {
      paramFloat2 = 0.8F;
    } else {
      paramFloat2 = 0.0F;
    } 
    if (i == 0) {
      f = 1.0F;
    } else {
      f = 0.2F;
    } 
    view.setAlpha(g5.b(0.0F, 1.0F, paramFloat2, f, paramFloat1));
    this.activeIndicatorProgress = paramFloat1;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    if (this.activeIndicatorEnabled)
      this.iconContainer.dispatchTouchEvent(paramMotionEvent); 
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final void e() {
    int i = (this.icon.getLayoutParams()).width;
    boolean bool = false;
    if (i > 0) {
      i = this.iconLabelHorizontalSpacing;
    } else {
      i = 0;
    } 
    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.expandedLabelGroup.getLayoutParams();
    if (layoutParams != null) {
      boolean bool1;
      if (getLayoutDirection() == 1) {
        bool1 = i;
      } else {
        bool1 = false;
      } 
      layoutParams.rightMargin = bool1;
      if (getLayoutDirection() == 1)
        i = bool; 
      layoutParams.leftMargin = i;
    } 
  }
  
  public final void f(TextView paramTextView1, TextView paramTextView2, float paramFloat1, float paramFloat2) {
    int j;
    LinearLayout linearLayout = this.contentContainer;
    if (this.itemIconGravity == 0) {
      i = (int)(this.itemPaddingTop + paramFloat2);
    } else {
      i = 0;
    } 
    i(i, 0, this.itemGravity, (View)linearLayout);
    linearLayout = this.innerContentContainer;
    int k = this.itemIconGravity;
    if (k == 0) {
      i = 0;
    } else {
      i = this.itemActiveIndicatorExpandedPadding.top;
    } 
    if (k == 0) {
      j = 0;
    } else {
      j = this.itemActiveIndicatorExpandedPadding.bottom;
    } 
    if (k == 0) {
      k = 17;
    } else {
      k = 8388627;
    } 
    i(i, j, k, (View)linearLayout);
    BaselineLayout baselineLayout = this.labelGroup;
    int i = this.itemPaddingBottom;
    baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i);
    this.currentLabelGroup.setVisibility(0);
    paramTextView1.setScaleX(1.0F);
    paramTextView1.setScaleY(1.0F);
    paramTextView1.setVisibility(0);
    paramTextView2.setScaleX(paramFloat1);
    paramTextView2.setScaleY(paramFloat1);
    paramTextView2.setVisibility(4);
  }
  
  public final void g() {
    int i;
    LinearLayout linearLayout = this.contentContainer;
    int j = this.itemPaddingTop;
    if (this.itemIconGravity == 0) {
      i = 17;
    } else {
      i = this.itemGravity;
    } 
    i(j, j, i, (View)linearLayout);
    i(0, 0, 17, (View)this.innerContentContainer);
    BaselineLayout baselineLayout = this.labelGroup;
    baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
    this.currentLabelGroup.setVisibility(8);
  }
  
  public Drawable getActiveIndicatorDrawable() {
    return this.activeIndicatorView.getBackground();
  }
  
  public ub getBadge() {
    return this.badgeDrawable;
  }
  
  public BaselineLayout getExpandedLabelGroup() {
    return this.expandedLabelGroup;
  }
  
  public int getItemBackgroundResId() {
    return 2131231557;
  }
  
  public uw0 getItemData() {
    return this.itemData;
  }
  
  public int getItemDefaultMarginResId() {
    return 2131166246;
  }
  
  public abstract int getItemLayoutResId();
  
  public int getItemPosition() {
    return this.itemPosition;
  }
  
  public BaselineLayout getLabelGroup() {
    return this.labelGroup;
  }
  
  public int getSuggestedMinimumHeight() {
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)this.contentContainer.getLayoutParams();
    return this.contentContainer.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
  }
  
  public int getSuggestedMinimumWidth() {
    if (this.itemIconGravity == 1) {
      FrameLayout.LayoutParams layoutParams1 = (FrameLayout.LayoutParams)this.innerContentContainer.getLayoutParams();
      return this.innerContentContainer.getMeasuredWidth() + layoutParams1.leftMargin + layoutParams1.rightMargin;
    } 
    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.labelGroup.getLayoutParams();
    int j = layoutParams.leftMargin;
    int i = this.labelGroup.getMeasuredWidth();
    int k = layoutParams.rightMargin;
    return Math.max(getSuggestedIconWidth(), i + j + k);
  }
  
  public final void h(TextView paramTextView, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield scaleLabelSizeWithFont : Z
    //   4: ifeq -> 13
    //   7: aload_1
    //   8: iload_2
    //   9: invokevirtual setTextAppearance : (I)V
    //   12: return
    //   13: aload_1
    //   14: iload_2
    //   15: invokevirtual setTextAppearance : (I)V
    //   18: aload_1
    //   19: invokevirtual getContext : ()Landroid/content/Context;
    //   22: astore #6
    //   24: iload_2
    //   25: ifne -> 31
    //   28: goto -> 71
    //   31: aload #6
    //   33: iload_2
    //   34: getstatic nc1.x : [I
    //   37: invokevirtual obtainStyledAttributes : (I[I)Landroid/content/res/TypedArray;
    //   40: astore #7
    //   42: new android/util/TypedValue
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: astore #5
    //   51: aload #7
    //   53: iconst_0
    //   54: aload #5
    //   56: invokevirtual getValue : (ILandroid/util/TypedValue;)Z
    //   59: istore #4
    //   61: aload #7
    //   63: invokevirtual recycle : ()V
    //   66: iload #4
    //   68: ifne -> 76
    //   71: iconst_0
    //   72: istore_2
    //   73: goto -> 129
    //   76: aload #5
    //   78: invokevirtual getComplexUnit : ()I
    //   81: istore_2
    //   82: aload #5
    //   84: getfield data : I
    //   87: istore_3
    //   88: iload_2
    //   89: iconst_2
    //   90: if_icmpne -> 116
    //   93: iload_3
    //   94: invokestatic complexToFloat : (I)F
    //   97: aload #6
    //   99: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   102: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   105: getfield density : F
    //   108: fmul
    //   109: invokestatic round : (F)I
    //   112: istore_2
    //   113: goto -> 129
    //   116: iload_3
    //   117: aload #6
    //   119: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   122: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   125: invokestatic complexToDimensionPixelSize : (ILandroid/util/DisplayMetrics;)I
    //   128: istore_2
    //   129: iload_2
    //   130: ifeq -> 140
    //   133: aload_1
    //   134: iconst_0
    //   135: iload_2
    //   136: i2f
    //   137: invokevirtual setTextSize : (IF)V
    //   140: return
  }
  
  public void initialize(uw0 paramuw0, int paramInt) {
    CharSequence charSequence;
    this.itemData = paramuw0;
    setCheckable(paramuw0.isCheckable());
    setChecked(paramuw0.isChecked());
    setEnabled(paramuw0.isEnabled());
    setIcon(paramuw0.getIcon());
    setTitle(paramuw0.e);
    setId(paramuw0.a);
    if (!TextUtils.isEmpty(paramuw0.q))
      setContentDescription(paramuw0.q); 
    if (!TextUtils.isEmpty(paramuw0.r)) {
      charSequence = paramuw0.r;
    } else {
      charSequence = ((uw0)charSequence).e;
    } 
    qv.Y((View)this, charSequence);
    k();
    this.initialized = true;
  }
  
  public boolean isExpanded() {
    return this.expanded;
  }
  
  public boolean isOnlyVisibleWhenExpanded() {
    return this.onlyShowWhenExpanded;
  }
  
  public final void j(TextView paramTextView, int paramInt) {
    if (paramTextView == null)
      return; 
    h(paramTextView, paramInt);
    b();
    paramTextView.setMinimumHeight(wf2.E(paramTextView.getContext(), paramInt));
    ColorStateList colorStateList = this.textColor;
    if (colorStateList != null)
      paramTextView.setTextColor(colorStateList); 
    paramTextView = this.largeLabel;
    paramTextView.setTypeface(paramTextView.getTypeface(), this.boldText);
    paramTextView = this.expandedLargeLabel;
    paramTextView.setTypeface(paramTextView.getTypeface(), this.boldText);
  }
  
  public final void k() {
    uw0 uw01 = this.itemData;
    if (uw01 != null) {
      byte b;
      if (uw01.isVisible() && (this.expanded || !this.onlyShowWhenExpanded)) {
        b = 0;
      } else {
        b = 8;
      } 
      setVisibility(b);
    } 
  }
  
  public int[] onCreateDrawableState(int paramInt) {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    uw0 uw01 = this.itemData;
    if (uw01 != null && uw01.isCheckable() && this.itemData.isChecked())
      View.mergeDrawableStates(arrayOfInt, CHECKED_STATE_SET); 
    return arrayOfInt;
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    ub ub1 = this.badgeDrawable;
    if (ub1 != null && ub1.isVisible()) {
      uw0 uw01 = this.itemData;
      CharSequence charSequence = uw01.e;
      if (!TextUtils.isEmpty(uw01.q))
        charSequence = this.itemData.q; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(charSequence);
      stringBuilder.append(", ");
      stringBuilder.append(this.badgeDrawable.d());
      paramAccessibilityNodeInfo.setContentDescription(stringBuilder.toString());
    } 
    int i = getItemVisiblePosition();
    paramAccessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)(s0.a(isSelected(), 0, 1, i, 1)).b);
    if (isSelected()) {
      paramAccessibilityNodeInfo.setClickable(false);
      paramAccessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction)m0.e.a);
    } 
    String str = getResources().getString(2131886698);
    paramAccessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", str);
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    post(new sd(paramInt1, 4, this));
  }
  
  public boolean prefersCondensedTitle() {
    return false;
  }
  
  public void removeBadge() {
    ImageView imageView = this.icon;
    if (this.badgeDrawable != null) {
      if (imageView != null) {
        setClipChildren(true);
        setClipToPadding(true);
        ub ub1 = this.badgeDrawable;
        if (ub1 != null)
          if (ub1.e() != null) {
            ub1.e().setForeground(null);
          } else {
            imageView.getOverlay().remove(ub1);
          }  
      } 
      this.badgeDrawable = null;
    } 
  }
  
  public void setActiveIndicatorDrawable(Drawable paramDrawable) {
    this.activeIndicatorView.setBackground(paramDrawable);
    c();
  }
  
  public void setActiveIndicatorEnabled(boolean paramBoolean) {
    byte b;
    this.activeIndicatorEnabled = paramBoolean;
    c();
    View view = this.activeIndicatorView;
    if (paramBoolean) {
      b = 0;
    } else {
      b = 8;
    } 
    view.setVisibility(b);
    requestLayout();
  }
  
  public void setActiveIndicatorExpandedHeight(int paramInt) {
    this.activeIndicatorExpandedDesiredHeight = paramInt;
    updateActiveIndicatorLayoutParams(getWidth());
  }
  
  public void setActiveIndicatorExpandedMarginHorizontal(int paramInt) {
    this.activeIndicatorExpandedMarginHorizontal = paramInt;
    if (this.itemIconGravity == 1)
      setPadding(paramInt, 0, paramInt, 0); 
    updateActiveIndicatorLayoutParams(getWidth());
  }
  
  public void setActiveIndicatorExpandedPadding(Rect paramRect) {
    this.itemActiveIndicatorExpandedPadding = paramRect;
  }
  
  public void setActiveIndicatorExpandedWidth(int paramInt) {
    this.activeIndicatorExpandedDesiredWidth = paramInt;
    updateActiveIndicatorLayoutParams(getWidth());
  }
  
  public void setActiveIndicatorHeight(int paramInt) {
    this.activeIndicatorDesiredHeight = paramInt;
    updateActiveIndicatorLayoutParams(getWidth());
  }
  
  public void setActiveIndicatorLabelPadding(int paramInt) {
    if (this.activeIndicatorLabelPadding != paramInt) {
      this.activeIndicatorLabelPadding = paramInt;
      ((LinearLayout.LayoutParams)this.labelGroup.getLayoutParams()).topMargin = paramInt;
      if (this.expandedLabelGroup.getLayoutParams() != null) {
        boolean bool;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.expandedLabelGroup.getLayoutParams();
        if (getLayoutDirection() == 1) {
          bool = paramInt;
        } else {
          bool = false;
        } 
        layoutParams.rightMargin = bool;
        if (getLayoutDirection() == 1)
          paramInt = 0; 
        layoutParams.leftMargin = paramInt;
        requestLayout();
      } 
    } 
  }
  
  public void setActiveIndicatorMarginHorizontal(int paramInt) {
    this.activeIndicatorMarginHorizontal = paramInt;
    updateActiveIndicatorLayoutParams(getWidth());
  }
  
  public void setActiveIndicatorResizeable(boolean paramBoolean) {
    this.activeIndicatorResizeable = paramBoolean;
  }
  
  public void setActiveIndicatorWidth(int paramInt) {
    this.activeIndicatorDesiredWidth = paramInt;
    updateActiveIndicatorLayoutParams(getWidth());
  }
  
  public void setBadge(ub paramub) {
    ub ub1 = this.badgeDrawable;
    if (ub1 != paramub) {
      if (ub1 != null && this.icon != null) {
        Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
        ImageView imageView1 = this.icon;
        if (this.badgeDrawable != null) {
          if (imageView1 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ub ub2 = this.badgeDrawable;
            if (ub2 != null)
              if (ub2.e() != null) {
                ub2.e().setForeground(null);
              } else {
                imageView1.getOverlay().remove(ub2);
              }  
          } 
          this.badgeDrawable = null;
        } 
      } 
      this.badgeDrawable = paramub;
      int i = this.badgeFixedEdge;
      xb xb = paramub.g;
      if (xb.l != i) {
        xb.l = i;
        paramub.k();
      } 
      ImageView imageView = this.icon;
      if (imageView != null && this.badgeDrawable != null) {
        setClipChildren(false);
        setClipToPadding(false);
        ub ub2 = this.badgeDrawable;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        ub2.setBounds(rect);
        ub2.j((View)imageView, null);
        if (ub2.e() != null) {
          ub2.e().setForeground(ub2);
          return;
        } 
        imageView.getOverlay().add(ub2);
      } 
    } 
  }
  
  public void setCheckable(boolean paramBoolean) {
    refreshDrawableState();
  }
  
  public void setChecked(boolean paramBoolean) {
    setLabelPivots(this.largeLabel);
    setLabelPivots(this.smallLabel);
    setLabelPivots(this.expandedLargeLabel);
    setLabelPivots(this.expandedSmallLabel);
    if (paramBoolean) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    } 
    if (!this.activeIndicatorEnabled || !this.initialized || !isAttachedToWindow()) {
      d(f1, f1);
    } else {
      ValueAnimator valueAnimator = this.activeIndicatorAnimator;
      if (valueAnimator != null) {
        valueAnimator.cancel();
        this.activeIndicatorAnimator = null;
      } 
      valueAnimator = ValueAnimator.ofFloat(new float[] { this.activeIndicatorProgress, f1 });
      this.activeIndicatorAnimator = valueAnimator;
      valueAnimator.addUpdateListener(new t01(this, f1));
      this.activeIndicatorAnimator.setInterpolator(zo2.Q(getContext(), 2130969699, (TimeInterpolator)g5.b));
      this.activeIndicatorAnimator.setDuration(zo2.P(getContext(), 2130969683, getResources().getInteger(2131361835)));
      this.activeIndicatorAnimator.start();
    } 
    TextView textView1 = this.largeLabel;
    TextView textView2 = this.smallLabel;
    float f3 = this.shiftAmountY;
    float f1 = this.scaleUpFactor;
    float f2 = this.scaleDownFactor;
    if (this.itemIconGravity == 1) {
      textView1 = this.expandedLargeLabel;
      textView2 = this.expandedSmallLabel;
      f3 = this.expandedLabelShiftAmountY;
      f1 = this.expandedLabelScaleUpFactor;
      f2 = this.expandedLabelScaleDownFactor;
    } 
    int i = this.labelVisibilityMode;
    if (i != -1) {
      if (i != 0) {
        if (i != 1) {
          if (i == 2)
            g(); 
        } else if (paramBoolean) {
          f(textView1, textView2, f1, f3);
        } else {
          f(textView2, textView1, f2, 0.0F);
        } 
      } else if (paramBoolean) {
        f(textView1, textView2, f1, 0.0F);
      } else {
        g();
      } 
    } else if (this.isShifting) {
      if (paramBoolean) {
        f(textView1, textView2, f1, 0.0F);
      } else {
        g();
      } 
    } else if (paramBoolean) {
      f(textView1, textView2, f1, f3);
    } else {
      f(textView2, textView1, f2, 0.0F);
    } 
    refreshDrawableState();
    setSelected(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.smallLabel.setEnabled(paramBoolean);
    this.largeLabel.setEnabled(paramBoolean);
    this.expandedSmallLabel.setEnabled(paramBoolean);
    this.expandedLargeLabel.setEnabled(paramBoolean);
    this.icon.setEnabled(paramBoolean);
  }
  
  public void setExpanded(boolean paramBoolean) {
    this.expanded = paramBoolean;
    k();
  }
  
  public void setHorizontalTextAppearanceActive(int paramInt) {
    this.horizontalTextAppearanceActive = paramInt;
    TextView textView = this.expandedLargeLabel;
    if (paramInt == 0)
      paramInt = this.textAppearanceActive; 
    j(textView, paramInt);
  }
  
  public void setHorizontalTextAppearanceInactive(int paramInt) {
    this.horizontalTextAppearanceInactive = paramInt;
    TextView textView = this.expandedSmallLabel;
    if (paramInt == 0)
      paramInt = this.textAppearanceInactive; 
    if (textView != null) {
      h(textView, paramInt);
      b();
      textView.setMinimumHeight(wf2.E(textView.getContext(), paramInt));
      ColorStateList colorStateList = this.textColor;
      if (colorStateList != null)
        textView.setTextColor(colorStateList); 
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    if (paramDrawable == this.originalIconDrawable)
      return; 
    this.originalIconDrawable = paramDrawable;
    Drawable drawable = paramDrawable;
    if (paramDrawable != null) {
      Drawable.ConstantState constantState = paramDrawable.getConstantState();
      if (constantState != null)
        paramDrawable = constantState.newDrawable(); 
      paramDrawable = paramDrawable.mutate();
      this.wrappedIconDrawable = paramDrawable;
      ColorStateList colorStateList = this.iconTint;
      drawable = paramDrawable;
      if (colorStateList != null) {
        paramDrawable.setTintList(colorStateList);
        drawable = paramDrawable;
      } 
    } 
    this.icon.setImageDrawable(drawable);
  }
  
  public void setIconLabelHorizontalSpacing(int paramInt) {
    if (this.iconLabelHorizontalSpacing != paramInt) {
      this.iconLabelHorizontalSpacing = paramInt;
      e();
      requestLayout();
    } 
  }
  
  public void setIconSize(int paramInt) {
    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.icon.getLayoutParams();
    layoutParams.width = paramInt;
    layoutParams.height = paramInt;
    this.icon.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    e();
  }
  
  public void setIconTintList(ColorStateList paramColorStateList) {
    this.iconTint = paramColorStateList;
    if (this.itemData != null) {
      Drawable drawable = this.wrappedIconDrawable;
      if (drawable != null) {
        drawable.setTintList(paramColorStateList);
        this.wrappedIconDrawable.invalidateSelf();
      } 
    } 
  }
  
  public void setItemBackground(int paramInt) {
    Drawable drawable;
    if (paramInt == 0) {
      drawable = null;
    } else {
      drawable = getContext().getDrawable(paramInt);
    } 
    setItemBackground(drawable);
  }
  
  public void setItemBackground(Drawable paramDrawable) {
    Drawable drawable = paramDrawable;
    if (paramDrawable != null) {
      drawable = paramDrawable;
      if (paramDrawable.getConstantState() != null)
        drawable = paramDrawable.getConstantState().newDrawable().mutate(); 
    } 
    this.itemBackground = drawable;
    c();
  }
  
  public void setItemGravity(int paramInt) {
    this.itemGravity = paramInt;
    requestLayout();
  }
  
  public void setItemIconGravity(int paramInt) {
    if (this.itemIconGravity != paramInt) {
      int i;
      boolean bool1;
      boolean bool2;
      byte b;
      int k;
      int m;
      this.itemIconGravity = paramInt;
      this.badgeFixedEdge = 0;
      this.currentLabelGroup = this.labelGroup;
      int j = 8;
      if (paramInt == 1) {
        if (this.expandedLabelGroup.getParent() == null) {
          LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(-2, -2);
          layoutParams1.gravity = 17;
          this.innerContentContainer.addView((View)this.expandedLabelGroup, (ViewGroup.LayoutParams)layoutParams1);
          e();
        } 
        Rect rect = this.itemActiveIndicatorExpandedPadding;
        i = rect.left;
        bool1 = rect.right;
        paramInt = rect.top;
        int n = rect.bottom;
        this.badgeFixedEdge = 1;
        bool2 = this.activeIndicatorExpandedMarginHorizontal;
        this.currentLabelGroup = this.expandedLabelGroup;
        b = 0;
        m = bool1;
        k = paramInt;
        bool1 = n;
      } else {
        bool1 = false;
        bool2 = false;
        paramInt = bool2;
        i = paramInt;
        j = i;
        b = 8;
        int n = j;
        k = j;
        m = i;
        i = paramInt;
        j = n;
      } 
      this.labelGroup.setVisibility(j);
      this.expandedLabelGroup.setVisibility(b);
      ((FrameLayout.LayoutParams)this.contentContainer.getLayoutParams()).gravity = this.itemGravity;
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)this.innerContentContainer.getLayoutParams();
      layoutParams.leftMargin = i;
      layoutParams.rightMargin = m;
      layoutParams.topMargin = k;
      layoutParams.bottomMargin = bool1;
      setPadding(bool2, 0, bool2, 0);
      updateActiveIndicatorLayoutParams(getWidth());
      c();
    } 
  }
  
  public void setItemPaddingBottom(int paramInt) {
    if (this.itemPaddingBottom != paramInt) {
      this.itemPaddingBottom = paramInt;
      uw0 uw01 = this.itemData;
      if (uw01 != null)
        setChecked(uw01.isChecked()); 
    } 
  }
  
  public void setItemPaddingTop(int paramInt) {
    if (this.itemPaddingTop != paramInt) {
      this.itemPaddingTop = paramInt;
      uw0 uw01 = this.itemData;
      if (uw01 != null)
        setChecked(uw01.isChecked()); 
    } 
  }
  
  public void setItemPosition(int paramInt) {
    this.itemPosition = paramInt;
  }
  
  public void setItemRippleColor(ColorStateList paramColorStateList) {
    this.itemRippleColor = paramColorStateList;
    c();
  }
  
  public void setLabelFontScalingEnabled(boolean paramBoolean) {
    this.scaleLabelSizeWithFont = paramBoolean;
    setTextAppearanceActive(this.textAppearanceActive);
    setTextAppearanceInactive(this.textAppearanceInactive);
    setHorizontalTextAppearanceActive(this.horizontalTextAppearanceActive);
    setHorizontalTextAppearanceInactive(this.horizontalTextAppearanceInactive);
  }
  
  public void setLabelMaxLines(int paramInt) {
    this.smallLabel.setMaxLines(paramInt);
    this.largeLabel.setMaxLines(paramInt);
    this.expandedSmallLabel.setMaxLines(paramInt);
    this.expandedLargeLabel.setMaxLines(paramInt);
    if (Build.VERSION.SDK_INT > 34) {
      this.smallLabel.setGravity(17);
      this.largeLabel.setGravity(17);
    } else {
      TextView textView = this.smallLabel;
      if (paramInt > 1) {
        textView.setEllipsize(null);
        this.largeLabel.setEllipsize(null);
        this.smallLabel.setGravity(17);
        this.largeLabel.setGravity(17);
      } else {
        textView.setGravity(16);
        this.largeLabel.setGravity(16);
      } 
    } 
    requestLayout();
  }
  
  public void setLabelVisibilityMode(int paramInt) {
    if (this.labelVisibilityMode != paramInt) {
      this.labelVisibilityMode = paramInt;
      if (this.activeIndicatorResizeable && paramInt == 2) {
        this.activeIndicatorTransform = ACTIVE_INDICATOR_UNLABELED_TRANSFORM;
      } else {
        this.activeIndicatorTransform = ACTIVE_INDICATOR_LABELED_TRANSFORM;
      } 
      updateActiveIndicatorLayoutParams(getWidth());
      uw0 uw01 = this.itemData;
      if (uw01 != null)
        setChecked(uw01.isChecked()); 
    } 
  }
  
  public void setMeasureBottomPaddingFromLabelBaseline(boolean paramBoolean) {
    this.measurePaddingFromBaseline = paramBoolean;
    this.labelGroup.setMeasurePaddingFromBaseline(paramBoolean);
    this.smallLabel.setIncludeFontPadding(paramBoolean);
    this.largeLabel.setIncludeFontPadding(paramBoolean);
    this.expandedLabelGroup.setMeasurePaddingFromBaseline(paramBoolean);
    this.expandedSmallLabel.setIncludeFontPadding(paramBoolean);
    this.expandedLargeLabel.setIncludeFontPadding(paramBoolean);
    requestLayout();
  }
  
  public void setOnlyShowWhenExpanded(boolean paramBoolean) {
    this.onlyShowWhenExpanded = paramBoolean;
    k();
  }
  
  public void setShifting(boolean paramBoolean) {
    if (this.isShifting != paramBoolean) {
      this.isShifting = paramBoolean;
      uw0 uw01 = this.itemData;
      if (uw01 != null)
        setChecked(uw01.isChecked()); 
    } 
  }
  
  public void setShortcut(boolean paramBoolean, char paramChar) {}
  
  public void setTextAppearanceActive(int paramInt) {
    this.textAppearanceActive = paramInt;
    j(this.largeLabel, paramInt);
  }
  
  public void setTextAppearanceActiveBoldEnabled(boolean paramBoolean) {
    this.boldText = paramBoolean;
    setTextAppearanceActive(this.textAppearanceActive);
    setHorizontalTextAppearanceActive(this.horizontalTextAppearanceActive);
    TextView textView = this.largeLabel;
    textView.setTypeface(textView.getTypeface(), this.boldText);
    textView = this.expandedLargeLabel;
    textView.setTypeface(textView.getTypeface(), this.boldText);
  }
  
  public void setTextAppearanceInactive(int paramInt) {
    this.textAppearanceInactive = paramInt;
    TextView textView = this.smallLabel;
    if (textView != null) {
      h(textView, paramInt);
      b();
      textView.setMinimumHeight(wf2.E(textView.getContext(), paramInt));
      ColorStateList colorStateList = this.textColor;
      if (colorStateList != null)
        textView.setTextColor(colorStateList); 
    } 
  }
  
  public void setTextColor(ColorStateList paramColorStateList) {
    this.textColor = paramColorStateList;
    if (paramColorStateList != null) {
      this.smallLabel.setTextColor(paramColorStateList);
      this.largeLabel.setTextColor(paramColorStateList);
      this.expandedSmallLabel.setTextColor(paramColorStateList);
      this.expandedLargeLabel.setTextColor(paramColorStateList);
    } 
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.smallLabel.setText(paramCharSequence);
    this.largeLabel.setText(paramCharSequence);
    this.expandedSmallLabel.setText(paramCharSequence);
    this.expandedLargeLabel.setText(paramCharSequence);
    uw0 uw01 = this.itemData;
    if (uw01 == null || TextUtils.isEmpty(uw01.q))
      setContentDescription(paramCharSequence); 
    uw0 uw02 = this.itemData;
    CharSequence charSequence = paramCharSequence;
    if (uw02 != null)
      if (TextUtils.isEmpty(uw02.r)) {
        charSequence = paramCharSequence;
      } else {
        charSequence = this.itemData.r;
      }  
    qv.Y((View)this, charSequence);
  }
  
  public boolean showsIcon() {
    return true;
  }
  
  public void updateActiveIndicatorLayoutParams(int paramInt) {
    if (paramInt <= 0 && getVisibility() == 0)
      return; 
    int i = Math.min(this.activeIndicatorDesiredWidth, paramInt - this.activeIndicatorMarginHorizontal * 2);
    int j = this.activeIndicatorDesiredHeight;
    if (this.itemIconGravity == 1) {
      paramInt -= this.activeIndicatorExpandedMarginHorizontal * 2;
      i = this.activeIndicatorExpandedDesiredWidth;
      if (i != -1)
        if (i == -2) {
          paramInt = this.contentContainer.getMeasuredWidth();
        } else {
          paramInt = Math.min(i, paramInt);
        }  
      j = Math.max(this.activeIndicatorExpandedDesiredHeight, this.innerContentContainer.getMeasuredHeight());
      i = paramInt;
    } 
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)this.activeIndicatorView.getLayoutParams();
    paramInt = j;
    if (this.activeIndicatorResizeable) {
      paramInt = j;
      if (this.labelVisibilityMode == 2)
        paramInt = i; 
    } 
    layoutParams.height = paramInt;
    layoutParams.width = Math.max(0, i);
    this.activeIndicatorView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */