import androidx.recyclerview.widget.a;
import com.google.android.material.carousel.CarouselLayoutManager;

public final class ui extends gj0 {
  public final int d;
  
  public final CarouselLayoutManager e;
  
  public ui(CarouselLayoutManager paramCarouselLayoutManager, int paramInt) {
    super(0);
  }
  
  public final int e() {
    int i = this.d;
    CarouselLayoutManager carouselLayoutManager = this.e;
    switch (i) {
      default:
        return ((a)carouselLayoutManager).q - carouselLayoutManager.getPaddingBottom();
      case 0:
        break;
    } 
    return ((a)carouselLayoutManager).q;
  }
  
  public final int f() {
    switch (this.d) {
      default:
        return 0;
      case 0:
        break;
    } 
    return this.e.getPaddingLeft();
  }
  
  public final int g() {
    int i = this.d;
    CarouselLayoutManager carouselLayoutManager = this.e;
    switch (i) {
      default:
        return ((a)carouselLayoutManager).p;
      case 0:
        break;
    } 
    return ((a)carouselLayoutManager).p - carouselLayoutManager.getPaddingRight();
  }
  
  public final int h() {
    CarouselLayoutManager carouselLayoutManager;
    int j = this.d;
    byte b = 0;
    int i = b;
    switch (j) {
      default:
        carouselLayoutManager = this.e;
        i = b;
        if (carouselLayoutManager.T0())
          i = ((a)carouselLayoutManager).p; 
        break;
      case 0:
        break;
    } 
    return i;
  }
  
  public final int i() {
    switch (this.d) {
      default:
        return this.e.getPaddingTop();
      case 0:
        break;
    } 
    return 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */