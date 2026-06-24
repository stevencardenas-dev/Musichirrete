import android.widget.SeekBar;
import in.krosbits.musicolet.MusicService;

public final class dj extends dv0 {
  public final int a;
  
  public final Object b;
  
  public void d(iv0 paramiv0, hv0 paramhv0) {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        return;
      case 1:
        ((eu0)object).g();
        return;
      case 0:
        break;
    } 
    ((jj)object).f();
  }
  
  public final void e(iv0 paramiv0, hv0 paramhv0) {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        MusicService.b((MusicService)object);
        return;
      case 2:
        ((qu0)object).q(true);
        return;
      case 1:
        ((eu0)object).g();
        return;
      case 0:
        break;
    } 
    ((jj)object).f();
  }
  
  public void h(iv0 paramiv0) {
    switch (this.a) {
      default:
        return;
      case 3:
        break;
    } 
    MusicService.b((MusicService)this.b);
  }
  
  public void i(iv0 paramiv0, hv0 paramhv0) {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        return;
      case 1:
        ((eu0)object).g();
        return;
      case 0:
        break;
    } 
    ((jj)object).f();
  }
  
  public void j(hv0 paramhv0) {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        return;
      case 1:
        ((eu0)object).dismiss();
        return;
      case 0:
        break;
    } 
    ((jj)object).dismiss();
  }
  
  public void k(iv0 paramiv0, hv0 paramhv0, int paramInt) {
    switch (this.a) {
      default:
        super.k(paramiv0, paramhv0, paramInt);
        return;
      case 3:
        break;
    } 
    if (paramInt != 0)
      MusicService.b((MusicService)this.b); 
  }
  
  public void m() {
    switch (this.a) {
      default:
        return;
      case 2:
        break;
    } 
    ((qu0)this.b).q(false);
  }
  
  public void o(hv0 paramhv0) {
    switch (this.a) {
      default:
        return;
      case 2:
        break;
    } 
    qu0 qu0 = (qu0)this.b;
    SeekBar seekBar = (SeekBar)qu0.U.get(paramhv0);
    int i = paramhv0.p;
    int j = qu0.s0;
    if (seekBar != null && qu0.P != paramhv0)
      seekBar.setProgress(i); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */