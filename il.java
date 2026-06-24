import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.Arrays;

public final class il {
  public int a;
  
  public int b;
  
  public int c;
  
  public Object d;
  
  public void a(yp paramyp) {
    Object[] arrayOfObject = (Object[])this.d;
    int i = this.b;
    arrayOfObject[i] = paramyp;
    int j = this.c & i + 1;
    this.b = j;
    i = this.a;
    if (j == i) {
      j = arrayOfObject.length;
      int k = j << 1;
      if (k >= 0) {
        Object[] arrayOfObject1 = new Object[k];
        g9.F0(0, i, j, arrayOfObject, arrayOfObject1);
        arrayOfObject = (Object[])this.d;
        g9.F0(j - i, 0, this.a, arrayOfObject, arrayOfObject1);
        this.d = arrayOfObject1;
        this.a = 0;
        this.b = j;
        this.c = k - 1;
        return;
      } 
      l0.f("Max array capacity exceeded");
    } 
  }
  
  public void b(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      if (paramInt2 >= 0) {
        int j = this.c;
        int i = j * 2;
        int[] arrayOfInt2 = (int[])this.d;
        if (arrayOfInt2 == null) {
          int[] arrayOfInt = new int[4];
          this.d = arrayOfInt;
          Arrays.fill(arrayOfInt, -1);
        } else if (i >= arrayOfInt2.length) {
          int[] arrayOfInt = new int[j * 4];
          this.d = arrayOfInt;
          System.arraycopy(arrayOfInt2, 0, arrayOfInt, 0, arrayOfInt2.length);
        } 
        int[] arrayOfInt1 = (int[])this.d;
        arrayOfInt1[i] = paramInt1;
        arrayOfInt1[i + 1] = paramInt2;
        this.c++;
        return;
      } 
      l0.l("Pixel distance must be non-negative");
      return;
    } 
    l0.l("Layout positions must be non-negative");
  }
  
  public void c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : I
    //   4: istore_1
    //   5: iload_1
    //   6: iflt -> 36
    //   9: aload_0
    //   10: getfield c : I
    //   13: istore_2
    //   14: iload_1
    //   15: iload_2
    //   16: if_icmplt -> 31
    //   19: iload_1
    //   20: iload_2
    //   21: if_icmpne -> 36
    //   24: aload_0
    //   25: getfield b : I
    //   28: ifne -> 36
    //   31: iconst_1
    //   32: istore_3
    //   33: goto -> 38
    //   36: iconst_0
    //   37: istore_3
    //   38: iload_3
    //   39: invokestatic r : (Z)V
    //   42: return
  }
  
  public void d(RecyclerView paramRecyclerView, boolean paramBoolean) {
    this.c = 0;
    int[] arrayOfInt = (int[])this.d;
    if (arrayOfInt != null)
      Arrays.fill(arrayOfInt, -1); 
    a a = paramRecyclerView.p;
    if (paramRecyclerView.o != null && a != null && a.k) {
      if (paramBoolean) {
        if (!paramRecyclerView.g.j())
          a.t(paramRecyclerView.o.c(), this); 
      } else if (!paramRecyclerView.Q()) {
        a.s(this.a, this.b, paramRecyclerView.j0, this);
      } 
      int i = this.c;
      if (i > a.l) {
        a.l = i;
        a.m = paramBoolean;
        paramRecyclerView.e.n();
      } 
    } 
  }
  
  public boolean e() {
    boolean bool;
    byte[] arrayOfByte = (byte[])this.d;
    int i = this.a;
    byte b = arrayOfByte[i];
    int j = this.b;
    if ((b & 128 >> j) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.b = ++j;
    if (j == 8) {
      this.b = 0;
      this.a = i + 1;
    } 
    c();
    return bool;
  }
  
  public int f(int paramInt) {
    byte[] arrayOfByte = (byte[])this.d;
    if (paramInt == 0)
      return 0; 
    this.b += paramInt;
    int i = 0;
    while (true) {
      int j = this.b;
      if (j > 8) {
        int m = j - 8;
        this.b = m;
        j = this.a;
        this.a = j + 1;
        i |= (arrayOfByte[j] & 0xFF) << m;
        continue;
      } 
      int k = this.a;
      byte b = arrayOfByte[k];
      if (j == 8) {
        this.b = 0;
        this.a = k + 1;
      } 
      c();
      return -1 >>> 32 - paramInt & ((b & 0xFF) >> 8 - j | i);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\il.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */