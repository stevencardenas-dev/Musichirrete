import java.util.ArrayList;
import java.util.List;

public final class et1 {
  public final String a;
  
  public final boolean b;
  
  public final List c;
  
  public final List d;
  
  public et1(String paramString, boolean paramBoolean, List<String> paramList1, List<String> paramList2) {
    this.a = paramString;
    this.b = paramBoolean;
    this.c = paramList1;
    this.d = paramList2;
    List<String> list = paramList2;
    if (paramList2.isEmpty()) {
      int i = paramList1.size();
      paramList1 = new ArrayList(i);
      byte b = 0;
      while (true) {
        list = paramList1;
        if (b < i) {
          paramList1.add("ASC");
          b++;
          continue;
        } 
        break;
      } 
    } 
    this.d = list;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof et1) {
      et1 et11 = (et1)paramObject;
      paramObject = et11.a;
      boolean bool = et11.b;
      if (this.b == bool && this.c.equals(et11.c) && ui0.c(this.d, et11.d)) {
        String str = this.a;
        return oq1.G0(str, "index_") ? oq1.G0((String)paramObject, "index_") : str.equals(paramObject);
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    String str = this.a;
    if (oq1.G0(str, "index_")) {
      i = -1184239155;
    } else {
      i = str.hashCode();
    } 
    boolean bool = this.b;
    int j = this.c.hashCode();
    return this.d.hashCode() + (j + (i * 31 + bool) * 31) * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("\n            |Index {\n            |   name = '");
    stringBuilder.append(this.a);
    stringBuilder.append("',\n            |   unique = '");
    stringBuilder.append(this.b);
    stringBuilder.append("',\n            |   columns = {");
    hq1.A0(nm.p0(this.c, ",", null, null, null, 62));
    hq1.A0("},");
    l02 l02 = l02.a;
    stringBuilder.append(l02);
    stringBuilder.append("\n            |   orders = {");
    hq1.A0(nm.p0(this.d, ",", null, null, null, 62));
    hq1.A0(" }");
    stringBuilder.append(l02);
    stringBuilder.append("\n            |}\n        ");
    return hq1.A0(hq1.C0(stringBuilder.toString()));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\et1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */