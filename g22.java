public final class g22 {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public final boolean a() {
    int i = this.a;
    byte b = 2;
    if ((i & 0x7) != 0) {
      int j = this.d;
      int k = this.b;
      if (j > k) {
        j = 1;
      } else if (j == k) {
        j = 2;
      } else {
        j = 4;
      } 
      if ((j & i) == 0)
        return false; 
    } 
    if ((i & 0x70) != 0) {
      int j = this.d;
      int k = this.c;
      if (j > k) {
        j = 1;
      } else if (j == k) {
        j = 2;
      } else {
        j = 4;
      } 
      if ((j << 4 & i) == 0)
        return false; 
    } 
    if ((i & 0x700) != 0) {
      int j = this.e;
      int k = this.b;
      if (j > k) {
        j = 1;
      } else if (j == k) {
        j = 2;
      } else {
        j = 4;
      } 
      if ((j << 8 & i) == 0)
        return false; 
    } 
    if ((i & 0x7000) != 0) {
      int k = this.e;
      int j = this.c;
      if (k > j) {
        j = 1;
      } else if (k == j) {
        j = b;
      } else {
        j = 4;
      } 
      if ((j << 12 & i) == 0)
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */