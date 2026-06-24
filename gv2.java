import java.nio.charset.Charset;

public final class gv2 extends hv2 {
  public final byte[] e;
  
  public final int f;
  
  public final int g;
  
  public gv2(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    hv2.j(paramInt1, paramInt1 + paramInt2, paramArrayOfbyte.length);
    this.e = paramArrayOfbyte;
    this.f = paramInt1;
    this.g = paramInt2;
  }
  
  public final byte c(int paramInt) {
    int i = this.g;
    if ((i - paramInt + 1 | paramInt) < 0) {
      ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
      if (paramInt < 0) {
        StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(paramInt).length() + 11);
        stringBuilder1.append("Index < 0: ");
        stringBuilder1.append(paramInt);
        this(stringBuilder1.toString());
        throw arrayIndexOutOfBoundsException;
      } 
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramInt).length() + 18 + String.valueOf(i).length());
      stringBuilder.append("Index > length: ");
      stringBuilder.append(paramInt);
      stringBuilder.append(", ");
      stringBuilder.append(i);
      this(stringBuilder.toString());
      throw arrayIndexOutOfBoundsException;
    } 
    i = this.f;
    return this.e[i + paramInt];
  }
  
  public final byte d(int paramInt) {
    return this.e[this.f + paramInt];
  }
  
  public final int e() {
    return this.g;
  }
  
  public final hv2 f(int paramInt1, int paramInt2) {
    paramInt2 = hv2.j(paramInt1, paramInt2, this.g);
    if (paramInt2 == 0)
      return hv2.c; 
    int i = this.f;
    return new gv2(this.e, i + paramInt1, paramInt2);
  }
  
  public final void g(jv2 paramjv2) {
    int i = this.f;
    int j = this.g;
    paramjv2.o(this.e, i, j);
  }
  
  public final boolean h(hv2 paramhv2) {
    StringBuilder stringBuilder;
    boolean bool = paramhv2 instanceof iv2;
    if (bool || paramhv2 instanceof gv2) {
      int j = paramhv2.e();
      int i = this.g;
      if (i <= j) {
        if (i <= paramhv2.e()) {
          byte[] arrayOfByte = this.e;
          j = this.f;
          if (bool)
            return hv2.k(arrayOfByte, j, ((iv2)paramhv2).e, 0, i); 
          if (paramhv2 instanceof gv2) {
            paramhv2 = paramhv2;
            return hv2.k(arrayOfByte, j, ((gv2)paramhv2).e, ((gv2)paramhv2).f, i);
          } 
          return paramhv2.f(0, i).equals(f(j, i + j));
        } 
        j = paramhv2.e();
        StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(j).length());
        stringBuilder1.append("Ran off end of other: 0, ");
        stringBuilder1.append(i);
        stringBuilder1.append(", ");
        stringBuilder1.append(j);
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      stringBuilder = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
      stringBuilder.append("Length too large: ");
      stringBuilder.append(i);
      stringBuilder.append(i);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return stringBuilder.h(this);
  }
  
  public final int i(int paramInt1, int paramInt2) {
    Charset charset = vv2.a;
    int j = this.f;
    for (int i = j; i < j + paramInt2; i++)
      paramInt1 = paramInt1 * 31 + this.e[i]; 
    return paramInt1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */