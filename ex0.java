import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

public final class ex0 extends y10 {
  public final int o;
  
  public final int p;
  
  public tw0 q;
  
  public uw0 r;
  
  public ex0(Context paramContext, boolean paramBoolean) {
    super(paramContext, paramBoolean);
    if (1 == paramContext.getResources().getConfiguration().getLayoutDirection()) {
      this.o = 21;
      this.p = 22;
      return;
    } 
    this.o = 22;
    this.p = 21;
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield q : Ltw0;
    //   4: ifnull -> 178
    //   7: aload_0
    //   8: invokevirtual getAdapter : ()Landroid/widget/ListAdapter;
    //   11: astore #4
    //   13: aload #4
    //   15: instanceof android/widget/HeaderViewListAdapter
    //   18: ifeq -> 47
    //   21: aload #4
    //   23: checkcast android/widget/HeaderViewListAdapter
    //   26: astore #4
    //   28: aload #4
    //   30: invokevirtual getHeadersCount : ()I
    //   33: istore_2
    //   34: aload #4
    //   36: invokevirtual getWrappedAdapter : ()Landroid/widget/ListAdapter;
    //   39: checkcast ow0
    //   42: astore #4
    //   44: goto -> 56
    //   47: aload #4
    //   49: checkcast ow0
    //   52: astore #4
    //   54: iconst_0
    //   55: istore_2
    //   56: aload_1
    //   57: invokevirtual getAction : ()I
    //   60: bipush #10
    //   62: if_icmpeq -> 113
    //   65: aload_0
    //   66: aload_1
    //   67: invokevirtual getX : ()F
    //   70: f2i
    //   71: aload_1
    //   72: invokevirtual getY : ()F
    //   75: f2i
    //   76: invokevirtual pointToPosition : (II)I
    //   79: istore_3
    //   80: iload_3
    //   81: iconst_m1
    //   82: if_icmpeq -> 113
    //   85: iload_3
    //   86: iload_2
    //   87: isub
    //   88: istore_2
    //   89: iload_2
    //   90: iflt -> 113
    //   93: iload_2
    //   94: aload #4
    //   96: invokevirtual getCount : ()I
    //   99: if_icmpge -> 113
    //   102: aload #4
    //   104: iload_2
    //   105: invokevirtual b : (I)Luw0;
    //   108: astore #5
    //   110: goto -> 116
    //   113: aconst_null
    //   114: astore #5
    //   116: aload_0
    //   117: getfield r : Luw0;
    //   120: astore #6
    //   122: aload #6
    //   124: aload #5
    //   126: if_acmpeq -> 178
    //   129: aload #4
    //   131: getfield b : Lrw0;
    //   134: astore #4
    //   136: aload #6
    //   138: ifnull -> 154
    //   141: aload_0
    //   142: getfield q : Ltw0;
    //   145: aload #4
    //   147: aload #6
    //   149: invokeinterface f : (Lrw0;Landroid/view/MenuItem;)V
    //   154: aload_0
    //   155: aload #5
    //   157: putfield r : Luw0;
    //   160: aload #5
    //   162: ifnull -> 178
    //   165: aload_0
    //   166: getfield q : Ltw0;
    //   169: aload #4
    //   171: aload #5
    //   173: invokeinterface j : (Lrw0;Luw0;)V
    //   178: aload_0
    //   179: aload_1
    //   180: invokespecial onHoverEvent : (Landroid/view/MotionEvent;)Z
    //   183: ireturn
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    ow0 ow0;
    ListMenuItemView listMenuItemView = (ListMenuItemView)getSelectedView();
    if (listMenuItemView != null && paramInt == this.o) {
      if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu())
        performItemClick((View)listMenuItemView, getSelectedItemPosition(), getSelectedItemId()); 
      return true;
    } 
    if (listMenuItemView != null && paramInt == this.p) {
      setSelection(-1);
      ListAdapter listAdapter = getAdapter();
      if (listAdapter instanceof HeaderViewListAdapter) {
        ow0 = (ow0)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
      } else {
        ow0 = ow0;
      } 
      ow0.b.c(false);
      return true;
    } 
    return super.onKeyDown(paramInt, (KeyEvent)ow0);
  }
  
  public void setHoverListener(tw0 paramtw0) {
    this.q = paramtw0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ex0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */