import android.content.Context;
import java.util.LinkedHashSet;

public abstract class qq {
  public final n2 a;
  
  public final Context b;
  
  public final Object c;
  
  public final LinkedHashSet d;
  
  public Object e;
  
  public qq(Context paramContext, n2 paramn2) {
    this.a = paramn2;
    paramContext = paramContext.getApplicationContext();
    paramContext.getClass();
    this.b = paramContext;
    this.c = new Object();
    this.d = new LinkedHashSet();
  }
  
  public abstract Object a();
  
  public final void b(Object paramObject) {
    Object object = this.c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      Object object1 = this.e;
      if (object1 != null) {
        boolean bool = object1.equals(paramObject);
        if (bool) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return;
        } 
      } 
    } finally {}
    this.e = paramObject;
    paramObject = nm.v0(this.d);
    ki1 ki1 = (ki1)this.a.g;
    e6 e6 = new e6();
    this(3, paramObject, this);
    ki1.execute(e6);
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public abstract void c();
  
  public abstract void d();
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */