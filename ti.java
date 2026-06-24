import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ti extends pd1 {
  public final Paint a;
  
  public final List b;
  
  public ti() {
    Paint paint = new Paint();
    this.a = paint;
    this.b = Collections.unmodifiableList(new ArrayList());
    paint.setStrokeWidth(5.0F);
    paint.setColor(-65281);
  }
  
  public final void f(Canvas paramCanvas, RecyclerView paramRecyclerView) {
    float f = paramRecyclerView.getResources().getDimension(2131165491);
    Paint paint = this.a;
    paint.setStrokeWidth(f);
    Iterator<kl0> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      ((kl0)iterator.next()).getClass();
      paint.setColor(jn.c(0.0F, -65281, -16776961));
      if (((CarouselLayoutManager)paramRecyclerView.getLayoutManager()).S0()) {
        paramCanvas.drawLine(0.0F, ((CarouselLayoutManager)paramRecyclerView.getLayoutManager()).s.i(), 0.0F, ((CarouselLayoutManager)paramRecyclerView.getLayoutManager()).s.e(), paint);
        continue;
      } 
      paramCanvas.drawLine(((CarouselLayoutManager)paramRecyclerView.getLayoutManager()).s.f(), 0.0F, ((CarouselLayoutManager)paramRecyclerView.getLayoutManager()).s.g(), 0.0F, paint);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */