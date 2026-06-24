import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.Ou.tlzLOCPTHRhep;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

public final class zs1 extends LinearLayout {
  public static final int n = 0;
  
  public ws1 b;
  
  public TextView c;
  
  public ImageView e;
  
  public View f;
  
  public ub g;
  
  public View h;
  
  public TextView i;
  
  public ImageView j;
  
  public Drawable k;
  
  public int l = 2;
  
  public final TabLayout m;
  
  public zs1(TabLayout paramTabLayout, Context paramContext) {
    super(paramContext);
    e(paramContext);
    setPaddingRelative(paramTabLayout.g, paramTabLayout.h, paramTabLayout.i, paramTabLayout.j);
    setGravity(17);
    setOrientation(paramTabLayout.G ^ true);
    setClickable(true);
    PointerIcon pointerIcon = PointerIcon.getSystemIcon(getContext(), 1002);
    WeakHashMap weakHashMap = v22.a;
    o22.a((View)this, pointerIcon);
  }
  
  private ub getBadge() {
    return this.g;
  }
  
  private ub getOrCreateBadge() {
    if (this.g == null)
      this.g = new ub(getContext()); 
    b();
    ub ub1 = this.g;
    if (ub1 != null)
      return ub1; 
    tp.f("Unable to create badge");
    return null;
  }
  
  public final void a() {
    if (this.g != null) {
      setClipChildren(true);
      setClipToPadding(true);
      ViewGroup viewGroup = (ViewGroup)getParent();
      if (viewGroup != null) {
        viewGroup.setClipChildren(true);
        viewGroup.setClipToPadding(true);
      } 
      View view = this.f;
      if (view != null) {
        ub ub1 = this.g;
        if (ub1 != null)
          if (ub1.e() != null) {
            ub1.e().setForeground(null);
          } else {
            view.getOverlay().remove(ub1);
          }  
        this.f = null;
      } 
    } 
  }
  
  public final void b() {
    if (this.g != null) {
      if (this.h != null) {
        a();
        return;
      } 
      ImageView imageView = this.e;
      if (imageView != null) {
        ws1 ws11 = this.b;
        if (ws11 != null && ws11.b != null) {
          ub ub1;
          if (this.f != imageView) {
            a();
            ImageView imageView1 = this.e;
            if (this.g != null && imageView1 != null) {
              setClipChildren(false);
              setClipToPadding(false);
              ViewGroup viewGroup = (ViewGroup)getParent();
              if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
              } 
              ub1 = this.g;
              Rect rect = new Rect();
              imageView1.getDrawingRect(rect);
              ub1.setBounds(rect);
              ub1.j((View)imageView1, null);
              if (ub1.e() != null) {
                ub1.e().setForeground(ub1);
              } else {
                imageView1.getOverlay().add(ub1);
              } 
              this.f = (View)imageView1;
              return;
            } 
          } else {
            c((View)ub1);
            return;
          } 
          return;
        } 
      } 
      TextView textView = this.c;
      if (textView != null && this.b != null) {
        if (this.f != textView) {
          a();
          textView = this.c;
          if (this.g != null && textView != null) {
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup)getParent();
            if (viewGroup != null) {
              viewGroup.setClipChildren(false);
              viewGroup.setClipToPadding(false);
            } 
            ub ub1 = this.g;
            Rect rect = new Rect();
            textView.getDrawingRect(rect);
            ub1.setBounds(rect);
            ub1.j((View)textView, null);
            if (ub1.e() != null) {
              ub1.e().setForeground(ub1);
            } else {
              textView.getOverlay().add(ub1);
            } 
            this.f = (View)textView;
          } 
          return;
        } 
        c((View)textView);
        return;
      } 
      a();
    } 
  }
  
  public final void c(View paramView) {
    ub ub1 = this.g;
    if (ub1 != null && paramView == this.f) {
      Rect rect = new Rect();
      paramView.getDrawingRect(rect);
      ub1.setBounds(rect);
      ub1.j(paramView, null);
    } 
  }
  
  public final void d() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual f : ()V
    //   4: aload_0
    //   5: getfield b : Lws1;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnull -> 54
    //   13: aload_3
    //   14: getfield g : Lcom/google/android/material/tabs/TabLayout;
    //   17: astore #4
    //   19: aload #4
    //   21: ifnull -> 48
    //   24: aload #4
    //   26: invokevirtual getSelectedTabPosition : ()I
    //   29: istore_1
    //   30: iload_1
    //   31: iconst_m1
    //   32: if_icmpeq -> 54
    //   35: iload_1
    //   36: aload_3
    //   37: getfield e : I
    //   40: if_icmpne -> 54
    //   43: iconst_1
    //   44: istore_2
    //   45: goto -> 56
    //   48: ldc 'Tab not attached to a TabLayout'
    //   50: invokestatic l : (Ljava/lang/String;)V
    //   53: return
    //   54: iconst_0
    //   55: istore_2
    //   56: aload_0
    //   57: iload_2
    //   58: invokevirtual setSelected : (Z)V
    //   61: return
  }
  
  public final void drawableStateChanged() {
    boolean bool;
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable drawable = this.k;
    if (drawable != null && drawable.isStateful()) {
      bool = this.k.setState(arrayOfInt);
    } else {
      bool = false;
    } 
    if (bool) {
      invalidate();
      this.m.invalidate();
    } 
  }
  
  public final void e(Context paramContext) {
    RippleDrawable rippleDrawable;
    TabLayout tabLayout = this.m;
    int i = tabLayout.w;
    GradientDrawable gradientDrawable3 = null;
    if (i != 0) {
      Drawable drawable = ws2.I(paramContext, i);
      this.k = drawable;
      if (drawable != null && drawable.isStateful())
        this.k.setState(getDrawableState()); 
    } else {
      this.k = null;
    } 
    GradientDrawable gradientDrawable1 = new GradientDrawable();
    gradientDrawable1.setColor(0);
    GradientDrawable gradientDrawable2 = gradientDrawable1;
    if (tabLayout.p != null) {
      gradientDrawable2 = new GradientDrawable();
      gradientDrawable2.setCornerRadius(1.0E-5F);
      gradientDrawable2.setColor(-1);
      ColorStateList colorStateList = yg1.a(tabLayout.p);
      boolean bool = tabLayout.K;
      if (bool)
        gradientDrawable1 = null; 
      if (bool)
        gradientDrawable2 = gradientDrawable3; 
      rippleDrawable = new RippleDrawable(colorStateList, (Drawable)gradientDrawable1, (Drawable)gradientDrawable2);
    } 
    setBackground((Drawable)rippleDrawable);
    tabLayout.invalidate();
  }
  
  public final void f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lws1;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull -> 17
    //   9: aload_3
    //   10: getfield f : Landroid/view/View;
    //   13: astore_2
    //   14: goto -> 19
    //   17: aconst_null
    //   18: astore_2
    //   19: aload_2
    //   20: ifnull -> 187
    //   23: aload_2
    //   24: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   27: astore #4
    //   29: aload #4
    //   31: aload_0
    //   32: if_acmpeq -> 89
    //   35: aload #4
    //   37: ifnull -> 49
    //   40: aload #4
    //   42: checkcast android/view/ViewGroup
    //   45: aload_2
    //   46: invokevirtual removeView : (Landroid/view/View;)V
    //   49: aload_0
    //   50: getfield h : Landroid/view/View;
    //   53: astore #4
    //   55: aload #4
    //   57: ifnull -> 84
    //   60: aload #4
    //   62: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   65: astore #4
    //   67: aload #4
    //   69: ifnull -> 84
    //   72: aload #4
    //   74: checkcast android/view/ViewGroup
    //   77: aload_0
    //   78: getfield h : Landroid/view/View;
    //   81: invokevirtual removeView : (Landroid/view/View;)V
    //   84: aload_0
    //   85: aload_2
    //   86: invokevirtual addView : (Landroid/view/View;)V
    //   89: aload_0
    //   90: aload_2
    //   91: putfield h : Landroid/view/View;
    //   94: aload_0
    //   95: getfield c : Landroid/widget/TextView;
    //   98: astore #4
    //   100: aload #4
    //   102: ifnull -> 112
    //   105: aload #4
    //   107: bipush #8
    //   109: invokevirtual setVisibility : (I)V
    //   112: aload_0
    //   113: getfield e : Landroid/widget/ImageView;
    //   116: astore #4
    //   118: aload #4
    //   120: ifnull -> 138
    //   123: aload #4
    //   125: bipush #8
    //   127: invokevirtual setVisibility : (I)V
    //   130: aload_0
    //   131: getfield e : Landroid/widget/ImageView;
    //   134: aconst_null
    //   135: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   138: aload_2
    //   139: ldc_w 16908308
    //   142: invokevirtual findViewById : (I)Landroid/view/View;
    //   145: checkcast android/widget/TextView
    //   148: astore #4
    //   150: aload_0
    //   151: aload #4
    //   153: putfield i : Landroid/widget/TextView;
    //   156: aload #4
    //   158: ifnull -> 170
    //   161: aload_0
    //   162: aload #4
    //   164: invokevirtual getMaxLines : ()I
    //   167: putfield l : I
    //   170: aload_0
    //   171: aload_2
    //   172: ldc_w 16908294
    //   175: invokevirtual findViewById : (I)Landroid/view/View;
    //   178: checkcast android/widget/ImageView
    //   181: putfield j : Landroid/widget/ImageView;
    //   184: goto -> 216
    //   187: aload_0
    //   188: getfield h : Landroid/view/View;
    //   191: astore_2
    //   192: aload_2
    //   193: ifnull -> 206
    //   196: aload_0
    //   197: aload_2
    //   198: invokevirtual removeView : (Landroid/view/View;)V
    //   201: aload_0
    //   202: aconst_null
    //   203: putfield h : Landroid/view/View;
    //   206: aload_0
    //   207: aconst_null
    //   208: putfield i : Landroid/widget/TextView;
    //   211: aload_0
    //   212: aconst_null
    //   213: putfield j : Landroid/widget/ImageView;
    //   216: aload_0
    //   217: getfield h : Landroid/view/View;
    //   220: ifnonnull -> 453
    //   223: aload_0
    //   224: getfield e : Landroid/widget/ImageView;
    //   227: ifnonnull -> 260
    //   230: aload_0
    //   231: invokevirtual getContext : ()Landroid/content/Context;
    //   234: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   237: ldc_w 2131492936
    //   240: aload_0
    //   241: iconst_0
    //   242: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   245: checkcast android/widget/ImageView
    //   248: astore_2
    //   249: aload_0
    //   250: aload_2
    //   251: putfield e : Landroid/widget/ImageView;
    //   254: aload_0
    //   255: aload_2
    //   256: iconst_0
    //   257: invokevirtual addView : (Landroid/view/View;I)V
    //   260: aload_0
    //   261: getfield c : Landroid/widget/TextView;
    //   264: ifnonnull -> 307
    //   267: aload_0
    //   268: invokevirtual getContext : ()Landroid/content/Context;
    //   271: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   274: ldc_w 2131492937
    //   277: aload_0
    //   278: iconst_0
    //   279: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   282: checkcast android/widget/TextView
    //   285: astore_2
    //   286: aload_0
    //   287: aload_2
    //   288: putfield c : Landroid/widget/TextView;
    //   291: aload_0
    //   292: aload_2
    //   293: invokevirtual addView : (Landroid/view/View;)V
    //   296: aload_0
    //   297: aload_0
    //   298: getfield c : Landroid/widget/TextView;
    //   301: invokevirtual getMaxLines : ()I
    //   304: putfield l : I
    //   307: aload_0
    //   308: getfield c : Landroid/widget/TextView;
    //   311: astore #4
    //   313: aload_0
    //   314: getfield m : Lcom/google/android/material/tabs/TabLayout;
    //   317: astore_2
    //   318: aload #4
    //   320: aload_2
    //   321: getfield k : I
    //   324: invokevirtual setTextAppearance : (I)V
    //   327: aload_0
    //   328: invokevirtual isSelected : ()Z
    //   331: ifeq -> 355
    //   334: aload_2
    //   335: getfield m : I
    //   338: istore_1
    //   339: iload_1
    //   340: iconst_m1
    //   341: if_icmpeq -> 355
    //   344: aload_0
    //   345: getfield c : Landroid/widget/TextView;
    //   348: iload_1
    //   349: invokevirtual setTextAppearance : (I)V
    //   352: goto -> 366
    //   355: aload_0
    //   356: getfield c : Landroid/widget/TextView;
    //   359: aload_2
    //   360: getfield l : I
    //   363: invokevirtual setTextAppearance : (I)V
    //   366: aload_2
    //   367: getfield n : Landroid/content/res/ColorStateList;
    //   370: astore_2
    //   371: aload_2
    //   372: ifnull -> 383
    //   375: aload_0
    //   376: getfield c : Landroid/widget/TextView;
    //   379: aload_2
    //   380: invokevirtual setTextColor : (Landroid/content/res/ColorStateList;)V
    //   383: aload_0
    //   384: aload_0
    //   385: getfield c : Landroid/widget/TextView;
    //   388: aload_0
    //   389: getfield e : Landroid/widget/ImageView;
    //   392: iconst_1
    //   393: invokevirtual g : (Landroid/widget/TextView;Landroid/widget/ImageView;Z)V
    //   396: aload_0
    //   397: invokevirtual b : ()V
    //   400: aload_0
    //   401: getfield e : Landroid/widget/ImageView;
    //   404: astore_2
    //   405: aload_2
    //   406: ifnonnull -> 412
    //   409: goto -> 425
    //   412: aload_2
    //   413: new ys1
    //   416: dup
    //   417: aload_0
    //   418: aload_2
    //   419: invokespecial <init> : (Lzs1;Landroid/view/View;)V
    //   422: invokevirtual addOnLayoutChangeListener : (Landroid/view/View$OnLayoutChangeListener;)V
    //   425: aload_0
    //   426: getfield c : Landroid/widget/TextView;
    //   429: astore_2
    //   430: aload_2
    //   431: ifnonnull -> 437
    //   434: goto -> 479
    //   437: aload_2
    //   438: new ys1
    //   441: dup
    //   442: aload_0
    //   443: aload_2
    //   444: invokespecial <init> : (Lzs1;Landroid/view/View;)V
    //   447: invokevirtual addOnLayoutChangeListener : (Landroid/view/View$OnLayoutChangeListener;)V
    //   450: goto -> 479
    //   453: aload_0
    //   454: getfield i : Landroid/widget/TextView;
    //   457: astore_2
    //   458: aload_2
    //   459: ifnonnull -> 469
    //   462: aload_0
    //   463: getfield j : Landroid/widget/ImageView;
    //   466: ifnull -> 479
    //   469: aload_0
    //   470: aload_2
    //   471: aload_0
    //   472: getfield j : Landroid/widget/ImageView;
    //   475: iconst_0
    //   476: invokevirtual g : (Landroid/widget/TextView;Landroid/widget/ImageView;Z)V
    //   479: aload_3
    //   480: ifnull -> 501
    //   483: aload_3
    //   484: getfield d : Ljava/lang/CharSequence;
    //   487: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   490: ifne -> 501
    //   493: aload_0
    //   494: aload_3
    //   495: getfield d : Ljava/lang/CharSequence;
    //   498: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   501: return
  }
  
  public final void g(TextView paramTextView, ImageView paramImageView, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lws1;
    //   4: astore #7
    //   6: aconst_null
    //   7: astore #9
    //   9: aload #7
    //   11: ifnull -> 36
    //   14: aload #7
    //   16: getfield b : Landroid/graphics/drawable/Drawable;
    //   19: astore #7
    //   21: aload #7
    //   23: ifnull -> 36
    //   26: aload #7
    //   28: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   31: astore #8
    //   33: goto -> 39
    //   36: aconst_null
    //   37: astore #8
    //   39: aload_0
    //   40: getfield m : Lcom/google/android/material/tabs/TabLayout;
    //   43: astore #10
    //   45: aload #8
    //   47: ifnull -> 79
    //   50: aload #8
    //   52: aload #10
    //   54: getfield o : Landroid/content/res/ColorStateList;
    //   57: invokevirtual setTintList : (Landroid/content/res/ColorStateList;)V
    //   60: aload #10
    //   62: getfield s : Landroid/graphics/PorterDuff$Mode;
    //   65: astore #7
    //   67: aload #7
    //   69: ifnull -> 79
    //   72: aload #8
    //   74: aload #7
    //   76: invokevirtual setTintMode : (Landroid/graphics/PorterDuff$Mode;)V
    //   79: aload_0
    //   80: getfield b : Lws1;
    //   83: astore #7
    //   85: aload #7
    //   87: ifnull -> 100
    //   90: aload #7
    //   92: getfield c : Ljava/lang/CharSequence;
    //   95: astore #7
    //   97: goto -> 103
    //   100: aconst_null
    //   101: astore #7
    //   103: aload_2
    //   104: ifnull -> 142
    //   107: aload #8
    //   109: ifnull -> 131
    //   112: aload_2
    //   113: aload #8
    //   115: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   118: aload_2
    //   119: iconst_0
    //   120: invokevirtual setVisibility : (I)V
    //   123: aload_0
    //   124: iconst_0
    //   125: invokevirtual setVisibility : (I)V
    //   128: goto -> 142
    //   131: aload_2
    //   132: bipush #8
    //   134: invokevirtual setVisibility : (I)V
    //   137: aload_2
    //   138: aconst_null
    //   139: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   142: aload #7
    //   144: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   147: istore #6
    //   149: aload_1
    //   150: ifnull -> 238
    //   153: iload #6
    //   155: ifne -> 172
    //   158: aload_0
    //   159: getfield b : Lws1;
    //   162: invokevirtual getClass : ()Ljava/lang/Class;
    //   165: pop
    //   166: iconst_1
    //   167: istore #4
    //   169: goto -> 175
    //   172: iconst_0
    //   173: istore #4
    //   175: iload #6
    //   177: ifne -> 187
    //   180: aload #7
    //   182: astore #8
    //   184: goto -> 190
    //   187: aconst_null
    //   188: astore #8
    //   190: aload_1
    //   191: aload #8
    //   193: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   196: iload #4
    //   198: ifeq -> 207
    //   201: iconst_0
    //   202: istore #5
    //   204: goto -> 211
    //   207: bipush #8
    //   209: istore #5
    //   211: aload_1
    //   212: iload #5
    //   214: invokevirtual setVisibility : (I)V
    //   217: iload #4
    //   219: istore #5
    //   221: iload #6
    //   223: ifne -> 241
    //   226: aload_0
    //   227: iconst_0
    //   228: invokevirtual setVisibility : (I)V
    //   231: iload #4
    //   233: istore #5
    //   235: goto -> 241
    //   238: iconst_0
    //   239: istore #5
    //   241: iload_3
    //   242: ifeq -> 356
    //   245: aload_2
    //   246: ifnull -> 356
    //   249: aload_2
    //   250: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   253: checkcast android/view/ViewGroup$MarginLayoutParams
    //   256: astore_1
    //   257: iload #5
    //   259: ifeq -> 284
    //   262: aload_2
    //   263: invokevirtual getVisibility : ()I
    //   266: ifne -> 284
    //   269: aload_0
    //   270: invokevirtual getContext : ()Landroid/content/Context;
    //   273: bipush #8
    //   275: invokestatic u : (Landroid/content/Context;I)F
    //   278: f2i
    //   279: istore #4
    //   281: goto -> 287
    //   284: iconst_0
    //   285: istore #4
    //   287: aload #10
    //   289: getfield G : Z
    //   292: ifeq -> 327
    //   295: iload #4
    //   297: aload_1
    //   298: invokevirtual getMarginEnd : ()I
    //   301: if_icmpeq -> 356
    //   304: aload_1
    //   305: iload #4
    //   307: invokevirtual setMarginEnd : (I)V
    //   310: aload_1
    //   311: iconst_0
    //   312: putfield bottomMargin : I
    //   315: aload_2
    //   316: aload_1
    //   317: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
    //   320: aload_2
    //   321: invokevirtual requestLayout : ()V
    //   324: goto -> 356
    //   327: iload #4
    //   329: aload_1
    //   330: getfield bottomMargin : I
    //   333: if_icmpeq -> 356
    //   336: aload_1
    //   337: iload #4
    //   339: putfield bottomMargin : I
    //   342: aload_1
    //   343: iconst_0
    //   344: invokevirtual setMarginEnd : (I)V
    //   347: aload_2
    //   348: aload_1
    //   349: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
    //   352: aload_2
    //   353: invokevirtual requestLayout : ()V
    //   356: aload_0
    //   357: getfield b : Lws1;
    //   360: astore_2
    //   361: aload #9
    //   363: astore_1
    //   364: aload_2
    //   365: ifnull -> 373
    //   368: aload_2
    //   369: getfield d : Ljava/lang/CharSequence;
    //   372: astore_1
    //   373: iload #6
    //   375: ifne -> 381
    //   378: goto -> 384
    //   381: aload_1
    //   382: astore #7
    //   384: aload_0
    //   385: aload #7
    //   387: invokestatic Y : (Landroid/view/View;Ljava/lang/CharSequence;)V
    //   390: return
  }
  
  public int getContentHeight() {
    TextView textView = this.c;
    ImageView imageView = this.e;
    View view = this.h;
    byte b = 0;
    int j = 0;
    int i = 0;
    int k = i;
    while (b < 3) {
      (new View[3])[0] = (View)textView;
      (new View[3])[1] = (View)imageView;
      (new View[3])[2] = view;
      View view1 = (new View[3])[b];
      int i1 = i;
      int n = k;
      int m = j;
      if (view1 != null) {
        i1 = i;
        n = k;
        m = j;
        if (view1.getVisibility() == 0) {
          if (k) {
            i = Math.min(i, view1.getTop());
          } else {
            i = view1.getTop();
          } 
          if (k != 0) {
            j = Math.max(j, view1.getBottom());
          } else {
            j = view1.getBottom();
          } 
          n = 1;
          m = j;
          i1 = i;
        } 
      } 
      b++;
      i = i1;
      k = n;
      j = m;
    } 
    return j - i;
  }
  
  public int getContentWidth() {
    TextView textView = this.c;
    ImageView imageView = this.e;
    View view = this.h;
    byte b = 0;
    int j = 0;
    int i = 0;
    int k = i;
    while (b < 3) {
      (new View[3])[0] = (View)textView;
      (new View[3])[1] = (View)imageView;
      (new View[3])[2] = view;
      View view1 = (new View[3])[b];
      int i1 = i;
      int n = k;
      int m = j;
      if (view1 != null) {
        i1 = i;
        n = k;
        m = j;
        if (view1.getVisibility() == 0) {
          if (k) {
            i = Math.min(i, view1.getLeft());
          } else {
            i = view1.getLeft();
          } 
          if (k != 0) {
            j = Math.max(j, view1.getRight());
          } else {
            j = view1.getRight();
          } 
          n = 1;
          m = j;
          i1 = i;
        } 
      } 
      b++;
      i = i1;
      k = n;
      j = m;
    } 
    return j - i;
  }
  
  public ws1 getTab() {
    return this.b;
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    ub ub1 = this.g;
    if (ub1 != null && ub1.isVisible())
      paramAccessibilityNodeInfo.setContentDescription(this.g.d()); 
    int i = this.b.e;
    paramAccessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)(s0.a(isSelected(), 0, 1, i, 1)).b);
    if (isSelected()) {
      paramAccessibilityNodeInfo.setClickable(false);
      paramAccessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction)m0.e.a);
    } 
    String str = getResources().getString(2131886698);
    paramAccessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", str);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: invokestatic getSize : (I)I
    //   4: istore #6
    //   6: iload_1
    //   7: invokestatic getMode : (I)I
    //   10: istore #7
    //   12: aload_0
    //   13: getfield m : Lcom/google/android/material/tabs/TabLayout;
    //   16: astore #9
    //   18: aload #9
    //   20: invokevirtual getTabMaxWidth : ()I
    //   23: istore #8
    //   25: iload_1
    //   26: istore #5
    //   28: iload #8
    //   30: ifle -> 61
    //   33: iload #7
    //   35: ifeq -> 48
    //   38: iload_1
    //   39: istore #5
    //   41: iload #6
    //   43: iload #8
    //   45: if_icmple -> 61
    //   48: aload #9
    //   50: getfield x : I
    //   53: ldc_w -2147483648
    //   56: invokestatic makeMeasureSpec : (II)I
    //   59: istore #5
    //   61: aload_0
    //   62: iload #5
    //   64: iload_2
    //   65: invokespecial onMeasure : (II)V
    //   68: aload_0
    //   69: getfield c : Landroid/widget/TextView;
    //   72: ifnull -> 334
    //   75: aload #9
    //   77: getfield t : F
    //   80: fstore #4
    //   82: fload #4
    //   84: fstore_3
    //   85: aload_0
    //   86: invokevirtual isSelected : ()Z
    //   89: ifeq -> 110
    //   92: fload #4
    //   94: fstore_3
    //   95: aload #9
    //   97: getfield m : I
    //   100: iconst_m1
    //   101: if_icmpeq -> 110
    //   104: aload #9
    //   106: getfield u : F
    //   109: fstore_3
    //   110: aload_0
    //   111: getfield l : I
    //   114: istore #6
    //   116: aload_0
    //   117: getfield e : Landroid/widget/ImageView;
    //   120: astore #10
    //   122: aload #10
    //   124: ifnull -> 143
    //   127: aload #10
    //   129: invokevirtual getVisibility : ()I
    //   132: ifne -> 143
    //   135: iconst_1
    //   136: istore_1
    //   137: fload_3
    //   138: fstore #4
    //   140: goto -> 185
    //   143: aload_0
    //   144: getfield c : Landroid/widget/TextView;
    //   147: astore #10
    //   149: fload_3
    //   150: fstore #4
    //   152: iload #6
    //   154: istore_1
    //   155: aload #10
    //   157: ifnull -> 185
    //   160: fload_3
    //   161: fstore #4
    //   163: iload #6
    //   165: istore_1
    //   166: aload #10
    //   168: invokevirtual getLineCount : ()I
    //   171: iconst_1
    //   172: if_icmple -> 185
    //   175: aload #9
    //   177: getfield v : F
    //   180: fstore #4
    //   182: iload #6
    //   184: istore_1
    //   185: aload_0
    //   186: getfield c : Landroid/widget/TextView;
    //   189: invokevirtual getTextSize : ()F
    //   192: fstore_3
    //   193: aload_0
    //   194: getfield c : Landroid/widget/TextView;
    //   197: invokevirtual getLineCount : ()I
    //   200: istore #8
    //   202: aload_0
    //   203: getfield c : Landroid/widget/TextView;
    //   206: invokevirtual getMaxLines : ()I
    //   209: istore #7
    //   211: fload #4
    //   213: fload_3
    //   214: fcmpl
    //   215: istore #6
    //   217: iload #6
    //   219: ifne -> 233
    //   222: iload #7
    //   224: iflt -> 334
    //   227: iload_1
    //   228: iload #7
    //   230: if_icmpeq -> 334
    //   233: aload #9
    //   235: getfield F : I
    //   238: iconst_1
    //   239: if_icmpne -> 309
    //   242: iload #6
    //   244: ifle -> 309
    //   247: iload #8
    //   249: iconst_1
    //   250: if_icmpne -> 309
    //   253: aload_0
    //   254: getfield c : Landroid/widget/TextView;
    //   257: invokevirtual getLayout : ()Landroid/text/Layout;
    //   260: astore #9
    //   262: aload #9
    //   264: ifnull -> 334
    //   267: aload #9
    //   269: iconst_0
    //   270: invokevirtual getLineWidth : (I)F
    //   273: fstore_3
    //   274: fload #4
    //   276: aload #9
    //   278: invokevirtual getPaint : ()Landroid/text/TextPaint;
    //   281: invokevirtual getTextSize : ()F
    //   284: fdiv
    //   285: fload_3
    //   286: fmul
    //   287: aload_0
    //   288: invokevirtual getMeasuredWidth : ()I
    //   291: aload_0
    //   292: invokevirtual getPaddingLeft : ()I
    //   295: isub
    //   296: aload_0
    //   297: invokevirtual getPaddingRight : ()I
    //   300: isub
    //   301: i2f
    //   302: fcmpl
    //   303: ifle -> 309
    //   306: goto -> 334
    //   309: aload_0
    //   310: getfield c : Landroid/widget/TextView;
    //   313: iconst_0
    //   314: fload #4
    //   316: invokevirtual setTextSize : (IF)V
    //   319: aload_0
    //   320: getfield c : Landroid/widget/TextView;
    //   323: iload_1
    //   324: invokevirtual setMaxLines : (I)V
    //   327: aload_0
    //   328: iload #5
    //   330: iload_2
    //   331: invokespecial onMeasure : (II)V
    //   334: return
  }
  
  public final boolean performClick() {
    boolean bool = super.performClick();
    if (this.b != null) {
      if (!bool)
        playSoundEffect(0); 
      ws1 ws11 = this.b;
      TabLayout tabLayout = ws11.g;
      if (tabLayout != null) {
        tabLayout.m(ws11, true);
        return true;
      } 
      l0.l(tlzLOCPTHRhep.DXrpdXKlbwMizKN);
      return false;
    } 
    return bool;
  }
  
  public void setSelected(boolean paramBoolean) {
    isSelected();
    super.setSelected(paramBoolean);
    TextView textView = this.c;
    if (textView != null)
      textView.setSelected(paramBoolean); 
    ImageView imageView = this.e;
    if (imageView != null)
      imageView.setSelected(paramBoolean); 
    View view = this.h;
    if (view != null)
      view.setSelected(paramBoolean); 
  }
  
  public void setTab(ws1 paramws1) {
    if (paramws1 != this.b) {
      this.b = paramws1;
      d();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zs1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */