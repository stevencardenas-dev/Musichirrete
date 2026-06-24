import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

public final class y50 {
  public static final hp2 c = (hp2)new Object();
  
  public static final LinkedHashMap d = new LinkedHashMap<Object, Object>();
  
  public final ReentrantLock a;
  
  public final g7 b;
  
  public y50(String paramString, boolean paramBoolean) {
    hp2 hp21 = c;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{hp2}, name=null} */
    try {
      LinkedHashMap<String, Object> linkedHashMap = d;
      Object object1 = linkedHashMap.get(paramString);
      object = object1;
      if (object1 == null) {
        object = new ReentrantLock();
        super();
        linkedHashMap.put(paramString, object);
      } 
    } finally {}
    Object object = object;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{hp2}, name=null} */
    this.a = (ReentrantLock)object;
    if (paramBoolean) {
      g7 g71 = new g7(paramString);
    } else {
      paramString = null;
    } 
    this.b = (g7)paramString;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */