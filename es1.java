import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class es1 extends View {
  public final ViewGroup b;
  
  public final gs1 c;
  
  public es1(gs1 paramgs1, Context paramContext, ViewGroup paramViewGroup) {
    super(paramContext);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    boolean bool;
    gs1 gs11 = this.c;
    ArrayList<xa1> arrayList = gs11.b;
    Drawable drawable = this.b.getBackground();
    if (drawable instanceof ColorDrawable) {
      bool = ((ColorDrawable)drawable).getColor();
    } else {
      bool = false;
    } 
    if (gs11.e != bool) {
      gs11.e = bool;
      for (int i = arrayList.size() - 1; i >= 0; i--)
        ((xa1)arrayList.get(i)).b(bool); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\es1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */