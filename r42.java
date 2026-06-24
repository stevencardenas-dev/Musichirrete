import android.media.VolumeProvider;

public final class r42 extends VolumeProvider {
  public final el a;
  
  public r42(el paramel, int paramInt1, int paramInt2, int paramInt3, String paramString) {
    super(paramInt1, paramInt2, paramInt3, paramString);
  }
  
  public final void onAdjustVolume(int paramInt) {
    this.a.b(paramInt);
  }
  
  public final void onSetVolumeTo(int paramInt) {
    this.a.c(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */