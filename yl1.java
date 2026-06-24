import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

public final class yl1 extends em1 {
  public final ArrayList c;
  
  public final Matrix d;
  
  public yl1(ArrayList paramArrayList, Matrix paramMatrix) {}
  
  public final void a(Matrix paramMatrix, tl1 paramtl1, int paramInt, Canvas paramCanvas) {
    ArrayList<Object> arrayList = this.c;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      em1 em11 = (em1)arrayList.get(b);
      b++;
      ((em1)em11).a(this.d, paramtl1, paramInt, paramCanvas);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */