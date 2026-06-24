package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.profileinstaller.Vuyf.nBRIsU;
import b9;
import zb2;
import zm1;
import zv0;

public final class MediaMetadataCompat implements Parcelable {
  public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
  
  public static final b9 f;
  
  public static final String[] g = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
  
  public static final String[] h = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
  
  public static final String[] i;
  
  public final Bundle b;
  
  public MediaMetadata c;
  
  public MediaDescriptionCompat e;
  
  static {
    i = new String[] { str, "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
    CREATOR = (Parcelable.Creator<MediaMetadataCompat>)new zb2(27);
  }
  
  public MediaMetadataCompat(Bundle paramBundle) {
    paramBundle = new Bundle(paramBundle);
    this.b = paramBundle;
    zv0.m(paramBundle);
  }
  
  public MediaMetadataCompat(Parcel paramParcel) {
    this.b = paramParcel.readBundle(zv0.class.getClassLoader());
  }
  
  public static MediaMetadataCompat b(MediaMetadata paramMediaMetadata) {
    if (paramMediaMetadata != null) {
      Parcel parcel = Parcel.obtain();
      paramMediaMetadata.writeToParcel(parcel, 0);
      parcel.setDataPosition(0);
      MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
      parcel.recycle();
      mediaMetadataCompat.c = paramMediaMetadata;
      return mediaMetadataCompat;
    } 
    return null;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final MediaDescriptionCompat e() {
    String[] arrayOfString1;
    String[] arrayOfString2;
    Bundle bundle1;
    MediaDescriptionCompat mediaDescriptionCompat2 = this.e;
    if (mediaDescriptionCompat2 != null)
      return mediaDescriptionCompat2; 
    String str2 = j("android.media.metadata.MEDIA_ID");
    CharSequence[] arrayOfCharSequence = new CharSequence[3];
    Bundle bundle3 = this.b;
    CharSequence charSequence1 = bundle3.getCharSequence("android.media.metadata.DISPLAY_TITLE");
    if (!TextUtils.isEmpty(charSequence1)) {
      arrayOfCharSequence[0] = charSequence1;
      arrayOfCharSequence[1] = bundle3.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
      arrayOfCharSequence[2] = bundle3.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
    } else {
      int i = 0;
      byte b1 = 0;
      while (i < 3) {
        arrayOfString1 = g;
        if (b1 < arrayOfString1.length) {
          CharSequence charSequence = bundle3.getCharSequence(arrayOfString1[b1]);
          int j = i;
          if (!TextUtils.isEmpty(charSequence)) {
            arrayOfCharSequence[i] = charSequence;
            j = i + 1;
          } 
          b1++;
          i = j;
        } 
      } 
    } 
    byte b = 0;
    while (true) {
      arrayOfString1 = h;
      int i = arrayOfString1.length;
      bundle1 = null;
      if (b < i) {
        String str = arrayOfString1[b];
        try {
          Bitmap bitmap = (Bitmap)bundle3.getParcelable(str);
        } catch (Exception exception) {
          Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", exception);
          exception = null;
        } 
        if (exception != null)
          break; 
        b++;
        continue;
      } 
      arrayOfString1 = null;
      break;
    } 
    b = 0;
    while (true) {
      arrayOfString2 = i;
      if (b < arrayOfString2.length) {
        String str = j(arrayOfString2[b]);
        if (!TextUtils.isEmpty(str)) {
          Uri uri = Uri.parse(str);
          break;
        } 
        b++;
        continue;
      } 
      arrayOfString2 = null;
      break;
    } 
    String str1 = j("android.media.metadata.MEDIA_URI");
    if (!TextUtils.isEmpty(str1)) {
      Uri uri = Uri.parse(str1);
    } else {
      str1 = null;
    } 
    CharSequence charSequence2 = arrayOfCharSequence[0];
    CharSequence charSequence3 = arrayOfCharSequence[1];
    CharSequence charSequence4 = arrayOfCharSequence[2];
    Bundle bundle2 = new Bundle();
    if (bundle3.containsKey("android.media.metadata.BT_FOLDER_TYPE"))
      bundle2.putLong("android.media.extra.BT_FOLDER_TYPE", f("android.media.metadata.BT_FOLDER_TYPE")); 
    if (bundle3.containsKey("android.media.metadata.DOWNLOAD_STATUS"))
      bundle2.putLong("android.media.extra.DOWNLOAD_STATUS", f("android.media.metadata.DOWNLOAD_STATUS")); 
    if (!bundle2.isEmpty())
      bundle1 = bundle2; 
    MediaDescriptionCompat mediaDescriptionCompat1 = new MediaDescriptionCompat(str2, charSequence2, charSequence3, charSequence4, (Bitmap)arrayOfString1, (Uri)arrayOfString2, bundle1, (Uri)str1);
    this.e = mediaDescriptionCompat1;
    return mediaDescriptionCompat1;
  }
  
  public final long f(String paramString) {
    return this.b.getLong(paramString, 0L);
  }
  
  public final MediaMetadata i() {
    if (this.c == null) {
      MediaMetadata.Builder builder = new MediaMetadata.Builder();
      Bundle bundle = this.b;
      for (String str : bundle.keySet()) {
        Integer integer2 = (Integer)f.get(str);
        Integer integer1 = integer2;
        if (integer2 == null)
          integer1 = Integer.valueOf(-1); 
        int i = integer1.intValue();
        if (i != 0) {
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                Object object = bundle.get(str);
                if (object == null || object instanceof CharSequence) {
                  builder.putText(str, (CharSequence)object);
                  continue;
                } 
                if (object instanceof Long) {
                  builder.putLong(str, ((Long)object).longValue());
                  continue;
                } 
                if (object instanceof Bitmap) {
                  builder.putBitmap(str, (Bitmap)object);
                  continue;
                } 
                if (object instanceof Rating)
                  builder.putRating(str, (Rating)object); 
                continue;
              } 
              builder.putRating(str, (Rating)bundle.getParcelable(str));
              continue;
            } 
            builder.putBitmap(str, (Bitmap)bundle.getParcelable(str));
            continue;
          } 
          builder.putText(str, bundle.getCharSequence(str));
          continue;
        } 
        builder.putLong(str, bundle.getLong(str, 0L));
      } 
      this.c = builder.build();
    } 
    return this.c;
  }
  
  public final String j(String paramString) {
    CharSequence charSequence = this.b.getCharSequence(paramString);
    return (charSequence != null) ? charSequence.toString() : null;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeBundle(this.b);
  }
  
  static {
    zm1 zm1 = new zm1(0);
    f = (b9)zm1;
    Integer integer1 = Integer.valueOf(1);
    zm1.put("android.media.metadata.TITLE", integer1);
    zm1.put("android.media.metadata.ARTIST", integer1);
    Integer integer2 = Integer.valueOf(0);
    zm1.put("android.media.metadata.DURATION", integer2);
    zm1.put("android.media.metadata.ALBUM", integer1);
    zm1.put("android.media.metadata.AUTHOR", integer1);
    zm1.put("android.media.metadata.WRITER", integer1);
    zm1.put("android.media.metadata.COMPOSER", integer1);
    zm1.put("android.media.metadata.COMPILATION", integer1);
    zm1.put("android.media.metadata.DATE", integer1);
    zm1.put("android.media.metadata.YEAR", integer2);
    zm1.put("android.media.metadata.GENRE", integer1);
    zm1.put("android.media.metadata.TRACK_NUMBER", integer2);
    zm1.put("android.media.metadata.NUM_TRACKS", integer2);
    zm1.put("android.media.metadata.DISC_NUMBER", integer2);
    zm1.put("android.media.metadata.ALBUM_ARTIST", integer1);
    Integer integer4 = Integer.valueOf(2);
    zm1.put("android.media.metadata.ART", integer4);
    zm1.put("android.media.metadata.ART_URI", integer1);
    zm1.put("android.media.metadata.ALBUM_ART", integer4);
    zm1.put("android.media.metadata.ALBUM_ART_URI", integer1);
    Integer integer3 = Integer.valueOf(3);
    zm1.put("android.media.metadata.USER_RATING", integer3);
    zm1.put("android.media.metadata.RATING", integer3);
    zm1.put("android.media.metadata.DISPLAY_TITLE", integer1);
    zm1.put("android.media.metadata.DISPLAY_SUBTITLE", integer1);
    zm1.put("android.media.metadata.DISPLAY_DESCRIPTION", integer1);
    zm1.put("android.media.metadata.DISPLAY_ICON", integer4);
    String str = nBRIsU.dOYWyE;
    zm1.put(str, integer1);
    zm1.put("android.media.metadata.MEDIA_ID", integer1);
    zm1.put("android.media.metadata.BT_FOLDER_TYPE", integer2);
    zm1.put("android.media.metadata.MEDIA_URI", integer1);
    zm1.put("android.media.metadata.ADVERTISEMENT", integer2);
    zm1.put("android.media.metadata.DOWNLOAD_STATUS", integer2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\MediaMetadataCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */