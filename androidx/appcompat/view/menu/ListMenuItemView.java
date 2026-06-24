package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import ix0;
import nc1;
import rw0;
import uw0;
import zv0;

public class ListMenuItemView extends LinearLayout implements ix0, AbsListView.SelectionBoundsAdjuster {
  public uw0 b;
  
  public ImageView c;
  
  public RadioButton e;
  
  public TextView f;
  
  public CheckBox g;
  
  public TextView h;
  
  public ImageView i;
  
  public ImageView j;
  
  public LinearLayout k;
  
  public final Drawable l;
  
  public final int m;
  
  public final Context n;
  
  public boolean o;
  
  public final Drawable p;
  
  public final boolean q;
  
  public LayoutInflater r;
  
  public boolean s;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969514);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    zv0 zv0 = zv0.y(paramInt, 0, getContext(), paramAttributeSet, nc1.r);
    this.l = zv0.o(5);
    TypedArray typedArray2 = (TypedArray)zv0.e;
    this.m = typedArray2.getResourceId(1, -1);
    this.o = typedArray2.getBoolean(7, false);
    this.n = paramContext;
    this.p = zv0.o(8);
    TypedArray typedArray1 = paramContext.getTheme().obtainStyledAttributes(null, new int[] { 16843049 }, 2130969107, 0);
    this.q = typedArray1.hasValue(0);
    zv0.z();
    typedArray1.recycle();
  }
  
  private LayoutInflater getInflater() {
    if (this.r == null)
      this.r = LayoutInflater.from(getContext()); 
    return this.r;
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean) {
    ImageView imageView = this.i;
    if (imageView != null) {
      byte b;
      if (paramBoolean) {
        b = 0;
      } else {
        b = 8;
      } 
      imageView.setVisibility(b);
    } 
  }
  
  public final void adjustListItemSelectionBounds(Rect paramRect) {
    ImageView imageView = this.j;
    if (imageView != null && imageView.getVisibility() == 0) {
      LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.j.getLayoutParams();
      int i = paramRect.top;
      paramRect.top = this.j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + i;
    } 
  }
  
  public uw0 getItemData() {
    return this.b;
  }
  
  public final void initialize(uw0 paramuw0, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield b : Luw0;
    //   5: aload_1
    //   6: invokevirtual isVisible : ()Z
    //   9: istore #5
    //   11: aload_1
    //   12: getfield n : Lrw0;
    //   15: astore #6
    //   17: iconst_0
    //   18: istore #4
    //   20: iload #5
    //   22: ifeq -> 30
    //   25: iconst_0
    //   26: istore_2
    //   27: goto -> 33
    //   30: bipush #8
    //   32: istore_2
    //   33: aload_0
    //   34: iload_2
    //   35: invokevirtual setVisibility : (I)V
    //   38: aload_0
    //   39: aload_1
    //   40: getfield e : Ljava/lang/CharSequence;
    //   43: invokevirtual setTitle : (Ljava/lang/CharSequence;)V
    //   46: aload_0
    //   47: aload_1
    //   48: invokevirtual isCheckable : ()Z
    //   51: invokevirtual setCheckable : (Z)V
    //   54: aload #6
    //   56: invokevirtual o : ()Z
    //   59: ifeq -> 92
    //   62: aload #6
    //   64: invokevirtual n : ()Z
    //   67: ifeq -> 78
    //   70: aload_1
    //   71: getfield j : C
    //   74: istore_2
    //   75: goto -> 83
    //   78: aload_1
    //   79: getfield h : C
    //   82: istore_2
    //   83: iload_2
    //   84: ifeq -> 92
    //   87: iconst_1
    //   88: istore_2
    //   89: goto -> 94
    //   92: iconst_0
    //   93: istore_2
    //   94: aload #6
    //   96: invokevirtual n : ()Z
    //   99: pop
    //   100: iload_2
    //   101: ifeq -> 158
    //   104: aload_0
    //   105: getfield b : Luw0;
    //   108: astore #6
    //   110: aload #6
    //   112: getfield n : Lrw0;
    //   115: astore #7
    //   117: aload #7
    //   119: invokevirtual o : ()Z
    //   122: ifeq -> 158
    //   125: aload #7
    //   127: invokevirtual n : ()Z
    //   130: ifeq -> 142
    //   133: aload #6
    //   135: getfield j : C
    //   138: istore_2
    //   139: goto -> 148
    //   142: aload #6
    //   144: getfield h : C
    //   147: istore_2
    //   148: iload_2
    //   149: ifeq -> 158
    //   152: iload #4
    //   154: istore_2
    //   155: goto -> 161
    //   158: bipush #8
    //   160: istore_2
    //   161: iload_2
    //   162: ifne -> 474
    //   165: aload_0
    //   166: getfield h : Landroid/widget/TextView;
    //   169: astore #7
    //   171: aload_0
    //   172: getfield b : Luw0;
    //   175: astore #10
    //   177: aload #10
    //   179: getfield n : Lrw0;
    //   182: astore #9
    //   184: aload #9
    //   186: getfield a : Landroid/content/Context;
    //   189: astore #11
    //   191: aload #9
    //   193: invokevirtual n : ()Z
    //   196: ifeq -> 208
    //   199: aload #10
    //   201: getfield j : C
    //   204: istore_3
    //   205: goto -> 214
    //   208: aload #10
    //   210: getfield h : C
    //   213: istore_3
    //   214: iload_3
    //   215: ifne -> 225
    //   218: ldc ''
    //   220: astore #6
    //   222: goto -> 467
    //   225: aload #11
    //   227: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   230: astore #6
    //   232: new java/lang/StringBuilder
    //   235: dup
    //   236: invokespecial <init> : ()V
    //   239: astore #8
    //   241: aload #11
    //   243: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   246: invokevirtual hasPermanentMenuKey : ()Z
    //   249: ifeq -> 265
    //   252: aload #8
    //   254: aload #6
    //   256: ldc 2131886104
    //   258: invokevirtual getString : (I)Ljava/lang/String;
    //   261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: pop
    //   265: aload #9
    //   267: invokevirtual n : ()Z
    //   270: ifeq -> 283
    //   273: aload #10
    //   275: getfield k : I
    //   278: istore #4
    //   280: goto -> 290
    //   283: aload #10
    //   285: getfield i : I
    //   288: istore #4
    //   290: iload #4
    //   292: ldc 65536
    //   294: aload #6
    //   296: ldc 2131886100
    //   298: invokevirtual getString : (I)Ljava/lang/String;
    //   301: aload #8
    //   303: invokestatic c : (IILjava/lang/String;Ljava/lang/StringBuilder;)V
    //   306: iload #4
    //   308: sipush #4096
    //   311: aload #6
    //   313: ldc 2131886096
    //   315: invokevirtual getString : (I)Ljava/lang/String;
    //   318: aload #8
    //   320: invokestatic c : (IILjava/lang/String;Ljava/lang/StringBuilder;)V
    //   323: iload #4
    //   325: iconst_2
    //   326: aload #6
    //   328: ldc 2131886095
    //   330: invokevirtual getString : (I)Ljava/lang/String;
    //   333: aload #8
    //   335: invokestatic c : (IILjava/lang/String;Ljava/lang/StringBuilder;)V
    //   338: iload #4
    //   340: iconst_1
    //   341: aload #6
    //   343: ldc 2131886101
    //   345: invokevirtual getString : (I)Ljava/lang/String;
    //   348: aload #8
    //   350: invokestatic c : (IILjava/lang/String;Ljava/lang/StringBuilder;)V
    //   353: iload #4
    //   355: iconst_4
    //   356: aload #6
    //   358: ldc 2131886103
    //   360: invokevirtual getString : (I)Ljava/lang/String;
    //   363: aload #8
    //   365: invokestatic c : (IILjava/lang/String;Ljava/lang/StringBuilder;)V
    //   368: iload #4
    //   370: bipush #8
    //   372: aload #6
    //   374: ldc 2131886099
    //   376: invokevirtual getString : (I)Ljava/lang/String;
    //   379: aload #8
    //   381: invokestatic c : (IILjava/lang/String;Ljava/lang/StringBuilder;)V
    //   384: iload_3
    //   385: bipush #8
    //   387: if_icmpeq -> 446
    //   390: iload_3
    //   391: bipush #10
    //   393: if_icmpeq -> 429
    //   396: iload_3
    //   397: bipush #32
    //   399: if_icmpeq -> 412
    //   402: aload #8
    //   404: iload_3
    //   405: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   408: pop
    //   409: goto -> 460
    //   412: aload #8
    //   414: aload #6
    //   416: ldc_w 2131886102
    //   419: invokevirtual getString : (I)Ljava/lang/String;
    //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: pop
    //   426: goto -> 460
    //   429: aload #8
    //   431: aload #6
    //   433: ldc_w 2131886098
    //   436: invokevirtual getString : (I)Ljava/lang/String;
    //   439: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   442: pop
    //   443: goto -> 460
    //   446: aload #8
    //   448: aload #6
    //   450: ldc_w 2131886097
    //   453: invokevirtual getString : (I)Ljava/lang/String;
    //   456: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   459: pop
    //   460: aload #8
    //   462: invokevirtual toString : ()Ljava/lang/String;
    //   465: astore #6
    //   467: aload #7
    //   469: aload #6
    //   471: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   474: aload_0
    //   475: getfield h : Landroid/widget/TextView;
    //   478: invokevirtual getVisibility : ()I
    //   481: iload_2
    //   482: if_icmpeq -> 493
    //   485: aload_0
    //   486: getfield h : Landroid/widget/TextView;
    //   489: iload_2
    //   490: invokevirtual setVisibility : (I)V
    //   493: aload_0
    //   494: aload_1
    //   495: invokevirtual getIcon : ()Landroid/graphics/drawable/Drawable;
    //   498: invokevirtual setIcon : (Landroid/graphics/drawable/Drawable;)V
    //   501: aload_0
    //   502: aload_1
    //   503: invokevirtual isEnabled : ()Z
    //   506: invokevirtual setEnabled : (Z)V
    //   509: aload_0
    //   510: aload_1
    //   511: invokevirtual hasSubMenu : ()Z
    //   514: invokespecial setSubMenuArrowVisible : (Z)V
    //   517: aload_0
    //   518: aload_1
    //   519: getfield q : Ljava/lang/CharSequence;
    //   522: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   525: return
  }
  
  public final void onFinishInflate() {
    super.onFinishInflate();
    setBackground(this.l);
    TextView textView = (TextView)findViewById(2131297650);
    this.f = textView;
    int i = this.m;
    if (i != -1)
      textView.setTextAppearance(this.n, i); 
    this.h = (TextView)findViewById(2131297472);
    ImageView imageView = (ImageView)findViewById(2131297549);
    this.i = imageView;
    if (imageView != null)
      imageView.setImageDrawable(this.p); 
    this.j = (ImageView)findViewById(2131296765);
    this.k = (LinearLayout)findViewById(2131296597);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    if (this.c != null && this.o) {
      ViewGroup.LayoutParams layoutParams = getLayoutParams();
      LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams)this.c.getLayoutParams();
      int i = layoutParams.height;
      if (i > 0 && layoutParams1.width <= 0)
        layoutParams1.width = i; 
    } 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean) {
    if (paramBoolean || this.e != null || this.g != null) {
      CheckBox checkBox;
      RadioButton radioButton;
      if ((this.b.x & 0x4) != 0) {
        if (this.e == null) {
          radioButton = (RadioButton)getInflater().inflate(2131492881, (ViewGroup)this, false);
          this.e = radioButton;
          LinearLayout linearLayout = this.k;
          if (linearLayout != null) {
            linearLayout.addView((View)radioButton, -1);
          } else {
            addView((View)radioButton, -1);
          } 
        } 
        RadioButton radioButton1 = this.e;
        CheckBox checkBox1 = this.g;
      } else {
        if (this.g == null) {
          CheckBox checkBox1 = (CheckBox)getInflater().inflate(2131492878, (ViewGroup)this, false);
          this.g = checkBox1;
          LinearLayout linearLayout = this.k;
          if (linearLayout != null) {
            linearLayout.addView((View)checkBox1, -1);
          } else {
            addView((View)checkBox1, -1);
          } 
        } 
        checkBox = this.g;
        radioButton = this.e;
      } 
      if (paramBoolean) {
        checkBox.setChecked(this.b.isChecked());
        if (checkBox.getVisibility() != 0)
          checkBox.setVisibility(0); 
        if (radioButton != null && radioButton.getVisibility() != 8) {
          radioButton.setVisibility(8);
          return;
        } 
      } else {
        checkBox = this.g;
        if (checkBox != null)
          checkBox.setVisibility(8); 
        RadioButton radioButton1 = this.e;
        if (radioButton1 != null)
          radioButton1.setVisibility(8); 
      } 
    } 
  }
  
  public void setChecked(boolean paramBoolean) {
    CheckBox checkBox;
    if ((this.b.x & 0x4) != 0) {
      if (this.e == null) {
        RadioButton radioButton1 = (RadioButton)getInflater().inflate(2131492881, (ViewGroup)this, false);
        this.e = radioButton1;
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
          linearLayout.addView((View)radioButton1, -1);
        } else {
          addView((View)radioButton1, -1);
        } 
      } 
      RadioButton radioButton = this.e;
    } else {
      if (this.g == null) {
        CheckBox checkBox1 = (CheckBox)getInflater().inflate(2131492878, (ViewGroup)this, false);
        this.g = checkBox1;
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
          linearLayout.addView((View)checkBox1, -1);
        } else {
          addView((View)checkBox1, -1);
        } 
      } 
      checkBox = this.g;
    } 
    checkBox.setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean) {
    this.s = paramBoolean;
    this.o = paramBoolean;
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean) {
    ImageView imageView = this.j;
    if (imageView != null) {
      byte b;
      if (!this.q && paramBoolean) {
        b = 0;
      } else {
        b = 8;
      } 
      imageView.setVisibility(b);
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    rw0 rw0 = this.b.n;
    boolean bool = this.s;
    if (bool || this.o) {
      ImageView imageView = this.c;
      if (imageView != null || paramDrawable != null || this.o) {
        if (imageView == null) {
          ImageView imageView1 = (ImageView)getInflater().inflate(2131492879, (ViewGroup)this, false);
          this.c = imageView1;
          LinearLayout linearLayout = this.k;
          if (linearLayout != null) {
            linearLayout.addView((View)imageView1, 0);
          } else {
            addView((View)imageView1, 0);
          } 
        } 
        if (paramDrawable != null || this.o) {
          imageView = this.c;
          if (!bool)
            paramDrawable = null; 
          imageView.setImageDrawable(paramDrawable);
          if (this.c.getVisibility() != 0)
            this.c.setVisibility(0); 
          return;
        } 
        this.c.setVisibility(8);
        return;
      } 
    } 
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    TextView textView = this.f;
    if (paramCharSequence != null) {
      textView.setText(paramCharSequence);
      if (this.f.getVisibility() != 0) {
        this.f.setVisibility(0);
        return;
      } 
    } else if (textView.getVisibility() != 8) {
      this.f.setVisibility(8);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\view\menu\ListMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */