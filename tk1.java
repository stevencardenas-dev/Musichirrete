import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class tk1 implements Executor {
  public final int b;
  
  public final Executor c;
  
  public final ArrayDeque e;
  
  public Runnable f;
  
  public final Object g;
  
  public tk1(f6 paramf6) {
    this.g = new Object();
    this.e = new ArrayDeque();
    this.c = paramf6;
  }
  
  public tk1(Executor paramExecutor, int paramInt) {
    this.c = paramExecutor;
    this.e = new ArrayDeque();
    this.g = new Object();
  }
  
  public final void a() {
    switch (this.b) {
      default:
        object = this.g;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          Runnable runnable = this.e.poll();
          this.f = runnable;
          if (runnable != null)
            ((f6)this.c).execute(runnable); 
        } finally {
          Exception exception;
        } 
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      case 1:
        object = this.g;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          Runnable runnable2 = (Runnable)this.e.poll();
          Runnable runnable1 = runnable2;
          this.f = runnable1;
          if (runnable2 != null)
            this.c.execute(runnable1); 
        } finally {
          Exception exception;
        } 
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      case 0:
        break;
    } 
    Object object = this.e.poll();
    this.f = (Runnable)object;
    if (object != null)
      this.c.execute((Runnable)object); 
  }
  
  public final void execute(Runnable paramRunnable) {
    switch (this.b) {
      default:
        object = this.g;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          ArrayDeque<e6> arrayDeque = this.e;
          e6 e6 = new e6();
          this(0, this, paramRunnable);
          arrayDeque.add(e6);
          if (this.f == null)
            a(); 
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      case 1:
        paramRunnable.getClass();
        object = this.g;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          ArrayDeque<e6> arrayDeque = this.e;
          e6 e6 = new e6();
          this(paramRunnable, this);
          arrayDeque.offer(e6);
          if (this.f == null)
            a(); 
        } finally {}
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      case 0:
        break;
    } 
    Object object = this.g;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      ArrayDeque<vi2> arrayDeque = this.e;
      vi2 vi2 = new vi2();
      this(16, this, paramRunnable);
      arrayDeque.add(vi2);
      if (this.f == null)
        a(); 
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */