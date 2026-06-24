public final class cf {
  public static final String b = Character.toString('‎');
  
  public static final String c = Character.toString('‏');
  
  public static final cf d = new cf(false);
  
  public static final cf e = new cf(true);
  
  public final boolean a;
  
  public cf(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  public static int a(String paramString) {
    bf bf = new bf(paramString);
    bf.c = 0;
    byte b3 = 0;
    byte b2 = 0;
    byte b1 = b2;
    while (true) {
      int i = bf.c;
      if (i < bf.b && !b3) {
        paramString = bf.a;
        char c = paramString.charAt(i);
        bf.d = c;
        boolean bool = Character.isHighSurrogate(c);
        i = bf.c;
        if (bool) {
          int j = Character.codePointAt(paramString, i);
          i = bf.c;
          bf.c = Character.charCount(j) + i;
          i = Character.getDirectionality(j);
        } else {
          bf.c = i + 1;
          c = bf.d;
          if (c < '܀') {
            i = bf.e[c];
          } else {
            i = Character.getDirectionality(c);
          } 
        } 
        if (i != 0) {
          if (i != 1 && i != 2) {
            if (i != 9) {
              switch (i) {
                case 18:
                  b1--;
                  b2 = 0;
                  continue;
                case 16:
                case 17:
                  b1++;
                  b2 = 1;
                  continue;
                case 14:
                case 15:
                  b1++;
                  b2 = -1;
                  continue;
              } 
            } else {
              continue;
            } 
          } else if (b1 == 0) {
            continue;
          } 
        } else if (b1 == 0) {
          break;
        } 
        b3 = b1;
        continue;
      } 
      if (b3 != 0) {
        if (b2 != 0)
          return b2; 
        while (true) {
          if (bf.c > 0) {
            switch (bf.a()) {
              default:
                continue;
              case 18:
                b1++;
                continue;
              case 16:
              case 17:
                if (b3 == b1)
                  return 1; 
                b1--;
                continue;
              case 14:
              case 15:
                break;
            } 
            if (b3 == b1)
              return -1; 
          } else {
            break;
          } 
          b1--;
        } 
      } 
      return 0;
    } 
    return -1;
  }
  
  public static int b(String paramString) {
    bf bf = new bf(paramString);
    bf.c = bf.b;
    int i = 0;
    while (true) {
      int j = i;
      for (i = j;; i = k - 1) {
        int k = i;
        if (bf.c > 0) {
          byte b = bf.a();
          if (b != 0) {
            if (b != 1 && b != 2) {
              i = k;
              if (b != 9) {
                switch (b) {
                  default:
                    i = k;
                    if (!j)
                      continue; 
                    continue;
                  case 18:
                    i = k + 1;
                    continue;
                  case 16:
                  case 17:
                    if (j == k)
                      return 1; 
                    i = k - 1;
                    continue;
                  case 14:
                  case 15:
                    break;
                } 
                if (j == k)
                  return -1; 
              } else {
                continue;
              } 
            } else {
              if (k == 0)
                return 1; 
              i = k;
              if (j == 0)
                i = k; 
              continue;
            } 
          } else {
            if (k == 0)
              return -1; 
            i = k;
            if (j == 0)
              continue; 
            continue;
          } 
        } else {
          return 0;
        } 
      } 
      break;
    } 
  }
  
  static {
    sb sb = wt1.c;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */