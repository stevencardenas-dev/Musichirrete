public abstract class zc implements Comparable {
  public final iu a(int paramInt) {
    hu hu;
    dd1 dd1 = ((uo0)this).c;
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt == 3) {
            hu = dd1.T();
          } else {
            m60.m(ga1.i("Invalid index: ", paramInt));
            return null;
          } 
        } else {
          hu = hu.m();
        } 
      } else {
        hu = hu.Z();
      } 
    } else {
      hu = hu.B0();
    } 
    return hu.q();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof zc))
      return false; 
    zc zc1 = (zc)paramObject;
    byte b = 0;
    while (b < 4) {
      if (((uo0)this).d(b) == ((uo0)zc1).d(b)) {
        if (a(b) != zc1.a(b))
          continue; 
        b++;
        continue;
      } 
      continue;
    } 
    paramObject = this;
    dd1 dd1 = ((uo0)zc1).c;
    paramObject = ((uo0)paramObject).c;
    return (paramObject == dd1) ? true : ((paramObject == null || dd1 == null) ? false : paramObject.equals(dd1));
  }
  
  public final int hashCode() {
    int i = 157;
    for (byte b = 0; b < 4; b++) {
      int j = ((uo0)this).d(b);
      i = (1 << (a(b)).c) + (j + i * 23) * 23;
    } 
    return ((uo0)this).c.hashCode() + i;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */