package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import gt0;
import ht0;
import zb2;
import zv0;

public final class MediaDescriptionCompat implements Parcelable {
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = (Parcelable.Creator<MediaDescriptionCompat>)new zb2(26);
  
  public final String b;
  
  public final CharSequence c;
  
  public final CharSequence e;
  
  public final CharSequence f;
  
  public final Bitmap g;
  
  public final Uri h;
  
  public final Bundle i;
  
  public final Uri j;
  
  public MediaDescription k;
  
  public MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2) {
    this.b = paramString;
    this.c = paramCharSequence1;
    this.e = paramCharSequence2;
    this.f = paramCharSequence3;
    this.g = paramBitmap;
    this.h = paramUri1;
    this.i = paramBundle;
    this.j = paramUri2;
  }
  
  public static MediaDescriptionCompat b(Object paramObject) {
    if (paramObject != null) {
      MediaDescription mediaDescription = (MediaDescription)paramObject;
      String str = gt0.g(mediaDescription);
      CharSequence charSequence3 = gt0.i(mediaDescription);
      CharSequence charSequence2 = gt0.h(mediaDescription);
      CharSequence charSequence1 = gt0.c(mediaDescription);
      Bitmap bitmap = gt0.e(mediaDescription);
      Uri uri = gt0.f(mediaDescription);
      paramObject = gt0.d(mediaDescription);
      Object object = paramObject;
      if (paramObject != null)
        object = zv0.D((Bundle)paramObject); 
      if (object != null) {
        paramObject = object.getParcelable("android.support.v4.media.description.MEDIA_URI");
      } else {
        paramObject = null;
      } 
      if (paramObject != null)
        if (object.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && object.size() == 2) {
          object = null;
        } else {
          object.remove("android.support.v4.media.description.MEDIA_URI");
          object.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }  
      if (paramObject == null)
        paramObject = ht0.a(mediaDescription); 
      paramObject = new MediaDescriptionCompat(str, charSequence3, charSequence2, charSequence1, bitmap, uri, (Bundle)object, (Uri)paramObject);
      ((MediaDescriptionCompat)paramObject).k = mediaDescription;
      return (MediaDescriptionCompat)paramObject;
    } 
    return null;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final MediaDescription e() {
    MediaDescription mediaDescription2 = this.k;
    MediaDescription mediaDescription1 = mediaDescription2;
    if (mediaDescription2 == null) {
      MediaDescription.Builder builder = gt0.b();
      gt0.n(builder, this.b);
      gt0.p(builder, this.c);
      gt0.o(builder, this.e);
      gt0.j(builder, this.f);
      gt0.l(builder, this.g);
      gt0.m(builder, this.h);
      gt0.k(builder, this.i);
      ht0.b(builder, this.j);
      mediaDescription1 = gt0.a(builder);
      this.k = mediaDescription1;
    } 
    return mediaDescription1;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.c);
    stringBuilder.append(", ");
    stringBuilder.append(this.e);
    stringBuilder.append(", ");
    stringBuilder.append(this.f);
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    e().writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\MediaDescriptionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */