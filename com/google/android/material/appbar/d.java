package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import j;

public final class d extends j {
  public static final Parcelable.Creator<d> CREATOR = (Parcelable.Creator<d>)new Object();
  
  public boolean e;
  
  public boolean f;
  
  public int g;
  
  public float h;
  
  public boolean i;
  
  public d(Parcel paramParcel, ClassLoader paramClassLoader) {
    super(paramParcel, paramClassLoader);
    byte b = paramParcel.readByte();
    boolean bool2 = false;
    if (b != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.e = bool1;
    if (paramParcel.readByte() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.f = bool1;
    this.g = paramParcel.readInt();
    this.h = paramParcel.readFloat();
    boolean bool1 = bool2;
    if (paramParcel.readByte() != 0)
      bool1 = true; 
    this.i = bool1;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeByte((byte)this.e);
    paramParcel.writeByte((byte)this.f);
    paramParcel.writeInt(this.g);
    paramParcel.writeFloat(this.h);
    paramParcel.writeByte((byte)this.i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\appbar\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */