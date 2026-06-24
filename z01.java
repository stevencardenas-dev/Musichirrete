import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;

public abstract class z01 extends ViewGroup implements jx0 {
  public static final int[] CHECKED_STATE_SET = new int[] { 16842912 };
  
  public static final int DEFAULT_COLLAPSED_MAX_COUNT = 7;
  
  public static final int[] DISABLED_STATE_SET = new int[] { -16842910 };
  
  public static final int NO_PADDING = -1;
  
  public static final int NO_SELECTED_ITEM = -1;
  
  public final SparseArray<ub> badgeDrawables = new SparseArray();
  
  public y01[] buttons;
  
  public MenuItem checkedItem = null;
  
  public int collapsedMaxItemCount = 7;
  
  public boolean dividersEnabled = false;
  
  public boolean expanded;
  
  public int horizontalItemTextAppearanceActive;
  
  public int horizontalItemTextAppearanceInactive;
  
  public int iconLabelHorizontalSpacing = -1;
  
  public ColorStateList itemActiveIndicatorColor;
  
  public boolean itemActiveIndicatorEnabled;
  
  public int itemActiveIndicatorExpandedHeight;
  
  public int itemActiveIndicatorExpandedMarginHorizontal;
  
  public final Rect itemActiveIndicatorExpandedPadding = new Rect();
  
  public int itemActiveIndicatorExpandedWidth;
  
  public int itemActiveIndicatorHeight;
  
  public int itemActiveIndicatorLabelPadding = -1;
  
  public int itemActiveIndicatorMarginHorizontal;
  
  public boolean itemActiveIndicatorResizeable = false;
  
  public vl1 itemActiveIndicatorShapeAppearance;
  
  public int itemActiveIndicatorWidth;
  
  public Drawable itemBackground;
  
  public int itemBackgroundRes;
  
  public int itemGravity = 49;
  
  public int itemIconGravity;
  
  public int itemIconSize;
  
  public ColorStateList itemIconTint;
  
  public int itemPaddingBottom = -1;
  
  public int itemPaddingTop = -1;
  
  public y81 itemPool;
  
  public int itemPoolSize = 0;
  
  public ColorStateList itemRippleColor;
  
  public int itemTextAppearanceActive;
  
  public boolean itemTextAppearanceActiveBoldEnabled;
  
  public int itemTextAppearanceInactive;
  
  public final ColorStateList itemTextColorDefault = createDefaultColorStateList(16842808);
  
  public ColorStateList itemTextColorFromUser;
  
  public int labelMaxLines = 1;
  
  public int labelVisibilityMode;
  
  public boolean measurePaddingFromLabelBaseline;
  
  public x01 menu;
  
  public final View.OnClickListener onClickListener;
  
  public final SparseArray<View.OnTouchListener> onTouchListeners = new SparseArray();
  
  public a11 presenter;
  
  public boolean scaleLabelWithFont;
  
  public int selectedItemId = -1;
  
  public int selectedItemPosition = -1;
  
  public final qw1 set;
  
  public z01(Context paramContext) {
    super(paramContext);
    if (isInEditMode()) {
      this.set = null;
    } else {
      sa sa = new sa();
      this.set = sa;
      sa.P(0);
      sa.n();
      sa.N(zo2.P(getContext(), 2130969689, getResources().getInteger(2131361835)));
      sa.O(zo2.Q(getContext(), 2130969702, (TimeInterpolator)g5.b));
      sa.M(new kw1());
    } 
    this.onClickListener = new i1(5, this);
    setImportantForAccessibility(1);
  }
  
  public static void a(int paramInt) {
    if (paramInt != -1)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramInt);
    stringBuilder.append(" is not a valid view id");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private int getCollapsedVisibleItemCount() {
    return Math.min(this.collapsedMaxItemCount, this.menu.d);
  }
  
  private w01 getNewItem() {
    y81 y811 = this.itemPool;
    if (y811 != null) {
      w01 w01 = (w01)y811.b();
    } else {
      y811 = null;
    } 
    return (w01)((y811 == null) ? createNavigationBarItemView(getContext()) : y811);
  }
  
  private void setBadgeIfNeeded(w01 paramw01) {
    int i = paramw01.getId();
    if (i != -1) {
      ub ub = (ub)this.badgeDrawables.get(i);
      if (ub != null)
        paramw01.setBadge(ub); 
    } 
  }
  
  public void buildMenuView() {
    removeAllViews();
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null && this.itemPool != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01) {
          y81 y811 = this.itemPool;
          y011 = y011;
          y811.a(y011);
          y011.clear();
        } 
      } 
    } 
    throw null;
  }
  
  public ColorStateList createDefaultColorStateList(int paramInt) {
    TypedValue typedValue = new TypedValue();
    if (!getContext().getTheme().resolveAttribute(paramInt, typedValue, true))
      return null; 
    ColorStateList colorStateList = n21.y(getContext(), typedValue.resourceId);
    if (!getContext().getTheme().resolveAttribute(2130968930, typedValue, true))
      return null; 
    paramInt = typedValue.data;
    int j = colorStateList.getDefaultColor();
    int[] arrayOfInt3 = DISABLED_STATE_SET;
    int[] arrayOfInt1 = CHECKED_STATE_SET;
    int[] arrayOfInt2 = ViewGroup.EMPTY_STATE_SET;
    int i = colorStateList.getColorForState(arrayOfInt3, j);
    return new ColorStateList(new int[][] { arrayOfInt3, arrayOfInt1, arrayOfInt2 }, new int[] { i, paramInt, j });
  }
  
  public abstract w01 createNavigationBarItemView(Context paramContext);
  
  public w01 findItemView(int paramInt) {
    a(paramInt);
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01) {
          y011 = y011;
          if (y011.getId() == paramInt)
            return (w01)y011; 
        } 
      } 
    } 
    return null;
  }
  
  public int getActiveIndicatorLabelPadding() {
    return this.itemActiveIndicatorLabelPadding;
  }
  
  public ub getBadge(int paramInt) {
    return (ub)this.badgeDrawables.get(paramInt);
  }
  
  public SparseArray<ub> getBadgeDrawables() {
    return this.badgeDrawables;
  }
  
  public int getCurrentVisibleContentItemCount() {
    return this.expanded ? this.menu.c : getCollapsedVisibleItemCount();
  }
  
  public int getHorizontalItemTextAppearanceActive() {
    return this.horizontalItemTextAppearanceActive;
  }
  
  public int getHorizontalItemTextAppearanceInactive() {
    return this.horizontalItemTextAppearanceInactive;
  }
  
  public int getIconLabelHorizontalSpacing() {
    return this.iconLabelHorizontalSpacing;
  }
  
  public ColorStateList getIconTintList() {
    return this.itemIconTint;
  }
  
  public ColorStateList getItemActiveIndicatorColor() {
    return this.itemActiveIndicatorColor;
  }
  
  public boolean getItemActiveIndicatorEnabled() {
    return this.itemActiveIndicatorEnabled;
  }
  
  public int getItemActiveIndicatorExpandedHeight() {
    return this.itemActiveIndicatorExpandedHeight;
  }
  
  public int getItemActiveIndicatorExpandedMarginHorizontal() {
    return this.itemActiveIndicatorExpandedMarginHorizontal;
  }
  
  public int getItemActiveIndicatorExpandedWidth() {
    return this.itemActiveIndicatorExpandedWidth;
  }
  
  public int getItemActiveIndicatorHeight() {
    return this.itemActiveIndicatorHeight;
  }
  
  public int getItemActiveIndicatorMarginHorizontal() {
    return this.itemActiveIndicatorMarginHorizontal;
  }
  
  public vl1 getItemActiveIndicatorShapeAppearance() {
    return this.itemActiveIndicatorShapeAppearance;
  }
  
  public int getItemActiveIndicatorWidth() {
    return this.itemActiveIndicatorWidth;
  }
  
  public Drawable getItemBackground() {
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null && arrayOfY01.length > 0) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          return ((w01)y011).getBackground(); 
      } 
    } 
    return this.itemBackground;
  }
  
  @Deprecated
  public int getItemBackgroundRes() {
    return this.itemBackgroundRes;
  }
  
  public int getItemGravity() {
    return this.itemGravity;
  }
  
  public int getItemIconGravity() {
    return this.itemIconGravity;
  }
  
  public int getItemIconSize() {
    return this.itemIconSize;
  }
  
  public int getItemPaddingBottom() {
    return this.itemPaddingBottom;
  }
  
  public int getItemPaddingTop() {
    return this.itemPaddingTop;
  }
  
  public ColorStateList getItemRippleColor() {
    return this.itemRippleColor;
  }
  
  public int getItemTextAppearanceActive() {
    return this.itemTextAppearanceActive;
  }
  
  public int getItemTextAppearanceInactive() {
    return this.itemTextAppearanceInactive;
  }
  
  public ColorStateList getItemTextColor() {
    return this.itemTextColorFromUser;
  }
  
  public int getLabelMaxLines() {
    return this.labelMaxLines;
  }
  
  public int getLabelVisibilityMode() {
    return this.labelVisibilityMode;
  }
  
  public x01 getMenu() {
    return this.menu;
  }
  
  public ub getOrCreateBadge(int paramInt) {
    a(paramInt);
    ub ub2 = (ub)this.badgeDrawables.get(paramInt);
    ub ub1 = ub2;
    if (ub2 == null) {
      ub1 = new ub(getContext());
      this.badgeDrawables.put(paramInt, ub1);
    } 
    w01 w01 = findItemView(paramInt);
    if (w01 != null)
      w01.setBadge(ub1); 
    return ub1;
  }
  
  public boolean getScaleLabelTextWithFont() {
    return this.scaleLabelWithFont;
  }
  
  public int getSelectedItemId() {
    return this.selectedItemId;
  }
  
  public int getSelectedItemPosition() {
    return this.selectedItemPosition;
  }
  
  public int getWindowAnimations() {
    return 0;
  }
  
  public void initialize(rw0 paramrw0) {
    this.menu = new x01(paramrw0);
  }
  
  public boolean isExpanded() {
    return this.expanded;
  }
  
  public boolean isItemActiveIndicatorResizeable() {
    return this.itemActiveIndicatorResizeable;
  }
  
  public boolean isShifting(int paramInt1, int paramInt2) {
    return (paramInt1 == -1) ? ((paramInt2 > 3)) : ((paramInt1 == 0));
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getCurrentVisibleContentItemCount(), false, 1));
  }
  
  public void removeBadge(int paramInt) {
    a(paramInt);
    w01 w01 = findItemView(paramInt);
    if (w01 != null)
      w01.removeBadge(); 
    this.badgeDrawables.put(paramInt, null);
  }
  
  public void restoreBadgeDrawables(SparseArray<ub> paramSparseArray) {
    boolean bool = false;
    byte b;
    for (b = 0; b < paramSparseArray.size(); b++) {
      int i = paramSparseArray.keyAt(b);
      if (this.badgeDrawables.indexOfKey(i) < 0)
        this.badgeDrawables.append(i, paramSparseArray.get(i)); 
    } 
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (b = bool; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01) {
          SparseArray<ub> sparseArray = this.badgeDrawables;
          y011 = y011;
          ub ub = (ub)sparseArray.get(y011.getId());
          if (ub != null)
            y011.setBadge(ub); 
        } 
      } 
    } 
  }
  
  public void setActiveIndicatorLabelPadding(int paramInt) {
    this.itemActiveIndicatorLabelPadding = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setActiveIndicatorLabelPadding(paramInt); 
      } 
    } 
  }
  
  public void setCheckedItem(MenuItem paramMenuItem) {
    if (this.checkedItem != paramMenuItem && paramMenuItem.isCheckable()) {
      MenuItem menuItem = this.checkedItem;
      if (menuItem != null && menuItem.isChecked())
        this.checkedItem.setChecked(false); 
      paramMenuItem.setChecked(true);
      this.checkedItem = paramMenuItem;
    } 
  }
  
  public void setCollapsedMaxItemCount(int paramInt) {
    this.collapsedMaxItemCount = paramInt;
  }
  
  public void setExpanded(boolean paramBoolean) {
    this.expanded = paramBoolean;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++)
        arrayOfY01[b].setExpanded(paramBoolean); 
    } 
  }
  
  public void setHorizontalItemTextAppearanceActive(int paramInt) {
    this.horizontalItemTextAppearanceActive = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setHorizontalTextAppearanceActive(paramInt); 
      } 
    } 
  }
  
  public void setHorizontalItemTextAppearanceInactive(int paramInt) {
    this.horizontalItemTextAppearanceInactive = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setHorizontalTextAppearanceInactive(paramInt); 
      } 
    } 
  }
  
  public void setIconLabelHorizontalSpacing(int paramInt) {
    this.iconLabelHorizontalSpacing = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setIconLabelHorizontalSpacing(paramInt); 
      } 
    } 
  }
  
  public void setIconTintList(ColorStateList paramColorStateList) {
    this.itemIconTint = paramColorStateList;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setIconTintList(paramColorStateList); 
      } 
    } 
  }
  
  public void setItemActiveIndicatorColor(ColorStateList paramColorStateList) {
    this.itemActiveIndicatorColor = paramColorStateList;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01) {
          w01 w01 = (w01)y011;
          if (this.itemActiveIndicatorShapeAppearance != null && this.itemActiveIndicatorColor != null) {
            ws0 ws0 = new ws0(this.itemActiveIndicatorShapeAppearance);
            ws0.o(this.itemActiveIndicatorColor);
          } else {
            y011 = null;
          } 
          w01.setActiveIndicatorDrawable((Drawable)y011);
        } 
      } 
    } 
  }
  
  public void setItemActiveIndicatorEnabled(boolean paramBoolean) {
    this.itemActiveIndicatorEnabled = paramBoolean;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setActiveIndicatorEnabled(paramBoolean); 
      } 
    } 
  }
  
  public void setItemActiveIndicatorExpandedHeight(int paramInt) {
    this.itemActiveIndicatorExpandedHeight = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setActiveIndicatorExpandedHeight(paramInt); 
      } 
    } 
  }
  
  public void setItemActiveIndicatorExpandedMarginHorizontal(int paramInt) {
    this.itemActiveIndicatorExpandedMarginHorizontal = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setActiveIndicatorExpandedMarginHorizontal(paramInt); 
      } 
    } 
  }
  
  public void setItemActiveIndicatorExpandedPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Rect rect = this.itemActiveIndicatorExpandedPadding;
    rect.left = paramInt1;
    rect.top = paramInt2;
    rect.right = paramInt3;
    rect.bottom = paramInt4;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      paramInt2 = arrayOfY01.length;
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
        y01 y011 = arrayOfY01[paramInt1];
        if (y011 instanceof w01)
          ((w01)y011).setActiveIndicatorExpandedPadding(this.itemActiveIndicatorExpandedPadding); 
      } 
    } 
  }
  
  public void setItemActiveIndicatorExpandedWidth(int paramInt) {
    this.itemActiveIndicatorExpandedWidth = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setActiveIndicatorExpandedWidth(paramInt); 
      } 
    } 
  }
  
  public void setItemActiveIndicatorHeight(int paramInt) {
    this.itemActiveIndicatorHeight = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setActiveIndicatorHeight(paramInt); 
      } 
    } 
  }
  
  public void setItemActiveIndicatorMarginHorizontal(int paramInt) {
    this.itemActiveIndicatorMarginHorizontal = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setActiveIndicatorMarginHorizontal(paramInt); 
      } 
    } 
  }
  
  public void setItemActiveIndicatorResizeable(boolean paramBoolean) {
    this.itemActiveIndicatorResizeable = paramBoolean;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setActiveIndicatorResizeable(paramBoolean); 
      } 
    } 
  }
  
  public void setItemActiveIndicatorShapeAppearance(vl1 paramvl1) {
    this.itemActiveIndicatorShapeAppearance = paramvl1;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01) {
          w01 w01 = (w01)y011;
          if (this.itemActiveIndicatorShapeAppearance != null && this.itemActiveIndicatorColor != null) {
            ws0 ws0 = new ws0(this.itemActiveIndicatorShapeAppearance);
            ws0.o(this.itemActiveIndicatorColor);
          } else {
            y011 = null;
          } 
          w01.setActiveIndicatorDrawable((Drawable)y011);
        } 
      } 
    } 
  }
  
  public void setItemActiveIndicatorWidth(int paramInt) {
    this.itemActiveIndicatorWidth = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setActiveIndicatorWidth(paramInt); 
      } 
    } 
  }
  
  public void setItemBackground(Drawable paramDrawable) {
    this.itemBackground = paramDrawable;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setItemBackground(paramDrawable); 
      } 
    } 
  }
  
  public void setItemBackgroundRes(int paramInt) {
    this.itemBackgroundRes = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setItemBackground(paramInt); 
      } 
    } 
  }
  
  public void setItemGravity(int paramInt) {
    this.itemGravity = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setItemGravity(paramInt); 
      } 
    } 
  }
  
  public void setItemIconGravity(int paramInt) {
    this.itemIconGravity = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setItemIconGravity(paramInt); 
      } 
    } 
  }
  
  public void setItemIconSize(int paramInt) {
    this.itemIconSize = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setIconSize(paramInt); 
      } 
    } 
  }
  
  public void setItemOnTouchListener(int paramInt, View.OnTouchListener paramOnTouchListener) {
    SparseArray<View.OnTouchListener> sparseArray = this.onTouchListeners;
    if (paramOnTouchListener == null) {
      sparseArray.remove(paramInt);
    } else {
      sparseArray.put(paramInt, paramOnTouchListener);
    } 
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01 && y011.getItemData() != null && (y011.getItemData()).a == paramInt)
          ((w01)y011).setOnTouchListener(paramOnTouchListener); 
      } 
    } 
  }
  
  public void setItemPaddingBottom(int paramInt) {
    this.itemPaddingBottom = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (paramInt = 0; paramInt < i; paramInt++) {
        y01 y011 = arrayOfY01[paramInt];
        if (y011 instanceof w01)
          ((w01)y011).setItemPaddingBottom(this.itemPaddingBottom); 
      } 
    } 
  }
  
  public void setItemPaddingTop(int paramInt) {
    this.itemPaddingTop = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setItemPaddingTop(paramInt); 
      } 
    } 
  }
  
  public void setItemRippleColor(ColorStateList paramColorStateList) {
    this.itemRippleColor = paramColorStateList;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setItemRippleColor(paramColorStateList); 
      } 
    } 
  }
  
  public void setItemTextAppearanceActive(int paramInt) {
    this.itemTextAppearanceActive = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setTextAppearanceActive(paramInt); 
      } 
    } 
  }
  
  public void setItemTextAppearanceActiveBoldEnabled(boolean paramBoolean) {
    this.itemTextAppearanceActiveBoldEnabled = paramBoolean;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setTextAppearanceActiveBoldEnabled(paramBoolean); 
      } 
    } 
  }
  
  public void setItemTextAppearanceInactive(int paramInt) {
    this.itemTextAppearanceInactive = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setTextAppearanceInactive(paramInt); 
      } 
    } 
  }
  
  public void setItemTextColor(ColorStateList paramColorStateList) {
    this.itemTextColorFromUser = paramColorStateList;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setTextColor(paramColorStateList); 
      } 
    } 
  }
  
  public void setLabelFontScalingEnabled(boolean paramBoolean) {
    this.scaleLabelWithFont = paramBoolean;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setLabelFontScalingEnabled(paramBoolean); 
      } 
    } 
  }
  
  public void setLabelMaxLines(int paramInt) {
    this.labelMaxLines = paramInt;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setLabelMaxLines(paramInt); 
      } 
    } 
  }
  
  public void setLabelVisibilityMode(int paramInt) {
    this.labelVisibilityMode = paramInt;
  }
  
  public void setMeasurePaddingFromLabelBaseline(boolean paramBoolean) {
    this.measurePaddingFromLabelBaseline = paramBoolean;
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).setMeasureBottomPaddingFromLabelBaseline(paramBoolean); 
      } 
    } 
  }
  
  public void setPresenter(a11 parama11) {}
  
  public void setSubmenuDividersEnabled(boolean paramBoolean) {
    if (this.dividersEnabled != paramBoolean) {
      this.dividersEnabled = paramBoolean;
      y01[] arrayOfY01 = this.buttons;
      if (arrayOfY01 != null) {
        int i = arrayOfY01.length;
        for (byte b = 0; b < i; b++) {
          y01 y011 = arrayOfY01[b];
          if (y011 instanceof s01)
            ((s01)y011).a(paramBoolean); 
        } 
      } 
    } 
  }
  
  public void tryRestoreSelectedItemId(int paramInt) {
    int i = this.menu.b.size();
    for (byte b = 0; b < i; b++) {
      MenuItem menuItem = this.menu.b.get(b);
      if (paramInt == menuItem.getItemId()) {
        this.selectedItemId = paramInt;
        this.selectedItemPosition = b;
        setCheckedItem(menuItem);
        return;
      } 
    } 
  }
  
  public void updateActiveIndicator(int paramInt) {
    y01[] arrayOfY01 = this.buttons;
    if (arrayOfY01 != null) {
      int i = arrayOfY01.length;
      for (byte b = 0; b < i; b++) {
        y01 y011 = arrayOfY01[b];
        if (y011 instanceof w01)
          ((w01)y011).updateActiveIndicatorLayoutParams(paramInt); 
      } 
    } 
  }
  
  public void updateMenuView() {
    if (this.menu == null || this.buttons == null)
      return; 
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */