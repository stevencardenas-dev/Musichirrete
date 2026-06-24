import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateProgressDrawable;

public final class ss0 extends Dialog implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, DialogInterface.OnShowListener {
  public final MDRootLayout b;
  
  public DialogInterface.OnShowListener c;
  
  public final ms0 e;
  
  public final RecyclerView f;
  
  public final ImageView g;
  
  public final TextView h;
  
  public final View i;
  
  public final ProgressBar j;
  
  public final TextView k;
  
  public final TextView l;
  
  public final TextView m;
  
  public final EditText n;
  
  public final TextView o;
  
  public final CheckBox p;
  
  public final MDButton q;
  
  public final MDButton r;
  
  public final MDButton s;
  
  public final int t;
  
  public final ArrayList u;
  
  public Integer v;
  
  public final Handler w = new Handler();
  
  public ss0(ms0 paramms0) {
    super(context, i);
    this.e = paramms0;
    LayoutInflater layoutInflater = LayoutInflater.from(context);
    if (paramms0.u != null) {
      i = 2131493093;
    } else {
      ArrayList arrayList = paramms0.p;
      if ((arrayList != null && arrayList.size() > 0) || paramms0.U != null) {
        if (paramms0.o0 != null) {
          i = 2131493097;
        } else {
          i = 2131493096;
        } 
      } else if (paramms0.f0 > -2) {
        i = 2131493098;
      } else if (paramms0.d0) {
        if (paramms0.t0) {
          i = 2131493100;
        } else {
          i = 2131493099;
        } 
      } else {
        ns0 ns0 = paramms0.j0;
        CharSequence charSequence = paramms0.o0;
        if (ns0 != null) {
          if (charSequence != null) {
            i = 2131493095;
          } else {
            i = 2131493094;
          } 
        } else if (charSequence != null) {
          i = 2131493091;
        } else {
          i = 2131493090;
        } 
      } 
    } 
    this.b = (MDRootLayout)layoutInflater.inflate(i, null);
    setCancelable(paramms0.J);
    setCanceledOnTouchOutside(paramms0.K);
    if (paramms0.b0 == 0)
      paramms0.b0 = dd1.j0(context, 2130969610, dd1.j0(getContext(), 2130968894, 0)); 
    if (paramms0.b0 != 0) {
      GradientDrawable gradientDrawable = new GradientDrawable();
      gradientDrawable.setCornerRadius(context.getResources().getDimension(2131166062));
      gradientDrawable.setColor(paramms0.b0);
      this.b.setBackground((Drawable)gradientDrawable);
    } 
    if (!paramms0.v0)
      paramms0.w = dd1.h0(context, 2130969633, paramms0.w); 
    if (!paramms0.w0)
      paramms0.y = dd1.h0(context, 2130969632, paramms0.y); 
    if (!paramms0.x0)
      paramms0.x = dd1.h0(context, 2130969631, paramms0.x); 
    if (!paramms0.y0)
      paramms0.v = dd1.j0(context, 2130969638, paramms0.v); 
    if (!paramms0.u0)
      paramms0.m = dd1.j0(context, 2130969636, dd1.j0(getContext(), 16842806, 0)); 
    int i = dd1.j0(context, 2130969618, dd1.j0(getContext(), 16842808, 0));
    paramms0.n = i;
    paramms0.c0 = dd1.j0(context, 2130969626, i);
    this.h = (TextView)this.b.findViewById(2131297108);
    this.g = (ImageView)this.b.findViewById(2131297103);
    this.i = this.b.findViewById(2131297109);
    this.m = (TextView)this.b.findViewById(2131297095);
    this.f = (RecyclerView)this.b.findViewById(2131297097);
    this.p = (CheckBox)this.b.findViewById(2131297106);
    this.q = (MDButton)this.b.findViewById(2131297080);
    this.r = (MDButton)this.b.findViewById(2131297079);
    this.s = (MDButton)this.b.findViewById(2131297078);
    if (paramms0.j0 != null && paramms0.q == null)
      paramms0.q = context.getText(17039370); 
    MDButton mDButton2 = this.q;
    if (paramms0.q != null) {
      i = 0;
    } else {
      i = 8;
    } 
    mDButton2.setVisibility(i);
    mDButton2 = this.r;
    if (paramms0.r != null) {
      i = 0;
    } else {
      i = 8;
    } 
    mDButton2.setVisibility(i);
    mDButton2 = this.s;
    if (paramms0.s != null) {
      i = 0;
    } else {
      i = 8;
    } 
    mDButton2.setVisibility(i);
    if (paramms0.S != null) {
      this.g.setVisibility(0);
      this.g.setImageDrawable(paramms0.S);
    } else {
      Drawable drawable = dd1.k0(context, 2130969623);
      ImageView imageView = this.g;
      if (drawable != null) {
        imageView.setVisibility(0);
        this.g.setImageDrawable(drawable);
      } else {
        imageView.setVisibility(8);
      } 
    } 
    int j = paramms0.T;
    i = j;
    if (j == -1) {
      TypedArray typedArray = context.getTheme().obtainStyledAttributes(new int[] { 2130969625 });
      try {
        i = typedArray.getDimensionPixelSize(0, -1);
      } finally {
        typedArray.recycle();
      } 
    } 
    if (dd1.i0(context, 2130969624, false))
      i = context.getResources().getDimensionPixelSize(2131166081); 
    if (i > -1) {
      this.g.setAdjustViewBounds(true);
      this.g.setMaxHeight(i);
      this.g.setMaxWidth(i);
      this.g.requestLayout();
    } 
    i = dd1.j0(context, 2130969622, dd1.j0(getContext(), 2130969621, 0));
    this.b.setDividerColor(i);
    TextView textView = this.h;
    if (textView != null) {
      n(textView, paramms0.R);
      this.h.setTextColor(paramms0.m);
      this.h.setGravity(paramms0.g.a());
      textView = this.h;
      i = paramms0.g.ordinal();
      if (i != 1) {
        if (i != 2) {
          i = 5;
        } else {
          i = 6;
        } 
      } else {
        i = 4;
      } 
      textView.setTextAlignment(i);
      CharSequence charSequence = paramms0.f;
      if (charSequence == null) {
        this.i.setVisibility(8);
      } else {
        this.h.setText(charSequence);
        this.i.setVisibility(0);
      } 
    } 
    textView = this.m;
    if (textView != null) {
      textView.setMovementMethod(paramms0.c);
      n(this.m, paramms0.Q);
      this.m.setLineSpacing(0.0F, paramms0.L);
      ColorStateList colorStateList = paramms0.z;
      TextView textView2 = this.m;
      if (colorStateList == null) {
        textView2.setLinkTextColor(dd1.j0(getContext(), 16842806, 0));
      } else {
        textView2.setLinkTextColor(colorStateList);
      } 
      this.m.setTextColor(paramms0.n);
      this.m.setGravity(paramms0.h.a());
      TextView textView1 = this.m;
      i = paramms0.h.ordinal();
      if (i != 1) {
        if (i != 2) {
          i = 5;
        } else {
          i = 6;
        } 
      } else {
        i = 4;
      } 
      textView1.setTextAlignment(i);
      CharSequence charSequence = paramms0.o;
      textView2 = this.m;
      if (charSequence != null) {
        textView2.setText(charSequence);
        this.m.setVisibility(0);
      } else {
        textView2.setVisibility(8);
      } 
    } 
    CheckBox checkBox = this.p;
    if (checkBox != null) {
      checkBox.setText(paramms0.o0);
      this.p.setChecked(paramms0.p0);
      this.p.setOnCheckedChangeListener(this);
      n((TextView)this.p, paramms0.Q);
      this.p.setTextColor(paramms0.n);
      z51.K(this.p, paramms0.v);
    } 
    this.b.setButtonGravity(paramms0.k);
    this.b.setButtonStackedGravity(paramms0.i);
    this.b.setStackingBehavior(paramms0.Z);
    boolean bool2 = dd1.i0(context, 16843660, true);
    bool1 = bool2;
    if (bool2)
      bool1 = dd1.i0(context, 2130970083, true); 
    MDButton mDButton1 = this.q;
    n((TextView)mDButton1, paramms0.R);
    mDButton1.setAllCapsCompat(bool1);
    mDButton1.setText(paramms0.q);
    mDButton1.setTextColor(paramms0.w);
    mDButton1 = this.q;
    qy qy2 = qy.b;
    mDButton1.setStackedSelector(b(qy2, true));
    this.q.setDefaultSelector(b(qy2, false));
    this.q.setTag(qy2);
    this.q.setOnClickListener(this);
    this.q.setVisibility(0);
    mDButton1 = this.s;
    n((TextView)mDButton1, paramms0.R);
    mDButton1.setAllCapsCompat(bool1);
    mDButton1.setText(paramms0.s);
    mDButton1.setTextColor(paramms0.x);
    mDButton1 = this.s;
    qy2 = qy.e;
    mDButton1.setStackedSelector(b(qy2, true));
    this.s.setDefaultSelector(b(qy2, false));
    this.s.setTag(qy2);
    this.s.setOnClickListener(this);
    this.s.setVisibility(0);
    mDButton1 = this.r;
    n((TextView)mDButton1, paramms0.R);
    mDButton1.setAllCapsCompat(bool1);
    mDButton1.setText(paramms0.r);
    mDButton1.setTextColor(paramms0.y);
    MDButton mDButton3 = this.r;
    qy qy1 = qy.c;
    mDButton3.setStackedSelector(b(qy1, true));
    this.r.setDefaultSelector(b(qy1, false));
    this.r.setTag(qy1);
    this.r.setOnClickListener(this);
    this.r.setVisibility(0);
    if (paramms0.G != null)
      this.u = new ArrayList(); 
    if (this.f != null && paramms0.U == null) {
      if (paramms0.F != null) {
        this.t = 2;
      } else if (paramms0.G != null) {
        this.t = 3;
        if (paramms0.N != null) {
          this.u = new ArrayList(Arrays.asList((Object[])paramms0.N));
          paramms0.N = null;
        } 
      } else {
        this.t = 1;
      } 
      i = x41.y(this.t);
      if (i != 0) {
        if (i != 1) {
          if (i == 2) {
            i = 2131493102;
          } else {
            l0.l("Not a valid list type");
            throw null;
          } 
        } else {
          i = 2131493103;
        } 
      } else {
        i = 2131493101;
      } 
      paramms0.U = new vw(this, i);
    } 
    if (paramms0.d0 || paramms0.f0 > -2) {
      ProgressBar progressBar = (ProgressBar)this.b.findViewById(16908301);
      this.j = progressBar;
      if (progressBar != null) {
        IndeterminateProgressDrawable indeterminateProgressDrawable;
        if (paramms0.d0) {
          IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable;
          if (paramms0.t0) {
            indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(context);
            indeterminateHorizontalProgressDrawable.setTint(paramms0.v);
            this.j.setProgressDrawable((Drawable)indeterminateHorizontalProgressDrawable);
            this.j.setIndeterminateDrawable((Drawable)indeterminateHorizontalProgressDrawable);
          } else {
            indeterminateProgressDrawable = new IndeterminateProgressDrawable((Context)indeterminateHorizontalProgressDrawable);
            indeterminateProgressDrawable.setTint(paramms0.v);
            this.j.setProgressDrawable((Drawable)indeterminateProgressDrawable);
            this.j.setIndeterminateDrawable((Drawable)indeterminateProgressDrawable);
          } 
        } else {
          HorizontalProgressDrawable horizontalProgressDrawable = new HorizontalProgressDrawable((Context)indeterminateProgressDrawable);
          horizontalProgressDrawable.setTint(paramms0.v);
          this.j.setProgressDrawable((Drawable)horizontalProgressDrawable);
          this.j.setIndeterminateDrawable((Drawable)horizontalProgressDrawable);
        } 
        if (!paramms0.d0 || paramms0.t0) {
          this.j.setIndeterminate(paramms0.t0);
          this.j.setProgress(0);
          this.j.setMax(paramms0.g0);
          TextView textView1 = (TextView)this.b.findViewById(2131297104);
          this.k = textView1;
          if (textView1 != null) {
            textView1.setTextColor(paramms0.n);
            n(this.k, paramms0.R);
            this.k.setText(paramms0.s0.format(0L));
          } 
          textView1 = (TextView)this.b.findViewById(2131297105);
          this.l = textView1;
          if (textView1 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            textView1.setTextColor(paramms0.n);
            n(this.l, paramms0.Q);
            bool1 = paramms0.e0;
            textView1 = this.l;
            if (bool1) {
              textView1.setVisibility(0);
              this.l.setText(String.format(paramms0.r0, new Object[] { Integer.valueOf(0), Integer.valueOf(paramms0.g0) }));
              marginLayoutParams = (ViewGroup.MarginLayoutParams)this.j.getLayoutParams();
              marginLayoutParams.leftMargin = 0;
              marginLayoutParams.rightMargin = 0;
            } else {
              marginLayoutParams.setVisibility(8);
            } 
          } else {
            paramms0.e0 = false;
          } 
        } 
      } 
    } 
    EditText editText = (EditText)this.b.findViewById(16908297);
    this.n = editText;
    if (editText != null) {
      n((TextView)editText, paramms0.Q);
      if (paramms0.h0 != null) {
        TextView textView2 = this.m;
        if (textView2 != null && textView2.getText() != null && this.m.getText().length() > 0)
          this.m.setTextSize(2, 12.0F); 
        this.n.setText(paramms0.h0);
      } 
      editText = this.n;
      if (editText != null)
        editText.addTextChangedListener(new vm(4, this)); 
      this.n.setHint(paramms0.i0);
      this.n.setSingleLine();
      this.n.setTextColor(paramms0.n);
      this.n.setHintTextColor(dd1.b(paramms0.n, 0.3F));
      z51.L(this.n, paramms0.v);
      i = paramms0.l0;
      if (i != -1) {
        this.n.setInputType(i);
        i = paramms0.l0;
        if (i != 144 && (i & 0x80) == 128)
          this.n.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance()); 
      } 
      TextView textView1 = (TextView)this.b.findViewById(2131297105);
      this.o = textView1;
      if (paramms0.m0 > 0 || paramms0.n0 > -1) {
        c(this.n.getText().toString().length(), paramms0.k0 ^ true);
      } else {
        textView1.setVisibility(8);
        this.o = null;
      } 
    } 
    if (paramms0.u != null) {
      ScrollView scrollView;
      ((MDRootLayout)this.b.findViewById(2131297107)).l = true;
      FrameLayout frameLayout = (FrameLayout)this.b.findViewById(2131297100);
      View view2 = paramms0.u;
      if (view2.getParent() != null)
        ((ViewGroup)view2.getParent()).removeView(view2); 
      View view1 = view2;
      if (paramms0.a0) {
        Resources resources = getContext().getResources();
        i = resources.getDimensionPixelSize(2131166078);
        scrollView = new ScrollView(getContext());
        j = resources.getDimensionPixelSize(2131166076);
        int k = resources.getDimensionPixelSize(2131166075);
        scrollView.setClipToPadding(false);
        if (view2 instanceof EditText) {
          scrollView.setPadding(i, j, i, k);
        } else {
          scrollView.setPadding(0, j, 0, k);
          view2.setPadding(i, 0, i, 0);
        } 
        scrollView.addView(view2, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -2));
      } 
      frameLayout.addView((View)scrollView, new ViewGroup.LayoutParams(-1, -2));
    } 
    DialogInterface.OnShowListener onShowListener = paramms0.Y;
    if (onShowListener != null)
      this.c = onShowListener; 
    DialogInterface.OnCancelListener onCancelListener = paramms0.X;
    if (onCancelListener != null)
      setOnCancelListener(onCancelListener); 
    DialogInterface.OnDismissListener onDismissListener = paramms0.W;
    if (onDismissListener != null)
      setOnDismissListener(onDismissListener); 
    super.setOnShowListener(this);
    if (this.f != null) {
      ArrayList arrayList = paramms0.p;
      if ((arrayList != null && arrayList.size() != 0) || paramms0.U != null) {
        if (paramms0.V == null) {
          getContext();
          paramms0.V = new LinearLayoutManager(1);
        } 
        this.f.setLayoutManager((a)paramms0.V);
        this.f.setAdapter(paramms0.U);
        if (this.t != 0)
          ((vw)paramms0.U).g = this; 
      } 
    } 
    super.setContentView((View)this.b);
    RecyclerView recyclerView = this.f;
    if (recyclerView != null)
      recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new l7(3, this)); 
    if (paramms0.e)
      paramms0.u.setPadding(0, 0, 0, 0); 
  }
  
  public static void n(TextView paramTextView, Typeface paramTypeface) {
    if (paramTypeface == null)
      return; 
    paramTextView.setPaintFlags(paramTextView.getPaintFlags() | 0x80);
    paramTextView.setTypeface(paramTypeface);
  }
  
  public final MDButton a(qy paramqy) {
    int i = paramqy.ordinal();
    return (i != 1) ? ((i != 2) ? this.q : this.s) : this.r;
  }
  
  public final Drawable b(qy paramqy, boolean paramBoolean) {
    ms0 ms01 = this.e;
    if (paramBoolean) {
      ms01.getClass();
      drawable = dd1.k0(ms01.b, 2130969615);
      return (drawable != null) ? drawable : dd1.k0(getContext(), 2130969615);
    } 
    int i = drawable.ordinal();
    if (i != 1) {
      if (i != 2) {
        ms01.getClass();
        drawable = dd1.k0(ms01.b, 2130969613);
        if (drawable != null)
          return drawable; 
        drawable = dd1.k0(getContext(), 2130969613);
        i = ms01.l;
        if (drawable instanceof RippleDrawable)
          ((RippleDrawable)drawable).setColor(ColorStateList.valueOf(i)); 
        return drawable;
      } 
      ms01.getClass();
      drawable = dd1.k0(ms01.b, 2130969611);
      if (drawable != null)
        return drawable; 
      drawable = dd1.k0(getContext(), 2130969611);
      i = ms01.l;
      if (drawable instanceof RippleDrawable)
        ((RippleDrawable)drawable).setColor(ColorStateList.valueOf(i)); 
      return drawable;
    } 
    ms01.getClass();
    Drawable drawable = dd1.k0(ms01.b, 2130969612);
    if (drawable != null)
      return drawable; 
    drawable = dd1.k0(getContext(), 2130969612);
    i = ms01.l;
    if (drawable instanceof RippleDrawable)
      ((RippleDrawable)drawable).setColor(ColorStateList.valueOf(i)); 
    return drawable;
  }
  
  public final void c(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield o : Landroid/widget/TextView;
    //   4: astore #5
    //   6: aload #5
    //   8: ifnull -> 198
    //   11: aload_0
    //   12: getfield e : Lms0;
    //   15: astore #6
    //   17: aload #6
    //   19: getfield n0 : I
    //   22: istore_3
    //   23: iconst_0
    //   24: istore #4
    //   26: iload_3
    //   27: ifle -> 75
    //   30: aload #5
    //   32: invokestatic getDefault : ()Ljava/util/Locale;
    //   35: ldc_w '%d/%d'
    //   38: iconst_2
    //   39: anewarray java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: iload_1
    //   45: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: aload #6
    //   53: getfield n0 : I
    //   56: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   59: aastore
    //   60: invokestatic format : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   63: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   66: aload #5
    //   68: iconst_0
    //   69: invokevirtual setVisibility : (I)V
    //   72: goto -> 82
    //   75: aload #5
    //   77: bipush #8
    //   79: invokevirtual setVisibility : (I)V
    //   82: iload_2
    //   83: ifeq -> 90
    //   86: iload_1
    //   87: ifeq -> 114
    //   90: aload #6
    //   92: getfield n0 : I
    //   95: istore_3
    //   96: iload_3
    //   97: ifle -> 105
    //   100: iload_1
    //   101: iload_3
    //   102: if_icmpgt -> 114
    //   105: iload_1
    //   106: aload #6
    //   108: getfield m0 : I
    //   111: if_icmpge -> 119
    //   114: iconst_1
    //   115: istore_1
    //   116: goto -> 121
    //   119: iconst_0
    //   120: istore_1
    //   121: iload_1
    //   122: ifeq -> 136
    //   125: aload #6
    //   127: invokevirtual getClass : ()Ljava/lang/Class;
    //   130: pop
    //   131: iconst_0
    //   132: istore_3
    //   133: goto -> 142
    //   136: aload #6
    //   138: getfield n : I
    //   141: istore_3
    //   142: iload_1
    //   143: ifeq -> 155
    //   146: aload #6
    //   148: invokevirtual getClass : ()Ljava/lang/Class;
    //   151: pop
    //   152: goto -> 162
    //   155: aload #6
    //   157: getfield v : I
    //   160: istore #4
    //   162: aload #6
    //   164: getfield n0 : I
    //   167: ifle -> 176
    //   170: aload #5
    //   172: iload_3
    //   173: invokevirtual setTextColor : (I)V
    //   176: aload_0
    //   177: getfield n : Landroid/widget/EditText;
    //   180: iload #4
    //   182: invokestatic L : (Landroid/widget/EditText;I)V
    //   185: aload_0
    //   186: getstatic qy.b : Lqy;
    //   189: invokevirtual a : (Lqy;)Lcom/afollestad/materialdialogs/internal/MDButton;
    //   192: iload_1
    //   193: iconst_1
    //   194: ixor
    //   195: invokevirtual setEnabled : (Z)V
    //   198: return
  }
  
  public final boolean d() {
    boolean bool;
    try {
      bool = super.isShowing();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void dismiss() {
    EditText editText = this.n;
    if (editText != null) {
      editText.setCursorVisible(false);
      editText.removeTextChangedListener(null);
    } 
    ms0 ms01 = this.e;
    try {
      InputMethodManager inputMethodManager = (InputMethodManager)ms01.b.getSystemService("input_method");
    } finally {
      ms01 = null;
    } 
    try {
      super.dismiss();
      setOnCancelListener(null);
      setOnDismissListener(null);
      this.c = null;
    } finally {}
  }
  
  public final boolean e(View paramView, int paramInt, boolean paramBoolean) {
    os0 os0;
    ArrayList<Integer> arrayList;
    boolean bool1 = paramView.isEnabled();
    boolean bool = false;
    if (!bool1)
      return false; 
    ms0 ms01 = this.e;
    int i = this.t;
    if (i == 0 || i == 1) {
      if (ms01.P)
        dismiss(); 
      if (!paramBoolean) {
        os0 = ms01.E;
        if (os0 != null)
          os0.G(this, paramInt, ms01.p.get(paramInt)); 
      } 
      return true;
    } 
    if (i == 3) {
      CheckBox checkBox = (CheckBox)os0.findViewById(2131297099);
      if (!checkBox.isEnabled())
        return false; 
      arrayList = this.u;
      if (!arrayList.contains(Integer.valueOf(paramInt))) {
        arrayList.add(Integer.valueOf(paramInt));
        if (ms01.H) {
          if (g()) {
            checkBox.setChecked(true);
            return true;
          } 
          arrayList.remove(Integer.valueOf(paramInt));
          return true;
        } 
        checkBox.setChecked(true);
        return true;
      } 
      arrayList.remove(Integer.valueOf(paramInt));
      checkBox.setChecked(false);
      if (ms01.H) {
        g();
        return true;
      } 
    } else if (i == 2) {
      RadioButton radioButton = (RadioButton)arrayList.findViewById(2131297099);
      if (!radioButton.isEnabled())
        return false; 
      i = ms01.M;
      if (ms01.P && ms01.q == null) {
        dismiss();
        ms01.M = paramInt;
        h((View)arrayList);
        paramBoolean = bool;
      } else if (ms01.I) {
        ms01.M = paramInt;
        paramBoolean = h((View)arrayList);
        ms01.M = i;
      } else {
        paramBoolean = true;
      } 
      if (paramBoolean) {
        ms01.M = paramInt;
        radioButton.setChecked(true);
        ms01.U.h(i);
        ms01.U.h(paramInt);
        return true;
      } 
    } 
    return true;
  }
  
  public final void f(DialogInterface paramDialogInterface) {
    DialogInterface.OnShowListener onShowListener = this.c;
    if (onShowListener != null)
      onShowListener.onShow(paramDialogInterface); 
  }
  
  public final View findViewById(int paramInt) {
    return this.b.findViewById(paramInt);
  }
  
  public final boolean g() {
    ms0 ms01 = this.e;
    ps0 ps01 = ms01.G;
    int i = 0;
    if (ps01 == null)
      return false; 
    ArrayList<Comparable> arrayList1 = this.u;
    Collections.sort(arrayList1);
    ArrayList<CharSequence> arrayList = new ArrayList();
    int j = arrayList1.size();
    while (i < j) {
      Integer integer = (Integer)arrayList1.get(i);
      int k = i + 1;
      integer = integer;
      i = k;
      if (integer.intValue() >= 0) {
        if (integer.intValue() > ms01.p.size() - 1) {
          i = k;
          continue;
        } 
        arrayList.add(ms01.p.get(integer.intValue()));
        i = k;
      } 
    } 
    ps0 ps02 = ms01.G;
    Integer[] arrayOfInteger = arrayList1.<Integer>toArray(new Integer[arrayList1.size()]);
    CharSequence[] arrayOfCharSequence = arrayList.<CharSequence>toArray(new CharSequence[arrayList.size()]);
    return ps02.F(arrayOfInteger);
  }
  
  public final boolean h(View paramView) {
    ms0 ms01 = this.e;
    if (ms01.F == null)
      return false; 
    int i = ms01.M;
    if (i >= 0 && i < ms01.p.size())
      CharSequence charSequence = ms01.p.get(ms01.M); 
    return ms01.F.b(this, ms01.M);
  }
  
  public final void i(qy paramqy, int paramInt) {
    CharSequence charSequence = getContext().getText(paramInt);
    int i = paramqy.ordinal();
    ms0 ms01 = this.e;
    boolean bool2 = false;
    boolean bool1 = false;
    paramInt = 0;
    if (i != 1) {
      if (i != 2) {
        ms01.q = charSequence;
        mDButton = this.q;
        mDButton.setText(charSequence);
        if (charSequence == null)
          paramInt = 8; 
        mDButton.setVisibility(paramInt);
        return;
      } 
      ((ms0)mDButton).s = charSequence;
      mDButton = this.s;
      mDButton.setText(charSequence);
      paramInt = bool2;
      if (charSequence == null)
        paramInt = 8; 
      mDButton.setVisibility(paramInt);
      return;
    } 
    ((ms0)mDButton).r = charSequence;
    MDButton mDButton = this.r;
    mDButton.setText(charSequence);
    paramInt = bool1;
    if (charSequence == null)
      paramInt = 8; 
    mDButton.setVisibility(paramInt);
  }
  
  public final boolean isShowing() {
    try {
      return super.isShowing();
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void j(int paramInt) {
    k(this.e.b.getString(paramInt));
  }
  
  public final void k(CharSequence paramCharSequence) {
    boolean bool;
    this.m.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence)) {
      bool = true;
    } else {
      bool = false;
    } 
    this.m.setVisibility(bool);
  }
  
  public final void l(int paramInt) {
    if (this.e.f0 > -2) {
      this.j.setMax(paramInt);
      return;
    } 
    tp.f("Cannot use setMaxProgress() on this dialog.");
  }
  
  public final void m(int paramInt) {
    ms0 ms01 = this.e;
    if (ms01.f0 > -2) {
      this.j.setProgress(paramInt);
      lf0 lf0 = new lf0(this, ms01.s0, ms01.r0, 1);
      this.w.post(lf0);
      return;
    } 
    tp.f("Cannot use setProgress() on this dialog.");
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {
    ms0 ms01 = this.e;
    CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ms01.q0;
    if (onCheckedChangeListener != null)
      onCheckedChangeListener.onCheckedChanged(paramCompoundButton, paramBoolean); 
    if (ms01.z0) {
      MDButton mDButton = this.q;
      if (mDButton != null)
        mDButton.setEnabled(paramBoolean); 
    } 
  }
  
  public final void onClick(View paramView) {
    qy qy = (qy)paramView.getTag();
    int i = qy.ordinal();
    ms0 ms01 = this.e;
    if (i != 0) {
      if (i != 1) {
        if (i == 2) {
          rs0 = ms01.B;
          if (rs0 != null)
            rs0.Q(this, qy); 
          if (ms01.P)
            cancel(); 
        } 
      } else {
        rs0 = ms01.C;
        if (rs0 != null)
          rs0.Q(this, qy); 
        if (ms01.P)
          dismiss(); 
      } 
    } else {
      rs0 rs01 = ms01.A;
      if (rs01 != null)
        rs01.Q(this, qy); 
      if (!ms01.I)
        h((View)rs0); 
      if (!ms01.H)
        g(); 
      ns0 ns0 = ms01.j0;
      if (ns0 != null) {
        EditText editText = this.n;
        if (editText != null)
          ns0.a(this, editText.getText()); 
      } 
      if (ms01.P)
        dismiss(); 
    } 
    rs0 rs0 = ms01.D;
    if (rs0 != null)
      rs0.Q(this, qy); 
  }
  
  public final void onDetachedFromWindow() {
    dismiss();
    super.onDetachedFromWindow();
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    ms0 ms01 = this.e;
    if (ms01.t)
      getWindow().addFlags(4718592); 
    EditText editText = this.n;
    if (editText != null) {
      editText.postDelayed(new vi2(8, this, ms01), 150L);
      getWindow().setSoftInputMode(32);
    } 
    if (ms01.z0) {
      CheckBox checkBox = this.p;
      if (checkBox != null)
        onCheckedChanged((CompoundButton)checkBox, checkBox.isChecked()); 
    } 
    try {
      DialogInterface.OnShowListener onShowListener = ms01.Y;
      if (onShowListener != null)
        this.c = onShowListener; 
    } finally {}
    if (ms01.X != null)
      setOnDismissListener(ms01.W); 
    f(paramDialogInterface);
  }
  
  public final void onStop() {
    super.onStop();
  }
  
  public final void setContentView(int paramInt) {
    throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
  }
  
  public final void setContentView(View paramView) {
    throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
  }
  
  public final void setOnShowListener(DialogInterface.OnShowListener paramOnShowListener) {
    this.c = paramOnShowListener;
  }
  
  public final void setTitle(int paramInt) {
    setTitle(this.e.b.getString(paramInt));
  }
  
  public final void setTitle(CharSequence paramCharSequence) {
    this.h.setText(paramCharSequence);
  }
  
  public final void show() {
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ss0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */