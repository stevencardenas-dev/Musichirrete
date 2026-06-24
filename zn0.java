public final class zn0 implements Runnable {
  public final int b;
  
  public final co0 c;
  
  public final void run() {
    int i = this.b;
    co0 co01 = this.c;
    switch (i) {
      default:
        y10 = co01.e;
        if (y10 != null && y10.isAttachedToWindow() && co01.e.getCount() > co01.e.getChildCount() && co01.e.getChildCount() <= co01.o) {
          co01.B.setInputMethodMode(2);
          co01.d();
        } 
        return;
      case 0:
        break;
    } 
    y10 y10 = co01.e;
    if (y10 != null) {
      y10.setListSelectionHidden(true);
      y10.requestLayout();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */