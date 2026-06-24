import java.security.Key;
import java.security.PrivateKey;

public final class ph1 extends v82 {
  public final int d;
  
  public final void a(Key paramKey, qr paramqr) {
    if (paramKey != null)
      try {
        paramKey = PrivateKey.class.cast(paramKey);
        qv.i(paramKey);
        return;
      } catch (ClassCastException classCastException) {
        m60.f();
        return;
      }  
    m60.f();
  }
  
  public boolean g() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : I
    //   4: istore_1
    //   5: iconst_1
    //   6: istore_3
    //   7: iconst_1
    //   8: istore_2
    //   9: iload_1
    //   10: tableswitch default -> 28, 1 -> 49
    //   28: aload_0
    //   29: getfield b : Ljava/lang/String;
    //   32: invokestatic v : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   35: astore #4
    //   37: aload #4
    //   39: ifnull -> 45
    //   42: goto -> 47
    //   45: iconst_0
    //   46: istore_2
    //   47: iload_2
    //   48: ireturn
    //   49: invokestatic N : ()Lyk0;
    //   52: astore #5
    //   54: new qp0
    //   57: astore #4
    //   59: aload #4
    //   61: bipush #16
    //   63: invokespecial <init> : (I)V
    //   66: aload #5
    //   68: getfield h : Ljava/security/Key;
    //   71: astore #6
    //   73: new j01
    //   76: astore #5
    //   78: aload #5
    //   80: iconst_5
    //   81: invokespecial <init> : (I)V
    //   84: aload_0
    //   85: aload #6
    //   87: aload #4
    //   89: aload #5
    //   91: invokevirtual j : (Ljava/security/Key;Lqp0;Lj01;)V
    //   94: iload_3
    //   95: istore_2
    //   96: goto -> 103
    //   99: astore #4
    //   101: iconst_0
    //   102: istore_2
    //   103: iload_2
    //   104: ireturn
    //   105: astore #4
    //   107: goto -> 45
    // Exception table:
    //   from	to	target	type
    //   28	37	105	ek0
    //   49	94	99	ek0
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ph1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */