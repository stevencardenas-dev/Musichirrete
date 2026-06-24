import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public final class oj2 extends wk2 {
  public static final oj2 zzb;
  
  public bl2 zzd = cm2.g;
  
  static {
    oj2 oj21 = new oj2();
    zzb = oj21;
    wk2.f(oj2.class, oj21);
  }
  
  public static nj2 p() {
    return (nj2)zzb.k();
  }
  
  public static void q(oj2 paramoj2, ArrayList<Charset> paramArrayList) {
    bl2 bl22 = paramoj2.zzd;
    if (!((zj2)bl22).b) {
      int m = bl22.size();
      paramoj2.zzd = bl22.a(m + m);
    } 
    bl2 bl21 = paramoj2.zzd;
    Charset charset = il2.a;
    int i = paramArrayList.size();
    if (bl21 instanceof ArrayList) {
      ((ArrayList)bl21).ensureCapacity(bl21.size() + i);
    } else if (bl21 instanceof cm2) {
      cm2 cm2 = (cm2)bl21;
      int m = cm2.e + i;
      i = cm2.c.length;
      if (m > i)
        if (i != 0) {
          while (i < m)
            i = ga1.h(i, 3, 2, 1, 10); 
          cm2.c = Arrays.copyOf(cm2.c, i);
        } else {
          cm2.c = new Object[Math.max(m, 10)];
        }  
    } 
    int j = bl21.size();
    int k = paramArrayList.size();
    for (i = 0; i < k; i++) {
      charset = paramArrayList.get(i);
      if (charset == null) {
        String str = x41.i(bl21.size() - j, "Element at index ", " is null.");
        i = bl21.size();
        while (--i >= j)
          bl21.remove(i); 
        k91.h(str);
        return;
      } 
      bl21.add(charset);
    } 
  }
  
  public final Object j(int paramInt) {
    if (--paramInt != 0) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 4) {
            if (paramInt == 5)
              return zzb; 
            throw null;
          } 
          return new uk2(zzb);
        } 
        return new oj2();
      } 
      return new dm2(zzb, "\004\001\000\000\001\001\001\000\001\000\001\033", new Object[] { "zzd", mj2.class });
    } 
    return Byte.valueOf((byte)1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */