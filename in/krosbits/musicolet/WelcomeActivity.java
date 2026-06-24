package in.krosbits.musicolet;

import a52;
import ag0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.dVrV.jLnXOLx;
import b52;
import c52;
import cn;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d52;
import g92;
import jg;
import jn;
import l3;
import l90;
import lb;
import lb0;
import m92;
import n0;
import n21;
import pc;
import qo;
import tp;
import u42;
import ua0;
import xt0;
import yi1;

public class WelcomeActivity extends pc implements View.OnClickListener, View.OnLongClickListener {
  public static WelcomeActivity d0;
  
  public ua0 R;
  
  public int[] S;
  
  public boolean[] T;
  
  public View[] U;
  
  public int V;
  
  public FloatingActionButton W;
  
  public FloatingActionButton X;
  
  public LinearLayout Y;
  
  public final int Z;
  
  public final int a0;
  
  public final yi1 b0;
  
  public final l90 c0;
  
  public WelcomeActivity() {
    float f = MyApplication.p;
    this.Z = (int)(5.0F * f);
    this.a0 = (int)(f * 8.0F);
    this.b0 = new yi1(12, this);
    this.c0 = new l90(this, 12);
  }
  
  public static boolean l0(int paramInt) {
    if (paramInt == 0)
      return true; 
    if (paramInt == 1) {
      if (Build.VERSION.SDK_INT >= 33)
        return (n21.p(MyApplication.i.getApplicationContext(), "android.permission.READ_MEDIA_AUDIO") == 0); 
      paramInt = n21.p(MyApplication.i.getApplicationContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
      int i = n21.p(MyApplication.i.getApplicationContext(), "android.permission.READ_EXTERNAL_STORAGE");
      return (paramInt == 0 && i == 0);
    } 
    return (paramInt == 2) ? (((MyApplication.F.i()).j != -2)) : ((paramInt == 3) ? true : ((paramInt == 4 && Build.VERSION.SDK_INT >= 30) ? ((!MyApplication.G.b().isEmpty() || !MyApplication.G.d().isEmpty())) : false));
  }
  
  public static boolean m0(int paramInt) {
    return !l0(paramInt) ? false : ((paramInt == 2) ? MyApplication.F.k().isEmpty() : ((paramInt == 4 && Build.VERSION.SDK_INT >= 30) ? (MyApplication.G.b().isEmpty() ^ true) : true));
  }
  
  public static void o0(String paramString) {
    try {
      WelcomeActivity welcomeActivity = d0;
    } finally {
      paramString = null;
    } 
  }
  
  public static void p0() {
    try {
      WelcomeActivity welcomeActivity = d0;
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void n0(boolean paramBoolean) {
    ag0.m.post((Runnable)new jg(this, paramBoolean, 1));
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    if (this.S[this.V] == 2)
      c52.h0 = true; 
    ua0 ua01 = this.R;
    if (ua01 instanceof a52)
      ((a52)ua01).F0(paramInt1, paramInt2, paramIntent); 
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public final void onBackPressed() {
    int i = this.V;
    if (i > 0) {
      r0(i - 1, null);
      return;
    } 
    super.onBackPressed();
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296415) {
      i = this.V;
      int[] arrayOfInt = this.S;
      if (i < arrayOfInt.length - 1) {
        r0(i + 1, null);
        return;
      } 
      if (i == arrayOfInt.length - 1) {
        if (MyApplication.w == -1) {
          startActivity(new Intent((Context)this, MusicActivity.class));
          cn.o((Context)this).v(new Intent("ACTPG"));
        } 
        if (!MyApplication.x().getBoolean("swcscshn", false)) {
          MyApplication.x().edit().putBoolean("swcscshn", true).apply();
          b.d = true;
          b.b = true;
        } 
        finish();
        return;
      } 
    } else if (i == 2131296371) {
      i = this.V;
      if (i > 0)
        r0(i - 1, null); 
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(null);
    WelcomeActivity welcomeActivity = d0;
    if (welcomeActivity != null && welcomeActivity != this)
      welcomeActivity.finish(); 
    d0 = this;
    setContentView(2131492918);
    FrameLayout frameLayout = (FrameLayout)findViewById(2131296733);
    this.Y = (LinearLayout)findViewById(2131296996);
    this.X = (FloatingActionButton)findViewById(2131296415);
    this.W = (FloatingActionButton)findViewById(2131296371);
    View view = findViewById(2131297921);
    int[] arrayOfInt = m92.h;
    view.setBackgroundColor(jn.i(arrayOfInt[2], 178));
    g92.d(view, false, false);
    U().a(this.c0);
    this.W.setOnClickListener(this);
    this.X.setOnClickListener(this);
    this.X.setSupportImageTintList(ColorStateList.valueOf(arrayOfInt[13]));
    this.W.setSupportImageTintList(ColorStateList.valueOf(arrayOfInt[5]));
    Z().C();
    q0(getIntent().getExtras(), paramBundle);
    view.setOnLongClickListener(this);
  }
  
  public final void onDestroy() {
    if (d0 == this)
      d0 = null; 
    super.onDestroy();
  }
  
  public final boolean onLongClick(View paramView) {
    if (paramView.getId() == 2131297921)
      MyApplication.w(); 
    return false;
  }
  
  public final void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
    q0(paramIntent.getExtras(), null);
  }
  
  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint) {
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfint);
    ua0 ua01 = this.R;
    if (ua01 instanceof d52 && paramArrayOfint.length > 0 && paramArrayOfString.length > 0)
      try {
        d52 d52 = (d52)ua01;
      } finally {
        paramArrayOfString = null;
      }  
  }
  
  public final void onRestoreInstanceState(Bundle paramBundle) {
    super.onRestoreInstanceState(paramBundle);
    if (this.R != null) {
      paramBundle = paramBundle.getBundle("cpsis");
      if (paramBundle != null)
        this.R.r0(paramBundle); 
    } 
  }
  
  public final void onResume() {
    super.onResume();
    boolean bool = getIntent().getBooleanExtra("ARGWCF2SHJANFD", false);
    Handler handler = this.N;
    if (bool) {
      getIntent().removeExtra("ARGWCF2SHJANFD");
      handler.postDelayed((Runnable)new l3(21), 300L);
    } 
    String str = getIntent().getStringExtra("ARGWCF2SHJSALFD");
    if (str != null) {
      getIntent().removeExtra("ARGWCF2SHJSALFD");
      handler.postDelayed((Runnable)new xt0(25, str), 300L);
    } 
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("cp", this.V);
    if (this.R != null) {
      Bundle bundle = new Bundle();
      this.R.n0(bundle);
      paramBundle.putBundle(jLnXOLx.gfw, bundle);
    } 
  }
  
  public final void q0(Bundle paramBundle1, Bundle paramBundle2) {
    if (paramBundle1 != null)
      this.S = paramBundle1.getIntArray(nFLlOYeP.weapwcQ); 
    int[] arrayOfInt = this.S;
    int j = 0;
    if (arrayOfInt == null)
      this.S = new int[] { 0, 1, 2, 3 }; 
    if (paramBundle2 != null)
      this.V = paramBundle2.getInt("cp"); 
    int i = this.V;
    arrayOfInt = this.S;
    if (i >= arrayOfInt.length)
      this.V = arrayOfInt.length - 1; 
    this.T = new boolean[arrayOfInt.length];
    for (i = 0; i < this.V; i++) {
      boolean bool = l0(this.S[i]);
      this.T[i] = bool;
      if (!bool) {
        this.V = i;
        break;
      } 
    } 
    this.U = new View[this.S.length];
    this.Y.removeAllViews();
    i = j;
    while (true) {
      View[] arrayOfView = this.U;
      if (i < arrayOfView.length) {
        arrayOfView[i] = new View((Context)this);
        int k = this.Z;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k, k);
        if (i == this.V) {
          j = this.a0;
          layoutParams.height = j;
          layoutParams.width = j;
        } 
        layoutParams.leftMargin = k;
        View[] arrayOfView1 = this.U;
        if (i == arrayOfView1.length - 1)
          layoutParams.rightMargin = k; 
        this.Y.addView(arrayOfView1[i], (ViewGroup.LayoutParams)layoutParams);
        i++;
        continue;
      } 
      r0(this.V, paramBundle2);
      return;
    } 
  }
  
  public final void r0(int paramInt, Bundle paramBundle) {
    Z().C();
    lb0 lb0 = Z();
    lb0.getClass();
    lb lb = new lb(lb0);
    if (paramBundle == null) {
      int i;
      int j;
      if (paramInt < this.V) {
        this.W.setEnabled(false);
        j = 2130772021;
        i = 2130772024;
      } else {
        this.X.setEnabled(false);
        j = 2130772022;
        i = 2130772023;
      } 
      lb.b = j;
      lb.c = i;
      lb.d = 0;
      lb.e = 0;
    } 
    this.V = paramInt;
    paramInt = this.S[paramInt];
    this.R = null;
    if (paramInt == 0) {
      this.R = (ua0)new u42();
    } else if (paramInt == 1) {
      this.R = (ua0)new d52();
    } else if (paramInt == 2) {
      this.R = (ua0)new c52();
    } else if (paramInt == 3) {
      this.R = (ua0)new b52();
    } else if (paramInt == 4) {
      this.R = (ua0)new a52();
    } 
    ua0 ua01 = this.R;
    if (ua01 != null)
      lb.k(2131296733, ua01, null); 
    if (!lb.g) {
      lb.h = false;
      lb.r.A(lb, false);
      s0();
      if (paramBundle == null)
        ag0.m.postDelayed((Runnable)this.b0, 500L); 
      return;
    } 
    tp.f("This transaction is already being added to the back stack");
  }
  
  public final void s0() {
    int[] arrayOfInt = m92.h;
    int i = this.V;
    FloatingActionButton floatingActionButton = this.W;
    if (i == 0) {
      floatingActionButton.d(true);
    } else {
      floatingActionButton.f(true);
    } 
    boolean bool = l0(this.S[this.V]);
    this.T[this.V] = bool;
    floatingActionButton = this.X;
    if (bool) {
      floatingActionButton.f(true);
    } else {
      floatingActionButton.d(true);
    } 
    int j = this.V;
    i = this.S.length;
    floatingActionButton = this.X;
    if (j == i - 1) {
      floatingActionButton.setContentDescription(getString(2131886467));
      this.X.setImageResource(2131231110);
    } else {
      floatingActionButton.setContentDescription(getString(2131886983));
      this.X.setImageResource(2131231193);
    } 
    j = 0;
    while (true) {
      View[] arrayOfView = this.U;
      if (j < arrayOfView.length) {
        ViewGroup.LayoutParams layoutParams = arrayOfView[j].getLayoutParams();
        GradientDrawable gradientDrawable = (GradientDrawable)getResources().getDrawable(2131231443).mutate();
        if (this.V == j) {
          i = this.a0;
          layoutParams.height = i;
          layoutParams.width = i;
          if (this.T[j]) {
            i = arrayOfInt[3];
          } else {
            i = arrayOfInt[5];
          } 
        } else {
          i = this.Z;
          layoutParams.height = i;
          layoutParams.width = i;
          this.U[j].setLayoutParams(layoutParams);
          if (this.T[j]) {
            i = arrayOfInt[3];
          } else {
            i = arrayOfInt[6];
          } 
        } 
        this.U[j].setLayoutParams(layoutParams);
        gradientDrawable.setColor(i);
        gradientDrawable.setAlpha(Color.alpha(i));
        gradientDrawable.setBounds(0, 0, layoutParams.width, layoutParams.height);
        this.U[j].setBackground((Drawable)gradientDrawable);
        View[] arrayOfView1 = this.U;
        View view = arrayOfView1[j];
        if (arrayOfView1.length <= 1) {
          i = 8;
        } else {
          i = 0;
        } 
        view.setVisibility(i);
        j++;
        continue;
      } 
      break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\WelcomeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */