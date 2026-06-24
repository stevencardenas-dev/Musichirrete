package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import bx0;
import i6;
import mv1;
import r1;
import rr;
import rw0;
import u1;
import u32;
import u6;

public class ContentFrameLayout extends FrameLayout {
  public TypedValue b;
  
  public TypedValue c;
  
  public TypedValue e;
  
  public TypedValue f;
  
  public TypedValue g;
  
  public TypedValue h;
  
  public final Rect i = new Rect();
  
  public rr j;
  
  public ContentFrameLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public TypedValue getFixedHeightMajor() {
    if (this.g == null)
      this.g = new TypedValue(); 
    return this.g;
  }
  
  public TypedValue getFixedHeightMinor() {
    if (this.h == null)
      this.h = new TypedValue(); 
    return this.h;
  }
  
  public TypedValue getFixedWidthMajor() {
    if (this.e == null)
      this.e = new TypedValue(); 
    return this.e;
  }
  
  public TypedValue getFixedWidthMinor() {
    if (this.f == null)
      this.f = new TypedValue(); 
    return this.f;
  }
  
  public TypedValue getMinWidthMajor() {
    if (this.b == null)
      this.b = new TypedValue(); 
    return this.b;
  }
  
  public TypedValue getMinWidthMinor() {
    if (this.c == null)
      this.c = new TypedValue(); 
    return this.c;
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    rr rr1 = this.j;
    if (rr1 != null)
      rr1.getClass(); 
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    rr rr1 = this.j;
    if (rr1 != null) {
      u6 u6 = ((i6)rr1).c;
      ActionBarOverlayLayout actionBarOverlayLayout = u6.s;
      if (actionBarOverlayLayout != null) {
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((mv1)actionBarOverlayLayout.g).a.b;
        if (actionMenuView != null) {
          u1 u1 = actionMenuView.g;
          if (u1 != null) {
            u1.d();
            r1 r1 = u1.v;
            if (r1 != null && r1.b())
              ((bx0)r1).i.dismiss(); 
          } 
        } 
      } 
      if (u6.x != null) {
        u6.n.getDecorView().removeCallbacks((Runnable)u6.y);
        if (u6.x.isShowing())
          try {
            u6.x.dismiss();
          } catch (IllegalArgumentException illegalArgumentException) {} 
        u6.x = null;
      } 
      u32 u32 = u6.z;
      if (u32 != null)
        u32.b(); 
      rw0 rw0 = (u6.z(0)).h;
      if (rw0 != null)
        rw0.c(true); 
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getContext : ()Landroid/content/Context;
    //   4: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   7: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   10: astore #11
    //   12: aload #11
    //   14: getfield widthPixels : I
    //   17: istore #5
    //   19: aload #11
    //   21: getfield heightPixels : I
    //   24: istore #4
    //   26: iconst_1
    //   27: istore #7
    //   29: iload #5
    //   31: iload #4
    //   33: if_icmpge -> 42
    //   36: iconst_1
    //   37: istore #4
    //   39: goto -> 45
    //   42: iconst_0
    //   43: istore #4
    //   45: iload_1
    //   46: invokestatic getMode : (I)I
    //   49: istore #8
    //   51: iload_2
    //   52: invokestatic getMode : (I)I
    //   55: istore #6
    //   57: aload_0
    //   58: getfield i : Landroid/graphics/Rect;
    //   61: astore #10
    //   63: iload #8
    //   65: ldc -2147483648
    //   67: if_icmpne -> 198
    //   70: iload #4
    //   72: ifeq -> 84
    //   75: aload_0
    //   76: getfield f : Landroid/util/TypedValue;
    //   79: astore #9
    //   81: goto -> 90
    //   84: aload_0
    //   85: getfield e : Landroid/util/TypedValue;
    //   88: astore #9
    //   90: aload #9
    //   92: ifnull -> 198
    //   95: aload #9
    //   97: getfield type : I
    //   100: istore #5
    //   102: iload #5
    //   104: ifeq -> 198
    //   107: iload #5
    //   109: iconst_5
    //   110: if_icmpne -> 128
    //   113: aload #9
    //   115: aload #11
    //   117: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   120: fstore_3
    //   121: fload_3
    //   122: f2i
    //   123: istore #5
    //   125: goto -> 160
    //   128: iload #5
    //   130: bipush #6
    //   132: if_icmpne -> 157
    //   135: aload #11
    //   137: getfield widthPixels : I
    //   140: istore #5
    //   142: aload #9
    //   144: iload #5
    //   146: i2f
    //   147: iload #5
    //   149: i2f
    //   150: invokevirtual getFraction : (FF)F
    //   153: fstore_3
    //   154: goto -> 121
    //   157: iconst_0
    //   158: istore #5
    //   160: iload #5
    //   162: ifle -> 198
    //   165: iload #5
    //   167: aload #10
    //   169: getfield left : I
    //   172: aload #10
    //   174: getfield right : I
    //   177: iadd
    //   178: isub
    //   179: iload_1
    //   180: invokestatic getSize : (I)I
    //   183: invokestatic min : (II)I
    //   186: ldc 1073741824
    //   188: invokestatic makeMeasureSpec : (II)I
    //   191: istore #5
    //   193: iconst_1
    //   194: istore_1
    //   195: goto -> 203
    //   198: iload_1
    //   199: istore #5
    //   201: iconst_0
    //   202: istore_1
    //   203: iload #6
    //   205: ldc -2147483648
    //   207: if_icmpne -> 335
    //   210: iload #4
    //   212: ifeq -> 224
    //   215: aload_0
    //   216: getfield g : Landroid/util/TypedValue;
    //   219: astore #9
    //   221: goto -> 230
    //   224: aload_0
    //   225: getfield h : Landroid/util/TypedValue;
    //   228: astore #9
    //   230: aload #9
    //   232: ifnull -> 335
    //   235: aload #9
    //   237: getfield type : I
    //   240: istore #6
    //   242: iload #6
    //   244: ifeq -> 335
    //   247: iload #6
    //   249: iconst_5
    //   250: if_icmpne -> 268
    //   253: aload #9
    //   255: aload #11
    //   257: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   260: fstore_3
    //   261: fload_3
    //   262: f2i
    //   263: istore #6
    //   265: goto -> 300
    //   268: iload #6
    //   270: bipush #6
    //   272: if_icmpne -> 297
    //   275: aload #11
    //   277: getfield heightPixels : I
    //   280: istore #6
    //   282: aload #9
    //   284: iload #6
    //   286: i2f
    //   287: iload #6
    //   289: i2f
    //   290: invokevirtual getFraction : (FF)F
    //   293: fstore_3
    //   294: goto -> 261
    //   297: iconst_0
    //   298: istore #6
    //   300: iload #6
    //   302: ifle -> 335
    //   305: iload #6
    //   307: aload #10
    //   309: getfield top : I
    //   312: aload #10
    //   314: getfield bottom : I
    //   317: iadd
    //   318: isub
    //   319: iload_2
    //   320: invokestatic getSize : (I)I
    //   323: invokestatic min : (II)I
    //   326: ldc 1073741824
    //   328: invokestatic makeMeasureSpec : (II)I
    //   331: istore_2
    //   332: goto -> 335
    //   335: aload_0
    //   336: iload #5
    //   338: iload_2
    //   339: invokespecial onMeasure : (II)V
    //   342: aload_0
    //   343: invokevirtual getMeasuredWidth : ()I
    //   346: istore #6
    //   348: iload #6
    //   350: ldc 1073741824
    //   352: invokestatic makeMeasureSpec : (II)I
    //   355: istore #5
    //   357: iload_1
    //   358: ifne -> 493
    //   361: iload #8
    //   363: ldc -2147483648
    //   365: if_icmpne -> 493
    //   368: iload #4
    //   370: ifeq -> 382
    //   373: aload_0
    //   374: getfield c : Landroid/util/TypedValue;
    //   377: astore #9
    //   379: goto -> 388
    //   382: aload_0
    //   383: getfield b : Landroid/util/TypedValue;
    //   386: astore #9
    //   388: aload #9
    //   390: ifnull -> 493
    //   393: aload #9
    //   395: getfield type : I
    //   398: istore_1
    //   399: iload_1
    //   400: ifeq -> 493
    //   403: iload_1
    //   404: iconst_5
    //   405: if_icmpne -> 422
    //   408: aload #9
    //   410: aload #11
    //   412: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   415: fstore_3
    //   416: fload_3
    //   417: f2i
    //   418: istore_1
    //   419: goto -> 449
    //   422: iload_1
    //   423: bipush #6
    //   425: if_icmpne -> 447
    //   428: aload #11
    //   430: getfield widthPixels : I
    //   433: istore_1
    //   434: aload #9
    //   436: iload_1
    //   437: i2f
    //   438: iload_1
    //   439: i2f
    //   440: invokevirtual getFraction : (FF)F
    //   443: fstore_3
    //   444: goto -> 416
    //   447: iconst_0
    //   448: istore_1
    //   449: iload_1
    //   450: istore #4
    //   452: iload_1
    //   453: ifle -> 471
    //   456: iload_1
    //   457: aload #10
    //   459: getfield left : I
    //   462: aload #10
    //   464: getfield right : I
    //   467: iadd
    //   468: isub
    //   469: istore #4
    //   471: iload #6
    //   473: iload #4
    //   475: if_icmpge -> 493
    //   478: iload #4
    //   480: ldc 1073741824
    //   482: invokestatic makeMeasureSpec : (II)I
    //   485: istore_1
    //   486: iload #7
    //   488: istore #4
    //   490: goto -> 499
    //   493: iconst_0
    //   494: istore #4
    //   496: iload #5
    //   498: istore_1
    //   499: iload #4
    //   501: ifeq -> 510
    //   504: aload_0
    //   505: iload_1
    //   506: iload_2
    //   507: invokespecial onMeasure : (II)V
    //   510: return
  }
  
  public void setAttachListener(rr paramrr) {
    this.j = paramrr;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\ContentFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */