package in.krosbits.musicolet;

import a3;
import ag0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import b81;
import b91;
import bx0;
import c81;
import cr1;
import d81;
import gj0;
import id1;
import ij0;
import in.krosbits.android.widgets.RecyclerViewScrollBar;
import in.krosbits.android.widgets.SmartTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import km0;
import kz;
import l81;
import l90;
import m92;
import ms0;
import n2;
import os0;
import pc;
import pq;
import rs0;
import rw0;
import sb1;
import ub1;
import vm;
import xj1;
import y2;
import z51;

public class PlaylistEditActivity extends pc implements b91, View.OnClickListener, sb1 {
  public static ArrayList r0;
  
  public static ArrayList s0;
  
  public static HashSet t0;
  
  public String R;
  
  public ArrayList S;
  
  public ArrayList T;
  
  public HashSet U;
  
  public boolean V;
  
  public vm W;
  
  public TextView X;
  
  public EditText Y;
  
  public RecyclerView Z;
  
  public RecyclerViewScrollBar a0;
  
  public LayoutInflater b0;
  
  public final int c0 = (int)(MyApplication.p * 8.0F);
  
  public a3 d0;
  
  public ArrayList e0;
  
  public ArrayList f0;
  
  public int g0;
  
  public boolean h0;
  
  public HashSet i0;
  
  public final ij0 j0 = new ij0((gj0)new kz(1, this));
  
  public bx0 k0;
  
  public final l90 l0 = new l90(this, 6);
  
  public boolean m0 = false;
  
  public View n0;
  
  public SmartTextView o0;
  
  public View p0;
  
  public boolean q0;
  
  public final void l0() {
    this.m0 = false;
    this.U.clear();
    n0();
    this.d0.g();
  }
  
  public final boolean m0() {
    View view = this.n0;
    return (view != null && view.getVisibility() == 0);
  }
  
  public final void n0() {
    int i = this.T.size();
    TextView textView = this.X;
    if (i > 4) {
      textView.setVisibility(0);
    } else {
      textView.setVisibility(8);
    } 
    if (this.m0 || this.U.size() > 0) {
      if (this.n0 == null)
        try {
          ConstraintLayout constraintLayout = (ConstraintLayout)getWindow().getDecorView().findViewById(2131297382);
          View view2 = LayoutInflater.from((Context)this).inflate(2131493203, (ViewGroup)constraintLayout, false);
          this.n0 = view2;
          view2.setVisibility(8);
          pq pq = new pq();
          this();
          constraintLayout.addView(this.n0);
          pq.c(constraintLayout);
          pq.d(this.n0.getId(), 4, 0, 4);
          pq.a(constraintLayout);
          LinearLayout linearLayout = (LinearLayout)this.n0.findViewById(2131296995);
          ((ImageView)linearLayout.getChildAt(0)).setImageResource(2131231380);
          ((TextView)linearLayout.getChildAt(1)).setText(2131887160);
          View view1 = this.n0.findViewById(2131296959);
          this.p0 = view1;
          view1.setOnClickListener(this);
          this.p0.setVisibility(0);
          this.n0.findViewById(2131296969).setOnClickListener(this);
          this.o0 = (SmartTextView)this.n0.findViewById(2131297800);
          linearLayout.setOnClickListener(this);
          this.o0.setOnClickListener(this);
          n2 n2 = new n2();
          this((Context)this, this.p0);
          rw0 rw0 = (rw0)n2.c;
          cr1 cr1 = new cr1();
          this((Context)this);
          cr1.inflate(2131623939, (Menu)rw0);
          rw0.removeItem(2131297120);
          n2.f = this;
          ag0.A0((Menu)rw0, null);
          bx0 bx01 = new bx0();
          this((Context)this, rw0, this.p0);
          this.k0 = bx01;
          bx01.d(true);
        } finally {
          textView = null;
        }  
      if (!m0()) {
        Animation animation = AnimationUtils.loadAnimation((Context)getApplication(), 2130772025);
        this.n0.startAnimation(animation);
        this.n0.setVisibility(0);
        invalidateOptionsMenu();
      } 
      if (m0()) {
        i = this.U.size();
        this.o0.setText(getResources().getQuantityString(2131755069, i, new Object[] { Integer.valueOf(i) }));
        this.o0.setCompoundDrawables(null, null, null, null);
      } 
      return;
    } 
    if (this.n0 != null) {
      if (m0()) {
        Animation animation = AnimationUtils.loadAnimation((Context)getApplication(), 2130772020);
        this.n0.startAnimation(animation);
        this.n0.setVisibility(8);
        invalidateOptionsMenu();
        return;
      } 
    } else {
      return;
    } 
  }
  
  public final void o0() {
    Animation animation;
    String str2 = this.Y.getText().toString().trim();
    String str1 = str2;
    if (ag0.z.matcher(str2).find()) {
      str1 = ag0.e(str2);
      this.Y.setText(str1);
    } 
    if (str1.length() == 0) {
      this.Y.requestFocus();
      ag0.H0(MyApplication.i.getApplicationContext(), (View)this.Y);
      animation = AnimationUtils.loadAnimation(MyApplication.i.getApplicationContext(), 2130772019);
      this.Y.startAnimation(animation);
      return;
    } 
    int i = c81.e(this.R);
    if (!animation.equals(this.R)) {
      if (c81.b((String)animation) != null && !this.R.equalsIgnoreCase((String)animation)) {
        ag0.P0(0, getString(2131886172), true);
        return;
      } 
      c81.h(MyApplication.i.getApplicationContext(), new b81(this.R));
    } 
    b81 b81 = new b81((String)animation, this.T);
    c81.m(MyApplication.i.getApplicationContext(), b81);
    c81.n((String)animation, i);
    MusicActivity musicActivity = MusicActivity.R0;
    if (musicActivity != null) {
      l81 l81 = musicActivity.e0;
      if (l81 != null && l81.Y()) {
        if (this.R.equals(MusicActivity.R0.e0.K0)) {
          l81 = MusicActivity.R0.e0;
          l81.H0 = (String)animation;
          l81.K0 = (String)animation;
        } 
        MusicActivity.R0.e0.N0();
      } 
    } 
    setResult(-1);
    finish();
  }
  
  public final void onBackPressed() {
    if (this.m0 || this.U.size() > 0) {
      l0();
      return;
    } 
    if (this.V) {
      ms0 ms0 = new ms0((Context)this);
      ms0.c(2131887268);
      ms0.l(2131886278);
      ms0.k(2131886989);
      ms0.n(2131887604);
      ms0.D = (rs0)new d81(this);
      ms0.p();
      return;
    } 
    super.onBackPressed();
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296959) {
      this.k0.e();
      return;
    } 
    if (i == 2131296969) {
      l0();
      return;
    } 
    if (i == 2131297864) {
      (new ub1((Context)this, this.X.getText().toString(), this.T, 0, this, null)).p();
      return;
    } 
    if (i == 2131296995) {
      ArrayList<km0> arrayList = new ArrayList(this.T.size());
      for (i = 0; i < this.T.size(); i++) {
        if (!this.U.contains(Integer.valueOf(i)))
          arrayList.add(this.T.get(i)); 
      } 
      this.T = arrayList;
      l0();
      this.V = true;
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: invokestatic a : (Lqo;Z)V
    //   5: aload_0
    //   6: invokestatic c : (Landroid/app/Activity;)V
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial onCreate : (Landroid/os/Bundle;)V
    //   14: aload_0
    //   15: ldc_w 2131492906
    //   18: invokevirtual setContentView : (I)V
    //   21: aload_0
    //   22: ldc_w 2131297607
    //   25: invokevirtual findViewById : (I)Landroid/view/View;
    //   28: checkcast androidx/appcompat/widget/Toolbar
    //   31: astore_2
    //   32: aload_0
    //   33: aload_2
    //   34: invokevirtual g0 : (Landroidx/appcompat/widget/Toolbar;)V
    //   37: aload_0
    //   38: invokevirtual Y : ()Lui0;
    //   41: iconst_1
    //   42: invokevirtual Z : (Z)V
    //   45: aload_0
    //   46: ldc 2131297382
    //   48: invokevirtual findViewById : (I)Landroid/view/View;
    //   51: iconst_0
    //   52: iconst_0
    //   53: invokestatic d : (Landroid/view/View;ZZ)V
    //   56: aload_2
    //   57: invokestatic f : (Landroid/view/View;)V
    //   60: aload_0
    //   61: invokevirtual U : ()Lb41;
    //   64: aload_0
    //   65: getfield l0 : Ll90;
    //   68: invokevirtual a : (Ll90;)V
    //   71: aload_0
    //   72: aload_0
    //   73: ldc_w 2131296706
    //   76: invokevirtual findViewById : (I)Landroid/view/View;
    //   79: checkcast android/widget/EditText
    //   82: putfield Y : Landroid/widget/EditText;
    //   85: aload_0
    //   86: aload_0
    //   87: ldc_w 2131297422
    //   90: invokevirtual findViewById : (I)Landroid/view/View;
    //   93: checkcast androidx/recyclerview/widget/RecyclerView
    //   96: putfield Z : Landroidx/recyclerview/widget/RecyclerView;
    //   99: aload_0
    //   100: aload_0
    //   101: ldc_w 2131297864
    //   104: invokevirtual findViewById : (I)Landroid/view/View;
    //   107: checkcast android/widget/TextView
    //   110: putfield X : Landroid/widget/TextView;
    //   113: aload_0
    //   114: ldc_w 2131297928
    //   117: invokevirtual findViewById : (I)Landroid/view/View;
    //   120: new wg
    //   123: dup
    //   124: iconst_0
    //   125: iconst_1
    //   126: invokespecial <init> : (II)V
    //   129: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   132: aload_0
    //   133: aload_0
    //   134: ldc_w 2131297400
    //   137: invokevirtual findViewById : (I)Landroid/view/View;
    //   140: checkcast in/krosbits/android/widgets/RecyclerViewScrollBar
    //   143: putfield a0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   146: aload_0
    //   147: getfield Z : Landroidx/recyclerview/widget/RecyclerView;
    //   150: new androidx/recyclerview/widget/LinearLayoutManager
    //   153: dup
    //   154: iconst_1
    //   155: invokespecial <init> : (I)V
    //   158: invokevirtual setLayoutManager : (Landroidx/recyclerview/widget/a;)V
    //   161: aload_0
    //   162: getfield Z : Landroidx/recyclerview/widget/RecyclerView;
    //   165: new kn1
    //   168: dup
    //   169: aload_0
    //   170: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   173: aload_0
    //   174: invokespecial <init> : (Landroid/content/res/Resources;Lin/krosbits/musicolet/PlaylistEditActivity;)V
    //   177: invokevirtual h : (Lpd1;)V
    //   180: aload_0
    //   181: aload_0
    //   182: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   185: putfield b0 : Landroid/view/LayoutInflater;
    //   188: aload_0
    //   189: invokevirtual getIntent : ()Landroid/content/Intent;
    //   192: ldc_w 'ex_pl'
    //   195: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   198: astore_2
    //   199: aload_0
    //   200: aload_2
    //   201: putfield R : Ljava/lang/String;
    //   204: aload_2
    //   205: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   208: ifeq -> 216
    //   211: aload_0
    //   212: invokevirtual finish : ()V
    //   215: return
    //   216: aload_1
    //   217: ifnonnull -> 306
    //   220: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   223: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   226: aload_0
    //   227: getfield R : Ljava/lang/String;
    //   230: invokestatic f : (Landroid/content/Context;Ljava/lang/String;)Lb81;
    //   233: astore_2
    //   234: aload_2
    //   235: getfield c : Ljava/util/ArrayList;
    //   238: astore_1
    //   239: aload_1
    //   240: ifnull -> 301
    //   243: aload_1
    //   244: invokevirtual isEmpty : ()Z
    //   247: ifeq -> 253
    //   250: goto -> 301
    //   253: aload_0
    //   254: aload_2
    //   255: getfield c : Ljava/util/ArrayList;
    //   258: putfield S : Ljava/util/ArrayList;
    //   261: aload_0
    //   262: new java/util/ArrayList
    //   265: dup
    //   266: aload_0
    //   267: getfield S : Ljava/util/ArrayList;
    //   270: invokespecial <init> : (Ljava/util/Collection;)V
    //   273: putfield T : Ljava/util/ArrayList;
    //   276: aload_0
    //   277: new java/util/HashSet
    //   280: dup
    //   281: invokespecial <init> : ()V
    //   284: putfield U : Ljava/util/HashSet;
    //   287: aload_0
    //   288: getfield Y : Landroid/widget/EditText;
    //   291: aload_0
    //   292: getfield R : Ljava/lang/String;
    //   295: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   298: goto -> 368
    //   301: aload_0
    //   302: invokevirtual finish : ()V
    //   305: return
    //   306: getstatic in/krosbits/musicolet/PlaylistEditActivity.r0 : Ljava/util/ArrayList;
    //   309: astore_2
    //   310: aload_2
    //   311: ifnull -> 448
    //   314: getstatic in/krosbits/musicolet/PlaylistEditActivity.s0 : Ljava/util/ArrayList;
    //   317: astore_3
    //   318: aload_3
    //   319: ifnonnull -> 325
    //   322: goto -> 448
    //   325: aload_0
    //   326: aload_2
    //   327: putfield S : Ljava/util/ArrayList;
    //   330: aload_0
    //   331: aload_3
    //   332: putfield T : Ljava/util/ArrayList;
    //   335: aload_0
    //   336: getstatic in/krosbits/musicolet/PlaylistEditActivity.t0 : Ljava/util/HashSet;
    //   339: putfield U : Ljava/util/HashSet;
    //   342: aload_0
    //   343: getfield Y : Landroid/widget/EditText;
    //   346: aload_1
    //   347: ldc_w 'ex_pl'
    //   350: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   353: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   356: aconst_null
    //   357: putstatic in/krosbits/musicolet/PlaylistEditActivity.r0 : Ljava/util/ArrayList;
    //   360: aconst_null
    //   361: putstatic in/krosbits/musicolet/PlaylistEditActivity.s0 : Ljava/util/ArrayList;
    //   364: aconst_null
    //   365: putstatic in/krosbits/musicolet/PlaylistEditActivity.t0 : Ljava/util/HashSet;
    //   368: new a3
    //   371: dup
    //   372: bipush #12
    //   374: aload_0
    //   375: invokespecial <init> : (ILjava/lang/Object;)V
    //   378: astore_1
    //   379: aload_0
    //   380: aload_1
    //   381: putfield d0 : La3;
    //   384: aload_0
    //   385: getfield Z : Landroidx/recyclerview/widget/RecyclerView;
    //   388: aload_1
    //   389: invokevirtual setAdapter : (Lid1;)V
    //   392: aload_0
    //   393: getfield a0 : Lin/krosbits/android/widgets/RecyclerViewScrollBar;
    //   396: aload_0
    //   397: getfield Z : Landroidx/recyclerview/widget/RecyclerView;
    //   400: invokevirtual setRecyclerView : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   403: aload_0
    //   404: getfield j0 : Lij0;
    //   407: aload_0
    //   408: getfield Z : Landroidx/recyclerview/widget/RecyclerView;
    //   411: invokevirtual g : (Landroidx/recyclerview/widget/RecyclerView;)V
    //   414: aload_0
    //   415: invokevirtual n0 : ()V
    //   418: aload_0
    //   419: getfield X : Landroid/widget/TextView;
    //   422: aload_0
    //   423: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   426: new vm
    //   429: dup
    //   430: invokespecial <init> : ()V
    //   433: astore_1
    //   434: aload_0
    //   435: aload_1
    //   436: putfield W : Lvm;
    //   439: aload_1
    //   440: aload_0
    //   441: getfield Y : Landroid/widget/EditText;
    //   444: invokevirtual m : (Landroid/widget/EditText;)V
    //   447: return
    //   448: ldc_w 'PLEA:null_c'
    //   451: invokestatic F : (Ljava/lang/String;)V
    //   454: aload_0
    //   455: invokevirtual finish : ()V
    //   458: return
  }
  
  public final boolean onCreateOptionsMenu(Menu paramMenu) {
    boolean bool;
    getMenuInflater().inflate(2131623942, paramMenu);
    ag0.A0(paramMenu, null);
    ag0.C0(m92.h[4], paramMenu.findItem(2131297132).getIcon());
    MenuItem menuItem = paramMenu.findItem(2131297128);
    if (!this.m0 && this.U.size() <= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    menuItem.setVisible(bool);
    return true;
  }
  
  public final void onDestroy() {
    View view = this.n0;
    if (view != null) {
      view.findViewById(2131296959).setOnClickListener(null);
      this.n0.findViewById(2131296969).setOnClickListener(null);
      this.n0.findViewById(2131296995).setOnClickListener(null);
      this.n0.setOnClickListener(null);
    } 
    this.p0 = null;
    this.o0 = null;
    this.n0 = null;
    if (!this.q0) {
      t0 = null;
      s0 = null;
      r0 = null;
    } 
    vm vm1 = this.W;
    if (vm1 != null)
      vm1.i(); 
    super.onDestroy();
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem) {
    int k = paramMenuItem.getItemId();
    int i = 0;
    int j = 0;
    if (k == 2131297137) {
      for (i = j; i < this.T.size(); i++)
        this.U.add(Integer.valueOf(i)); 
      this.d0.g();
      n0();
      return true;
    } 
    if (k == 2131297138) {
      if (this.U.size() >= 2) {
        ArrayList<Comparable> arrayList = new ArrayList(this.U);
        Collections.sort(arrayList);
        i = ((Integer)arrayList.get(0)).intValue();
        j = ((Integer)arrayList.get(arrayList.size() - 1)).intValue();
        while (++i < j) {
          this.U.add(Integer.valueOf(i));
          i++;
        } 
        this.d0.g();
        n0();
        return true;
      } 
    } else if (k == 2131297126) {
      while (i < this.T.size()) {
        boolean bool = this.U.contains(Integer.valueOf(i));
        HashSet<Integer> hashSet = this.U;
        if (bool) {
          hashSet.remove(Integer.valueOf(i));
        } else {
          hashSet.add(Integer.valueOf(i));
        } 
        i++;
      } 
      this.d0.g();
      n0();
    } 
    return true;
  }
  
  public final boolean onMenuOpened(int paramInt, Menu paramMenu) {
    boolean bool1;
    boolean bool2 = false;
    byte b = 0;
    while (true) {
      bool1 = bool2;
      if (b < this.T.size()) {
        if (((km0)this.T.get(b)).u == 64) {
          bool1 = true;
          break;
        } 
        b++;
        continue;
      } 
      break;
    } 
    paramMenu.findItem(2131297131).setVisible(bool1);
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    int i = paramMenuItem.getItemId();
    if (i == 16908332) {
      onBackPressed();
      return true;
    } 
    if (i == 2131297142) {
      Drawable drawable = ag0.C0(m92.h[5], getResources().getDrawable(2131231068).mutate());
      ms0 ms0 = new ms0((Context)this);
      ms0.S = drawable;
      ms0.q(2131887429);
      ms0.h(ag0.R(z51.p));
      ms0.j((os0)new d81(this));
      ms0.p();
      return true;
    } 
    if (i == 2131297129) {
      this.m0 = true;
      this.d0.g();
      n0();
      return true;
    } 
    if (i == 2131297131) {
      ArrayList<km0> arrayList = new ArrayList(this.T.size());
      ArrayList<Object> arrayList1 = this.T;
      int j = arrayList1.size();
      i = 0;
      while (i < j) {
        km0 km0 = (km0)arrayList1.get(i);
        int k = i + 1;
        km0 = km0;
        i = k;
        if (km0.u != 64) {
          arrayList.add(km0);
          i = k;
        } 
      } 
      this.T = arrayList;
      l0();
      this.V = true;
      return true;
    } 
    if (i == 2131297132)
      o0(); 
    return true;
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    this.q0 = true;
    t0 = this.U;
    s0 = this.T;
    r0 = this.S;
    paramBundle.putString("ex_pl", this.Y.getText().toString());
    super.onSaveInstanceState(paramBundle);
  }
  
  public final void p0(int paramInt) {
    ArrayList<Boolean> arrayList;
    int i = this.U.size();
    boolean bool = false;
    if (i > 0) {
      ArrayList<Boolean> arrayList1 = new ArrayList(this.T.size());
      i = 0;
      while (true) {
        arrayList = arrayList1;
        if (i < this.T.size()) {
          arrayList1.add(Boolean.valueOf(this.U.contains(Integer.valueOf(i))));
          i++;
          continue;
        } 
        break;
      } 
    } else {
      arrayList = null;
    } 
    this.T.remove(paramInt);
    if (arrayList != null)
      arrayList.remove(paramInt); 
    if (arrayList != null) {
      this.U.clear();
      for (i = bool; i < arrayList.size(); i++) {
        if (((Boolean)arrayList.get(i)).booleanValue())
          this.U.add(Integer.valueOf(i)); 
      } 
    } 
    ((id1)this.d0).a.f(paramInt, 1);
    n0();
    this.V = true;
  }
  
  public final void u(int paramInt, xj1 paramxj1) {
    for (paramInt = 0; paramInt < this.T.size(); paramInt++) {
      if (this.T.get(paramInt) == paramxj1) {
        this.Z.k0(paramInt);
        (new Handler()).postDelayed((Runnable)new y2(paramInt, 8, this), 300L);
        return;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\PlaylistEditActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */