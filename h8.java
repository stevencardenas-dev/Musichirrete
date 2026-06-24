import android.text.StaticLayout;
import android.widget.TextView;

public final class h8 extends g8 {
  public void a(StaticLayout.Builder paramBuilder, TextView paramTextView) {
    paramBuilder.setTextDirection(paramTextView.getTextDirectionHeuristic());
  }
  
  public boolean b(TextView paramTextView) {
    return paramTextView.isHorizontallyScrollable();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */