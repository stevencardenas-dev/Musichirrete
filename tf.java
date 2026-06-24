public final class tf implements Runnable {
  public final int b;
  
  public final cw1 c;
  
  public final void run() {
    int i = this.b;
    cw1 cw11 = this.c;
    switch (i) {
      default:
        stringBuilder = new StringBuilder("Transformation ");
        stringBuilder.append(cw11.b());
        stringBuilder.append(" mutated input Bitmap but failed to recycle the original.");
        throw new IllegalStateException(stringBuilder.toString());
      case 0:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder("Transformation ");
    stringBuilder.append(cw11.b());
    stringBuilder.append(" returned input Bitmap but recycled it.");
    throw new IllegalStateException(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */