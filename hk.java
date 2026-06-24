public final class hk extends ik {
  public final Throwable a;
  
  public hk(Throwable paramThrowable) {
    this.a = paramThrowable;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof hk) {
      paramObject = ((hk)paramObject).a;
      if (ui0.c(this.a, paramObject))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    Throwable throwable = this.a;
    return (throwable != null) ? throwable.hashCode() : 0;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Closed(");
    stringBuilder.append(this.a);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */