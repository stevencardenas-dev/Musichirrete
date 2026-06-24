import java.util.ArrayList;

public final class sh1 {
  public m52 a;
  
  public ArrayList b;
  
  public static long a(iy paramiy, long paramLong) {
    m52 m521 = paramiy.d;
    ArrayList<cy> arrayList = paramiy.k;
    if (m521 instanceof bg0)
      return paramLong; 
    int i = arrayList.size();
    byte b = 0;
    long l;
    for (l = paramLong; b < i; l = l1) {
      cy cy = arrayList.get(b);
      long l1 = l;
      if (cy instanceof iy) {
        cy = cy;
        if (((iy)cy).d == m521) {
          l1 = l;
        } else {
          l1 = Math.min(l, a((iy)cy, ((iy)cy).f + paramLong));
        } 
      } 
      b++;
    } 
    iy iy1 = m521.i;
    iy iy2 = m521.h;
    if (paramiy == iy1) {
      paramLong -= m521.j();
      return Math.min(Math.min(l, a(iy2, paramLong)), paramLong - iy2.f);
    } 
    return l;
  }
  
  public static long b(iy paramiy, long paramLong) {
    m52 m521 = paramiy.d;
    ArrayList<cy> arrayList = paramiy.k;
    if (m521 instanceof bg0)
      return paramLong; 
    int i = arrayList.size();
    byte b = 0;
    long l;
    for (l = paramLong; b < i; l = l1) {
      cy cy = arrayList.get(b);
      long l1 = l;
      if (cy instanceof iy) {
        cy = cy;
        if (((iy)cy).d == m521) {
          l1 = l;
        } else {
          l1 = Math.max(l, b((iy)cy, ((iy)cy).f + paramLong));
        } 
      } 
      b++;
    } 
    iy iy2 = m521.h;
    iy iy1 = m521.i;
    if (paramiy == iy2) {
      paramLong = m521.j() + paramLong;
      return Math.max(Math.max(l, b(iy1, paramLong)), paramLong - iy1.f);
    } 
    return l;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */