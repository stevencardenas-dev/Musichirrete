package com.sdsmdg.harjot.crollerTest;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import cc1;
import f41;
import jt;
import m92;

public class Croller extends View {
  public float A = -1.0F;
  
  public float B = -1.0F;
  
  public float C = -1.0F;
  
  public int D = 25;
  
  public int E = 1;
  
  public float F = 7.0F;
  
  public String G = "";
  
  public String H;
  
  public String I;
  
  public int J = 0;
  
  public float K = 14.0F;
  
  public int L = -16777216;
  
  public int M = 30;
  
  public int N = 0;
  
  public int O = -1;
  
  public boolean P = true;
  
  public boolean Q = false;
  
  public boolean R = false;
  
  public RectF S;
  
  public f41 T;
  
  public int U = -1;
  
  public boolean b = true;
  
  public boolean c = false;
  
  public boolean e = false;
  
  public int f = 0;
  
  public float g = 1.0F;
  
  public float h;
  
  public float i;
  
  public Paint j;
  
  public Paint k;
  
  public Paint l;
  
  public TextPaint m;
  
  public float n = 0.0F;
  
  public float o = 3.0F;
  
  public float p = 0.0F;
  
  public boolean q = true;
  
  public int r = Color.parseColor("#82222222");
  
  public int s = Color.parseColor("#82000000");
  
  public int t = Color.parseColor("#82FFA036");
  
  public int u = Color.parseColor("#82FFA036");
  
  public int v = Color.parseColor(jLnXOLx.jcet);
  
  public float w = -1.0F;
  
  public float x = -1.0F;
  
  public float y = 2.0F;
  
  public float z = 2.0F;
  
  public Croller(Context paramContext) {
    super(paramContext);
    b();
  }
  
  public Croller(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    c(paramContext, paramAttributeSet);
    b();
  }
  
  public Croller(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    c(paramContext, paramAttributeSet);
    b();
  }
  
  public final void a() {
    Typeface typeface2 = Typeface.DEFAULT;
    Typeface typeface1 = typeface2;
    if (getLabelFont() != null) {
      typeface1 = typeface2;
      if (!getLabelFont().isEmpty())
        typeface1 = Typeface.createFromAsset(getContext().getAssets(), getLabelFont()); 
    } 
    int i = getLabelStyle();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3)
            return; 
          this.m.setTypeface(Typeface.create(typeface1, 3));
          return;
        } 
        this.m.setTypeface(Typeface.create(typeface1, 2));
        return;
      } 
      this.m.setTypeface(Typeface.create(typeface1, 1));
      return;
    } 
    this.m.setTypeface(typeface1);
  }
  
  public final void b() {
    TextPaint textPaint1;
    int[] arrayOfInt = m92.h;
    float f = getResources().getDimension(2131165390);
    this.g = f;
    this.y *= f;
    this.z *= f;
    this.F *= f;
    byte b = 0;
    setWillNotDraw(false);
    setWillNotCacheDrawing(false);
    setLayerType(1, null);
    TextPaint textPaint2 = new TextPaint();
    this.m = textPaint2;
    textPaint2.setAntiAlias(true);
    TextPaint textPaint3 = this.m;
    Paint.Style style = Paint.Style.FILL;
    textPaint3.setStyle(style);
    this.m.setFakeBoldText(true);
    this.m.setTextAlign(Paint.Align.CENTER);
    this.m.setTextSize(this.K);
    a();
    Paint paint2 = new Paint();
    this.j = paint2;
    paint2.setAntiAlias(true);
    this.j.setStrokeWidth(this.z);
    this.j.setStyle(style);
    paint2 = new Paint();
    this.k = paint2;
    paint2.setAntiAlias(true);
    this.k.setStrokeWidth(this.y);
    this.k.setStyle(style);
    Paint paint1 = new Paint();
    this.l = paint1;
    paint1.setAntiAlias(true);
    this.l.setStrokeWidth(this.F);
    boolean bool = this.P;
    paint1 = this.k;
    if (bool) {
      if (this.b && this.c) {
        i = arrayOfInt[3];
      } else {
        i = 0;
      } 
      paint1.setColor(i);
      paint1 = this.j;
      int i = b;
      if (this.b) {
        i = b;
        if (this.c)
          i = arrayOfInt[7]; 
      } 
      paint1.setColor(i);
      paint1 = this.l;
      if (this.b) {
        i = arrayOfInt[3];
      } else {
        i = arrayOfInt[6];
      } 
      paint1.setColor(i);
      textPaint1 = this.m;
      if (this.b && this.c) {
        i = arrayOfInt[5];
      } else {
        i = arrayOfInt[6];
      } 
      textPaint1.setColor(i);
    } else {
      textPaint1.setColor(this.u);
      this.j.setColor(this.v);
      this.l.setColor(this.t);
      this.m.setColor(this.L);
    } 
    this.S = new RectF();
  }
  
  public final void c(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, cc1.a);
    setEnabled(typedArray.getBoolean(4, true));
    setProgress(typedArray.getInt(32, 1));
    setLabel(typedArray.getString(10));
    setBackCircleDisabledColor(typedArray.getColor(2, this.r));
    setMainCircleDisabledColor(typedArray.getColor(17, this.s));
    setIndicatorDisabledColor(typedArray.getColor(6, this.t));
    setProgressPrimaryDisabledColor(typedArray.getColor(23, this.u));
    setProgressSecondaryDisabledColor(typedArray.getColor(28, this.v));
    setLabelSize(typedArray.getDimension(14, (int)TypedValue.applyDimension(1, this.K, getResources().getDisplayMetrics())));
    setlabelDisabledColor(typedArray.getColor(12, this.L));
    setLabelFont(typedArray.getString(13));
    setLabelStyle(typedArray.getInt(15, 0));
    setIndicatorWidth(typedArray.getFloat(7, 2.0F) * this.g);
    setIsContinuous(typedArray.getBoolean(9, this.q));
    setProgressPrimaryCircleSize(typedArray.getFloat(21, -1.0F));
    setProgressSecondaryCircleSize(typedArray.getFloat(26, -1.0F));
    setSweepAngle(typedArray.getInt(33, -1));
    setStartOffset(typedArray.getInt(31, 40));
    setMax(typedArray.getInt(19, 25));
    setMin(typedArray.getInt(20, 1));
    this.o = (this.E + 2);
    setProgressRadius(typedArray.getFloat(25, -1.0F));
    setAntiClockwise(typedArray.getBoolean(0, false));
    this.e = typedArray.getBoolean(8, false);
    this.f = typedArray.getInt(30, 0);
    typedArray.recycle();
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    if (getParent() != null && paramMotionEvent.getAction() == 0)
      getParent().requestDisallowInterceptTouchEvent(true); 
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public int getBackCircleDisabledColor() {
    return this.r;
  }
  
  public float getBackCircleRadius() {
    return this.B;
  }
  
  public int getIndicatorDisabledColor() {
    return this.t;
  }
  
  public float getIndicatorWidth() {
    return this.F;
  }
  
  public String getLabel() {
    return this.G;
  }
  
  public String getLabelFont() {
    return this.I;
  }
  
  public float getLabelSize() {
    return this.K;
  }
  
  public int getLabelStyle() {
    return this.J;
  }
  
  public int getMainCircleDisabledColor() {
    return this.s;
  }
  
  public float getMainCircleRadius() {
    return this.A;
  }
  
  public int getMax() {
    return this.D;
  }
  
  public int getMin() {
    return this.E;
  }
  
  public int getProgress() {
    return (int)(this.o - 2.0F);
  }
  
  public float getProgressPrimaryCircleSize() {
    return this.w;
  }
  
  public int getProgressPrimaryDisabledColor() {
    return this.u;
  }
  
  public float getProgressRadius() {
    return this.C;
  }
  
  public float getProgressSecondaryCircleSize() {
    return this.x;
  }
  
  public int getProgressSecondaryDisabledColor() {
    return this.v;
  }
  
  public int getStartOffset() {
    return this.M;
  }
  
  public int getSweepAngle() {
    return this.O;
  }
  
  public int getlabelDisabledColor() {
    return this.L;
  }
  
  public final boolean isEnabled() {
    return this.P;
  }
  
  public final void onDraw(Canvas paramCanvas) {
    TextPaint textPaint;
    int[] arrayOfInt = m92.h;
    super.onDraw(paramCanvas);
    float f3 = this.o;
    if (this.f > 0) {
      int m = (this.E + this.D) / 2;
      float f11 = f3 - 2.0F;
      this.o = f11;
      float f12 = m;
      if (Math.abs(f11 - f12) < this.f)
        this.o = f12; 
      this.o += 2.0F;
    } 
    int j = (int)(this.o - 2.0F);
    int i = this.U;
    if (i != -1 && i != j) {
      f41 f411 = this.T;
      if (f411 != null)
        f411.I(this, j, this.c); 
    } 
    this.U = j;
    boolean bool = this.P;
    Paint paint2 = this.k;
    j = 7;
    int k = 6;
    byte b = 5;
    if (bool) {
      if (this.b && this.c) {
        i = arrayOfInt[3];
      } else {
        i = 0;
      } 
      paint2.setColor(i);
      paint2 = this.j;
      if (this.b && this.c) {
        i = arrayOfInt[7];
      } else {
        i = 0;
      } 
      paint2.setColor(i);
      paint2 = this.l;
      if (this.b) {
        i = arrayOfInt[3];
      } else {
        i = arrayOfInt[6];
      } 
      paint2.setColor(i);
      textPaint = this.m;
      if (this.b && this.c) {
        i = arrayOfInt[5];
      } else {
        i = arrayOfInt[6];
      } 
      textPaint.setColor(i);
    } else {
      textPaint.setColor(this.u);
      this.j.setColor(this.v);
      this.l.setColor(this.t);
      this.m.setColor(this.L);
    } 
    bool = this.q;
    float f1 = 11.5F;
    if (!bool) {
      this.N = this.M - 15;
      this.l.setStrokeWidth(this.F);
      this.m.setTextSize(this.K);
      int n = (int)(Math.min(this.h, this.i) * 0.90625F);
      if (this.O == -1)
        this.O = 360 - this.N * 2; 
      float f11 = n;
      if (this.c)
        f1 = 11.0F; 
      this.A = f1 / 15.0F * f11;
      this.B = 0.8F * f11;
      if (this.C == -1.0F)
        this.C = f11; 
      f1 = Math.max(3.0F, this.o);
      float f12 = Math.min(this.o, (this.D + 2));
      int m = (int)f1;
      i = k;
      k = m;
      while (true) {
        m = this.D;
        if (k < m + 3) {
          f1 = this.N / 360.0F;
          float f13 = this.O / 360.0F * k / (m + 5) + f1;
          f1 = f13;
          if (this.Q)
            f1 = 1.0F - f13; 
          f13 = this.h;
          double d4 = this.C;
          double d3 = (1.0D - f1) * 6.283185307179586D;
          f1 = f13 + (float)(d4 * Math.sin(d3));
          f13 = this.i;
          d4 = this.C;
          f13 += (float)(Math.cos(d3) * d4);
          float f14 = this.x;
          if (f14 == -1.0F) {
            f14 = f11 / 30.0F;
            float f = 20.0F / this.D;
            paramCanvas.drawCircle(f1, f13, this.O / 270.0F * f * f14, this.j);
          } else {
            paramCanvas.drawCircle(f1, f13, f14, this.j);
          } 
          k++;
          continue;
        } 
        b = 3;
        while (true) {
          f1 = b;
          k = this.N;
          m = this.O;
          if (f1 <= f12) {
            float f18 = k / 360.0F;
            f18 = m / 360.0F * f1 / (this.D + 5) + f18;
            f1 = f18;
            if (this.Q)
              f1 = 1.0F - f18; 
            f18 = this.h;
            double d6 = this.C;
            double d5 = (1.0D - f1) * 6.283185307179586D;
            f1 = f18 + (float)(Math.sin(d5) * d6);
            f18 = this.i;
            d6 = this.C;
            f18 += (float)(Math.cos(d5) * d6);
            float f19 = this.w;
            if (f19 == -1.0F) {
              float f = this.C / 15.0F;
              f19 = 20.0F / this.D;
              paramCanvas.drawCircle(f1, f18, this.O / 270.0F * f19 * f, this.k);
            } else {
              paramCanvas.drawCircle(f1, f18, f19, this.k);
            } 
            b++;
            continue;
          } 
          f1 = k / 360.0F;
          float f13 = m / 360.0F * this.o / (this.D + 5) + f1;
          f1 = f13;
          if (this.Q)
            f1 = 1.0F - f13; 
          f13 = this.h;
          double d4 = (f11 * 0.4F);
          double d3 = (1.0D - f1) * 6.283185307179586D;
          f12 = (float)(Math.sin(d3) * d4);
          float f15 = this.i;
          float f14 = (float)(Math.cos(d3) * d4);
          f1 = this.h;
          d4 = (f11 * 0.6F);
          float f17 = (float)(Math.sin(d3) * d4);
          float f16 = this.i;
          f11 = (float)(Math.cos(d3) * d4);
          bool = this.P;
          Paint paint = this.j;
          if (bool) {
            if (this.b && this.c) {
              i = arrayOfInt[i];
            } else {
              i = arrayOfInt[j];
            } 
            paint.setColor(i);
          } else {
            paint.setColor(this.r);
          } 
          paramCanvas.drawCircle(this.h, this.i, this.B, this.j);
          bool = this.P;
          paint = this.j;
          if (bool) {
            paint.setColor(arrayOfInt[0]);
          } else {
            paint.setColor(this.s);
          } 
          paramCanvas.drawCircle(this.h, this.i, this.A, this.j);
          paramCanvas.drawText(this.G, this.h, this.i + (float)(n * 1.2D) - (this.m.getFontMetrics()).descent, (Paint)this.m);
          paramCanvas.drawLine(f13 + f12, f15 + f14, f17 + f1, f16 + f11, this.l);
          this.o = f3;
          return;
        } 
        break;
      } 
    } 
    float f4 = Math.min(this.h, this.i) * 0.90625F;
    if (this.O == -1)
      this.O = 360 - this.M * 2; 
    if (this.c)
      f1 = 11.0F; 
    this.A = f1 / 15.0F * f4;
    this.B = 0.8F * f4;
    this.C = f4;
    this.j.setStrokeWidth(this.z);
    Paint paint3 = this.j;
    Paint.Style style = Paint.Style.STROKE;
    paint3.setStyle(style);
    this.k.setStrokeWidth(this.y);
    this.k.setStyle(style);
    this.l.setStrokeWidth(this.F);
    this.m.setTextSize(this.K);
    f1 = Math.min(this.o, (this.D + 2));
    RectF rectF = this.S;
    float f5 = this.h;
    float f6 = this.C;
    float f2 = this.i;
    rectF.set(f5 - f6, f2 - f6, f5 + f6, f2 + f6);
    paramCanvas.drawArc(this.S, this.M + 90.0F, this.O, false, this.j);
    if (this.e) {
      f5 = this.M;
      f2 = this.O / this.D;
      paramCanvas.drawArc(this.S, 270.0F, f2 * (f1 - 2.0F) + f5 + 90.0F - 270.0F, false, this.k);
    } else if (getProgress() > 0) {
      bool = this.Q;
      rectF = this.S;
      i = this.M;
      if (bool) {
        paramCanvas.drawArc(rectF, 90.0F - i, this.O / this.D * (f1 - 2.0F) * -1.0F, false, this.k);
      } else {
        paramCanvas.drawArc(rectF, i + 90.0F, this.O / this.D * (f1 - 2.0F), false, this.k);
      } 
    } 
    f2 = this.M / 360.0F;
    f1 = this.O / 360.0F;
    f2 = (this.o - 2.0F) / this.D * f1 + f2;
    f1 = f2;
    if (this.Q)
      f1 = 1.0F - f2; 
    f2 = this.h;
    double d2 = (f4 * 0.4F);
    double d1 = (1.0D - f1) * 6.283185307179586D;
    f6 = (float)(Math.sin(d1) * d2);
    float f7 = this.i;
    float f9 = (float)(Math.cos(d1) * d2);
    f1 = this.h;
    d2 = (f4 * 0.6F);
    f5 = (float)(Math.sin(d1) * d2);
    float f10 = this.i;
    float f8 = (float)(Math.cos(d1) * d2);
    this.j.setStyle(Paint.Style.FILL);
    bool = this.P;
    Paint paint1 = this.j;
    if (bool) {
      if (this.b && this.c) {
        i = arrayOfInt[6];
      } else {
        i = arrayOfInt[7];
      } 
      paint1.setColor(i);
    } else {
      paint1.setColor(this.r);
    } 
    paramCanvas.drawCircle(this.h, this.i, this.B, this.j);
    bool = this.P;
    paint1 = this.j;
    if (bool) {
      paint1.setColor(arrayOfInt[0]);
    } else {
      paint1.setColor(this.s);
    } 
    paramCanvas.drawCircle(this.h, this.i, this.A, this.j);
    if (this.H == null)
      this.H = TextUtils.ellipsize(this.G, this.m, getWidth(), TextUtils.TruncateAt.END).toString(); 
    paramCanvas.drawText(this.H, this.h, this.i + (float)(f4 * 1.17D) - (this.m.getFontMetrics()).descent, (Paint)this.m);
    paramCanvas.drawLine(f2 + f6, f7 + f9, f1 + f5, f8 + f10, this.l);
    this.o = f3;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.h = getWidth() / 2.0F;
    this.i = getHeight() / 2.0F;
    this.H = null;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    int m = (int)((getContext().getResources().getDisplayMetrics()).densityDpi / 160.0F * 160.0F);
    int k = (int)((getContext().getResources().getDisplayMetrics()).densityDpi / 160.0F * 160.0F);
    int n = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int i1 = View.MeasureSpec.getMode(paramInt2);
    int i = View.MeasureSpec.getSize(paramInt2);
    if (n == 1073741824) {
      paramInt1 = j;
    } else if (n == Integer.MIN_VALUE) {
      paramInt1 = Math.min(m, j);
    } else {
      paramInt1 = i;
    } 
    if (i1 == 1073741824) {
      paramInt2 = i;
    } else {
      paramInt2 = j;
      if (i1 == Integer.MIN_VALUE)
        paramInt2 = Math.min(k, i); 
    } 
    if (n == 0 && i1 == 0) {
      paramInt1 = m;
      paramInt2 = k;
    } 
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (!this.P)
      return false; 
    if (paramMotionEvent.getAction() != 2) {
      float f3 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      float f4 = this.h;
      float f1 = this.i;
      f3 -= f4;
      f1 = f2 - f1;
      if ((float)Math.sqrt((f1 * f1 + f3 * f3)) > Math.max(this.A, Math.max(this.B, this.C))) {
        if (this.R && this.T != null) {
          if (this.f > 0) {
            int i = (this.E + this.D) / 2;
            f1 = this.o - 2.0F;
            this.o = f1;
            f2 = i;
            if (Math.abs(f1 - f2) < this.f)
              this.o = f2; 
            this.o += 2.0F;
          } 
          this.T.B(this);
          this.R = false;
        } 
        this.c = false;
        invalidate();
        return super.onTouchEvent(paramMotionEvent);
      } 
    } 
    if (paramMotionEvent.getAction() == 0) {
      float f2 = paramMotionEvent.getX();
      float f1 = this.h;
      f1 = (float)(Math.atan2((paramMotionEvent.getY() - this.i), (f2 - f1)) * 180.0D / Math.PI) - 90.0F;
      this.p = f1;
      if (f1 < 0.0F)
        this.p = f1 + 360.0F; 
      this.p = (float)Math.floor((this.p / 360.0F * (this.D + 5)));
      if (this.T != null)
        this.R = true; 
      this.c = true;
      invalidate();
      return true;
    } 
    if (paramMotionEvent.getAction() == 2) {
      float f2 = paramMotionEvent.getX();
      float f1 = this.h;
      f1 = (float)(Math.atan2((paramMotionEvent.getY() - this.i), (f2 - f1)) * 180.0D / Math.PI) - 90.0F;
      this.n = f1;
      if (f1 < 0.0F)
        this.n = f1 + 360.0F; 
      f1 = (float)Math.floor((this.n / 360.0F * (this.D + 5)));
      this.n = f1;
      int i = this.D;
      float f3 = (i + 4);
      if (f1 / f3 > 0.75F && (this.p - 0.0F) / f3 < 0.25F) {
        boolean bool = this.Q;
        f2 = this.o;
        if (bool) {
          this.o = ++f2;
          f3 = (i + 2);
          if (f2 > f3)
            this.o = f3; 
        } else {
          this.o = --f2;
          f3 = (this.E + 2);
          if (f2 < f3)
            this.o = f3; 
        } 
      } else {
        f2 = this.p;
        if (f2 / f3 > 0.75F && (f1 - 0.0F) / f3 < 0.25F) {
          boolean bool = this.Q;
          f2 = this.o;
          if (bool) {
            this.o = --f2;
            f3 = (this.E + 2);
            if (f2 < f3)
              this.o = f3; 
          } else {
            f3 = f2 + 1.0F;
            this.o = f3;
            f2 = (i + 2);
            if (f3 > f2)
              this.o = f2; 
          } 
        } else {
          boolean bool = this.Q;
          f3 = this.o;
          if (bool) {
            this.o = f3 - f1 - f2;
          } else {
            this.o = f1 - f2 + f3;
          } 
          f3 = this.o;
          f2 = (i + 2);
          if (f3 > f2)
            this.o = f2; 
          f2 = this.o;
          f3 = (this.E + 2);
          if (f2 < f3)
            this.o = f3; 
        } 
      } 
      this.p = f1;
      invalidate();
      return true;
    } 
    if (paramMotionEvent.getAction() == 1) {
      if (this.T != null) {
        if (this.f > 0) {
          int i = (this.E + this.D) / 2;
          float f2 = this.o - 2.0F;
          this.o = f2;
          float f1 = i;
          if (Math.abs(f2 - f1) < this.f)
            this.o = f1; 
          this.o += 2.0F;
        } 
        this.T.B(this);
        this.R = false;
      } 
      this.c = false;
      invalidate();
      return true;
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setAntiClockwise(boolean paramBoolean) {
    this.Q = paramBoolean;
    invalidate();
  }
  
  public void setBackCircleDisabledColor(int paramInt) {
    this.r = paramInt;
    invalidate();
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.P = paramBoolean;
    invalidate();
  }
  
  public void setIndicatorDisabledColor(int paramInt) {
    this.t = paramInt;
    invalidate();
  }
  
  public void setIndicatorWidth(float paramFloat) {
    this.F = paramFloat;
    invalidate();
  }
  
  public void setIsContinuous(boolean paramBoolean) {
    this.q = paramBoolean;
    invalidate();
  }
  
  public void setLabel(String paramString) {
    String str = paramString;
    if (paramString == null)
      str = ""; 
    this.G = str;
    this.H = null;
    invalidate();
  }
  
  public void setLabelFont(String paramString) {
    this.I = paramString;
    if (this.m != null)
      a(); 
    invalidate();
  }
  
  public void setLabelSize(float paramFloat) {
    this.K = paramFloat;
    invalidate();
  }
  
  public void setLabelStyle(int paramInt) {
    this.J = paramInt;
    invalidate();
  }
  
  public void setMainCircleDisabledColor(int paramInt) {
    this.s = paramInt;
    invalidate();
  }
  
  public void setMainCircleRadius(float paramFloat) {
    this.A = paramFloat;
    invalidate();
  }
  
  public void setMax(int paramInt) {
    int i = this.E;
    if (paramInt < i) {
      this.D = i;
    } else {
      this.D = paramInt;
    } 
    invalidate();
  }
  
  public void setMin(int paramInt) {
    if (paramInt < 0) {
      this.E = 0;
    } else {
      int i = this.D;
      if (paramInt > i) {
        this.E = i;
      } else {
        this.E = paramInt;
      } 
    } 
    invalidate();
  }
  
  public void setOnCrollerChangeListener(f41 paramf41) {
    this.T = paramf41;
  }
  
  public void setOnProgressChangedListener(jt paramjt) {}
  
  public void setProgress(int paramInt) {
    if (getProgress() == paramInt)
      return; 
    this.o = (paramInt + 2);
    invalidate();
  }
  
  public void setProgressPrimaryCircleSize(float paramFloat) {
    this.w = paramFloat;
    invalidate();
  }
  
  public void setProgressPrimaryDisabledColor(int paramInt) {
    this.u = paramInt;
    invalidate();
  }
  
  public void setProgressRadius(float paramFloat) {
    this.C = paramFloat;
    invalidate();
  }
  
  public void setProgressSecondaryCircleSize(float paramFloat) {
    this.x = paramFloat;
    invalidate();
  }
  
  public void setProgressSecondaryDisabledColor(int paramInt) {
    this.v = paramInt;
    invalidate();
  }
  
  public void setSelfEnabled(boolean paramBoolean) {
    if (paramBoolean != this.b) {
      this.b = paramBoolean;
      if (paramBoolean) {
        setAlpha(1.0F);
      } else {
        setAlpha(0.3F);
      } 
      invalidate();
    } 
  }
  
  public void setStartOffset(int paramInt) {
    this.M = paramInt;
    invalidate();
  }
  
  public void setSweepAngle(int paramInt) {
    this.O = paramInt;
    invalidate();
  }
  
  public void setlabelDisabledColor(int paramInt) {
    this.L = paramInt;
    invalidate();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\sdsmdg\harjot\crollerTest\Croller.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */