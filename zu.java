import java.util.ArrayList;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public final class zu {
  public final int a;
  
  public final ArrayList b;
  
  public Object c;
  
  public zu() {
    this.b = new ArrayList();
  }
  
  public static void n(int paramInt, StringBuilder paramStringBuilder) {
    while (--paramInt >= 0)
      paramStringBuilder.append('�'); 
  }
  
  public static boolean o(String paramString, CharSequence paramCharSequence, int paramInt) {
    int i = paramString.length();
    if (paramCharSequence.length() - paramInt < i)
      return false; 
    for (byte b = 0; b < i; b++) {
      if (paramCharSequence.charAt(paramInt + b) != paramString.charAt(b))
        return false; 
    } 
    return true;
  }
  
  public static boolean p(String paramString, CharSequence paramCharSequence, int paramInt) {
    int i = paramString.length();
    if (paramCharSequence.length() - paramInt < i)
      return false; 
    for (byte b = 0; b < i; b++) {
      char c2 = paramCharSequence.charAt(paramInt + b);
      char c1 = paramString.charAt(b);
      if (c2 != c1) {
        c2 = Character.toUpperCase(c2);
        c1 = Character.toUpperCase(c1);
        if (c2 != c1 && Character.toLowerCase(c2) != Character.toLowerCase(c1))
          return false; 
      } 
    } 
    return true;
  }
  
  public void a(String paramString, Object paramObject) {
    int i = paramString.length();
    paramObject = String.valueOf(paramObject);
    paramString = x41.o(new StringBuilder(i + 1 + paramObject.length()), paramString, hrSTyFuSIm.PnZCJiFZSBYZsJ, (String)paramObject);
    this.b.add(paramString);
  }
  
  public void b(ku paramku) {
    if (paramku != null) {
      d(paramku.a, paramku.b);
      return;
    } 
    l0.l("No formatter supplied");
  }
  
  public void c(si0[] paramArrayOfsi0) {
    dv dv;
    int i = paramArrayOfsi0.length;
    byte b = 0;
    if (i == 1) {
      si01 = paramArrayOfsi0[0];
      if (si01 != null) {
        d(null, si01);
        return;
      } 
      l0.l("No parser supplied");
      return;
    } 
    ri0[] arrayOfRi0 = new ri0[i];
    while (b < i - 1) {
      dv dv1;
      si0 si02 = si01[b];
      if (si02 == null)
        if (si02 == null) {
          si02 = null;
        } else {
          dv1 = new dv(si02);
        }  
      arrayOfRi0[b] = dv1;
      if (dv1 != null) {
        b++;
        continue;
      } 
      l0.l("Incomplete parser array");
      return;
    } 
    si0 si01 = si01[b];
    if (si01 == null)
      if (si01 == null) {
        si01 = null;
      } else {
        dv = new dv(si01);
      }  
    arrayOfRi0[b] = dv;
    d(null, new pu(arrayOfRi0));
  }
  
  public void d(ti0 paramti0, ri0 paramri0) {
    this.c = null;
    ArrayList<ti0> arrayList = this.b;
    arrayList.add(paramti0);
    arrayList.add(paramri0);
  }
  
  public void e(Object paramObject) {
    this.c = null;
    ArrayList<Object> arrayList = this.b;
    arrayList.add(paramObject);
    arrayList.add(paramObject);
  }
  
  public void f(iu paramiu, int paramInt1, int paramInt2) {
    if (paramiu != null) {
      int i = paramInt2;
      if (paramInt2 < paramInt1)
        i = paramInt1; 
      if (paramInt1 >= 0 && i > 0) {
        if (paramInt1 <= 1) {
          e(new qu(paramiu, i, false));
          return;
        } 
        e(new ru(paramiu, i, false, paramInt1));
        return;
      } 
      l0.k();
      return;
    } 
    l0.l("Field type must not be null");
  }
  
  public void g(iu paramiu, int paramInt) {
    if (paramInt > 0) {
      e(new ru(paramiu, paramInt, false, paramInt));
      return;
    } 
    l0.l(ga1.i("Illegal number of digits: ", paramInt));
  }
  
  public void h(iu paramiu, int paramInt1, int paramInt2) {
    int i = paramInt2;
    if (paramInt2 < paramInt1)
      i = paramInt1; 
    if (paramInt1 >= 0 && i > 0) {
      e(new ou(paramiu, paramInt1, i));
      return;
    } 
    l0.k();
  }
  
  public void i(char paramChar) {
    e(new lu(paramChar));
  }
  
  public void j(String paramString) {
    int i = paramString.length();
    if (i != 0) {
      if (i != 1) {
        e(new su(paramString));
        return;
      } 
      e(new lu(paramString.charAt(0)));
    } 
  }
  
  public void k(si0 paramsi0) {
    if (paramsi0 != null) {
      d(null, new pu(new ri0[] { paramsi0, null }));
      return;
    } 
    l0.l("No parser supplied");
  }
  
  public void l(iu paramiu, int paramInt1, int paramInt2) {
    int i = paramInt2;
    if (paramInt2 < paramInt1)
      i = paramInt1; 
    if (paramInt1 >= 0 && i > 0) {
      if (paramInt1 <= 1) {
        e(new qu(paramiu, i, true));
        return;
      } 
      e(new ru(paramiu, i, true, paramInt1));
      return;
    } 
    l0.k();
  }
  
  public void m(iu paramiu) {
    e(new tu(paramiu, false));
  }
  
  public Object q() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: astore_1
    //   7: aload_2
    //   8: ifnonnull -> 91
    //   11: aload_0
    //   12: getfield b : Ljava/util/ArrayList;
    //   15: astore #5
    //   17: aload_2
    //   18: astore_1
    //   19: aload #5
    //   21: invokevirtual size : ()I
    //   24: iconst_2
    //   25: if_icmpne -> 68
    //   28: aload #5
    //   30: iconst_0
    //   31: invokevirtual get : (I)Ljava/lang/Object;
    //   34: astore #4
    //   36: aload #5
    //   38: iconst_1
    //   39: invokevirtual get : (I)Ljava/lang/Object;
    //   42: astore_3
    //   43: aload #4
    //   45: ifnull -> 66
    //   48: aload #4
    //   50: aload_3
    //   51: if_acmpeq -> 60
    //   54: aload_2
    //   55: astore_1
    //   56: aload_3
    //   57: ifnonnull -> 68
    //   60: aload #4
    //   62: astore_1
    //   63: goto -> 68
    //   66: aload_3
    //   67: astore_1
    //   68: aload_1
    //   69: astore_2
    //   70: aload_1
    //   71: ifnonnull -> 84
    //   74: new mu
    //   77: dup
    //   78: aload #5
    //   80: invokespecial <init> : (Ljava/util/ArrayList;)V
    //   83: astore_2
    //   84: aload_0
    //   85: aload_2
    //   86: putfield c : Ljava/lang/Object;
    //   89: aload_2
    //   90: astore_1
    //   91: aload_1
    //   92: areturn
  }
  
  public ku r() {
    ti0 ti0;
    Object object = q();
    if (object instanceof ti0 && (!(object instanceof mu) || ((mu)object).b != null)) {
      ti0 = (ti0)object;
    } else {
      ti0 = null;
    } 
    if (object instanceof ri0 && (!(object instanceof mu) || ((mu)object).c != null)) {
      object = object;
    } else {
      object = null;
    } 
    if (ti0 != null || object != null)
      return new ku(ti0, (ri0)object); 
    tp.j("Both printing and parsing not supported");
    return null;
  }
  
  public si0 s() {
    Object object = q();
    if (object instanceof ri0 && (!(object instanceof mu) || ((mu)object).c != null))
      return si0.b((ri0)object); 
    tp.j("Parsing is not supported");
    return null;
  }
  
  public String toString() {
    switch (this.a) {
      default:
        return super.toString();
      case 1:
        break;
    } 
    StringBuilder stringBuilder = new StringBuilder(100);
    stringBuilder.append(this.c.getClass().getSimpleName());
    stringBuilder.append('{');
    ArrayList<String> arrayList = this.b;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      stringBuilder.append(arrayList.get(b));
      if (b < i - 1)
        stringBuilder.append(", "); 
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */