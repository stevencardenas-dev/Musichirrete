import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import in.krosbits.android.widgets.LyricsView;
import in.krosbits.musicolet.LockScreenActivity;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public final class zl0 implements rq0, View.OnClickListener {
  public View b;
  
  public TextView c;
  
  public TextView e;
  
  public LyricsView f;
  
  public km0 g;
  
  public xp0 h;
  
  public bp1 i;
  
  public final int E() {
    try {
      if (MusicService.P0 != null && MusicService.F0) {
        hc hc = MusicService.E0;
        if (hc != null)
          return hc.A(); 
      } 
    } finally {
      Exception exception = null;
    } 
  }
  
  public final boolean a() {
    return false;
  }
  
  public final boolean b() {
    return (this.b.getVisibility() == 0);
  }
  
  public final void c() {
    xp0 xp02 = this.h;
    byte b = 0;
    xp0 xp01 = xp02;
    if (xp02 == null) {
      xp01 = new xp0(null, "⏳", false);
      xp01.f = true;
      xp01.g = true;
    } 
    this.f.w0(xp01, this);
    boolean bool = xp01.e;
    TextView textView = this.c;
    if (bool) {
      textView.setText(2131886472);
    } else {
      textView.setText(2131886488);
    } 
    textView = this.e;
    if (xp01.g)
      b = 8; 
    textView.setVisibility(b);
  }
  
  public final void d(km0 paramkm0) {
    this.g = paramkm0;
    if (this.f.getVisibility() != 0)
      return; 
    LockScreenActivity lockScreenActivity = LockScreenActivity.a1;
    km0 km01 = this.g;
    if (km01 != null && lockScreenActivity != null) {
      iq0 iq0;
      xp0 xp01 = this.h;
      if (xp01 != null) {
        wo wo = xp01.c;
        if (wo != null && wo.equals(km01.c.f)) {
          c();
          return;
        } 
      } 
      if (Integer.parseInt(MyApplication.o().getString("k_i_prflrsc", "0")) == 0) {
        iq0 = iq0.c;
      } else {
        iq0 = iq0.e;
      } 
      cs1 cs1 = cq0.a;
      rm0 rm0 = g92.E((um0)lockScreenActivity);
      bp1 bp11 = this.i;
      yl0 yl0 = new yl0(this, km01, lockScreenActivity);
      iq0.getClass();
      this.i = qv.L(rm0, null, null, new bq0(bp11, km01, iq0, yl0, null), 3);
      return;
    } 
    this.e.setVisibility(8);
  }
  
  public final boolean f() {
    try {
      MusicService musicService = MusicService.P0;
      if (musicService != null && MusicService.F0 && MusicService.E0 != null) {
        boolean bool = musicService.j;
        return bool ^ true;
      } 
    } finally {
      Exception exception;
    } 
    return false;
  }
  
  public final float k() {
    try {
      if (MusicService.E0 != null && MusicService.P0 != null)
        return MusicService.E0.E(); 
    } finally {
      Exception exception;
    } 
    return 1.0F;
  }
  
  public final void l() {
    try {
      LockScreenActivity.a1.t0();
    } finally {
      Exception exception;
    } 
  }
  
  public final void m(int paramInt) {
    try {
      Context context = MyApplication.i.getApplicationContext();
      Intent intent = new Intent();
      this(MyApplication.i.getApplicationContext(), MusicService.class);
      context.startService(intent.setAction("ACTION_SEEK").putExtra("EXTRA_SEEKMILL", paramInt));
    } finally {
      Exception exception;
    } 
  }
  
  public final void onClick(View paramView) {
    LockScreenActivity lockScreenActivity;
    if (paramView.getId() == 2131297741) {
      MyApplication.i.getApplicationContext().startActivity((new Intent(MyApplication.i.getApplicationContext(), MusicActivity.class)).setAction("jump_player").addFlags(335544320).putExtra("jump_key", "jump_player").putExtra("extlrc", true).putExtra("smooth", false));
      lockScreenActivity = LockScreenActivity.a1;
      if (lockScreenActivity != null) {
        lockScreenActivity.u0();
        return;
      } 
    } else if (lockScreenActivity == this.c) {
      MyApplication.i.getApplicationContext().startActivity((new Intent(MyApplication.i.getApplicationContext(), MusicActivity.class)).setAction("jump_player").addFlags(335544320).putExtra("jump_key", "jump_player").putExtra("exlrsrc", true).putExtra("smooth", false));
      lockScreenActivity = LockScreenActivity.a1;
      if (lockScreenActivity != null)
        lockScreenActivity.u0(); 
    } 
  }
  
  public final int q() {
    try {
      if (MusicService.P0 != null && MusicService.F0) {
        hc hc = MusicService.E0;
        if (hc != null)
          return hc.C(); 
      } 
    } finally {
      Exception exception = null;
    } 
  }
  
  public final void t() {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zl0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */