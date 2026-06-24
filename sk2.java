import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

public final class sk2 extends f0 {
  public static final Parcelable.Creator<sk2> CREATOR = new pk2(1);
  
  public final ArrayList b;
  
  public final boolean c;
  
  public final boolean e;
  
  public sk2(ArrayList<?> paramArrayList, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramArrayList == null) {
      paramArrayList = new ArrayList(0);
    } else {
      paramArrayList = new ArrayList(paramArrayList);
    } 
    this.b = paramArrayList;
    this.c = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof sk2) {
      paramObject = paramObject;
      if (z51.g(this.b, ((sk2)paramObject).b) && z51.g(Boolean.valueOf(this.c), Boolean.valueOf(((sk2)paramObject).c)))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    boolean bool = this.c;
    return Arrays.hashCode(new Object[] { this.b, Boolean.valueOf(bool) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.y0(paramParcel, 1, new ArrayList(this.b));
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.c);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.e);
    qv.G0(paramParcel, paramInt);
  }
  
  static {
    new sk2(null, false, false);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */