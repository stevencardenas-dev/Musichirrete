import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public final class cv {
  public final dd1 a;
  
  public final Locale b;
  
  public final int c;
  
  public hv d;
  
  public Integer e;
  
  public av[] f;
  
  public int g;
  
  public boolean h;
  
  public bv i;
  
  public cv(dd1 paramdd1) {
    AtomicReference atomicReference = ev.a;
    dd1 dd11 = paramdd1;
    if (paramdd1 == null)
      dd11 = xg0.T0(); 
    hv hv1 = dd11.G();
    this.a = dd11.y0();
    this.b = Locale.getDefault();
    this.c = 2000;
    this.d = hv1;
    this.f = new av[8];
  }
  
  public static int a(g20 paramg201, g20 paramg202) {
    return (paramg201 == null || !paramg201.f()) ? ((paramg202 == null || !paramg202.f()) ? 0 : -1) : ((paramg202 == null || !paramg202.f()) ? 1 : -paramg201.compareTo((T)paramg202));
  }
  
  public final long b(String paramString) {
    StringBuilder stringBuilder;
    iu iu;
    av[] arrayOfAv2 = this.f;
    int j = this.g;
    av[] arrayOfAv1 = arrayOfAv2;
    if (this.h) {
      arrayOfAv1 = (av[])arrayOfAv2.clone();
      this.f = arrayOfAv1;
      this.h = false;
    } 
    if (j > 10) {
      Arrays.sort((Object[])arrayOfAv1, 0, j);
    } else {
      for (byte b = 0; b < j; b++) {
        byte b1 = b;
        while (b1 > 0) {
          int m = b1 - 1;
          av av1 = arrayOfAv1[m];
          av av2 = arrayOfAv1[b1];
          av1.getClass();
          hu hu = av2.b;
          int k = a(av1.b.p(), hu.p());
          if (k == 0)
            k = a(av1.b.i(), hu.i()); 
          if (k > 0) {
            av1 = arrayOfAv1[b1];
            arrayOfAv1[b1] = arrayOfAv1[m];
            arrayOfAv1[m] = av1;
            b1--;
          } 
        } 
      } 
    } 
    if (j > 0) {
      dd1 dd12;
      AtomicReference atomicReference = ev.a;
      dd1 dd11 = this.a;
      if (dd11 == null) {
        dd12 = xg0.T0();
      } else {
        dd12 = dd11;
      } 
      g20 g202 = dd12.a0();
      if (dd11 == null) {
        dd12 = xg0.T0();
      } else {
        dd12 = dd11;
      } 
      g20 g201 = dd12.p();
      g20 g203 = (arrayOfAv1[0]).b.i();
      if (a(g203, g202) >= 0 && a(g203, g201) <= 0) {
        iu = iu.j;
        av av1 = c();
        av1.b = iu.a(dd11);
        av1.c = this.c;
        av1.e = null;
        av1.f = null;
        return b(paramString);
      } 
    } 
    long l1 = 0L;
    int i = 0;
    while (i < j) {
      iu iu1 = iu[i];
      try {
        String str = ((av)iu1).e;
        hu hu = ((av)iu1).b;
        if (str == null) {
          l1 = hu.y(l1, ((av)iu1).c);
        } else {
          l1 = hu.x(l1, str, ((av)iu1).f);
        } 
        l1 = ((av)iu1).b.v(l1);
        i++;
      } catch (eh0 eh0) {
        StringBuilder stringBuilder1 = new StringBuilder("Cannot parse \"");
        stringBuilder1.append(paramString);
        stringBuilder1.append('"');
        paramString = stringBuilder1.toString();
        if (eh0.b != null) {
          stringBuilder = ga1.l(paramString, ": ");
          stringBuilder.append(eh0.b);
          eh0.b = stringBuilder.toString();
        } else {
          eh0.b = (String)stringBuilder;
        } 
        throw eh0;
      } 
    } 
    i = 0;
    long l2;
    for (l2 = l1; i < j; l2 = l1) {
      l1 = l2;
      if (!((av)eh0[i]).b.s()) {
        boolean bool;
        eh0 eh01 = eh0[i];
        if (i == j - 1) {
          bool = true;
        } else {
          bool = false;
        } 
        String str = ((av)eh01).e;
        hu hu = ((av)eh01).b;
        if (str == null) {
          l2 = hu.y(l2, ((av)eh01).c);
        } else {
          l2 = hu.x(l2, str, ((av)eh01).f);
        } 
        l1 = l2;
        if (bool)
          l1 = ((av)eh01).b.v(l2); 
      } 
      i++;
    } 
    Integer integer = this.e;
    if (integer != null)
      return l2 - integer.intValue(); 
    hv hv1 = this.d;
    if (hv1 != null) {
      i = hv1.i(l2);
      l1 = l2 - i;
      if (i == this.d.h(l1))
        return l1; 
      hv1 = this.d;
      StringBuilder stringBuilder1 = new StringBuilder("Illegal instant due to time zone offset transition (");
      stringBuilder1.append(hv1);
      stringBuilder1.append(')');
      String str = stringBuilder1.toString();
      stringBuilder1 = new StringBuilder("Cannot parse \"");
      stringBuilder1.append(stringBuilder);
      stringBuilder1.append("\": ");
      stringBuilder1.append(str);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    return l2;
  }
  
  public final av c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : [Lav;
    //   4: astore #4
    //   6: aload_0
    //   7: getfield g : I
    //   10: istore_2
    //   11: iload_2
    //   12: aload #4
    //   14: arraylength
    //   15: if_icmpeq -> 28
    //   18: aload #4
    //   20: astore_3
    //   21: aload_0
    //   22: getfield h : Z
    //   25: ifeq -> 70
    //   28: iload_2
    //   29: aload #4
    //   31: arraylength
    //   32: if_icmpne -> 42
    //   35: iload_2
    //   36: iconst_2
    //   37: imul
    //   38: istore_1
    //   39: goto -> 46
    //   42: aload #4
    //   44: arraylength
    //   45: istore_1
    //   46: iload_1
    //   47: anewarray av
    //   50: astore_3
    //   51: aload #4
    //   53: iconst_0
    //   54: aload_3
    //   55: iconst_0
    //   56: iload_2
    //   57: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   60: aload_0
    //   61: aload_3
    //   62: putfield f : [Lav;
    //   65: aload_0
    //   66: iconst_0
    //   67: putfield h : Z
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield i : Lbv;
    //   75: aload_3
    //   76: iload_2
    //   77: aaload
    //   78: astore #5
    //   80: aload #5
    //   82: astore #4
    //   84: aload #5
    //   86: ifnonnull -> 103
    //   89: new java/lang/Object
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: astore #4
    //   98: aload_3
    //   99: iload_2
    //   100: aload #4
    //   102: aastore
    //   103: aload_0
    //   104: iload_2
    //   105: iconst_1
    //   106: iadd
    //   107: putfield g : I
    //   110: aload #4
    //   112: areturn
  }
  
  public final void d(Object paramObject) {
    if (paramObject instanceof bv) {
      paramObject = paramObject;
      if (this == ((bv)paramObject).e) {
        this.d = ((bv)paramObject).a;
        this.e = ((bv)paramObject).b;
        this.f = ((bv)paramObject).c;
        int i = ((bv)paramObject).d;
        if (i < this.g)
          this.h = true; 
        this.g = i;
        this.i = (bv)paramObject;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */