import java.util.Arrays;

public final class ha1 extends c9 {
  public pn1[] f;
  
  public pn1[] g;
  
  public int h;
  
  public j01 i;
  
  public final pn1 d(boolean[] paramArrayOfboolean) {
    Object object;
    byte b = 0;
    byte b1 = -1;
    while (b < this.h) {
      pn1[] arrayOfPn1 = this.f;
      pn1 pn11 = arrayOfPn1[b];
      if (paramArrayOfboolean[pn11.c]) {
        Object object1 = object;
        continue;
      } 
      j01 j011 = this.i;
      j011.c = pn11;
      byte b2 = 8;
      if (object == -1) {
        while (true) {
          Object object1 = object;
          if (b2 >= 0) {
            float f = ((pn1)j011.c).j[b2];
            if (f > 0.0F) {
              object1 = object;
              break;
            } 
            if (f >= 0.0F) {
              b2--;
              continue;
            } 
          } else {
            break;
          } 
          byte b3 = b;
          break;
        } 
        continue;
      } 
      pn11 = arrayOfPn1[object];
      while (true) {
        Object object1 = object;
        b2--;
      } 
      continue;
      b++;
      object = SYNTHETIC_LOCAL_VARIABLE_6;
    } 
    return (object == -1) ? null : this.f[object];
  }
  
  public final boolean e() {
    return (this.h == 0);
  }
  
  public final void i(ln0 paramln0, c9 paramc9, boolean paramBoolean) {
    pn1 pn11 = paramc9.a;
    if (pn11 == null)
      return; 
    float[] arrayOfFloat = pn11.j;
    w8 w8 = paramc9.d;
    int i = w8.d();
    for (byte b = 0; b < i; b++) {
      float[] arrayOfFloat1;
      pn1 pn12 = w8.e(b);
      float f2 = w8.f(b);
      j01 j011 = this.i;
      j011.c = pn12;
      if (pn12.b) {
        boolean bool = true;
        for (byte b1 = 0; b1 < 9; b1++) {
          arrayOfFloat1 = ((pn1)j011.c).j;
          float f = arrayOfFloat1[b1];
          f = arrayOfFloat[b1] * f2 + f;
          arrayOfFloat1[b1] = f;
          if (Math.abs(f) < 1.0E-4F) {
            ((pn1)j011.c).j[b1] = 0.0F;
          } else {
            bool = false;
          } 
        } 
        if (bool)
          ((ha1)j011.e).k((pn1)j011.c); 
      } else {
        for (byte b1 = 0; b1 < 9; b1++) {
          float f = arrayOfFloat[b1];
          if (f != 0.0F) {
            float f3 = f * f2;
            f = f3;
            if (Math.abs(f3) < 1.0E-4F)
              f = 0.0F; 
            ((pn1)j011.c).j[b1] = f;
          } else {
            ((pn1)j011.c).j[b1] = 0.0F;
          } 
        } 
        j((pn1)arrayOfFloat1);
      } 
      float f1 = this.b;
      this.b = paramc9.b * f2 + f1;
    } 
    k(pn11);
  }
  
  public final void j(pn1 parampn1) {
    int i = this.h;
    pn1[] arrayOfPn1 = this.f;
    if (i + 1 > arrayOfPn1.length) {
      arrayOfPn1 = Arrays.<pn1>copyOf(arrayOfPn1, arrayOfPn1.length * 2);
      this.f = arrayOfPn1;
      this.g = Arrays.<pn1>copyOf(arrayOfPn1, arrayOfPn1.length * 2);
    } 
    arrayOfPn1 = this.f;
    int j = this.h;
    arrayOfPn1[j] = parampn1;
    i = j + 1;
    this.h = i;
    if (i > 1 && (arrayOfPn1[j]).c > parampn1.c) {
      j = 0;
      i = 0;
      while (true) {
        int k = this.h;
        arrayOfPn1 = this.g;
        if (i < k) {
          arrayOfPn1[i] = this.f[i];
          i++;
          continue;
        } 
        Arrays.sort(arrayOfPn1, 0, k, new ij(8));
        for (i = j; i < this.h; i++)
          this.f[i] = this.g[i]; 
        break;
      } 
    } 
    parampn1.b = true;
    parampn1.a(this);
  }
  
  public final void k(pn1 parampn1) {
    for (int i = 0; i < this.h; i++) {
      if (this.f[i] == parampn1)
        while (true) {
          int j = this.h;
          if (i < j - 1) {
            pn1[] arrayOfPn1 = this.f;
            j = i + 1;
            arrayOfPn1[i] = arrayOfPn1[j];
            i = j;
            continue;
          } 
          this.h = j - 1;
          parampn1.b = false;
          return;
        }  
    } 
  }
  
  public final String toString() {
    j01 j011 = this.i;
    StringBuilder stringBuilder = new StringBuilder(" goal -> (");
    stringBuilder.append(this.b);
    stringBuilder.append(") : ");
    String str = stringBuilder.toString();
    for (byte b = 0; b < this.h; b++) {
      j011.c = this.f[b];
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      stringBuilder1.append(j011);
      stringBuilder1.append(" ");
      str = stringBuilder1.toString();
    } 
    return str;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ha1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */