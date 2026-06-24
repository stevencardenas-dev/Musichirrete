import android.view.ScrollFeedbackProvider;
import android.view.View;
import androidx.core.widget.NestedScrollView;

public final class ij1 implements jj1 {
  public final ScrollFeedbackProvider b;
  
  public ij1(NestedScrollView paramNestedScrollView) {
    this.b = ScrollFeedbackProvider.createProvider((View)paramNestedScrollView);
  }
  
  public final void h(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {
    this.b.onScrollLimit(paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public final void onScrollProgress(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.b.onScrollProgress(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ij1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */