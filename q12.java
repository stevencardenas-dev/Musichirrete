import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

public final class q12 extends r12 {
  public final Matrix a = new Matrix();
  
  public final ArrayList b = new ArrayList();
  
  public float c = 0.0F;
  
  public float d = 0.0F;
  
  public float e = 0.0F;
  
  public float f = 1.0F;
  
  public float g = 1.0F;
  
  public float h = 0.0F;
  
  public float i = 0.0F;
  
  public final Matrix j;
  
  public String k;
  
  public q12() {
    this.j = new Matrix();
    this.k = null;
  }
  
  public q12(q12 paramq12, b9 paramb9) {
    Matrix matrix = new Matrix();
    this.j = matrix;
    this.k = null;
    this.c = paramq12.c;
    this.d = paramq12.d;
    this.e = paramq12.e;
    this.f = paramq12.f;
    this.g = paramq12.g;
    this.h = paramq12.h;
    this.i = paramq12.i;
    String str = paramq12.k;
    this.k = str;
    if (str != null)
      paramb9.put(str, this); 
    matrix.set(paramq12.j);
    ArrayList<q12> arrayList = paramq12.b;
    for (byte b = 0; b < arrayList.size(); b++) {
      paramq12 = arrayList.get(b);
      if (paramq12 instanceof q12) {
        paramq12 = paramq12;
        this.b.add(new q12(paramq12, paramb9));
      } else {
        s12 s12;
        if (paramq12 instanceof p12) {
          p12 p12 = (p12)paramq12;
          s12 = new s12(p12);
          ((p12)s12).e = 0.0F;
          ((p12)s12).g = 1.0F;
          ((p12)s12).h = 1.0F;
          ((p12)s12).i = 0.0F;
          ((p12)s12).j = 1.0F;
          ((p12)s12).k = 0.0F;
          ((p12)s12).l = Paint.Cap.BUTT;
          ((p12)s12).m = Paint.Join.MITER;
          ((p12)s12).n = 4.0F;
          ((p12)s12).d = p12.d;
          ((p12)s12).e = p12.e;
          ((p12)s12).g = p12.g;
          ((p12)s12).f = p12.f;
          s12.c = p12.c;
          ((p12)s12).h = p12.h;
          ((p12)s12).i = p12.i;
          ((p12)s12).j = p12.j;
          ((p12)s12).k = p12.k;
          ((p12)s12).l = p12.l;
          ((p12)s12).m = p12.m;
          ((p12)s12).n = p12.n;
        } else if (s12 instanceof o12) {
          s12 = new s12(s12);
        } else {
          tp.f("Unknown object in the tree!");
          throw null;
        } 
        this.b.add(s12);
        String str1 = s12.b;
        if (str1 != null)
          paramb9.put(str1, s12); 
      } 
    } 
  }
  
  public final boolean a() {
    byte b = 0;
    while (true) {
      ArrayList<r12> arrayList = this.b;
      if (b < arrayList.size()) {
        if (((r12)arrayList.get(b)).a())
          return true; 
        b++;
        continue;
      } 
      return false;
    } 
  }
  
  public final boolean b(int[] paramArrayOfint) {
    byte b = 0;
    boolean bool = false;
    while (true) {
      ArrayList<r12> arrayList = this.b;
      if (b < arrayList.size()) {
        bool |= ((r12)arrayList.get(b)).b(paramArrayOfint);
        b++;
        continue;
      } 
      return bool;
    } 
  }
  
  public final void c() {
    Matrix matrix = this.j;
    matrix.reset();
    matrix.postTranslate(-this.d, -this.e);
    matrix.postScale(this.f, this.g);
    matrix.postRotate(this.c, 0.0F, 0.0F);
    matrix.postTranslate(this.h + this.d, this.i + this.e);
  }
  
  public String getGroupName() {
    return this.k;
  }
  
  public Matrix getLocalMatrix() {
    return this.j;
  }
  
  public float getPivotX() {
    return this.d;
  }
  
  public float getPivotY() {
    return this.e;
  }
  
  public float getRotation() {
    return this.c;
  }
  
  public float getScaleX() {
    return this.f;
  }
  
  public float getScaleY() {
    return this.g;
  }
  
  public float getTranslateX() {
    return this.h;
  }
  
  public float getTranslateY() {
    return this.i;
  }
  
  public void setPivotX(float paramFloat) {
    if (paramFloat != this.d) {
      this.d = paramFloat;
      c();
    } 
  }
  
  public void setPivotY(float paramFloat) {
    if (paramFloat != this.e) {
      this.e = paramFloat;
      c();
    } 
  }
  
  public void setRotation(float paramFloat) {
    if (paramFloat != this.c) {
      this.c = paramFloat;
      c();
    } 
  }
  
  public void setScaleX(float paramFloat) {
    if (paramFloat != this.f) {
      this.f = paramFloat;
      c();
    } 
  }
  
  public void setScaleY(float paramFloat) {
    if (paramFloat != this.g) {
      this.g = paramFloat;
      c();
    } 
  }
  
  public void setTranslateX(float paramFloat) {
    if (paramFloat != this.h) {
      this.h = paramFloat;
      c();
    } 
  }
  
  public void setTranslateY(float paramFloat) {
    if (paramFloat != this.i) {
      this.i = paramFloat;
      c();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */