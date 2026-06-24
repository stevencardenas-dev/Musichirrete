import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class i0 extends ClickableSpan {
  public final int b;
  
  public final t0 c;
  
  public final int e;
  
  public i0(int paramInt1, t0 paramt0, int paramInt2) {
    this.b = paramInt1;
    this.c = paramt0;
    this.e = paramInt2;
  }
  
  public final void onClick(View paramView) {
    Bundle bundle = new Bundle();
    bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.b);
    int i = this.e;
    this.c.a.performAction(i, bundle);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */