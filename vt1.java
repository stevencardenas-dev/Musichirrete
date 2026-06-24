import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

public final class vt1 {
  public final ColorStateList a;
  
  public final String b;
  
  public final String c;
  
  public final int d;
  
  public final int e;
  
  public final float f;
  
  public final float g;
  
  public final float h;
  
  public final boolean i;
  
  public final float j;
  
  public ColorStateList k;
  
  public final float l;
  
  public final int m;
  
  public boolean n = false;
  
  public boolean o = false;
  
  public Typeface p;
  
  public vt1(Context paramContext, int paramInt) {
    TypedArray typedArray2 = paramContext.obtainStyledAttributes(paramInt, nc1.x);
    this.l = typedArray2.getDimension(0, 0.0F);
    byte b2 = 3;
    this.k = wf2.u(paramContext, typedArray2, 3);
    wf2.u(paramContext, typedArray2, 4);
    wf2.u(paramContext, typedArray2, 5);
    this.d = typedArray2.getInt(2, 0);
    this.e = typedArray2.getInt(1, 1);
    byte b1 = 12;
    if (!typedArray2.hasValue(12))
      b1 = 10; 
    this.m = typedArray2.getResourceId(b1, 0);
    this.b = typedArray2.getString(b1);
    typedArray2.getBoolean(14, false);
    this.a = wf2.u(paramContext, typedArray2, 6);
    this.f = typedArray2.getFloat(7, 0.0F);
    this.g = typedArray2.getFloat(8, 0.0F);
    this.h = typedArray2.getFloat(9, 0.0F);
    typedArray2.recycle();
    TypedArray typedArray1 = paramContext.obtainStyledAttributes(paramInt, zb1.v);
    this.i = typedArray1.hasValue(0);
    this.j = typedArray1.getFloat(0, 0.0F);
    if (Build.VERSION.SDK_INT >= 26) {
      if (typedArray1.hasValue(3)) {
        paramInt = b2;
      } else {
        paramInt = 1;
      } 
      this.c = typedArray1.getString(paramInt);
    } 
    typedArray1.recycle();
  }
  
  public final void a() {
    Typeface typeface = this.p;
    int i = this.d;
    if (typeface == null) {
      String str = this.b;
      if (str != null)
        this.p = Typeface.create(str, i); 
    } 
    if (this.p == null) {
      int j = this.e;
      if (j != 1) {
        if (j != 2) {
          if (j != 3) {
            this.p = Typeface.DEFAULT;
          } else {
            this.p = Typeface.MONOSPACE;
          } 
        } else {
          this.p = Typeface.SERIF;
        } 
      } else {
        this.p = Typeface.SANS_SERIF;
      } 
      this.p = Typeface.create(this.p, i);
    } 
  }
  
  public final void b(Context paramContext, m92 paramm92) {
    if (!c(paramContext))
      a(); 
    int i = this.m;
    if (i == 0)
      this.n = true; 
    if (this.n) {
      paramm92.Q(this.p, true);
      return;
    } 
    try {
      tt1 tt1 = new tt1();
      this(this, paramm92);
      ThreadLocal threadLocal = lg1.a;
      if (paramContext.isRestricted()) {
        tt1.f(-4);
        return;
      } 
      TypedValue typedValue = new TypedValue();
      this();
      lg1.a(paramContext, i, typedValue, 0, tt1, false, false);
      return;
    } catch (android.content.res.Resources.NotFoundException notFoundException) {
      this.n = true;
      paramm92.P(1);
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder("Error loading font ");
      stringBuilder.append(this.b);
      Log.d("TextAppearance", stringBuilder.toString(), exception);
      this.n = true;
      paramm92.P(-3);
    } 
  }
  
  public final boolean c(Context paramContext) {
    if (this.n)
      return true; 
    int i = this.m;
    if (i != 0) {
      Typeface typeface1;
      Typeface typeface2;
      ThreadLocal threadLocal = lg1.a;
      boolean bool = paramContext.isRestricted();
      Context context = null;
      if (bool) {
        threadLocal = null;
      } else {
        typeface2 = lg1.a(paramContext, i, new TypedValue(), 0, null, false, true);
      } 
      if (typeface2 != null) {
        this.p = typeface2;
        this.n = true;
        return true;
      } 
      if (this.o) {
        paramContext = context;
      } else {
        Context context1;
        this.o = true;
        Resources resources = paramContext.getResources();
        i = this.m;
        if (i != 0 && resources.getResourceTypeName(i).equals("font"))
          try {
            XmlResourceParser xmlResourceParser = resources.getXml(i);
            while (xmlResourceParser.getEventType() != 1) {
              TypedArray typedArray;
              if (xmlResourceParser.getEventType() == 2 && xmlResourceParser.getName().equals("font-family")) {
                typedArray = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xmlResourceParser), hc1.b);
                String str = typedArray.getString(7);
                typedArray.recycle();
                // Byte code: goto -> 215
              } 
              typedArray.next();
            } 
          } finally {} 
        resources = null;
        if (resources == null) {
          context1 = context;
        } else {
          Context context2;
          Typeface typeface = Typeface.create((String)context1, 0);
          if (typeface == Typeface.DEFAULT) {
            context2 = context;
          } else {
            typeface1 = Typeface.create((Typeface)context2, this.d);
          } 
        } 
      } 
      if (typeface1 != null) {
        this.p = typeface1;
        this.n = true;
        return true;
      } 
    } 
    return false;
  }
  
  public final void d(Context paramContext, TextPaint paramTextPaint, xt1 paramxt1) {
    int i;
    e(paramContext, paramTextPaint, paramxt1);
    ColorStateList colorStateList = this.k;
    if (colorStateList != null) {
      i = colorStateList.getColorForState(paramTextPaint.drawableState, colorStateList.getDefaultColor());
    } else {
      i = -16777216;
    } 
    paramTextPaint.setColor(i);
    colorStateList = this.a;
    if (colorStateList != null) {
      i = colorStateList.getColorForState(paramTextPaint.drawableState, colorStateList.getDefaultColor());
    } else {
      i = 0;
    } 
    paramTextPaint.setShadowLayer(this.h, this.f, this.g, i);
  }
  
  public final void e(Context paramContext, TextPaint paramTextPaint, m92 paramm92) {
    if (c(paramContext) && this.n) {
      Typeface typeface = this.p;
      if (typeface != null) {
        f(paramContext, paramTextPaint, typeface);
        return;
      } 
    } 
    a();
    f(paramContext, paramTextPaint, this.p);
    b(paramContext, new ut1(this, paramContext, paramTextPaint, paramm92));
  }
  
  public final void f(Context paramContext, TextPaint paramTextPaint, Typeface paramTypeface) {
    float f;
    boolean bool;
    Typeface typeface = f00.d(paramContext.getResources().getConfiguration(), paramTypeface);
    if (typeface != null)
      paramTypeface = typeface; 
    paramTextPaint.setTypeface(paramTypeface);
    int i = (paramTypeface.getStyle() ^ 0xFFFFFFFF) & this.d;
    if ((i & 0x1) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    paramTextPaint.setFakeBoldText(bool);
    if ((i & 0x2) != 0) {
      f = -0.25F;
    } else {
      f = 0.0F;
    } 
    paramTextPaint.setTextSkewX(f);
    paramTextPaint.setTextSize(this.l);
    if (Build.VERSION.SDK_INT >= 26)
      paramTextPaint.setFontVariationSettings(this.c); 
    if (this.i)
      paramTextPaint.setLetterSpacing(this.j); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */