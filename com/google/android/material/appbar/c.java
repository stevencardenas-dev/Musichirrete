package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

public final class c implements Parcelable.ClassLoaderCreator {
  public final Object createFromParcel(Parcel paramParcel) {
    return new d(paramParcel, null);
  }
  
  public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader) {
    return new d(paramParcel, paramClassLoader);
  }
  
  public final Object[] newArray(int paramInt) {
    return (Object[])new d[paramInt];
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\appbar\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */