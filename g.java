import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class g implements w32 {
  public boolean a;
  
  public int b;
  
  public final View c;
  
  public g(ActionBarContextView paramActionBarContextView) {
    this.c = (View)paramActionBarContextView;
    this.a = false;
  }
  
  public g(FloatingActionButton paramFloatingActionButton) {
    this.a = false;
    this.b = 0;
    this.c = (View)paramFloatingActionButton;
  }
  
  public void a() {
    if (this.a)
      return; 
    ActionBarContextView actionBarContextView = (ActionBarContextView)this.c;
    actionBarContextView.h = null;
    ActionBarContextView.b(actionBarContextView, this.b);
  }
  
  public void b() {
    this.a = true;
  }
  
  public void c() {
    ActionBarContextView.a((ActionBarContextView)this.c);
    this.a = false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */