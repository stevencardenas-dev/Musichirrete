public final class eb extends s11 {
  public final r11 a;
  
  public final q11 b;
  
  public eb(r11 paramr11, q11 paramq11) {
    this.a = paramr11;
    this.b = paramq11;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof s11) {
      paramObject = paramObject;
      r11 r111 = this.a;
      if ((r111 == null) ? (((eb)paramObject).a == null) : r111.equals(((eb)paramObject).a)) {
        q11 q111 = this.b;
        if ((q111 == null) ? (((eb)paramObject).b == null) : q111.equals(((eb)paramObject).b))
          return true; 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i;
    int j = 0;
    r11 r111 = this.a;
    if (r111 == null) {
      i = 0;
    } else {
      i = r111.hashCode();
    } 
    q11 q111 = this.b;
    if (q111 != null)
      j = q111.hashCode(); 
    return (i ^ 0xF4243) * 1000003 ^ j;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("NetworkConnectionInfo{networkType=");
    stringBuilder.append(this.a);
    stringBuilder.append(", mobileSubtype=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */