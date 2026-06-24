import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class sb2 extends f0 {
  public static final Parcelable.Creator<sb2> CREATOR = new lx0(28);
  
  public final int b;
  
  public final IBinder c;
  
  public final sp e;
  
  public final boolean f;
  
  public final boolean g;
  
  public sb2(int paramInt, IBinder paramIBinder, sp paramsp, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = paramInt;
    this.c = paramIBinder;
    this.e = paramsp;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null) {
      if (this == paramObject)
        return true; 
      if (paramObject instanceof sb2) {
        sb2 sb21 = (sb2)paramObject;
        if (this.e.equals(sb21.e)) {
          IInterface iInterface = null;
          paramObject = this.c;
          if (paramObject == null) {
            paramObject = null;
          } else {
            int i = e1.f;
            IInterface iInterface1 = paramObject.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (iInterface1 instanceof gg0) {
              paramObject = iInterface1;
            } else {
              paramObject = new na2((IBinder)paramObject, "com.google.android.gms.common.internal.IAccountAccessor", 2);
            } 
          } 
          IBinder iBinder = sb21.c;
          if (iBinder != null) {
            int i = e1.f;
            iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (iInterface instanceof gg0) {
              iInterface = iInterface;
            } else {
              iInterface = new na2(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
            } 
          } 
          if (z51.g(paramObject, iInterface))
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.q0(paramParcel, 2, this.c);
    qv.u0(paramParcel, 3, this.e, paramInt);
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(this.f);
    qv.C0(paramParcel, 5, 4);
    paramParcel.writeInt(this.g);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */