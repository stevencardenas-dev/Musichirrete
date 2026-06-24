import java.util.ArrayDeque;

public final class m9 {
  public boolean a;
  
  public Object b;
  
  public Object c;
  
  public int a(int paramInt) {
    int i = paramInt;
    if (this.a) {
      jn1 jn1 = (jn1)this.b;
      if (paramInt == 0)
        return jn1.c() - 3; 
      if (paramInt == jn1.c() - 1)
        return 0; 
      i = paramInt - 1;
    } 
    return i;
  }
  
  public void b(jn2 paramjn2) {
    Object object = this.b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if ((ArrayDeque)this.c == null) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this();
        this.c = arrayDeque;
      } 
    } finally {}
    ((ArrayDeque<jn2>)this.c).add(paramjn2);
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public void c(du2 paramdu2) {
    synchronized (this.b) {
      if ((ArrayDeque)this.c == null || this.a)
        return; 
      this.a = true;
      while (true) {
        jn2 jn2;
        null = this.b;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          jn2 = ((ArrayDeque<jn2>)this.c).poll();
          if (jn2 == null) {
            this.a = false;
            return;
          } 
        } finally {}
        jn2.a(paramdu2);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */