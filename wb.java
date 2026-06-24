import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

public final class wb implements Parcelable {
  public static final Parcelable.Creator<wb> CREATOR = new zb2(5);
  
  public Integer A;
  
  public Integer B;
  
  public Integer C;
  
  public Integer D;
  
  public Integer E;
  
  public Boolean F;
  
  public Integer G;
  
  public int b;
  
  public Integer c;
  
  public Integer e;
  
  public Integer f;
  
  public Integer g;
  
  public Integer h;
  
  public Integer i;
  
  public Integer j;
  
  public int k = 255;
  
  public String l;
  
  public int m = -2;
  
  public int n = -2;
  
  public int o = -2;
  
  public Locale p;
  
  public CharSequence q;
  
  public CharSequence r;
  
  public int s;
  
  public int t;
  
  public Integer u;
  
  public Boolean v = Boolean.TRUE;
  
  public Integer w;
  
  public Integer x;
  
  public Integer y;
  
  public Integer z;
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeSerializable(this.c);
    paramParcel.writeSerializable(this.e);
    paramParcel.writeSerializable(this.f);
    paramParcel.writeSerializable(this.g);
    paramParcel.writeSerializable(this.h);
    paramParcel.writeSerializable(this.i);
    paramParcel.writeSerializable(this.j);
    paramParcel.writeInt(this.k);
    paramParcel.writeString(this.l);
    paramParcel.writeInt(this.m);
    paramParcel.writeInt(this.n);
    paramParcel.writeInt(this.o);
    CharSequence charSequence1 = this.q;
    CharSequence charSequence2 = null;
    if (charSequence1 != null) {
      charSequence1 = charSequence1.toString();
    } else {
      charSequence1 = null;
    } 
    paramParcel.writeString((String)charSequence1);
    CharSequence charSequence3 = this.r;
    charSequence1 = charSequence2;
    if (charSequence3 != null)
      charSequence1 = charSequence3.toString(); 
    paramParcel.writeString((String)charSequence1);
    paramParcel.writeInt(this.s);
    paramParcel.writeSerializable(this.u);
    paramParcel.writeSerializable(this.w);
    paramParcel.writeSerializable(this.x);
    paramParcel.writeSerializable(this.y);
    paramParcel.writeSerializable(this.z);
    paramParcel.writeSerializable(this.A);
    paramParcel.writeSerializable(this.B);
    paramParcel.writeSerializable(this.E);
    paramParcel.writeSerializable(this.C);
    paramParcel.writeSerializable(this.D);
    paramParcel.writeSerializable(this.v);
    paramParcel.writeSerializable(this.p);
    paramParcel.writeSerializable(this.F);
    paramParcel.writeSerializable(this.G);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */