package in.krosbits.android.widgets;

import ag0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import cc1;
import m92;

public class SmartImageView extends ImageView implements View.OnLongClickListener {
  public int b;
  
  public int c;
  
  public boolean e = false;
  
  public View.OnLongClickListener f;
  
  public SmartImageView(Context paramContext) {
    super(paramContext);
  }
  
  public SmartImageView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    if (!isInEditMode())
      a(paramContext, paramAttributeSet); 
  }
  
  public SmartImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    if (!isInEditMode())
      a(paramContext, paramAttributeSet); 
  }
  
  public SmartImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    if (!isInEditMode())
      a(paramContext, paramAttributeSet); 
  }
  
  public final void a(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, cc1.g);
    this.b = typedArray.getInt(1, -1);
    this.c = typedArray.getColor(0, 0);
    int i = this.b;
    if (i >= 0) {
      i = m92.h[i];
      setAlpha(Color.alpha(i));
      setColorFilter(i | 0xFF000000);
    } 
    i = this.c;
    if (i != 0) {
      setAlpha(Color.alpha(i));
      setColorFilter(this.c | 0xFF000000);
    } 
    typedArray.recycle();
  }
  
  public final boolean onLongClick(View paramView) {
    View.OnLongClickListener onLongClickListener = this.f;
    if (onLongClickListener != null && onLongClickListener != this && onLongClickListener.onLongClick(paramView))
      return true; 
    if (this.e) {
      ag0.G0((View)this);
      return true;
    } 
    return false;
  }
  
  public void setColorTint(int paramInt) {
    this.c = paramInt;
    if (paramInt != 0) {
      setAlpha(Color.alpha(paramInt));
      setColorFilter(paramInt | 0xFF000000);
    } 
  }
  
  public void setColorTintIndex(int paramInt) {
    if (this.b == paramInt)
      return; 
    this.b = paramInt;
    if (paramInt >= 0) {
      paramInt = m92.h[paramInt];
      setAlpha(Color.alpha(paramInt));
      setColorFilter(paramInt | 0xFF000000);
      return;
    } 
    setColorFilter(null);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener) {
    super.setOnClickListener(paramOnClickListener);
    if (!this.e)
      setOnLongClickListener(this); 
    this.e = true;
  }
  
  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener) {
    super.setOnLongClickListener(this);
    if (this != paramOnLongClickListener) {
      this.f = paramOnLongClickListener;
      this.e = true;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\SmartImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */