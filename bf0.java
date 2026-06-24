import java.util.ArrayList;

public final class bf0 extends er {
  public float q0 = -1.0F;
  
  public int r0 = -1;
  
  public int s0 = -1;
  
  public bq t0 = this.J;
  
  public int u0;
  
  public boolean v0;
  
  public bf0() {
    byte b = 0;
    this.u0 = 0;
    this.R.clear();
    this.R.add(this.t0);
    int i = this.Q.length;
    while (b < i) {
      this.Q[b] = this.t0;
      b++;
    } 
  }
  
  public final void M(ln0 paramln0, boolean paramBoolean) {
    if (this.T == null)
      return; 
    bq bq1 = this.t0;
    paramln0.getClass();
    int i = ln0.n(bq1);
    if (this.u0 == 1) {
      this.Y = i;
      this.Z = 0;
      H(this.T.i());
      K(0);
      return;
    } 
    this.Y = 0;
    this.Z = i;
    K(this.T.o());
    H(0);
  }
  
  public final void N(int paramInt) {
    this.t0.i(paramInt);
    this.v0 = true;
  }
  
  public final void O(int paramInt) {
    if (this.u0 != paramInt) {
      this.u0 = paramInt;
      ArrayList<bq> arrayList = this.R;
      arrayList.clear();
      if (this.u0 == 1) {
        this.t0 = this.I;
      } else {
        this.t0 = this.J;
      } 
      arrayList.add(this.t0);
      bq[] arrayOfBq = this.Q;
      int i = arrayOfBq.length;
      for (paramInt = 0; paramInt < i; paramInt++)
        arrayOfBq[paramInt] = this.t0; 
    } 
  }
  
  public final void b(ln0 paramln0, boolean paramBoolean) {
    fr fr = (fr)this.T;
    if (fr != null) {
      boolean bool1;
      pn1 pn1;
      bq bq1 = fr.g(2);
      bq bq2 = fr.g(4);
      er er1 = this.T;
      boolean bool2 = true;
      if (er1 != null && er1.p0[0] == 2) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (this.u0 == 0) {
        bq1 = fr.g(3);
        bq2 = fr.g(5);
        er er2 = this.T;
        if (er2 != null && er2.p0[1] == 2) {
          bool1 = bool2;
        } else {
          bool1 = false;
        } 
      } 
      if (this.v0) {
        bq bq3 = this.t0;
        if (bq3.c) {
          pn1 pn11 = paramln0.k(bq3);
          paramln0.d(pn11, this.t0.c());
          if (this.r0 != -1) {
            if (bool1)
              paramln0.f(paramln0.k(bq2), pn11, 0, 5); 
          } else if (this.s0 != -1 && bool1) {
            pn1 = paramln0.k(bq2);
            paramln0.f(pn11, paramln0.k(bq1), 0, 5);
            paramln0.f(pn1, pn11, 0, 5);
          } 
          this.v0 = false;
          return;
        } 
      } 
      if (this.r0 != -1) {
        pn1 pn11 = paramln0.k(this.t0);
        paramln0.e(pn11, paramln0.k(bq1), this.r0, 8);
        if (bool1) {
          paramln0.f(paramln0.k(pn1), pn11, 0, 5);
          return;
        } 
      } else if (this.s0 != -1) {
        pn1 pn11 = paramln0.k(this.t0);
        pn1 = paramln0.k(pn1);
        paramln0.e(pn11, pn1, -this.s0, 8);
        if (bool1) {
          paramln0.f(pn11, paramln0.k(bq1), 0, 5);
          paramln0.f(pn1, pn11, 0, 5);
          return;
        } 
      } else if (this.q0 != -1.0F) {
        pn1 pn11 = paramln0.k(this.t0);
        pn1 = paramln0.k(pn1);
        float f = this.q0;
        c9 c9 = paramln0.l();
        c9.d.g(pn11, -1.0F);
        c9.d.g(pn1, f);
        paramln0.c(c9);
      } 
    } 
  }
  
  public final boolean c() {
    return true;
  }
  
  public final bq g(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: invokestatic y : (I)I
    //   4: istore_1
    //   5: iload_1
    //   6: iconst_1
    //   7: if_icmpeq -> 40
    //   10: iload_1
    //   11: iconst_2
    //   12: if_icmpeq -> 28
    //   15: iload_1
    //   16: iconst_3
    //   17: if_icmpeq -> 40
    //   20: iload_1
    //   21: iconst_4
    //   22: if_icmpeq -> 28
    //   25: goto -> 53
    //   28: aload_0
    //   29: getfield u0 : I
    //   32: ifne -> 53
    //   35: aload_0
    //   36: getfield t0 : Lbq;
    //   39: areturn
    //   40: aload_0
    //   41: getfield u0 : I
    //   44: iconst_1
    //   45: if_icmpne -> 53
    //   48: aload_0
    //   49: getfield t0 : Lbq;
    //   52: areturn
    //   53: aconst_null
    //   54: areturn
  }
  
  public final boolean y() {
    return this.v0;
  }
  
  public final boolean z() {
    return this.v0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bf0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */