public final class du2 {
  public final Object a = new Object();
  
  public final m9 b;
  
  public boolean c;
  
  public Object d;
  
  public Exception e;
  
  public du2() {
    Object object = new Object();
    ((m9)object).b = new Object();
    this.b = (m9)object;
  }
  
  public final void a(c41 paramc41) {
    jn2 jn2 = new jn2(ot1.a, paramc41);
    this.b.b(jn2);
    j();
  }
  
  public final void b(i41 parami41) {
    jn2 jn2 = new jn2(ot1.a, parami41);
    this.b.b(jn2);
    j();
  }
  
  public final void c(r41 paramr41) {
    jn2 jn2 = new jn2(ot1.a, paramr41);
    this.b.b(jn2);
    j();
  }
  
  public final Exception d() {
    synchronized (this.a) {
      return this.e;
    } 
  }
  
  public final Object e() {
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      n21.q("Task is not yet complete", this.c);
      exception = this.e;
      if (exception == null) {
        Object object1 = this.d;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return object1;
      } 
    } finally {
      Exception exception1;
    } 
    co co = new co();
    super(exception);
    Exception exception;
    throw co;
  }
  
  public final boolean f() {
    boolean bool;
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      boolean bool2 = this.c;
      boolean bool1 = false;
      bool = bool1;
      if (bool2) {
        bool = bool1;
        if (this.e == null)
          bool = true; 
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    return bool;
  }
  
  public final void g(Object paramObject) {
    synchronized (this.a) {
      i();
      this.c = true;
      this.d = paramObject;
      this.b.c(this);
      return;
    } 
  }
  
  public final void h(Exception paramException) {
    n21.n("Exception must not be null", paramException);
    synchronized (this.a) {
      i();
      this.c = true;
      this.e = paramException;
      this.b.c(this);
      return;
    } 
  }
  
  public final void i() {
    if (this.c)
      synchronized (this.a) {
        boolean bool = this.c;
        if (bool) {
          Exception exception = d();
          if (exception == null) {
            if (f()) {
              null = "result ".concat(String.valueOf(e()));
            } else {
              null = "unknown issue";
            } 
          } else {
            null = "failure";
          } 
          null = new IllegalStateException("Complete with: ".concat((String)null), exception);
        } else {
          null = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        } 
        throw null;
      }  
  }
  
  public final void j() {
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (!this.c) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    this.b.c(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\du2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */