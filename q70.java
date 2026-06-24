import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import in.krosbits.android.widgets.RecyclerViewScrollBar;
import in.krosbits.musicolet.MostPlayedActivity;

public final class q70 extends vd1 {
  public final int a;
  
  public final Object b;
  
  public void a(RecyclerView paramRecyclerView, int paramInt) {
    switch (this.a) {
      default:
        return;
      case 1:
        break;
    } 
    MostPlayedActivity mostPlayedActivity = (MostPlayedActivity)this.b;
    if (paramInt != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (paramInt == 0) {
      Object object = MostPlayedActivity.k0;
      mostPlayedActivity.u0();
    } 
    MaterialButton materialButton = (MaterialButton)mostPlayedActivity.g0.e;
    int i = 0x1 ^ paramInt;
    materialButton.setEnabled(i);
    ((MaterialButton)mostPlayedActivity.g0.h).setEnabled(i);
    ((MaterialButton)mostPlayedActivity.g0.g).setEnabled(i);
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    boolean bool;
    paramInt1 = this.a;
    Object object = this.b;
    switch (paramInt1) {
      default:
        return;
      case 2:
        object = object;
        if (paramRecyclerView != null) {
          RecyclerView.M(paramRecyclerView.getChildAt(0));
          paramRecyclerView.getChildCount();
          paramRecyclerView.getAdapter().c();
          ((RecyclerViewScrollBar)object).n = paramRecyclerView.computeVerticalScrollRange();
          ((RecyclerViewScrollBar)object).o = paramRecyclerView.computeVerticalScrollExtent();
          paramInt1 = paramRecyclerView.computeVerticalScrollOffset();
          ((RecyclerViewScrollBar)object).p = paramInt1;
          int i1 = ((RecyclerViewScrollBar)object).n;
          paramInt2 = ((RecyclerViewScrollBar)object).o;
          if (i1 == paramInt2) {
            ((RecyclerViewScrollBar)object).m = -1.0F;
          } else {
            ((RecyclerViewScrollBar)object).m = paramInt1 / (i1 - paramInt2);
          } 
          object.invalidate();
        } 
        return;
      case 0:
        break;
    } 
    object = object;
    int i = paramRecyclerView.computeHorizontalScrollOffset();
    paramInt1 = paramRecyclerView.computeVerticalScrollOffset();
    paramInt2 = ((r70)object).a;
    int k = ((r70)object).s.computeVerticalScrollRange();
    int m = ((r70)object).r;
    if (k - m > 0 && m >= paramInt2) {
      bool = true;
    } else {
      bool = false;
    } 
    ((r70)object).t = bool;
    int j = ((r70)object).s.computeHorizontalScrollRange();
    int n = ((r70)object).q;
    if (j - n > 0 && n >= paramInt2) {
      bool = true;
    } else {
      bool = false;
    } 
    ((r70)object).u = bool;
    boolean bool1 = ((r70)object).t;
    if (!bool1 && !bool) {
      if (((r70)object).v != 0)
        object.j(0); 
    } else {
      if (bool1) {
        float f1 = paramInt1;
        float f2 = m;
        ((r70)object).l = (int)((f2 / 2.0F + f1) * f2 / k);
        ((r70)object).k = Math.min(m, m * m / k);
      } 
      if (((r70)object).u) {
        float f2 = i;
        float f1 = n;
        ((r70)object).o = (int)((f1 / 2.0F + f2) * f1 / j);
        ((r70)object).n = Math.min(n, n * n / j);
      } 
      paramInt1 = ((r70)object).v;
      if (paramInt1 == 0 || paramInt1 == 1)
        object.j(1); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */