import java.util.Objects;

public final class d61 {
  public String a;
  
  public String b;
  
  public d61(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public d61(String paramString, q01 paramq01) {
    int i = paramString.lastIndexOf('/');
    if (i == -1) {
      this.a = null;
      this.b = paramString;
    } else {
      this.a = paramString.substring(0, i);
      this.b = paramString.substring(i + 1);
    } 
    if (paramq01 != null)
      a(paramq01); 
  }
  
  public final void a(q01 paramq01) {
    String str = this.a;
    if (str != null)
      this.a = paramq01.a(str); 
    this.b = paramq01.a(this.b);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof d61) {
      paramObject = paramObject;
      if (Objects.equals(this.a, ((d61)paramObject).a) && Objects.equals(this.b, ((d61)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = Objects.hashCode(this.a);
    return this.b.hashCode() + i * 31;
  }
  
  public final String toString() {
    if (this.a != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.a);
      stringBuilder.append("/");
      stringBuilder.append(this.b);
      return stringBuilder.toString();
    } 
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */