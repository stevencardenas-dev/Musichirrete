import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

public final class qj1 implements TextView.OnEditorActionListener {
  public final SearchView a;
  
  public qj1(SearchView paramSearchView) {
    this.a = paramSearchView;
  }
  
  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent) {
    this.a.onSubmitQuery();
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */