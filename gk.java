public final class gk extends fk {
  public final w80 f;
  
  public gk(w80 paramw80, os paramos, int paramInt, hh paramhh) {
    super(paramos, paramInt, paramhh);
    this.f = paramw80;
  }
  
  public final Object a(x80 paramx80, cs paramcs) {
    int i = this.c;
    ys ys = ys.b;
    l02 l02 = l02.a;
    if (i == -3) {
      os os2 = paramcs.e();
      Boolean bool = Boolean.FALSE;
      on on = new on(2);
      os os1 = this.b;
      if (!((Boolean)os1.h(bool, on)).booleanValue()) {
        os1 = os2.k(os1);
      } else {
        os1 = qz1.s(os2, os1, false);
      } 
      if (ui0.c(os1, os2)) {
        object = this.f.a(paramx80, paramcs);
        if (object != ys)
          object = l02; 
        if (object == ys)
          return object; 
      } else {
        vs2 vs2 = vs2.c;
        if (ui0.c(os1.l(vs2), os2.l(vs2))) {
          os os = paramcs.e();
          Object object1 = object;
          if (!(object instanceof mk1))
            if (object instanceof h21) {
              object1 = object;
            } else {
              object1 = new i90((x80)object, os);
            }  
          object = new sc(this, null, 2);
          object = ui0.q0(os1, object1, wf2.g0(os1), (ad0)object, paramcs);
          return (object == ys) ? object : l02;
        } 
        object = super.a((x80)object, paramcs);
      } 
      return l02;
    } 
    Object object = super.a((x80)object, paramcs);
  }
  
  public final Object c(pa1 parampa1, cs paramcs) {
    mk1 mk1 = new mk1(parampa1);
    Object object = this.f.a(mk1, paramcs);
    l02 l02 = l02.a;
    ys ys = ys.b;
    if (object != ys)
      object = l02; 
    return (object == ys) ? object : l02;
  }
  
  public final fk d(os paramos, int paramInt, hh paramhh) {
    return new gk(this.f, paramos, paramInt, paramhh);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.f);
    stringBuilder.append(" -> ");
    stringBuilder.append(super.toString());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */