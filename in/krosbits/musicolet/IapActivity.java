package in.krosbits.musicolet;

import ag0;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.insets.ProtectionLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import b2;
import com.android.billingclient.api.Purchase;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import e;
import ff;
import g92;
import ga1;
import hn;
import in.krosbits.android.widgets.MSTextView;
import in.krosbits.android.widgets.SmartTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;
import jn;
import k91;
import lf;
import lg1;
import m92;
import n0;
import pc;
import qo;
import sk;
import vd;
import wf2;
import ws2;

public class IapActivity extends pc implements View.OnClickListener {
  public static IapActivity c0;
  
  public sk R;
  
  public boolean S = true;
  
  public boolean T = true;
  
  public b2 U;
  
  public int V;
  
  public int W = -1;
  
  public ValueAnimator X;
  
  public final vd Y = new vd(4, this);
  
  public View Z = null;
  
  public long a0 = 0L;
  
  public boolean b0 = false;
  
  public final void l0() {
    try {
      ValueAnimator valueAnimator = this.X;
      if (valueAnimator != null) {
        valueAnimator.removeUpdateListener((ValueAnimator.AnimatorUpdateListener)this.Y);
        this.X.cancel();
        this.X = null;
      } 
      this.U.s.getForeground().setAlpha(255);
      this.U.w.setAlpha(1.0F);
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void m0() {
    sk sk1 = this.R;
    if (sk1 != null) {
      sk1.getClass();
      try {
        ObjectAnimator objectAnimator = (ObjectAnimator)sk1.e;
      } finally {
        sk1 = null;
      } 
    } 
    l0();
  }
  
  public final void n0() {
    try {
      if (this.R != null && this.U.i.getVisibility() == 0 && this.T) {
        Handler handler = this.N;
        e e = new e();
        this(24, this);
        handler.postDelayed((Runnable)e, 1300L);
      } 
    } finally {
      Exception exception;
    } 
  }
  
  public final void o0() {
    Integer integer = Integer.valueOf(0);
    l0();
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public void onClick(View paramView) {
    long l = System.currentTimeMillis();
    if (paramView != this.Z || l - this.a0 >= 1200L) {
      String str;
      this.a0 = l;
      this.Z = paramView;
      int i = paramView.getId();
      if (i == 2131296627) {
        lf lf = lf.p;
        lf.getClass();
        lf.l((Runnable)new ff(lf, 0, null, this));
        return;
      } 
      if (i == 2131296636) {
        lf lf = lf.p;
        lf.getClass();
        lf.l((Runnable)new ff(lf, 1, "p1m", this));
        return;
      } 
      if (i == 2131296637) {
        lf lf = lf.p;
        lf.getClass();
        lf.l((Runnable)new ff(lf, 1, "p1y", this));
        return;
      } 
      if (i == 2131297817) {
        str = lf.p.e();
        if (!TextUtils.isEmpty(str)) {
          ag0.i(str);
          ag0.O0(2131886406, 0);
          return;
        } 
      } else {
        b2 b21 = this.U;
        if (str == b21.B) {
          try {
            l = lf.p.f();
            Intent intent = new Intent();
            this("android.intent.action.VIEW", wf2.B("pro_conditions", new String[] { String.valueOf(l) }));
            startActivity(intent.addFlags(268435456));
            return;
          } catch (ActivityNotFoundException activityNotFoundException) {}
        } else if (activityNotFoundException == b21.n) {
          try {
            this.b0 = true;
            Intent intent = new Intent();
            this("android.intent.action.VIEW", Uri.parse(String.format(Locale.ENGLISH, "https://play.google.com/store/account/subscriptions?sku=%s&package=%s", new Object[] { MyApplication.a1, getPackageName() })));
            return;
          } finally {
            activityNotFoundException = null;
          } 
        } else if (activityNotFoundException == b21.a) {
          lf lf = lf.p;
          lf.o = true;
          lf.l((Runnable)new e(6, lf));
        } 
      } 
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    boolean bool2;
    int[] arrayOfInt = m92.h;
    c0 = this;
    boolean bool1 = false;
    n0.a((qo)this, false);
    m92.c((Activity)this);
    if (m92.f == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    int i = m92.o(0, bool2);
    getTheme().applyStyle(i, true);
    super.onCreate(paramBundle);
    View view = getLayoutInflater().inflate(2131492899, null, false);
    i = 2131296378;
    MaterialButton materialButton = (MaterialButton)ws2.C(view, 2131296378);
    if (materialButton != null) {
      i = 2131296627;
      MaterialCardView materialCardView = (MaterialCardView)ws2.C(view, 2131296627);
      if (materialCardView != null) {
        i = 2131296636;
        MaterialCardView materialCardView1 = (MaterialCardView)ws2.C(view, 2131296636);
        if (materialCardView1 != null) {
          i = 2131296637;
          MaterialCardView materialCardView2 = (MaterialCardView)ws2.C(view, 2131296637);
          if (materialCardView2 != null) {
            i = 2131296663;
            TextView textView = (TextView)ws2.C(view, 2131296663);
            if (textView != null) {
              i = 2131296664;
              TextView textView1 = (TextView)ws2.C(view, 2131296664);
              if (textView1 != null) {
                i = 2131296763;
                Group group = (Group)ws2.C(view, 2131296763);
                if (group != null) {
                  ProtectionLayout protectionLayout = (ProtectionLayout)view;
                  i = 2131296968;
                  if ((LinearLayout)ws2.C(view, 2131296968) != null) {
                    i = 2131297217;
                    MSTextView mSTextView = (MSTextView)ws2.C(view, 2131297217);
                    if (mSTextView != null) {
                      i = 2131297302;
                      TextView textView2 = (TextView)ws2.C(view, 2131297302);
                      if (textView2 != null) {
                        i = 2131297303;
                        TextView textView3 = (TextView)ws2.C(view, 2131297303);
                        if (textView3 != null) {
                          i = 2131297315;
                          ProgressBar progressBar = (ProgressBar)ws2.C(view, 2131297315);
                          if (progressBar != null) {
                            i = 2131297318;
                            MaterialButton materialButton1 = (MaterialButton)ws2.C(view, 2131297318);
                            if (materialButton1 != null) {
                              i = 2131297319;
                              MaterialButton materialButton2 = (MaterialButton)ws2.C(view, 2131297319);
                              if (materialButton2 != null) {
                                i = 2131297515;
                                if ((Space)ws2.C(view, 2131297515) != null) {
                                  i = 2131297555;
                                  NestedScrollView nestedScrollView = (NestedScrollView)ws2.C(view, 2131297555);
                                  if (nestedScrollView != null) {
                                    i = 2131297625;
                                    if ((TextView)ws2.C(view, 2131297625) != null) {
                                      i = 2131297654;
                                      TableLayout tableLayout = (TableLayout)ws2.C(view, 2131297654);
                                      if (tableLayout != null) {
                                        i = 2131297738;
                                        MaterialButton materialButton3 = (MaterialButton)ws2.C(view, 2131297738);
                                        if (materialButton3 != null) {
                                          i = 2131297817;
                                          TextView textView4 = (TextView)ws2.C(view, 2131297817);
                                          if (textView4 != null) {
                                            i = 2131297818;
                                            TextView textView5 = (TextView)ws2.C(view, 2131297818);
                                            if (textView5 != null) {
                                              i = 2131297821;
                                              TextView textView6 = (TextView)ws2.C(view, 2131297821);
                                              if (textView6 != null) {
                                                i = 2131297830;
                                                TextView textView7 = (TextView)ws2.C(view, 2131297830);
                                                if (textView7 != null) {
                                                  i = 2131297831;
                                                  TextView textView8 = (TextView)ws2.C(view, 2131297831);
                                                  if (textView8 != null) {
                                                    i = 2131297829;
                                                    TextView textView9 = (TextView)ws2.C(view, 2131297829);
                                                    if (textView9 != null) {
                                                      i = 2131297837;
                                                      SmartTextView smartTextView = (SmartTextView)ws2.C(view, 2131297837);
                                                      if (smartTextView != null) {
                                                        i = 2131297675;
                                                        TextView textView10 = (TextView)ws2.C(view, 2131297675);
                                                        if (textView10 != null) {
                                                          i = 2131297676;
                                                          TextView textView11 = (TextView)ws2.C(view, 2131297676);
                                                          if (textView11 != null) {
                                                            i = 2131297879;
                                                            TextView textView12 = (TextView)ws2.C(view, 2131297879);
                                                            if (textView12 != null) {
                                                              i = 2131297677;
                                                              MaterialButton materialButton4 = (MaterialButton)ws2.C(view, 2131297677);
                                                              if (materialButton4 != null) {
                                                                i = 2131297887;
                                                                TextView textView13 = (TextView)ws2.C(view, 2131297887);
                                                                if (textView13 != null) {
                                                                  this.U = new b2(protectionLayout, materialButton, materialCardView, materialCardView1, materialCardView2, textView, textView1, group, protectionLayout, mSTextView, textView2, textView3, progressBar, materialButton1, materialButton2, nestedScrollView, tableLayout, materialButton3, textView4, textView5, textView6, textView7, textView8, textView9, smartTextView, textView10, textView11, textView12, materialButton4, textView13);
                                                                  setContentView((View)protectionLayout);
                                                                  g92.c((View)this.U.o, true, false);
                                                                  i = jn.i(arrayOfInt[2], 178);
                                                                  ProtectionLayout protectionLayout1 = this.U.h;
                                                                  hn hn1 = new hn(2, i);
                                                                  hn hn2 = new hn(8, i);
                                                                  ArrayList<Object> arrayList = new ArrayList(2);
                                                                  for (i = bool1; i < 2; i++) {
                                                                    (new Object[2])[0] = hn1;
                                                                    (new Object[2])[1] = hn2;
                                                                    Object object = (new Object[2])[i];
                                                                    Objects.requireNonNull(object);
                                                                    arrayList.add(object);
                                                                  } 
                                                                  protectionLayout1.setProtections(Collections.unmodifiableList(arrayList));
                                                                  try {
                                                                    Resources resources = getResources();
                                                                    Resources.Theme theme = getTheme();
                                                                    ThreadLocal threadLocal = lg1.a;
                                                                    Drawable drawable = resources.getDrawable(2131231020, theme);
                                                                  } finally {
                                                                    hn1 = null;
                                                                  } 
                                                                  TextView textView14 = (TextView)findViewById(2131297217);
                                                                  StringBuilder stringBuilder2 = new StringBuilder();
                                                                  stringBuilder2.append(getString(2131887032));
                                                                  stringBuilder2.append("\n");
                                                                  stringBuilder2.append(getString(2131886736));
                                                                  textView14.setText(stringBuilder2.toString());
                                                                  if (textView14 instanceof MSTextView) {
                                                                    MSTextView mSTextView1 = (MSTextView)textView14;
                                                                    mSTextView1.setReflectionColor(m92.y(this, 2130968892));
                                                                    mSTextView1.setPrimaryColor(arrayOfInt[6]);
                                                                    sk sk1 = new sk(1);
                                                                    this.R = sk1;
                                                                    sk1.c = 2000L;
                                                                  } 
                                                                  MaterialButton materialButton5 = this.U.B;
                                                                  StringBuilder stringBuilder1 = new StringBuilder();
                                                                  stringBuilder1.append(getString(2131886656));
                                                                  stringBuilder1.append(" • ");
                                                                  stringBuilder1.append(getString(2131886718));
                                                                  materialButton5.setText(stringBuilder1.toString());
                                                                  this.U.B.setOnClickListener(this);
                                                                  this.U.n.setOnClickListener(this);
                                                                  this.U.a.setOnClickListener(this);
                                                                  this.U.b.setOnClickListener(this);
                                                                  this.U.c.setOnClickListener(this);
                                                                  this.U.d.setOnClickListener(this);
                                                                  this.U.r.setOnClickListener(this);
                                                                  lf lf = lf.p;
                                                                  lf.c = true;
                                                                  lf.l((Runnable)new e(6, lf));
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
                                              } 
                                            } 
                                          } 
                                        } 
                                      } 
                                    } 
                                  } 
                                } 
                              } 
                            } 
                          } 
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    k91.h("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
  }
  
  public final void onDestroy() {
    if (c0 != this)
      c0 = null; 
    m0();
    super.onDestroy();
    lf lf = lf.p;
    lf.c = false;
    lf.c();
  }
  
  public final void onStart() {
    super.onStart();
    if (this.b0) {
      this.b0 = false;
      lf.p.b(1, 1);
    } 
    n0();
  }
  
  public final void onStop() {
    super.onStop();
    m0();
  }
  
  public final void p0() {
    this.U.B.setVisibility(0);
    s0();
    this.U.p.setVisibility(0);
    boolean bool1 = ws2.m;
    boolean bool2 = ws2.l;
    int j = m92.y(this, 2130968892);
    int i = m92.h[6];
    if (bool1) {
      StringBuilder stringBuilder;
      if (ws2.k) {
        this.U.C.setText(2131887495);
        this.U.C.setVisibility(0);
        stringBuilder = (StringBuilder)getString(2131887459);
        this.U.n.setIconResource(2131231111);
        this.U.n.setIconTint(ColorStateList.valueOf(j));
        this.U.n.setTextColor(j);
        this.U.n.setBackgroundColor(jn.i(j, 25));
        this.U.n.setStrokeColor(ColorStateList.valueOf(jn.i(j, 25)));
      } else if (!bool2) {
        stringBuilder = (StringBuilder)getString(2131886226);
        this.U.n.setIconResource(2131231131);
        this.U.n.setIconTint(ColorStateList.valueOf(i));
        this.U.n.setTextColor(i);
        this.U.n.setBackgroundColor(jn.i(i, 25));
        this.U.n.setStrokeColor(ColorStateList.valueOf(jn.i(i, 25)));
        r0();
      } else {
        stringBuilder = null;
      } 
      if (stringBuilder != null) {
        MaterialButton materialButton = this.U.n;
        stringBuilder = ga1.l((String)stringBuilder, "<br/><small><u>");
        stringBuilder.append(getString(2131886782));
        stringBuilder.append("</u></small>");
        materialButton.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
        this.U.n.setVisibility(0);
      } 
    } 
    if (bool2) {
      StringBuilder stringBuilder;
      String str = lf.p.e();
      bool1 = TextUtils.isEmpty(str);
      b2 b21 = this.U;
      if (!bool1) {
        TextView textView = b21.r;
        stringBuilder = new StringBuilder(FgdLmmRfTxSFKI.sweQfWSDL);
        stringBuilder.append(str);
        stringBuilder.append("</u></b>");
        textView.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
        this.U.r.setVisibility(0);
      } else {
        ((b2)stringBuilder).r.setText(null);
        this.U.r.setVisibility(8);
      } 
      this.U.C.setText(2131887494);
      this.U.C.setVisibility(0);
      this.U.m.setIconResource(2131231111);
      this.U.m.setText(2131886736);
      this.U.m.setIconTint(ColorStateList.valueOf(j));
      this.U.m.setTextColor(j);
      this.U.m.setBackgroundColor(jn.i(j, 25));
      this.U.m.setStrokeColor(ColorStateList.valueOf(jn.i(j, 25)));
      this.U.m.setVisibility(0);
    } 
  }
  
  public final void q0() {
    StringBuilder stringBuilder;
    s0();
    this.U.p.setVisibility(0);
    this.U.t.setText(getString(2131887130));
    lf lf = lf.p;
    Purchase purchase = lf.f;
    if (purchase != null) {
      String str = purchase.a();
    } else {
      purchase = lf.g;
      if (purchase != null) {
        String str = purchase.a();
      } else {
        purchase = null;
      } 
    } 
    boolean bool = TextUtils.isEmpty((CharSequence)purchase);
    b2 b21 = this.U;
    if (!bool) {
      TextView textView = b21.r;
      stringBuilder = new StringBuilder("Order-id: <b><u>");
      stringBuilder.append((String)purchase);
      stringBuilder.append("</u></b>");
      textView.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      this.U.r.setVisibility(0);
      return;
    } 
    ((b2)stringBuilder).r.setText(null);
    this.U.r.setVisibility(8);
  }
  
  public final boolean r0() {
    // Byte code:
    //   0: getstatic m92.h : [I
    //   3: astore #22
    //   5: aload_0
    //   6: getfield U : Lb2;
    //   9: getfield s : Landroid/widget/TextView;
    //   12: bipush #8
    //   14: invokevirtual setVisibility : (I)V
    //   17: aload_0
    //   18: getfield U : Lb2;
    //   21: getfield x : Lin/krosbits/android/widgets/SmartTextView;
    //   24: bipush #8
    //   26: invokevirtual setVisibility : (I)V
    //   29: getstatic lf.p : Llf;
    //   32: astore #19
    //   34: aload #19
    //   36: invokevirtual getClass : ()Ljava/lang/Class;
    //   39: pop
    //   40: aconst_null
    //   41: astore #21
    //   43: aload #19
    //   45: getfield j : Lta1;
    //   48: astore #20
    //   50: aload #20
    //   52: ifnull -> 207
    //   55: aload #20
    //   57: ifnull -> 93
    //   60: new org/json/JSONObject
    //   63: astore #19
    //   65: aload #19
    //   67: aload #20
    //   69: getfield f : Ljava/lang/String;
    //   72: invokespecial <init> : (Ljava/lang/String;)V
    //   75: goto -> 96
    //   78: astore #19
    //   80: aload #19
    //   82: invokevirtual printStackTrace : ()V
    //   85: goto -> 93
    //   88: astore #19
    //   90: goto -> 202
    //   93: aconst_null
    //   94: astore #19
    //   96: aload #19
    //   98: ldc_w 'e'
    //   101: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   104: ifeq -> 207
    //   107: aload #19
    //   109: ldc_w 'rig'
    //   112: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
    //   115: astore #23
    //   117: aload #23
    //   119: invokevirtual length : ()I
    //   122: ifne -> 128
    //   125: goto -> 183
    //   128: aload #20
    //   130: invokevirtual a : ()Lqa1;
    //   133: astore #20
    //   135: aload #20
    //   137: ifnull -> 150
    //   140: aload #20
    //   142: getfield c : Ljava/lang/String;
    //   145: astore #20
    //   147: goto -> 153
    //   150: aconst_null
    //   151: astore #20
    //   153: iconst_0
    //   154: istore_2
    //   155: iload_2
    //   156: aload #23
    //   158: invokevirtual length : ()I
    //   161: if_icmpge -> 207
    //   164: aload #20
    //   166: ifnull -> 196
    //   169: aload #20
    //   171: aload #23
    //   173: iload_2
    //   174: invokevirtual getString : (I)Ljava/lang/String;
    //   177: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   180: ifeq -> 196
    //   183: aload #19
    //   185: ldc_w 'i'
    //   188: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   191: astore #20
    //   193: goto -> 210
    //   196: iinc #2, 1
    //   199: goto -> 155
    //   202: aload #19
    //   204: invokevirtual printStackTrace : ()V
    //   207: aconst_null
    //   208: astore #20
    //   210: getstatic lf.p : Llf;
    //   213: astore #19
    //   215: aload #19
    //   217: invokevirtual getClass : ()Ljava/lang/Class;
    //   220: pop
    //   221: aload #19
    //   223: getfield j : Lta1;
    //   226: astore #23
    //   228: aload #23
    //   230: ifnull -> 258
    //   233: new org/json/JSONObject
    //   236: astore #19
    //   238: aload #19
    //   240: aload #23
    //   242: getfield f : Ljava/lang/String;
    //   245: invokespecial <init> : (Ljava/lang/String;)V
    //   248: goto -> 261
    //   251: astore #19
    //   253: aload #19
    //   255: invokevirtual printStackTrace : ()V
    //   258: aconst_null
    //   259: astore #19
    //   261: aload #19
    //   263: ifnull -> 570
    //   266: aload #19
    //   268: ldc_w 'lv'
    //   271: invokevirtual has : (Ljava/lang/String;)Z
    //   274: ifeq -> 318
    //   277: aload #19
    //   279: ldc_w 'lv'
    //   282: invokevirtual getInt : (Ljava/lang/String;)I
    //   285: iconst_1
    //   286: if_icmpne -> 295
    //   289: iconst_1
    //   290: istore #9
    //   292: goto -> 298
    //   295: iconst_0
    //   296: istore #9
    //   298: aload_0
    //   299: iload #9
    //   301: putfield S : Z
    //   304: goto -> 318
    //   307: astore #19
    //   309: iconst_0
    //   310: istore #9
    //   312: iconst_0
    //   313: istore #10
    //   315: goto -> 544
    //   318: aload_0
    //   319: getfield S : Z
    //   322: ifeq -> 366
    //   325: aload #19
    //   327: ldc_w 'ls'
    //   330: invokevirtual has : (Ljava/lang/String;)Z
    //   333: ifeq -> 371
    //   336: aload #19
    //   338: ldc_w 'ls'
    //   341: invokevirtual getInt : (Ljava/lang/String;)I
    //   344: iconst_1
    //   345: if_icmpne -> 354
    //   348: iconst_1
    //   349: istore #9
    //   351: goto -> 357
    //   354: iconst_0
    //   355: istore #9
    //   357: aload_0
    //   358: iload #9
    //   360: putfield T : Z
    //   363: goto -> 371
    //   366: aload_0
    //   367: iconst_0
    //   368: putfield T : Z
    //   371: aload #19
    //   373: ldc_w 'as'
    //   376: invokevirtual has : (Ljava/lang/String;)Z
    //   379: ifeq -> 476
    //   382: aload #19
    //   384: ldc_w 'as'
    //   387: invokevirtual get : (Ljava/lang/String;)Ljava/lang/Object;
    //   390: astore #23
    //   392: aload #23
    //   394: instanceof java/lang/String
    //   397: ifeq -> 476
    //   400: aload #23
    //   402: checkcast java/lang/String
    //   405: astore #23
    //   407: aload #23
    //   409: ldc_w 'y'
    //   412: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   415: istore #9
    //   417: aload #23
    //   419: ldc_w 'm'
    //   422: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   425: istore #13
    //   427: iload #9
    //   429: istore #12
    //   431: iload #13
    //   433: istore #11
    //   435: aload #23
    //   437: ldc_w 'l'
    //   440: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   443: pop
    //   444: iload #9
    //   446: istore #10
    //   448: iload #13
    //   450: istore #9
    //   452: goto -> 482
    //   455: astore #19
    //   457: iload #12
    //   459: istore #9
    //   461: iload #11
    //   463: istore #10
    //   465: goto -> 544
    //   468: astore #19
    //   470: iconst_0
    //   471: istore #10
    //   473: goto -> 544
    //   476: iconst_0
    //   477: istore #10
    //   479: iconst_0
    //   480: istore #9
    //   482: iload #10
    //   484: istore #12
    //   486: iload #9
    //   488: istore #11
    //   490: iload #10
    //   492: istore #14
    //   494: iload #9
    //   496: istore #13
    //   498: aload #19
    //   500: ldc_w 'so'
    //   503: invokevirtual has : (Ljava/lang/String;)Z
    //   506: ifeq -> 557
    //   509: iload #10
    //   511: istore #12
    //   513: iload #9
    //   515: istore #11
    //   517: aload #19
    //   519: ldc_w 'so'
    //   522: invokevirtual getInt : (Ljava/lang/String;)I
    //   525: istore_2
    //   526: iload #10
    //   528: istore #14
    //   530: iload #9
    //   532: istore #13
    //   534: iload_2
    //   535: iconst_1
    //   536: if_icmpne -> 557
    //   539: iconst_1
    //   540: istore_2
    //   541: goto -> 579
    //   544: aload #19
    //   546: invokevirtual printStackTrace : ()V
    //   549: iload #10
    //   551: istore #13
    //   553: iload #9
    //   555: istore #14
    //   557: iconst_0
    //   558: istore_2
    //   559: iload #14
    //   561: istore #10
    //   563: iload #13
    //   565: istore #9
    //   567: goto -> 579
    //   570: iconst_0
    //   571: istore_2
    //   572: iconst_0
    //   573: istore #10
    //   575: iload #10
    //   577: istore #9
    //   579: aload #20
    //   581: ifnull -> 779
    //   584: getstatic lf.p : Llf;
    //   587: astore #19
    //   589: aload #19
    //   591: getfield k : Lta1;
    //   594: astore #24
    //   596: aload #19
    //   598: getfield j : Lta1;
    //   601: astore #23
    //   603: aload #24
    //   605: ifnull -> 676
    //   608: aload #23
    //   610: ifnull -> 676
    //   613: aload #24
    //   615: invokevirtual a : ()Lqa1;
    //   618: astore #24
    //   620: aload #23
    //   622: invokevirtual a : ()Lqa1;
    //   625: astore #23
    //   627: aload #24
    //   629: ifnull -> 676
    //   632: aload #23
    //   634: ifnull -> 676
    //   637: aload #24
    //   639: getfield b : J
    //   642: lstore #15
    //   644: aload #23
    //   646: getfield b : J
    //   649: lstore #17
    //   651: lload #15
    //   653: lload #17
    //   655: lcmp
    //   656: ifge -> 676
    //   659: lload #17
    //   661: lload #15
    //   663: lsub
    //   664: ldc2_w 100
    //   667: lmul
    //   668: lload #17
    //   670: ldiv
    //   671: l2i
    //   672: istore_3
    //   673: goto -> 678
    //   676: iconst_0
    //   677: istore_3
    //   678: iload_3
    //   679: iconst_5
    //   680: if_icmplt -> 779
    //   683: aload #19
    //   685: getfield j : Lta1;
    //   688: astore #19
    //   690: aload #19
    //   692: ifnull -> 717
    //   695: aload #19
    //   697: invokevirtual a : ()Lqa1;
    //   700: astore #19
    //   702: aload #19
    //   704: ifnull -> 717
    //   707: aload #19
    //   709: getfield a : Ljava/lang/String;
    //   712: astore #19
    //   714: goto -> 720
    //   717: aconst_null
    //   718: astore #19
    //   720: aload #19
    //   722: ifnull -> 779
    //   725: aload_0
    //   726: getfield U : Lb2;
    //   729: getfield s : Landroid/widget/TextView;
    //   732: aload #19
    //   734: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   737: aload_0
    //   738: getfield U : Lb2;
    //   741: getfield s : Landroid/widget/TextView;
    //   744: iconst_0
    //   745: invokevirtual setVisibility : (I)V
    //   748: aload #20
    //   750: invokevirtual isEmpty : ()Z
    //   753: ifne -> 779
    //   756: aload_0
    //   757: getfield U : Lb2;
    //   760: getfield x : Lin/krosbits/android/widgets/SmartTextView;
    //   763: aload #20
    //   765: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   768: aload_0
    //   769: getfield U : Lb2;
    //   772: getfield x : Lin/krosbits/android/widgets/SmartTextView;
    //   775: iconst_0
    //   776: invokevirtual setVisibility : (I)V
    //   779: getstatic lf.p : Llf;
    //   782: astore #19
    //   784: aload #19
    //   786: getfield m : Lsa1;
    //   789: astore #23
    //   791: aload #19
    //   793: getfield n : Lsa1;
    //   796: astore #20
    //   798: aload #19
    //   800: getfield k : Lta1;
    //   803: astore #24
    //   805: aload #21
    //   807: astore #19
    //   809: aload #24
    //   811: ifnull -> 837
    //   814: aload #24
    //   816: invokevirtual a : ()Lqa1;
    //   819: astore #24
    //   821: aload #21
    //   823: astore #19
    //   825: aload #24
    //   827: ifnull -> 837
    //   830: aload #24
    //   832: getfield a : Ljava/lang/String;
    //   835: astore #19
    //   837: aload_0
    //   838: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   841: ldc_w 2131165390
    //   844: invokevirtual getDimension : (I)F
    //   847: fstore_1
    //   848: aload_0
    //   849: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   852: ldc_w 2131166369
    //   855: invokevirtual getDimension : (I)F
    //   858: pop
    //   859: aload #22
    //   861: iconst_3
    //   862: iaload
    //   863: istore #5
    //   865: aload #22
    //   867: iconst_5
    //   868: iaload
    //   869: istore #6
    //   871: aload #22
    //   873: bipush #6
    //   875: iaload
    //   876: istore_3
    //   877: aload #22
    //   879: bipush #13
    //   881: iaload
    //   882: istore #7
    //   884: iload #7
    //   886: ldc_w 3.0
    //   889: iload #7
    //   891: ldc_w -16777216
    //   894: ior
    //   895: ldc_w -16777216
    //   898: iload #5
    //   900: ior
    //   901: invokestatic f : (FII)I
    //   904: sipush #150
    //   907: invokestatic max : (II)I
    //   910: invokestatic i : (II)I
    //   913: istore #8
    //   915: aload #23
    //   917: ifnull -> 1181
    //   920: aload #23
    //   922: getfield c : Lbv0;
    //   925: getfield a : Ljava/util/ArrayList;
    //   928: astore #21
    //   930: aload #21
    //   932: iconst_0
    //   933: invokevirtual get : (I)Ljava/lang/Object;
    //   936: checkcast ra1
    //   939: getfield a : Ljava/lang/String;
    //   942: astore #21
    //   944: aload_0
    //   945: getfield U : Lb2;
    //   948: getfield u : Landroid/widget/TextView;
    //   951: aload #21
    //   953: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   956: aload_0
    //   957: getfield U : Lb2;
    //   960: getfield y : Landroid/widget/TextView;
    //   963: aload_0
    //   964: ldc_w 2131887075
    //   967: invokevirtual getString : (I)Ljava/lang/String;
    //   970: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   973: aload_0
    //   974: getfield U : Lb2;
    //   977: getfield c : Lcom/google/android/material/card/MaterialCardView;
    //   980: iconst_0
    //   981: invokevirtual setVisibility : (I)V
    //   984: aload_0
    //   985: getfield U : Lb2;
    //   988: astore #21
    //   990: iload #9
    //   992: ifeq -> 1080
    //   995: aload #21
    //   997: getfield c : Lcom/google/android/material/card/MaterialCardView;
    //   1000: fload_1
    //   1001: fconst_2
    //   1002: fmul
    //   1003: invokevirtual setCardElevation : (F)V
    //   1006: aload_0
    //   1007: getfield U : Lb2;
    //   1010: getfield c : Lcom/google/android/material/card/MaterialCardView;
    //   1013: iconst_0
    //   1014: invokevirtual setStrokeWidth : (I)V
    //   1017: aload_0
    //   1018: getfield U : Lb2;
    //   1021: getfield c : Lcom/google/android/material/card/MaterialCardView;
    //   1024: iload #5
    //   1026: invokevirtual setCardBackgroundColor : (I)V
    //   1029: aload_0
    //   1030: getfield U : Lb2;
    //   1033: getfield u : Landroid/widget/TextView;
    //   1036: iload #7
    //   1038: invokevirtual setTextColor : (I)V
    //   1041: aload_0
    //   1042: getfield U : Lb2;
    //   1045: getfield j : Landroid/widget/TextView;
    //   1048: iload #8
    //   1050: invokevirtual setTextColor : (I)V
    //   1053: aload_0
    //   1054: getfield U : Lb2;
    //   1057: getfield y : Landroid/widget/TextView;
    //   1060: iload #8
    //   1062: invokevirtual setTextColor : (I)V
    //   1065: aload_0
    //   1066: getfield U : Lb2;
    //   1069: getfield e : Landroid/widget/TextView;
    //   1072: iload #8
    //   1074: invokevirtual setTextColor : (I)V
    //   1077: goto -> 1170
    //   1080: aload #21
    //   1082: getfield c : Lcom/google/android/material/card/MaterialCardView;
    //   1085: fconst_0
    //   1086: invokevirtual setCardElevation : (F)V
    //   1089: aload_0
    //   1090: getfield U : Lb2;
    //   1093: getfield c : Lcom/google/android/material/card/MaterialCardView;
    //   1096: astore #21
    //   1098: fload_1
    //   1099: f2d
    //   1100: ldc2_w 1.4
    //   1103: dmul
    //   1104: d2i
    //   1105: istore #4
    //   1107: aload #21
    //   1109: iload #4
    //   1111: invokevirtual setStrokeWidth : (I)V
    //   1114: aload_0
    //   1115: getfield U : Lb2;
    //   1118: getfield c : Lcom/google/android/material/card/MaterialCardView;
    //   1121: iconst_0
    //   1122: invokevirtual setCardBackgroundColor : (I)V
    //   1125: aload_0
    //   1126: getfield U : Lb2;
    //   1129: getfield u : Landroid/widget/TextView;
    //   1132: iload #6
    //   1134: invokevirtual setTextColor : (I)V
    //   1137: aload_0
    //   1138: getfield U : Lb2;
    //   1141: getfield j : Landroid/widget/TextView;
    //   1144: iload_3
    //   1145: invokevirtual setTextColor : (I)V
    //   1148: aload_0
    //   1149: getfield U : Lb2;
    //   1152: getfield y : Landroid/widget/TextView;
    //   1155: iload_3
    //   1156: invokevirtual setTextColor : (I)V
    //   1159: aload_0
    //   1160: getfield U : Lb2;
    //   1163: getfield e : Landroid/widget/TextView;
    //   1166: iload_3
    //   1167: invokevirtual setTextColor : (I)V
    //   1170: iconst_1
    //   1171: istore #9
    //   1173: goto -> 1184
    //   1176: astore #21
    //   1178: goto -> 1181
    //   1181: iconst_0
    //   1182: istore #9
    //   1184: iload #9
    //   1186: istore #11
    //   1188: aload #20
    //   1190: ifnull -> 1434
    //   1193: aload #20
    //   1195: getfield c : Lbv0;
    //   1198: getfield a : Ljava/util/ArrayList;
    //   1201: iconst_0
    //   1202: invokevirtual get : (I)Ljava/lang/Object;
    //   1205: checkcast ra1
    //   1208: getfield a : Ljava/lang/String;
    //   1211: astore #20
    //   1213: aload_0
    //   1214: getfield U : Lb2;
    //   1217: getfield v : Landroid/widget/TextView;
    //   1220: aload #20
    //   1222: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1225: aload_0
    //   1226: getfield U : Lb2;
    //   1229: getfield z : Landroid/widget/TextView;
    //   1232: aload_0
    //   1233: ldc_w 2131887078
    //   1236: invokevirtual getString : (I)Ljava/lang/String;
    //   1239: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1242: aload_0
    //   1243: getfield U : Lb2;
    //   1246: getfield d : Lcom/google/android/material/card/MaterialCardView;
    //   1249: iconst_0
    //   1250: invokevirtual setVisibility : (I)V
    //   1253: aload_0
    //   1254: getfield U : Lb2;
    //   1257: astore #20
    //   1259: iload #10
    //   1261: ifeq -> 1349
    //   1264: aload #20
    //   1266: getfield d : Lcom/google/android/material/card/MaterialCardView;
    //   1269: fload_1
    //   1270: fconst_2
    //   1271: fmul
    //   1272: invokevirtual setCardElevation : (F)V
    //   1275: aload_0
    //   1276: getfield U : Lb2;
    //   1279: getfield d : Lcom/google/android/material/card/MaterialCardView;
    //   1282: iconst_0
    //   1283: invokevirtual setStrokeWidth : (I)V
    //   1286: aload_0
    //   1287: getfield U : Lb2;
    //   1290: getfield d : Lcom/google/android/material/card/MaterialCardView;
    //   1293: iload #5
    //   1295: invokevirtual setCardBackgroundColor : (I)V
    //   1298: aload_0
    //   1299: getfield U : Lb2;
    //   1302: getfield v : Landroid/widget/TextView;
    //   1305: iload #7
    //   1307: invokevirtual setTextColor : (I)V
    //   1310: aload_0
    //   1311: getfield U : Lb2;
    //   1314: getfield k : Landroid/widget/TextView;
    //   1317: iload #8
    //   1319: invokevirtual setTextColor : (I)V
    //   1322: aload_0
    //   1323: getfield U : Lb2;
    //   1326: getfield z : Landroid/widget/TextView;
    //   1329: iload #8
    //   1331: invokevirtual setTextColor : (I)V
    //   1334: aload_0
    //   1335: getfield U : Lb2;
    //   1338: getfield f : Landroid/widget/TextView;
    //   1341: iload #8
    //   1343: invokevirtual setTextColor : (I)V
    //   1346: goto -> 1431
    //   1349: aload #20
    //   1351: getfield d : Lcom/google/android/material/card/MaterialCardView;
    //   1354: fconst_0
    //   1355: invokevirtual setCardElevation : (F)V
    //   1358: aload_0
    //   1359: getfield U : Lb2;
    //   1362: getfield d : Lcom/google/android/material/card/MaterialCardView;
    //   1365: fload_1
    //   1366: f2d
    //   1367: ldc2_w 1.4
    //   1370: dmul
    //   1371: d2i
    //   1372: invokevirtual setStrokeWidth : (I)V
    //   1375: aload_0
    //   1376: getfield U : Lb2;
    //   1379: getfield d : Lcom/google/android/material/card/MaterialCardView;
    //   1382: iconst_0
    //   1383: invokevirtual setCardBackgroundColor : (I)V
    //   1386: aload_0
    //   1387: getfield U : Lb2;
    //   1390: getfield v : Landroid/widget/TextView;
    //   1393: iload #6
    //   1395: invokevirtual setTextColor : (I)V
    //   1398: aload_0
    //   1399: getfield U : Lb2;
    //   1402: getfield k : Landroid/widget/TextView;
    //   1405: iload_3
    //   1406: invokevirtual setTextColor : (I)V
    //   1409: aload_0
    //   1410: getfield U : Lb2;
    //   1413: getfield z : Landroid/widget/TextView;
    //   1416: iload_3
    //   1417: invokevirtual setTextColor : (I)V
    //   1420: aload_0
    //   1421: getfield U : Lb2;
    //   1424: getfield f : Landroid/widget/TextView;
    //   1427: iload_3
    //   1428: invokevirtual setTextColor : (I)V
    //   1431: iconst_1
    //   1432: istore #11
    //   1434: aload #19
    //   1436: ifnull -> 1601
    //   1439: aload_0
    //   1440: getfield S : Z
    //   1443: ifeq -> 1601
    //   1446: aload_0
    //   1447: getfield U : Lb2;
    //   1450: getfield w : Landroid/widget/TextView;
    //   1453: aload #19
    //   1455: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1458: aload_0
    //   1459: getfield U : Lb2;
    //   1462: getfield b : Lcom/google/android/material/card/MaterialCardView;
    //   1465: iconst_0
    //   1466: invokevirtual setVisibility : (I)V
    //   1469: aload_0
    //   1470: getfield T : Z
    //   1473: istore #9
    //   1475: aload_0
    //   1476: getfield U : Lb2;
    //   1479: astore #19
    //   1481: iload #9
    //   1483: ifeq -> 1499
    //   1486: aload #19
    //   1488: getfield w : Landroid/widget/TextView;
    //   1491: iload #5
    //   1493: invokevirtual setTextColor : (I)V
    //   1496: goto -> 1509
    //   1499: aload #19
    //   1501: getfield w : Landroid/widget/TextView;
    //   1504: iload #6
    //   1506: invokevirtual setTextColor : (I)V
    //   1509: iload_2
    //   1510: ifeq -> 1591
    //   1513: aload_0
    //   1514: getfield U : Lb2;
    //   1517: getfield b : Lcom/google/android/material/card/MaterialCardView;
    //   1520: aload #22
    //   1522: bipush #7
    //   1524: iaload
    //   1525: aload #22
    //   1527: iconst_2
    //   1528: iaload
    //   1529: invokestatic g : (II)I
    //   1532: invokevirtual setStrokeColor : (I)V
    //   1535: aload_0
    //   1536: getfield U : Lb2;
    //   1539: getfield q : Lcom/google/android/material/button/MaterialButton;
    //   1542: aload #22
    //   1544: bipush #7
    //   1546: iaload
    //   1547: aload #22
    //   1549: iconst_2
    //   1550: iaload
    //   1551: invokestatic g : (II)I
    //   1554: invokevirtual setBackgroundColor : (I)V
    //   1557: aload_0
    //   1558: getfield U : Lb2;
    //   1561: getfield q : Lcom/google/android/material/button/MaterialButton;
    //   1564: ldc_w 2131887441
    //   1567: invokevirtual setText : (I)V
    //   1570: aload_0
    //   1571: getfield U : Lb2;
    //   1574: getfield q : Lcom/google/android/material/button/MaterialButton;
    //   1577: iconst_0
    //   1578: invokevirtual setVisibility : (I)V
    //   1581: goto -> 1591
    //   1584: astore #19
    //   1586: aload #19
    //   1588: invokevirtual printStackTrace : ()V
    //   1591: aload_0
    //   1592: invokevirtual n0 : ()V
    //   1595: iconst_1
    //   1596: istore #11
    //   1598: goto -> 1601
    //   1601: iload #11
    //   1603: ireturn
    //   1604: astore #21
    //   1606: goto -> 1181
    //   1609: astore #21
    //   1611: goto -> 1077
    //   1614: astore #21
    //   1616: goto -> 1170
    //   1619: astore #20
    //   1621: iload #9
    //   1623: istore #11
    //   1625: goto -> 1434
    //   1628: astore #20
    //   1630: goto -> 1431
    //   1633: astore #19
    //   1635: goto -> 1601
    //   1638: astore #19
    //   1640: goto -> 1595
    // Exception table:
    //   from	to	target	type
    //   43	50	88	finally
    //   60	75	78	finally
    //   80	85	88	finally
    //   96	125	88	finally
    //   128	135	88	finally
    //   140	147	88	finally
    //   155	164	88	finally
    //   169	183	88	finally
    //   183	193	88	finally
    //   221	228	251	finally
    //   233	248	251	finally
    //   266	289	307	finally
    //   298	304	307	finally
    //   318	348	307	finally
    //   357	363	307	finally
    //   366	371	307	finally
    //   371	417	307	finally
    //   417	427	468	finally
    //   435	444	455	finally
    //   498	509	455	finally
    //   517	526	455	finally
    //   920	930	1604	finally
    //   930	984	1176	finally
    //   995	1077	1609	finally
    //   1080	1098	1609	finally
    //   1107	1170	1614	finally
    //   1193	1253	1619	finally
    //   1264	1346	1628	finally
    //   1349	1431	1628	finally
    //   1446	1469	1633	finally
    //   1469	1475	1638	finally
    //   1486	1496	1638	finally
    //   1499	1509	1638	finally
    //   1513	1581	1584	finally
    //   1586	1591	1638	finally
    //   1591	1595	1638	finally
  }
  
  public final void s0() {
    String str1 = getString(2131886415);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getString(2131886357));
    stringBuilder.append(", ");
    stringBuilder.append(getString(2131887290));
    String str2 = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(getString(2131886952));
    stringBuilder.append(", ");
    stringBuilder.append(getString(2131886954));
    stringBuilder.append(": ");
    stringBuilder.append(getString(2131887443));
    String str3 = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(getString(2131886842));
    stringBuilder.append(": ");
    stringBuilder.append(getString(2131887062));
    stringBuilder.append(", ");
    stringBuilder.append(getString(2131887061));
    stringBuilder.append(", ");
    stringBuilder.append(getString(2131887503));
    stringBuilder.append(", ");
    stringBuilder.append(getResources().getQuantityString(2131755029, 5, new Object[] { Integer.valueOf(5) }));
    String str4 = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(getString(2131886224));
    stringBuilder.append(" (");
    stringBuilder.append(getString(2131886225));
    stringBuilder.append(")");
    String str5 = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(getString(2131887240));
    stringBuilder.append(" + ");
    stringBuilder.append(getString(2131887241));
    String str6 = stringBuilder.toString();
    if (this.W == 1) {
      String str = getString(2131887566);
    } else {
      stringBuilder = null;
    } 
    CharSequence[] arrayOfCharSequence = new CharSequence[7];
    arrayOfCharSequence[0] = str1;
    arrayOfCharSequence[1] = str2;
    arrayOfCharSequence[2] = str3;
    arrayOfCharSequence[3] = str4;
    arrayOfCharSequence[4] = str5;
    arrayOfCharSequence[5] = str6;
    arrayOfCharSequence[6] = stringBuilder;
    str6 = jLnXOLx.GoXvteaVqfmK;
    int[] arrayOfInt = m92.h;
    this.U.p.removeAllViews();
    TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-2, -2);
    float f = getResources().getDimension(2131166369);
    int j = (int)(16.0F * f);
    int k = (int)(f * 20.0F);
    int m = (int)(f * 22.0F);
    int i = (int)(getResources().getDimension(2131165390) * 20.0F);
    TableRow.LayoutParams layoutParams3 = new TableRow.LayoutParams(m, m);
    TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(m, m);
    TableRow.LayoutParams layoutParams4 = new TableRow.LayoutParams(0, -2);
    TableRow.LayoutParams layoutParams1 = new TableRow.LayoutParams(0, -2);
    layoutParams3.leftMargin = i;
    layoutParams2.leftMargin = i;
    int n = (int)(f * 1.5D);
    layoutParams3.topMargin = n;
    layoutParams2.topMargin = n;
    layoutParams4.leftMargin = i;
    layoutParams1.leftMargin = i;
    layoutParams4.rightMargin = i;
    layoutParams1.rightMargin = i;
    layoutParams4.weight = 1.0F;
    layoutParams1.weight = 1.0F;
    for (i = 0; i < 7; i++) {
      CharSequence charSequence = arrayOfCharSequence[i];
      if (charSequence != null) {
        TableRow.LayoutParams layoutParams5;
        TableRow tableRow = new TableRow((Context)this);
        if (i == 0) {
          tableRow.setPadding(0, k, 0, j);
        } else if (i == 6 || arrayOfCharSequence[i + 1] == null) {
          tableRow.setPadding(0, 0, 0, k);
        } else {
          tableRow.setPadding(0, 0, 0, j);
        } 
        ImageView imageView = new ImageView((Context)this);
        TextView textView = new TextView((Context)this);
        textView.setMinHeight(m);
        textView.setTextSize(2, 15.0F);
        textView.setGravity(16);
        if (i == 0) {
          layoutParams5 = layoutParams3;
        } else {
          layoutParams5 = layoutParams2;
        } 
        imageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams5);
        if (i == 0) {
          layoutParams5 = layoutParams4;
        } else {
          layoutParams5 = layoutParams1;
        } 
        textView.setLayoutParams((ViewGroup.LayoutParams)layoutParams5);
        (new String[7])[0] = "1";
        (new String[7])[1] = "2";
        (new String[7])[2] = "3";
        (new String[7])[3] = str6;
        (new String[7])[4] = "6";
        (new String[7])[5] = "5";
        (new String[7])[6] = null;
        String str = (new String[7])[i];
        if (str != null)
          tableRow.setTag(str); 
        (new int[7])[0] = 2131231122;
        (new int[7])[1] = 2131231608;
        (new int[7])[2] = 2131231095;
        (new int[7])[3] = 2131231220;
        (new int[7])[4] = 2131231021;
        (new int[7])[5] = 2131231383;
        (new int[7])[6] = 2131231679;
        n = (new int[7])[i];
        if (n != -1) {
          imageView.setImageResource(n);
          imageView.setColorFilter(arrayOfInt[6] | 0xFF000000);
          imageView.setImageAlpha(Color.alpha(arrayOfInt[6]));
        } 
        textView.setText(charSequence);
        textView.setTextColor(arrayOfInt[5]);
        tableRow.addView((View)imageView);
        tableRow.addView((View)textView);
        this.U.p.addView((View)tableRow, (ViewGroup.LayoutParams)layoutParams);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\IapActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */