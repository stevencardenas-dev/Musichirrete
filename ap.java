import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

public final class ap extends uu1 {
  public final int b;
  
  public final sm1 c;
  
  public final int d;
  
  public final int e;
  
  public final int[] f;
  
  public final int[] g;
  
  public final uu1[] h;
  
  public final Object[] i;
  
  public final HashMap j;
  
  public ap(ArrayList<sm1> paramArrayList, sm1 paramsm1) {
    this.c = paramsm1;
    this.b = paramsm1.a;
    int i = paramArrayList.size();
    this.f = new int[i];
    this.g = new int[i];
    this.h = new uu1[i];
    this.i = new Object[i];
    this.j = new HashMap<Object, Object>();
    int n = paramArrayList.size();
    int k = 0;
    int j = 0;
    i = 0;
    int m = i;
    while (m < n) {
      paramsm1 = paramArrayList.get(m);
      m++;
      dp dp = (dp)paramsm1;
      uu1[] arrayOfUu1 = this.h;
      tr0 tr0 = dp.a.m;
      arrayOfUu1[i] = tr0;
      this.g[i] = k;
      this.f[i] = j;
      k += tr0.b.m();
      j += this.h[i].h();
      Object[] arrayOfObject = this.i;
      Object object = dp.b;
      arrayOfObject[i] = object;
      this.j.put(object, Integer.valueOf(i));
      i++;
    } 
    this.d = k;
    this.e = j;
  }
  
  public final int a(boolean paramBoolean) {
    if (this.b == 0)
      return -1; 
    int j = 0;
    int i = j;
    if (paramBoolean)
      if (this.c.a > 0) {
        i = j;
      } else {
        i = -1;
      }  
    while (true) {
      uu1[] arrayOfUu1 = this.h;
      if (arrayOfUu1[i].n()) {
        j = o(i, paramBoolean);
        i = j;
        if (j == -1)
          continue; 
        continue;
      } 
      j = this.g[i];
      return arrayOfUu1[i].a(paramBoolean) + j;
    } 
  }
  
  public final int b(Object paramObject) {
    if (paramObject instanceof Pair) {
      int i;
      Pair pair = (Pair)paramObject;
      paramObject = pair.first;
      Object object = pair.second;
      paramObject = this.j.get(paramObject);
      if (paramObject == null) {
        i = -1;
      } else {
        i = paramObject.intValue();
      } 
      if (i != -1) {
        int j = this.h[i].b(object);
        if (j != -1)
          return this.f[i] + j; 
      } 
    } 
    return -1;
  }
  
  public final int c(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_2
    //   5: iload_2
    //   6: ifne -> 12
    //   9: goto -> 98
    //   12: aload_0
    //   13: getfield c : Lsm1;
    //   16: astore #4
    //   18: iload_1
    //   19: ifeq -> 32
    //   22: aload #4
    //   24: getfield a : I
    //   27: istore_2
    //   28: iload_2
    //   29: ifle -> 39
    //   32: iload_2
    //   33: iconst_1
    //   34: isub
    //   35: istore_3
    //   36: goto -> 41
    //   39: iconst_m1
    //   40: istore_3
    //   41: aload_0
    //   42: getfield h : [Luu1;
    //   45: astore #5
    //   47: aload #5
    //   49: iload_3
    //   50: aaload
    //   51: invokevirtual n : ()Z
    //   54: ifeq -> 100
    //   57: iload_1
    //   58: ifeq -> 83
    //   61: aload #4
    //   63: invokevirtual getClass : ()Ljava/lang/Class;
    //   66: pop
    //   67: iload_3
    //   68: iconst_1
    //   69: isub
    //   70: istore_2
    //   71: iload_2
    //   72: iflt -> 78
    //   75: goto -> 91
    //   78: iconst_m1
    //   79: istore_2
    //   80: goto -> 91
    //   83: iload_3
    //   84: ifle -> 78
    //   87: iload_3
    //   88: iconst_1
    //   89: isub
    //   90: istore_2
    //   91: iload_2
    //   92: istore_3
    //   93: iload_2
    //   94: iconst_m1
    //   95: if_icmpne -> 41
    //   98: iconst_m1
    //   99: ireturn
    //   100: aload_0
    //   101: getfield g : [I
    //   104: iload_3
    //   105: iaload
    //   106: istore_2
    //   107: aload #5
    //   109: iload_3
    //   110: aaload
    //   111: iload_1
    //   112: invokevirtual c : (Z)I
    //   115: iload_2
    //   116: iadd
    //   117: ireturn
  }
  
  public final int e(int paramInt1, int paramInt2, boolean paramBoolean) {
    int i;
    int[] arrayOfInt = this.g;
    int k = d12.b(arrayOfInt, paramInt1 + 1);
    int j = arrayOfInt[k];
    uu1[] arrayOfUu1 = this.h;
    uu1 uu11 = arrayOfUu1[k];
    if (paramInt2 == 2) {
      i = 0;
    } else {
      i = paramInt2;
    } 
    paramInt1 = uu11.e(paramInt1 - j, i, paramBoolean);
    if (paramInt1 != -1)
      return j + paramInt1; 
    for (paramInt1 = o(k, paramBoolean); paramInt1 != -1 && arrayOfUu1[paramInt1].n(); paramInt1 = o(paramInt1, paramBoolean));
    if (paramInt1 != -1) {
      paramInt2 = arrayOfInt[paramInt1];
      return arrayOfUu1[paramInt1].a(paramBoolean) + paramInt2;
    } 
    return (paramInt2 == 2) ? a(paramBoolean) : -1;
  }
  
  public final su1 f(int paramInt, su1 paramsu1, boolean paramBoolean) {
    int[] arrayOfInt = this.f;
    int j = d12.b(arrayOfInt, paramInt + 1);
    int k = this.g[j];
    int i = arrayOfInt[j];
    this.h[j].f(paramInt - i, paramsu1, paramBoolean);
    paramsu1.c += k;
    if (paramBoolean) {
      Object object2 = this.i[j];
      Object object1 = paramsu1.b;
      object1.getClass();
      paramsu1.b = Pair.create(object2, object1);
    } 
    return paramsu1;
  }
  
  public final su1 g(Object paramObject, su1 paramsu1) {
    int i;
    Pair pair = (Pair)paramObject;
    Object object1 = pair.first;
    Object object2 = pair.second;
    object1 = this.j.get(object1);
    if (object1 == null) {
      i = -1;
    } else {
      i = object1.intValue();
    } 
    int j = this.g[i];
    this.h[i].g(object2, paramsu1);
    paramsu1.c += j;
    paramsu1.b = paramObject;
    return paramsu1;
  }
  
  public final int h() {
    return this.e;
  }
  
  public final Object k(int paramInt) {
    int[] arrayOfInt = this.f;
    int j = d12.b(arrayOfInt, paramInt + 1);
    int i = arrayOfInt[j];
    Object object = this.h[j].k(paramInt - i);
    return Pair.create(this.i[j], object);
  }
  
  public final tu1 l(int paramInt, tu1 paramtu1, long paramLong) {
    int[] arrayOfInt = this.g;
    int k = d12.b(arrayOfInt, paramInt + 1);
    int j = arrayOfInt[k];
    int i = this.f[k];
    this.h[k].l(paramInt - j, paramtu1, paramLong);
    Object object2 = this.i[k];
    Object object3 = paramtu1.a;
    Object object1 = object2;
    if (tu1.k != object3)
      object1 = Pair.create(object2, object3); 
    paramtu1.a = object1;
    paramtu1.g += i;
    paramtu1.h += i;
    return paramtu1;
  }
  
  public final int m() {
    return this.d;
  }
  
  public final int o(int paramInt, boolean paramBoolean) {
    return paramBoolean ? ((++paramInt < this.c.a) ? paramInt : -1) : ((paramInt < this.b - 1) ? (paramInt + 1) : -1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */