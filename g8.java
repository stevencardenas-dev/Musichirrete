import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

public class g8 extends i8 {
  public void a(StaticLayout.Builder paramBuilder, TextView paramTextView) {
    paramBuilder.setTextDirection((TextDirectionHeuristic)j8.e(paramTextView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */