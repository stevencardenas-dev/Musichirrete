import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import in.krosbits.musicolet.LyricsEditActivity;
import java.util.ArrayList;

public final class yr1 extends id1 {
  public final LyricsEditActivity d;
  
  public final ArrayList e;
  
  public final boolean f;
  
  public yr1(ArrayList paramArrayList, LyricsEditActivity paramLyricsEditActivity, boolean paramBoolean) {
    this.e = paramArrayList;
    this.d = paramLyricsEditActivity;
    this.f = paramBoolean;
  }
  
  public final int c() {
    return this.e.size();
  }
  
  public final int f(int paramInt) {
    return (((xr1)this.e.get(paramInt)).a < 0L) ? 1 : 3;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    zr1 zr1 = (zr1)paramhe1;
    int i = zr1.A;
    TextView textView = zr1.x;
    if (i != 0) {
      ArrayList<xr1> arrayList = this.e;
      if (i == 1) {
        textView.setText(((xr1)arrayList.get(paramInt)).b);
        return;
      } 
      if (i == 3) {
        xr1 xr1 = arrayList.get(paramInt);
        textView.setText(xr1.b);
        zr1.w.setText(n21.D(xr1.a, this.f, false));
      } 
    } 
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    return new zr1(LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493056, paramViewGroup, false), paramInt, this.d);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */