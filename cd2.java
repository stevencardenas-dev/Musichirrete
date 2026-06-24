import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

public final class cd2 extends f0 {
  public static final Parcelable.Creator<cd2> CREATOR = new yb2(3);
  
  public double b;
  
  public boolean c;
  
  public int e;
  
  public q8 f;
  
  public int g;
  
  public oe2 h;
  
  public double i;
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof cd2))
      return false; 
    paramObject = paramObject;
    if (this.b == ((cd2)paramObject).b && this.c == ((cd2)paramObject).c && this.e == ((cd2)paramObject).e && qj.c(this.f, ((cd2)paramObject).f) && this.g == ((cd2)paramObject).g) {
      oe2 oe21 = this.h;
      if (qj.c(oe21, oe21) && this.i == ((cd2)paramObject).i)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Double.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Double.valueOf(this.i) });
  }
  
  public final String toString() {
    return String.format(Locale.ROOT, "volume=%f", new Object[] { Double.valueOf(this.b) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    double d = this.b;
    qv.C0(paramParcel, 2, 8);
    paramParcel.writeDouble(d);
    boolean bool = this.c;
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(bool);
    int j = this.e;
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(j);
    qv.u0(paramParcel, 5, this.f, paramInt);
    j = this.g;
    qv.C0(paramParcel, 6, 4);
    paramParcel.writeInt(j);
    qv.u0(paramParcel, 7, this.h, paramInt);
    d = this.i;
    qv.C0(paramParcel, 8, 8);
    paramParcel.writeDouble(d);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */