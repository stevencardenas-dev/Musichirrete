import android.os.Parcel;

public final class cq2 extends na2 {
  public final sg0 s0(j31 paramj311, int paramInt, j31 paramj312) {
    Parcel parcel2 = o();
    nh2.b(parcel2, paramj311);
    parcel2.writeString("com.google.android.gms.cast.framework.dynamite");
    parcel2.writeInt(paramInt);
    nh2.b(parcel2, paramj312);
    Parcel parcel1 = m(parcel2, 2);
    sg0 sg0 = j31.p0(parcel1.readStrongBinder());
    parcel1.recycle();
    return sg0;
  }
  
  public final sg0 t0(j31 paramj311, int paramInt, j31 paramj312) {
    Parcel parcel2 = o();
    nh2.b(parcel2, paramj311);
    parcel2.writeString("com.google.android.gms.cast.framework.dynamite");
    parcel2.writeInt(paramInt);
    nh2.b(parcel2, paramj312);
    Parcel parcel1 = m(parcel2, 3);
    sg0 sg0 = j31.p0(parcel1.readStrongBinder());
    parcel1.recycle();
    return sg0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cq2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */