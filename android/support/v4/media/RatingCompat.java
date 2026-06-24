package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import lx0;
import zc1;

public final class RatingCompat implements Parcelable {
  public static final Parcelable.Creator<RatingCompat> CREATOR = (Parcelable.Creator<RatingCompat>)new lx0(11);
  
  public final int b;
  
  public final float c;
  
  public Object e;
  
  public RatingCompat(int paramInt, float paramFloat) {
    this.b = paramInt;
    this.c = paramFloat;
  }
  
  public static RatingCompat b(Rating paramRating) {
    RatingCompat ratingCompat3 = null;
    RatingCompat ratingCompat2 = null;
    RatingCompat ratingCompat1 = ratingCompat3;
    if (paramRating != null) {
      int i = zc1.b(paramRating);
      if (zc1.e(paramRating)) {
        float f2;
        float f1 = 1.0F;
        switch (i) {
          default:
            return ratingCompat3;
          case 6:
            f1 = zc1.a(paramRating);
            if (f1 < 0.0F || f1 > 100.0F) {
              Log.e("Rating", "Invalid percentage-based rating value");
              ratingCompat1 = ratingCompat2;
              break;
            } 
            ratingCompat1 = new RatingCompat(6, f1);
            break;
          case 3:
          case 4:
          case 5:
            f2 = zc1.c(paramRating);
            if (i != 3) {
              if (i != 4) {
                if (i != 5) {
                  StringBuilder stringBuilder = new StringBuilder("Invalid rating style (");
                  stringBuilder.append(i);
                  stringBuilder.append(") for a star rating");
                  Log.e("Rating", stringBuilder.toString());
                  RatingCompat ratingCompat = ratingCompat2;
                  break;
                } 
                f1 = 5.0F;
              } else {
                f1 = 4.0F;
              } 
            } else {
              f1 = 3.0F;
            } 
            if (f2 < 0.0F || f2 > f1) {
              Log.e("Rating", "Trying to set out of range star-based rating");
              ratingCompat1 = ratingCompat2;
              break;
            } 
            ratingCompat1 = new RatingCompat(i, f2);
            break;
          case 2:
            if (!zc1.f(paramRating))
              f1 = 0.0F; 
            ratingCompat1 = new RatingCompat(2, f1);
            break;
          case 1:
            if (!zc1.d(paramRating))
              f1 = 0.0F; 
            ratingCompat1 = new RatingCompat(1, f1);
            break;
        } 
      } else {
        switch (i) {
          default:
            ratingCompat1 = ratingCompat2;
            break;
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
            ratingCompat1 = new RatingCompat(i, -1.0F);
            break;
        } 
      } 
      ratingCompat1.e = paramRating;
    } 
    return ratingCompat1;
  }
  
  public final int describeContents() {
    return this.b;
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("Rating:style=");
    stringBuilder.append(this.b);
    stringBuilder.append(" rating=");
    float f = this.c;
    if (f < 0.0F) {
      str = "unrated";
    } else {
      str = String.valueOf(f);
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeFloat(this.c);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\RatingCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */