public final class ka2 extends ia2 {
  public final nt1 c;
  
  public final q92 e;
  
  public final k92 f;
  
  public ka2(k92 paramk92, nt1 paramnt11, nt1 paramnt12, q92 paramq92) {
    super(paramnt11);
  }
  
  public final void b() {
    k92 k921 = this.f;
    Object object = k921.f;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      nt1 nt11 = this.c;
      k921.e.add(nt11);
      du2 du2 = nt11.a;
      j01 j01 = new j01();
      this(k921, nt11, 20, false);
      du2.a(j01);
      if (k921.l.getAndIncrement() > 0)
        k921.b.a("Already connected to the service.", new Object[0]); 
    } finally {
      Exception exception;
    } 
    k92.b(k921, this.e);
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ka2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */