import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MyMediaBrowserCompat2;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

public final class lx0 implements Parcelable.Creator {
  public final int a;
  
  public final Object createFromParcel(Parcel paramParcel) {
    Object object1;
    long l1;
    long l2;
    IBinder iBinder2;
    sp sp2;
    IBinder iBinder1;
    Account account;
    String str4;
    sp sp1;
    String str3;
    ArrayList arrayList2;
    Uri uri1;
    String str2;
    Intent intent;
    String str1;
    ArrayList arrayList1;
    Object object2;
    IBinder iBinder3;
    String str8;
    GoogleSignInAccount googleSignInAccount;
    String str7;
    sb2 sb2;
    String str6;
    Uri uri2;
    String str5;
    Object object3;
    String str9;
    Uri uri3;
    IBinder iBinder4;
    Uri uri4;
    String str10;
    String str12;
    Uri uri6;
    ArrayList arrayList3;
    String str13;
    Uri uri8;
    String str14;
    Uri uri9;
    String str15;
    String str16;
    int i1 = this.a;
    boolean bool1 = true;
    boolean bool2 = true;
    int n = 0;
    int i = 0;
    int k = 0;
    int m = 0;
    int j = 0;
    a31 a313 = null;
    String str11 = null;
    ArrayList arrayList4 = null;
    Uri uri7 = null;
    Uri uri5 = null;
    a31 a311 = null;
    a31 a312 = null;
    switch (i1) {
      default:
        i = ws2.q0(paramParcel);
        bool2 = false;
        bool1 = false;
        str11 = null;
        a313 = null;
        a311 = a313;
        a312 = a311;
        while (paramParcel.dataPosition() < i) {
          j = paramParcel.readInt();
          switch ((char)j) {
            default:
              ws2.m0(paramParcel, j);
              continue;
            case '\007':
              bool1 = ws2.Z(paramParcel, j);
              continue;
            case '\006':
              bool2 = ws2.Z(paramParcel, j);
              continue;
            case '\005':
              a312 = (a31)ws2.s(paramParcel, j, a31.CREATOR);
              continue;
            case '\004':
              iBinder2 = ws2.c0(paramParcel, j);
              continue;
            case '\003':
              str9 = ws2.t(paramParcel, j);
              continue;
            case '\002':
              break;
          } 
          str11 = ws2.t(paramParcel, j);
        } 
        ws2.B(paramParcel, i);
        return new lj(str11, str9, iBinder2, a312, bool2, bool1);
      case 28:
        j = ws2.q0(paramParcel);
        i = 0;
        bool2 = false;
        bool1 = bool2;
        a312 = null;
        iBinder2 = null;
        while (paramParcel.dataPosition() < j) {
          k = paramParcel.readInt();
          m = (char)k;
          if (m != 1) {
            if (m != 2) {
              if (m != 3) {
                if (m != 4) {
                  if (m != 5) {
                    ws2.m0(paramParcel, k);
                    continue;
                  } 
                  bool1 = ws2.Z(paramParcel, k);
                  continue;
                } 
                bool2 = ws2.Z(paramParcel, k);
                continue;
              } 
              sp2 = (sp)ws2.s(paramParcel, k, sp.CREATOR);
              continue;
            } 
            iBinder3 = ws2.c0(paramParcel, k);
            continue;
          } 
          i = ws2.d0(paramParcel, k);
        } 
        ws2.B(paramParcel, j);
        return new sb2(i, iBinder3, sp2, bool2, bool1);
      case 27:
        m = ws2.q0(paramParcel);
        k = 0;
        str9 = null;
        iBinder1 = iBinder3;
        i = j;
        str8 = str9;
        j = k;
        while (paramParcel.dataPosition() < m) {
          n = paramParcel.readInt();
          k = (char)n;
          if (k != 1) {
            if (k != 2) {
              if (k != 3) {
                if (k != 4) {
                  ws2.m0(paramParcel, n);
                  continue;
                } 
                googleSignInAccount = (GoogleSignInAccount)ws2.s(paramParcel, n, GoogleSignInAccount.CREATOR);
                continue;
              } 
              j = ws2.d0(paramParcel, n);
              continue;
            } 
            account = (Account)ws2.s(paramParcel, n, Account.CREATOR);
            continue;
          } 
          i = ws2.d0(paramParcel, n);
        } 
        ws2.B(paramParcel, m);
        return new rb2(i, account, j, googleSignInAccount);
      case 26:
        i1 = ws2.q0(paramParcel);
        l2 = 0L;
        l1 = 0L;
        j = -1;
        n = 0;
        m = 0;
        i = m;
        k = i;
        googleSignInAccount = null;
        account = null;
        while (paramParcel.dataPosition() < i1) {
          int i2 = paramParcel.readInt();
          switch ((char)i2) {
            default:
              ws2.m0(paramParcel, i2);
              continue;
            case '\t':
              j = ws2.d0(paramParcel, i2);
              continue;
            case '\b':
              k = ws2.d0(paramParcel, i2);
              continue;
            case '\007':
              str4 = ws2.t(paramParcel, i2);
              continue;
            case '\006':
              str7 = ws2.t(paramParcel, i2);
              continue;
            case '\005':
              l1 = ws2.g0(paramParcel, i2);
              continue;
            case '\004':
              l2 = ws2.g0(paramParcel, i2);
              continue;
            case '\003':
              i = ws2.d0(paramParcel, i2);
              continue;
            case '\002':
              m = ws2.d0(paramParcel, i2);
              continue;
            case '\001':
              break;
          } 
          n = ws2.d0(paramParcel, i2);
        } 
        ws2.B(paramParcel, i1);
        return new px0(n, m, i, l2, l1, str7, str4, k, j);
      case 25:
        j = ws2.q0(paramParcel);
        str7 = null;
        str4 = str9;
        for (i = n; paramParcel.dataPosition() < j; i = ws2.d0(paramParcel, k)) {
          k = paramParcel.readInt();
          m = (char)k;
          if (m != 1) {
            if (m != 2) {
              if (m != 3) {
                ws2.m0(paramParcel, k);
                continue;
              } 
              sb2 = (sb2)ws2.s(paramParcel, k, sb2.CREATOR);
              continue;
            } 
            sp1 = (sp)ws2.s(paramParcel, k, sp.CREATOR);
            continue;
          } 
        } 
        ws2.B(paramParcel, j);
        return new nb2(i, sp1, sb2);
      case 24:
        i = ws2.q0(paramParcel);
        sb2 = null;
        str3 = str11;
        while (paramParcel.dataPosition() < i) {
          j = paramParcel.readInt();
          k = (char)j;
          if (k != 1) {
            if (k != 2) {
              ws2.m0(paramParcel, j);
              continue;
            } 
            str6 = ws2.t(paramParcel, j);
            continue;
          } 
          arrayList2 = ws2.u(paramParcel, j);
        } 
        ws2.B(paramParcel, i);
        return new kb2(str6, arrayList2);
      case 23:
        m = ws2.q0(paramParcel);
        k = 0;
        j = 0;
        arrayList2 = arrayList4;
        while (paramParcel.dataPosition() < m) {
          n = paramParcel.readInt();
          i1 = (char)n;
          if (i1 != 1) {
            if (i1 != 2) {
              if (i1 != 3) {
                if (i1 != 4) {
                  ws2.m0(paramParcel, n);
                  continue;
                } 
                j = ws2.d0(paramParcel, n);
                continue;
              } 
              k = ws2.d0(paramParcel, n);
              continue;
            } 
            uri1 = (Uri)ws2.s(paramParcel, n, Uri.CREATOR);
            continue;
          } 
          i = ws2.d0(paramParcel, n);
        } 
        ws2.B(paramParcel, m);
        return new i52(i, uri1, k, j);
      case 22:
        i = ws2.q0(paramParcel);
        l1 = 0L;
        str16 = null;
        uri9 = null;
        uri1 = uri9;
        uri2 = uri1;
        uri3 = uri2;
        uri4 = uri3;
        uri5 = uri4;
        uri6 = uri5;
        uri7 = uri6;
        uri8 = uri7;
        while (paramParcel.dataPosition() < i) {
          j = paramParcel.readInt();
          switch ((char)j) {
            default:
              ws2.m0(paramParcel, j);
              continue;
            case '\f':
              str14 = ws2.t(paramParcel, j);
              continue;
            case '\013':
              str13 = ws2.t(paramParcel, j);
              continue;
            case '\n':
              arrayList3 = ws2.w(paramParcel, j, Scope.CREATOR);
              continue;
            case '\t':
              str12 = ws2.t(paramParcel, j);
              continue;
            case '\b':
              l1 = ws2.g0(paramParcel, j);
              continue;
            case '\007':
              str10 = ws2.t(paramParcel, j);
              continue;
            case '\006':
              uri3 = (Uri)ws2.s(paramParcel, j, Uri.CREATOR);
              continue;
            case '\005':
              str5 = ws2.t(paramParcel, j);
              continue;
            case '\004':
              str2 = ws2.t(paramParcel, j);
              continue;
            case '\003':
              str15 = ws2.t(paramParcel, j);
              continue;
            case '\002':
              break;
          } 
          str16 = ws2.t(paramParcel, j);
        } 
        ws2.B(paramParcel, i);
        return new GoogleSignInAccount(str16, str15, str2, str5, uri3, str10, l1, str12, arrayList3, str13, str14);
      case 21:
        m = ws2.q0(paramParcel);
        j = 0;
        str2 = str13;
        for (i = k; paramParcel.dataPosition() < m; i = ws2.d0(paramParcel, n)) {
          n = paramParcel.readInt();
          k = (char)n;
          if (k != 1) {
            if (k != 2) {
              if (k != 3) {
                ws2.m0(paramParcel, n);
                continue;
              } 
              intent = (Intent)ws2.s(paramParcel, n, Intent.CREATOR);
              continue;
            } 
            j = ws2.d0(paramParcel, n);
            continue;
          } 
        } 
        ws2.B(paramParcel, m);
        return new ma2(i, j, intent);
      case 20:
        j = ws2.q0(paramParcel);
        str1 = str12;
        for (i = m; paramParcel.dataPosition() < j; i = ws2.d0(paramParcel, m)) {
          m = paramParcel.readInt();
          k = (char)m;
          if (k != 1) {
            if (k != 2) {
              ws2.m0(paramParcel, m);
              continue;
            } 
            arrayList1 = ws2.w(paramParcel, m, px0.CREATOR);
            continue;
          } 
        } 
        ws2.B(paramParcel, j);
        return new rt1(i, arrayList1);
      case 19:
        return new hy1(paramParcel);
      case 18:
        return new yv1(paramParcel);
      case 17:
        return new vv1(paramParcel);
      case 16:
        return new uv1(paramParcel);
      case 15:
        object2 = new Object();
        ((zo1)object2).b = paramParcel.readInt();
        ((zo1)object2).c = paramParcel.readInt();
        i = paramParcel.readInt();
        ((zo1)object2).e = i;
        if (i > 0) {
          int[] arrayOfInt = new int[i];
          ((zo1)object2).f = arrayOfInt;
          paramParcel.readIntArray(arrayOfInt);
        } 
        i = paramParcel.readInt();
        ((zo1)object2).g = i;
        if (i > 0) {
          int[] arrayOfInt = new int[i];
          ((zo1)object2).h = arrayOfInt;
          paramParcel.readIntArray(arrayOfInt);
        } 
        if (paramParcel.readInt() == 1) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        ((zo1)object2).j = bool1;
        if (paramParcel.readInt() == 1) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        ((zo1)object2).k = bool1;
        if (paramParcel.readInt() == 1) {
          bool1 = bool2;
        } else {
          bool1 = false;
        } 
        ((zo1)object2).l = bool1;
        ((zo1)object2).i = paramParcel.readArrayList(yo1.class.getClassLoader());
        return object2;
      case 14:
        object2 = new Object();
        ((yo1)object2).b = paramParcel.readInt();
        ((yo1)object2).c = paramParcel.readInt();
        if (paramParcel.readInt() != 1)
          bool1 = false; 
        ((yo1)object2).f = bool1;
        i = paramParcel.readInt();
        if (i > 0) {
          int[] arrayOfInt = new int[i];
          ((yo1)object2).e = arrayOfInt;
          paramParcel.readIntArray(arrayOfInt);
        } 
        return object2;
      case 13:
        return new ak1(paramParcel);
      case 12:
        object3 = new Object();
        iBinder4 = paramParcel.readStrongBinder();
        i = tg1.f;
        if (iBinder4 == null) {
          object1 = object2;
        } else {
          object1 = iBinder4.queryLocalInterface(vg0.d);
          if (object1 != null && object1 instanceof vg0) {
            object1 = object1;
          } else {
            object1 = new Object();
            ((ug0)object1).e = iBinder4;
          } 
        } 
        ((ug1)object3).b = (vg0)object1;
        return object3;
      case 11:
        return new RatingCompat(object1.readInt(), object1.readFloat());
      case 10:
        return new yc1((Parcel)object1);
      case 9:
        return new xc1((Parcel)object1);
      case 8:
        return new x91((Parcel)object1);
      case 7:
        return new l91((Parcel)object1);
      case 6:
        return new PlaybackStateCompat((Parcel)object1);
      case 5:
        object2 = new Object();
        ((ParcelableVolumeInfo)object2).b = object1.readInt();
        ((ParcelableVolumeInfo)object2).e = object1.readInt();
        ((ParcelableVolumeInfo)object2).f = object1.readInt();
        ((ParcelableVolumeInfo)object2).g = object1.readInt();
        ((ParcelableVolumeInfo)object2).c = object1.readInt();
        return object2;
      case 4:
        return new ParcelImpl((Parcel)object1);
      case 3:
        object2 = new View.BaseSavedState((Parcel)object1);
        ((k11)object2).b = object1.readInt();
        return object2;
      case 2:
        return new MyMediaBrowserCompat2.MediaItem((Parcel)object1);
      case 1:
        return new ny0((Parcel)object1);
      case 0:
        break;
    } 
    return new nx0((Parcel)object1);
  }
  
  public final Object[] newArray(int paramInt) {
    switch (this.a) {
      default:
        return (Object[])new lj[paramInt];
      case 28:
        return (Object[])new sb2[paramInt];
      case 27:
        return (Object[])new rb2[paramInt];
      case 26:
        return (Object[])new px0[paramInt];
      case 25:
        return (Object[])new nb2[paramInt];
      case 24:
        return (Object[])new kb2[paramInt];
      case 23:
        return (Object[])new i52[paramInt];
      case 22:
        return (Object[])new GoogleSignInAccount[paramInt];
      case 21:
        return (Object[])new ma2[paramInt];
      case 20:
        return (Object[])new rt1[paramInt];
      case 19:
        return (Object[])new hy1[paramInt];
      case 18:
        return (Object[])new yv1[paramInt];
      case 17:
        return (Object[])new vv1[paramInt];
      case 16:
        return (Object[])new uv1[paramInt];
      case 15:
        return (Object[])new zo1[paramInt];
      case 14:
        return (Object[])new yo1[paramInt];
      case 13:
        return (Object[])new ak1[paramInt];
      case 12:
        return (Object[])new ug1[paramInt];
      case 11:
        return (Object[])new RatingCompat[paramInt];
      case 10:
        return (Object[])new yc1[paramInt];
      case 9:
        return (Object[])new xc1[paramInt];
      case 8:
        return (Object[])new x91[paramInt];
      case 7:
        return (Object[])new l91[paramInt];
      case 6:
        return (Object[])new PlaybackStateCompat[paramInt];
      case 5:
        return (Object[])new ParcelableVolumeInfo[paramInt];
      case 4:
        return (Object[])new ParcelImpl[paramInt];
      case 3:
        return (Object[])new k11[paramInt];
      case 2:
        return (Object[])new MyMediaBrowserCompat2.MediaItem[paramInt];
      case 1:
        return (Object[])new ny0[paramInt];
      case 0:
        break;
    } 
    return (Object[])new nx0[paramInt];
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */