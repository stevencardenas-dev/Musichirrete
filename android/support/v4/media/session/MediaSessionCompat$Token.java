package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import c22;
import lg0;
import zb2;

public final class MediaSessionCompat$Token implements Parcelable {
  public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = (Parcelable.Creator<MediaSessionCompat$Token>)new zb2(29);
  
  public final Object b = new Object();
  
  public final Object c;
  
  public lg0 e;
  
  public c22 f;
  
  public MediaSessionCompat$Token(Parcelable paramParcelable, a parama) {
    this.c = paramParcelable;
    this.e = parama;
    this.f = null;
  }
  
  public final lg0 b() {
    synchronized (this.b) {
      return this.e;
    } 
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof MediaSessionCompat$Token))
      return false; 
    paramObject = ((MediaSessionCompat$Token)paramObject).c;
    Object object = this.c;
    return (object == null) ? ((paramObject == null)) : ((paramObject == null) ? false : object.equals(paramObject));
  }
  
  public final int hashCode() {
    Object object = this.c;
    return (object == null) ? 0 : object.hashCode();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeParcelable((Parcelable)this.c, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\session\MediaSessionCompat$Token.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */