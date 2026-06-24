import java.util.Arrays;

public final class w8 {
  public int a = 0;
  
  public final c9 b;
  
  public final zv0 c;
  
  public int d = 8;
  
  public int[] e = new int[8];
  
  public int[] f = new int[8];
  
  public float[] g = new float[8];
  
  public int h = -1;
  
  public int i = -1;
  
  public boolean j = false;
  
  public w8(c9 paramc9, zv0 paramzv0) {
    this.b = paramc9;
    this.c = paramzv0;
  }
  
  public final void a(pn1 parampn1, float paramFloat, boolean paramBoolean) {
    if (paramFloat <= -0.001F || paramFloat >= 0.001F) {
      int[] arrayOfInt;
      int i = this.h;
      c9 c91 = this.b;
      if (i == -1) {
        this.h = 0;
        this.g[0] = paramFloat;
        this.e[0] = parampn1.c;
        this.f[0] = -1;
        parampn1.m++;
        parampn1.a(c91);
        this.a++;
        if (!this.j) {
          i = this.i + 1;
          this.i = i;
          arrayOfInt = this.e;
          if (i >= arrayOfInt.length) {
            this.j = true;
            this.i = arrayOfInt.length - 1;
            return;
          } 
        } 
      } else {
        int j = 0;
        int k = -1;
        while (i != -1 && j < this.a) {
          int n = this.e[i];
          int m = ((pn1)arrayOfInt).c;
          if (n == m) {
            float[] arrayOfFloat = this.g;
            float f = arrayOfFloat[i] + paramFloat;
            paramFloat = f;
            if (f > -0.001F) {
              paramFloat = f;
              if (f < 0.001F)
                paramFloat = 0.0F; 
            } 
            arrayOfFloat[i] = paramFloat;
            if (paramFloat == 0.0F) {
              j = this.h;
              int[] arrayOfInt2 = this.f;
              if (i == j) {
                this.h = arrayOfInt2[i];
              } else {
                arrayOfInt2[k] = arrayOfInt2[i];
              } 
              if (paramBoolean)
                arrayOfInt.b(c91); 
              if (this.j)
                this.i = i; 
              ((pn1)arrayOfInt).m--;
              this.a--;
              return;
            } 
          } else {
            if (n < m)
              k = i; 
            i = this.f[i];
            j++;
            continue;
          } 
          return;
        } 
        i = this.i;
        if (this.j) {
          int[] arrayOfInt2 = this.e;
          if (arrayOfInt2[i] != -1)
            i = arrayOfInt2.length; 
        } else {
          i++;
        } 
        int[] arrayOfInt1 = this.e;
        j = i;
        if (i >= arrayOfInt1.length) {
          j = i;
          if (this.a < arrayOfInt1.length) {
            byte b = 0;
            while (true) {
              arrayOfInt1 = this.e;
              j = i;
              if (b < arrayOfInt1.length) {
                if (arrayOfInt1[b] == -1) {
                  j = b;
                  break;
                } 
                b++;
                continue;
              } 
              break;
            } 
          } 
        } 
        arrayOfInt1 = this.e;
        i = j;
        if (j >= arrayOfInt1.length) {
          i = arrayOfInt1.length;
          j = this.d * 2;
          this.d = j;
          this.j = false;
          this.i = i - 1;
          this.g = Arrays.copyOf(this.g, j);
          this.e = Arrays.copyOf(this.e, this.d);
          this.f = Arrays.copyOf(this.f, this.d);
        } 
        this.e[i] = ((pn1)arrayOfInt).c;
        this.g[i] = paramFloat;
        arrayOfInt1 = this.f;
        if (k != -1) {
          arrayOfInt1[i] = arrayOfInt1[k];
          arrayOfInt1[k] = i;
        } else {
          arrayOfInt1[i] = this.h;
          this.h = i;
        } 
        ((pn1)arrayOfInt).m++;
        arrayOfInt.a(c91);
        this.a++;
        if (!this.j)
          this.i++; 
        i = this.i;
        arrayOfInt = this.e;
        if (i >= arrayOfInt.length) {
          this.j = true;
          this.i = arrayOfInt.length - 1;
        } 
      } 
    } 
  }
  
  public final void b() {
    int i = this.h;
    for (byte b = 0; i != -1 && b < this.a; b++) {
      pn1 pn1 = ((pn1[])this.c.f)[this.e[i]];
      if (pn1 != null)
        pn1.b(this.b); 
      i = this.f[i];
    } 
    this.h = -1;
    this.i = -1;
    this.j = false;
    this.a = 0;
  }
  
  public final float c(pn1 parampn1) {
    int i = this.h;
    for (byte b = 0; i != -1 && b < this.a; b++) {
      if (this.e[i] == parampn1.c)
        return this.g[i]; 
      i = this.f[i];
    } 
    return 0.0F;
  }
  
  public final int d() {
    return this.a;
  }
  
  public final pn1 e(int paramInt) {
    int i = this.h;
    for (byte b = 0; i != -1 && b < this.a; b++) {
      if (b == paramInt)
        return ((pn1[])this.c.f)[this.e[i]]; 
      i = this.f[i];
    } 
    return null;
  }
  
  public final float f(int paramInt) {
    int i = this.h;
    for (byte b = 0; i != -1 && b < this.a; b++) {
      if (b == paramInt)
        return this.g[i]; 
      i = this.f[i];
    } 
    return 0.0F;
  }
  
  public final void g(pn1 parampn1, float paramFloat) {
    int[] arrayOfInt;
    if (paramFloat == 0.0F) {
      h(parampn1, true);
      return;
    } 
    int i = this.h;
    c9 c91 = this.b;
    if (i == -1) {
      this.h = 0;
      this.g[0] = paramFloat;
      this.e[0] = parampn1.c;
      this.f[0] = -1;
      parampn1.m++;
      parampn1.a(c91);
      this.a++;
      if (!this.j) {
        i = this.i + 1;
        this.i = i;
        arrayOfInt = this.e;
        if (i >= arrayOfInt.length) {
          this.j = true;
          this.i = arrayOfInt.length - 1;
          return;
        } 
      } 
    } else {
      int j = 0;
      int k = -1;
      while (i != -1 && j < this.a) {
        int n = this.e[i];
        int m = ((pn1)arrayOfInt).c;
        if (n == m) {
          this.g[i] = paramFloat;
          return;
        } 
        if (n < m)
          k = i; 
        i = this.f[i];
        j++;
      } 
      i = this.i;
      if (this.j) {
        int[] arrayOfInt2 = this.e;
        if (arrayOfInt2[i] != -1)
          i = arrayOfInt2.length; 
      } else {
        i++;
      } 
      int[] arrayOfInt1 = this.e;
      j = i;
      if (i >= arrayOfInt1.length) {
        j = i;
        if (this.a < arrayOfInt1.length) {
          byte b = 0;
          while (true) {
            arrayOfInt1 = this.e;
            j = i;
            if (b < arrayOfInt1.length) {
              if (arrayOfInt1[b] == -1) {
                j = b;
                break;
              } 
              b++;
              continue;
            } 
            break;
          } 
        } 
      } 
      arrayOfInt1 = this.e;
      i = j;
      if (j >= arrayOfInt1.length) {
        i = arrayOfInt1.length;
        j = this.d * 2;
        this.d = j;
        this.j = false;
        this.i = i - 1;
        this.g = Arrays.copyOf(this.g, j);
        this.e = Arrays.copyOf(this.e, this.d);
        this.f = Arrays.copyOf(this.f, this.d);
      } 
      this.e[i] = ((pn1)arrayOfInt).c;
      this.g[i] = paramFloat;
      arrayOfInt1 = this.f;
      if (k != -1) {
        arrayOfInt1[i] = arrayOfInt1[k];
        arrayOfInt1[k] = i;
      } else {
        arrayOfInt1[i] = this.h;
        this.h = i;
      } 
      ((pn1)arrayOfInt).m++;
      arrayOfInt.a(c91);
      i = this.a + 1;
      this.a = i;
      if (!this.j)
        this.i++; 
      arrayOfInt = this.e;
      if (i >= arrayOfInt.length)
        this.j = true; 
      if (this.i >= arrayOfInt.length) {
        this.j = true;
        this.i = arrayOfInt.length - 1;
      } 
    } 
  }
  
  public final float h(pn1 parampn1, boolean paramBoolean) {
    int i = this.h;
    if (i != -1) {
      int j = 0;
      int k = -1;
      while (i != -1 && j < this.a) {
        if (this.e[i] == parampn1.c) {
          j = this.h;
          int[] arrayOfInt = this.f;
          if (i == j) {
            this.h = arrayOfInt[i];
          } else {
            arrayOfInt[k] = arrayOfInt[i];
          } 
          if (paramBoolean)
            parampn1.b(this.b); 
          parampn1.m--;
          this.a--;
          this.e[i] = -1;
          if (this.j)
            this.i = i; 
          return this.g[i];
        } 
        int m = this.f[i];
        j++;
        k = i;
        i = m;
      } 
    } 
    return 0.0F;
  }
  
  public final String toString() {
    int i = this.h;
    String str = "";
    for (byte b = 0; i != -1 && b < this.a; b++) {
      StringBuilder stringBuilder = x41.p(str.concat(" -> "));
      stringBuilder.append(this.g[i]);
      stringBuilder.append(" : ");
      stringBuilder = x41.p(stringBuilder.toString());
      stringBuilder.append(((pn1[])this.c.f)[this.e[i]]);
      str = stringBuilder.toString();
      i = this.f[i];
    } 
    return str;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */