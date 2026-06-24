import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

public final class oq {
  public static final SparseIntArray n;
  
  public float a;
  
  public float b;
  
  public float c;
  
  public float d;
  
  public float e;
  
  public float f;
  
  public float g;
  
  public int h;
  
  public float i;
  
  public float j;
  
  public float k;
  
  public boolean l;
  
  public float m;
  
  static {
    SparseIntArray sparseIntArray = new SparseIntArray();
    n = sparseIntArray;
    sparseIntArray.append(6, 1);
    sparseIntArray.append(7, 2);
    sparseIntArray.append(8, 3);
    sparseIntArray.append(4, 4);
    sparseIntArray.append(5, 5);
    sparseIntArray.append(0, 6);
    sparseIntArray.append(1, 7);
    sparseIntArray.append(2, 8);
    sparseIntArray.append(3, 9);
    sparseIntArray.append(9, 10);
    sparseIntArray.append(10, 11);
    sparseIntArray.append(11, 12);
  }
  
  public final void a(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fc1.j);
    int i = typedArray.getIndexCount();
    for (byte b = 0; b < i; b++) {
      int j = typedArray.getIndex(b);
      switch (n.get(j)) {
        case 12:
          this.h = pq.i(typedArray, j, this.h);
          break;
        case 11:
          this.l = true;
          this.m = typedArray.getDimension(j, this.m);
          break;
        case 10:
          this.k = typedArray.getDimension(j, this.k);
          break;
        case 9:
          this.j = typedArray.getDimension(j, this.j);
          break;
        case 8:
          this.i = typedArray.getDimension(j, this.i);
          break;
        case 7:
          this.g = typedArray.getDimension(j, this.g);
          break;
        case 6:
          this.f = typedArray.getDimension(j, this.f);
          break;
        case 5:
          this.e = typedArray.getFloat(j, this.e);
          break;
        case 4:
          this.d = typedArray.getFloat(j, this.d);
          break;
        case 3:
          this.c = typedArray.getFloat(j, this.c);
          break;
        case 2:
          this.b = typedArray.getFloat(j, this.b);
          break;
        case 1:
          this.a = typedArray.getFloat(j, this.a);
          break;
      } 
    } 
    typedArray.recycle();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */