import java.nio.charset.Charset;
import java.util.Arrays;

public final class iv2 extends hv2 {
  public final byte[] e;
  
  public iv2(byte[] paramArrayOfbyte) {
    paramArrayOfbyte.getClass();
    this.e = paramArrayOfbyte;
  }
  
  public final byte c(int paramInt) {
    return this.e[paramInt];
  }
  
  public final byte d(int paramInt) {
    return this.e[paramInt];
  }
  
  public final int e() {
    return this.e.length;
  }
  
  public final hv2 f(int paramInt1, int paramInt2) {
    byte[] arrayOfByte = this.e;
    paramInt1 = hv2.j(0, paramInt2, arrayOfByte.length);
    return (hv2)((paramInt1 == 0) ? hv2.c : new gv2(arrayOfByte, 0, paramInt1));
  }
  
  public final void g(jv2 paramjv2) {
    byte[] arrayOfByte = this.e;
    paramjv2.o(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public final boolean h(hv2 paramhv2) {
    StringBuilder stringBuilder;
    boolean bool2 = paramhv2 instanceof iv2;
    byte[] arrayOfByte = this.e;
    if (bool2)
      return Arrays.equals(arrayOfByte, ((iv2)paramhv2).e); 
    boolean bool1 = paramhv2 instanceof gv2;
    if (bool1) {
      gv2 gv2 = (gv2)paramhv2;
      int j = gv2.g;
      int i = arrayOfByte.length;
      if (i <= j) {
        if (i <= j)
          return bool2 ? hv2.k(arrayOfByte, 0, ((iv2)paramhv2).e, 0, i) : (bool1 ? hv2.k(arrayOfByte, 0, gv2.e, gv2.f, i) : paramhv2.f(0, i).equals(f(0, i))); 
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
    boolean bool = false;
    int i = paramInt1;
    for (paramInt1 = bool; paramInt1 < paramInt2; paramInt1++)
      i = i * 31 + this.e[paramInt1]; 
    return i;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */