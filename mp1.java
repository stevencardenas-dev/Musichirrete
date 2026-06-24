import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class mp1 {
  public final int a;
  
  public final vl1 b;
  
  public final int[][] c;
  
  public final vl1[] d;
  
  public final kp1 e;
  
  public final kp1 f;
  
  public final kp1 g;
  
  public final kp1 h;
  
  public mp1(lp1 paramlp1) {
    this.a = paramlp1.a;
    this.b = paramlp1.b;
    this.c = paramlp1.c;
    this.d = paramlp1.d;
    this.e = paramlp1.e;
    this.f = paramlp1.f;
    this.g = paramlp1.g;
    this.h = paramlp1.h;
  }
  
  public static void a(lp1 paramlp1, Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    int i = paramXmlResourceParser.getDepth() + 1;
    while (true) {
      int j = paramXmlResourceParser.next();
      if (j != 1) {
        int k = paramXmlResourceParser.getDepth();
        if (k >= i || j != 3) {
          TypedArray typedArray;
          if (j != 2 || k > i || !paramXmlResourceParser.getName().equals("item"))
            continue; 
          Resources resources = paramContext.getResources();
          int[] arrayOfInt2 = zb1.t;
          if (paramTheme == null) {
            typedArray = resources.obtainAttributes(paramAttributeSet, arrayOfInt2);
          } else {
            typedArray = paramTheme.obtainStyledAttributes(paramAttributeSet, arrayOfInt2, 0, 0);
          } 
          vl1 vl11 = vl1.a(paramContext, typedArray.getResourceId(0, 0), typedArray.getResourceId(1, 0), new k(0.0F)).a();
          typedArray.recycle();
          int m = paramAttributeSet.getAttributeCount();
          int[] arrayOfInt1 = new int[m];
          j = 0;
          for (k = 0; j < m; k = n) {
            int i1 = paramAttributeSet.getAttributeNameResource(j);
            int n = k;
            if (i1 != 2130969907) {
              n = k;
              if (i1 != 2130969918) {
                if (paramAttributeSet.getAttributeBooleanValue(j, false)) {
                  n = i1;
                } else {
                  n = -i1;
                } 
                arrayOfInt1[k] = n;
                n = k + 1;
              } 
            } 
            j++;
          } 
          paramlp1.a(StateSet.trimStateSet(arrayOfInt1, k), vl11);
          continue;
        } 
      } 
      break;
    } 
  }
  
  public static mp1 b(Context paramContext, TypedArray paramTypedArray, int paramInt) {
    mp1 mp11;
    paramInt = paramTypedArray.getResourceId(paramInt, 0);
    paramTypedArray = null;
    if (paramInt == 0 || !Objects.equals(paramContext.getResources().getResourceTypeName(paramInt), "xml"))
      return null; 
    Object object = new Object();
    object.b();
    try {
      XmlResourceParser xmlResourceParser = paramContext.getResources().getXml(paramInt);
      try {
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        while (true) {
          paramInt = xmlResourceParser.next();
          if (paramInt != 2 && paramInt != 1)
            continue; 
          break;
        } 
      } finally {
        if (xmlResourceParser != null)
          try {
            xmlResourceParser.close();
          } finally {
            xmlResourceParser = null;
          }  
      } 
    } catch (XmlPullParserException|java.io.IOException|android.content.res.Resources.NotFoundException xmlPullParserException) {
      object.b();
    } 
    if (((lp1)object).a == 0) {
      TypedArray typedArray = paramTypedArray;
    } else {
      mp11 = new mp1((lp1)object);
    } 
    return mp11;
  }
  
  public final vl1 c() {
    vl1 vl11 = this.b;
    kp1 kp11 = this.h;
    kp1 kp12 = this.g;
    kp1 kp13 = this.f;
    kp1 kp14 = this.e;
    if (kp14 == null && kp13 == null && kp12 == null && kp11 == null)
      return vl11; 
    ul1 ul1 = vl11.f();
    if (kp14 != null)
      ul1.e = kp14.b; 
    if (kp13 != null)
      ul1.f = kp13.b; 
    if (kp12 != null)
      ul1.h = kp12.b; 
    if (kp11 != null)
      ul1.g = kp11.b; 
    return ul1.a();
  }
  
  public final boolean d() {
    if (this.a <= 1) {
      kp1 kp11 = this.e;
      if (kp11 == null || kp11.a <= 1) {
        kp11 = this.f;
        if (kp11 == null || kp11.a <= 1) {
          kp11 = this.g;
          if (kp11 == null || kp11.a <= 1) {
            kp11 = this.h;
            if (kp11 == null || kp11.a <= 1)
              return false; 
          } 
        } 
      } 
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */