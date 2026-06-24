import android.widget.AbsListView;

public final class ao0 implements AbsListView.OnScrollListener {
  public final co0 a;
  
  public ao0(co0 paramco0) {
    this.a = paramco0;
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {
    co0 co01 = this.a;
    zn0 zn0 = co01.t;
    f7 f7 = co01.B;
    if (paramInt == 1) {
      if (f7.getInputMethodMode() == 2)
        return; 
      if (f7.getContentView() != null) {
        co01.x.removeCallbacks(zn0);
        zn0.run();
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ao0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */