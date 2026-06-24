import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public final class cq {
  public boolean a = false;
  
  public int b;
  
  public int c;
  
  public float d;
  
  public String e;
  
  public boolean f;
  
  public int g;
  
  public cq(cq paramcq, Object paramObject) {
    paramcq.getClass();
    this.b = paramcq.b;
    b(paramObject);
  }
  
  public static void a(Context paramContext, XmlResourceParser paramXmlResourceParser, HashMap<Object, Object> paramHashMap) {
    Object object1;
    Object object2;
    int i;
    TypedArray typedArray = paramContext.obtainStyledAttributes(Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser), fc1.e);
    int j = typedArray.getIndexCount();
    Object object3 = null;
    byte b = 0;
    boolean bool2 = false;
    boolean bool1 = bool2;
    XmlResourceParser xmlResourceParser = null;
    while (true) {
      if (b < j) {
        int k = typedArray.getIndex(b);
        byte b1 = 1;
        if (k == 0) {
          object3 = typedArray.getString(k);
          Object object8 = object3;
          paramXmlResourceParser = xmlResourceParser;
          Object object6 = object2;
          Object object7 = object1;
          if (object3 != null) {
            object8 = object3;
            paramXmlResourceParser = xmlResourceParser;
            object6 = object2;
            object7 = object1;
            if (object3.length() > 0) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append(Character.toUpperCase(object3.charAt(0)));
              stringBuilder.append(object3.substring(1));
              object8 = stringBuilder.toString();
              XmlResourceParser xmlResourceParser1 = xmlResourceParser;
              object6 = object2;
              object7 = object1;
            } 
          } 
          continue;
        } 
        if (k == 10) {
          String str = typedArray.getString(k);
          boolean bool = true;
          paramXmlResourceParser = xmlResourceParser;
          Object object = object2;
          continue;
        } 
        if (k == 1) {
          Boolean bool = Boolean.valueOf(typedArray.getBoolean(k, false));
          b1 = 6;
          Object object7 = object3;
          Object object6 = object1;
          continue;
        } 
        byte b2 = 3;
        if (k == 3) {
          Integer integer = Integer.valueOf(typedArray.getColor(k, 0));
          b1 = b2;
        } else {
          b2 = 4;
          if (k == 2) {
            Integer integer = Integer.valueOf(typedArray.getColor(k, 0));
            b1 = b2;
          } else {
            if (k == 7) {
              Float float_ = Float.valueOf(TypedValue.applyDimension(1, typedArray.getDimension(k, 0.0F), paramContext.getResources().getDisplayMetrics()));
            } else if (k == 4) {
              Float float_ = Float.valueOf(typedArray.getDimension(k, 0.0F));
            } else {
              b2 = 5;
              if (k == 5) {
                Float float_ = Float.valueOf(typedArray.getFloat(k, Float.NaN));
                b1 = 2;
                Object object = object3;
                object8 = object1;
                continue;
              } 
              if (k == 6) {
                Integer integer = Integer.valueOf(typedArray.getInteger(k, -1));
              } else {
                if (k == 9) {
                  String str = typedArray.getString(k);
                  Object object10 = object8;
                } else {
                  byte b3 = 8;
                  Object object11 = object3;
                  paramXmlResourceParser = xmlResourceParser;
                  Object object10 = object2;
                  object8 = object1;
                  if (k == 8) {
                    i = typedArray.getResourceId(k, -1);
                    int m = i;
                    if (i == -1)
                      m = typedArray.getInt(k, -1); 
                    Integer integer = Integer.valueOf(m);
                    m = b3;
                  } else {
                    continue;
                  } 
                  object11 = object3;
                  object8 = object1;
                } 
                Object object = object3;
                object8 = object1;
              } 
              Object object9 = object3;
              Object object8 = object1;
            } 
            b1 = 7;
            Object object7 = object3;
            Object object6 = object1;
            continue;
          } 
        } 
      } else {
        break;
      } 
      Object object5 = object3;
      Object object4 = object1;
      b++;
      object3 = SYNTHETIC_LOCAL_VARIABLE_11;
      xmlResourceParser = paramXmlResourceParser;
      object2 = SYNTHETIC_LOCAL_VARIABLE_3;
      object1 = SYNTHETIC_LOCAL_VARIABLE_7;
    } 
    if (object3 != null && xmlResourceParser != null) {
      Object object = new Object();
      ((cq)object).b = i;
      ((cq)object).a = object1;
      object.b(xmlResourceParser);
      paramHashMap.put(object3, object);
    } 
    typedArray.recycle();
  }
  
  public final void b(Object paramObject) {
    switch (x41.y(this.b)) {
      default:
        return;
      case 6:
        this.d = ((Float)paramObject).floatValue();
        return;
      case 5:
        this.f = ((Boolean)paramObject).booleanValue();
        return;
      case 4:
        this.e = (String)paramObject;
        return;
      case 2:
      case 3:
        this.g = ((Integer)paramObject).intValue();
        return;
      case 1:
        this.d = ((Float)paramObject).floatValue();
        return;
      case 0:
      case 7:
        break;
    } 
    this.c = ((Integer)paramObject).intValue();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */