import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import in.krosbits.musicolet.MyApplication;

public final class rf1 implements View.OnClickListener {
  public final RadioButton b;
  
  public final RadioButton c;
  
  public final RadioButton e;
  
  public final RadioButton f;
  
  public final RadioButton g;
  
  public final RadioButton h;
  
  public final RadioButton i;
  
  public final RadioButton j;
  
  public final RadioButton k;
  
  public final RadioButton l;
  
  public final CheckBox m;
  
  public final CheckBox n;
  
  public final CheckBox o;
  
  public final CheckBox p;
  
  public final MaterialButtonToggleGroup q;
  
  public final SharedPreferences r;
  
  public final ss0 s;
  
  public final z71 t;
  
  public final ViewGroup u;
  
  public final ViewGroup v;
  
  public final MaterialButton w;
  
  public final Context x;
  
  public rf1(Context paramContext, SharedPreferences paramSharedPreferences, z71 paramz71) {
    this.r = paramSharedPreferences;
    this.t = paramz71;
    this.x = paramContext;
    View view = LayoutInflater.from(paramContext).inflate(2131493038, null);
    ViewGroup viewGroup1 = (ViewGroup)view.findViewById(2131296973);
    ViewGroup viewGroup2 = (ViewGroup)view.findViewById(2131296974);
    this.b = (RadioButton)viewGroup1.findViewById(2131297349);
    this.e = (RadioButton)viewGroup1.findViewById(2131297348);
    this.f = (RadioButton)viewGroup1.findViewById(2131297347);
    this.c = (RadioButton)viewGroup1.findViewById(2131297346);
    this.g = (RadioButton)viewGroup1.findViewById(2131297341);
    this.h = (RadioButton)viewGroup1.findViewById(2131297340);
    this.i = (RadioButton)viewGroup1.findViewById(2131297339);
    this.m = (CheckBox)viewGroup1.findViewById(2131296548);
    this.n = (CheckBox)viewGroup1.findViewById(2131296545);
    this.o = (CheckBox)viewGroup1.findViewById(2131296547);
    this.p = (CheckBox)viewGroup1.findViewById(2131296546);
    this.u = (ViewGroup)view.findViewById(2131297553);
    this.v = (ViewGroup)view.findViewById(2131297554);
    this.l = (RadioButton)view.findViewById(2131297352);
    this.k = (RadioButton)view.findViewById(2131297351);
    this.j = (RadioButton)view.findViewById(2131297350);
    this.q = (MaterialButtonToggleGroup)view.findViewById(2131297641);
    MaterialButton materialButton2 = (MaterialButton)view.findViewById(2131296381);
    MaterialButton materialButton1 = (MaterialButton)view.findViewById(2131296428);
    this.w = materialButton1;
    materialButton2.setOnClickListener(this);
    materialButton1.setOnClickListener(this);
    byte b;
    for (b = 0; b < viewGroup2.getChildCount(); b++)
      viewGroup2.getChildAt(b).setOnClickListener(this); 
    for (b = 0; b < viewGroup1.getChildCount(); b++) {
      View view1 = viewGroup1.getChildAt(b);
      if (view1 instanceof android.widget.LinearLayout || view1 instanceof CheckBox)
        view1.setOnClickListener(this); 
    } 
    ms0 ms0 = new ms0(this.x);
    ms0.f(view, false);
    ms0.e = true;
    ms0.Y = new f50(2, this);
    this.s = new ss0(ms0);
    this.q.f(new qf1(this));
    b();
  }
  
  public final void a() {
    // Byte code:
    //   0: invokestatic x : ()Landroid/content/SharedPreferences;
    //   3: astore #10
    //   5: iconst_0
    //   6: istore #9
    //   8: aload #10
    //   10: ldc 's_b_adrosw'
    //   12: iconst_0
    //   13: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   18: ifne -> 42
    //   21: invokestatic x : ()Landroid/content/SharedPreferences;
    //   24: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   29: ldc 's_b_adrosw'
    //   31: iconst_1
    //   32: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   37: invokeinterface apply : ()V
    //   42: aload_0
    //   43: getfield m : Landroid/widget/CheckBox;
    //   46: astore #12
    //   48: aload #12
    //   50: bipush #8
    //   52: invokevirtual setVisibility : (I)V
    //   55: aload_0
    //   56: getfield p : Landroid/widget/CheckBox;
    //   59: astore #15
    //   61: aload #15
    //   63: bipush #8
    //   65: invokevirtual setVisibility : (I)V
    //   68: aload_0
    //   69: getfield n : Landroid/widget/CheckBox;
    //   72: astore #13
    //   74: aload #13
    //   76: bipush #8
    //   78: invokevirtual setVisibility : (I)V
    //   81: aload_0
    //   82: getfield o : Landroid/widget/CheckBox;
    //   85: astore #14
    //   87: aload #14
    //   89: bipush #8
    //   91: invokevirtual setVisibility : (I)V
    //   94: aload_0
    //   95: getfield r : Landroid/content/SharedPreferences;
    //   98: astore #10
    //   100: aload #10
    //   102: ldc 'RSM'
    //   104: iconst_2
    //   105: invokeinterface getInt : (Ljava/lang/String;I)I
    //   110: istore_1
    //   111: iload_1
    //   112: iconst_1
    //   113: if_icmpeq -> 185
    //   116: iload_1
    //   117: iconst_2
    //   118: if_icmpeq -> 171
    //   121: iload_1
    //   122: iconst_3
    //   123: if_icmpeq -> 158
    //   126: iload_1
    //   127: iconst_4
    //   128: if_icmpeq -> 145
    //   131: iconst_0
    //   132: istore_2
    //   133: iconst_0
    //   134: istore_3
    //   135: iload_3
    //   136: istore #4
    //   138: iload #4
    //   140: istore #5
    //   142: goto -> 196
    //   145: iconst_0
    //   146: istore_2
    //   147: iconst_0
    //   148: istore_3
    //   149: iload_3
    //   150: istore #4
    //   152: iconst_1
    //   153: istore #5
    //   155: goto -> 196
    //   158: iconst_0
    //   159: istore_2
    //   160: iconst_0
    //   161: istore_3
    //   162: iload_3
    //   163: istore #5
    //   165: iconst_1
    //   166: istore #4
    //   168: goto -> 196
    //   171: iconst_0
    //   172: istore_2
    //   173: iconst_0
    //   174: istore #4
    //   176: iload #4
    //   178: istore #5
    //   180: iconst_1
    //   181: istore_3
    //   182: goto -> 196
    //   185: iconst_0
    //   186: istore_3
    //   187: iconst_0
    //   188: istore #4
    //   190: iload #4
    //   192: istore #5
    //   194: iconst_1
    //   195: istore_2
    //   196: aload #10
    //   198: ldc 'RQM'
    //   200: iconst_2
    //   201: invokeinterface getInt : (Ljava/lang/String;I)I
    //   206: istore_1
    //   207: iload_1
    //   208: iconst_1
    //   209: if_icmpeq -> 310
    //   212: iload_1
    //   213: iconst_2
    //   214: if_icmpeq -> 274
    //   217: iload_1
    //   218: iconst_3
    //   219: if_icmpeq -> 235
    //   222: iconst_0
    //   223: istore #6
    //   225: iconst_0
    //   226: istore #7
    //   228: iload #7
    //   230: istore #8
    //   232: goto -> 345
    //   235: aload #12
    //   237: bipush #8
    //   239: invokevirtual setVisibility : (I)V
    //   242: aload #15
    //   244: bipush #8
    //   246: invokevirtual setVisibility : (I)V
    //   249: aload #13
    //   251: iconst_0
    //   252: invokevirtual setVisibility : (I)V
    //   255: aload #14
    //   257: bipush #8
    //   259: invokevirtual setVisibility : (I)V
    //   262: iconst_0
    //   263: istore #6
    //   265: iconst_0
    //   266: istore #7
    //   268: iconst_1
    //   269: istore #8
    //   271: goto -> 345
    //   274: aload #12
    //   276: iconst_0
    //   277: invokevirtual setVisibility : (I)V
    //   280: aload #15
    //   282: iconst_0
    //   283: invokevirtual setVisibility : (I)V
    //   286: aload #13
    //   288: iconst_0
    //   289: invokevirtual setVisibility : (I)V
    //   292: aload #14
    //   294: iconst_0
    //   295: invokevirtual setVisibility : (I)V
    //   298: iconst_0
    //   299: istore #6
    //   301: iconst_0
    //   302: istore #8
    //   304: iconst_1
    //   305: istore #7
    //   307: goto -> 345
    //   310: aload #12
    //   312: bipush #8
    //   314: invokevirtual setVisibility : (I)V
    //   317: aload #15
    //   319: bipush #8
    //   321: invokevirtual setVisibility : (I)V
    //   324: aload #13
    //   326: iconst_0
    //   327: invokevirtual setVisibility : (I)V
    //   330: aload #14
    //   332: iconst_0
    //   333: invokevirtual setVisibility : (I)V
    //   336: iconst_0
    //   337: istore #7
    //   339: iconst_0
    //   340: istore #8
    //   342: iconst_1
    //   343: istore #6
    //   345: aload_0
    //   346: getfield b : Landroid/widget/RadioButton;
    //   349: iload_2
    //   350: invokevirtual setChecked : (Z)V
    //   353: aload_0
    //   354: getfield e : Landroid/widget/RadioButton;
    //   357: iload_3
    //   358: invokevirtual setChecked : (Z)V
    //   361: aload_0
    //   362: getfield f : Landroid/widget/RadioButton;
    //   365: iload #4
    //   367: invokevirtual setChecked : (Z)V
    //   370: aload_0
    //   371: getfield c : Landroid/widget/RadioButton;
    //   374: iload #5
    //   376: invokevirtual setChecked : (Z)V
    //   379: aload_0
    //   380: getfield g : Landroid/widget/RadioButton;
    //   383: iload #6
    //   385: invokevirtual setChecked : (Z)V
    //   388: aload_0
    //   389: getfield h : Landroid/widget/RadioButton;
    //   392: iload #7
    //   394: invokevirtual setChecked : (Z)V
    //   397: aload_0
    //   398: getfield i : Landroid/widget/RadioButton;
    //   401: astore #11
    //   403: aload #11
    //   405: iload #8
    //   407: invokevirtual setChecked : (Z)V
    //   410: aload #12
    //   412: aload #10
    //   414: ldc 'R_SFFQ'
    //   416: iconst_0
    //   417: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   422: invokevirtual setChecked : (Z)V
    //   425: aload #15
    //   427: aload #10
    //   429: getstatic in/krosbits/android/widgets/swipetoloadlayout/vZ/LHyji.lgaLSH : Ljava/lang/String;
    //   432: iconst_1
    //   433: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   438: invokevirtual setChecked : (Z)V
    //   441: aload #13
    //   443: aload #10
    //   445: ldc 'R_RSFLQ'
    //   447: iconst_1
    //   448: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   453: invokevirtual setChecked : (Z)V
    //   456: aload #14
    //   458: aload #10
    //   460: ldc 'R_b_rwq'
    //   462: iconst_1
    //   463: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   468: invokevirtual setChecked : (Z)V
    //   471: aload #14
    //   473: invokevirtual isChecked : ()Z
    //   476: ifne -> 490
    //   479: iload #9
    //   481: istore_2
    //   482: aload #11
    //   484: invokevirtual isChecked : ()Z
    //   487: ifeq -> 492
    //   490: iconst_1
    //   491: istore_2
    //   492: aload #13
    //   494: iload_2
    //   495: invokevirtual setEnabled : (Z)V
    //   498: return
  }
  
  public final void b() {
    // Byte code:
    //   0: invokestatic O : ()Z
    //   3: istore #4
    //   5: aload_0
    //   6: getfield u : Landroid/view/ViewGroup;
    //   9: astore #5
    //   11: aload_0
    //   12: getfield v : Landroid/view/ViewGroup;
    //   15: astore #6
    //   17: bipush #8
    //   19: istore_2
    //   20: aload_0
    //   21: getfield q : Lcom/google/android/material/button/MaterialButtonToggleGroup;
    //   24: astore #7
    //   26: iload #4
    //   28: ifeq -> 149
    //   31: aload #7
    //   33: ldc 2131297596
    //   35: iconst_1
    //   36: invokevirtual g : (IZ)V
    //   39: aload #6
    //   41: iconst_0
    //   42: invokevirtual setVisibility : (I)V
    //   45: aload #5
    //   47: bipush #8
    //   49: invokevirtual setVisibility : (I)V
    //   52: invokestatic B : ()I
    //   55: istore_1
    //   56: aload_0
    //   57: getfield j : Landroid/widget/RadioButton;
    //   60: astore #6
    //   62: aload #6
    //   64: iconst_0
    //   65: invokevirtual setChecked : (Z)V
    //   68: aload_0
    //   69: getfield k : Landroid/widget/RadioButton;
    //   72: astore #7
    //   74: aload #7
    //   76: iconst_0
    //   77: invokevirtual setChecked : (Z)V
    //   80: aload_0
    //   81: getfield l : Landroid/widget/RadioButton;
    //   84: astore #5
    //   86: aload #5
    //   88: iconst_0
    //   89: invokevirtual setChecked : (Z)V
    //   92: iload_1
    //   93: ifeq -> 127
    //   96: iload_1
    //   97: iconst_1
    //   98: if_icmpeq -> 118
    //   101: iload_1
    //   102: iconst_2
    //   103: if_icmpeq -> 109
    //   106: goto -> 133
    //   109: aload #7
    //   111: iconst_1
    //   112: invokevirtual setChecked : (Z)V
    //   115: goto -> 133
    //   118: aload #5
    //   120: iconst_1
    //   121: invokevirtual setChecked : (Z)V
    //   124: goto -> 133
    //   127: aload #6
    //   129: iconst_1
    //   130: invokevirtual setChecked : (Z)V
    //   133: invokestatic B : ()I
    //   136: ifeq -> 144
    //   139: iconst_1
    //   140: istore_1
    //   141: goto -> 218
    //   144: iconst_0
    //   145: istore_1
    //   146: goto -> 218
    //   149: aload #7
    //   151: ldc_w 2131297590
    //   154: iconst_1
    //   155: invokevirtual g : (IZ)V
    //   158: aload #5
    //   160: iconst_0
    //   161: invokevirtual setVisibility : (I)V
    //   164: aload #6
    //   166: bipush #8
    //   168: invokevirtual setVisibility : (I)V
    //   171: aload_0
    //   172: invokevirtual a : ()V
    //   175: invokestatic M : ()Z
    //   178: ifeq -> 139
    //   181: invokestatic u : ()Landroid/content/SharedPreferences;
    //   184: ldc 'RSM'
    //   186: iconst_2
    //   187: invokeinterface getInt : (Ljava/lang/String;I)I
    //   192: istore_1
    //   193: invokestatic u : ()Landroid/content/SharedPreferences;
    //   196: ldc 'RQM'
    //   198: iconst_2
    //   199: invokeinterface getInt : (Ljava/lang/String;I)I
    //   204: istore_3
    //   205: iload_1
    //   206: iconst_2
    //   207: if_icmpne -> 139
    //   210: iload_3
    //   211: iconst_2
    //   212: if_icmpne -> 139
    //   215: goto -> 144
    //   218: aload_0
    //   219: getfield w : Lcom/google/android/material/button/MaterialButton;
    //   222: astore #5
    //   224: iload_1
    //   225: ifeq -> 230
    //   228: iconst_0
    //   229: istore_2
    //   230: aload #5
    //   232: iload_2
    //   233: invokevirtual setVisibility : (I)V
    //   236: aload_0
    //   237: getfield t : Lz71;
    //   240: invokevirtual d1 : ()V
    //   243: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   246: iconst_1
    //   247: invokevirtual b0 : (Z)V
    //   250: return
    //   251: astore #5
    //   253: aload #5
    //   255: invokevirtual printStackTrace : ()V
    //   258: return
    // Exception table:
    //   from	to	target	type
    //   0	5	251	finally
    //   31	92	251	finally
    //   109	115	251	finally
    //   118	124	251	finally
    //   127	133	251	finally
    //   133	139	251	finally
    //   149	205	251	finally
    //   218	224	251	finally
    //   230	250	251	finally
  }
  
  public final void onClick(View paramView) {
    int i = paramView.getId();
    ss0 ss01 = this.s;
    boolean bool = true;
    SharedPreferences sharedPreferences = this.r;
    if (i == 2131297018) {
      sharedPreferences.edit().putInt("RSM", 1).apply();
    } else if (i == 2131297015) {
      sharedPreferences.edit().putInt("RSM", 4).apply();
    } else if (i == 2131297017) {
      sharedPreferences.edit().putInt("RSM", 2).apply();
    } else if (i == 2131297016) {
      sharedPreferences.edit().putInt("RSM", 3).apply();
    } else if (i == 2131297005) {
      sharedPreferences.edit().putInt("RQM", 1).apply();
    } else if (i == 2131297004) {
      sharedPreferences.edit().putInt("RQM", 2).apply();
    } else if (i == 2131297003) {
      sharedPreferences.edit().putInt("RQM", 3).apply();
    } else if (i == 2131296548) {
      sharedPreferences.edit().putBoolean("R_SFFQ", this.m.isChecked()).apply();
    } else if (i == 2131296546) {
      sharedPreferences.edit().putBoolean("R_RFLP", this.p.isChecked()).apply();
    } else if (i == 2131296545) {
      sharedPreferences.edit().putBoolean("R_RSFLQ", this.n.isChecked()).apply();
    } else if (i == 2131296547) {
      sharedPreferences.edit().putBoolean("R_b_rwq", this.o.isChecked()).apply();
    } else {
      if (i == 2131297028) {
        ui0.e0(0);
      } else if (i == 2131297029) {
        ui0.e0(2);
      } else if (i == 2131297030) {
        ui0.e0(1);
      } else {
        if (i == 2131296381) {
          if (ss01.isShowing())
            ss01.dismiss(); 
        } else if (i == 2131296428) {
          if (ui0.O()) {
            MyApplication.u().edit().putInt("RSM", 2).putInt("RQM", 1).apply();
            ui0.U();
          } else {
            MyApplication.u().edit().putInt("RSM", 2).putInt("RQM", 2).apply();
            ui0.U();
          } 
          b();
          if (this.q.getCheckedButtonId() == 2131297596)
            b(); 
        } 
        bool = false;
      } 
      b();
    } 
    bool = false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */