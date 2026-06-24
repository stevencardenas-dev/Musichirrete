import java.util.concurrent.TimeoutException;

public final class jj2 extends TimeoutException {
  public final Throwable fillInStackTrace() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_0
    //   4: anewarray java/lang/StackTraceElement
    //   7: invokevirtual setStackTrace : ([Ljava/lang/StackTraceElement;)V
    //   10: aload_0
    //   11: monitorexit
    //   12: aload_0
    //   13: areturn
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	14	finally
    //   15	17	14	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */