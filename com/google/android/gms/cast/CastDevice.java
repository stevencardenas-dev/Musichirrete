package com.google.android.gms.cast;

import android.net.Network;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import com.google.android.gms.common.internal.ReflectedParcelable;
import ec2;
import f0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import pk2;
import qj;
import qp0;
import qv;

public class CastDevice extends f0 implements ReflectedParcelable {
  public static final Parcelable.Creator<CastDevice> CREATOR = (Parcelable.Creator<CastDevice>)new pk2(14);
  
  public final String b;
  
  public final String c;
  
  public final InetAddress e;
  
  public final String f;
  
  public final String g;
  
  public final String h;
  
  public final int i;
  
  public final List j;
  
  public final qp0 k;
  
  public final int l;
  
  public final String m;
  
  public final String n;
  
  public final int o;
  
  public final String p;
  
  public final byte[] q;
  
  public final String r;
  
  public final boolean s;
  
  public final ec2 t;
  
  public final Integer u;
  
  public final Boolean v;
  
  public final Network w;
  
  public CastDevice(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, ArrayList paramArrayList, int paramInt2, int paramInt3, String paramString6, String paramString7, int paramInt4, String paramString8, byte[] paramArrayOfbyte, String paramString9, boolean paramBoolean, ec2 paramec2, Integer paramInteger, Boolean paramBoolean1, Network paramNetwork) {
    String str2 = "";
    String str1 = paramString1;
    if (paramString1 == null)
      str1 = ""; 
    this.b = str1;
    paramString1 = paramString2;
    if (paramString2 == null)
      paramString1 = ""; 
    this.c = paramString1;
    if (!TextUtils.isEmpty(paramString1))
      try {
        this.e = InetAddress.getByName(paramString1);
      } catch (UnknownHostException unknownHostException) {
        paramString1 = this.c;
        String str = unknownHostException.getMessage();
        StringBuilder stringBuilder = new StringBuilder(paramString1.length() + 48 + String.valueOf(str).length());
        stringBuilder.append("Unable to convert host address (");
        stringBuilder.append(paramString1);
        stringBuilder.append(") to ipaddress: ");
        stringBuilder.append(str);
        Log.i("CastDevice", stringBuilder.toString());
      }  
    paramString1 = paramString3;
    if (paramString3 == null)
      paramString1 = ""; 
    this.f = paramString1;
    paramString1 = paramString4;
    if (paramString4 == null)
      paramString1 = ""; 
    this.g = paramString1;
    paramString1 = paramString5;
    if (paramString5 == null)
      paramString1 = ""; 
    this.h = paramString1;
    this.i = paramInt1;
    ArrayList arrayList = paramArrayList;
    if (paramArrayList == null)
      arrayList = new ArrayList(); 
    this.j = arrayList;
    this.l = paramInt3;
    if (paramString6 == null)
      paramString6 = str2; 
    this.m = paramString6;
    this.n = paramString7;
    this.o = paramInt4;
    this.p = paramString8;
    this.q = paramArrayOfbyte;
    this.r = paramString9;
    this.s = paramBoolean;
    this.t = paramec2;
    this.u = paramInteger;
    this.v = paramBoolean1;
    this.w = paramNetwork;
    this.k = new qp0(paramInt2);
  }
  
  public static CastDevice e(Bundle paramBundle) {
    if (paramBundle != null) {
      ClassLoader classLoader = CastDevice.class.getClassLoader();
      if (classLoader != null) {
        paramBundle.setClassLoader(classLoader);
        return (CastDevice)paramBundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
      } 
    } 
    return null;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof CastDevice) {
      paramObject = paramObject;
      byte[] arrayOfByte = ((CastDevice)paramObject).q;
      int i = ((CastDevice)paramObject).i;
      String str = ((CastDevice)paramObject).h;
      if (qj.c(this.b, ((CastDevice)paramObject).b) && qj.c(this.e, ((CastDevice)paramObject).e) && qj.c(this.g, ((CastDevice)paramObject).g) && qj.c(this.f, ((CastDevice)paramObject).f)) {
        String str1 = this.h;
        if (qj.c(str1, str)) {
          int j = this.i;
          if (j == i && qj.c(this.j, ((CastDevice)paramObject).j) && this.k.b == ((CastDevice)paramObject).k.b && this.l == ((CastDevice)paramObject).l && qj.c(this.m, ((CastDevice)paramObject).m) && qj.c(Integer.valueOf(this.o), Integer.valueOf(((CastDevice)paramObject).o)) && qj.c(this.p, ((CastDevice)paramObject).p) && qj.c(this.n, ((CastDevice)paramObject).n) && qj.c(str1, str) && j == i) {
            byte[] arrayOfByte1 = this.q;
            if (((arrayOfByte1 == null && arrayOfByte == null) || Arrays.equals(arrayOfByte1, arrayOfByte)) && qj.c(this.r, ((CastDevice)paramObject).r) && this.s == ((CastDevice)paramObject).s && qj.c(f(), paramObject.f())) {
              boolean bool;
              boolean bool1 = j();
              if (paramObject.j() && qj.c(this.w, ((CastDevice)paramObject).w)) {
                bool = true;
              } else {
                bool = false;
              } 
              if (qj.c(Boolean.valueOf(bool1), Boolean.valueOf(bool)))
                return true; 
            } 
          } 
        } 
      } 
    } 
    return false;
  }
  
  public final ec2 f() {
    ec2 ec21 = this.t;
    return (ec21 == null && this.k.n()) ? new ec2(1, false, false, null, null, null, null, null, false, false) : ec21;
  }
  
  public final int hashCode() {
    return this.b.hashCode();
  }
  
  public final int i() {
    qp0 qp01 = this.k;
    return !qp01.l(64) ? (!qp01.m() ? (qp01.n() ? 5 : (qp01.l(1) ? 2 : 1)) : 3) : 4;
  }
  
  public final boolean j() {
    Boolean bool = this.v;
    if (bool != null)
      return bool.booleanValue(); 
    int i = this.l;
    return (i != -1 && (i & 0x2) > 0);
  }
  
  public final String toString() {
    String str2;
    qp0 qp01 = this.k;
    if (qp01.l(64)) {
      str2 = "[dynamic group]";
    } else if (qp01.m()) {
      str2 = "[static group]";
    } else if (qp01.n()) {
      str2 = "[speaker pair]";
    } else {
      str2 = "";
    } 
    String str3 = str2;
    if (qp01.l(262144))
      str3 = str2.concat("[cast connect]"); 
    Locale locale = Locale.ROOT;
    Pattern pattern = qj.a;
    String str4 = this.f;
    String str1 = str4;
    if (!TextUtils.isEmpty(str4)) {
      int i = str4.length();
      if (i <= 2) {
        if (i == 2) {
          str1 = "xx";
        } else {
          str1 = "x";
        } 
      } else {
        str1 = String.format(locale, "%c%d%c", new Object[] { Character.valueOf(str4.charAt(0)), Integer.valueOf(i - 2), Character.valueOf(str4.charAt(i - 1)) });
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder("\"");
    stringBuilder.append(str1);
    stringBuilder.append(xveccWbRzqx.IRqvgBrgFC);
    stringBuilder.append(this.b);
    stringBuilder.append(") ");
    stringBuilder.append(str3);
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 2, this.b);
    qv.v0(paramParcel, 3, this.c);
    qv.v0(paramParcel, 4, this.f);
    qv.v0(paramParcel, 5, this.g);
    qv.v0(paramParcel, 6, this.h);
    qv.C0(paramParcel, 7, 4);
    paramParcel.writeInt(this.i);
    qv.y0(paramParcel, 8, Collections.unmodifiableList(this.j));
    int j = this.k.b;
    qv.C0(paramParcel, 9, 4);
    paramParcel.writeInt(j);
    qv.C0(paramParcel, 10, 4);
    paramParcel.writeInt(this.l);
    qv.v0(paramParcel, 11, this.m);
    qv.v0(paramParcel, 12, this.n);
    qv.C0(paramParcel, 13, 4);
    paramParcel.writeInt(this.o);
    qv.v0(paramParcel, 14, this.p);
    byte[] arrayOfByte = this.q;
    if (arrayOfByte != null) {
      j = qv.D0(paramParcel, 15);
      paramParcel.writeByteArray(arrayOfByte);
      qv.G0(paramParcel, j);
    } 
    qv.v0(paramParcel, 16, this.r);
    qv.C0(paramParcel, 17, 4);
    paramParcel.writeInt(this.s);
    qv.u0(paramParcel, 18, (Parcelable)f(), paramInt);
    qv.s0(paramParcel, 19, this.u);
    qv.o0(paramParcel, 20, Boolean.valueOf(j()));
    qv.u0(paramParcel, 21, (Parcelable)this.w, paramInt);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\cast\CastDevice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */