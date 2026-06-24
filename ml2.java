import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ml2 extends f0 {
  public static final Parcelable.Creator<ml2> CREATOR = new pk2(4);
  
  public final int b;
  
  public final boolean c;
  
  public final ArrayList e;
  
  public final int f;
  
  public final String g;
  
  public final boolean h;
  
  public ml2(int paramInt1, boolean paramBoolean1, ArrayList paramArrayList, int paramInt2, String paramString, boolean paramBoolean2) {
    ArrayList arrayList = new ArrayList();
    this.e = arrayList;
    this.b = paramInt1;
    this.c = paramBoolean1;
    if (paramArrayList != null)
      arrayList.addAll(paramArrayList); 
    this.f = paramInt2;
    this.g = paramString;
    this.h = paramBoolean2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 2, 4);
    paramParcel.writeInt(this.b);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.c);
    qv.w0(paramParcel, 4, this.e);
    qv.C0(paramParcel, 5, 4);
    paramParcel.writeInt(this.f);
    qv.v0(paramParcel, 6, this.g);
    qv.C0(paramParcel, 7, 4);
    paramParcel.writeInt(this.h);
    qv.G0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ml2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */