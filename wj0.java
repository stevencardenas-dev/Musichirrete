import java.util.concurrent.CancellationException;

public final class wj0 extends CancellationException {
  public final transient dk0 b;
  
  public wj0(String paramString, Throwable paramThrowable, dk0 paramdk0) {
    super(paramString);
    this.b = paramdk0;
    if (paramThrowable != null)
      initCause(paramThrowable); 
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != this) {
      if (paramObject instanceof wj0) {
        paramObject = paramObject;
        if (ui0.c(paramObject.getMessage(), getMessage()) && ui0.c(((wj0)paramObject).b, this.b) && ui0.c(paramObject.getCause(), getCause()))
          return true; 
      } 
      return false;
    } 
    return true;
  }
  
  public final Throwable fillInStackTrace() {
    setStackTrace(new StackTraceElement[0]);
    return this;
  }
  
  public final int hashCode() {
    byte b;
    String str = getMessage();
    str.getClass();
    int j = str.hashCode();
    int i = this.b.hashCode();
    Throwable throwable = getCause();
    if (throwable != null) {
      b = throwable.hashCode();
    } else {
      b = 0;
    } 
    return (i + j * 31) * 31 + b;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.toString());
    stringBuilder.append("; job=");
    stringBuilder.append(this.b);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */