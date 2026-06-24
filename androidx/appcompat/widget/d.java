package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

public final class d implements View.OnKeyListener {
  public final SearchView b;
  
  public d(SearchView paramSearchView) {
    this.b = paramSearchView;
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    SearchView searchView = this.b;
    if (searchView.mSearchable != null) {
      if (searchView.mSearchSrcTextView.isPopupShowing() && searchView.mSearchSrcTextView.getListSelection() != -1)
        return searchView.onSuggestionsKey(paramView, paramInt, paramKeyEvent); 
      if (TextUtils.getTrimmedLength((CharSequence)searchView.mSearchSrcTextView.getText()) != 0 && paramKeyEvent.hasNoModifiers() && paramKeyEvent.getAction() == 1 && paramInt == 66) {
        paramView.cancelLongPress();
        searchView.launchQuerySearch(0, null, searchView.mSearchSrcTextView.getText().toString());
        return true;
      } 
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */