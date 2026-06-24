import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;

public final class hm {
  public Typeface A;
  
  public Typeface B;
  
  public Typeface C;
  
  public Typeface D;
  
  public ji E;
  
  public ji F;
  
  public TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
  
  public CharSequence H;
  
  public CharSequence I;
  
  public boolean J;
  
  public boolean K = true;
  
  public float L;
  
  public float M;
  
  public float N;
  
  public float O;
  
  public float P;
  
  public int Q;
  
  public int R;
  
  public int[] S;
  
  public boolean T;
  
  public final TextPaint U;
  
  public final TextPaint V;
  
  public TimeInterpolator W;
  
  public TimeInterpolator X;
  
  public float Y;
  
  public float Z;
  
  public final ViewGroup a;
  
  public float a0;
  
  public float b;
  
  public ColorStateList b0;
  
  public boolean c;
  
  public float c0;
  
  public float d;
  
  public float d0;
  
  public float e;
  
  public float e0;
  
  public int f;
  
  public ColorStateList f0;
  
  public final Rect g;
  
  public float g0;
  
  public final Rect h;
  
  public float h0;
  
  public Rect i;
  
  public float i0;
  
  public final RectF j;
  
  public StaticLayout j0;
  
  public int k = 16;
  
  public float k0;
  
  public int l = 16;
  
  public float l0;
  
  public float m = 15.0F;
  
  public float m0;
  
  public float n = 15.0F;
  
  public CharSequence n0;
  
  public ColorStateList o;
  
  public int o0 = 1;
  
  public ColorStateList p;
  
  public int p0 = 1;
  
  public int q;
  
  public float q0 = 0.0F;
  
  public float r;
  
  public float r0 = 1.0F;
  
  public float s;
  
  public int s0 = 1;
  
  public float t;
  
  public int t0 = -1;
  
  public float u;
  
  public int u0 = -1;
  
  public float v;
  
  public boolean v0;
  
  public float w;
  
  public Typeface x;
  
  public Typeface y;
  
  public Typeface z;
  
  public hm(ViewGroup paramViewGroup) {
    this.a = paramViewGroup;
    TextPaint textPaint = new TextPaint(129);
    this.U = textPaint;
    this.V = new TextPaint((Paint)textPaint);
    this.h = new Rect();
    this.g = new Rect();
    this.j = new RectF();
    float f = this.d;
    this.e = x41.e(1.0F, f, 0.5F, f);
    k(paramViewGroup.getContext().getResources().getConfiguration());
  }
  
  public static int a(float paramFloat, int paramInt1, int paramInt2) {
    float f8 = 1.0F - paramFloat;
    float f5 = Color.alpha(paramInt1);
    float f7 = Color.alpha(paramInt2);
    float f9 = Color.red(paramInt1);
    float f1 = Color.red(paramInt2);
    float f2 = Color.green(paramInt1);
    float f3 = Color.green(paramInt2);
    float f6 = Color.blue(paramInt1);
    float f4 = Color.blue(paramInt2);
    return Color.argb(Math.round(f7 * paramFloat + f5 * f8), Math.round(f1 * paramFloat + f9 * f8), Math.round(f3 * paramFloat + f2 * f8), Math.round(f4 * paramFloat + f6 * f8));
  }
  
  public static float j(float paramFloat1, float paramFloat2, float paramFloat3, TimeInterpolator paramTimeInterpolator) {
    float f = paramFloat3;
    if (paramTimeInterpolator != null)
      f = paramTimeInterpolator.getInterpolation(paramFloat3); 
    return g5.a(paramFloat1, paramFloat2, f);
  }
  
  public static boolean m(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramRect.left == paramInt1 && paramRect.top == paramInt2 && paramRect.right == paramInt3 && paramRect.bottom == paramInt4);
  }
  
  public final void A(float paramFloat) {
    paramFloat = ui0.h(paramFloat, 0.0F, 1.0F);
    if (paramFloat != this.b) {
      this.b = paramFloat;
      b();
    } 
  }
  
  public final void B(CharSequence paramCharSequence) {
    if (paramCharSequence == null || !TextUtils.equals(this.H, paramCharSequence)) {
      this.H = paramCharSequence;
      this.I = null;
      l(false);
      return;
    } 
  }
  
  public final boolean C() {
    return (this.p0 == 1);
  }
  
  public final void b() {
    float f2 = this.b;
    boolean bool = this.c;
    Rect rect1 = this.h;
    Rect rect2 = this.g;
    RectF rectF = this.j;
    if (bool) {
      if (f2 < this.e)
        rect1 = rect2; 
      rectF.set(rect1);
    } else {
      rectF.left = j(rect2.left, rect1.left, f2, this.W);
      rectF.top = j(this.r, this.s, f2, this.W);
      rectF.right = j(rect2.right, rect1.right, f2, this.W);
      rectF.bottom = j(rect2.bottom, rect1.bottom, f2, this.W);
    } 
    bool = this.c;
    ViewGroup viewGroup = this.a;
    if (bool) {
      if (f2 < this.e) {
        this.v = this.t;
        this.w = this.r;
        d(0.0F, false);
        viewGroup.postInvalidateOnAnimation();
        f1 = 0.0F;
      } else {
        this.v = this.u;
        this.w = this.s - Math.max(0, this.f);
        d(1.0F, false);
        viewGroup.postInvalidateOnAnimation();
        f1 = 1.0F;
      } 
    } else {
      this.v = j(this.t, this.u, f2, this.W);
      this.w = j(this.r, this.s, f2, this.W);
      d(f2, false);
      viewGroup.postInvalidateOnAnimation();
      f1 = f2;
    } 
    o70 o70 = g5.b;
    this.l0 = 1.0F - j(0.0F, 1.0F, 1.0F - f2, (TimeInterpolator)o70);
    viewGroup.postInvalidateOnAnimation();
    this.m0 = j(1.0F, 0.0F, f2, (TimeInterpolator)o70);
    viewGroup.postInvalidateOnAnimation();
    ColorStateList colorStateList2 = this.p;
    ColorStateList colorStateList1 = this.o;
    TextPaint textPaint = this.U;
    if (colorStateList2 != colorStateList1) {
      textPaint.setColor(a(f1, h(colorStateList1), h(this.p)));
    } else {
      textPaint.setColor(h(colorStateList2));
    } 
    float f1 = this.g0;
    float f3 = this.h0;
    if (f1 != f3) {
      textPaint.setLetterSpacing(j(f3, f1, f2, (TimeInterpolator)o70));
    } else {
      textPaint.setLetterSpacing(f1);
    } 
    this.N = g5.a(this.c0, this.Y, f2);
    this.O = g5.a(this.d0, this.Z, f2);
    this.P = g5.a(this.e0, this.a0, f2);
    int i = a(f2, h(this.f0), h(this.b0));
    this.Q = i;
    textPaint.setShadowLayer(this.N, this.O, this.P, i);
    if (this.c) {
      i = textPaint.getAlpha();
      f1 = this.e;
      if (f2 <= f1) {
        f1 = g5.b(1.0F, 0.0F, this.d, f1, f2);
      } else {
        f1 = g5.b(0.0F, 1.0F, f1, 1.0F, f2);
      } 
      textPaint.setAlpha((int)(f1 * i));
      if (Build.VERSION.SDK_INT >= 31)
        textPaint.setShadowLayer(this.N, this.O, this.P, m92.l(this.Q, textPaint.getAlpha())); 
    } 
    viewGroup.postInvalidateOnAnimation();
  }
  
  public final boolean c(CharSequence paramCharSequence) {
    int i = this.a.getLayoutDirection();
    boolean bool = true;
    if (i != 1)
      bool = false; 
    if (this.K) {
      sb sb;
      if (bool) {
        sb = wt1.d;
      } else {
        sb = wt1.c;
      } 
      return sb.c(paramCharSequence, paramCharSequence.length());
    } 
    return bool;
  }
  
  public final void d(float paramFloat, boolean paramBoolean) {
    if (this.H != null) {
      float f1;
      float f3;
      int i;
      Typeface typeface;
      float f5 = this.h.width();
      float f2 = this.g.width();
      float f4 = 1.0F;
      if (Math.abs(paramFloat - 1.0F) < 1.0E-5F) {
        float f;
        if (C()) {
          f = this.n;
        } else {
          f = this.m;
        } 
        if (C()) {
          f1 = this.g0;
        } else {
          f1 = this.h0;
        } 
        if (C()) {
          f3 = 1.0F;
        } else {
          f3 = j(this.m, this.n, paramFloat, this.X) / this.m;
        } 
        this.L = f3;
        if (C())
          f2 = f5; 
        typeface = this.x;
        f3 = f;
      } else {
        f3 = this.m;
        f1 = this.h0;
        typeface = this.A;
        if (Math.abs(paramFloat - 0.0F) < 1.0E-5F) {
          this.L = 1.0F;
        } else {
          this.L = j(this.m, this.n, paramFloat, this.X) / this.m;
        } 
        float f7 = this.n / this.m;
        float f6 = f2;
        if (!paramBoolean)
          if (this.c) {
            f6 = f2;
          } else {
            f6 = f2;
            if (f2 * f7 > f5) {
              f6 = f2;
              if (C())
                f6 = Math.min(f5 / f7, f2); 
            } 
          }  
        f2 = f6;
      } 
      if (paramFloat < 0.5F) {
        i = this.o0;
      } else {
        i = this.p0;
      } 
      TextPaint textPaint = this.U;
      boolean bool = false;
      paramBoolean = false;
      if (f2 > 0.0F) {
        boolean bool1;
        boolean bool2;
        boolean bool3;
        boolean bool4;
        if (this.M != f3) {
          bool = true;
        } else {
          bool = false;
        } 
        if (this.i0 != f1) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        if (this.D != typeface) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        StaticLayout staticLayout = this.j0;
        if (staticLayout != null && f2 != staticLayout.getWidth()) {
          bool3 = true;
        } else {
          bool3 = false;
        } 
        if (this.R != i) {
          bool4 = true;
        } else {
          bool4 = false;
        } 
        if (bool || bool1 || bool3 || bool2 || bool4 || this.T) {
          bool = true;
        } else {
          bool = false;
        } 
        this.M = f3;
        this.i0 = f1;
        this.D = typeface;
        this.T = false;
        this.R = i;
        if (this.L != 1.0F)
          paramBoolean = true; 
        textPaint.setLinearText(paramBoolean);
      } 
      if (this.I == null || bool) {
        textPaint.setTextSize(this.M);
        textPaint.setTypeface(this.D);
        textPaint.setLetterSpacing(this.i0);
        paramBoolean = c(this.H);
        this.J = paramBoolean;
        if ((this.o0 <= 1 && this.p0 <= 1) || (paramBoolean && !this.c))
          i = 1; 
        CharSequence charSequence = this.H;
        if (C()) {
          paramFloat = f4;
        } else {
          paramFloat = this.L;
        } 
        StaticLayout staticLayout = e(i, textPaint, charSequence, f2 * paramFloat, this.J);
        this.j0 = staticLayout;
        this.I = staticLayout.getText();
        return;
      } 
    } 
  }
  
  public final StaticLayout e(int paramInt, TextPaint paramTextPaint, CharSequence paramCharSequence, float paramFloat, boolean paramBoolean) {
    Layout.Alignment alignment;
    if (paramInt == 1) {
      alignment = Layout.Alignment.ALIGN_NORMAL;
    } else {
      int i = Gravity.getAbsoluteGravity(this.k, this.J) & 0x7;
      if (i != 1) {
        boolean bool = this.J;
        if (i != 5) {
          if (bool) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
          } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
          } 
        } else if (bool) {
          alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
          alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } 
      } else {
        alignment = Layout.Alignment.ALIGN_CENTER;
      } 
    } 
    pp1 pp1 = new pp1(paramCharSequence, paramTextPaint, (int)paramFloat);
    pp1.l = this.G;
    pp1.k = paramBoolean;
    pp1.e = alignment;
    pp1.j = false;
    pp1.f = paramInt;
    float f = this.q0;
    paramFloat = this.r0;
    pp1.g = f;
    pp1.h = paramFloat;
    pp1.i = this.s0;
    pp1.m = null;
    StaticLayout staticLayout = pp1.a();
    staticLayout.getClass();
    return staticLayout;
  }
  
  public final void f(Canvas paramCanvas) {
    int i = paramCanvas.save();
    if (this.I != null) {
      RectF rectF = this.j;
      if (rectF.width() > 0.0F && rectF.height() > 0.0F) {
        float f1 = this.M;
        TextPaint textPaint = this.U;
        textPaint.setTextSize(f1);
        float f3 = this.v;
        f1 = this.w;
        float f2 = this.L;
        if (f2 != 1.0F && !this.c)
          paramCanvas.scale(f2, f2, f3, f1); 
        if ((this.o0 > 1 || this.p0 > 1) && (!this.J || this.c) && C() && (!this.c || this.b > this.e)) {
          f3 = this.v;
          f2 = this.j0.getLineStart(0);
          int k = textPaint.getAlpha();
          paramCanvas.translate(f3 - f2, f1);
          if (!this.c) {
            textPaint.setAlpha((int)(this.m0 * k));
            if (Build.VERSION.SDK_INT >= 31)
              textPaint.setShadowLayer(this.N, this.O, this.P, m92.l(this.Q, textPaint.getAlpha())); 
            this.j0.draw(paramCanvas);
          } 
          if (!this.c)
            textPaint.setAlpha((int)(this.l0 * k)); 
          int j = Build.VERSION.SDK_INT;
          if (j >= 31)
            textPaint.setShadowLayer(this.N, this.O, this.P, m92.l(this.Q, textPaint.getAlpha())); 
          int m = this.j0.getLineBaseline(0);
          CharSequence charSequence = this.n0;
          int n = charSequence.length();
          f1 = m;
          paramCanvas.drawText(charSequence, 0, n, 0.0F, f1, (Paint)textPaint);
          if (j >= 31)
            textPaint.setShadowLayer(this.N, this.O, this.P, this.Q); 
          if (!this.c) {
            String str = this.n0.toString().trim();
            charSequence = str;
            if (str.endsWith("…"))
              charSequence = str.substring(0, str.length() - 1); 
            textPaint.setAlpha(k);
            paramCanvas.drawText((String)charSequence, 0, Math.min(this.j0.getLineEnd(0), charSequence.length()), 0.0F, f1, (Paint)textPaint);
          } 
        } else {
          paramCanvas.translate(f3, f1);
          this.j0.draw(paramCanvas);
        } 
        paramCanvas.restoreToCount(i);
      } 
    } 
  }
  
  public final float g() {
    int i = this.t0;
    if (i != -1)
      return i; 
    float f = this.n;
    TextPaint textPaint = this.V;
    textPaint.setTextSize(f);
    textPaint.setTypeface(this.x);
    textPaint.setLetterSpacing(this.g0);
    return -textPaint.ascent();
  }
  
  public final int h(ColorStateList paramColorStateList) {
    if (paramColorStateList == null)
      return 0; 
    int[] arrayOfInt = this.S;
    return (arrayOfInt != null) ? paramColorStateList.getColorForState(arrayOfInt, 0) : paramColorStateList.getDefaultColor();
  }
  
  public final float i() {
    float f = this.m;
    TextPaint textPaint = this.V;
    textPaint.setTextSize(f);
    textPaint.setTypeface(this.A);
    textPaint.setLetterSpacing(this.h0);
    f = -textPaint.ascent();
    return textPaint.descent() + f;
  }
  
  public final void k(Configuration paramConfiguration) {
    if (Build.VERSION.SDK_INT >= 31) {
      Typeface typeface2 = this.z;
      if (typeface2 != null)
        this.y = f00.d(paramConfiguration, typeface2); 
      typeface2 = this.C;
      if (typeface2 != null)
        this.B = f00.d(paramConfiguration, typeface2); 
      Typeface typeface1 = this.y;
      if (typeface1 == null)
        typeface1 = this.z; 
      this.x = typeface1;
      typeface1 = this.B;
      if (typeface1 == null)
        typeface1 = this.C; 
      this.A = typeface1;
      l(true);
    } 
  }
  
  public final void l(boolean paramBoolean) {
    ViewGroup viewGroup = this.a;
    if ((viewGroup.getHeight() > 0 && viewGroup.getWidth() > 0) || paramBoolean) {
      float f2;
      d(1.0F, paramBoolean);
      CharSequence charSequence = this.I;
      TextPaint textPaint2 = this.U;
      if (charSequence != null && this.j0 != null) {
        boolean bool = C();
        CharSequence charSequence1 = this.I;
        charSequence = charSequence1;
        if (bool)
          charSequence = TextUtils.ellipsize(charSequence1, textPaint2, this.j0.getWidth(), this.G); 
        this.n0 = charSequence;
      } 
      charSequence = this.n0;
      float f3 = 0.0F;
      if (charSequence != null) {
        this.k0 = textPaint2.measureText(charSequence, 0, charSequence.length());
      } else {
        this.k0 = 0.0F;
      } 
      int i = Gravity.getAbsoluteGravity(this.l, this.J);
      Rect rect2 = this.i;
      Rect rect3 = this.h;
      if (rect2 == null)
        rect2 = rect3; 
      int j = i & 0x70;
      if (j != 48) {
        if (j != 80) {
          float f = (textPaint2.descent() - textPaint2.ascent()) / 2.0F;
          this.s = rect2.centerY() - f;
        } else {
          float f = rect2.bottom;
          this.s = textPaint2.ascent() + f;
        } 
      } else {
        this.s = rect2.top;
      } 
      i &= 0x800007;
      if (i != 1) {
        if (i != 5) {
          this.u = rect2.left;
        } else {
          this.u = rect2.right - this.k0;
        } 
      } else {
        this.u = rect2.centerX() - this.k0 / 2.0F;
      } 
      if (this.k0 <= rect3.width()) {
        float f = this.u;
        f = Math.max(0.0F, rect3.left - f) + f;
        this.u = f;
        this.u = Math.min(0.0F, rect3.right - this.k0 + f) + f;
      } 
      float f1 = this.n;
      TextPaint textPaint1 = this.V;
      textPaint1.setTextSize(f1);
      textPaint1.setTypeface(this.x);
      textPaint1.setLetterSpacing(this.g0);
      f1 = -textPaint1.ascent();
      if (textPaint1.descent() + f1 <= rect3.height()) {
        f1 = this.s;
        f1 = Math.max(0.0F, rect3.top - f1) + f1;
        this.s = f1;
        this.s = Math.min(0.0F, rect3.bottom - g() + f1) + f1;
      } 
      d(0.0F, paramBoolean);
      StaticLayout staticLayout = this.j0;
      if (staticLayout != null) {
        f2 = staticLayout.getHeight();
      } else {
        f2 = 0.0F;
      } 
      staticLayout = this.j0;
      if (staticLayout != null && this.o0 > 1) {
        f1 = staticLayout.getWidth();
      } else {
        CharSequence charSequence1 = this.I;
        if (charSequence1 != null) {
          f1 = textPaint2.measureText(charSequence1, 0, charSequence1.length());
        } else {
          f1 = 0.0F;
        } 
      } 
      staticLayout = this.j0;
      if (staticLayout != null) {
        i = staticLayout.getLineCount();
      } else {
        i = 0;
      } 
      this.q = i;
      i = Gravity.getAbsoluteGravity(this.k, this.J);
      j = i & 0x70;
      Rect rect1 = this.g;
      if (j != 48) {
        if (j != 80) {
          f2 /= 2.0F;
          this.r = rect1.centerY() - f2;
        } else {
          float f = rect1.bottom;
          if (this.v0)
            f3 = textPaint2.descent(); 
          this.r = f - f2 + f3;
        } 
      } else {
        this.r = rect1.top;
      } 
      i &= 0x800007;
      if (i != 1) {
        if (i != 5) {
          this.t = rect1.left;
        } else {
          this.t = rect1.right - f1;
        } 
      } else {
        this.t = rect1.centerX() - f1 / 2.0F;
      } 
      d(this.b, false);
      viewGroup.postInvalidateOnAnimation();
      b();
    } 
  }
  
  public final void n(ColorStateList paramColorStateList) {
    if (this.p != paramColorStateList || this.o != paramColorStateList) {
      this.p = paramColorStateList;
      this.o = paramColorStateList;
      l(false);
      return;
    } 
  }
  
  public final void o(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Rect rect = this.h;
    if (!m(rect, paramInt1, paramInt2, paramInt3, paramInt4)) {
      rect.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.T = true;
    } 
  }
  
  public final void p(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.i == null) {
      this.i = new Rect(paramInt1, paramInt2, paramInt3, paramInt4);
      this.T = true;
    } 
    if (!m(this.i, paramInt1, paramInt2, paramInt3, paramInt4)) {
      this.i.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.T = true;
    } 
  }
  
  public final void q(int paramInt) {
    ViewGroup viewGroup = this.a;
    vt1 vt1 = new vt1(viewGroup.getContext(), paramInt);
    ColorStateList colorStateList = vt1.k;
    if (colorStateList != null)
      this.p = colorStateList; 
    float f = vt1.l;
    if (f != 0.0F)
      this.n = f; 
    colorStateList = vt1.a;
    if (colorStateList != null)
      this.b0 = colorStateList; 
    this.Z = vt1.f;
    this.a0 = vt1.g;
    this.Y = vt1.h;
    this.g0 = vt1.j;
    ji ji1 = this.F;
    if (ji1 != null)
      ji1.r = true; 
    gm gm = new gm(this, 0);
    vt1.a();
    this.F = new ji(gm, vt1.p);
    vt1.b(viewGroup.getContext(), this.F);
    l(false);
  }
  
  public final void r(ColorStateList paramColorStateList) {
    if (this.p != paramColorStateList) {
      this.p = paramColorStateList;
      l(false);
    } 
  }
  
  public final void s(int paramInt) {
    if (this.l != paramInt) {
      this.l = paramInt;
      l(false);
    } 
  }
  
  public final boolean t(Typeface paramTypeface) {
    ji ji1 = this.F;
    if (ji1 != null)
      ji1.r = true; 
    if (this.z != paramTypeface) {
      this.z = paramTypeface;
      Typeface typeface = f00.d(this.a.getContext().getResources().getConfiguration(), paramTypeface);
      this.y = typeface;
      paramTypeface = typeface;
      if (typeface == null)
        paramTypeface = this.z; 
      this.x = paramTypeface;
      return true;
    } 
    return false;
  }
  
  public final void u(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Rect rect = this.g;
    if (!m(rect, paramInt1, paramInt2, paramInt3, paramInt4) || paramBoolean != this.v0) {
      rect.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.T = true;
      this.v0 = paramBoolean;
      return;
    } 
  }
  
  public final void v(int paramInt) {
    if (paramInt != this.o0) {
      this.o0 = paramInt;
      l(false);
    } 
  }
  
  public final void w(int paramInt) {
    ViewGroup viewGroup = this.a;
    vt1 vt1 = new vt1(viewGroup.getContext(), paramInt);
    ColorStateList colorStateList = vt1.k;
    if (colorStateList != null)
      this.o = colorStateList; 
    float f = vt1.l;
    if (f != 0.0F)
      this.m = f; 
    colorStateList = vt1.a;
    if (colorStateList != null)
      this.f0 = colorStateList; 
    this.d0 = vt1.f;
    this.e0 = vt1.g;
    this.c0 = vt1.h;
    this.h0 = vt1.j;
    ji ji1 = this.E;
    if (ji1 != null)
      ji1.r = true; 
    gm gm = new gm(this, 1);
    vt1.a();
    this.E = new ji(gm, vt1.p);
    vt1.b(viewGroup.getContext(), this.E);
    l(false);
  }
  
  public final void x(int paramInt) {
    if (this.k != paramInt) {
      this.k = paramInt;
      l(false);
    } 
  }
  
  public final void y(float paramFloat) {
    if (this.m != paramFloat) {
      this.m = paramFloat;
      l(false);
    } 
  }
  
  public final boolean z(Typeface paramTypeface) {
    ji ji1 = this.E;
    if (ji1 != null)
      ji1.r = true; 
    if (this.C != paramTypeface) {
      this.C = paramTypeface;
      Typeface typeface = f00.d(this.a.getContext().getResources().getConfiguration(), paramTypeface);
      this.B = typeface;
      paramTypeface = typeface;
      if (typeface == null)
        paramTypeface = this.C; 
      this.A = paramTypeface;
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */