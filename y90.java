import android.util.Base64;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import java.util.List;

public final class y90 {
  public final String a;
  
  public final String b;
  
  public final String c;
  
  public final List d;
  
  public final String e;
  
  public final String f;
  
  public final String g;
  
  public y90(String paramString1, String paramString2, String paramString3, List paramList, String paramString4, String paramString5) {
    paramString1.getClass();
    this.a = paramString1;
    paramString2.getClass();
    this.b = paramString2;
    this.c = paramString3;
    paramList.getClass();
    this.d = paramList;
    this.e = paramString4;
    this.f = paramString5;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append("-");
    stringBuilder.append(paramString2);
    stringBuilder.append("-");
    stringBuilder.append(paramString3);
    stringBuilder.append("-");
    stringBuilder.append(paramString4);
    stringBuilder.append("-");
    stringBuilder.append(paramString5);
    this.g = stringBuilder.toString();
  }
  
  public final String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder("FontRequest {mProviderAuthority: ");
    stringBuilder2.append(this.a);
    stringBuilder2.append(", mProviderPackage: ");
    stringBuilder2.append(this.b);
    stringBuilder2.append(", mQuery: ");
    stringBuilder2.append(this.c);
    stringBuilder2.append(", mSystemFont: ");
    stringBuilder2.append(this.e);
    stringBuilder2.append(", mVariationSettings: ");
    stringBuilder2.append(this.f);
    stringBuilder2.append(", mCertificates:");
    stringBuilder1.append(stringBuilder2.toString());
    byte b = 0;
    while (true) {
      List<List> list = this.d;
      if (b < list.size()) {
        stringBuilder1.append(" [");
        list = list.get(b);
        for (byte b1 = 0; b1 < list.size(); b1++) {
          stringBuilder1.append(jHxlGgUTadw.AFrB);
          stringBuilder1.append(Base64.encodeToString((byte[])list.get(b1), 0));
          stringBuilder1.append("\"");
        } 
        stringBuilder1.append(" ]");
        b++;
        continue;
      } 
      stringBuilder1.append("}mCertificatesArray: 0");
      return stringBuilder1.toString();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */