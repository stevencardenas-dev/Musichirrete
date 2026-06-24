package android.support.v4.media.session;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import hg0;
import jg0;
import lg0;
import ui0;

public abstract class a extends Binder implements lg0 {
  public static final int e = 0;
  
  public a() {
    attachInterface((IInterface)this, "android.support.v4.media.session.IMediaSession");
  }
  
  public final IBinder asBinder() {
    return (IBinder)this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    Bundle bundle3;
    MediaDescriptionCompat mediaDescriptionCompat1;
    Bundle bundle2;
    PlaybackStateCompat playbackStateCompat;
    Bundle bundle1;
    RatingCompat ratingCompat1;
    RatingCompat ratingCompat2;
    MediaDescriptionCompat mediaDescriptionCompat2;
    Uri uri;
    IBinder iBinder1;
    if (paramInt1 >= 1 && paramInt1 <= 16777215)
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession"); 
    if (paramInt1 == 1598968902) {
      paramParcel2.writeString("android.support.v4.media.session.IMediaSession");
      return true;
    } 
    IBinder iBinder2 = null;
    Bundle bundle5 = null;
    switch (paramInt1) {
      default:
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 51:
        ratingCompat2 = (RatingCompat)ui0.a(paramParcel1, RatingCompat.CREATOR);
        bundle3 = (Bundle)ui0.a(paramParcel1, Bundle.CREATOR);
        d0();
        throw null;
      case 50:
        bundle3 = Q();
        ratingCompat2.writeNoException();
        ui0.r0((Parcel)ratingCompat2, (Parcelable)bundle3);
        return true;
      case 49:
        bundle3.readFloat();
        l();
        throw null;
      case 48:
        bundle3.readInt();
        Y();
        throw null;
      case 47:
        paramInt1 = q();
        ratingCompat2.writeNoException();
        ratingCompat2.writeInt(paramInt1);
        return true;
      case 46:
        bundle3.readInt();
        x();
        throw null;
      case 45:
        v();
        ratingCompat2.writeNoException();
        ratingCompat2.writeInt(0);
        return true;
      case 44:
        bundle3.readInt();
        A();
        throw null;
      case 43:
        mediaDescriptionCompat1 = (MediaDescriptionCompat)ui0.a((Parcel)bundle3, MediaDescriptionCompat.CREATOR);
        a0();
        throw null;
      case 42:
        mediaDescriptionCompat2 = (MediaDescriptionCompat)ui0.a((Parcel)mediaDescriptionCompat1, MediaDescriptionCompat.CREATOR);
        mediaDescriptionCompat1.readInt();
        e();
        throw null;
      case 41:
        mediaDescriptionCompat1 = (MediaDescriptionCompat)ui0.a((Parcel)mediaDescriptionCompat1, MediaDescriptionCompat.CREATOR);
        k();
        throw null;
      case 40:
        mediaDescriptionCompat1.readInt();
        mediaDescriptionCompat2.writeNoException();
        return true;
      case 39:
        mediaDescriptionCompat1.readInt();
        e0();
        throw null;
      case 38:
        mediaDescriptionCompat2.writeNoException();
        mediaDescriptionCompat2.writeInt(0);
        return true;
      case 37:
        paramInt1 = U();
        mediaDescriptionCompat2.writeNoException();
        mediaDescriptionCompat2.writeInt(paramInt1);
        return true;
      case 36:
        uri = (Uri)ui0.a((Parcel)mediaDescriptionCompat1, Uri.CREATOR);
        bundle2 = (Bundle)ui0.a((Parcel)mediaDescriptionCompat1, Bundle.CREATOR);
        n0();
        throw null;
      case 35:
        bundle2.readString();
        bundle2 = (Bundle)ui0.a((Parcel)bundle2, Bundle.CREATOR);
        z();
        throw null;
      case 34:
        bundle2.readString();
        bundle2 = (Bundle)ui0.a((Parcel)bundle2, Bundle.CREATOR);
        h0();
        throw null;
      case 33:
        B();
        throw null;
      case 32:
        s();
        uri.writeNoException();
        uri.writeInt(0);
        return true;
      case 31:
        getExtras();
        throw null;
      case 30:
        M();
        throw null;
      case 29:
        uri.writeNoException();
        uri.writeInt(-1);
        return true;
      case 28:
        playbackStateCompat = j();
        uri.writeNoException();
        ui0.r0((Parcel)uri, playbackStateCompat);
        return true;
      case 27:
        P();
        throw null;
      case 26:
        playbackStateCompat.readString();
        bundle1 = (Bundle)ui0.a((Parcel)playbackStateCompat, Bundle.CREATOR);
        T();
        throw null;
      case 25:
        ratingCompat1 = (RatingCompat)ui0.a((Parcel)bundle1, RatingCompat.CREATOR);
        m0();
        throw null;
      case 24:
        ratingCompat1.readLong();
        R();
        throw null;
      case 23:
        K();
        throw null;
      case 22:
        X();
        throw null;
      case 21:
        previous();
        throw null;
      case 20:
        next();
        throw null;
      case 19:
        stop();
        throw null;
      case 18:
        N();
        throw null;
      case 17:
        ratingCompat1.readLong();
        g0();
        throw null;
      case 16:
        uri = (Uri)ui0.a((Parcel)ratingCompat1, Uri.CREATOR);
        object = ui0.a((Parcel)ratingCompat1, Bundle.CREATOR);
        H();
        throw null;
      case 15:
        object.readString();
        object = ui0.a((Parcel)object, Bundle.CREATOR);
        c();
        throw null;
      case 14:
        object.readString();
        object = ui0.a((Parcel)object, Bundle.CREATOR);
        G();
        throw null;
      case 13:
        F();
        throw null;
      case 12:
        object.readInt();
        object.readInt();
        object.readString();
        h();
        throw null;
      case 11:
        object.readInt();
        object.readInt();
        object.readString();
        k0();
        throw null;
      case 10:
        V();
        throw null;
      case 9:
        a();
        throw null;
      case 8:
        p();
        throw null;
      case 7:
        g();
        throw null;
      case 6:
        f0();
        throw null;
      case 5:
        n();
        throw null;
      case 4:
        iBinder2 = object.readStrongBinder();
        if (iBinder2 == null) {
          object = bundle5;
        } else {
          IInterface iInterface = iBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
          if (iInterface != null && iInterface instanceof jg0) {
            jg0 jg0 = (jg0)iInterface;
          } else {
            object = new Object();
            ((hg0)object).e = iBinder2;
          } 
        } 
        y((jg0)object);
        uri.writeNoException();
        return true;
      case 3:
        iBinder1 = object.readStrongBinder();
        if (iBinder1 == null) {
          object = iBinder2;
        } else {
          object = iBinder1.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
          if (object != null && object instanceof jg0) {
            object = object;
          } else {
            object = new Object();
            ((hg0)object).e = iBinder1;
          } 
        } 
        L((jg0)object);
        uri.writeNoException();
        return true;
      case 2:
        object = ui0.a((Parcel)object, KeyEvent.CREATOR);
        E();
        throw null;
      case 1:
        break;
    } 
    object.readString();
    Bundle bundle4 = (Bundle)ui0.a((Parcel)object, Bundle.CREATOR);
    Object object = ui0.a((Parcel)object, MediaSessionCompat$ResultReceiverWrapper.CREATOR);
    b();
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\session\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */