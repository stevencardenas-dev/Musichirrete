import android.net.Uri;
import java.util.ArrayList;

public final class yf1 {
  public Uri a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public boolean e;
  
  public boolean f;
  
  public boolean g;
  
  public ArrayList h;
  
  public int i;
  
  public final void a(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      if (paramInt2 >= 0) {
        if (paramInt2 != 0 || paramInt1 != 0) {
          this.c = paramInt1;
          this.d = paramInt2;
          this.g = true;
          return;
        } 
        l0.l("At least one dimension has to be positive number.");
        return;
      } 
      l0.l("Height must be positive number or 0.");
      return;
    } 
    l0.l("Width must be positive number or 0.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */