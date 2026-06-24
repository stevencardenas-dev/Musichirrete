package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import lx0;
import s71;
import t71;
import zv0;

public final class PlaybackStateCompat implements Parcelable {
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = (Parcelable.Creator<PlaybackStateCompat>)new lx0(6);
  
  public final int b;
  
  public final long c;
  
  public final long e;
  
  public final float f;
  
  public final long g;
  
  public final int h;
  
  public final CharSequence i;
  
  public final long j;
  
  public final ArrayList k;
  
  public final long l;
  
  public final Bundle m;
  
  public PlaybackState n;
  
  public PlaybackStateCompat(int paramInt1, long paramLong1, long paramLong2, float paramFloat, long paramLong3, int paramInt2, CharSequence paramCharSequence, long paramLong4, ArrayList<?> paramArrayList, long paramLong5, Bundle paramBundle) {
    this.b = paramInt1;
    this.c = paramLong1;
    this.e = paramLong2;
    this.f = paramFloat;
    this.g = paramLong3;
    this.h = paramInt2;
    this.i = paramCharSequence;
    this.j = paramLong4;
    this.k = new ArrayList(paramArrayList);
    this.l = paramLong5;
    this.m = paramBundle;
  }
  
  public PlaybackStateCompat(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    this.c = paramParcel.readLong();
    this.f = paramParcel.readFloat();
    this.j = paramParcel.readLong();
    this.e = paramParcel.readLong();
    this.g = paramParcel.readLong();
    this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.k = paramParcel.createTypedArrayList(CustomAction.CREATOR);
    this.l = paramParcel.readLong();
    this.m = paramParcel.readBundle(zv0.class.getClassLoader());
    this.h = paramParcel.readInt();
  }
  
  public static PlaybackStateCompat b(PlaybackState paramPlaybackState) {
    if (paramPlaybackState != null) {
      list = s71.j(paramPlaybackState);
      if (list != null) {
        ArrayList<List> arrayList = new ArrayList(list.size());
        for (List list : list) {
          if (list != null) {
            PlaybackState.CustomAction customAction1 = (PlaybackState.CustomAction)list;
            Bundle bundle1 = s71.l(customAction1);
            zv0.m(bundle1);
            CustomAction customAction = new CustomAction(s71.f(customAction1), s71.o(customAction1), s71.m(customAction1), bundle1);
            customAction.g = customAction1;
          } else {
            list = null;
          } 
          arrayList.add(list);
        } 
        list = arrayList;
      } else {
        list = null;
      } 
      Bundle bundle = t71.a(paramPlaybackState);
      zv0.m(bundle);
      PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(s71.r(paramPlaybackState), s71.q(paramPlaybackState), s71.i(paramPlaybackState), s71.p(paramPlaybackState), s71.g(paramPlaybackState), 0, s71.k(paramPlaybackState), s71.n(paramPlaybackState), (ArrayList)list, s71.h(paramPlaybackState), bundle);
      playbackStateCompat.n = paramPlaybackState;
      return playbackStateCompat;
    } 
    return null;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final Bundle e() {
    return this.m;
  }
  
  public final PlaybackState f() {
    if (this.n == null) {
      PlaybackState.Builder builder = s71.d();
      float f = this.f;
      long l = this.j;
      s71.x(builder, this.b, this.c, f, l);
      s71.u(builder, this.e);
      s71.s(builder, this.g);
      s71.v(builder, this.i);
      ArrayList<Object> arrayList = this.k;
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        CustomAction customAction2 = (CustomAction)arrayList.get(b);
        b++;
        CustomAction customAction4 = customAction2;
        PlaybackState.CustomAction customAction3 = customAction4.g;
        PlaybackState.CustomAction customAction1 = customAction3;
        if (customAction3 == null) {
          PlaybackState.CustomAction.Builder builder1 = s71.e(customAction4.b, customAction4.c, customAction4.e);
          s71.w(builder1, customAction4.f);
          customAction1 = s71.b(builder1);
        } 
        s71.a(builder, customAction1);
      } 
      s71.t(builder, this.l);
      t71.b(builder, this.m);
      this.n = s71.c(builder);
    } 
    return this.n;
  }
  
  public final int i() {
    return this.b;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("PlaybackState {state=");
    stringBuilder.append(this.b);
    stringBuilder.append(", position=");
    stringBuilder.append(this.c);
    stringBuilder.append(", buffered position=");
    stringBuilder.append(this.e);
    stringBuilder.append(", speed=");
    stringBuilder.append(this.f);
    stringBuilder.append(", updated=");
    stringBuilder.append(this.j);
    stringBuilder.append(", actions=");
    stringBuilder.append(this.g);
    stringBuilder.append(", error code=");
    stringBuilder.append(this.h);
    stringBuilder.append(", error message=");
    stringBuilder.append(this.i);
    stringBuilder.append(", custom actions=");
    stringBuilder.append(this.k);
    stringBuilder.append(", active item id=");
    stringBuilder.append(this.l);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeLong(this.c);
    paramParcel.writeFloat(this.f);
    paramParcel.writeLong(this.j);
    paramParcel.writeLong(this.e);
    paramParcel.writeLong(this.g);
    TextUtils.writeToParcel(this.i, paramParcel, paramInt);
    paramParcel.writeTypedList(this.k);
    paramParcel.writeLong(this.l);
    paramParcel.writeBundle(this.m);
    paramParcel.writeInt(this.h);
  }
  
  public static final class CustomAction implements Parcelable {
    public static final Parcelable.Creator<CustomAction> CREATOR = (Parcelable.Creator<CustomAction>)new Object();
    
    public final String b;
    
    public final CharSequence c;
    
    public final int e;
    
    public final Bundle f;
    
    public PlaybackState.CustomAction g;
    
    public CustomAction(Parcel param1Parcel) {
      this.b = param1Parcel.readString();
      this.c = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(param1Parcel);
      this.e = param1Parcel.readInt();
      this.f = param1Parcel.readBundle(zv0.class.getClassLoader());
    }
    
    public CustomAction(String param1String, CharSequence param1CharSequence, int param1Int, Bundle param1Bundle) {
      this.b = param1String;
      this.c = param1CharSequence;
      this.e = param1Int;
      this.f = param1Bundle;
    }
    
    public final int describeContents() {
      return 0;
    }
    
    public final String toString() {
      StringBuilder stringBuilder = new StringBuilder("Action:mName='");
      stringBuilder.append(this.c);
      stringBuilder.append(", mIcon=");
      stringBuilder.append(this.e);
      stringBuilder.append(", mExtras=");
      stringBuilder.append(this.f);
      return stringBuilder.toString();
    }
    
    public final void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeString(this.b);
      TextUtils.writeToParcel(this.c, param1Parcel, param1Int);
      param1Parcel.writeInt(this.e);
      param1Parcel.writeBundle(this.f);
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\session\PlaybackStateCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */