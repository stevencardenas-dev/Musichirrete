package j$.time.chrono;

import j$.time.temporal.a;
import j$.time.temporal.q;
import j$.time.temporal.u;

public enum s implements n {
  AH;
  
  public static final s[] a;
  
  static {
    Enum<Enum> enum_ = new Enum<Enum>("AH", 0);
    AH = (s)enum_;
    a = new s[] { (s)enum_ };
  }
  
  public final int getValue() {
    return 1;
  }
  
  public final u j(q paramq) {
    return (paramq == a.ERA) ? u.e(1L, 1L) : super.j(paramq);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */