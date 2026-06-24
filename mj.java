import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public final class mj extends f0 {
  public static final Parcelable.Creator<mj> CREATOR;
  
  public static final bo2 u = new bo2(false);
  
  public static final yo2 v = new yo2(0);
  
  public static final lj w = new lj("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
  
  public final String b;
  
  public final ArrayList c;
  
  public final boolean e;
  
  public final sl0 f;
  
  public final boolean g;
  
  public final lj h;
  
  public final boolean i;
  
  public final double j;
  
  public final boolean k;
  
  public final boolean l;
  
  public final boolean m;
  
  public final List n;
  
  public final boolean o;
  
  public final boolean p;
  
  public final bo2 q;
  
  public yo2 r;
  
  public final boolean s;
  
  public final boolean t;
  
  static {
    CREATOR = new pk2(12);
  }
  
  public mj(String paramString, ArrayList paramArrayList1, boolean paramBoolean1, sl0 paramsl0, boolean paramBoolean2, lj paramlj, boolean paramBoolean3, double paramDouble, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, ArrayList paramArrayList2, boolean paramBoolean7, boolean paramBoolean8, bo2 parambo2, yo2 paramyo2, boolean paramBoolean9, boolean paramBoolean10) {
    int i;
    String str = paramString;
    if (true == TextUtils.isEmpty(paramString))
      str = ""; 
    this.b = str;
    if (paramArrayList1 == null) {
      i = 0;
    } else {
      i = paramArrayList1.size();
    } 
    ArrayList arrayList = new ArrayList(i);
    this.c = arrayList;
    if (i > 0)
      arrayList.addAll(paramArrayList1); 
    this.e = paramBoolean1;
    sl0 sl01 = paramsl0;
    if (paramsl0 == null)
      sl01 = new sl0(); 
    this.f = sl01;
    this.g = paramBoolean2;
    this.h = paramlj;
    this.i = paramBoolean3;
    this.j = paramDouble;
    this.k = paramBoolean4;
    this.l = paramBoolean5;
    this.m = paramBoolean6;
    this.n = paramArrayList2;
    this.o = paramBoolean7;
    this.p = paramBoolean8;
    this.q = parambo2;
    this.r = paramyo2;
    this.s = paramBoolean9;
    this.t = paramBoolean10;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 2, this.b);
    qv.w0(paramParcel, 3, Collections.unmodifiableList(this.c));
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(this.e);
    qv.u0(paramParcel, 5, this.f, paramInt);
    qv.C0(paramParcel, 6, 4);
    paramParcel.writeInt(this.g);
    qv.u0(paramParcel, 7, this.h, paramInt);
    qv.C0(paramParcel, 8, 4);
    paramParcel.writeInt(this.i);
    qv.C0(paramParcel, 9, 8);
    paramParcel.writeDouble(this.j);
    qv.C0(paramParcel, 10, 4);
    paramParcel.writeInt(this.k);
    qv.C0(paramParcel, 11, 4);
    paramParcel.writeInt(this.l);
    qv.C0(paramParcel, 12, 4);
    paramParcel.writeInt(this.m);
    qv.w0(paramParcel, 13, Collections.unmodifiableList(this.n));
    qv.C0(paramParcel, 14, 4);
    paramParcel.writeInt(this.o);
    qv.C0(paramParcel, 15, 4);
    paramParcel.writeInt(0);
    qv.C0(paramParcel, 16, 4);
    paramParcel.writeInt(this.p);
    qv.u0(paramParcel, 17, this.q, paramInt);
    qv.u0(paramParcel, 18, this.r, paramInt);
    qv.C0(paramParcel, 19, 4);
    paramParcel.writeInt(this.s);
    qv.C0(paramParcel, 20, 4);
    paramParcel.writeInt(this.t);
    qv.G0(paramParcel, i);
  }
  
  static {
    new a31(a31.K, a31.L, 10000L, null, ui0.t0("smallIconDrawableResId"), ui0.t0("stopLiveStreamDrawableResId"), ui0.t0(JkpGFvCVQHzgc.cHNDbXKlrCQ), ui0.t0("playDrawableResId"), ui0.t0("skipNextDrawableResId"), ui0.t0("skipPrevDrawableResId"), ui0.t0("forwardDrawableResId"), ui0.t0("forward10DrawableResId"), ui0.t0("forward30DrawableResId"), ui0.t0("rewindDrawableResId"), ui0.t0("rewind10DrawableResId"), ui0.t0("rewind30DrawableResId"), ui0.t0("disconnectDrawableResId"), ui0.t0("notificationImageSizeDimenResId"), ui0.t0("castingToDeviceStringResId"), ui0.t0("stopLiveStreamStringResId"), ui0.t0("pauseStringResId"), ui0.t0("playStringResId"), ui0.t0("skipNextStringResId"), ui0.t0("skipPrevStringResId"), ui0.t0("forwardStringResId"), ui0.t0("forward10StringResId"), ui0.t0("forward30StringResId"), ui0.t0("rewindStringResId"), ui0.t0("rewind10StringResId"), ui0.t0("rewind30StringResId"), ui0.t0("disconnectStringResId"), null, false, false);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */