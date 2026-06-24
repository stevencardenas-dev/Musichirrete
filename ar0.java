public final class ar0 implements w51 {
  public final int a;
  
  public final boolean a(float[] paramArrayOffloat) {
    float f;
    int i = this.a;
    boolean bool2 = true;
    boolean bool1 = true;
    switch (i) {
      default:
        f = paramArrayOffloat[2];
        if (f >= 0.95F || f <= 0.05F)
          return false; 
        f = paramArrayOffloat[0];
        null = bool1;
        if (f >= 10.0F) {
          null = bool1;
          if (f <= 37.0F) {
            null = bool1;
            if (paramArrayOffloat[1] <= 0.82F)
              return false; 
          } 
        } 
        return null;
      case 0:
        break;
    } 
    if (!br0.b(paramArrayOffloat)) {
      f = paramArrayOffloat[2];
      if (f > 0.1F) {
        null = bool2;
        if (paramArrayOffloat[1] <= 0.11D) {
          null = bool2;
          if (f >= 0.15F) {
            null = bool2;
            if (f <= 0.45F)
              return false; 
          } 
        } 
        return null;
      } 
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ar0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */