public final class z11 {
  public final boolean a;
  
  public final boolean b;
  
  public final boolean c;
  
  public final boolean d;
  
  public final boolean e;
  
  public z11(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5) {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
    this.c = paramBoolean3;
    this.d = paramBoolean4;
    this.e = paramBoolean5;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof z11))
      return false; 
    paramObject = paramObject;
    return (this.a != ((z11)paramObject).a) ? false : ((this.b != ((z11)paramObject).b) ? false : ((this.c != ((z11)paramObject).c) ? false : ((this.d != ((z11)paramObject).d) ? false : (!(this.e != ((z11)paramObject).e)))));
  }
  
  public final int hashCode() {
    int i = Boolean.hashCode(this.a);
    int m = Boolean.hashCode(this.b);
    int k = Boolean.hashCode(this.c);
    int j = Boolean.hashCode(this.d);
    return Boolean.hashCode(this.e) + (j + (k + (m + i * 31) * 31) * 31) * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("NetworkState(isConnected=");
    stringBuilder.append(this.a);
    stringBuilder.append(", isValidated=");
    stringBuilder.append(this.b);
    stringBuilder.append(", isMetered=");
    stringBuilder.append(this.c);
    stringBuilder.append(", isNotRoaming=");
    stringBuilder.append(this.d);
    stringBuilder.append(", isBlocked=");
    stringBuilder.append(this.e);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */