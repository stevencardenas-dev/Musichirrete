package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import fc1;
import gq;

public class Placeholder extends View {
  public int b = -1;
  
  public View c = null;
  
  public int e = 4;
  
  public Placeholder(Context paramContext) {
    super(paramContext);
    a(null);
  }
  
  public Placeholder(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }
  
  public Placeholder(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
  }
  
  public Placeholder(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1);
    a(paramAttributeSet);
  }
  
  public final void a(AttributeSet paramAttributeSet) {
    setVisibility(this.e);
    this.b = -1;
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, fc1.c);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == 0) {
          this.b = typedArray.getResourceId(j, this.b);
        } else if (j == 1) {
          this.e = typedArray.getInt(j, this.e);
        } 
      } 
      typedArray.recycle();
    } 
  }
  
  public View getContent() {
    return this.c;
  }
  
  public int getEmptyVisibility() {
    return this.e;
  }
  
  public final void onDraw(Canvas paramCanvas) {
    if (isInEditMode()) {
      paramCanvas.drawRGB(223, 223, 223);
      Paint paint = new Paint();
      paint.setARGB(255, 210, 210, 210);
      paint.setTextAlign(Paint.Align.CENTER);
      paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
      Rect rect = new Rect();
      paramCanvas.getClipBounds(rect);
      paint.setTextSize(rect.height());
      int i = rect.height();
      int j = rect.width();
      paint.setTextAlign(Paint.Align.LEFT);
      paint.getTextBounds("?", 0, 1, rect);
      float f3 = j / 2.0F;
      float f4 = rect.width() / 2.0F;
      float f1 = rect.left;
      float f2 = i / 2.0F;
      paramCanvas.drawText("?", f3 - f4 - f1, rect.height() / 2.0F + f2 - rect.bottom, paint);
    } 
  }
  
  public void setContentId(int paramInt) {
    if (this.b != paramInt) {
      View view = this.c;
      if (view != null) {
        view.setVisibility(0);
        ((gq)this.c.getLayoutParams()).f0 = false;
        this.c = null;
      } 
      this.b = paramInt;
      if (paramInt != -1) {
        view = ((View)getParent()).findViewById(paramInt);
        if (view != null)
          view.setVisibility(8); 
      } 
    } 
  }
  
  public void setEmptyVisibility(int paramInt) {
    this.e = paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\constraintlayout\widget\Placeholder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */