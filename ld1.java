import android.view.View;

public abstract class ld1 {
  public static void a(View paramView, float paramFloat) {
    try {
      paramView.setFrameContentVelocity(paramFloat);
    } catch (LinkageError linkageError) {}
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ld1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */