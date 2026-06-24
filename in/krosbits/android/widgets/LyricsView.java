package in.krosbits.android.widgets;

import a3;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import cc1;
import e3;
import id1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import m92;
import rq0;
import xp0;

public class LyricsView extends RecyclerView {
  public xp0 N0;
  
  public rq0 O0;
  
  public a3 P0;
  
  public boolean Q0;
  
  public final Handler R0 = new Handler();
  
  public boolean S0 = false;
  
  public final HashSet T0 = new HashSet(4);
  
  public boolean U0;
  
  public int V0 = 0;
  
  public boolean W0 = false;
  
  public final e3 X0 = new e3(18, this);
  
  public int Y0;
  
  public int Z0 = -1;
  
  public int a1;
  
  public int b1;
  
  public int c1;
  
  public float d1;
  
  public float e1;
  
  public LyricsView(Context paramContext) {
    super(paramContext);
    t0(null);
  }
  
  public LyricsView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    t0(paramAttributeSet);
  }
  
  public LyricsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    t0(paramAttributeSet);
  }
  
  private ArrayList<Integer> getSelectedLineNumbersSorted() {
    ArrayList<Comparable> arrayList = new ArrayList(this.T0);
    Collections.sort(arrayList);
    return (ArrayList)arrayList;
  }
  
  public final void Y(int paramInt) {
    x0(paramInt);
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction();
    boolean bool = true;
    if (i == 1 && D(paramMotionEvent.getX(), paramMotionEvent.getY()) == null) {
      float f1 = Math.abs(paramMotionEvent.getX() - this.d1);
      float f2 = Math.abs(paramMotionEvent.getY() - this.e1);
      i = bool;
      if (f1 < 10.0F)
        if (f2 >= 10.0F) {
          i = bool;
        } else {
          i = 0;
        }  
      rq0 rq01 = this.O0;
      if (rq01 != null && i == 0)
        rq01.l(); 
    } else if (paramMotionEvent.getAction() == 0) {
      this.d1 = paramMotionEvent.getX();
      this.e1 = paramMotionEvent.getY();
    } 
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public int[] getABRepeatTimesArrayMs() {
    if (!this.T0.isEmpty()) {
      ArrayList<Integer> arrayList = getSelectedLineNumbersSorted();
      Integer integer2 = arrayList.get(0);
      Integer integer1 = arrayList.get(arrayList.size() - 1);
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = -1;
      arrayOfInt[1] = -1;
      arrayOfInt[0] = this.N0.c(integer2.intValue());
      while (integer1.intValue() < this.N0.a.size() - 1) {
        int j = this.N0.c(integer1.intValue() + 1);
        arrayOfInt[1] = j;
        if (j == -1)
          integer1 = Integer.valueOf(integer1.intValue() + 1); 
      } 
      if (integer1.intValue() == this.N0.a.size() - 1 && arrayOfInt[1] == -1)
        arrayOfInt[1] = this.O0.q() - 500; 
      int i = arrayOfInt[0];
      if (i >= 0) {
        int j = arrayOfInt[1];
        if (i + 150 < j) {
          arrayOfInt[1] = j - 150;
          return arrayOfInt;
        } 
      } 
    } 
    return null;
  }
  
  public int getSelectedLinesSize() {
    return this.T0.size();
  }
  
  public CharSequence getSelectedTextString() {
    StringBuilder stringBuilder = new StringBuilder();
    if (this.S0) {
      ArrayList<Integer> arrayList = getSelectedLineNumbersSorted();
      int i = arrayList.size();
      for (byte b = 0; b < i; b++) {
        if (b > 0)
          stringBuilder.append('\n'); 
        Integer integer = arrayList.get(b);
        stringBuilder.append(this.N0.b(integer.intValue()));
      } 
    } 
    return stringBuilder;
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.R0.removeCallbacks((Runnable)this.X0);
  }
  
  public void setHighlightBgColor(int paramInt) {
    this.b1 = paramInt;
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public void setSeekableOn(int paramInt) {
    this.Y0 = paramInt;
  }
  
  public void setSelectionModeOn(boolean paramBoolean) {
    rq0 rq01 = this.O0;
    if (rq01 != null && rq01.a()) {
      if (!paramBoolean)
        this.T0.clear(); 
      this.S0 = paramBoolean;
      a3 a31 = this.P0;
      if (a31 != null)
        a31.g(); 
      this.O0.t();
      if (!paramBoolean)
        this.U0 = false; 
    } 
  }
  
  public final void t0(AttributeSet paramAttributeSet) {
    int[] arrayOfInt = m92.h;
    this.a1 = arrayOfInt[5];
    this.b1 = arrayOfInt[12];
    this.c1 = arrayOfInt[6];
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, cc1.b);
      this.a1 = typedArray.getColor(0, this.a1);
      this.c1 = typedArray.getColor(2, this.c1);
      this.b1 = typedArray.getColor(1, this.b1);
      typedArray.recycle();
    } 
    setOverScrollMode(2);
    getContext();
    setLayoutManager((a)new LinearLayoutManager(1));
    setItemAnimator(null);
    u0();
  }
  
  public final void u0() {
    Parcelable parcelable;
    a a = getLayoutManager();
    if (a != null) {
      parcelable = a.t0();
    } else {
      parcelable = null;
    } 
    a3 a31 = new a3(this);
    this.P0 = a31;
    setAdapter((id1)a31);
    if (parcelable != null)
      a.s0(parcelable); 
    x0(getScrollState());
  }
  
  public final void v0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield X0 : Le3;
    //   4: astore #13
    //   6: aload_0
    //   7: getfield R0 : Landroid/os/Handler;
    //   10: astore #14
    //   12: aload #14
    //   14: ifnull -> 24
    //   17: aload #14
    //   19: aload #13
    //   21: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   24: aload_0
    //   25: getfield O0 : Lrq0;
    //   28: invokeinterface b : ()Z
    //   33: istore #8
    //   35: aload_0
    //   36: getfield N0 : Lxp0;
    //   39: getfield d : Z
    //   42: istore #7
    //   44: iconst_1
    //   45: istore_3
    //   46: iconst_0
    //   47: istore_2
    //   48: iload #7
    //   50: ifeq -> 161
    //   53: aload_0
    //   54: getfield S0 : Z
    //   57: ifne -> 161
    //   60: aload_0
    //   61: getfield O0 : Lrq0;
    //   64: invokeinterface E : ()I
    //   69: istore_1
    //   70: aload_0
    //   71: getfield N0 : Lxp0;
    //   74: iload_1
    //   75: invokevirtual a : (I)I
    //   78: istore_1
    //   79: aload_0
    //   80: iload_1
    //   81: invokevirtual I : (I)Lhe1;
    //   84: astore #12
    //   86: aload #12
    //   88: ifnonnull -> 133
    //   91: iinc #1, -1
    //   94: iload_1
    //   95: iflt -> 133
    //   98: aload_0
    //   99: getfield N0 : Lxp0;
    //   102: iload_1
    //   103: invokevirtual b : (I)Ljava/lang/String;
    //   106: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   109: ifne -> 127
    //   112: aload_0
    //   113: iload_1
    //   114: invokevirtual I : (I)Lhe1;
    //   117: astore #11
    //   119: goto -> 136
    //   122: astore #11
    //   124: goto -> 166
    //   127: iinc #1, -1
    //   130: goto -> 94
    //   133: aconst_null
    //   134: astore #11
    //   136: aload #12
    //   138: ifnonnull -> 146
    //   141: aload #11
    //   143: ifnull -> 161
    //   146: aload_0
    //   147: invokevirtual getScrollState : ()I
    //   150: istore_1
    //   151: iload_1
    //   152: iconst_1
    //   153: if_icmpeq -> 161
    //   156: iconst_1
    //   157: istore_1
    //   158: goto -> 174
    //   161: iconst_0
    //   162: istore_1
    //   163: goto -> 174
    //   166: aload #11
    //   168: invokevirtual printStackTrace : ()V
    //   171: goto -> 161
    //   174: aload_0
    //   175: getfield O0 : Lrq0;
    //   178: invokeinterface E : ()I
    //   183: istore #4
    //   185: aload_0
    //   186: getfield N0 : Lxp0;
    //   189: iload #4
    //   191: invokevirtual a : (I)I
    //   194: istore #5
    //   196: aload_0
    //   197: getfield Z0 : I
    //   200: istore #6
    //   202: iload #6
    //   204: iflt -> 216
    //   207: aload_0
    //   208: getfield P0 : La3;
    //   211: iload #6
    //   213: invokevirtual h : (I)V
    //   216: aload_0
    //   217: getfield P0 : La3;
    //   220: iload #5
    //   222: invokevirtual h : (I)V
    //   225: aload_0
    //   226: iload #5
    //   228: putfield Z0 : I
    //   231: iload #8
    //   233: ifeq -> 246
    //   236: iload_1
    //   237: ifeq -> 246
    //   240: aload_0
    //   241: iload #5
    //   243: invokestatic w0 : (Lin/krosbits/android/widgets/LyricsView;I)V
    //   246: aload #14
    //   248: ifnull -> 477
    //   251: iload #8
    //   253: ifeq -> 477
    //   256: aload_0
    //   257: getfield N0 : Lxp0;
    //   260: getfield d : Z
    //   263: ifeq -> 477
    //   266: aload_0
    //   267: getfield O0 : Lrq0;
    //   270: invokeinterface f : ()Z
    //   275: ifeq -> 477
    //   278: aload_0
    //   279: invokevirtual getVisibility : ()I
    //   282: ifne -> 477
    //   285: aload_0
    //   286: getfield N0 : Lxp0;
    //   289: astore #11
    //   291: aload #11
    //   293: getfield b : Ljava/util/ArrayList;
    //   296: astore #15
    //   298: aload #15
    //   300: iconst_0
    //   301: invokevirtual get : (I)Ljava/lang/Object;
    //   304: checkcast android/util/Pair
    //   307: astore #12
    //   309: iload #4
    //   311: i2l
    //   312: lstore #9
    //   314: lload #9
    //   316: aload #12
    //   318: getfield first : Ljava/lang/Object;
    //   321: checkcast xr1
    //   324: getfield a : J
    //   327: lcmp
    //   328: ifge -> 359
    //   331: aload #11
    //   333: iload #4
    //   335: invokevirtual a : (I)I
    //   338: istore_1
    //   339: iload_1
    //   340: ifne -> 359
    //   343: iload #4
    //   345: aload #11
    //   347: iload_1
    //   348: invokevirtual c : (I)I
    //   351: if_icmpge -> 359
    //   354: iload_2
    //   355: istore_1
    //   356: goto -> 424
    //   359: aload #15
    //   361: invokevirtual size : ()I
    //   364: istore #5
    //   366: iload_3
    //   367: istore_1
    //   368: aload #12
    //   370: astore #11
    //   372: iload_1
    //   373: iload #5
    //   375: if_icmpge -> 412
    //   378: aload #15
    //   380: iload_1
    //   381: invokevirtual get : (I)Ljava/lang/Object;
    //   384: checkcast android/util/Pair
    //   387: astore #11
    //   389: aload #11
    //   391: getfield first : Ljava/lang/Object;
    //   394: checkcast xr1
    //   397: getfield a : J
    //   400: lload #9
    //   402: lcmp
    //   403: ifgt -> 412
    //   406: iinc #1, 1
    //   409: goto -> 368
    //   412: aload #11
    //   414: getfield second : Ljava/lang/Object;
    //   417: checkcast java/lang/Integer
    //   420: invokevirtual intValue : ()I
    //   423: istore_1
    //   424: iload_1
    //   425: aload_0
    //   426: getfield N0 : Lxp0;
    //   429: getfield a : Ljava/util/ArrayList;
    //   432: invokevirtual size : ()I
    //   435: if_icmpge -> 477
    //   438: aload_0
    //   439: getfield N0 : Lxp0;
    //   442: iload_1
    //   443: invokevirtual c : (I)I
    //   446: istore_1
    //   447: iload_1
    //   448: iload #4
    //   450: if_icmple -> 477
    //   453: aload #14
    //   455: aload #13
    //   457: iload_1
    //   458: iload #4
    //   460: isub
    //   461: i2f
    //   462: aload_0
    //   463: getfield O0 : Lrq0;
    //   466: invokeinterface k : ()F
    //   471: fdiv
    //   472: f2l
    //   473: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   476: pop
    //   477: return
    //   478: astore #11
    //   480: iload_2
    //   481: istore_1
    //   482: goto -> 424
    // Exception table:
    //   from	to	target	type
    //   60	86	122	finally
    //   98	119	122	finally
    //   146	151	122	finally
    //   298	309	478	finally
    //   314	339	478	finally
    //   343	354	478	finally
    //   359	366	478	finally
    //   378	406	478	finally
    //   412	424	478	finally
  }
  
  public final void w0(xp0 paramxp0, rq0 paramrq0) {
    boolean bool = Objects.equals(paramxp0, this.N0);
    this.N0 = paramxp0;
    this.O0 = paramrq0;
    if (paramxp0 != null)
      try {
        this.P0.g();
        if (!bool)
          k0(0); 
      } finally {
        paramxp0 = null;
      }  
  }
  
  public final void x0(int paramInt) {
    int i = this.V0;
    if (i != paramInt) {
      if (paramInt == 1)
        this.W0 = true; 
      if (this.W0 && i == 0 && paramInt != 1)
        this.W0 = false; 
      this.V0 = paramInt;
      try {
        return;
      } finally {
        Exception exception = null;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\LyricsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */