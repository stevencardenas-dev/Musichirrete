public final class u41 extends dd1 {
  public final Throwable p;
  
  public u41(Throwable paramThrowable) {
    this.p = paramThrowable;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("FAILURE (");
    stringBuilder.append(this.p.getMessage());
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u41.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */