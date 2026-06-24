public abstract class s12 extends r12 {
  public e61[] a = null;
  
  public String b;
  
  public int c;
  
  public s12() {
    this.c = 0;
  }
  
  public s12(s12 params12) {
    byte b = 0;
    this.c = 0;
    this.b = params12.b;
    e61[] arrayOfE611 = params12.a;
    e61[] arrayOfE612 = new e61[arrayOfE611.length];
    while (b < arrayOfE611.length) {
      arrayOfE612[b] = new e61(arrayOfE611[b]);
      b++;
    } 
    this.a = arrayOfE612;
  }
  
  public e61[] getPathData() {
    return this.a;
  }
  
  public String getPathName() {
    return this.b;
  }
  
  public void setPathData(e61[] paramArrayOfe61) {
    e61[] arrayOfE612 = this.a;
    byte b2 = 0;
    if (arrayOfE612 == null || paramArrayOfe61 == null || arrayOfE612.length != paramArrayOfe61.length) {
      e61[] arrayOfE61 = new e61[paramArrayOfe61.length];
      for (byte b = b2; b < paramArrayOfe61.length; b++)
        arrayOfE61[b] = new e61(paramArrayOfe61[b]); 
      this.a = arrayOfE61;
      return;
    } 
    byte b1 = 0;
    while (b1 < arrayOfE612.length) {
      e61 e611 = arrayOfE612[b1];
      char c = e611.a;
      e61 e612 = paramArrayOfe61[b1];
      if (c == e612.a) {
        if (e611.b.length != e612.b.length)
          // Byte code: goto -> 162 
        b1++;
        continue;
      } 
      // Byte code: goto -> 162
    } 
    e61[] arrayOfE611 = this.a;
    b1 = 0;
    while (b1 < paramArrayOfe61.length) {
      (arrayOfE611[b1]).a = (paramArrayOfe61[b1]).a;
      b2 = 0;
      while (true) {
        float[] arrayOfFloat = (paramArrayOfe61[b1]).b;
        if (b2 < arrayOfFloat.length) {
          (arrayOfE611[b1]).b[b2] = arrayOfFloat[b2];
          b2++;
          continue;
        } 
        b1++;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */