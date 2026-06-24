import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

public final class y51 {
  public static final ar0 e = new ar0(1);
  
  public final List a;
  
  public final b9 b;
  
  public final SparseBooleanArray c;
  
  public final x51 d;
  
  public y51(ArrayList paramArrayList, List<x51> paramList) {
    x51 x511;
    this.a = paramList;
    this.c = new SparseBooleanArray();
    byte b = 0;
    this.b = (b9)new zm1(0);
    int j = paramList.size();
    int i = Integer.MIN_VALUE;
    paramArrayList = null;
    while (b < j) {
      x51 x512 = paramList.get(b);
      int m = x512.e;
      int k = i;
      if (m > i) {
        x511 = x512;
        k = m;
      } 
      b++;
      i = k;
    } 
    this.d = x511;
  }
  
  public final x51 a() {
    return g(lt1.i);
  }
  
  public final x51 b() {
    return g(lt1.f);
  }
  
  public final x51 c() {
    return this.d;
  }
  
  public final x51 d() {
    return g(lt1.g);
  }
  
  public final x51 e() {
    return g(lt1.d);
  }
  
  public final x51 f() {
    return g(lt1.h);
  }
  
  public final x51 g(lt1 paramlt1) {
    return (x51)this.b.get(paramlt1);
  }
  
  public final x51 h() {
    return g(lt1.e);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */