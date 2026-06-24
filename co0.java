import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import me.zhanghai.android.materialprogressbar.internal.pozR.kOkiWEITVb;

public class co0 implements rm1 {
  public static final Method C;
  
  public static final Method D;
  
  public boolean A;
  
  public final f7 B;
  
  public final Context b;
  
  public ListAdapter c;
  
  public y10 e;
  
  public final int f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  public final int j;
  
  public boolean k;
  
  public boolean l;
  
  public boolean m;
  
  public int n;
  
  public final int o;
  
  public kt p;
  
  public View q;
  
  public AdapterView.OnItemClickListener r;
  
  public AdapterView.OnItemSelectedListener s;
  
  public final zn0 t;
  
  public final bo0 u;
  
  public final ao0 v;
  
  public final zn0 w;
  
  public final Handler x;
  
  public final Rect y;
  
  public Rect z;
  
  static {
    if (Build.VERSION.SDK_INT <= 28) {
      try {
        C = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { boolean.class });
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
      } 
      try {
        D = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[] { Rect.class });
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
      } 
    } 
  }
  
  public co0(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: bipush #-2
    //   7: putfield f : I
    //   10: aload_0
    //   11: bipush #-2
    //   13: putfield g : I
    //   16: aload_0
    //   17: sipush #1002
    //   20: putfield j : I
    //   23: aload_0
    //   24: iconst_0
    //   25: putfield n : I
    //   28: aload_0
    //   29: ldc 2147483647
    //   31: putfield o : I
    //   34: aload_0
    //   35: new zn0
    //   38: dup
    //   39: aload_0
    //   40: iconst_1
    //   41: invokespecial <init> : (Lco0;I)V
    //   44: putfield t : Lzn0;
    //   47: aload_0
    //   48: new bo0
    //   51: dup
    //   52: iconst_0
    //   53: aload_0
    //   54: invokespecial <init> : (ILjava/lang/Object;)V
    //   57: putfield u : Lbo0;
    //   60: aload_0
    //   61: new ao0
    //   64: dup
    //   65: aload_0
    //   66: invokespecial <init> : (Lco0;)V
    //   69: putfield v : Lao0;
    //   72: aload_0
    //   73: new zn0
    //   76: dup
    //   77: aload_0
    //   78: iconst_0
    //   79: invokespecial <init> : (Lco0;I)V
    //   82: putfield w : Lzn0;
    //   85: aload_0
    //   86: new android/graphics/Rect
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: putfield y : Landroid/graphics/Rect;
    //   96: aload_0
    //   97: aload_1
    //   98: putfield b : Landroid/content/Context;
    //   101: aload_0
    //   102: new android/os/Handler
    //   105: dup
    //   106: aload_1
    //   107: invokevirtual getMainLooper : ()Landroid/os/Looper;
    //   110: invokespecial <init> : (Landroid/os/Looper;)V
    //   113: putfield x : Landroid/os/Handler;
    //   116: aload_1
    //   117: aload_2
    //   118: getstatic nc1.o : [I
    //   121: iload_3
    //   122: iconst_0
    //   123: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   126: astore #5
    //   128: aload_0
    //   129: aload #5
    //   131: iconst_0
    //   132: iconst_0
    //   133: invokevirtual getDimensionPixelOffset : (II)I
    //   136: putfield h : I
    //   139: aload #5
    //   141: iconst_1
    //   142: iconst_0
    //   143: invokevirtual getDimensionPixelOffset : (II)I
    //   146: istore #4
    //   148: aload_0
    //   149: iload #4
    //   151: putfield i : I
    //   154: iload #4
    //   156: ifeq -> 164
    //   159: aload_0
    //   160: iconst_1
    //   161: putfield k : Z
    //   164: aload #5
    //   166: invokevirtual recycle : ()V
    //   169: new android/widget/PopupWindow
    //   172: dup
    //   173: aload_1
    //   174: aload_2
    //   175: iload_3
    //   176: iconst_0
    //   177: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;II)V
    //   180: astore #5
    //   182: aload_1
    //   183: aload_2
    //   184: getstatic nc1.s : [I
    //   187: iload_3
    //   188: iconst_0
    //   189: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   192: astore_2
    //   193: aload_2
    //   194: iconst_2
    //   195: invokevirtual hasValue : (I)Z
    //   198: ifeq -> 212
    //   201: aload #5
    //   203: aload_2
    //   204: iconst_2
    //   205: iconst_0
    //   206: invokevirtual getBoolean : (IZ)Z
    //   209: invokevirtual setOverlapAnchor : (Z)V
    //   212: aload_2
    //   213: iconst_0
    //   214: invokevirtual hasValue : (I)Z
    //   217: ifeq -> 240
    //   220: aload_2
    //   221: iconst_0
    //   222: iconst_0
    //   223: invokevirtual getResourceId : (II)I
    //   226: istore_3
    //   227: iload_3
    //   228: ifeq -> 240
    //   231: aload_1
    //   232: iload_3
    //   233: invokestatic I : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   236: astore_1
    //   237: goto -> 246
    //   240: aload_2
    //   241: iconst_0
    //   242: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   245: astore_1
    //   246: aload #5
    //   248: aload_1
    //   249: invokevirtual setBackgroundDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   252: aload_2
    //   253: invokevirtual recycle : ()V
    //   256: aload_0
    //   257: aload #5
    //   259: putfield B : Lf7;
    //   262: aload #5
    //   264: iconst_1
    //   265: invokevirtual setInputMethodMode : (I)V
    //   268: return
  }
  
  public y10 a(Context paramContext, boolean paramBoolean) {
    return new y10(paramContext, paramBoolean);
  }
  
  public final boolean b() {
    return this.B.isShowing();
  }
  
  public final int c() {
    return this.h;
  }
  
  public final void d() {
    int i;
    int j;
    int n;
    boolean bool2;
    y10 y101 = this.e;
    Context context = this.b;
    f7 f71 = this.B;
    if (y101 == null) {
      y101 = a(context, this.A ^ true);
      this.e = y101;
      y101.setAdapter(this.c);
      this.e.setOnItemClickListener(this.r);
      this.e.setFocusable(true);
      this.e.setFocusableInTouchMode(true);
      this.e.setOnItemSelectedListener(new z10(1, this));
      this.e.setOnScrollListener(this.v);
      AdapterView.OnItemSelectedListener onItemSelectedListener = this.s;
      if (onItemSelectedListener != null)
        this.e.setOnItemSelectedListener(onItemSelectedListener); 
      f71.setContentView((View)this.e);
    } else {
      ViewGroup viewGroup = (ViewGroup)f71.getContentView();
    } 
    Drawable drawable = f71.getBackground();
    Rect rect = this.y;
    boolean bool1 = false;
    if (drawable != null) {
      drawable.getPadding(rect);
      int i1 = rect.top;
      i = rect.bottom + i1;
      j = i;
      if (!this.k) {
        this.i = -i1;
        j = i;
      } 
    } else {
      rect.setEmpty();
      j = 0;
    } 
    if (f71.getInputMethodMode() == 2) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    int k = xn0.a(f71, this.q, this.i, bool2);
    int m = this.f;
    if (m == -1) {
      i = k + j;
    } else {
      i = this.g;
      if (i != -2) {
        if (i != -1) {
          i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        } else {
          i = View.MeasureSpec.makeMeasureSpec((context.getResources().getDisplayMetrics()).widthPixels - rect.left + rect.right, 1073741824);
        } 
      } else {
        i = View.MeasureSpec.makeMeasureSpec((context.getResources().getDisplayMetrics()).widthPixels - rect.left + rect.right, -2147483648);
      } 
      k = this.e.a(i, k);
      if (k > 0) {
        i = this.e.getPaddingTop();
        i = this.e.getPaddingBottom() + i + j;
      } else {
        i = 0;
      } 
      i = k + i;
    } 
    if (f71.getInputMethodMode() == 2) {
      n = 1;
    } else {
      n = 0;
    } 
    f71.setWindowLayoutType(this.j);
    if (f71.isShowing()) {
      if (this.q.isAttachedToWindow()) {
        k = this.g;
        if (k == -1) {
          j = -1;
        } else {
          j = k;
          if (k == -2)
            j = this.q.getWidth(); 
        } 
        if (m == -1) {
          if (n) {
            k = i;
          } else {
            k = -1;
          } 
          m = this.g;
          if (n) {
            if (m == -1) {
              i = -1;
            } else {
              i = 0;
            } 
            f71.setWidth(i);
            f71.setHeight(0);
          } else {
            i = bool1;
            if (m == -1)
              i = -1; 
            f71.setWidth(i);
            f71.setHeight(-1);
          } 
        } else {
          k = m;
          if (m == -2)
            k = i; 
        } 
        f71.setOutsideTouchable(true);
        View view = this.q;
        n = this.h;
        m = this.i;
        if (j < 0) {
          i = -1;
        } else {
          i = j;
        } 
        j = k;
        if (k < 0)
          j = -1; 
        f71.update(view, n, m, i, j);
        return;
      } 
    } else {
      k = this.g;
      if (k == -1) {
        j = -1;
      } else {
        j = k;
        if (k == -2)
          j = this.q.getWidth(); 
      } 
      if (m == -1) {
        k = -1;
      } else {
        k = m;
        if (m == -2)
          k = i; 
      } 
      f71.setWidth(j);
      f71.setHeight(k);
      i = Build.VERSION.SDK_INT;
      String str = kOkiWEITVb.NPB;
      if (i <= 28) {
        Method method = C;
        if (method != null)
          try {
            method.invoke(f71, new Object[] { Boolean.TRUE });
          } catch (Exception exception) {
            Log.i(str, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
          }  
      } else {
        yn0.b(f71, true);
      } 
      f71.setOutsideTouchable(true);
      f71.setTouchInterceptor(this.u);
      if (this.m)
        f71.setOverlapAnchor(this.l); 
      if (Build.VERSION.SDK_INT <= 28) {
        Method method = D;
        if (method != null)
          try {
            method.invoke(f71, new Object[] { this.z });
          } catch (Exception exception) {
            Log.e(str, "Could not invoke setEpicenterBounds on PopupWindow", exception);
          }  
      } else {
        yn0.a(f71, this.z);
      } 
      f71.showAsDropDown(this.q, this.h, this.i, this.n);
      this.e.setSelection(-1);
      if (!this.A || this.e.isInTouchMode()) {
        y10 y102 = this.e;
        if (y102 != null) {
          y102.setListSelectionHidden(true);
          y102.requestLayout();
        } 
      } 
      if (!this.A)
        this.x.post(this.w); 
    } 
  }
  
  public final void dismiss() {
    f7 f71 = this.B;
    f71.dismiss();
    f71.setContentView(null);
    this.e = null;
    this.x.removeCallbacks(this.t);
  }
  
  public final Drawable e() {
    return this.B.getBackground();
  }
  
  public final y10 h() {
    return this.e;
  }
  
  public final void i(Drawable paramDrawable) {
    this.B.setBackgroundDrawable(paramDrawable);
  }
  
  public final void k(int paramInt) {
    this.i = paramInt;
    this.k = true;
  }
  
  public final void m(int paramInt) {
    this.h = paramInt;
  }
  
  public final int o() {
    return !this.k ? 0 : this.i;
  }
  
  public void q(ListAdapter paramListAdapter) {
    kt kt1 = this.p;
    if (kt1 == null) {
      this.p = new kt(1, this);
    } else {
      ListAdapter listAdapter = this.c;
      if (listAdapter != null)
        listAdapter.unregisterDataSetObserver(kt1); 
    } 
    this.c = paramListAdapter;
    if (paramListAdapter != null)
      paramListAdapter.registerDataSetObserver(this.p); 
    y10 y101 = this.e;
    if (y101 != null)
      y101.setAdapter(this.c); 
  }
  
  public final void r(int paramInt) {
    Drawable drawable = this.B.getBackground();
    if (drawable != null) {
      Rect rect = this.y;
      drawable.getPadding(rect);
      this.g = rect.left + rect.right + paramInt;
      return;
    } 
    this.g = paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\co0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */