import java.util.ArrayList;

public final class zp2 extends pv2 {
  public static final zp2 zzh;
  
  public int zzb;
  
  public fq2 zzd;
  
  public es2 zze;
  
  public uv2 zzf = hw2.g;
  
  public sv2 zzg = qv2.g;
  
  static {
    zp2 zp21 = new zp2();
    zzh = zp21;
    pv2.g(zp2.class, zp21);
  }
  
  public static yp2 l() {
    return (yp2)zzh.d();
  }
  
  public final Object i(int paramInt, pv2 parampv2) {
    if (--paramInt != 0) {
      if (paramInt != 2) {
        if (paramInt != 3) {
          if (paramInt != 4) {
            if (paramInt == 5)
              return zzh; 
            throw null;
          } 
          return new ov2(zzh);
        } 
        return new zp2();
      } 
      hp2 hp2 = hp2.o;
      return new iw2(zzh, "\001\004\000\001\001\004\004\000\002\000\001ဉ\000\002ဉ\001\003\033\004ࠞ", new Object[] { "zzb", "zzd", "zze", "zzf", bs2.class, "zzg", hp2 });
    } 
    return Byte.valueOf((byte)1);
  }
  
  public final void n(ArrayList<sv2> paramArrayList) {
    sv2 sv21 = this.zzg;
    if (!((dv2)sv21).b) {
      sv21 = sv21;
      int j = ((qv2)sv21).e;
      this.zzg = sv21.d(j + j);
    } 
    int i = paramArrayList.size();
    byte b = 0;
    while (b < i) {
      sv21 = paramArrayList.get(b);
      b++;
      wp2 wp2 = (wp2)sv21;
      sv21 = this.zzg;
      int j = wp2.b;
      ((qv2)sv21).f(j);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */