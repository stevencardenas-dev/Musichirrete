import android.content.res.ColorStateList;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;

public final class gn extends id1 {
  public final List d;
  
  public final int e;
  
  public final bh0 f;
  
  public gn(List paramList, int paramInt, bh0 parambh0) {
    this.d = paramList;
    this.e = paramInt;
    this.f = parambh0;
  }
  
  public final int c() {
    return this.d.size();
  }
  
  public final int f(int paramInt) {
    return (paramInt == this.e) ? 1 : 0;
  }
  
  public final void i(he1 paramhe1, int paramInt) {
    fn fn = (fn)paramhe1;
    u51 u51 = this.d.get(paramInt);
    FloatingActionButton floatingActionButton = fn.w;
    floatingActionButton.setSupportBackgroundTintList(ColorStateList.valueOf(((Integer)u51.a).intValue()));
    floatingActionButton.setSupportImageTintList(ColorStateList.valueOf(((Integer)u51.b).intValue()));
  }
  
  public final he1 j(ViewGroup paramViewGroup, int paramInt) {
    return new fn(new FloatingActionButton(paramViewGroup.getContext()), paramInt, this.f);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */