public final class fk2 extends gk2 {
  public final byte[] e;
  
  public final int f;
  
  public final int g;
  
  public fk2(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    gk2.j(paramInt1, paramInt1 + paramInt2, paramArrayOfbyte.length);
    this.e = paramArrayOfbyte;
    this.f = paramInt1;
    this.g = paramInt2;
  }
  
  public final byte c(int paramInt) {
    int i = this.g;
    if ((i - paramInt + 1 | paramInt) < 0) {
      ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
      if (paramInt < 0) {
        this(ga1.i("Index < 0: ", paramInt));
        throw arrayIndexOutOfBoundsException;
      } 
      this(ga1.j("Index > length: ", paramInt, i, ", "));
      throw arrayIndexOutOfBoundsException;
    } 
    i = this.f;
    return this.e[i + paramInt];
  }
  
  public final byte d(int paramInt) {
    return this.e[this.f + paramInt];
  }
  
  public final int e(int paramInt1, int paramInt2) {
    return il2.a(paramInt1, this.e, this.f, paramInt2);
  }
  
  public final int f() {
    return this.g;
  }
  
  public final gk2 g(int paramInt1, int paramInt2) {
    paramInt2 = gk2.j(paramInt1, paramInt2, this.g);
    if (paramInt2 == 0)
      return gk2.c; 
    int i = this.f;
    return new fk2(this.e, i + paramInt1, paramInt2);
  }
  
  public final void h(ik2 paramik2) {
    int j = this.f;
    int i = this.g;
    paramik2.b(this.e, j, i);
  }
  
  public final boolean i(gk2 paramgk2) {
    StringBuilder stringBuilder;
    boolean bool = paramgk2 instanceof hk2;
    if (bool || paramgk2 instanceof fk2) {
      int j = paramgk2.f();
      int i = this.g;
      if (i <= j) {
        if (i <= paramgk2.f()) {
          byte[] arrayOfByte = this.e;
          j = this.f;
          if (bool)
            return gk2.l(arrayOfByte, j, ((hk2)paramgk2).e, 0, i); 
          if (paramgk2 instanceof fk2) {
            paramgk2 = paramgk2;
            return gk2.l(arrayOfByte, j, ((fk2)paramgk2).e, ((fk2)paramgk2).f, i);
          } 
          return paramgk2.g(0, i).equals(g(j, i + j));
        } 
        l0.l(ga1.j("Ran off end of other: 0, ", i, paramgk2.f(), ", "));
        return false;
      } 
      stringBuilder = new StringBuilder("Length too large: ");
      stringBuilder.append(i);
      stringBuilder.append(i);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return stringBuilder.i(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */