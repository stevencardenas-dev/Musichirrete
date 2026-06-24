import android.os.Build;

public final class xe extends tc {
  public final int b;
  
  public final int c = 7;
  
  public xe(b21 paramb21, int paramInt) {
    super(paramb21);
  }
  
  public xe(qq paramqq, int paramInt) {
    super(paramqq);
  }
  
  public xe(ye paramye) {
    super(paramye);
  }
  
  public final boolean b(y72 paramy72) {
    int i = this.b;
    boolean bool2 = false;
    boolean bool1 = false;
    paramy72.getClass();
    switch (i) {
      default:
        return paramy72.j.f;
      case 3:
        if (paramy72.j.a == c21.e)
          bool1 = true; 
        return bool1;
      case 2:
        bool1 = bool2;
        if (paramy72.j.a == c21.c)
          bool1 = true; 
        return bool1;
      case 1:
        return paramy72.j.e;
      case 0:
        break;
    } 
    return paramy72.j.c;
  }
  
  public final int d() {
    switch (this.b) {
      default:
        return this.c;
      case 3:
        return this.c;
      case 2:
        return this.c;
      case 1:
        return this.c;
      case 0:
        break;
    } 
    return this.c;
  }
  
  public final boolean e(Object paramObject) {
    int i = this.b;
    boolean bool1 = false;
    null = false;
    switch (i) {
      default:
        null = ((Boolean)paramObject).booleanValue();
        return null ^ true;
      case 3:
        paramObject = paramObject;
        paramObject.getClass();
        if (!((z11)paramObject).a || ((z11)paramObject).c || ((z11)paramObject).e)
          null = true; 
        return null;
      case 2:
        paramObject = paramObject;
        paramObject.getClass();
        if (!((z11)paramObject).e && ((z11)paramObject).a) {
          null = bool1;
          if (Build.VERSION.SDK_INT >= 26) {
            null = bool1;
            if (!((z11)paramObject).b)
              return true; 
          } 
          return null;
        } 
        return true;
      case 1:
        bool = ((Boolean)paramObject).booleanValue();
        return bool ^ true;
      case 0:
        break;
    } 
    boolean bool = ((Boolean)paramObject).booleanValue();
    return bool ^ true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */