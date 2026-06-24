public final class bi1 extends ds implements x80 {
  public final x80 f;
  
  public final os g;
  
  public final int h;
  
  public os i;
  
  public cs j;
  
  public bi1(x80 paramx80, os paramos) {
    super(ao.e, b40.b);
    this.f = paramx80;
    this.g = paramos;
    this.h = ((Number)paramos.h(Integer.valueOf(0), new on(5))).intValue();
  }
  
  public final zs d() {
    cs cs1 = this.j;
    return (cs1 instanceof zs) ? (zs)cs1 : null;
  }
  
  public final os e() {
    os os2 = this.i;
    os os1 = os2;
    if (os2 == null)
      os1 = b40.b; 
    return os1;
  }
  
  public final Object k(Object paramObject, cs paramcs) {
    try {
      return (paramObject == ys.b) ? paramObject : l02.a;
    } finally {
      this.i = new e10(paramcs.e(), (Throwable)paramObject);
    } 
  }
  
  public final StackTraceElement m() {
    return null;
  }
  
  public final Object n(Object paramObject) {
    Throwable throwable = rg1.a(paramObject);
    if (throwable != null)
      this.i = new e10(e(), throwable); 
    cs cs1 = this.j;
    if (cs1 != null)
      cs1.f(paramObject); 
    return ys.b;
  }
  
  public final Object p(cs paramcs, Object paramObject) {
    StringBuilder stringBuilder;
    os os1 = paramcs.e();
    g92.y(os1);
    os os2 = this.i;
    if (os2 != os1)
      if (!(os2 instanceof e10)) {
        if (((Number)os1.h(Integer.valueOf(0), new ei1(0, this))).intValue() == this.h) {
          this.i = os1;
        } else {
          stringBuilder = new StringBuilder("Flow invariant is violated:\n\t\tFlow was collected in ");
          stringBuilder.append(this.g);
          stringBuilder.append(",\n\t\tbut emission happened in ");
          stringBuilder.append(os1);
          stringBuilder.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
          throw new IllegalStateException(stringBuilder.toString().toString());
        } 
      } else {
        os1 = os2;
        stringBuilder = new StringBuilder("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
        stringBuilder.append(((e10)os1).c);
        stringBuilder.append(", but then emission attempt of value '");
        stringBuilder.append(paramObject);
        stringBuilder.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(hq1.B0(stringBuilder.toString()).toString());
      }  
    this.j = (cs)stringBuilder;
    bd0 bd0 = di1.a;
    x80 x801 = this.f;
    x801.getClass();
    Object object = bd0.c(x801, paramObject, this);
    if (!ui0.c(object, ys.b))
      this.j = null; 
    return object;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */