import java.util.ArrayList;
import java.util.concurrent.Executor;

public abstract class wu0 extends xu0 {
  public final Object a = new Object();
  
  public Executor b;
  
  public ae0 c;
  
  public su0 d;
  
  public ArrayList e;
  
  public final void j(su0 paramsu0, ArrayList<? extends E> paramArrayList) {
    if (paramsu0 != null) {
      Object object = this.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        Executor executor = this.b;
        if (executor != null) {
          ae0 ae01 = this.c;
          uu0 uu0 = new uu0();
          this(this, ae01, paramsu0, paramArrayList, 0);
          executor.execute(uu0);
        } else {
          this.d = paramsu0;
          ArrayList arrayList = new ArrayList();
          this(paramArrayList);
          this.e = arrayList;
        } 
      } finally {}
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      return;
    } 
    k91.h("groupRoute must not be null");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */