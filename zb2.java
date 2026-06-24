import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class zb2 implements Parcelable.Creator {
  public static final zb2 b = new zb2(0);
  
  public final int a;
  
  public final Object createFromParcel(Parcel paramParcel) {
    Object object1;
    Object object2;
    int i = this.a;
    View.BaseSavedState baseSavedState2 = null;
    View.BaseSavedState baseSavedState1 = null;
    boolean bool5 = true;
    boolean bool2 = true;
    boolean bool4 = true;
    boolean bool3 = true;
    boolean bool1 = false;
    switch (i) {
      default:
        return new MediaSessionCompat.Token(paramParcel.readParcelable(null), null);
      case 28:
        return new MediaSessionCompat.QueueItem(paramParcel);
      case 27:
        return new MediaMetadataCompat(paramParcel);
      case 26:
        return MediaDescriptionCompat.b(MediaDescription.CREATOR.createFromParcel(paramParcel));
      case 25:
        return new MediaBrowserCompat.MediaItem(paramParcel);
      case 24:
        baseSavedState1 = new View.BaseSavedState(paramParcel);
        ((ls0)baseSavedState1).b = ((Integer)paramParcel.readValue(ls0.class.getClassLoader())).intValue();
        return baseSavedState1;
      case 23:
        return new do0(paramParcel);
      case 22:
        object2 = new Object();
        ((in0)object2).b = paramParcel.readInt();
        ((in0)object2).c = paramParcel.readInt();
        if (paramParcel.readInt() == 1) {
          bool1 = bool3;
        } else {
          bool1 = false;
        } 
        ((in0)object2).e = bool1;
        return object2;
      case 21:
        paramParcel.getClass();
        object2 = paramParcel.readParcelable(IntentSender.class.getClassLoader());
        object2.getClass();
        return new oi0((IntentSender)object2, (Intent)paramParcel.readParcelable(Intent.class.getClassLoader()), paramParcel.readInt(), paramParcel.readInt());
      case 20:
        return new rb0(paramParcel);
      case 19:
        object2 = new Object();
        ((mb0)object2).g = null;
        ((mb0)object2).h = new ArrayList();
        ((mb0)object2).i = new ArrayList();
        ((mb0)object2).b = paramParcel.createStringArrayList();
        ((mb0)object2).c = paramParcel.createStringArrayList();
        ((mb0)object2).e = (mb[])paramParcel.createTypedArray(mb.CREATOR);
        ((mb0)object2).f = paramParcel.readInt();
        ((mb0)object2).g = paramParcel.readString();
        ((mb0)object2).h = paramParcel.createStringArrayList();
        ((mb0)object2).i = paramParcel.createTypedArrayList(nb.CREATOR);
        ((mb0)object2).j = paramParcel.createTypedArrayList(hb0.CREATOR);
        return object2;
      case 18:
        object2 = new Object();
        ((hb0)object2).b = paramParcel.readString();
        ((hb0)object2).c = paramParcel.readInt();
        return object2;
      case 17:
        return new la0(paramParcel);
      case 16:
        object2 = new Object();
        ((o80)object2).b = paramParcel.readInt();
        ((o80)object2).c = paramParcel.readInt();
        return object2;
      case 15:
        object2 = new sd1(-2, -2);
        ((m80)object2).g = 0.0F;
        ((m80)object2).h = 1.0F;
        ((m80)object2).i = -1;
        ((m80)object2).j = -1.0F;
        ((m80)object2).m = 16777215;
        ((m80)object2).n = 16777215;
        ((m80)object2).g = paramParcel.readFloat();
        ((m80)object2).h = paramParcel.readFloat();
        ((m80)object2).i = paramParcel.readInt();
        ((m80)object2).j = paramParcel.readFloat();
        ((m80)object2).k = paramParcel.readInt();
        ((m80)object2).l = paramParcel.readInt();
        ((m80)object2).m = paramParcel.readInt();
        ((m80)object2).n = paramParcel.readInt();
        if (paramParcel.readByte() != 0) {
          bool1 = bool5;
        } else {
          bool1 = false;
        } 
        ((m80)object2).o = bool1;
        ((ViewGroup.MarginLayoutParams)object2).bottomMargin = paramParcel.readInt();
        ((ViewGroup.MarginLayoutParams)object2).leftMargin = paramParcel.readInt();
        ((ViewGroup.MarginLayoutParams)object2).rightMargin = paramParcel.readInt();
        ((ViewGroup.MarginLayoutParams)object2).topMargin = paramParcel.readInt();
        ((ViewGroup.MarginLayoutParams)object2).height = paramParcel.readInt();
        ((ViewGroup.MarginLayoutParams)object2).width = paramParcel.readInt();
        return object2;
      case 14:
        object2 = new ViewGroup.MarginLayoutParams(0, 0);
        ((k80)object2).b = 1;
        ((k80)object2).c = 0.0F;
        ((k80)object2).e = 1.0F;
        ((k80)object2).f = -1;
        ((k80)object2).g = -1.0F;
        ((k80)object2).h = -1;
        ((k80)object2).i = -1;
        ((k80)object2).j = 16777215;
        ((k80)object2).k = 16777215;
        ((k80)object2).b = paramParcel.readInt();
        ((k80)object2).c = paramParcel.readFloat();
        ((k80)object2).e = paramParcel.readFloat();
        ((k80)object2).f = paramParcel.readInt();
        ((k80)object2).g = paramParcel.readFloat();
        ((k80)object2).h = paramParcel.readInt();
        ((k80)object2).i = paramParcel.readInt();
        ((k80)object2).j = paramParcel.readInt();
        ((k80)object2).k = paramParcel.readInt();
        if (paramParcel.readByte() != 0) {
          bool1 = bool2;
        } else {
          bool1 = false;
        } 
        ((k80)object2).l = bool1;
        ((ViewGroup.MarginLayoutParams)object2).bottomMargin = paramParcel.readInt();
        ((ViewGroup.MarginLayoutParams)object2).leftMargin = paramParcel.readInt();
        ((ViewGroup.MarginLayoutParams)object2).rightMargin = paramParcel.readInt();
        ((ViewGroup.MarginLayoutParams)object2).topMargin = paramParcel.readInt();
        ((ViewGroup.MarginLayoutParams)object2).height = paramParcel.readInt();
        ((ViewGroup.MarginLayoutParams)object2).width = paramParcel.readInt();
        return object2;
      case 13:
        return new k30(paramParcel);
      case 12:
        return new r10(paramParcel);
      case 11:
        return new s10(paramParcel);
      case 10:
        return new qx(paramParcel);
      case 9:
        return new ox(paramParcel);
      case 8:
        return new dn(paramParcel);
      case 7:
        baseSavedState2 = new View.BaseSavedState(paramParcel);
        ((wd)baseSavedState2).b = paramParcel.readFloat();
        ((wd)baseSavedState2).c = paramParcel.readFloat();
        object2 = new ArrayList();
        ((wd)baseSavedState2).e = (ArrayList)object2;
        paramParcel.readList((List)object2, Float.class.getClassLoader());
        ((wd)baseSavedState2).f = paramParcel.readFloat();
        ((wd)baseSavedState2).g = paramParcel.createBooleanArray()[0];
        return baseSavedState2;
      case 6:
        baseSavedState2 = new View.BaseSavedState(paramParcel);
        ((ud)baseSavedState2).b = paramParcel.readFloat();
        ((ud)baseSavedState2).c = paramParcel.readFloat();
        object2 = new ArrayList();
        ((ud)baseSavedState2).e = (ArrayList)object2;
        paramParcel.readList((List)object2, Float.class.getClassLoader());
        ((ud)baseSavedState2).f = paramParcel.readFloat();
        ((ud)baseSavedState2).g = paramParcel.createBooleanArray()[0];
        return baseSavedState2;
      case 5:
        object2 = new Object();
        ((wb)object2).k = 255;
        ((wb)object2).m = -2;
        ((wb)object2).n = -2;
        ((wb)object2).o = -2;
        ((wb)object2).v = Boolean.TRUE;
        ((wb)object2).b = paramParcel.readInt();
        ((wb)object2).c = (Integer)paramParcel.readSerializable();
        ((wb)object2).e = (Integer)paramParcel.readSerializable();
        ((wb)object2).f = (Integer)paramParcel.readSerializable();
        ((wb)object2).g = (Integer)paramParcel.readSerializable();
        ((wb)object2).h = (Integer)paramParcel.readSerializable();
        ((wb)object2).i = (Integer)paramParcel.readSerializable();
        ((wb)object2).j = (Integer)paramParcel.readSerializable();
        ((wb)object2).k = paramParcel.readInt();
        ((wb)object2).l = paramParcel.readString();
        ((wb)object2).m = paramParcel.readInt();
        ((wb)object2).n = paramParcel.readInt();
        ((wb)object2).o = paramParcel.readInt();
        ((wb)object2).q = paramParcel.readString();
        ((wb)object2).r = paramParcel.readString();
        ((wb)object2).s = paramParcel.readInt();
        ((wb)object2).u = (Integer)paramParcel.readSerializable();
        ((wb)object2).w = (Integer)paramParcel.readSerializable();
        ((wb)object2).x = (Integer)paramParcel.readSerializable();
        ((wb)object2).y = (Integer)paramParcel.readSerializable();
        ((wb)object2).z = (Integer)paramParcel.readSerializable();
        ((wb)object2).A = (Integer)paramParcel.readSerializable();
        ((wb)object2).B = (Integer)paramParcel.readSerializable();
        ((wb)object2).E = (Integer)paramParcel.readSerializable();
        ((wb)object2).C = (Integer)paramParcel.readSerializable();
        ((wb)object2).D = (Integer)paramParcel.readSerializable();
        ((wb)object2).v = (Boolean)paramParcel.readSerializable();
        ((wb)object2).p = (Locale)paramParcel.readSerializable();
        ((wb)object2).F = (Boolean)paramParcel.readSerializable();
        ((wb)object2).G = (Integer)paramParcel.readSerializable();
        return object2;
      case 4:
        return new nb(paramParcel);
      case 3:
        return new mb(paramParcel);
      case 2:
        object2 = new View.BaseSavedState(paramParcel);
        if (paramParcel.readByte() != 0) {
          bool1 = bool4;
        } else {
          bool1 = false;
        } 
        ((s7)object2).b = bool1;
        return object2;
      case 1:
        paramParcel.getClass();
        i = paramParcel.readInt();
        if (paramParcel.readInt() == 0) {
          object1 = object2;
        } else {
          object1 = Intent.CREATOR.createFromParcel((Parcel)object1);
        } 
        return new e2((Intent)object1, i);
      case 0:
        break;
    } 
    i = object1.dataPosition();
    if (object1.readInt() == -204102970) {
      i = ws2.q0((Parcel)object1);
      for (object2 = baseSavedState2; object1.dataPosition() < i; object2 = ws2.s((Parcel)object1, j, eo.CREATOR)) {
        int j = object1.readInt();
        char c = (char)j;
        if (c != '\001') {
          if (c != '\002') {
            ws2.m0((Parcel)object1, j);
            continue;
          } 
          bool1 = ws2.Z((Parcel)object1, j);
          continue;
        } 
      } 
      ws2.B((Parcel)object1, i);
      object1 = new n5((eo)object2, bool1);
    } else {
      object1.setDataPosition(i - 4);
      object1 = n5.f;
    } 
    return object1;
  }
  
  public final Object[] newArray(int paramInt) {
    switch (this.a) {
      default:
        return (Object[])new MediaSessionCompat.Token[paramInt];
      case 28:
        return (Object[])new MediaSessionCompat.QueueItem[paramInt];
      case 27:
        return (Object[])new MediaMetadataCompat[paramInt];
      case 26:
        return (Object[])new MediaDescriptionCompat[paramInt];
      case 25:
        return (Object[])new MediaBrowserCompat.MediaItem[paramInt];
      case 24:
        return (Object[])new ls0[paramInt];
      case 23:
        return (Object[])new do0[paramInt];
      case 22:
        return (Object[])new in0[paramInt];
      case 21:
        return (Object[])new oi0[paramInt];
      case 20:
        return (Object[])new rb0[paramInt];
      case 19:
        return (Object[])new mb0[paramInt];
      case 18:
        return (Object[])new hb0[paramInt];
      case 17:
        return (Object[])new la0[paramInt];
      case 16:
        return (Object[])new o80[paramInt];
      case 15:
        return (Object[])new m80[paramInt];
      case 14:
        return (Object[])new k80[paramInt];
      case 13:
        return (Object[])new k30[paramInt];
      case 12:
        return (Object[])new r10[paramInt];
      case 11:
        return (Object[])new s10[paramInt];
      case 10:
        return (Object[])new qx[paramInt];
      case 9:
        return (Object[])new ox[paramInt];
      case 8:
        return (Object[])new dn[paramInt];
      case 7:
        return (Object[])new wd[paramInt];
      case 6:
        return (Object[])new ud[paramInt];
      case 5:
        return (Object[])new wb[paramInt];
      case 4:
        return (Object[])new nb[paramInt];
      case 3:
        return (Object[])new mb[paramInt];
      case 2:
        return (Object[])new s7[paramInt];
      case 1:
        return (Object[])new e2[paramInt];
      case 0:
        break;
    } 
    return (Object[])new n5[paramInt];
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */