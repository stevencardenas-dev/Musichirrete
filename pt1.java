public final class pt1 extends mt1 {
  public final Runnable e;
  
  public pt1(Runnable paramRunnable, long paramLong, boolean paramBoolean) {
    super(paramLong, paramBoolean);
    this.e = paramRunnable;
  }
  
  public final void run() {
    this.e.run();
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("Task[");
    Runnable runnable = this.e;
    stringBuilder.append(runnable.getClass().getSimpleName());
    stringBuilder.append('@');
    stringBuilder.append(qv.s(runnable));
    stringBuilder.append(", ");
    stringBuilder.append(this.b);
    stringBuilder.append(", ");
    if (this.c) {
      str = "Blocking";
    } else {
      str = "Non-blocking";
    } 
    stringBuilder.append(str);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */