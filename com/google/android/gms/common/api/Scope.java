package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f0;
import n21;
import qv;
import yb2;

public final class Scope extends f0 implements ReflectedParcelable {
  public static final Parcelable.Creator<Scope> CREATOR = (Parcelable.Creator<Scope>)new yb2(24);
  
  public final int b;
  
  public final String c;
  
  public Scope(String paramString, int paramInt) {
    n21.l(paramString, "scopeUri must not be null or empty");
    this.b = paramInt;
    this.c = paramString;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof Scope))
      return false; 
    paramObject = ((Scope)paramObject).c;
    return this.c.equals(paramObject);
  }
  
  public final int hashCode() {
    return this.c.hashCode();
  }
  
  public final String toString() {
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.v0(paramParcel, 2, this.c);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\common\api\Scope.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */