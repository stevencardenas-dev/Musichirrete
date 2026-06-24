public final class hh2 implements sh2 {
  public static final Object e = new Object();
  
  public volatile sh2 b;
  
  public volatile Object c = e;
  
  public hh2(sh2 paramsh2) {
    this.b = paramsh2;
  }
  
  public static hh2 b(sh2 paramsh2) {
    return (paramsh2 instanceof hh2) ? (hh2)paramsh2 : new hh2(paramsh2);
  }
  
  public static sh2 c(sh2 paramsh2) {
    return (paramsh2 instanceof hh2) ? paramsh2 : new hh2(paramsh2);
  }
  
  public final Object a() {
    Object object1 = this.c;
    Object object2 = e;
    /* monitor enter ThisExpression{ObjectType{hh2}} */
    if (object1 == object2) {
      try {
        Object object = this.c;
        object1 = object;
        if (object == object2) {
          object1 = this.b.a();
          object = this.c;
          if (object == object2 || object == object1) {
            this.c = object1;
            this.b = null;
            /* monitor exit ThisExpression{ObjectType{hh2}} */
            return object1;
          } 
          object2 = new IllegalStateException();
          StringBuilder stringBuilder = new StringBuilder();
          this("Scoped provider was invoked recursively returning different results: ");
          stringBuilder.append(object);
          stringBuilder.append(" & ");
          stringBuilder.append(object1);
          stringBuilder.append(". This is likely due to a circular dependency.");
          super(stringBuilder.toString());
          throw object2;
        } 
      } finally {}
      /* monitor exit ThisExpression{ObjectType{hh2}} */
      return object1;
    } 
    return object1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */