public class z81 implements y81 {
  public final int a;
  
  public final Object[] b;
  
  public int c;
  
  public z81() {
    this.b = new Object[256];
  }
  
  public z81(int paramInt) {
    if (paramInt > 0) {
      this.b = new Object[paramInt];
      return;
    } 
    l0.l("The max pool size must be > 0");
    throw null;
  }
  
  public z81(int paramInt, Object[] paramArrayOfObject) {
    this.c = paramInt;
    this.b = paramArrayOfObject;
  }
  
  public boolean a(Object paramObject) {
    paramObject.getClass();
    int j = this.c;
    int i = 0;
    while (true) {
      Object[] arrayOfObject = this.b;
      if (i < j) {
        if (arrayOfObject[i] != paramObject) {
          i++;
          continue;
        } 
        tp.f("Already in the pool!");
        return false;
      } 
      i = this.c;
      if (i < arrayOfObject.length) {
        arrayOfObject[i] = paramObject;
        this.c = i + 1;
        return true;
      } 
      return false;
    } 
  }
  
  public Object b() {
    int i = this.c;
    if (i > 0) {
      i--;
      Object[] arrayOfObject = this.b;
      Object object = arrayOfObject[i];
      object.getClass();
      arrayOfObject[i] = null;
      this.c--;
      return object;
    } 
    return null;
  }
  
  public void c(c9 paramc9) {
    int i = this.c;
    Object[] arrayOfObject = this.b;
    if (i < arrayOfObject.length) {
      arrayOfObject[i] = paramc9;
      this.c = i + 1;
    } 
  }
  
  public String toString() {
    switch (this.a) {
      default:
        return super.toString();
      case 2:
        break;
    } 
    if (this.c != 0)
      return String.format("", this.b); 
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */