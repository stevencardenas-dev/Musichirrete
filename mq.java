import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

public final class mq {
  public static final SparseIntArray j;
  
  public int a;
  
  public int b;
  
  public int c;
  
  public float d;
  
  public float e;
  
  public float f;
  
  public int g;
  
  public String h;
  
  public int i;
  
  static {
    SparseIntArray sparseIntArray = new SparseIntArray();
    j = sparseIntArray;
    sparseIntArray.append(3, 1);
    sparseIntArray.append(5, 2);
    sparseIntArray.append(9, 3);
    sparseIntArray.append(2, 4);
    sparseIntArray.append(1, 5);
    sparseIntArray.append(0, 6);
    sparseIntArray.append(4, 7);
    sparseIntArray.append(8, 8);
    sparseIntArray.append(7, 9);
    sparseIntArray.append(6, 10);
  }
  
  public final void a(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fc1.g);
    int i = typedArray.getIndexCount();
    for (byte b = 0; b < i; b++) {
      String str;
      int k;
      int j = typedArray.getIndex(b);
      switch (j.get(j)) {
        case 10:
          k = (typedArray.peekValue(j)).type;
          if (k == 1) {
            this.i = typedArray.getResourceId(j, -1);
            break;
          } 
          if (k == 3) {
            String str1 = typedArray.getString(j);
            this.h = str1;
            if (str1.indexOf("/") > 0)
              this.i = typedArray.getResourceId(j, -1); 
            break;
          } 
          typedArray.getInteger(j, this.i);
          break;
        case 9:
          this.f = typedArray.getFloat(j, this.f);
          break;
        case 8:
          this.g = typedArray.getInteger(j, this.g);
          break;
        case 7:
          this.d = typedArray.getFloat(j, this.d);
          break;
        case 6:
          this.b = typedArray.getInteger(j, this.b);
          break;
        case 5:
          this.a = pq.i(typedArray, j, this.a);
          break;
        case 4:
          typedArray.getInt(j, 0);
          break;
        case 3:
          if ((typedArray.peekValue(j)).type == 3) {
            typedArray.getString(j);
            break;
          } 
          str = n21.b[typedArray.getInteger(j, 0)];
          break;
        case 2:
          this.c = typedArray.getInt(j, this.c);
          break;
        case 1:
          this.e = typedArray.getFloat(j, this.e);
          break;
      } 
    } 
    typedArray.recycle();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */