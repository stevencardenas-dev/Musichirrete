package in.krosbits.android.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import m92;
import q70;
import vd1;

public class RecyclerViewScrollBar extends View {
  public int b;
  
  public int c;
  
  public int e;
  
  public int f;
  
  public Paint g;
  
  public Paint h;
  
  public boolean i;
  
  public q70 j;
  
  public RectF k = new RectF();
  
  public RecyclerView l;
  
  public float m;
  
  public int n;
  
  public int o;
  
  public int p;
  
  public float q = -1.0F;
  
  public RecyclerViewScrollBar(Context paramContext) {
    super(paramContext);
    a();
  }
  
  public RecyclerViewScrollBar(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public RecyclerViewScrollBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  public RecyclerViewScrollBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a();
  }
  
  public final void a() {
    setWillNotDraw(false);
    setWillNotCacheDrawing(false);
    setContentDescription(null);
    setLayerType(1, null);
    this.e = (int)(getResources().getDimension(2131165390) * 8.0F);
    this.f = (int)(getResources().getDimension(2131165391) * 5.0F);
    int i = getPaddingLeft();
    getPaddingRight();
    RectF rectF = new RectF();
    this.k = rectF;
    float f = i;
    rectF.left = f;
    rectF.right = f + this.e;
    this.c = (int)(this.f * 1.5D);
    Paint paint1 = new Paint();
    this.g = paint1;
    int[] arrayOfInt = m92.h;
    paint1.setColor(arrayOfInt[8]);
    Paint paint2 = this.g;
    Paint.Style style = Paint.Style.FILL;
    paint2.setStyle(style);
    this.g.setAntiAlias(true);
    paint2 = new Paint();
    this.h = paint2;
    paint2.setColor(arrayOfInt[3]);
    this.h.setStyle(style);
    this.h.setAntiAlias(true);
    this.j = new q70(2, this);
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.j = null;
  }
  
  public final void onDraw(Canvas paramCanvas) {
    if (this.l != null) {
      float f = this.m;
      f = (this.b - this.f) * f;
      if (f >= 0.0F) {
        this.k.top = ((int)f + (int)(getResources().getDimension(2131165390) * 4.0F));
        this.k.bottom = ((int)(f + this.f) - (int)(getResources().getDimension(2131165390) * 4.0F));
        boolean bool = this.i;
        RectF rectF = this.k;
        int i = this.e;
        if (bool) {
          f = i / 2.0F;
          paramCanvas.drawRoundRect(rectF, f, f, this.h);
          return;
        } 
        f = i / 2.0F;
        paramCanvas.drawRoundRect(rectF, f, f, this.g);
      } 
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    View.MeasureSpec.getMode(paramInt1);
    View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int i = View.MeasureSpec.getSize(paramInt2);
    if (j == 1073741824) {
      paramInt1 = this.c;
      if (i < paramInt1) {
        this.b = paramInt1;
      } else {
        this.b = paramInt2;
      } 
    } else if (paramInt1 == Integer.MIN_VALUE) {
      this.b = this.c;
    } 
    paramInt2 = this.e;
    paramInt1 = getPaddingLeft();
    setMeasuredDimension(getPaddingRight() + paramInt1 + paramInt2, this.b);
    this.b = getHeight();
    getWidth();
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.j == null)
      return; 
    getWidth();
    this.b = getHeight();
    this.j.b(this.l, 0, 0);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3) {
            invalidate();
            return true;
          } 
        } else {
          if (!this.i) {
            float f = this.q;
            if (f >= 0.0F && Math.abs(f - paramMotionEvent.getY()) > MyApplication.p * 4.0F)
              this.i = true; 
          } 
          if (this.i) {
            float f2 = this.l.getAdapter().c();
            float f1 = paramMotionEvent.getY();
            i = this.f;
            i = (int)((f1 - (i / 2)) * f2 / (this.b - i));
            if (i >= RecyclerView.M(this.l.getChildAt(0))) {
              RecyclerView recyclerView = this.l;
              if (i <= RecyclerView.M(recyclerView.getChildAt(recyclerView.getChildCount() - 1))) {
                f1 = paramMotionEvent.getY();
                i = this.f;
                i = (int)((f1 - (i / 2)) * (this.n - this.o) / (this.b - i));
                this.l.scrollBy(0, i - this.p);
                invalidate();
                return true;
              } 
            } 
            this.l.k0(i);
          } 
          invalidate();
          return true;
        }  
      this.i = false;
      this.q = -1.0F;
    } else {
      float f = paramMotionEvent.getY();
      this.q = f;
      RectF rectF = this.k;
      if (f >= rectF.top && f <= rectF.bottom)
        this.i = true; 
    } 
    invalidate();
    return true;
  }
  
  public final void onVisibilityChanged(View paramView, int paramInt) {
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt == 0 && this.j != null) {
      getWidth();
      this.b = getHeight();
      this.j.b(this.l, 0, 0);
    } 
  }
  
  public void setRecyclerView(RecyclerView paramRecyclerView) {
    q70 q701 = this.j;
    if (q701 == null)
      return; 
    this.l = paramRecyclerView;
    ArrayList arrayList = paramRecyclerView.l0;
    if (arrayList != null)
      arrayList.remove(q701); 
    paramRecyclerView.i((vd1)this.j);
    this.j.b(paramRecyclerView, 0, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\RecyclerViewScrollBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */