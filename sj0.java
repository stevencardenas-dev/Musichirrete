import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Map;

public final class sj0 extends jy1 {
  public final int a;
  
  public final Object b;
  
  public final jy1 c;
  
  public final Object d;
  
  public sj0(mm parammm, sj0 paramsj01, sj0 paramsj02, e31 parame31) {
    this.b = paramsj01;
    this.c = paramsj02;
    this.d = parame31;
  }
  
  public final Object b(tk0 paramtk0) {
    Map<Object, Object> map;
    ZoneId zoneId;
    int i = this.a;
    Object object = null;
    tk0 tk01 = null;
    switch (i) {
      default:
        return this.c.b(paramtk0);
      case 1:
        i = paramtk0.C();
        if (i == 9) {
          paramtk0.y();
          paramtk0 = tk01;
        } else {
          Map<Object, Object> map1 = (Map)((e31)this.d).d();
          if (i == 1) {
            StringBuilder stringBuilder;
            paramtk0.a();
            while (paramtk0.o()) {
              paramtk0.a();
              object = ((sj0)this.b).c.b(paramtk0);
              Object object1 = ((sj0)this.c).c.b(paramtk0);
              if (!map1.containsKey(object)) {
                map1.put(object, object1);
                paramtk0.h();
                continue;
              } 
              stringBuilder = new StringBuilder("duplicate key: ");
              stringBuilder.append(object);
              throw new RuntimeException(stringBuilder.toString());
            } 
            stringBuilder.h();
            map = map1;
          } else {
            StringBuilder stringBuilder;
            map.c();
            while (map.o()) {
              zb0.c.getClass();
              int j = ((tk0)map).i;
              i = j;
              if (j == 0)
                i = map.g(); 
              if (i == 13) {
                ((tk0)map).i = 9;
              } else if (i == 12) {
                ((tk0)map).i = 8;
              } else if (i == 14) {
                ((tk0)map).i = 10;
              } else {
                throw map.P("a name");
              } 
              object = ((sj0)this.b).c.b((tk0)map);
              Object object1 = ((sj0)this.c).c.b((tk0)map);
              if (!map1.containsKey(object)) {
                map1.put(object, object1);
                continue;
              } 
              stringBuilder = new StringBuilder("duplicate key: ");
              stringBuilder.append(object);
              throw new RuntimeException(stringBuilder.toString());
            } 
            stringBuilder.k();
            map = map1;
          } 
        } 
        return map;
      case 0:
        break;
    } 
    map.c();
    ZoneOffset zoneOffset = null;
    tk01 = null;
    while (map.C() != 4) {
      String str = map.w();
      int j = str.hashCode();
      i = -1;
      switch (j) {
        case 1792749467:
          if (!str.equals("dateTime"))
            break; 
          i = 2;
          break;
        case 3744684:
          if (!str.equals("zone"))
            break; 
          i = 1;
          break;
        case -1019779949:
          if (!str.equals("offset"))
            break; 
          i = 0;
          break;
      } 
      switch (i) {
        default:
          map.K();
          continue;
        case 2:
          object = ((iy1)this.b).b((tk0)map);
          continue;
        case 1:
          zoneId = (ZoneId)((jy1)this.d).b((tk0)map);
          continue;
        case 0:
          break;
      } 
      zoneOffset = (ZoneOffset)this.c.b((tk0)map);
    } 
    map.k();
    rj0.a((Serializable)object, "dateTime", (tk0)map);
    rj0.a((Serializable)zoneOffset, "offset", (tk0)map);
    rj0.a((Serializable)zoneId, "zone", (tk0)map);
    return ZonedDateTime.ofInstant((LocalDateTime)object, zoneOffset, zoneId);
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    jy1 jy12;
    Type type;
    int i = this.a;
    Object object1 = this.b;
    Object<?> object = (Object<?>)this.d;
    jy1 jy11 = this.c;
    switch (i) {
      default:
        type = (Type)object;
        if (paramObject != null && (type instanceof Class || type instanceof java.lang.reflect.TypeVariable)) {
          object = (Object<?>)paramObject.getClass();
        } else {
          object = (Object<?>)type;
        } 
        jy12 = jy11;
        if (object != type) {
          jy12 = ((my)object1).b(new rz1((Type)object));
          if (jy12 instanceof ue1) {
            for (object = (Object<?>)jy11; object instanceof uk1; object = (Object<?>)jy13) {
              jy1 jy13 = ((uk1)object).d();
              if (jy13 == object)
                break; 
            } 
            if (!(object instanceof ue1))
              jy12 = jy11; 
          } 
        } 
        jy12.c(paramcl0, paramObject);
        return;
      case 1:
        paramObject = paramObject;
        if (paramObject == null) {
          paramcl0.o();
        } else {
          paramcl0.d();
          for (Object paramObject : paramObject.entrySet()) {
            paramcl0.l(String.valueOf(paramObject.getKey()));
            ((sj0)jy11).c(paramcl0, paramObject.getValue());
          } 
          paramcl0.k();
        } 
        return;
      case 0:
        break;
    } 
    paramObject = paramObject;
    if (paramObject == null) {
      paramcl0.o();
    } else {
      paramcl0.d();
      paramcl0.l("dateTime");
      ((iy1)object1).c(paramcl0, paramObject.toLocalDateTime());
      paramcl0.l("offset");
      jy11.c(paramcl0, paramObject.getOffset());
      paramcl0.l("zone");
      ((jy1)object).c(paramcl0, paramObject.getZone());
      paramcl0.k();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */