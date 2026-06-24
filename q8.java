import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class q8 extends f0 {
  public static final Parcelable.Creator<q8> CREATOR = new yb2(25);
  
  public final String b;
  
  public final String c;
  
  public final List e;
  
  public final String f;
  
  public final Uri g;
  
  public final String h;
  
  public final String i;
  
  public final Boolean j;
  
  public final Boolean k;
  
  public final int l;
  
  public q8(String paramString1, String paramString2, ArrayList paramArrayList, String paramString3, Uri paramUri, String paramString4, String paramString5, Boolean paramBoolean1, Boolean paramBoolean2, int paramInt) {
    this.b = paramString1;
    this.c = paramString2;
    this.e = paramArrayList;
    this.f = paramString3;
    this.g = paramUri;
    this.h = paramString4;
    this.i = paramString5;
    this.j = paramBoolean1;
    this.k = paramBoolean2;
    this.l = paramInt;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof q8))
      return false; 
    paramObject = paramObject;
    return (qj.c(this.b, ((q8)paramObject).b) && qj.c(this.c, ((q8)paramObject).c) && qj.c(this.e, ((q8)paramObject).e) && qj.c(this.f, ((q8)paramObject).f) && qj.c(this.g, ((q8)paramObject).g) && qj.c(this.h, ((q8)paramObject).h) && qj.c(this.i, ((q8)paramObject).i) && this.l == ((q8)paramObject).l);
  }
  
  public final int hashCode() {
    int i = this.l;
    return Arrays.hashCode(new Object[] { this.b, this.c, this.e, this.f, this.g, this.h, Integer.valueOf(i) });
  }
  
  public final String toString() {
    int i;
    List list = this.e;
    if (list == null) {
      i = 0;
    } else {
      i = list.size();
    } 
    String str5 = String.valueOf(this.g);
    String str6 = this.b;
    int k = String.valueOf(str6).length();
    String str3 = this.c;
    int i1 = String.valueOf(str3).length();
    int m = String.valueOf(i).length();
    String str2 = this.f;
    int i2 = String.valueOf(str2).length();
    int n = str5.length();
    String str1 = this.h;
    int j = String.valueOf(str1).length();
    String str4 = this.i;
    StringBuilder stringBuilder = new StringBuilder(i2 + i1 + k + 23 + 20 + m + 23 + 22 + n + 11 + j + 8 + String.valueOf(str4).length());
    x41.v(stringBuilder, "applicationId: ", str6, ", name: ", str3);
    stringBuilder.append(", namespaces.count: ");
    stringBuilder.append(i);
    stringBuilder.append(", senderAppIdentifier: ");
    stringBuilder.append(str2);
    x41.v(stringBuilder, ", senderAppLaunchUrl: ", str5, ", iconUrl: ", str1);
    return x41.n(stringBuilder, ", type: ", str4);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 2, this.b);
    qv.v0(paramParcel, 3, this.c);
    qv.w0(paramParcel, 5, Collections.unmodifiableList(this.e));
    qv.v0(paramParcel, 6, this.f);
    qv.u0(paramParcel, 7, (Parcelable)this.g, paramInt);
    qv.v0(paramParcel, 8, this.h);
    qv.v0(paramParcel, 9, this.i);
    qv.o0(paramParcel, 10, this.j);
    qv.o0(paramParcel, 11, this.k);
    qv.C0(paramParcel, 12, 4);
    paramParcel.writeInt(this.l);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */