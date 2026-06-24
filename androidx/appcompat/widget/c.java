package androidx.appcompat.widget;

import android.view.View;

public final class c implements View.OnClickListener {
  public final SearchView b;
  
  public c(SearchView paramSearchView) {
    this.b = paramSearchView;
  }
  
  public final void onClick(View paramView) {
    SearchView searchView = this.b;
    if (paramView == searchView.mSearchButton) {
      searchView.onSearchClicked();
      return;
    } 
    if (paramView == searchView.mCloseButton) {
      searchView.onCloseClicked();
      return;
    } 
    if (paramView == searchView.mGoButton) {
      searchView.onSubmitQuery();
      return;
    } 
    if (paramView == searchView.mVoiceButton) {
      searchView.onVoiceClicked();
      return;
    } 
    if (paramView == searchView.mSearchSrcTextView)
      searchView.forceSuggestionQuery(); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */