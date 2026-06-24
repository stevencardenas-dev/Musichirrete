import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import in.krosbits.musicolet.MyApplication;

public final class am0 extends pd1 {
  public final void d(Rect paramRect, View paramView, RecyclerView paramRecyclerView, de1 paramde1) {
    super.d(paramRect, paramView, paramRecyclerView, paramde1);
    paramRect.top = (int)(MyApplication.p * 8.0F);
    try {
      if (RecyclerView.M(paramView) == paramRecyclerView.getAdapter().c() - 1) {
        paramRect.bottom = paramRect.top;
        return;
      } 
      paramRect.bottom = 0;
    } catch (Exception exception) {}
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\am0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */