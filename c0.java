public final class c0 extends ws2 {
  public final void X(d0 paramd01, d0 paramd02) {
    paramd01.b = paramd02;
  }
  
  public final void Y(d0 paramd0, Thread paramThread) {
    paramd0.a = paramThread;
  }
  
  public final boolean i(e0 parame0, a0 parama01, a0 parama02) {
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{e0}, name=parame0} */
    try {
      if (parame0.c == parama01) {
        parame0.c = parama02;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{e0}, name=parame0} */
        return true;
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{e0}, name=parame0} */
    return false;
  }
  
  public final boolean j(e0 parame0, Object paramObject1, Object paramObject2) {
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{e0}, name=parame0} */
    try {
      if (parame0.b == paramObject1) {
        parame0.b = paramObject2;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{e0}, name=parame0} */
        return true;
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{e0}, name=parame0} */
    return false;
  }
  
  public final boolean k(e0 parame0, d0 paramd01, d0 paramd02) {
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{e0}, name=parame0} */
    try {
      if (parame0.e == paramd01) {
        parame0.e = paramd02;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{e0}, name=parame0} */
        return true;
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{e0}, name=parame0} */
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */