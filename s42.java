import android.media.VolumeProvider;

public final class s42 extends VolumeProvider {
  public final el a;
  
  public s42(el paramel, int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1, paramInt2, paramInt3);
  }
  
  public final void onAdjustVolume(int paramInt) {
    this.a.b(paramInt);
  }
  
  public final void onSetVolumeTo(int paramInt) {
    this.a.c(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */