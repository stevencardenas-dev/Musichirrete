package com.pavelsikun.seekbarpreference;

import ac1;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import da1;
import q91;

public class SeekBarPreferenceCompat extends Preference implements View.OnClickListener {
  public q91 O;
  
  public SeekBarPreferenceCompat(Context paramContext) {
    super(paramContext, null);
    F(null);
  }
  
  public SeekBarPreferenceCompat(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    F(paramAttributeSet);
  }
  
  public SeekBarPreferenceCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt, 0);
    F(paramAttributeSet);
  }
  
  public SeekBarPreferenceCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    F(paramAttributeSet);
  }
  
  public final void F(AttributeSet paramAttributeSet) {
    this.F = 2131493205;
    Context context = this.b;
    q91 q911 = new q91(context);
    this.O = q911;
    q911.u = this;
    q911.v = this;
    if (paramAttributeSet == null) {
      q911.g = 50;
      q911.e = 0;
      q911.c = 100;
      q911.f = 1;
      q911.i = true;
      q911.r = true;
      return;
    } 
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, ac1.a);
    try {
      q911.e = typedArray.getInt(8, 0);
      q911.f = typedArray.getInt(5, 1);
      q911.c = (typedArray.getInt(6, 100) - q911.e) / q911.f;
      q911.i = typedArray.getBoolean(4, true);
      q911.h = typedArray.getString(7);
      q911.g = paramAttributeSet.getAttributeIntValue(oXrNDUqUkE.FqFwfFMsjylwkQ, "defaultValue", 50);
      q911.j = 2131951931;
      int i = typedArray.getResourceId(13, -1);
      if (i != -1) {
        String[] arrayOfString = context.getResources().getStringArray(i);
        if (q911.e == 0 && q911.f == 1 && arrayOfString.length == q911.c + 1)
          q911.w = arrayOfString; 
      } 
    } finally {}
    typedArray.recycle();
  }
  
  public final void n(da1 paramda1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial n : (Lda1;)V
    //   5: aload_0
    //   6: getfield O : Lq91;
    //   9: astore #7
    //   11: aload_1
    //   12: getfield b : Landroid/view/View;
    //   15: astore #9
    //   17: aload #7
    //   19: getfield s : Z
    //   22: istore #6
    //   24: aconst_null
    //   25: astore #8
    //   27: iload #6
    //   29: ifeq -> 80
    //   32: aload #7
    //   34: aload #9
    //   36: ldc 16908310
    //   38: invokevirtual findViewById : (I)Landroid/view/View;
    //   41: checkcast android/widget/TextView
    //   44: putfield p : Landroid/widget/TextView;
    //   47: aload #7
    //   49: aload #9
    //   51: ldc 16908304
    //   53: invokevirtual findViewById : (I)Landroid/view/View;
    //   56: checkcast android/widget/TextView
    //   59: putfield q : Landroid/widget/TextView;
    //   62: aload #7
    //   64: getfield p : Landroid/widget/TextView;
    //   67: aconst_null
    //   68: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   71: aload #7
    //   73: getfield q : Landroid/widget/TextView;
    //   76: aconst_null
    //   77: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   80: iconst_0
    //   81: istore_2
    //   82: aload #9
    //   84: iconst_0
    //   85: invokevirtual setClickable : (Z)V
    //   88: aload #7
    //   90: aload #9
    //   92: ldc 2131297465
    //   94: invokevirtual findViewById : (I)Landroid/view/View;
    //   97: checkcast android/widget/SeekBar
    //   100: putfield l : Landroid/widget/SeekBar;
    //   103: aload #7
    //   105: aload #9
    //   107: ldc 2131297110
    //   109: invokevirtual findViewById : (I)Landroid/view/View;
    //   112: checkcast android/widget/TextView
    //   115: putfield m : Landroid/widget/TextView;
    //   118: aload #7
    //   120: aload #9
    //   122: ldc 2131297466
    //   124: invokevirtual findViewById : (I)Landroid/view/View;
    //   127: checkcast android/widget/TextView
    //   130: putfield k : Landroid/widget/TextView;
    //   133: aload #7
    //   135: getfield c : I
    //   138: istore_3
    //   139: aload #7
    //   141: iload_3
    //   142: putfield c : I
    //   145: aload #7
    //   147: getfield l : Landroid/widget/SeekBar;
    //   150: astore_1
    //   151: aload_1
    //   152: ifnull -> 206
    //   155: aload #7
    //   157: getfield e : I
    //   160: istore #4
    //   162: iload #4
    //   164: ifgt -> 182
    //   167: iload_3
    //   168: iflt -> 182
    //   171: aload_1
    //   172: iload_3
    //   173: iload #4
    //   175: isub
    //   176: invokevirtual setMax : (I)V
    //   179: goto -> 187
    //   182: aload_1
    //   183: iload_3
    //   184: invokevirtual setMax : (I)V
    //   187: aload #7
    //   189: getfield l : Landroid/widget/SeekBar;
    //   192: aload #7
    //   194: getfield g : I
    //   197: aload #7
    //   199: getfield e : I
    //   202: isub
    //   203: invokevirtual setProgress : (I)V
    //   206: aload #7
    //   208: getfield l : Landroid/widget/SeekBar;
    //   211: aload #7
    //   213: invokevirtual setOnSeekBarChangeListener : (Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
    //   216: aload #7
    //   218: getfield m : Landroid/widget/TextView;
    //   221: aload #7
    //   223: getfield h : Ljava/lang/String;
    //   226: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   229: aload #7
    //   231: aload #7
    //   233: getfield g : I
    //   236: invokevirtual a : (I)V
    //   239: aload #7
    //   241: getfield k : Landroid/widget/TextView;
    //   244: astore #10
    //   246: aload #7
    //   248: getfield w : [Ljava/lang/String;
    //   251: astore_1
    //   252: aload #7
    //   254: getfield g : I
    //   257: istore_3
    //   258: aload_1
    //   259: ifnull -> 279
    //   262: iload_3
    //   263: iflt -> 279
    //   266: iload_3
    //   267: aload_1
    //   268: arraylength
    //   269: if_icmpge -> 279
    //   272: aload_1
    //   273: iload_3
    //   274: aaload
    //   275: astore_1
    //   276: goto -> 284
    //   279: iload_3
    //   280: invokestatic valueOf : (I)Ljava/lang/String;
    //   283: astore_1
    //   284: aload #10
    //   286: aload_1
    //   287: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   290: aload #7
    //   292: aload #9
    //   294: ldc 2131296475
    //   296: invokevirtual findViewById : (I)Landroid/view/View;
    //   299: checkcast android/widget/FrameLayout
    //   302: putfield o : Landroid/widget/FrameLayout;
    //   305: aload #9
    //   307: ldc 2131297932
    //   309: invokevirtual findViewById : (I)Landroid/view/View;
    //   312: checkcast android/widget/LinearLayout
    //   315: astore #9
    //   317: aload #7
    //   319: aload #9
    //   321: putfield n : Landroid/widget/LinearLayout;
    //   324: aload #7
    //   326: getfield i : Z
    //   329: istore #5
    //   331: aload #7
    //   333: iload #5
    //   335: putfield i : Z
    //   338: aload #9
    //   340: ifnull -> 399
    //   343: aload #7
    //   345: getfield o : Landroid/widget/FrameLayout;
    //   348: ifnull -> 399
    //   351: aload #8
    //   353: astore_1
    //   354: iload #5
    //   356: ifeq -> 362
    //   359: aload #7
    //   361: astore_1
    //   362: aload #9
    //   364: aload_1
    //   365: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   368: aload #7
    //   370: getfield n : Landroid/widget/LinearLayout;
    //   373: iload #5
    //   375: invokevirtual setClickable : (Z)V
    //   378: aload #7
    //   380: getfield o : Landroid/widget/FrameLayout;
    //   383: astore_1
    //   384: iload #5
    //   386: ifeq -> 392
    //   389: goto -> 394
    //   392: iconst_4
    //   393: istore_2
    //   394: aload_1
    //   395: iload_2
    //   396: invokevirtual setVisibility : (I)V
    //   399: iload #6
    //   401: ifne -> 423
    //   404: aload #7
    //   406: getfield u : Lcom/pavelsikun/seekbarpreference/SeekBarPreferenceCompat;
    //   409: astore_1
    //   410: aload_1
    //   411: ifnull -> 423
    //   414: aload_1
    //   415: invokevirtual i : ()Z
    //   418: istore #5
    //   420: goto -> 430
    //   423: aload #7
    //   425: getfield r : Z
    //   428: istore #5
    //   430: aload #7
    //   432: getfield b : Ljava/lang/String;
    //   435: astore #8
    //   437: new java/lang/StringBuilder
    //   440: dup
    //   441: ldc 'setEnabled = '
    //   443: invokespecial <init> : (Ljava/lang/String;)V
    //   446: astore_1
    //   447: aload_1
    //   448: iload #5
    //   450: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   453: pop
    //   454: aload #8
    //   456: aload_1
    //   457: invokevirtual toString : ()Ljava/lang/String;
    //   460: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   463: pop
    //   464: aload #7
    //   466: iload #5
    //   468: putfield r : Z
    //   471: aload #7
    //   473: getfield l : Landroid/widget/SeekBar;
    //   476: ifnull -> 572
    //   479: aload #8
    //   481: ldc 'view is disabled!'
    //   483: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   486: pop
    //   487: aload #7
    //   489: getfield l : Landroid/widget/SeekBar;
    //   492: iload #5
    //   494: invokevirtual setEnabled : (Z)V
    //   497: aload #7
    //   499: getfield k : Landroid/widget/TextView;
    //   502: iload #5
    //   504: invokevirtual setEnabled : (Z)V
    //   507: aload #7
    //   509: getfield n : Landroid/widget/LinearLayout;
    //   512: iload #5
    //   514: invokevirtual setClickable : (Z)V
    //   517: aload #7
    //   519: getfield n : Landroid/widget/LinearLayout;
    //   522: iload #5
    //   524: invokevirtual setEnabled : (Z)V
    //   527: aload #7
    //   529: getfield m : Landroid/widget/TextView;
    //   532: iload #5
    //   534: invokevirtual setEnabled : (Z)V
    //   537: aload #7
    //   539: getfield o : Landroid/widget/FrameLayout;
    //   542: iload #5
    //   544: invokevirtual setEnabled : (Z)V
    //   547: iload #6
    //   549: ifeq -> 572
    //   552: aload #7
    //   554: getfield p : Landroid/widget/TextView;
    //   557: iload #5
    //   559: invokevirtual setEnabled : (Z)V
    //   562: aload #7
    //   564: getfield q : Landroid/widget/TextView;
    //   567: iload #5
    //   569: invokevirtual setEnabled : (Z)V
    //   572: return
  }
  
  public final void onClick(View paramView) {
    this.O.onClick(paramView);
  }
  
  public final void u(Object paramObject) {
    paramObject = this.O;
    paramObject.a(e(((q91)paramObject).g));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\pavelsikun\seekbarpreference\SeekBarPreferenceCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */