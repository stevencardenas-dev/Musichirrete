import java.util.Iterator;

public final class zx implements nk1 {
  public final int a;
  
  public final Object b;
  
  public final hd0 c;
  
  public zx(i2 parami2, l paraml) {
    this.b = parami2;
    this.c = paraml;
  }
  
  public zx(CharSequence paramCharSequence, ei1 paramei1) {
    this.b = paramCharSequence;
    this.c = paramei1;
  }
  
  public final Iterator iterator() {
    switch (this.a) {
      default:
        return new td0(this);
      case 0:
        break;
    } 
    return new yx(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */