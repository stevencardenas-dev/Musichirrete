import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

public final class si extends kn0 {
  public final int q;
  
  public si(CarouselLayoutManager paramCarouselLayoutManager, Context paramContext) {
    super(paramContext);
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    switch (this.q) {
      default:
        return super.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      case 1:
        break;
    } 
    return (paramInt4 - paramInt3) / 2 + paramInt3 - (paramInt2 - paramInt1) / 2 + paramInt1;
  }
  
  public int b(View paramView, int paramInt) {
    switch (this.q) {
      default:
        return super.b(paramView, paramInt);
      case 0:
        break;
    } 
    return 0;
  }
  
  public int c(View paramView, int paramInt) {
    switch (this.q) {
      default:
        return super.c(paramView, paramInt);
      case 0:
        break;
    } 
    return 0;
  }
  
  public PointF f(int paramInt) {
    switch (this.q) {
      default:
        return super.f(paramInt);
      case 0:
        break;
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\si.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */