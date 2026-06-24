import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

public final class jt0 extends f0 {
  public static final Parcelable.Creator<jt0> CREATOR;
  
  public static final rp0 p = new rp0("MediaLoadRequestData", null);
  
  public final MediaInfo b;
  
  public final tt0 c;
  
  public final Boolean e;
  
  public final long f;
  
  public final double g;
  
  public final long[] h;
  
  public String i;
  
  public final JSONObject j;
  
  public final String k;
  
  public final String l;
  
  public final String m;
  
  public final String n;
  
  public final long o;
  
  static {
    CREATOR = new yb2(15);
  }
  
  public jt0(MediaInfo paramMediaInfo, tt0 paramtt0, Boolean paramBoolean, long paramLong1, double paramDouble, long[] paramArrayOflong, JSONObject paramJSONObject, String paramString1, String paramString2, String paramString3, String paramString4, long paramLong2) {
    this.b = paramMediaInfo;
    this.c = paramtt0;
    this.e = paramBoolean;
    this.f = paramLong1;
    this.g = paramDouble;
    this.h = paramArrayOflong;
    this.j = paramJSONObject;
    this.k = paramString1;
    this.l = paramString2;
    this.m = paramString3;
    this.n = paramString4;
    this.o = paramLong2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof jt0))
      return false; 
    paramObject = paramObject;
    return !vk0.a(this.j, ((jt0)paramObject).j) ? false : ((z51.g(this.b, ((jt0)paramObject).b) && z51.g(this.c, ((jt0)paramObject).c) && z51.g(this.e, ((jt0)paramObject).e) && this.f == ((jt0)paramObject).f && this.g == ((jt0)paramObject).g && Arrays.equals(this.h, ((jt0)paramObject).h) && z51.g(this.k, ((jt0)paramObject).k) && z51.g(this.l, ((jt0)paramObject).l) && z51.g(this.m, ((jt0)paramObject).m) && z51.g(this.n, ((jt0)paramObject).n) && this.o == ((jt0)paramObject).o));
  }
  
  public final int hashCode() {
    long l1 = this.f;
    double d = this.g;
    String str = String.valueOf(this.j);
    long l2 = this.o;
    return Arrays.hashCode(new Object[] { 
          this.b, this.c, this.e, Long.valueOf(l1), Double.valueOf(d), this.h, str, this.k, this.l, this.m, 
          this.n, Long.valueOf(l2) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    String str;
    JSONObject jSONObject = this.j;
    if (jSONObject == null) {
      jSONObject = null;
    } else {
      str = jSONObject.toString();
    } 
    this.i = str;
    int i = qv.D0(paramParcel, 20293);
    qv.u0(paramParcel, 2, (Parcelable)this.b, paramInt);
    qv.u0(paramParcel, 3, this.c, paramInt);
    qv.o0(paramParcel, 4, this.e);
    qv.C0(paramParcel, 5, 8);
    paramParcel.writeLong(this.f);
    qv.C0(paramParcel, 6, 8);
    paramParcel.writeDouble(this.g);
    qv.t0(paramParcel, 7, this.h);
    qv.v0(paramParcel, 8, this.i);
    qv.v0(paramParcel, 9, this.k);
    qv.v0(paramParcel, 10, this.l);
    qv.v0(paramParcel, 11, this.m);
    qv.v0(paramParcel, 12, this.n);
    qv.C0(paramParcel, 13, 8);
    paramParcel.writeLong(this.o);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */