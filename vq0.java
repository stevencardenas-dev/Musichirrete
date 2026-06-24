import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.afollestad.materialdialogs.internal.MDRootLayout;

public final class vq0 implements ViewTreeObserver.OnPreDrawListener {
  public final View b;
  
  public final boolean c;
  
  public final MDRootLayout e;
  
  public vq0(MDRootLayout paramMDRootLayout, View paramView, boolean paramBoolean) {
    this.e = paramMDRootLayout;
    this.b = paramView;
    this.c = paramBoolean;
  }
  
  public final boolean onPreDraw() {
    View view = this.b;
    if (view.getMeasuredHeight() != 0) {
      WebView webView = (WebView)view;
      int i = MDRootLayout.u;
      float f1 = webView.getMeasuredHeight();
      float f2 = webView.getContentHeight();
      float f3 = webView.getScale();
      boolean bool = this.c;
      MDRootLayout mDRootLayout = this.e;
      if (f1 < f3 * f2) {
        mDRootLayout.b((ViewGroup)view, bool);
      } else {
        if (bool)
          mDRootLayout.e = false; 
        mDRootLayout.f = false;
      } 
      view.getViewTreeObserver().removeOnPreDrawListener(this);
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */