import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

public final class y52 extends c62 {
  public static final PathInterpolator e = new PathInterpolator(0.0F, 1.1F, 0.0F, 1.0F);
  
  public static final o70 f = new o70(0);
  
  public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5F);
  
  public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5F);
  
  public static void f(d62 paramd62, View paramView) {
    hd hd = j(paramView);
    if (hd != null) {
      hd.h(paramd62);
      return;
    } 
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      for (byte b = 0; b < viewGroup.getChildCount(); b++)
        f(paramd62, viewGroup.getChildAt(b)); 
    } 
  }
  
  public static void g(View paramView, d62 paramd62, x62 paramx62, boolean paramBoolean) {
    hd hd = j(paramView);
    boolean bool = paramBoolean;
    if (hd != null) {
      hd.a = paramx62;
      bool = paramBoolean;
      if (!paramBoolean) {
        hd.i(paramd62);
        bool = true;
      } 
    } 
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      for (byte b = 0; b < viewGroup.getChildCount(); b++)
        g(viewGroup.getChildAt(b), paramd62, paramx62, bool); 
    } 
  }
  
  public static void h(View paramView, x62 paramx62, List paramList) {
    hd hd = j(paramView);
    if (hd != null) {
      hd.j(paramx62, paramList);
      return;
    } 
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      for (byte b = 0; b < viewGroup.getChildCount(); b++)
        h(viewGroup.getChildAt(b), paramx62, paramList); 
    } 
  }
  
  public static void i(View paramView, d62 paramd62, j01 paramj01) {
    hd hd = j(paramView);
    if (hd != null) {
      hd.k(paramd62, paramj01);
      return;
    } 
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      for (byte b = 0; b < viewGroup.getChildCount(); b++)
        i(viewGroup.getChildAt(b), paramd62, paramj01); 
    } 
  }
  
  public static hd j(View paramView) {
    Object object = paramView.getTag(2131297588);
    return (object instanceof x52) ? ((x52)object).a : null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */