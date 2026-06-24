import com.sdsmdg.harjot.crollerTest.TG.ckOPp;

public final class te extends nh0 {
  public final int g;
  
  public final ue0 h;
  
  public te(ue0 paramue0, int paramInt) {
    super(iu.j, 31556952000L);
    this.h = paramue0;
  }
  
  public final long A(long paramLong1, long paramLong2) {
    switch (this.g) {
      default:
        return a(wf2.Z(paramLong2), paramLong1);
      case 0:
        break;
    } 
    return a(wf2.Z(paramLong2), paramLong1);
  }
  
  public final long a(int paramInt, long paramLong) {
    switch (this.g) {
      default:
        if (paramInt != 0) {
          int i = this.h.d1(paramLong);
          int j = i + paramInt;
          if ((i ^ j) >= 0 || (i ^ paramInt) < 0)
            return w(j, paramLong); 
          throw new ArithmeticException(ga1.j("The calculation caused an overflow: ", i, paramInt, ckOPp.rcfPvERTBx));
        } 
        return paramLong;
      case 0:
        break;
    } 
    if (paramInt != 0)
      paramLong = w(this.h.c1(paramLong) + paramInt, paramLong); 
    return paramLong;
  }
  
  public final int b(long paramLong) {
    switch (this.g) {
      default:
        return this.h.d1(paramLong);
      case 0:
        break;
    } 
    return this.h.c1(paramLong);
  }
  
  public final g20 j() {
    switch (this.g) {
      default:
        return this.h.w;
      case 0:
        break;
    } 
    return this.h.x;
  }
  
  public final int l() {
    switch (this.g) {
      default:
        this.h.getClass();
        return 292278993;
      case 0:
        break;
    } 
    this.h.getClass();
    return 292278993;
  }
  
  public final int o() {
    switch (this.g) {
      default:
        this.h.getClass();
        return -292275054;
      case 0:
        break;
    } 
    this.h.getClass();
    return -292275054;
  }
  
  public final g20 p() {
    switch (this.g) {
      default:
        return null;
      case 0:
        break;
    } 
    return null;
  }
  
  public final boolean r(long paramLong) {
    boolean bool;
    int i = this.g;
    ue0 ue01 = this.h;
    switch (i) {
      default:
        return ue01.g1(ue01.d1(paramLong));
      case 0:
        break;
    } 
    if (ue01.b1(ue01.c1(paramLong)) > 52) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean s() {
    switch (this.g) {
      default:
        return false;
      case 0:
        break;
    } 
    return false;
  }
  
  public final long u(long paramLong) {
    switch (this.g) {
      default:
        l = v(paramLong);
        return paramLong - l;
      case 0:
        break;
    } 
    long l = v(paramLong);
    return paramLong - l;
  }
  
  public final long v(long paramLong) {
    int i = this.g;
    ue0 ue01 = this.h;
    switch (i) {
      default:
        return ue01.e1(ue01.d1(paramLong));
      case 0:
        break;
    } 
    long l = ue01.R.v(paramLong);
    i = ue01.a1(ue01.d1(l), l);
    paramLong = l;
    if (i > 1)
      paramLong = l - (i - 1) * 604800000L; 
    return paramLong;
  }
  
  public final long w(int paramInt, long paramLong) {
    int i = this.g;
    ue0 ue01 = this.h;
    switch (i) {
      default:
        ue01.getClass();
        wf2.n0(this, paramInt, -292275054, 292278993);
        return ue01.j1(paramInt, paramLong);
      case 0:
        break;
    } 
    i = Math.abs(paramInt);
    ue01.getClass();
    wf2.n0(this, i, -292275054, 292278993);
    i = ue01.c1(paramLong);
    if (i != paramInt) {
      int m = oe.V0(paramLong);
      int j = ue01.b1(i);
      int k = ue01.b1(paramInt);
      i = j;
      if (k < j)
        i = k; 
      j = ue01.a1(ue01.d1(paramLong), paramLong);
      if (j <= i)
        i = j; 
      long l = ue01.j1(paramInt, paramLong);
      j = ue01.c1(l);
      if (j < paramInt) {
        paramLong = l + 604800000L;
      } else {
        paramLong = l;
        if (j > paramInt)
          paramLong = l - 604800000L; 
      } 
      l = (i - ue01.a1(ue01.d1(paramLong), paramLong));
      paramLong = ue01.O.w(m, l * 604800000L + paramLong);
    } 
    return paramLong;
  }
  
  public long y(long paramLong, int paramInt) {
    switch (this.g) {
      default:
        return super.y(paramLong, paramInt);
      case 1:
        break;
    } 
    ue0 ue01 = this.h;
    ue01.getClass();
    wf2.n0(this, paramInt, -292275055, 292278994);
    return ue01.j1(paramInt, paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\te.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */