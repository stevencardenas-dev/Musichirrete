public abstract class q50 implements Runnable, Comparable, k00 {
  public volatile Object _heap;
  
  public long b;
  
  public int c;
  
  public q50(long paramLong) {
    this.b = paramLong;
    this.c = -1;
  }
  
  public final int a(long paramLong, r50 paramr50, s50 params50) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield _heap : Ljava/lang/Object;
    //   6: astore #9
    //   8: getstatic dd1.c : Lf1;
    //   11: astore #8
    //   13: aload #9
    //   15: aload #8
    //   17: if_acmpne -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: iconst_2
    //   23: ireturn
    //   24: aload_3
    //   25: monitorenter
    //   26: aload_3
    //   27: getfield a : [Lq50;
    //   30: astore #8
    //   32: aload #8
    //   34: ifnull -> 46
    //   37: aload #8
    //   39: iconst_0
    //   40: aaload
    //   41: astore #8
    //   43: goto -> 49
    //   46: aconst_null
    //   47: astore #8
    //   49: getstatic s50.k : Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    //   52: aload #4
    //   54: invokevirtual get : (Ljava/lang/Object;)I
    //   57: istore #5
    //   59: iload #5
    //   61: ifeq -> 70
    //   64: iconst_1
    //   65: istore #5
    //   67: goto -> 73
    //   70: iconst_0
    //   71: istore #5
    //   73: iload #5
    //   75: ifeq -> 88
    //   78: aload_3
    //   79: monitorexit
    //   80: aload_0
    //   81: monitorexit
    //   82: iconst_1
    //   83: ireturn
    //   84: astore_3
    //   85: goto -> 186
    //   88: aload #8
    //   90: ifnonnull -> 106
    //   93: aload_3
    //   94: lload_1
    //   95: putfield c : J
    //   98: goto -> 144
    //   101: astore #4
    //   103: goto -> 181
    //   106: aload #8
    //   108: getfield b : J
    //   111: lstore #6
    //   113: lload #6
    //   115: lload_1
    //   116: lsub
    //   117: lconst_0
    //   118: lcmp
    //   119: iflt -> 125
    //   122: goto -> 128
    //   125: lload #6
    //   127: lstore_1
    //   128: lload_1
    //   129: aload_3
    //   130: getfield c : J
    //   133: lsub
    //   134: lconst_0
    //   135: lcmp
    //   136: ifle -> 144
    //   139: aload_3
    //   140: lload_1
    //   141: putfield c : J
    //   144: aload_0
    //   145: getfield b : J
    //   148: lstore_1
    //   149: aload_3
    //   150: getfield c : J
    //   153: lstore #6
    //   155: lload_1
    //   156: lload #6
    //   158: lsub
    //   159: lconst_0
    //   160: lcmp
    //   161: ifge -> 170
    //   164: aload_0
    //   165: lload #6
    //   167: putfield b : J
    //   170: aload_3
    //   171: aload_0
    //   172: invokevirtual a : (Lq50;)V
    //   175: aload_3
    //   176: monitorexit
    //   177: aload_0
    //   178: monitorexit
    //   179: iconst_0
    //   180: ireturn
    //   181: aload_3
    //   182: monitorexit
    //   183: aload #4
    //   185: athrow
    //   186: aload_0
    //   187: monitorexit
    //   188: aload_3
    //   189: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	84	finally
    //   24	26	84	finally
    //   26	32	101	finally
    //   49	59	101	finally
    //   78	80	84	finally
    //   93	98	101	finally
    //   106	113	101	finally
    //   128	144	101	finally
    //   144	155	101	finally
    //   164	170	101	finally
    //   170	175	101	finally
    //   175	177	84	finally
    //   181	186	84	finally
  }
  
  public final void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield _heap : Ljava/lang/Object;
    //   6: astore_2
    //   7: getstatic dd1.c : Lf1;
    //   10: astore #4
    //   12: aload_2
    //   13: aload #4
    //   15: if_acmpne -> 21
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: aload_2
    //   22: instanceof r50
    //   25: istore_1
    //   26: aconst_null
    //   27: astore_3
    //   28: iload_1
    //   29: ifeq -> 44
    //   32: aload_2
    //   33: checkcast r50
    //   36: astore_2
    //   37: goto -> 46
    //   40: astore_2
    //   41: goto -> 107
    //   44: aconst_null
    //   45: astore_2
    //   46: aload_2
    //   47: ifnull -> 98
    //   50: aload_2
    //   51: monitorenter
    //   52: aload_0
    //   53: getfield _heap : Ljava/lang/Object;
    //   56: astore #5
    //   58: aload #5
    //   60: instanceof ou1
    //   63: ifeq -> 72
    //   66: aload #5
    //   68: checkcast ou1
    //   71: astore_3
    //   72: aload_3
    //   73: ifnonnull -> 79
    //   76: goto -> 88
    //   79: aload_2
    //   80: aload_0
    //   81: getfield c : I
    //   84: invokevirtual b : (I)Lq50;
    //   87: pop
    //   88: aload_2
    //   89: monitorexit
    //   90: goto -> 98
    //   93: astore_3
    //   94: aload_2
    //   95: monitorexit
    //   96: aload_3
    //   97: athrow
    //   98: aload_0
    //   99: aload #4
    //   101: putfield _heap : Ljava/lang/Object;
    //   104: aload_0
    //   105: monitorexit
    //   106: return
    //   107: aload_0
    //   108: monitorexit
    //   109: aload_2
    //   110: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	40	finally
    //   21	26	40	finally
    //   32	37	40	finally
    //   50	52	40	finally
    //   52	58	93	finally
    //   58	72	93	finally
    //   79	88	93	finally
    //   88	90	40	finally
    //   94	98	40	finally
    //   98	104	40	finally
  }
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    int i = this.b - ((q50)paramObject).b cmp 0L;
    return (i > 0) ? 1 : ((i < 0) ? -1 : 0);
  }
  
  public final void d(r50 paramr50) {
    if (this._heap != dd1.c) {
      this._heap = paramr50;
      return;
    } 
    l0.l("Failed requirement.");
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Delayed[nanos=");
    stringBuilder.append(this.b);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */