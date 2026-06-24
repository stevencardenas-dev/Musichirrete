import android.os.Parcel;
import android.os.Parcelable;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public final class rb0 implements Parcelable {
  public static final Parcelable.Creator<rb0> CREATOR = new zb2(20);
  
  public final String b;
  
  public final String c;
  
  public final boolean e;
  
  public final boolean f;
  
  public final int g;
  
  public final int h;
  
  public final String i;
  
  public final boolean j;
  
  public final boolean k;
  
  public final boolean l;
  
  public final boolean m;
  
  public final int n;
  
  public final String o;
  
  public final int p;
  
  public final boolean q;
  
  public rb0(Parcel paramParcel) {
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    int i = paramParcel.readInt();
    boolean bool2 = false;
    if (i != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.e = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.f = bool1;
    this.g = paramParcel.readInt();
    this.h = paramParcel.readInt();
    this.i = paramParcel.readString();
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.j = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.k = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.l = bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    this.m = bool1;
    this.n = paramParcel.readInt();
    this.o = paramParcel.readString();
    this.p = paramParcel.readInt();
    boolean bool1 = bool2;
    if (paramParcel.readInt() != 0)
      bool1 = true; 
    this.q = bool1;
  }
  
  public rb0(ua0 paramua0) {
    this.b = paramua0.getClass().getName();
    this.c = paramua0.h;
    this.e = paramua0.q;
    this.f = paramua0.s;
    this.g = paramua0.A;
    this.h = paramua0.B;
    this.i = paramua0.C;
    this.j = paramua0.F;
    this.k = paramua0.o;
    this.l = paramua0.E;
    this.m = paramua0.D;
    this.n = paramua0.S.ordinal();
    this.o = paramua0.k;
    this.p = paramua0.l;
    this.q = paramua0.M;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("FragmentState{");
    stringBuilder.append(this.b);
    stringBuilder.append(" (");
    stringBuilder.append(this.c);
    stringBuilder.append(")}:");
    if (this.e)
      stringBuilder.append(" fromLayout"); 
    if (this.f)
      stringBuilder.append(" dynamicContainer"); 
    int i = this.h;
    if (i != 0) {
      stringBuilder.append(" id=0x");
      stringBuilder.append(Integer.toHexString(i));
    } 
    String str = this.i;
    if (str != null && !str.isEmpty()) {
      stringBuilder.append(" tag=");
      stringBuilder.append(str);
    } 
    if (this.j)
      stringBuilder.append(GMDx.iAXUPshdzPO); 
    if (this.k)
      stringBuilder.append(" removing"); 
    if (this.l)
      stringBuilder.append(" detached"); 
    if (this.m)
      stringBuilder.append(" hidden"); 
    str = this.o;
    if (str != null) {
      stringBuilder.append(" targetWho=");
      stringBuilder.append(str);
      stringBuilder.append(" targetRequestCode=");
      stringBuilder.append(this.p);
    } 
    if (this.q)
      stringBuilder.append(" userVisibleHint"); 
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeInt(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeString(this.i);
    paramParcel.writeInt(this.j);
    paramParcel.writeInt(this.k);
    paramParcel.writeInt(this.l);
    paramParcel.writeInt(this.m);
    paramParcel.writeInt(this.n);
    paramParcel.writeString(this.o);
    paramParcel.writeInt(this.p);
    paramParcel.writeInt(this.q);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rb0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */