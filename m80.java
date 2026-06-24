import android.os.Parcel;
import android.os.Parcelable;

public final class m80 extends sd1 implements g80 {
  public static final Parcelable.Creator<m80> CREATOR = new zb2(15);
  
  public float g;
  
  public float h;
  
  public int i;
  
  public float j;
  
  public int k;
  
  public int l;
  
  public int m;
  
  public int n;
  
  public boolean o;
  
  public final void a(int paramInt) {
    this.l = paramInt;
  }
  
  public final float c() {
    return this.g;
  }
  
  public final float d() {
    return this.j;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final int g() {
    return this.i;
  }
  
  public final int getHeight() {
    return this.height;
  }
  
  public final int getOrder() {
    return 1;
  }
  
  public final int getWidth() {
    return this.width;
  }
  
  public final float h() {
    return this.h;
  }
  
  public final int k() {
    return this.rightMargin;
  }
  
  public final int l() {
    return this.l;
  }
  
  public final int m() {
    return this.k;
  }
  
  public final boolean o() {
    return this.o;
  }
  
  public final int p() {
    return this.n;
  }
  
  public final void q(int paramInt) {
    this.k = paramInt;
  }
  
  public final int r() {
    return this.bottomMargin;
  }
  
  public final int s() {
    return this.leftMargin;
  }
  
  public final int u() {
    return this.m;
  }
  
  public final int v() {
    return this.topMargin;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeFloat(this.g);
    paramParcel.writeFloat(this.h);
    paramParcel.writeInt(this.i);
    paramParcel.writeFloat(this.j);
    paramParcel.writeInt(this.k);
    paramParcel.writeInt(this.l);
    paramParcel.writeInt(this.m);
    paramParcel.writeInt(this.n);
    paramParcel.writeByte(this.o);
    paramParcel.writeInt(this.bottomMargin);
    paramParcel.writeInt(this.leftMargin);
    paramParcel.writeInt(this.rightMargin);
    paramParcel.writeInt(this.topMargin);
    paramParcel.writeInt(this.height);
    paramParcel.writeInt(this.width);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */