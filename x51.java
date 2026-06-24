import android.graphics.Color;
import java.util.Arrays;

public final class x51 {
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final int e;
  
  public boolean f;
  
  public int g;
  
  public int h;
  
  public float[] i;
  
  public x51(int paramInt1, int paramInt2) {
    this.a = Color.red(paramInt1);
    this.b = Color.green(paramInt1);
    this.c = Color.blue(paramInt1);
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public final void a() {
    if (!this.f) {
      int k = this.d;
      int i = jn.f(4.5F, -1, k);
      int j = jn.f(3.0F, -1, k);
      if (i != -1 && j != -1) {
        this.h = jn.i(-1, i);
        this.g = jn.i(-1, j);
        this.f = true;
        return;
      } 
      int m = jn.f(4.5F, -16777216, k);
      k = jn.f(3.0F, -16777216, k);
      if (m != -1 && k != -1) {
        this.h = jn.i(-16777216, m);
        this.g = jn.i(-16777216, k);
        this.f = true;
        return;
      } 
      if (i != -1) {
        i = jn.i(-1, i);
      } else {
        i = jn.i(-16777216, m);
      } 
      this.h = i;
      if (j != -1) {
        i = jn.i(-1, j);
      } else {
        i = jn.i(-16777216, k);
      } 
      this.g = i;
      this.f = true;
    } 
  }
  
  public final float[] b() {
    if (this.i == null)
      this.i = new float[3]; 
    int i = this.c;
    float[] arrayOfFloat = this.i;
    jn.a(this.a, this.b, i, arrayOfFloat);
    return this.i;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && x51.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.e == ((x51)paramObject).e && this.d == ((x51)paramObject).d)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.d * 31 + this.e;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(x51.class.getSimpleName());
    stringBuilder.append(" [RGB: #");
    stringBuilder.append(Integer.toHexString(this.d));
    stringBuilder.append("] [HSL: ");
    stringBuilder.append(Arrays.toString(b()));
    stringBuilder.append("] [Population: ");
    stringBuilder.append(this.e);
    stringBuilder.append("] [Title Text: #");
    a();
    stringBuilder.append(Integer.toHexString(this.g));
    stringBuilder.append("] [Body Text: #");
    a();
    stringBuilder.append(Integer.toHexString(this.h));
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */