import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class u91 extends pd1 {
  public Drawable a;
  
  public int b;
  
  public boolean c;
  
  public final w91 d;
  
  public u91(w91 paramw91) {
    this.d = paramw91;
    this.c = true;
  }
  
  public final void d(Rect paramRect, View paramView, RecyclerView paramRecyclerView, de1 paramde1) {
    if (g(paramView, paramRecyclerView))
      paramRect.bottom = this.b; 
  }
  
  public final void f(Canvas paramCanvas, RecyclerView paramRecyclerView) {
    if (this.a != null) {
      int i = paramRecyclerView.getChildCount();
      int j = paramRecyclerView.getWidth();
      for (byte b = 0; b < i; b++) {
        View view = paramRecyclerView.getChildAt(b);
        if (g(view, paramRecyclerView)) {
          int k = (int)view.getY();
          k = view.getHeight() + k;
          this.a.setBounds(0, k, j, this.b + k);
          this.a.draw(paramCanvas);
        } 
      } 
    } 
  }
  
  public final boolean g(View paramView, RecyclerView paramRecyclerView) {
    he1 he1 = paramRecyclerView.N(paramView);
    if (he1 instanceof da1 && ((da1)he1).A) {
      boolean bool = this.c;
      int i = paramRecyclerView.indexOfChild(paramView);
      if (i < paramRecyclerView.getChildCount() - 1) {
        he1 he11 = paramRecyclerView.N(paramRecyclerView.getChildAt(i + 1));
        if (he11 instanceof da1 && ((da1)he11).z)
          return true; 
      } else {
        return bool;
      } 
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */