import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class x7 implements Runnable {
  public final int b;
  
  public final int c;
  
  public final Object e;
  
  public final Object f;
  
  public x7(BottomSheetBehavior paramBottomSheetBehavior, View paramView, int paramInt) {
    this.f = paramBottomSheetBehavior;
    this.e = paramView;
    this.c = paramInt;
  }
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: tableswitch default -> 32, 0 -> 329, 1 -> 306, 2 -> 253
    //   32: aload_0
    //   33: getfield e : Ljava/lang/Object;
    //   36: checkcast hn2
    //   39: astore #5
    //   41: aload_0
    //   42: getfield f : Ljava/lang/Object;
    //   45: checkcast oq2
    //   48: astore #6
    //   50: aload_0
    //   51: getfield c : I
    //   54: istore_1
    //   55: aload #5
    //   57: getfield h : Lki2;
    //   60: astore #4
    //   62: aload #4
    //   64: ifnonnull -> 70
    //   67: goto -> 244
    //   70: aload #4
    //   72: monitorenter
    //   73: new nt1
    //   76: astore #7
    //   78: aload #7
    //   80: invokespecial <init> : ()V
    //   83: aload #4
    //   85: getfield a : Lpb2;
    //   88: astore #8
    //   90: aload #8
    //   92: invokevirtual getClass : ()Ljava/lang/Class;
    //   95: pop
    //   96: invokestatic b : ()Lah;
    //   99: astore #9
    //   101: new a42
    //   104: astore #10
    //   106: aload #10
    //   108: bipush #17
    //   110: aload #8
    //   112: invokespecial <init> : (ILjava/lang/Object;)V
    //   115: aload #9
    //   117: aload #10
    //   119: putfield d : Ljava/lang/Object;
    //   122: aload #9
    //   124: sipush #4501
    //   127: putfield b : I
    //   130: aload #8
    //   132: iconst_0
    //   133: aload #9
    //   135: invokevirtual a : ()Lah;
    //   138: invokevirtual c : (ILah;)Ldu2;
    //   141: astore #8
    //   143: new ai2
    //   146: astore #9
    //   148: aload #9
    //   150: aload #7
    //   152: invokespecial <init> : (Lnt1;)V
    //   155: aload #8
    //   157: aload #9
    //   159: invokevirtual c : (Lr41;)V
    //   162: new ai2
    //   165: astore #9
    //   167: aload #9
    //   169: aload #7
    //   171: invokespecial <init> : (Lnt1;)V
    //   174: aload #8
    //   176: aload #9
    //   178: invokevirtual b : (Li41;)V
    //   181: new yi1
    //   184: astore #8
    //   186: aload #8
    //   188: bipush #20
    //   190: aload #7
    //   192: invokespecial <init> : (ILjava/lang/Object;)V
    //   195: aload #4
    //   197: getfield b : J
    //   200: lstore_2
    //   201: aload #4
    //   203: getfield c : Lcl;
    //   206: aload #8
    //   208: lload_2
    //   209: ldc2_w 1000
    //   212: lmul
    //   213: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   216: pop
    //   217: aload #7
    //   219: getfield a : Ldu2;
    //   222: astore #7
    //   224: aload #4
    //   226: monitorexit
    //   227: aload #7
    //   229: new d7
    //   232: dup
    //   233: iload_1
    //   234: aload #5
    //   236: aload #6
    //   238: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   241: invokevirtual c : (Lr41;)V
    //   244: return
    //   245: astore #5
    //   247: aload #4
    //   249: monitorexit
    //   250: aload #5
    //   252: athrow
    //   253: aload_0
    //   254: getfield e : Ljava/lang/Object;
    //   257: checkcast eh2
    //   260: astore #6
    //   262: aload_0
    //   263: getfield f : Ljava/lang/Object;
    //   266: checkcast cv0
    //   269: astore #5
    //   271: aload_0
    //   272: getfield c : I
    //   275: istore_1
    //   276: aload #6
    //   278: getfield h : Ljava/util/HashMap;
    //   281: astore #4
    //   283: aload #4
    //   285: monitorenter
    //   286: aload #6
    //   288: aload #5
    //   290: iload_1
    //   291: invokevirtual r0 : (Lcv0;I)V
    //   294: aload #4
    //   296: monitorexit
    //   297: return
    //   298: astore #5
    //   300: aload #4
    //   302: monitorexit
    //   303: aload #5
    //   305: athrow
    //   306: aload_0
    //   307: getfield f : Ljava/lang/Object;
    //   310: checkcast com/google/android/material/bottomsheet/BottomSheetBehavior
    //   313: aload_0
    //   314: getfield e : Ljava/lang/Object;
    //   317: checkcast android/view/View
    //   320: aload_0
    //   321: getfield c : I
    //   324: iconst_0
    //   325: invokevirtual L : (Landroid/view/View;IZ)V
    //   328: return
    //   329: aload_0
    //   330: getfield e : Ljava/lang/Object;
    //   333: checkcast android/widget/TextView
    //   336: aload_0
    //   337: getfield f : Ljava/lang/Object;
    //   340: checkcast android/graphics/Typeface
    //   343: aload_0
    //   344: getfield c : I
    //   347: invokevirtual setTypeface : (Landroid/graphics/Typeface;I)V
    //   350: return
    // Exception table:
    //   from	to	target	type
    //   73	224	245	finally
    //   247	250	245	finally
    //   286	297	298	finally
    //   300	303	298	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */