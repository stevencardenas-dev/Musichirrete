public final class qn {
  public static final qn e = new qn("", "", "", "");
  
  public final String a;
  
  public final String b;
  
  public final String c;
  
  public final String d;
  
  public qn(String paramString1, String paramString2, String paramString3, String paramString4) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof qn))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((qn)paramObject).a);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */