import java.io.Serializable;

public final class qg1 implements Serializable {
  public final Throwable b;
  
  public qg1(Throwable paramThrowable) {
    this.b = paramThrowable;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof qg1) {
      paramObject = ((qg1)paramObject).b;
      if (ui0.c(this.b, paramObject))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.b.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Failure(");
    stringBuilder.append(this.b);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */