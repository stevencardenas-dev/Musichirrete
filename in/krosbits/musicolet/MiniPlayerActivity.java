package in.krosbits.musicolet;

import ag0;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import cn;
import dc;
import e3;
import ec;
import fc;
import ga1;
import hc;
import java.util.HashSet;
import mi2;
import ms0;
import org.jaudiotagger.tag.mp4.fwr.whGJe;
import pc;
import q6;
import qy;
import rs0;
import ss0;
import u00;
import uk.co.senab.photoview.rPq.zNBgdoocFwRhs;
import ux0;
import x5;
import z3;

public class MiniPlayerActivity extends pc implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener, fc, ec, rs0, dc, SeekBar.OnSeekBarChangeListener, View.OnClickListener, AudioManager.OnAudioFocusChangeListener {
  public static final int F0 = 0;
  
  public String A0;
  
  public String B0;
  
  public String C0;
  
  public Bitmap D0;
  
  public final e3 E0 = new e3(21, this);
  
  public Uri R;
  
  public hc S;
  
  public z3 T;
  
  public boolean U;
  
  public ImageView V;
  
  public ImageView W;
  
  public ImageView X;
  
  public ImageView Y;
  
  public TextView Z;
  
  public TextView a0;
  
  public TextView b0;
  
  public TextView c0;
  
  public TextView d0;
  
  public TextView e0;
  
  public TextView f0;
  
  public SeekBar g0;
  
  public ProgressBar h0;
  
  public boolean i0;
  
  public int j0;
  
  public Handler k0 = new Handler(Looper.getMainLooper());
  
  public AudioFocusRequest l0;
  
  public boolean m0;
  
  public boolean n0;
  
  public boolean o0;
  
  public boolean p0;
  
  public boolean q0 = false;
  
  public boolean r0 = false;
  
  public boolean s0;
  
  public String t0 = null;
  
  public String u0;
  
  public u00 v0;
  
  public q6 w0;
  
  public ss0 x0;
  
  public boolean y0 = false;
  
  public boolean z0;
  
  public static void l0(MiniPlayerActivity paramMiniPlayerActivity) {
    if (!TextUtils.isEmpty(paramMiniPlayerActivity.C0)) {
      paramMiniPlayerActivity.a0.setText(paramMiniPlayerActivity.C0);
      paramMiniPlayerActivity.a0.setVisibility(0);
    } 
    if (!TextUtils.isEmpty(paramMiniPlayerActivity.B0)) {
      paramMiniPlayerActivity.b0.setText(paramMiniPlayerActivity.B0);
      paramMiniPlayerActivity.b0.setVisibility(0);
    } 
    if (!TextUtils.isEmpty(paramMiniPlayerActivity.A0)) {
      paramMiniPlayerActivity.c0.setText(paramMiniPlayerActivity.A0);
      paramMiniPlayerActivity.c0.setVisibility(0);
    } 
    Bitmap bitmap = paramMiniPlayerActivity.D0;
    if (bitmap != null) {
      paramMiniPlayerActivity.X.setImageBitmap(bitmap);
      paramMiniPlayerActivity.X.setVisibility(0);
    } 
  }
  
  public final void E(hc paramhc) {
    try {
      this.i0 = true;
      int i = this.S.C();
      this.j0 = i;
      this.g0.setMax(i);
      return;
    } finally {
      paramhc = null;
      paramhc.printStackTrace();
    } 
  }
  
  public final void Q(ss0 paramss0, qy paramqy) {}
  
  public final void m0() {
    if (!isFinishing()) {
      this.r0 = true;
      finish();
    } 
  }
  
  public final void n0(int paramInt, boolean paramBoolean) {
    if (paramBoolean)
      this.m0 = false; 
    if (this.i0 && this.S != null)
      if (paramInt == 1) {
        try {
          if (this.o0) {
            this.o0 = false;
            if (this.n0)
              q0(); 
          } 
        } finally {
          Exception exception = null;
        } 
      } else {
        this.U = false;
        paramBoolean = s0(paramInt);
        if (paramBoolean && !this.n0) {
          this.o0 = true;
          int j = MyApplication.o().getInt("B_R_AFL", 3);
          paramBoolean = MyApplication.o().getBoolean("B_RAF_RACE", true);
          if (j >= 1 && !paramBoolean)
            this.o0 = false; 
          p0();
        } 
        int i = MyApplication.o().getInt("B_R_AFL", 3);
        if (paramInt == -3 && i == 3 && !this.n0) {
          this.p0 = true;
          hc hc1 = this.S;
          String str = ag0.a;
          hc1.c0((int)(hc1.F() * 0.4D));
          return;
        } 
      }  
  }
  
  public final void o0() {
    boolean bool;
    hc hc1 = this.S;
    if (hc1 != null && this.i0) {
      bool = hc1.A();
    } else {
      bool = false;
    } 
    m0();
    MyApplication.i.getApplicationContext().startActivity((new Intent(MyApplication.i.getApplicationContext(), MusicActivity.class)).setAction("android.intent.action.VIEW").addFlags(268435456).putExtra("data", this.t0).putExtra("jSeek", bool));
  }
  
  public final void onAudioFocusChange(int paramInt) {
    n0(paramInt, true);
  }
  
  public void onClick(View paramView) {
    int i = paramView.getId();
    if (i == 2131296879) {
      if (this.i0) {
        if (this.S.J()) {
          p0();
          return;
        } 
        q0();
        return;
      } 
    } else {
      if (i == 2131296798) {
        this.T.dismiss();
        return;
      } 
      if (i == 2131296419)
        o0(); 
    } 
  }
  
  public final void onCreate(Bundle paramBundle) {
    whGJe.IKLuhhAVdjUbQm.invoke(null, new Object[] { this, paramBundle });
  }
  
  public final void onDestroy() {
    zNBgdoocFwRhs.dgzFlLmGwWe.invoke(null, new Object[] { this });
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    m0();
  }
  
  public final void onNewIntent(Intent paramIntent) {
    super.onNewIntent(paramIntent);
    if ("android.intent.action.VIEW".equals(paramIntent.getAction())) {
      Uri uri = this.R;
      if (uri != null && !uri.equals(paramIntent.getData())) {
        finish();
        startActivity(paramIntent);
      } 
    } 
  }
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean) {
    if (paramBoolean && this.i0) {
      TextView textView = this.d0;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(ag0.B(paramInt, false, 0));
      stringBuilder.append("/");
      stringBuilder.append(ag0.B(this.j0, false, 0));
      textView.setText(stringBuilder.toString());
    } 
  }
  
  public final void onShow(DialogInterface paramDialogInterface) {
    // Byte code:
    //   0: aload_0
    //   1: getfield s0 : Z
    //   4: ifeq -> 23
    //   7: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnull -> 23
    //   15: aload_1
    //   16: invokevirtual x : ()I
    //   19: istore_2
    //   20: goto -> 25
    //   23: iconst_0
    //   24: istore_2
    //   25: iload_2
    //   26: ifle -> 36
    //   29: invokestatic b : ()Lf01;
    //   32: astore_1
    //   33: goto -> 44
    //   36: new f01
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: astore_1
    //   44: invokestatic o : ()Landroid/content/SharedPreferences;
    //   47: ldc_w 'k_i_adt'
    //   50: iconst_0
    //   51: invokeinterface getInt : (Ljava/lang/String;I)I
    //   56: ifne -> 81
    //   59: aload_0
    //   60: new w60
    //   63: dup
    //   64: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   67: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   70: iload_2
    //   71: aload_1
    //   72: invokespecial <init> : (Landroid/content/Context;ILf01;)V
    //   75: putfield S : Lhc;
    //   78: goto -> 98
    //   81: aload_0
    //   82: new n4
    //   85: dup
    //   86: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   89: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   92: invokespecial <init> : (Landroid/content/Context;)V
    //   95: putfield S : Lhc;
    //   98: aload_0
    //   99: getfield S : Lhc;
    //   102: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   105: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   108: invokevirtual G : (Landroid/content/Context;)V
    //   111: iload_2
    //   112: ifle -> 132
    //   115: aload_0
    //   116: getfield S : Lhc;
    //   119: astore_1
    //   120: aload_1
    //   121: instanceof n4
    //   124: ifeq -> 132
    //   127: aload_1
    //   128: iload_2
    //   129: invokevirtual T : (I)V
    //   132: aload_0
    //   133: getfield S : Lhc;
    //   136: invokestatic w : (Lhc;)V
    //   139: goto -> 147
    //   142: astore_1
    //   143: aload_1
    //   144: invokevirtual printStackTrace : ()V
    //   147: aload_0
    //   148: getfield S : Lhc;
    //   151: astore_1
    //   152: aload_1
    //   153: aload_0
    //   154: putfield f : Lec;
    //   157: aload_1
    //   158: aload_0
    //   159: putfield e : Ldc;
    //   162: aload_1
    //   163: aload_0
    //   164: putfield c : Lfc;
    //   167: aload_0
    //   168: getfield s0 : Z
    //   171: ifeq -> 226
    //   174: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   177: ifnull -> 226
    //   180: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   183: ifeq -> 226
    //   186: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   189: getfield j : Z
    //   192: ifne -> 226
    //   195: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   198: instanceof fl
    //   201: ifne -> 226
    //   204: aload_0
    //   205: iconst_1
    //   206: putfield U : Z
    //   209: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   212: iconst_1
    //   213: anewarray java/lang/Integer
    //   216: dup
    //   217: iconst_0
    //   218: iconst_1
    //   219: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   222: aastore
    //   223: invokevirtual X : ([Ljava/lang/Integer;)V
    //   226: aload_0
    //   227: invokevirtual r0 : ()V
    //   230: return
    // Exception table:
    //   from	to	target	type
    //   132	139	142	finally
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {
    this.z0 = true;
  }
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {
    this.z0 = false;
    if (this.i0)
      this.S.R(paramSeekBar.getProgress()); 
  }
  
  public final void p0() {
    try {
      this.S.N(MyApplication.o().getInt("k_b_fdod", 0), 2, null);
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final void q0() {
    int i = MyApplication.o().getInt("B_R_AFL", 3);
    if (i != 0 && (i != 1 || MyApplication.e().getMode() != 0)) {
      if (Build.VERSION.SDK_INT >= 26) {
        if (this.l0 == null)
          this.l0 = (new AudioFocusRequest.Builder(2)).setAudioAttributes(MusicService.x()).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this).build(); 
        i = MyApplication.e().requestAudioFocus(this.l0);
      } else {
        i = MyApplication.e().requestAudioFocus(this, 3, 2);
      } 
    } else {
      i = 1;
    } 
    if (i == 1) {
      this.S.f0(MyApplication.o().getInt("k_b_fdid", 0), 1);
      this.Y.setImageResource(2131231061);
      this.k0.post((Runnable)this.E0);
      this.n0 = false;
    } 
  }
  
  public final void r0() {
    try {
      return;
    } finally {
      Exception exception = null;
      ag0.P0(0, "Error", true);
      m0();
    } 
  }
  
  public final void s(hc paramhc) {
    p0();
    r0();
  }
  
  public final boolean s0(int paramInt) {
    boolean bool;
    int i = MyApplication.o().getInt("B_R_AFL", 3);
    if (paramInt == -3) {
      bool = true;
    } else {
      bool = false;
    } 
    if (i == 4 || (i == 3 && !bool) || (i == 2 && !bool))
      return true; 
    if (!bool) {
      if (i == 1) {
        if (MyApplication.e().getMode() != 0) {
          this.m0 = false;
          return true;
        } 
        if (!this.m0) {
          this.m0 = true;
          this.k0.postDelayed((Runnable)new ux0(this, paramInt, 0), 1000L);
        } else {
          this.m0 = false;
        } 
      } 
      if (i == 0 && Build.VERSION.SDK_INT >= 26)
        if (MyApplication.e().getMode() != 0) {
          this.m0 = false;
          if (this.i0 && this.S != null && !this.n0) {
            p0();
            q0();
            return false;
          } 
        } else {
          if (!this.m0) {
            this.m0 = true;
            this.k0.postDelayed((Runnable)new ux0(this, paramInt, 1), 1000L);
            return false;
          } 
          this.m0 = false;
        }  
    } 
    return false;
  }
  
  public final boolean v(hc paramhc, int paramInt1, int paramInt2) {
    ag0.P0(0, ga1.j("error w=", paramInt1, paramInt2, " e="), true);
    m0();
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\MiniPlayerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */