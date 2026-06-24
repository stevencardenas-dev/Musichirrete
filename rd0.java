import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class rd0 implements Runnable {
  public static final ThreadLocal g = new ThreadLocal();
  
  public static final ij h = new ij(6);
  
  public final ArrayList b = new ArrayList();
  
  public long c;
  
  public long e;
  
  public final ArrayList f = new ArrayList();
  
  public static he1 c(RecyclerView paramRecyclerView, int paramInt, long paramLong) {
    int i = paramRecyclerView.h.h();
    for (byte b = 0; b < i; b++) {
      he1 he11 = RecyclerView.O(paramRecyclerView.h.g(b));
      if (he11.e == paramInt && !he11.h())
        return null; 
    } 
    yd1 yd1 = paramRecyclerView.e;
    if (paramLong == Long.MAX_VALUE)
      try {
        if (tv1.a())
          Trace.beginSection("RV Prefetch forced - needed next frame"); 
      } finally {
        Exception exception;
      }  
    paramRecyclerView.V();
    he1 he1 = yd1.l(paramInt, paramLong);
    if (he1 != null)
      if (he1.g() && !he1.h()) {
        yd1.i(he1.b);
      } else {
        yd1.a(he1, false);
      }  
    paramRecyclerView.W(false);
    Trace.endSection();
    return he1;
  }
  
  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    if (paramRecyclerView.u)
      if (!RecyclerView.E0 || this.b.contains(paramRecyclerView)) {
        if (this.c == 0L) {
          this.c = paramRecyclerView.getNanoTime();
          paramRecyclerView.post(this);
        } 
      } else {
        tp.f("attempting to post unregistered view!");
        return;
      }  
    il il = paramRecyclerView.i0;
    il.a = paramInt1;
    il.b = paramInt2;
  }
  
  public final void b(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/util/ArrayList;
    //   4: astore #14
    //   6: aload #14
    //   8: invokevirtual size : ()I
    //   11: istore #7
    //   13: iconst_0
    //   14: istore_3
    //   15: iconst_0
    //   16: istore #5
    //   18: iload_3
    //   19: iload #7
    //   21: if_icmpge -> 86
    //   24: aload #14
    //   26: iload_3
    //   27: invokevirtual get : (I)Ljava/lang/Object;
    //   30: checkcast androidx/recyclerview/widget/RecyclerView
    //   33: astore #13
    //   35: aload #13
    //   37: invokevirtual getWindowVisibility : ()I
    //   40: istore #6
    //   42: aload #13
    //   44: getfield i0 : Lil;
    //   47: astore #12
    //   49: iload #5
    //   51: istore #4
    //   53: iload #6
    //   55: ifne -> 76
    //   58: aload #12
    //   60: aload #13
    //   62: iconst_0
    //   63: invokevirtual d : (Landroidx/recyclerview/widget/RecyclerView;Z)V
    //   66: iload #5
    //   68: aload #12
    //   70: getfield c : I
    //   73: iadd
    //   74: istore #4
    //   76: iinc #3, 1
    //   79: iload #4
    //   81: istore #5
    //   83: goto -> 18
    //   86: aload_0
    //   87: getfield f : Ljava/util/ArrayList;
    //   90: astore #13
    //   92: aload #13
    //   94: iload #5
    //   96: invokevirtual ensureCapacity : (I)V
    //   99: iconst_0
    //   100: istore #4
    //   102: iconst_0
    //   103: istore_3
    //   104: iload #4
    //   106: iload #7
    //   108: if_icmpge -> 313
    //   111: aload #14
    //   113: iload #4
    //   115: invokevirtual get : (I)Ljava/lang/Object;
    //   118: checkcast androidx/recyclerview/widget/RecyclerView
    //   121: astore #15
    //   123: aload #15
    //   125: invokevirtual getWindowVisibility : ()I
    //   128: ifeq -> 137
    //   131: iload_3
    //   132: istore #6
    //   134: goto -> 304
    //   137: aload #15
    //   139: getfield i0 : Lil;
    //   142: astore #16
    //   144: aload #16
    //   146: getfield a : I
    //   149: invokestatic abs : (I)I
    //   152: istore #5
    //   154: aload #16
    //   156: getfield b : I
    //   159: invokestatic abs : (I)I
    //   162: iload #5
    //   164: iadd
    //   165: istore #8
    //   167: iconst_0
    //   168: istore #5
    //   170: iconst_0
    //   171: istore #11
    //   173: iload_3
    //   174: istore #6
    //   176: iload #5
    //   178: aload #16
    //   180: getfield c : I
    //   183: iconst_2
    //   184: imul
    //   185: if_icmpge -> 304
    //   188: iload_3
    //   189: aload #13
    //   191: invokevirtual size : ()I
    //   194: if_icmplt -> 217
    //   197: new java/lang/Object
    //   200: dup
    //   201: invokespecial <init> : ()V
    //   204: astore #12
    //   206: aload #13
    //   208: aload #12
    //   210: invokevirtual add : (Ljava/lang/Object;)Z
    //   213: pop
    //   214: goto -> 228
    //   217: aload #13
    //   219: iload_3
    //   220: invokevirtual get : (I)Ljava/lang/Object;
    //   223: checkcast qd0
    //   226: astore #12
    //   228: aload #16
    //   230: getfield d : Ljava/lang/Object;
    //   233: checkcast [I
    //   236: astore #17
    //   238: aload #17
    //   240: iload #5
    //   242: iconst_1
    //   243: iadd
    //   244: iaload
    //   245: istore #6
    //   247: iload #6
    //   249: iload #8
    //   251: if_icmpgt -> 257
    //   254: iconst_1
    //   255: istore #11
    //   257: aload #12
    //   259: iload #11
    //   261: putfield a : Z
    //   264: aload #12
    //   266: iload #8
    //   268: putfield b : I
    //   271: aload #12
    //   273: iload #6
    //   275: putfield c : I
    //   278: aload #12
    //   280: aload #15
    //   282: putfield d : Landroidx/recyclerview/widget/RecyclerView;
    //   285: aload #12
    //   287: aload #17
    //   289: iload #5
    //   291: iaload
    //   292: putfield e : I
    //   295: iinc #3, 1
    //   298: iinc #5, 2
    //   301: goto -> 170
    //   304: iinc #4, 1
    //   307: iload #6
    //   309: istore_3
    //   310: goto -> 104
    //   313: aload #13
    //   315: getstatic rd0.h : Lij;
    //   318: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   321: iconst_0
    //   322: istore_3
    //   323: iload_3
    //   324: aload #13
    //   326: invokevirtual size : ()I
    //   329: if_icmpge -> 711
    //   332: aload #13
    //   334: iload_3
    //   335: invokevirtual get : (I)Ljava/lang/Object;
    //   338: checkcast qd0
    //   341: astore #14
    //   343: aload #14
    //   345: getfield d : Landroidx/recyclerview/widget/RecyclerView;
    //   348: astore #12
    //   350: aload #12
    //   352: ifnonnull -> 358
    //   355: goto -> 711
    //   358: aload #14
    //   360: getfield a : Z
    //   363: ifeq -> 374
    //   366: ldc2_w 9223372036854775807
    //   369: lstore #9
    //   371: goto -> 377
    //   374: lload_1
    //   375: lstore #9
    //   377: aload #12
    //   379: aload #14
    //   381: getfield e : I
    //   384: lload #9
    //   386: invokestatic c : (Landroidx/recyclerview/widget/RecyclerView;IJ)Lhe1;
    //   389: astore #12
    //   391: aload #12
    //   393: ifnull -> 664
    //   396: aload #12
    //   398: getfield c : Ljava/lang/ref/WeakReference;
    //   401: ifnull -> 664
    //   404: aload #12
    //   406: invokevirtual g : ()Z
    //   409: ifeq -> 664
    //   412: aload #12
    //   414: invokevirtual h : ()Z
    //   417: ifne -> 664
    //   420: aload #12
    //   422: getfield c : Ljava/lang/ref/WeakReference;
    //   425: invokevirtual get : ()Ljava/lang/Object;
    //   428: checkcast androidx/recyclerview/widget/RecyclerView
    //   431: astore #15
    //   433: aload #15
    //   435: ifnonnull -> 441
    //   438: goto -> 664
    //   441: aload #15
    //   443: getfield F : Z
    //   446: ifeq -> 526
    //   449: aload #15
    //   451: getfield h : Ltk;
    //   454: invokevirtual h : ()I
    //   457: ifeq -> 526
    //   460: aload #15
    //   462: getfield e : Lyd1;
    //   465: astore #12
    //   467: aload #15
    //   469: getfield O : Lod1;
    //   472: astore #16
    //   474: aload #16
    //   476: ifnull -> 484
    //   479: aload #16
    //   481: invokevirtual e : ()V
    //   484: aload #15
    //   486: getfield p : Landroidx/recyclerview/widget/a;
    //   489: astore #16
    //   491: aload #16
    //   493: ifnull -> 513
    //   496: aload #16
    //   498: aload #12
    //   500: invokevirtual x0 : (Lyd1;)V
    //   503: aload #15
    //   505: getfield p : Landroidx/recyclerview/widget/a;
    //   508: aload #12
    //   510: invokevirtual y0 : (Lyd1;)V
    //   513: aload #12
    //   515: getfield a : Ljava/util/ArrayList;
    //   518: invokevirtual clear : ()V
    //   521: aload #12
    //   523: invokevirtual g : ()V
    //   526: aload #15
    //   528: getfield i0 : Lil;
    //   531: astore #16
    //   533: aload #16
    //   535: aload #15
    //   537: iconst_1
    //   538: invokevirtual d : (Landroidx/recyclerview/widget/RecyclerView;Z)V
    //   541: aload #16
    //   543: getfield c : I
    //   546: ifeq -> 664
    //   549: lload_1
    //   550: ldc2_w 9223372036854775807
    //   553: lcmp
    //   554: ifne -> 564
    //   557: ldc 'RV Nested Prefetch'
    //   559: astore #12
    //   561: goto -> 569
    //   564: getstatic org/jaudiotagger/tag/id3/tT/hrSTyFuSIm.ImWPGDt : Ljava/lang/String;
    //   567: astore #12
    //   569: aload #12
    //   571: invokestatic beginSection : (Ljava/lang/String;)V
    //   574: aload #15
    //   576: getfield j0 : Lde1;
    //   579: astore #12
    //   581: aload #15
    //   583: getfield o : Lid1;
    //   586: astore #17
    //   588: aload #12
    //   590: iconst_1
    //   591: putfield d : I
    //   594: aload #12
    //   596: aload #17
    //   598: invokevirtual c : ()I
    //   601: putfield e : I
    //   604: aload #12
    //   606: iconst_0
    //   607: putfield g : Z
    //   610: aload #12
    //   612: iconst_0
    //   613: putfield h : Z
    //   616: aload #12
    //   618: iconst_0
    //   619: putfield i : Z
    //   622: iconst_0
    //   623: istore #4
    //   625: iload #4
    //   627: aload #16
    //   629: getfield c : I
    //   632: iconst_2
    //   633: imul
    //   634: if_icmpge -> 661
    //   637: aload #15
    //   639: aload #16
    //   641: getfield d : Ljava/lang/Object;
    //   644: checkcast [I
    //   647: iload #4
    //   649: iaload
    //   650: lload_1
    //   651: invokestatic c : (Landroidx/recyclerview/widget/RecyclerView;IJ)Lhe1;
    //   654: pop
    //   655: iinc #4, 2
    //   658: goto -> 625
    //   661: invokestatic endSection : ()V
    //   664: goto -> 675
    //   667: astore #12
    //   669: invokestatic endSection : ()V
    //   672: aload #12
    //   674: athrow
    //   675: aload #14
    //   677: iconst_0
    //   678: putfield a : Z
    //   681: aload #14
    //   683: iconst_0
    //   684: putfield b : I
    //   687: aload #14
    //   689: iconst_0
    //   690: putfield c : I
    //   693: aload #14
    //   695: aconst_null
    //   696: putfield d : Landroidx/recyclerview/widget/RecyclerView;
    //   699: aload #14
    //   701: iconst_0
    //   702: putfield e : I
    //   705: iinc #3, 1
    //   708: goto -> 323
    //   711: return
    // Exception table:
    //   from	to	target	type
    //   564	569	667	finally
    //   569	622	667	finally
    //   625	655	667	finally
  }
  
  public final void run() {
    ArrayList<RecyclerView> arrayList = this.b;
    try {
      Trace.beginSection("RV Prefetch");
      boolean bool = arrayList.isEmpty();
      if (!bool) {
        int i = arrayList.size();
        byte b = 0;
        long l;
        for (l = 0L; b < i; l = l1) {
          RecyclerView recyclerView = arrayList.get(b);
          long l1 = l;
          if (recyclerView.getWindowVisibility() == 0)
            l1 = Math.max(recyclerView.getDrawingTime(), l); 
          b++;
        } 
        if (l != 0L)
          b(TimeUnit.MILLISECONDS.toNanos(l) + this.e); 
      } 
      return;
    } finally {
      this.c = 0L;
      Trace.endSection();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rd0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */