import java.util.Random;

public final class rf extends ThreadLocal {
  public final int a;
  
  public final Object initialValue() {
    switch (this.a) {
      default:
        return Long.valueOf(0L);
      case 3:
        return Boolean.FALSE;
      case 2:
        return new StringBuilder();
      case 1:
        return new Random();
      case 0:
        break;
    } 
    return new StringBuilder("Picasso-");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */