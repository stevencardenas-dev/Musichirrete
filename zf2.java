import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public final class zf2 extends na2 {
  public final ef2 s0(String paramString1, String paramString2, dc2 paramdc2) {
    IInterface iInterface;
    Parcel parcel2 = o();
    parcel2.writeString(paramString1);
    parcel2.writeString(paramString2);
    mh2.c(parcel2, paramdc2);
    Parcel parcel1 = u(parcel2, 2);
    IBinder iBinder = parcel1.readStrongBinder();
    int i = af2.f;
    if (iBinder == null) {
      paramString1 = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
      if (iInterface instanceof ef2) {
        iInterface = iInterface;
      } else {
        iInterface = new na2(iBinder, "com.google.android.gms.cast.framework.ISession", 1);
      } 
    } 
    parcel1.recycle();
    return (ef2)iInterface;
  }
  
  public final be2 t0(mj parammj, sg0 paramsg0, dc2 paramdc2) {
    na2 na21;
    Parcel parcel2 = o();
    mh2.b(parcel2, parammj);
    mh2.c(parcel2, paramsg0);
    mh2.c(parcel2, paramdc2);
    Parcel parcel1 = u(parcel2, 3);
    IBinder iBinder = parcel1.readStrongBinder();
    int i = xd2.f;
    if (iBinder == null) {
      parammj = null;
    } else {
      be2 be2;
      String str = GMDx.KvgQIysWWQ;
      IInterface iInterface = iBinder.queryLocalInterface(str);
      if (iInterface instanceof be2) {
        be2 = (be2)iInterface;
      } else {
        na21 = new na2(iBinder, (String)be2, 1);
      } 
    } 
    parcel1.recycle();
    return (be2)na21;
  }
  
  public final ve2 u0(j31 paramj31, sg0 paramsg01, sg0 paramsg02) {
    IInterface iInterface;
    Parcel parcel2 = o();
    mh2.c(parcel2, paramj31);
    mh2.c(parcel2, paramsg01);
    mh2.c(parcel2, paramsg02);
    Parcel parcel1 = u(parcel2, 5);
    IBinder iBinder = parcel1.readStrongBinder();
    int i = se2.f;
    if (iBinder == null) {
      paramj31 = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
      if (iInterface instanceof ve2) {
        iInterface = iInterface;
      } else {
        iInterface = new na2(iBinder, "com.google.android.gms.cast.framework.IReconnectionService", 1);
      } 
    } 
    parcel1.recycle();
    return (ve2)iInterface;
  }
  
  public final hl2 v0(j31 paramj31, dc2 paramdc2, int paramInt1, int paramInt2) {
    IInterface iInterface;
    Parcel parcel2 = o();
    mh2.c(parcel2, paramj31);
    mh2.c(parcel2, paramdc2);
    parcel2.writeInt(paramInt1);
    parcel2.writeInt(paramInt2);
    parcel2.writeInt(0);
    parcel2.writeLong(2097152L);
    parcel2.writeInt(5);
    parcel2.writeInt(333);
    parcel2.writeInt(10000);
    Parcel parcel1 = u(parcel2, 6);
    IBinder iBinder = parcel1.readStrongBinder();
    paramInt1 = lk2.f;
    if (iBinder == null) {
      paramj31 = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
      if (iInterface instanceof hl2) {
        iInterface = iInterface;
      } else {
        iInterface = new na2(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
      } 
    } 
    parcel1.recycle();
    return (hl2)iInterface;
  }
  
  public final hl2 w0(j31 paramj311, j31 paramj312, dc2 paramdc2, int paramInt1, int paramInt2) {
    IInterface iInterface;
    Parcel parcel2 = o();
    mh2.c(parcel2, paramj311);
    mh2.c(parcel2, paramj312);
    mh2.c(parcel2, paramdc2);
    parcel2.writeInt(paramInt1);
    parcel2.writeInt(paramInt2);
    parcel2.writeInt(0);
    parcel2.writeLong(2097152L);
    parcel2.writeInt(5);
    parcel2.writeInt(333);
    parcel2.writeInt(10000);
    Parcel parcel1 = u(parcel2, 7);
    IBinder iBinder = parcel1.readStrongBinder();
    paramInt1 = lk2.f;
    if (iBinder == null) {
      paramj311 = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
      if (iInterface instanceof hl2) {
        iInterface = iInterface;
      } else {
        iInterface = new na2(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
      } 
    } 
    parcel1.recycle();
    return (hl2)iInterface;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */