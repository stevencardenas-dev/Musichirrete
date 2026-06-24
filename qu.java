public abstract class qu implements ti0, ri0 {
  public final iu b;
  
  public final int c;
  
  public final boolean e;
  
  public qu(iu paramiu, int paramInt, boolean paramBoolean) {
    this.b = paramiu;
    this.c = paramInt;
    this.e = paramBoolean;
  }
  
  public int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    int n;
    int i1;
    int i = paramCharSequence.length();
    int m = Math.min(this.c, i - paramInt);
    int k = 0;
    i = 0;
    int j = i;
    while (true) {
      n = i;
      i1 = j;
      if (k < m) {
        i1 = paramInt + k;
        char c = paramCharSequence.charAt(i1);
        if (k == 0 && (c == '-' || c == '+') && this.e) {
          j = 1;
          if (c == '-') {
            i = 1;
          } else {
            i = 0;
          } 
          if (c != '+')
            j = 0; 
          n = k + 1;
          if (n < m) {
            i1 = paramCharSequence.charAt(i1 + 1);
            if (i1 >= 48 && i1 <= 57) {
              m = Math.min(m + 1, paramCharSequence.length() - paramInt);
              k = n;
              continue;
            } 
          } 
          n = i;
          i1 = j;
          break;
        } 
        n = i;
        i1 = j;
        if (c >= '0') {
          if (c > '9') {
            n = i;
            i1 = j;
            break;
          } 
          k++;
          continue;
        } 
      } 
      break;
    } 
    if (k == 0)
      return paramInt ^ 0xFFFFFFFF; 
    if (k >= 9) {
      if (i1 != 0) {
        i = paramInt + k;
        paramInt = Integer.parseInt(paramCharSequence.subSequence(paramInt + 1, i).toString());
      } else {
        i = paramInt + k;
        paramInt = Integer.parseInt(paramCharSequence.subSequence(paramInt, i).toString());
      } 
    } else {
      if (n != 0 || i1 != 0) {
        i = paramInt + 1;
      } else {
        i = paramInt;
      } 
      m = i + 1;
      try {
        i = paramCharSequence.charAt(i);
        i1 = i - 48;
        j = paramInt + k;
        i = m;
        for (paramInt = i1; i < j; paramInt = k + (paramInt << 3) + (paramInt << 1) - 48) {
          k = paramCharSequence.charAt(i);
          i++;
        } 
        if (n != 0) {
          paramInt = -paramInt;
          i = j;
        } else {
          i = j;
        } 
        av av1 = paramcv.c();
        dd1 dd11 = paramcv.a;
        av1.b = this.b.a(dd11);
        av1.c = paramInt;
        av1.e = null;
        av1.f = null;
        return i;
      } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
        return paramInt ^ 0xFFFFFFFF;
      } 
    } 
    av av = stringIndexOutOfBoundsException.c();
    dd1 dd1 = ((cv)stringIndexOutOfBoundsException).a;
    av.b = this.b.a(dd1);
    av.c = paramInt;
    av.e = null;
    av.f = null;
    return i;
  }
  
  public final int d() {
    return this.c;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */