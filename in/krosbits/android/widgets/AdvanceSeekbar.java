package in.krosbits.android.widgets;

import ag0;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import e3;
import f3;
import in.krosbits.musicolet.MyApplication;
import m92;

public class AdvanceSeekbar extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {
  public SeekBar.OnSeekBarChangeListener c;
  
  public boolean e;
  
  public boolean f = true;
  
  public int g = -1;
  
  public boolean h;
  
  public boolean i;
  
  public int j = 0;
  
  public boolean k = false;
  
  public Drawable l;
  
  public float m = 0.0F;
  
  public float n = 0.0F;
  
  public boolean o = false;
  
  public final e3 p;
  
  public boolean q;
  
  public int r;
  
  public f3 s;
  
  public AdvanceSeekbar(Context paramContext) {
    super(paramContext);
    String str = MyApplication.f;
    this.p = new e3(0, this);
    this.q = false;
    this.r = -2;
    a();
  }
  
  public AdvanceSeekbar(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    String str = MyApplication.f;
    this.p = new e3(0, this);
    this.q = false;
    this.r = -2;
    a();
  }
  
  public AdvanceSeekbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    String str = MyApplication.f;
    this.p = new e3(0, this);
    this.q = false;
    this.r = -2;
    a();
  }
  
  public final void a() {
    setWillNotDraw(false);
    setWillNotCacheDrawing(false);
    setLayerType(1, null);
    super.setOnSeekBarChangeListener(this);
    setBackground(null);
    setBackgroundTintList(null);
    setIndeterminateTintList(null);
    setThumbTintList(null);
    setProgressTintList(null);
    setProgressBackgroundTintList(null);
    setSecondaryProgressTintList(null);
  }
  
  public final void b() {
    int i = this.r;
    int j = this.g;
    if (i != j) {
      setLineDrawable(j);
      setThumbeDrawable(this.g);
    } 
    this.r = this.g;
  }
  
  public Drawable getSeekBarThumb() {
    return this.l;
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: iload_2
    //   5: invokespecial onMeasure : (II)V
    //   8: aload_0
    //   9: invokevirtual getHeight : ()I
    //   12: pop
    //   13: aload_0
    //   14: bipush #-2
    //   16: putfield r : I
    //   19: aload_0
    //   20: invokevirtual b : ()V
    //   23: aload_0
    //   24: monitorexit
    //   25: return
    //   26: astore_3
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_3
    //   30: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	26	finally
    //   27	29	26	finally
  }
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {
    this.o = false;
    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.c;
    if (onSeekBarChangeListener != null) {
      onSeekBarChangeListener.onProgressChanged(paramSeekBar, paramInt, paramBoolean | this.q);
      if (this.q)
        this.c.onStopTrackingTouch(paramSeekBar); 
    } 
    this.q = false;
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {}
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getAction : ()I
    //   4: istore #5
    //   6: aload_0
    //   7: getfield p : Le3;
    //   10: astore #9
    //   12: iconst_0
    //   13: istore #6
    //   15: iload #5
    //   17: ifeq -> 526
    //   20: iload #5
    //   22: iconst_1
    //   23: if_icmpeq -> 300
    //   26: iload #5
    //   28: iconst_2
    //   29: if_icmpeq -> 96
    //   32: iload #5
    //   34: iconst_3
    //   35: if_icmpeq -> 45
    //   38: iload #6
    //   40: istore #5
    //   42: goto -> 721
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield o : Z
    //   50: aload_0
    //   51: invokevirtual getHandler : ()Landroid/os/Handler;
    //   54: aload #9
    //   56: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   59: aload_0
    //   60: iconst_m1
    //   61: putfield g : I
    //   64: aload_0
    //   65: iconst_0
    //   66: putfield e : Z
    //   69: aload_0
    //   70: iconst_0
    //   71: putfield h : Z
    //   74: aload_0
    //   75: iconst_0
    //   76: putfield i : Z
    //   79: aload_0
    //   80: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   83: iconst_1
    //   84: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   89: iload #6
    //   91: istore #5
    //   93: goto -> 721
    //   96: aload_0
    //   97: getfield h : Z
    //   100: ifeq -> 105
    //   103: iconst_0
    //   104: ireturn
    //   105: aload_1
    //   106: invokevirtual getX : ()F
    //   109: aload_0
    //   110: getfield m : F
    //   113: fsub
    //   114: invokestatic abs : (F)F
    //   117: fstore #4
    //   119: aload_1
    //   120: invokevirtual getY : ()F
    //   123: aload_0
    //   124: getfield n : F
    //   127: fsub
    //   128: invokestatic abs : (F)F
    //   131: fstore_3
    //   132: aload_0
    //   133: invokevirtual getHeight : ()I
    //   136: i2f
    //   137: fconst_2
    //   138: fdiv
    //   139: fstore_2
    //   140: aload_0
    //   141: getfield g : I
    //   144: iconst_2
    //   145: if_icmpne -> 223
    //   148: fload #4
    //   150: fload_2
    //   151: fcmpl
    //   152: ifle -> 160
    //   155: aload_0
    //   156: iconst_1
    //   157: putfield i : Z
    //   160: fload_3
    //   161: fload_2
    //   162: fcmpl
    //   163: ifle -> 217
    //   166: aload_0
    //   167: getfield i : Z
    //   170: ifne -> 217
    //   173: aload_0
    //   174: getfield k : Z
    //   177: ifeq -> 217
    //   180: aload_0
    //   181: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   184: checkcast android/view/ViewGroup
    //   187: astore #8
    //   189: aload_0
    //   190: iconst_1
    //   191: putfield h : Z
    //   194: aload #8
    //   196: iconst_0
    //   197: invokevirtual requestDisallowInterceptTouchEvent : (Z)V
    //   200: aload #8
    //   202: aload_1
    //   203: invokevirtual onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   206: pop
    //   207: goto -> 217
    //   210: astore #8
    //   212: aload #8
    //   214: invokevirtual printStackTrace : ()V
    //   217: iconst_1
    //   218: istore #5
    //   220: goto -> 721
    //   223: fload #4
    //   225: fload_2
    //   226: fcmpl
    //   227: ifgt -> 240
    //   230: iload #6
    //   232: istore #5
    //   234: fload_3
    //   235: fload_2
    //   236: fcmpl
    //   237: ifle -> 721
    //   240: aload_0
    //   241: iconst_0
    //   242: putfield o : Z
    //   245: aload_0
    //   246: invokevirtual getHandler : ()Landroid/os/Handler;
    //   249: aload #9
    //   251: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   254: aload_0
    //   255: iconst_m1
    //   256: putfield g : I
    //   259: aload_0
    //   260: iconst_0
    //   261: putfield e : Z
    //   264: aload_0
    //   265: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   268: checkcast android/view/ViewGroup
    //   271: astore #8
    //   273: aload_0
    //   274: iconst_1
    //   275: putfield h : Z
    //   278: aload #8
    //   280: iconst_0
    //   281: invokevirtual requestDisallowInterceptTouchEvent : (Z)V
    //   284: aload #8
    //   286: aload_1
    //   287: invokevirtual onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   290: pop
    //   291: iconst_0
    //   292: ireturn
    //   293: astore_1
    //   294: aload_1
    //   295: invokevirtual printStackTrace : ()V
    //   298: iconst_0
    //   299: ireturn
    //   300: aload_0
    //   301: iconst_0
    //   302: putfield o : Z
    //   305: aload_0
    //   306: invokevirtual getHandler : ()Landroid/os/Handler;
    //   309: aload #9
    //   311: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   314: aload_0
    //   315: getfield g : I
    //   318: istore #5
    //   320: iload #5
    //   322: ifne -> 389
    //   325: aload_0
    //   326: getfield j : I
    //   329: ifle -> 463
    //   332: aload_0
    //   333: invokevirtual getProgress : ()I
    //   336: aload_0
    //   337: getfield j : I
    //   340: idiv
    //   341: istore #5
    //   343: aload_0
    //   344: invokevirtual getProgress : ()I
    //   347: pop
    //   348: aload_0
    //   349: getfield j : I
    //   352: istore #7
    //   354: iload #5
    //   356: iconst_1
    //   357: isub
    //   358: iload #7
    //   360: imul
    //   361: istore #7
    //   363: iload #7
    //   365: istore #5
    //   367: iload #7
    //   369: ifge -> 375
    //   372: iconst_0
    //   373: istore #5
    //   375: aload_0
    //   376: iconst_1
    //   377: putfield q : Z
    //   380: aload_0
    //   381: iload #5
    //   383: invokevirtual setProgressWithAnimation : (I)V
    //   386: goto -> 463
    //   389: iload #5
    //   391: iconst_1
    //   392: if_icmpne -> 463
    //   395: aload_0
    //   396: getfield j : I
    //   399: ifle -> 463
    //   402: aload_0
    //   403: invokevirtual getProgress : ()I
    //   406: aload_0
    //   407: getfield j : I
    //   410: idiv
    //   411: istore #5
    //   413: aload_0
    //   414: invokevirtual getProgress : ()I
    //   417: pop
    //   418: aload_0
    //   419: getfield j : I
    //   422: istore #7
    //   424: iload #5
    //   426: iconst_1
    //   427: iadd
    //   428: iload #7
    //   430: imul
    //   431: istore #7
    //   433: iload #7
    //   435: istore #5
    //   437: iload #7
    //   439: aload_0
    //   440: invokevirtual getMax : ()I
    //   443: if_icmple -> 452
    //   446: aload_0
    //   447: invokevirtual getMax : ()I
    //   450: istore #5
    //   452: aload_0
    //   453: iconst_1
    //   454: putfield q : Z
    //   457: aload_0
    //   458: iload #5
    //   460: invokevirtual setProgressWithAnimation : (I)V
    //   463: aload_0
    //   464: iconst_m1
    //   465: putfield g : I
    //   468: aload_0
    //   469: getfield e : Z
    //   472: ifeq -> 494
    //   475: aload_0
    //   476: getfield c : Landroid/widget/SeekBar$OnSeekBarChangeListener;
    //   479: astore #8
    //   481: aload #8
    //   483: ifnull -> 494
    //   486: aload #8
    //   488: aload_0
    //   489: invokeinterface onStopTrackingTouch : (Landroid/widget/SeekBar;)V
    //   494: aload_0
    //   495: iconst_0
    //   496: putfield e : Z
    //   499: aload_0
    //   500: iconst_0
    //   501: putfield h : Z
    //   504: aload_0
    //   505: iconst_0
    //   506: putfield i : Z
    //   509: aload_0
    //   510: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   513: iconst_1
    //   514: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   519: iload #6
    //   521: istore #5
    //   523: goto -> 721
    //   526: aload_0
    //   527: aload_1
    //   528: invokevirtual getX : ()F
    //   531: putfield m : F
    //   534: aload_0
    //   535: aload_1
    //   536: invokevirtual getY : ()F
    //   539: putfield n : F
    //   542: aload_0
    //   543: invokevirtual getWidth : ()I
    //   546: istore #7
    //   548: aload_0
    //   549: invokevirtual getPaddingLeft : ()I
    //   552: istore #6
    //   554: aload_0
    //   555: invokevirtual getPaddingRight : ()I
    //   558: istore #5
    //   560: aload_0
    //   561: invokevirtual getPaddingLeft : ()I
    //   564: i2f
    //   565: fstore_2
    //   566: iload #7
    //   568: iload #6
    //   570: isub
    //   571: iload #5
    //   573: isub
    //   574: i2f
    //   575: aload_0
    //   576: invokevirtual getProgress : ()I
    //   579: i2f
    //   580: fmul
    //   581: aload_0
    //   582: invokevirtual getMax : ()I
    //   585: i2f
    //   586: fdiv
    //   587: fload_2
    //   588: fadd
    //   589: f2i
    //   590: istore #5
    //   592: new android/graphics/RectF
    //   595: dup
    //   596: aload_0
    //   597: invokevirtual getSeekBarThumb : ()Landroid/graphics/drawable/Drawable;
    //   600: invokevirtual copyBounds : ()Landroid/graphics/Rect;
    //   603: invokespecial <init> : (Landroid/graphics/Rect;)V
    //   606: astore #8
    //   608: aload #8
    //   610: aload_1
    //   611: invokevirtual getX : ()F
    //   614: aload #8
    //   616: invokevirtual centerY : ()F
    //   619: invokevirtual contains : (FF)Z
    //   622: ifeq -> 659
    //   625: aload_0
    //   626: iconst_2
    //   627: putfield g : I
    //   630: aload_0
    //   631: iconst_1
    //   632: putfield e : Z
    //   635: aload_0
    //   636: getfield k : Z
    //   639: ifne -> 653
    //   642: aload_0
    //   643: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   646: checkcast android/view/ViewGroup
    //   649: iconst_1
    //   650: invokevirtual requestDisallowInterceptTouchEvent : (Z)V
    //   653: iconst_1
    //   654: istore #5
    //   656: goto -> 686
    //   659: aload_1
    //   660: invokevirtual getX : ()F
    //   663: iload #5
    //   665: i2f
    //   666: fcmpg
    //   667: ifge -> 678
    //   670: aload_0
    //   671: iconst_0
    //   672: putfield g : I
    //   675: goto -> 683
    //   678: aload_0
    //   679: iconst_1
    //   680: putfield g : I
    //   683: iconst_0
    //   684: istore #5
    //   686: aload_0
    //   687: getfield s : Lf3;
    //   690: ifnull -> 711
    //   693: aload_0
    //   694: iconst_1
    //   695: putfield o : Z
    //   698: aload_0
    //   699: invokevirtual getHandler : ()Landroid/os/Handler;
    //   702: aload #9
    //   704: ldc2_w 1700
    //   707: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   710: pop
    //   711: aload_0
    //   712: iconst_0
    //   713: putfield h : Z
    //   716: aload_0
    //   717: iconst_0
    //   718: putfield i : Z
    //   721: aload_0
    //   722: invokevirtual b : ()V
    //   725: iload #5
    //   727: ifeq -> 736
    //   730: aload_0
    //   731: aload_1
    //   732: invokespecial onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   735: ireturn
    //   736: iconst_1
    //   737: ireturn
    // Exception table:
    //   from	to	target	type
    //   180	207	210	finally
    //   264	291	293	finally
  }
  
  public void setLineDrawable(int paramInt) {
    int i;
    int[] arrayOfInt = m92.h;
    boolean bool = this.f;
    if (bool) {
      i = arrayOfInt[3];
    } else {
      i = arrayOfInt[7];
    } 
    int k = arrayOfInt[7];
    float f = MyApplication.p;
    int m = (int)(2.0F * f);
    if (paramInt == 0)
      if (bool) {
        i = arrayOfInt[5];
      } else {
        i = k;
      }  
    int j = k;
    if (paramInt == 1) {
      j = k;
      if (bool)
        j = arrayOfInt[5]; 
    } 
    if (paramInt == 2) {
      paramInt = (int)(f * 4.0F);
      k = 2131231672;
    } else {
      k = 2131231671;
      paramInt = m;
    } 
    Drawable drawable1 = getContext().getResources().getDrawable(k).mutate();
    Drawable drawable2 = getContext().getResources().getDrawable(k).mutate();
    if (drawable1 instanceof GradientDrawable) {
      ((GradientDrawable)drawable1).setStroke(paramInt, j);
    } else {
      drawable1 = ag0.C0(j, drawable1);
    } 
    if (drawable2 instanceof GradientDrawable) {
      ((GradientDrawable)drawable2).setStroke(paramInt, i);
    } else {
      drawable2 = ag0.C0(i, drawable2);
    } 
    ClipDrawable clipDrawable = new ClipDrawable(drawable2, 3, 1);
    LayerDrawable layerDrawable = (LayerDrawable)getContext().getResources().getDrawable(2131231456).mutate();
    layerDrawable.setDrawableByLayerId(16908288, drawable1);
    layerDrawable.setDrawableByLayerId(16908301, (Drawable)clipDrawable);
    setProgressDrawable((Drawable)layerDrawable);
  }
  
  public void setOnLongPressListener(f3 paramf3) {
    this.s = paramf3;
  }
  
  public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener paramOnSeekBarChangeListener) {
    this.c = paramOnSeekBarChangeListener;
  }
  
  public void setProgressStepIncreaseValue(int paramInt) {
    this.j = paramInt;
  }
  
  public void setProgressWithAnimation(int paramInt) {
    setProgress(paramInt);
  }
  
  public void setSelfEnabled(boolean paramBoolean) {
    if (paramBoolean != this.f) {
      this.f = paramBoolean;
      if (paramBoolean) {
        setAlpha(1.0F);
      } else {
        setAlpha(0.7F);
      } 
      this.r = -2;
      b();
    } 
  }
  
  public void setThumb(Drawable paramDrawable) {
    super.setThumb(paramDrawable);
    this.l = paramDrawable;
  }
  
  public void setThumbeDrawable(int paramInt) {
    int j;
    Drawable drawable;
    int[] arrayOfInt = m92.h;
    String str = MyApplication.f;
    if (paramInt == 2) {
      drawable = getContext().getResources().getDrawable(2131231032).mutate();
      boolean bool = this.f;
      if (bool) {
        paramInt = arrayOfInt[5];
      } else {
        paramInt = arrayOfInt[7];
      } 
      j = (int)(MyApplication.p * 2.0F);
      if (bool) {
        int k = arrayOfInt[3];
        i = paramInt;
        paramInt = k;
      } else {
        int k = arrayOfInt[7];
        i = paramInt;
        paramInt = k;
      } 
    } else {
      drawable = getContext().getResources().getDrawable(2131231031).mutate();
      boolean bool = this.f;
      if (bool) {
        paramInt = arrayOfInt[6];
      } else {
        paramInt = arrayOfInt[7];
      } 
      j = (int)(MyApplication.p * 1.5F);
      if (bool) {
        i = arrayOfInt[5];
      } else {
        i = arrayOfInt[7];
      } 
      int k = i;
      i = paramInt;
      paramInt = k;
    } 
    int i = ag0.g(arrayOfInt[2], i);
    try {
      GradientDrawable gradientDrawable1 = (GradientDrawable)((LayerDrawable)drawable).getDrawable(0);
      GradientDrawable gradientDrawable2 = (GradientDrawable)((LayerDrawable)drawable).getDrawable(1);
      gradientDrawable1.setColor(arrayOfInt[2]);
      gradientDrawable1.setStroke(j, i);
      gradientDrawable2.setColor(paramInt);
    } finally {
      arrayOfInt = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\AdvanceSeekbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */