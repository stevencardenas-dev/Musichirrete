package androidx.work.impl.workers;

import ad0;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bv0;
import cs;
import ct;
import ds;
import java.util.concurrent.ExecutorService;
import oo0;
import os;
import qv;
import qz1;
import tq;
import y72;

public final class ConstraintTrackingWorker extends CoroutineWorker {
  public final WorkerParameters g;
  
  public ConstraintTrackingWorker(Context paramContext, WorkerParameters paramWorkerParameters) {
    super(paramContext, paramWorkerParameters);
    this.g = paramWorkerParameters;
  }
  
  public static final Object d(ConstraintTrackingWorker paramConstraintTrackingWorker, oo0 paramoo0, bv0 parambv0, y72 paramy72, ds paramds) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getClass : ()Ljava/lang/Class;
    //   4: pop
    //   5: aload #4
    //   7: instanceof uq
    //   10: ifeq -> 51
    //   13: aload #4
    //   15: checkcast uq
    //   18: astore #6
    //   20: aload #6
    //   22: getfield h : I
    //   25: istore #5
    //   27: iload #5
    //   29: ldc -2147483648
    //   31: iand
    //   32: ifeq -> 51
    //   35: aload #6
    //   37: iload #5
    //   39: ldc -2147483648
    //   41: iadd
    //   42: putfield h : I
    //   45: aload #6
    //   47: astore_0
    //   48: goto -> 62
    //   51: new uq
    //   54: dup
    //   55: aload_0
    //   56: aload #4
    //   58: invokespecial <init> : (Landroidx/work/impl/workers/ConstraintTrackingWorker;Lds;)V
    //   61: astore_0
    //   62: aload_0
    //   63: getfield f : Ljava/lang/Object;
    //   66: astore #4
    //   68: aload_0
    //   69: getfield h : I
    //   72: istore #5
    //   74: iload #5
    //   76: ifeq -> 103
    //   79: iload #5
    //   81: iconst_1
    //   82: if_icmpne -> 96
    //   85: aload #4
    //   87: invokestatic r0 : (Ljava/lang/Object;)V
    //   90: aload #4
    //   92: astore_0
    //   93: goto -> 144
    //   96: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   98: invokestatic f : (Ljava/lang/String;)V
    //   101: aconst_null
    //   102: areturn
    //   103: aload #4
    //   105: invokestatic r0 : (Ljava/lang/Object;)V
    //   108: new wq
    //   111: dup
    //   112: aload_1
    //   113: aload_2
    //   114: aload_3
    //   115: aconst_null
    //   116: invokespecial <init> : (Loo0;Lbv0;Ly72;Lcs;)V
    //   119: astore_1
    //   120: aload_0
    //   121: iconst_1
    //   122: putfield h : I
    //   125: aload_1
    //   126: aload_0
    //   127: invokestatic n : (Lad0;Lcs;)Ljava/lang/Object;
    //   130: astore_1
    //   131: getstatic ys.b : Lys;
    //   134: astore_2
    //   135: aload_1
    //   136: astore_0
    //   137: aload_1
    //   138: aload_2
    //   139: if_acmpne -> 144
    //   142: aload_2
    //   143: areturn
    //   144: aload_0
    //   145: invokevirtual getClass : ()Ljava/lang/Class;
    //   148: pop
    //   149: aload_0
    //   150: areturn
  }
  
  public static final Object e(ConstraintTrackingWorker paramConstraintTrackingWorker, ds paramds) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Landroidx/work/WorkerParameters;
    //   4: astore #7
    //   6: aload_0
    //   7: getfield c : Ljava/util/concurrent/atomic/AtomicInteger;
    //   10: astore #6
    //   12: aload_0
    //   13: getfield a : Landroid/content/Context;
    //   16: astore #8
    //   18: aload_0
    //   19: getfield b : Landroidx/work/WorkerParameters;
    //   22: astore #9
    //   24: aload_1
    //   25: instanceof xq
    //   28: ifeq -> 62
    //   31: aload_1
    //   32: checkcast xq
    //   35: astore #4
    //   37: aload #4
    //   39: getfield i : I
    //   42: istore_2
    //   43: iload_2
    //   44: ldc -2147483648
    //   46: iand
    //   47: ifeq -> 62
    //   50: aload #4
    //   52: iload_2
    //   53: ldc -2147483648
    //   55: iadd
    //   56: putfield i : I
    //   59: goto -> 76
    //   62: new xq
    //   65: dup
    //   66: aload_0
    //   67: aload_1
    //   68: invokespecial <init> : (Landroidx/work/impl/workers/ConstraintTrackingWorker;Lds;)V
    //   71: astore #4
    //   73: goto -> 59
    //   76: aload #4
    //   78: getfield g : Ljava/lang/Object;
    //   81: astore #5
    //   83: aload #4
    //   85: getfield i : I
    //   88: istore_2
    //   89: iload_2
    //   90: ifeq -> 126
    //   93: iload_2
    //   94: iconst_1
    //   95: if_icmpne -> 119
    //   98: aload #4
    //   100: getfield f : Loo0;
    //   103: astore_1
    //   104: aload #5
    //   106: invokestatic r0 : (Ljava/lang/Object;)V
    //   109: aload #5
    //   111: astore_0
    //   112: goto -> 603
    //   115: astore_0
    //   116: goto -> 619
    //   119: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   121: invokestatic f : (Ljava/lang/String;)V
    //   124: aconst_null
    //   125: areturn
    //   126: aload #5
    //   128: invokestatic r0 : (Ljava/lang/Object;)V
    //   131: aload #9
    //   133: getfield b : Ldu;
    //   136: astore_1
    //   137: aload_1
    //   138: invokevirtual getClass : ()Ljava/lang/Class;
    //   141: pop
    //   142: aload_1
    //   143: getfield a : Ljava/util/HashMap;
    //   146: ldc 'androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME'
    //   148: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   151: astore_1
    //   152: aload_1
    //   153: instanceof java/lang/String
    //   156: ifeq -> 167
    //   159: aload_1
    //   160: checkcast java/lang/String
    //   163: astore_1
    //   164: goto -> 169
    //   167: aconst_null
    //   168: astore_1
    //   169: aload_1
    //   170: ifnull -> 767
    //   173: aload_1
    //   174: invokevirtual length : ()I
    //   177: ifne -> 183
    //   180: goto -> 767
    //   183: aload #8
    //   185: invokestatic a : (Landroid/content/Context;)Lq72;
    //   188: astore #5
    //   190: aload #5
    //   192: invokevirtual getClass : ()Ljava/lang/Class;
    //   195: pop
    //   196: aload #5
    //   198: getfield c : Landroidx/work/impl/WorkDatabase;
    //   201: invokevirtual v : ()Lc82;
    //   204: astore #10
    //   206: aload #9
    //   208: getfield a : Ljava/util/UUID;
    //   211: invokevirtual toString : ()Ljava/lang/String;
    //   214: astore #11
    //   216: aload #11
    //   218: invokevirtual getClass : ()Ljava/lang/Class;
    //   221: pop
    //   222: aload #10
    //   224: aload #11
    //   226: invokevirtual b : (Ljava/lang/String;)Ly72;
    //   229: astore #10
    //   231: aload #10
    //   233: ifnonnull -> 244
    //   236: new ko0
    //   239: dup
    //   240: invokespecial <init> : ()V
    //   243: areturn
    //   244: aload #5
    //   246: getfield j : Lcn;
    //   249: astore #11
    //   251: aload #11
    //   253: invokevirtual getClass : ()Ljava/lang/Class;
    //   256: pop
    //   257: new bv0
    //   260: dup
    //   261: aload #11
    //   263: invokespecial <init> : (Lcn;)V
    //   266: astore #11
    //   268: aload #11
    //   270: getfield a : Ljava/util/ArrayList;
    //   273: astore #13
    //   275: new java/util/ArrayList
    //   278: dup
    //   279: invokespecial <init> : ()V
    //   282: astore #12
    //   284: aload #13
    //   286: invokevirtual size : ()I
    //   289: istore_3
    //   290: iconst_0
    //   291: istore_2
    //   292: iload_2
    //   293: iload_3
    //   294: if_icmpge -> 334
    //   297: aload #13
    //   299: iload_2
    //   300: invokevirtual get : (I)Ljava/lang/Object;
    //   303: astore #14
    //   305: iinc #2, 1
    //   308: aload #14
    //   310: checkcast dq
    //   313: aload #10
    //   315: invokeinterface c : (Ly72;)Z
    //   320: ifeq -> 331
    //   323: aload #12
    //   325: aload #14
    //   327: invokevirtual add : (Ljava/lang/Object;)Z
    //   330: pop
    //   331: goto -> 292
    //   334: aload #12
    //   336: invokevirtual isEmpty : ()Z
    //   339: ifne -> 419
    //   342: invokestatic h : ()Lqp0;
    //   345: astore #15
    //   347: getstatic e72.a : Ljava/lang/String;
    //   350: astore #13
    //   352: new java/lang/StringBuilder
    //   355: dup
    //   356: ldc 'Work '
    //   358: invokespecial <init> : (Ljava/lang/String;)V
    //   361: astore #14
    //   363: aload #14
    //   365: aload #10
    //   367: getfield a : Ljava/lang/String;
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: aload #14
    //   376: ldc ' constrained by '
    //   378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: pop
    //   382: aload #14
    //   384: aload #12
    //   386: aconst_null
    //   387: aconst_null
    //   388: aconst_null
    //   389: new ps
    //   392: dup
    //   393: bipush #8
    //   395: invokespecial <init> : (I)V
    //   398: bipush #31
    //   400: invokestatic p0 : (Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwc0;I)Ljava/lang/String;
    //   403: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   406: pop
    //   407: aload #15
    //   409: aload #13
    //   411: aload #14
    //   413: invokevirtual toString : ()Ljava/lang/String;
    //   416: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   419: aload #12
    //   421: invokevirtual isEmpty : ()Z
    //   424: ifne -> 481
    //   427: getstatic dr.a : Ljava/lang/String;
    //   430: astore_0
    //   431: invokestatic h : ()Lqp0;
    //   434: astore #4
    //   436: new java/lang/StringBuilder
    //   439: dup
    //   440: ldc 'Constraints not met for delegate '
    //   442: invokespecial <init> : (Ljava/lang/String;)V
    //   445: astore #5
    //   447: aload #5
    //   449: aload_1
    //   450: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   453: pop
    //   454: aload #5
    //   456: ldc '. Requesting retry.'
    //   458: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   461: pop
    //   462: aload #4
    //   464: aload_0
    //   465: aload #5
    //   467: invokevirtual toString : ()Ljava/lang/String;
    //   470: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   473: new java/lang/Object
    //   476: dup
    //   477: invokespecial <init> : ()V
    //   480: areturn
    //   481: getstatic dr.a : Ljava/lang/String;
    //   484: astore #12
    //   486: invokestatic h : ()Lqp0;
    //   489: aload #12
    //   491: ldc 'Constraints met for delegate '
    //   493: aload_1
    //   494: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   497: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   500: aload #9
    //   502: getfield f : Lj30;
    //   505: astore #9
    //   507: aload #8
    //   509: invokevirtual getClass : ()Ljava/lang/Class;
    //   512: pop
    //   513: aload #9
    //   515: aload #8
    //   517: aload_1
    //   518: aload #7
    //   520: invokevirtual a : (Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Loo0;
    //   523: astore_1
    //   524: aload #7
    //   526: getfield e : Ln2;
    //   529: getfield g : Ljava/lang/Object;
    //   532: checkcast ki1
    //   535: astore #5
    //   537: aload #5
    //   539: invokevirtual getClass : ()Ljava/lang/Class;
    //   542: pop
    //   543: aload #5
    //   545: invokestatic t : (Ljava/util/concurrent/Executor;)Lrs;
    //   548: astore #7
    //   550: new vq
    //   553: astore #5
    //   555: aload #5
    //   557: aload_0
    //   558: aload_1
    //   559: aload #11
    //   561: aload #10
    //   563: aconst_null
    //   564: invokespecial <init> : (Landroidx/work/impl/workers/ConstraintTrackingWorker;Loo0;Lbv0;Ly72;Lcs;)V
    //   567: aload #4
    //   569: aload_1
    //   570: putfield f : Loo0;
    //   573: aload #4
    //   575: iconst_1
    //   576: putfield i : I
    //   579: aload #7
    //   581: aload #5
    //   583: aload #4
    //   585: invokestatic l0 : (Los;Lad0;Lcs;)Ljava/lang/Object;
    //   588: astore_0
    //   589: getstatic ys.b : Lys;
    //   592: astore #4
    //   594: aload_0
    //   595: aload #4
    //   597: if_acmpne -> 603
    //   600: aload #4
    //   602: areturn
    //   603: aload_0
    //   604: checkcast no0
    //   607: astore_0
    //   608: aload_0
    //   609: areturn
    //   610: astore_0
    //   611: goto -> 619
    //   614: astore_0
    //   615: goto -> 619
    //   618: astore_0
    //   619: aload #6
    //   621: invokevirtual get : ()I
    //   624: sipush #-256
    //   627: if_icmpeq -> 633
    //   630: goto -> 640
    //   633: aload_0
    //   634: instanceof sq
    //   637: ifeq -> 713
    //   640: getstatic android/os/Build$VERSION.SDK_INT : I
    //   643: bipush #31
    //   645: if_icmpge -> 655
    //   648: sipush #-512
    //   651: istore_2
    //   652: goto -> 690
    //   655: aload #6
    //   657: invokevirtual get : ()I
    //   660: sipush #-256
    //   663: if_icmpeq -> 675
    //   666: aload #6
    //   668: invokevirtual get : ()I
    //   671: istore_2
    //   672: goto -> 690
    //   675: aload_0
    //   676: instanceof sq
    //   679: ifeq -> 705
    //   682: aload_0
    //   683: checkcast sq
    //   686: getfield b : I
    //   689: istore_2
    //   690: aload_1
    //   691: getfield c : Ljava/util/concurrent/atomic/AtomicInteger;
    //   694: sipush #-256
    //   697: iload_2
    //   698: invokevirtual compareAndSet : (II)Z
    //   701: pop
    //   702: goto -> 713
    //   705: ldc_w 'Unreachable'
    //   708: invokestatic f : (Ljava/lang/String;)V
    //   711: aconst_null
    //   712: areturn
    //   713: aload_0
    //   714: instanceof sq
    //   717: ifeq -> 731
    //   720: new java/lang/Object
    //   723: dup
    //   724: invokespecial <init> : ()V
    //   727: astore_0
    //   728: goto -> 765
    //   731: aload_0
    //   732: athrow
    //   733: astore_0
    //   734: getstatic dr.a : Ljava/lang/String;
    //   737: astore_0
    //   738: invokestatic h : ()Lqp0;
    //   741: aload_0
    //   742: ldc_w 'No worker to delegate to.'
    //   745: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   748: aload #5
    //   750: getfield b : Lip;
    //   753: invokevirtual getClass : ()Ljava/lang/Class;
    //   756: pop
    //   757: new ko0
    //   760: dup
    //   761: invokespecial <init> : ()V
    //   764: astore_0
    //   765: aload_0
    //   766: areturn
    //   767: getstatic dr.a : Ljava/lang/String;
    //   770: astore_0
    //   771: invokestatic h : ()Lqp0;
    //   774: aload_0
    //   775: ldc_w 'No worker to delegate to.'
    //   778: invokevirtual f : (Ljava/lang/String;Ljava/lang/String;)V
    //   781: new ko0
    //   784: dup
    //   785: invokespecial <init> : ()V
    //   788: areturn
    // Exception table:
    //   from	to	target	type
    //   104	109	115	java/util/concurrent/CancellationException
    //   500	524	733	finally
    //   543	555	618	java/util/concurrent/CancellationException
    //   555	589	614	java/util/concurrent/CancellationException
    //   603	608	610	java/util/concurrent/CancellationException
  }
  
  public final Object c(ct paramct) {
    ExecutorService executorService = ((oo0)this).b.c;
    executorService.getClass();
    return qv.l0((os)qz1.t(executorService), (ad0)new tq(this, null, 0), (cs)paramct);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\work\impl\workers\ConstraintTrackingWorker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */