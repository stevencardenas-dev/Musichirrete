import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

public final class i52 extends f0 {
  public static final Parcelable.Creator<i52> CREATOR = new lx0(23);
  
  public final int b;
  
  public final Uri c;
  
  public final int e;
  
  public final int f;
  
  public i52(int paramInt1, int paramInt2, Uri paramUri) {
    this(1, paramUri, paramInt1, paramInt2);
    if (paramUri != null) {
      if (paramInt1 >= 0 && paramInt2 >= 0)
        return; 
      l0.l("width and height must not be negative");
      throw null;
    } 
    l0.l("url cannot be null");
    throw null;
  }
  
  public i52(int paramInt1, Uri paramUri, int paramInt2, int paramInt3) {
    this.b = paramInt1;
    this.c = paramUri;
    this.e = paramInt2;
    this.f = paramInt3;
  }
  
  public i52(JSONObject paramJSONObject) {
    this(paramJSONObject.optInt("width", 0), paramJSONObject.optInt("height", 0), uri1);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && paramObject instanceof i52) {
      paramObject = paramObject;
      if (z51.g(this.c, ((i52)paramObject).c) && this.e == ((i52)paramObject).e && this.f == ((i52)paramObject).f)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int j = this.e;
    int i = this.f;
    return Arrays.hashCode(new Object[] { this.c, Integer.valueOf(j), Integer.valueOf(i) });
  }
  
  public final String toString() {
    Locale locale = Locale.US;
    String str = this.c.toString();
    StringBuilder stringBuilder = new StringBuilder("Image ");
    stringBuilder.append(this.e);
    stringBuilder.append("x");
    stringBuilder.append(this.f);
    stringBuilder.append(" ");
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.C0(paramParcel, 1, 4);
    paramParcel.writeInt(this.b);
    qv.u0(paramParcel, 2, (Parcelable)this.c, paramInt);
    qv.C0(paramParcel, 3, 4);
    paramParcel.writeInt(this.e);
    qv.C0(paramParcel, 4, 4);
    paramParcel.writeInt(this.f);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */