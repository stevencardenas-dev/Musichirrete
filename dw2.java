import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class dw2 implements jw2 {
  public static final int[] g = new int[0];
  
  public static final Unsafe h = pc2.l();
  
  public final int[] a;
  
  public final Object[] b;
  
  public final av2 c;
  
  public final int[] d;
  
  public final int e;
  
  public final zb0 f;
  
  public dw2(int[] paramArrayOfint1, Object[] paramArrayOfObject, av2 paramav2, int[] paramArrayOfint2, int paramInt, zb0 paramzb0, eg2 parameg2) {
    this.a = paramArrayOfint1;
    this.b = paramArrayOfObject;
    this.d = paramArrayOfint2;
    this.e = paramInt;
    this.f = paramzb0;
    this.c = paramav2;
  }
  
  public static dw2 l(iw2 paramiw2, zb0 paramzb0, eg2 parameg2) {
    if (paramiw2 instanceof iw2) {
      int i3;
      int[] arrayOfInt1;
      String str = paramiw2.b;
      int i4 = str.length();
      char c = str.charAt(0);
      if (c >= '?') {
        c = '\001';
        while (true) {
          int i6 = c + 1;
          j = i6;
          if (str.charAt(c) >= '?') {
            int i7 = i6;
            continue;
          } 
          break;
        } 
      } else {
        j = 1;
      } 
      int i = j + 1;
      int m = str.charAt(j);
      int k = i;
      int j = m;
      if (m >= 55296) {
        k = m & 0x1FFF;
        j = 13;
        int i6 = i;
        while (true) {
          i = i6 + 1;
          i6 = str.charAt(i6);
          if (i6 >= 55296) {
            k |= (i6 & 0x1FFF) << j;
            j += '\r';
            i6 = i;
            continue;
          } 
          j = k | i6 << j;
          k = i;
          break;
        } 
      } 
      if (j == 0) {
        arrayOfInt1 = g;
        j = 0;
        i3 = 0;
        n = i3;
        m = n;
        i1 = m;
      } else {
        j = k + 1;
        k = str.charAt(k);
        i = k;
        m = j;
        if (k >= 55296) {
          i = k & 0x1FFF;
          k = 13;
          m = j;
          j = i;
          while (true) {
            i = m + 1;
            m = str.charAt(m);
            if (m >= 55296) {
              j |= (m & 0x1FFF) << k;
              k += 13;
              m = i;
              continue;
            } 
            j |= m << k;
            m = i;
            i = j;
            break;
          } 
        } 
        k = m + 1;
        m = str.charAt(m);
        i1 = m;
        j = k;
        if (m >= 55296) {
          m &= 0x1FFF;
          j = 13;
          int i7 = k;
          while (true) {
            k = i7 + 1;
            i7 = str.charAt(i7);
            if (i7 >= 55296) {
              m |= (i7 & 0x1FFF) << j;
              j += 13;
              i7 = k;
              continue;
            } 
            i1 = m | i7 << j;
            j = k;
            break;
          } 
        } 
        m = j + 1;
        k = m;
        if (str.charAt(j) >= '?')
          while (true) {
            j = m + 1;
            if (str.charAt(m) >= '?') {
              m = j;
              continue;
            } 
            k = j;
            break;
          }  
        m = k + 1;
        j = m;
        if (str.charAt(k) >= '?')
          while (true) {
            j = m + 1;
            if (str.charAt(m) >= '?') {
              m = j;
              continue;
            } 
            break;
          }  
        k = j + 1;
        m = str.charAt(j);
        j = m;
        n = k;
        if (m >= 55296) {
          m &= 0x1FFF;
          j = 13;
          n = k;
          while (true) {
            k = n + 1;
            n = str.charAt(n);
            if (n >= 55296) {
              m |= (n & 0x1FFF) << j;
              j += 13;
              n = k;
              continue;
            } 
            j = m | n << j;
            n = k;
            break;
          } 
        } 
        m = n + 1;
        n = str.charAt(n);
        k = n;
        int i6 = m;
        if (n >= 55296) {
          k = n & 0x1FFF;
          n = 13;
          i6 = m;
          m = k;
          while (true) {
            k = i6 + 1;
            i6 = str.charAt(i6);
            if (i6 >= 55296) {
              m |= (i6 & 0x1FFF) << n;
              n += 13;
              i6 = k;
              continue;
            } 
            m |= i6 << n;
            i6 = k;
            k = m;
            break;
          } 
        } 
        n = i6 + 1;
        char c1 = str.charAt(i6);
        i6 = c1;
        m = n;
        if (c1 >= '?') {
          i6 = c1 & 0x1FFF;
          m = 13;
          int i7 = n;
          while (true) {
            n = i7 + 1;
            i7 = str.charAt(i7);
            if (i7 >= 55296) {
              i6 |= (i7 & 0x1FFF) << m;
              m += 13;
              i7 = n;
              continue;
            } 
            i6 |= i7 << m;
            m = n;
            break;
          } 
        } 
        i3 = m + 1;
        char c2 = str.charAt(m);
        n = c2;
        m = i3;
        if (c2 >= '?') {
          n = c2 & 0x1FFF;
          m = 13;
          int i7 = i3;
          i3 = n;
          while (true) {
            n = i7 + 1;
            i7 = str.charAt(i7);
            if (i7 >= 55296) {
              i3 |= (i7 & 0x1FFF) << m;
              m += 13;
              i7 = n;
              continue;
            } 
            i3 |= i7 << m;
            m = n;
            n = i3;
            break;
          } 
        } 
        i1 = i + i + i1;
        arrayOfInt1 = new int[n + k + i6];
        i6 = m;
        m = n;
        n = i1;
        i3 = k;
        i1 = i;
        k = i6;
      } 
      Unsafe unsafe = h;
      Object[] arrayOfObject2 = paramiw2.c;
      Class<?> clazz = paramiw2.a.getClass();
      i3 += m;
      int[] arrayOfInt2 = new int[j * 3];
      Object[] arrayOfObject1 = new Object[j + j];
      i = m;
      boolean bool = false;
      int i2 = 0;
      j = n;
      int n = i3;
      int i5 = i1;
      int i1 = k;
      k = i4;
      while (true) {
        int i6 = i2;
        if (i1 < k) {
          i4 = i1 + 1;
          char c1 = str.charAt(i1);
          if (c1 >= '?') {
            i3 = c1 & 0x1FFF;
            i1 = 13;
            while (true) {
              i2 = i4 + 1;
              i4 = str.charAt(i4);
              if (i4 >= 55296)
                continue; 
              int i7 = i3 | i4 << i1;
              i1 = i2 + 1;
              char c2 = str.charAt(i2);
              if (c2 >= '?') {
                i3 = c2 & 0x1FFF;
                for (i2 = 13;; i2 = i4) {
                  i4 = i1 + 1;
                  char c3 = str.charAt(i1);
                  i1 = k;
                  arrayOfInt2[i6 + 1] = i7 | c2 | i4 | SYNTHETIC_LOCAL_VARIABLE_20 << 20 | bool;
                  i4 = i6 + 3;
                  arrayOfInt2[i6 + 2] = j << 20 | i2;
                  j = k;
                  k = i1;
                  i1 = n;
                  n = i3;
                  object = SYNTHETIC_LOCAL_VARIABLE_15;
                } 
                break;
              } 
              i3 = i1;
              i1 = k;
              continue;
              i3 |= (i4 & 0x1FFF) << i1;
              i1 += 13;
              i4 = i2;
            } 
            continue;
          } 
          i2 = i4;
          continue;
        } 
        return new dw2(arrayOfInt2, arrayOfObject1, paramiw2.a, arrayOfInt1, m, paramzb0, parameg2);
      } 
    } 
    tp.b();
    return null;
  }
  
  public static Field m(Class paramClass, String paramString) {
    try {
      return paramClass.getDeclaredField(paramString);
    } catch (NoSuchFieldException noSuchFieldException) {
      for (Field field : paramClass.getDeclaredFields()) {
        if (paramString.equals(field.getName()))
          return field; 
      } 
      String str1 = paramClass.getName();
      String str2 = Arrays.toString((Object[])SYNTHETIC_LOCAL_VARIABLE_5);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 11 + str1.length() + 29 + String.valueOf(str2).length());
      x41.v(stringBuilder, "Field ", paramString, " for ", str1);
      k91.m(x41.n(stringBuilder, " not found. Known fields are ", str2), noSuchFieldException);
      return null;
    } 
  }
  
  public static int r(int paramInt) {
    return paramInt >>> 20 & 0xFF;
  }
  
  public static boolean s(Object paramObject) {
    return (paramObject == null) ? false : ((paramObject instanceof pv2) ? ((pv2)paramObject).j() : true);
  }
  
  public static int t(long paramLong, Object paramObject) {
    return ((Integer)pc2.j(paramLong, paramObject)).intValue();
  }
  
  public static long u(long paramLong, Object paramObject) {
    return ((Long)pc2.j(paramLong, paramObject)).longValue();
  }
  
  public final pv2 a() {
    return (pv2)((pv2)this.c).i(4, null);
  }
  
  public final int b(pv2 parampv2) {
    Object object;
    byte b = 0;
    boolean bool = false;
    while (true) {
      int i;
      int[] arrayOfInt = this.a;
      if (b < arrayOfInt.length) {
        Object object1;
        int j;
        boolean bool1;
        Object object2;
        int k = q(b);
        int n = r(k);
        int m = arrayOfInt[b];
        long l = (0xFFFFF & k);
        char c = 'ӕ';
        k = 37;
        switch (n) {
          default:
            object1 = object;
            break;
          case 68:
            object1 = object;
            if (k(m, b, parampv2)) {
              j = object * 53;
              i = pc2.j(l, parampv2).hashCode();
            } else {
              break;
            } 
            j = i + j;
            break;
          case 67:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              l = u(l, parampv2);
              Charset charset = vv2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 66:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              i = t(l, parampv2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 65:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              l = u(l, parampv2);
              Charset charset = vv2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 64:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              i = t(l, parampv2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 63:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              i = t(l, parampv2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 62:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              i = t(l, parampv2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 61:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              i = pc2.j(l, parampv2).hashCode();
            } else {
              break;
            } 
            j = i + j;
            break;
          case 60:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              i = pc2.j(l, parampv2).hashCode();
            } else {
              break;
            } 
            j = i + j;
            break;
          case 59:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              i = ((String)pc2.j(l, parampv2)).hashCode();
            } else {
              break;
            } 
            j = i + j;
            break;
          case 58:
            j = i;
          case 57:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              i = t(l, parampv2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 56:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              l = u(l, parampv2);
              Charset charset = vv2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 55:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              i = t(l, parampv2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 54:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              l = u(l, parampv2);
              Charset charset = vv2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 53:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              l = u(l, parampv2);
              Charset charset = vv2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 52:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              i = Float.floatToIntBits(((Float)pc2.j(l, parampv2)).floatValue());
            } else {
              break;
            } 
            j = i + j;
            break;
          case 51:
            j = i;
            if (k(m, b, parampv2)) {
              j = i * 53;
              l = Double.doubleToLongBits(((Double)pc2.j(l, parampv2)).doubleValue());
              Charset charset = vv2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 50:
            j = i * 53;
            i = pc2.j(l, parampv2).hashCode();
            j = i + j;
            break;
          case 18:
          case 19:
          case 20:
          case 21:
          case 22:
          case 23:
          case 24:
          case 25:
          case 26:
          case 27:
          case 28:
          case 29:
          case 30:
          case 31:
          case 32:
          case 33:
          case 34:
          case 35:
          case 36:
          case 37:
          case 38:
          case 39:
          case 40:
          case 41:
          case 42:
          case 43:
          case 44:
          case 45:
          case 46:
          case 47:
          case 48:
          case 49:
            j = i * 53;
            i = pc2.j(l, parampv2).hashCode();
            j = i + j;
            break;
          case 17:
            m = i * 53;
            object2 = pc2.j(l, parampv2);
            i = m;
            if (object2 != null) {
              j = object2.hashCode();
              i = m;
            } 
            j = i + j;
            break;
          case 16:
            j = i * 53;
            l = pc2.h(l, parampv2);
            object2 = vv2.a;
            j += (int)(l ^ l >>> 32L);
            break;
          case 15:
            j = i * 53;
            i = pc2.f(l, parampv2);
            j = i + j;
            break;
          case 14:
            j = i * 53;
            l = pc2.h(l, parampv2);
            object2 = vv2.a;
            j += (int)(l ^ l >>> 32L);
            break;
          case 13:
            j = i * 53;
            i = pc2.f(l, parampv2);
            j = i + j;
            break;
          case 12:
            j = i * 53;
            i = pc2.f(l, parampv2);
            j = i + j;
            break;
          case 11:
            j = i * 53;
            i = pc2.f(l, parampv2);
            j = i + j;
            break;
          case 10:
            j = i * 53;
            i = pc2.j(l, parampv2).hashCode();
            j = i + j;
            break;
          case 9:
            m = i * 53;
            object2 = pc2.j(l, parampv2);
            i = m;
            if (object2 != null) {
              j = object2.hashCode();
              i = m;
            } 
            j = i + j;
            break;
          case 8:
            j = i * 53;
            i = ((String)pc2.j(l, parampv2)).hashCode();
            j = i + j;
            break;
          case 7:
            m = i * 53;
            bool1 = pc2.c.d(l, parampv2);
            object2 = vv2.a;
            j = m;
            i = c;
          case 6:
            j = i * 53;
            i = pc2.f(l, parampv2);
            j = i + j;
            break;
          case 5:
            j = i * 53;
            l = pc2.h(l, parampv2);
            object2 = vv2.a;
            j += (int)(l ^ l >>> 32L);
            break;
          case 4:
            j = i * 53;
            i = pc2.f(l, parampv2);
            j = i + j;
            break;
          case 3:
            j = i * 53;
            l = pc2.h(l, parampv2);
            object2 = vv2.a;
            j += (int)(l ^ l >>> 32L);
            break;
          case 2:
            j = i * 53;
            l = pc2.h(l, parampv2);
            object2 = vv2.a;
            j += (int)(l ^ l >>> 32L);
            break;
          case 1:
            j = i * 53;
            i = Float.floatToIntBits(pc2.c.f(l, parampv2));
            j = i + j;
            break;
          case 0:
            j = i * 53;
            l = Double.doubleToLongBits(pc2.c.j(l, parampv2));
            object2 = vv2.a;
            j += (int)(l ^ l >>> 32L);
            break;
        } 
        continue;
      } 
      parampv2.zzc.getClass();
      return i * 53 + 506991;
      b += true;
      object = SYNTHETIC_LOCAL_VARIABLE_2;
    } 
  }
  
  public final void c(Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic s : (Ljava/lang/Object;)Z
    //   4: ifeq -> 1214
    //   7: aload_2
    //   8: invokevirtual getClass : ()Ljava/lang/Class;
    //   11: pop
    //   12: iconst_0
    //   13: istore #5
    //   15: aload_1
    //   16: astore #11
    //   18: aload_0
    //   19: getfield a : [I
    //   22: astore_1
    //   23: iload #5
    //   25: aload_1
    //   26: arraylength
    //   27: if_icmpge -> 1207
    //   30: aload_0
    //   31: iload #5
    //   33: invokevirtual q : (I)I
    //   36: istore #6
    //   38: iload #6
    //   40: invokestatic r : (I)I
    //   43: istore #7
    //   45: aload_1
    //   46: iload #5
    //   48: iaload
    //   49: istore #8
    //   51: iload #6
    //   53: ldc 1048575
    //   55: iand
    //   56: i2l
    //   57: lstore #9
    //   59: iload #7
    //   61: tableswitch default -> 352, 0 -> 1162, 1 -> 1122, 2 -> 1088, 3 -> 1054, 4 -> 1020, 5 -> 986, 6 -> 952, 7 -> 912, 8 -> 878, 9 -> 866, 10 -> 832, 11 -> 798, 12 -> 764, 13 -> 730, 14 -> 696, 15 -> 662, 16 -> 628, 17 -> 616, 18 -> 501, 19 -> 501, 20 -> 501, 21 -> 501, 22 -> 501, 23 -> 501, 24 -> 501, 25 -> 501, 26 -> 501, 27 -> 501, 28 -> 501, 29 -> 501, 30 -> 501, 31 -> 501, 32 -> 501, 33 -> 501, 34 -> 501, 35 -> 501, 36 -> 501, 37 -> 501, 38 -> 501, 39 -> 501, 40 -> 501, 41 -> 501, 42 -> 501, 43 -> 501, 44 -> 501, 45 -> 501, 46 -> 501, 47 -> 501, 48 -> 501, 49 -> 501, 50 -> 469, 51 -> 424, 52 -> 424, 53 -> 424, 54 -> 424, 55 -> 424, 56 -> 424, 57 -> 424, 58 -> 424, 59 -> 424, 60 -> 412, 61 -> 367, 62 -> 367, 63 -> 367, 64 -> 367, 65 -> 367, 66 -> 367, 67 -> 367, 68 -> 355
    //   352: goto -> 1201
    //   355: aload_0
    //   356: iload #5
    //   358: aload #11
    //   360: aload_2
    //   361: invokevirtual o : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   364: goto -> 352
    //   367: aload_0
    //   368: iload #8
    //   370: iload #5
    //   372: aload_2
    //   373: invokevirtual k : (IILjava/lang/Object;)Z
    //   376: ifeq -> 352
    //   379: lload #9
    //   381: aload #11
    //   383: lload #9
    //   385: aload_2
    //   386: invokestatic j : (JLjava/lang/Object;)Ljava/lang/Object;
    //   389: invokestatic k : (JLjava/lang/Object;Ljava/lang/Object;)V
    //   392: aload #11
    //   394: aload_1
    //   395: iload #5
    //   397: iconst_2
    //   398: iadd
    //   399: iaload
    //   400: ldc 1048575
    //   402: iand
    //   403: i2l
    //   404: iload #8
    //   406: invokestatic g : (Ljava/lang/Object;JI)V
    //   409: goto -> 352
    //   412: aload_0
    //   413: iload #5
    //   415: aload #11
    //   417: aload_2
    //   418: invokevirtual o : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   421: goto -> 352
    //   424: aload_0
    //   425: iload #8
    //   427: iload #5
    //   429: aload_2
    //   430: invokevirtual k : (IILjava/lang/Object;)Z
    //   433: ifeq -> 352
    //   436: lload #9
    //   438: aload #11
    //   440: lload #9
    //   442: aload_2
    //   443: invokestatic j : (JLjava/lang/Object;)Ljava/lang/Object;
    //   446: invokestatic k : (JLjava/lang/Object;Ljava/lang/Object;)V
    //   449: aload #11
    //   451: aload_1
    //   452: iload #5
    //   454: iconst_2
    //   455: iadd
    //   456: iaload
    //   457: ldc 1048575
    //   459: iand
    //   460: i2l
    //   461: iload #8
    //   463: invokestatic g : (Ljava/lang/Object;JI)V
    //   466: goto -> 352
    //   469: getstatic kw2.a : Lzb0;
    //   472: astore_1
    //   473: lload #9
    //   475: aload #11
    //   477: invokestatic j : (JLjava/lang/Object;)Ljava/lang/Object;
    //   480: astore_1
    //   481: lload #9
    //   483: aload_2
    //   484: invokestatic j : (JLjava/lang/Object;)Ljava/lang/Object;
    //   487: astore_2
    //   488: aload_1
    //   489: ifnull -> 496
    //   492: invokestatic b : ()V
    //   495: return
    //   496: aload_2
    //   497: invokestatic f : (Ljava/lang/Object;)Ljava/lang/ClassCastException;
    //   500: athrow
    //   501: lload #9
    //   503: aload #11
    //   505: invokestatic j : (JLjava/lang/Object;)Ljava/lang/Object;
    //   508: checkcast uv2
    //   511: astore #12
    //   513: lload #9
    //   515: aload_2
    //   516: invokestatic j : (JLjava/lang/Object;)Ljava/lang/Object;
    //   519: checkcast uv2
    //   522: astore #13
    //   524: aload #12
    //   526: invokeinterface size : ()I
    //   531: istore #6
    //   533: aload #13
    //   535: invokeinterface size : ()I
    //   540: istore #7
    //   542: aload #12
    //   544: astore_1
    //   545: iload #6
    //   547: ifle -> 594
    //   550: aload #12
    //   552: astore_1
    //   553: iload #7
    //   555: ifle -> 594
    //   558: aload #12
    //   560: astore_1
    //   561: aload #12
    //   563: checkcast dv2
    //   566: getfield b : Z
    //   569: ifne -> 585
    //   572: aload #12
    //   574: iload #7
    //   576: iload #6
    //   578: iadd
    //   579: invokeinterface b : (I)Luv2;
    //   584: astore_1
    //   585: aload_1
    //   586: aload #13
    //   588: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   593: pop
    //   594: iload #6
    //   596: ifgt -> 605
    //   599: aload #13
    //   601: astore_1
    //   602: goto -> 605
    //   605: lload #9
    //   607: aload #11
    //   609: aload_1
    //   610: invokestatic k : (JLjava/lang/Object;Ljava/lang/Object;)V
    //   613: goto -> 352
    //   616: aload_0
    //   617: iload #5
    //   619: aload #11
    //   621: aload_2
    //   622: invokevirtual n : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   625: goto -> 352
    //   628: aload_0
    //   629: iload #5
    //   631: aload_2
    //   632: invokevirtual i : (ILjava/lang/Object;)Z
    //   635: ifeq -> 352
    //   638: aload #11
    //   640: lload #9
    //   642: lload #9
    //   644: aload_2
    //   645: invokestatic h : (JLjava/lang/Object;)J
    //   648: invokestatic i : (Ljava/lang/Object;JJ)V
    //   651: aload_0
    //   652: iload #5
    //   654: aload #11
    //   656: invokevirtual j : (ILjava/lang/Object;)V
    //   659: goto -> 352
    //   662: aload_0
    //   663: iload #5
    //   665: aload_2
    //   666: invokevirtual i : (ILjava/lang/Object;)Z
    //   669: ifeq -> 352
    //   672: aload #11
    //   674: lload #9
    //   676: lload #9
    //   678: aload_2
    //   679: invokestatic f : (JLjava/lang/Object;)I
    //   682: invokestatic g : (Ljava/lang/Object;JI)V
    //   685: aload_0
    //   686: iload #5
    //   688: aload #11
    //   690: invokevirtual j : (ILjava/lang/Object;)V
    //   693: goto -> 352
    //   696: aload_0
    //   697: iload #5
    //   699: aload_2
    //   700: invokevirtual i : (ILjava/lang/Object;)Z
    //   703: ifeq -> 352
    //   706: aload #11
    //   708: lload #9
    //   710: lload #9
    //   712: aload_2
    //   713: invokestatic h : (JLjava/lang/Object;)J
    //   716: invokestatic i : (Ljava/lang/Object;JJ)V
    //   719: aload_0
    //   720: iload #5
    //   722: aload #11
    //   724: invokevirtual j : (ILjava/lang/Object;)V
    //   727: goto -> 352
    //   730: aload_0
    //   731: iload #5
    //   733: aload_2
    //   734: invokevirtual i : (ILjava/lang/Object;)Z
    //   737: ifeq -> 352
    //   740: aload #11
    //   742: lload #9
    //   744: lload #9
    //   746: aload_2
    //   747: invokestatic f : (JLjava/lang/Object;)I
    //   750: invokestatic g : (Ljava/lang/Object;JI)V
    //   753: aload_0
    //   754: iload #5
    //   756: aload #11
    //   758: invokevirtual j : (ILjava/lang/Object;)V
    //   761: goto -> 352
    //   764: aload_0
    //   765: iload #5
    //   767: aload_2
    //   768: invokevirtual i : (ILjava/lang/Object;)Z
    //   771: ifeq -> 352
    //   774: aload #11
    //   776: lload #9
    //   778: lload #9
    //   780: aload_2
    //   781: invokestatic f : (JLjava/lang/Object;)I
    //   784: invokestatic g : (Ljava/lang/Object;JI)V
    //   787: aload_0
    //   788: iload #5
    //   790: aload #11
    //   792: invokevirtual j : (ILjava/lang/Object;)V
    //   795: goto -> 352
    //   798: aload_0
    //   799: iload #5
    //   801: aload_2
    //   802: invokevirtual i : (ILjava/lang/Object;)Z
    //   805: ifeq -> 352
    //   808: aload #11
    //   810: lload #9
    //   812: lload #9
    //   814: aload_2
    //   815: invokestatic f : (JLjava/lang/Object;)I
    //   818: invokestatic g : (Ljava/lang/Object;JI)V
    //   821: aload_0
    //   822: iload #5
    //   824: aload #11
    //   826: invokevirtual j : (ILjava/lang/Object;)V
    //   829: goto -> 352
    //   832: aload_0
    //   833: iload #5
    //   835: aload_2
    //   836: invokevirtual i : (ILjava/lang/Object;)Z
    //   839: ifeq -> 352
    //   842: lload #9
    //   844: aload #11
    //   846: lload #9
    //   848: aload_2
    //   849: invokestatic j : (JLjava/lang/Object;)Ljava/lang/Object;
    //   852: invokestatic k : (JLjava/lang/Object;Ljava/lang/Object;)V
    //   855: aload_0
    //   856: iload #5
    //   858: aload #11
    //   860: invokevirtual j : (ILjava/lang/Object;)V
    //   863: goto -> 352
    //   866: aload_0
    //   867: iload #5
    //   869: aload #11
    //   871: aload_2
    //   872: invokevirtual n : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   875: goto -> 352
    //   878: aload_0
    //   879: iload #5
    //   881: aload_2
    //   882: invokevirtual i : (ILjava/lang/Object;)Z
    //   885: ifeq -> 352
    //   888: lload #9
    //   890: aload #11
    //   892: lload #9
    //   894: aload_2
    //   895: invokestatic j : (JLjava/lang/Object;)Ljava/lang/Object;
    //   898: invokestatic k : (JLjava/lang/Object;Ljava/lang/Object;)V
    //   901: aload_0
    //   902: iload #5
    //   904: aload #11
    //   906: invokevirtual j : (ILjava/lang/Object;)V
    //   909: goto -> 352
    //   912: aload_0
    //   913: iload #5
    //   915: aload_2
    //   916: invokevirtual i : (ILjava/lang/Object;)Z
    //   919: ifeq -> 352
    //   922: getstatic pc2.c : Loc2;
    //   925: astore_1
    //   926: aload_1
    //   927: lload #9
    //   929: aload #11
    //   931: aload_1
    //   932: lload #9
    //   934: aload_2
    //   935: invokevirtual d : (JLjava/lang/Object;)Z
    //   938: invokevirtual e : (JLjava/lang/Object;Z)V
    //   941: aload_0
    //   942: iload #5
    //   944: aload #11
    //   946: invokevirtual j : (ILjava/lang/Object;)V
    //   949: goto -> 352
    //   952: aload_0
    //   953: iload #5
    //   955: aload_2
    //   956: invokevirtual i : (ILjava/lang/Object;)Z
    //   959: ifeq -> 352
    //   962: aload #11
    //   964: lload #9
    //   966: lload #9
    //   968: aload_2
    //   969: invokestatic f : (JLjava/lang/Object;)I
    //   972: invokestatic g : (Ljava/lang/Object;JI)V
    //   975: aload_0
    //   976: iload #5
    //   978: aload #11
    //   980: invokevirtual j : (ILjava/lang/Object;)V
    //   983: goto -> 352
    //   986: aload_0
    //   987: iload #5
    //   989: aload_2
    //   990: invokevirtual i : (ILjava/lang/Object;)Z
    //   993: ifeq -> 352
    //   996: aload #11
    //   998: lload #9
    //   1000: lload #9
    //   1002: aload_2
    //   1003: invokestatic h : (JLjava/lang/Object;)J
    //   1006: invokestatic i : (Ljava/lang/Object;JJ)V
    //   1009: aload_0
    //   1010: iload #5
    //   1012: aload #11
    //   1014: invokevirtual j : (ILjava/lang/Object;)V
    //   1017: goto -> 352
    //   1020: aload_0
    //   1021: iload #5
    //   1023: aload_2
    //   1024: invokevirtual i : (ILjava/lang/Object;)Z
    //   1027: ifeq -> 352
    //   1030: aload #11
    //   1032: lload #9
    //   1034: lload #9
    //   1036: aload_2
    //   1037: invokestatic f : (JLjava/lang/Object;)I
    //   1040: invokestatic g : (Ljava/lang/Object;JI)V
    //   1043: aload_0
    //   1044: iload #5
    //   1046: aload #11
    //   1048: invokevirtual j : (ILjava/lang/Object;)V
    //   1051: goto -> 352
    //   1054: aload_0
    //   1055: iload #5
    //   1057: aload_2
    //   1058: invokevirtual i : (ILjava/lang/Object;)Z
    //   1061: ifeq -> 352
    //   1064: aload #11
    //   1066: lload #9
    //   1068: lload #9
    //   1070: aload_2
    //   1071: invokestatic h : (JLjava/lang/Object;)J
    //   1074: invokestatic i : (Ljava/lang/Object;JJ)V
    //   1077: aload_0
    //   1078: iload #5
    //   1080: aload #11
    //   1082: invokevirtual j : (ILjava/lang/Object;)V
    //   1085: goto -> 352
    //   1088: aload_0
    //   1089: iload #5
    //   1091: aload_2
    //   1092: invokevirtual i : (ILjava/lang/Object;)Z
    //   1095: ifeq -> 352
    //   1098: aload #11
    //   1100: lload #9
    //   1102: lload #9
    //   1104: aload_2
    //   1105: invokestatic h : (JLjava/lang/Object;)J
    //   1108: invokestatic i : (Ljava/lang/Object;JJ)V
    //   1111: aload_0
    //   1112: iload #5
    //   1114: aload #11
    //   1116: invokevirtual j : (ILjava/lang/Object;)V
    //   1119: goto -> 352
    //   1122: aload_0
    //   1123: iload #5
    //   1125: aload_2
    //   1126: invokevirtual i : (ILjava/lang/Object;)Z
    //   1129: ifeq -> 352
    //   1132: getstatic pc2.c : Loc2;
    //   1135: astore_1
    //   1136: aload_1
    //   1137: aload #11
    //   1139: lload #9
    //   1141: aload_1
    //   1142: lload #9
    //   1144: aload_2
    //   1145: invokevirtual f : (JLjava/lang/Object;)F
    //   1148: invokevirtual i : (Ljava/lang/Object;JF)V
    //   1151: aload_0
    //   1152: iload #5
    //   1154: aload #11
    //   1156: invokevirtual j : (ILjava/lang/Object;)V
    //   1159: goto -> 352
    //   1162: aload_0
    //   1163: iload #5
    //   1165: aload_2
    //   1166: invokevirtual i : (ILjava/lang/Object;)Z
    //   1169: ifeq -> 352
    //   1172: getstatic pc2.c : Loc2;
    //   1175: astore_1
    //   1176: aload_1
    //   1177: lload #9
    //   1179: aload_2
    //   1180: invokevirtual j : (JLjava/lang/Object;)D
    //   1183: dstore_3
    //   1184: aload_1
    //   1185: aload #11
    //   1187: lload #9
    //   1189: dload_3
    //   1190: invokevirtual l : (Ljava/lang/Object;JD)V
    //   1193: aload_0
    //   1194: iload #5
    //   1196: aload #11
    //   1198: invokevirtual j : (ILjava/lang/Object;)V
    //   1201: iinc #5, 3
    //   1204: goto -> 18
    //   1207: aload #11
    //   1209: aload_2
    //   1210: invokestatic b : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   1213: return
    //   1214: ldc_w 'Mutating immutable message: '
    //   1217: aload_1
    //   1218: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1221: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1224: invokestatic l : (Ljava/lang/String;)V
    //   1227: return
  }
  
  public final int d(av2 paramav2) {
    // Byte code:
    //   0: getstatic dw2.h : Lsun/misc/Unsafe;
    //   3: astore #16
    //   5: iconst_0
    //   6: istore #10
    //   8: iconst_0
    //   9: istore #5
    //   11: iconst_0
    //   12: istore #4
    //   14: iload #4
    //   16: istore #8
    //   18: ldc 1048575
    //   20: istore_3
    //   21: aload_0
    //   22: getfield a : [I
    //   25: astore #17
    //   27: iload #5
    //   29: aload #17
    //   31: arraylength
    //   32: if_icmpge -> 3698
    //   35: aload_0
    //   36: iload #5
    //   38: invokevirtual q : (I)I
    //   41: istore #12
    //   43: iload #12
    //   45: invokestatic r : (I)I
    //   48: istore #13
    //   50: aload #17
    //   52: iload #5
    //   54: iaload
    //   55: istore #11
    //   57: aload #17
    //   59: iload #5
    //   61: iconst_2
    //   62: iadd
    //   63: iaload
    //   64: istore #7
    //   66: iload #7
    //   68: ldc 1048575
    //   70: iand
    //   71: istore #6
    //   73: iload #13
    //   75: bipush #17
    //   77: if_icmpgt -> 134
    //   80: iload_3
    //   81: istore_2
    //   82: iload #6
    //   84: iload_3
    //   85: if_icmpeq -> 115
    //   88: iload #6
    //   90: ldc 1048575
    //   92: if_icmpne -> 101
    //   95: iconst_0
    //   96: istore #4
    //   98: goto -> 112
    //   101: aload #16
    //   103: aload_1
    //   104: iload #6
    //   106: i2l
    //   107: invokevirtual getInt : (Ljava/lang/Object;J)I
    //   110: istore #4
    //   112: iload #6
    //   114: istore_2
    //   115: iconst_1
    //   116: iload #7
    //   118: bipush #20
    //   120: iushr
    //   121: ishl
    //   122: istore #9
    //   124: iload_2
    //   125: istore #6
    //   127: iload #4
    //   129: istore #7
    //   131: goto -> 144
    //   134: iconst_0
    //   135: istore #9
    //   137: iload #4
    //   139: istore #7
    //   141: iload_3
    //   142: istore #6
    //   144: iload #13
    //   146: getstatic lv2.c : Llv2;
    //   149: getfield b : I
    //   152: if_icmplt -> 162
    //   155: getstatic lv2.e : Llv2;
    //   158: invokevirtual getClass : ()Ljava/lang/Class;
    //   161: pop
    //   162: iload #12
    //   164: ldc 1048575
    //   166: iand
    //   167: i2l
    //   168: lstore #14
    //   170: iload #13
    //   172: tableswitch default -> 464, 0 -> 3660, 1 -> 3638, 2 -> 3592, 3 -> 3546, 4 -> 3499, 5 -> 3477, 6 -> 3455, 7 -> 3422, 8 -> 3338, 9 -> 3270, 10 -> 3212, 11 -> 3173, 12 -> 3126, 13 -> 3093, 14 -> 3059, 15 -> 3003, 16 -> 2944, 17 -> 2876, 18 -> 2856, 19 -> 2836, 20 -> 2776, 21 -> 2725, 22 -> 2674, 23 -> 2654, 24 -> 2634, 25 -> 2579, 26 -> 2465, 27 -> 2355, 28 -> 2266, 29 -> 2215, 30 -> 2164, 31 -> 2144, 32 -> 2124, 33 -> 2073, 34 -> 2008, 35 -> 1955, 36 -> 1903, 37 -> 1864, 38 -> 1825, 39 -> 1786, 40 -> 1733, 41 -> 1681, 42 -> 1631, 43 -> 1592, 44 -> 1553, 45 -> 1501, 46 -> 1448, 47 -> 1409, 48 -> 1362, 49 -> 1250, 50 -> 1211, 51 -> 1193, 52 -> 1175, 53 -> 1135, 54 -> 1095, 55 -> 1054, 56 -> 1036, 57 -> 1018, 58 -> 989, 59 -> 909, 60 -> 836, 61 -> 782, 62 -> 749, 63 -> 708, 64 -> 679, 65 -> 649, 66 -> 599, 67 -> 543, 68 -> 470
    //   464: iload #8
    //   466: istore_2
    //   467: goto -> 3682
    //   470: iload #8
    //   472: istore_2
    //   473: aload_0
    //   474: iload #11
    //   476: iload #5
    //   478: aload_1
    //   479: invokevirtual k : (IILjava/lang/Object;)Z
    //   482: ifeq -> 3682
    //   485: aload #16
    //   487: aload_1
    //   488: lload #14
    //   490: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   493: checkcast av2
    //   496: astore #17
    //   498: aload_0
    //   499: iload #5
    //   501: invokevirtual p : (I)Ljw2;
    //   504: astore #18
    //   506: getstatic kw2.a : Lzb0;
    //   509: astore #19
    //   511: iload #11
    //   513: iconst_3
    //   514: ishl
    //   515: invokestatic p : (I)I
    //   518: istore_2
    //   519: iload_2
    //   520: iload_2
    //   521: iadd
    //   522: istore_3
    //   523: aload #17
    //   525: aload #18
    //   527: invokevirtual b : (Ljw2;)I
    //   530: istore_2
    //   531: iload_2
    //   532: iload_3
    //   533: iadd
    //   534: istore_2
    //   535: iload #8
    //   537: iload_2
    //   538: iadd
    //   539: istore_2
    //   540: goto -> 3682
    //   543: iload #8
    //   545: istore_2
    //   546: aload_0
    //   547: iload #11
    //   549: iload #5
    //   551: aload_1
    //   552: invokevirtual k : (IILjava/lang/Object;)Z
    //   555: ifeq -> 3682
    //   558: lload #14
    //   560: aload_1
    //   561: invokestatic u : (JLjava/lang/Object;)J
    //   564: lstore #14
    //   566: iload #11
    //   568: iconst_3
    //   569: ishl
    //   570: invokestatic p : (I)I
    //   573: istore_2
    //   574: lload #14
    //   576: bipush #63
    //   578: lshr
    //   579: lload #14
    //   581: lload #14
    //   583: ladd
    //   584: lxor
    //   585: invokestatic q : (J)I
    //   588: istore_3
    //   589: iload #8
    //   591: iload_3
    //   592: iload_2
    //   593: iadd
    //   594: iadd
    //   595: istore_2
    //   596: goto -> 3682
    //   599: iload #8
    //   601: istore_2
    //   602: aload_0
    //   603: iload #11
    //   605: iload #5
    //   607: aload_1
    //   608: invokevirtual k : (IILjava/lang/Object;)Z
    //   611: ifeq -> 3682
    //   614: lload #14
    //   616: aload_1
    //   617: invokestatic t : (JLjava/lang/Object;)I
    //   620: istore_2
    //   621: iload #11
    //   623: iconst_3
    //   624: ishl
    //   625: invokestatic p : (I)I
    //   628: istore_3
    //   629: iload_2
    //   630: bipush #31
    //   632: ishr
    //   633: iload_2
    //   634: iload_2
    //   635: iadd
    //   636: ixor
    //   637: istore_2
    //   638: iload_2
    //   639: iload_3
    //   640: iload #8
    //   642: invokestatic n : (III)I
    //   645: istore_2
    //   646: goto -> 3682
    //   649: iload #8
    //   651: istore_2
    //   652: aload_0
    //   653: iload #11
    //   655: iload #5
    //   657: aload_1
    //   658: invokevirtual k : (IILjava/lang/Object;)Z
    //   661: ifeq -> 3682
    //   664: iload #11
    //   666: iconst_3
    //   667: ishl
    //   668: bipush #8
    //   670: iload #8
    //   672: invokestatic n : (III)I
    //   675: istore_2
    //   676: goto -> 3682
    //   679: iload #8
    //   681: istore_2
    //   682: aload_0
    //   683: iload #11
    //   685: iload #5
    //   687: aload_1
    //   688: invokevirtual k : (IILjava/lang/Object;)Z
    //   691: ifeq -> 3682
    //   694: iload #11
    //   696: iconst_3
    //   697: ishl
    //   698: iconst_4
    //   699: iload #8
    //   701: invokestatic n : (III)I
    //   704: istore_2
    //   705: goto -> 3682
    //   708: iload #8
    //   710: istore_2
    //   711: aload_0
    //   712: iload #11
    //   714: iload #5
    //   716: aload_1
    //   717: invokevirtual k : (IILjava/lang/Object;)Z
    //   720: ifeq -> 3682
    //   723: lload #14
    //   725: aload_1
    //   726: invokestatic t : (JLjava/lang/Object;)I
    //   729: i2l
    //   730: lstore #14
    //   732: iload #11
    //   734: iconst_3
    //   735: ishl
    //   736: invokestatic p : (I)I
    //   739: istore_2
    //   740: lload #14
    //   742: invokestatic q : (J)I
    //   745: istore_3
    //   746: goto -> 589
    //   749: iload #8
    //   751: istore_2
    //   752: aload_0
    //   753: iload #11
    //   755: iload #5
    //   757: aload_1
    //   758: invokevirtual k : (IILjava/lang/Object;)Z
    //   761: ifeq -> 3682
    //   764: lload #14
    //   766: aload_1
    //   767: invokestatic t : (JLjava/lang/Object;)I
    //   770: istore_2
    //   771: iload #11
    //   773: iconst_3
    //   774: ishl
    //   775: invokestatic p : (I)I
    //   778: istore_3
    //   779: goto -> 638
    //   782: iload #8
    //   784: istore_2
    //   785: aload_0
    //   786: iload #11
    //   788: iload #5
    //   790: aload_1
    //   791: invokevirtual k : (IILjava/lang/Object;)Z
    //   794: ifeq -> 3682
    //   797: aload #16
    //   799: aload_1
    //   800: lload #14
    //   802: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   805: checkcast hv2
    //   808: astore #17
    //   810: iload #11
    //   812: iconst_3
    //   813: ishl
    //   814: invokestatic p : (I)I
    //   817: istore_2
    //   818: aload #17
    //   820: invokevirtual e : ()I
    //   823: istore_3
    //   824: iload_3
    //   825: iload_3
    //   826: iload_2
    //   827: iload #8
    //   829: invokestatic o : (IIII)I
    //   832: istore_2
    //   833: goto -> 3682
    //   836: iload #8
    //   838: istore_2
    //   839: aload_0
    //   840: iload #11
    //   842: iload #5
    //   844: aload_1
    //   845: invokevirtual k : (IILjava/lang/Object;)Z
    //   848: ifeq -> 3682
    //   851: aload #16
    //   853: aload_1
    //   854: lload #14
    //   856: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   859: astore #19
    //   861: aload_0
    //   862: iload #5
    //   864: invokevirtual p : (I)Ljw2;
    //   867: astore #17
    //   869: getstatic kw2.a : Lzb0;
    //   872: astore #18
    //   874: aload #19
    //   876: checkcast av2
    //   879: astore #18
    //   881: iload #11
    //   883: iconst_3
    //   884: ishl
    //   885: invokestatic p : (I)I
    //   888: istore_2
    //   889: aload #18
    //   891: aload #17
    //   893: invokevirtual b : (Ljw2;)I
    //   896: istore_3
    //   897: iload_3
    //   898: iload_3
    //   899: iload_2
    //   900: iload #8
    //   902: invokestatic o : (IIII)I
    //   905: istore_2
    //   906: goto -> 3682
    //   909: iload #8
    //   911: istore_2
    //   912: aload_0
    //   913: iload #11
    //   915: iload #5
    //   917: aload_1
    //   918: invokevirtual k : (IILjava/lang/Object;)Z
    //   921: ifeq -> 3682
    //   924: iload #11
    //   926: iconst_3
    //   927: ishl
    //   928: istore_2
    //   929: aload #16
    //   931: aload_1
    //   932: lload #14
    //   934: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   937: astore #17
    //   939: aload #17
    //   941: instanceof hv2
    //   944: ifeq -> 968
    //   947: aload #17
    //   949: checkcast hv2
    //   952: astore #17
    //   954: iload_2
    //   955: invokestatic p : (I)I
    //   958: istore_2
    //   959: aload #17
    //   961: invokevirtual e : ()I
    //   964: istore_3
    //   965: goto -> 824
    //   968: aload #17
    //   970: checkcast java/lang/String
    //   973: astore #17
    //   975: iload_2
    //   976: invokestatic p : (I)I
    //   979: istore_2
    //   980: aload #17
    //   982: invokestatic a : (Ljava/lang/String;)I
    //   985: istore_3
    //   986: goto -> 824
    //   989: iload #8
    //   991: istore_2
    //   992: aload_0
    //   993: iload #11
    //   995: iload #5
    //   997: aload_1
    //   998: invokevirtual k : (IILjava/lang/Object;)Z
    //   1001: ifeq -> 3682
    //   1004: iload #11
    //   1006: iconst_3
    //   1007: ishl
    //   1008: iconst_1
    //   1009: iload #8
    //   1011: invokestatic n : (III)I
    //   1014: istore_2
    //   1015: goto -> 3682
    //   1018: iload #8
    //   1020: istore_2
    //   1021: aload_0
    //   1022: iload #11
    //   1024: iload #5
    //   1026: aload_1
    //   1027: invokevirtual k : (IILjava/lang/Object;)Z
    //   1030: ifeq -> 3682
    //   1033: goto -> 694
    //   1036: iload #8
    //   1038: istore_2
    //   1039: aload_0
    //   1040: iload #11
    //   1042: iload #5
    //   1044: aload_1
    //   1045: invokevirtual k : (IILjava/lang/Object;)Z
    //   1048: ifeq -> 3682
    //   1051: goto -> 664
    //   1054: iload #8
    //   1056: istore_2
    //   1057: aload_0
    //   1058: iload #11
    //   1060: iload #5
    //   1062: aload_1
    //   1063: invokevirtual k : (IILjava/lang/Object;)Z
    //   1066: ifeq -> 3682
    //   1069: lload #14
    //   1071: aload_1
    //   1072: invokestatic t : (JLjava/lang/Object;)I
    //   1075: i2l
    //   1076: lstore #14
    //   1078: iload #11
    //   1080: iconst_3
    //   1081: ishl
    //   1082: invokestatic p : (I)I
    //   1085: istore_2
    //   1086: lload #14
    //   1088: invokestatic q : (J)I
    //   1091: istore_3
    //   1092: goto -> 589
    //   1095: iload #8
    //   1097: istore_2
    //   1098: aload_0
    //   1099: iload #11
    //   1101: iload #5
    //   1103: aload_1
    //   1104: invokevirtual k : (IILjava/lang/Object;)Z
    //   1107: ifeq -> 3682
    //   1110: lload #14
    //   1112: aload_1
    //   1113: invokestatic u : (JLjava/lang/Object;)J
    //   1116: lstore #14
    //   1118: iload #11
    //   1120: iconst_3
    //   1121: ishl
    //   1122: invokestatic p : (I)I
    //   1125: istore_2
    //   1126: lload #14
    //   1128: invokestatic q : (J)I
    //   1131: istore_3
    //   1132: goto -> 589
    //   1135: iload #8
    //   1137: istore_2
    //   1138: aload_0
    //   1139: iload #11
    //   1141: iload #5
    //   1143: aload_1
    //   1144: invokevirtual k : (IILjava/lang/Object;)Z
    //   1147: ifeq -> 3682
    //   1150: lload #14
    //   1152: aload_1
    //   1153: invokestatic u : (JLjava/lang/Object;)J
    //   1156: lstore #14
    //   1158: iload #11
    //   1160: iconst_3
    //   1161: ishl
    //   1162: invokestatic p : (I)I
    //   1165: istore_2
    //   1166: lload #14
    //   1168: invokestatic q : (J)I
    //   1171: istore_3
    //   1172: goto -> 589
    //   1175: iload #8
    //   1177: istore_2
    //   1178: aload_0
    //   1179: iload #11
    //   1181: iload #5
    //   1183: aload_1
    //   1184: invokevirtual k : (IILjava/lang/Object;)Z
    //   1187: ifeq -> 3682
    //   1190: goto -> 694
    //   1193: iload #8
    //   1195: istore_2
    //   1196: aload_0
    //   1197: iload #11
    //   1199: iload #5
    //   1201: aload_1
    //   1202: invokevirtual k : (IILjava/lang/Object;)Z
    //   1205: ifeq -> 3682
    //   1208: goto -> 664
    //   1211: aload #16
    //   1213: aload_1
    //   1214: lload #14
    //   1216: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1219: astore_1
    //   1220: iload #5
    //   1222: iconst_3
    //   1223: idiv
    //   1224: istore_2
    //   1225: aload_0
    //   1226: getfield b : [Ljava/lang/Object;
    //   1229: iload_2
    //   1230: iload_2
    //   1231: iadd
    //   1232: aaload
    //   1233: astore #16
    //   1235: aload_1
    //   1236: ifnull -> 1244
    //   1239: invokestatic b : ()V
    //   1242: iconst_0
    //   1243: ireturn
    //   1244: aload #16
    //   1246: invokestatic f : (Ljava/lang/Object;)Ljava/lang/ClassCastException;
    //   1249: athrow
    //   1250: aload #16
    //   1252: aload_1
    //   1253: lload #14
    //   1255: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1258: checkcast java/util/List
    //   1261: astore #17
    //   1263: aload_0
    //   1264: iload #5
    //   1266: invokevirtual p : (I)Ljw2;
    //   1269: astore #18
    //   1271: getstatic kw2.a : Lzb0;
    //   1274: astore #19
    //   1276: aload #17
    //   1278: invokeinterface size : ()I
    //   1283: istore #9
    //   1285: iload #9
    //   1287: ifne -> 1296
    //   1290: iconst_0
    //   1291: istore #4
    //   1293: goto -> 1353
    //   1296: iconst_0
    //   1297: istore_3
    //   1298: iconst_0
    //   1299: istore_2
    //   1300: iload_2
    //   1301: istore #4
    //   1303: iload_3
    //   1304: iload #9
    //   1306: if_icmpge -> 1353
    //   1309: aload #17
    //   1311: iload_3
    //   1312: invokeinterface get : (I)Ljava/lang/Object;
    //   1317: checkcast av2
    //   1320: astore #19
    //   1322: iload #11
    //   1324: iconst_3
    //   1325: ishl
    //   1326: invokestatic p : (I)I
    //   1329: istore #4
    //   1331: iload_2
    //   1332: aload #19
    //   1334: aload #18
    //   1336: invokevirtual b : (Ljw2;)I
    //   1339: iload #4
    //   1341: iload #4
    //   1343: iadd
    //   1344: iadd
    //   1345: iadd
    //   1346: istore_2
    //   1347: iinc #3, 1
    //   1350: goto -> 1300
    //   1353: iload #8
    //   1355: iload #4
    //   1357: iadd
    //   1358: istore_2
    //   1359: goto -> 3682
    //   1362: aload #16
    //   1364: aload_1
    //   1365: lload #14
    //   1367: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1370: checkcast java/util/List
    //   1373: invokestatic s : (Ljava/util/List;)I
    //   1376: istore #4
    //   1378: iload #8
    //   1380: istore_2
    //   1381: iload #4
    //   1383: ifle -> 3682
    //   1386: iload #11
    //   1388: iconst_3
    //   1389: ishl
    //   1390: invokestatic p : (I)I
    //   1393: istore_3
    //   1394: iload #4
    //   1396: istore_2
    //   1397: iload_2
    //   1398: iload_3
    //   1399: iload_2
    //   1400: iload #8
    //   1402: invokestatic o : (IIII)I
    //   1405: istore_2
    //   1406: goto -> 3682
    //   1409: aload #16
    //   1411: aload_1
    //   1412: lload #14
    //   1414: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1417: checkcast java/util/List
    //   1420: invokestatic w : (Ljava/util/List;)I
    //   1423: istore_3
    //   1424: iload #8
    //   1426: istore_2
    //   1427: iload_3
    //   1428: ifle -> 3682
    //   1431: iload #11
    //   1433: iconst_3
    //   1434: ishl
    //   1435: invokestatic p : (I)I
    //   1438: istore #4
    //   1440: iload_3
    //   1441: istore_2
    //   1442: iload #4
    //   1444: istore_3
    //   1445: goto -> 1397
    //   1448: aload #16
    //   1450: aload_1
    //   1451: lload #14
    //   1453: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1456: checkcast java/util/List
    //   1459: astore #17
    //   1461: getstatic kw2.a : Lzb0;
    //   1464: astore #18
    //   1466: aload #17
    //   1468: invokeinterface size : ()I
    //   1473: bipush #8
    //   1475: imul
    //   1476: istore_3
    //   1477: iload #8
    //   1479: istore_2
    //   1480: iload_3
    //   1481: ifle -> 3682
    //   1484: iload #11
    //   1486: iconst_3
    //   1487: ishl
    //   1488: invokestatic p : (I)I
    //   1491: istore #4
    //   1493: iload_3
    //   1494: istore_2
    //   1495: iload #4
    //   1497: istore_3
    //   1498: goto -> 1397
    //   1501: aload #16
    //   1503: aload_1
    //   1504: lload #14
    //   1506: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1509: checkcast java/util/List
    //   1512: astore #17
    //   1514: getstatic kw2.a : Lzb0;
    //   1517: astore #18
    //   1519: aload #17
    //   1521: invokeinterface size : ()I
    //   1526: iconst_4
    //   1527: imul
    //   1528: istore_3
    //   1529: iload #8
    //   1531: istore_2
    //   1532: iload_3
    //   1533: ifle -> 3682
    //   1536: iload #11
    //   1538: iconst_3
    //   1539: ishl
    //   1540: invokestatic p : (I)I
    //   1543: istore #4
    //   1545: iload_3
    //   1546: istore_2
    //   1547: iload #4
    //   1549: istore_3
    //   1550: goto -> 1397
    //   1553: aload #16
    //   1555: aload_1
    //   1556: lload #14
    //   1558: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1561: checkcast java/util/List
    //   1564: invokestatic t : (Ljava/util/List;)I
    //   1567: istore_3
    //   1568: iload #8
    //   1570: istore_2
    //   1571: iload_3
    //   1572: ifle -> 3682
    //   1575: iload #11
    //   1577: iconst_3
    //   1578: ishl
    //   1579: invokestatic p : (I)I
    //   1582: istore #4
    //   1584: iload_3
    //   1585: istore_2
    //   1586: iload #4
    //   1588: istore_3
    //   1589: goto -> 1397
    //   1592: aload #16
    //   1594: aload_1
    //   1595: lload #14
    //   1597: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1600: checkcast java/util/List
    //   1603: invokestatic v : (Ljava/util/List;)I
    //   1606: istore_3
    //   1607: iload #8
    //   1609: istore_2
    //   1610: iload_3
    //   1611: ifle -> 3682
    //   1614: iload #11
    //   1616: iconst_3
    //   1617: ishl
    //   1618: invokestatic p : (I)I
    //   1621: istore #4
    //   1623: iload_3
    //   1624: istore_2
    //   1625: iload #4
    //   1627: istore_3
    //   1628: goto -> 1397
    //   1631: aload #16
    //   1633: aload_1
    //   1634: lload #14
    //   1636: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1639: checkcast java/util/List
    //   1642: astore #18
    //   1644: getstatic kw2.a : Lzb0;
    //   1647: astore #17
    //   1649: aload #18
    //   1651: invokeinterface size : ()I
    //   1656: istore_3
    //   1657: iload #8
    //   1659: istore_2
    //   1660: iload_3
    //   1661: ifle -> 3682
    //   1664: iload #11
    //   1666: iconst_3
    //   1667: ishl
    //   1668: invokestatic p : (I)I
    //   1671: istore #4
    //   1673: iload_3
    //   1674: istore_2
    //   1675: iload #4
    //   1677: istore_3
    //   1678: goto -> 1397
    //   1681: aload #16
    //   1683: aload_1
    //   1684: lload #14
    //   1686: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1689: checkcast java/util/List
    //   1692: astore #18
    //   1694: getstatic kw2.a : Lzb0;
    //   1697: astore #17
    //   1699: aload #18
    //   1701: invokeinterface size : ()I
    //   1706: iconst_4
    //   1707: imul
    //   1708: istore_3
    //   1709: iload #8
    //   1711: istore_2
    //   1712: iload_3
    //   1713: ifle -> 3682
    //   1716: iload #11
    //   1718: iconst_3
    //   1719: ishl
    //   1720: invokestatic p : (I)I
    //   1723: istore #4
    //   1725: iload_3
    //   1726: istore_2
    //   1727: iload #4
    //   1729: istore_3
    //   1730: goto -> 1397
    //   1733: aload #16
    //   1735: aload_1
    //   1736: lload #14
    //   1738: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1741: checkcast java/util/List
    //   1744: astore #17
    //   1746: getstatic kw2.a : Lzb0;
    //   1749: astore #18
    //   1751: aload #17
    //   1753: invokeinterface size : ()I
    //   1758: bipush #8
    //   1760: imul
    //   1761: istore_3
    //   1762: iload #8
    //   1764: istore_2
    //   1765: iload_3
    //   1766: ifle -> 3682
    //   1769: iload #11
    //   1771: iconst_3
    //   1772: ishl
    //   1773: invokestatic p : (I)I
    //   1776: istore #4
    //   1778: iload_3
    //   1779: istore_2
    //   1780: iload #4
    //   1782: istore_3
    //   1783: goto -> 1397
    //   1786: aload #16
    //   1788: aload_1
    //   1789: lload #14
    //   1791: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1794: checkcast java/util/List
    //   1797: invokestatic u : (Ljava/util/List;)I
    //   1800: istore_3
    //   1801: iload #8
    //   1803: istore_2
    //   1804: iload_3
    //   1805: ifle -> 3682
    //   1808: iload #11
    //   1810: iconst_3
    //   1811: ishl
    //   1812: invokestatic p : (I)I
    //   1815: istore #4
    //   1817: iload_3
    //   1818: istore_2
    //   1819: iload #4
    //   1821: istore_3
    //   1822: goto -> 1397
    //   1825: aload #16
    //   1827: aload_1
    //   1828: lload #14
    //   1830: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1833: checkcast java/util/List
    //   1836: invokestatic r : (Ljava/util/List;)I
    //   1839: istore_3
    //   1840: iload #8
    //   1842: istore_2
    //   1843: iload_3
    //   1844: ifle -> 3682
    //   1847: iload #11
    //   1849: iconst_3
    //   1850: ishl
    //   1851: invokestatic p : (I)I
    //   1854: istore #4
    //   1856: iload_3
    //   1857: istore_2
    //   1858: iload #4
    //   1860: istore_3
    //   1861: goto -> 1397
    //   1864: aload #16
    //   1866: aload_1
    //   1867: lload #14
    //   1869: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1872: checkcast java/util/List
    //   1875: invokestatic q : (Ljava/util/List;)I
    //   1878: istore_3
    //   1879: iload #8
    //   1881: istore_2
    //   1882: iload_3
    //   1883: ifle -> 3682
    //   1886: iload #11
    //   1888: iconst_3
    //   1889: ishl
    //   1890: invokestatic p : (I)I
    //   1893: istore #4
    //   1895: iload_3
    //   1896: istore_2
    //   1897: iload #4
    //   1899: istore_3
    //   1900: goto -> 1397
    //   1903: aload #16
    //   1905: aload_1
    //   1906: lload #14
    //   1908: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1911: checkcast java/util/List
    //   1914: astore #17
    //   1916: getstatic kw2.a : Lzb0;
    //   1919: astore #18
    //   1921: aload #17
    //   1923: invokeinterface size : ()I
    //   1928: iconst_4
    //   1929: imul
    //   1930: istore_3
    //   1931: iload #8
    //   1933: istore_2
    //   1934: iload_3
    //   1935: ifle -> 3682
    //   1938: iload #11
    //   1940: iconst_3
    //   1941: ishl
    //   1942: invokestatic p : (I)I
    //   1945: istore #4
    //   1947: iload_3
    //   1948: istore_2
    //   1949: iload #4
    //   1951: istore_3
    //   1952: goto -> 1397
    //   1955: aload #16
    //   1957: aload_1
    //   1958: lload #14
    //   1960: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1963: checkcast java/util/List
    //   1966: astore #18
    //   1968: getstatic kw2.a : Lzb0;
    //   1971: astore #17
    //   1973: aload #18
    //   1975: invokeinterface size : ()I
    //   1980: bipush #8
    //   1982: imul
    //   1983: istore_3
    //   1984: iload #8
    //   1986: istore_2
    //   1987: iload_3
    //   1988: ifle -> 3682
    //   1991: iload #11
    //   1993: iconst_3
    //   1994: ishl
    //   1995: invokestatic p : (I)I
    //   1998: istore #4
    //   2000: iload_3
    //   2001: istore_2
    //   2002: iload #4
    //   2004: istore_3
    //   2005: goto -> 1397
    //   2008: aload #16
    //   2010: aload_1
    //   2011: lload #14
    //   2013: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2016: checkcast java/util/List
    //   2019: astore #17
    //   2021: getstatic kw2.a : Lzb0;
    //   2024: astore #18
    //   2026: aload #17
    //   2028: invokeinterface size : ()I
    //   2033: istore_3
    //   2034: iload_3
    //   2035: ifne -> 2043
    //   2038: iconst_0
    //   2039: istore_2
    //   2040: goto -> 2065
    //   2043: aload #17
    //   2045: invokestatic s : (Ljava/util/List;)I
    //   2048: istore_2
    //   2049: iload #11
    //   2051: iconst_3
    //   2052: ishl
    //   2053: invokestatic p : (I)I
    //   2056: istore #4
    //   2058: iload #4
    //   2060: iload_3
    //   2061: imul
    //   2062: iload_2
    //   2063: iadd
    //   2064: istore_2
    //   2065: iload #8
    //   2067: iload_2
    //   2068: iadd
    //   2069: istore_2
    //   2070: goto -> 3682
    //   2073: aload #16
    //   2075: aload_1
    //   2076: lload #14
    //   2078: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2081: checkcast java/util/List
    //   2084: astore #18
    //   2086: getstatic kw2.a : Lzb0;
    //   2089: astore #17
    //   2091: aload #18
    //   2093: invokeinterface size : ()I
    //   2098: istore_3
    //   2099: iload_3
    //   2100: ifne -> 2106
    //   2103: goto -> 2038
    //   2106: aload #18
    //   2108: invokestatic w : (Ljava/util/List;)I
    //   2111: istore_2
    //   2112: iload #11
    //   2114: iconst_3
    //   2115: ishl
    //   2116: invokestatic p : (I)I
    //   2119: istore #4
    //   2121: goto -> 2058
    //   2124: iload #11
    //   2126: aload #16
    //   2128: aload_1
    //   2129: lload #14
    //   2131: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2134: checkcast java/util/List
    //   2137: invokestatic y : (ILjava/util/List;)I
    //   2140: istore_2
    //   2141: goto -> 535
    //   2144: iload #11
    //   2146: aload #16
    //   2148: aload_1
    //   2149: lload #14
    //   2151: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2154: checkcast java/util/List
    //   2157: invokestatic x : (ILjava/util/List;)I
    //   2160: istore_2
    //   2161: goto -> 535
    //   2164: aload #16
    //   2166: aload_1
    //   2167: lload #14
    //   2169: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2172: checkcast java/util/List
    //   2175: astore #18
    //   2177: getstatic kw2.a : Lzb0;
    //   2180: astore #17
    //   2182: aload #18
    //   2184: invokeinterface size : ()I
    //   2189: istore_3
    //   2190: iload_3
    //   2191: ifne -> 2197
    //   2194: goto -> 2038
    //   2197: aload #18
    //   2199: invokestatic t : (Ljava/util/List;)I
    //   2202: istore_2
    //   2203: iload #11
    //   2205: iconst_3
    //   2206: ishl
    //   2207: invokestatic p : (I)I
    //   2210: istore #4
    //   2212: goto -> 2058
    //   2215: aload #16
    //   2217: aload_1
    //   2218: lload #14
    //   2220: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2223: checkcast java/util/List
    //   2226: astore #17
    //   2228: getstatic kw2.a : Lzb0;
    //   2231: astore #18
    //   2233: aload #17
    //   2235: invokeinterface size : ()I
    //   2240: istore_3
    //   2241: iload_3
    //   2242: ifne -> 2248
    //   2245: goto -> 2038
    //   2248: aload #17
    //   2250: invokestatic v : (Ljava/util/List;)I
    //   2253: istore_2
    //   2254: iload #11
    //   2256: iconst_3
    //   2257: ishl
    //   2258: invokestatic p : (I)I
    //   2261: istore #4
    //   2263: goto -> 2058
    //   2266: aload #16
    //   2268: aload_1
    //   2269: lload #14
    //   2271: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2274: checkcast java/util/List
    //   2277: astore #17
    //   2279: getstatic kw2.a : Lzb0;
    //   2282: astore #18
    //   2284: aload #17
    //   2286: invokeinterface size : ()I
    //   2291: istore_2
    //   2292: iload_2
    //   2293: ifne -> 2299
    //   2296: goto -> 2038
    //   2299: iload #11
    //   2301: iconst_3
    //   2302: ishl
    //   2303: invokestatic p : (I)I
    //   2306: iload_2
    //   2307: imul
    //   2308: istore_3
    //   2309: iconst_0
    //   2310: istore #4
    //   2312: iload_3
    //   2313: istore_2
    //   2314: iload #4
    //   2316: aload #17
    //   2318: invokeinterface size : ()I
    //   2323: if_icmpge -> 2065
    //   2326: aload #17
    //   2328: iload #4
    //   2330: invokeinterface get : (I)Ljava/lang/Object;
    //   2335: checkcast hv2
    //   2338: invokevirtual e : ()I
    //   2341: istore_2
    //   2342: iload_2
    //   2343: iload_2
    //   2344: iload_3
    //   2345: invokestatic n : (III)I
    //   2348: istore_3
    //   2349: iinc #4, 1
    //   2352: goto -> 2312
    //   2355: aload #16
    //   2357: aload_1
    //   2358: lload #14
    //   2360: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2363: checkcast java/util/List
    //   2366: astore #18
    //   2368: aload_0
    //   2369: iload #5
    //   2371: invokevirtual p : (I)Ljw2;
    //   2374: astore #17
    //   2376: getstatic kw2.a : Lzb0;
    //   2379: astore #19
    //   2381: aload #18
    //   2383: invokeinterface size : ()I
    //   2388: istore #9
    //   2390: iload #9
    //   2392: ifne -> 2401
    //   2395: iconst_0
    //   2396: istore #4
    //   2398: goto -> 2456
    //   2401: iload #11
    //   2403: iconst_3
    //   2404: ishl
    //   2405: invokestatic p : (I)I
    //   2408: iload #9
    //   2410: imul
    //   2411: istore_2
    //   2412: iconst_0
    //   2413: istore_3
    //   2414: iload_2
    //   2415: istore #4
    //   2417: iload_3
    //   2418: iload #9
    //   2420: if_icmpge -> 2456
    //   2423: aload #18
    //   2425: iload_3
    //   2426: invokeinterface get : (I)Ljava/lang/Object;
    //   2431: checkcast av2
    //   2434: aload #17
    //   2436: invokevirtual b : (Ljw2;)I
    //   2439: istore #4
    //   2441: iload #4
    //   2443: iload #4
    //   2445: iload_2
    //   2446: invokestatic n : (III)I
    //   2449: istore_2
    //   2450: iinc #3, 1
    //   2453: goto -> 2414
    //   2456: iload #8
    //   2458: iload #4
    //   2460: iadd
    //   2461: istore_2
    //   2462: goto -> 3682
    //   2465: aload #16
    //   2467: aload_1
    //   2468: lload #14
    //   2470: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2473: checkcast java/util/List
    //   2476: astore #17
    //   2478: getstatic kw2.a : Lzb0;
    //   2481: astore #18
    //   2483: aload #17
    //   2485: invokeinterface size : ()I
    //   2490: istore #9
    //   2492: iload #9
    //   2494: ifne -> 2500
    //   2497: goto -> 2038
    //   2500: iload #11
    //   2502: iconst_3
    //   2503: ishl
    //   2504: invokestatic p : (I)I
    //   2507: iload #9
    //   2509: imul
    //   2510: istore_3
    //   2511: iconst_0
    //   2512: istore #4
    //   2514: iload_3
    //   2515: istore_2
    //   2516: iload #4
    //   2518: iload #9
    //   2520: if_icmpge -> 2065
    //   2523: aload #17
    //   2525: iload #4
    //   2527: invokeinterface get : (I)Ljava/lang/Object;
    //   2532: astore #18
    //   2534: aload #18
    //   2536: instanceof hv2
    //   2539: ifeq -> 2561
    //   2542: aload #18
    //   2544: checkcast hv2
    //   2547: invokevirtual e : ()I
    //   2550: istore_2
    //   2551: iload_2
    //   2552: iload_2
    //   2553: iload_3
    //   2554: invokestatic n : (III)I
    //   2557: istore_3
    //   2558: goto -> 2573
    //   2561: aload #18
    //   2563: checkcast java/lang/String
    //   2566: invokestatic a : (Ljava/lang/String;)I
    //   2569: istore_2
    //   2570: goto -> 2551
    //   2573: iinc #4, 1
    //   2576: goto -> 2514
    //   2579: aload #16
    //   2581: aload_1
    //   2582: lload #14
    //   2584: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2587: checkcast java/util/List
    //   2590: astore #18
    //   2592: getstatic kw2.a : Lzb0;
    //   2595: astore #17
    //   2597: aload #18
    //   2599: invokeinterface size : ()I
    //   2604: istore_2
    //   2605: iload_2
    //   2606: ifne -> 2614
    //   2609: iconst_0
    //   2610: istore_2
    //   2611: goto -> 2626
    //   2614: iload #11
    //   2616: iconst_3
    //   2617: ishl
    //   2618: invokestatic p : (I)I
    //   2621: iconst_1
    //   2622: iadd
    //   2623: iload_2
    //   2624: imul
    //   2625: istore_2
    //   2626: iload #8
    //   2628: iload_2
    //   2629: iadd
    //   2630: istore_2
    //   2631: goto -> 3682
    //   2634: iload #11
    //   2636: aload #16
    //   2638: aload_1
    //   2639: lload #14
    //   2641: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2644: checkcast java/util/List
    //   2647: invokestatic x : (ILjava/util/List;)I
    //   2650: istore_2
    //   2651: goto -> 535
    //   2654: iload #11
    //   2656: aload #16
    //   2658: aload_1
    //   2659: lload #14
    //   2661: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2664: checkcast java/util/List
    //   2667: invokestatic y : (ILjava/util/List;)I
    //   2670: istore_2
    //   2671: goto -> 535
    //   2674: aload #16
    //   2676: aload_1
    //   2677: lload #14
    //   2679: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2682: checkcast java/util/List
    //   2685: astore #17
    //   2687: getstatic kw2.a : Lzb0;
    //   2690: astore #18
    //   2692: aload #17
    //   2694: invokeinterface size : ()I
    //   2699: istore_3
    //   2700: iload_3
    //   2701: ifne -> 2707
    //   2704: goto -> 2038
    //   2707: aload #17
    //   2709: invokestatic u : (Ljava/util/List;)I
    //   2712: istore_2
    //   2713: iload #11
    //   2715: iconst_3
    //   2716: ishl
    //   2717: invokestatic p : (I)I
    //   2720: istore #4
    //   2722: goto -> 2058
    //   2725: aload #16
    //   2727: aload_1
    //   2728: lload #14
    //   2730: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2733: checkcast java/util/List
    //   2736: astore #18
    //   2738: getstatic kw2.a : Lzb0;
    //   2741: astore #17
    //   2743: aload #18
    //   2745: invokeinterface size : ()I
    //   2750: istore_3
    //   2751: iload_3
    //   2752: ifne -> 2758
    //   2755: goto -> 2038
    //   2758: aload #18
    //   2760: invokestatic r : (Ljava/util/List;)I
    //   2763: istore_2
    //   2764: iload #11
    //   2766: iconst_3
    //   2767: ishl
    //   2768: invokestatic p : (I)I
    //   2771: istore #4
    //   2773: goto -> 2058
    //   2776: aload #16
    //   2778: aload_1
    //   2779: lload #14
    //   2781: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2784: checkcast java/util/List
    //   2787: astore #18
    //   2789: getstatic kw2.a : Lzb0;
    //   2792: astore #17
    //   2794: aload #18
    //   2796: invokeinterface size : ()I
    //   2801: ifne -> 2807
    //   2804: goto -> 2609
    //   2807: aload #18
    //   2809: invokestatic q : (Ljava/util/List;)I
    //   2812: istore_3
    //   2813: aload #18
    //   2815: invokeinterface size : ()I
    //   2820: istore_2
    //   2821: iload #11
    //   2823: iconst_3
    //   2824: ishl
    //   2825: invokestatic p : (I)I
    //   2828: iload_2
    //   2829: imul
    //   2830: iload_3
    //   2831: iadd
    //   2832: istore_2
    //   2833: goto -> 2626
    //   2836: iload #11
    //   2838: aload #16
    //   2840: aload_1
    //   2841: lload #14
    //   2843: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2846: checkcast java/util/List
    //   2849: invokestatic x : (ILjava/util/List;)I
    //   2852: istore_2
    //   2853: goto -> 535
    //   2856: iload #11
    //   2858: aload #16
    //   2860: aload_1
    //   2861: lload #14
    //   2863: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2866: checkcast java/util/List
    //   2869: invokestatic y : (ILjava/util/List;)I
    //   2872: istore_2
    //   2873: goto -> 535
    //   2876: iload #8
    //   2878: istore_2
    //   2879: aload_0
    //   2880: aload_1
    //   2881: iload #5
    //   2883: iload #6
    //   2885: iload #7
    //   2887: iload #9
    //   2889: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   2892: ifeq -> 3682
    //   2895: aload #16
    //   2897: aload_1
    //   2898: lload #14
    //   2900: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2903: checkcast av2
    //   2906: astore #17
    //   2908: aload_0
    //   2909: iload #5
    //   2911: invokevirtual p : (I)Ljw2;
    //   2914: astore #18
    //   2916: getstatic kw2.a : Lzb0;
    //   2919: astore #19
    //   2921: iload #11
    //   2923: iconst_3
    //   2924: ishl
    //   2925: invokestatic p : (I)I
    //   2928: istore_2
    //   2929: iload_2
    //   2930: iload_2
    //   2931: iadd
    //   2932: istore_3
    //   2933: aload #17
    //   2935: aload #18
    //   2937: invokevirtual b : (Ljw2;)I
    //   2940: istore_2
    //   2941: goto -> 531
    //   2944: iload #8
    //   2946: istore_2
    //   2947: aload_0
    //   2948: aload_1
    //   2949: iload #5
    //   2951: iload #6
    //   2953: iload #7
    //   2955: iload #9
    //   2957: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   2960: ifeq -> 3682
    //   2963: aload #16
    //   2965: aload_1
    //   2966: lload #14
    //   2968: invokevirtual getLong : (Ljava/lang/Object;J)J
    //   2971: lstore #14
    //   2973: iload #11
    //   2975: iconst_3
    //   2976: ishl
    //   2977: invokestatic p : (I)I
    //   2980: istore_2
    //   2981: lload #14
    //   2983: bipush #63
    //   2985: lshr
    //   2986: lload #14
    //   2988: lload #14
    //   2990: ladd
    //   2991: lxor
    //   2992: invokestatic q : (J)I
    //   2995: istore_3
    //   2996: iload_3
    //   2997: iload_2
    //   2998: iadd
    //   2999: istore_2
    //   3000: goto -> 535
    //   3003: iload #8
    //   3005: istore_2
    //   3006: aload_0
    //   3007: aload_1
    //   3008: iload #5
    //   3010: iload #6
    //   3012: iload #7
    //   3014: iload #9
    //   3016: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3019: ifeq -> 3682
    //   3022: aload #16
    //   3024: aload_1
    //   3025: lload #14
    //   3027: invokevirtual getInt : (Ljava/lang/Object;J)I
    //   3030: istore_3
    //   3031: iload #11
    //   3033: iconst_3
    //   3034: ishl
    //   3035: invokestatic p : (I)I
    //   3038: istore_2
    //   3039: iload_3
    //   3040: bipush #31
    //   3042: ishr
    //   3043: iload_3
    //   3044: iload_3
    //   3045: iadd
    //   3046: ixor
    //   3047: istore_3
    //   3048: iload_3
    //   3049: iload_2
    //   3050: iload #8
    //   3052: invokestatic n : (III)I
    //   3055: istore_2
    //   3056: goto -> 3682
    //   3059: iload #8
    //   3061: istore_2
    //   3062: aload_0
    //   3063: aload_1
    //   3064: iload #5
    //   3066: iload #6
    //   3068: iload #7
    //   3070: iload #9
    //   3072: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3075: ifeq -> 3682
    //   3078: iload #11
    //   3080: iconst_3
    //   3081: ishl
    //   3082: bipush #8
    //   3084: iload #8
    //   3086: invokestatic n : (III)I
    //   3089: istore_2
    //   3090: goto -> 3682
    //   3093: iload #8
    //   3095: istore_2
    //   3096: aload_0
    //   3097: aload_1
    //   3098: iload #5
    //   3100: iload #6
    //   3102: iload #7
    //   3104: iload #9
    //   3106: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3109: ifeq -> 3682
    //   3112: iload #11
    //   3114: iconst_3
    //   3115: ishl
    //   3116: iconst_4
    //   3117: iload #8
    //   3119: invokestatic n : (III)I
    //   3122: istore_2
    //   3123: goto -> 3682
    //   3126: iload #8
    //   3128: istore_2
    //   3129: aload_0
    //   3130: aload_1
    //   3131: iload #5
    //   3133: iload #6
    //   3135: iload #7
    //   3137: iload #9
    //   3139: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3142: ifeq -> 3682
    //   3145: aload #16
    //   3147: aload_1
    //   3148: lload #14
    //   3150: invokevirtual getInt : (Ljava/lang/Object;J)I
    //   3153: i2l
    //   3154: lstore #14
    //   3156: iload #11
    //   3158: iconst_3
    //   3159: ishl
    //   3160: invokestatic p : (I)I
    //   3163: istore_2
    //   3164: lload #14
    //   3166: invokestatic q : (J)I
    //   3169: istore_3
    //   3170: goto -> 2996
    //   3173: iload #8
    //   3175: istore_2
    //   3176: aload_0
    //   3177: aload_1
    //   3178: iload #5
    //   3180: iload #6
    //   3182: iload #7
    //   3184: iload #9
    //   3186: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3189: ifeq -> 3682
    //   3192: aload #16
    //   3194: aload_1
    //   3195: lload #14
    //   3197: invokevirtual getInt : (Ljava/lang/Object;J)I
    //   3200: istore_3
    //   3201: iload #11
    //   3203: iconst_3
    //   3204: ishl
    //   3205: invokestatic p : (I)I
    //   3208: istore_2
    //   3209: goto -> 3048
    //   3212: iload #8
    //   3214: istore_2
    //   3215: aload_0
    //   3216: aload_1
    //   3217: iload #5
    //   3219: iload #6
    //   3221: iload #7
    //   3223: iload #9
    //   3225: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3228: ifeq -> 3682
    //   3231: aload #16
    //   3233: aload_1
    //   3234: lload #14
    //   3236: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   3239: checkcast hv2
    //   3242: astore #17
    //   3244: iload #11
    //   3246: iconst_3
    //   3247: ishl
    //   3248: invokestatic p : (I)I
    //   3251: istore_2
    //   3252: aload #17
    //   3254: invokevirtual e : ()I
    //   3257: istore_3
    //   3258: iload_3
    //   3259: iload_3
    //   3260: iload_2
    //   3261: iload #8
    //   3263: invokestatic o : (IIII)I
    //   3266: istore_2
    //   3267: goto -> 3682
    //   3270: iload #8
    //   3272: istore_2
    //   3273: aload_0
    //   3274: aload_1
    //   3275: iload #5
    //   3277: iload #6
    //   3279: iload #7
    //   3281: iload #9
    //   3283: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3286: ifeq -> 3682
    //   3289: aload #16
    //   3291: aload_1
    //   3292: lload #14
    //   3294: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   3297: astore #18
    //   3299: aload_0
    //   3300: iload #5
    //   3302: invokevirtual p : (I)Ljw2;
    //   3305: astore #17
    //   3307: getstatic kw2.a : Lzb0;
    //   3310: astore #19
    //   3312: aload #18
    //   3314: checkcast av2
    //   3317: astore #18
    //   3319: iload #11
    //   3321: iconst_3
    //   3322: ishl
    //   3323: invokestatic p : (I)I
    //   3326: istore_2
    //   3327: aload #18
    //   3329: aload #17
    //   3331: invokevirtual b : (Ljw2;)I
    //   3334: istore_3
    //   3335: goto -> 897
    //   3338: iload #8
    //   3340: istore_2
    //   3341: aload_0
    //   3342: aload_1
    //   3343: iload #5
    //   3345: iload #6
    //   3347: iload #7
    //   3349: iload #9
    //   3351: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3354: ifeq -> 3682
    //   3357: iload #11
    //   3359: iconst_3
    //   3360: ishl
    //   3361: istore_2
    //   3362: aload #16
    //   3364: aload_1
    //   3365: lload #14
    //   3367: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   3370: astore #17
    //   3372: aload #17
    //   3374: instanceof hv2
    //   3377: ifeq -> 3401
    //   3380: aload #17
    //   3382: checkcast hv2
    //   3385: astore #17
    //   3387: iload_2
    //   3388: invokestatic p : (I)I
    //   3391: istore_2
    //   3392: aload #17
    //   3394: invokevirtual e : ()I
    //   3397: istore_3
    //   3398: goto -> 3258
    //   3401: aload #17
    //   3403: checkcast java/lang/String
    //   3406: astore #17
    //   3408: iload_2
    //   3409: invokestatic p : (I)I
    //   3412: istore_2
    //   3413: aload #17
    //   3415: invokestatic a : (Ljava/lang/String;)I
    //   3418: istore_3
    //   3419: goto -> 3258
    //   3422: iload #8
    //   3424: istore_2
    //   3425: aload_0
    //   3426: aload_1
    //   3427: iload #5
    //   3429: iload #6
    //   3431: iload #7
    //   3433: iload #9
    //   3435: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3438: ifeq -> 3682
    //   3441: iload #11
    //   3443: iconst_3
    //   3444: ishl
    //   3445: iconst_1
    //   3446: iload #8
    //   3448: invokestatic n : (III)I
    //   3451: istore_2
    //   3452: goto -> 3682
    //   3455: iload #8
    //   3457: istore_2
    //   3458: aload_0
    //   3459: aload_1
    //   3460: iload #5
    //   3462: iload #6
    //   3464: iload #7
    //   3466: iload #9
    //   3468: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3471: ifeq -> 3682
    //   3474: goto -> 3112
    //   3477: iload #8
    //   3479: istore_2
    //   3480: aload_0
    //   3481: aload_1
    //   3482: iload #5
    //   3484: iload #6
    //   3486: iload #7
    //   3488: iload #9
    //   3490: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3493: ifeq -> 3682
    //   3496: goto -> 3078
    //   3499: iload #8
    //   3501: istore_2
    //   3502: aload_0
    //   3503: aload_1
    //   3504: iload #5
    //   3506: iload #6
    //   3508: iload #7
    //   3510: iload #9
    //   3512: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3515: ifeq -> 3682
    //   3518: aload #16
    //   3520: aload_1
    //   3521: lload #14
    //   3523: invokevirtual getInt : (Ljava/lang/Object;J)I
    //   3526: i2l
    //   3527: lstore #14
    //   3529: iload #11
    //   3531: iconst_3
    //   3532: ishl
    //   3533: invokestatic p : (I)I
    //   3536: istore_2
    //   3537: lload #14
    //   3539: invokestatic q : (J)I
    //   3542: istore_3
    //   3543: goto -> 2996
    //   3546: iload #8
    //   3548: istore_2
    //   3549: aload_0
    //   3550: aload_1
    //   3551: iload #5
    //   3553: iload #6
    //   3555: iload #7
    //   3557: iload #9
    //   3559: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3562: ifeq -> 3682
    //   3565: aload #16
    //   3567: aload_1
    //   3568: lload #14
    //   3570: invokevirtual getLong : (Ljava/lang/Object;J)J
    //   3573: lstore #14
    //   3575: iload #11
    //   3577: iconst_3
    //   3578: ishl
    //   3579: invokestatic p : (I)I
    //   3582: istore_2
    //   3583: lload #14
    //   3585: invokestatic q : (J)I
    //   3588: istore_3
    //   3589: goto -> 2996
    //   3592: iload #8
    //   3594: istore_2
    //   3595: aload_0
    //   3596: aload_1
    //   3597: iload #5
    //   3599: iload #6
    //   3601: iload #7
    //   3603: iload #9
    //   3605: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3608: ifeq -> 3682
    //   3611: aload #16
    //   3613: aload_1
    //   3614: lload #14
    //   3616: invokevirtual getLong : (Ljava/lang/Object;J)J
    //   3619: lstore #14
    //   3621: iload #11
    //   3623: iconst_3
    //   3624: ishl
    //   3625: invokestatic p : (I)I
    //   3628: istore_2
    //   3629: lload #14
    //   3631: invokestatic q : (J)I
    //   3634: istore_3
    //   3635: goto -> 2996
    //   3638: iload #8
    //   3640: istore_2
    //   3641: aload_0
    //   3642: aload_1
    //   3643: iload #5
    //   3645: iload #6
    //   3647: iload #7
    //   3649: iload #9
    //   3651: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3654: ifeq -> 3682
    //   3657: goto -> 3112
    //   3660: iload #8
    //   3662: istore_2
    //   3663: aload_0
    //   3664: aload_1
    //   3665: iload #5
    //   3667: iload #6
    //   3669: iload #7
    //   3671: iload #9
    //   3673: invokevirtual w : (Ljava/lang/Object;IIII)Z
    //   3676: ifeq -> 3682
    //   3679: goto -> 3078
    //   3682: iinc #5, 3
    //   3685: iload #6
    //   3687: istore_3
    //   3688: iload #7
    //   3690: istore #4
    //   3692: iload_2
    //   3693: istore #8
    //   3695: goto -> 21
    //   3698: aload_1
    //   3699: checkcast pv2
    //   3702: getfield zzc : Lkc2;
    //   3705: astore_1
    //   3706: aload_1
    //   3707: getfield c : I
    //   3710: istore_2
    //   3711: iload_2
    //   3712: iconst_m1
    //   3713: if_icmpne -> 3727
    //   3716: aload_1
    //   3717: iconst_0
    //   3718: putfield c : I
    //   3721: iload #10
    //   3723: istore_2
    //   3724: goto -> 3727
    //   3727: iload_2
    //   3728: iload #8
    //   3730: iadd
    //   3731: ireturn
  }
  
  public final boolean e(Object paramObject) {
    int i = 0;
    byte b = 0;
    int j = 1048575;
    while (b < this.e) {
      int n = this.d[b];
      int[] arrayOfInt = this.a;
      int m = arrayOfInt[n];
      int i1 = q(n);
      int i2 = arrayOfInt[n + 2];
      int k = i2 & 0xFFFFF;
      i2 = 1 << i2 >>> 20;
      if (k != j) {
        if (k != 1048575) {
          long l = k;
          i = h.getInt(paramObject, l);
        } 
        j = k;
      } 
      if ((0x10000000 & i1) != 0 && !w(paramObject, n, j, i, i2))
        continue; 
      k = r(i1);
      if (k != 9 && k != 17) {
        if (k != 27)
          if (k != 60 && k != 68) {
            if (k != 49) {
              if (k == 50) {
                pc2.j((i1 & 0xFFFFF), paramObject).getClass();
                tp.b();
                return false;
              } 
              continue;
            } 
          } else {
            if (k(m, n, paramObject) && !p(n).e(pc2.j((i1 & 0xFFFFF), paramObject)))
              continue; 
            continue;
          }  
        List list = (List)pc2.j((i1 & 0xFFFFF), paramObject);
        if (!list.isEmpty()) {
          jw2 jw21 = p(n);
          for (k = 0; k < list.size(); k++) {
            if (!jw21.e(list.get(k)))
              return false; 
          } 
        } 
        continue;
      } 
      if (w(paramObject, n, j, i, i2) && !p(n).e(pc2.j((i1 & 0xFFFFF), paramObject)))
        continue; 
      continue;
      b++;
    } 
    return true;
  }
  
  public final void f(Object paramObject, a42 parama42) {
    jv2 jv2 = (jv2)parama42.c;
    Unsafe unsafe = h;
    int i = 1048575;
    byte b = 0;
    int j = 0;
    while (true) {
      int[] arrayOfInt = this.a;
      if (b < arrayOfInt.length) {
        int k;
        Object object1;
        Object object2;
        List<av2> list;
        zb0 zb01;
        zb0 zb02;
        jw2 jw21;
        int i1 = q(b);
        int n = r(i1);
        int m = arrayOfInt[b];
        if (n <= 17) {
          int i3 = arrayOfInt[b + 2];
          int i2 = i3 & 0xFFFFF;
          k = i;
          if (i2 != i) {
            if (i2 == 1048575) {
              j = 0;
            } else {
              j = unsafe.getInt(paramObject, i2);
            } 
            k = i2;
          } 
          i2 = 1 << i3 >>> 20;
          i = k;
          k = i2;
        } else {
          k = 0;
        } 
        long l = (i1 & 0xFFFFF);
        switch (n) {
          case 68:
            if (k(m, b, paramObject)) {
              Object object = unsafe.getObject(paramObject, l);
              jw2 jw22 = p(b);
              object = object;
              jv2.c(m, 3);
              jw22.f(object, parama42);
              jv2.c(m, 4);
            } 
            break;
          case 67:
            if (k(m, b, paramObject)) {
              l = u(l, paramObject);
              jv2.g(m, l >> 63L ^ l + l);
            } 
            break;
          case 66:
            if (k(m, b, paramObject)) {
              k = t(l, paramObject);
              jv2.e(m, k >> 31 ^ k + k);
            } 
            break;
          case 65:
            if (k(m, b, paramObject))
              jv2.h(m, u(l, paramObject)); 
            break;
          case 64:
            if (k(m, b, paramObject))
              jv2.f(m, t(l, paramObject)); 
            break;
          case 63:
            if (k(m, b, paramObject))
              jv2.d(m, t(l, paramObject)); 
            break;
          case 62:
            if (k(m, b, paramObject))
              jv2.e(m, t(l, paramObject)); 
            break;
          case 61:
            if (k(m, b, paramObject)) {
              hv2 hv2 = (hv2)unsafe.getObject(paramObject, l);
              jv2.k(m << 3 | 0x2);
              jv2.k(hv2.e());
              hv2.g(jv2);
            } 
            break;
          case 60:
            if (k(m, b, paramObject))
              parama42.x(m, unsafe.getObject(paramObject, l), p(b)); 
            break;
          case 59:
            if (k(m, b, paramObject)) {
              object2 = unsafe.getObject(paramObject, l);
              if (object2 instanceof String) {
                jv2.i((String)object2, m);
                break;
              } 
              object2 = object2;
              jv2.k(m << 3 | 0x2);
              jv2.k(object2.e());
              object2.g(jv2);
            } 
            break;
          case 58:
            if (k(m, b, paramObject)) {
              boolean bool = ((Boolean)pc2.j(l, paramObject)).booleanValue();
              jv2.k(m << 3);
              k = jv2.d;
              try {
                object2 = jv2.b;
                object2[k] = bool;
                jv2.d = k + 1;
              } catch (IndexOutOfBoundsException null) {
                i = jv2.c;
                throw new mk2(k, i, 1, indexOutOfBoundsException, 1);
              } 
            } 
            break;
          case 57:
            if (k(m, b, indexOutOfBoundsException))
              jv2.f(m, t(l, indexOutOfBoundsException)); 
            break;
          case 56:
            if (k(m, b, indexOutOfBoundsException))
              jv2.h(m, u(l, indexOutOfBoundsException)); 
            break;
          case 55:
            if (k(m, b, indexOutOfBoundsException))
              jv2.d(m, t(l, indexOutOfBoundsException)); 
            break;
          case 54:
            if (k(m, b, indexOutOfBoundsException))
              jv2.g(m, u(l, indexOutOfBoundsException)); 
            break;
          case 53:
            if (k(m, b, indexOutOfBoundsException))
              jv2.g(m, u(l, indexOutOfBoundsException)); 
            break;
          case 52:
            if (k(m, b, indexOutOfBoundsException))
              jv2.f(m, Float.floatToRawIntBits(((Float)pc2.j(l, indexOutOfBoundsException)).floatValue())); 
            break;
          case 51:
            if (k(m, b, indexOutOfBoundsException))
              jv2.h(m, Double.doubleToRawLongBits(((Double)pc2.j(l, indexOutOfBoundsException)).doubleValue())); 
            break;
          case 50:
            if (unsafe.getObject(indexOutOfBoundsException, l) == null)
              break; 
            i = b / 3;
            throw x41.f(this.b[i + i]);
          case 49:
            object1 = object2[b];
            list = (List)unsafe.getObject(indexOutOfBoundsException, l);
            object2 = p(b);
            zb02 = kw2.a;
            if (list != null && !list.isEmpty())
              for (k = 0; k < list.size(); k++) {
                av2 av21 = list.get(k);
                jv2.c(object1, 3);
                object2.f(av21, parama42);
                jv2.c(object1, 4);
              }  
            break;
          case 48:
            kw2.g(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 47:
            kw2.l(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 46:
            kw2.i(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 45:
            kw2.n(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 44:
            kw2.o(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 43:
            kw2.k(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 42:
            kw2.p(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 41:
            kw2.m(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 40:
            kw2.h(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 39:
            kw2.j(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 38:
            kw2.f(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 37:
            kw2.e(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 36:
            kw2.d(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 35:
            kw2.c(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            break;
          case 34:
            kw2.g(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 33:
            kw2.l(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 32:
            kw2.i(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 31:
            kw2.n(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 30:
            kw2.o(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 29:
            kw2.k(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 28:
            object1 = object2[b];
            object2 = unsafe.getObject(indexOutOfBoundsException, l);
            zb01 = kw2.a;
            if (object2 != null && !object2.isEmpty())
              for (k = 0; k < object2.size(); k++) {
                hv2 hv2 = object2.get(k);
                jv2.k(object1 << 3 | 0x2);
                jv2.k(hv2.e());
                hv2.g(jv2);
              }  
            break;
          case 27:
            object1 = object2[b];
            object2 = unsafe.getObject(indexOutOfBoundsException, l);
            jw21 = p(b);
            zb01 = kw2.a;
            if (object2 != null && !object2.isEmpty())
              for (k = 0; k < object2.size(); k++)
                parama42.x(object1, object2.get(k), jw21);  
            break;
          case 26:
            object1 = object2[b];
            object2 = unsafe.getObject(indexOutOfBoundsException, l);
            zb01 = kw2.a;
            if (object2 != null && !object2.isEmpty())
              for (k = 0; k < object2.size(); k++)
                jv2.i(object2.get(k), object1);  
            break;
          case 25:
            kw2.p(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 24:
            kw2.m(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 23:
            kw2.h(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 22:
            kw2.j(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 21:
            kw2.f(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 20:
            kw2.e(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 19:
            kw2.d(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 18:
            kw2.c(object2[b], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            break;
          case 17:
            if (w(indexOutOfBoundsException, b, i, j, k)) {
              Object object = unsafe.getObject(indexOutOfBoundsException, l);
              object2 = p(b);
              object = object;
              jv2.c(m, 3);
              object2.f(object, parama42);
              jv2.c(m, 4);
            } 
            break;
          case 16:
            if (w(indexOutOfBoundsException, b, i, j, k)) {
              l = unsafe.getLong(indexOutOfBoundsException, l);
              jv2.g(m, l >> 63L ^ l + l);
            } 
            break;
          case 15:
            if (w(indexOutOfBoundsException, b, i, j, k)) {
              k = unsafe.getInt(indexOutOfBoundsException, l);
              jv2.e(m, k >> 31 ^ k + k);
            } 
            break;
          case 14:
            if (w(indexOutOfBoundsException, b, i, j, k))
              jv2.h(m, unsafe.getLong(indexOutOfBoundsException, l)); 
            break;
          case 13:
            if (w(indexOutOfBoundsException, b, i, j, k))
              jv2.f(m, unsafe.getInt(indexOutOfBoundsException, l)); 
            break;
          case 12:
            if (w(indexOutOfBoundsException, b, i, j, k))
              jv2.d(m, unsafe.getInt(indexOutOfBoundsException, l)); 
            break;
          case 11:
            if (w(indexOutOfBoundsException, b, i, j, k))
              jv2.e(m, unsafe.getInt(indexOutOfBoundsException, l)); 
            break;
          case 10:
            if (w(indexOutOfBoundsException, b, i, j, k)) {
              object2 = unsafe.getObject(indexOutOfBoundsException, l);
              jv2.k(m << 3 | 0x2);
              jv2.k(object2.e());
              object2.g(jv2);
            } 
            break;
          case 9:
            if (w(indexOutOfBoundsException, b, i, j, k))
              parama42.x(m, unsafe.getObject(indexOutOfBoundsException, l), p(b)); 
            break;
          case 8:
            if (w(indexOutOfBoundsException, b, i, j, k)) {
              object2 = unsafe.getObject(indexOutOfBoundsException, l);
              if (object2 instanceof String) {
                jv2.i((String)object2, m);
                break;
              } 
              object2 = object2;
              jv2.k(m << 3 | 0x2);
              jv2.k(object2.e());
              object2.g(jv2);
            } 
            break;
          case 7:
            if (w(indexOutOfBoundsException, b, i, j, k)) {
              boolean bool = pc2.c.d(l, indexOutOfBoundsException);
              jv2.k(m << 3);
              k = jv2.d;
              try {
                object2 = jv2.b;
                object2[k] = bool;
                jv2.d = k + 1;
              } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                i = jv2.c;
                throw new mk2(k, i, 1, indexOutOfBoundsException, 1);
              } 
            } 
            break;
          case 6:
            if (w(indexOutOfBoundsException, b, i, j, k))
              jv2.f(m, unsafe.getInt(indexOutOfBoundsException, l)); 
            break;
          case 5:
            if (w(indexOutOfBoundsException, b, i, j, k))
              jv2.h(m, unsafe.getLong(indexOutOfBoundsException, l)); 
            break;
          case 4:
            if (w(indexOutOfBoundsException, b, i, j, k))
              jv2.d(m, unsafe.getInt(indexOutOfBoundsException, l)); 
            break;
          case 3:
            if (w(indexOutOfBoundsException, b, i, j, k))
              jv2.g(m, unsafe.getLong(indexOutOfBoundsException, l)); 
            break;
          case 2:
            if (w(indexOutOfBoundsException, b, i, j, k))
              jv2.g(m, unsafe.getLong(indexOutOfBoundsException, l)); 
            break;
          case 1:
            if (w(indexOutOfBoundsException, b, i, j, k))
              jv2.f(m, Float.floatToRawIntBits(pc2.c.f(l, indexOutOfBoundsException))); 
            break;
          case 0:
            if (w(indexOutOfBoundsException, b, i, j, k))
              jv2.h(m, Double.doubleToRawLongBits(pc2.c.j(l, indexOutOfBoundsException))); 
            break;
        } 
        b += 3;
        continue;
      } 
      kc2 kc2 = ((pv2)indexOutOfBoundsException).zzc;
      return;
    } 
  }
  
  public final boolean g(pv2 parampv21, pv2 parampv22) {
    byte b = 0;
    while (true) {
      int[] arrayOfInt = this.a;
      if (b < arrayOfInt.length) {
        boolean bool;
        long l2;
        int i = q(b);
        int j = r(i);
        long l1 = (i & 0xFFFFF);
        switch (j) {
          case 51:
          case 52:
          case 53:
          case 54:
          case 55:
          case 56:
          case 57:
          case 58:
          case 59:
          case 60:
          case 61:
          case 62:
          case 63:
          case 64:
          case 65:
          case 66:
          case 67:
          case 68:
            l2 = (arrayOfInt[b + 2] & 0xFFFFF);
            if (pc2.f(l2, parampv21) != pc2.f(l2, parampv22) || !kw2.a(pc2.j(l1, parampv21), pc2.j(l1, parampv22)))
              break; 
            break;
          case 50:
            bool = kw2.a(pc2.j(l1, parampv21), pc2.j(l1, parampv22));
            if (!bool)
              break; 
            break;
          case 18:
          case 19:
          case 20:
          case 21:
          case 22:
          case 23:
          case 24:
          case 25:
          case 26:
          case 27:
          case 28:
          case 29:
          case 30:
          case 31:
          case 32:
          case 33:
          case 34:
          case 35:
          case 36:
          case 37:
          case 38:
          case 39:
          case 40:
          case 41:
          case 42:
          case 43:
          case 44:
          case 45:
          case 46:
          case 47:
          case 48:
          case 49:
            bool = kw2.a(pc2.j(l1, parampv21), pc2.j(l1, parampv22));
            if (!bool)
              break; 
            break;
          case 17:
            if (v(parampv21, parampv22, b) && kw2.a(pc2.j(l1, parampv21), pc2.j(l1, parampv22)))
              break; 
            break;
          case 16:
            if (v(parampv21, parampv22, b) && pc2.h(l1, parampv21) == pc2.h(l1, parampv22))
              break; 
            break;
          case 15:
            if (v(parampv21, parampv22, b) && pc2.f(l1, parampv21) == pc2.f(l1, parampv22))
              break; 
            break;
          case 14:
            if (v(parampv21, parampv22, b) && pc2.h(l1, parampv21) == pc2.h(l1, parampv22))
              break; 
            break;
          case 13:
            if (v(parampv21, parampv22, b) && pc2.f(l1, parampv21) == pc2.f(l1, parampv22))
              break; 
            break;
          case 12:
            if (v(parampv21, parampv22, b) && pc2.f(l1, parampv21) == pc2.f(l1, parampv22))
              break; 
            break;
          case 11:
            if (v(parampv21, parampv22, b) && pc2.f(l1, parampv21) == pc2.f(l1, parampv22))
              break; 
            break;
          case 10:
            if (v(parampv21, parampv22, b) && kw2.a(pc2.j(l1, parampv21), pc2.j(l1, parampv22)))
              break; 
            break;
          case 9:
            if (v(parampv21, parampv22, b) && kw2.a(pc2.j(l1, parampv21), pc2.j(l1, parampv22)))
              break; 
            break;
          case 8:
            if (v(parampv21, parampv22, b) && kw2.a(pc2.j(l1, parampv21), pc2.j(l1, parampv22)))
              break; 
            break;
          case 7:
            if (v(parampv21, parampv22, b)) {
              oc2 oc2 = pc2.c;
              if (oc2.d(l1, parampv21) == oc2.d(l1, parampv22))
                break; 
            } 
            break;
          case 6:
            if (v(parampv21, parampv22, b) && pc2.f(l1, parampv21) == pc2.f(l1, parampv22))
              break; 
            break;
          case 5:
            if (v(parampv21, parampv22, b) && pc2.h(l1, parampv21) == pc2.h(l1, parampv22))
              break; 
            break;
          case 4:
            if (v(parampv21, parampv22, b) && pc2.f(l1, parampv21) == pc2.f(l1, parampv22))
              break; 
            break;
          case 3:
            if (v(parampv21, parampv22, b) && pc2.h(l1, parampv21) == pc2.h(l1, parampv22))
              break; 
            break;
          case 2:
            if (v(parampv21, parampv22, b) && pc2.h(l1, parampv21) == pc2.h(l1, parampv22))
              break; 
            break;
          case 1:
            if (v(parampv21, parampv22, b)) {
              oc2 oc2 = pc2.c;
              if (Float.floatToIntBits(oc2.f(l1, parampv21)) == Float.floatToIntBits(oc2.f(l1, parampv22)))
                break; 
            } 
            break;
          case 0:
            if (v(parampv21, parampv22, b)) {
              oc2 oc2 = pc2.c;
              if (Double.doubleToLongBits(oc2.j(l1, parampv21)) == Double.doubleToLongBits(oc2.j(l1, parampv22)))
                break; 
            } 
            break;
        } 
        b += 3;
        continue;
      } 
      if (!parampv21.zzc.equals(parampv22.zzc))
        break; 
      return true;
    } 
    return false;
  }
  
  public final void h(Object paramObject) {
    if (s(paramObject)) {
      if (paramObject instanceof pv2) {
        pv2 pv2 = (pv2)paramObject;
        pv2.e();
        pv2.zza = 0;
        pv2.k();
      } 
      byte b = 0;
      while (true) {
        int[] arrayOfInt = this.a;
        if (b < arrayOfInt.length) {
          int i = q(b);
          int j = r(i);
          long l = (0xFFFFF & i);
          if (j != 9) {
            dv2 dv2;
            if (j != 60 && j != 68) {
              switch (j) {
                case 50:
                  if (h.getObject(paramObject, l) == null)
                    break; 
                  tp.b();
                  return;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                  dv2 = (dv2)pc2.j(l, paramObject);
                  if (dv2.b)
                    dv2.b = false; 
                  break;
                case 17:
                  if (i(b, paramObject))
                    p(b).h(h.getObject(paramObject, l)); 
                  break;
              } 
            } else if (k(dv2[b], b, paramObject)) {
              p(b).h(h.getObject(paramObject, l));
            } 
            b += 3;
            continue;
          } 
        } 
        this.f.getClass();
        paramObject = ((pv2)paramObject).zzc;
        if (((kc2)paramObject).d)
          ((kc2)paramObject).d = false; 
        break;
      } 
    } 
  }
  
  public final boolean i(int paramInt, Object paramObject) {
    int i = this.a[paramInt + 2];
    long l = (i & 0xFFFFF);
    if (l == 1048575L) {
      paramInt = q(paramInt);
      i = r(paramInt);
      l = (paramInt & 0xFFFFF);
      switch (i) {
        default:
          l0.k();
          return false;
        case 17:
          return (pc2.j(l, paramObject) != null);
        case 16:
          return (pc2.h(l, paramObject) != 0L);
        case 15:
          return (pc2.f(l, paramObject) != 0);
        case 14:
          return (pc2.h(l, paramObject) != 0L);
        case 13:
          return (pc2.f(l, paramObject) != 0);
        case 12:
          return (pc2.f(l, paramObject) != 0);
        case 11:
          return (pc2.f(l, paramObject) != 0);
        case 10:
          return !hv2.c.equals(pc2.j(l, paramObject));
        case 9:
          return (pc2.j(l, paramObject) != null);
        case 8:
          paramObject = pc2.j(l, paramObject);
          if (paramObject instanceof String) {
            if (!((String)paramObject).isEmpty())
              return true; 
          } else if (paramObject instanceof hv2) {
            if (!hv2.c.equals(paramObject))
              return true; 
          } else {
            l0.k();
            return false;
          } 
          return false;
        case 7:
          return pc2.c.d(l, paramObject);
        case 6:
          return (pc2.f(l, paramObject) != 0);
        case 5:
          return (pc2.h(l, paramObject) != 0L);
        case 4:
          return (pc2.f(l, paramObject) != 0);
        case 3:
          return (pc2.h(l, paramObject) != 0L);
        case 2:
          return (pc2.h(l, paramObject) != 0L);
        case 1:
          return (Float.floatToRawIntBits(pc2.c.f(l, paramObject)) != 0);
        case 0:
          break;
      } 
      if (Double.doubleToRawLongBits(pc2.c.j(l, paramObject)) != 0L)
        return true; 
    } else if ((1 << i >>> 20 & pc2.f(l, paramObject)) != 0) {
      return true;
    } 
    return false;
  }
  
  public final void j(int paramInt, Object paramObject) {
    paramInt = this.a[paramInt + 2];
    long l = (0xFFFFF & paramInt);
    if (l == 1048575L)
      return; 
    pc2.g(paramObject, l, 1 << paramInt >>> 20 | pc2.f(l, paramObject));
  }
  
  public final boolean k(int paramInt1, int paramInt2, Object paramObject) {
    return (pc2.f((this.a[paramInt2 + 2] & 0xFFFFF), paramObject) == paramInt1);
  }
  
  public final void n(int paramInt, Object paramObject1, Object paramObject2) {
    if (!i(paramInt, paramObject2))
      return; 
    int i = q(paramInt);
    Unsafe unsafe = h;
    long l = (i & 0xFFFFF);
    Object object = unsafe.getObject(paramObject2, l);
    if (object != null) {
      jw2 jw21 = p(paramInt);
      if (!i(paramInt, paramObject1)) {
        if (!s(object)) {
          unsafe.putObject(paramObject1, l, object);
        } else {
          paramObject2 = jw21.a();
          jw21.c(paramObject2, object);
          unsafe.putObject(paramObject1, l, paramObject2);
        } 
        j(paramInt, paramObject1);
        return;
      } 
      Object object1 = unsafe.getObject(paramObject1, l);
      paramObject2 = object1;
      if (!s(object1)) {
        paramObject2 = jw21.a();
        jw21.c(paramObject2, object1);
        unsafe.putObject(paramObject1, l, paramObject2);
      } 
      jw21.c(paramObject2, object);
      return;
    } 
    paramInt = this.a[paramInt];
    paramObject1 = paramObject2.toString();
    paramObject2 = new StringBuilder(String.valueOf(paramInt).length() + 38 + paramObject1.length());
    paramObject2.append("Source subfield ");
    paramObject2.append(paramInt);
    paramObject2.append(" is present but null: ");
    paramObject2.append((String)paramObject1);
    throw new IllegalStateException(paramObject2.toString());
  }
  
  public final void o(int paramInt, Object paramObject1, Object paramObject2) {
    Object object2 = this.a;
    int i = object2[paramInt];
    if (!k(i, paramInt, paramObject2))
      return; 
    int j = q(paramInt);
    Unsafe unsafe = h;
    long l = (j & 0xFFFFF);
    Object object3 = unsafe.getObject(paramObject2, l);
    if (object3 != null) {
      jw2 jw21 = p(paramInt);
      if (!k(i, paramInt, paramObject1)) {
        if (!s(object3)) {
          unsafe.putObject(paramObject1, l, object3);
        } else {
          paramObject2 = jw21.a();
          jw21.c(paramObject2, object3);
          unsafe.putObject(paramObject1, l, paramObject2);
        } 
        pc2.g(paramObject1, (object2[paramInt + 2] & 0xFFFFF), i);
        return;
      } 
      object2 = unsafe.getObject(paramObject1, l);
      paramObject2 = object2;
      if (!s(object2)) {
        paramObject2 = jw21.a();
        jw21.c(paramObject2, object2);
        unsafe.putObject(paramObject1, l, paramObject2);
      } 
      jw21.c(paramObject2, object3);
      return;
    } 
    Object object1 = object2[paramInt];
    paramObject1 = paramObject2.toString();
    paramObject2 = new StringBuilder(String.valueOf(object1).length() + 38 + paramObject1.length());
    paramObject2.append("Source subfield ");
    paramObject2.append(object1);
    paramObject2.append(" is present but null: ");
    paramObject2.append((String)paramObject1);
    throw new IllegalStateException(paramObject2.toString());
  }
  
  public final jw2 p(int paramInt) {
    paramInt /= 3;
    paramInt += paramInt;
    Object[] arrayOfObject = this.b;
    jw2 jw21 = (jw2)arrayOfObject[paramInt];
    if (jw21 != null)
      return jw21; 
    jw21 = gw2.c.a((Class)arrayOfObject[paramInt + 1]);
    arrayOfObject[paramInt] = jw21;
    return jw21;
  }
  
  public final int q(int paramInt) {
    return this.a[paramInt + 1];
  }
  
  public final boolean v(pv2 parampv21, pv2 parampv22, int paramInt) {
    return (i(paramInt, parampv21) == i(paramInt, parampv22));
  }
  
  public final boolean w(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt2 == 1048575) ? i(paramInt1, paramObject) : (((paramInt3 & paramInt4) != 0));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dw2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */