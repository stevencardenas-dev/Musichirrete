package in.krosbits.musicolet;

import ag0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.media.audiofx.Equalizer;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.tabs.xm.VDgS;
import d50;
import dl0;
import e;
import e50;
import f01;
import f50;
import g92;
import h50;
import i1;
import in.krosbits.android.widgets.SmartImageView;
import in.krosbits.android.widgets.ViewPager2;
import j50;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import jn;
import l3;
import m92;
import ms0;
import n0;
import ow;
import p51;
import pc;
import qo;
import r01;
import r32;
import ss0;
import ua0;
import un;
import w00;
import z40;
import zm;

public class EqualizerActivity2 extends pc implements r32, AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
  public static EqualizerActivity2 q0;
  
  public static ArrayList r0;
  
  public boolean R;
  
  public Spinner S;
  
  public Toolbar T;
  
  public LinearLayout U;
  
  public ViewPager2 V;
  
  public h50 W;
  
  public zm X;
  
  public ua0[] Y;
  
  public z40 Z;
  
  public d50 a0;
  
  public e50 b0;
  
  public int c0;
  
  public final String[] d0 = new String[] { "Control set 1", "Control set 2", "Control set 3" };
  
  public final int[] e0 = new int[] { 2131231417, 2131231074, 2131231411 };
  
  public boolean f0;
  
  public ss0 g0;
  
  public final i1 h0 = new i1(3, this);
  
  public int i0 = -1;
  
  public final ColorStateList j0;
  
  public final ColorStateList k0;
  
  public final ColorStateList l0;
  
  public final ColorStateList m0;
  
  public float n0;
  
  public DialogInterface o0;
  
  public boolean p0;
  
  public EqualizerActivity2() {
    int[] arrayOfInt2 = { 16842912 };
    int[] arrayOfInt3 = new int[0];
    int[] arrayOfInt1 = m92.h;
    int i = arrayOfInt1[3];
    int j = arrayOfInt1[5];
    this.j0 = new ColorStateList(new int[][] { arrayOfInt2, arrayOfInt3 }, new int[] { i, j });
    arrayOfInt2 = new int[0];
    i = jn.i(arrayOfInt1[3], Color.alpha(arrayOfInt1[7]));
    j = arrayOfInt1[7];
    this.k0 = new ColorStateList(new int[][] { { 16842912 }, , arrayOfInt2 }, new int[] { i, j });
    this.l0 = ColorStateList.valueOf(jn.g(arrayOfInt1[6], arrayOfInt1[2]));
    this.m0 = ColorStateList.valueOf(jn.g(arrayOfInt1[7], arrayOfInt1[2]));
    this.n0 = -1.0F;
  }
  
  public static ArrayList l0() {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{in/krosbits/musicolet/EqualizerActivity2}} */
    try {
      if (r0 == null) {
        Cursor cursor = MyApplication.k.getReadableDatabase().query("TABLE_DEVICES", new String[] { "COL_ID", VDgS.gExmcJ, "COL_TYPE" }, null, null, null, null, "COL_NAME");
        if (cursor != null) {
          boolean bool1;
          ArrayList<dl0> arrayList3 = new ArrayList();
          this(cursor.getCount() + 6);
          r0 = arrayList3;
          dl0 dl02 = new dl0();
          String str = MyApplication.i.getApplicationContext().getString(2131886264);
          boolean bool2 = true;
          this(2131231366, 1, str);
          arrayList3.add(dl02);
          ArrayList<dl0> arrayList1 = r0;
          dl0 dl03 = new dl0();
          this(2131231406, 2, MyApplication.i.getApplicationContext().getString(2131887440));
          arrayList1.add(dl03);
          ArrayList<dl0> arrayList2 = r0;
          dl0 dl01 = new dl0();
          this(2131231182, 3, MyApplication.i.getApplicationContext().getString(2131886655));
          arrayList2.add(dl01);
          if (cursor.getCount() == 0) {
            bool1 = bool2;
          } else {
            for (bool1 = false; cursor.moveToNext(); bool1 = true) {
              int j = cursor.getInt(0);
              String str1 = cursor.getString(1);
              int i = cursor.getInt(2);
              if (j >= 0 && j <= 9999) {
                arrayList3 = r0;
                dl0 dl0 = new dl0();
                if (i == 2) {
                  i = 2131231347;
                } else {
                  i = 2131231100;
                } 
                this(i, j + 40000, str1);
                arrayList3.add(dl0);
                continue;
              } 
            } 
            if (MusicService.D0 == 4)
              bool1 = bool2; 
          } 
          if (bool1) {
            ArrayList<dl0> arrayList4 = r0;
            dl0 dl0 = new dl0();
            this(2131231100, 4, MyApplication.i.getApplicationContext().getString(2131886250));
            arrayList4.add(dl0);
          } 
          arrayList2 = r0;
          dl01 = new dl0();
          this(2131231420, 5, MyApplication.i.getApplicationContext().getString(2131887539));
          arrayList2.add(dl01);
          cursor.close();
        } 
      } 
    } finally {
      Exception exception;
    } 
    ArrayList arrayList = r0;
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{in/krosbits/musicolet/EqualizerActivity2}} */
    return arrayList;
  }
  
  public static void m0() {
    if (q0 != null)
      ag0.m.postDelayed((Runnable)new l3(2), 300L); 
  }
  
  public static void n0(EqualizerActivity2 paramEqualizerActivity2) {
    InputMethodManager inputMethodManager = (InputMethodManager)paramEqualizerActivity2.getSystemService("input_method");
    if (inputMethodManager != null) {
      byte b = 0;
      while (true) {
        if (b < 3) {
          (new String[3])[0] = "mCurRootView";
          (new String[3])[1] = "mServedView";
          (new String[3])[2] = "mNextServedView";
          String str = (new String[3])[b];
          try {
            Field field = inputMethodManager.getClass().getDeclaredField(str);
            if (!field.isAccessible())
              field.setAccessible(true); 
            Object object = field.get(inputMethodManager);
            if (object instanceof View) {
              object = object;
              if (object.getContext() == paramEqualizerActivity2) {
                field.set(inputMethodManager, null);
              } else {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("fixInputMethodManagerLeak break, context is not suitable, get_context=");
                stringBuilder.append(object.getContext());
                stringBuilder.append(" dest_context=");
                stringBuilder.append(paramEqualizerActivity2);
                Log.e("JSTMUSIC2", stringBuilder.toString());
                return;
              } 
            } 
          } finally {}
          b++;
          continue;
        } 
        return;
      } 
    } 
  }
  
  public static void r0() {
    EqualizerActivity2 equalizerActivity2 = q0;
    if (equalizerActivity2 != null && equalizerActivity2.D) {
      ss0 ss01 = equalizerActivity2.g0;
      if (ss01 != null) {
        ss01.dismiss();
        q0.g0 = null;
      } 
      EqualizerActivity2 equalizerActivity21 = q0;
      ms0 ms0 = new ms0((Context)equalizerActivity21);
      ms0.o(0, true);
      ms0.c(2131887105);
      ms0.J = false;
      ms0.K = false;
      equalizerActivity21.g0 = ms0.p();
    } 
  }
  
  public final void k(int paramInt) {}
  
  public final float o0() {
    int i = p0();
    if (i >= 0 && i == MusicService.D0 && MusicService.G0 && MusicService.K0 != null && MusicService.L0 != null && MusicService.N0 != null) {
      ow ow = MusicService.K0;
      if (!ow.b && ow.a) {
        float f1;
        float f4;
        if (MusicService.L0.c) {
          f4 = 0.0F;
        } else {
          f4 = (f01.b()).d.c * 15.0F / 1000.0F;
        } 
        ow = MusicService.K0;
        if (ow.b) {
          i = ((Equalizer)((ArrayList<Equalizer>)ow.c).get(0)).getNumberOfBands();
        } else {
          i = (short)(f01.b()).g.size();
        } 
        Pair[] arrayOfPair = new Pair[i];
        for (short s = 0; s < i; s = (short)(s + 1)) {
          float f;
          ow ow1 = MusicService.K0;
          if (ow1.b) {
            f1 = ((Equalizer)((ArrayList<Equalizer>)ow1.c).get(0)).getCenterFreq(s) / 1000.0F;
          } else {
            f1 = ((r01)(f01.b()).g.get(s)).b;
          } 
          ow1 = MusicService.K0;
          if (ow1.b) {
            f = ((Equalizer)((ArrayList<Equalizer>)ow1.c).get(0)).getBandLevel(s) / 100.0F;
          } else {
            f = ((r01)(f01.b()).g.get(s)).d;
          } 
          arrayOfPair[s] = new Pair(Float.valueOf(f1), Float.valueOf(f));
        } 
        Arrays.sort(arrayOfPair, (Comparator<? super Pair>)new w00(1));
        float f2 = 0.0F;
        int j = 0;
        while (j < i) {
          boolean bool;
          f1 = ((Float)(arrayOfPair[j]).first).floatValue();
          float f = ((Float)(arrayOfPair[j]).second).floatValue();
          if (f1 < 200.0F) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool) {
            f1 = f + f4;
          } else if (f1 < 3200.0F) {
            f1 = f - 2.0F;
          } else {
            f1 = f - 4.0F;
          } 
          if (f1 > f2) {
            f = f1;
          } else {
            f = f2;
            if ((int)f2 > 9) {
              float f5 = f1;
              if (bool)
                f5 = f1 - f4; 
              f = f2;
              if ((int)f5 > 9) {
                f = f2;
                if (bool)
                  f = f2 + (f5 - 9.0F) / (3.0F - f4 / 15.0F * 2.0F); 
              } 
            } 
          } 
          j = (short)(j + 1);
          f2 = f;
        } 
        float f3 = MusicService.N0.b / 100.0F;
        j = f3 cmp 0.0F;
        if (j < 0) {
          f1 = f2 + f3;
        } else {
          f1 = f2;
        } 
        if ((int)f1 > 6) {
          i = Math.min((int)(f2 - 6.0F), 30);
          if (j >= 0 || -f3 < i)
            return i; 
        } 
      } 
    } 
    return 0.0F;
  }
  
  public final void onCreate(Bundle paramBundle) {
    LinearLayout.LayoutParams layoutParams;
    n0.a((qo)this, false);
    m92.c((Activity)this);
    super.onCreate(paramBundle);
    q0 = this;
    setContentView(2131492896);
    View view = findViewById(2131297388);
    byte b2 = 1;
    g92.c(view, true, false);
    this.S = (Spinner)findViewById(2131297521);
    this.T = (Toolbar)findViewById(2131297607);
    this.U = (LinearLayout)findViewById(2131297037);
    this.V = (ViewPager2)findViewById(2131297962);
    this.c0 = j50.h();
    g0(this.T);
    Y().f0(2131886504);
    Y().Z(true);
    Z().C();
    zm zm1 = new zm(1, this);
    this.X = zm1;
    this.S.setAdapter((SpinnerAdapter)zm1);
    ArrayList arrayList = l0();
    byte b1;
    for (b1 = 0; b1 < arrayList.size(); b1++) {
      if (((dl0)arrayList.get(b1)).c == MusicService.D0) {
        this.S.setSelection(b1);
        break;
      } 
    } 
    this.S.setOnItemSelectedListener(this);
    this.Z = new z40();
    this.a0 = new d50();
    this.Z.y0();
    this.a0.y0();
    if (MyApplication.o().getBoolean("k_b_eqrefe", false)) {
      e50 e501 = new e50();
      this.b0 = e501;
      e501.y0();
      this.Y = new ua0[] { (ua0)this.Z, (ua0)this.a0, (ua0)this.b0 };
    } else {
      this.Y = new ua0[] { (ua0)this.Z, (ua0)this.a0 };
    } 
    this.W = new h50(this, Z(), 0);
    this.V.setOffscreenPageLimit(this.Y.length);
    this.V.setAdapter((p51)this.W);
    this.V.b(this);
    int j = (int)(getResources().getDimension(2131165390) * 24.0F);
    int k = (int)(getResources().getDimension(2131165390) * 96.0F);
    int i = (int)(getResources().getDimension(2131165390) * 12.0F);
    if (this.U.getOrientation() == 0) {
      b1 = b2;
    } else {
      b1 = 0;
    } 
    if (b1 != 0) {
      layoutParams = new LinearLayout.LayoutParams(k, -1);
    } else {
      layoutParams = new LinearLayout.LayoutParams(-1, k);
    } 
    this.U.setGravity(17);
    for (b2 = 0; b2 < this.Y.length; b2++) {
      SmartImageView smartImageView = new SmartImageView((Context)this);
      if (b1 != 0) {
        smartImageView.setPadding(j, i, j, i);
      } else {
        smartImageView.setPadding(i, j, i, j);
      } 
      smartImageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      smartImageView.setVisibility(0);
      smartImageView.setScaleType(ImageView.ScaleType.CENTER);
      smartImageView.setBackground(m92.z((Context)this, 2130969899));
      smartImageView.setImageResource(this.e0[b2]);
      smartImageView.setContentDescription(this.d0[b2]);
      smartImageView.setOnClickListener((View.OnClickListener)this.h0);
      this.U.addView((View)smartImageView);
    } 
    s0();
    Spinner spinner = this.S;
    onItemSelected((AdapterView)spinner, null, spinner.getSelectedItemPosition(), this.X.getItemId(this.S.getSelectedItemPosition()));
  }
  
  public final boolean onCreateOptionsMenu(Menu paramMenu) {
    boolean bool;
    getMenuInflater().inflate(2131623936, paramMenu);
    if (this.n0 < 0.0F)
      this.n0 = o0(); 
    MenuItem menuItem = paramMenu.findItem(2131297143);
    if (this.n0 > 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    menuItem.setVisible(bool);
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  public final void onDestroy() {
    if (q0 == this)
      q0 = null; 
    super.onDestroy();
    try {
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    this.S.setSelection(paramInt);
  }
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    this.Z.E0();
    this.a0.E0();
    e50 e501 = this.b0;
    if (e501 != null)
      e501.E0(); 
  }
  
  public final void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
    String str = paramIntent.getAction();
    Uri uri = paramIntent.getData();
    if ("android.intent.action.VIEW".equals(str) && uri != null && "musicolet".equals(uri.getScheme()) && "eq".equals(uri.getHost()) && "hrt".equals(uri.getLastPathSegment())) {
      DialogInterface dialogInterface = this.o0;
      if (dialogInterface != null)
        dialogInterface.dismiss(); 
      this.V.setCurrentItem(1);
      d50 d501 = this.a0;
      float f = this.n0;
      d501.getClass();
      try {
        View view = ((ua0)d501).K;
      } finally {
        str = null;
      } 
      d501.l0.g(2131296399, true);
      ag0.z0(d501.p0, 1.0F, 30.0F, f);
      d501.F0((int)f);
      d501.G0();
      d501.m0.postDelayed((Runnable)new e(15, d501), 750L);
    } 
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    int i = paramMenuItem.getItemId();
    if (i == 16908332) {
      finish();
    } else if (i == 2131297139) {
      startActivity((new Intent((Context)this, SettingsActivity.class)).putExtra("jmparg", "mseqs").putExtra("hs", true));
    } else if (i == 2131297143) {
      if (!this.p0) {
        this.p0 = true;
        MyApplication.x().edit().putBoolean("seqhrto", true).apply();
        invalidateOptionsMenu();
      } 
      ms0 ms0 = new ms0((Context)this);
      StringBuilder stringBuilder = new StringBuilder(getString(2131886651));
      stringBuilder.append("<br/><br/>");
      stringBuilder.append(getString(2131886648));
      stringBuilder.append("<br/>• ");
      stringBuilder.append(getString(2131886649, new Object[] { Integer.valueOf((int)this.n0) }));
      stringBuilder.append(" <b>(");
      stringBuilder.append(getString(2131887107));
      stringBuilder.append(" ≤ -");
      stringBuilder.append((int)this.n0);
      stringBuilder.append("dB)</b><br/>• ");
      stringBuilder.append(getString(2131886650));
      ms0.d((CharSequence)Html.fromHtml(stringBuilder.toString()));
      ms0.n(2131887030);
      ms0.Y = (DialogInterface.OnShowListener)new f50(0, this);
      ms0.W = (DialogInterface.OnDismissListener)new un(3, this);
      ms0.p();
    } 
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public final boolean onPrepareOptionsMenu(Menu paramMenu) {
    LayerDrawable layerDrawable;
    Drawable drawable1;
    boolean bool = super.onPrepareOptionsMenu(paramMenu);
    this.p0 = MyApplication.x().getBoolean("seqhrto", false);
    MenuItem menuItem = paramMenu.findItem(2131297143);
    Drawable drawable2 = menuItem.getIcon().mutate();
    if (!this.p0) {
      drawable2 = ag0.C0(m92.y(this, 2130968903), drawable2);
      Rect rect = drawable2.getBounds();
      float f = MyApplication.p;
      int i = (int)(6.0F * f);
      int j = (int)(f * 24.0F);
      GradientDrawable gradientDrawable = new GradientDrawable();
      gradientDrawable.setShape(1);
      gradientDrawable.setColor(m92.h[3]);
      layerDrawable = new LayerDrawable(new Drawable[] { drawable2, (Drawable)gradientDrawable });
      layerDrawable.setBounds(rect);
      i = j - i;
      layerDrawable.setLayerInset(1, i, 0, 0, i);
    } else {
      float f;
      int i = m92.y(this, 2130968903);
      if (m92.f == 0) {
        f = 0.53F;
      } else {
        f = 0.895F;
      } 
      drawable1 = ag0.C0(jn.i(i, (int)(f * 255.0F)), (Drawable)layerDrawable);
    } 
    menuItem.setIcon(drawable1);
    return bool;
  }
  
  public final void onRestoreInstanceState(Bundle paramBundle) {
    super.onRestoreInstanceState(paramBundle);
    int i = paramBundle.getInt("sasidpos", 0);
    if (i > 0)
      this.S.setSelection(i); 
    i = paramBundle.getInt("vpp", 0);
    if (i > 0)
      this.V.setCurrentItem(i); 
  }
  
  public final void onResume() {
    super.onResume();
    if (this.R) {
      this.R = false;
      finish();
      startActivity(new Intent((Context)this, EqualizerActivity2.class));
    } 
  }
  
  public final void onSaveInstanceState(Bundle paramBundle) {
    paramBundle.putInt("sasidpos", this.S.getSelectedItemPosition());
    paramBundle.putInt("vpp", this.V.getCurrentItem());
  }
  
  public final int p0() {
    return ((dl0)l0().get(this.S.getSelectedItemPosition())).c;
  }
  
  public final void q(int paramInt) {
    s0();
  }
  
  public final void q0() {
    float f = o0();
    if (f != this.n0) {
      this.n0 = f;
      invalidateOptionsMenu();
    } 
  }
  
  public final void s0() {
    int j = this.V.getCurrentItem();
    int i = this.i0;
    if (i == -1) {
      for (i = 0; i < this.Y.length; i++)
        ((SmartImageView)this.U.getChildAt(i)).setColorTintIndex(7); 
    } else {
      ((SmartImageView)this.U.getChildAt(i)).setColorTintIndex(7);
    } 
    ((SmartImageView)this.U.getChildAt(j)).setColorTintIndex(5);
    this.i0 = j;
  }
  
  public final void z(int paramInt, float paramFloat) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\EqualizerActivity2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */