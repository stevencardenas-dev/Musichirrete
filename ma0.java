public abstract class ma0 {
  public static final double a = Math.log(10.0D);
  
  public static final int b = 0;
  
  public static void a(Appendable paramAppendable, int paramInt1, int paramInt2) {
    int i = paramInt1;
    if (paramInt1 < 0) {
      paramAppendable.append('-');
      i = paramInt2;
      if (paramInt1 != Integer.MIN_VALUE) {
        i = -paramInt1;
      } else {
        while (i > 10) {
          paramAppendable.append('0');
          i--;
        } 
        paramAppendable.append("2147483648");
        return;
      } 
    } 
    if (i < 10) {
      while (paramInt2 > 1) {
        paramAppendable.append('0');
        paramInt2--;
      } 
      paramAppendable.append((char)(i + 48));
      return;
    } 
    if (i < 100) {
      while (paramInt2 > 2) {
        paramAppendable.append('0');
        paramInt2--;
      } 
      paramInt1 = (i + 1) * 13421772 >> 27;
      paramAppendable.append((char)(paramInt1 + 48));
      paramAppendable.append((char)(i - (paramInt1 << 3) - (paramInt1 << 1) + 48));
      return;
    } 
    if (i < 1000) {
      paramInt1 = 3;
    } else if (i < 10000) {
      paramInt1 = 4;
    } else {
      paramInt1 = (int)(Math.log(i) / a) + 1;
    } 
    while (paramInt2 > paramInt1) {
      paramAppendable.append('0');
      paramInt2--;
    } 
    paramAppendable.append(Integer.toString(i));
  }
  
  public static void b(int paramInt, StringBuilder paramStringBuilder) {
    int i = paramInt;
    if (paramInt < 0) {
      paramStringBuilder.append('-');
      if (paramInt != Integer.MIN_VALUE) {
        i = -paramInt;
      } else {
        paramStringBuilder.append("2147483648");
        return;
      } 
    } 
    if (i < 10) {
      paramStringBuilder.append((char)(i + 48));
      return;
    } 
    if (i < 100) {
      paramInt = (i + 1) * 13421772 >> 27;
      paramStringBuilder.append((char)(paramInt + 48));
      paramStringBuilder.append((char)(i - (paramInt << 3) - (paramInt << 1) + 48));
      return;
    } 
    paramStringBuilder.append(Integer.toString(i));
  }
  
  public static int c(CharSequence paramCharSequence, int paramInt) {
    int i = paramCharSequence.charAt(paramInt) - 48;
    return paramCharSequence.charAt(paramInt + 1) + (i << 3) + (i << 1) - 48;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ma0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */