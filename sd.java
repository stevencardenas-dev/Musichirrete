import android.view.View;

public final class sd implements Runnable {
  public final int b;
  
  public int c;
  
  public final Object e;
  
  public sd(cu2 paramcu2, cv2 paramcv2, int paramInt) {
    this.e = paramcv2;
    this.c = paramInt;
  }
  
  public final void run() {
    int i = this.b;
    Object object = this.e;
    switch (i) {
      default:
        ((cv2)object).C.b(this.c);
        return;
      case 5:
        ((qa2)object).b(this.c);
        return;
      case 4:
        ((w01)object).updateActiveIndicatorLayoutParams(this.c);
        return;
      case 3:
        object = ((l7)object).c;
        ((ss0)object).f.requestFocus();
        ((ss0)object).e.V.E0(this.c);
        return;
      case 2:
        object = object;
        i = this.c;
        object = ((bh0)object).c;
        if (object != null)
          object.J(i); 
        return;
      case 1:
        ((xd)object).i.p(this.c, 4);
        return;
      case 0:
        break;
    } 
    ((yd)object).j.p(this.c, 4);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */