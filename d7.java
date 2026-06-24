import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.widget.ImageView;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class d7 implements qs0, r41 {
  public int b;
  
  public Object c;
  
  public Object e;
  
  public d7() {
    Object object = new Object();
    ((z82)object).c = 0;
    ((z82)object).d = new char[16384];
    ((z82)object).k = new StringBuilder();
    ((z82)object).a = null;
    this.c = object;
    this.e = null;
    this.b = 0;
  }
  
  public d7(int paramInt) {
    this.b = paramInt;
  }
  
  public d7(int paramInt, String paramString, ArrayList paramArrayList1, ArrayList paramArrayList2) {
    this.b = paramInt;
    this.e = paramString;
    this.c = paramArrayList1;
  }
  
  public d7(ImageView paramImageView) {
    this.b = 0;
    this.c = paramImageView;
  }
  
  public d7(CopyOnWriteArrayList paramCopyOnWriteArrayList, int paramInt, fw0 paramfw0) {
    this.e = paramCopyOnWriteArrayList;
    this.b = paramInt;
    this.c = paramfw0;
  }
  
  public static d7 c(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    XmlResourceParser xmlResourceParser = paramResources.getXml(paramInt);
    AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
    while (true) {
      paramInt = xmlResourceParser.next();
      if (paramInt != 2 && paramInt != 1)
        continue; 
      break;
    } 
    if (paramInt == 2) {
      float[] arrayOfFloat;
      TypedArray typedArray;
      String str2 = xmlResourceParser.getName();
      str2.getClass();
      if (!str2.equals("gradient")) {
        if (str2.equals("selector")) {
          ColorStateList colorStateList = in.b(paramResources, (XmlPullParser)xmlResourceParser, attributeSet, paramTheme);
          return new d7(colorStateList.getDefaultColor(), null, colorStateList);
        } 
        str1 = xmlResourceParser.getPositionDescription();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str1);
        stringBuilder.append(": unsupported complex color tag ");
        stringBuilder.append(str2);
        throw new XmlPullParserException(stringBuilder.toString());
      } 
      str2 = xmlResourceParser.getName();
      if (str2.equals("gradient")) {
        g7 g7;
        SweepGradient sweepGradient;
        RadialGradient radialGradient;
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean bool1;
        boolean bool2;
        boolean bool3;
        boolean bool4;
        boolean bool5;
        typedArray = dd1.b0((Resources)str1, (Resources.Theme)stringBuilder, attributeSet, hc1.e);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) {
          f3 = typedArray.getFloat(8, 0.0F);
        } else {
          f3 = 0.0F;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null) {
          f4 = typedArray.getFloat(9, 0.0F);
        } else {
          f4 = 0.0F;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null) {
          f1 = typedArray.getFloat(10, 0.0F);
        } else {
          f1 = 0.0F;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null) {
          f2 = typedArray.getFloat(11, 0.0F);
        } else {
          f2 = 0.0F;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) {
          f5 = typedArray.getFloat(3, 0.0F);
        } else {
          f5 = 0.0F;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null) {
          f6 = typedArray.getFloat(4, 0.0F);
        } else {
          f6 = 0.0F;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) {
          paramInt = typedArray.getInt(2, 0);
        } else {
          paramInt = 0;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null) {
          bool1 = typedArray.getColor(0, 0);
        } else {
          bool1 = false;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
          bool3 = typedArray.getColor(7, 0);
        } else {
          bool3 = false;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
          bool4 = typedArray.getColor(1, 0);
        } else {
          bool4 = false;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
          bool5 = typedArray.getInt(6, 0);
        } else {
          bool5 = false;
        } 
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null) {
          f7 = typedArray.getFloat(5, 0.0F);
        } else {
          f7 = 0.0F;
        } 
        typedArray.recycle();
        int i = xmlResourceParser.getDepth() + 1;
        ArrayList<Float> arrayList = new ArrayList(20);
        ArrayList<Integer> arrayList1 = new ArrayList(20);
        while (true) {
          int j = xmlResourceParser.next();
          if (j != 1) {
            int k = xmlResourceParser.getDepth();
            if (k >= i || j != 3) {
              if (j != 2 || k > i || !xmlResourceParser.getName().equals("item"))
                continue; 
              typedArray = dd1.b0((Resources)str1, (Resources.Theme)stringBuilder, attributeSet, hc1.f);
              boolean bool6 = typedArray.hasValue(0);
              boolean bool7 = typedArray.hasValue(1);
              if (bool6 && bool7) {
                j = typedArray.getColor(0, 0);
                float f = typedArray.getFloat(1, 0.0F);
                typedArray.recycle();
                arrayList1.add(Integer.valueOf(j));
                arrayList.add(Float.valueOf(f));
                continue;
              } 
              str1 = xmlResourceParser.getPositionDescription();
              stringBuilder = new StringBuilder();
              stringBuilder.append(str1);
              stringBuilder.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
              throw new XmlPullParserException(stringBuilder.toString());
            } 
          } 
          break;
        } 
        if (arrayList1.size() > 0) {
          g7 = new g7(arrayList1, arrayList);
        } else {
          str1 = null;
        } 
        if (str1 == null)
          if (bool2) {
            g7 = new g7(bool1, bool3, bool4);
          } else {
            g7 = new g7(bool1, bool4);
          }  
        if (paramInt != 1) {
          LinearGradient linearGradient;
          if (paramInt != 2) {
            Shader.TileMode tileMode;
            int[] arrayOfInt = (int[])g7.c;
            arrayOfFloat = (float[])g7.e;
            if (bool5 != true) {
              if (bool5 != 2) {
                tileMode = Shader.TileMode.CLAMP;
              } else {
                tileMode = Shader.TileMode.MIRROR;
              } 
            } else {
              tileMode = Shader.TileMode.REPEAT;
            } 
            linearGradient = new LinearGradient(f3, f4, f1, f2, arrayOfInt, arrayOfFloat, tileMode);
          } else {
            sweepGradient = new SweepGradient(f5, f6, (int[])((g7)linearGradient).c, (float[])((g7)linearGradient).e);
          } 
        } else {
          if (f7 > 0.0F) {
            Shader.TileMode tileMode;
            int[] arrayOfInt = (int[])((g7)sweepGradient).c;
            arrayOfFloat = (float[])((g7)sweepGradient).e;
            if (bool5 != true) {
              if (bool5 != 2) {
                tileMode = Shader.TileMode.CLAMP;
              } else {
                tileMode = Shader.TileMode.MIRROR;
              } 
            } else {
              tileMode = Shader.TileMode.REPEAT;
            } 
            radialGradient = new RadialGradient(f5, f6, f7, arrayOfInt, arrayOfFloat, tileMode);
            return new d7(0, radialGradient, null);
          } 
          throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        } 
        return new d7(0, radialGradient, null);
      } 
      String str1 = arrayOfFloat.getPositionDescription();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str1);
      stringBuilder.append(": invalid gradient color tag ");
      stringBuilder.append((String)typedArray);
      throw new XmlPullParserException(stringBuilder.toString());
    } 
    throw new XmlPullParserException("No start tag found");
  }
  
  public void a() {
    ImageView imageView = (ImageView)this.c;
    Drawable drawable = imageView.getDrawable();
    if (drawable != null)
      l10.a(drawable); 
    if (drawable != null) {
      up up = (up)this.e;
      if (up != null)
        y6.e(drawable, up, imageView.getDrawableState()); 
    } 
  }
  
  public boolean b(ss0 paramss0, int paramInt) {
    ms0 ms0;
    int j = this.b;
    z40 z40 = (z40)this.e;
    int i = z40.a0.c0;
    Integer integer = ((ArrayList<Integer>)this.c).get(paramInt);
    if (i == 1 && integer.intValue() != 0) {
      ms0 = new ms0(z40.P());
      ms0.d(z40.U(2131887014, new Object[] { j50.g() }));
      ms0.l(2131886443);
      ms0.n(2131886639);
      ms0.p();
      return true;
    } 
    if (j != ms0.intValue())
      z40.H0(i, (Integer)ms0, j); 
    return false;
  }
  
  public boolean d() {
    if ((Shader)this.c == null) {
      ColorStateList colorStateList = (ColorStateList)this.e;
      if (colorStateList != null && colorStateList.isStateful())
        return true; 
    } 
    return false;
  }
  
  public void e(AttributeSet paramAttributeSet, int paramInt) {
    ImageView imageView = (ImageView)this.c;
    Context context = imageView.getContext();
    int[] arrayOfInt = nc1.f;
    zv0 zv0 = zv0.y(paramInt, 0, context, paramAttributeSet, arrayOfInt);
    TypedArray typedArray = (TypedArray)zv0.e;
    v22.m((View)imageView, imageView.getContext(), arrayOfInt, paramAttributeSet, (TypedArray)zv0.e, paramInt);
    try {
      Drawable drawable2 = imageView.getDrawable();
      Drawable drawable1 = drawable2;
      if (drawable2 == null) {
        paramInt = typedArray.getResourceId(1, -1);
        drawable1 = drawable2;
        if (paramInt != -1) {
          drawable2 = ws2.I(imageView.getContext(), paramInt);
          drawable1 = drawable2;
          if (drawable2 != null) {
            imageView.setImageDrawable(drawable2);
            drawable1 = drawable2;
          } 
        } 
      } 
    } finally {}
    if (paramAttributeSet != null)
      l10.a((Drawable)paramAttributeSet); 
    if (typedArray.hasValue(2))
      imageView.setImageTintList(zv0.n(2)); 
    if (typedArray.hasValue(3))
      imageView.setImageTintMode(l10.c(typedArray.getInt(3, -1), null)); 
    zv0.z();
  }
  
  public void f() {
    fw0 fw0 = (fw0)this.c;
    fw0.getClass();
    for (iw0 iw0 : this.e) {
      jw0 jw0 = iw0.b;
      Handler handler = iw0.a;
      hw0 hw0 = new hw0(this, jw0, fw0, 1);
      if (handler.getLooper() == Looper.myLooper()) {
        hw0.run();
        continue;
      } 
      handler.post(hw0);
    } 
  }
  
  public void g() {
    fw0 fw0 = (fw0)this.c;
    fw0.getClass();
    for (iw0 iw0 : this.e) {
      jw0 jw0 = iw0.b;
      Handler handler = iw0.a;
      hw0 hw0 = new hw0(this, jw0, fw0, 0);
      if (handler.getLooper() == Looper.myLooper()) {
        hw0.run();
        continue;
      } 
      handler.post(hw0);
    } 
  }
  
  public Object h(StringReader paramStringReader, fb0 paramfb0) {
    z82 z82 = (z82)this.c;
    z82.a = paramStringReader;
    byte b = 0;
    z82.j = false;
    z82.g = 0;
    z82.h = 0;
    z82.e = 0;
    z82.f = 0;
    z82.i = 0;
    z82.c = 0;
    this.e = null;
    this.b = 0;
    LinkedList linkedList1 = new LinkedList();
    LinkedList linkedList2 = new LinkedList();
    while (true) {
      int i = z82.h;
      char[] arrayOfChar1 = z82.d;
      char[] arrayOfChar2 = z82.m;
      int[] arrayOfInt3 = z82.p;
      int[] arrayOfInt2 = z82.o;
      int[] arrayOfInt1 = z82.q;
      while (true) {
        int k = z82.e;
        int j = z82.i;
        z82.i = k - z82.g + j;
        z82.g = k;
        z82.f = k;
        z82.b = z82.l[z82.c];
        j = k;
        byte b1 = -1;
        while (true) {
          b1 = 0;
          k = b;
          b = b1;
          object = SYNTHETIC_LOCAL_VARIABLE_9;
        } 
        break;
      } 
      break;
    } 
  }
  
  public void i(Object paramObject) {
    hn2 hn2 = (hn2)this.c;
    oq2 oq2 = (oq2)this.e;
    int i = this.b;
    if (((Boolean)paramObject).booleanValue()) {
      paramObject = oq2.n(oq2);
      String str = hn2.d;
      paramObject.a();
      ((oq2)((ov2)paramObject).c).q(str);
      paramObject.a();
      ((oq2)((ov2)paramObject).c).r(str);
      Long long_ = hn2.e;
      if (long_ != null) {
        int m = (int)long_.longValue();
        paramObject.a();
        ((oq2)((ov2)paramObject).c).s(m);
      } 
      paramObject = paramObject.b();
      int k = hn2.i;
      int j = k - 1;
      if (k != 0) {
        i--;
        fa1 fa1 = fa1.c;
        if (j != 0) {
          if (j != 1) {
            paramObject = new ya(Integer.valueOf(i), paramObject, fa1);
          } else {
            paramObject = new ya(Integer.valueOf(i), paramObject, fa1.b);
          } 
        } else {
          paramObject = new ya(Integer.valueOf(i), paramObject, fa1);
        } 
        hn2.j.b("analytics event: %s", new Object[] { paramObject });
        cn cn = hn2.g;
        if (cn != null)
          cn.u((ya)paramObject); 
        return;
      } 
      throw null;
    } 
  }
  
  public void j(int paramInt) {
    ImageView imageView = (ImageView)this.c;
    if (paramInt != 0) {
      Drawable drawable = ws2.I(imageView.getContext(), paramInt);
      if (drawable != null)
        l10.a(drawable); 
      imageView.setImageDrawable(drawable);
    } else {
      imageView.setImageDrawable(null);
    } 
    a();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */