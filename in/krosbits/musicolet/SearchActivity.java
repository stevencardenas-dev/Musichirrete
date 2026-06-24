package in.krosbits.musicolet;

import a51;
import ag;
import ag0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import bj0;
import c81;
import f;
import fq1;
import g92;
import i61;
import id1;
import in.krosbits.android.widgets.RecyclerViewScrollBar;
import in.krosbits.audio_cutter.TrimActivity;
import j61;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import jy0;
import k90;
import km0;
import kn1;
import l90;
import lm0;
import ly0;
import m92;
import mj1;
import ms0;
import my0;
import n0;
import nj1;
import oj1;
import org.json.JSONArray;
import org.json.JSONException;
import os0;
import p71;
import pc;
import pd1;
import pj1;
import q3;
import qo;
import qy0;
import rn1;
import ss0;
import tk;
import ws2;
import xt0;
import z51;
import zm;
import zy;

public class SearchActivity extends pc implements TextWatcher, bj0, View.OnClickListener, qy0, os0, View.OnLongClickListener {
  public static SearchActivity Q0;
  
  public final ArrayList A0 = new ArrayList();
  
  public final ArrayList B0 = new ArrayList();
  
  public final ArrayList C0 = new ArrayList();
  
  public final ArrayList D0 = new ArrayList();
  
  public final ArrayList E0 = new ArrayList();
  
  public final ArrayList F0 = new ArrayList();
  
  public final ArrayList G0 = new ArrayList();
  
  public ss0 H0;
  
  public ss0 I0;
  
  public ss0 J0;
  
  public ss0 K0;
  
  public ss0 L0;
  
  public ss0 M0;
  
  public ss0 N0;
  
  public final l90 O0 = new l90(this, 8);
  
  public j61 P0;
  
  public EditText R;
  
  public ListView S;
  
  public zm T;
  
  public SharedPreferences U;
  
  public ArrayList V;
  
  public LayoutInflater W;
  
  public Button X;
  
  public Handler Y;
  
  public String Z;
  
  public final xt0 a0 = new xt0(12, this);
  
  public RecyclerView b0;
  
  public rn1 c0;
  
  public ViewGroup d0;
  
  public TextView e0;
  
  public ProgressBar f0;
  
  public boolean g0 = false;
  
  public RecyclerViewScrollBar h0;
  
  public ss0 i0;
  
  public km0 j0;
  
  public ImageView k0;
  
  public ly0 l0;
  
  public TextView m0;
  
  public TextView n0;
  
  public TextView o0;
  
  public TextView p0;
  
  public TextView q0;
  
  public TextView r0;
  
  public TextView s0;
  
  public ArrayList t0;
  
  public ArrayList u0;
  
  public ArrayList v0;
  
  public ArrayList w0;
  
  public ArrayList x0;
  
  public ArrayList y0;
  
  public ArrayList z0;
  
  public static void l0() {
    SearchActivity searchActivity = Q0;
    if (searchActivity != null)
      searchActivity.finish(); 
  }
  
  public final void A() {
    my0.g(this.c0.d);
  }
  
  public final void G(ss0 paramss0, int paramInt, CharSequence paramCharSequence) {
    if (paramss0 == this.H0) {
      finish();
      MusicActivity.G0(((q3)this.A0.get(paramInt)).r, 0);
    } else if (paramss0 == this.I0) {
      finish();
      MusicActivity.H0(0, 0, ((q3)this.B0.get(paramInt)).r);
    } else if (paramss0 == this.J0) {
      finish();
      MusicActivity.H0(0, 1, ((q3)this.C0.get(paramInt)).r);
    } else if (paramss0 == this.K0) {
      finish();
      MusicActivity.H0(0, 2, ((q3)this.D0.get(paramInt)).r);
    } else if (paramss0 == this.L0) {
      finish();
      MusicActivity.J0(((q3)this.E0.get(paramInt)).r, 0);
    } else if (paramss0 == this.M0) {
      finish();
      MusicActivity.I0(((k90)this.F0.get(paramInt)).c, 0);
    } else if (paramss0 == this.N0) {
      finish();
      String str = ((fq1)this.G0.get(paramInt)).b;
      Intent intent = (new Intent(MyApplication.i.getApplicationContext(), MusicActivity.class)).setAction("actshjp_UP_").putExtra("extshjp_", str).addFlags(268435456);
      MyApplication.i.getApplicationContext().startActivity(intent);
    } 
    this.M0 = null;
    this.L0 = null;
    this.I0 = null;
    this.H0 = null;
  }
  
  public final void J(km0 paramkm0) {
    ss0 ss02 = this.i0;
    if (ss02 != null)
      ss02.dismiss(); 
    n0();
    this.j0 = paramkm0;
    View view = LayoutInflater.from((Context)this).inflate(2131493015, null);
    TextView textView = (TextView)view.findViewById(2131297873);
    ImageView imageView = (ImageView)view.findViewById(2131296860);
    textView.setText(ag0.W(this.j0));
    if (c81.c(getApplicationContext()).c(this.j0))
      imageView.setImageResource(2131231058); 
    imageView.setOnClickListener((View.OnClickListener)new ag(9, this, imageView));
    LinearLayout linearLayout = (LinearLayout)view.findViewById(2131296973);
    if (!ws2.U())
      linearLayout.findViewById(2131297008).setVisibility(8); 
    ag0.x0((ViewGroup)linearLayout, this, a51.m);
    ms0 ms0 = new ms0((Context)this);
    ms0.f(view, false);
    ss0 ss01 = new ss0(ms0);
    this.i0 = ss01;
    ss01.show();
  }
  
  public final void afterTextChanged(Editable paramEditable) {
    if (paramEditable.toString() != null && paramEditable.toString().length() > 0) {
      o0();
      this.k0.setVisibility(0);
      return;
    } 
    m0();
    this.k0.setVisibility(8);
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void clear(View paramView) {
    this.R.setText("");
  }
  
  public void clearHistory(View paramView) {
    this.V = new ArrayList();
    this.T.notifyDataSetChanged();
    n0();
    m0();
  }
  
  public final void d(int paramInt) {
    n0();
    p0(paramInt);
    finish();
    startActivity((new Intent((Context)this, MusicActivity.class)).putExtra("jump_key", "jump_player").putExtra("smooth", false));
  }
  
  public void goBack(View paramView) {
    ly0 ly01 = this.l0;
    if (ly01 != null && ly01.d()) {
      this.l0.h();
      return;
    } 
    if (this.g0) {
      clear(null);
      return;
    } 
    finish();
  }
  
  public final void m0() {
    this.Y.removeCallbacks((Runnable)this.a0);
    this.Z = null;
    this.S.setVisibility(0);
    this.d0.setVisibility(8);
    this.b0.setVisibility(8);
    this.h0.setVisibility(8);
    int i = this.T.getCount();
    Button button = this.X;
    if (i == 0) {
      button.setVisibility(8);
    } else {
      button.setVisibility(0);
    } 
    this.g0 = false;
    ly0 ly01 = this.l0;
    if (ly01 != null)
      ly01.j(); 
  }
  
  public final void n0() {
    this.Y.removeCallbacks((Runnable)this.a0);
    if (!TextUtils.isEmpty(this.Z)) {
      this.V.remove(this.Z);
      this.V.add(this.Z);
    } 
    this.T.notifyDataSetChanged();
    JSONArray jSONArray = new JSONArray(this.V);
    String str1 = this.U.getString("SQH", "[]");
    String str2 = jSONArray.toString();
    if (!str1.equals(str2))
      this.U.edit().putString("SQH", str2).apply(); 
  }
  
  public final void o0() {
    Handler handler = this.Y;
    xt0 xt01 = this.a0;
    handler.removeCallbacks((Runnable)xt01);
    this.f0.setVisibility(0);
    String str = this.R.getText().toString().trim();
    this.Z = str;
    if (str != null && str.length() > 0) {
      this.Y.postDelayed((Runnable)xt01, 5000L);
      pj1 pj1 = new pj1(this);
    } else {
      m0();
      xt01 = null;
    } 
    try {
      j61 j611 = this.P0;
      if (j611 != null && j611.c) {
        i61 i61 = j611.b;
        if (i61 != null)
          i61.b = true; 
        return;
      } 
      j611 = new j61();
      this((i61)xt01);
      this.P0 = j611;
      ExecutorService executorService = j61.d;
      return;
    } finally {
      xt01 = null;
      xt01.printStackTrace();
    } 
  }
  
  public final void onBackPressed() {
    goBack(null);
  }
  
  public void onClick(View paramView) {
    ss0 ss01 = this.i0;
    if (ss01 != null)
      ss01.dismiss(); 
    n0();
    int m = paramView.getId();
    if (m == 2131296992) {
      my0.i((Context)this);
      return;
    } 
    int i = 0;
    byte b3 = 0;
    byte b2 = 0;
    byte b1 = 0;
    int j = 0;
    boolean bool = false;
    int k = 0;
    if (m == 2131296958) {
      ag0.F0((Context)this, this.c0.d, null, true, null, false, (DialogInterface.OnDismissListener)new oj1(this, 0));
      return;
    } 
    if (m == 2131296998) {
      p0(0);
      finish();
      startActivity((new Intent((Context)this, MusicActivity.class)).putExtra("jump_key", "jump_player"));
      return;
    } 
    if (m == 2131296999) {
      MusicService musicService = MusicService.P0;
      if (musicService != null) {
        musicService.f(this.j0);
        this.j0 = null;
        return;
      } 
    } else if (m == 2131297000) {
      MusicService musicService = MusicService.P0;
      if (musicService != null) {
        rn1 rn11 = this.c0;
        if (rn11 != null) {
          ArrayList arrayList = rn11.d;
          if (arrayList != null) {
            musicService.g(arrayList);
            return;
          } 
        } 
      } 
    } else if (m == 2131296955) {
      if (MusicService.P0 != null && this.j0 != null) {
        ArrayList<km0> arrayList = new ArrayList(1);
        arrayList.add(this.j0);
        MusicService.P0.j((MyApplication.h()).c, arrayList);
        arrayList.clear();
        this.j0 = null;
        return;
      } 
    } else if (m == 2131296956) {
      if (MusicService.P0 != null) {
        rn1 rn11 = this.c0;
        if (rn11 != null) {
          ArrayList arrayList = rn11.d;
          if (arrayList != null && arrayList.size() > 0) {
            MusicService musicService = MusicService.P0;
            ArrayList arrayList1 = this.c0.d;
            musicService.j((MyApplication.h()).c, arrayList1);
            return;
          } 
        } 
      } 
    } else if (m == 2131296953) {
      if (MusicService.P0 != null && this.j0 != null) {
        ArrayList<km0> arrayList = new ArrayList(1);
        arrayList.add(this.j0);
        ((ss0)(new tk((Context)this, (MyApplication.h()).b, (MyApplication.h()).c, (zy)new jy0(1, arrayList))).f).show();
        this.j0 = null;
        return;
      } 
    } else if (m == 2131296954) {
      if (MusicService.P0 != null) {
        rn1 rn11 = this.c0;
        if (rn11 != null) {
          ArrayList arrayList = rn11.d;
          if (arrayList != null && arrayList.size() > 0) {
            ((ss0)(new tk((Context)this, (MyApplication.h()).b, (MyApplication.h()).c, (zy)new f(28, this))).f).show();
            return;
          } 
        } 
      } 
    } else {
      if (m == 2131296983) {
        ArrayList<km0> arrayList = new ArrayList(1);
        arrayList.add(this.j0);
        Tag2Activity.L1 = arrayList;
        startActivity(new Intent((Context)this, Tag2Activity.class));
        return;
      } 
      if (m == 2131297823) {
        (new p71((Context)this, Collections.singletonList(this.j0))).p();
        return;
      } 
      if (m == 2131297008) {
        RGReadCalcActivity.n0((Activity)this, new HashSet(Collections.singletonList(this.j0)));
        return;
      } 
      if (m == 2131296978) {
        if (this.j0 != null) {
          ArrayList<km0> arrayList = new ArrayList(1);
          arrayList.add(this.j0);
          Calendar calendar = lm0.M;
          ag0.j((Context)this, arrayList.<km0>toArray(new km0[0]), true);
          return;
        } 
      } else if (m == 2131296991) {
        if (this.j0 != null) {
          ArrayList<km0> arrayList = new ArrayList(1);
          arrayList.add(this.j0);
          Calendar calendar = lm0.M;
          ag0.h0((Context)this, arrayList.<km0>toArray(new km0[0]), true);
          return;
        } 
      } else if (m == 2131296975) {
        if (this.j0 != null) {
          ArrayList<km0> arrayList = new ArrayList(1);
          arrayList.add(this.j0);
          Calendar calendar = lm0.M;
          ag0.h((Context)this, arrayList.<km0>toArray(new km0[0]));
          return;
        } 
      } else {
        if (m == 2131296951) {
          ArrayList<km0> arrayList = new ArrayList(1);
          arrayList.add(this.j0);
          GhostSearchActivity.f0 = arrayList;
          startActivity((new Intent((Context)this, GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_TL", this.Z));
          return;
        } 
        if (m == 2131296952) {
          GhostSearchActivity.f0 = this.c0.d;
          startActivity((new Intent((Context)this, GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_TL", this.Z));
          return;
        } 
        if (m == 2131297033) {
          MusicActivity.F0((Context)this, this.j0, new int[0]);
          this.j0 = null;
          return;
        } 
        if (m == 2131297025) {
          if (this.j0 != null) {
            ArrayList<km0> arrayList = new ArrayList(1);
            arrayList.add(this.j0);
            MusicActivity.D0(arrayList);
            return;
          } 
        } else {
          if (m == 2131297026) {
            MusicActivity.D0(this.c0.d);
            return;
          } 
          if (m == 2131297023) {
            TrimActivity.v0((Activity)this, this.j0);
            return;
          } 
          if (m == 2131296964) {
            TrimActivity.w0((Activity)this, this.j0);
            return;
          } 
          if (m == 2131297804) {
            ArrayList arrayList = this.A0;
            try {
              ArrayList<String> arrayList1 = new ArrayList();
              this(arrayList.size());
              j = arrayList.size();
              for (i = k; i < j; i++)
                arrayList1.add(((q3)arrayList.get(i)).c); 
              ms0 ms0 = new ms0();
              this((Context)this);
              ms0.f = getResources().getQuantityString(2131755039, j, new Object[] { Integer.valueOf(j) });
              ms0.h(arrayList1);
              ms0.j(this);
            } finally {
              paramView = null;
            } 
          } else if (m == 2131297805) {
            ArrayList arrayList = this.B0;
            try {
              ArrayList<String> arrayList1 = new ArrayList();
              this(arrayList.size());
              j = arrayList.size();
              while (i < j) {
                arrayList1.add(((q3)arrayList.get(i)).c);
                i++;
              } 
              ms0 ms0 = new ms0();
              this((Context)this);
              ms0.f = getResources().getQuantityString(2131755040, j, new Object[] { Integer.valueOf(j) });
              ms0.h(arrayList1);
              ms0.j(this);
            } finally {
              paramView = null;
            } 
          } else if (m == 2131297803) {
            ArrayList arrayList = this.C0;
            try {
              ArrayList<String> arrayList1 = new ArrayList();
              this(arrayList.size());
              j = arrayList.size();
              for (i = b3; i < j; i++)
                arrayList1.add(((q3)arrayList.get(i)).c); 
              ms0 ms0 = new ms0();
              this((Context)this);
              ms0.f = getResources().getQuantityString(2131755038, j, new Object[] { Integer.valueOf(j) });
              ms0.h(arrayList1);
              ms0.j(this);
            } finally {
              paramView = null;
            } 
          } else if (m == 2131297806) {
            ArrayList arrayList = this.D0;
            try {
              ArrayList<String> arrayList1 = new ArrayList();
              this(arrayList.size());
              j = arrayList.size();
              for (i = b2; i < j; i++)
                arrayList1.add(((q3)arrayList.get(i)).c); 
              ms0 ms0 = new ms0();
              this((Context)this);
              ms0.f = getResources().getQuantityString(2131755042, j, new Object[] { Integer.valueOf(j) });
              ms0.h(arrayList1);
              ms0.j(this);
            } finally {
              paramView = null;
            } 
          } else if (m == 2131297808) {
            ArrayList arrayList = this.E0;
            try {
              ArrayList<String> arrayList1 = new ArrayList();
              this(arrayList.size());
              j = arrayList.size();
              for (i = b1; i < j; i++)
                arrayList1.add(((q3)arrayList.get(i)).c); 
              ms0 ms0 = new ms0();
              this((Context)this);
              ms0.f = getResources().getQuantityString(2131755049, j, new Object[] { Integer.valueOf(j) });
              ms0.h(arrayList1);
              ms0.j(this);
            } finally {
              paramView = null;
            } 
          } else if (m == 2131297807) {
            ArrayList<k90> arrayList = this.F0;
            try {
              ArrayList<String> arrayList1 = new ArrayList();
              this(arrayList.size());
              k = arrayList.size();
              for (i = j; i < k; i++)
                arrayList1.add(((k90)arrayList.get(i)).getName()); 
              ms0 ms0 = new ms0();
              this((Context)this);
              ms0.f = getResources().getQuantityString(2131755048, k, new Object[] { Integer.valueOf(k) });
              ms0.h(arrayList1);
              ms0.j(this);
            } finally {
              paramView = null;
            } 
          } else if (m == 2131297809) {
            ArrayList arrayList = this.G0;
            try {
              ArrayList<String> arrayList1 = new ArrayList();
              this(arrayList.size());
              j = arrayList.size();
              for (i = bool; i < j; i++)
                arrayList1.add(((fq1)arrayList.get(i)).b); 
              ms0 ms0 = new ms0();
              this((Context)this);
              ms0.f = getResources().getQuantityString(2131755056, j, new Object[] { Integer.valueOf(j) });
              ms0.h(arrayList1);
              ms0.j(this);
            } finally {
              paramView = null;
            } 
          } else if (m == 2131297001) {
            Uri uri = this.j0.c.a();
            startActivity((new Intent((Context)this, MiniPlayerActivity.class)).setAction("pr").putExtra("data", (Parcelable)uri));
          } 
        } 
      } 
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    if (MyApplication.w != 4) {
      finish();
      return;
    } 
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(paramBundle);
    setContentView(2131492912);
    g92.d(findViewById(2131297382), false, true);
    g92.f(findViewById(2131297039));
    U().a(this.O0);
    this.Y = new Handler(getMainLooper());
    EditText editText = (EditText)findViewById(2131296707);
    this.R = editText;
    editText.addTextChangedListener(this);
    this.R.setOnEditorActionListener((TextView.OnEditorActionListener)new mj1(0, this));
    this.S = (ListView)findViewById(2131297048);
    this.X = (Button)findViewById(2131296380);
    this.b0 = (RecyclerView)findViewById(2131297423);
    this.h0 = (RecyclerViewScrollBar)findViewById(2131297402);
    this.k0 = (ImageView)findViewById(2131296843);
    this.d0 = (ViewGroup)findViewById(2131297949);
    this.f0 = (ProgressBar)findViewById(2131297315);
    ImageView imageView = (ImageView)findViewById(2131296906);
    this.e0 = (TextView)this.d0.findViewById(2131297810);
    this.m0 = (TextView)this.d0.findViewById(2131297804);
    this.n0 = (TextView)this.d0.findViewById(2131297805);
    this.o0 = (TextView)this.d0.findViewById(2131297803);
    this.p0 = (TextView)this.d0.findViewById(2131297806);
    this.q0 = (TextView)this.d0.findViewById(2131297808);
    this.r0 = (TextView)this.d0.findViewById(2131297807);
    this.s0 = (TextView)this.d0.findViewById(2131297809);
    this.U = getSharedPreferences("SSP", 0);
    try {
      JSONArray jSONArray = new JSONArray();
      this(this.U.getString("SQH", "[]"));
      ArrayList arrayList = new ArrayList();
      this(jSONArray.length());
      this.V = arrayList;
      for (byte b = 0; b < jSONArray.length(); b++)
        this.V.add(jSONArray.getString(b)); 
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
    } 
    this.W = LayoutInflater.from((Context)this);
    zm zm1 = new zm(2, this);
    this.T = zm1;
    this.S.setAdapter((ListAdapter)zm1);
    this.S.setOnItemClickListener((AdapterView.OnItemClickListener)new nj1(this));
    this.m0.setOnClickListener(this);
    this.n0.setOnClickListener(this);
    this.o0.setOnClickListener(this);
    this.p0.setOnClickListener(this);
    this.q0.setOnClickListener(this);
    this.r0.setOnClickListener(this);
    this.s0.setOnClickListener(this);
    imageView.setOnLongClickListener(this);
    this.b0.setLayoutManager((a)new LinearLayoutManager(1));
    rn1 rn11 = new rn1((Context)this, new ArrayList(0), 0, this);
    this.c0 = rn11;
    this.b0.setAdapter((id1)rn11);
    Q0 = this;
    ly0 ly01 = new ly0(this);
    this.l0 = ly01;
    if (my0.b == null)
      my0.b = new ArrayList(); 
    while (my0.b.remove(ly01));
    my0.b.add(ly01);
    kn1 kn1 = new kn1(getResources(), null);
    this.b0.h((pd1)kn1);
    m0();
    this.k0.setVisibility(8);
    this.x0 = null;
    this.w0 = null;
    this.u0 = null;
    this.v0 = null;
    this.t0 = null;
    this.y0 = null;
    this.z0 = null;
    q0();
  }
  
  public final void onDestroy() {
    Q0 = null;
    this.Y.removeCallbacksAndMessages(null);
    ly0 ly01 = this.l0;
    if (my0.b != null) {
      while (my0.b.remove(ly01));
      if (my0.b.isEmpty())
        my0.b = null; 
    } 
    this.l0.b();
    this.l0 = null;
    super.onDestroy();
  }
  
  public final boolean onLongClick(View paramView) {
    if (paramView.getId() == 2131296906)
      ag0.F0((Context)this, this.c0.d, null, true, null, false, (DialogInterface.OnDismissListener)new oj1(this, 1)); 
    return true;
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void p() {
    my0.h(this.c0.d);
  }
  
  public final void p0(int paramInt) {
    MusicService musicService = MusicService.P0;
    if (musicService != null) {
      ArrayList arrayList = this.c0.d;
      StringBuilder stringBuilder = new StringBuilder("Search: ");
      stringBuilder.append(this.Z);
      musicService.k(arrayList, paramInt, stringBuilder.toString(), true);
    } 
  }
  
  public final void q0() {
    ArrayList arrayList3 = this.A0;
    int i = arrayList3.size();
    TextView textView2 = this.m0;
    if (i > 0) {
      StringBuilder stringBuilder = new StringBuilder("<u>");
      stringBuilder.append(getResources().getQuantityString(2131755039, arrayList3.size(), new Object[] { Integer.valueOf(arrayList3.size()) }));
      stringBuilder.append("</u>");
      textView2.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      this.m0.setVisibility(0);
    } else {
      textView2.setVisibility(8);
    } 
    ArrayList arrayList1 = this.B0;
    i = arrayList1.size();
    TextView textView4 = this.n0;
    if (i > 0) {
      StringBuilder stringBuilder = new StringBuilder("<u>");
      stringBuilder.append(getResources().getQuantityString(2131755040, arrayList1.size(), new Object[] { Integer.valueOf(arrayList1.size()) }));
      stringBuilder.append("</u>");
      textView4.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      this.n0.setVisibility(0);
    } else {
      textView4.setVisibility(8);
    } 
    arrayList3 = this.C0;
    i = arrayList3.size();
    textView4 = this.o0;
    if (i > 0) {
      StringBuilder stringBuilder = new StringBuilder("<u>");
      stringBuilder.append(getResources().getQuantityString(2131755038, arrayList3.size(), new Object[] { Integer.valueOf(arrayList3.size()) }));
      stringBuilder.append("</u>");
      textView4.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      this.o0.setVisibility(0);
    } else {
      textView4.setVisibility(8);
    } 
    arrayList1 = this.D0;
    i = arrayList1.size();
    TextView textView3 = this.p0;
    if (i > 0) {
      StringBuilder stringBuilder = new StringBuilder("<u>");
      stringBuilder.append(getResources().getQuantityString(2131755042, arrayList1.size(), new Object[] { Integer.valueOf(arrayList1.size()) }));
      stringBuilder.append("</u>");
      textView3.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      this.p0.setVisibility(0);
    } else {
      textView3.setVisibility(8);
    } 
    ArrayList arrayList4 = this.F0;
    i = arrayList4.size();
    TextView textView1 = this.r0;
    if (i > 0) {
      StringBuilder stringBuilder = new StringBuilder("<u>");
      stringBuilder.append(getResources().getQuantityString(2131755048, arrayList4.size(), new Object[] { Integer.valueOf(arrayList4.size()) }));
      stringBuilder.append("</u>");
      textView1.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      this.r0.setVisibility(0);
    } else {
      textView1.setVisibility(8);
    } 
    ArrayList arrayList2 = this.G0;
    i = arrayList2.size();
    textView1 = this.s0;
    if (i > 0) {
      StringBuilder stringBuilder = new StringBuilder("<u>");
      stringBuilder.append(getResources().getQuantityString(2131755056, arrayList2.size(), new Object[] { Integer.valueOf(arrayList2.size()) }));
      stringBuilder.append("</u>");
      textView1.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      this.s0.setVisibility(0);
    } else {
      textView1.setVisibility(8);
    } 
    arrayList4 = this.E0;
    i = arrayList4.size();
    textView1 = this.q0;
    if (i > 0) {
      StringBuilder stringBuilder = new StringBuilder("<u>");
      stringBuilder.append(getResources().getQuantityString(2131755049, arrayList4.size(), new Object[] { Integer.valueOf(arrayList4.size()) }));
      stringBuilder.append("</u>");
      textView1.setText((CharSequence)Html.fromHtml(stringBuilder.toString()));
      this.q0.setVisibility(0);
      return;
    } 
    textView1.setVisibility(8);
  }
  
  public final void r() {
    boolean bool = my0.d();
    Button button = this.X;
    if (bool) {
      ((ViewGroup.MarginLayoutParams)button.getLayoutParams()).bottomMargin = (int)(getResources().getDimension(2131165390) * 120.0F);
      this.l0.g();
    } else {
      ((ViewGroup.MarginLayoutParams)button.getLayoutParams()).bottomMargin = 0;
      this.l0.c();
    } 
    this.l0.f(this.g0);
    this.l0.j = 0;
    this.c0.l();
  }
  
  public void showOptionsForAll(View paramView) {
    ss0 ss02 = this.i0;
    if (ss02 != null)
      ss02.dismiss(); 
    if (this.c0.d.size() == 0)
      return; 
    n0();
    View view1 = LayoutInflater.from((Context)this).inflate(2131493016, null);
    LinearLayout linearLayout = (LinearLayout)view1.findViewById(2131296973);
    View view2 = linearLayout.findViewById(2131296983);
    int i = 8;
    view2.setVisibility(8);
    linearLayout.findViewById(2131297823).setVisibility(8);
    linearLayout.findViewById(2131297008).setVisibility(8);
    view2 = linearLayout.findViewById(2131296992);
    if (!my0.d())
      i = 0; 
    view2.setVisibility(i);
    ag0.x0((ViewGroup)linearLayout, this, null);
    i = this.c0.c();
    ms0 ms0 = new ms0((Context)this);
    ms0.f = getResources().getQuantityString(2131755026, i, new Object[] { Integer.valueOf(i) });
    ms0.f(view1, false);
    ss0 ss01 = new ss0(ms0);
    this.i0 = ss01;
    ss01.show();
  }
  
  public void shuffleAll(View paramView) {
    ss0 ss01 = this.i0;
    if (ss01 != null)
      ss01.dismiss(); 
    if (this.c0.d.size() == 0)
      return; 
    n0();
    ArrayList arrayList = new ArrayList(this.c0.d);
    z51.E(-1, arrayList);
    MusicService musicService = MusicService.P0;
    if (musicService != null) {
      StringBuilder stringBuilder = new StringBuilder("Search: ");
      stringBuilder.append(this.Z);
      musicService.k(arrayList, 0, stringBuilder.toString(), true);
    } 
    finish();
    startActivity((new Intent((Context)this, MusicActivity.class)).putExtra("jump_key", "jump_player"));
  }
  
  public final void w() {
    my0.b(this.c0.d);
  }
  
  public final void x() {
    my0.k(this.c0.d);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\SearchActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */