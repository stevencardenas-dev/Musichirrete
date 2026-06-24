import java.util.ArrayList;

public final class va extends we {
  public final ArrayList a;
  
  public va(ArrayList paramArrayList) {
    this.a = paramArrayList;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof we) {
      paramObject = ((va)paramObject).a;
      return this.a.equals(paramObject);
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a.hashCode() ^ 0xF4243;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("BatchedLogRequest{logRequests=");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\va.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */