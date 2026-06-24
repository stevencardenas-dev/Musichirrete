import java.util.ArrayList;

public final class aa0 implements nr {
  public final int a;
  
  public final Object b;
  
  public final void accept(Object paramObject) {
    ArrayList arrayList;
    bh0 bh0;
    switch (this.a) {
      default:
        ((hf)this.b).a((qf)paramObject);
        return;
      case 2:
        paramObject = paramObject;
        arrayList = new ArrayList();
        new ArrayList();
        bh0 = new bh0(22, arrayList);
        ((hf)this.b).b((qf)paramObject, bh0);
        return;
      case 1:
        ba0 = (ba0)paramObject;
        paramObject = ca0.c;
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=paramObject} */
        try {
          zm1 zm1 = ca0.d;
          ArrayList<nr> arrayList1 = (ArrayList)zm1.get(this.b);
          if (arrayList1 == null) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=paramObject} */
          } else {
            zm1.remove(this.b);
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=paramObject} */
            for (byte b = 0; b < arrayList1.size(); b++)
              ((nr)arrayList1.get(b)).accept(ba0); 
          } 
        } finally {}
        return;
      case 0:
        break;
    } 
    ba0 ba0 = (ba0)paramObject;
    paramObject = ba0;
    if (ba0 == null)
      paramObject = new ba0(-3); 
    ((g7)this.b).F((ba0)paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\aa0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */