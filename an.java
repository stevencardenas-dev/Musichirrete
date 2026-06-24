import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.afollestad.materialdialogs.color.CircleView;
import java.util.WeakHashMap;

public class an extends vy implements View.OnClickListener, View.OnLongClickListener {
  public TextView A0;
  
  public SeekBar B0;
  
  public TextView C0;
  
  public SeekBar D0;
  
  public TextView E0;
  
  public SeekBar F0;
  
  public TextView G0;
  
  public wm H0;
  
  public int I0;
  
  public int[] q0;
  
  public int[][] r0;
  
  public int s0;
  
  public ym t0;
  
  public GridView u0;
  
  public View v0;
  
  public EditText w0;
  
  public View x0;
  
  public vm y0;
  
  public SeekBar z0;
  
  public final Dialog F0(Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Landroid/os/Bundle;
    //   4: astore #8
    //   6: aload #8
    //   8: ifnull -> 689
    //   11: aload #8
    //   13: ldc 'builder'
    //   15: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   18: ifeq -> 689
    //   21: aload_0
    //   22: invokevirtual J0 : ()Lxm;
    //   25: getfield f : [I
    //   28: astore #8
    //   30: aload #8
    //   32: ifnull -> 49
    //   35: aload_0
    //   36: aload #8
    //   38: putfield q0 : [I
    //   41: aload_0
    //   42: aconst_null
    //   43: putfield r0 : [[I
    //   46: goto -> 63
    //   49: aload_0
    //   50: getstatic en.a : [I
    //   53: putfield q0 : [I
    //   56: aload_0
    //   57: getstatic en.b : [[I
    //   60: putfield r0 : [[I
    //   63: aload_1
    //   64: ifnull -> 85
    //   67: aload_1
    //   68: ldc 'in_custom'
    //   70: iconst_0
    //   71: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   74: iconst_1
    //   75: ixor
    //   76: istore_2
    //   77: aload_0
    //   78: invokevirtual K0 : ()I
    //   81: istore_3
    //   82: goto -> 279
    //   85: aload_0
    //   86: invokevirtual J0 : ()Lxm;
    //   89: getfield j : Z
    //   92: ifeq -> 274
    //   95: aload_0
    //   96: invokevirtual J0 : ()Lxm;
    //   99: getfield c : I
    //   102: istore #4
    //   104: iconst_0
    //   105: istore_2
    //   106: iconst_0
    //   107: istore #5
    //   109: iload #4
    //   111: istore_3
    //   112: iload #4
    //   114: ifeq -> 279
    //   117: iconst_0
    //   118: istore_2
    //   119: aload_0
    //   120: getfield q0 : [I
    //   123: astore_1
    //   124: iload_2
    //   125: istore_3
    //   126: iload #5
    //   128: aload_1
    //   129: arraylength
    //   130: if_icmpge -> 257
    //   133: aload_1
    //   134: iload #5
    //   136: iaload
    //   137: iload #4
    //   139: if_icmpne -> 188
    //   142: aload_0
    //   143: iload #5
    //   145: invokevirtual S0 : (I)V
    //   148: aload_0
    //   149: invokevirtual J0 : ()Lxm;
    //   152: invokevirtual getClass : ()Ljava/lang/Class;
    //   155: pop
    //   156: aload_0
    //   157: getfield r0 : [[I
    //   160: ifnull -> 177
    //   163: aload_0
    //   164: iload #5
    //   166: iload #4
    //   168: invokevirtual I0 : (II)V
    //   171: iload #4
    //   173: istore_3
    //   174: goto -> 277
    //   177: aload_0
    //   178: iconst_5
    //   179: invokevirtual P0 : (I)V
    //   182: iload #4
    //   184: istore_3
    //   185: goto -> 277
    //   188: iload_2
    //   189: istore #6
    //   191: aload_0
    //   192: getfield r0 : [[I
    //   195: ifnull -> 265
    //   198: iconst_0
    //   199: istore #6
    //   201: aload_0
    //   202: getfield r0 : [[I
    //   205: iload #5
    //   207: aaload
    //   208: astore_1
    //   209: iload_2
    //   210: istore_3
    //   211: iload #6
    //   213: aload_1
    //   214: arraylength
    //   215: if_icmpge -> 250
    //   218: aload_1
    //   219: iload #6
    //   221: iaload
    //   222: iload #4
    //   224: if_icmpne -> 244
    //   227: aload_0
    //   228: iload #5
    //   230: invokevirtual S0 : (I)V
    //   233: aload_0
    //   234: iload #6
    //   236: invokevirtual P0 : (I)V
    //   239: iconst_1
    //   240: istore_3
    //   241: goto -> 250
    //   244: iinc #6, 1
    //   247: goto -> 201
    //   250: iload_3
    //   251: istore #6
    //   253: iload_3
    //   254: ifeq -> 265
    //   257: iload_3
    //   258: istore_2
    //   259: iload #4
    //   261: istore_3
    //   262: goto -> 279
    //   265: iinc #5, 1
    //   268: iload #6
    //   270: istore_2
    //   271: goto -> 119
    //   274: ldc -16777216
    //   276: istore_3
    //   277: iconst_1
    //   278: istore_2
    //   279: aload_0
    //   280: aload_0
    //   281: invokevirtual S : ()Landroid/content/res/Resources;
    //   284: ldc 2131166074
    //   286: invokevirtual getDimensionPixelSize : (I)I
    //   289: putfield s0 : I
    //   292: aload_0
    //   293: invokevirtual J0 : ()Lxm;
    //   296: astore_1
    //   297: new ms0
    //   300: dup
    //   301: aload_0
    //   302: invokevirtual M : ()Lx5;
    //   305: invokespecial <init> : (Landroid/content/Context;)V
    //   308: astore #8
    //   310: aload_0
    //   311: invokevirtual J0 : ()Lxm;
    //   314: astore #9
    //   316: aload_0
    //   317: invokevirtual N0 : ()Z
    //   320: istore #7
    //   322: ldc 2131886114
    //   324: istore #5
    //   326: iload #7
    //   328: ifeq -> 343
    //   331: aload #9
    //   333: invokevirtual getClass : ()Ljava/lang/Class;
    //   336: pop
    //   337: iconst_0
    //   338: istore #4
    //   340: goto -> 353
    //   343: aload #9
    //   345: invokevirtual getClass : ()Ljava/lang/Class;
    //   348: pop
    //   349: ldc 2131886114
    //   351: istore #4
    //   353: iload #4
    //   355: ifne -> 371
    //   358: aload #9
    //   360: invokevirtual getClass : ()Ljava/lang/Class;
    //   363: pop
    //   364: iload #5
    //   366: istore #4
    //   368: goto -> 371
    //   371: aload #8
    //   373: iload #4
    //   375: invokevirtual q : (I)V
    //   378: aload #8
    //   380: iconst_0
    //   381: putfield P : Z
    //   384: aload #8
    //   386: ldc 2131493092
    //   388: iconst_0
    //   389: invokevirtual e : (IZ)V
    //   392: aload_1
    //   393: getfield i : Z
    //   396: ifeq -> 406
    //   399: ldc 2131886815
    //   401: istore #4
    //   403: goto -> 409
    //   406: iconst_0
    //   407: istore #4
    //   409: aload #8
    //   411: iload #4
    //   413: invokevirtual l : (I)V
    //   416: aload #8
    //   418: new gh1
    //   421: dup
    //   422: bipush #18
    //   424: aload_0
    //   425: invokespecial <init> : (ILjava/lang/Object;)V
    //   428: putfield C : Lrs0;
    //   431: aload #8
    //   433: new um
    //   436: dup
    //   437: aload_0
    //   438: invokespecial <init> : (Lan;)V
    //   441: putfield Y : Landroid/content/DialogInterface$OnShowListener;
    //   444: new ss0
    //   447: dup
    //   448: aload #8
    //   450: invokespecial <init> : (Lms0;)V
    //   453: astore #8
    //   455: aload #8
    //   457: getfield e : Lms0;
    //   460: getfield u : Landroid/view/View;
    //   463: astore #9
    //   465: aload_0
    //   466: aload #9
    //   468: ldc 2131297101
    //   470: invokevirtual findViewById : (I)Landroid/view/View;
    //   473: checkcast android/widget/GridView
    //   476: putfield u0 : Landroid/widget/GridView;
    //   479: aload_1
    //   480: getfield i : Z
    //   483: ifeq -> 682
    //   486: aload_0
    //   487: iload_3
    //   488: putfield I0 : I
    //   491: aload_0
    //   492: aload #9
    //   494: ldc 2131297087
    //   496: invokevirtual findViewById : (I)Landroid/view/View;
    //   499: putfield v0 : Landroid/view/View;
    //   502: aload_0
    //   503: aload #9
    //   505: ldc 2131297102
    //   507: invokevirtual findViewById : (I)Landroid/view/View;
    //   510: checkcast android/widget/EditText
    //   513: putfield w0 : Landroid/widget/EditText;
    //   516: aload_0
    //   517: aload #9
    //   519: ldc 2131297091
    //   521: invokevirtual findViewById : (I)Landroid/view/View;
    //   524: putfield x0 : Landroid/view/View;
    //   527: aload_0
    //   528: aload #9
    //   530: ldc 2131297081
    //   532: invokevirtual findViewById : (I)Landroid/view/View;
    //   535: checkcast android/widget/SeekBar
    //   538: putfield z0 : Landroid/widget/SeekBar;
    //   541: aload_0
    //   542: aload #9
    //   544: ldc 2131297083
    //   546: invokevirtual findViewById : (I)Landroid/view/View;
    //   549: checkcast android/widget/TextView
    //   552: putfield A0 : Landroid/widget/TextView;
    //   555: aload_0
    //   556: aload #9
    //   558: ldc 2131297092
    //   560: invokevirtual findViewById : (I)Landroid/view/View;
    //   563: checkcast android/widget/SeekBar
    //   566: putfield B0 : Landroid/widget/SeekBar;
    //   569: aload_0
    //   570: aload #9
    //   572: ldc 2131297094
    //   574: invokevirtual findViewById : (I)Landroid/view/View;
    //   577: checkcast android/widget/TextView
    //   580: putfield C0 : Landroid/widget/TextView;
    //   583: aload_0
    //   584: aload #9
    //   586: ldc 2131297088
    //   588: invokevirtual findViewById : (I)Landroid/view/View;
    //   591: checkcast android/widget/SeekBar
    //   594: putfield D0 : Landroid/widget/SeekBar;
    //   597: aload_0
    //   598: aload #9
    //   600: ldc 2131297090
    //   602: invokevirtual findViewById : (I)Landroid/view/View;
    //   605: checkcast android/widget/TextView
    //   608: putfield E0 : Landroid/widget/TextView;
    //   611: aload_0
    //   612: aload #9
    //   614: ldc 2131297084
    //   616: invokevirtual findViewById : (I)Landroid/view/View;
    //   619: checkcast android/widget/SeekBar
    //   622: putfield F0 : Landroid/widget/SeekBar;
    //   625: aload_0
    //   626: aload #9
    //   628: ldc 2131297086
    //   630: invokevirtual findViewById : (I)Landroid/view/View;
    //   633: checkcast android/widget/TextView
    //   636: putfield G0 : Landroid/widget/TextView;
    //   639: aload_0
    //   640: getfield w0 : Landroid/widget/EditText;
    //   643: getstatic com/google/android/gms/common/util/DyJ/oXrNDUqUkE.fstLbtS : Ljava/lang/String;
    //   646: invokevirtual setHint : (Ljava/lang/CharSequence;)V
    //   649: aload_0
    //   650: getfield w0 : Landroid/widget/EditText;
    //   653: iconst_1
    //   654: anewarray android/text/InputFilter
    //   657: dup
    //   658: iconst_0
    //   659: new android/text/InputFilter$LengthFilter
    //   662: dup
    //   663: bipush #8
    //   665: invokespecial <init> : (I)V
    //   668: aastore
    //   669: invokevirtual setFilters : ([Landroid/text/InputFilter;)V
    //   672: iload_2
    //   673: ifne -> 682
    //   676: aload_0
    //   677: aload #8
    //   679: invokevirtual Q0 : (Lss0;)V
    //   682: aload_0
    //   683: invokevirtual L0 : ()V
    //   686: aload #8
    //   688: areturn
    //   689: ldc_w 'ColorChooserDialog should be created using its Builder interface.'
    //   692: invokestatic f : (Ljava/lang/String;)V
    //   695: aconst_null
    //   696: areturn
  }
  
  public final void I0(int paramInt1, int paramInt2) {
    int[][] arrayOfInt = this.r0;
    if (arrayOfInt != null && arrayOfInt.length - 1 >= paramInt1) {
      int[] arrayOfInt1 = arrayOfInt[paramInt1];
      for (paramInt1 = 0; paramInt1 < arrayOfInt1.length; paramInt1++) {
        if (arrayOfInt1[paramInt1] == paramInt2) {
          P0(paramInt1);
          return;
        } 
      } 
    } 
  }
  
  public final xm J0() {
    Bundle bundle = this.i;
    return (bundle == null || !bundle.containsKey("builder")) ? null : (xm)this.i.getSerializable("builder");
  }
  
  public final int K0() {
    int i;
    View view = this.v0;
    if (view != null && view.getVisibility() == 0)
      return this.I0; 
    if (O0() > -1) {
      i = this.r0[R0()][O0()];
    } else if (R0() > -1) {
      i = this.q0[R0()];
    } else {
      i = 0;
    } 
    if (!i) {
      i = dd1.j0((Context)M(), 16843829, 0);
      return dd1.j0((Context)M(), 2130968892, i);
    } 
    return i;
  }
  
  public final void L0() {
    ListAdapter listAdapter = this.u0.getAdapter();
    GridView gridView = this.u0;
    int i = 0;
    if (listAdapter == null) {
      gridView.setAdapter((ListAdapter)new zm(0, this));
      gridView = this.u0;
      Resources resources = S();
      ThreadLocal threadLocal = lg1.a;
      gridView.setSelector(resources.getDrawable(2131231494, null));
    } else {
      ((BaseAdapter)gridView.getAdapter()).notifyDataSetChanged();
    } 
    Dialog dialog = this.l0;
    if (dialog != null) {
      xm xm = J0();
      boolean bool = N0();
      int j = 2131886114;
      if (bool) {
        xm.getClass();
      } else {
        xm.getClass();
        i = 2131886114;
      } 
      if (i == 0) {
        xm.getClass();
        i = j;
      } 
      dialog.setTitle(i);
    } 
  }
  
  public final void M0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield l0 : Landroid/app/Dialog;
    //   4: checkcast ss0
    //   7: astore_3
    //   8: aload_3
    //   9: ifnonnull -> 15
    //   12: goto -> 234
    //   15: aload_0
    //   16: invokevirtual J0 : ()Lxm;
    //   19: getfield h : Z
    //   22: ifeq -> 234
    //   25: aload_0
    //   26: invokevirtual K0 : ()I
    //   29: istore_2
    //   30: iload_2
    //   31: invokestatic alpha : (I)I
    //   34: bipush #64
    //   36: if_icmplt -> 75
    //   39: iload_2
    //   40: istore_1
    //   41: iload_2
    //   42: invokestatic red : (I)I
    //   45: sipush #247
    //   48: if_icmple -> 82
    //   51: iload_2
    //   52: istore_1
    //   53: iload_2
    //   54: invokestatic green : (I)I
    //   57: sipush #247
    //   60: if_icmple -> 82
    //   63: iload_2
    //   64: istore_1
    //   65: iload_2
    //   66: invokestatic blue : (I)I
    //   69: sipush #247
    //   72: if_icmple -> 82
    //   75: ldc_w '#DEDEDE'
    //   78: invokestatic parseColor : (Ljava/lang/String;)I
    //   81: istore_1
    //   82: aload_0
    //   83: invokevirtual J0 : ()Lxm;
    //   86: getfield h : Z
    //   89: ifeq -> 125
    //   92: aload_3
    //   93: getstatic qy.b : Lqy;
    //   96: invokevirtual a : (Lqy;)Lcom/afollestad/materialdialogs/internal/MDButton;
    //   99: iload_1
    //   100: invokevirtual setTextColor : (I)V
    //   103: aload_3
    //   104: getstatic qy.e : Lqy;
    //   107: invokevirtual a : (Lqy;)Lcom/afollestad/materialdialogs/internal/MDButton;
    //   110: iload_1
    //   111: invokevirtual setTextColor : (I)V
    //   114: aload_3
    //   115: getstatic qy.c : Lqy;
    //   118: invokevirtual a : (Lqy;)Lcom/afollestad/materialdialogs/internal/MDButton;
    //   121: iload_1
    //   122: invokevirtual setTextColor : (I)V
    //   125: aload_0
    //   126: getfield B0 : Landroid/widget/SeekBar;
    //   129: ifnull -> 234
    //   132: aload_0
    //   133: getfield z0 : Landroid/widget/SeekBar;
    //   136: invokevirtual getVisibility : ()I
    //   139: ifne -> 165
    //   142: aload_0
    //   143: getfield z0 : Landroid/widget/SeekBar;
    //   146: astore #4
    //   148: iload_1
    //   149: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   152: astore_3
    //   153: aload #4
    //   155: aload_3
    //   156: invokevirtual setThumbTintList : (Landroid/content/res/ColorStateList;)V
    //   159: aload #4
    //   161: aload_3
    //   162: invokevirtual setProgressTintList : (Landroid/content/res/ColorStateList;)V
    //   165: aload_0
    //   166: getfield B0 : Landroid/widget/SeekBar;
    //   169: astore #4
    //   171: iload_1
    //   172: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   175: astore_3
    //   176: aload #4
    //   178: aload_3
    //   179: invokevirtual setThumbTintList : (Landroid/content/res/ColorStateList;)V
    //   182: aload #4
    //   184: aload_3
    //   185: invokevirtual setProgressTintList : (Landroid/content/res/ColorStateList;)V
    //   188: aload_0
    //   189: getfield D0 : Landroid/widget/SeekBar;
    //   192: astore_3
    //   193: iload_1
    //   194: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   197: astore #4
    //   199: aload_3
    //   200: aload #4
    //   202: invokevirtual setThumbTintList : (Landroid/content/res/ColorStateList;)V
    //   205: aload_3
    //   206: aload #4
    //   208: invokevirtual setProgressTintList : (Landroid/content/res/ColorStateList;)V
    //   211: aload_0
    //   212: getfield F0 : Landroid/widget/SeekBar;
    //   215: astore #4
    //   217: iload_1
    //   218: invokestatic valueOf : (I)Landroid/content/res/ColorStateList;
    //   221: astore_3
    //   222: aload #4
    //   224: aload_3
    //   225: invokevirtual setThumbTintList : (Landroid/content/res/ColorStateList;)V
    //   228: aload #4
    //   230: aload_3
    //   231: invokevirtual setProgressTintList : (Landroid/content/res/ColorStateList;)V
    //   234: return
  }
  
  public final boolean N0() {
    return this.i.getBoolean("in_sub", false);
  }
  
  public final int O0() {
    return (this.r0 == null) ? -1 : this.i.getInt("sub_index", -1);
  }
  
  public final void P0(int paramInt) {
    if (this.r0 == null)
      return; 
    this.i.putInt("sub_index", paramInt);
  }
  
  public final void Q0(ss0 paramss0) {
    wm wm1;
    int i = this.u0.getVisibility();
    qy qy2 = qy.c;
    qy qy1 = qy.e;
    if (i == 0) {
      J0().getClass();
      paramss0.setTitle(2131886815);
      J0().getClass();
      paramss0.i(qy2, 2131886818);
      paramss0.i(qy1, (J0()).e);
      this.u0.setVisibility(4);
      this.v0.setVisibility(0);
      vm vm1 = new vm(0, this);
      this.y0 = vm1;
      this.w0.addTextChangedListener(vm1);
      wm1 = new wm(0, this);
      this.H0 = wm1;
      this.B0.setOnSeekBarChangeListener(wm1);
      this.D0.setOnSeekBarChangeListener(this.H0);
      this.F0.setOnSeekBarChangeListener(this.H0);
      if (this.z0.getVisibility() == 0) {
        this.z0.setOnSeekBarChangeListener(this.H0);
        this.w0.setText(String.format("%08X", new Object[] { Integer.valueOf(this.I0) }));
        return;
      } 
      this.w0.setText(String.format("%06X", new Object[] { Integer.valueOf(this.I0 & 0xFFFFFF) }));
      return;
    } 
    J0().getClass();
    wm1.setTitle(2131886114);
    J0().getClass();
    wm1.i(qy2, 2131886815);
    if (N0()) {
      J0().getClass();
      wm1.i(qy1, 2131886812);
    } else {
      wm1.i(qy1, (J0()).e);
    } 
    this.u0.setVisibility(0);
    this.v0.setVisibility(8);
    this.w0.removeTextChangedListener(this.y0);
    this.y0 = null;
    this.B0.setOnSeekBarChangeListener(null);
    this.D0.setOnSeekBarChangeListener(null);
    this.F0.setOnSeekBarChangeListener(null);
    this.H0 = null;
  }
  
  public final int R0() {
    return this.i.getInt("top_index", -1);
  }
  
  public final void S0(int paramInt) {
    if (paramInt > -1)
      I0(paramInt, this.q0[paramInt]); 
    this.i.putInt("top_index", paramInt);
  }
  
  public final void d0(Activity paramActivity) {
    this.I = true;
    if (paramActivity instanceof ym) {
      this.t0 = (ym)paramActivity;
      return;
    } 
    this.t0 = (J0()).g;
  }
  
  public final void n0(Bundle paramBundle) {
    boolean bool;
    super.n0(paramBundle);
    paramBundle.putInt("top_index", R0());
    paramBundle.putBoolean("in_sub", N0());
    paramBundle.putInt("sub_index", O0());
    View view = this.v0;
    if (view != null && view.getVisibility() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    paramBundle.putBoolean("in_custom", bool);
  }
  
  public final void onClick(View paramView) {
    if (paramView.getTag() != null) {
      int i = Integer.parseInt(((String)paramView.getTag()).split(":")[0]);
      ss0 ss0 = (ss0)this.l0;
      xm xm = J0();
      if (N0()) {
        P0(i);
      } else {
        S0(i);
        int[][] arrayOfInt = this.r0;
        if (arrayOfInt != null && i < arrayOfInt.length) {
          xm.getClass();
          ss0.i(qy.e, 2131886812);
          this.i.putBoolean("in_sub", true);
        } 
      } 
      if (xm.i) {
        this.I0 = K0();
        M0();
        L0();
      } 
      ym ym1 = this.t0;
      if (ym1 != null)
        ym1.F(R0()); 
      E0(false, false);
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    if (paramView.getTag() != null) {
      int n = Integer.parseInt(((String)paramView.getTag()).split(":")[1]);
      CircleView circleView = (CircleView)paramView;
      int[] arrayOfInt = new int[2];
      Rect rect = new Rect();
      circleView.getLocationOnScreen(arrayOfInt);
      circleView.getWindowVisibleDisplayFrame(rect);
      Context context = circleView.getContext();
      int i = circleView.getWidth();
      int k = circleView.getHeight();
      int m = arrayOfInt[1];
      int i1 = k / 2;
      int j = arrayOfInt[0];
      j = i / 2 + j;
      WeakHashMap weakHashMap = v22.a;
      i = j;
      if (circleView.getLayoutDirection() == 0)
        i = (context.getResources().getDisplayMetrics()).widthPixels - j; 
      Toast toast = Toast.makeText(context, String.format("#%06X", new Object[] { Integer.valueOf(n & 0xFFFFFF) }), 0);
      if (i1 + m < rect.height()) {
        toast.setGravity(8388661, i, arrayOfInt[1] + k - rect.top);
      } else {
        toast.setGravity(81, 0, k);
      } 
      toast.show();
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */