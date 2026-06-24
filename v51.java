import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

public final class v51 {
  public final Bitmap a;
  
  public final ArrayList b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public final ArrayList f;
  
  public Rect g;
  
  public v51(Bitmap paramBitmap) {
    ArrayList<lt1> arrayList = new ArrayList();
    this.b = arrayList;
    this.c = 16;
    this.d = 12544;
    this.e = -1;
    ArrayList<ar0> arrayList1 = new ArrayList();
    this.f = arrayList1;
    if (paramBitmap != null && !paramBitmap.isRecycled()) {
      arrayList1.add(y51.e);
      this.a = paramBitmap;
      arrayList.add(lt1.d);
      arrayList.add(lt1.e);
      arrayList.add(lt1.f);
      arrayList.add(lt1.g);
      arrayList.add(lt1.h);
      arrayList.add(lt1.i);
      return;
    } 
    l0.l("Bitmap is not valid");
    throw null;
  }
  
  public final y51 a() {
    Bitmap bitmap = this.a;
    if (bitmap != null) {
      double d1;
      Bitmap bitmap1;
      w51[] arrayOfW51;
      Rect rect3;
      int i = this.d;
      double d2 = -1.0D;
      if (i > 0) {
        i = bitmap.getWidth();
        int n = bitmap.getHeight() * i;
        i = this.d;
        d1 = d2;
        if (n > i)
          d1 = Math.sqrt(i / n); 
      } else {
        d1 = d2;
        if (this.e > 0) {
          int n = Math.max(bitmap.getWidth(), bitmap.getHeight());
          i = this.e;
          d1 = d2;
          if (n > i)
            d1 = i / n; 
        } 
      } 
      int j = 0;
      if (d1 <= 0.0D) {
        bitmap1 = bitmap;
      } else {
        bitmap1 = Bitmap.createScaledBitmap(bitmap, (int)Math.ceil(bitmap.getWidth() * d1), (int)Math.ceil(bitmap.getHeight() * d1), false);
      } 
      Rect rect1 = this.g;
      if (bitmap1 != bitmap && rect1 != null) {
        d1 = bitmap1.getWidth() / bitmap.getWidth();
        rect1.left = (int)Math.floor(rect1.left * d1);
        rect1.top = (int)Math.floor(rect1.top * d1);
        rect1.right = Math.min((int)Math.ceil(rect1.right * d1), bitmap1.getWidth());
        rect1.bottom = Math.min((int)Math.ceil(rect1.bottom * d1), bitmap1.getHeight());
      } 
      int k = bitmap1.getWidth();
      i = bitmap1.getHeight();
      int[] arrayOfInt = new int[k * i];
      bitmap1.getPixels(arrayOfInt, 0, k, 0, 0, k, i);
      Rect rect2 = this.g;
      if (rect2 != null) {
        int n = rect2.width();
        int i1 = this.g.height();
        int[] arrayOfInt1 = new int[n * i1];
        for (i = 0; i < i1; i++) {
          rect3 = this.g;
          System.arraycopy(arrayOfInt, (rect3.top + i) * k + rect3.left, arrayOfInt1, i * n, n);
        } 
        arrayOfInt = arrayOfInt1;
      } 
      i = this.c;
      ArrayList arrayList2 = this.f;
      if (arrayList2.isEmpty()) {
        arrayList2 = null;
      } else {
        arrayOfW51 = (w51[])arrayList2.toArray((Object[])new w51[arrayList2.size()]);
      } 
      cn cn = new cn(arrayOfInt, i, arrayOfW51);
      if (bitmap1 != bitmap)
        bitmap1.recycle(); 
      ArrayList arrayList1 = (ArrayList)cn.b;
      ArrayList<lt1> arrayList = this.b;
      y51 y51 = new y51(arrayList, arrayList1);
      int m = arrayList.size();
      k = 0;
      i = j;
      for (j = k;; j++) {
        SparseBooleanArray sparseBooleanArray = y51.c;
        if (j < m) {
          lt1 lt1 = arrayList.get(j);
          float[] arrayOfFloat1 = lt1.c;
          float[] arrayOfFloat2 = lt1.a;
          int n = arrayOfFloat1.length;
          float f3 = 0.0F;
          k = i;
          float f1;
          for (f1 = 0.0F; k < n; f1 = f4) {
            float f5 = arrayOfFloat1[k];
            float f4 = f1;
            if (f5 > 0.0F)
              f4 = f1 + f5; 
            k++;
          } 
          if (f1 != 0.0F) {
            n = arrayOfFloat1.length;
            for (k = i; k < n; k++) {
              float f = arrayOfFloat1[k];
              if (f > 0.0F)
                arrayOfFloat1[k] = f / f1; 
            } 
          } 
          List list = y51.a;
          int i1 = list.size();
          k = i;
          float f2 = 0.0F;
          arrayOfFloat1 = null;
          f1 = f3;
          while (true) {
            k++;
            f2 = f3;
          } 
          if (arrayOfFloat1 != null)
            sparseBooleanArray.append(((x51)arrayOfFloat1).d, true); 
          continue;
        } 
        sparseBooleanArray.clear();
        return y51;
        y51.b.put(rect3, arrayList1);
      } 
    } 
    throw new AssertionError();
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Bitmap bitmap = this.a;
    if (bitmap != null) {
      if (this.g == null)
        this.g = new Rect(); 
      this.g.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
      if (!this.g.intersect(paramInt1, paramInt2, paramInt3, paramInt4))
        l0.l("The given region must intersect with the Bitmap's dimensions."); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */