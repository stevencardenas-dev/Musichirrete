import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import java.util.ArrayDeque;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r3.IKWi.AyxAR;

public final class w12 extends n12 {
  public static final PorterDuff.Mode l = PorterDuff.Mode.SRC_IN;
  
  public u12 c;
  
  public PorterDuffColorFilter e;
  
  public ColorFilter f;
  
  public boolean g;
  
  public boolean h = true;
  
  public final float[] i = new float[9];
  
  public final Matrix j = new Matrix();
  
  public final Rect k = new Rect();
  
  public w12() {
    Drawable.ConstantState constantState = new Drawable.ConstantState();
    ((u12)constantState).c = null;
    ((u12)constantState).d = l;
    ((u12)constantState).b = new t12();
    this.c = (u12)constantState;
  }
  
  public w12(u12 paramu12) {
    this.c = paramu12;
    this.e = a(paramu12.c, paramu12.d);
  }
  
  public final PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode) {
    return (paramColorStateList == null || paramMode == null) ? null : new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  public final boolean canApplyTheme() {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.canApplyTheme(); 
    return false;
  }
  
  public final void draw(Canvas paramCanvas) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.draw(paramCanvas);
      return;
    } 
    Rect rect = this.k;
    copyBounds(rect);
    if (rect.width() > 0 && rect.height() > 0) {
      PorterDuffColorFilter porterDuffColorFilter;
      ColorFilter colorFilter2 = this.f;
      ColorFilter colorFilter1 = colorFilter2;
      if (colorFilter2 == null)
        porterDuffColorFilter = this.e; 
      Matrix matrix = this.j;
      paramCanvas.getMatrix(matrix);
      float[] arrayOfFloat = this.i;
      matrix.getValues(arrayOfFloat);
      float f2 = Math.abs(arrayOfFloat[0]);
      float f1 = Math.abs(arrayOfFloat[4]);
      float f4 = Math.abs(arrayOfFloat[1]);
      float f3 = Math.abs(arrayOfFloat[3]);
      if (f4 != 0.0F || f3 != 0.0F) {
        f2 = 1.0F;
        f1 = 1.0F;
      } 
      int i = (int)(rect.width() * f2);
      int j = (int)(rect.height() * f1);
      i = Math.min(2048, i);
      int k = Math.min(2048, j);
      if (i > 0 && k > 0) {
        Paint paint;
        t12 t12;
        j = paramCanvas.save();
        paramCanvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
          paramCanvas.translate(rect.width(), 0.0F);
          paramCanvas.scale(-1.0F, 1.0F);
        } 
        rect.offsetTo(0, 0);
        u12 u122 = this.c;
        Bitmap bitmap = u122.f;
        if (bitmap == null || i != bitmap.getWidth() || k != u122.f.getHeight()) {
          u122.f = Bitmap.createBitmap(i, k, Bitmap.Config.ARGB_8888);
          u122.k = true;
        } 
        boolean bool = this.h;
        u122 = this.c;
        if (!bool) {
          u122.f.eraseColor(0);
          Canvas canvas = new Canvas(u122.f);
          t12 = u122.b;
          t12.a(t12.g, t12.p, canvas, i, k);
        } else if (((u12)t12).k || ((u12)t12).g != ((u12)t12).c || ((u12)t12).h != ((u12)t12).d || ((u12)t12).j != ((u12)t12).e || ((u12)t12).i != ((u12)t12).b.getRootAlpha()) {
          u12 u124 = this.c;
          u124.f.eraseColor(0);
          Canvas canvas = new Canvas(u124.f);
          t12 t121 = u124.b;
          t121.a(t121.g, t12.p, canvas, i, k);
          u12 u123 = this.c;
          u123.g = u123.c;
          u123.h = u123.d;
          u123.i = u123.b.getRootAlpha();
          u123.j = u123.e;
          u123.k = false;
        } 
        u12 u121 = this.c;
        if (u121.b.getRootAlpha() >= 255 && porterDuffColorFilter == null) {
          porterDuffColorFilter = null;
        } else {
          if (u121.l == null) {
            Paint paint1 = new Paint();
            u121.l = paint1;
            paint1.setFilterBitmap(true);
          } 
          u121.l.setAlpha(u121.b.getRootAlpha());
          u121.l.setColorFilter((ColorFilter)porterDuffColorFilter);
          paint = u121.l;
        } 
        paramCanvas.drawBitmap(u121.f, null, rect, paint);
        paramCanvas.restoreToCount(j);
      } 
    } 
  }
  
  public final int getAlpha() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getAlpha() : this.c.b.getRootAlpha();
  }
  
  public final int getChangingConfigurations() {
    Drawable drawable = this.b;
    if (drawable != null)
      return drawable.getChangingConfigurations(); 
    int i = super.getChangingConfigurations();
    return this.c.getChangingConfigurations() | i;
  }
  
  public final ColorFilter getColorFilter() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getColorFilter() : this.f;
  }
  
  public final Drawable.ConstantState getConstantState() {
    if (this.b != null)
      return new v12(this.b.getConstantState()); 
    this.c.a = getChangingConfigurations();
    return this.c;
  }
  
  public final int getIntrinsicHeight() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicHeight() : (int)this.c.b.i;
  }
  
  public final int getIntrinsicWidth() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getIntrinsicWidth() : (int)this.c.b.h;
  }
  
  public final int getOpacity() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.getOpacity() : -3;
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    } 
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    StringBuilder stringBuilder1;
    int i;
    PorterDuff.Mode mode2;
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    } 
    u12 u121 = this.c;
    u121.b = new t12();
    TypedArray typedArray = dd1.b0(paramResources, paramTheme, paramAttributeSet, z51.a);
    u12 u122 = this.c;
    t12 t12 = u122.b;
    if (!dd1.J(paramXmlPullParser, "tintMode")) {
      i = -1;
    } else {
      i = typedArray.getInt(6, -1);
    } 
    PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
    if (i != 3) {
      mode2 = mode3;
      if (i != 5)
        if (i != 9) {
          switch (i) {
            default:
              mode2 = mode3;
              break;
            case 16:
              mode2 = PorterDuff.Mode.ADD;
              break;
            case 15:
              mode2 = PorterDuff.Mode.SCREEN;
              break;
            case 14:
              mode2 = PorterDuff.Mode.MULTIPLY;
              break;
          } 
        } else {
          mode2 = PorterDuff.Mode.SRC_ATOP;
        }  
    } else {
      mode2 = PorterDuff.Mode.SRC_OVER;
    } 
    u122.d = mode2;
    String str2 = AyxAR.HrrAC;
    String str3 = PwbbJfsdcHrAjW.UlPNRzvZxhESHf;
    String str4 = paramXmlPullParser.getAttributeValue(str3, str2);
    mode3 = null;
    PorterDuff.Mode mode1 = mode3;
    if (str4 != null) {
      TypedValue typedValue = new TypedValue();
      typedArray.getValue(1, typedValue);
      i = typedValue.type;
      if (i != 2) {
        if (i >= 28 && i <= 31) {
          ColorStateList colorStateList = ColorStateList.valueOf(typedValue.data);
        } else {
          Resources resources = typedArray.getResources();
          i = typedArray.getResourceId(1, 0);
          ThreadLocal threadLocal = in.a;
          try {
            ColorStateList colorStateList = in.a(resources, resources.getXml(i), paramTheme);
          } catch (Exception exception) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", exception);
            mode1 = mode3;
          } 
        } 
      } else {
        stringBuilder1 = new StringBuilder("Failed to resolve attribute at index 1: ");
        stringBuilder1.append(mode1);
        throw new UnsupportedOperationException(stringBuilder1.toString());
      } 
    } 
    if (mode1 != null)
      u122.c = (ColorStateList)mode1; 
    boolean bool2 = u122.e;
    boolean bool1 = bool2;
    if (paramXmlPullParser.getAttributeValue(str3, "autoMirrored") != null)
      bool1 = typedArray.getBoolean(5, bool2); 
    u122.e = bool1;
    float f2 = t12.j;
    float f1 = f2;
    if (paramXmlPullParser.getAttributeValue(str3, "viewportWidth") != null)
      f1 = typedArray.getFloat(7, f2); 
    t12.j = f1;
    f2 = t12.k;
    f1 = f2;
    if (paramXmlPullParser.getAttributeValue(str3, "viewportHeight") != null)
      f1 = typedArray.getFloat(8, f2); 
    t12.k = f1;
    if (t12.j > 0.0F) {
      if (f1 > 0.0F) {
        t12.h = typedArray.getDimension(3, t12.h);
        f1 = typedArray.getDimension(2, t12.i);
        t12.i = f1;
        if (t12.h > 0.0F) {
          if (f1 > 0.0F) {
            f2 = t12.getAlpha();
            f1 = f2;
            if (paramXmlPullParser.getAttributeValue(str3, "alpha") != null)
              f1 = typedArray.getFloat(4, f2); 
            t12.setAlpha(f1);
            String str7 = typedArray.getString(0);
            if (str7 != null) {
              t12.m = str7;
              t12.o.put(str7, t12);
            } 
            typedArray.recycle();
            u121.a = getChangingConfigurations();
            u121.k = true;
            u122 = this.c;
            t12 t121 = u122.b;
            ArrayDeque<q12> arrayDeque = new ArrayDeque();
            q12 q12 = t121.g;
            b9 b9 = t121.o;
            arrayDeque.push(q12);
            int k = paramXmlPullParser.getEventType();
            int j = paramXmlPullParser.getDepth() + 1;
            for (i = 1; k != 1 && (paramXmlPullParser.getDepth() >= j || k != 3); i = m) {
              int m;
              if (k == 2) {
                Paint.Join join;
                String str8 = paramXmlPullParser.getName();
                q12 q121 = arrayDeque.peek();
                if ("path".equals(str8)) {
                  s12 s12 = new s12();
                  ((p12)s12).e = 0.0F;
                  ((p12)s12).g = 1.0F;
                  ((p12)s12).h = 1.0F;
                  ((p12)s12).i = 0.0F;
                  ((p12)s12).j = 1.0F;
                  ((p12)s12).k = 0.0F;
                  Paint.Cap cap = Paint.Cap.BUTT;
                  ((p12)s12).l = cap;
                  Paint.Join join1 = Paint.Join.MITER;
                  ((p12)s12).m = join1;
                  ((p12)s12).n = 4.0F;
                  TypedArray typedArray1 = dd1.b0((Resources)stringBuilder1, paramTheme, paramAttributeSet, z51.c);
                  if (paramXmlPullParser.getAttributeValue(str3, "pathData") != null) {
                    String str9 = typedArray1.getString(0);
                    if (str9 != null)
                      s12.b = str9; 
                    str9 = typedArray1.getString(2);
                    if (str9 != null)
                      s12.a = g92.w(str9); 
                    ((p12)s12).f = dd1.D(typedArray1, paramXmlPullParser, paramTheme, "fillColor", 1);
                    f2 = ((p12)s12).h;
                    f1 = f2;
                    if (paramXmlPullParser.getAttributeValue(str3, kOkiWEITVb.ROoUZLkjYfpjwpQ) != null)
                      f1 = typedArray1.getFloat(12, f2); 
                    ((p12)s12).h = f1;
                    if (paramXmlPullParser.getAttributeValue(str3, "strokeLineCap") != null) {
                      i = typedArray1.getInt(8, -1);
                    } else {
                      i = -1;
                    } 
                    Paint.Cap cap1 = ((p12)s12).l;
                    if (i != 0)
                      if (i != 1) {
                        if (i != 2) {
                          cap = cap1;
                        } else {
                          cap = Paint.Cap.SQUARE;
                        } 
                      } else {
                        cap = Paint.Cap.ROUND;
                      }  
                    ((p12)s12).l = cap;
                    if (paramXmlPullParser.getAttributeValue(str3, "strokeLineJoin") != null) {
                      i = typedArray1.getInt(9, -1);
                    } else {
                      i = -1;
                    } 
                    join = ((p12)s12).m;
                    if (i != 0) {
                      if (i != 1) {
                        if (i == 2)
                          join = Paint.Join.BEVEL; 
                      } else {
                        join = Paint.Join.ROUND;
                      } 
                    } else {
                      join = join1;
                    } 
                    ((p12)s12).m = join;
                    f2 = ((p12)s12).n;
                    f1 = f2;
                    if (paramXmlPullParser.getAttributeValue(str3, "strokeMiterLimit") != null)
                      f1 = typedArray1.getFloat(10, f2); 
                    ((p12)s12).n = f1;
                    ((p12)s12).d = dd1.D(typedArray1, paramXmlPullParser, paramTheme, "strokeColor", 3);
                    f2 = ((p12)s12).g;
                    f1 = f2;
                    if (paramXmlPullParser.getAttributeValue(str3, "strokeAlpha") != null)
                      f1 = typedArray1.getFloat(11, f2); 
                    ((p12)s12).g = f1;
                    f2 = ((p12)s12).e;
                    f1 = f2;
                    if (paramXmlPullParser.getAttributeValue(str3, "strokeWidth") != null)
                      f1 = typedArray1.getFloat(4, f2); 
                    ((p12)s12).e = f1;
                    f2 = ((p12)s12).j;
                    f1 = f2;
                    if (paramXmlPullParser.getAttributeValue(str3, jHxlGgUTadw.nrn) != null)
                      f1 = typedArray1.getFloat(6, f2); 
                    ((p12)s12).j = f1;
                    f2 = ((p12)s12).k;
                    f1 = f2;
                    if (paramXmlPullParser.getAttributeValue(str3, IGBYXeDFmKYajx.BiQJcCAw) != null)
                      f1 = typedArray1.getFloat(7, f2); 
                    ((p12)s12).k = f1;
                    f2 = ((p12)s12).i;
                    f1 = f2;
                    if (paramXmlPullParser.getAttributeValue(str3, "trimPathStart") != null)
                      f1 = typedArray1.getFloat(5, f2); 
                    ((p12)s12).i = f1;
                    int n = s12.c;
                    i = n;
                    if (paramXmlPullParser.getAttributeValue(str3, "fillType") != null)
                      i = typedArray1.getInt(13, n); 
                    s12.c = i;
                  } 
                  typedArray1.recycle();
                  q121.b.add(s12);
                  if (s12.getPathName() != null)
                    b9.put(s12.getPathName(), s12); 
                  u122.a = u122.a;
                  i = 0;
                } else {
                  s12 s12;
                  if ("clip-path".equals(join)) {
                    s12 = new s12();
                    if (paramXmlPullParser.getAttributeValue(str3, "pathData") != null) {
                      int n;
                      TypedArray typedArray1 = dd1.b0((Resources)stringBuilder1, paramTheme, paramAttributeSet, z51.d);
                      String str9 = typedArray1.getString(0);
                      if (str9 != null)
                        s12.b = str9; 
                      str9 = typedArray1.getString(1);
                      if (str9 != null)
                        s12.a = g92.w(str9); 
                      if (!dd1.J(paramXmlPullParser, "fillType")) {
                        n = 0;
                      } else {
                        n = typedArray1.getInt(2, 0);
                      } 
                      s12.c = n;
                      typedArray1.recycle();
                    } 
                    q121.b.add(s12);
                    if (s12.getPathName() != null)
                      b9.put(s12.getPathName(), s12); 
                    u122.a = u122.a;
                  } else if ("group".equals(s12)) {
                    q12 q122 = new q12();
                    typedArray = dd1.b0((Resources)stringBuilder1, paramTheme, paramAttributeSet, z51.b);
                    f1 = q122.c;
                    if (paramXmlPullParser.getAttributeValue(str3, "rotation") != null)
                      f1 = typedArray.getFloat(5, f1); 
                    q122.c = f1;
                    q122.d = typedArray.getFloat(1, q122.d);
                    q122.e = typedArray.getFloat(2, q122.e);
                    f2 = q122.f;
                    f1 = f2;
                    if (paramXmlPullParser.getAttributeValue(str3, "scaleX") != null)
                      f1 = typedArray.getFloat(3, f2); 
                    q122.f = f1;
                    f1 = q122.g;
                    if (paramXmlPullParser.getAttributeValue(str3, FgdLmmRfTxSFKI.GgsDJFPmgv) != null)
                      f1 = typedArray.getFloat(4, f1); 
                    q122.g = f1;
                    f1 = q122.h;
                    if (paramXmlPullParser.getAttributeValue(str3, "translateX") != null)
                      f1 = typedArray.getFloat(6, f1); 
                    q122.h = f1;
                    f1 = q122.i;
                    if (paramXmlPullParser.getAttributeValue(str3, "translateY") != null)
                      f1 = typedArray.getFloat(7, f1); 
                    q122.i = f1;
                    String str9 = typedArray.getString(0);
                    if (str9 != null)
                      q122.k = str9; 
                    q122.c();
                    typedArray.recycle();
                    q121.b.add(q122);
                    arrayDeque.push(q122);
                    if (q122.getGroupName() != null)
                      b9.put(q122.getGroupName(), q122); 
                    u122.a = u122.a;
                  } 
                } 
                m = i;
              } else {
                m = i;
                if (k == 3) {
                  m = i;
                  if ("group".equals(paramXmlPullParser.getName())) {
                    arrayDeque.pop();
                    m = i;
                  } 
                } 
              } 
              k = paramXmlPullParser.next();
            } 
            if (i == 0) {
              this.e = a(u121.c, u121.d);
              return;
            } 
            throw new XmlPullParserException("no path defined");
          } 
          String str6 = typedArray.getPositionDescription();
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append(str6);
          stringBuilder1.append("<vector> tag requires height > 0");
          throw new XmlPullParserException(stringBuilder1.toString());
        } 
        String str5 = typedArray.getPositionDescription();
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str5);
        stringBuilder1.append("<vector> tag requires width > 0");
        throw new XmlPullParserException(stringBuilder1.toString());
      } 
      String str = typedArray.getPositionDescription();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str);
      stringBuilder.append("<vector> tag requires viewportHeight > 0");
      throw new XmlPullParserException(stringBuilder.toString());
    } 
    String str1 = typedArray.getPositionDescription();
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str1);
    stringBuilder2.append("<vector> tag requires viewportWidth > 0");
    throw new XmlPullParserException(stringBuilder2.toString());
  }
  
  public final void invalidateSelf() {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.invalidateSelf();
      return;
    } 
    super.invalidateSelf();
  }
  
  public final boolean isAutoMirrored() {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.isAutoMirrored() : this.c.e;
  }
  
  public final boolean isStateful() {
    Drawable drawable = this.b;
    if (drawable != null)
      return drawable.isStateful(); 
    if (!super.isStateful()) {
      u12 u121 = this.c;
      if (u121 != null) {
        t12 t12 = u121.b;
        if (t12.n == null)
          t12.n = Boolean.valueOf(t12.g.a()); 
        if (!t12.n.booleanValue()) {
          ColorStateList colorStateList = this.c.c;
          return (colorStateList != null && colorStateList.isStateful());
        } 
      } else {
        return false;
      } 
    } 
    return true;
  }
  
  public final Drawable mutate() {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.mutate();
      return this;
    } 
    if (!this.g && super.mutate() == this) {
      u12 u121 = this.c;
      Drawable.ConstantState constantState = new Drawable.ConstantState();
      ((u12)constantState).c = null;
      ((u12)constantState).d = l;
      if (u121 != null) {
        ((u12)constantState).a = u121.a;
        t12 t12 = new t12(u121.b);
        ((u12)constantState).b = t12;
        if (u121.b.e != null)
          t12.e = new Paint(u121.b.e); 
        if (u121.b.d != null)
          ((u12)constantState).b.d = new Paint(u121.b.d); 
        ((u12)constantState).c = u121.c;
        ((u12)constantState).d = u121.d;
        ((u12)constantState).e = u121.e;
      } 
      this.c = (u12)constantState;
      this.g = true;
    } 
    return this;
  }
  
  public final void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.b;
    if (drawable != null)
      drawable.setBounds(paramRect); 
  }
  
  public final boolean onStateChange(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroid/graphics/drawable/Drawable;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 18
    //   11: aload #4
    //   13: aload_1
    //   14: invokevirtual setState : ([I)Z
    //   17: ireturn
    //   18: aload_0
    //   19: getfield c : Lu12;
    //   22: astore #4
    //   24: aload #4
    //   26: getfield c : Landroid/content/res/ColorStateList;
    //   29: astore #6
    //   31: aload #6
    //   33: ifnull -> 69
    //   36: aload #4
    //   38: getfield d : Landroid/graphics/PorterDuff$Mode;
    //   41: astore #5
    //   43: aload #5
    //   45: ifnull -> 69
    //   48: aload_0
    //   49: aload_0
    //   50: aload #6
    //   52: aload #5
    //   54: invokevirtual a : (Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   57: putfield e : Landroid/graphics/PorterDuffColorFilter;
    //   60: aload_0
    //   61: invokevirtual invalidateSelf : ()V
    //   64: iconst_1
    //   65: istore_2
    //   66: goto -> 71
    //   69: iconst_0
    //   70: istore_2
    //   71: aload #4
    //   73: getfield b : Lt12;
    //   76: astore #5
    //   78: aload #5
    //   80: getfield n : Ljava/lang/Boolean;
    //   83: ifnonnull -> 102
    //   86: aload #5
    //   88: aload #5
    //   90: getfield g : Lq12;
    //   93: invokevirtual a : ()Z
    //   96: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   99: putfield n : Ljava/lang/Boolean;
    //   102: aload #5
    //   104: getfield n : Ljava/lang/Boolean;
    //   107: invokevirtual booleanValue : ()Z
    //   110: ifeq -> 148
    //   113: aload #4
    //   115: getfield b : Lt12;
    //   118: getfield g : Lq12;
    //   121: aload_1
    //   122: invokevirtual b : ([I)Z
    //   125: istore_3
    //   126: aload #4
    //   128: aload #4
    //   130: getfield k : Z
    //   133: iload_3
    //   134: ior
    //   135: putfield k : Z
    //   138: iload_3
    //   139: ifeq -> 148
    //   142: aload_0
    //   143: invokevirtual invalidateSelf : ()V
    //   146: iconst_1
    //   147: ireturn
    //   148: iload_2
    //   149: ireturn
  }
  
  public final void scheduleSelf(Runnable paramRunnable, long paramLong) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.scheduleSelf(paramRunnable, paramLong);
      return;
    } 
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public final void setAlpha(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setAlpha(paramInt);
      return;
    } 
    if (this.c.b.getRootAlpha() != paramInt) {
      this.c.b.setRootAlpha(paramInt);
      invalidateSelf();
    } 
  }
  
  public final void setAutoMirrored(boolean paramBoolean) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setAutoMirrored(paramBoolean);
      return;
    } 
    this.c.e = paramBoolean;
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setColorFilter(paramColorFilter);
      return;
    } 
    this.f = paramColorFilter;
    invalidateSelf();
  }
  
  public final void setTint(int paramInt) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setTint(paramInt);
      return;
    } 
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public final void setTintList(ColorStateList paramColorStateList) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setTintList(paramColorStateList);
      return;
    } 
    u12 u121 = this.c;
    if (u121.c != paramColorStateList) {
      u121.c = paramColorStateList;
      this.e = a(paramColorStateList, u121.d);
      invalidateSelf();
    } 
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.setTintMode(paramMode);
      return;
    } 
    u12 u121 = this.c;
    if (u121.d != paramMode) {
      u121.d = paramMode;
      this.e = a(u121.c, paramMode);
      invalidateSelf();
    } 
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    Drawable drawable = this.b;
    return (drawable != null) ? drawable.setVisible(paramBoolean1, paramBoolean2) : super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public final void unscheduleSelf(Runnable paramRunnable) {
    Drawable drawable = this.b;
    if (drawable != null) {
      drawable.unscheduleSelf(paramRunnable);
      return;
    } 
    super.unscheduleSelf(paramRunnable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */