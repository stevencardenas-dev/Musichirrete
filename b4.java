import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import java.util.Arrays;
import java.util.HashSet;

public final class b4 {
  public static final b4 c = new b4(4, new String[0]);
  
  public static final b4 d = new b4(4, new String[] { "none" });
  
  public final int a;
  
  public final HashSet b;
  
  static {
    new b4(3, new String[] { "none" });
  }
  
  public b4(int paramInt, String... paramVarArgs) {
    if (paramInt != 0) {
      this.a = paramInt;
      this.b = new HashSet(Arrays.asList((Object[])paramVarArgs));
      return;
    } 
    k91.h(OETETTfAjV.dwWiGmgvhqWU);
    throw null;
  }
  
  public final void a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : I
    //   4: invokestatic y : (I)I
    //   7: istore_2
    //   8: aload_0
    //   9: getfield b : Ljava/util/HashSet;
    //   12: astore_3
    //   13: iload_2
    //   14: ifeq -> 56
    //   17: iload_2
    //   18: iconst_1
    //   19: if_icmpeq -> 35
    //   22: iload_2
    //   23: iconst_2
    //   24: if_icmpeq -> 56
    //   27: iload_2
    //   28: iconst_3
    //   29: if_icmpeq -> 35
    //   32: goto -> 64
    //   35: aload_3
    //   36: aload_1
    //   37: invokevirtual contains : (Ljava/lang/Object;)Z
    //   40: ifne -> 46
    //   43: goto -> 64
    //   46: new java/lang/Exception
    //   49: dup
    //   50: ldc ''
    //   52: invokespecial <init> : (Ljava/lang/String;)V
    //   55: athrow
    //   56: aload_3
    //   57: aload_1
    //   58: invokevirtual contains : (Ljava/lang/Object;)Z
    //   61: ifeq -> 65
    //   64: return
    //   65: new java/lang/Exception
    //   68: dup
    //   69: ldc ''
    //   71: invokespecial <init> : (Ljava/lang/String;)V
    //   74: athrow
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */