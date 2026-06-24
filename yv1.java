import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class yv1 implements Parcelable {
  public static final Parcelable.Creator<yv1> CREATOR = new lx0(18);
  
  public final String b;
  
  public final String c;
  
  public final int e;
  
  public final boolean f;
  
  public final int g;
  
  public yv1(Parcel paramParcel) {
    boolean bool;
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.e = paramParcel.readInt();
    int i = d12.a;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.f = bool;
    this.g = paramParcel.readInt();
  }
  
  public yv1(String paramString, int paramInt) {
    this.b = null;
    this.c = d12.g(paramString);
    this.e = paramInt;
    this.f = false;
    this.g = 0;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && getClass() == paramObject.getClass()) {
      paramObject = paramObject;
      if (TextUtils.equals(this.b, ((yv1)paramObject).b) && TextUtils.equals(this.c, ((yv1)paramObject).c) && this.e == ((yv1)paramObject).e && this.f == ((yv1)paramObject).f && this.g == ((yv1)paramObject).g)
        return true; 
    } 
    return false;
  }
  
  public int hashCode() {
    int i;
    int j = 0;
    String str = this.b;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    } 
    str = this.c;
    if (str != null)
      j = str.hashCode(); 
    return ((((i + 31) * 31 + j) * 31 + this.e) * 31 + this.f) * 31 + this.g;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.e);
    paramInt = d12.a;
    paramParcel.writeInt(this.f);
    paramParcel.writeInt(this.g);
  }
  
  static {
    new yv1(null, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */