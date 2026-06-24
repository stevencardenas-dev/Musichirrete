import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class eo extends f0 {
  public static final Parcelable.Creator<eo> CREATOR = new yb2(21);
  
  public final int b;
  
  public final int c;
  
  public final int e;
  
  public final boolean f;
  
  public eo(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramInt3;
    this.f = paramBoolean;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof eo))
      return false; 
    paramObject = paramObject;
    return (this.b == ((eo)paramObject).b && this.c == ((eo)paramObject).c && this.e == ((eo)paramObject).e && this.f == ((eo)paramObject).f);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.e), Boolean.valueOf(this.f) });
  }
  
  public final String toString() {
    int n = this.b;
    int j = String.valueOf(n).length();
    int k = this.c;
    int i = String.valueOf(k).length();
    int m = this.e;
    int i1 = String.valueOf(m).length();
    boolean bool = this.f;
    StringBuilder stringBuilder = new StringBuilder(j + 55 + i + 19 + i1 + 13 + String.valueOf(bool).length() + 1);
    stringBuilder.append("ComplianceOptions{callerProductId=");
    stringBuilder.append(n);
    stringBuilder.append(", dataOwnerProductId=");
    stringBuilder.append(k);
    stringBuilder.append(", processingReason=");
    stringBuilder.append(m);
    stringBuilder.append(", isUserData=");
    stringBuilder.append(bool);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.c);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.e);
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(this.f);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */