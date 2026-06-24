import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

public final class k80 extends ViewGroup.MarginLayoutParams implements g80 {
  public static final Parcelable.Creator<k80> CREATOR = new zb2(14);
  
  public int b;
  
  public float c;
  
  public float e;
  
  public int f;
  
  public float g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public boolean l;
  
  public final void a(int paramInt) {
    this.i = paramInt;
  }
  
  public final float c() {
    return this.c;
  }
  
  public final float d() {
    return this.g;
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final int g() {
    return this.f;
  }
  
  public final int getHeight() {
    return this.height;
  }
  
  public final int getOrder() {
    return this.b;
  }
  
  public final int getWidth() {
    return this.width;
  }
  
  public final float h() {
    return this.e;
  }
  
  public final int k() {
    return this.rightMargin;
  }
  
  public final int l() {
    return this.i;
  }
  
  public final int m() {
    return this.h;
  }
  
  public final boolean o() {
    return this.l;
  }
  
  public final int p() {
    return this.k;
  }
  
  public final void q(int paramInt) {
    this.h = paramInt;
  }
  
  public final int r() {
    return this.bottomMargin;
  }
  
  public final int s() {
    return this.leftMargin;
  }
  
  public final int u() {
    return this.j;
  }
  
  public final int v() {
    return this.topMargin;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    paramParcel.writeFloat(this.c);
    paramParcel.writeFloat(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeFloat(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeInt(this.i);
    paramParcel.writeInt(this.j);
    paramParcel.writeInt(this.k);
    paramParcel.writeByte(this.l);
    paramParcel.writeInt(this.bottomMargin);
    paramParcel.writeInt(this.leftMargin);
    paramParcel.writeInt(this.rightMargin);
    paramParcel.writeInt(this.topMargin);
    paramParcel.writeInt(this.height);
    paramParcel.writeInt(this.width);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */