import java.util.AbstractSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ft1 {
  public final String a;
  
  public final Map b;
  
  public final Set c;
  
  public final Set d;
  
  public ft1(String paramString, Map paramMap, AbstractSet paramAbstractSet1, AbstractSet paramAbstractSet2) {
    this.a = paramString;
    this.b = paramMap;
    this.c = paramAbstractSet1;
    this.d = paramAbstractSet2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (!(paramObject instanceof ft1))
        return false; 
      ft1 ft11 = (ft1)paramObject;
      paramObject = ft11.a;
      if (!this.a.equals(paramObject) || !this.b.equals(ft11.b) || !ui0.c(this.c, ft11.c))
        return false; 
      paramObject = this.d;
      if (paramObject != null) {
        Set set = ft11.d;
        if (set != null)
          return paramObject.equals(set); 
      } 
    } 
    return true;
  }
  
  public final int hashCode() {
    int j = this.a.hashCode();
    int i = this.b.hashCode();
    return this.c.hashCode() + (i + j * 31) * 31;
  }
  
  public final String toString() {
    List list;
    StringBuilder stringBuilder = new StringBuilder("\n            |TableInfo {\n            |    name = '");
    stringBuilder.append(this.a);
    stringBuilder.append("',\n            |    columns = {");
    stringBuilder.append(dd1.u(nm.s0(this.b.values(), new ij(11))));
    stringBuilder.append("\n            |    foreignKeys = {");
    stringBuilder.append(dd1.u(this.c));
    stringBuilder.append("\n            |    indices = {");
    Set set = this.d;
    if (set != null) {
      list = nm.s0(set, new ij(12));
    } else {
      list = d40.b;
    } 
    stringBuilder.append(dd1.u(list));
    stringBuilder.append("\n            |}\n        ");
    return hq1.C0(stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ft1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */