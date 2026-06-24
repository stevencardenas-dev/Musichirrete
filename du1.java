import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class du1 extends j {
  public static final Parcelable.Creator<du1> CREATOR = (Parcelable.Creator<du1>)new i(10);
  
  public CharSequence e;
  
  public boolean f;
  
  public du1(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    this.e = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    int i = paramParcel.readInt();
    boolean bool = true;
    if (i != 1)
      bool = false; 
    this.f = bool;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("TextInputLayout.SavedState{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" error=");
    stringBuilder.append(this.e);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    TextUtils.writeToParcel(this.e, paramParcel, paramInt);
    paramParcel.writeInt(this.f);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\du1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */