import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;

public final class wq0 extends vd1 {
  public final ViewGroup a;
  
  public final boolean b;
  
  public final MDRootLayout c;
  
  public wq0(MDRootLayout paramMDRootLayout, ViewGroup paramViewGroup, boolean paramBoolean) {
    this.c = paramMDRootLayout;
    this.a = paramViewGroup;
    this.b = paramBoolean;
  }
  
  public final void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    boolean bool1;
    MDRootLayout mDRootLayout = this.c;
    MDButton[] arrayOfMDButton = mDRootLayout.g;
    paramInt2 = arrayOfMDButton.length;
    boolean bool2 = false;
    paramInt1 = 0;
    while (true) {
      bool1 = bool2;
      if (paramInt1 < paramInt2) {
        MDButton mDButton = arrayOfMDButton[paramInt1];
        if (mDButton != null && mDButton.getVisibility() != 8) {
          bool1 = true;
          break;
        } 
        paramInt1++;
        continue;
      } 
      break;
    } 
    MDRootLayout.a(mDRootLayout, this.a, this.b, bool1);
    mDRootLayout.invalidate();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */