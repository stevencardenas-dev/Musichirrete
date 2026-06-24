import java.util.Arrays;

public final class dp2 {
  public final String a;
  
  public final String b;
  
  public final boolean c;
  
  public dp2(String paramString, boolean paramBoolean) {
    n21.k(paramString);
    this.a = paramString;
    n21.k("com.google.android.gms");
    this.b = "com.google.android.gms";
    this.c = paramBoolean;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof dp2))
      return false; 
    paramObject = paramObject;
    return (z51.g(this.a, ((dp2)paramObject).a) && z51.g(this.b, ((dp2)paramObject).b) && z51.g(null, null) && this.c == ((dp2)paramObject).c);
  }
  
  public final int hashCode() {
    boolean bool = this.c;
    return Arrays.hashCode(new Object[] { this.a, this.b, null, Integer.valueOf(4225), Boolean.valueOf(bool) });
  }
  
  public final String toString() {
    String str = this.a;
    if (str != null)
      return str; 
    n21.m(null);
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */