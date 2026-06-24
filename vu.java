import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class vu implements ti0, ri0 {
  public final int b;
  
  public vu(int paramInt) {
    this.b = paramInt;
  }
  
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    String str;
    AtomicReference<Map> atomicReference = ev.a;
    Map<Object, Object> map2 = atomicReference.get();
    Map<Object, Object> map1 = map2;
    if (map2 == null) {
      map1 = new LinkedHashMap<Object, Object>();
      a02 a02 = hv.c;
      map1.put("UT", a02);
      map1.put("UTC", a02);
      map1.put("GMT", a02);
      ev.b((LinkedHashMap)map1, "EST", "America/New_York");
      ev.b((LinkedHashMap)map1, "EDT", "America/New_York");
      ev.b((LinkedHashMap)map1, "CST", "America/Chicago");
      ev.b((LinkedHashMap)map1, "CDT", "America/Chicago");
      ev.b((LinkedHashMap)map1, "MST", "America/Denver");
      ev.b((LinkedHashMap)map1, "MDT", "America/Denver");
      ev.b((LinkedHashMap)map1, "PST", "America/Los_Angeles");
      ev.b((LinkedHashMap)map1, "PDT", "America/Los_Angeles");
      map1 = Collections.unmodifiableMap(map1);
      while (!atomicReference.compareAndSet(null, map1)) {
        if (atomicReference.get() != null) {
          map1 = atomicReference.get();
          break;
        } 
      } 
    } 
    Iterator<String> iterator = map1.keySet().iterator();
    map2 = null;
    while (iterator.hasNext()) {
      String str1 = iterator.next();
      if (zu.o(str1, paramCharSequence, paramInt) && (map2 == null || str1.length() > map2.length()))
        str = str1; 
    } 
    if (str != null) {
      hv hv = (hv)map1.get(str);
      paramcv.i = null;
      paramcv.d = hv;
      return str.length() + paramInt;
    } 
    return paramInt ^ 0xFFFFFFFF;
  }
  
  public final int b() {
    return (this.b == 1) ? 4 : 20;
  }
  
  public final void c(StringBuilder paramStringBuilder, uo0 paramuo0, Locale paramLocale) {}
  
  public final int d() {
    return (this.b == 1) ? 4 : 20;
  }
  
  public final void e(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1, int paramInt, hv paramhv, Locale paramLocale) {
    // Byte code:
    //   0: lload_2
    //   1: iload #5
    //   3: i2l
    //   4: lsub
    //   5: lstore_2
    //   6: ldc ''
    //   8: astore #4
    //   10: aload #6
    //   12: ifnonnull -> 18
    //   15: goto -> 365
    //   18: aload #6
    //   20: getfield b : Ljava/lang/String;
    //   23: astore #10
    //   25: iconst_0
    //   26: istore #9
    //   28: aconst_null
    //   29: astore #11
    //   31: aconst_null
    //   32: astore #12
    //   34: iconst_1
    //   35: istore #8
    //   37: aload_0
    //   38: getfield b : I
    //   41: istore #5
    //   43: iload #5
    //   45: ifeq -> 214
    //   48: iload #5
    //   50: iconst_1
    //   51: if_icmpeq -> 57
    //   54: goto -> 365
    //   57: aload #7
    //   59: astore #4
    //   61: aload #7
    //   63: ifnonnull -> 71
    //   66: invokestatic getDefault : ()Ljava/util/Locale;
    //   69: astore #4
    //   71: aload #6
    //   73: lload_2
    //   74: invokevirtual f : (J)Ljava/lang/String;
    //   77: astore #7
    //   79: aload #7
    //   81: ifnonnull -> 91
    //   84: aload #10
    //   86: astore #4
    //   88: goto -> 365
    //   91: invokestatic g : ()Lsw;
    //   94: astore #11
    //   96: aload #11
    //   98: ifnull -> 158
    //   101: aload #6
    //   103: lload_2
    //   104: invokevirtual h : (J)I
    //   107: aload #6
    //   109: lload_2
    //   110: invokevirtual k : (J)I
    //   113: if_icmpne -> 119
    //   116: goto -> 122
    //   119: iconst_0
    //   120: istore #8
    //   122: aload #11
    //   124: aload #4
    //   126: aload #10
    //   128: aload #7
    //   130: iload #8
    //   132: invokevirtual c : (Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;
    //   135: astore #4
    //   137: aload #4
    //   139: ifnonnull -> 149
    //   142: aload #12
    //   144: astore #4
    //   146: goto -> 155
    //   149: aload #4
    //   151: iconst_0
    //   152: aaload
    //   153: astore #4
    //   155: goto -> 192
    //   158: aload #11
    //   160: aload #4
    //   162: aload #10
    //   164: aload #7
    //   166: invokevirtual b : (Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    //   169: astore #4
    //   171: aload #4
    //   173: ifnonnull -> 183
    //   176: aload #12
    //   178: astore #4
    //   180: goto -> 155
    //   183: aload #4
    //   185: iconst_0
    //   186: aaload
    //   187: astore #4
    //   189: goto -> 155
    //   192: aload #4
    //   194: ifnull -> 200
    //   197: goto -> 365
    //   200: aload #6
    //   202: lload_2
    //   203: invokevirtual h : (J)I
    //   206: invokestatic p : (I)Ljava/lang/String;
    //   209: astore #4
    //   211: goto -> 365
    //   214: aload #7
    //   216: astore #4
    //   218: aload #7
    //   220: ifnonnull -> 228
    //   223: invokestatic getDefault : ()Ljava/util/Locale;
    //   226: astore #4
    //   228: aload #6
    //   230: lload_2
    //   231: invokevirtual f : (J)Ljava/lang/String;
    //   234: astore #12
    //   236: aload #12
    //   238: ifnonnull -> 244
    //   241: goto -> 84
    //   244: invokestatic g : ()Lsw;
    //   247: astore #7
    //   249: aload #7
    //   251: ifnull -> 312
    //   254: iload #9
    //   256: istore #8
    //   258: aload #6
    //   260: lload_2
    //   261: invokevirtual h : (J)I
    //   264: aload #6
    //   266: lload_2
    //   267: invokevirtual k : (J)I
    //   270: if_icmpne -> 276
    //   273: iconst_1
    //   274: istore #8
    //   276: aload #7
    //   278: aload #4
    //   280: aload #10
    //   282: aload #12
    //   284: iload #8
    //   286: invokevirtual c : (Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;
    //   289: astore #4
    //   291: aload #4
    //   293: ifnonnull -> 303
    //   296: aload #11
    //   298: astore #4
    //   300: goto -> 309
    //   303: aload #4
    //   305: iconst_1
    //   306: aaload
    //   307: astore #4
    //   309: goto -> 346
    //   312: aload #7
    //   314: aload #4
    //   316: aload #10
    //   318: aload #12
    //   320: invokevirtual b : (Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    //   323: astore #4
    //   325: aload #4
    //   327: ifnonnull -> 337
    //   330: aload #11
    //   332: astore #4
    //   334: goto -> 309
    //   337: aload #4
    //   339: iconst_1
    //   340: aaload
    //   341: astore #4
    //   343: goto -> 309
    //   346: aload #4
    //   348: ifnull -> 354
    //   351: goto -> 365
    //   354: aload #6
    //   356: lload_2
    //   357: invokevirtual h : (J)I
    //   360: invokestatic p : (I)Ljava/lang/String;
    //   363: astore #4
    //   365: aload_1
    //   366: aload #4
    //   368: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    //   371: pop
    //   372: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */