import android.view.View;
import android.view.ViewGroup;

public final class h6 implements Runnable {
  public final int b;
  
  public final u6 c;
  
  public final void run() {
    u32 u32;
    int i = this.b;
    u6 u61 = this.c;
    switch (i) {
      default:
        u61.x.showAtLocation((View)u61.w, 55, 0, 0);
        u32 = u61.z;
        if (u32 != null)
          u32.b(); 
        if (u61.B) {
          ViewGroup viewGroup = u61.C;
          if (viewGroup != null && viewGroup.isLaidOut()) {
            u61.w.setAlpha(0.0F);
            u32 u321 = v22.a((View)u61.w);
            u321.a(1.0F);
            u61.z = u321;
            u321.d(new j6(0, this));
            return;
          } 
        } 
        u61.w.setAlpha(1.0F);
        u61.w.setVisibility(0);
        return;
      case 0:
        break;
    } 
    if ((u61.b0 & 0x1) != 0)
      u61.v(0); 
    if ((u61.b0 & 0x1000) != 0)
      u61.v(108); 
    u61.a0 = false;
    u61.b0 = 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */