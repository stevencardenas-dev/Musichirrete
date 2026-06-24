package j$.time.format;

import j$.time.Instant;
import j$.time.temporal.n;
import j$.time.temporal.q;

public final class q {
  public final n a;
  
  public final a b;
  
  public int c;
  
  public q(Instant paramInstant, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_2
    //   5: getfield d : Lj$/time/chrono/m;
    //   8: astore #6
    //   10: aload #6
    //   12: ifnonnull -> 18
    //   15: goto -> 246
    //   18: aload_1
    //   19: getstatic j$/time/temporal/r.b : Lj$/time/format/b;
    //   22: invokevirtual b : (Lj$/time/format/b;)Ljava/lang/Object;
    //   25: checkcast j$/time/chrono/m
    //   28: astore #10
    //   30: aload_1
    //   31: getstatic j$/time/temporal/r.a : Lj$/time/format/b;
    //   34: invokevirtual b : (Lj$/time/format/b;)Ljava/lang/Object;
    //   37: checkcast j$/time/ZoneId
    //   40: astore #11
    //   42: aload #6
    //   44: aload #10
    //   46: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   49: istore #5
    //   51: aconst_null
    //   52: astore #9
    //   54: iload #5
    //   56: ifeq -> 62
    //   59: aconst_null
    //   60: astore #6
    //   62: aload #6
    //   64: ifnonnull -> 70
    //   67: goto -> 246
    //   70: aload #6
    //   72: ifnull -> 82
    //   75: aload #6
    //   77: astore #7
    //   79: goto -> 86
    //   82: aload #10
    //   84: astore #7
    //   86: aload #9
    //   88: astore #8
    //   90: aload #6
    //   92: ifnull -> 231
    //   95: aload_1
    //   96: getstatic j$/time/temporal/a.EPOCH_DAY : Lj$/time/temporal/a;
    //   99: invokevirtual f : (Lj$/time/temporal/q;)Z
    //   102: ifeq -> 118
    //   105: aload #7
    //   107: aload_1
    //   108: invokeinterface x : (Lj$/time/temporal/n;)Lj$/time/chrono/b;
    //   113: astore #8
    //   115: goto -> 231
    //   118: aload #6
    //   120: getstatic j$/time/chrono/t.c : Lj$/time/chrono/t;
    //   123: if_acmpne -> 135
    //   126: aload #9
    //   128: astore #8
    //   130: aload #10
    //   132: ifnull -> 231
    //   135: invokestatic values : ()[Lj$/time/temporal/a;
    //   138: astore #10
    //   140: aload #10
    //   142: arraylength
    //   143: istore #4
    //   145: iconst_0
    //   146: istore_3
    //   147: aload #9
    //   149: astore #8
    //   151: iload_3
    //   152: iload #4
    //   154: if_icmpge -> 231
    //   157: aload #10
    //   159: iload_3
    //   160: aaload
    //   161: astore #8
    //   163: aload #8
    //   165: invokevirtual isDateBased : ()Z
    //   168: ifeq -> 225
    //   171: aload_1
    //   172: aload #8
    //   174: invokevirtual f : (Lj$/time/temporal/q;)Z
    //   177: ifne -> 183
    //   180: goto -> 225
    //   183: new java/lang/StringBuilder
    //   186: dup
    //   187: ldc 'Unable to apply override chronology ''
    //   189: invokespecial <init> : (Ljava/lang/String;)V
    //   192: astore_2
    //   193: aload_2
    //   194: aload #6
    //   196: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   199: pop
    //   200: aload_2
    //   201: ldc '' because the temporal object being formatted contains date fields but does not represent a whole date: '
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: aload_2
    //   208: aload_1
    //   209: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: new java/lang/RuntimeException
    //   216: dup
    //   217: aload_2
    //   218: invokevirtual toString : ()Ljava/lang/String;
    //   221: invokespecial <init> : (Ljava/lang/String;)V
    //   224: athrow
    //   225: iinc #3, 1
    //   228: goto -> 147
    //   231: new j$/time/format/p
    //   234: dup
    //   235: aload #8
    //   237: aload_1
    //   238: aload #7
    //   240: aload #11
    //   242: invokespecial <init> : (Lj$/time/chrono/b;Lj$/time/Instant;Lj$/time/chrono/m;Lj$/time/ZoneId;)V
    //   245: astore_1
    //   246: aload_0
    //   247: aload_1
    //   248: putfield a : Lj$/time/temporal/n;
    //   251: aload_0
    //   252: aload_2
    //   253: putfield b : Lj$/time/format/a;
    //   256: return
  }
  
  public final Long a(q paramq) {
    int i = this.c;
    n n1 = this.a;
    return (i > 0 && !n1.f(paramq)) ? null : Long.valueOf(n1.g(paramq));
  }
  
  public final String toString() {
    return this.a.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */