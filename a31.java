import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class a31 extends f0 {
  public static final Parcelable.Creator<a31> CREATOR;
  
  public static final om2 K;
  
  public static final int[] L = new int[] { 0, 1 };
  
  public final int A;
  
  public final int B;
  
  public final int C;
  
  public final int D;
  
  public final int E;
  
  public final int F;
  
  public final int G;
  
  public final sj2 H;
  
  public final boolean I;
  
  public final boolean J;
  
  public final ArrayList b;
  
  public final int[] c;
  
  public final long e;
  
  public final String f;
  
  public final int g;
  
  public final int h;
  
  public final int i;
  
  public final int j;
  
  public final int k;
  
  public final int l;
  
  public final int m;
  
  public final int n;
  
  public final int o;
  
  public final int p;
  
  public final int q;
  
  public final int r;
  
  public final int s;
  
  public final int t;
  
  public final int u;
  
  public final int v;
  
  public final int w;
  
  public final int x;
  
  public final int y;
  
  public final int z;
  
  static {
    CREATOR = new pk2(15);
  }
  
  public a31(List<?> paramList, int[] paramArrayOfint, long paramLong, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25, int paramInt26, int paramInt27, IBinder paramIBinder, boolean paramBoolean1, boolean paramBoolean2) {
    IInterface iInterface;
    this.b = new ArrayList(paramList);
    this.c = Arrays.copyOf(paramArrayOfint, paramArrayOfint.length);
    this.e = paramLong;
    this.f = paramString;
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = paramInt3;
    this.j = paramInt4;
    this.k = paramInt5;
    this.l = paramInt6;
    this.m = paramInt7;
    this.n = paramInt8;
    this.o = paramInt9;
    this.p = paramInt10;
    this.q = paramInt11;
    this.r = paramInt12;
    this.s = paramInt13;
    this.t = paramInt14;
    this.u = paramInt15;
    this.v = paramInt16;
    this.w = paramInt17;
    this.x = paramInt18;
    this.y = paramInt19;
    this.z = paramInt20;
    this.A = paramInt21;
    this.B = paramInt22;
    this.C = paramInt23;
    this.D = paramInt24;
    this.E = paramInt25;
    this.F = paramInt26;
    this.G = paramInt27;
    this.I = paramBoolean1;
    this.J = paramBoolean2;
    if (paramIBinder == null) {
      paramList = null;
    } else {
      iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
      if (iInterface instanceof sj2) {
        iInterface = iInterface;
      } else {
        iInterface = new na2(paramIBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 1);
      } 
    } 
    this.H = (sj2)iInterface;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    IBinder iBinder;
    paramInt = qv.D0(paramParcel, 20293);
    qv.w0(paramParcel, 2, this.b);
    int[] arrayOfInt = this.c;
    qv.r0(paramParcel, 3, Arrays.copyOf(arrayOfInt, arrayOfInt.length));
    qv.C0(paramParcel, 4, 8);
    paramParcel.writeLong(this.e);
    qv.v0(paramParcel, 5, this.f);
    qv.C0(paramParcel, 6, 4);
    paramParcel.writeInt(this.g);
    qv.C0(paramParcel, 7, 4);
    paramParcel.writeInt(this.h);
    qv.C0(paramParcel, 8, 4);
    paramParcel.writeInt(this.i);
    qv.C0(paramParcel, 9, 4);
    paramParcel.writeInt(this.j);
    qv.C0(paramParcel, 10, 4);
    paramParcel.writeInt(this.k);
    qv.C0(paramParcel, 11, 4);
    paramParcel.writeInt(this.l);
    qv.C0(paramParcel, 12, 4);
    paramParcel.writeInt(this.m);
    qv.C0(paramParcel, 13, 4);
    paramParcel.writeInt(this.n);
    qv.C0(paramParcel, 14, 4);
    paramParcel.writeInt(this.o);
    qv.C0(paramParcel, 15, 4);
    paramParcel.writeInt(this.p);
    qv.C0(paramParcel, 16, 4);
    paramParcel.writeInt(this.q);
    qv.C0(paramParcel, 17, 4);
    paramParcel.writeInt(this.r);
    qv.C0(paramParcel, 18, 4);
    paramParcel.writeInt(this.s);
    qv.C0(paramParcel, 19, 4);
    paramParcel.writeInt(this.t);
    qv.C0(paramParcel, 20, 4);
    paramParcel.writeInt(this.u);
    qv.C0(paramParcel, 21, 4);
    paramParcel.writeInt(this.v);
    qv.C0(paramParcel, 22, 4);
    paramParcel.writeInt(this.w);
    qv.C0(paramParcel, 23, 4);
    paramParcel.writeInt(this.x);
    qv.C0(paramParcel, 24, 4);
    paramParcel.writeInt(this.y);
    qv.C0(paramParcel, 25, 4);
    paramParcel.writeInt(this.z);
    qv.C0(paramParcel, 26, 4);
    paramParcel.writeInt(this.A);
    qv.C0(paramParcel, 27, 4);
    paramParcel.writeInt(this.B);
    qv.C0(paramParcel, 28, 4);
    paramParcel.writeInt(this.C);
    qv.C0(paramParcel, 29, 4);
    paramParcel.writeInt(this.D);
    qv.C0(paramParcel, 30, 4);
    paramParcel.writeInt(this.E);
    qv.C0(paramParcel, 31, 4);
    paramParcel.writeInt(this.F);
    qv.C0(paramParcel, 32, 4);
    paramParcel.writeInt(this.G);
    sj2 sj21 = this.H;
    if (sj21 == null) {
      sj21 = null;
    } else {
      iBinder = sj21.f;
    } 
    qv.q0(paramParcel, 33, iBinder);
    qv.C0(paramParcel, 34, 4);
    paramParcel.writeInt(this.I);
    qv.C0(paramParcel, 35, 4);
    paramParcel.writeInt(this.J);
    qv.G0(paramParcel, paramInt);
  }
  
  static {
    gm2 gm2 = im2.f;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    arrayOfObject[1] = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    for (byte b = 0; b < 2; b++)
      qz1.Y(b, arrayOfObject[b]); 
    K = im2.h(2, arrayOfObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */