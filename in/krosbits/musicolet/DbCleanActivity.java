package in.krosbits.musicolet;

import a3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import g92;
import id1;
import im0;
import in.krosbits.android.widgets.RecyclerViewScrollBar;
import java.util.ArrayList;
import java.util.HashMap;
import ki;
import km0;
import m92;
import ms0;
import mv;
import n0;
import nv;
import pc;
import pi0;
import ps0;
import q01;
import qi0;
import qn1;
import qo;
import rs0;
import ss0;
import wo;
import x41;
import yp1;
import zv0;

public class DbCleanActivity extends pc implements View.OnClickListener {
  public static DbCleanActivity l0;
  
  public ArrayList R;
  
  public boolean[] S;
  
  public int T;
  
  public TextView U;
  
  public TextView V;
  
  public TextView W;
  
  public MaterialButton X;
  
  public RecyclerView Y;
  
  public RecyclerViewScrollBar Z;
  
  public a3 a0;
  
  public ss0 b0;
  
  public Thread c0;
  
  public Button d0;
  
  public int e0;
  
  public int f0;
  
  public int g0;
  
  public im0 h0;
  
  public ki i0;
  
  public boolean j0 = false;
  
  public final qi0 k0 = new qi0((pi0)new nv(this));
  
  public final void l0() {
    byte b = 0;
    im0 im01 = new im0(true, false, false);
    this.h0 = im01;
    im01.o();
    int i = getIntent().getIntExtra("EXVISFST", 0);
    int j = getIntent().getIntExtra("EXVISFUST", 0);
    String str2 = x41.i(i, "(COL_VIS_FLAGS&", "<>0)");
    StringBuilder stringBuilder = new StringBuilder("(COL_VIS_FLAGS&");
    stringBuilder.append(j);
    stringBuilder.append("<>");
    stringBuilder.append(j);
    stringBuilder.append(ybWnIKHovcRr.vFMXxNVsJMiDiR);
    String str1 = x41.l(str2, " OR ", stringBuilder.toString());
    Cursor cursor = MyApplication.j.getReadableDatabase().query("TABLE_SONGS", new String[] { "COL_PATH", "COL_LOGPATH" }, str1, null, null, null, "COL_LOGPATH");
    ArrayList<km0> arrayList = new ArrayList(cursor.getCount());
    q01 q01 = new q01(0);
    while (cursor.moveToNext()) {
      String str5 = cursor.getString(0);
      String str3 = cursor.getString(1);
      String str4 = String.valueOf(yp1.o(str3));
      arrayList.add(new km0(0, new qn1(new wo(str5, q01), null, null, null, 0), null, null, null, 0L, 0L, 0L, 0L, 0, 0, 0, 0, 0, 0, str3, str4, null, 0));
    } 
    cursor.close();
    q01.b.clear();
    this.R = arrayList;
    this.S = new boolean[arrayList.size()];
    while (true) {
      boolean[] arrayOfBoolean = this.S;
      if (b < arrayOfBoolean.length) {
        arrayOfBoolean[b] = true;
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public final void m0() {
    try {
      if (this.j0) {
        Intent intent = new Intent();
        this((Context)this, GhostSearchActivity.class);
        startActivity(intent.setAction("A_BGU").putExtra("E_SACC", false));
        finish();
      } 
      return;
    } catch (Exception exception) {
      exception.printStackTrace();
      return;
    } 
  }
  
  public final void n0() {
    this.a0.g();
    this.Z.setRecyclerView(this.Y);
    boolean bool = false;
    this.T = 0;
    int i = 0;
    while (true) {
      boolean[] arrayOfBoolean = this.S;
      if (i < arrayOfBoolean.length) {
        if (arrayOfBoolean[i])
          this.T++; 
        i++;
        continue;
      } 
      TextView textView = this.V;
      Resources resources = getResources();
      i = this.T;
      textView.setText(resources.getQuantityString(2131755069, i, new Object[] { Integer.valueOf(i) }));
      Button button = this.d0;
      if (this.T > 0)
        bool = true; 
      button.setEnabled(bool);
      return;
    } 
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1 && paramInt2 == -1) {
      m0();
      return;
    } 
    if (GhostSearchActivity.g0 != null || im0.g0 != null) {
      m0();
      return;
    } 
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131297683) {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      for (i = 0; i < this.R.size(); i++) {
        km0 km0 = this.R.get(i);
        Boolean bool2 = (Boolean)hashMap.get(km0.i);
        Boolean bool1 = bool2;
        if (bool2 == null)
          bool1 = Boolean.TRUE; 
        hashMap.put(km0.i, Boolean.valueOf(bool1.booleanValue() & this.S[i]));
      } 
      if (hashMap.size() != 0) {
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        boolean[] arrayOfBoolean = new boolean[arrayList.size()];
        ArrayList<Integer> arrayList1 = new ArrayList(arrayList.size());
        for (i = 0; i < arrayList.size(); i++) {
          Boolean bool = (Boolean)hashMap.get(arrayList.get(i));
          if (bool != null && bool.booleanValue()) {
            arrayList1.add(Integer.valueOf(i));
            arrayOfBoolean[i] = true;
          } 
        } 
        ms0 ms0 = new ms0((Context)this);
        ms0.h(arrayList);
        Integer[] arrayOfInteger = arrayList1.<Integer>toArray(new Integer[0]);
        zv0 zv0 = new zv0(this, arrayList, arrayOfBoolean);
        ms0.N = arrayOfInteger;
        ms0.E = null;
        ms0.F = null;
        ms0.G = (ps0)zv0;
        ms0.H = true;
        ms0.l(2131886467);
        ms0.p();
        return;
      } 
    } else {
      if (i == 2131296400) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(2131886524));
        stringBuilder.append("<br/><br/>");
        stringBuilder.append(getString(2131886525));
        stringBuilder.append("<br/><br/>");
        stringBuilder.append(getString(2131887449));
        stringBuilder.append("<br/><br/>");
        stringBuilder.append(getString(2131887167));
        String str = stringBuilder.toString();
        ms0 ms0 = new ms0((Context)this);
        ms0.d((CharSequence)Html.fromHtml(str));
        ms0.n(2131886639);
        ms0.p();
        return;
      } 
      if (i == 2131296379) {
        ms0 ms0 = new ms0((Context)this);
        ms0.q(2131886202);
        ms0.c(2131887166);
        ms0.n(2131887604);
        ms0.k(2131886278);
        ms0.A = (rs0)new nv(this);
        ms0.p();
      } 
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(paramBundle);
    l0 = this;
    if (GhostSearchActivity.g0 != null || im0.g0 != null) {
      m0();
      return;
    } 
    setContentView(2131492895);
    g92.c(findViewById(2131297388), false, false);
    this.e0 = (int)(getResources().getDimension(2131165390) * 8.0F);
    this.f0 = (int)(getResources().getDimension(2131165390) * 24.0F);
    this.g0 = (int)(getResources().getDimension(2131165390) * 14.0F);
    this.U = (TextView)findViewById(2131297890);
    this.X = (MaterialButton)findViewById(2131296400);
    this.V = (TextView)findViewById(2131297912);
    this.W = (TextView)findViewById(2131297683);
    this.Y = (RecyclerView)findViewById(2131297410);
    this.Z = (RecyclerViewScrollBar)findViewById(2131297393);
    this.d0 = (Button)findViewById(2131296379);
    this.Y.setLayoutManager((a)new LinearLayoutManager(1));
    a3 a31 = new a3(3, this);
    this.a0 = a31;
    this.Y.setAdapter((id1)a31);
    this.U.setText(getIntent().getStringExtra("EXTTL"));
    TextView textView = this.W;
    StringBuilder stringBuilder = new StringBuilder("<a href=\"#\">");
    stringBuilder.append(getString(2131886130));
    stringBuilder.append("</a>");
    textView.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
    this.W.setOnClickListener(this);
    this.d0.setOnClickListener(this);
    this.X.setOnClickListener(this);
    ms0 ms0 = new ms0((Context)this);
    ms0.o(0, true);
    ms0.c(2131887105);
    ms0.J = false;
    ms0.K = false;
    this.b0 = ms0.p();
    Thread thread = new Thread((Runnable)new mv(this, 0));
    this.c0 = thread;
    thread.start();
  }
  
  public final void onDestroy() {
    try {
      if (l0 == this)
        l0 = null; 
      Thread thread = this.c0;
      if (thread != null)
        try {
          thread.stop();
        } finally {} 
      ki ki1 = this.i0;
      if (ki1 != null)
        ki1.a(false); 
    } finally {
      Exception exception;
    } 
    super.onDestroy();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\DbCleanActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */