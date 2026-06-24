import android.view.DisplayCutout;

public final class g00 {
  public final DisplayCutout a;
  
  public g00(DisplayCutout paramDisplayCutout) {
    this.a = paramDisplayCutout;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || g00.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return this.a.equals(((g00)paramObject).a);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("DisplayCutoutCompat{");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */