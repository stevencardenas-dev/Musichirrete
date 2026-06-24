import android.content.Context;
import android.media.audiofx.EnvironmentalReverb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sdsmdg.harjot.crollerTest.Croller;
import in.krosbits.android.widgets.AdvanceSeekbar;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.musicolet.EqualizerActivity2;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import java.util.ArrayList;

public class e50 extends ua0 implements AdapterView.OnItemSelectedListener, SeekBar.OnSeekBarChangeListener, View.OnClickListener, CompoundButton.OnCheckedChangeListener, f41 {
  public TextView A0;
  
  public Croller B0;
  
  public TextView C0;
  
  public ConstraintLayout D0;
  
  public final xg1 E0 = new xg1("", new EnvironmentalReverb.Settings(), 100.0D);
  
  public EqualizerActivity2 a0;
  
  public boolean b0;
  
  public AppCompatCheckBox c0;
  
  public Spinner d0;
  
  public y40 e0;
  
  public SmartImageView f0;
  
  public SmartImageView g0;
  
  public AdvanceSeekbar h0;
  
  public TextView i0;
  
  public Croller j0;
  
  public TextView k0;
  
  public Croller l0;
  
  public TextView m0;
  
  public Croller n0;
  
  public TextView o0;
  
  public Croller p0;
  
  public TextView q0;
  
  public Croller r0;
  
  public TextView s0;
  
  public Croller t0;
  
  public TextView u0;
  
  public Croller v0;
  
  public TextView w0;
  
  public Croller x0;
  
  public TextView y0;
  
  public Croller z0;
  
  public final void B(Croller paramCroller) {
    xg1 xg11 = D0(true);
    j50.D(this.a0.p0(), xg11);
    this.b0 = true;
    this.d0.setSelection(j50.n().size());
    this.b0 = false;
  }
  
  public final xg1 D0(boolean paramBoolean) {
    EnvironmentalReverb.Settings settings;
    xg1 xg11 = this.E0;
    if (paramBoolean) {
      settings = xg11.b;
    } else {
      settings = new EnvironmentalReverb.Settings();
    } 
    settings.roomLevel = (short)(this.j0.getProgress() - 9000);
    settings.roomHFLevel = (short)(this.l0.getProgress() - 9000);
    settings.decayTime = this.n0.getProgress() + 100;
    settings.decayHFRatio = (short)(this.p0.getProgress() + 100);
    settings.reflectionsLevel = (short)(this.r0.getProgress() - 9000);
    settings.reflectionsDelay = this.t0.getProgress();
    settings.reverbLevel = (short)(this.v0.getProgress() - 9000);
    settings.reverbDelay = this.x0.getProgress();
    settings.diffusion = (short)this.z0.getProgress();
    settings.density = (short)this.B0.getProgress();
    double d = this.h0.getProgress() / 100.0D;
    if (paramBoolean) {
      xg11.c = d;
      return xg11;
    } 
    return new xg1("", settings, d);
  }
  
  public final void E0() {
    // Byte code:
    //   0: getstatic m92.h : [I
    //   3: astore #5
    //   5: aload_0
    //   6: getfield a0 : Lin/krosbits/musicolet/EqualizerActivity2;
    //   9: astore #6
    //   11: aload #6
    //   13: ifnonnull -> 17
    //   16: return
    //   17: aload #6
    //   19: invokevirtual p0 : ()I
    //   22: istore_2
    //   23: aload #5
    //   25: iconst_5
    //   26: iaload
    //   27: istore_1
    //   28: iload_2
    //   29: getstatic in/krosbits/musicolet/MusicService.D0 : I
    //   32: if_icmpne -> 59
    //   35: iload_2
    //   36: invokestatic r : (I)Z
    //   39: ifeq -> 59
    //   42: iload_2
    //   43: invokestatic t : (I)Z
    //   46: istore #4
    //   48: iload #4
    //   50: ifeq -> 59
    //   53: iconst_1
    //   54: istore #4
    //   56: goto -> 62
    //   59: iconst_0
    //   60: istore #4
    //   62: aload_0
    //   63: getfield f0 : Lin/krosbits/android/widgets/SmartImageView;
    //   66: astore #6
    //   68: iload #4
    //   70: ifeq -> 90
    //   73: aload #6
    //   75: iconst_5
    //   76: invokevirtual setColorTintIndex : (I)V
    //   79: aload_0
    //   80: getfield g0 : Lin/krosbits/android/widgets/SmartImageView;
    //   83: iconst_5
    //   84: invokevirtual setColorTintIndex : (I)V
    //   87: goto -> 112
    //   90: aload #6
    //   92: bipush #7
    //   94: invokevirtual setColorTintIndex : (I)V
    //   97: aload_0
    //   98: getfield g0 : Lin/krosbits/android/widgets/SmartImageView;
    //   101: bipush #7
    //   103: invokevirtual setColorTintIndex : (I)V
    //   106: aload #5
    //   108: bipush #7
    //   110: iaload
    //   111: istore_1
    //   112: iconst_0
    //   113: istore_2
    //   114: iload_2
    //   115: aload_0
    //   116: getfield D0 : Landroidx/constraintlayout/widget/ConstraintLayout;
    //   119: invokevirtual getChildCount : ()I
    //   122: if_icmpge -> 179
    //   125: aload_0
    //   126: getfield D0 : Landroidx/constraintlayout/widget/ConstraintLayout;
    //   129: iload_2
    //   130: invokevirtual getChildAt : (I)Landroid/view/View;
    //   133: astore #6
    //   135: aload #6
    //   137: instanceof android/widget/TextView
    //   140: ifeq -> 173
    //   143: aload #6
    //   145: checkcast android/widget/TextView
    //   148: astore #6
    //   150: iload #4
    //   152: ifeq -> 161
    //   155: bipush #6
    //   157: istore_3
    //   158: goto -> 164
    //   161: bipush #7
    //   163: istore_3
    //   164: aload #6
    //   166: aload #5
    //   168: iload_3
    //   169: iaload
    //   170: invokevirtual setTextColor : (I)V
    //   173: iinc #2, 1
    //   176: goto -> 114
    //   179: aload_0
    //   180: getfield h0 : Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   183: iload #4
    //   185: invokevirtual setSelfEnabled : (Z)V
    //   188: aload_0
    //   189: getfield j0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   192: iload #4
    //   194: invokevirtual setSelfEnabled : (Z)V
    //   197: aload_0
    //   198: getfield l0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   201: iload #4
    //   203: invokevirtual setSelfEnabled : (Z)V
    //   206: aload_0
    //   207: getfield n0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   210: iload #4
    //   212: invokevirtual setSelfEnabled : (Z)V
    //   215: aload_0
    //   216: getfield p0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   219: iload #4
    //   221: invokevirtual setSelfEnabled : (Z)V
    //   224: aload_0
    //   225: getfield r0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   228: iload #4
    //   230: invokevirtual setSelfEnabled : (Z)V
    //   233: aload_0
    //   234: getfield t0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   237: iload #4
    //   239: invokevirtual setSelfEnabled : (Z)V
    //   242: aload_0
    //   243: getfield v0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   246: iload #4
    //   248: invokevirtual setSelfEnabled : (Z)V
    //   251: aload_0
    //   252: getfield x0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   255: iload #4
    //   257: invokevirtual setSelfEnabled : (Z)V
    //   260: aload_0
    //   261: getfield z0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   264: iload #4
    //   266: invokevirtual setSelfEnabled : (Z)V
    //   269: aload_0
    //   270: getfield B0 : Lcom/sdsmdg/harjot/crollerTest/Croller;
    //   273: iload #4
    //   275: invokevirtual setSelfEnabled : (Z)V
    //   278: aload_0
    //   279: invokevirtual P : ()Landroid/content/Context;
    //   282: iload_1
    //   283: iconst_0
    //   284: invokestatic U : (Landroid/content/Context;II)Landroid/graphics/drawable/StateListDrawable;
    //   287: astore #6
    //   289: aload_0
    //   290: invokevirtual P : ()Landroid/content/Context;
    //   293: iload_1
    //   294: iconst_0
    //   295: invokestatic U : (Landroid/content/Context;II)Landroid/graphics/drawable/StateListDrawable;
    //   298: astore #5
    //   300: aload_0
    //   301: invokevirtual P : ()Landroid/content/Context;
    //   304: iload_1
    //   305: iconst_0
    //   306: invokestatic U : (Landroid/content/Context;II)Landroid/graphics/drawable/StateListDrawable;
    //   309: astore #7
    //   311: aload_0
    //   312: getfield d0 : Landroid/widget/Spinner;
    //   315: aload #6
    //   317: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   320: aload_0
    //   321: getfield f0 : Lin/krosbits/android/widgets/SmartImageView;
    //   324: aload #5
    //   326: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   329: aload_0
    //   330: getfield g0 : Lin/krosbits/android/widgets/SmartImageView;
    //   333: aload #7
    //   335: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   338: aload_0
    //   339: iconst_1
    //   340: invokevirtual F0 : (Z)V
    //   343: return
    //   344: astore #5
    //   346: aload #5
    //   348: invokevirtual printStackTrace : ()V
    //   351: return
    // Exception table:
    //   from	to	target	type
    //   17	23	344	finally
    //   28	48	344	finally
    //   73	87	344	finally
    //   90	106	344	finally
    //   114	150	344	finally
    //   164	173	344	finally
    //   179	343	344	finally
  }
  
  public final void F0(boolean paramBoolean) {
    xg1 xg11;
    this.b0 = true;
    if (paramBoolean)
      I0(); 
    ArrayList<xg1> arrayList1 = j50.n();
    ArrayList arrayList = j50.p();
    int k = this.a0.p0();
    String str = ga1.i("EQSRVPTP_", k);
    int j = MyApplication.o().getInt(str, 0);
    int i = j;
    if (j >= this.e0.getCount())
      i = this.e0.getCount() - 1; 
    if (this.d0.getSelectedItemPosition() != i)
      this.d0.setSelection(i); 
    if (i < arrayList1.size()) {
      xg11 = arrayList1.get(i);
    } else if (i == arrayList1.size()) {
      xg11 = j50.f(k);
    } else {
      xg11 = xg11.get(i - arrayList1.size() - 1);
    } 
    H0(xg11);
    paramBoolean = j50.t(k);
    if (paramBoolean != this.c0.isChecked())
      this.c0.setChecked(paramBoolean); 
    this.b0 = false;
  }
  
  public final void G0() {
    ms0 ms0 = new ms0(P());
    ms0.c(2131887233);
    ms0.n(2131886639);
    ms0.p();
    MyApplication.x().edit().putBoolean("strvexsh", true).apply();
  }
  
  public final void H0(xg1 paramxg1) {
    this.h0.setProgress((int)(paramxg1.c * 100.0D));
    TextView textView3 = this.i0;
    StringBuilder stringBuilder6 = new StringBuilder();
    stringBuilder6.append(this.h0.getProgress());
    stringBuilder6.append("%");
    textView3.setText(stringBuilder6.toString());
    EnvironmentalReverb.Settings settings = paramxg1.b;
    this.j0.setProgress(settings.roomLevel + 9000);
    this.k0.setText(ag0.D(settings.roomLevel));
    this.l0.setProgress(settings.roomHFLevel + 9000);
    this.m0.setText(ag0.D(settings.roomHFLevel));
    this.n0.setProgress(settings.decayTime - 100);
    TextView textView6 = this.o0;
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append(settings.decayTime);
    stringBuilder3.append(" ms");
    textView6.setText(stringBuilder3.toString());
    this.p0.setProgress(settings.decayHFRatio - 100);
    TextView textView2 = this.q0;
    StringBuilder stringBuilder5 = new StringBuilder();
    stringBuilder5.append(settings.decayHFRatio);
    stringBuilder5.append(" ms");
    textView2.setText(stringBuilder5.toString());
    this.r0.setProgress(settings.reflectionsLevel + 9000);
    this.s0.setText(ag0.D(settings.reflectionsLevel));
    this.t0.setProgress(settings.reflectionsDelay);
    TextView textView5 = this.u0;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(settings.reflectionsDelay);
    stringBuilder2.append(" ms");
    textView5.setText(stringBuilder2.toString());
    this.v0.setProgress(settings.reverbLevel + 9000);
    this.w0.setText(ag0.D(settings.reverbLevel));
    this.x0.setProgress(settings.reverbDelay);
    TextView textView1 = this.y0;
    StringBuilder stringBuilder4 = new StringBuilder();
    stringBuilder4.append(settings.reverbDelay);
    stringBuilder4.append(" ms");
    textView1.setText(stringBuilder4.toString());
    this.z0.setProgress(settings.diffusion);
    TextView textView4 = this.A0;
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(settings.diffusion);
    stringBuilder1.append(" o/oo");
    textView4.setText(stringBuilder1.toString());
    this.B0.setProgress(settings.density);
    textView4 = this.C0;
    stringBuilder1 = new StringBuilder();
    stringBuilder1.append(settings.density);
    stringBuilder1.append(" o/oo");
    textView4.setText(stringBuilder1.toString());
  }
  
  public final void I(Croller paramCroller, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      xg1 xg11 = D0(true);
      H0(xg11);
      if (this.a0.p0() == MusicService.D0)
        try {
          return;
        } finally {
          xg11 = null;
        }  
    } 
  }
  
  public final void I0() {
    int[] arrayOfInt = m92.h;
    ArrayList<Object> arrayList2 = j50.n();
    ArrayList<Object> arrayList1 = j50.p();
    int i = arrayList2.size();
    ArrayList<String> arrayList = new ArrayList(arrayList1.size() + i + 1);
    int j = arrayList2.size();
    boolean bool = false;
    i = 0;
    while (i < j) {
      Object object = arrayList2.get(i);
      i++;
      arrayList.add(((xg1)object).a);
    } 
    arrayList.add(T(2131886420));
    j = arrayList1.size();
    i = bool;
    while (i < j) {
      Object object = arrayList1.get(i);
      i++;
      arrayList.add(((xg1)object).a);
    } 
    i = this.a0.p0();
    if (MusicService.D0 == i && j50.r(i) && j50.t(i)) {
      i = arrayOfInt[5];
    } else {
      i = arrayOfInt[7];
    } 
    y40 y401 = new y40(P(), arrayList, i, 1);
    this.e0 = y401;
    this.d0.setAdapter((SpinnerAdapter)y401);
  }
  
  public final void e0(Context paramContext) {
    super.e0(paramContext);
    this.a0 = (EqualizerActivity2)paramContext;
  }
  
  public final View g0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    View view = paramLayoutInflater.inflate(2131492991, paramViewGroup, false);
    this.D0 = (ConstraintLayout)view.findViewById(2131296578);
    this.c0 = (AppCompatCheckBox)view.findViewById(2131296553);
    this.d0 = (Spinner)view.findViewById(2131297512);
    this.f0 = (SmartImageView)view.findViewById(2131296899);
    this.g0 = (SmartImageView)view.findViewById(2131296848);
    this.h0 = (AdvanceSeekbar)view.findViewById(2131297434);
    this.i0 = (TextView)view.findViewById(2131297698);
    this.j0 = (Croller)view.findViewById(2131296617);
    this.k0 = (TextView)view.findViewById(2131297854);
    this.l0 = (Croller)view.findViewById(2131296616);
    this.m0 = (TextView)view.findViewById(2131297852);
    this.n0 = (Croller)view.findViewById(2131296609);
    this.o0 = (TextView)view.findViewById(2131297729);
    this.p0 = (Croller)view.findViewById(2131296608);
    this.q0 = (TextView)view.findViewById(2131297727);
    this.r0 = (Croller)view.findViewById(2131296613);
    this.s0 = (TextView)view.findViewById(2131297844);
    this.t0 = (Croller)view.findViewById(2131296612);
    this.u0 = (TextView)view.findViewById(2131297842);
    this.v0 = (Croller)view.findViewById(2131296615);
    this.w0 = (TextView)view.findViewById(2131297849);
    this.x0 = (Croller)view.findViewById(2131296614);
    this.y0 = (TextView)view.findViewById(2131297847);
    this.z0 = (Croller)view.findViewById(2131296611);
    this.A0 = (TextView)view.findViewById(2131297735);
    this.B0 = (Croller)view.findViewById(2131296610);
    this.C0 = (TextView)view.findViewById(2131297731);
    view.findViewById(2131296895).setOnClickListener(this);
    this.h0.setProgressStepIncreaseValue(10);
    try {
      E0();
      this.c0.setOnCheckedChangeListener(this);
      this.d0.setOnItemSelectedListener(this);
      this.f0.setOnClickListener(this);
      this.g0.setOnClickListener(this);
      this.h0.setOnSeekBarChangeListener(this);
      this.j0.setOnCrollerChangeListener(this);
      this.l0.setOnCrollerChangeListener(this);
      this.n0.setOnCrollerChangeListener(this);
      this.p0.setOnCrollerChangeListener(this);
      this.r0.setOnCrollerChangeListener(this);
      this.t0.setOnCrollerChangeListener(this);
      return view;
    } finally {
      paramViewGroup = null;
      paramViewGroup.printStackTrace();
      ag0.O0(2131886509, 1);
      this.a0.finish();
    } 
  }
  
  public final void j0() {
    this.a0 = null;
    this.I = true;
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {
    if (paramCompoundButton == this.c0) {
      int i = this.a0.p0();
      if (j50.t(i) != paramBoolean) {
        if (paramBoolean && !MyApplication.x().getBoolean("strvexsh", false))
          G0(); 
        String str = ga1.i("IREON_", i);
        MyApplication.o().edit().putBoolean(str, paramBoolean).apply();
      } 
    } 
  }
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296899) {
      if (this.d0.getSelectedItemPosition() == j50.n().size()) {
        ms0 ms0 = new ms0(P());
        ms0.q(2131887270);
        ms0.g(T(2131887119), null, false, new f(10, this));
        ms0.k(2131886278);
        ms0.n(2131887265);
        ms0.p();
        return;
      } 
    } else if (i == 2131296848) {
      try {
        i = this.d0.getSelectedItemPosition();
        if (i > j50.n().size()) {
          j50.p().remove(i - j50.n().size() - 1);
          j50.C();
          I0();
          return;
        } 
      } finally {
        paramView = null;
        paramView.printStackTrace();
      } 
    } else if (i == 2131296895) {
      G0();
    } 
  }
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    int i = this.a0.p0();
    int j = j50.a;
    String str = ga1.i("EQSRVPTP_", i);
    MyApplication.o().edit().putInt(str, paramInt).apply();
    i = j50.n().size();
    SmartImageView smartImageView = this.f0;
    if (paramInt < i) {
      smartImageView.setVisibility(8);
      this.g0.setVisibility(8);
    } else if (paramInt == i) {
      smartImageView.setVisibility(0);
      this.g0.setVisibility(8);
    } else {
      smartImageView.setVisibility(8);
      this.g0.setVisibility(0);
    } 
    try {
      return;
    } finally {
      smartImageView = null;
      smartImageView.printStackTrace();
    } 
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {
    if (paramSeekBar == this.h0 && paramBoolean) {
      xg1 xg11 = D0(true);
      H0(xg11);
      if (this.a0.p0() == MusicService.D0)
        try {
          return;
        } finally {
          xg11 = null;
        }  
    } 
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {
    if (paramSeekBar == this.h0) {
      xg1 xg11 = D0(true);
      j50.D(this.a0.p0(), xg11);
      this.b0 = true;
      this.d0.setSelection(j50.n().size());
      this.b0 = false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */