import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.afollestad.materialdialogs.internal.MDButton;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.Tag2Activity;

public final class mq0 extends ms0 implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener, View.OnClickListener, CompoundButton.OnCheckedChangeListener, rs0 {
  public final MusicActivity B0;
  
  public final km0 C0;
  
  public final pp D0;
  
  public v00 E0;
  
  public ss0 F0;
  
  public final wy G0;
  
  public bp1 H0;
  
  public final as I0;
  
  public aq0 J0;
  
  public mq0(MusicActivity paramMusicActivity, km0 paramkm0, pp parampp, v00 paramv00) {
    super((Context)paramMusicActivity);
    ConstraintLayout constraintLayout;
    this.B0 = paramMusicActivity;
    this.C0 = paramkm0;
    this.D0 = parampp;
    this.E0 = paramv00;
    yw yw = e00.a;
    this.I0 = wf2.a(fr0.a);
    e(2131492963, true);
    n(2131886467);
    l(2131887193);
    View view = this.u;
    int i = 2131296388;
    MaterialButton materialButton = (MaterialButton)ws2.C(view, 2131296388);
    if (materialButton != null) {
      i = 2131296403;
      MaterialButton materialButton1 = (MaterialButton)ws2.C(view, 2131296403);
      if (materialButton1 != null) {
        i = 2131296404;
        MaterialButton materialButton2 = (MaterialButton)ws2.C(view, 2131296404);
        if (materialButton2 != null) {
          i = 2131296741;
          FlexboxLayout flexboxLayout = (FlexboxLayout)ws2.C(view, 2131296741);
          if (flexboxLayout != null) {
            i = 2131296742;
            FlexboxLayout flexboxLayout1 = (FlexboxLayout)ws2.C(view, 2131296742);
            if (flexboxLayout1 != null) {
              i = 2131296774;
              Group group = (Group)ws2.C(view, 2131296774);
              if (group != null) {
                i = 2131297298;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator)ws2.C(view, 2131297298);
                if (linearProgressIndicator != null) {
                  i = 2131297331;
                  MaterialRadioButton materialRadioButton = (MaterialRadioButton)ws2.C(view, 2131297331);
                  if (materialRadioButton != null) {
                    i = 2131297335;
                    MaterialRadioButton materialRadioButton1 = (MaterialRadioButton)ws2.C(view, 2131297335);
                    if (materialRadioButton1 != null) {
                      constraintLayout = (ConstraintLayout)view;
                      this.G0 = new wy(materialButton, materialButton1, materialButton2, flexboxLayout, flexboxLayout1, group, linearProgressIndicator, materialRadioButton, materialRadioButton1);
                      this.Y = this;
                      this.W = this;
                      this.D = this;
                      this.P = false;
                      materialButton2.setOnClickListener(this);
                      materialButton1.setOnClickListener(this);
                      materialButton.setOnClickListener(this);
                      return;
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    k91.h("Missing required view with ID: ".concat(constraintLayout.getResources().getResourceName(i)));
    throw null;
  }
  
  public static final Object r(mq0 parammq0, ds paramds) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof lq0
    //   4: ifeq -> 37
    //   7: aload_1
    //   8: checkcast lq0
    //   11: astore_3
    //   12: aload_3
    //   13: getfield h : I
    //   16: istore_2
    //   17: iload_2
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 37
    //   24: aload_3
    //   25: iload_2
    //   26: ldc -2147483648
    //   28: iadd
    //   29: putfield h : I
    //   32: aload_3
    //   33: astore_1
    //   34: goto -> 47
    //   37: new lq0
    //   40: dup
    //   41: aload_0
    //   42: aload_1
    //   43: invokespecial <init> : (Lmq0;Lds;)V
    //   46: astore_1
    //   47: aload_1
    //   48: getfield f : Ljava/lang/Object;
    //   51: astore #4
    //   53: aload_1
    //   54: getfield h : I
    //   57: istore_2
    //   58: getstatic ys.b : Lys;
    //   61: astore_3
    //   62: iload_2
    //   63: ifeq -> 99
    //   66: iload_2
    //   67: iconst_1
    //   68: if_icmpeq -> 91
    //   71: iload_2
    //   72: iconst_2
    //   73: if_icmpne -> 84
    //   76: aload #4
    //   78: invokestatic r0 : (Ljava/lang/Object;)V
    //   81: goto -> 186
    //   84: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   86: invokestatic f : (Ljava/lang/String;)V
    //   89: aconst_null
    //   90: areturn
    //   91: aload #4
    //   93: invokestatic r0 : (Ljava/lang/Object;)V
    //   96: goto -> 147
    //   99: aload #4
    //   101: invokestatic r0 : (Ljava/lang/Object;)V
    //   104: getstatic e00.a : Lyw;
    //   107: astore #4
    //   109: getstatic fw.e : Lfw;
    //   112: astore #5
    //   114: new sc
    //   117: dup
    //   118: aload_0
    //   119: aconst_null
    //   120: bipush #6
    //   122: invokespecial <init> : (Ljava/lang/Object;Lcs;I)V
    //   125: astore #4
    //   127: aload_1
    //   128: iconst_1
    //   129: putfield h : I
    //   132: aload #5
    //   134: aload #4
    //   136: aload_1
    //   137: invokestatic l0 : (Los;Lad0;Lcs;)Ljava/lang/Object;
    //   140: aload_3
    //   141: if_acmpne -> 147
    //   144: goto -> 184
    //   147: getstatic e00.a : Lyw;
    //   150: astore #4
    //   152: getstatic fr0.a : Lif0;
    //   155: astore #4
    //   157: new cr
    //   160: dup
    //   161: aload_0
    //   162: aconst_null
    //   163: iconst_2
    //   164: invokespecial <init> : (Ljava/lang/Object;Lcs;I)V
    //   167: astore_0
    //   168: aload_1
    //   169: iconst_2
    //   170: putfield h : I
    //   173: aload #4
    //   175: aload_0
    //   176: aload_1
    //   177: invokestatic l0 : (Los;Lad0;Lcs;)Ljava/lang/Object;
    //   180: aload_3
    //   181: if_acmpne -> 186
    //   184: aload_3
    //   185: areturn
    //   186: getstatic l02.a : Ll02;
    //   189: areturn
  }
  
  public final void Q(ss0 paramss0, qy paramqy) {
    kq0 kq0;
    if (paramqy == qy.c) {
      kq0 = new kq0(this, null, 3);
      this.H0 = qv.L(this.I0, null, null, kq0, 3);
      s();
      return;
    } 
    kq0.dismiss();
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean) {
    paramCompoundButton.getClass();
    wy wy1 = this.G0;
    MaterialRadioButton materialRadioButton2 = (MaterialRadioButton)wy1.h;
    MaterialRadioButton materialRadioButton1 = (MaterialRadioButton)wy1.i;
    if (paramCompoundButton.equals(materialRadioButton2) && paramBoolean) {
      materialRadioButton1.setChecked(false);
      t();
      this.E0 = null;
      return;
    } 
    if (paramCompoundButton.equals(materialRadioButton1) && paramBoolean) {
      ((MaterialRadioButton)wy1.h).setChecked(false);
      t();
    } 
  }
  
  public final void onClick(View paramView) {
    u00 u00;
    aq0 aq01;
    Intent intent;
    String str;
    aq0 aq02;
    wy wy1 = this.G0;
    boolean bool = ui0.c(paramView, wy1.c);
    l2 l2 = null;
    StringBuilder stringBuilder = null;
    km0 km01 = this.C0;
    if (bool) {
      z71.R1 = true;
      z71.S1 = km01.b;
      l2 = this.B0.Q0;
      intent = new Intent("android.intent.action.OPEN_DOCUMENT");
      intent.addFlags(67);
      intent.addCategory(nFLlOYeP.MiLX);
      intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
      String str1 = ag0.J(km01.g);
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str1);
      stringBuilder1.append(".lrc");
      intent.putExtra("android.intent.extra.TITLE", stringBuilder1.toString());
      v00 v001 = km01.d();
      stringBuilder1 = stringBuilder;
      if (v001 != null)
        u00 = v001.i(); 
      intent.putExtra("android.provider.extra.INITIAL_URI", (Parcelable)n0.j(u00));
      intent.setType("application/*");
      intent.putExtra(ybWnIKHovcRr.xozuqnQwrlr, new String[] { "application/*" });
      l2.S0((Parcelable)intent);
      return;
    } 
    if (ui0.c(u00, ((wy)intent).b)) {
      String str1;
      z71.R1 = true;
      qn1 qn1 = km01.c;
      str = qn1.b;
      String str2 = qn1.c;
      String str3 = qn1.e;
      aq01 = this.J0;
      if (aq01 != null) {
        String str4 = aq01.a();
      } else {
        aq01 = null;
      } 
      wo wo = km01.c.f;
      if (wo != null) {
        String str4 = wo.toString();
      } else {
        wo = null;
      } 
      aq02 = this.J0;
      if (aq02 != null)
        str1 = aq02.e(); 
      Tag2Activity.z0((Activity)this.B0, str, str2, str3, (String)aq01, (String)wo, true, str1, false, false);
      return;
    } 
    if (ui0.c(aq01, ((wy)str).a))
      MusicActivity.F0(this.b, (km0)aq02, new int[] { 1 }); 
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    this.F0 = null;
    bp1 bp11 = this.H0;
    if (bp11 != null)
      bp11.c(null); 
    wf2.h(this.I0);
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    this.F0 = (ss0)paramDialogInterface;
    if (this.E0 == null) {
      jq0 jq0 = new jq0(this, null, 0);
      this.H0 = qv.L(this.I0, null, null, jq0, 3);
      s();
      return;
    } 
    wy wy1 = this.G0;
    ((MaterialRadioButton)wy1.i).setChecked(true);
    ((MaterialRadioButton)wy1.h).setChecked(false);
    t();
  }
  
  public final void s() {
    MDButton mDButton;
    aq0 aq01 = this.J0;
    bp1 bp11 = this.H0;
    byte b = 8;
    wy wy1 = this.G0;
    if (bp11 != null && (bp11.O() ^ true) == 1) {
      ((LinearProgressIndicator)wy1.g).setVisibility(0);
      ((Group)wy1.f).setVisibility(8);
      ss0 ss01 = this.F0;
      if (ss01 != null)
        ss01.setCanceledOnTouchOutside(false); 
      ss01 = this.F0;
      if (ss01 != null)
        ss01.setCancelable(false); 
      ss01 = this.F0;
      if (ss01 != null) {
        mDButton = ss01.q;
        if (mDButton != null)
          mDButton.setEnabled(false); 
      } 
      ss01 = this.F0;
      if (ss01 != null) {
        mDButton = ss01.r;
        if (mDButton != null) {
          mDButton.setVisibility(8);
          return;
        } 
      } 
    } else {
      LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator)wy1.g;
      MaterialButton materialButton1 = (MaterialButton)wy1.c;
      FlexboxLayout flexboxLayout1 = (FlexboxLayout)wy1.d;
      FlexboxLayout flexboxLayout2 = (FlexboxLayout)wy1.e;
      MaterialRadioButton materialRadioButton1 = (MaterialRadioButton)wy1.h;
      MaterialRadioButton materialRadioButton2 = (MaterialRadioButton)wy1.i;
      MaterialButton materialButton2 = (MaterialButton)wy1.b;
      linearProgressIndicator.setVisibility(8);
      if (mDButton != null) {
        MusicActivity musicActivity;
        ss0 ss02 = this.F0;
        if (ss02 != null)
          ss02.setCanceledOnTouchOutside(true); 
        ss02 = this.F0;
        if (ss02 != null)
          ss02.setCancelable(true); 
        ss02 = this.F0;
        if (ss02 != null) {
          MDButton mDButton1 = ss02.q;
          if (mDButton1 != null)
            mDButton1.setEnabled(true); 
        } 
        ((Group)wy1.f).setVisibility(0);
        if (iq0.e == mDButton.b()) {
          materialRadioButton2.setChecked(true);
          materialRadioButton1.setChecked(false);
          flexboxLayout2.setVisibility(0);
          flexboxLayout1.setVisibility(8);
          String str = mDButton.e();
          musicActivity = this.B0;
          if (str != null && mDButton.d() != null) {
            materialButton1.setText(mDButton.d());
            materialButton2.setText(musicActivity.getString(2131886483));
            materialButton2.setIconResource(2131231129);
          } else {
            materialButton1.setText(musicActivity.getString(2131887333, new Object[] { "'.lrc'" }));
            materialButton2.setText(musicActivity.getString(2131886412));
            materialButton2.setIconResource(2131231072);
          } 
        } else {
          materialRadioButton1.setChecked(true);
          materialRadioButton2.setChecked(false);
          flexboxLayout2.setVisibility(8);
          musicActivity.setVisibility(0);
        } 
        ss0 ss01 = this.F0;
        if (ss01 != null) {
          MDButton mDButton1 = ss01.r;
          if (mDButton1 != null) {
            if (mDButton.c() != null)
              b = 0; 
            mDButton1.setVisibility(b);
          } 
        } 
        materialRadioButton2.setOnCheckedChangeListener(this);
        materialRadioButton1.setOnCheckedChangeListener(this);
      } 
    } 
  }
  
  public final void t() {
    kq0 kq0 = new kq0(this, null, 1);
    this.H0 = qv.L(this.I0, null, null, kq0, 3);
    s();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */