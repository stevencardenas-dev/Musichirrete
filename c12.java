import java.nio.charset.Charset;

public abstract class c12 {
  public static final Charset a = Charset.forName("UTF-8");
  
  public static void a(long paramLong1, long paramLong2, long paramLong3) {
    if ((paramLong2 | paramLong3) >= 0L && paramLong2 <= paramLong1 && paramLong1 - paramLong2 >= paramLong3)
      return; 
    StringBuilder stringBuilder = new StringBuilder("size=");
    stringBuilder.append(paramLong1);
    stringBuilder.append(" offset=");
    stringBuilder.append(paramLong2);
    stringBuilder.append(" byteCount=");
    stringBuilder.append(paramLong3);
    throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */