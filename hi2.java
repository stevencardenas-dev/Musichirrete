public final class hi2 extends wf2 {
  public final void B0(ji2 paramji21, ji2 paramji22) {
    paramji21.b = paramji22;
  }
  
  public final void D0(ji2 paramji2, Thread paramThread) {
    paramji2.a = paramThread;
  }
  
  public final boolean H0(kj2 paramkj2, fi2 paramfi21, fi2 paramfi22) {
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{kj2}, name=paramkj2} */
    try {
      if (paramkj2.c == paramfi21) {
        paramkj2.c = paramfi22;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{kj2}, name=paramkj2} */
        return true;
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{kj2}, name=paramkj2} */
    return false;
  }
  
  public final boolean J0(li2 paramli2, Object paramObject1, Object paramObject2) {
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{li2}, name=paramli2} */
    try {
      if (paramli2.b == paramObject1) {
        paramli2.b = paramObject2;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{li2}, name=paramli2} */
        return true;
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{li2}, name=paramli2} */
    return false;
  }
  
  public final boolean K0(li2 paramli2, ji2 paramji21, ji2 paramji22) {
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{li2}, name=paramli2} */
    try {
      if (paramli2.e == paramji21) {
        paramli2.e = paramji22;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{li2}, name=paramli2} */
        return true;
      } 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{li2}, name=paramli2} */
    return false;
  }
  
  public final fi2 w0(kj2 paramkj2) {
    fi2 fi22;
    fi2 fi21 = fi2.d;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{kj2}, name=paramkj2} */
    try {
      fi22 = paramkj2.c;
      if (fi22 != fi21)
        paramkj2.c = fi21; 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{kj2}, name=paramkj2} */
    return fi22;
  }
  
  public final ji2 x0(kj2 paramkj2) {
    ji2 ji22;
    ji2 ji21 = ji2.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{kj2}, name=paramkj2} */
    try {
      ji22 = paramkj2.e;
      if (ji22 != ji21)
        paramkj2.e = ji21; 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{kj2}, name=paramkj2} */
    return ji22;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */