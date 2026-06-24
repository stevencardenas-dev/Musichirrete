import java.util.Arrays;

public final class hk2 extends gk2 {
  public final byte[] e;
  
  public hk2(byte[] paramArrayOfbyte) {
    paramArrayOfbyte.getClass();
    this.e = paramArrayOfbyte;
  }
  
  public final byte c(int paramInt) {
    return this.e[paramInt];
  }
  
  public final byte d(int paramInt) {
    return this.e[paramInt];
  }
  
  public final int e(int paramInt1, int paramInt2) {
    return il2.a(paramInt1, this.e, 0, paramInt2);
  }
  
  public final int f() {
    return this.e.length;
  }
  
  public final gk2 g(int paramInt1, int paramInt2) {
    byte[] arrayOfByte = this.e;
    paramInt1 = gk2.j(0, paramInt2, arrayOfByte.length);
    return (gk2)((paramInt1 == 0) ? gk2.c : new fk2(arrayOfByte, 0, paramInt1));
  }
  
  public final void h(ik2 paramik2) {
    byte[] arrayOfByte = this.e;
    paramik2.b(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public final boolean i(gk2 paramgk2) {
    StringBuilder stringBuilder;
    boolean bool1 = paramgk2 instanceof hk2;
    byte[] arrayOfByte = this.e;
    if (bool1)
      return Arrays.equals(arrayOfByte, ((hk2)paramgk2).e); 
    boolean bool2 = paramgk2 instanceof fk2;
    if (bool2) {
      fk2 fk2 = (fk2)paramgk2;
      int j = fk2.g;
      int i = arrayOfByte.length;
      if (i <= j) {
        if (i <= j)
          return bool1 ? gk2.l(arrayOfByte, 0, ((hk2)paramgk2).e, 0, i) : (bool2 ? gk2.l(arrayOfByte, 0, fk2.e, fk2.f, i) : paramgk2.g(0, i).equals(g(0, i))); 
        l0.l(ga1.j("Ran off end of other: 0, ", i, j, ", "));
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */