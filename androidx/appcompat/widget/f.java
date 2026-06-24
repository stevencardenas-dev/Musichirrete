package androidx.appcompat.widget;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class f implements Runnable {
  public final SearchView.SearchAutoComplete b;
  
  public f(SearchView.SearchAutoComplete paramSearchAutoComplete) {
    this.b = paramSearchAutoComplete;
  }
  
  public final void run() {
    SearchView.SearchAutoComplete searchAutoComplete = this.b;
    if (searchAutoComplete.i) {
      ((InputMethodManager)searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput((View)searchAutoComplete, 0);
      searchAutoComplete.i = false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */