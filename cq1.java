import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import in.krosbits.musicolet.MyApplication;

public final class cq1 extends he1 implements View.OnClickListener, View.OnLongClickListener {
  public TextView A;
  
  public TextView B;
  
  public TextView C;
  
  public ProgressBar D;
  
  public View E;
  
  public View F;
  
  public Button G;
  
  public Button H;
  
  public wp1 w;
  
  public ViewGroup x;
  
  public ImageView y;
  
  public ImageView z;
  
  public final void onClick(View paramView) {
    wp1 wp11 = this.w;
    int i = c();
    if (i >= 0) {
      if (paramView == this.x || paramView == this.H) {
        wp11.v(i);
        return;
      } 
      if (paramView == this.G) {
        int j = paramView.getId();
        if (j == 2131296400) {
          wp11.v(i);
          return;
        } 
        if (j == 2131296369) {
          wp11.J0(wp11.v0.get(i));
          return;
        } 
        wp11.getClass();
        return;
      } 
    } 
  }
  
  public final boolean onLongClick(View paramView) {
    int i = c();
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i >= 0) {
      wp1 wp11 = this.w;
      wp11.getClass();
      if (!MyApplication.F.p()) {
        bool1 = bool2;
      } else {
        xp1 xp1 = wp11.v0.get(i);
        String str = ag0.Q(xp1.e);
        str = MyApplication.v().getString(str, null);
        if (str != null) {
          try {
            Uri uri = Uri.parse(str);
          } finally {
            str = null;
            str.printStackTrace();
          } 
          return bool1;
        } 
        str = null;
      } 
    } 
    return bool1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */