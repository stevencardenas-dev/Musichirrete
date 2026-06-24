import java.util.ArrayList;

public final class jb0 implements ib0 {
  public final int a;
  
  public final lb0 b;
  
  public jb0(lb0 paramlb0, int paramInt) {
    this.b = paramlb0;
    this.a = paramInt;
  }
  
  public final boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2) {
    lb0 lb01 = this.b;
    ua0 ua0 = lb01.z;
    int i = this.a;
    return (ua0 != null && i < 0 && ua0.O().U(-1, 0)) ? false : lb01.V(paramArrayList1, paramArrayList2, i, 1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */