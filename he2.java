import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class he2 extends f0 {
  public static final Parcelable.Creator<he2> CREATOR = new yb2(6);
  
  public final float b;
  
  public final float c;
  
  public final float e;
  
  public he2(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.e = paramFloat3;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof he2))
      return false; 
    paramObject = paramObject;
    return (this.b == ((he2)paramObject).b && this.c == ((he2)paramObject).c && this.e == ((he2)paramObject).e);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.e) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeFloat(this.b);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeFloat(this.c);
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeFloat(this.e);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\he2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */