public final class nt1 {
  public final du2 a = new du2();
  
  public final void a(Exception paramException) {
    this.a.h(paramException);
  }
  
  public final void b(Object paramObject) {
    this.a.g(paramObject);
  }
  
  public final void c(Exception paramException) {
    du2 du21 = this.a;
    du21.getClass();
    n21.n("Exception must not be null", paramException);
    Object object = du21.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (du21.c) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } 
    } finally {}
    du21.c = true;
    du21.e = paramException;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    du21.b.c(du21);
  }
  
  public final void d(Object paramObject) {
    du2 du21 = this.a;
    Object object = du21.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (du21.c) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } 
    } finally {}
    du21.c = true;
    du21.d = paramObject;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    du21.b.c(du21);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */