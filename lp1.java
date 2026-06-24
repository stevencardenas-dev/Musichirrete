import android.util.StateSet;

public final class lp1 {
  public int a;
  
  public vl1 b;
  
  public int[][] c;
  
  public vl1[] d;
  
  public kp1 e;
  
  public kp1 f;
  
  public kp1 g;
  
  public kp1 h;
  
  public lp1(vl1 paramvl1) {
    b();
    a(StateSet.WILD_CARD, paramvl1);
  }
  
  public final void a(int[] paramArrayOfint, vl1 paramvl1) {
    int i = this.a;
    if (i == 0 || paramArrayOfint.length == 0)
      this.b = paramvl1; 
    int[][] arrayOfInt2 = this.c;
    if (i >= arrayOfInt2.length) {
      int j = i + 10;
      int[][] arrayOfInt = new int[j][];
      System.arraycopy(arrayOfInt2, 0, arrayOfInt, 0, i);
      this.c = arrayOfInt;
      vl1[] arrayOfVl1 = new vl1[j];
      System.arraycopy(this.d, 0, arrayOfVl1, 0, i);
      this.d = arrayOfVl1;
    } 
    int[][] arrayOfInt1 = this.c;
    i = this.a;
    arrayOfInt1[i] = paramArrayOfint;
    this.d[i] = paramvl1;
    this.a = i + 1;
  }
  
  public final void b() {
    this.b = new vl1();
    this.c = new int[10][];
    this.d = new vl1[10];
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */