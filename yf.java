import java.lang.ref.WeakReference;

public final class yf implements Comparable, xj1 {
  public final long b;
  
  public final String c;
  
  public WeakReference e;
  
  public yf(long paramLong, String paramString) {
    this.b = paramLong;
    paramString = paramString.trim();
    if (!paramString.isEmpty()) {
      this.c = paramString;
      return;
    } 
    this.c = "@".concat(n21.D(paramLong * 1000L, false, false));
  }
  
  public final boolean a(String[] paramArrayOfString) {
    WeakReference<String> weakReference = this.e;
    if (weakReference != null) {
      String str1 = weakReference.get();
      if (str1 != null)
        return ag0.g0(str1, paramArrayOfString); 
    } 
    String str = ag0.i0(this.c.toUpperCase().toLowerCase());
    this.e = new WeakReference<String>(str);
    return ag0.g0(str, paramArrayOfString);
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    int i = Long.compare(this.b, ((yf)paramObject).b);
    return (i != 0) ? i : this.c.compareToIgnoreCase(((yf)paramObject).c);
  }
  
  public final String getName() {
    return this.c;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */