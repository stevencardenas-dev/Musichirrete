import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

public final class ec2 extends f0 {
  public static final Parcelable.Creator<ec2> CREATOR = new yb2(2);
  
  public final int b;
  
  public final boolean c;
  
  public final boolean e;
  
  public final String f;
  
  public final String g;
  
  public final String h;
  
  public final String i;
  
  public final String j;
  
  public final boolean k;
  
  public final boolean l;
  
  public ec2(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean3, boolean paramBoolean4) {
    this.b = paramInt;
    this.c = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramString1;
    this.g = paramString2;
    this.h = paramString3;
    this.i = paramString4;
    this.j = paramString5;
    this.k = paramBoolean3;
    this.l = paramBoolean4;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof ec2))
      return false; 
    paramObject = paramObject;
    return (this.b == ((ec2)paramObject).b && this.c == ((ec2)paramObject).c && this.e == ((ec2)paramObject).e && TextUtils.equals(this.f, ((ec2)paramObject).f) && TextUtils.equals(this.g, ((ec2)paramObject).g) && TextUtils.equals(this.h, ((ec2)paramObject).h) && TextUtils.equals(this.i, ((ec2)paramObject).i) && TextUtils.equals(this.j, ((ec2)paramObject).j) && this.k == ((ec2)paramObject).k && this.l == ((ec2)paramObject).l);
  }
  
  public final int hashCode() {
    int i = this.b;
    boolean bool3 = this.c;
    boolean bool4 = this.e;
    boolean bool1 = this.k;
    boolean bool2 = this.l;
    return Arrays.hashCode(new Object[] { Integer.valueOf(i), Boolean.valueOf(bool3), Boolean.valueOf(bool4), this.f, this.g, this.h, this.i, this.j, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.b);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.c);
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(this.e);
    qv.v0(paramParcel, 5, this.f);
    qv.v0(paramParcel, 6, this.g);
    qv.v0(paramParcel, 7, this.h);
    qv.v0(paramParcel, 8, this.i);
    qv.v0(paramParcel, 9, this.j);
    qv.C0(paramParcel, 10, 4);
    paramParcel.writeInt(this.k);
    qv.C0(paramParcel, 11, 4);
    paramParcel.writeInt(this.l);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ec2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */