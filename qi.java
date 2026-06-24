import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public abstract class qi extends FrameLayout {
  public static final int[] h = new int[] { 16842801 };
  
  public boolean b;
  
  public boolean c;
  
  public final Rect e;
  
  public final Rect f;
  
  public final g7 g;
  
  public qi(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ColorStateList colorStateList;
    Rect rect = new Rect();
    this.e = rect;
    this.f = new Rect();
    g7 g71 = new g7(this);
    this.g = g71;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ec1.a, paramInt, 2131951913);
    if (typedArray.hasValue(2)) {
      colorStateList = typedArray.getColorStateList(2);
    } else {
      TypedArray typedArray1 = getContext().obtainStyledAttributes(h);
      paramInt = typedArray1.getColor(0, 0);
      typedArray1.recycle();
      float[] arrayOfFloat = new float[3];
      Color.colorToHSV(paramInt, arrayOfFloat);
      if (arrayOfFloat[2] > 0.5F) {
        paramInt = getResources().getColor(2131099713);
      } else {
        paramInt = getResources().getColor(2131099712);
      } 
      colorStateList = ColorStateList.valueOf(paramInt);
    } 
    float f4 = typedArray.getDimension(3, 0.0F);
    float f2 = typedArray.getDimension(4, 0.0F);
    float f3 = typedArray.getDimension(5, 0.0F);
    this.b = typedArray.getBoolean(7, false);
    this.c = typedArray.getBoolean(6, true);
    paramInt = typedArray.getDimensionPixelSize(8, 0);
    rect.left = typedArray.getDimensionPixelSize(10, paramInt);
    rect.top = typedArray.getDimensionPixelSize(12, paramInt);
    rect.right = typedArray.getDimensionPixelSize(11, paramInt);
    rect.bottom = typedArray.getDimensionPixelSize(9, paramInt);
    float f1 = f3;
    if (f2 > f3)
      f1 = f2; 
    typedArray.getDimensionPixelSize(0, 0);
    typedArray.getDimensionPixelSize(1, 0);
    typedArray.recycle();
    ih1 ih1 = new ih1(colorStateList, f4);
    g71.c = ih1;
    setBackgroundDrawable(ih1);
    setClipToOutline(true);
    setElevation(f2);
    m92.S(g71, f1);
  }
  
  public ColorStateList getCardBackgroundColor() {
    return ((ih1)this.g.c).h;
  }
  
  public float getCardElevation() {
    return ((qi)this.g.e).getElevation();
  }
  
  public int getContentPaddingBottom() {
    return this.e.bottom;
  }
  
  public int getContentPaddingLeft() {
    return this.e.left;
  }
  
  public int getContentPaddingRight() {
    return this.e.right;
  }
  
  public int getContentPaddingTop() {
    return this.e.top;
  }
  
  public float getMaxCardElevation() {
    return ((ih1)this.g.c).e;
  }
  
  public boolean getPreventCornerOverlap() {
    return this.c;
  }
  
  public float getRadius() {
    return ((ih1)this.g.c).a;
  }
  
  public boolean getUseCompatPadding() {
    return this.b;
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCardBackgroundColor(int paramInt) {
    ColorStateList colorStateList2 = ColorStateList.valueOf(paramInt);
    ih1 ih1 = (ih1)this.g.c;
    ColorStateList colorStateList1 = colorStateList2;
    if (colorStateList2 == null) {
      ih1.getClass();
      colorStateList1 = ColorStateList.valueOf(0);
    } 
    ih1.h = colorStateList1;
    ih1.b.setColor(colorStateList1.getColorForState(ih1.getState(), ih1.h.getDefaultColor()));
    ih1.invalidateSelf();
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList) {
    ih1 ih1 = (ih1)this.g.c;
    ColorStateList colorStateList = paramColorStateList;
    if (paramColorStateList == null) {
      ih1.getClass();
      colorStateList = ColorStateList.valueOf(0);
    } 
    ih1.h = colorStateList;
    ih1.b.setColor(colorStateList.getColorForState(ih1.getState(), ih1.h.getDefaultColor()));
    ih1.invalidateSelf();
  }
  
  public void setCardElevation(float paramFloat) {
    ((qi)this.g.e).setElevation(paramFloat);
  }
  
  public void setMaxCardElevation(float paramFloat) {
    m92.S(this.g, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt) {
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt) {
    super.setMinimumWidth(paramInt);
  }
  
  public final void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public final void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean) {
    if (paramBoolean != this.c) {
      this.c = paramBoolean;
      g7 g71 = this.g;
      m92.S(g71, ((ih1)g71.c).e);
    } 
  }
  
  public void setRadius(float paramFloat) {
    ih1 ih1 = (ih1)this.g.c;
    if (paramFloat == ih1.a)
      return; 
    ih1.a = paramFloat;
    ih1.b(null);
    ih1.invalidateSelf();
  }
  
  public void setUseCompatPadding(boolean paramBoolean) {
    if (this.b != paramBoolean) {
      this.b = paramBoolean;
      g7 g71 = this.g;
      m92.S(g71, ((ih1)g71.c).e);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */