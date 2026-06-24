import android.os.Parcel;

public final class rp2 extends na2 {
  public final sg0 s0(j31 paramj31, int paramInt) {
    Parcel parcel = o();
    nh2.b(parcel, paramj31);
    parcel.writeString("com.google.android.gms.cast.framework.dynamite");
    parcel.writeInt(paramInt);
    parcel = m(parcel, 2);
    sg0 sg0 = j31.p0(parcel.readStrongBinder());
    parcel.recycle();
    return sg0;
  }
  
  public final sg0 t0(j31 paramj31, int paramInt) {
    Parcel parcel = o();
    nh2.b(parcel, paramj31);
    parcel.writeString("com.google.android.gms.cast.framework.dynamite");
    parcel.writeInt(paramInt);
    parcel = m(parcel, 4);
    sg0 sg0 = j31.p0(parcel.readStrongBinder());
    parcel.recycle();
    return sg0;
  }
  
  public final sg0 u0(j31 paramj31, boolean paramBoolean, long paramLong) {
    Parcel parcel = o();
    nh2.b(parcel, paramj31);
    parcel.writeString("com.google.android.gms.cast.framework.dynamite");
    parcel.writeInt(paramBoolean);
    parcel.writeLong(paramLong);
    parcel = m(parcel, 7);
    sg0 sg0 = j31.p0(parcel.readStrongBinder());
    parcel.recycle();
    return sg0;
  }
  
  public final sg0 v0(j31 paramj311, int paramInt, j31 paramj312) {
    Parcel parcel2 = o();
    nh2.b(parcel2, paramj311);
    parcel2.writeString("com.google.android.gms.cast.framework.dynamite");
    parcel2.writeInt(paramInt);
    nh2.b(parcel2, paramj312);
    Parcel parcel1 = m(parcel2, 8);
    sg0 sg0 = j31.p0(parcel1.readStrongBinder());
    parcel1.recycle();
    return sg0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */