package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import gm1;
import hm1;
import n21;
import qv;
import vl1;
import wf2;
import wl1;
import ws0;
import xl1;
import zb1;

public class ShapeableImageView extends AppCompatImageView implements gm1 {
  public final xl1 f = wl1.a;
  
  public final RectF g;
  
  public final RectF h;
  
  public final Paint i;
  
  public final Paint j;
  
  public final Path k = new Path();
  
  public ColorStateList l;
  
  public ws0 m;
  
  public vl1 n;
  
  public float o;
  
  public final Path p;
  
  public final int q;
  
  public final int r;
  
  public final int s;
  
  public final int t;
  
  public final int u;
  
  public final int v;
  
  public boolean w = false;
  
  public ShapeableImageView(Context paramContext) {
    this(paramContext, null, 0);
  }
  
  public ShapeableImageView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ShapeableImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952920), paramAttributeSet, paramInt);
    paramContext = getContext();
    Paint paint2 = new Paint();
    this.j = paint2;
    paint2.setAntiAlias(true);
    paint2.setColor(-1);
    paint2.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    this.g = new RectF();
    this.h = new RectF();
    this.p = new Path();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, zb1.B, paramInt, 2131952920);
    setLayerType(2, null);
    this.l = wf2.u(paramContext, typedArray, 9);
    this.o = typedArray.getDimensionPixelSize(10, 0);
    int i = typedArray.getDimensionPixelSize(0, 0);
    this.q = i;
    this.r = i;
    this.s = i;
    this.t = i;
    this.q = typedArray.getDimensionPixelSize(3, i);
    this.r = typedArray.getDimensionPixelSize(6, i);
    this.s = typedArray.getDimensionPixelSize(4, i);
    this.t = typedArray.getDimensionPixelSize(1, i);
    this.u = typedArray.getDimensionPixelSize(5, -2147483648);
    this.v = typedArray.getDimensionPixelSize(2, -2147483648);
    typedArray.recycle();
    Paint paint1 = new Paint();
    this.i = paint1;
    paint1.setStyle(Paint.Style.STROKE);
    paint1.setAntiAlias(true);
    this.n = vl1.b(paramContext, paramAttributeSet, paramInt, 2131952920).a();
    setOutlineProvider((ViewOutlineProvider)new hm1(this));
  }
  
  public final boolean c() {
    return (getLayoutDirection() == 1);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    float f2 = getPaddingLeft();
    float f4 = getPaddingTop();
    float f3 = (paramInt1 - getPaddingRight());
    float f1 = (paramInt2 - getPaddingBottom());
    RectF rectF2 = this.g;
    rectF2.set(f2, f4, f3, f1);
    vl1 vl11 = this.n;
    xl1 xl11 = this.f;
    Path path1 = this.k;
    xl11.a(vl11, null, 1.0F, rectF2, null, path1);
    Path path2 = this.p;
    path2.rewind();
    path2.addPath(path1);
    f2 = paramInt1;
    f1 = paramInt2;
    RectF rectF1 = this.h;
    rectF1.set(0.0F, 0.0F, f2, f1);
    path2.addRect(rectF1, Path.Direction.CCW);
  }
  
  public int getContentPaddingBottom() {
    return this.t;
  }
  
  public final int getContentPaddingEnd() {
    int i = this.v;
    return (i != Integer.MIN_VALUE) ? i : (c() ? this.q : this.s);
  }
  
  public int getContentPaddingLeft() {
    int j = this.v;
    int i = this.u;
    if (i != Integer.MIN_VALUE || j != Integer.MIN_VALUE) {
      if (c() && j != Integer.MIN_VALUE)
        return j; 
      if (!c() && i != Integer.MIN_VALUE)
        return i; 
    } 
    return this.q;
  }
  
  public int getContentPaddingRight() {
    int i = this.v;
    int j = this.u;
    if (j != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
      if (c() && j != Integer.MIN_VALUE)
        return j; 
      if (!c() && i != Integer.MIN_VALUE)
        return i; 
    } 
    return this.s;
  }
  
  public final int getContentPaddingStart() {
    int i = this.u;
    return (i != Integer.MIN_VALUE) ? i : (c() ? this.s : this.q);
  }
  
  public int getContentPaddingTop() {
    return this.r;
  }
  
  public int getPaddingBottom() {
    return super.getPaddingBottom() - getContentPaddingBottom();
  }
  
  public int getPaddingEnd() {
    return super.getPaddingEnd() - getContentPaddingEnd();
  }
  
  public int getPaddingLeft() {
    return super.getPaddingLeft() - getContentPaddingLeft();
  }
  
  public int getPaddingRight() {
    return super.getPaddingRight() - getContentPaddingRight();
  }
  
  public int getPaddingStart() {
    return super.getPaddingStart() - getContentPaddingStart();
  }
  
  public int getPaddingTop() {
    return super.getPaddingTop() - getContentPaddingTop();
  }
  
  public vl1 getShapeAppearanceModel() {
    return this.n;
  }
  
  public ColorStateList getStrokeColor() {
    return this.l;
  }
  
  public float getStrokeWidth() {
    return this.o;
  }
  
  public final void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    paramCanvas.drawPath(this.p, this.j);
    if (this.l != null) {
      float f = this.o;
      Paint paint = this.i;
      paint.setStrokeWidth(f);
      int i = this.l.getColorForState(getDrawableState(), this.l.getDefaultColor());
      if (this.o > 0.0F && i != 0) {
        paint.setColor(i);
        paramCanvas.drawPath(this.k, paint);
      } 
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (this.w || !isLayoutDirectionResolved())
      return; 
    this.w = true;
    if (isPaddingRelative() || this.u != Integer.MIN_VALUE || this.v != Integer.MIN_VALUE) {
      setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
      return;
    } 
    setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    d(paramInt1, paramInt2);
  }
  
  public final void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setPadding(getContentPaddingLeft() + paramInt1, getContentPaddingTop() + paramInt2, getContentPaddingRight() + paramInt3, getContentPaddingBottom() + paramInt4);
  }
  
  public final void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setPaddingRelative(getContentPaddingStart() + paramInt1, getContentPaddingTop() + paramInt2, getContentPaddingEnd() + paramInt3, getContentPaddingBottom() + paramInt4);
  }
  
  public void setShapeAppearanceModel(vl1 paramvl1) {
    this.n = paramvl1;
    ws0 ws01 = this.m;
    if (ws01 != null)
      ws01.setShapeAppearanceModel(paramvl1); 
    d(getWidth(), getHeight());
    invalidate();
    invalidateOutline();
  }
  
  public void setStrokeColor(ColorStateList paramColorStateList) {
    this.l = paramColorStateList;
    invalidate();
  }
  
  public void setStrokeColorResource(int paramInt) {
    setStrokeColor(n21.y(getContext(), paramInt));
  }
  
  public void setStrokeWidth(float paramFloat) {
    if (this.o != paramFloat) {
      this.o = paramFloat;
      invalidate();
    } 
  }
  
  public void setStrokeWidthResource(int paramInt) {
    setStrokeWidth(getResources().getDimensionPixelSize(paramInt));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\imageview\ShapeableImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */