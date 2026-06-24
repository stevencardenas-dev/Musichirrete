public final class li0 extends ji0 {
  public static final li0 f = (li0)new ji0(1, 0, 1);
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof li0)
      if (!isEmpty() || !((li0)paramObject).isEmpty()) {
        paramObject = paramObject;
        int i = ((ji0)paramObject).b;
        if (this.b == i && this.c == ((ji0)paramObject).c)
          return true; 
      } else {
        return true;
      }  
    return false;
  }
  
  public final int hashCode() {
    return isEmpty() ? -1 : (this.b * 31 + this.c);
  }
  
  public final boolean isEmpty() {
    return (this.b > this.c);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append("..");
    stringBuilder.append(this.c);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\li0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */