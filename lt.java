import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import in.krosbits.musicolet.SettingsActivity;

public abstract class lt extends BaseAdapter implements Filterable {
  public boolean b;
  
  public boolean c;
  
  public Cursor e;
  
  public Context f;
  
  public int g;
  
  public bm h;
  
  public kt i;
  
  public mt j;
  
  public abstract void a(View paramView, Cursor paramCursor);
  
  public void b(Cursor paramCursor) {
    Cursor cursor = this.e;
    if (paramCursor == cursor) {
      paramCursor = null;
    } else {
      if (cursor != null) {
        bm bm1 = this.h;
        if (bm1 != null)
          cursor.unregisterContentObserver(bm1); 
        kt kt1 = this.i;
        if (kt1 != null)
          cursor.unregisterDataSetObserver(kt1); 
      } 
      this.e = paramCursor;
      if (paramCursor != null) {
        bm bm1 = this.h;
        if (bm1 != null)
          paramCursor.registerContentObserver(bm1); 
        kt kt1 = this.i;
        if (kt1 != null)
          paramCursor.registerDataSetObserver(kt1); 
        this.g = paramCursor.getColumnIndexOrThrow("_id");
        this.b = true;
        notifyDataSetChanged();
        paramCursor = cursor;
      } else {
        this.g = -1;
        this.b = false;
        notifyDataSetInvalidated();
        paramCursor = cursor;
      } 
    } 
    if (paramCursor != null)
      paramCursor.close(); 
  }
  
  public String c(Cursor paramCursor) {
    return (paramCursor == null) ? "" : paramCursor.toString();
  }
  
  public final void d(Context paramContext, SettingsActivity paramSettingsActivity, int paramInt) {
    byte b;
    boolean bool = true;
    if ((paramInt & 0x1) == 1) {
      paramInt |= 0x2;
      this.c = true;
    } else {
      this.c = false;
    } 
    if (paramSettingsActivity == null)
      bool = false; 
    this.e = (Cursor)paramSettingsActivity;
    this.b = bool;
    this.f = paramContext;
    if (bool) {
      b = paramSettingsActivity.getColumnIndexOrThrow("_id");
    } else {
      b = -1;
    } 
    this.g = b;
    if ((paramInt & 0x2) == 2) {
      this.h = new bm(this);
      this.i = new kt(0, this);
    } else {
      this.h = null;
      this.i = null;
    } 
    if (bool) {
      bm bm1 = this.h;
      if (bm1 != null)
        paramSettingsActivity.registerContentObserver(bm1); 
      kt kt1 = this.i;
      if (kt1 != null)
        paramSettingsActivity.registerDataSetObserver(kt1); 
    } 
  }
  
  public View e(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) {
    return f(paramViewGroup);
  }
  
  public abstract View f(ViewGroup paramViewGroup);
  
  public Cursor g(CharSequence paramCharSequence) {
    return this.e;
  }
  
  public int getCount() {
    if (this.b) {
      Cursor cursor = this.e;
      if (cursor != null)
        return cursor.getCount(); 
    } 
    return 0;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (this.b) {
      this.e.moveToPosition(paramInt);
      View view = paramView;
      if (paramView == null)
        view = e(this.f, this.e, paramViewGroup); 
      a(view, this.e);
      return view;
    } 
    return null;
  }
  
  public final Filter getFilter() {
    if (this.j == null) {
      Filter filter = new Filter();
      ((mt)filter).a = this;
      this.j = (mt)filter;
    } 
    return this.j;
  }
  
  public final Object getItem(int paramInt) {
    if (this.b) {
      Cursor cursor = this.e;
      if (cursor != null) {
        cursor.moveToPosition(paramInt);
        return this.e;
      } 
    } 
    return null;
  }
  
  public final long getItemId(int paramInt) {
    if (this.b) {
      Cursor cursor = this.e;
      if (cursor != null && cursor.moveToPosition(paramInt))
        return this.e.getLong(this.g); 
    } 
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (this.b) {
      if (this.e.moveToPosition(paramInt)) {
        View view = paramView;
        if (paramView == null)
          view = f(paramViewGroup); 
        a(view, this.e);
        return view;
      } 
      tp.f(ga1.i("couldn't move cursor to position ", paramInt));
      return null;
    } 
    tp.f("this should only be called when the cursor is valid");
    return null;
  }
  
  public boolean hasStableIds() {
    return this instanceof vq1 ^ true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */