import android.window.ldG.XUaAMlaMSa;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import java.io.Serializable;
import java.util.Collection;

public final class lm extends jy1 {
  public final int a;
  
  public final Object b;
  
  public final Object c;
  
  public lm(fz1 paramfz1, Class paramClass) {
    this.c = paramfz1;
    this.b = paramClass;
  }
  
  public final Object b(tk0 paramtk0) {
    Object<Object> object1;
    String str;
    int i = this.a;
    Object<Object> object2 = null;
    Class clazz = null;
    Object object3 = this.c;
    Object object4 = this.b;
    switch (i) {
      default:
        clazz = (Class)object4;
        object2 = (Object<Object>)((fz1)object3).e.b(paramtk0);
        if (object2 == null || clazz.isInstance(object2))
          return object2; 
        str = clazz.getName();
        object2 = (Object<Object>)object2.getClass().getName();
        object1 = (Object<Object>)paramtk0.m(true);
        object3 = new StringBuilder("Expected a ");
        object3.append(str);
        object3.append(" but was ");
        object3.append((String)object2);
        object3.append("; at path ");
        object3.append((String)object1);
        throw new RuntimeException(object3.toString());
      case 1:
        object1.c();
        object2 = null;
        while (true) {
          LocalDateTime localDateTime;
          i = object1.C();
          String str1 = XUaAMlaMSa.nDOp;
          if (i != 4) {
            String str2 = object1.w();
            if (!str2.equals(str1)) {
              if (!str2.equals("dateTime")) {
                object1.K();
                continue;
              } 
              localDateTime = (LocalDateTime)((iy1)object4).b((tk0)object1);
              continue;
            } 
            object2 = (Object<Object>)((jy1)object3).b((tk0)object1);
            continue;
          } 
          object1.k();
          rj0.a((Serializable)localDateTime, "dateTime", (tk0)object1);
          rj0.a((Serializable)object2, str1, (tk0)object1);
          return OffsetDateTime.of(localDateTime, (ZoneOffset)object2);
        } 
      case 0:
        break;
    } 
    if (object1.C() == 9) {
      object1.y();
      object1 = object2;
    } else {
      Collection<Object> collection = (Collection)((e31)object3).d();
      object1.a();
      while (object1.o())
        collection.add(((sj0)object4).c.b((tk0)object1)); 
      object1.h();
      object1 = (Object<Object>)collection;
    } 
    return object1;
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    int i = this.a;
    Object object1 = this.b;
    Object object2 = this.c;
    switch (i) {
      default:
        ((fz1)object2).e.c(paramcl0, paramObject);
        return;
      case 1:
        paramObject = paramObject;
        paramcl0.d();
        paramcl0.l("dateTime");
        ((iy1)object1).c(paramcl0, paramObject.toLocalDateTime());
        paramcl0.l("offset");
        ((jy1)object2).c(paramcl0, paramObject.getOffset());
        paramcl0.k();
        return;
      case 0:
        break;
    } 
    paramObject = paramObject;
    if (paramObject == null) {
      paramcl0.o();
    } else {
      paramcl0.c();
      for (Object paramObject : paramObject)
        ((sj0)object1).c(paramcl0, paramObject); 
      paramcl0.h();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */