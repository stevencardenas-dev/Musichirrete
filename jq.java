import java.util.Arrays;

public final class jq {
  public int[] a;
  
  public int[] b;
  
  public int c;
  
  public int[] d;
  
  public float[] e;
  
  public int f;
  
  public int[] g;
  
  public String[] h;
  
  public int i;
  
  public int[] j;
  
  public boolean[] k;
  
  public int l;
  
  public final void a(int paramInt, float paramFloat) {
    int i = this.f;
    int[] arrayOfInt = this.d;
    if (i >= arrayOfInt.length) {
      this.d = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
      float[] arrayOfFloat1 = this.e;
      this.e = Arrays.copyOf(arrayOfFloat1, arrayOfFloat1.length * 2);
    } 
    arrayOfInt = this.d;
    i = this.f;
    arrayOfInt[i] = paramInt;
    float[] arrayOfFloat = this.e;
    this.f = i + 1;
    arrayOfFloat[i] = paramFloat;
  }
  
  public final void b(int paramInt1, int paramInt2) {
    int i = this.c;
    int[] arrayOfInt = this.a;
    if (i >= arrayOfInt.length) {
      this.a = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
      arrayOfInt = this.b;
      this.b = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
    } 
    arrayOfInt = this.a;
    i = this.c;
    arrayOfInt[i] = paramInt1;
    arrayOfInt = this.b;
    this.c = i + 1;
    arrayOfInt[i] = paramInt2;
  }
  
  public final void c(int paramInt, boolean paramBoolean) {
    int i = this.l;
    int[] arrayOfInt = this.j;
    if (i >= arrayOfInt.length) {
      this.j = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
      boolean[] arrayOfBoolean1 = this.k;
      this.k = Arrays.copyOf(arrayOfBoolean1, arrayOfBoolean1.length * 2);
    } 
    arrayOfInt = this.j;
    i = this.l;
    arrayOfInt[i] = paramInt;
    boolean[] arrayOfBoolean = this.k;
    this.l = i + 1;
    arrayOfBoolean[i] = paramBoolean;
  }
  
  public final void d(String paramString, int paramInt) {
    int i = this.i;
    int[] arrayOfInt = this.g;
    if (i >= arrayOfInt.length) {
      this.g = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2);
      String[] arrayOfString1 = this.h;
      this.h = Arrays.<String>copyOf(arrayOfString1, arrayOfString1.length * 2);
    } 
    arrayOfInt = this.g;
    i = this.i;
    arrayOfInt[i] = paramInt;
    String[] arrayOfString = this.h;
    this.i = i + 1;
    arrayOfString[i] = paramString;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */