public final class j9 implements ab1 {
  public final int a;
  
  public j9(int paramInt) {
    this.a = paramInt;
  }
  
  public final Class annotationType() {
    return ab1.class;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof ab1) {
      paramObject = paramObject;
      if (this.a == paramObject.tag() && za1.b.equals(paramObject.intEncoding()))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return (this.a ^ 0xDE0D66) + (za1.b.hashCode() ^ 0x79AD669E);
  }
  
  public final za1 intEncoding() {
    return za1.b;
  }
  
  public final int tag() {
    return this.a;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf(tag=");
    stringBuilder.append(this.a);
    stringBuilder.append("intEncoding=");
    stringBuilder.append(za1.b);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */