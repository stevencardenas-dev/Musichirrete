import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class gh2 extends RuntimeException {
  public static Object c(Callable<Callable> paramCallable) {
    try {
      return paramCallable.call();
    } catch (RuntimeException runtimeException) {
      throw runtimeException;
    } catch (Exception exception) {
      throw new RuntimeException("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exception);
    } 
  }
  
  public final Exception a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial getCause : ()Ljava/lang/Throwable;
    //   6: astore_1
    //   7: aload_1
    //   8: invokevirtual getClass : ()Ljava/lang/Class;
    //   11: pop
    //   12: aload_1
    //   13: checkcast java/lang/Exception
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: areturn
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	21	finally
    //   22	24	21	finally
  }
  
  public final Exception b() {
    int j = 0;
    for (int i = 0; i; i++) {
      (new Class[1])[0] = jo1.class;
      Class<?> clazz = (new Class[1])[i];
      if (RuntimeException.class.isAssignableFrom(clazz)) {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = "getCause";
        arrayOfObject[1] = clazz;
        for (i = 0; i < 2; i++) {
          String str;
          Object object = arrayOfObject[i];
          if (object == null) {
            str = "null";
          } else {
            try {
              str = object.toString();
            } catch (Exception exception1) {
              str = x41.l(object.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(object)));
              Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), exception1);
              object = exception1.getClass().getName();
              StringBuilder stringBuilder2 = new StringBuilder("<");
              stringBuilder2.append(str);
              stringBuilder2.append(" threw ");
              stringBuilder2.append((String)object);
              stringBuilder2.append(">");
              str = stringBuilder2.toString();
            } 
          } 
          arrayOfObject[i] = str;
        } 
        StringBuilder stringBuilder1 = new StringBuilder(118);
        int k = 0;
        for (i = j; i < 2; i++) {
          j = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", k);
          if (j == -1)
            break; 
          stringBuilder1.append("The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", k, j);
          stringBuilder1.append(arrayOfObject[i]);
          k = j + 2;
        } 
        stringBuilder1.append("The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", k, 86);
        if (i < 2) {
          stringBuilder1.append(" [");
          k = i + 1;
          stringBuilder1.append(arrayOfObject[i]);
          for (i = k; i < 2; i++) {
            stringBuilder1.append(", ");
            stringBuilder1.append(arrayOfObject[i]);
          } 
          stringBuilder1.append(']');
        } 
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
    } 
    if (jo1.class.isInstance(a()))
      return jo1.class.cast(a()); 
    Exception exception = a();
    StringBuilder stringBuilder = new StringBuilder("getCause(");
    stringBuilder.append(jo1.class);
    stringBuilder.append(") doesn't match underlying exception");
    ClassCastException classCastException = new ClassCastException(stringBuilder.toString());
    classCastException.initCause(exception);
    throw classCastException;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */