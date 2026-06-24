import android.util.Log;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;
import java.util.Locale;

public final class f01 {
  public static f01 n;
  
  public final f91 a;
  
  public final b b;
  
  public final f91 c;
  
  public final ue d;
  
  public final ue e;
  
  public final b f;
  
  public final ArrayList g;
  
  public final a[] h;
  
  public final int i;
  
  public final b j;
  
  public final p5 k;
  
  public boolean l;
  
  public final ArrayList m;
  
  public f01() {
    f91 f911 = new f91(2);
    f911.c = 0.0F;
    this.a = f911;
    this.b = new b(2);
    this.c = new f91(0);
    ue ue1 = new ue(0);
    this.d = ue1;
    ue ue2 = new ue(1);
    this.e = ue2;
    b b2 = new b(0);
    this.f = b2;
    this.g = new ArrayList();
    b b1 = new b(1);
    this.j = b1;
    this.k = (p5)new Object();
    this.m = new ArrayList();
    boolean bool = true;
    b2.a = true;
    a[] arrayOfA = new a[2];
    this.h = arrayOfA;
    arrayOfA[0] = ue1;
    arrayOfA[1] = ue2;
    int i = MyApplication.o().getInt("k_i_wdthnm", 0);
    this.i = i;
    if (i != -99)
      bool = false; 
    b1.a = bool;
  }
  
  public static float[] a(int paramInt) {
    if (paramInt == 3)
      return new float[] { 63.0F, 630.0F, 8000.0F }; 
    if (paramInt == 5)
      return new float[] { 40.0F, 160.0F, 630.0F, 2500.0F, 10000.0F }; 
    if (paramInt == 10)
      return new float[] { 31.5F, 63.0F, 125.0F, 250.0F, 500.0F, 1000.0F, 2000.0F, 4000.0F, 8000.0F, 16000.0F }; 
    if (paramInt == 15)
      return new float[] { 
          25.0F, 40.0F, 63.0F, 100.0F, 160.0F, 250.0F, 400.0F, 630.0F, 1000.0F, 1600.0F, 
          2500.0F, 4000.0F, 6300.0F, 10000.0F, 16000.0F }; 
    if (paramInt == 31)
      return new float[] { 
          20.0F, 25.0F, 31.5F, 40.0F, 50.0F, 63.0F, 80.0F, 100.0F, 125.0F, 160.0F, 
          200.0F, 250.0F, 315.0F, 400.0F, 500.0F, 630.0F, 800.0F, 1000.0F, 1250.0F, 1600.0F, 
          2000.0F, 2500.0F, 3150.0F, 4000.0F, 5000.0F, 6300.0F, 8000.0F, 10000.0F, 12500.0F, 16000.0F, 
          20000.0F }; 
    Log.e("NATIVEX", "DSM:eqb>nob!");
    return new float[0];
  }
  
  public static final f01 b() {
    if (n == null)
      n = new f01(); 
    return n;
  }
  
  public final void c(au paramau) {
    /* monitor enter ThisExpression{ObjectType{f01}} */
    try {
      if (!this.m.contains(paramau))
        this.m.add(paramau); 
    } finally {}
    /* monitor exit ThisExpression{ObjectType{f01}} */
  }
  
  public final void d(int paramInt) {
    float[] arrayOfFloat1;
    ArrayList<r01> arrayList = this.g;
    arrayList.clear();
    float[] arrayOfFloat2 = a(paramInt);
    boolean bool = false;
    if (paramInt == 3) {
      arrayOfFloat1 = new float[3];
      arrayOfFloat1[0] = 3.0F;
      arrayOfFloat1[1] = 3.333F;
      arrayOfFloat1[2] = 3.0F;
      paramInt = bool;
    } else if (paramInt == 5) {
      arrayOfFloat1 = new float[5];
      arrayOfFloat1[0] = 2.0F;
      arrayOfFloat1[1] = 2.0F;
      arrayOfFloat1[2] = 2.0F;
      arrayOfFloat1[3] = 2.0F;
      arrayOfFloat1[4] = 2.0F;
      paramInt = bool;
    } else if (paramInt == 10) {
      arrayOfFloat1 = new float[10];
      arrayOfFloat1[0] = 1.0F;
      arrayOfFloat1[1] = 1.0F;
      arrayOfFloat1[2] = 1.0F;
      arrayOfFloat1[3] = 1.0F;
      arrayOfFloat1[4] = 1.0F;
      arrayOfFloat1[5] = 1.0F;
      arrayOfFloat1[6] = 1.0F;
      arrayOfFloat1[7] = 1.0F;
      arrayOfFloat1[8] = 1.0F;
      arrayOfFloat1[9] = 1.0F;
      paramInt = bool;
    } else if (paramInt == 15) {
      arrayOfFloat1 = new float[15];
      arrayOfFloat1[0] = 0.6666F;
      arrayOfFloat1[1] = 0.6666F;
      arrayOfFloat1[2] = 0.6666F;
      arrayOfFloat1[3] = 0.6666F;
      arrayOfFloat1[4] = 0.6666F;
      arrayOfFloat1[5] = 0.6666F;
      arrayOfFloat1[6] = 0.6666F;
      arrayOfFloat1[7] = 0.6666F;
      arrayOfFloat1[8] = 0.6666F;
      arrayOfFloat1[9] = 0.6666F;
      arrayOfFloat1[10] = 0.6666F;
      arrayOfFloat1[11] = 0.6666F;
      arrayOfFloat1[12] = 0.6666F;
      arrayOfFloat1[13] = 0.6666F;
      arrayOfFloat1[14] = 0.6666F;
      paramInt = bool;
    } else if (paramInt == 31) {
      arrayOfFloat1 = new float[31];
      arrayOfFloat1[0] = 0.3333F;
      arrayOfFloat1[1] = 0.3333F;
      arrayOfFloat1[2] = 0.3333F;
      arrayOfFloat1[3] = 0.3333F;
      arrayOfFloat1[4] = 0.3333F;
      arrayOfFloat1[5] = 0.3333F;
      arrayOfFloat1[6] = 0.3333F;
      arrayOfFloat1[7] = 0.3333F;
      arrayOfFloat1[8] = 0.3333F;
      arrayOfFloat1[9] = 0.3333F;
      arrayOfFloat1[10] = 0.3333F;
      arrayOfFloat1[11] = 0.3333F;
      arrayOfFloat1[12] = 0.3333F;
      arrayOfFloat1[13] = 0.3333F;
      arrayOfFloat1[14] = 0.3333F;
      arrayOfFloat1[15] = 0.3333F;
      arrayOfFloat1[16] = 0.3333F;
      arrayOfFloat1[17] = 0.3333F;
      arrayOfFloat1[18] = 0.3333F;
      arrayOfFloat1[19] = 0.3333F;
      arrayOfFloat1[20] = 0.3333F;
      arrayOfFloat1[21] = 0.3333F;
      arrayOfFloat1[22] = 0.3333F;
      arrayOfFloat1[23] = 0.3333F;
      arrayOfFloat1[24] = 0.3333F;
      arrayOfFloat1[25] = 0.3333F;
      arrayOfFloat1[26] = 0.3333F;
      arrayOfFloat1[27] = 0.3333F;
      arrayOfFloat1[28] = 0.3333F;
      arrayOfFloat1[29] = 0.3333F;
      arrayOfFloat1[30] = 0.3333F;
      paramInt = bool;
    } else {
      Log.e("NATIVEX", "DSM:eqb>nob!");
      arrayOfFloat1 = new float[0];
      paramInt = bool;
    } 
    while (paramInt < arrayOfFloat2.length) {
      r01 r01 = new r01(arrayOfFloat2[paramInt], arrayOfFloat1[paramInt]);
      r01.a = this.l;
      arrayList.add(r01);
      paramInt++;
    } 
  }
  
  public final boolean e(boolean paramBoolean1, boolean paramBoolean2) {
    b b2 = this.b;
    boolean bool = b2.a;
    byte b1 = 0;
    if (bool != paramBoolean1) {
      b2.a = paramBoolean1;
      if (paramBoolean2)
        try {
          ArrayList<b> arrayList = this.m;
          int i = arrayList.size();
        } finally {
          b2 = null;
        }  
      return true;
    } 
    return false;
  }
  
  public final void f(float paramFloat) {
    f91 f911 = this.c;
    if (f911.c != paramFloat) {
      String str1;
      f911.c = paramFloat;
      String str3 = yj1.i;
      String str2 = yj1.h;
      Locale locale = Locale.ENGLISH;
      String str4 = yj1.l;
      if (paramFloat >= 0.0F) {
        str1 = "+";
      } else {
        str1 = "";
      } 
      qn qn = new qn(str3, str3, str2, String.format(locale, str4, new Object[] { str1, Float.valueOf(paramFloat) }));
    } else {
      f911 = null;
    } 
    if (f911 != null)
      try {
        ArrayList<Object> arrayList = this.m;
        int i = arrayList.size();
        byte b1 = 0;
      } finally {
        f911 = null;
      }  
  }
  
  public final void g() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield m : Ljava/util/ArrayList;
    //   6: astore #4
    //   8: aload #4
    //   10: invokevirtual size : ()I
    //   13: istore_2
    //   14: iconst_0
    //   15: istore_1
    //   16: iload_1
    //   17: iload_2
    //   18: if_icmpge -> 51
    //   21: aload #4
    //   23: iload_1
    //   24: invokevirtual get : (I)Ljava/lang/Object;
    //   27: astore_3
    //   28: iinc #1, 1
    //   31: aload_3
    //   32: checkcast au
    //   35: getstatic qn.e : Lqn;
    //   38: invokeinterface f : (Lqn;)V
    //   43: goto -> 16
    //   46: astore_3
    //   47: aload_3
    //   48: invokevirtual printStackTrace : ()V
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: astore_3
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_3
    //   58: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	46	finally
    //   21	28	46	finally
    //   31	43	46	finally
    //   47	51	54	finally
    //   55	57	54	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */