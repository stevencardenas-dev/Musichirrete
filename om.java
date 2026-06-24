import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class om extends zo2 {
  public static ArrayList g0(Object... paramVarArgs) {
    return (paramVarArgs.length == 0) ? new ArrayList() : new ArrayList(new u8(paramVarArgs));
  }
  
  public static List h0(Object... paramVarArgs) {
    if (paramVarArgs.length > 0) {
      List list = Arrays.asList(paramVarArgs);
      list.getClass();
      return list;
    } 
    return d40.b;
  }
  
  public static ArrayList i0(Object... paramVarArgs) {
    return (paramVarArgs.length == 0) ? new ArrayList() : new ArrayList(new u8(paramVarArgs));
  }
  
  public static void j0() {
    throw new ArithmeticException("Index overflow has happened.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\om.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */