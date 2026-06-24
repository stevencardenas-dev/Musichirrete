public final class nu1 implements ns {
  public final ThreadLocal b;
  
  public nu1(ThreadLocal paramThreadLocal) {
    this.b = paramThreadLocal;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof nu1))
      return false; 
    paramObject = paramObject;
    return !!ui0.c(this.b, ((nu1)paramObject).b);
  }
  
  public final int hashCode() {
    return this.b.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("ThreadLocalKey(threadLocal=");
    stringBuilder.append(this.b);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */