import android.media.audiofx.BassBoost;
import android.media.audiofx.Virtualizer;
import java.util.ArrayList;
import java.util.List;

public final class ve {
  public static int d;
  
  public static int e;
  
  public final int a;
  
  public final ArrayList b = new ArrayList(2);
  
  public final boolean c;
  
  public ve(int paramInt1, int paramInt2, List<Integer> paramList) {
    if (paramInt1 == 0) {
      bool3 = bool4;
    } else {
      bool3 = false;
    } 
    this.c = bool3;
    a();
    if (bool3)
      for (paramInt1 = bool2; paramInt1 < paramList.size(); paramInt1++)
        this.b.add(new Virtualizer(127, ((Integer)paramList.get(paramInt1)).intValue()));  
  }
  
  public final void a() {
    int i = this.a;
    boolean bool = false;
    byte b = 0;
    boolean bool1 = this.c;
    ArrayList<Virtualizer> arrayList = this.b;
    switch (i) {
      default:
        if (bool1)
          while (true) {
            if (b < arrayList.size()) {
              try {
                ((Virtualizer)arrayList.get(b)).release();
              } finally {
                Exception exception;
              } 
              b++;
              continue;
            } 
            arrayList.clear();
            return;
          }  
        return;
      case 0:
        break;
    } 
    if (bool1) {
      b = bool;
      while (true) {
        if (b < arrayList.size()) {
          try {
            ((BassBoost)arrayList.get(b)).release();
          } finally {
            Exception exception;
          } 
          b++;
          continue;
        } 
        arrayList.clear();
        return;
      } 
    } 
  }
  
  public final void b(boolean paramBoolean) {
    int i = this.a;
    boolean bool = false;
    byte b = 0;
    boolean bool1 = this.c;
    ArrayList<Virtualizer> arrayList = this.b;
    switch (i) {
      default:
        if (bool1)
          while (true) {
            if (b < arrayList.size()) {
              try {
                ((Virtualizer)arrayList.get(b)).setEnabled(paramBoolean);
              } finally {
                Exception exception;
              } 
              b++;
              continue;
            } 
            return;
          }  
        return;
      case 0:
        break;
    } 
    if (bool1) {
      b = bool;
      while (true) {
        if (b < arrayList.size()) {
          try {
            ((BassBoost)arrayList.get(b)).setEnabled(paramBoolean);
          } finally {
            Exception exception;
          } 
          b++;
          continue;
        } 
        return;
      } 
    } 
  }
  
  public final void c(short paramShort) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : I
    //   4: istore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_0
    //   9: istore_2
    //   10: iconst_0
    //   11: istore #4
    //   13: iload #5
    //   15: tableswitch default -> 32, 0 -> 225
    //   32: aload_0
    //   33: getfield c : Z
    //   36: ifeq -> 74
    //   39: iload #4
    //   41: istore_2
    //   42: iload_2
    //   43: aload_0
    //   44: getfield b : Ljava/util/ArrayList;
    //   47: invokevirtual size : ()I
    //   50: if_icmpge -> 218
    //   53: aload_0
    //   54: getfield b : Ljava/util/ArrayList;
    //   57: iload_2
    //   58: invokevirtual get : (I)Ljava/lang/Object;
    //   61: checkcast android/media/audiofx/Virtualizer
    //   64: iload_1
    //   65: invokevirtual setStrength : (S)V
    //   68: iinc #2, 1
    //   71: goto -> 42
    //   74: invokestatic b : ()Lf01;
    //   77: astore #8
    //   79: aload #8
    //   81: monitorenter
    //   82: aload #8
    //   84: getfield e : Lue;
    //   87: iload_1
    //   88: invokevirtual f : (I)[Lqn;
    //   91: astore #9
    //   93: aload #8
    //   95: getfield l : Z
    //   98: istore #7
    //   100: iload #7
    //   102: ifeq -> 215
    //   105: aload #9
    //   107: ifnull -> 215
    //   110: aload #8
    //   112: getfield m : Ljava/util/ArrayList;
    //   115: astore #10
    //   117: aload #10
    //   119: invokevirtual size : ()I
    //   122: istore #5
    //   124: iconst_0
    //   125: istore_3
    //   126: iload_3
    //   127: iload #5
    //   129: if_icmpge -> 215
    //   132: aload #10
    //   134: iload_3
    //   135: invokevirtual get : (I)Ljava/lang/Object;
    //   138: astore #11
    //   140: iload_3
    //   141: iconst_1
    //   142: iadd
    //   143: istore #4
    //   145: aload #11
    //   147: checkcast au
    //   150: astore #11
    //   152: aload #9
    //   154: arraylength
    //   155: istore #6
    //   157: iconst_0
    //   158: istore_2
    //   159: iload #4
    //   161: istore_3
    //   162: iload_2
    //   163: iload #6
    //   165: if_icmpge -> 126
    //   168: aload #9
    //   170: iload_2
    //   171: aaload
    //   172: astore #12
    //   174: aload #12
    //   176: ifnull -> 196
    //   179: aload #11
    //   181: aload #12
    //   183: invokeinterface f : (Lqn;)V
    //   188: goto -> 196
    //   191: astore #9
    //   193: goto -> 202
    //   196: iinc #2, 1
    //   199: goto -> 159
    //   202: aload #9
    //   204: invokevirtual printStackTrace : ()V
    //   207: goto -> 215
    //   210: astore #9
    //   212: goto -> 219
    //   215: aload #8
    //   217: monitorexit
    //   218: return
    //   219: aload #8
    //   221: monitorexit
    //   222: aload #9
    //   224: athrow
    //   225: aload_0
    //   226: getfield c : Z
    //   229: ifeq -> 266
    //   232: iload_3
    //   233: istore_2
    //   234: iload_2
    //   235: aload_0
    //   236: getfield b : Ljava/util/ArrayList;
    //   239: invokevirtual size : ()I
    //   242: if_icmpge -> 421
    //   245: aload_0
    //   246: getfield b : Ljava/util/ArrayList;
    //   249: iload_2
    //   250: invokevirtual get : (I)Ljava/lang/Object;
    //   253: checkcast android/media/audiofx/BassBoost
    //   256: iload_1
    //   257: invokevirtual setStrength : (S)V
    //   260: iinc #2, 1
    //   263: goto -> 234
    //   266: invokestatic b : ()Lf01;
    //   269: astore #9
    //   271: aload #9
    //   273: monitorenter
    //   274: aload #9
    //   276: getfield d : Lue;
    //   279: astore #8
    //   281: aload #8
    //   283: getfield c : I
    //   286: iload_1
    //   287: if_icmpeq -> 339
    //   290: aload #8
    //   292: iload_1
    //   293: putfield c : I
    //   296: aload #8
    //   298: getfield a : Z
    //   301: ifeq -> 339
    //   304: new qn
    //   307: astore #8
    //   309: getstatic yj1.y : Ljava/lang/String;
    //   312: astore #10
    //   314: aload #8
    //   316: aload #10
    //   318: aload #10
    //   320: ldc 'g'
    //   322: iload_1
    //   323: i2f
    //   324: ldc 15.0
    //   326: fmul
    //   327: ldc 1000.0
    //   329: fdiv
    //   330: invokestatic valueOf : (F)Ljava/lang/String;
    //   333: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   336: goto -> 342
    //   339: aconst_null
    //   340: astore #8
    //   342: aload #9
    //   344: getfield l : Z
    //   347: istore #7
    //   349: iload #7
    //   351: ifeq -> 418
    //   354: aload #8
    //   356: ifnull -> 418
    //   359: aload #9
    //   361: getfield m : Ljava/util/ArrayList;
    //   364: astore #11
    //   366: aload #11
    //   368: invokevirtual size : ()I
    //   371: istore_3
    //   372: iload_2
    //   373: iload_3
    //   374: if_icmpge -> 418
    //   377: aload #11
    //   379: iload_2
    //   380: invokevirtual get : (I)Ljava/lang/Object;
    //   383: astore #10
    //   385: iinc #2, 1
    //   388: aload #10
    //   390: checkcast au
    //   393: aload #8
    //   395: invokeinterface f : (Lqn;)V
    //   400: goto -> 372
    //   403: astore #8
    //   405: aload #8
    //   407: invokevirtual printStackTrace : ()V
    //   410: goto -> 418
    //   413: astore #8
    //   415: goto -> 422
    //   418: aload #9
    //   420: monitorexit
    //   421: return
    //   422: aload #9
    //   424: monitorexit
    //   425: aload #8
    //   427: athrow
    //   428: astore #8
    //   430: goto -> 68
    //   433: astore #8
    //   435: goto -> 260
    // Exception table:
    //   from	to	target	type
    //   53	68	428	finally
    //   82	100	210	finally
    //   110	124	191	finally
    //   132	140	191	finally
    //   145	157	191	finally
    //   179	188	191	finally
    //   202	207	210	finally
    //   219	222	210	finally
    //   245	260	433	finally
    //   274	336	413	finally
    //   342	349	413	finally
    //   359	372	403	finally
    //   377	385	403	finally
    //   388	400	403	finally
    //   405	410	413	finally
    //   422	425	413	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */