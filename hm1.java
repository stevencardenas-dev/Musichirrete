import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

public final class hm1 extends ViewOutlineProvider {
  public final Rect a = new Rect();
  
  public final ShapeableImageView b;
  
  public hm1(ShapeableImageView paramShapeableImageView) {}
  
  public final void getOutline(View paramView, Outline paramOutline) {
    ShapeableImageView shapeableImageView = this.b;
    if (shapeableImageView.n == null)
      return; 
    if (shapeableImageView.m == null)
      shapeableImageView.m = new ws0(shapeableImageView.n); 
    RectF rectF = shapeableImageView.g;
    Rect rect = this.a;
    rectF.round(rect);
    shapeableImageView.m.setBounds(rect);
    shapeableImageView.m.getOutline(paramOutline);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */