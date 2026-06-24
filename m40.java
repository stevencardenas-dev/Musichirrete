import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.SparseArray;
import java.io.InputStream;

public final class m40 {
  public final int a;
  
  public final int b;
  
  public final Object c;
  
  public final Object d;
  
  public m40(Bitmap paramBitmap, InputStream paramInputStream, int paramInt1, int paramInt2) {
    boolean bool1;
    boolean bool2 = false;
    if (paramBitmap != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (paramInputStream != null)
      bool2 = true; 
    if ((bool2 ^ bool1) != 0) {
      this.c = paramBitmap;
      this.d = paramInputStream;
      if (paramInt1 == 0)
        k91.h("loadedFrom == null"); 
      this.a = paramInt1;
      this.b = paramInt2;
      return;
    } 
    throw new AssertionError();
  }
  
  public m40(InputStream paramInputStream, int paramInt) {}
  
  public m40(n40 paramn40, zv0 paramzv0) {
    this.c = new SparseArray();
    this.d = paramn40;
    TypedArray typedArray = (TypedArray)paramzv0.e;
    this.a = typedArray.getResourceId(28, 0);
    this.b = typedArray.getResourceId(53, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */