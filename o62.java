import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

public class o62 extends n62 {
  public o62(x62 paramx62, WindowInsets paramWindowInsets) {
    super(paramx62, paramWindowInsets);
  }
  
  public x62 a() {
    return x62.h(null, this.c.consumeDisplayCutout());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof o62))
      return false; 
    paramObject = paramObject;
    return (Objects.equals(this.c, ((m62)paramObject).c) && Objects.equals(this.g, ((m62)paramObject).g) && m62.L(this.h, ((m62)paramObject).h));
  }
  
  public g00 g() {
    DisplayCutout displayCutout = this.c.getDisplayCutout();
    return (displayCutout == null) ? null : new g00(displayCutout);
  }
  
  public int hashCode() {
    return this.c.hashCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */