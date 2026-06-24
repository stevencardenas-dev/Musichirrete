public abstract class kj0 {
  public static final Integer a;
  
  static {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 'android.os.Build$VERSION'
    //   4: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7: ldc 'SDK_INT'
    //   9: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   12: aconst_null
    //   13: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   16: astore_0
    //   17: aload_0
    //   18: instanceof java/lang/Integer
    //   21: ifeq -> 32
    //   24: aload_0
    //   25: checkcast java/lang/Integer
    //   28: astore_0
    //   29: goto -> 34
    //   32: aconst_null
    //   33: astore_0
    //   34: aload_2
    //   35: astore_1
    //   36: aload_0
    //   37: ifnull -> 51
    //   40: aload_2
    //   41: astore_1
    //   42: aload_0
    //   43: invokevirtual intValue : ()I
    //   46: ifle -> 51
    //   49: aload_0
    //   50: astore_1
    //   51: aload_1
    //   52: putstatic kj0.a : Ljava/lang/Integer;
    //   55: return
    //   56: astore_0
    //   57: goto -> 32
    // Exception table:
    //   from	to	target	type
    //   2	29	56	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */