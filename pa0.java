import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public abstract class pa0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
  public final float b;
  
  public final int c;
  
  public final int e;
  
  public final View f;
  
  public oa0 g;
  
  public oa0 h;
  
  public boolean i;
  
  public int j;
  
  public final int[] k = new int[2];
  
  public pa0(View paramView) {
    this.f = paramView;
    paramView.setLongClickable(true);
    paramView.addOnAttachStateChangeListener(this);
    this.b = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    int i = ViewConfiguration.getTapTimeout();
    this.c = i;
    this.e = (ViewConfiguration.getLongPressTimeout() + i) / 2;
  }
  
  public final void a() {
    oa0 oa01 = this.h;
    View view = this.f;
    if (oa01 != null)
      view.removeCallbacks(oa01); 
    oa01 = this.g;
    if (oa01 != null)
      view.removeCallbacks(oa01); 
  }
  
  public abstract rm1 b();
  
  public abstract boolean c();
  
  public boolean d() {
    rm1 rm1 = b();
    if (rm1 != null && rm1.b())
      rm1.dismiss(); 
    return true;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Z
    //   4: istore #10
    //   6: aload_0
    //   7: getfield f : Landroid/view/View;
    //   10: astore_1
    //   11: iload #10
    //   13: ifeq -> 199
    //   16: aload_0
    //   17: invokevirtual b : ()Lrm1;
    //   20: astore #13
    //   22: aload #13
    //   24: ifnull -> 180
    //   27: aload #13
    //   29: invokeinterface b : ()Z
    //   34: ifne -> 40
    //   37: goto -> 180
    //   40: aload #13
    //   42: invokeinterface h : ()Ly10;
    //   47: astore #14
    //   49: aload #14
    //   51: ifnull -> 180
    //   54: aload #14
    //   56: invokevirtual isShown : ()Z
    //   59: ifne -> 65
    //   62: goto -> 180
    //   65: aload_2
    //   66: invokestatic obtainNoHistory : (Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    //   69: astore #15
    //   71: aload_0
    //   72: getfield k : [I
    //   75: astore #13
    //   77: aload_1
    //   78: aload #13
    //   80: invokevirtual getLocationOnScreen : ([I)V
    //   83: aload #15
    //   85: aload #13
    //   87: iconst_0
    //   88: iaload
    //   89: i2f
    //   90: aload #13
    //   92: iconst_1
    //   93: iaload
    //   94: i2f
    //   95: invokevirtual offsetLocation : (FF)V
    //   98: aload #14
    //   100: aload #13
    //   102: invokevirtual getLocationOnScreen : ([I)V
    //   105: aload #15
    //   107: aload #13
    //   109: iconst_0
    //   110: iaload
    //   111: ineg
    //   112: i2f
    //   113: aload #13
    //   115: iconst_1
    //   116: iaload
    //   117: ineg
    //   118: i2f
    //   119: invokevirtual offsetLocation : (FF)V
    //   122: aload #14
    //   124: aload #15
    //   126: aload_0
    //   127: getfield j : I
    //   130: invokevirtual b : (Landroid/view/MotionEvent;I)Z
    //   133: istore #8
    //   135: aload #15
    //   137: invokevirtual recycle : ()V
    //   140: aload_2
    //   141: invokevirtual getActionMasked : ()I
    //   144: istore #7
    //   146: iload #7
    //   148: iconst_1
    //   149: if_icmpeq -> 164
    //   152: iload #7
    //   154: iconst_3
    //   155: if_icmpeq -> 164
    //   158: iconst_1
    //   159: istore #7
    //   161: goto -> 167
    //   164: iconst_0
    //   165: istore #7
    //   167: iload #8
    //   169: ifeq -> 180
    //   172: iload #7
    //   174: ifeq -> 180
    //   177: goto -> 187
    //   180: aload_0
    //   181: invokevirtual d : ()Z
    //   184: ifne -> 193
    //   187: iconst_1
    //   188: istore #8
    //   190: goto -> 491
    //   193: iconst_0
    //   194: istore #8
    //   196: goto -> 491
    //   199: aload_1
    //   200: invokevirtual isEnabled : ()Z
    //   203: ifne -> 209
    //   206: goto -> 448
    //   209: aload_2
    //   210: invokevirtual getActionMasked : ()I
    //   213: istore #7
    //   215: iload #7
    //   217: ifeq -> 371
    //   220: iload #7
    //   222: iconst_1
    //   223: if_icmpeq -> 364
    //   226: iload #7
    //   228: iconst_2
    //   229: if_icmpeq -> 241
    //   232: iload #7
    //   234: iconst_3
    //   235: if_icmpeq -> 364
    //   238: goto -> 448
    //   241: aload_2
    //   242: aload_0
    //   243: getfield j : I
    //   246: invokevirtual findPointerIndex : (I)I
    //   249: istore #7
    //   251: iload #7
    //   253: iflt -> 448
    //   256: aload_2
    //   257: iload #7
    //   259: invokevirtual getX : (I)F
    //   262: fstore_3
    //   263: aload_2
    //   264: iload #7
    //   266: invokevirtual getY : (I)F
    //   269: fstore #4
    //   271: aload_0
    //   272: getfield b : F
    //   275: fstore #5
    //   277: fload #5
    //   279: fneg
    //   280: fstore #6
    //   282: fload_3
    //   283: fload #6
    //   285: fcmpl
    //   286: iflt -> 337
    //   289: fload #4
    //   291: fload #6
    //   293: fcmpl
    //   294: iflt -> 337
    //   297: fload_3
    //   298: aload_1
    //   299: invokevirtual getRight : ()I
    //   302: aload_1
    //   303: invokevirtual getLeft : ()I
    //   306: isub
    //   307: i2f
    //   308: fload #5
    //   310: fadd
    //   311: fcmpg
    //   312: ifge -> 337
    //   315: fload #4
    //   317: aload_1
    //   318: invokevirtual getBottom : ()I
    //   321: aload_1
    //   322: invokevirtual getTop : ()I
    //   325: isub
    //   326: i2f
    //   327: fload #5
    //   329: fadd
    //   330: fcmpg
    //   331: ifge -> 337
    //   334: goto -> 448
    //   337: aload_0
    //   338: invokevirtual a : ()V
    //   341: aload_1
    //   342: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   345: iconst_1
    //   346: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   351: aload_0
    //   352: invokevirtual c : ()Z
    //   355: ifeq -> 448
    //   358: iconst_1
    //   359: istore #9
    //   361: goto -> 451
    //   364: aload_0
    //   365: invokevirtual a : ()V
    //   368: goto -> 448
    //   371: aload_0
    //   372: aload_2
    //   373: iconst_0
    //   374: invokevirtual getPointerId : (I)I
    //   377: putfield j : I
    //   380: aload_0
    //   381: getfield g : Loa0;
    //   384: ifnonnull -> 400
    //   387: aload_0
    //   388: new oa0
    //   391: dup
    //   392: aload_0
    //   393: iconst_0
    //   394: invokespecial <init> : (Lpa0;I)V
    //   397: putfield g : Loa0;
    //   400: aload_1
    //   401: aload_0
    //   402: getfield g : Loa0;
    //   405: aload_0
    //   406: getfield c : I
    //   409: i2l
    //   410: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   413: pop
    //   414: aload_0
    //   415: getfield h : Loa0;
    //   418: ifnonnull -> 434
    //   421: aload_0
    //   422: new oa0
    //   425: dup
    //   426: aload_0
    //   427: iconst_1
    //   428: invokespecial <init> : (Lpa0;I)V
    //   431: putfield h : Loa0;
    //   434: aload_1
    //   435: aload_0
    //   436: getfield h : Loa0;
    //   439: aload_0
    //   440: getfield e : I
    //   443: i2l
    //   444: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   447: pop
    //   448: iconst_0
    //   449: istore #9
    //   451: iload #9
    //   453: istore #8
    //   455: iload #9
    //   457: ifeq -> 491
    //   460: invokestatic uptimeMillis : ()J
    //   463: lstore #11
    //   465: lload #11
    //   467: lload #11
    //   469: iconst_3
    //   470: fconst_0
    //   471: fconst_0
    //   472: iconst_0
    //   473: invokestatic obtain : (JJIFFI)Landroid/view/MotionEvent;
    //   476: astore_2
    //   477: aload_1
    //   478: aload_2
    //   479: invokevirtual onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   482: pop
    //   483: aload_2
    //   484: invokevirtual recycle : ()V
    //   487: iload #9
    //   489: istore #8
    //   491: aload_0
    //   492: iload #8
    //   494: putfield i : Z
    //   497: iload #8
    //   499: ifne -> 512
    //   502: iload #10
    //   504: ifeq -> 510
    //   507: goto -> 512
    //   510: iconst_0
    //   511: ireturn
    //   512: iconst_1
    //   513: ireturn
  }
  
  public final void onViewAttachedToWindow(View paramView) {}
  
  public final void onViewDetachedFromWindow(View paramView) {
    this.i = false;
    this.j = -1;
    oa0 oa01 = this.g;
    if (oa01 != null)
      this.f.removeCallbacks(oa01); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pa0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */