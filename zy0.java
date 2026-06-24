import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.MyApplication;
import java.util.Stack;

public final class zy0 implements r32 {
  public final MusicActivity b;
  
  public zy0(MusicActivity paramMusicActivity) {
    this.b = paramMusicActivity;
  }
  
  public final void k(int paramInt) {
    MusicActivity musicActivity = this.b;
    musicActivity.Y = paramInt;
    int i = musicActivity.U.getCurrentItem();
    if (paramInt == 0 && i == 1) {
      musicActivity.B0();
    } else {
      musicActivity.z0();
    } 
    v61 v61 = MyApplication.v;
    if (v61 != null) {
      c00 c00 = v61.c;
      if (paramInt == 0) {
        cj = c00.h;
        cj.sendMessage(cj.obtainMessage(12, "s"));
        return;
      } 
      cj cj = ((c00)cj).h;
      cj.sendMessage(cj.obtainMessage(11, "s"));
    } 
  }
  
  public final void q(int paramInt) {
    MusicActivity musicActivity = this.b;
    Stack<Integer> stack = musicActivity.A0;
    if (paramInt == 1)
      musicActivity.d0.Y0(); 
    musicActivity.P0();
    ly0 ly0 = musicActivity.t0;
    if (ly0 != null)
      ly0.j(); 
    musicActivity.O0();
    musicActivity.N0();
    if (musicActivity.B0) {
      musicActivity.B0 = false;
      return;
    } 
    if (stack.contains(Integer.valueOf(paramInt)))
      stack.remove(Integer.valueOf(paramInt)); 
    stack.push(Integer.valueOf(paramInt));
  }
  
  public final void z(int paramInt, float paramFloat) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */