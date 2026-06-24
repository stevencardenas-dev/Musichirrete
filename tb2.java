import android.app.PendingIntent;
import android.os.Bundle;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import java.util.List;

public final class tb2 {
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final long d;
  
  public final long e;
  
  public final List f;
  
  public final List g;
  
  public final PendingIntent h;
  
  public final List i;
  
  public tb2(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, List paramList1, List paramList2, PendingIntent paramPendingIntent, List paramList3) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramList1;
    this.g = paramList2;
    this.h = paramPendingIntent;
    this.i = paramList3;
  }
  
  public static tb2 a(int paramInt1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, List paramList1, List paramList2) {
    if (paramInt2 != 8)
      return new tb2(paramInt1, paramInt2, paramInt3, paramLong1, paramLong2, paramList1, paramList2, null, null); 
    l0.l(jHxlGgUTadw.mkrINUx);
    return null;
  }
  
  public static tb2 b(Bundle paramBundle) {
    return new tb2(paramBundle.getInt("session_id"), paramBundle.getInt("status"), paramBundle.getInt("error_code"), paramBundle.getLong("bytes_downloaded"), paramBundle.getLong(jLnXOLx.upNZiRMu), paramBundle.getStringArrayList("module_names"), paramBundle.getStringArrayList("languages"), (PendingIntent)paramBundle.getParcelable("user_confirmation_intent"), paramBundle.getParcelableArrayList("split_file_intents"));
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof tb2) {
      paramObject = paramObject;
      if (this.a == ((tb2)paramObject).a && this.b == ((tb2)paramObject).b && this.c == ((tb2)paramObject).c && this.d == ((tb2)paramObject).d && this.e == ((tb2)paramObject).e) {
        List list1 = ((tb2)paramObject).f;
        List list2 = this.f;
        if ((list2 == null) ? (list1 == null) : list2.equals(list1)) {
          list2 = ((tb2)paramObject).g;
          list1 = this.g;
          if ((list1 == null) ? (list2 == null) : list1.equals(list2)) {
            PendingIntent pendingIntent1 = ((tb2)paramObject).h;
            PendingIntent pendingIntent2 = this.h;
            if ((pendingIntent2 == null) ? (pendingIntent1 == null) : pendingIntent2.equals(pendingIntent1)) {
              List list = ((tb2)paramObject).i;
              paramObject = this.i;
              if ((paramObject == null) ? (list == null) : paramObject.equals(list))
                return true; 
            } 
          } 
        } 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    int j;
    int k;
    int i2 = this.a;
    int i1 = this.b;
    int n = this.c;
    long l2 = this.d;
    long l1 = this.e;
    int m = 0;
    List list2 = this.f;
    if (list2 == null) {
      i = 0;
    } else {
      i = list2.hashCode();
    } 
    int i4 = (int)(l2 ^ l2 >>> 32L);
    int i3 = (int)(l1 >>> 32L ^ l1);
    list2 = this.g;
    if (list2 == null) {
      j = 0;
    } else {
      j = list2.hashCode();
    } 
    PendingIntent pendingIntent = this.h;
    if (pendingIntent == null) {
      k = 0;
    } else {
      k = pendingIntent.hashCode();
    } 
    List list1 = this.i;
    if (list1 != null)
      m = list1.hashCode(); 
    return ((((((((i2 ^ 0xF4243) * 1000003 ^ i1) * 1000003 ^ n) * 1000003 ^ i4) * 1000003 ^ i3) * 1000003 ^ i) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m;
  }
  
  public final String toString() {
    String str1 = String.valueOf(this.f);
    String str4 = String.valueOf(this.g);
    String str3 = String.valueOf(this.h);
    String str2 = String.valueOf(this.i);
    StringBuilder stringBuilder = new StringBuilder("SplitInstallSessionState{sessionId=");
    stringBuilder.append(this.a);
    stringBuilder.append(", status=");
    stringBuilder.append(this.b);
    stringBuilder.append(", errorCode=");
    stringBuilder.append(this.c);
    stringBuilder.append(", bytesDownloaded=");
    stringBuilder.append(this.d);
    stringBuilder.append(", totalBytesToDownload=");
    stringBuilder.append(this.e);
    stringBuilder.append(", moduleNamesNullable=");
    x41.v(stringBuilder, str1, ", languagesNullable=", str4, ", resolutionIntent=");
    stringBuilder.append(str3);
    stringBuilder.append(", splitFileIntents=");
    stringBuilder.append(str2);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */