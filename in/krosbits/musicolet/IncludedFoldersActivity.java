package in.krosbits.musicolet;

import ag0;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.material.card.MaterialCardView;
import g92;
import id1;
import im0;
import in.krosbits.android.widgets.LinkTextView;
import in.krosbits.android.widgets.SmartTextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k91;
import l90;
import m90;
import m92;
import ms0;
import n0;
import org.json.JSONArray;
import pc;
import qi0;
import qo;
import qy;
import rs0;
import ss0;
import v00;
import ws2;
import y00;
import z00;
import zb0;

public class IncludedFoldersActivity extends pc implements rs0, View.OnClickListener {
  public static ArrayList e0;
  
  public static final zb0 f0 = new zb0(1);
  
  public ArrayList R;
  
  public boolean S;
  
  public HashSet T;
  
  public boolean U;
  
  public boolean V;
  
  public RadioButton W;
  
  public RadioButton X;
  
  public ViewGroup Y;
  
  public RecyclerView Z;
  
  public TextView a0;
  
  public TextView b0;
  
  public m90 c0;
  
  public final l90 d0 = new l90(this, 2);
  
  public final void Q(ss0 paramss0, qy paramqy) {
    if (paramqy == qy.b) {
      m0();
      return;
    } 
    if (paramqy == qy.e) {
      setResult(0);
      finish();
    } 
  }
  
  public final void l0() {
    if (this.S != MyApplication.o().getBoolean("b_icdalfl", true) || (!this.S && this.V)) {
      ms0 ms0 = new ms0((Context)this);
      ms0.q(2131887268);
      ms0.l(2131886278);
      ms0.k(2131886989);
      ms0.n(2131887604);
      ms0.D = this;
      ms0.p();
      return;
    } 
    finish();
  }
  
  public final void m0() {
    ArrayList arrayList1;
    SharedPreferences.Editor editor = MyApplication.o().edit();
    if (!this.S && this.V) {
      JSONArray jSONArray = new JSONArray();
      ArrayList<Object> arrayList = this.R;
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        String str = (String)arrayList.get(b);
        b++;
        jSONArray.put(str);
      } 
      editor.putString("jsa_icdfl", jSONArray.toString());
    } 
    boolean bool1 = this.U;
    boolean bool2 = this.S;
    if (bool1 != bool2) {
      editor.putBoolean("b_icdalfl", bool2);
      arrayList1 = null;
    } else if (!bool2 && this.V) {
      arrayList1 = this.R;
      int i = arrayList1.size();
      byte b = 0;
      while (b < i) {
        String str = (String)arrayList1.get(b);
        b++;
        str = str;
        bool1 = this.T.contains(str);
        HashSet<String> hashSet = this.T;
        if (bool1) {
          hashSet.remove(str);
          continue;
        } 
        hashSet.add(str);
      } 
      ArrayList<Object> arrayList = new ArrayList(this.T.size());
      Iterator<String> iterator = this.T.iterator();
      while (true) {
        arrayList1 = arrayList;
        if (iterator.hasNext()) {
          String str = iterator.next();
          v00 v00 = MyApplication.F.d(str);
          if (v00 != null)
            arrayList.add(v00); 
          continue;
        } 
        break;
      } 
    } else {
      arrayList1 = new ArrayList(0);
    } 
    ArrayList arrayList2 = arrayList1;
    if (arrayList1 == null)
      arrayList2 = new ArrayList(MyApplication.F.j()); 
    if (!arrayList2.isEmpty()) {
      if (MyApplication.j.c != null) {
        im0 im0 = new im0(false, false, false);
        im0.d = getString(2131886199);
        im0.K = true;
        GhostSearchActivity.g0 = im0;
      } 
      editor.apply();
      setResult(-1);
    } 
    finish();
  }
  
  public final void n0() {
    this.W.setChecked(false);
    this.X.setChecked(false);
    if (this.S) {
      this.W.setChecked(true);
      this.Y.setVisibility(4);
    } else {
      this.X.setChecked(true);
      this.Y.setVisibility(0);
    } 
    this.c0.g();
  }
  
  public final void onBackPressed() {
    l0();
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131297323) {
      if (!this.S) {
        this.S = true;
        n0();
        return;
      } 
    } else if (i == 2131297354) {
      if (this.S) {
        this.S = false;
        n0();
        return;
      } 
    } else {
      if (i == 2131296368) {
        (new z00((Context)this, getString(2131887321), true, false, false, null, getString(2131886119), getString(2131886278), null, (y00)f0)).e();
        return;
      } 
      if (i == 2131297858) {
        ms0 ms0 = new ms0((Context)this);
        ms0.c(2131887548);
        ms0.c = (MovementMethod)new qi0();
        ms0.n(2131886639);
        ms0.p();
      } 
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    ArrayList<?> arrayList;
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(paramBundle);
    View view = LayoutInflater.from((Context)this).inflate(2131492900, null, false);
    int i = 2131296368;
    if ((SmartTextView)ws2.C(view, 2131296368) != null)
      if ((RadioButton)ws2.C(view, 2131297323) != null) {
        if ((RadioButton)ws2.C(view, 2131297354) != null) {
          if ((RecyclerView)ws2.C(view, 2131297415) != null) {
            i = 2131297607;
            Toolbar toolbar = (Toolbar)ws2.C(view, 2131297607);
            if (toolbar != null) {
              i = 2131297858;
              if ((LinkTextView)ws2.C(view, 2131297858) != null) {
                if ((MaterialCardView)ws2.C(view, 2131297946) != null) {
                  LinearLayout linearLayout = (LinearLayout)view;
                  setContentView((View)linearLayout);
                  g92.d((View)linearLayout, false, false);
                  g92.f((View)toolbar);
                  U().a(this.d0);
                  g0(toolbar);
                  this.W = (RadioButton)findViewById(2131297323);
                  this.X = (RadioButton)findViewById(2131297354);
                  ViewGroup viewGroup = (ViewGroup)findViewById(2131297946);
                  this.Y = viewGroup;
                  this.Z = (RecyclerView)viewGroup.findViewById(2131297415);
                  this.a0 = (TextView)this.Y.findViewById(2131296368);
                  this.b0 = (TextView)findViewById(2131297858);
                  ArrayList<?> arrayList1 = ag0.A();
                  this.T = new HashSet(arrayList1);
                  boolean bool = MyApplication.o().getBoolean("b_icdalfl", true);
                  this.U = bool;
                  if (paramBundle == null) {
                    this.R = arrayList1;
                    this.S = bool;
                  } else {
                    arrayList = e0;
                    if (arrayList != null)
                      arrayList1 = arrayList; 
                    this.R = arrayList1;
                    this.S = paramBundle.getBoolean("b_icdalfl", true);
                    this.V = paramBundle.getBoolean("c", false);
                  } 
                  e0 = null;
                  m90 m901 = new m90(this, this);
                  this.c0 = m901;
                  this.Z.setAdapter((id1)m901);
                  this.Z.setLayoutManager((a)new LinearLayoutManager(1));
                  n0();
                  this.a0.setOnClickListener(this);
                  this.X.setOnClickListener(this);
                  this.W.setOnClickListener(this);
                  this.b0.setOnClickListener(this);
                  Y().f0(2131886605);
                  Y().Z(true);
                  return;
                } 
                i = 2131297946;
              } 
            } 
          } else {
            i = 2131297415;
          } 
        } else {
          i = 2131297354;
        } 
      } else {
        i = 2131297323;
      }  
    k91.h("Missing required view with ID: ".concat(arrayList.getResources().getResourceName(i)));
  }
  
  public final boolean onCreateOptionsMenu(Menu paramMenu) {
    getMenuInflater().inflate(2131623945, paramMenu);
    ag0.B0(paramMenu, null, m92.h[3]);
    return super.onCreateOptionsMenu(paramMenu);
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
    paramBundle.putBoolean("b_icdalfl", this.S);
    paramBundle.putBoolean("c", this.V);
    e0 = this.R;
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\IncludedFoldersActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */