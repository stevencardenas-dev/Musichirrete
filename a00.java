import android.os.Message;

public final class a00 implements Runnable {
  public final int b;
  
  public final Message c;
  
  public final void run() {
    int i = this.b;
    Message message = this.c;
    switch (i) {
      default:
        stringBuilder = new StringBuilder("Unhandled stats message.");
        stringBuilder.append(message.what);
        throw new AssertionError(stringBuilder.toString());
      case 0:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder("Unknown handler message received: ");
    stringBuilder.append(message.what);
    throw new AssertionError(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */