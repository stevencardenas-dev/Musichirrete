import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.jaudiotagger.audio.dsf.qdA.GMDx;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class xb {
  public final wb a;
  
  public final wb b;
  
  public final float c;
  
  public final float d;
  
  public final float e;
  
  public final float f;
  
  public final float g;
  
  public final float h;
  
  public final int i;
  
  public final int j;
  
  public final int k;
  
  public int l;
  
  public xb(Context paramContext) {
    boolean bool;
    AttributeSet attributeSet;
    this.b = new wb();
    wb wb15 = new wb();
    int i = wb15.b;
    if (i != 0) {
      attributeSet = (AttributeSet)GMDx.nQPngY;
      try {
        int k;
        XmlResourceParser xmlResourceParser = paramContext.getResources().getXml(i);
        do {
          k = xmlResourceParser.next();
        } while (k != 2 && k != 1);
        if (k == 2) {
          AttributeSet attributeSet1;
          if (TextUtils.equals(xmlResourceParser.getName(), (CharSequence)attributeSet)) {
            attributeSet1 = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
            i = attributeSet1.getStyleAttribute();
          } else {
            XmlPullParserException xmlPullParserException = new XmlPullParserException();
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("Must have a <");
            stringBuilder.append(attributeSet1);
            stringBuilder.append("> start tag");
            this(stringBuilder.toString());
            throw xmlPullParserException;
          } 
        } else {
          XmlPullParserException xmlPullParserException = new XmlPullParserException();
          this("No start tag found");
          throw xmlPullParserException;
        } 
      } catch (XmlPullParserException xmlPullParserException) {
        StringBuilder stringBuilder = new StringBuilder("Can't load badge resource ID #0x");
        stringBuilder.append(Integer.toHexString(i));
        Resources.NotFoundException notFoundException = new Resources.NotFoundException(stringBuilder.toString());
        notFoundException.initCause((Throwable)xmlPullParserException);
        throw notFoundException;
      } catch (IOException iOException) {}
    } else {
      attributeSet = null;
      i = 0;
    } 
    int j = i;
    if (i == 0)
      j = 2131952842; 
    TypedArray typedArray = g92.S((Context)iOException, attributeSet, zb1.c, 2130968680, j, new int[0]);
    Resources resources = iOException.getResources();
    this.c = typedArray.getDimensionPixelSize(5, -1);
    this.i = iOException.getResources().getDimensionPixelSize(2131166126);
    this.j = iOException.getResources().getDimensionPixelSize(2131166129);
    this.d = typedArray.getDimensionPixelSize(15, -1);
    this.e = typedArray.getDimension(13, resources.getDimension(2131165434));
    this.g = typedArray.getDimension(18, resources.getDimension(2131165438));
    this.f = typedArray.getDimension(4, resources.getDimension(2131165434));
    this.h = typedArray.getDimension(14, resources.getDimension(2131165438));
    this.k = typedArray.getInt(25, 1);
    this.l = typedArray.getInt(2, 0);
    wb wb11 = this.b;
    j = wb15.k;
    i = j;
    if (j == -2)
      i = 255; 
    wb11.k = i;
    i = wb15.m;
    if (i != -2) {
      wb11.m = i;
    } else {
      bool = typedArray.hasValue(24);
      wb11 = this.b;
      if (bool) {
        wb11.m = typedArray.getInt(24, 0);
      } else {
        wb11.m = -1;
      } 
    } 
    String str = wb15.l;
    if (str != null) {
      this.b.l = str;
    } else if (typedArray.hasValue(8)) {
      this.b.l = typedArray.getString(8);
    } 
    wb wb16 = this.b;
    wb16.q = wb15.q;
    CharSequence charSequence2 = wb15.r;
    CharSequence charSequence1 = charSequence2;
    if (charSequence2 == null)
      charSequence1 = iOException.getString(2131886885); 
    wb16.r = charSequence1;
    wb wb14 = this.b;
    j = wb15.s;
    i = j;
    if (j == 0)
      i = 2131755022; 
    wb14.s = i;
    j = wb15.t;
    i = j;
    if (j == 0)
      i = 2131886900; 
    wb14.t = i;
    Boolean bool2 = wb15.v;
    if (bool2 == null || bool2.booleanValue()) {
      bool = true;
    } else {
      bool = false;
    } 
    wb14.v = Boolean.valueOf(bool);
    wb wb10 = this.b;
    j = wb15.n;
    i = j;
    if (j == -2)
      i = typedArray.getInt(22, -2); 
    wb10.n = i;
    wb10 = this.b;
    j = wb15.o;
    i = j;
    if (j == -2)
      i = typedArray.getInt(23, -2); 
    wb10.o = i;
    wb14 = this.b;
    Integer integer8 = wb15.g;
    if (integer8 == null) {
      i = typedArray.getResourceId(6, 2131952087);
    } else {
      i = integer8.intValue();
    } 
    wb14.g = Integer.valueOf(i);
    wb wb9 = this.b;
    Integer integer10 = wb15.h;
    if (integer10 == null) {
      i = typedArray.getResourceId(7, 0);
    } else {
      i = integer10.intValue();
    } 
    wb9.h = Integer.valueOf(i);
    wb wb13 = this.b;
    Integer integer7 = wb15.i;
    if (integer7 == null) {
      i = typedArray.getResourceId(16, 2131952087);
    } else {
      i = integer7.intValue();
    } 
    wb13.i = Integer.valueOf(i);
    wb wb8 = this.b;
    Integer integer9 = wb15.j;
    if (integer9 == null) {
      i = typedArray.getResourceId(17, 0);
    } else {
      i = integer9.intValue();
    } 
    wb8.j = Integer.valueOf(i);
    wb8 = this.b;
    integer9 = wb15.c;
    if (integer9 == null) {
      i = wf2.u((Context)iOException, typedArray, 1).getDefaultColor();
    } else {
      i = integer9.intValue();
    } 
    wb8.c = Integer.valueOf(i);
    wb wb12 = this.b;
    Integer integer6 = wb15.f;
    if (integer6 == null) {
      i = typedArray.getResourceId(9, 2131952278);
    } else {
      i = integer6.intValue();
    } 
    wb12.f = Integer.valueOf(i);
    integer6 = wb15.e;
    if (integer6 != null) {
      this.b.e = integer6;
    } else {
      bool = typedArray.hasValue(10);
      wb wb17 = this.b;
      if (bool) {
        wb17.e = Integer.valueOf(wf2.u((Context)iOException, typedArray, 10).getDefaultColor());
      } else {
        vt1 vt1 = new vt1((Context)iOException, wb17.f.intValue());
        this.b.e = Integer.valueOf(vt1.k.getDefaultColor());
      } 
    } 
    wb wb4 = this.b;
    integer6 = wb15.u;
    if (integer6 == null) {
      i = typedArray.getInt(3, 8388661);
    } else {
      i = integer6.intValue();
    } 
    wb4.u = Integer.valueOf(i);
    wb4 = this.b;
    integer6 = wb15.w;
    if (integer6 == null) {
      i = typedArray.getDimensionPixelSize(12, resources.getDimensionPixelSize(2131166127));
    } else {
      i = integer6.intValue();
    } 
    wb4.w = Integer.valueOf(i);
    wb4 = this.b;
    integer6 = wb15.x;
    if (integer6 == null) {
      i = typedArray.getDimensionPixelSize(11, resources.getDimensionPixelSize(2131165440));
    } else {
      i = integer6.intValue();
    } 
    wb4.x = Integer.valueOf(i);
    wb wb7 = this.b;
    Integer integer3 = wb15.y;
    if (integer3 == null) {
      i = typedArray.getDimensionPixelOffset(19, 0);
    } else {
      i = integer3.intValue();
    } 
    wb7.y = Integer.valueOf(i);
    wb7 = this.b;
    integer3 = wb15.z;
    if (integer3 == null) {
      i = typedArray.getDimensionPixelOffset(26, 0);
    } else {
      i = integer3.intValue();
    } 
    wb7.z = Integer.valueOf(i);
    wb wb3 = this.b;
    Integer integer5 = wb15.A;
    if (integer5 == null) {
      i = typedArray.getDimensionPixelOffset(20, wb3.y.intValue());
    } else {
      i = integer5.intValue();
    } 
    wb3.A = Integer.valueOf(i);
    wb wb6 = this.b;
    Integer integer2 = wb15.B;
    if (integer2 == null) {
      i = typedArray.getDimensionPixelOffset(27, wb6.z.intValue());
    } else {
      i = integer2.intValue();
    } 
    wb6.B = Integer.valueOf(i);
    wb6 = this.b;
    integer2 = wb15.E;
    if (integer2 == null) {
      i = typedArray.getDimensionPixelOffset(21, 0);
    } else {
      i = integer2.intValue();
    } 
    wb6.E = Integer.valueOf(i);
    wb wb2 = this.b;
    Integer integer4 = wb15.C;
    if (integer4 == null) {
      i = 0;
    } else {
      i = integer4.intValue();
    } 
    wb2.C = Integer.valueOf(i);
    wb wb5 = this.b;
    Integer integer1 = wb15.D;
    if (integer1 == null) {
      i = 0;
    } else {
      i = integer1.intValue();
    } 
    wb5.D = Integer.valueOf(i);
    wb wb1 = this.b;
    Boolean bool1 = wb15.F;
    if (bool1 == null) {
      bool = typedArray.getBoolean(0, false);
    } else {
      bool = bool1.booleanValue();
    } 
    wb1.F = Boolean.valueOf(bool);
    typedArray.recycle();
    Locale locale = wb15.p;
    wb1 = this.b;
    if (locale == null) {
      wb1.p = Locale.getDefault(Locale.Category.FORMAT);
    } else {
      wb1.p = locale;
    } 
    this.a = wb15;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */