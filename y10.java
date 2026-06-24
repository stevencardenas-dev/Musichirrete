import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;

public class y10 extends ListView {
  public final Rect b = new Rect();
  
  public int c = 0;
  
  public int e = 0;
  
  public int f = 0;
  
  public int g = 0;
  
  public int h;
  
  public w10 i;
  
  public boolean j;
  
  public final boolean k;
  
  public boolean l;
  
  public go0 m;
  
  public e3 n;
  
  public y10(Context paramContext, boolean paramBoolean) {
    super(paramContext, null, 2130969107);
    this.k = paramBoolean;
    setCacheColorHint(0);
  }
  
  public final int a(int paramInt1, int paramInt2) {
    int k = getListPaddingTop();
    int i = getListPaddingBottom();
    int j = getDividerHeight();
    Drawable drawable = getDivider();
    ListAdapter listAdapter = getAdapter();
    if (listAdapter == null)
      return k + i; 
    i = k + i;
    if (j <= 0 || drawable == null)
      j = 0; 
    int n = listAdapter.getCount();
    k = 0;
    int m = 0;
    drawable = null;
    while (k < n) {
      int i2 = listAdapter.getItemViewType(k);
      int i1 = m;
      if (i2 != m) {
        drawable = null;
        i1 = i2;
      } 
      View view2 = listAdapter.getView(k, (View)drawable, (ViewGroup)this);
      ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
      ViewGroup.LayoutParams layoutParams1 = layoutParams2;
      if (layoutParams2 == null) {
        layoutParams1 = generateDefaultLayoutParams();
        view2.setLayoutParams(layoutParams1);
      } 
      m = layoutParams1.height;
      if (m > 0) {
        m = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
      } else {
        m = View.MeasureSpec.makeMeasureSpec(0, 0);
      } 
      view2.measure(paramInt1, m);
      view2.forceLayout();
      m = i;
      if (k > 0)
        m = i + j; 
      i = m + view2.getMeasuredHeight();
      if (i >= paramInt2)
        return paramInt2; 
      k++;
      m = i1;
      View view1 = view2;
    } 
    return i;
  }
  
  public final boolean b(MotionEvent paramMotionEvent, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore #8
    //   6: iconst_1
    //   7: istore #7
    //   9: iload #8
    //   11: iconst_1
    //   12: if_icmpeq -> 49
    //   15: iload #8
    //   17: iconst_2
    //   18: if_icmpeq -> 43
    //   21: iload #8
    //   23: iconst_3
    //   24: if_icmpeq -> 35
    //   27: iconst_1
    //   28: istore #13
    //   30: iconst_0
    //   31: istore_2
    //   32: goto -> 633
    //   35: iconst_0
    //   36: istore #13
    //   38: iconst_0
    //   39: istore_2
    //   40: goto -> 633
    //   43: iconst_1
    //   44: istore #13
    //   46: goto -> 52
    //   49: iconst_0
    //   50: istore #13
    //   52: aload_1
    //   53: iload_2
    //   54: invokevirtual findPointerIndex : (I)I
    //   57: istore #9
    //   59: iload #9
    //   61: ifge -> 67
    //   64: goto -> 35
    //   67: aload_1
    //   68: iload #9
    //   70: invokevirtual getX : (I)F
    //   73: f2i
    //   74: istore_2
    //   75: aload_1
    //   76: iload #9
    //   78: invokevirtual getY : (I)F
    //   81: f2i
    //   82: istore #10
    //   84: aload_0
    //   85: iload_2
    //   86: iload #10
    //   88: invokevirtual pointToPosition : (II)I
    //   91: istore #9
    //   93: iload #9
    //   95: iconst_m1
    //   96: if_icmpne -> 105
    //   99: iload #7
    //   101: istore_2
    //   102: goto -> 633
    //   105: aload_0
    //   106: iload #9
    //   108: aload_0
    //   109: invokevirtual getFirstVisiblePosition : ()I
    //   112: isub
    //   113: invokevirtual getChildAt : (I)Landroid/view/View;
    //   116: astore #15
    //   118: iload_2
    //   119: i2f
    //   120: fstore_3
    //   121: iload #10
    //   123: i2f
    //   124: fstore #4
    //   126: aload_0
    //   127: iconst_1
    //   128: putfield l : Z
    //   131: aload_0
    //   132: fload_3
    //   133: fload #4
    //   135: invokestatic a : (Landroid/view/View;FF)V
    //   138: aload_0
    //   139: invokevirtual isPressed : ()Z
    //   142: ifne -> 150
    //   145: aload_0
    //   146: iconst_1
    //   147: invokevirtual setPressed : (Z)V
    //   150: aload_0
    //   151: invokevirtual layoutChildren : ()V
    //   154: aload_0
    //   155: getfield h : I
    //   158: istore_2
    //   159: iload_2
    //   160: iconst_m1
    //   161: if_icmpeq -> 202
    //   164: aload_0
    //   165: iload_2
    //   166: aload_0
    //   167: invokevirtual getFirstVisiblePosition : ()I
    //   170: isub
    //   171: invokevirtual getChildAt : (I)Landroid/view/View;
    //   174: astore #16
    //   176: aload #16
    //   178: ifnull -> 202
    //   181: aload #16
    //   183: aload #15
    //   185: if_acmpeq -> 202
    //   188: aload #16
    //   190: invokevirtual isPressed : ()Z
    //   193: ifeq -> 202
    //   196: aload #16
    //   198: iconst_0
    //   199: invokevirtual setPressed : (Z)V
    //   202: aload_0
    //   203: iload #9
    //   205: putfield h : I
    //   208: aload #15
    //   210: fload_3
    //   211: aload #15
    //   213: invokevirtual getLeft : ()I
    //   216: i2f
    //   217: fsub
    //   218: fload #4
    //   220: aload #15
    //   222: invokevirtual getTop : ()I
    //   225: i2f
    //   226: fsub
    //   227: invokestatic a : (Landroid/view/View;FF)V
    //   230: aload #15
    //   232: invokevirtual isPressed : ()Z
    //   235: ifne -> 244
    //   238: aload #15
    //   240: iconst_1
    //   241: invokevirtual setPressed : (Z)V
    //   244: aload_0
    //   245: invokevirtual getSelector : ()Landroid/graphics/drawable/Drawable;
    //   248: astore #17
    //   250: aload #17
    //   252: ifnull -> 266
    //   255: iload #9
    //   257: iconst_m1
    //   258: if_icmpeq -> 266
    //   261: iconst_1
    //   262: istore_2
    //   263: goto -> 268
    //   266: iconst_0
    //   267: istore_2
    //   268: iload_2
    //   269: ifeq -> 280
    //   272: aload #17
    //   274: iconst_0
    //   275: iconst_0
    //   276: invokevirtual setVisible : (ZZ)Z
    //   279: pop
    //   280: aload #15
    //   282: invokevirtual getLeft : ()I
    //   285: istore #10
    //   287: aload #15
    //   289: invokevirtual getTop : ()I
    //   292: istore #12
    //   294: aload #15
    //   296: invokevirtual getRight : ()I
    //   299: istore #11
    //   301: aload #15
    //   303: invokevirtual getBottom : ()I
    //   306: istore #7
    //   308: aload_0
    //   309: getfield b : Landroid/graphics/Rect;
    //   312: astore #16
    //   314: aload #16
    //   316: iload #10
    //   318: iload #12
    //   320: iload #11
    //   322: iload #7
    //   324: invokevirtual set : (IIII)V
    //   327: aload #16
    //   329: aload #16
    //   331: getfield left : I
    //   334: aload_0
    //   335: getfield c : I
    //   338: isub
    //   339: putfield left : I
    //   342: aload #16
    //   344: aload #16
    //   346: getfield top : I
    //   349: aload_0
    //   350: getfield e : I
    //   353: isub
    //   354: putfield top : I
    //   357: aload #16
    //   359: aload #16
    //   361: getfield right : I
    //   364: aload_0
    //   365: getfield f : I
    //   368: iadd
    //   369: putfield right : I
    //   372: aload #16
    //   374: aload #16
    //   376: getfield bottom : I
    //   379: aload_0
    //   380: getfield g : I
    //   383: iadd
    //   384: putfield bottom : I
    //   387: getstatic android/os/Build$VERSION.SDK_INT : I
    //   390: bipush #33
    //   392: if_icmplt -> 404
    //   395: aload_0
    //   396: invokestatic a : (Landroid/widget/AbsListView;)Z
    //   399: istore #13
    //   401: goto -> 435
    //   404: getstatic x10.a : Ljava/lang/reflect/Field;
    //   407: astore #18
    //   409: aload #18
    //   411: ifnull -> 432
    //   414: aload #18
    //   416: aload_0
    //   417: invokevirtual getBoolean : (Ljava/lang/Object;)Z
    //   420: istore #13
    //   422: goto -> 435
    //   425: astore #18
    //   427: aload #18
    //   429: invokevirtual printStackTrace : ()V
    //   432: iconst_0
    //   433: istore #13
    //   435: aload #15
    //   437: invokevirtual isEnabled : ()Z
    //   440: iload #13
    //   442: if_icmpeq -> 509
    //   445: iload #13
    //   447: iconst_1
    //   448: ixor
    //   449: istore #13
    //   451: getstatic android/os/Build$VERSION.SDK_INT : I
    //   454: bipush #33
    //   456: if_icmplt -> 468
    //   459: aload_0
    //   460: iload #13
    //   462: invokestatic b : (Landroid/widget/AbsListView;Z)V
    //   465: goto -> 499
    //   468: getstatic x10.a : Ljava/lang/reflect/Field;
    //   471: astore #18
    //   473: aload #18
    //   475: ifnull -> 499
    //   478: aload #18
    //   480: aload_0
    //   481: iload #13
    //   483: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   486: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   489: goto -> 499
    //   492: astore #18
    //   494: aload #18
    //   496: invokevirtual printStackTrace : ()V
    //   499: iload #9
    //   501: iconst_m1
    //   502: if_icmpeq -> 509
    //   505: aload_0
    //   506: invokevirtual refreshDrawableState : ()V
    //   509: iload_2
    //   510: ifeq -> 561
    //   513: aload #16
    //   515: invokevirtual exactCenterX : ()F
    //   518: fstore #5
    //   520: aload #16
    //   522: invokevirtual exactCenterY : ()F
    //   525: fstore #6
    //   527: aload_0
    //   528: invokevirtual getVisibility : ()I
    //   531: ifne -> 540
    //   534: iconst_1
    //   535: istore #13
    //   537: goto -> 543
    //   540: iconst_0
    //   541: istore #13
    //   543: aload #17
    //   545: iload #13
    //   547: iconst_0
    //   548: invokevirtual setVisible : (ZZ)Z
    //   551: pop
    //   552: aload #17
    //   554: fload #5
    //   556: fload #6
    //   558: invokevirtual setHotspot : (FF)V
    //   561: aload_0
    //   562: invokevirtual getSelector : ()Landroid/graphics/drawable/Drawable;
    //   565: astore #16
    //   567: aload #16
    //   569: ifnull -> 586
    //   572: iload #9
    //   574: iconst_m1
    //   575: if_icmpeq -> 586
    //   578: aload #16
    //   580: fload_3
    //   581: fload #4
    //   583: invokevirtual setHotspot : (FF)V
    //   586: aload_0
    //   587: getfield i : Lw10;
    //   590: astore #16
    //   592: aload #16
    //   594: ifnull -> 603
    //   597: aload #16
    //   599: iconst_0
    //   600: putfield c : Z
    //   603: aload_0
    //   604: invokevirtual refreshDrawableState : ()V
    //   607: iload #8
    //   609: iconst_1
    //   610: if_icmpne -> 628
    //   613: aload_0
    //   614: aload #15
    //   616: iload #9
    //   618: aload_0
    //   619: iload #9
    //   621: invokevirtual getItemIdAtPosition : (I)J
    //   624: invokevirtual performItemClick : (Landroid/view/View;IJ)Z
    //   627: pop
    //   628: iconst_0
    //   629: istore_2
    //   630: iconst_1
    //   631: istore #13
    //   633: iload #13
    //   635: ifeq -> 642
    //   638: iload_2
    //   639: ifeq -> 682
    //   642: aload_0
    //   643: iconst_0
    //   644: putfield l : Z
    //   647: aload_0
    //   648: iconst_0
    //   649: invokevirtual setPressed : (Z)V
    //   652: aload_0
    //   653: invokevirtual drawableStateChanged : ()V
    //   656: aload_0
    //   657: aload_0
    //   658: getfield h : I
    //   661: aload_0
    //   662: invokevirtual getFirstVisiblePosition : ()I
    //   665: isub
    //   666: invokevirtual getChildAt : (I)Landroid/view/View;
    //   669: astore #15
    //   671: aload #15
    //   673: ifnull -> 682
    //   676: aload #15
    //   678: iconst_0
    //   679: invokevirtual setPressed : (Z)V
    //   682: aload_0
    //   683: getfield m : Lgo0;
    //   686: astore #15
    //   688: iload #13
    //   690: ifeq -> 740
    //   693: aload #15
    //   695: ifnonnull -> 710
    //   698: aload_0
    //   699: new go0
    //   702: dup
    //   703: aload_0
    //   704: invokespecial <init> : (Ly10;)V
    //   707: putfield m : Lgo0;
    //   710: aload_0
    //   711: getfield m : Lgo0;
    //   714: astore #15
    //   716: aload #15
    //   718: getfield r : Z
    //   721: istore #14
    //   723: aload #15
    //   725: iconst_1
    //   726: putfield r : Z
    //   729: aload #15
    //   731: aload_0
    //   732: aload_1
    //   733: invokevirtual onTouch : (Landroid/view/View;Landroid/view/MotionEvent;)Z
    //   736: pop
    //   737: goto -> 764
    //   740: aload #15
    //   742: ifnull -> 764
    //   745: aload #15
    //   747: getfield r : Z
    //   750: ifeq -> 758
    //   753: aload #15
    //   755: invokevirtual d : ()V
    //   758: aload #15
    //   760: iconst_0
    //   761: putfield r : Z
    //   764: iload #13
    //   766: ireturn
    // Exception table:
    //   from	to	target	type
    //   414	422	425	java/lang/IllegalAccessException
    //   478	489	492	java/lang/IllegalAccessException
  }
  
  public final void dispatchDraw(Canvas paramCanvas) {
    Rect rect = this.b;
    if (!rect.isEmpty()) {
      Drawable drawable = getSelector();
      if (drawable != null) {
        drawable.setBounds(rect);
        drawable.draw(paramCanvas);
      } 
    } 
    super.dispatchDraw(paramCanvas);
  }
  
  public final void drawableStateChanged() {
    if (this.n == null) {
      super.drawableStateChanged();
      w10 w101 = this.i;
      if (w101 != null)
        w101.c = true; 
      Drawable drawable = getSelector();
      if (drawable != null && this.l && isPressed())
        drawable.setState(getDrawableState()); 
    } 
  }
  
  public final boolean hasFocus() {
    return (this.k || super.hasFocus());
  }
  
  public final boolean hasWindowFocus() {
    return (this.k || super.hasWindowFocus());
  }
  
  public final boolean isFocused() {
    return (this.k || super.isFocused());
  }
  
  public final boolean isInTouchMode() {
    return ((this.k && this.j) || super.isInTouchMode());
  }
  
  public final void onDetachedFromWindow() {
    this.n = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    int i = Build.VERSION.SDK_INT;
    if (i < 26)
      return super.onHoverEvent(paramMotionEvent); 
    int j = paramMotionEvent.getActionMasked();
    if (j == 10 && this.n == null) {
      e3 e31 = new e3(9, this);
      this.n = e31;
      post(e31);
    } 
    boolean bool = super.onHoverEvent(paramMotionEvent);
    if (j == 9 || j == 7) {
      j = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if (j != -1 && j != getSelectedItemPosition()) {
        View view = getChildAt(j - getFirstVisiblePosition());
        if (view.isEnabled()) {
          requestFocus();
          if (i >= 30 && u10.d) {
            Integer integer = Integer.valueOf(-1);
            try {
              u10.a.invoke(this, new Object[] { Integer.valueOf(j), view, Boolean.FALSE, integer, integer });
              u10.b.invoke(this, new Object[] { Integer.valueOf(j) });
              u10.c.invoke(this, new Object[] { Integer.valueOf(j) });
            } catch (IllegalAccessException illegalAccessException) {
              illegalAccessException.printStackTrace();
            } catch (InvocationTargetException invocationTargetException) {}
          } else {
            setSelectionFromTop(j, invocationTargetException.getTop() - getTop());
          } 
        } 
      } else {
        return bool;
      } 
    } else {
      setSelection(-1);
      return bool;
    } 
    Drawable drawable = getSelector();
    if (drawable != null && this.l && isPressed())
      drawable.setState(getDrawableState()); 
    return bool;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 0)
      this.h = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()); 
    e3 e31 = this.n;
    if (e31 != null) {
      y10 y101 = (y10)e31.c;
      y101.n = null;
      y101.removeCallbacks(e31);
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setListSelectionHidden(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable) {
    Drawable drawable = null;
    if (paramDrawable != null) {
      drawable = new Drawable();
      Drawable drawable1 = ((w10)drawable).b;
      if (drawable1 != null)
        drawable1.setCallback(null); 
      ((w10)drawable).b = paramDrawable;
      paramDrawable.setCallback((Drawable.Callback)drawable);
      ((w10)drawable).c = true;
    } 
    this.i = (w10)drawable;
    super.setSelector(drawable);
    Rect rect = new Rect();
    if (paramDrawable != null)
      paramDrawable.getPadding(rect); 
    this.c = rect.left;
    this.e = rect.top;
    this.f = rect.right;
    this.g = rect.bottom;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */