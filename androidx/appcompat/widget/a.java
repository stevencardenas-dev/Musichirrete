package androidx.appcompat.widget;

import lt;

public final class a implements Runnable {
  public final SearchView b;
  
  public a(SearchView paramSearchView) {
    this.b = paramSearchView;
  }
  
  public final void run() {
    lt lt = this.b.mSuggestionsAdapter;
    if (lt instanceof vq1)
      lt.b(null); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */