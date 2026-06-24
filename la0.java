import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class la0 implements Parcelable {
  public static final Parcelable.Creator<la0> CREATOR = new zb2(17);
  
  public final int A;
  
  public final int B;
  
  public final String C;
  
  public final int D;
  
  public int E;
  
  public final String b;
  
  public final String c;
  
  public final int e;
  
  public final int f;
  
  public final int g;
  
  public final String h;
  
  public final nx0 i;
  
  public final String j;
  
  public final String k;
  
  public final int l;
  
  public final List m;
  
  public final s10 n;
  
  public final long o;
  
  public final int p;
  
  public final int q;
  
  public final float r;
  
  public final int s;
  
  public final float t;
  
  public final int u;
  
  public final byte[] v;
  
  public final dn w;
  
  public final int x;
  
  public final int y;
  
  public final int z;
  
  public la0(Parcel paramParcel) {
    byte[] arrayOfByte;
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = paramParcel.readInt();
    this.h = paramParcel.readString();
    this.i = (nx0)paramParcel.readParcelable(nx0.class.getClassLoader());
    this.j = paramParcel.readString();
    this.k = paramParcel.readString();
    this.l = paramParcel.readInt();
    int j = paramParcel.readInt();
    this.m = new ArrayList(j);
    int i;
    for (i = 0; i < j; i++)
      this.m.add(paramParcel.createByteArray()); 
    this.n = (s10)paramParcel.readParcelable(s10.class.getClassLoader());
    this.o = paramParcel.readLong();
    this.p = paramParcel.readInt();
    this.q = paramParcel.readInt();
    this.r = paramParcel.readFloat();
    this.s = paramParcel.readInt();
    this.t = paramParcel.readFloat();
    i = d12.a;
    if (paramParcel.readInt() != 0) {
      arrayOfByte = paramParcel.createByteArray();
    } else {
      arrayOfByte = null;
    } 
    this.v = arrayOfByte;
    this.u = paramParcel.readInt();
    this.w = (dn)paramParcel.readParcelable(dn.class.getClassLoader());
    this.x = paramParcel.readInt();
    this.y = paramParcel.readInt();
    this.z = paramParcel.readInt();
    this.A = paramParcel.readInt();
    this.B = paramParcel.readInt();
    this.C = paramParcel.readString();
    this.D = paramParcel.readInt();
  }
  
  public la0(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, nx0 paramnx0, String paramString4, String paramString5, int paramInt4, List paramList, s10 params10, long paramLong, int paramInt5, int paramInt6, float paramFloat1, int paramInt7, float paramFloat2, byte[] paramArrayOfbyte, int paramInt8, dn paramdn, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, String paramString6, int paramInt14) {
    this.b = paramString1;
    this.c = paramString2;
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = paramString3;
    this.i = paramnx0;
    this.j = paramString4;
    this.k = paramString5;
    this.l = paramInt4;
    List list = paramList;
    if (paramList == null)
      list = Collections.EMPTY_LIST; 
    this.m = list;
    this.n = params10;
    this.o = paramLong;
    this.p = paramInt5;
    this.q = paramInt6;
    this.r = paramFloat1;
    paramInt2 = 0;
    paramInt1 = paramInt7;
    if (paramInt7 == -1)
      paramInt1 = 0; 
    this.s = paramInt1;
    if (paramFloat2 == -1.0F)
      paramFloat2 = 1.0F; 
    this.t = paramFloat2;
    this.v = paramArrayOfbyte;
    this.u = paramInt8;
    this.w = paramdn;
    this.x = paramInt9;
    this.y = paramInt10;
    this.z = paramInt11;
    paramInt1 = paramInt12;
    if (paramInt12 == -1)
      paramInt1 = 0; 
    this.A = paramInt1;
    if (paramInt13 == -1)
      paramInt13 = paramInt2; 
    this.B = paramInt13;
    this.C = d12.g(paramString6);
    this.D = paramInt14;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (paramObject != null && la0.class == paramObject.getClass()) {
        la0 la01 = (la0)paramObject;
        paramObject = la01.m;
        int i = this.E;
        if (i != 0) {
          int j = la01.E;
          if (j != 0 && i != j)
            return false; 
        } 
        if (this.e == la01.e && this.f == la01.f && this.g == la01.g && this.l == la01.l && this.o == la01.o && this.p == la01.p && this.q == la01.q && this.s == la01.s && this.u == la01.u && this.x == la01.x && this.y == la01.y && this.z == la01.z && this.A == la01.A && this.B == la01.B && this.D == la01.D && Float.compare(this.r, la01.r) == 0 && Float.compare(this.t, la01.t) == 0) {
          i = d12.a;
          if (d12.a(this.b, la01.b) && d12.a(this.c, la01.c) && d12.a(this.h, la01.h) && d12.a(this.j, la01.j) && d12.a(this.k, la01.k) && d12.a(this.C, la01.C) && Arrays.equals(this.v, la01.v) && d12.a(this.i, la01.i) && d12.a(this.w, la01.w) && d12.a(this.n, la01.n)) {
            List<byte[]> list = this.m;
            if (list.size() != paramObject.size())
              return false; 
            for (i = 0; i < list.size(); i++) {
              if (!Arrays.equals(list.get(i), paramObject.get(i)))
                // Byte code: goto -> 504 
            } 
            return true;
          } 
        } 
      } 
      return false;
    } 
    return true;
  }
  
  public final int hashCode() {
    if (this.E == 0) {
      int i;
      byte b;
      int j;
      int k;
      int m;
      int n;
      int i1 = 0;
      String str2 = this.b;
      if (str2 == null) {
        i = 0;
      } else {
        i = str2.hashCode();
      } 
      str2 = this.c;
      if (str2 != null) {
        b = str2.hashCode();
      } else {
        b = 0;
      } 
      int i3 = this.e;
      int i2 = this.f;
      int i4 = this.g;
      str2 = this.h;
      if (str2 == null) {
        j = 0;
      } else {
        j = str2.hashCode();
      } 
      nx0 nx01 = this.i;
      if (nx01 == null) {
        k = 0;
      } else {
        k = Arrays.hashCode((Object[])nx01.b);
      } 
      String str1 = this.j;
      if (str1 == null) {
        m = 0;
      } else {
        m = str1.hashCode();
      } 
      str1 = this.k;
      if (str1 == null) {
        n = 0;
      } else {
        n = str1.hashCode();
      } 
      int i9 = this.l;
      int i16 = (int)this.o;
      int i10 = this.p;
      int i5 = this.q;
      int i17 = Float.floatToIntBits(this.r);
      int i14 = this.s;
      int i15 = Float.floatToIntBits(this.t);
      int i12 = this.u;
      int i11 = this.x;
      int i7 = this.y;
      int i8 = this.z;
      int i6 = this.A;
      int i13 = this.B;
      str1 = this.C;
      if (str1 != null)
        i1 = str1.hashCode(); 
      this.E = (((((((((i15 + ((i17 + (((((((((((((527 + i) * 31 + b) * 31 + i3) * 31 + i2) * 31 + i4) * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i9) * 31 + i16) * 31 + i10) * 31 + i5) * 31) * 31 + i14) * 31) * 31 + i12) * 31 + i11) * 31 + i7) * 31 + i8) * 31 + i6) * 31 + i13) * 31 + i1) * 31 + this.D) * 31;
    } 
    return this.E;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Format(");
    stringBuilder.append(this.b);
    stringBuilder.append(", ");
    stringBuilder.append(this.c);
    stringBuilder.append(", ");
    stringBuilder.append(this.j);
    stringBuilder.append(", ");
    stringBuilder.append(this.k);
    stringBuilder.append(", ");
    stringBuilder.append(this.h);
    stringBuilder.append(", ");
    stringBuilder.append(this.g);
    stringBuilder.append(", ");
    stringBuilder.append(this.C);
    stringBuilder.append(", [");
    stringBuilder.append(this.p);
    stringBuilder.append(", ");
    stringBuilder.append(this.q);
    stringBuilder.append(", ");
    stringBuilder.append(this.r);
    stringBuilder.append(hbrAVtEa.jmwdVaLDVYy);
    stringBuilder.append(this.x);
    stringBuilder.append(", ");
    return x41.m(stringBuilder, this.y, "])");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeInt(this.g);
    paramParcel.writeString(this.h);
    nx0 nx01 = this.i;
    int j = 0;
    paramParcel.writeParcelable(nx01, 0);
    paramParcel.writeString(this.j);
    paramParcel.writeString(this.k);
    paramParcel.writeInt(this.l);
    List<byte[]> list = this.m;
    int k = list.size();
    paramParcel.writeInt(k);
    int i;
    for (i = 0; i < k; i++)
      paramParcel.writeByteArray(list.get(i)); 
    paramParcel.writeParcelable(this.n, 0);
    paramParcel.writeLong(this.o);
    paramParcel.writeInt(this.p);
    paramParcel.writeInt(this.q);
    paramParcel.writeFloat(this.r);
    paramParcel.writeInt(this.s);
    paramParcel.writeFloat(this.t);
    byte[] arrayOfByte = this.v;
    i = j;
    if (arrayOfByte != null)
      i = 1; 
    j = d12.a;
    paramParcel.writeInt(i);
    if (arrayOfByte != null)
      paramParcel.writeByteArray(arrayOfByte); 
    paramParcel.writeInt(this.u);
    paramParcel.writeParcelable(this.w, paramInt);
    paramParcel.writeInt(this.x);
    paramParcel.writeInt(this.y);
    paramParcel.writeInt(this.z);
    paramParcel.writeInt(this.A);
    paramParcel.writeInt(this.B);
    paramParcel.writeString(this.C);
    paramParcel.writeInt(this.D);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\la0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */