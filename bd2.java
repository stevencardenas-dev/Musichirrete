public final class bd2 extends ot2 {
  public final int c;
  
  public final Object e;
  
  public final void a() {
    switch (this.c) {
      default:
        object = ((md2)this.e).f;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          if (((md2)this.e).k.get() <= 0 || ((md2)this.e).k.decrementAndGet() <= 0) {
            md2 md2 = (md2)this.e;
            if (md2.m != null) {
              md2.b.e("Unbind from service.", new Object[0]);
              md2 = (md2)this.e;
              md2.a.unbindService(md2.l);
              md2 = (md2)this.e;
              md2.g = false;
              md2.m = null;
              md2.l = null;
            } 
            ((md2)this.e).e();
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            return;
          } 
          ((md2)this.e).b.e("Leaving the connection open for other ongoing calls.", new Object[0]);
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        } finally {
          Exception exception;
        } 
        return;
      case 0:
        break;
    } 
    Object object = ((bl)this.e).c;
    ((md2)object).b.e("unlinkToDeath", new Object[0]);
    ((md2)object).m.asBinder().unlinkToDeath(((md2)object).j, 0);
    ((md2)object).m = null;
    ((md2)object).g = false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */