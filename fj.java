import android.content.Context;
import android.view.View;
import android.view.Window;
import in.krosbits.musicolet.MostPlayedActivity;
import ss.com.bannerslider.Slider;

public final class fj implements View.OnClickListener {
  public final int b;
  
  public final Object c;
  
  public final Object e;
  
  public fj(mv1 parammv1) {
    this.e = parammv1;
    Context context = parammv1.a.getContext();
    CharSequence charSequence = parammv1.h;
    Object object = new Object();
    ((o1)object).e = 4096;
    ((o1)object).g = 4096;
    ((o1)object).l = null;
    ((o1)object).m = null;
    ((o1)object).n = false;
    ((o1)object).o = false;
    ((o1)object).p = 16;
    ((o1)object).i = context;
    ((o1)object).a = charSequence;
    this.c = object;
  }
  
  public final void onClick(View paramView) {
    Window.Callback callback;
    q41 q41;
    int i = this.b;
    Object object1 = this.c;
    Object object2 = this.e;
    switch (i) {
      default:
        object2 = object2;
        callback = ((mv1)object2).k;
        if (callback != null && ((mv1)object2).l)
          callback.onMenuItemSelected(0, (o1)object1); 
        return;
      case 1:
        object2 = object2;
        q41 = ((jn1)object2).d;
        if (q41 != null) {
          i = ((jn1)object2).h.a(((he1)object1).c());
          object1 = q41;
          object2 = ((MostPlayedActivity)object1).g0.i;
          if (i == ((Slider)object2).k) {
            int j = ((MostPlayedActivity)object1).h0.getInt("ti", 0);
            i = ((MostPlayedActivity)object1).Z.size();
            ((MostPlayedActivity)object1).h0.putInt("ti", (j + 1) % i);
            object1.t0();
          } else {
            object2.setSelectedSlide(i);
          } 
        } 
        return;
      case 0:
        break;
    } 
    gj gj = (gj)object2;
    object2 = gj.A.j;
    object1 = object1;
    ((jj)object2).t = (hv0)object1;
    object1.l(true);
    gj.x.setVisibility(4);
    gj.y.setVisibility(0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */