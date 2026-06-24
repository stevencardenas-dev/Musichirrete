import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;
import java.io.Serializable;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;

public final class uo0 extends zc implements Serializable {
  public final long b;
  
  public final dd1 c;
  
  public uo0(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    AtomicReference atomicReference = ev.a;
    xg0 xg01 = xg02;
    if (xg02 == null)
      xg01 = xg0.T0(); 
    dd1 dd11 = xg01.y0();
    long l = dd11.z(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
    this.c = dd11;
    this.b = l;
  }
  
  public static uo0 b(Calendar paramCalendar) {
    if (paramCalendar != null) {
      int j = paramCalendar.get(0);
      int i = paramCalendar.get(1);
      if (j != 1)
        i = 1 - i; 
      return new uo0(i, paramCalendar.get(2) + 1, paramCalendar.get(5), paramCalendar.get(11), paramCalendar.get(12), paramCalendar.get(13), paramCalendar.get(14));
    } 
    l0.l("The calendar must not be null");
    return null;
  }
  
  public final int c(iu paramiu) {
    if (paramiu != null)
      return paramiu.a(this.c).b(this.b); 
    l0.l(LHyji.uwQy);
    return 0;
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    if (this != paramObject) {
      if (paramObject instanceof uo0) {
        uo0 uo01 = (uo0)paramObject;
        if (this.c.equals(uo01.c)) {
          int i = this.b cmp uo01.b;
          return (i < 0) ? -1 : ((i == 0) ? 0 : 1);
        } 
      } 
      if (this != paramObject) {
        paramObject.getClass();
        byte b = 0;
        while (b < 4) {
          if (a(b) == paramObject.a(b)) {
            b++;
            continue;
          } 
          throw new ClassCastException("ReadablePartial objects must have matching field types");
        } 
        b = 0;
        while (b < 4) {
          int i = d(b);
          uo0 uo01 = (uo0)paramObject;
          if (i <= uo01.d(b)) {
            if (d(b) < uo01.d(b))
              return -1; 
            b++;
            continue;
          } 
          return 1;
        } 
      } 
    } 
    return 0;
  }
  
  public final int d(int paramInt) {
    long l = this.b;
    dd1 dd11 = this.c;
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt == 3)
            return dd11.T().b(l); 
          m60.m(ga1.i("Invalid index: ", paramInt));
          return 0;
        } 
        return dd11.m().b(l);
      } 
      return dd11.Z().b(l);
    } 
    return dd11.B0().b(l);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof uo0) {
      uo0 uo01 = (uo0)paramObject;
      if (this.c.equals(uo01.c))
        return (this.b == uo01.b); 
    } 
    return super.equals(paramObject);
  }
  
  public final String toString() {
    return yg0.E.b(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */