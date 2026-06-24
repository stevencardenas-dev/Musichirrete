import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import java.util.Set;

public final class tp1 implements Runnable {
  public final ma1 b;
  
  public final fp1 c;
  
  public final boolean e;
  
  public final int f;
  
  public tp1(ma1 paramma1, fp1 paramfp1, boolean paramBoolean, int paramInt) {
    this.b = paramma1;
    this.c = paramfp1;
    this.e = paramBoolean;
    this.f = paramInt;
  }
  
  public final void run() {
    q82 q82;
    boolean bool = this.e;
    ma1 ma11 = this.b;
    fp1 fp11 = this.c;
    if (bool) {
      int i = this.f;
      ma11.getClass();
      null = fp11.a.a;
      synchronized (ma11.k) {
        q82 = ma11.b(null);
        bool = ma1.d(null, q82, i);
      } 
    } else {
      int i = this.f;
      q82.getClass();
      String str1 = fp11.a.a;
      Object object = ((ma1)q82).k;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        String str2;
        StringBuilder stringBuilder1;
        if (((ma1)q82).f.get(str1) != null) {
          qp0 qp01 = qp0.h();
          str2 = ma1.l;
          stringBuilder1 = new StringBuilder();
          this("Ignored stopWork. WorkerWrapper ");
          stringBuilder1.append(str1);
          stringBuilder1.append(" is in foreground");
          qp01.b(str2, stringBuilder1.toString());
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        } else {
          Set set = (Set)((ma1)str2).h.get(str1);
          if (set == null || !set.contains(stringBuilder1)) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          } else {
            q82 q821 = str2.b(str1);
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            bool = ma1.d(str1, q821, i);
            object = qp0.h();
            str1 = qp0.j(hbrAVtEa.jAaSRyyhM);
            StringBuilder stringBuilder2 = new StringBuilder("StopWorkRunnable for ");
            stringBuilder2.append(this.c.a.a);
            stringBuilder2.append("; Processor.stopWork = ");
            stringBuilder2.append(bool);
            object.b(str1, stringBuilder2.toString());
          } 
        } 
        bool = false;
      } finally {}
    } 
    qp0 qp0 = qp0.h();
    String str = qp0.j(hbrAVtEa.jAaSRyyhM);
    StringBuilder stringBuilder = new StringBuilder("StopWorkRunnable for ");
    stringBuilder.append(this.c.a.a);
    stringBuilder.append("; Processor.stopWork = ");
    stringBuilder.append(bool);
    qp0.b(str, stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */