package in.krosbits.audio_cutter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import jn;
import m92;
import om;
import ui0;

public final class WaveformView extends View {
  public Paint b;
  
  public Paint c;
  
  public Paint e;
  
  public Paint f;
  
  public Paint g;
  
  public Paint h;
  
  public float i = 20.0F;
  
  public float j = 70.0F;
  
  public final Rect k = new Rect();
  
  public final Rect l = new Rect();
  
  public final Rect m = new Rect();
  
  public final Rect n = new Rect();
  
  public final Rect o = new Rect();
  
  public float p;
  
  public float q;
  
  public Bitmap r;
  
  public final Rect s = new Rect();
  
  public final Rect t = new Rect();
  
  public final Rect u = new Rect();
  
  public WaveformView(Context paramContext) {
    super(paramContext);
    paramContext = getContext();
    paramContext.getClass();
    a(paramContext);
  }
  
  public WaveformView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    paramContext = getContext();
    paramContext.getClass();
    a(paramContext);
  }
  
  public WaveformView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    paramContext.getClass();
    a(paramContext);
  }
  
  public final void a(Context paramContext) {
    Paint paint2 = new Paint();
    paint2.setFlags(1);
    int[] arrayOfInt = m92.h;
    int i = jn.i(arrayOfInt[7], 255);
    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
    paint2.setColorFilter((ColorFilter)new PorterDuffColorFilter(i, mode));
    paint2.setAlpha(Color.alpha(arrayOfInt[7]));
    this.b = paint2;
    paint2 = new Paint();
    paint2.setFlags(1);
    paint2.setColor(jn.i(arrayOfInt[8], 255));
    paint2.setAlpha(Color.alpha(arrayOfInt[8]));
    this.e = paint2;
    paint2 = new Paint();
    paint2.setFlags(1);
    paint2.setColorFilter((ColorFilter)new PorterDuffColorFilter(arrayOfInt[3], mode));
    paint2.setAlpha(Color.alpha(arrayOfInt[6]));
    this.c = paint2;
    Paint paint1 = new Paint();
    paint1.setFlags(1);
    paint1.setColor(arrayOfInt[3]);
    paint1.setAlpha(Color.alpha(arrayOfInt[8]));
    this.f = paint1;
    paint1 = new Paint();
    paint1.setFlags(1);
    paint1.setStrokeWidth(paramContext.getResources().getDimension(2131165390));
    this.g = paint1;
    paint1 = new Paint();
    paint1.setFlags(1);
    paint1.setColor(arrayOfInt[3]);
    paint1.setAlpha(Color.alpha(arrayOfInt[6]));
    paint1.setStrokeWidth(paramContext.getResources().getDimension(2131165390));
    this.h = paint1;
    b();
  }
  
  public final void b() {
    int[] arrayOfInt = m92.h;
    int j = getPaddingLeft();
    int i = getPaddingTop();
    int m = getPaddingRight();
    int k = getPaddingBottom();
    m = getWidth() - j - m;
    int n = getHeight();
    int i2 = getWidth();
    float f1 = getHeight();
    int i1 = (int)(getResources().getDimension(2131165390) * 24.0F + f1);
    this.k.set(0, 0, i2, i1);
    Rect rect2 = this.l;
    rect2.set(j, i, j + m, n - i - k + i);
    k = rect2.left;
    float f2 = k;
    float f3 = this.i;
    f1 = m;
    i = (int)(f3 * f1 / 100.0F + f2);
    j = rect2.top;
    f2 = k;
    m = (int)(this.j * f1 / 100.0F + f2);
    k = rect2.bottom;
    Rect rect1 = this.m;
    rect1.set(i, j, m, k);
    k = rect2.left;
    m = rect2.top;
    i = rect1.left;
    j = rect2.bottom;
    Rect rect3 = this.n;
    rect3.set(k, m, i, j);
    j = rect1.right;
    i = rect2.top;
    k = rect2.right;
    m = rect2.bottom;
    Rect rect4 = this.o;
    rect4.set(j, i, k, m);
    Bitmap bitmap = this.r;
    if (bitmap != null) {
      i = rect3.width();
      i = (int)((bitmap.getWidth() * i) / rect2.width());
      j = bitmap.getHeight();
      rect3 = this.s;
      rect3.set(0, 0, i, j);
      f2 = bitmap.getWidth();
      i = (int)((1.0F - rect4.width() / rect2.width()) * f2);
      j = bitmap.getWidth();
      k = bitmap.getHeight();
      rect4 = this.t;
      rect4.set(i, 0, j, k);
      j = rect3.right;
      i = rect4.left;
      k = bitmap.getHeight();
      this.u.set(j, 0, i, k);
    } 
    f2 = rect2.left;
    f1 = this.p * f1 / 100.0F + f2;
    this.q = f1;
    Paint paint = this.g;
    if (paint != null) {
      k = rect1.left;
      i = rect1.right;
      j = (int)f1;
      if (k <= j && j <= i) {
        paint.setColor(arrayOfInt[7]);
        paint.setAlpha(Color.alpha(arrayOfInt[7]));
        return;
      } 
      paint.setColor(arrayOfInt[7]);
      paint.setAlpha(Color.alpha(arrayOfInt[7]));
      return;
    } 
    ui0.n0("currentPositionLinePaint");
    throw null;
  }
  
  public final void onDraw(Canvas paramCanvas) {
    paramCanvas.getClass();
    super.onDraw(paramCanvas);
    Paint paint = this.e;
    if (paint != null) {
      Rect rect = this.n;
      paramCanvas.drawRect(rect, paint);
      paint = this.e;
      if (paint != null) {
        Rect rect1 = this.o;
        paramCanvas.drawRect(rect1, paint);
        Paint paint1 = this.f;
        if (paint1 != null) {
          Rect rect2 = this.m;
          paramCanvas.drawRect(rect2, paint1);
          Bitmap bitmap = this.r;
          if (bitmap != null) {
            Paint paint3 = this.b;
            if (paint3 != null) {
              paramCanvas.drawBitmap(bitmap, this.s, rect, paint3);
              Paint paint4 = this.b;
              if (paint4 != null) {
                paramCanvas.drawBitmap(bitmap, this.t, rect1, paint4);
                paint4 = this.c;
                if (paint4 != null) {
                  paramCanvas.drawBitmap(bitmap, this.u, rect2, paint4);
                } else {
                  ui0.n0("selectedWaveBitmapPaint");
                  throw null;
                } 
              } else {
                ui0.n0("unselectedWaveBitmapPaint");
                throw null;
              } 
            } else {
              ui0.n0("unselectedWaveBitmapPaint");
              throw null;
            } 
          } 
          float f1 = this.q;
          float f3 = getPaddingTop();
          float f2 = this.q;
          float f4 = (getHeight() - getPaddingBottom());
          Paint paint2 = this.g;
          if (paint2 != null) {
            paramCanvas.drawLine(f1, f3, f2, f4, paint2);
            f4 = rect2.left;
            f1 = getPaddingTop();
            f3 = rect2.left;
            f2 = (getHeight() - getPaddingBottom());
            paint2 = this.h;
            if (paint2 != null) {
              paramCanvas.drawLine(f4, f1, f3, f2, paint2);
              f1 = rect2.right;
              f4 = getPaddingTop();
              f3 = rect2.right;
              f2 = (getHeight() - getPaddingBottom());
              Paint paint3 = this.h;
              if (paint3 != null) {
                paramCanvas.drawLine(f1, f4, f3, f2, paint3);
                return;
              } 
              ui0.n0("rangeLinePaint");
              throw null;
            } 
            ui0.n0("rangeLinePaint");
            throw null;
          } 
          ui0.n0("currentPositionLinePaint");
          throw null;
        } 
        ui0.n0("selectedAreaPaint");
        throw null;
      } 
      ui0.n0("unselectedAreaPaint");
      throw null;
    } 
    ui0.n0("unselectedAreaPaint");
    throw null;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean) {
      b();
      if (Build.VERSION.SDK_INT >= 29)
        setSystemGestureExclusionRects(om.i0((Object[])new Rect[] { this.k })); 
    } 
  }
  
  public final void setWaveBitmap(Bitmap paramBitmap) {
    paramBitmap.getClass();
    if (!ui0.c(this.r, paramBitmap)) {
      this.r = paramBitmap;
      b();
      invalidate();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\audio_cutter\WaveformView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */