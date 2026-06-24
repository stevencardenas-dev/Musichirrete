import androidx.profileinstaller.Vuyf.nBRIsU;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public final class xn1 implements Serializable, Cloneable {
  public final ArrayList b;
  
  public ArrayList c;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public String h;
  
  public boolean i;
  
  public boolean j;
  
  public Long k;
  
  public xn1(int paramInt, String paramString, ArrayList<?> paramArrayList1, ArrayList paramArrayList2) {
    int i;
    this.k = null;
    paramArrayList1 = new ArrayList(paramArrayList1);
    this.b = paramArrayList1;
    if (i()) {
      i = 0;
    } else {
      i = paramInt;
      if (paramArrayList1.size() <= paramInt)
        i = paramArrayList1.size() - 1; 
    } 
    this.c = paramArrayList2;
    this.e = i;
    this.h = paramString;
    this.g = 0;
    q();
  }
  
  public final boolean a(ArrayList<km0> paramArrayList, boolean paramBoolean, int paramInt) {
    km0 km0 = d();
    int i = 0;
    int j = paramInt;
    paramInt = i;
    while (paramInt < paramArrayList.size()) {
      km0 km01 = paramArrayList.get(paramInt);
      i = j;
      if (j < 0) {
        i = j;
        if (km01.equals(km0))
          i = paramInt; 
      } 
      paramInt++;
      j = i;
    } 
    return b(paramArrayList, MusicService.C0, false, paramBoolean, j);
  }
  
  public final boolean b(ArrayList paramArrayList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/util/ArrayList;
    //   4: astore #11
    //   6: aload_0
    //   7: invokevirtual i : ()Z
    //   10: ifeq -> 24
    //   13: aload_0
    //   14: iconst_0
    //   15: putfield e : I
    //   18: iconst_1
    //   19: istore #8
    //   21: goto -> 27
    //   24: iconst_0
    //   25: istore #8
    //   27: iload_3
    //   28: ifne -> 66
    //   31: iload_2
    //   32: ifeq -> 66
    //   35: aload_0
    //   36: iconst_1
    //   37: invokevirtual g : (Z)Ljava/util/ArrayList;
    //   40: astore #9
    //   42: new xn1
    //   45: dup
    //   46: aload_0
    //   47: iconst_1
    //   48: invokevirtual e : (Z)I
    //   51: aload_0
    //   52: getfield h : Ljava/lang/String;
    //   55: aload #9
    //   57: aconst_null
    //   58: invokespecial <init> : (ILjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   61: astore #9
    //   63: goto -> 69
    //   66: aconst_null
    //   67: astore #9
    //   69: aload_0
    //   70: invokevirtual i : ()Z
    //   73: ifne -> 106
    //   76: aload #11
    //   78: aload_0
    //   79: getfield e : I
    //   82: invokevirtual get : (I)Ljava/lang/Object;
    //   85: checkcast km0
    //   88: getfield c : Lqn1;
    //   91: getfield f : Lwo;
    //   94: astore #10
    //   96: goto -> 109
    //   99: astore #10
    //   101: aload #10
    //   103: invokevirtual printStackTrace : ()V
    //   106: aconst_null
    //   107: astore #10
    //   109: new java/util/HashSet
    //   112: dup
    //   113: aload_1
    //   114: invokevirtual size : ()I
    //   117: invokespecial <init> : (I)V
    //   120: astore #13
    //   122: aload_1
    //   123: invokevirtual size : ()I
    //   126: istore #7
    //   128: iconst_0
    //   129: istore #6
    //   131: iload #6
    //   133: iload #7
    //   135: if_icmpge -> 169
    //   138: aload_1
    //   139: iload #6
    //   141: invokevirtual get : (I)Ljava/lang/Object;
    //   144: astore #12
    //   146: iinc #6, 1
    //   149: aload #13
    //   151: aload #12
    //   153: checkcast km0
    //   156: getfield c : Lqn1;
    //   159: getfield f : Lwo;
    //   162: invokevirtual add : (Ljava/lang/Object;)Z
    //   165: pop
    //   166: goto -> 131
    //   169: iconst_0
    //   170: istore #6
    //   172: iload #6
    //   174: aload #11
    //   176: invokevirtual size : ()I
    //   179: if_icmpge -> 223
    //   182: aload #13
    //   184: aload #11
    //   186: iload #6
    //   188: invokevirtual get : (I)Ljava/lang/Object;
    //   191: checkcast km0
    //   194: getfield c : Lqn1;
    //   197: getfield f : Lwo;
    //   200: invokevirtual contains : (Ljava/lang/Object;)Z
    //   203: ifeq -> 217
    //   206: aload #11
    //   208: iload #6
    //   210: getstatic yk1.a : Lkm0;
    //   213: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   216: pop
    //   217: iinc #6, 1
    //   220: goto -> 172
    //   223: aload_0
    //   224: getstatic yk1.a : Lkm0;
    //   227: iconst_0
    //   228: iconst_0
    //   229: invokevirtual k : (Lkm0;ZZ)V
    //   232: aload #11
    //   234: aload_1
    //   235: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   238: pop
    //   239: aload #10
    //   241: ifnull -> 296
    //   244: iconst_0
    //   245: istore #6
    //   247: iload #6
    //   249: aload #11
    //   251: invokevirtual size : ()I
    //   254: if_icmpge -> 302
    //   257: aload #10
    //   259: aload #11
    //   261: iload #6
    //   263: invokevirtual get : (I)Ljava/lang/Object;
    //   266: checkcast km0
    //   269: getfield c : Lqn1;
    //   272: getfield f : Lwo;
    //   275: invokevirtual equals : (Ljava/lang/Object;)Z
    //   278: ifeq -> 290
    //   281: aload_0
    //   282: iload #6
    //   284: putfield e : I
    //   287: goto -> 302
    //   290: iinc #6, 1
    //   293: goto -> 247
    //   296: aload_0
    //   297: iload #5
    //   299: putfield e : I
    //   302: aload #9
    //   304: ifnull -> 462
    //   307: aload #9
    //   309: getfield b : Ljava/util/ArrayList;
    //   312: astore #10
    //   314: iload #4
    //   316: ifeq -> 325
    //   319: iload #5
    //   321: aload_1
    //   322: invokestatic E : (ILjava/util/ArrayList;)V
    //   325: aload #9
    //   327: aload_1
    //   328: iload_2
    //   329: iconst_1
    //   330: iload #4
    //   332: iload #5
    //   334: invokevirtual b : (Ljava/util/ArrayList;ZZZI)Z
    //   337: pop
    //   338: aload #10
    //   340: invokevirtual size : ()I
    //   343: aload #11
    //   345: invokevirtual size : ()I
    //   348: if_icmpne -> 455
    //   351: iconst_0
    //   352: istore #5
    //   354: iload #5
    //   356: aload #11
    //   358: invokevirtual size : ()I
    //   361: if_icmpge -> 388
    //   364: aload #11
    //   366: iload #5
    //   368: invokevirtual get : (I)Ljava/lang/Object;
    //   371: checkcast km0
    //   374: getfield c : Lqn1;
    //   377: iload #5
    //   379: putfield h : I
    //   382: iinc #5, 1
    //   385: goto -> 354
    //   388: aload_0
    //   389: new java/util/ArrayList
    //   392: dup
    //   393: aload #11
    //   395: invokevirtual size : ()I
    //   398: invokespecial <init> : (I)V
    //   401: putfield c : Ljava/util/ArrayList;
    //   404: iconst_0
    //   405: istore #5
    //   407: iload #5
    //   409: aload #10
    //   411: invokevirtual size : ()I
    //   414: if_icmpge -> 448
    //   417: aload_0
    //   418: getfield c : Ljava/util/ArrayList;
    //   421: aload #9
    //   423: iload #5
    //   425: iconst_0
    //   426: invokevirtual h : (IZ)Lkm0;
    //   429: getfield c : Lqn1;
    //   432: getfield h : I
    //   435: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   438: invokevirtual add : (Ljava/lang/Object;)Z
    //   441: pop
    //   442: iinc #5, 1
    //   445: goto -> 407
    //   448: aload_0
    //   449: invokevirtual q : ()V
    //   452: goto -> 462
    //   455: ldc 'Add songInfoWrappers: Diff size!'
    //   457: invokestatic f : (Ljava/lang/String;)V
    //   460: iconst_0
    //   461: ireturn
    //   462: aload_0
    //   463: aconst_null
    //   464: putfield k : Ljava/lang/Long;
    //   467: iload #8
    //   469: ireturn
    // Exception table:
    //   from	to	target	type
    //   69	96	99	finally
  }
  
  public final boolean c(ArrayList<Object> paramArrayList, boolean paramBoolean1, boolean paramBoolean2) {
    xn1 xn11;
    if (!paramBoolean2 && paramBoolean1) {
      ArrayList arrayList = g(true);
      xn11 = new xn1(e(true), this.h, arrayList, null);
    } else {
      xn11 = null;
    } 
    km0 km0 = d();
    HashSet<wo> hashSet = new HashSet(paramArrayList.size());
    int j = paramArrayList.size();
    int i = 0;
    while (i < j) {
      km0 km01 = (km0)paramArrayList.get(i);
      int k = i + 1;
      km01 = km01;
      i = k;
      if (!km01.equals(km0)) {
        hashSet.add(km01.c.f);
        i = k;
      } 
    } 
    paramArrayList.removeIf(new x42(2, km0));
    i = 0;
    while (true) {
      ArrayList<km0> arrayList = this.b;
      if (i < arrayList.size()) {
        if (hashSet.contains(((km0)arrayList.get(i)).c.f))
          arrayList.set(i, yk1.a); 
        i++;
        continue;
      } 
      k(yk1.a, false, false);
      i = this.e + 1;
      if (!i()) {
        paramBoolean2 = false;
      } else {
        this.e = 0;
        paramBoolean2 = true;
        i = 0;
      } 
      if (i < arrayList.size()) {
        arrayList.addAll(i, (Collection)paramArrayList);
      } else {
        arrayList.addAll((Collection)paramArrayList);
      } 
      if (xn11 != null) {
        ArrayList arrayList1 = xn11.b;
        z51.E(-1, paramArrayList);
        xn11.c(paramArrayList, paramBoolean1, true);
        if (arrayList1.size() == arrayList.size()) {
          for (i = 0; i < arrayList.size(); i++)
            ((km0)arrayList.get(i)).c.h = i; 
          this.c = new ArrayList(arrayList.size());
          for (i = 0; i < arrayList1.size(); i++)
            this.c.add(Integer.valueOf((xn11.h(i, false)).c.h)); 
          q();
        } else {
          tp.f("Add after current song: Diff size!");
          return false;
        } 
      } 
      this.k = null;
      return paramBoolean2;
    } 
  }
  
  public final km0 d() {
    try {
      if (!i())
        return this.b.get(this.e); 
    } finally {
      Exception exception = null;
    } 
  }
  
  public final int e(boolean paramBoolean) {
    return i() ? 0 : (paramBoolean ? this.f : this.e);
  }
  
  public final ArrayList f() {
    ArrayList<Integer> arrayList = this.c;
    ArrayList arrayList1 = this.b;
    if (arrayList == null || arrayList.size() != arrayList1.size() || this.i) {
      boolean bool = this.j;
      this.i = false;
      this.j = false;
      arrayList = new ArrayList(arrayList1.size());
      ArrayList<Integer> arrayList2 = new ArrayList(arrayList1.size());
      if ("1".equals(MyApplication.o().getString("k_i_sflm_ob", "0"))) {
        for (byte b = 0; b < arrayList1.size(); b++) {
          if (b <= this.e && !bool) {
            arrayList.add(Integer.valueOf(b));
          } else {
            arrayList2.add(Integer.valueOf(b));
          } 
        } 
      } else {
        for (byte b = 0; b < arrayList1.size(); b++) {
          if (b == this.e && !bool) {
            arrayList.add(Integer.valueOf(b));
          } else {
            arrayList2.add(Integer.valueOf(b));
          } 
        } 
      } 
      try {
        if (arrayList2.size() > 0) {
          Random random = new Random();
          this();
          while (!arrayList2.isEmpty())
            arrayList.add(arrayList2.remove(random.nextInt(arrayList2.size()))); 
        } 
      } finally {
        arrayList1 = null;
        this.i = true;
        arrayList.addAll(arrayList2);
      } 
      q();
    } 
    return this.c;
  }
  
  public final ArrayList g(boolean paramBoolean) {
    ArrayList<km0> arrayList = this.b;
    if (paramBoolean) {
      ArrayList<Integer> arrayList1 = f();
      ArrayList<km0> arrayList2 = new ArrayList(arrayList1.size());
      for (byte b = 0; b < arrayList1.size(); b++)
        arrayList2.add(arrayList.get(((Integer)arrayList1.get(b)).intValue())); 
      return arrayList2;
    } 
    return arrayList;
  }
  
  public final km0 h(int paramInt, boolean paramBoolean) {
    if (!i()) {
      ArrayList<km0> arrayList = this.b;
      return !paramBoolean ? arrayList.get(paramInt) : arrayList.get(((Integer)f().get(paramInt)).intValue());
    } 
    return null;
  }
  
  public final boolean i() {
    ArrayList arrayList = this.b;
    return (arrayList == null || arrayList.size() == 0);
  }
  
  public final boolean j(boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      i = this.f;
    } else {
      i = this.e;
    } 
    return (i + 1 == this.b.size());
  }
  
  public final void k(km0 paramkm0, boolean paramBoolean1, boolean paramBoolean2) {
    xn1 xn11;
    if (!paramBoolean2 && paramBoolean1) {
      ArrayList arrayList = g(true);
      xn11 = new xn1(e(true), this.h, arrayList, null);
    } else {
      xn11 = null;
    } 
    byte b = 0;
    while (true) {
      ArrayList<km0> arrayList = this.b;
      if (b < arrayList.size()) {
        km0 km01 = arrayList.get(b);
        km0 km02 = yk1.a;
        if ((paramkm0 == km02) ? (km01 == km02) : km01.equals(paramkm0)) {
          boolean bool;
          if (this.e == b && b == arrayList.size() - 1) {
            bool = true;
          } else {
            bool = false;
          } 
          arrayList.remove(b);
          int i = this.e;
          if (b < i)
            this.e = i - 1; 
          if (bool)
            this.e = arrayList.size() - 1; 
          continue;
        } 
        b++;
        continue;
      } 
      if (i())
        this.e = 0; 
      if (xn11 != null) {
        ArrayList arrayList1 = xn11.b;
        xn11.k(paramkm0, paramBoolean1, true);
        if (arrayList1.size() == arrayList.size()) {
          for (b = 0; b < arrayList.size(); b++)
            ((km0)arrayList.get(b)).c.h = b; 
          this.c = new ArrayList(arrayList.size());
          for (b = 0; b < arrayList1.size(); b++)
            this.c.add(Integer.valueOf((xn11.h(b, false)).c.h)); 
          if (!xn11.i())
            this.e = ((Integer)this.c.get(xn11.e(false))).intValue(); 
          q();
        } else {
          tp.f(nBRIsU.cfWnq);
          return;
        } 
      } 
      this.k = null;
      return;
    } 
  }
  
  public final void l(int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: invokevirtual i : ()Z
    //   6: ifeq -> 14
    //   9: iconst_0
    //   10: istore_2
    //   11: goto -> 35
    //   14: aload_0
    //   15: invokevirtual d : ()Lkm0;
    //   18: getfield c : Lqn1;
    //   21: getfield g : I
    //   24: istore_3
    //   25: iload_1
    //   26: istore_2
    //   27: iload_1
    //   28: iload_3
    //   29: if_icmple -> 35
    //   32: goto -> 9
    //   35: goto -> 45
    //   38: astore #4
    //   40: aload #4
    //   42: invokevirtual printStackTrace : ()V
    //   45: aload_0
    //   46: iload_2
    //   47: putfield g : I
    //   50: return
    // Exception table:
    //   from	to	target	type
    //   2	9	38	finally
    //   14	25	38	finally
  }
  
  public final void m(int paramInt, boolean paramBoolean) {
    ArrayList<Integer> arrayList = f();
    if (i()) {
      this.f = 0;
      this.e = 0;
      return;
    } 
    int i = paramInt;
    if (paramBoolean) {
      this.f = paramInt;
      i = ((Integer)arrayList.get(paramInt)).intValue();
    } 
    this.e = i;
  }
  
  public final void n(int paramInt) {
    if (MusicService.C0) {
      this.f = paramInt;
      return;
    } 
    this.e = paramInt;
  }
  
  public final void o(boolean paramBoolean) {
    byte b = 0;
    int i = b;
    if (paramBoolean) {
      this.f = 0;
      try {
        i = ((Integer)f().get(this.f)).intValue();
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        i = b;
      } 
    } 
    this.e = i;
  }
  
  public final void p(boolean paramBoolean) {
    int i = this.b.size() - 1;
    if (i())
      i = 0; 
    int j = i;
    if (paramBoolean) {
      this.f = i;
      j = i;
      if (!i())
        j = ((Integer)f().get(this.f)).intValue(); 
    } 
    this.e = j;
  }
  
  public final void q() {
    if (this.c != null)
      for (byte b = 0; b < this.c.size(); b++) {
        if (((Integer)this.c.get(b)).intValue() == this.e) {
          this.f = b;
          return;
        } 
      }  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */