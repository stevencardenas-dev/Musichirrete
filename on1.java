import androidx.recyclerview.widget.RecyclerView;

public final class on1 extends vd1 {
  public boolean a;
  
  public final r51 b;
  
  public on1(r51 paramr51) {
    this.b = paramr51;
    this.a = false;
  }
  
  public final void a(RecyclerView paramRecyclerView, int paramInt) {
    if (paramInt == 0 && this.a) {
      this.a = false;
      this.b.f();
    } 
  }
  
  public final void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    if (paramInt1 != 0 || paramInt2 != 0) {
      this.a = true;
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\on1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */