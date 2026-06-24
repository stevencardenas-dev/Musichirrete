package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.c;
import j$.time.chrono.e;
import j$.time.chrono.t;
import j$.time.j;
import j$.time.temporal.a;
import j$.time.temporal.o;
import j$.time.temporal.p;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class f implements Serializable {
  public static final long[] i = new long[0];
  
  public static final e[] j = new e[0];
  
  public static final LocalDateTime[] k = new LocalDateTime[0];
  
  public static final b[] l = new b[0];
  
  private static final long serialVersionUID = 3044319355680032515L;
  
  public final long[] a;
  
  public final ZoneOffset[] b;
  
  public final long[] c;
  
  public final LocalDateTime[] d;
  
  public final ZoneOffset[] e;
  
  public final e[] f;
  
  public final TimeZone g;
  
  public final transient ConcurrentMap h = new ConcurrentHashMap<Object, Object>();
  
  public f(ZoneOffset paramZoneOffset) {
    ZoneOffset[] arrayOfZoneOffset = new ZoneOffset[1];
    this.b = arrayOfZoneOffset;
    arrayOfZoneOffset[0] = paramZoneOffset;
    long[] arrayOfLong = i;
    this.a = arrayOfLong;
    this.c = arrayOfLong;
    this.d = k;
    this.e = arrayOfZoneOffset;
    this.f = j;
    this.g = null;
  }
  
  public f(TimeZone paramTimeZone) {
    ZoneOffset[] arrayOfZoneOffset = new ZoneOffset[1];
    this.b = arrayOfZoneOffset;
    arrayOfZoneOffset[0] = g(paramTimeZone.getRawOffset());
    long[] arrayOfLong = i;
    this.a = arrayOfLong;
    this.c = arrayOfLong;
    this.d = k;
    this.e = arrayOfZoneOffset;
    this.f = j;
    this.g = paramTimeZone;
  }
  
  public f(long[] paramArrayOflong1, ZoneOffset[] paramArrayOfZoneOffset1, long[] paramArrayOflong2, ZoneOffset[] paramArrayOfZoneOffset2, e[] paramArrayOfe) {
    this.a = paramArrayOflong1;
    this.b = paramArrayOfZoneOffset1;
    this.c = paramArrayOflong2;
    this.e = paramArrayOfZoneOffset2;
    this.f = paramArrayOfe;
    if (paramArrayOflong2.length == 0) {
      this.d = k;
    } else {
      ArrayList<LocalDateTime> arrayList = new ArrayList();
      int i;
      for (i = 0; i < paramArrayOflong2.length; i = j) {
        ZoneOffset zoneOffset2 = paramArrayOfZoneOffset2[i];
        int j = i + 1;
        ZoneOffset zoneOffset1 = paramArrayOfZoneOffset2[j];
        b b1 = new b(paramArrayOflong2[i], zoneOffset2, zoneOffset1);
        boolean bool = b1.r();
        LocalDateTime localDateTime = b1.b;
        if (bool) {
          arrayList.add(localDateTime);
          arrayList.add(b1.b.I((b1.d.getTotalSeconds() - b1.c.getTotalSeconds())));
        } else {
          arrayList.add(localDateTime.I((b1.d.getTotalSeconds() - b1.c.getTotalSeconds())));
          arrayList.add(b1.b);
        } 
      } 
      this.d = arrayList.<LocalDateTime>toArray(new LocalDateTime[arrayList.size()]);
    } 
    this.g = null;
  }
  
  public static Object a(LocalDateTime paramLocalDateTime, b paramb) {
    LocalDateTime localDateTime = paramb.b;
    if (paramb.r()) {
      if (paramLocalDateTime.z((e)localDateTime))
        return paramb.c; 
      if (!paramLocalDateTime.z((e)paramb.b.I((paramb.d.getTotalSeconds() - paramb.c.getTotalSeconds()))))
        return paramb.d; 
    } else {
      if (!paramLocalDateTime.z((e)localDateTime))
        return paramb.d; 
      if (paramLocalDateTime.z((e)paramb.b.I((paramb.d.getTotalSeconds() - paramb.c.getTotalSeconds()))))
        return paramb.c; 
    } 
    return paramb;
  }
  
  public static int c(long paramLong, ZoneOffset paramZoneOffset) {
    return LocalDate.L(Math.floorDiv(paramLong + paramZoneOffset.getTotalSeconds(), 86400L)).getYear();
  }
  
  public static ZoneOffset g(int paramInt) {
    return ZoneOffset.ofTotalSeconds(paramInt / 1000);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Deserialization via serialization delegate");
  }
  
  private Object writeReplace() {
    boolean bool;
    if (this.g != null) {
      bool = true;
    } else {
      bool = true;
    } 
    return new a(bool, this);
  }
  
  public final b[] b(int paramInt) {
    b[] arrayOfB1 = l;
    Integer integer = Integer.valueOf(paramInt);
    b[] arrayOfB2 = (b[])((ConcurrentHashMap)this.h).get(integer);
    if (arrayOfB2 != null)
      return arrayOfB2; 
    if (this.g != null) {
      if (paramInt < 1800)
        return arrayOfB1; 
      LocalDateTime localDateTime = LocalDateTime.c;
      LocalDate localDate = LocalDate.of(paramInt - 1, 12, 31);
      a.HOUR_OF_DAY.I(0L);
      long l3 = (new LocalDateTime(localDate, LocalTime.h[0])).q(this.b[0]);
      TimeZone timeZone = this.g;
      long l2 = 1000L;
      int i = timeZone.getOffset(l3 * 1000L);
      long l1 = l3;
      while (true) {
        long l = l1;
        if (l < 31968000L + l3) {
          l1 = l + 7776000L;
          if (i != this.g.getOffset(l1 * l2)) {
            while (l1 - l > 1L) {
              long l4 = Math.floorDiv(l1 + l, 2L);
              if (this.g.getOffset(l4 * l2) == i) {
                l = l4;
                continue;
              } 
              l1 = l4;
            } 
            if (this.g.getOffset(l * l2) != i)
              l1 = l; 
            ZoneOffset zoneOffset1 = g(i);
            i = this.g.getOffset(l1 * l2);
            ZoneOffset zoneOffset2 = g(i);
            b[] arrayOfB = arrayOfB1;
            if (c(l1, zoneOffset2) == paramInt) {
              arrayOfB = Arrays.<b>copyOf(arrayOfB1, arrayOfB1.length + 1);
              arrayOfB[arrayOfB.length - 1] = new b(l1, zoneOffset1, zoneOffset2);
            } 
            arrayOfB1 = arrayOfB;
          } 
          continue;
        } 
        if (1916 <= paramInt && paramInt < 2100)
          ((ConcurrentHashMap<Integer, b[]>)this.h).putIfAbsent(integer, arrayOfB1); 
        return arrayOfB1;
      } 
    } 
    e[] arrayOfE = this.f;
    b[] arrayOfB3 = new b[arrayOfE.length];
    for (byte b1 = 0; b1 < arrayOfE.length; b1++) {
      LocalDate localDate;
      e e1 = arrayOfE[b1];
      int i = e1.b;
      j j = e1.a;
      if (i < 0) {
        t t = t.c;
        long l = paramInt;
        t.getClass();
        i = j.t(t.t(l)) + 1 + e1.b;
        LocalDate localDate1 = LocalDate.d;
        a.YEAR.I(l);
        a.DAY_OF_MONTH.I(i);
        localDate1 = LocalDate.t(paramInt, j.getValue(), i);
        c c = e1.c;
        localDate = localDate1;
        if (c != null)
          localDate = localDate1.S((o)new p(c.getValue(), 1)); 
      } else {
        LocalDate localDate1 = LocalDate.d;
        a.YEAR.I(paramInt);
        a.DAY_OF_MONTH.I(i);
        localDate1 = LocalDate.t(paramInt, localDate.getValue(), i);
        c c = e1.c;
        localDate = localDate1;
        if (c != null)
          localDate = localDate1.S((o)new p(c.getValue(), 0)); 
      } 
      if (e1.e)
        localDate = localDate.N(1L); 
      LocalDateTime localDateTime = LocalDateTime.of(localDate, e1.d);
      d d = e1.f;
      ZoneOffset zoneOffset1 = e1.g;
      ZoneOffset zoneOffset2 = e1.h;
      i = c.a[d.ordinal()];
      if (i != 1) {
        if (i == 2)
          localDateTime = localDateTime.I((zoneOffset2.getTotalSeconds() - zoneOffset1.getTotalSeconds())); 
      } else {
        localDateTime = localDateTime.I((zoneOffset2.getTotalSeconds() - ZoneOffset.e.getTotalSeconds()));
      } 
      arrayOfB3[b1] = new b(localDateTime, e1.h, e1.i);
    } 
    if (paramInt < 2100)
      ((ConcurrentHashMap<Integer, b[]>)this.h).putIfAbsent(integer, arrayOfB3); 
    return arrayOfB3;
  }
  
  public final ZoneOffset d(Instant paramInstant) {
    TimeZone timeZone = this.g;
    if (timeZone != null) {
      long l1 = paramInstant.a;
      if (l1 < 0L && paramInstant.b > 0) {
        l1 = Math.addExact(Math.multiplyExact(l1 + 1L, 1000L), (paramInstant.b / 1000000 - 1000));
      } else {
        l1 = Math.addExact(Math.multiplyExact(l1, 1000L), (paramInstant.b / 1000000));
      } 
      return g(timeZone.getOffset(l1));
    } 
    int j = this.c.length;
    int i = 0;
    if (j == 0)
      return this.b[0]; 
    long l = paramInstant.getEpochSecond();
    if (this.f.length > 0) {
      long[] arrayOfLong = this.c;
      if (l > arrayOfLong[arrayOfLong.length - 1]) {
        b b1;
        ZoneOffset[] arrayOfZoneOffset = this.e;
        b[] arrayOfB = b(c(l, arrayOfZoneOffset[arrayOfZoneOffset.length - 1]));
        arrayOfZoneOffset = null;
        while (i < arrayOfB.length) {
          b1 = arrayOfB[i];
          if (l < b1.a)
            return b1.c; 
          i++;
        } 
        return b1.d;
      } 
    } 
    j = Arrays.binarySearch(this.c, l);
    i = j;
    if (j < 0)
      i = -j - 2; 
    return this.e[i + 1];
  }
  
  public final Object e(LocalDateTime paramLocalDateTime) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Ljava/util/TimeZone;
    //   4: astore #7
    //   6: aconst_null
    //   7: astore #5
    //   9: aconst_null
    //   10: astore #6
    //   12: iconst_0
    //   13: istore_3
    //   14: iconst_0
    //   15: istore_2
    //   16: aload #7
    //   18: ifnull -> 130
    //   21: aload_0
    //   22: aload_1
    //   23: getfield a : Lj$/time/LocalDate;
    //   26: invokevirtual getYear : ()I
    //   29: invokevirtual b : (I)[Lj$/time/zone/b;
    //   32: astore #7
    //   34: aload #7
    //   36: arraylength
    //   37: ifne -> 67
    //   40: aload_0
    //   41: getfield g : Ljava/util/TimeZone;
    //   44: aload_1
    //   45: aload_0
    //   46: getfield b : [Lj$/time/ZoneOffset;
    //   49: iconst_0
    //   50: aaload
    //   51: invokeinterface q : (Lj$/time/ZoneOffset;)J
    //   56: ldc2_w 1000
    //   59: lmul
    //   60: invokevirtual getOffset : (J)I
    //   63: invokestatic g : (I)Lj$/time/ZoneOffset;
    //   66: areturn
    //   67: aload #7
    //   69: arraylength
    //   70: istore_3
    //   71: aload #6
    //   73: astore #5
    //   75: iload_2
    //   76: iload_3
    //   77: if_icmpge -> 127
    //   80: aload #7
    //   82: iload_2
    //   83: aaload
    //   84: astore #6
    //   86: aload_1
    //   87: aload #6
    //   89: invokestatic a : (Lj$/time/LocalDateTime;Lj$/time/zone/b;)Ljava/lang/Object;
    //   92: astore #5
    //   94: aload #5
    //   96: instanceof j$/time/zone/b
    //   99: ifne -> 124
    //   102: aload #5
    //   104: aload #6
    //   106: getfield c : Lj$/time/ZoneOffset;
    //   109: invokevirtual equals : (Ljava/lang/Object;)Z
    //   112: ifeq -> 118
    //   115: goto -> 124
    //   118: iinc #2, 1
    //   121: goto -> 75
    //   124: aload #5
    //   126: areturn
    //   127: aload #5
    //   129: areturn
    //   130: aload_0
    //   131: getfield c : [J
    //   134: arraylength
    //   135: ifne -> 145
    //   138: aload_0
    //   139: getfield b : [Lj$/time/ZoneOffset;
    //   142: iconst_0
    //   143: aaload
    //   144: areturn
    //   145: aload_0
    //   146: getfield f : [Lj$/time/zone/e;
    //   149: arraylength
    //   150: ifle -> 329
    //   153: aload_0
    //   154: getfield d : [Lj$/time/LocalDateTime;
    //   157: astore #6
    //   159: aload #6
    //   161: aload #6
    //   163: arraylength
    //   164: iconst_1
    //   165: isub
    //   166: aaload
    //   167: astore #6
    //   169: aload #6
    //   171: ifnull -> 198
    //   174: aload_1
    //   175: invokevirtual getClass : ()Ljava/lang/Class;
    //   178: pop
    //   179: aload_1
    //   180: aload #6
    //   182: invokevirtual r : (Lj$/time/LocalDateTime;)I
    //   185: ifle -> 193
    //   188: iconst_1
    //   189: istore_2
    //   190: goto -> 249
    //   193: iconst_0
    //   194: istore_2
    //   195: goto -> 249
    //   198: aload_1
    //   199: invokevirtual toLocalDate : ()Lj$/time/LocalDate;
    //   202: invokevirtual A : ()J
    //   205: aload #6
    //   207: invokevirtual toLocalDate : ()Lj$/time/LocalDate;
    //   210: invokevirtual A : ()J
    //   213: lcmp
    //   214: istore_2
    //   215: iload_2
    //   216: ifgt -> 188
    //   219: iload_2
    //   220: ifne -> 193
    //   223: aload_1
    //   224: invokeinterface toLocalTime : ()Lj$/time/LocalTime;
    //   229: invokevirtual O : ()J
    //   232: aload #6
    //   234: invokeinterface toLocalTime : ()Lj$/time/LocalTime;
    //   239: invokevirtual O : ()J
    //   242: lcmp
    //   243: ifle -> 193
    //   246: goto -> 188
    //   249: iload_2
    //   250: ifeq -> 329
    //   253: aload_0
    //   254: aload_1
    //   255: getfield a : Lj$/time/LocalDate;
    //   258: invokevirtual getYear : ()I
    //   261: invokevirtual b : (I)[Lj$/time/zone/b;
    //   264: astore #6
    //   266: aload #6
    //   268: arraylength
    //   269: istore #4
    //   271: iload_3
    //   272: istore_2
    //   273: iload_2
    //   274: iload #4
    //   276: if_icmpge -> 326
    //   279: aload #6
    //   281: iload_2
    //   282: aaload
    //   283: astore #7
    //   285: aload_1
    //   286: aload #7
    //   288: invokestatic a : (Lj$/time/LocalDateTime;Lj$/time/zone/b;)Ljava/lang/Object;
    //   291: astore #5
    //   293: aload #5
    //   295: instanceof j$/time/zone/b
    //   298: ifne -> 323
    //   301: aload #5
    //   303: aload #7
    //   305: getfield c : Lj$/time/ZoneOffset;
    //   308: invokevirtual equals : (Ljava/lang/Object;)Z
    //   311: ifeq -> 317
    //   314: goto -> 323
    //   317: iinc #2, 1
    //   320: goto -> 273
    //   323: aload #5
    //   325: areturn
    //   326: aload #5
    //   328: areturn
    //   329: aload_0
    //   330: getfield d : [Lj$/time/LocalDateTime;
    //   333: aload_1
    //   334: invokestatic binarySearch : ([Ljava/lang/Object;Ljava/lang/Object;)I
    //   337: istore #4
    //   339: iload #4
    //   341: iconst_m1
    //   342: if_icmpne -> 352
    //   345: aload_0
    //   346: getfield e : [Lj$/time/ZoneOffset;
    //   349: iconst_0
    //   350: aaload
    //   351: areturn
    //   352: iload #4
    //   354: ifge -> 366
    //   357: iload #4
    //   359: ineg
    //   360: iconst_2
    //   361: isub
    //   362: istore_2
    //   363: goto -> 412
    //   366: aload_0
    //   367: getfield d : [Lj$/time/LocalDateTime;
    //   370: astore #5
    //   372: iload #4
    //   374: istore_2
    //   375: iload #4
    //   377: aload #5
    //   379: arraylength
    //   380: iconst_1
    //   381: isub
    //   382: if_icmpge -> 412
    //   385: aload #5
    //   387: iload #4
    //   389: aaload
    //   390: astore_1
    //   391: iload #4
    //   393: iconst_1
    //   394: iadd
    //   395: istore_3
    //   396: iload #4
    //   398: istore_2
    //   399: aload_1
    //   400: aload #5
    //   402: iload_3
    //   403: aaload
    //   404: invokevirtual equals : (Ljava/lang/Object;)Z
    //   407: ifeq -> 412
    //   410: iload_3
    //   411: istore_2
    //   412: iload_2
    //   413: iconst_1
    //   414: iand
    //   415: ifne -> 501
    //   418: aload_0
    //   419: getfield d : [Lj$/time/LocalDateTime;
    //   422: astore #5
    //   424: aload #5
    //   426: iload_2
    //   427: aaload
    //   428: astore_1
    //   429: aload #5
    //   431: iload_2
    //   432: iconst_1
    //   433: iadd
    //   434: aaload
    //   435: astore #5
    //   437: aload_0
    //   438: getfield e : [Lj$/time/ZoneOffset;
    //   441: astore #7
    //   443: iload_2
    //   444: iconst_2
    //   445: idiv
    //   446: istore_2
    //   447: aload #7
    //   449: iload_2
    //   450: aaload
    //   451: astore #6
    //   453: aload #7
    //   455: iload_2
    //   456: iconst_1
    //   457: iadd
    //   458: aaload
    //   459: astore #7
    //   461: aload #7
    //   463: invokevirtual getTotalSeconds : ()I
    //   466: aload #6
    //   468: invokevirtual getTotalSeconds : ()I
    //   471: if_icmple -> 487
    //   474: new j$/time/zone/b
    //   477: dup
    //   478: aload_1
    //   479: aload #6
    //   481: aload #7
    //   483: invokespecial <init> : (Lj$/time/LocalDateTime;Lj$/time/ZoneOffset;Lj$/time/ZoneOffset;)V
    //   486: areturn
    //   487: new j$/time/zone/b
    //   490: dup
    //   491: aload #5
    //   493: aload #6
    //   495: aload #7
    //   497: invokespecial <init> : (Lj$/time/LocalDateTime;Lj$/time/ZoneOffset;Lj$/time/ZoneOffset;)V
    //   500: areturn
    //   501: aload_0
    //   502: getfield e : [Lj$/time/ZoneOffset;
    //   505: iload_2
    //   506: iconst_2
    //   507: idiv
    //   508: iconst_1
    //   509: iadd
    //   510: aaload
    //   511: areturn
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof f) {
      paramObject = paramObject;
      if (Objects.equals(this.g, ((f)paramObject).g) && Arrays.equals(this.a, ((f)paramObject).a) && Arrays.equals((Object[])this.b, (Object[])((f)paramObject).b) && Arrays.equals(this.c, ((f)paramObject).c) && Arrays.equals((Object[])this.e, (Object[])((f)paramObject).e) && Arrays.equals((Object[])this.f, (Object[])((f)paramObject).f))
        return true; 
    } 
    return false;
  }
  
  public final List f(LocalDateTime paramLocalDateTime) {
    Object object = e(paramLocalDateTime);
    if (object instanceof b) {
      b b2 = (b)object;
      if (b2.r())
        return Collections.EMPTY_LIST; 
      object = b2.c;
      ZoneOffset zoneOffset = b2.d;
      ArrayList<Object> arrayList = new ArrayList(2);
      for (byte b1 = 0; b1 < 2; b1++) {
        (new Object[2])[0] = object;
        (new Object[2])[1] = zoneOffset;
        Object object1 = (new Object[2])[b1];
        Objects.requireNonNull(object1);
        arrayList.add(object1);
      } 
      return Collections.unmodifiableList(arrayList);
    } 
    return Collections.singletonList((ZoneOffset)object);
  }
  
  public final int hashCode() {
    int m = Objects.hashCode(this.g);
    int j = Arrays.hashCode(this.a);
    int k = Arrays.hashCode((Object[])this.b);
    int i = Arrays.hashCode(this.c);
    int n = Arrays.hashCode((Object[])this.e);
    return Arrays.hashCode((Object[])this.f) ^ m ^ j ^ k ^ i ^ n;
  }
  
  public final String toString() {
    TimeZone timeZone = this.g;
    if (timeZone != null) {
      String str = timeZone.getID();
      StringBuilder stringBuilder1 = new StringBuilder("ZoneRules[timeZone=");
      stringBuilder1.append(str);
      stringBuilder1.append("]");
      return stringBuilder1.toString();
    } 
    ZoneOffset[] arrayOfZoneOffset = this.b;
    ZoneOffset zoneOffset = arrayOfZoneOffset[arrayOfZoneOffset.length - 1];
    StringBuilder stringBuilder = new StringBuilder("ZoneRules[currentStandardOffset=");
    stringBuilder.append(zoneOffset);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\zone\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */