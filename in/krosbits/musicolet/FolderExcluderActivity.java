package in.krosbits.musicolet;

import ag0;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import df0;
import f;
import g92;
import id1;
import im0;
import in.krosbits.android.widgets.SmartTextView;
import ip2;
import java.util.ArrayList;
import java.util.HashSet;
import jm0;
import k91;
import l90;
import m90;
import m92;
import ml0;
import ms0;
import n0;
import org.json.JSONArray;
import pc;
import qo;
import rs0;
import ui0;
import v00;
import vn;
import ws2;
import y00;
import z00;

public class FolderExcluderActivity extends pc implements View.OnClickListener {
  public static ArrayList X = new ArrayList();
  
  public static FolderExcluderActivity Y;
  
  public static final ip2 Z = (ip2)new Object();
  
  public RecyclerView R;
  
  public ArrayList S = new ArrayList();
  
  public HashSet T;
  
  public SharedPreferences U;
  
  public boolean V;
  
  public final l90 W = new l90(this, 0);
  
  public final void l0() {
    if (this.V) {
      ms0 ms0 = new ms0((Context)Y);
      ms0.q(2131887268);
      ms0.l(2131886278);
      ms0.k(2131886989);
      ms0.n(2131887604);
      ms0.D = (rs0)new f(13, this);
      ms0.p();
      return;
    } 
    finish();
  }
  
  public final void m0() {
    if (this.V) {
      JSONArray jSONArray = new JSONArray(this.S);
      this.U.edit().putString("S_PTH_SCN_J", jSONArray.toString()).apply();
      ag0.O0(2131886531, 0);
      setResult(-1);
      ArrayList<Object> arrayList = this.S;
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        String str = (String)arrayList.get(i);
        int k = i + 1;
        str = str;
        i = k;
        if (!this.T.remove(str)) {
          this.T.add(str);
          i = k;
        } 
      } 
      if (this.T.size() > 0 && MyApplication.k() && MyApplication.j.c != null) {
        arrayList = new ArrayList<Object>(this.T.size());
        for (String str : this.T) {
          v00 v00 = MyApplication.F.d(str);
          if (v00 != null)
            arrayList.add(v00); 
        } 
        im0 im0 = new im0(false, false, false);
        im0.K = true;
        im0.d = getString(2131886199);
        GhostSearchActivity.g0 = im0;
      } 
      finish();
      return;
    } 
    finish();
  }
  
  public final void onBackPressed() {
    l0();
  }
  
  public void onClick(View paramView) {
    if (paramView.getId() == 2131296368) {
      if (MyApplication.k()) {
        ArrayList arrayList = new ArrayList();
        jm0 jm0 = MyApplication.j.c.t;
        if (jm0 != null)
          arrayList.addAll((new df0(jm0)).D(null)); 
      } else {
        paramView = null;
      } 
      (new z00((Context)this, getString(2131887321), true, false, false, null, getString(2131886529), getString(2131886278), (ArrayList)paramView, (y00)Z)).e();
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    LinearLayout linearLayout;
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(paramBundle);
    Y = this;
    this.U = getSharedPreferences("PP", 0);
    View view = LayoutInflater.from((Context)this).inflate(2131492955, null, false);
    int i = 2131296368;
    if ((SmartTextView)ws2.C(view, 2131296368) != null)
      if ((RecyclerView)ws2.C(view, 2131297412) != null) {
        i = 2131297607;
        Toolbar toolbar = (Toolbar)ws2.C(view, 2131297607);
        if (toolbar != null) {
          i = 2131297714;
          if ((TextView)ws2.C(view, 2131297714) != null) {
            i = 2131297931;
            if (ws2.C(view, 2131297931) != null) {
              linearLayout = (LinearLayout)view;
              setContentView((View)linearLayout);
              g0(toolbar);
              g92.d((View)linearLayout, false, false);
              g92.f((View)toolbar);
              U().a(this.W);
              ui0 ui0 = Y();
              ui0.g0(getString(2131886523));
              ui0.b0(true);
              ui0.Z(true);
              ArrayList<?> arrayList = ag0.z();
              this.T = new HashSet(arrayList);
              if (paramBundle == null) {
                this.S = arrayList;
              } else {
                this.S = X;
                this.V = paramBundle.getBoolean("c", false);
              } 
              X = null;
              RecyclerView recyclerView = (RecyclerView)findViewById(2131297412);
              this.R = recyclerView;
              recyclerView.setAdapter((id1)new m90(this, this));
              this.R.setLayoutManager((a)new LinearLayoutManager(1));
              findViewById(2131296368).setOnClickListener(this);
              String str = getIntent().getStringExtra("EXT_N_FLD");
              if (str != null) {
                ms0 ms0 = new ms0((Context)this);
                ms0.f = ml0.a((MyApplication.F.c(str)).b);
                ms0.c(2131886590);
                ms0.n(2131887604);
                ms0.k(2131886989);
                ms0.D = (rs0)new vn(1, this, str);
                ms0.p();
              } 
              return;
            } 
          } 
        } 
      } else {
        i = 2131297412;
      }  
    k91.h("Missing required view with ID: ".concat(linearLayout.getResources().getResourceName(i)));
  }
  
  public final boolean onCreateOptionsMenu(Menu paramMenu) {
    getMenuInflater().inflate(2131623945, paramMenu);
    ag0.B0(paramMenu, null, m92.h[3]);
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  public final void onDestroy() {
    super.onDestroy();
    this.R = null;
    this.S = null;
    this.U = null;
    Y = null;
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    int i = paramMenuItem.getItemId();
    if (i == 16908332) {
      l0();
    } else if (i == 2131297132) {
      m0();
    } 
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    paramBundle.putBoolean("c", this.V);
    X = this.S;
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\FolderExcluderActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */