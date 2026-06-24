import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class b70 extends j {
  public static final Parcelable.Creator<b70> CREATOR = (Parcelable.Creator<b70>)new i(4);
  
  public final zm1 e;
  
  public b70(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    String[] arrayOfString = new String[i];
    paramParcel.readStringArray(arrayOfString);
    Bundle[] arrayOfBundle = new Bundle[i];
    paramParcel.readTypedArray((Object[])arrayOfBundle, Bundle.CREATOR);
    this.e = new zm1(i);
    for (byte b = 0; b < i; b++)
      this.e.put(arrayOfString[b], arrayOfBundle[b]); 
  }
  
  public b70(Parcelable paramParcelable) {
    super(paramParcelable);
    this.e = new zm1(0);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("ExtendableSavedState{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" states=");
    stringBuilder.append(this.e);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    zm1 zm11 = this.e;
    int i = zm11.e;
    paramParcel.writeInt(i);
    String[] arrayOfString = new String[i];
    Bundle[] arrayOfBundle = new Bundle[i];
    for (paramInt = 0; paramInt < i; paramInt++) {
      arrayOfString[paramInt] = (String)zm11.f(paramInt);
      arrayOfBundle[paramInt] = (Bundle)zm11.i(paramInt);
    } 
    paramParcel.writeStringArray(arrayOfString);
    paramParcel.writeTypedArray((Parcelable[])arrayOfBundle, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */