import android.database.Cursor;
import android.widget.Filter;

public final class mt extends Filter {
  public lt a;
  
  public final CharSequence convertResultToString(Object paramObject) {
    return this.a.c((Cursor)paramObject);
  }
  
  public final Filter.FilterResults performFiltering(CharSequence paramCharSequence) {
    Cursor cursor = this.a.g(paramCharSequence);
    Filter.FilterResults filterResults = new Filter.FilterResults();
    if (cursor != null) {
      filterResults.count = cursor.getCount();
      filterResults.values = cursor;
      return filterResults;
    } 
    filterResults.count = 0;
    filterResults.values = null;
    return filterResults;
  }
  
  public final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults) {
    lt lt1 = this.a;
    Cursor cursor = lt1.e;
    Object object = paramFilterResults.values;
    if (object != null && object != cursor)
      lt1.b((Cursor)object); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */