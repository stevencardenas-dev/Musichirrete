public final class gi implements i21 {
  public final int a;
  
  public final Object b;
  
  public final String toString() {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        stringBuilder = new StringBuilder("DisposeOnCancel[");
        stringBuilder.append(object);
        stringBuilder.append(']');
        return stringBuilder.toString();
      case 1:
        stringBuilder = new StringBuilder("CancelHandler.UserSupplied[");
        stringBuilder.append(((wc0)object).getClass().getSimpleName());
        stringBuilder.append('@');
        stringBuilder.append(qv.s(this));
        stringBuilder.append(']');
        return stringBuilder.toString();
      case 0:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder("CancelFutureOnCancel[");
    stringBuilder.append(object);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */