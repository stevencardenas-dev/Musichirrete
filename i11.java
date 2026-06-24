import android.app.PictureInPictureUiState;
import android.os.Build;
import androidx.core.widget.NestedScrollView;

public abstract class i11 {
  public static zb0 a(PictureInPictureUiState paramPictureInPictureUiState) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 35) {
      paramPictureInPictureUiState.isStashed();
      paramPictureInPictureUiState.isTransitioningToPip();
      return new zb0(7);
    } 
    if (i >= 31) {
      paramPictureInPictureUiState.isStashed();
      return new zb0(7);
    } 
    return new zb0(7);
  }
  
  public static void b(NestedScrollView paramNestedScrollView, float paramFloat) {
    try {
      paramNestedScrollView.setFrameContentVelocity(paramFloat);
    } catch (LinkageError linkageError) {}
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */