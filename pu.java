public final class pu implements ri0 {
  public final ri0[] b;
  
  public final int c;
  
  public pu(ri0[] paramArrayOfri0) {
    this.b = paramArrayOfri0;
    int j = paramArrayOfri0.length;
    int i = 0;
    while (true) {
      int k = j - 1;
      if (k >= 0) {
        ri0 ri01 = paramArrayOfri0[k];
        j = k;
        if (ri01 != null) {
          int m = ri01.d();
          j = k;
          if (m > i) {
            i = m;
            j = k;
          } 
        } 
        continue;
      } 
      this.c = i;
      return;
    } 
  }
  
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    int k;
    ri0[] arrayOfRi0 = this.b;
    int m = arrayOfRi0.length;
    if (paramcv.i == null)
      paramcv.i = new bv(paramcv); 
    bv bv = paramcv.i;
    byte b2 = 0;
    ri0 ri01 = null;
    int i = paramInt;
    int j = i;
    byte b1 = 0;
    while (true) {
      k = b2;
      if (b1 < m) {
        int n;
        ri0 ri02 = arrayOfRi0[b1];
        if (ri02 == null) {
          if (i <= paramInt)
            return paramInt; 
          k = 1;
          break;
        } 
        int i1 = ri02.a(paramcv, paramCharSequence, paramInt);
        if (i1 >= paramInt) {
          ri02 = ri01;
          n = i;
          k = j;
          if (i1 > i)
            if (i1 < paramCharSequence.length()) {
              i = b1 + 1;
              if (i >= m || arrayOfRi0[i] == null)
                return i1; 
              if (paramcv.i == null)
                paramcv.i = new bv(paramcv); 
              bv bv1 = paramcv.i;
              n = i1;
              k = j;
            } else {
              return i1;
            }  
        } else {
          ri02 = ri01;
          n = i;
          k = j;
          if (i1 < 0) {
            i1 ^= 0xFFFFFFFF;
            ri02 = ri01;
            n = i;
            k = j;
            if (i1 > j) {
              k = i1;
              n = i;
              ri02 = ri01;
            } 
          } 
        } 
        paramcv.d(bv);
        b1++;
        ri01 = ri02;
        i = n;
        j = k;
        continue;
      } 
      break;
    } 
    if (i > paramInt || (i == paramInt && k != 0)) {
      if (ri01 != null)
        paramcv.d(ri01); 
      return i;
    } 
    return j ^ 0xFFFFFFFF;
  }
  
  public final int d() {
    return this.c;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */