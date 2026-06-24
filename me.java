import java.util.Locale;

public final class me extends g91 {
  public final String f(int paramInt, Locale paramLocale) {
    return (md0.b(paramLocale)).f[paramInt];
  }
  
  public final int k(Locale paramLocale) {
    return (md0.b(paramLocale)).m;
  }
  
  public final long x(long paramLong, String paramString, Locale paramLocale) {
    String[] arrayOfString = (md0.b(paramLocale)).f;
    int i = arrayOfString.length;
    while (true) {
      int j = i - 1;
      if (j >= 0) {
        i = j;
        if (arrayOfString[j].equalsIgnoreCase(paramString))
          return w(j, paramLong); 
        continue;
      } 
      throw new eh0(iu.r, paramString);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */