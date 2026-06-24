import android.os.Parcel;
import android.os.Parcelable;

public final class s32 extends j {
  public static final Parcelable.Creator<s32> CREATOR = (Parcelable.Creator<s32>)new i(12);
  
  public int e;
  
  public Parcelable f;
  
  public final ClassLoader g;
  
  public s32(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    ClassLoader classLoader = paramClassLoader;
    if (paramClassLoader == null)
      classLoader = s32.class.getClassLoader(); 
    this.e = paramParcel.readInt();
    this.f = paramParcel.readParcelable(classLoader);
    this.g = classLoader;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("FragmentPager.SavedState{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" position=");
    return x41.m(stringBuilder, this.e, "}");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.e);
    paramParcel.writeParcelable(this.f, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */