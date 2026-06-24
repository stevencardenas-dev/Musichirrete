import android.text.TextUtils;

public final class mx {
  public final int a;
  
  public final int b;
  
  public final String c;
  
  public mx(int paramInt1, int paramInt2, String paramString) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && mx.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a == ((mx)paramObject).a && this.b == ((mx)paramObject).b && TextUtils.equals(this.c, ((mx)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    byte b;
    int j = this.a;
    int i = this.b;
    String str = this.c;
    if (str != null) {
      b = str.hashCode();
    } else {
      b = 0;
    } 
    return (j * 31 + i) * 31 + b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */