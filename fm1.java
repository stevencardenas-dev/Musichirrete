import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

public final class fm1 {
  public float a;
  
  public float b;
  
  public float c;
  
  public float d;
  
  public float e;
  
  public float f;
  
  public final ArrayList g = new ArrayList();
  
  public final ArrayList h = new ArrayList();
  
  public fm1() {
    d(0.0F, 0.0F, 270.0F, 0.0F);
  }
  
  public final void a(float paramFloat) {
    float f = this.e;
    if (f != paramFloat) {
      f = (paramFloat - f + 360.0F) % 360.0F;
      if (f <= 180.0F) {
        float f2 = this.c;
        float f1 = this.d;
        bm1 bm1 = new bm1(f2, f1, f2, f1);
        bm1.f = this.e;
        bm1.g = f;
        zl1 zl1 = new zl1(bm1);
        this.h.add(zl1);
        this.e = paramFloat;
        return;
      } 
    } 
  }
  
  public final void b(Matrix paramMatrix, Path paramPath) {
    ArrayList<dm1> arrayList = this.g;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++)
      ((dm1)arrayList.get(b)).a(paramMatrix, paramPath); 
  }
  
  public final void c(float paramFloat1, float paramFloat2) {
    dm1 dm1 = new dm1();
    ((cm1)dm1).b = paramFloat1;
    ((cm1)dm1).c = paramFloat2;
    this.g.add(dm1);
    am1 am1 = new am1((cm1)dm1, this.c, this.d);
    float f2 = am1.b();
    float f1 = am1.b();
    a(f2 + 270.0F);
    this.h.add(am1);
    this.e = f1 + 270.0F;
    this.c = paramFloat1;
    this.d = paramFloat2;
  }
  
  public final void d(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat1;
    this.d = paramFloat2;
    this.e = paramFloat3;
    this.f = (paramFloat3 + paramFloat4) % 360.0F;
    this.g.clear();
    this.h.clear();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */