import java.util.Locale;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;

public final class ct1 {
  public final String a;
  
  public final String b;
  
  public final boolean c;
  
  public final int d;
  
  public final String e;
  
  public final int f;
  
  public final int g;
  
  public ct1(String paramString1, String paramString2, boolean paramBoolean, int paramInt1, String paramString3, int paramInt2) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramBoolean;
    this.d = paramInt1;
    this.e = paramString3;
    this.f = paramInt2;
    paramString1 = paramString2.toUpperCase(Locale.ROOT);
    paramString1.getClass();
    if (gq1.H0(paramString1, "INT")) {
      paramInt1 = 3;
    } else if (gq1.H0(paramString1, "CHAR") || gq1.H0(paramString1, "CLOB") || gq1.H0(paramString1, "TEXT")) {
      paramInt1 = 2;
    } else if (gq1.H0(paramString1, "BLOB")) {
      paramInt1 = 5;
    } else if (gq1.H0(paramString1, "REAL") || gq1.H0(paramString1, "FLOA") || gq1.H0(paramString1, "DOUB")) {
      paramInt1 = 4;
    } else {
      paramInt1 = 1;
    } 
    this.g = paramInt1;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof ct1) {
      int i;
      byte b;
      if (this.d > 0) {
        i = 1;
      } else {
        i = 0;
      } 
      paramObject = paramObject;
      int j = ((ct1)paramObject).f;
      if (((ct1)paramObject).d > 0) {
        b = 1;
      } else {
        b = 0;
      } 
      if (i == b && ui0.c(this.a, ((ct1)paramObject).a) && this.c == ((ct1)paramObject).c) {
        String str1 = ((ct1)paramObject).e;
        i = this.f;
        String str2 = this.e;
        if ((i != 1 || j != 2 || str2 == null || dd1.q(str2, str1)) && (i != 2 || j != 1 || str1 == null || dd1.q(str1, str2)) && (i == 0 || i != j || ((str2 != null) ? !dd1.q(str2, str1) : (str1 != null))) && this.g == ((ct1)paramObject).g)
          return true; 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    char c;
    int j = this.a.hashCode();
    int i = this.g;
    if (this.c) {
      c = 'ӏ';
    } else {
      c = 'ӕ';
    } 
    return ((j * 31 + i) * 31 + c) * 31 + this.d;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("\n            |Column {\n            |   name = '");
    stringBuilder.append(this.a);
    stringBuilder.append("',\n            |   type = '");
    stringBuilder.append(this.b);
    stringBuilder.append("',\n            |   affinity = '");
    stringBuilder.append(this.g);
    stringBuilder.append(kOkiWEITVb.WykUY);
    stringBuilder.append(this.c);
    stringBuilder.append("',\n            |   primaryKeyPosition = '");
    stringBuilder.append(this.d);
    stringBuilder.append("',\n            |   defaultValue = '");
    String str2 = this.e;
    String str1 = str2;
    if (str2 == null)
      str1 = "undefined"; 
    stringBuilder.append(str1);
    stringBuilder.append("'\n            |}\n        ");
    return hq1.A0(hq1.C0(stringBuilder.toString()));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ct1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */