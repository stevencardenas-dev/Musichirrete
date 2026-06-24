public final class p91 {
  public final String a;
  
  public final Long b;
  
  public p91(String paramString, Long paramLong) {
    this.a = paramString;
    this.b = paramLong;
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (!(paramObject instanceof p91))
        return false; 
      paramObject = paramObject;
      if (!this.a.equals(((p91)paramObject).a) || !this.b.equals(((p91)paramObject).b))
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return this.b.hashCode() + i * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Preference(key=");
    stringBuilder.append(this.a);
    stringBuilder.append(", value=");
    stringBuilder.append(this.b);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */