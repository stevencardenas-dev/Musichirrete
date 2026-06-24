import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public final class nq {
  public int a;
  
  public int b;
  
  public float c;
  
  public float d;
  
  public final void a(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fc1.h);
    int i = typedArray.getIndexCount();
    for (byte b = 0; b < i; b++) {
      int j = typedArray.getIndex(b);
      if (j == 1) {
        this.c = typedArray.getFloat(j, this.c);
      } else if (j == 0) {
        j = typedArray.getInt(j, this.a);
        this.a = j;
        this.a = pq.d[j];
      } else if (j == 4) {
        this.b = typedArray.getInt(j, this.b);
      } else if (j == 3) {
        this.d = typedArray.getFloat(j, this.d);
      } 
    } 
    typedArray.recycle();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */