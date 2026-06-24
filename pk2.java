import android.accounts.Account;
import android.net.Network;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.ArrayList;

public final class pk2 implements Parcelable.Creator {
  public final int a;
  
  public static void a(ud0 paramud0, Parcel paramParcel, int paramInt) {
    int j = qv.D0(paramParcel, 20293);
    int k = paramud0.b;
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(k);
    k = paramud0.c;
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(k);
    k = paramud0.e;
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(k);
    qv.v0(paramParcel, 4, paramud0.f);
    qv.q0(paramParcel, 5, paramud0.g);
    qv.x0(paramParcel, 6, (Parcelable[])paramud0.h, paramInt);
    qv.p0(paramParcel, 7, paramud0.i);
    qv.u0(paramParcel, 8, (Parcelable)paramud0.j, paramInt);
    qv.x0(paramParcel, 10, (Parcelable[])paramud0.k, paramInt);
    qv.x0(paramParcel, 11, (Parcelable[])paramud0.l, paramInt);
    boolean bool2 = paramud0.m;
    qv.C0(paramParcel, 12, 4);
    paramParcel.writeInt(bool2);
    int i = paramud0.n;
    qv.C0(paramParcel, 13, 4);
    paramParcel.writeInt(i);
    boolean bool1 = paramud0.o;
    qv.C0(paramParcel, 14, 4);
    paramParcel.writeInt(bool1);
    qv.v0(paramParcel, 15, paramud0.p);
    qv.G0(paramParcel, j);
  }
  
  public final Object createFromParcel(Parcel paramParcel) {
    Object object;
    double d;
    boolean bool2;
    int j;
    boolean bool1;
    int i;
    boolean bool5;
    int i1;
    boolean bool4;
    int n;
    boolean bool3;
    boolean bool6;
    int i3;
    boolean bool7;
    int i5;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    int i12;
    int i13;
    int i14;
    int i15;
    int i16;
    int i17;
    int i18;
    int i19;
    int i20;
    int i21;
    int i22;
    int i23;
    int i24;
    int i25;
    int i26;
    int i27;
    int i28;
    boolean bool8;
    int i29;
    boolean bool9;
    int i30;
    int i31;
    int i32;
    boolean bool14;
    boolean bool15;
    boolean bool16;
    boolean bool17;
    boolean bool18;
    boolean bool19;
    long l;
    String str4;
    IBinder iBinder1;
    byte[] arrayOfByte1;
    String str3;
    sl0 sl0;
    String str2;
    Account account;
    u70[] arrayOfU701;
    int[] arrayOfInt1;
    wp wp;
    String str1;
    String str5;
    lj lj;
    u70[] arrayOfU703;
    int[] arrayOfInt2;
    u70[] arrayOfU702;
    byte[] arrayOfByte2;
    int[] arrayOfInt3;
    IBinder iBinder4;
    String str8;
    ArrayList arrayList3;
    String str7;
    hh1 hh1;
    String str6;
    ArrayList arrayList4;
    IBinder iBinder6;
    String str9;
    bo2 bo2;
    u70[] arrayOfU704;
    IBinder iBinder7;
    ArrayList arrayList5;
    String str10;
    yo2 yo2;
    Bundle bundle2;
    IBinder iBinder8;
    String str11;
    ArrayList arrayList6;
    Scope[] arrayOfScope;
    IBinder iBinder10;
    String str12;
    IBinder iBinder9;
    IBinder iBinder11;
    String str13;
    IBinder iBinder12;
    String str14;
    IBinder iBinder13;
    ec2 ec2;
    IBinder iBinder14;
    Integer integer;
    IBinder iBinder15;
    Boolean bool;
    IBinder iBinder16;
    Network network;
    IBinder iBinder17;
    String str15;
    String str16;
    int i6 = this.a;
    IBinder iBinder5 = null;
    IBinder iBinder3 = null;
    IBinder iBinder2 = null;
    int i4 = 0;
    boolean bool13 = false;
    int k = 0;
    boolean bool11 = false;
    boolean bool12 = false;
    boolean bool10 = false;
    int i2 = 0;
    switch (i6) {
      default:
        i32 = ws2.q0(paramParcel);
        l = 0L;
        arrayList4 = null;
        iBinder5 = null;
        iBinder2 = iBinder5;
        iBinder3 = iBinder2;
        i31 = 0;
        i30 = 0;
        k = i30;
        i2 = k;
        i4 = i2;
        i6 = i4;
        i7 = i6;
        i8 = i7;
        i9 = i8;
        i10 = i9;
        i11 = i10;
        i12 = i11;
        i13 = i12;
        i14 = i13;
        i15 = i14;
        i16 = i15;
        i17 = i16;
        i18 = i17;
        i19 = i18;
        i20 = i19;
        i21 = i20;
        i22 = i21;
        i23 = i22;
        i24 = i23;
        i25 = i24;
        i26 = i25;
        i27 = i26;
        i28 = i27;
        i29 = i28;
        while (paramParcel.dataPosition() < i32) {
          int i33 = paramParcel.readInt();
          switch ((char)i33) {
            default:
              ws2.m0(paramParcel, i33);
              continue;
            case '#':
              bool9 = ws2.Z(paramParcel, i33);
              continue;
            case '"':
              bool8 = ws2.Z(paramParcel, i33);
              continue;
            case '!':
              iBinder3 = ws2.c0(paramParcel, i33);
              continue;
            case ' ':
              i27 = ws2.d0(paramParcel, i33);
              continue;
            case '\037':
              i26 = ws2.d0(paramParcel, i33);
              continue;
            case '\036':
              i25 = ws2.d0(paramParcel, i33);
              continue;
            case '\035':
              i24 = ws2.d0(paramParcel, i33);
              continue;
            case '\034':
              i23 = ws2.d0(paramParcel, i33);
              continue;
            case '\033':
              i22 = ws2.d0(paramParcel, i33);
              continue;
            case '\032':
              i21 = ws2.d0(paramParcel, i33);
              continue;
            case '\031':
              i20 = ws2.d0(paramParcel, i33);
              continue;
            case '\030':
              i19 = ws2.d0(paramParcel, i33);
              continue;
            case '\027':
              i18 = ws2.d0(paramParcel, i33);
              continue;
            case '\026':
              i17 = ws2.d0(paramParcel, i33);
              continue;
            case '\025':
              i16 = ws2.d0(paramParcel, i33);
              continue;
            case '\024':
              i15 = ws2.d0(paramParcel, i33);
              continue;
            case '\023':
              i14 = ws2.d0(paramParcel, i33);
              continue;
            case '\022':
              i13 = ws2.d0(paramParcel, i33);
              continue;
            case '\021':
              i12 = ws2.d0(paramParcel, i33);
              continue;
            case '\020':
              i11 = ws2.d0(paramParcel, i33);
              continue;
            case '\017':
              i10 = ws2.d0(paramParcel, i33);
              continue;
            case '\016':
              i9 = ws2.d0(paramParcel, i33);
              continue;
            case '\r':
              i8 = ws2.d0(paramParcel, i33);
              continue;
            case '\f':
              i7 = ws2.d0(paramParcel, i33);
              continue;
            case '\013':
              i6 = ws2.d0(paramParcel, i33);
              continue;
            case '\n':
              i4 = ws2.d0(paramParcel, i33);
              continue;
            case '\t':
              i2 = ws2.d0(paramParcel, i33);
              continue;
            case '\b':
              k = ws2.d0(paramParcel, i33);
              continue;
            case '\007':
              i30 = ws2.d0(paramParcel, i33);
              continue;
            case '\006':
              i31 = ws2.d0(paramParcel, i33);
              continue;
            case '\005':
              str4 = ws2.t(paramParcel, i33);
              continue;
            case '\004':
              l = ws2.g0(paramParcel, i33);
              continue;
            case '\003':
              arrayOfInt3 = ws2.p(paramParcel, i33);
              continue;
            case '\002':
              break;
          } 
          arrayList4 = ws2.u(paramParcel, i33);
        } 
        ws2.B(paramParcel, i32);
        return new a31(arrayList4, arrayOfInt3, l, str4, i31, i30, k, i2, i4, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder3, bool8, bool9);
      case 14:
        i8 = ws2.q0(paramParcel);
        i4 = -1;
        str16 = null;
        iBinder17 = null;
        iBinder3 = iBinder17;
        iBinder4 = iBinder3;
        iBinder6 = iBinder4;
        iBinder7 = iBinder6;
        iBinder8 = iBinder7;
        iBinder10 = iBinder8;
        iBinder11 = iBinder10;
        iBinder1 = iBinder11;
        iBinder12 = iBinder1;
        iBinder13 = iBinder12;
        iBinder14 = iBinder13;
        iBinder15 = iBinder14;
        iBinder16 = iBinder15;
        i7 = 0;
        i6 = 0;
        k = i6;
        i2 = k;
        while (paramParcel.dataPosition() < i8) {
          i9 = paramParcel.readInt();
          switch ((char)i9) {
            default:
              ws2.m0(paramParcel, i9);
              continue;
            case '\025':
              network = (Network)ws2.s(paramParcel, i9, Network.CREATOR);
              continue;
            case '\024':
              bool = ws2.a0(paramParcel, i9);
              continue;
            case '\023':
              integer = ws2.e0(paramParcel, i9);
              continue;
            case '\022':
              ec2 = (ec2)ws2.s(paramParcel, i9, ec2.CREATOR);
              continue;
            case '\021':
              bool5 = ws2.Z(paramParcel, i9);
              continue;
            case '\020':
              str14 = ws2.t(paramParcel, i9);
              continue;
            case '\017':
              i9 = ws2.h0(paramParcel, i9);
              i10 = paramParcel.dataPosition();
              if (i9 == 0) {
                iBinder1 = null;
                continue;
              } 
              arrayOfByte1 = paramParcel.createByteArray();
              paramParcel.setDataPosition(i10 + i9);
              continue;
            case '\016':
              str13 = ws2.t(paramParcel, i9);
              continue;
            case '\r':
              k = ws2.d0(paramParcel, i9);
              continue;
            case '\f':
              str12 = ws2.t(paramParcel, i9);
              continue;
            case '\013':
              str11 = ws2.t(paramParcel, i9);
              continue;
            case '\n':
              i4 = ws2.d0(paramParcel, i9);
              continue;
            case '\t':
              i6 = ws2.d0(paramParcel, i9);
              continue;
            case '\b':
              arrayList5 = ws2.w(paramParcel, i9, i52.CREATOR);
              continue;
            case '\007':
              i7 = ws2.d0(paramParcel, i9);
              continue;
            case '\006':
              str9 = ws2.t(paramParcel, i9);
              continue;
            case '\005':
              str8 = ws2.t(paramParcel, i9);
              continue;
            case '\004':
              str5 = ws2.t(paramParcel, i9);
              continue;
            case '\003':
              str15 = ws2.t(paramParcel, i9);
              continue;
            case '\002':
              break;
          } 
          str16 = ws2.t(paramParcel, i9);
        } 
        ws2.B(paramParcel, i8);
        return new CastDevice(str16, str15, str5, str8, str9, i7, arrayList5, i6, i4, str11, str12, k, str13, arrayOfByte1, str14, bool5, ec2, integer, bool, network);
      case 13:
        i4 = ws2.q0(paramParcel);
        str5 = null;
        bool2 = bool5;
        while (paramParcel.dataPosition() < i4) {
          i6 = paramParcel.readInt();
          char c = (char)i6;
          if (c != '\002') {
            if (c != '\003') {
              if (c != '\004') {
                ws2.m0(paramParcel, i6);
                continue;
              } 
              str5 = ws2.t(paramParcel, i6);
              continue;
            } 
            j = ws2.d0(paramParcel, i6);
            continue;
          } 
          str3 = ws2.t(paramParcel, i6);
        } 
        ws2.B(paramParcel, i4);
        return new m21(str3, j, str5);
      case 12:
        i1 = ws2.q0(paramParcel);
        d = 0.0D;
        str12 = null;
        str11 = null;
        str3 = str11;
        str5 = str3;
        str8 = str5;
        str9 = str8;
        str10 = str9;
        bool19 = false;
        bool18 = false;
        bool10 = bool18;
        bool11 = bool10;
        bool12 = bool11;
        bool13 = bool12;
        bool14 = bool13;
        bool15 = bool14;
        bool16 = bool15;
        bool17 = bool16;
        while (paramParcel.dataPosition() < i1) {
          j = paramParcel.readInt();
          switch ((char)j) {
            default:
              ws2.m0(paramParcel, j);
              continue;
            case '\024':
              bool17 = ws2.Z(paramParcel, j);
              continue;
            case '\023':
              bool16 = ws2.Z(paramParcel, j);
              continue;
            case '\022':
              yo2 = (yo2)ws2.s(paramParcel, j, yo2.CREATOR);
              continue;
            case '\021':
              bo2 = (bo2)ws2.s(paramParcel, j, bo2.CREATOR);
              continue;
            case '\020':
              bool15 = ws2.Z(paramParcel, j);
              continue;
            case '\017':
              ws2.d0(paramParcel, j);
              continue;
            case '\016':
              bool14 = ws2.Z(paramParcel, j);
              continue;
            case '\r':
              arrayList3 = ws2.u(paramParcel, j);
              continue;
            case '\f':
              bool13 = ws2.Z(paramParcel, j);
              continue;
            case '\013':
              bool12 = ws2.Z(paramParcel, j);
              continue;
            case '\n':
              bool11 = ws2.Z(paramParcel, j);
              continue;
            case '\t':
              d = ws2.b0(paramParcel, j);
              continue;
            case '\b':
              bool10 = ws2.Z(paramParcel, j);
              continue;
            case '\007':
              lj = (lj)ws2.s(paramParcel, j, lj.CREATOR);
              continue;
            case '\006':
              bool18 = ws2.Z(paramParcel, j);
              continue;
            case '\005':
              sl0 = (sl0)ws2.s(paramParcel, j, sl0.CREATOR);
              continue;
            case '\004':
              bool19 = ws2.Z(paramParcel, j);
              continue;
            case '\003':
              arrayList6 = ws2.u(paramParcel, j);
              continue;
            case '\002':
              break;
          } 
          str12 = ws2.t(paramParcel, j);
        } 
        ws2.B(paramParcel, i1);
        return new mj(str12, arrayList6, bool19, sl0, bool18, lj, bool10, d, bool11, bool12, bool13, arrayList3, bool14, bool15, bo2, yo2, bool16, bool17);
      case 11:
        i1 = ws2.q0(paramParcel);
        for (j = i4; paramParcel.dataPosition() < i1; j = ws2.d0(paramParcel, i4)) {
          i4 = paramParcel.readInt();
          if ((char)i4 != '\002') {
            ws2.m0(paramParcel, i4);
            continue;
          } 
        } 
        ws2.B(paramParcel, i1);
        return new yo2(j);
      case 10:
        i9 = ws2.q0(paramParcel);
        bundle2 = new Bundle();
        arrayOfScope = ud0.q;
        arrayOfU703 = ud0.r;
        arrayOfU704 = arrayOfU703;
        str13 = null;
        str12 = null;
        str2 = str12;
        str7 = str2;
        i8 = 0;
        i7 = 0;
        j = i7;
        i1 = j;
        i4 = i1;
        i6 = i4;
        while (paramParcel.dataPosition() < i9) {
          i10 = paramParcel.readInt();
          switch ((char)i10) {
            default:
              ws2.m0(paramParcel, i10);
              continue;
            case '\017':
              str7 = ws2.t(paramParcel, i10);
              continue;
            case '\016':
              bool7 = ws2.Z(paramParcel, i10);
              continue;
            case '\r':
              i4 = ws2.d0(paramParcel, i10);
              continue;
            case '\f':
              bool4 = ws2.Z(paramParcel, i10);
              continue;
            case '\013':
              arrayOfU704 = (u70[])ws2.v(paramParcel, i10, u70.CREATOR);
              continue;
            case '\n':
              arrayOfU703 = (u70[])ws2.v(paramParcel, i10, u70.CREATOR);
              continue;
            case '\b':
              account = (Account)ws2.s(paramParcel, i10, Account.CREATOR);
              continue;
            case '\007':
              bundle2 = ws2.m(paramParcel, i10);
              continue;
            case '\006':
              arrayOfScope = (Scope[])ws2.v(paramParcel, i10, Scope.CREATOR);
              continue;
            case '\005':
              iBinder9 = ws2.c0(paramParcel, i10);
              continue;
            case '\004':
              str13 = ws2.t(paramParcel, i10);
              continue;
            case '\003':
              j = ws2.d0(paramParcel, i10);
              continue;
            case '\002':
              i7 = ws2.d0(paramParcel, i10);
              continue;
            case '\001':
              break;
          } 
          i8 = ws2.d0(paramParcel, i10);
        } 
        ws2.B(paramParcel, i9);
        return new ud0(i8, i7, j, str13, iBinder9, arrayOfScope, bundle2, account, arrayOfU703, arrayOfU704, bool4, i4, bool7, str7);
      case 9:
        j = ws2.q0(paramParcel);
        for (bool10 = bool13; paramParcel.dataPosition() < j; bool10 = ws2.Z(paramParcel, i33)) {
          int i33 = paramParcel.readInt();
          if ((char)i33 != '\002') {
            ws2.m0(paramParcel, i33);
            continue;
          } 
        } 
        ws2.B(paramParcel, j);
        return new bo2(bool10);
      case 8:
        i4 = ws2.q0(paramParcel);
        str7 = null;
        arrayOfU703 = null;
        arrayOfU701 = arrayOfU703;
        bool10 = false;
        bool4 = false;
        bool1 = bool4;
        while (paramParcel.dataPosition() < i4) {
          int i33 = paramParcel.readInt();
          switch ((char)i33) {
            default:
              ws2.m0(paramParcel, i33);
              continue;
            case '\006':
              arrayOfInt1 = ws2.p(paramParcel, i33);
              continue;
            case '\005':
              i = ws2.d0(paramParcel, i33);
              continue;
            case '\004':
              arrayOfInt2 = ws2.p(paramParcel, i33);
              continue;
            case '\003':
              bool4 = ws2.Z(paramParcel, i33);
              continue;
            case '\002':
              bool10 = ws2.Z(paramParcel, i33);
              continue;
            case '\001':
              break;
          } 
          hh1 = (hh1)ws2.s(paramParcel, i33, hh1.CREATOR);
        } 
        ws2.B(paramParcel, i4);
        return new wp(hh1, bool10, bool4, arrayOfInt2, i, arrayOfInt1);
      case 7:
        n = ws2.q0(paramParcel);
        arrayOfInt1 = null;
        i = 0;
        arrayOfInt2 = null;
        while (paramParcel.dataPosition() < n) {
          i4 = paramParcel.readInt();
          char c = (char)i4;
          if (c != '\001') {
            if (c != '\002') {
              if (c != '\003') {
                if (c != '\004') {
                  ws2.m0(paramParcel, i4);
                  continue;
                } 
                wp = (wp)ws2.s(paramParcel, i4, wp.CREATOR);
                continue;
              } 
              i = ws2.d0(paramParcel, i4);
              continue;
            } 
            arrayOfU702 = (u70[])ws2.v(paramParcel, i4, u70.CREATOR);
            continue;
          } 
          bundle1 = ws2.m(paramParcel, i4);
        } 
        ws2.B(paramParcel, n);
        object = new Object();
        ((gn2)object).b = bundle1;
        ((gn2)object).c = arrayOfU702;
        ((gn2)object).e = i;
        ((gn2)object).f = wp;
        return object;
      case 6:
        return new BinderWrapper((Parcel)object);
      case 5:
        i5 = ws2.q0((Parcel)object);
        i4 = 0;
        n = 0;
        while (object.dataPosition() < i5) {
          i8 = object.readInt();
          i7 = (char)i8;
          if (i7 != 2) {
            if (i7 != 3) {
              if (i7 != 4) {
                ws2.m0((Parcel)object, i8);
                continue;
              } 
              n = ws2.d0((Parcel)object, i8);
              continue;
            } 
            i4 = ws2.d0((Parcel)object, i8);
            continue;
          } 
          i = ws2.d0((Parcel)object, i8);
        } 
        ws2.B((Parcel)object, i5);
        return new gh0(i, i4, n);
      case 4:
        i7 = ws2.q0((Parcel)object);
        arrayOfU702 = null;
        wp = null;
        i5 = 0;
        i4 = 0;
        i = i4;
        n = i;
        while (object.dataPosition() < i7) {
          i8 = object.readInt();
          switch ((char)i8) {
            default:
              ws2.m0((Parcel)object, i8);
              continue;
            case '\007':
              bool3 = ws2.Z((Parcel)object, i8);
              continue;
            case '\006':
              str1 = ws2.t((Parcel)object, i8);
              continue;
            case '\005':
              i = ws2.d0((Parcel)object, i8);
              continue;
            case '\004':
              arrayList2 = ws2.u((Parcel)object, i8);
              continue;
            case '\003':
              bool6 = ws2.Z((Parcel)object, i8);
              continue;
            case '\002':
              break;
          } 
          i5 = ws2.d0((Parcel)object, i8);
        } 
        ws2.B((Parcel)object, i7);
        return new ml2(i5, bool6, arrayList2, i, str1, bool3);
      case 3:
        m = ws2.q0((Parcel)object);
        bool12 = false;
        i = 0;
        bool10 = bool11;
        bool11 = bool12;
        while (object.dataPosition() < m) {
          int i33 = object.readInt();
          i5 = (char)i33;
          if (i5 != 2) {
            if (i5 != 3) {
              if (i5 != 4) {
                ws2.m0((Parcel)object, i33);
                continue;
              } 
              i = ws2.d0((Parcel)object, i33);
              continue;
            } 
            bool11 = ws2.Z((Parcel)object, i33);
            continue;
          } 
          bool10 = ws2.Z((Parcel)object, i33);
        } 
        ws2.B((Parcel)object, m);
        return new zk2(i, bool10, bool11);
      case 2:
        m = ws2.q0((Parcel)object);
        i = 0;
        for (bool10 = bool12; object.dataPosition() < m; bool10 = ws2.Z((Parcel)object, i5)) {
          i5 = object.readInt();
          char c = (char)i5;
          if (c != '\002') {
            if (c != '\003') {
              ws2.m0((Parcel)object, i5);
              continue;
            } 
            i = ws2.d0((Parcel)object, i5);
            continue;
          } 
        } 
        ws2.B((Parcel)object, m);
        return new tk2(i, bool10);
      case 1:
        i3 = ws2.q0((Parcel)object);
        bool11 = false;
        for (arrayList1 = arrayList2; object.dataPosition() < i3; arrayList1 = ws2.w((Parcel)object, i, qk2.CREATOR)) {
          i = object.readInt();
          m = (char)i;
          if (m != 1) {
            if (m != 2) {
              if (m != 3) {
                ws2.m0((Parcel)object, i);
                continue;
              } 
              bool11 = ws2.Z((Parcel)object, i);
              continue;
            } 
            bool10 = ws2.Z((Parcel)object, i);
            continue;
          } 
        } 
        ws2.B((Parcel)object, i3);
        return new sk2(arrayList1, bool10, bool11);
      case 0:
        break;
    } 
    int m = ws2.q0((Parcel)object);
    Bundle bundle1 = null;
    ArrayList<Integer> arrayList2 = null;
    ArrayList<Integer> arrayList1 = arrayList2;
    while (object.dataPosition() < m) {
      i = object.readInt();
      i3 = (char)i;
      if (i3 != 1) {
        if (i3 != 2) {
          if (i3 != 3) {
            ws2.m0((Parcel)object, i);
            continue;
          } 
          i5 = ws2.h0((Parcel)object, i);
          i7 = object.dataPosition();
          if (i5 == 0) {
            arrayList1 = null;
            continue;
          } 
          arrayList1 = new ArrayList();
          i3 = object.readInt();
          for (i = 0; i < i3; i++)
            arrayList1.add(Integer.valueOf(object.readInt())); 
          object.setDataPosition(i7 + i5);
          continue;
        } 
        i = ws2.h0((Parcel)object, i);
        i3 = object.dataPosition();
        if (i == 0) {
          arrayList2 = null;
          continue;
        } 
        arrayOfByte2 = object.createByteArray();
        object.setDataPosition(i3 + i);
        continue;
      } 
      str6 = ws2.t((Parcel)object, i);
    } 
    ws2.B((Parcel)object, m);
    return new qk2(str6, arrayOfByte2, arrayList1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */