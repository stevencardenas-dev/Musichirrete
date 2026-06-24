package in.krosbits.musicolet;

import a3;
import ag0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.insets.ProtectionLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.button.MaterialButton;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;
import g92;
import hn;
import id1;
import in.krosbits.utils.layoutmanager.LinearLayoutManager2;
import j50;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import je;
import jn;
import km0;
import l90;
import ln1;
import m92;
import ms0;
import n0;
import nk;
import pc;
import ql;
import qo;
import rc1;

public class RGReadCalcActivity extends pc implements View.OnClickListener {
  public static Set i0;
  
  public static RGReadCalcActivity j0;
  
  public TextView R;
  
  public TextView S;
  
  public TextView T;
  
  public MaterialButton U;
  
  public MaterialButton V;
  
  public RadioGroup W;
  
  public RadioGroup X;
  
  public ProgressBar Y;
  
  public Group Z;
  
  public Group a0;
  
  public CheckBox b0;
  
  public NestedScrollView c0;
  
  public HashSet d0 = null;
  
  public boolean e0;
  
  public final l90 f0 = new l90(this, 7);
  
  public boolean g0 = false;
  
  public ln1 h0;
  
  public static void n0(Activity paramActivity, HashSet paramHashSet) {
    if (!j50.u()) {
      ag0.P0(1, paramActivity.getString(2131887014, new Object[] { j50.g() }), true);
      return;
    } 
    if (paramHashSet != null && !paramHashSet.isEmpty() && ReplayGainReadCalcService.t) {
      ag0.O0(2131887105, 0);
      return;
    } 
    i0 = paramHashSet;
    paramActivity.startActivity(new Intent((Context)paramActivity, RGReadCalcActivity.class));
  }
  
  public final void l0() {
    ln1 ln12 = this.h0;
    if (ln12 != null)
      try {
        ln12.a(3);
      } finally {} 
    StringBuilder stringBuilder = new StringBuilder(FgdLmmRfTxSFKI.hCgaFSoTmjZgKi);
    stringBuilder.append(getString(2131887563));
    stringBuilder.append("</small>");
    Spanned spanned = Html.fromHtml(stringBuilder.toString());
    ln1 ln11 = ln1.g((View)this.c0, spanned, -2);
    ql ql = new ql(6, this);
    ln11.h(((je)ln11).h.getText(2131886577), (View.OnClickListener)ql);
    this.h0 = ln11;
    ln11.i();
  }
  
  public final void m0(boolean paramBoolean) {
    if (paramBoolean != this.g0) {
      this.g0 = paramBoolean;
      if (paramBoolean && Build.VERSION.SDK_INT >= 34 && !n0.r()) {
        l0();
        getWindow().addFlags(128);
        return;
      } 
      ln1 ln11 = this.h0;
      if (ln11 != null)
        try {
          ln11.a(3);
        } finally {} 
      getWindow().clearFlags(128);
    } 
  }
  
  public final void o0() {
    if (ReplayGainReadCalcService.t)
      try {
        this.Z.setVisibility(8);
        this.T.setVisibility(8);
        this.a0.setVisibility(0);
        boolean bool = ReplayGainReadCalcService.x;
        ProgressBar progressBar = this.Y;
        if (!bool) {
          progressBar.setIndeterminate(ReplayGainReadCalcService.s);
          this.Y.setMax(ReplayGainReadCalcService.v);
          this.Y.setProgress(ReplayGainReadCalcService.u);
          this.S.setText(ReplayGainReadCalcService.w);
          return;
        } 
        progressBar.setIndeterminate(true);
        this.S.setText(2131886279);
        return;
      } finally {
        Exception exception = null;
        exception.printStackTrace();
      }  
    HashSet hashSet = this.d0;
    if (hashSet == null || hashSet.isEmpty()) {
      finish();
    } else if (this.e0) {
      finish();
    } else {
      this.Z.setVisibility(0);
      boolean bool = this.b0.isChecked();
      TextView textView = this.T;
      if (bool) {
        i = 0;
      } else {
        i = 8;
      } 
      textView.setVisibility(i);
      this.a0.setVisibility(8);
      int i = this.d0.size();
      if (i > 1) {
        TextView textView1 = this.R;
        StringBuilder stringBuilder = new StringBuilder("<u>");
        stringBuilder.append(getResources().getQuantityString(2131755041, this.d0.size(), new Object[] { Integer.valueOf(i) }));
        stringBuilder.append("</u>");
        textView1.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      } else if (i == 1) {
        textView = this.R;
        StringBuilder stringBuilder = new StringBuilder("<u>");
        stringBuilder.append(((km0)this.d0.iterator().next()).g);
        stringBuilder.append("</u>");
        textView.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      } 
    } 
    m0(false);
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 10401)
      recreate(); 
  }
  
  public final void onBackPressed() {
    if (this.g0 && Build.VERSION.SDK_INT >= 34 && !n0.r()) {
      n0.o(this, (Runnable)new rc1(this, 0), getString(2131887142));
      return;
    } 
    super.onBackPressed();
  }
  
  public void onClick(View paramView) {
    HashSet hashSet;
    ms0 ms0;
    MaterialButton materialButton = this.U;
    boolean bool = false;
    if (paramView == materialButton) {
      boolean bool1;
      hashSet = this.d0;
      if (this.W.getCheckedRadioButtonId() == 2131297343) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (this.X.getCheckedRadioButtonId() == 2131297337)
        bool = true; 
      ReplayGainReadCalcService.b(hashSet, bool1, bool, this.b0.isChecked(), true);
      this.e0 = true;
      this.d0 = null;
      o0();
      return;
    } 
    if (hashSet == this.R) {
      ms0 = new ms0((Context)this);
      ms0.h(this.d0);
      ms0.a((id1)new a3(this.d0.toArray((Object[])new km0[0])), (LinearLayoutManager2)new LinearLayoutManager(1));
      ms0.n(2131887030);
      ms0.p();
      return;
    } 
    if (ms0 == this.V) {
      if (ReplayGainReadCalcService.t) {
        ReplayGainReadCalcService.x = true;
        MyApplication.i.getApplicationContext().startService((new Intent(MyApplication.i.getApplicationContext(), ReplayGainReadCalcService.class)).setAction("st0"));
      } 
      o0();
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    boolean bool;
    j0 = this;
    m92.c((Activity)this);
    n0.a((qo)this, false);
    super.onCreate(paramBundle);
    setContentView(2131492910);
    Toolbar toolbar = (Toolbar)findViewById(2131297607);
    g0(toolbar);
    Y().Z(true);
    this.c0 = (NestedScrollView)findViewById(2131297555);
    this.R = (TextView)findViewById(2131297895);
    this.U = (MaterialButton)findViewById(2131296426);
    this.X = (RadioGroup)findViewById(2131297372);
    this.W = (RadioGroup)findViewById(2131297373);
    this.V = (MaterialButton)findViewById(2131296376);
    this.Y = (ProgressBar)findViewById(2131297298);
    this.S = (TextView)findViewById(2131297836);
    this.Z = (Group)findViewById(2131296772);
    this.a0 = (Group)findViewById(2131296773);
    CheckBox checkBox = (CheckBox)findViewById(2131296561);
    this.b0 = (CheckBox)findViewById(2131296528);
    this.T = (TextView)findViewById(2131297687);
    g92.e((View)toolbar, false);
    g92.d((View)this.c0, true, false);
    ProtectionLayout protectionLayout = (ProtectionLayout)findViewById(2131296941);
    hn hn = new hn(8, jn.i(m92.h[2], 178));
    ArrayList<Object> arrayList = new ArrayList(1);
    (new Object[1])[0] = hn;
    Object object = (new Object[1])[0];
    Objects.requireNonNull(object);
    arrayList.add(object);
    protectionLayout.setProtections(Collections.unmodifiableList(arrayList));
    U().a(this.f0);
    if (MyApplication.o().getInt("k_i_rgm", 0) == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    this.b0.setChecked(bool);
    int i = MyApplication.o().getInt("k_i_crgvcns", 2);
    RadioGroup radioGroup = this.X;
    if (i == 1) {
      radioGroup.check(2131297338);
    } else {
      radioGroup.check(2131297337);
    } 
    this.U.setOnClickListener(this);
    this.V.setOnClickListener(this);
    this.R.setOnClickListener(this);
    this.b0.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new nk(1, this));
    Set set = i0;
    if (set != null && !set.isEmpty()) {
      if (!ReplayGainReadCalcService.t) {
        this.d0 = new HashSet(i0);
        i0 = null;
      } 
    } else if (!ReplayGainReadCalcService.t) {
      if (MyApplication.k()) {
        this.d0 = new HashSet(MyApplication.j.c.i(new int[0]));
      } else {
        ag0.O0(2131886550, 0);
        finish();
        return;
      } 
    } 
    o0();
  }
  
  public final void onDestroy() {
    if (this == j0)
      j0 = null; 
    HashSet hashSet = this.d0;
    if (hashSet != null) {
      hashSet.clear();
      this.d0 = null;
    } 
    if (i0 != null && !h0()) {
      i0.clear();
      i0 = null;
    } 
    super.onDestroy();
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    if (paramMenuItem.getItemId() == 16908332) {
      onBackPressed();
      return true;
    } 
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public final void onRestoreInstanceState(Bundle paramBundle) {
    super.onRestoreInstanceState(paramBundle);
    this.e0 = paramBundle.getBoolean("acof", false);
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    if (this.d0 != null && !ReplayGainReadCalcService.t)
      i0 = new HashSet(this.d0); 
    paramBundle.putBoolean("acof", this.e0);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\RGReadCalcActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */