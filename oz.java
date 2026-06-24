import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import in.krosbits.musicolet.MusicService;
import in.krosbits.musicolet.MyApplication;

public final class oz implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, rs0 {
  public bh0 b;
  
  public RecyclerView c;
  
  public ij0 e;
  
  public LayoutInflater f;
  
  public MusicService g;
  
  public xn1 h;
  
  public a3 i;
  
  public xn1 j;
  
  public ss0 k;
  
  public Context l;
  
  public oz(Context paramContext, MusicService paramMusicService, int paramInt, bh0 parambh0) {
    if (paramMusicService == null)
      return; 
    this.l = paramContext;
    ms0 ms0 = new ms0(paramContext);
    this.b = parambh0;
    this.g = paramMusicService;
    boolean bool = MusicService.C0;
    this.j = (MyApplication.h()).b.get(paramInt);
    this.f = LayoutInflater.from(paramContext);
    this.c = new RecyclerView(paramContext);
    paramInt = (int)paramContext.getResources().getDimension(2131165392);
    this.c.setPadding(paramInt, paramInt * 2, paramInt, paramInt);
    a3 a31 = new a3(5, this);
    this.i = a31;
    this.c.setAdapter(a31);
    this.c.setLayoutManager((a)new LinearLayoutManager(1));
    ms0.f((View)this.c, false);
    ms0.q(2131887136);
    Drawable drawable = paramContext.getResources().getDrawable(2131231375).mutate();
    ag0.C0(m92.h[5], drawable);
    ms0.S = drawable;
    ms0.W = this;
    ms0.X = this;
    this.e = new ij0(new kz(0, this));
    if (MyApplication.o().getBoolean("k_b_sclqod", true) && (MyApplication.h()).b.size() > 1) {
      ms0.l(2131887168);
      ms0.D = this;
    } 
    this.e.g(this.c);
    this.k = new ss0(ms0);
  }
  
  public static void a(oz paramoz, int paramInt) {
    try {
      boolean bool = MusicService.C0;
      xn1 xn11 = (MyApplication.h()).b.get(paramInt);
      paramoz.g.t(paramInt);
      if (paramoz.j == xn11 && paramInt >= (MyApplication.h()).b.size()) {
        paramoz.j = (MyApplication.h()).b.get((MyApplication.h()).b.size() - 1);
        paramoz.b.x((MyApplication.h()).b.size() - 1);
      } 
      return;
    } finally {
      paramoz = null;
      paramoz.printStackTrace();
    } 
  }
  
  public final void Q(ss0 paramss0, qy paramqy) {
    if (paramqy == qy.c)
      try {
        if (MyApplication.o().getBoolean("k_b_cnfbrque", true)) {
          ms0 ms0 = new ms0();
          this(this.l);
          ms0.q(2131886202);
          ms0.c(2131887168);
          ms0.k(2131886989);
          ms0.n(2131887604);
          tp tp = new tp();
          this(16);
          ms0.A = tp;
          return;
        } 
        return;
      } finally {
        paramss0 = null;
      }  
  }
  
  public final void onCancel(DialogInterface paramDialogInterface) {
    bh0 bh01 = this.b;
    if (bh01 != null) {
      lb1 lb1 = (lb1)bh01.c;
      lb1.H0();
      lb1.d0 = null;
    } 
    ij0 ij01 = this.e;
    if (ij01 != null)
      ij01.g(null); 
    RecyclerView recyclerView = this.c;
    if (recyclerView != null) {
      recyclerView.setLayoutManager(null);
      this.c.setAdapter(null);
    } 
    this.e = null;
    this.b = null;
    this.i = null;
    this.c = null;
    this.g = null;
    this.k = null;
    this.j = null;
    this.l = null;
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    bh0 bh01 = this.b;
    if (bh01 != null) {
      lb1 lb1 = (lb1)bh01.c;
      lb1.H0();
      lb1.d0 = null;
    } 
    ij0 ij01 = this.e;
    if (ij01 != null)
      ij01.g(null); 
    RecyclerView recyclerView = this.c;
    if (recyclerView != null) {
      recyclerView.setLayoutManager(null);
      this.c.setAdapter(null);
    } 
    this.e = null;
    this.b = null;
    this.c = null;
    this.i = null;
    this.g = null;
    this.f = null;
    this.h = null;
    this.k = null;
    this.j = null;
    this.l = null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */