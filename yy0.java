import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MusicService;

public final class yy0 implements kt1 {
  public final int a;
  
  public final ContextWrapper b;
  
  private final void d() {}
  
  private final void e(Drawable paramDrawable) {}
  
  public final void a(Drawable paramDrawable) {
    switch (this.a) {
      default:
        return;
      case 0:
        break;
    } 
    MusicActivity musicActivity = (MusicActivity)this.b;
    if (musicActivity.U.getCurrentItem() == 1 && musicActivity.Y == 0 && musicActivity.p0)
      musicActivity.q0.setImageDrawable(paramDrawable); 
  }
  
  public final void b() {
    switch (this.a) {
      default:
        return;
      case 0:
        break;
    } 
    ((MusicActivity)this.b).z0();
  }
  
  public final void c(Bitmap paramBitmap) {
    MusicService musicService;
    int i = this.a;
    ContextWrapper contextWrapper = this.b;
    switch (i) {
      default:
        musicService = (MusicService)contextWrapper;
        try {
          if (MusicService.F0 && MusicService.E0 != null) {
            musicService.F(paramBitmap, true);
            musicService.v.postDelayed(musicService.g0, 500L);
          } 
        } finally {
          paramBitmap = null;
        } 
      case 0:
        break;
    } 
    MusicActivity musicActivity = (MusicActivity)musicService;
    try {
      if (musicActivity.U.getCurrentItem() == 1 && musicActivity.Y == 0) {
        MusicActivity.l0(musicActivity);
        BitmapDrawable bitmapDrawable = new BitmapDrawable();
        this(musicActivity.getResources(), paramBitmap);
        musicActivity.r0 = paramBitmap;
        musicActivity.q0.setImageDrawable((Drawable)bitmapDrawable);
      } 
    } finally {
      paramBitmap = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */