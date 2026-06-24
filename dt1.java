import java.util.List;

public final class dt1 {
  public final String a;
  
  public final String b;
  
  public final String c;
  
  public final List d;
  
  public final List e;
  
  public dt1(String paramString1, String paramString2, String paramString3, List paramList1, List paramList2) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramList1;
    this.e = paramList2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof dt1) {
      dt1 dt11 = (dt1)paramObject;
      paramObject = dt11.a;
      if (ui0.c(this.a, paramObject) && ui0.c(this.b, dt11.b) && ui0.c(this.c, dt11.c) && this.d.equals(dt11.d))
        return this.e.equals(dt11.e); 
    } 
    return false;
  }
  
  public final int hashCode() {
    int j = this.a.hashCode();
    int i = this.b.hashCode();
    int k = this.c.hashCode();
    int m = this.d.hashCode();
    return this.e.hashCode() + (m + (k + (i + j * 31) * 31) * 31) * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
    stringBuilder.append(this.a);
    stringBuilder.append("',\n            |   onDelete = '");
    stringBuilder.append(this.b);
    stringBuilder.append("',\n            |   onUpdate = '");
    stringBuilder.append(this.c);
    stringBuilder.append("',\n            |   columnNames = {");
    hq1.A0(nm.p0(nm.r0(this.d), ",", null, null, null, 62));
    hq1.A0("},");
    l02 l02 = l02.a;
    stringBuilder.append(l02);
    stringBuilder.append("\n            |   referenceColumnNames = {");
    hq1.A0(nm.p0(nm.r0(this.e), ",", null, null, null, 62));
    hq1.A0(" }");
    stringBuilder.append(l02);
    stringBuilder.append("\n            |}\n        ");
    return hq1.A0(hq1.C0(stringBuilder.toString()));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */