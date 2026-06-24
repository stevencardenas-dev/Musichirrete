import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.RatingBar;

public final class h7 extends RatingBar {
  public final g7 b;
  
  public h7(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 2130969851);
    ku1.a(getContext(), (View)this);
    g7 g71 = new g7((AbsSeekBar)this);
    this.b = g71;
    g71.A(paramAttributeSet, 2130969851);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    /* monitor enter ThisExpression{ObjectType{h7}} */
    try {
      super.onMeasure(paramInt1, paramInt2);
      Bitmap bitmap = (Bitmap)this.b.e;
      if (bitmap != null)
        setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), paramInt1, 0), getMeasuredHeight()); 
    } finally {
      Exception exception;
    } 
    /* monitor exit ThisExpression{ObjectType{h7}} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */