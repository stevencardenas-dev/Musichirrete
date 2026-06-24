import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public final class ow0 extends BaseAdapter {
  public final rw0 b;
  
  public int c = -1;
  
  public boolean e;
  
  public final boolean f;
  
  public final LayoutInflater g;
  
  public final int h;
  
  public ow0(rw0 paramrw0, LayoutInflater paramLayoutInflater, boolean paramBoolean, int paramInt) {
    this.f = paramBoolean;
    this.g = paramLayoutInflater;
    this.b = paramrw0;
    this.h = paramInt;
    a();
  }
  
  public final void a() {
    rw0 rw01 = this.b;
    uw0 uw0 = rw01.v;
    if (uw0 != null) {
      rw01.i();
      ArrayList<uw0> arrayList = rw01.j;
      int i = arrayList.size();
      for (byte b = 0; b < i; b++) {
        if ((uw0)arrayList.get(b) == uw0) {
          this.c = b;
          return;
        } 
      } 
    } 
    this.c = -1;
  }
  
  public final uw0 b(int paramInt) {
    ArrayList<uw0> arrayList;
    boolean bool = this.f;
    rw0 rw01 = this.b;
    if (bool) {
      rw01.i();
      arrayList = rw01.j;
    } else {
      arrayList = arrayList.l();
    } 
    int j = this.c;
    int i = paramInt;
    if (j >= 0) {
      i = paramInt;
      if (paramInt >= j)
        i = paramInt + 1; 
    } 
    return arrayList.get(i);
  }
  
  public final int getCount() {
    ArrayList arrayList;
    boolean bool = this.f;
    rw0 rw01 = this.b;
    if (bool) {
      rw01.i();
      arrayList = rw01.j;
    } else {
      arrayList = arrayList.l();
    } 
    return (this.c < 0) ? arrayList.size() : (arrayList.size() - 1);
  }
  
  public final long getItemId(int paramInt) {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    boolean bool;
    View view = paramView;
    if (paramView == null)
      view = this.g.inflate(this.h, paramViewGroup, false); 
    int j = (b(paramInt)).b;
    int i = paramInt - 1;
    if (i >= 0) {
      i = (b(i)).b;
    } else {
      i = j;
    } 
    ListMenuItemView listMenuItemView = (ListMenuItemView)view;
    if (this.b.m() && j != i) {
      bool = true;
    } else {
      bool = false;
    } 
    listMenuItemView.setGroupDividerEnabled(bool);
    ix0 ix0 = (ix0)view;
    if (this.e)
      listMenuItemView.setForceShowIcon(true); 
    ix0.initialize(b(paramInt), 0);
    return view;
  }
  
  public final void notifyDataSetChanged() {
    a();
    super.notifyDataSetChanged();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ow0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */