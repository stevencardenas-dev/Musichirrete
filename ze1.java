import android.util.SparseArray;

public final class ze1 implements Runnable {
  public final int b;
  
  public final af1 c;
  
  public final void run() {
    ff1 ff1;
    int i = this.b;
    af1 af11 = this.c;
    switch (i) {
      default:
        ff1 = af11.i;
        if (ff1.p == af11)
          ff1.j(); 
        return;
      case 0:
        break;
    } 
    SparseArray sparseArray = af11.h;
    int j = sparseArray.size();
    for (i = 0; i < j; i++) {
      ((cf1)sparseArray.valueAt(i)).getClass();
      cf1.a(null, null);
    } 
    sparseArray.clear();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ze1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */