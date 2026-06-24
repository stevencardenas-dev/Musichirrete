import android.content.Context;

public final class t82 {
  public static final t82 b;
  
  public bu a;
  
  static {
    Object object = new Object();
    ((t82)object).a = null;
    b = (t82)object;
  }
  
  public static bu a(Context paramContext) {
    t82 t821 = b;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{t82}, name=null} */
    try {
      if (t821.a == null) {
        Context context = paramContext;
        if (paramContext.getApplicationContext() != null)
          context = paramContext.getApplicationContext(); 
        bu bu2 = new bu();
        this(context);
        t821.a = bu2;
      } 
    } finally {}
    bu bu1 = t821.a;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{t82}, name=null} */
    return bu1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */