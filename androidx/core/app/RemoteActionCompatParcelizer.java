package androidx.core.app;

import a22;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import b22;
import c22;

public class RemoteActionCompatParcelizer {
  public static RemoteActionCompat read(a22 parama22) {
    c22 c22;
    Object object = new Object();
    IconCompat iconCompat = ((RemoteActionCompat)object).a;
    boolean bool1 = true;
    if (parama22.e(1))
      c22 = parama22.h(); 
    ((RemoteActionCompat)object).a = (IconCompat)c22;
    CharSequence charSequence = ((RemoteActionCompat)object).b;
    if (parama22.e(2)) {
      b22 b22 = (b22)parama22;
      charSequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(b22.e);
    } 
    ((RemoteActionCompat)object).b = charSequence;
    charSequence = ((RemoteActionCompat)object).c;
    if (parama22.e(3)) {
      b22 b22 = (b22)parama22;
      charSequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(b22.e);
    } 
    ((RemoteActionCompat)object).c = charSequence;
    ((RemoteActionCompat)object).d = (PendingIntent)parama22.g((Parcelable)((RemoteActionCompat)object).d, 4);
    boolean bool = ((RemoteActionCompat)object).e;
    if (parama22.e(5))
      if (((b22)parama22).e.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      }  
    ((RemoteActionCompat)object).e = bool;
    bool = ((RemoteActionCompat)object).f;
    if (parama22.e(6))
      if (((b22)parama22).e.readInt() != 0) {
        bool = bool1;
      } else {
        bool = false;
      }  
    ((RemoteActionCompat)object).f = bool;
    return (RemoteActionCompat)object;
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, a22 parama22) {
    parama22.getClass();
    IconCompat iconCompat = paramRemoteActionCompat.a;
    parama22.i(1);
    parama22.l((c22)iconCompat);
    CharSequence charSequence = paramRemoteActionCompat.b;
    parama22.i(2);
    Parcel parcel = ((b22)parama22).e;
    TextUtils.writeToParcel(charSequence, parcel, 0);
    charSequence = paramRemoteActionCompat.c;
    parama22.i(3);
    TextUtils.writeToParcel(charSequence, parcel, 0);
    parama22.k((Parcelable)paramRemoteActionCompat.d, 4);
    boolean bool = paramRemoteActionCompat.e;
    parama22.i(5);
    parcel.writeInt(bool);
    bool = paramRemoteActionCompat.f;
    parama22.i(6);
    parcel.writeInt(bool);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\core\app\RemoteActionCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */