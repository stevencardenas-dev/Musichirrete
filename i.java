import android.os.Parcel;
import android.os.Parcelable;

public final class i implements Parcelable.ClassLoaderCreator {
  public final int a;
  
  public final Object createFromParcel(Parcel paramParcel) {
    int j = this.a;
    Parcel parcel = null;
    switch (j) {
      default:
        return new s32(paramParcel, null);
      case 11:
        return new iv1(paramParcel, null);
      case 10:
        return new du1(paramParcel, null);
      case 9:
        return new um1(paramParcel, null);
      case 8:
        return new vj1(paramParcel, null);
      case 7:
        return new be1(paramParcel, null);
      case 6:
        return new ds0(paramParcel, null);
      case 5:
        return new ta0(paramParcel, null);
      case 4:
        return new b70(paramParcel, null);
      case 3:
        return new ks(paramParcel, null);
      case 2:
        return new ok(paramParcel, null);
      case 1:
        return new zg(paramParcel, null);
      case 0:
        break;
    } 
    if (paramParcel.readParcelable(null) == null) {
      h h = j.c;
    } else {
      tp.f("superState must be null");
      paramParcel = parcel;
    } 
    return paramParcel;
  }
  
  public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader) {
    switch (this.a) {
      default:
        return new s32(paramParcel, paramClassLoader);
      case 11:
        return new iv1(paramParcel, paramClassLoader);
      case 10:
        return new du1(paramParcel, paramClassLoader);
      case 9:
        return new um1(paramParcel, paramClassLoader);
      case 8:
        return new vj1(paramParcel, paramClassLoader);
      case 7:
        return new be1(paramParcel, paramClassLoader);
      case 6:
        return new ds0(paramParcel, paramClassLoader);
      case 5:
        return new ta0(paramParcel, paramClassLoader);
      case 4:
        return new b70(paramParcel, paramClassLoader);
      case 3:
        return new ks(paramParcel, paramClassLoader);
      case 2:
        return new ok(paramParcel, paramClassLoader);
      case 1:
        return new zg(paramParcel, paramClassLoader);
      case 0:
        break;
    } 
    if (paramParcel.readParcelable(paramClassLoader) == null) {
      h h = j.c;
    } else {
      tp.f("superState must be null");
      paramParcel = null;
    } 
    return paramParcel;
  }
  
  public final Object[] newArray(int paramInt) {
    switch (this.a) {
      default:
        return (Object[])new s32[paramInt];
      case 11:
        return (Object[])new iv1[paramInt];
      case 10:
        return (Object[])new du1[paramInt];
      case 9:
        return (Object[])new um1[paramInt];
      case 8:
        return (Object[])new vj1[paramInt];
      case 7:
        return (Object[])new be1[paramInt];
      case 6:
        return (Object[])new ds0[paramInt];
      case 5:
        return (Object[])new ta0[paramInt];
      case 4:
        return (Object[])new b70[paramInt];
      case 3:
        return (Object[])new ks[paramInt];
      case 2:
        return (Object[])new ok[paramInt];
      case 1:
        return (Object[])new zg[paramInt];
      case 0:
        break;
    } 
    return (Object[])new j[paramInt];
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */