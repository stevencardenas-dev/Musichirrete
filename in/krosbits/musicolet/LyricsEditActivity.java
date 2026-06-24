package in.krosbits.musicolet;

import ag0;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.text.ClipboardManager;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Placeholder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import cd;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.Slider;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import dc;
import dd;
import dq0;
import e3;
import ec;
import eq0;
import f01;
import fc;
import fg;
import g7;
import g92;
import ga1;
import gq0;
import hc;
import hn1;
import hq0;
import hs0;
import id1;
import in.krosbits.android.widgets.SmartTextView;
import j50;
import java.util.ArrayList;
import java.util.HashSet;
import k91;
import km0;
import l90;
import lw0;
import m41;
import m60;
import m92;
import ml0;
import ms0;
import mz;
import n0;
import n21;
import n4;
import pc;
import qo;
import rd;
import rs0;
import ss0;
import tf0;
import u00;
import v00;
import vp1;
import w60;
import wp1;
import ws2;
import xp1;
import xr1;
import yr1;

public class LyricsEditActivity extends pc implements fc, ec, dc, hn1, m41, View.OnClickListener, AudioManager.OnAudioFocusChangeListener, dd {
  public static LyricsEditActivity F0;
  
  public static final m60 G0 = new m60(20);
  
  public final HashSet A0 = new HashSet();
  
  public boolean B0 = false;
  
  public final e3 C0 = new e3(17, this);
  
  public ss0 D0;
  
  public final l90 E0 = new l90(this, 4);
  
  public g7 R;
  
  public Group S;
  
  public Group T;
  
  public MaterialButtonToggleGroup U;
  
  public MaterialButton V;
  
  public MaterialButton W;
  
  public MaterialButton X;
  
  public MaterialButton Y;
  
  public MaterialButton Z;
  
  public MaterialButton a0;
  
  public TextView b0;
  
  public Slider c0;
  
  public RecyclerView d0;
  
  public TextInputEditText e0;
  
  public FloatingActionButton f0;
  
  public FloatingActionButton g0;
  
  public String h0 = "";
  
  public String i0 = "";
  
  public km0 j0;
  
  public final ArrayList k0 = new ArrayList();
  
  public yr1 l0;
  
  public hc m0;
  
  public boolean n0;
  
  public boolean o0 = true;
  
  public AudioFocusRequest p0;
  
  public final Handler q0 = new Handler(Looper.getMainLooper());
  
  public boolean r0;
  
  public boolean s0;
  
  public String t0;
  
  public String u0;
  
  public String v0;
  
  public Bundle w0 = null;
  
  public boolean x0;
  
  public boolean y0;
  
  public v00 z0 = null;
  
  public final void C(View paramView) {
    Slider slider = (Slider)paramView;
    this.r0 = false;
    hc hc1 = this.m0;
    if (hc1 != null && this.n0) {
      hc1.R((int)slider.getValue());
      v0();
    } 
  }
  
  public final void E(hc paramhc) {
    paramhc = this.m0;
    if (paramhc != null)
      try {
        this.n0 = true;
        int i = paramhc.C();
        ag0.z0(this.c0, 0.0F, i, 0.0F);
        Bundle bundle = this.w0;
        if (bundle != null) {
          i = bundle.getInt("pos", 0);
          if (i > 0)
            t0(i); 
          this.w0 = null;
        } 
        if (!this.o0)
          q0(); 
        return;
      } finally {
        paramhc = null;
      }  
  }
  
  public final void P(Slider paramSlider, float paramFloat, boolean paramBoolean) {
    if (paramBoolean) {
      int i = (int)paramFloat;
      this.b0.setText(n21.D(i, this.s0, false));
    } 
  }
  
  public final void g(View paramView) {
    Slider slider = (Slider)paramView;
    this.r0 = true;
  }
  
  public final void l0() {
    if (Build.VERSION.SDK_INT >= 30) {
      ArrayList<Uri> arrayList = new ArrayList();
      v00 v001 = this.z0;
      if (v001 instanceof lw0)
        arrayList.add(((lw0)v001).L()); 
      if (!arrayList.isEmpty()) {
        n0.k(this, 10302, arrayList);
        return;
      } 
      s0();
      return;
    } 
    s0();
  }
  
  public final void m0(boolean paramBoolean) {
    Bundle bundle;
    wp1 wp1;
    ArrayList<xp1> arrayList2 = new ArrayList();
    ArrayList<xp1> arrayList1 = new ArrayList();
    HashSet hashSet = this.A0;
    for (String str : hashSet) {
      xp1 xp1 = MyApplication.F.b(str);
      if (xp1 == null || xp1.j == 0)
        continue; 
      if (xp1.i) {
        arrayList2.add(xp1);
        continue;
      } 
      arrayList1.add(xp1);
    } 
    int i = arrayList2.size();
    byte b = 0;
    if (i > 0) {
      if (paramBoolean) {
        bundle = new Bundle();
        String[] arrayOfString = new String[arrayList2.size()];
        while (b < arrayList2.size()) {
          arrayOfString[b] = ((xp1)arrayList2.get(b)).e;
          b++;
        } 
        bundle.putStringArray("arg_reqattu", arrayOfString);
        wp1 = new wp1();
        wp1.x0(bundle);
        wp1.D0 = (vp1)G0;
        wp1.O0(this, Z());
      } 
      return;
    } 
    if (wp1.size() > 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getResources().getQuantityString(2131755031, wp1.size()));
      stringBuilder.append("<br/><b>");
      stringBuilder.append(TextUtils.join(",", (Iterable)wp1));
      stringBuilder.append("</b>");
      Spanned spanned = Html.fromHtml(stringBuilder.toString());
      ms0 ms0 = new ms0((Context)this);
      ms0.d((CharSequence)spanned);
      if (bundle.size() != wp1.size()) {
        ms0.n(2131886404);
        ms0.A = (rs0)new eq0(this, 0);
      } 
      ms0.l(2131886278);
      ms0.p();
      return;
    } 
    l0();
  }
  
  public final void n0(boolean paramBoolean) {
    w0();
    if (!this.i0.equals(this.h0)) {
      if (!this.x0) {
        try {
          Intent intent = new Intent();
          this();
          intent.setClipData(ClipData.newPlainText("lrc", this.h0));
          intent.putExtra("as", paramBoolean);
          setResult(-1, intent);
        } finally {
          Exception exception = null;
        } 
        return;
      } 
      u0();
      return;
    } 
    finish();
  }
  
  public final void o0(int paramInt) {
    String str;
    xr1 xr1 = this.k0.get(paramInt);
    ms0 ms0 = new ms0((Context)this);
    ms0.e(2131492961, true);
    ms0.l(2131887160);
    ms0.n(2131887030);
    ms0.k(2131886278);
    View view = ms0.u;
    MaterialButton materialButton1 = (MaterialButton)view.findViewById(2131296407);
    MaterialButton materialButton2 = (MaterialButton)view.findViewById(2131296421);
    TextInputEditText textInputEditText1 = (TextInputEditText)view.findViewById(2131296709);
    TextInputEditText textInputEditText2 = (TextInputEditText)view.findViewById(2131296708);
    long l = xr1.a;
    if (l >= 0L) {
      str = n21.D(l, this.s0, false);
    } else {
      str = "";
    } 
    textInputEditText1.setText(str);
    textInputEditText2.setText(xr1.b);
    gq0 gq0 = new gq0(this, textInputEditText1, materialButton1, materialButton2, xr1);
    materialButton1.setOnClickListener((View.OnClickListener)gq0);
    materialButton2.setOnClickListener((View.OnClickListener)gq0);
    ms0.A = (rs0)new tf0(this, textInputEditText1, textInputEditText2, xr1, paramInt);
    ms0.C = (rs0)new mz(paramInt, 1, this);
    ms0.Y = (DialogInterface.OnShowListener)new fg(textInputEditText2, 1);
    ms0.p();
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 10302) {
      if (paramInt2 == -1) {
        s0();
        return;
      } 
    } else if (paramInt1 == 10301 && paramInt2 == -1 && paramIntent != null) {
      Uri uri = paramIntent.getData();
      if (uri != null) {
        String str = uri.toString();
        v00 v001 = v00.q(n21.f, str);
        if (v001 != null) {
          ms0 ms0;
          ArrayList<String> arrayList = new ArrayList(2);
          this.j0.d();
          boolean bool = this.j0.h.equalsIgnoreCase(ml0.c(v001.b.toString()));
          paramInt2 = 0;
          if (!bool) {
            StringBuilder stringBuilder = new StringBuilder("• ");
            stringBuilder.append(getString(2131886757, new Object[] { ml0.a((MyApplication.F.c(this.j0.h)).b) }));
            arrayList.add(stringBuilder.toString());
            paramInt1 = 0;
          } else {
            paramInt1 = 1;
          } 
          if (!ag0.J(this.j0.g).equals(ag0.J(v001.h()))) {
            StringBuilder stringBuilder1 = new StringBuilder("• ");
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(ag0.J(this.j0.g));
            stringBuilder2.append(".lrc");
            stringBuilder1.append(getString(2131886758, new Object[] { stringBuilder2.toString() }));
            arrayList.add(stringBuilder1.toString());
            paramInt1 = paramInt2;
          } 
          if (paramInt1 == 0) {
            if (v001.n() == 0L)
              v001.e(); 
            ms0 = new ms0((Context)this);
            ms0.d((CharSequence)Html.fromHtml(TextUtils.join("<br/>", arrayList)));
            ms0.n(2131887030);
            ms0.p();
            return;
          } 
          try {
            MyApplication.i.getApplicationContext().getContentResolver().takePersistableUriPermission((Uri)ms0, 3);
            this.z0 = v001;
            return;
          } finally {
            ms0 = null;
          } 
        } 
      } 
    } 
  }
  
  public final void onAudioFocusChange(int paramInt) {
    if (this.n0 && this.m0 != null && paramInt != 1 && !this.o0)
      p0(); 
  }
  
  public final void onBackPressed() {
    w0();
    if (!this.i0.equals(this.h0)) {
      if (this.x0 || !this.y0) {
        ms0 ms0 = new ms0((Context)this);
        ms0.q(2131887268);
        ms0.l(2131886278);
        ms0.k(2131886989);
        ms0.n(2131887604);
        ms0.D = (rs0)new eq0(this, 1);
        ms0.p();
        return;
      } 
      n0(false);
      return;
    } 
    super.onBackPressed();
  }
  
  public void onClick(View paramView) {
    hc hc1;
    if (paramView == this.f0) {
      n0(true);
      return;
    } 
    if (paramView == this.g0) {
      finish();
      return;
    } 
    if (paramView == this.Y) {
      if (this.o0) {
        q0();
        return;
      } 
      p0();
      return;
    } 
    if (paramView == this.a0) {
      if (this.n0) {
        hc1 = this.m0;
        if (hc1 != null) {
          int i = hc1.A();
          t0(MyApplication.o().getInt("k_s_ffd", 10) * 1000 + i);
          return;
        } 
      } 
    } else if (hc1 == this.Z) {
      if (this.n0) {
        hc1 = this.m0;
        if (hc1 != null) {
          t0(hc1.A() - MyApplication.o().getInt("k_s_rwd", 10) * 1000);
          return;
        } 
      } 
    } else {
      String str;
      TextInputEditText textInputEditText;
      if (hc1 == this.V) {
        str = MyApplication.o().getString("sosqlrc", "lyrics <t> <al>");
        try {
          return;
        } finally {
          str = null;
          str.printStackTrace();
          MyApplication.o().edit().remove("sosqlrc").apply();
        } 
      } 
      if (str == this.W) {
        textInputEditText = this.e0;
        textInputEditText.setSelection(0, textInputEditText.getText().length());
        this.e0.requestFocus();
        ag0.H0((Context)this, (View)this.e0);
        return;
      } 
      if (textInputEditText == this.X) {
        CharSequence charSequence = ((ClipboardManager)MyApplication.i.getApplicationContext().getSystemService("clipboard")).getText();
        if (charSequence == null) {
          charSequence = "";
        } else {
          charSequence = charSequence.toString().trim();
        } 
        this.e0.getText().replace(this.e0.getSelectionStart(), this.e0.getSelectionEnd(), charSequence);
      } 
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    ArrayList<String> arrayList;
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(paramBundle);
    F0 = this;
    U().a(this.E0);
    try {
      ClipData clipData = getIntent().getClipData();
    } finally {
      Exception exception = null;
    } 
    km0 km01 = this.j0;
    if (km01 == null) {
      finish();
      return;
    } 
    try {
      String str1 = km01.d().y();
      this.A0.add(str1);
    } finally {
      km01 = null;
    } 
    this.v0 = getIntent().getStringExtra("tl");
    this.u0 = getIntent().getStringExtra("al");
    this.t0 = getIntent().getStringExtra("ar");
    this.x0 = getIntent().getBooleanExtra("lrce", false);
    this.y0 = getIntent().getBooleanExtra("hpel", false);
    String str = getIntent().getStringExtra("lrcu");
    v00 v001 = v00.q(n21.f, str);
    this.z0 = v001;
    if (v001 != null) {
      String str1 = v001.b.toString();
      if (str1 == null || str1.equals("~"))
        this.z0 = v00.r(MyApplication.i.getApplicationContext(), str, MyApplication.F.e((u00)this.z0, false), null, -1L); 
    } 
    View view = LayoutInflater.from((Context)this).inflate(2131492903, null, false);
    int i = 2131296438;
    if ((MaterialButton)ws2.C(view, 2131296438) != null)
      if ((TextInputEditText)ws2.C(view, 2131296703) != null) {
        if ((Group)ws2.C(view, 2131296775) != null) {
          if ((Group)ws2.C(view, 2131296777) != null) {
            i = 2131296835;
            if ((FloatingActionButton)ws2.C(view, 2131296835) != null) {
              i = 2131296849;
              if ((FloatingActionButton)ws2.C(view, 2131296849) != null)
                if ((MaterialButton)ws2.C(view, 2131296862) != null) {
                  if ((MaterialButton)ws2.C(view, 2131296877) != null) {
                    if ((MaterialButton)ws2.C(view, 2131296879) != null) {
                      if ((MaterialButton)ws2.C(view, 2131296897) != null) {
                        if ((MaterialButton)ws2.C(view, 2131296900) != null) {
                          i = 2131297306;
                          if ((Placeholder)ws2.C(view, 2131297306) != null) {
                            i = 2131297416;
                            if ((RecyclerView)ws2.C(view, 2131297416) != null) {
                              i = 2131297480;
                              if ((Slider)ws2.C(view, 2131297480) != null) {
                                i = 2131297605;
                                if ((MaterialButton)ws2.C(view, 2131297605) != null) {
                                  i = 2131297608;
                                  if ((MaterialButton)ws2.C(view, 2131297608) != null) {
                                    TextInputLayout textInputLayout = (TextInputLayout)ws2.C(view, 2131297642);
                                    if (textInputLayout != null) {
                                      i = 2131297656;
                                      if ((MaterialButtonToggleGroup)ws2.C(view, 2131297656) != null) {
                                        i = 2131297718;
                                        if ((SmartTextView)ws2.C(view, 2131297718) != null) {
                                          i = 2131297922;
                                          if (ws2.C(view, 2131297922) != null) {
                                            f01 f01;
                                            hc hc1;
                                            boolean bool;
                                            ConstraintLayout constraintLayout = (ConstraintLayout)view;
                                            this.R = new g7(1, constraintLayout, textInputLayout);
                                            setContentView((View)constraintLayout);
                                            g92.c((View)this.R.c, true, true);
                                            if (Build.VERSION.SDK_INT < 30)
                                              try {
                                                ViewTreeObserver viewTreeObserver = ((ConstraintLayout)this.R.c).getViewTreeObserver();
                                                rd rd = new rd();
                                                this((KeyEvent.Callback)this, 1);
                                                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)rd);
                                              } finally {} 
                                            if (this.x0) {
                                              String str2;
                                              TextInputLayout textInputLayout1 = (TextInputLayout)this.R.e;
                                              v00 v002 = this.z0;
                                              if (v002 != null && !TextUtils.isEmpty(v002.h())) {
                                                str2 = this.z0.h();
                                              } else {
                                                str2 = getString(2131886472);
                                              } 
                                              textInputLayout1.setHint(str2);
                                            } 
                                            this.T = (Group)findViewById(2131296775);
                                            this.S = (Group)findViewById(2131296777);
                                            this.U = (MaterialButtonToggleGroup)findViewById(2131297656);
                                            MaterialButton materialButton = (MaterialButton)findViewById(2131297608);
                                            materialButton = (MaterialButton)findViewById(2131297605);
                                            this.V = (MaterialButton)findViewById(2131296438);
                                            this.W = (MaterialButton)findViewById(2131296900);
                                            this.X = (MaterialButton)findViewById(2131296877);
                                            this.Y = (MaterialButton)findViewById(2131296879);
                                            this.Z = (MaterialButton)findViewById(2131296897);
                                            this.a0 = (MaterialButton)findViewById(2131296862);
                                            this.b0 = (TextView)findViewById(2131297718);
                                            this.c0 = (Slider)findViewById(2131297480);
                                            this.d0 = (RecyclerView)findViewById(2131297416);
                                            this.e0 = (TextInputEditText)findViewById(2131296703);
                                            this.f0 = (FloatingActionButton)findViewById(2131296849);
                                            this.g0 = (FloatingActionButton)findViewById(2131296835);
                                            this.d0.setLayoutManager((a)new LinearLayoutManager(1));
                                            if (this.j0.c.g >= 3600000) {
                                              bool = true;
                                            } else {
                                              bool = false;
                                            } 
                                            this.s0 = bool;
                                            arrayList = this.k0;
                                            yr1 yr11 = new yr1(arrayList, this, bool);
                                            this.l0 = yr11;
                                            this.d0.setAdapter((id1)yr11);
                                            hc hc2 = MusicService.E0;
                                            if (hc2 != null) {
                                              i = hc2.x();
                                            } else {
                                              i = 0;
                                            } 
                                            if (i > 0) {
                                              f01 = f01.b();
                                            } else {
                                              f01 = new f01();
                                            } 
                                            if (MyApplication.o().getInt("k_i_adt", 0) == 0) {
                                              this.m0 = (hc)new w60(MyApplication.i.getApplicationContext(), i, f01);
                                            } else {
                                              this.m0 = (hc)new n4(MyApplication.i.getApplicationContext());
                                            } 
                                            this.m0.G(MyApplication.i.getApplicationContext());
                                            if (i > 0) {
                                              hc hc3 = this.m0;
                                              if (hc3 instanceof n4)
                                                hc3.T(i); 
                                            } 
                                            try {
                                              j50.w(this.m0);
                                            } finally {
                                              f01 = null;
                                            } 
                                            hc1.f = this;
                                            hc1.e = this;
                                            hc1.c = this;
                                            r0();
                                            this.e0.setText(this.h0);
                                            String str1 = this.e0.getText().toString();
                                            this.h0 = str1;
                                            n21.E(str1, arrayList, false);
                                            int k = arrayList.size();
                                            int j = 0;
                                            label149: while (true) {
                                              if (j < k) {
                                                str1 = arrayList.get(j);
                                                int m = j + 1;
                                                xr1 xr1 = (xr1)str1;
                                                j = m;
                                                if (xr1.a > 0L) {
                                                  String str2 = xr1.b;
                                                  int n = str2.length();
                                                  i = 0;
                                                  while (true) {
                                                    j = m;
                                                    if (i < n) {
                                                      j = str2.codePointAt(i);
                                                      if (!Character.isWhitespace(j)) {
                                                        this.T.setVisibility(8);
                                                        this.S.setVisibility(0);
                                                        this.U.g(2131297605, true);
                                                        this.l0.g();
                                                        break;
                                                      } 
                                                      i += Character.charCount(j);
                                                      continue;
                                                    } 
                                                    continue label149;
                                                  } 
                                                  break;
                                                } 
                                                continue;
                                              } 
                                              this.S.setVisibility(8);
                                              this.T.setVisibility(0);
                                              this.U.g(2131297608, true);
                                              this.e0.setText(this.h0);
                                              break;
                                            } 
                                            this.U.f((hs0)new dq0(this, 0));
                                            this.W.setOnClickListener(this);
                                            this.X.setOnClickListener(this);
                                            this.V.setOnClickListener(this);
                                            this.f0.setOnClickListener(this);
                                            this.g0.setOnClickListener(this);
                                            this.Y.setOnClickListener(this);
                                            this.a0.setOnClickListener(this);
                                            this.Z.setOnClickListener(this);
                                            this.c0.a((cd)this);
                                            this.c0.b(this);
                                            return;
                                          } 
                                        } 
                                      } 
                                    } else {
                                      i = 2131297642;
                                    } 
                                  } 
                                } 
                              } 
                            } 
                          } 
                        } else {
                          i = 2131296900;
                        } 
                      } else {
                        i = 2131296897;
                      } 
                    } else {
                      i = 2131296879;
                    } 
                  } else {
                    i = 2131296877;
                  } 
                } else {
                  i = 2131296862;
                }  
            } 
          } else {
            i = 2131296777;
          } 
        } else {
          i = 2131296775;
        } 
      } else {
        i = 2131296703;
      }  
    k91.h("Missing required view with ID: ".concat(arrayList.getResources().getResourceName(i)));
  }
  
  public final void onDestroy() {
    if (F0 == this)
      F0 = null; 
    super.onDestroy();
    if (Build.VERSION.SDK_INT >= 26) {
      if (this.p0 != null)
        MyApplication.e().abandonAudioFocusRequest(this.p0); 
    } else {
      MyApplication.e().abandonAudioFocus(this);
    } 
    this.q0.removeCallbacks((Runnable)this.C0);
    hc hc1 = this.m0;
    if (hc1 != null) {
      hc1.O();
      this.m0 = null;
    } 
  }
  
  public final void onRestoreInstanceState(Bundle paramBundle) {
    super.onRestoreInstanceState(paramBundle);
    this.w0 = paramBundle;
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    w0();
    paramBundle.putString("e_lrc", this.h0);
    paramBundle.putString("op_lrc", this.i0);
    hc hc1 = this.m0;
    if (hc1 != null && this.n0)
      paramBundle.putInt("pos", hc1.A()); 
  }
  
  public final void p0() {
    hc hc1 = this.m0;
    if (hc1 != null)
      try {
        hc1.M();
        this.Y.setIconResource(2131231063);
        this.q0.removeCallbacks((Runnable)this.C0);
        v0();
        this.o0 = true;
        return;
      } finally {
        hc1 = null;
      }  
  }
  
  public final void q0() {
    int i;
    if (Build.VERSION.SDK_INT >= 26) {
      if (this.p0 == null)
        this.p0 = (new AudioFocusRequest.Builder(2)).setAudioAttributes(MusicService.x()).setOnAudioFocusChangeListener(this).build(); 
      i = MyApplication.e().requestAudioFocus(this.p0);
    } else {
      i = MyApplication.e().requestAudioFocus(this, 3, 2);
    } 
    try {
      if (MusicService.F0 && MusicService.G0) {
        Intent intent = new Intent();
        this(MyApplication.i.getApplicationContext(), MusicService.class);
        startService(intent.setAction("ACTION_PAUSE"));
      } 
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void r0() {
    hc hc1 = this.m0;
    if (hc1 != null)
      try {
        return;
      } finally {
        hc1 = null;
        hc1.printStackTrace();
      }  
  }
  
  public final void s(hc paramhc) {
    p0();
    r0();
  }
  
  public final void s0() {
    ms0 ms0 = new ms0((Context)this);
    ms0.o(0, true);
    ms0.c(2131887105);
    ms0.J = false;
    ms0.K = false;
    this.D0 = ms0.p();
    (new hq0(0, this)).start();
  }
  
  public final void t0(int paramInt) {
    int i = this.m0.C();
    if (paramInt >= 0 && paramInt < i) {
      this.m0.R(paramInt);
      v0();
    } 
  }
  
  public final void u0() {
    if (this.z0 == null) {
      Intent intent = (new Intent("android.intent.action.CREATE_DOCUMENT")).setType("application/lrc").addCategory("android.intent.category.OPENABLE").addFlags(67).putExtra("android.content.extra.SHOW_ADVANCED", true);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(ag0.J(this.j0.g));
      stringBuilder.append(IGBYXeDFmKYajx.GqbYgmgclWCSX);
      startActivityForResult(intent.putExtra("android.intent.extra.TITLE", stringBuilder.toString()).putExtra("android.provider.extra.INITIAL_URI", (Parcelable)n0.j(this.j0.d().i())), 10301);
      return;
    } 
    m0(true);
  }
  
  public final boolean v(hc paramhc, int paramInt1, int paramInt2) {
    ag0.P0(0, ga1.j("error w=", paramInt1, paramInt2, " e="), true);
    return false;
  }
  
  public final void v0() {
    if (!this.r0 && this.n0) {
      hc hc1 = this.m0;
      if (hc1 != null) {
        int j = hc1.A();
        int i = j;
        if (j < 0)
          i = 0; 
        this.b0.setText(n21.D(i, this.s0, false));
        Slider slider = this.c0;
        float f = i;
        String str = ag0.a;
        ag0.z0(slider, slider.getValueFrom(), slider.getValueTo(), f);
      } 
    } 
  }
  
  public final void w0() {
    if (this.U.getCheckedButtonId() == 2131297608) {
      this.h0 = this.e0.getText().toString().trim();
      return;
    } 
    if (this.U.getCheckedButtonId() == 2131297605)
      this.h0 = n21.C(this.k0).toString(); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\LyricsEditActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */