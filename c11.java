import java.util.List;

public final class c11 {
  public final List a;
  
  public final int b;
  
  public c11() {
    this(-1, d40.b);
  }
  
  public c11(int paramInt, List paramList) {
    this.a = paramList;
    this.b = paramInt;
    if (!paramList.isEmpty() || paramInt != -1) {
      if (!paramList.isEmpty()) {
        int i = paramList.size();
        if (paramInt >= 0 && paramInt < i)
          return; 
      } 
    } else {
      return;
    } 
    StringBuilder stringBuilder = ga1.k(paramInt, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
    stringBuilder.append(new ji0(0, paramList.size() - 1, 1));
    stringBuilder.append("'.");
    throw new IllegalArgumentException(stringBuilder.toString().toString());
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || c11.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return (this.b != ((c11)paramObject).b) ? false : (!!ui0.c(this.a, ((c11)paramObject).a));
  }
  
  public final int hashCode() {
    int i = this.b;
    return this.a.hashCode() + i * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("NavigationEventHistory(currentIndex=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mergedHistory=");
    stringBuilder.append(this.a);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */