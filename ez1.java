import java.util.BitSet;

public class ez1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    String str;
    StringBuilder stringBuilder;
    BitSet bitSet = new BitSet();
    paramtk0.a();
    int i = paramtk0.C();
    byte b = 0;
    while (i != 2) {
      boolean bool;
      int j = x41.y(i);
      if (j != 5 && j != 6) {
        if (j == 7) {
          bool = paramtk0.r();
        } else {
          String str1 = x41.z(i);
          str = paramtk0.m(false);
          StringBuilder stringBuilder1 = new StringBuilder("Invalid bitset value type: ");
          stringBuilder1.append(str1);
          stringBuilder1.append("; at path ");
          stringBuilder1.append(str);
          throw new RuntimeException(stringBuilder1.toString());
        } 
      } else {
        i = str.u();
        if (i == 0) {
          bool = false;
        } else if (i == 1) {
          bool = true;
        } else {
          stringBuilder = ga1.k(i, "Invalid bitset value ", ", expected 0 or 1; at path ");
          stringBuilder.append(str.m(true));
          throw new RuntimeException(stringBuilder.toString());
        } 
      } 
      if (bool)
        stringBuilder.set(b); 
      b++;
      i = str.C();
    } 
    str.h();
    return stringBuilder;
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramObject = paramObject;
    paramcl0.c();
    int i = paramObject.length();
    for (byte b = 0; b < i; b++)
      paramcl0.u(paramObject.get(b)); 
    paramcl0.h();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ez1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */