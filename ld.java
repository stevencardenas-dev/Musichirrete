import android.os.SystemClock;

public final class ld implements Runnable {
  public final int b;
  
  public final nd c;
  
  public final void run() {
    int i = this.b;
    nd nd1 = this.c;
    switch (i) {
      default:
        ((n10)nd1.getCurrentDrawable()).d(false, false, true);
        if ((nd1.getProgressDrawable() == null || !nd1.getProgressDrawable().isVisible()) && (nd1.getIndeterminateDrawable() == null || !nd1.getIndeterminateDrawable().isVisible()))
          nd1.setVisibility(4); 
        return;
      case 0:
        break;
    } 
    if (nd1.g > 0)
      SystemClock.uptimeMillis(); 
    nd1.setVisibility(0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */