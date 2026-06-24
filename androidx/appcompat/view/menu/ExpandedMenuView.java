package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import jx0;
import qw0;
import rw0;
import uw0;
import zv0;

public final class ExpandedMenuView extends ListView implements qw0, jx0, AdapterView.OnItemClickListener {
  public static final int[] c = new int[] { 16842964, 16843049 };
  
  public rw0 b;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16842868);
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    zv0 zv0 = zv0.y(paramInt, 0, paramContext, paramAttributeSet, c);
    TypedArray typedArray = (TypedArray)zv0.e;
    if (typedArray.hasValue(0))
      setBackgroundDrawable(zv0.o(0)); 
    if (typedArray.hasValue(1))
      setDivider(zv0.o(1)); 
    zv0.z();
  }
  
  public final boolean a(uw0 paramuw0) {
    return this.b.q((MenuItem)paramuw0, null, 0);
  }
  
  public int getWindowAnimations() {
    return 0;
  }
  
  public final void initialize(rw0 paramrw0) {
    this.b = paramrw0;
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    a((uw0)getAdapter().getItem(paramInt));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\view\menu\ExpandedMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */