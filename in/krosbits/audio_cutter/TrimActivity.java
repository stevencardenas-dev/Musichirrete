package in.krosbits.audio_cutter;

import ad0;
import ag0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.window.ldG.XUaAMlaMSa;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Placeholder;
import androidx.core.view.insets.ProtectionLayout;
import at;
import b40;
import by1;
import cd1;
import cn;
import com.google.android.gms.common.internal.Qg.jHxlGgUTadw;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.slider.Slider;
import com.google.android.material.textview.MaterialTextView;
import cr;
import cy1;
import dc;
import e00;
import ec;
import f01;
import fc;
import fw;
import g92;
import ga1;
import hc;
import hn;
import in.krosbits.musicolet.MiniPlayerActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;
import j50;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jn;
import k91;
import km0;
import l90;
import lw0;
import m;
import m92;
import ms0;
import n0;
import ne1;
import ns;
import nx1;
import o2;
import om;
import oq1;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;
import os;
import pc;
import pp;
import qo;
import qv;
import qx1;
import qz1;
import rs0;
import ss0;
import tx1;
import ui0;
import um0;
import ux1;
import v00;
import vp1;
import vs2;
import vx1;
import w60;
import wl0;
import wo;
import wp1;
import ws2;
import x41;
import xp1;
import xs;
import yi1;
import yw;

public final class TrimActivity extends pc implements ec, dc, fc, AudioManager.OnAudioFocusChangeListener {
  public static vx1 m0;
  
  public static cy1 n0;
  
  public o2 R;
  
  public km0 S;
  
  public final float T = 2000.0F;
  
  public by1 U;
  
  public ss0 V;
  
  public ss0 W;
  
  public ss0 X;
  
  public final int Y = 10302;
  
  public final int Z = 10303;
  
  public w60 a0;
  
  public boolean b0;
  
  public boolean c0 = true;
  
  public AudioFocusRequest d0;
  
  public boolean e0;
  
  public final Handler f0 = new Handler(Looper.getMainLooper());
  
  public boolean g0;
  
  public final yi1 h0 = new yi1(8, this);
  
  public final l90 i0 = new l90(this, 11);
  
  public final ColorStateList j0;
  
  public final ColorStateList k0;
  
  public final qx1 l0;
  
  public TrimActivity() {
    int[] arrayOfInt = m92.h;
    ColorStateList colorStateList2 = ColorStateList.valueOf(ag0.g(arrayOfInt[2], arrayOfInt[5]));
    colorStateList2.getClass();
    this.j0 = colorStateList2;
    ColorStateList colorStateList1 = ColorStateList.valueOf(ag0.g(arrayOfInt[2], arrayOfInt[6]));
    colorStateList1.getClass();
    this.k0 = colorStateList1;
    this.l0 = new qx1(this, 1);
  }
  
  public static String o0(float paramFloat) {
    String str2 = String.valueOf(paramFloat / 1000.0F);
    if (oq1.G0(str2, "0."))
      return oq1.F0(str2, "0.", JkpGFvCVQHzgc.ZMJUrN); 
    String str1 = str2;
    if (str2.endsWith(".0"))
      str1 = oq1.F0(str2, ".0", ""); 
    return str1;
  }
  
  public static final void v0(Activity paramActivity, km0 paramkm0) {
    paramActivity.getClass();
    paramkm0.getClass();
    try {
      Intent intent = new Intent();
      this((Context)paramActivity, TrimActivity.class);
      intent.putExtra("rowid", paramkm0.b);
      return;
    } finally {
      paramActivity = null;
      paramActivity.printStackTrace();
    } 
  }
  
  public static final void w0(Activity paramActivity, km0 paramkm0) {
    paramActivity.getClass();
    paramkm0.getClass();
    try {
      Intent intent = new Intent();
      this((Context)paramActivity, TrimActivity.class);
      return;
    } finally {
      paramActivity = null;
      paramActivity.printStackTrace();
    } 
  }
  
  public static void x0(View paramView, boolean paramBoolean) {
    byte b;
    if (paramBoolean) {
      b = 0;
    } else {
      b = 8;
    } 
    paramView.setVisibility(b);
  }
  
  public final void E(hc paramhc) {
    w60 w601 = this.a0;
    by1 by11 = this.U;
    if (by11 != null) {
      cy1 cy11 = (cy1)by11.d.b.f();
      if (w601 != null)
        try {
          this.b0 = true;
          int i = (int)cy11.e;
          if (i > 0)
            u0(i); 
          if (!this.c0)
            r0(); 
          return;
        } finally {
          w601 = null;
        }  
      return;
    } 
    ui0.n0("mViewModel");
    throw null;
  }
  
  public final void l0() {
    if (Build.VERSION.SDK_INT >= 30) {
      ArrayList<Uri> arrayList = new ArrayList();
      km0 km01 = this.S;
      if (km01 != null) {
        v00 v00 = km01.d();
        if (v00 == null)
          return; 
        if (v00 instanceof lw0) {
          km0 km02 = this.S;
          if (km02 != null) {
            v00 v001 = km02.d();
            v001.getClass();
            arrayList.add(((lw0)v001).L());
          } else {
            ui0.n0("mSongInfoWrapper");
            throw null;
          } 
        } 
        if (!arrayList.isEmpty()) {
          n0.k(this, this.Y, arrayList);
          return;
        } 
        by1 by12 = this.U;
        if (by12 != null) {
          by12.k(true);
          return;
        } 
        ui0.n0("mViewModel");
        throw null;
      } 
      ui0.n0("mSongInfoWrapper");
      throw null;
    } 
    by1 by11 = this.U;
    if (by11 != null) {
      by11.k(true);
      return;
    } 
    ui0.n0("mViewModel");
    throw null;
  }
  
  public final void m0() {
    boolean bool = Settings.System.canWrite(MyApplication.i.getApplicationContext());
    String str2 = null;
    if (bool) {
      by1 by11 = this.U;
      if (by11 != null) {
        by11.o();
        return;
      } 
      ui0.n0("mViewModel");
      throw null;
    } 
    String str1 = getString(2131887354);
    try {
      PackageManager packageManager = MyApplication.i.getApplicationContext().getPackageManager();
      String str = packageManager.getPermissionInfo("android.permission.WRITE_SETTINGS", 128).loadLabel(packageManager).toString();
    } finally {
      Exception exception = null;
    } 
    Drawable drawable = getDrawable(2131231392);
    String str3 = getString(2131887349);
    if (str1 != null)
      str2 = x41.w("\"", str1, "\""); 
    g92.g((Context)this, str3, str2, drawable, (Runnable)new nx1(this, 1));
  }
  
  public final void n0(boolean paramBoolean) {
    km0 km01 = this.S;
    if (km01 != null) {
      v00 v00 = km01.d();
      if (v00 != null) {
        HashSet<String> hashSet = new HashSet();
        String str = v00.y();
        if (str != null) {
          Bundle bundle;
          wp1 wp1;
          hashSet.add(str);
          ArrayList<xp1> arrayList2 = new ArrayList();
          ArrayList<xp1> arrayList1 = new ArrayList();
          Iterator<String> iterator = hashSet.iterator();
          iterator.getClass();
          while (iterator.hasNext()) {
            String str1 = (String)iterator.next();
            str1.getClass();
            str1 = str1;
            xp1 xp1 = MyApplication.F.b(str1);
            if (xp1 != null && xp1.j != 0) {
              if (xp1.i) {
                arrayList2.add(xp1);
                continue;
              } 
              arrayList1.add(xp1);
            } 
          } 
          if (arrayList2.size() > 0) {
            if (paramBoolean) {
              bundle = new Bundle();
              String[] arrayOfString = new String[arrayList2.size()];
              int i = arrayList2.size();
              for (byte b = 0; b < i; b++)
                arrayOfString[b] = ((xp1)arrayList2.get(b)).e; 
              bundle.putStringArray("arg_reqattu", arrayOfString);
              wp1 = new wp1();
              wp1.x0(bundle);
              wp1.D0 = (vp1)this.l0;
              wp1.O0(this, Z());
            } 
            return;
          } 
          if (wp1.size() > 0) {
            String str2 = getResources().getQuantityString(2131755031, wp1.size());
            String str1 = TextUtils.join(",", (Iterable)wp1);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append("<br/><b>");
            stringBuilder.append(str1);
            stringBuilder.append("</b>");
            Spanned spanned = Html.fromHtml(stringBuilder.toString());
            spanned.getClass();
            ms0 ms0 = new ms0((Context)this);
            ms0.d((CharSequence)spanned);
            if (bundle.size() != wp1.size()) {
              ms0.n(2131886404);
              ms0.A = (rs0)new qx1(this, 3);
            } 
            ms0.l(2131886278);
            ms0.p();
            return;
          } 
          l0();
          return;
        } 
      } 
      return;
    } 
    ui0.n0("mSongInfoWrapper");
    throw null;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == this.Y) {
      if (paramInt2 == -1) {
        by1 by11 = this.U;
        if (by11 != null) {
          by11.k(true);
          return;
        } 
        ui0.n0("mViewModel");
        throw null;
      } 
    } else if (paramInt1 == this.Z) {
      nx1 nx1 = new nx1(this, 0);
      this.f0.postDelayed((Runnable)nx1, 400L);
    } 
  }
  
  public final void onAudioFocusChange(int paramInt) {
    if (this.b0 && this.a0 != null && paramInt != 1 && !this.c0)
      q0(); 
  }
  
  public final void onBackPressed() {
    if (this.U != null) {
      super.onBackPressed();
      return;
    } 
    ui0.n0("mViewModel");
    throw null;
  }
  
  public final void onCreate(Bundle paramBundle) {
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(paramBundle);
    View view = getLayoutInflater().inflate(2131492917, null, false);
    int i = 2131296376;
    MaterialButton materialButton = (MaterialButton)ws2.C(view, 2131296376);
    if (materialButton != null) {
      i = 2131296389;
      MaterialButton materialButton1 = (MaterialButton)ws2.C(view, 2131296389);
      if (materialButton1 != null) {
        i = 2131296390;
        MaterialButton materialButton2 = (MaterialButton)ws2.C(view, 2131296390);
        if (materialButton2 != null) {
          i = 2131296391;
          MaterialButton materialButton3 = (MaterialButton)ws2.C(view, 2131296391);
          if (materialButton3 != null) {
            i = 2131296394;
            MaterialButton materialButton4 = (MaterialButton)ws2.C(view, 2131296394);
            if (materialButton4 != null) {
              i = 2131296396;
              MaterialButton materialButton5 = (MaterialButton)ws2.C(view, 2131296396);
              if (materialButton5 != null) {
                i = 2131296405;
                MaterialButton materialButton6 = (MaterialButton)ws2.C(view, 2131296405);
                if (materialButton6 != null) {
                  i = 2131296406;
                  MaterialButton materialButton7 = (MaterialButton)ws2.C(view, 2131296406);
                  if (materialButton7 != null) {
                    i = 2131296420;
                    MaterialButton materialButton8 = (MaterialButton)ws2.C(view, 2131296420);
                    if (materialButton8 != null) {
                      i = 2131296424;
                      MaterialButton materialButton9 = (MaterialButton)ws2.C(view, 2131296424);
                      if (materialButton9 != null) {
                        i = 2131296425;
                        MaterialButton materialButton10 = (MaterialButton)ws2.C(view, 2131296425);
                        if (materialButton10 != null) {
                          i = 2131296427;
                          MaterialButton materialButton11 = (MaterialButton)ws2.C(view, 2131296427);
                          if (materialButton11 != null) {
                            i = 2131296431;
                            MaterialButton materialButton12 = (MaterialButton)ws2.C(view, 2131296431);
                            if (materialButton12 != null) {
                              i = 2131296434;
                              MaterialButton materialButton13 = (MaterialButton)ws2.C(view, 2131296434);
                              if (materialButton13 != null) {
                                i = 2131296448;
                                MaterialButton materialButton14 = (MaterialButton)ws2.C(view, 2131296448);
                                if (materialButton14 != null) {
                                  i = 2131296449;
                                  MaterialButton materialButton15 = (MaterialButton)ws2.C(view, 2131296449);
                                  if (materialButton15 != null) {
                                    i = 2131296450;
                                    MaterialButton materialButton16 = (MaterialButton)ws2.C(view, 2131296450);
                                    if (materialButton16 != null) {
                                      i = 2131296460;
                                      if ((Barrier)ws2.C(view, 2131296460) != null) {
                                        i = 2131296493;
                                        MaterialCardView materialCardView = (MaterialCardView)ws2.C(view, 2131296493);
                                        if (materialCardView != null) {
                                          i = 2131296494;
                                          MaterialCardView materialCardView1 = (MaterialCardView)ws2.C(view, 2131296494);
                                          if (materialCardView1 != null) {
                                            i = 2131296922;
                                            if ((MaterialTextView)ws2.C(view, 2131296922) != null) {
                                              i = 2131296923;
                                              if ((MaterialTextView)ws2.C(view, 2131296923) != null) {
                                                ProtectionLayout protectionLayout = (ProtectionLayout)view;
                                                i = 2131297297;
                                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator)ws2.C(view, 2131297297);
                                                if (linearProgressIndicator != null) {
                                                  i = 2131297306;
                                                  if ((Placeholder)ws2.C(view, 2131297306) != null) {
                                                    i = 2131297307;
                                                    if ((Placeholder)ws2.C(view, 2131297307) != null) {
                                                      i = 2131297404;
                                                      RangeSlider rangeSlider = (RangeSlider)ws2.C(view, 2131297404);
                                                      if (rangeSlider != null) {
                                                        i = 2131297481;
                                                        Slider slider = (Slider)ws2.C(view, 2131297481);
                                                        if (slider != null) {
                                                          i = 2131297555;
                                                          ScrollView scrollView = (ScrollView)ws2.C(view, 2131297555);
                                                          if (scrollView != null) {
                                                            i = 2131297636;
                                                            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup)ws2.C(view, 2131297636);
                                                            if (materialButtonToggleGroup != null) {
                                                              i = 2131297638;
                                                              MaterialButtonToggleGroup materialButtonToggleGroup1 = (MaterialButtonToggleGroup)ws2.C(view, 2131297638);
                                                              if (materialButtonToggleGroup1 != null) {
                                                                i = 2131297640;
                                                                MaterialButtonToggleGroup materialButtonToggleGroup2 = (MaterialButtonToggleGroup)ws2.C(view, 2131297640);
                                                                if (materialButtonToggleGroup2 != null) {
                                                                  i = 2131297657;
                                                                  MaterialToolbar materialToolbar = (MaterialToolbar)ws2.C(view, 2131297657);
                                                                  if (materialToolbar != null) {
                                                                    i = 2131297718;
                                                                    MaterialButton materialButton17 = (MaterialButton)ws2.C(view, 2131297718);
                                                                    if (materialButton17 != null) {
                                                                      i = 2131297748;
                                                                      MaterialTextView materialTextView = (MaterialTextView)ws2.C(view, 2131297748);
                                                                      if (materialTextView != null) {
                                                                        i = 2131297755;
                                                                        MaterialTextView materialTextView1 = (MaterialTextView)ws2.C(view, 2131297755);
                                                                        if (materialTextView1 != null) {
                                                                          i = 2131297875;
                                                                          MaterialTextView materialTextView2 = (MaterialTextView)ws2.C(view, 2131297875);
                                                                          if (materialTextView2 != null) {
                                                                            i = 2131297890;
                                                                            TextView textView = (TextView)ws2.C(view, 2131297890);
                                                                            if (textView != null) {
                                                                              i = 2131297964;
                                                                              WaveformView waveformView = (WaveformView)ws2.C(view, 2131297964);
                                                                              if (waveformView != null) {
                                                                                this.R = new o2(protectionLayout, materialButton, materialButton1, materialButton2, materialButton3, materialButton4, materialButton5, materialButton6, materialButton7, materialButton8, materialButton9, materialButton10, materialButton11, materialButton12, materialButton13, materialButton14, materialButton15, materialButton16, materialCardView, materialCardView1, protectionLayout, linearProgressIndicator, rangeSlider, slider, scrollView, materialButtonToggleGroup, materialButtonToggleGroup1, materialButtonToggleGroup2, materialToolbar, materialButton17, materialTextView, materialTextView1, materialTextView2, textView, waveformView);
                                                                                setContentView((View)protectionLayout);
                                                                                o2 o21 = this.R;
                                                                                if (o21 != null) {
                                                                                  g92.c((View)o21.x, true, false);
                                                                                  i = jn.i(m92.h[2], 178);
                                                                                  o21 = this.R;
                                                                                  if (o21 != null) {
                                                                                    o21.t.setProtections(om.h0((Object[])new hn[] { new hn(2, i), new hn(8, i) }));
                                                                                    U().a(this.i0);
                                                                                    i = getIntent().getIntExtra("rowid", -1);
                                                                                    if (i == -1 || !MyApplication.k()) {
                                                                                      finish();
                                                                                      return;
                                                                                    } 
                                                                                    km0 km01 = MyApplication.j.c.a(i);
                                                                                    if (km01 != null) {
                                                                                      f01 f01;
                                                                                      this.S = km01;
                                                                                      hc hc = MusicService.E0;
                                                                                      if (hc != null) {
                                                                                        i = hc.x();
                                                                                      } else {
                                                                                        i = 0;
                                                                                      } 
                                                                                      if (i > 0) {
                                                                                        f01 = f01.b();
                                                                                        f01.getClass();
                                                                                      } else {
                                                                                        f01 = new f01();
                                                                                      } 
                                                                                      w60 w601 = new w60(MyApplication.i.getApplicationContext(), i, f01);
                                                                                      w601.G(MyApplication.i.getApplicationContext());
                                                                                      try {
                                                                                        j50.w((hc)w601);
                                                                                      } finally {
                                                                                        view = null;
                                                                                      } 
                                                                                      ((hc)w601).e = this;
                                                                                      ((hc)w601).c = this;
                                                                                      this.a0 = w601;
                                                                                      t0();
                                                                                      pp pp = new pp(8, this);
                                                                                      cn cn = new cn(ne1.a(by1.class), new tx1(0, this), pp, new tx1(1, this));
                                                                                      this.U = (by1)cn.getValue();
                                                                                      qv.L((xs)g92.E((um0)this), null, null, (ad0)new ux1(this, cn, null), 3);
                                                                                      return;
                                                                                    } 
                                                                                    finish();
                                                                                    return;
                                                                                  } 
                                                                                  ui0.n0("activityTrimBinding");
                                                                                  throw null;
                                                                                } 
                                                                                ui0.n0("activityTrimBinding");
                                                                                throw null;
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
    if (!h0()) {
      vx1 vx11 = null;
      n0 = null;
      m0 = null;
      by1 by11 = this.U;
      if (by11 != null) {
        at at;
        b40 b401;
        wl0 wl0;
        m m;
        vx1 vx12 = by11.e;
        if (vx12 != null) {
          ArrayList arrayList = vx12.p;
        } else {
          vx12 = null;
        } 
        yw yw1 = e00.a;
        fw fw = fw.e;
        cr cr = new cr(vx12, null, 3);
        b40 b402 = b40.b;
        if ((0x2 & 0x1) != 0)
          b401 = b402; 
        vx12 = vx11;
        if ((0x2 & 0x2) != 0)
          at = at.b; 
        os os2 = qz1.s((os)b402, (os)b401, true);
        yw yw2 = e00.a;
        os os1 = os2;
        if (os2 != yw2) {
          os1 = os2;
          if (os2.l((ns)vs2.c) == null)
            os1 = os2.k((os)yw2); 
        } 
        if (at == at.c) {
          wl0 = new wl0(os1, (ad0)cr);
        } else {
          m = new m((os)wl0, true);
        } 
        m.j0(at, m, (ad0)cr);
      } else {
        ui0.n0("mViewModel");
        throw null;
      } 
    } 
    if (Build.VERSION.SDK_INT >= 26) {
      if (this.d0 != null) {
        AudioManager audioManager = MyApplication.e();
        AudioFocusRequest audioFocusRequest = this.d0;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
      } 
    } else {
      MyApplication.e().abandonAudioFocus(this);
    } 
    this.f0.removeCallbacks((Runnable)this.h0);
    w60 w601 = this.a0;
    if (w601 != null)
      w601.O(); 
    super.onDestroy();
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    paramMenuItem.getClass();
    if (paramMenuItem.getItemId() == 16908332) {
      onBackPressed();
      return true;
    } 
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    paramBundle.getClass();
    super.onSaveInstanceState(paramBundle);
    by1 by11 = this.U;
    if (by11 != null) {
      n0 = (cy1)by11.d.b.f();
      by11 = this.U;
      if (by11 != null) {
        m0 = by11.e;
        return;
      } 
      ui0.n0("mViewModel");
      throw null;
    } 
    ui0.n0("mViewModel");
    throw null;
  }
  
  public final void p0() {
    by1 by11 = this.U;
    if (by11 != null) {
      cy1 cy11 = (cy1)by11.d.b.f();
      cd1 cd1 = cy11.o;
      if (cd1 != null) {
        Uri uri = cd1.j();
        if (uri != null) {
          Intent intent = new Intent((Context)this, MiniPlayerActivity.class);
          intent.setAction("pr");
          intent.putExtra("data", (Parcelable)uri);
          intent.putExtra("etl", cy11.h.b);
          intent.putExtra("ear", n0.b(cy11.o.n()));
          startActivity(intent);
        } 
      } 
      return;
    } 
    ui0.n0("mViewModel");
    throw null;
  }
  
  public final void q0() {
    w60 w601 = this.a0;
    if (w601 != null)
      try {
        w601.M();
        o2 o21 = this.R;
        if (o21 != null) {
          o21.i.setIconResource(2131231063);
          this.f0.removeCallbacks((Runnable)this.h0);
          s0();
          this.c0 = true;
          return;
        } 
        ui0.n0(XUaAMlaMSa.VbqysxVQnxrHNy);
        throw null;
      } finally {
        w601 = null;
      }  
  }
  
  public final void r0() {
    int i;
    boolean bool;
    w60 w601 = this.a0;
    if (Build.VERSION.SDK_INT >= 26) {
      if (this.d0 == null)
        this.d0 = (new AudioFocusRequest.Builder(2)).setAudioAttributes(MusicService.x()).setOnAudioFocusChangeListener(this).build(); 
      AudioFocusRequest audioFocusRequest = this.d0;
      if (audioFocusRequest != null) {
        i = MyApplication.e().requestAudioFocus(audioFocusRequest);
      } else {
        i = -1;
      } 
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
    if (i == 1 && w601 != null) {
      float f = w601.A();
      by1 by11 = this.U;
      String str = jHxlGgUTadw.lMbCnmYrdKWwj;
      if (by11 != null) {
        if (f < ((Number)((cy1)by11.d.b.f()).c.get(0)).floatValue() - 300.0F) {
          by11 = this.U;
          if (by11 != null) {
            u0((int)((Number)((cy1)by11.d.b.f()).c.get(0)).floatValue());
          } else {
            ui0.n0(str);
            throw null;
          } 
        } 
        w601.f0(0, 0);
        o2 o21 = this.R;
        if (o21 != null) {
          o21.i.setIconResource(2131231061);
          this.f0.post((Runnable)this.h0);
          this.c0 = false;
          getWindow().addFlags(128);
          f = w601.A();
          by1 by12 = this.U;
          if (by12 != null) {
            if (f >= ((Number)((cy1)by12.d.b.f()).c.get(1)).floatValue() - 300.0F)
              bool = false; 
            this.g0 = bool;
          } else {
            ui0.n0(str);
            throw null;
          } 
        } else {
          ui0.n0("activityTrimBinding");
          throw null;
        } 
      } else {
        ui0.n0(str);
        throw null;
      } 
    } 
  }
  
  public final void s(hc paramhc) {
    q0();
    t0();
  }
  
  public final void s0() {
    w60 w601 = this.a0;
    if (w601 != null && !this.e0) {
      by1 by11 = this.U;
      if (by11 != null) {
        by11.l(w601.A());
        return;
      } 
      ui0.n0("mViewModel");
      throw null;
    } 
  }
  
  public final void t0() {
    w60 w601 = this.a0;
    if (w601 != null) {
      try {
        this.f0.removeCallbacks((Runnable)this.h0);
        w601.P();
        km0 km01 = this.S;
        String str = null;
        if (km01 != null) {
          wo wo = km01.c.f;
          if (wo != null)
            str = wo.toString(); 
          w601.V(str, false);
          return;
        } 
      } finally {
        Exception exception;
      } 
      ui0.n0("mSongInfoWrapper");
      throw null;
    } 
  }
  
  public final void u0(int paramInt) {
    w60 w601 = this.a0;
    if (w601 != null && this.b0) {
      int i = w601.C();
      if (paramInt >= 0 && paramInt <= i) {
        w601.R(paramInt);
        float f = paramInt;
        by1 by11 = this.U;
        if (by11 != null) {
          List<Number> list = ((cy1)by11.d.b.f()).c;
          boolean bool = true;
          if (f >= ((Number)list.get(1)).floatValue() - 300.0F)
            bool = false; 
          this.g0 = bool;
          s0();
          return;
        } 
        ui0.n0("mViewModel");
        throw null;
      } 
    } 
  }
  
  public final boolean v(hc paramhc, int paramInt1, int paramInt2) {
    ag0.P0(0, ga1.j("error w=", paramInt1, paramInt2, " e="), true);
    finish();
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\audio_cutter\TrimActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */