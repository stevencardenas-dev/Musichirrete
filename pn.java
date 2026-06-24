import java.io.Serializable;

public final class pn implements os, Serializable {
  public final os b;
  
  public final ms c;
  
  public pn(ms paramms, os paramos) {
    this.b = paramos;
    this.c = paramms;
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject)
      if (paramObject instanceof pn) {
        pn pn1 = (pn)paramObject;
        byte b2 = 2;
        paramObject = pn1;
        for (byte b1 = 2;; b1++) {
          paramObject = ((pn)paramObject).b;
          if (paramObject instanceof pn) {
            paramObject = paramObject;
          } else {
            paramObject = null;
          } 
          if (paramObject == null) {
            paramObject = this;
            while (true) {
              paramObject = ((pn)paramObject).b;
              if (paramObject instanceof pn) {
                paramObject = paramObject;
              } else {
                paramObject = null;
              } 
              if (paramObject == null) {
                if (b1 == b2) {
                  boolean bool;
                  paramObject = this;
                  while (true) {
                    ms ms1 = ((pn)paramObject).c;
                    if (!ui0.c(pn1.l(ms1.getKey()), ms1)) {
                      boolean bool1 = false;
                      break;
                    } 
                    paramObject = ((pn)paramObject).b;
                    if (paramObject instanceof pn) {
                      paramObject = paramObject;
                      continue;
                    } 
                    paramObject.getClass();
                    paramObject = paramObject;
                    bool = ui0.c(pn1.l(paramObject.getKey()), paramObject);
                    break;
                  } 
                  if (bool)
                    break; 
                  // Byte code: goto -> 185
                } 
                // Byte code: goto -> 185
              } 
              b2++;
            } 
            break;
          } 
        } 
      } else {
        return false;
      }  
    return true;
  }
  
  public final Object h(Object paramObject, ad0 paramad0) {
    return paramad0.g(this.b.h(paramObject, paramad0), this.c);
  }
  
  public final int hashCode() {
    int i = this.b.hashCode();
    return this.c.hashCode() + i;
  }
  
  public final os k(os paramos) {
    paramos.getClass();
    return (paramos == b40.b) ? this : (os)paramos.h(this, new on(1));
  }
  
  public final ms l(ns paramns) {
    paramns.getClass();
    pn pn1 = this;
    while (true) {
      ms ms1 = pn1.c.l(paramns);
      if (ms1 != null)
        return ms1; 
      os os1 = pn1.b;
      if (os1 instanceof pn) {
        os1 = os1;
        continue;
      } 
      return os1.l(paramns);
    } 
  }
  
  public final os o(ns paramns) {
    paramns.getClass();
    ms ms1 = this.c;
    ms ms2 = ms1.l(paramns);
    os os2 = this.b;
    if (ms2 != null)
      return os2; 
    os os1 = os2.o(paramns);
    return (os)((os1 == os2) ? this : ((os1 == b40.b) ? ms1 : new pn(ms1, os1)));
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("[");
    stringBuilder.append((String)h("", new on(0)));
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */