import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class sl0 extends f0 {
  public static final Parcelable.Creator<sl0> CREATOR = new yb2(11);
  
  public boolean b;
  
  public final String c;
  
  public final boolean e;
  
  public ht f;
  
  public sl0() {
    this(false, stringBuilder.toString(), false, null);
  }
  
  public sl0(boolean paramBoolean1, String paramString, boolean paramBoolean2, ht paramht) {
    this.b = paramBoolean1;
    this.c = paramString;
    this.e = paramBoolean2;
    this.f = paramht;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof sl0))
      return false; 
    paramObject = paramObject;
    return (this.b == ((sl0)paramObject).b && qj.c(this.c, ((sl0)paramObject).c) && this.e == ((sl0)paramObject).e && qj.c(this.f, ((sl0)paramObject).f));
  }
  
  public final int hashCode() {
    boolean bool1 = this.b;
    boolean bool2 = this.e;
    ht ht1 = this.f;
    return Arrays.hashCode(new Object[] { Boolean.valueOf(bool1), this.c, Boolean.valueOf(bool2), ht1 });
  }
  
  public final String toString() {
    boolean bool = this.b;
    StringBuilder stringBuilder = new StringBuilder("LaunchOptions(relaunchIfRunning=");
    stringBuilder.append(bool);
    stringBuilder.append(", language=");
    stringBuilder.append(this.c);
    stringBuilder.append(", androidReceiverCompatible: ");
    stringBuilder.append(this.e);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    boolean bool = this.b;
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(bool);
    qv.v0(paramParcel, 3, this.c);
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(this.e);
    qv.u0(paramParcel, 5, this.f, paramInt);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sl0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */