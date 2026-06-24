public final class js1 {
  public final String a;
  
  public final int b;
  
  public final int c;
  
  public js1(String paramString, int paramInt1, int paramInt2) {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof js1))
      return false; 
    paramObject = paramObject;
    return !ui0.c(this.a, ((js1)paramObject).a) ? false : ((this.b != ((js1)paramObject).b) ? false : (!(this.c != ((js1)paramObject).c)));
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    int j = Integer.hashCode(this.b);
    return Integer.hashCode(this.c) + (j + i * 31) * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("SystemIdInfo(workSpecId=");
    stringBuilder.append(this.a);
    stringBuilder.append(", generation=");
    stringBuilder.append(this.b);
    stringBuilder.append(", systemId=");
    stringBuilder.append(this.c);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\js1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */