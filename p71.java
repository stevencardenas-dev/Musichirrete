import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.afollestad.materialdialogs.internal.MDButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import in.krosbits.utils.layoutmanager.LinearLayoutManager2;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class p71 extends ms0 implements View.OnClickListener {
  public final SeekBar B0;
  
  public final SeekBar C0;
  
  public final EditText D0;
  
  public final EditText E0;
  
  public boolean F0;
  
  public float G0;
  
  public float H0;
  
  public int I0;
  
  public final Button J0;
  
  public final Button K0;
  
  public final Button L0;
  
  public final Button M0;
  
  public final Button N0;
  
  public final Button O0;
  
  public final Spinner P0;
  
  public final ViewGroup Q0;
  
  public final ViewGroup R0;
  
  public final MaterialButtonToggleGroup S0;
  
  public final MaterialButtonToggleGroup T0;
  
  public final MaterialButtonToggleGroup U0;
  
  public final MaterialButton V0;
  
  public final MaterialButton W0;
  
  public final TextView X0;
  
  public final Group Y0;
  
  public ss0 Z0;
  
  public final boolean a1 = false;
  
  public boolean b1;
  
  public final List c1;
  
  public Context d1;
  
  public final f e1;
  
  public p71(Context paramContext) {
    this(paramContext, Collections.EMPTY_LIST);
  }
  
  public p71(Context paramContext, List<km0> paramList) {
    super(paramContext);
    this.d1 = paramContext;
    e(2131493183, false);
    this.D0 = (EditText)this.u.findViewById(2131296705);
    this.E0 = (EditText)this.u.findViewById(2131296704);
    this.B0 = (SeekBar)this.u.findViewById(2131297438);
    this.C0 = (SeekBar)this.u.findViewById(2131297437);
    this.J0 = (Button)this.u.findViewById(2131296407);
    this.K0 = (Button)this.u.findViewById(2131296421);
    this.L0 = (Button)this.u.findViewById(2131296408);
    this.M0 = (Button)this.u.findViewById(2131296422);
    this.S0 = (MaterialButtonToggleGroup)this.u.findViewById(2131297656);
    this.V0 = (MaterialButton)this.u.findViewById(2131297592);
    this.W0 = (MaterialButton)this.u.findViewById(2131297606);
    this.X0 = (TextView)this.u.findViewById(2131297751);
    this.Y0 = (Group)this.u.findViewById(2131296762);
    this.T0 = (MaterialButtonToggleGroup)this.u.findViewById(2131297641);
    this.O0 = (Button)this.u.findViewById(2131296428);
    this.N0 = (Button)this.u.findViewById(2131296381);
    this.P0 = (Spinner)this.u.findViewById(2131297510);
    this.Q0 = (ViewGroup)this.u.findViewById(2131297944);
    this.R0 = (ViewGroup)this.u.findViewById(2131297943);
    this.U0 = (MaterialButtonToggleGroup)this.u.findViewById(2131297639);
    byte b;
    for (b = 0; b < this.U0.getChildCount(); b++)
      ((MaterialButton)this.U0.getChildAt(b)).setSingleLine(false); 
    Spinner spinner1 = this.P0;
    Context context2 = this.d1;
    spinner1.setBackground((Drawable)ag0.V(context2, m92.h[3], 0, (int)context2.getResources().getDimension(2131165390), this.d1.getResources().getDimension(2131165390) * 4.0F));
    Spinner spinner2 = this.P0;
    Context context1 = this.d1;
    spinner2.setAdapter((SpinnerAdapter)new t8(this, context1, context1.getResources().getStringArray(2130903047)));
    this.P0.setPadding(0, 0, 0, 0);
    this.O0.setOnClickListener(this);
    this.N0.setOnClickListener(this);
    this.V0.setMaxLines(3);
    this.V0.setAllCaps(false);
    this.W0.setMaxLines(3);
    this.W0.setAllCaps(false);
    if (paramList.size() == 0) {
      km0 km0 = MusicService.y();
      if (km0 != null)
        paramList = Collections.singletonList(km0); 
    } else {
      this.a1 = true;
      paramList = new ArrayList<km0>(paramList);
    } 
    if (this.a1 && g92.P()) {
      this.U0.setEnabled(false);
      for (b = 0; b < this.U0.getChildCount(); b++)
        this.U0.getChildAt(b).setEnabled(false); 
    } 
    this.c1 = paramList;
    this.S0.f(new m71(this, 0));
    hc hc = MusicService.E0;
    if (hc != null && !hc.v()) {
      this.E0.setEnabled(false);
      this.C0.setEnabled(false);
      this.L0.setEnabled(false);
      this.M0.setEnabled(false);
      TextView textView = (TextView)this.u.findViewById(2131297620);
      textView.setText(MyApplication.i.getApplicationContext().getString(2131887014, new Object[] { j50.g() }));
      textView.setVisibility(0);
    } 
    wm wm = new wm(1, this);
    this.D0.addTextChangedListener(new o71(this, 0));
    this.E0.addTextChangedListener(new o71(this, 1));
    this.B0.setOnSeekBarChangeListener(wm);
    this.C0.setOnSeekBarChangeListener(wm);
    this.e1 = new f(24, this);
    this.J0.setOnClickListener(this);
    this.K0.setOnClickListener(this);
    this.L0.setOnClickListener(this);
    this.M0.setOnClickListener(this);
    this.D0.requestFocus();
    this.Y = new f50(1, this);
    this.W = new un(6, this);
    u();
    this.T0.f(new m71(this, 1));
    this.U0.f(new m71(this, 2));
  }
  
  public static float[] r() {
    return new float[] { MyApplication.o().getInt("k_f_plyspd4", 10000) / 10000.0F, MyApplication.o().getInt("k_f_plyptch4", 10000) / 10000.0F };
  }
  
  public static boolean s(float[] paramArrayOffloat) {
    float[] arrayOfFloat = r();
    return (paramArrayOffloat != null && paramArrayOffloat.length >= 2) ? ((paramArrayOffloat[0] != arrayOfFloat[0] || paramArrayOffloat[1] != arrayOfFloat[1])) : false;
  }
  
  public static float t(EditText paramEditText) {
    try {
      return Float.parseFloat(paramEditText.getText().toString());
    } catch (NumberFormatException numberFormatException) {
      return NumberFormat.getInstance().parse(paramEditText.getText().toString()).floatValue();
    } 
  }
  
  public static void w(float paramFloat1, float paramFloat2) {
    MyApplication.o().edit().putInt("k_f_plyspd4", Math.round(paramFloat1 * 10000.0F)).apply();
    MyApplication.o().edit().putInt("k_f_plyptch4", Math.round(paramFloat2 * 10000.0F)).apply();
  }
  
  public static void x(EditText paramEditText, float paramFloat) {
    byte b;
    if (Math.round(1000.0F * paramFloat) % 10 != 0) {
      b = 3;
    } else {
      b = 2;
    } 
    if (Math.round(10000.0F * paramFloat) % 10 != 0)
      b = 4; 
    String str = x41.i(b, "%.", "f");
    paramEditText.setText(String.format(Locale.US, str, new Object[] { Float.valueOf(paramFloat) }));
  }
  
  public static void y() {
    try {
      MusicService.P0.w0(true);
      MusicActivity musicActivity = MusicActivity.R0;
      if (musicActivity != null) {
        z71 z71 = musicActivity.d0;
        if (z71 != null && z71.Y())
          MusicActivity.R0.d0.Y0(); 
      } 
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    float f2 = 3.0F;
    EditText editText = this.D0;
    float f1 = 0.5F;
    if (i == 2131296407) {
      try {
        float f3 = (float)(t(editText) - 0.01D);
        if (f3 >= 0.5F)
          f1 = f3; 
        if (f1 > 3.0F)
          f1 = f2; 
        x(editText, f1);
        return;
      } finally {}
    } else {
      if (i == 2131296421) {
        float f3 = (float)(t(editText) + 0.01D);
        if (f3 >= 0.5F)
          f1 = f3; 
        if (f1 <= 3.0F)
          f2 = f1; 
        x(editText, f2);
        return;
      } 
      f2 = 2.0F;
      editText = this.E0;
      if (i == 2131296408) {
        float f3 = (float)(t(editText) - 0.01D);
        if (f3 >= 0.5F)
          f1 = f3; 
        if (f1 <= 2.0F)
          f2 = f1; 
        x(editText, f2);
        return;
      } 
      if (i == 2131296422) {
        float f3 = (float)(t(editText) + 0.01D);
        if (f3 >= 0.5F)
          f1 = f3; 
        if (f1 <= 2.0F)
          f2 = f1; 
        x(editText, f2);
        return;
      } 
      if (i == 2131297751) {
        try {
          ms0 ms01 = new ms0();
          this(this.d1);
          a3 a3 = new a3();
          this(this.c1.toArray(new Object[0]));
          LinearLayoutManager2 linearLayoutManager2 = new LinearLayoutManager2();
          super(1);
          ms01.a(a3, linearLayoutManager2);
          ms01.n(2131887030);
          return;
        } finally {
          editText = null;
        } 
      } else {
        ss0 ss01;
        f f3 = this.e1;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.T0;
        if (i == 2131296381) {
          i = materialButtonToggleGroup.getCheckedButtonId();
          ss01 = this.Z0;
          if (i == 2131297590) {
            f3.Q(ss01, qy.b);
            return;
          } 
          if (ss01 != null && ss01.isShowing()) {
            this.Z0.dismiss();
            return;
          } 
        } else if (i == 2131296428) {
          if (ss01.getCheckedButtonId() == 2131297590) {
            f3.Q(this.Z0, qy.c);
            return;
          } 
          this.U0.g(2131297600, true);
        } 
      } 
    } 
  }
  
  public final void u() {
    // Byte code:
    //   0: invokestatic P : ()Z
    //   3: istore #5
    //   5: aload_0
    //   6: getfield O0 : Landroid/widget/Button;
    //   9: astore #7
    //   11: aload_0
    //   12: getfield T0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   15: astore #8
    //   17: aload_0
    //   18: getfield R0 : Landroid/view/ViewGroup;
    //   21: astore #9
    //   23: bipush #8
    //   25: istore #4
    //   27: aload_0
    //   28: getfield Q0 : Landroid/view/ViewGroup;
    //   31: astore #6
    //   33: iload #5
    //   35: ifeq -> 203
    //   38: aload #6
    //   40: iconst_0
    //   41: invokevirtual setVisibility : (I)V
    //   44: aload #9
    //   46: bipush #8
    //   48: invokevirtual setVisibility : (I)V
    //   51: aload #8
    //   53: ldc_w 2131297596
    //   56: iconst_1
    //   57: invokevirtual g : (IZ)V
    //   60: aload_0
    //   61: iconst_1
    //   62: putfield b1 : Z
    //   65: invokestatic z : ()V
    //   68: invokestatic o : ()Landroid/content/SharedPreferences;
    //   71: ldc_w 'k_f_plyspd4'
    //   74: sipush #10000
    //   77: invokeinterface getInt : (Ljava/lang/String;I)I
    //   82: istore_3
    //   83: iload_3
    //   84: sipush #5000
    //   87: if_icmpeq -> 167
    //   90: iload_3
    //   91: sipush #7500
    //   94: if_icmpeq -> 160
    //   97: iload_3
    //   98: sipush #9000
    //   101: if_icmpeq -> 153
    //   104: iload_3
    //   105: sipush #12500
    //   108: if_icmpeq -> 146
    //   111: iload_3
    //   112: sipush #15000
    //   115: if_icmpeq -> 139
    //   118: iload_3
    //   119: sipush #20000
    //   122: if_icmpeq -> 132
    //   125: ldc_w 2131297600
    //   128: istore_3
    //   129: goto -> 171
    //   132: ldc_w 2131297603
    //   135: istore_3
    //   136: goto -> 171
    //   139: ldc_w 2131297602
    //   142: istore_3
    //   143: goto -> 171
    //   146: ldc_w 2131297601
    //   149: istore_3
    //   150: goto -> 171
    //   153: ldc_w 2131297599
    //   156: istore_3
    //   157: goto -> 171
    //   160: ldc_w 2131297598
    //   163: istore_3
    //   164: goto -> 171
    //   167: ldc_w 2131297597
    //   170: istore_3
    //   171: aload_0
    //   172: getfield U0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   175: iload_3
    //   176: iconst_1
    //   177: invokevirtual g : (IZ)V
    //   180: aload_0
    //   181: iconst_0
    //   182: putfield b1 : Z
    //   185: iload_3
    //   186: ldc_w 2131297600
    //   189: if_icmpeq -> 195
    //   192: iconst_0
    //   193: istore #4
    //   195: aload #7
    //   197: iload #4
    //   199: invokevirtual setVisibility : (I)V
    //   202: return
    //   203: aload #6
    //   205: bipush #8
    //   207: invokevirtual setVisibility : (I)V
    //   210: aload #9
    //   212: iconst_0
    //   213: invokevirtual setVisibility : (I)V
    //   216: aload #8
    //   218: ldc_w 2131297590
    //   221: iconst_1
    //   222: invokevirtual g : (IZ)V
    //   225: invokestatic x : ()Landroid/content/SharedPreferences;
    //   228: ldc_w 's_b_adspsw'
    //   231: iconst_0
    //   232: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   237: ifne -> 262
    //   240: invokestatic x : ()Landroid/content/SharedPreferences;
    //   243: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   248: ldc_w 's_b_adspsw'
    //   251: iconst_1
    //   252: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   257: invokeinterface apply : ()V
    //   262: aload_0
    //   263: getfield c1 : Ljava/util/List;
    //   266: astore #11
    //   268: aload #11
    //   270: invokeinterface size : ()I
    //   275: istore_3
    //   276: aload_0
    //   277: getfield a1 : Z
    //   280: istore #5
    //   282: aload_0
    //   283: getfield P0 : Landroid/widget/Spinner;
    //   286: astore #8
    //   288: aload_0
    //   289: getfield S0 : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   292: astore #9
    //   294: aload_0
    //   295: getfield X0 : Landroid/widget/TextView;
    //   298: astore #10
    //   300: iload_3
    //   301: ifle -> 554
    //   304: aload #11
    //   306: invokeinterface size : ()I
    //   311: iconst_1
    //   312: if_icmpne -> 447
    //   315: new java/lang/StringBuilder
    //   318: dup
    //   319: ldc_w '<a href=''>'
    //   322: invokespecial <init> : (Ljava/lang/String;)V
    //   325: astore #6
    //   327: aload #6
    //   329: aload #11
    //   331: iconst_0
    //   332: invokeinterface get : (I)Ljava/lang/Object;
    //   337: checkcast km0
    //   340: getfield g : Ljava/lang/String;
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: pop
    //   347: aload #6
    //   349: ldc_w '</a>'
    //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: pop
    //   356: aload #10
    //   358: aload #6
    //   360: invokevirtual toString : ()Ljava/lang/String;
    //   363: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   366: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   369: aload #10
    //   371: aload_0
    //   372: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   375: getstatic in/krosbits/musicolet/MyApplication.j : Lwn1;
    //   378: astore #6
    //   380: aload #11
    //   382: iconst_0
    //   383: invokeinterface get : (I)Ljava/lang/Object;
    //   388: checkcast km0
    //   391: astore #14
    //   393: new n71
    //   396: dup
    //   397: aload_0
    //   398: iload #5
    //   400: invokespecial <init> : (Ljava/lang/Object;Z)V
    //   403: astore #12
    //   405: getstatic ag0.m : Landroid/os/Handler;
    //   408: astore #13
    //   410: aload #6
    //   412: invokevirtual getClass : ()Ljava/lang/Class;
    //   415: pop
    //   416: aload #14
    //   418: getfield c : Lqn1;
    //   421: getfield f : Lwo;
    //   424: astore #14
    //   426: aload #14
    //   428: ifnull -> 582
    //   431: aload #6
    //   433: aload #14
    //   435: aload #12
    //   437: aload #13
    //   439: invokevirtual l : (Lwo;Lvn1;Landroid/os/Handler;)[F
    //   442: astore #6
    //   444: goto -> 585
    //   447: aload_0
    //   448: getfield b : Landroid/content/Context;
    //   451: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   454: ldc_w 2131755041
    //   457: aload #11
    //   459: invokeinterface size : ()I
    //   464: iconst_1
    //   465: anewarray java/lang/Object
    //   468: dup
    //   469: iconst_0
    //   470: aload #11
    //   472: invokeinterface size : ()I
    //   477: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   480: aastore
    //   481: invokevirtual getQuantityString : (II[Ljava/lang/Object;)Ljava/lang/String;
    //   484: astore #12
    //   486: aload_0
    //   487: getfield W0 : Lcom/google/android/material/button/MaterialButton;
    //   490: aload #12
    //   492: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   495: new java/lang/StringBuilder
    //   498: dup
    //   499: ldc_w '<a href=''>'
    //   502: invokespecial <init> : (Ljava/lang/String;)V
    //   505: astore #6
    //   507: aload #6
    //   509: aload #12
    //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: pop
    //   515: aload #6
    //   517: ldc_w '</a>'
    //   520: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   523: pop
    //   524: aload #10
    //   526: aload #6
    //   528: invokevirtual toString : ()Ljava/lang/String;
    //   531: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   534: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   537: aload #10
    //   539: aload_0
    //   540: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   543: aload #9
    //   545: ldc 2131297606
    //   547: iconst_1
    //   548: invokevirtual g : (IZ)V
    //   551: goto -> 582
    //   554: aload_0
    //   555: getfield Y0 : Landroidx/constraintlayout/widget/Group;
    //   558: bipush #8
    //   560: invokevirtual setVisibility : (I)V
    //   563: aload #10
    //   565: bipush #8
    //   567: invokevirtual setVisibility : (I)V
    //   570: aload #8
    //   572: iconst_0
    //   573: invokevirtual setVisibility : (I)V
    //   576: aload #9
    //   578: iconst_0
    //   579: invokevirtual setEnabled : (Z)V
    //   582: aconst_null
    //   583: astore #6
    //   585: aload #6
    //   587: invokestatic s : ([F)Z
    //   590: ifne -> 609
    //   593: aload #11
    //   595: invokeinterface size : ()I
    //   600: iconst_1
    //   601: if_icmpgt -> 609
    //   604: iload #5
    //   606: ifeq -> 612
    //   609: goto -> 642
    //   612: aload_0
    //   613: ldc 2131297592
    //   615: putfield I0 : I
    //   618: aload #9
    //   620: ldc 2131297592
    //   622: iconst_1
    //   623: invokevirtual g : (IZ)V
    //   626: aload #10
    //   628: bipush #8
    //   630: invokevirtual setVisibility : (I)V
    //   633: aload #8
    //   635: iconst_0
    //   636: invokevirtual setVisibility : (I)V
    //   639: goto -> 669
    //   642: aload_0
    //   643: ldc 2131297606
    //   645: putfield I0 : I
    //   648: aload #9
    //   650: ldc 2131297606
    //   652: iconst_1
    //   653: invokevirtual g : (IZ)V
    //   656: aload #10
    //   658: iconst_0
    //   659: invokevirtual setVisibility : (I)V
    //   662: aload #8
    //   664: bipush #8
    //   666: invokevirtual setVisibility : (I)V
    //   669: aload #6
    //   671: ifnull -> 684
    //   674: aload #6
    //   676: arraylength
    //   677: iconst_2
    //   678: if_icmplt -> 684
    //   681: goto -> 716
    //   684: aload_0
    //   685: getfield I0 : I
    //   688: ldc 2131297606
    //   690: if_icmpne -> 711
    //   693: iconst_2
    //   694: newarray float
    //   696: astore #6
    //   698: aload #6
    //   700: iconst_0
    //   701: fconst_1
    //   702: fastore
    //   703: aload #6
    //   705: iconst_1
    //   706: fconst_1
    //   707: fastore
    //   708: goto -> 716
    //   711: invokestatic r : ()[F
    //   714: astore #6
    //   716: aload #6
    //   718: iconst_0
    //   719: faload
    //   720: fstore_2
    //   721: aload_0
    //   722: fload_2
    //   723: putfield G0 : F
    //   726: aload #6
    //   728: iconst_1
    //   729: faload
    //   730: fstore_1
    //   731: aload_0
    //   732: fload_1
    //   733: putfield H0 : F
    //   736: fload_2
    //   737: ldc_w 0.5
    //   740: fcmpg
    //   741: ifge -> 751
    //   744: aload_0
    //   745: ldc_w 0.5
    //   748: putfield G0 : F
    //   751: fload_1
    //   752: ldc_w 0.5
    //   755: fcmpg
    //   756: ifge -> 766
    //   759: aload_0
    //   760: ldc_w 0.5
    //   763: putfield H0 : F
    //   766: aload_0
    //   767: getfield D0 : Landroid/widget/EditText;
    //   770: aload_0
    //   771: getfield G0 : F
    //   774: invokestatic x : (Landroid/widget/EditText;F)V
    //   777: aload_0
    //   778: getfield E0 : Landroid/widget/EditText;
    //   781: aload_0
    //   782: getfield H0 : F
    //   785: invokestatic x : (Landroid/widget/EditText;F)V
    //   788: aload #8
    //   790: iconst_0
    //   791: invokevirtual setSelection : (I)V
    //   794: aload #7
    //   796: iconst_0
    //   797: invokevirtual setVisibility : (I)V
    //   800: return
  }
  
  public final void v() {
    float[] arrayOfFloat;
    MaterialButtonToggleGroup materialButtonToggleGroup = this.S0;
    int i = materialButtonToggleGroup.getCheckedButtonId();
    boolean bool = false;
    km0 km01 = null;
    km0 km02 = null;
    if (i == 2131297606) {
      List<km0> list = this.c1;
      km01 = km02;
      if (list.size() == 1) {
        wn1 wn1 = MyApplication.j;
        km01 = list.get(0);
        m60 m60 = new m60(29);
        Handler handler = ag0.m;
        wn1.getClass();
        wo wo = km01.c.f;
        km01 = km02;
        if (wo != null)
          arrayOfFloat = wn1.l(wo, m60, handler); 
      } 
      if (arrayOfFloat == null || arrayOfFloat.length < 2) {
        arrayOfFloat = new float[2];
        arrayOfFloat[0] = 1.0F;
        arrayOfFloat[1] = 1.0F;
      } 
    } 
    if (arrayOfFloat == null || arrayOfFloat.length < 2)
      arrayOfFloat = r(); 
    float f1 = arrayOfFloat[0];
    this.G0 = f1;
    float f2 = arrayOfFloat[1];
    this.H0 = f2;
    if (f1 < 0.5F)
      this.G0 = 0.5F; 
    if (f2 < 0.5F)
      this.H0 = 0.5F; 
    x(this.D0, this.G0);
    x(this.E0, this.H0);
    try {
      MDButton mDButton = this.Z0.r;
      i = bool;
      return;
    } finally {
      arrayOfFloat = null;
      arrayOfFloat.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */